package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.oj;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
{
  public static LinkedList<oj> bR(String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(88882);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.CardListItemParser", "parseCardTpInfoItemArray jsonContent is null");
      AppMethodBeat.o(88882);
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
          ab.e("MicroMsg.CardListItemParser", "parseCardTpInfoItemArray cardItemListJson is null");
          AppMethodBeat.o(88882);
          paramString = localObject;
        }
        else
        {
          LinkedList localLinkedList = new java/util/LinkedList;
          localLinkedList.<init>();
          int i = 0;
          if (i < localJSONArray.length())
          {
            JSONObject localJSONObject = localJSONArray.optJSONObject(i);
            oj localoj = new com/tencent/mm/protocal/protobuf/oj;
            localoj.<init>();
            if (paramInt == 26);
            for (paramString = "cardId"; ; paramString = "card_id")
            {
              localoj.kbU = localJSONObject.optString(paramString);
              localoj.code = localJSONObject.optString("code");
              localoj.vUJ = localJSONObject.optString("openCardParams");
              localLinkedList.add(localoj);
              i++;
              break;
            }
          }
          AppMethodBeat.o(88882);
          paramString = localLinkedList;
        }
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.CardListItemParser", paramString, "", new Object[0]);
        AppMethodBeat.o(88882);
        paramString = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.k
 * JD-Core Version:    0.6.2
 */