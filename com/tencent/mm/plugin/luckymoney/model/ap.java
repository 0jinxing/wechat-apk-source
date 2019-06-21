package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ap extends ak
{
  public String nSX;
  public String nYX;
  public String nYY;

  public ap(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, int paramInt3, String paramString7, int paramInt4, int paramInt5, String paramString8)
  {
    this(paramInt1, paramString1, paramString2, paramString3, paramString4, paramString5, paramInt2, "", "", paramString6, paramInt3, paramString7, paramInt4, paramInt5, paramString8);
  }

  private ap(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, String paramString7, String paramString8, int paramInt3, String paramString9, int paramInt4, int paramInt5, String paramString10)
  {
    AppMethodBeat.i(42419);
    HashMap localHashMap = new HashMap();
    localHashMap.put("amount", String.valueOf(paramInt1));
    localHashMap.put("wishing", URLEncoder.encode(bo.nullAsNil(paramString1)));
    localHashMap.put("sendUserName", paramString4);
    if (!bo.isNullOrNil(paramString3))
      localHashMap.put("username", paramString3);
    if (!bo.isNullOrNil(paramString2))
      localHashMap.put("headImg", URLEncoder.encode(paramString2));
    if (!bo.isNullOrNil(paramString5))
      localHashMap.put("nickName", URLEncoder.encode(bo.nullAsNil(paramString5)));
    localHashMap.put("inWay", String.valueOf(paramInt2));
    localHashMap.put("imageId", paramString6);
    localHashMap.put("imageAesKey", paramString7);
    localHashMap.put("imageLength", "0");
    localHashMap.put("expressionurl", paramString8);
    localHashMap.put("expressiontype", String.valueOf(paramInt3));
    if (!bo.isNullOrNil(paramString9))
      localHashMap.put("unique_id", paramString9);
    localHashMap.put("user_confirm_jump", String.valueOf(paramInt4));
    localHashMap.put("unpay_type", String.valueOf(paramInt5));
    if (!bo.isNullOrNil(paramString10))
      localHashMap.put("cancel_sendid", paramString10);
    M(localHashMap);
    AppMethodBeat.o(42419);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42420);
    this.nSX = paramJSONObject.optString("sendId");
    this.nYX = paramJSONObject.optString("reqkey");
    this.nYY = paramJSONObject.optString("sendMsgXml");
    AppMethodBeat.o(42420);
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/yearrequestwxhb";
  }

  public final int getType()
  {
    return 1643;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.ap
 * JD-Core Version:    0.6.2
 */