package com.tencent.mm.ax;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.r.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.chg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bm;
import com.tencent.mm.storage.bn;
import java.util.Map;

public final class e
  implements n
{
  public final e.b a(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(78429);
    ab.d("dancy", "dancy consumeNewXml， subType:%s", new Object[] { paramString });
    int i;
    int j;
    int k;
    long l;
    int m;
    label144: label159: label174: String str;
    label190: int n;
    if ((bo.nullAsNil(paramString).equals("newtips")) && (paramMap != null))
    {
      a.bVt();
      if (paramMap != null)
        break label407;
      ab.e("MicroMsg.NewTipsManager", "parse newtips map fail! map is null!!");
      paramString = null;
      if (paramString != null)
      {
        i = paramString.field_tipId;
        j = paramString.field_tipVersion;
        k = paramString.field_tipType;
        l = bo.anU();
        ah.getContext().getSharedPreferences(ah.doA() + "_newtips_report", 0).edit().putLong("newtips_gettipstime", l).commit();
        if (paramString.field_tipsShowInfo == null)
          break label733;
        m = paramString.field_tipsShowInfo.showType;
        if (paramString.field_tipsShowInfo == null)
          break label739;
        paramMap = paramString.field_tipsShowInfo.title;
        if (paramString.field_tipsShowInfo == null)
          break label745;
        parama = paramString.field_tipsShowInfo.kKZ;
        if (paramString.field_tipsShowInfo == null)
          break label751;
        str = paramString.field_tipsShowInfo.path;
        a.bVv();
        if (c.b(paramString))
          break label758;
        n = 2;
      }
    }
    label407: label733: label739: label867: 
    while (true)
    {
      h.pYm.e(14995, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l), "", "", "", "", "", "", "", Integer.valueOf(m), paramMap, parama, str, Integer.valueOf(n), Integer.valueOf(b.fKQ), "" });
      paramMap = a.bVt().fKT;
      if (paramMap != null)
      {
        a.bVv();
        if (c.d(paramString))
        {
          ab.d("dancy", "dancy consumeNewXml notifyShowNewTips isExit: %s, begintime: %s", new Object[] { Boolean.valueOf(paramString.field_isExit), Long.valueOf(paramString.field_beginShowTime) });
          paramMap.e(paramString);
        }
      }
      AppMethodBeat.o(78429);
      return null;
      l = bo.anT();
      paramString = new bm();
      paramString.field_tipId = bo.getInt((String)paramMap.get(".sysmsg.newtips.control.tips_id"), 0);
      paramString.field_tipVersion = bo.getInt((String)paramMap.get(".sysmsg.newtips.control.tips_version"), 0);
      paramString.field_tipType = bo.getInt((String)paramMap.get(".sysmsg.newtips.control.tips_type"), 0);
      paramString.field_beginShowTime = Math.max(bo.getLong((String)paramMap.get(".sysmsg.newtips.control.begin_time"), 0L), l);
      paramString.field_overdueTime = bo.getLong((String)paramMap.get(".sysmsg.newtips.control.overdue_time"), 0L);
      paramString.field_disappearTime = bo.getLong((String)paramMap.get(".sysmsg.newtips.control.disappear_time"), 0L);
      if (paramMap.get(".sysmsg.newtips.control.tips_showInfo") != null)
      {
        paramString.field_tipsShowInfo = new chg();
        paramString.field_tipsShowInfo.showType = bo.getInt((String)paramMap.get(".sysmsg.newtips.control.tips_showInfo.show_type"), 0);
        paramString.field_tipsShowInfo.title = ((String)paramMap.get(".sysmsg.newtips.control.tips_showInfo.title"));
        paramString.field_tipsShowInfo.kKZ = ((String)paramMap.get(".sysmsg.newtips.control.tips_showInfo.icon_url"));
        paramString.field_tipsShowInfo.path = ((String)paramMap.get(".sysmsg.newtips.control.tips_showInfo.path"));
      }
      paramString.field_extInfo = ((String)paramMap.get(".sysmsg.newtips.control.tips_showInfo."));
      a.bVu().Ms(paramString.field_tipId);
      a.bVv();
      if ((c.a(paramString)) && (c.b(paramString)) && (c.c(paramString)) && (!paramString.field_isReject));
      for (n = 1; ; n = 0)
      {
        if (n != 0)
        {
          paramString.field_isExit = true;
          a.bVu().a(paramString, new String[0]);
        }
        break;
      }
      m = 0;
      break label144;
      paramMap = "";
      break label159;
      label745: parama = "";
      break label174;
      label751: str = "";
      break label190;
      label758: if (!c.c(paramString))
      {
        n = 3;
      }
      else if (!c.a(paramString))
      {
        n = 4;
      }
      else
      {
        bm localbm = a.bVu().Ms(paramString.field_tipId);
        if ((localbm != null) && (paramString.field_tipType == localbm.field_tipType));
        for (n = 1; ; n = 0)
        {
          if (n != 0)
            break label833;
          n = 5;
          break;
        }
        if (a.bVu().Ms(paramString.field_tipId) != null);
        for (n = 1; ; n = 0)
        {
          if (n != 0)
            break label867;
          n = 6;
          break;
        }
        if (paramString.field_isReject)
          n = 7;
        else
          n = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ax.e
 * JD-Core Version:    0.6.2
 */