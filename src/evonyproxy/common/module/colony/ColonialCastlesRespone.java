package evonyproxy.common.module.colony;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;
import evonyproxy.common.beans.*;

/**
 * @version .02
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public class ColonialCastlesRespone implements ASObjectable {
public Double packageId = null;
public String msg = null;
public ArrayList<ColonyBean> colonyBeans = null;
public String errorMsg = null;
public Integer ok = null;

public ColonialCastlesRespone(ASObject aso) {
colonyBeans = new ArrayList<ColonyBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("colonyBeans") != null) {
Object[] objArr = (Object[]) aso.get("colonyBeans");
for(int j = 0; j < objArr.length; j++) {
colonyBeans.add(new ColonyBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public ColonialCastlesRespone() {
}

@Override
public ColonialCastlesRespone clone() {
ColonialCastlesRespone clone = new ColonialCastlesRespone();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.colonyBeans != null) {
ArrayList tmpArrLst = new ArrayList<ColonyBean>();

for(Object bean : colonyBeans) {
ColonyBean tmpBean = (ColonyBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setColonyBeans(tmpArrLst);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.colonyBeans != null) {
ArrayList al = new ArrayList();
for(Object obj : colonyBeans) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("colonyBeans", al);
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.ok != null) {
aso.put("ok", ok);
}

return aso;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public ArrayList getColonyBeans() {
return colonyBeans;
}

public void setColonyBeans(ArrayList colonyBeans) {
this.colonyBeans = colonyBeans;
}

public String getErrorMsg() {
return errorMsg;
}

public void setErrorMsg(String errorMsg) {
this.errorMsg = errorMsg;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}
}
