package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.e;
import com.tencent.mm.protocal.protobuf.nx;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

public final class h
{
  public static String a(LinkedList<e> paramLinkedList, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(88874);
    if (paramLinkedList.size() == 0)
    {
      ab.e("MicroMsg.CardListItemParser", "parseCardListItemToJson list == null || list.size() == 0");
      paramLinkedList = "";
      AppMethodBeat.o(88874);
    }
    while (true)
    {
      return paramLinkedList;
      ab.i("MicroMsg.CardListItemParser", "parseCardListItemToJson is_succ:" + paramBoolean + " scene:" + paramInt);
      JSONStringer localJSONStringer = new JSONStringer();
      if (paramInt == 8);
      while (true)
      {
        e locale;
        try
        {
          localJSONStringer.object();
          localJSONStringer.key("card_list");
          localJSONStringer.array();
          Iterator localIterator = paramLinkedList.iterator();
          if (!localIterator.hasNext())
            break label342;
          locale = (e)localIterator.next();
          localJSONStringer.object();
          if (paramInt != 26)
            break label271;
          paramLinkedList = "cardId";
          localJSONStringer.key(paramLinkedList);
          localJSONStringer.value(locale.kbU);
          if (paramInt != 26)
            break label277;
          paramLinkedList = "cardExt";
          localJSONStringer.key(paramLinkedList);
          if (locale.cMD != null)
            break label283;
          paramLinkedList = "";
          localJSONStringer.value(paramLinkedList);
          if (paramInt != 26)
            break label292;
          paramLinkedList = "isSuccess";
          localJSONStringer.key(paramLinkedList);
          if (!paramBoolean)
            break label306;
          if (paramInt != 26)
            break label298;
          paramLinkedList = Boolean.TRUE;
          localJSONStringer.value(paramLinkedList);
          localJSONStringer.key("code");
          if (locale.code != null)
            break label333;
          paramLinkedList = "";
          localJSONStringer.value(paramLinkedList);
          localJSONStringer.endObject();
          continue;
        }
        catch (Exception paramLinkedList)
        {
          ab.printErrStackTrace("MicroMsg.CardListItemParser", paramLinkedList, "", new Object[0]);
          paramLinkedList = "";
          AppMethodBeat.o(88874);
        }
        break;
        label271: paramLinkedList = "card_id";
        continue;
        label277: paramLinkedList = "card_ext";
        continue;
        label283: paramLinkedList = locale.cMD;
        continue;
        label292: paramLinkedList = "is_succ";
        continue;
        label298: paramLinkedList = Integer.valueOf(1);
        continue;
        label306: if (paramInt == 26);
        for (paramLinkedList = Boolean.FALSE; ; paramLinkedList = Integer.valueOf(0))
        {
          localJSONStringer.value(paramLinkedList);
          break;
        }
        label333: paramLinkedList = locale.code;
      }
      label342: localJSONStringer.endArray();
      if (paramInt == 8)
        localJSONStringer.endObject();
      paramLinkedList = localJSONStringer.toString();
      AppMethodBeat.o(88874);
    }
  }

  public static ArrayList<nx> bP(String paramString, int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(88873);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.CardListItemParser", "parseCardListItemArray jsonContent is null");
      AppMethodBeat.o(88873);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      if ((paramInt == 8) || (paramInt == 0));
      try
      {
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(paramString);
        paramString = ((JSONObject)localObject2).optJSONArray("card_list");
        while (true)
        {
          if ((paramString != null) && (paramString.length() != 0))
            break label114;
          ab.e("MicroMsg.CardListItemParser", "parseCardListItemArray cardItemListJson is null");
          AppMethodBeat.o(88873);
          paramString = localObject1;
          break;
          if (paramInt == 26)
            paramString = new JSONArray(paramString);
          else
            paramString = new JSONArray(paramString);
        }
        label114: ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int i = 0;
        if (i < paramString.length())
        {
          JSONObject localJSONObject = paramString.optJSONObject(i);
          nx localnx = new com/tencent/mm/protocal/protobuf/nx;
          localnx.<init>();
          if (paramInt == 26)
          {
            localObject2 = "cardId";
            label163: localnx.kbU = localJSONObject.optString((String)localObject2);
            if (paramInt != 26)
              break label214;
          }
          label214: for (localObject2 = "cardExt"; ; localObject2 = "card_ext")
          {
            localnx.cMD = localJSONObject.optString((String)localObject2);
            localArrayList.add(localnx);
            i++;
            break;
            localObject2 = "card_id";
            break label163;
          }
        }
        AppMethodBeat.o(88873);
        paramString = localArrayList;
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.CardListItemParser", paramString, "", new Object[0]);
        AppMethodBeat.o(88873);
        paramString = localObject1;
      }
    }
  }

  public static String bQ(String paramString, int paramInt)
  {
    JSONObject localJSONObject = null;
    AppMethodBeat.i(88875);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.CardListItemParser", "parseCardListItemArray jsonContent is null");
      AppMethodBeat.o(88875);
      paramString = localJSONObject;
    }
    while (true)
    {
      return paramString;
      JSONStringer localJSONStringer;
      while (true)
      {
        try
        {
          Object localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(paramString);
          localObject = ((JSONObject)localObject).optJSONArray("card_list");
          if ((localObject == null) || (((JSONArray)localObject).length() == 0))
          {
            ab.e("MicroMsg.CardListItemParser", "parseCardListItemArray cardItemListJson is null");
            AppMethodBeat.o(88875);
            paramString = localJSONObject;
            break;
          }
          localJSONStringer = new org/json/JSONStringer;
          localJSONStringer.<init>();
          localJSONStringer.array();
          int i = 0;
          if (i >= ((JSONArray)localObject).length())
            break label393;
          localJSONObject = ((JSONArray)localObject).optJSONObject(i);
          localJSONStringer.object();
          if (paramInt == 26)
          {
            paramString = "cardId";
            localJSONStringer.key(paramString);
            localJSONStringer.value(localJSONObject.optString("card_id"));
            if (paramInt != 26)
              continue;
            paramString = "cardExt";
            localJSONStringer.key(paramString);
            localJSONStringer.value(localJSONObject.optString("card_ext"));
            if (paramInt != 26)
              continue;
            paramString = "isSuccess";
            localJSONStringer.key(paramString);
            if (paramInt != 26)
              break label356;
            if (localJSONObject.optInt("is_succ") != 1)
              continue;
            localJSONStringer.value(true);
            localJSONStringer.key("code");
            if (TextUtils.isEmpty(localJSONObject.optString("encrypt_code")))
              break label372;
            localJSONStringer.value(localJSONObject.optString("encrypt_code"));
            localJSONStringer.endObject();
            paramString = new java/lang/StringBuilder;
            paramString.<init>("parseJsonToArray item");
            StringBuilder localStringBuilder = paramString.append(i).append("  is_succ:");
            if (paramInt != 26)
              break label387;
            paramString = "isSuccess";
            ab.i("MicroMsg.CardListItemParser", localJSONObject.optInt(paramString));
            i++;
            continue;
          }
          paramString = "card_id";
          continue;
          paramString = "card_ext";
          continue;
          paramString = "is_succ";
          continue;
          localJSONStringer.value(false);
          continue;
        }
        catch (JSONException paramString)
        {
          ab.printErrStackTrace("MicroMsg.CardListItemParser", paramString, "", new Object[0]);
          paramString = "";
          AppMethodBeat.o(88875);
        }
        break;
        label356: localJSONStringer.value(localJSONObject.optInt("is_succ"));
        continue;
        label372: localJSONStringer.value(localJSONObject.optString("code"));
        continue;
        label387: paramString = "is_succ";
      }
      label393: localJSONStringer.endArray();
      paramString = localJSONStringer.toString();
      AppMethodBeat.o(88875);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.h
 * JD-Core Version:    0.6.2
 */