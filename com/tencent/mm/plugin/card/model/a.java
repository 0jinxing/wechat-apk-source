package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public String app_id;
  public String color;
  public int iAd;
  public String jKR;
  public String kbU;
  public String kbV;
  public String kbW;
  public String kbX;
  public String kbY;
  public int kbZ;
  public String kca;
  public int kcb;
  public String kcc;
  public String kcd;
  public String kce;
  public boolean kcf;
  public String title;
  public String userName;

  public static LinkedList<a> Gs(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(87772);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(87772);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = a(localJSONObject.optJSONArray("available_cards"), false);
        AppMethodBeat.o(87772);
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.AvailableCardItem", paramString, "", new Object[0]);
        AppMethodBeat.o(87772);
        paramString = localObject;
      }
    }
  }

  public static LinkedList<a> Gt(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(87773);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(87773);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = a(localJSONObject.optJSONArray("available_share_cards"), true);
        AppMethodBeat.o(87773);
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.AvailableCardItem", paramString, "", new Object[0]);
        AppMethodBeat.o(87773);
        paramString = localObject;
      }
    }
  }

  private static LinkedList<a> a(JSONArray paramJSONArray, boolean paramBoolean)
  {
    AppMethodBeat.i(87774);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      paramJSONArray = null;
      AppMethodBeat.o(87774);
    }
    while (true)
    {
      return paramJSONArray;
      LinkedList localLinkedList = new LinkedList();
      for (int i = 0; i < paramJSONArray.length(); i++)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        a locala = new a();
        locala.kbU = localJSONObject.optString("card_tp_id");
        locala.iAd = localJSONObject.optInt("card_type");
        locala.color = localJSONObject.optString("color");
        locala.kbV = localJSONObject.optString("logo_url");
        locala.title = localJSONObject.optString("title");
        locala.kbW = localJSONObject.optString("sub_title");
        locala.kbX = localJSONObject.optString("aux_title");
        locala.kbY = localJSONObject.optString("encrypt_code");
        locala.userName = localJSONObject.optString("from_user_name");
        locala.app_id = localJSONObject.optString("app_id");
        locala.kbZ = localJSONObject.optInt("end_time");
        locala.kca = localJSONObject.optString("card_user_id");
        locala.kcb = localJSONObject.optInt("choose_optional");
        locala.kcd = localJSONObject.optString("invoice_item");
        locala.kce = localJSONObject.optString("invoice_status");
        locala.kcc = localJSONObject.optString("invoice_title");
        locala.kcf = paramBoolean;
        localLinkedList.add(locala);
      }
      AppMethodBeat.o(87774);
      paramJSONArray = localLinkedList;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.a
 * JD-Core Version:    0.6.2
 */