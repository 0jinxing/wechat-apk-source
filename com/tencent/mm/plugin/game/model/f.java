package com.tencent.mm.plugin.game.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.gu;
import com.tencent.mm.g.a.gu.a;
import com.tencent.mm.plugin.game.ui.GameRegionPreference.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bbb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private static final String mVL;

  static
  {
    AppMethodBeat.i(111244);
    mVL = com.tencent.mm.loader.j.b.eSn + "Game/HvMenu/";
    AppMethodBeat.o(111244);
  }

  public static void a(gu paramgu)
  {
    AppMethodBeat.i(111239);
    int i = paramgu.cBw.Cn;
    ab.i("MicroMsg.GameCommOpertionProcessor", "cmd:%d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 10001:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(111239);
      label97: return;
      Object localObject1 = paramgu.cBw.context;
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = new JSONObject();
        localObject1 = e.dX((Context)localObject1);
        if (localObject1 == null);
      }
      try
      {
        label138: Object localObject3;
        while (true)
        {
          ((JSONObject)localObject2).put("gameRegionName", e.a((GameRegionPreference.a)localObject1));
          paramgu.cBx.result = ((JSONObject)localObject2).toString();
          AppMethodBeat.o(111239);
          break;
          paramgu = paramgu.cBw.cBy;
          ab.i("MicroMsg.GameCommOpertionProcessor", "update hv menu! appid:%s", new Object[] { paramgu });
          if (!bo.isNullOrNil(paramgu))
          {
            com.tencent.mm.kernel.g.Rg().a(1369, new f.1(paramgu));
            paramgu = new as(paramgu);
            com.tencent.mm.kernel.g.Rg().a(paramgu, 0);
          }
          AppMethodBeat.o(111239);
          break;
          localObject2 = paramgu.cBw.cBy;
          ab.i("MicroMsg.GameCommOpertionProcessor", "get hv menu! appid:%s", new Object[] { localObject2 });
          if (!bo.isNullOrNil((String)localObject2))
          {
            localObject3 = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bCZ().NK("pb_game_hv_menu_".concat(String.valueOf(localObject2)));
            if (!bo.cb((byte[])localObject3))
              try
              {
                localObject1 = new java/lang/String;
                ((String)localObject1).<init>((byte[])localObject3, "ISO-8859-1");
                paramgu.cBx.result = ((String)localObject1);
                ab.i("MicroMsg.GameCommOpertionProcessor", "get hv menu success! appid:%s", new Object[] { localObject2 });
                AppMethodBeat.o(111239);
              }
              catch (UnsupportedEncodingException paramgu)
              {
              }
          }
        }
        AppMethodBeat.o(111239);
        break label97;
        b(paramgu);
        AppMethodBeat.o(111239);
        break label97;
        localObject2 = paramgu.cBw.context;
        if (localObject2 != null)
        {
          localObject3 = new JSONObject();
          localObject1 = e.ef((Context)localObject2);
          localObject2 = localObject1;
          if (bo.isNullOrNil((String)localObject1))
            localObject2 = e.bDS();
        }
        try
        {
          ((JSONObject)localObject3).put("regionCode", localObject2);
          label407: paramgu.cBx.result = ((JSONObject)localObject3).toString();
          AppMethodBeat.o(111239);
          break label97;
          com.tencent.mm.plugin.game.commlib.b.bDn().hI(true);
        }
        catch (JSONException localJSONException2)
        {
          break label407;
        }
      }
      catch (JSONException localJSONException1)
      {
        break label138;
      }
    }
  }

  private static void a(List<bbb> paramList, f.a parama)
  {
    AppMethodBeat.i(111240);
    if (bo.ek(paramList))
    {
      if (parama != null)
        parama.onComplete();
      AppMethodBeat.o(111240);
    }
    while (true)
    {
      return;
      bbb localbbb = (bbb)paramList.remove(0);
      if ((localbbb == null) || (bo.isNullOrNil(localbbb.ThumbUrl)))
      {
        ab.e("MicroMsg.GameCommOpertionProcessor", "menu is null or thumburl is null");
        AppMethodBeat.o(111240);
      }
      else
      {
        String str = mVL + com.tencent.mm.a.g.x(localbbb.ThumbUrl.getBytes());
        Object localObject = new c.a();
        ((c.a)localObject).ePH = true;
        ((c.a)localObject).ePJ = str;
        localObject = ((c.a)localObject).ahG();
        o.ahp().a(localbbb.ThumbUrl, (com.tencent.mm.at.a.a.c)localObject, new f.3(localbbb, paramList, parama));
        AppMethodBeat.o(111240);
      }
    }
  }

  private static void b(gu paramgu)
  {
    AppMethodBeat.i(111241);
    paramgu = paramgu.cBw.cBy;
    if (bo.isNullOrNil(paramgu))
      AppMethodBeat.o(111241);
    label256: 
    while (true)
    {
      return;
      Object localObject;
      int i;
      boolean bool;
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramgu);
        i = bo.getInt(((JSONObject)localObject).getString("game_page_report_id"), 0);
        bool = ((JSONObject)localObject).getBoolean("game_page_report_instantly");
        paramgu = ((JSONObject)localObject).optString("game_page_report_format_data");
        localObject = ((JSONObject)localObject).optString("game_page_report_tabs_format_data");
        ab.i("MicroMsg.GameCommOpertionProcessor", "reportGamePageTime, reportId:%d, reportInstantly:%b, reportFormatData:(%s), reportTabsFormatData(%s)", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool), paramgu, localObject });
        if (i != 0)
          break label157;
        ab.i("MicroMsg.GameCommOpertionProcessor", "reportId format exception");
        AppMethodBeat.o(111241);
      }
      catch (JSONException paramgu)
      {
        ab.i("MicroMsg.GameCommOpertionProcessor", "reportGamePageTime, err1:%s", new Object[] { paramgu.getMessage() });
        AppMethodBeat.o(111241);
      }
      continue;
      label157: if (!bo.isNullOrNil(paramgu))
      {
        if (bool)
        {
          com.tencent.mm.plugin.game.e.a.aL(i, paramgu);
          AppMethodBeat.o(111241);
        }
        else
        {
          h.pYm.X(i, paramgu);
          AppMethodBeat.o(111241);
        }
      }
      else
      {
        if (!bo.isNullOrNil((String)localObject))
        {
          try
          {
            paramgu = new org/json/JSONArray;
            paramgu.<init>((String)localObject);
            int j = 0;
            if (j >= paramgu.length())
              break label296;
            localObject = paramgu.getString(j);
            if (!bo.isNullOrNil((String)localObject))
            {
              if (!bool)
                break label256;
              com.tencent.mm.plugin.game.e.a.aL(i, (String)localObject);
            }
            while (true)
            {
              j++;
              break;
              h.pYm.X(i, (String)localObject);
            }
          }
          catch (JSONException paramgu)
          {
            ab.i("MicroMsg.GameCommOpertionProcessor", "reportGamePageTime, err2:%s", new Object[] { paramgu.getMessage() });
          }
        }
        else
        {
          AppMethodBeat.o(111241);
          continue;
        }
        label296: AppMethodBeat.o(111241);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.f
 * JD-Core Version:    0.6.2
 */