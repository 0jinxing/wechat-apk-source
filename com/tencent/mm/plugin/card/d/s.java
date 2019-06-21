package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.sharecard.model.l;
import com.tencent.mm.plugin.card.sharecard.model.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class s
{
  public static l Hw(String paramString)
  {
    Object localObject = null;
    int i = 1;
    AppMethodBeat.i(88947);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutData jsonContent is null");
      AppMethodBeat.o(88947);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        localJSONObject = localJSONObject.optJSONObject("list");
        if (localJSONObject == null)
        {
          ab.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutData resultJson is null");
          AppMethodBeat.o(88947);
          paramString = localObject;
        }
        else
        {
          paramString = new com/tencent/mm/plugin/card/sharecard/model/l;
          paramString.<init>();
          paramString.kfI = localJSONObject.optString("local_city");
          paramString.kfG = Hx(localJSONObject.optString("local_city_list"));
          paramString.kfH = Hx(localJSONObject.optString("other_city_list"));
          paramString.kfJ = localJSONObject.optBoolean("local_end");
          paramString.kfK = localJSONObject.optBoolean("other_end");
          paramString.cML = localJSONObject.optBoolean("show_red_dot");
          paramString.cMM = localJSONObject.optBoolean("show_new");
          paramString.kfM = localJSONObject.optString("tips");
          paramString.kfL = Hy(localJSONObject.optString("icons"));
          paramString.kfN = localJSONObject.optInt("newest_sharecard_time_second");
          int j;
          label196: int k;
          label206: int m;
          if (paramString.kfJ)
          {
            j = 1;
            if (!paramString.kfK)
              break label286;
            k = 1;
            if (!paramString.cML)
              break label292;
            m = 1;
            label216: if (!paramString.cMM)
              break label298;
          }
          while (true)
          {
            ab.i("MicroMsg.ShareCardLayoutDataParser", "localEnd:%d, otherEnd:%d, showRedDot:%d, showNew:%d, tips:%s", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i), paramString.kfM });
            AppMethodBeat.o(88947);
            break;
            j = 0;
            break label196;
            label286: k = 0;
            break label206;
            label292: m = 0;
            break label216;
            label298: i = 0;
          }
        }
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.ShareCardLayoutDataParser", paramString, "", new Object[0]);
        AppMethodBeat.o(88947);
        paramString = localObject;
      }
    }
  }

  private static LinkedList<m> Hx(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(88948);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutItem jsonContent is null");
      AppMethodBeat.o(88948);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      try
      {
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(paramString);
        JSONArray localJSONArray = ((JSONObject)localObject2).optJSONArray("item_list");
        if ((localJSONArray == null) || (localJSONArray.length() == 0))
        {
          ab.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutItem itemListJson is null");
          AppMethodBeat.o(88948);
          paramString = localObject1;
        }
        else
        {
          paramString = new java/util/LinkedList;
          paramString.<init>();
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            Object localObject3 = localJSONArray.optJSONObject(i);
            localObject2 = new com/tencent/mm/plugin/card/sharecard/model/m;
            ((m)localObject2).<init>();
            ((m)localObject2).cMC = ((JSONObject)localObject3).optString("card_id");
            ((m)localObject2).kbU = ((JSONObject)localObject3).optString("card_tp_id");
            ((m)localObject2).kfO = ((JSONObject)localObject3).optString("announcement");
            ((m)localObject2).kfP = ((JSONObject)localObject3).optInt("end_time", 0);
            ((m)localObject2).kfQ = ((JSONObject)localObject3).optInt("update_time", 0);
            ((m)localObject2).kfR = ((JSONObject)localObject3).optInt("item_type", 0);
            ((m)localObject2).top = ((JSONObject)localObject3).optInt("top", 0);
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("ljd: card_tp_id:");
            ab.i("MicroMsg.ShareCardLayoutDataParser", ((m)localObject2).kbU + " top:" + ((m)localObject2).top);
            paramString.add(localObject2);
          }
          AppMethodBeat.o(88948);
        }
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.ShareCardLayoutDataParser", paramString, "", new Object[0]);
        AppMethodBeat.o(88948);
        paramString = localObject1;
      }
    }
  }

  private static LinkedList<String> Hy(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(88949);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardIcons jsonContent is null");
      AppMethodBeat.o(88949);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString);
        if (localJSONArray.length() == 0)
        {
          ab.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardIcons itemListJson is null");
          AppMethodBeat.o(88949);
          paramString = localObject;
        }
        else
        {
          paramString = new java/util/LinkedList;
          paramString.<init>();
          for (int i = 0; i < localJSONArray.length(); i++)
            paramString.add(localJSONArray.optString(i));
          AppMethodBeat.o(88949);
        }
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.ShareCardLayoutDataParser", paramString, "", new Object[0]);
        AppMethodBeat.o(88949);
        paramString = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.s
 * JD-Core Version:    0.6.2
 */