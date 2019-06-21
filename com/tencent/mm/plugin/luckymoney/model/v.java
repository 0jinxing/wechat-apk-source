package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.protocal.protobuf.atc;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class v
{
  public static k W(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42351);
    k localk = new k();
    if (paramJSONObject != null)
    {
      localk.cRT = paramJSONObject.optInt("hbType");
      localk.cRU = paramJSONObject.optInt("hbStatus");
      localk.nWO = paramJSONObject.optString("statusMess");
      localk.nWP = paramJSONObject.optString("gameMess");
      localk.nSd = paramJSONObject.optString("wishing");
      localk.nWQ = paramJSONObject.optString("sendNick");
      localk.nWR = paramJSONObject.optString("sendHeadImg");
      localk.nSX = paramJSONObject.optString("sendId");
      localk.nWS = paramJSONObject.optString("adMessage");
      localk.nWT = paramJSONObject.optString("adUrl");
      localk.cSh = paramJSONObject.optLong("amount");
      localk.nWU = paramJSONObject.optLong("recNum");
      localk.nWV = paramJSONObject.optLong("recAmount");
      localk.kCd = paramJSONObject.optInt("totalNum");
      localk.nWW = paramJSONObject.optLong("totalAmount");
      localk.nWX = paramJSONObject.optString("receiveId");
      localk.nWY = paramJSONObject.optInt("hasWriteAnswer");
      localk.nWZ = paramJSONObject.optInt("isSender");
      localk.nXa = paramJSONObject.optInt("isContinue");
      localk.nXb = paramJSONObject.optString("headTitle");
      localk.cRV = paramJSONObject.optInt("receiveStatus");
      localk.nXc = paramJSONObject.optInt("canShare");
      localk.nUh = paramJSONObject.optInt("jumpChange");
      localk.nUj = paramJSONObject.optString("changeWording");
      localk.nUi = paramJSONObject.optString("changeUrl");
      localk.nXi = paramJSONObject.optInt("hbKind");
      localk.nUk = paramJSONObject.optString("externMess");
      localk.nXl = paramJSONObject.optString("sendUserName");
      if ((bo.isNullOrNil(localk.nWQ)) && (!bo.isNullOrNil(localk.nXl)))
        localk.nWQ = ((b)g.K(b.class)).mJ(localk.nXl);
      localk.nXd = new e();
      Object localObject = paramJSONObject.optJSONObject("atomicFunc");
      if (localObject != null)
      {
        localk.nXd.erD = ((JSONObject)localObject).optInt("enable");
        localk.nXd.nWz = ((JSONObject)localObject).optString("fissionContent");
        localk.nXd.nWy = ((JSONObject)localObject).optString("fissionUrl");
      }
      localk.nXe = new LinkedList();
      localObject = paramJSONObject.optJSONArray("operationHeader");
      if (localObject != null)
        for (int i = 0; i < ((JSONArray)localObject).length(); i++)
          localk.nXe.add(Y(((JSONArray)localObject).getJSONObject(i)));
      localk.nXg = paramJSONObject.optString("watermark");
      localk.nXh = paramJSONObject.optString("context");
      localk.nXk = paramJSONObject.optString("contextMd5");
      localk.resourceId = paramJSONObject.optInt("resourceId");
      localk.nXf = Y(paramJSONObject.optJSONObject("operationTail"));
      localk.nXj = X(paramJSONObject);
      localk.nXm = paramJSONObject.optInt("jumpChangeType");
      localk.nXn = paramJSONObject.optString("changeIconUrl");
      localk.nXo = paramJSONObject.optString("showSourceOpen");
    }
    AppMethodBeat.o(42351);
    return localk;
  }

  private static LinkedList<w> X(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42352);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("record");
    LinkedList localLinkedList = new LinkedList();
    if (localJSONArray != null)
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        JSONObject localJSONObject = localJSONArray.getJSONObject(i);
        paramJSONObject = new w();
        if (localJSONObject != null)
        {
          paramJSONObject.nXZ = localJSONObject.optString("receiveName");
          paramJSONObject.nYa = localJSONObject.optString("receiveHeadImg");
          paramJSONObject.nXM = localJSONObject.optLong("receiveAmount");
          paramJSONObject.nXN = localJSONObject.optString("receiveTime");
          paramJSONObject.nYb = localJSONObject.optString("answer");
          paramJSONObject.nWX = localJSONObject.optString("receiveId");
          paramJSONObject.nYc = localJSONObject.optString("gameTips");
          paramJSONObject.userName = localJSONObject.optString("userName");
          if ((bo.isNullOrNil(paramJSONObject.nXZ)) && (!bo.isNullOrNil(paramJSONObject.userName)))
            paramJSONObject.nXZ = ((b)g.K(b.class)).mJ(paramJSONObject.userName);
        }
        localLinkedList.add(paramJSONObject);
      }
    AppMethodBeat.o(42352);
    return localLinkedList;
  }

  public static as Y(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42353);
    as localas = new as();
    if (paramJSONObject != null)
    {
      localas.erD = paramJSONObject.optInt("enable", 0);
      localas.content = paramJSONObject.optString("content");
      localas.iconUrl = paramJSONObject.optString("iconUrl");
      localas.type = paramJSONObject.optString("type");
      localas.name = paramJSONObject.optString("name");
      localas.nZn = paramJSONObject.optInt("ossKey");
      localas.nZo = paramJSONObject.optInt("focus");
    }
    AppMethodBeat.o(42353);
    return localas;
  }

  public static atb Z(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42354);
    if (paramJSONObject == null)
    {
      paramJSONObject = null;
      AppMethodBeat.o(42354);
    }
    while (true)
    {
      return paramJSONObject;
      atb localatb = new atb();
      localatb.cuu = paramJSONObject.optInt("subType", -1);
      localatb.wwP = paramJSONObject.optString("corpName");
      localatb.materialId = paramJSONObject.optString("materialId");
      localatb.wwR = paramJSONObject.optString("expire_desc");
      localatb.wwS = paramJSONObject.optInt("is_expired");
      JSONObject localJSONObject = paramJSONObject.optJSONObject("sourceObject");
      if (localJSONObject != null)
      {
        paramJSONObject = new atc();
        paramJSONObject.wwV = localJSONObject.optString("bubbleImage");
        paramJSONObject.wwY = localJSONObject.optString("bubbleImageMd5");
        paramJSONObject.wwU = localJSONObject.optString("corpLogo");
        paramJSONObject.wxb = localJSONObject.optString("corpLogoMd5");
        paramJSONObject.wwW = localJSONObject.optString("coverImage");
        paramJSONObject.wwZ = localJSONObject.optString("coverImageMd5");
        paramJSONObject.wwX = localJSONObject.optString("detailImage");
        paramJSONObject.wxa = localJSONObject.optString("detailImageMd5");
        localatb.wwQ = paramJSONObject;
      }
      AppMethodBeat.o(42354);
      paramJSONObject = localatb;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.v
 * JD-Core Version:    0.6.2
 */