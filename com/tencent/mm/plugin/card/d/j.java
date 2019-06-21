package com.tencent.mm.plugin.card.d;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.c;
import com.tencent.mm.protocal.protobuf.agz;
import com.tencent.mm.protocal.protobuf.pf;
import com.tencent.mm.protocal.protobuf.pg;
import com.tencent.mm.protocal.protobuf.ph;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j
{
  public static agz Hm(String paramString)
  {
    AppMethodBeat.i(88879);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.CardStickyHelper", "jsonRet null");
      paramString = null;
      AppMethodBeat.o(88879);
    }
    while (true)
    {
      return paramString;
      agz localagz = new agz();
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        localagz.wno = ((JSONObject)localObject).optString("layout_buff");
        JSONObject localJSONObject = ((JSONObject)localObject).getJSONObject("list");
        if (localJSONObject != null)
        {
          paramString = new com/tencent/mm/protocal/protobuf/ph;
          paramString.<init>();
          localagz.wnu = paramString;
          localagz.wnu.vWA = P(localJSONObject.optJSONObject("expiring_list"));
          localagz.wnu.vWB = P(localJSONObject.optJSONObject("member_card_list"));
          localagz.wnu.vWC = P(localJSONObject.optJSONObject("nearby_list"));
          localagz.wnu.vWD = P(localJSONObject.optJSONObject("label_list"));
          localagz.wnu.vWE = P(localJSONObject.optJSONObject("first_list"));
          if ((localagz.wnu.vWE != null) && (localagz.wnu.vWE.vWz != null))
            for (int i = localagz.wnu.vWE.vWz.size() - 1; i >= 0; i--)
            {
              paramString = (pf)localagz.wnu.vWE.vWz.get(i);
              if (!bo.isNullOrNil(paramString.cMC))
              {
                paramString = am.baW().Gu(paramString.cMC);
                if ((paramString != null) && (!paramString.aZD()))
                  localagz.wnu.vWE.vWz.remove(i);
              }
            }
          localagz.wnv = localJSONObject.optString("red_dot_wording");
          if (localJSONObject.optInt("show_red_dot", 0) != 1)
            break label354;
        }
        label354: for (boolean bool = true; ; bool = false)
        {
          localagz.wnw = bool;
          localObject = localJSONObject.optString("title");
          paramString = (String)localObject;
          if (localObject == null)
            paramString = "";
          am.bbb().putValue("key_card_entrance_tips", paramString);
          localagz.wnx = localJSONObject.optInt("top_scene", 100);
          AppMethodBeat.o(88879);
          paramString = localagz;
          break;
        }
      }
      catch (JSONException paramString)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.CardStickyHelper", paramString, "", new Object[0]);
      }
    }
  }

  private static pg P(JSONObject paramJSONObject)
  {
    pg localpg = null;
    AppMethodBeat.i(88880);
    if (paramJSONObject == null)
    {
      ab.w("MicroMsg.CardStickyHelper", "parseLayoutItemList param obj null");
      AppMethodBeat.o(88880);
      paramJSONObject = localpg;
      return paramJSONObject;
    }
    localpg = new pg();
    localpg.vWz = new LinkedList();
    while (true)
    {
      try
      {
        JSONArray localJSONArray = paramJSONObject.getJSONArray("item_list");
        int i = 0;
        if (i < localJSONArray.length())
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i);
          if (localJSONObject == null)
          {
            paramJSONObject = null;
            if ((paramJSONObject == null) || ((paramJSONObject.kbZ <= bo.anT()) && (paramJSONObject.kbZ != 0)))
              break label206;
            localpg.vWz.add(paramJSONObject);
            i++;
            continue;
          }
          paramJSONObject = new com/tencent/mm/protocal/protobuf/pf;
          paramJSONObject.<init>();
          paramJSONObject.kfO = localJSONObject.optString("announcement");
          paramJSONObject.cMC = localJSONObject.optString("card_id");
          paramJSONObject.kbZ = localJSONObject.optInt("end_time", 0);
          paramJSONObject.vWx = localJSONObject.optInt("update_time", 0);
          paramJSONObject.vWy = localJSONObject.optString("label_wording");
          continue;
        }
      }
      catch (JSONException paramJSONObject)
      {
        ab.printErrStackTrace("MicroMsg.CardStickyHelper", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(88880);
        paramJSONObject = localpg;
      }
      break;
      label206: ab.i("MicroMsg.CardStickyHelper", "item.end_time > Util.nowSecond()");
    }
  }

  public static String a(Context paramContext, int paramInt, CardInfo paramCardInfo)
  {
    AppMethodBeat.i(88881);
    switch (paramInt % 10)
    {
    default:
      paramContext = null;
      AppMethodBeat.o(88881);
    case 3:
    case 2:
    case 1:
    case 0:
    case 4:
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getString(2131297998);
      AppMethodBeat.o(88881);
      continue;
      paramContext = paramContext.getString(2131297999);
      AppMethodBeat.o(88881);
      continue;
      paramContext = paramContext.getString(2131298000);
      AppMethodBeat.o(88881);
      continue;
      paramContext = paramContext.getString(2131298001);
      AppMethodBeat.o(88881);
      continue;
      paramContext = paramCardInfo.field_label_wording;
      AppMethodBeat.o(88881);
    }
  }

  public static void c(LinkedList<pf> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(88877);
    if (paramLinkedList == null)
      AppMethodBeat.o(88877);
    while (true)
    {
      return;
      int i = paramLinkedList.size();
      int j = 0;
      if (j < paramLinkedList.size())
      {
        pf localpf = (pf)paramLinkedList.get(j);
        c localc = am.baW();
        String str1 = localpf.cMC;
        String str2 = localpf.kfO;
        int k = localpf.kbZ;
        if (bo.isNullOrNil(str1))
          ab.w("MicroMsg.CardInfoStorage", "cardId null");
        while (true)
        {
          j++;
          break;
          str1 = "update UserCardInfo set stickyIndex=" + ((i - j) * 10 + paramInt) + ", stickyAnnouncement='" + str2 + "', stickyEndTime=" + k + " where card_id='" + str1 + "'";
          localc.bSd.hY("UserCardInfo", str1);
        }
      }
      AppMethodBeat.o(88877);
    }
  }

  public static void d(LinkedList<pf> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(88878);
    if (paramLinkedList == null)
      AppMethodBeat.o(88878);
    while (true)
    {
      return;
      int i = 0;
      if (i < paramLinkedList.size())
      {
        Object localObject = (pf)paramLinkedList.get(i);
        c localc = am.baW();
        String str = ((pf)localObject).cMC;
        if (((pf)localObject).vWy != null);
        for (localObject = ((pf)localObject).vWy; ; localObject = "")
        {
          localObject = "update UserCardInfo set stickyIndex=" + paramInt + ", label_wording='" + (String)localObject + "' where card_id='" + str + "'";
          localc.bSd.hY("UserCardInfo", (String)localObject);
          i++;
          break;
        }
      }
      AppMethodBeat.o(88878);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.j
 * JD-Core Version:    0.6.2
 */