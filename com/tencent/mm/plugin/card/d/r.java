package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.sharecard.model.j;
import com.tencent.mm.plugin.card.sharecard.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class r
{
  public static j Hv(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(88946);
    ab.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()");
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser json is empty");
      AppMethodBeat.o(88946);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      try
      {
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(paramString);
        paramString = new com/tencent/mm/plugin/card/sharecard/model/j;
        paramString.<init>();
        paramString.kfD = ((JSONObject)localObject2).optString("consumed_box_id");
        paramString.kfE = ((JSONObject)localObject2).optString("subscribe_wording");
        paramString.kfF = ((JSONObject)localObject2).optString("subscribe_app_username");
        JSONArray localJSONArray = ((JSONObject)localObject2).optJSONArray("list");
        if ((localJSONArray == null) || (localJSONArray.length() == 0))
        {
          ab.e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser cardItemListJson is null");
          AppMethodBeat.o(88946);
          paramString = localObject1;
        }
        else
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            localObject3 = localJSONArray.optJSONObject(i);
            q localq = new com/tencent/mm/plugin/card/sharecard/model/q;
            localq.<init>();
            localq.cMD = ((JSONObject)localObject3).optString("card_ext");
            localq.kcY = f.I(((JSONObject)localObject3).optJSONObject("card_tp_info"));
            ((ArrayList)localObject2).add(localq);
          }
          paramString.ckx = ((ArrayList)localObject2);
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("parseShareCardConsumedInfoParser() tempList size is");
          ab.i("MicroMsg.ShareCardConsumedInfoParser", ((ArrayList)localObject2).size());
          if (TextUtils.isEmpty(paramString.kfD))
            ab.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()  consumed_box_id is empty");
          if (TextUtils.isEmpty(paramString.kfE))
            ab.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()  subscribe_wording is empty");
          AppMethodBeat.o(88946);
        }
      }
      catch (JSONException paramString)
      {
        ab.e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser exception:" + paramString.getMessage());
        ab.printErrStackTrace("MicroMsg.ShareCardConsumedInfoParser", paramString, "", new Object[0]);
        AppMethodBeat.o(88946);
        paramString = localObject1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.r
 * JD-Core Version:    0.6.2
 */