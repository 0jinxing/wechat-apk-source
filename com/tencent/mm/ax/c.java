package com.tencent.mm.ax;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.r.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.chg;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bm;
import com.tencent.mm.storage.bn;

public final class c
{
  public static boolean a(bm parambm)
  {
    boolean bool1 = false;
    AppMethodBeat.i(78420);
    if (parambm == null)
    {
      ab.e("MicroMsg.NewTipsManager", "check time, tipsInfo is null!!!");
      AppMethodBeat.o(78420);
    }
    long l1;
    while (true)
    {
      return bool1;
      l1 = bo.anT();
      if ((parambm.field_overdueTime != 0L) || (parambm.field_disappearTime != 0L))
        break;
      bool1 = true;
      ab.i("MicroMsg.NewTipsManager", "timeEffective current: %s, overdueTime: %s, disappearTime: %s, show:%s", new Object[] { Long.valueOf(l1), Long.valueOf(parambm.field_overdueTime), Long.valueOf(parambm.field_disappearTime), Boolean.valueOf(bool1) });
      AppMethodBeat.o(78420);
    }
    Long localLong = Long.valueOf(Math.min(parambm.field_beginShowTime + parambm.field_overdueTime, parambm.field_disappearTime));
    if ((l1 >= parambm.field_beginShowTime) && (l1 <= localLong.longValue()));
    for (boolean bool2 = true; ; bool2 = false)
    {
      bool1 = bool2;
      if (l1 <= localLong.longValue())
        break;
      long l2 = bo.anU();
      ah.getContext().getSharedPreferences(ah.doA() + "_newtips_report", 0).edit().putLong("newtips_makeread_time", l2).commit();
      bool1 = bool2;
      break;
    }
  }

  public static boolean b(bm parambm)
  {
    boolean bool = false;
    AppMethodBeat.i(78421);
    if (parambm == null)
    {
      ab.e("MicroMsg.NewTipsManager", "check path, tipsInfo is null!!!");
      AppMethodBeat.o(78421);
    }
    while (true)
    {
      return bool;
      Object localObject = a.bVu().Ms(parambm.field_tipId);
      if ((localObject != null) && (((bm)localObject).field_tipsShowInfo != null) && (parambm.field_tipsShowInfo != null))
      {
        localObject = ((bm)localObject).field_tipsShowInfo.path;
        parambm = parambm.field_tipsShowInfo.path;
        if (((localObject == null) && (parambm == null)) || ((localObject != null) && (((String)localObject).equals(parambm))))
        {
          AppMethodBeat.o(78421);
          bool = true;
        }
        else
        {
          ab.i("MicroMsg.NewTipsManager", "path illegal, localPath:%s, newPath:%s", new Object[] { localObject, parambm });
        }
      }
      else
      {
        AppMethodBeat.o(78421);
      }
    }
  }

  public static boolean c(bm parambm)
  {
    boolean bool = false;
    AppMethodBeat.i(78422);
    if (parambm == null)
    {
      ab.e("MicroMsg.NewTipsManager", "check version, tipsInfo is null!!!");
      AppMethodBeat.o(78422);
    }
    while (true)
    {
      return bool;
      bm localbm = a.bVu().Ms(parambm.field_tipId);
      if ((localbm != null) && ((parambm.field_tipVersion > localbm.field_tipVersion) || ((!parambm.field_hadRead) && (parambm.field_tipVersion == localbm.field_tipVersion))))
      {
        bool = true;
        AppMethodBeat.o(78422);
      }
      else
      {
        AppMethodBeat.o(78422);
      }
    }
  }

  protected static boolean d(bm parambm)
  {
    boolean bool = false;
    AppMethodBeat.i(78423);
    if (parambm == null)
    {
      ab.e("MicroMsg.NewTipsManager", "can not show new  tips！！ tipsInfo is null !!");
      AppMethodBeat.o(78423);
    }
    while (true)
    {
      return bool;
      if ((parambm.field_isExit) && (!parambm.field_hadRead) && (a(parambm)))
      {
        AppMethodBeat.o(78423);
        bool = true;
      }
      else
      {
        ab.i("MicroMsg.NewTipsManager", "can not show tips, isExit:%s, hadRead:%s, timeEffective:%s", new Object[] { Boolean.valueOf(parambm.field_isExit), Boolean.valueOf(parambm.field_hadRead), Boolean.valueOf(a(parambm)) });
        AppMethodBeat.o(78423);
      }
    }
  }

  public static boolean lQ(int paramInt)
  {
    AppMethodBeat.i(78424);
    bm localbm = a.bVu().Ms(paramInt);
    boolean bool;
    if (localbm == null)
    {
      ab.e("MicroMsg.NewTipsManager", "showDot, newTipsInfo is null !!");
      bool = false;
      AppMethodBeat.o(78424);
      return bool;
    }
    String str1;
    label279: String str2;
    label295: Object localObject;
    if ((d(a.bVu().Ms(paramInt))) && (localbm.field_tipsShowInfo != null) && (localbm.field_tipsShowInfo.showType == b.fKL))
    {
      if (localbm == null)
        ab.e("MicroMsg.NewTipsManager", "reportShowNewTips, newTipsInfo is null !!");
      do
      {
        bool = true;
        AppMethodBeat.o(78424);
        break;
        str1 = String.format("newtips_show_%d-%d", new Object[] { Integer.valueOf(localbm.field_tipId), Integer.valueOf(localbm.field_tipVersion) });
      }
      while (ah.getContext().getSharedPreferences(ah.doA() + "_newtips_report", 0).getBoolean(str1, false));
      i = localbm.field_tipId;
      j = localbm.field_tipVersion;
      k = localbm.field_tipType;
      l1 = ah.getContext().getSharedPreferences(ah.doA() + "_newtips_report", 0).getLong("newtips_gettipstime", 0L);
      l2 = bo.anU();
      ah.getContext().getSharedPreferences(ah.doA() + "_newtips_report", 0).edit().putLong("newtips_realshow_time", l2).commit();
      if (localbm.field_tipsShowInfo != null)
      {
        paramInt = localbm.field_tipsShowInfo.showType;
        if (localbm.field_tipsShowInfo == null)
          break label518;
        str2 = localbm.field_tipsShowInfo.title;
        if (localbm.field_tipsShowInfo == null)
          break label525;
        localObject = localbm.field_tipsShowInfo.kKZ;
        label311: if (localbm.field_tipsShowInfo == null)
          break label532;
      }
      label518: label525: label532: for (str3 = localbm.field_tipsShowInfo.path; ; str3 = "")
      {
        h.pYm.e(14995, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l1), "", "", "", Long.valueOf(l2), "", "", "", Integer.valueOf(paramInt), str2, localObject, str3, "", Integer.valueOf(b.fKR), "" });
        ah.getContext().getSharedPreferences(ah.doA() + "_newtips_report", 0).edit().putBoolean(str1, true).commit();
        break;
        paramInt = 0;
        break label279;
        str2 = "";
        break label295;
        localObject = "";
        break label311;
      }
    }
    if (localbm == null)
      ab.e("MicroMsg.NewTipsManager", "reportDismissNewTips, newTipsInfo is null !!");
    do
    {
      bool = false;
      AppMethodBeat.o(78424);
      break;
      str1 = String.format("newtips_dismiss_%d-%d", new Object[] { Integer.valueOf(localbm.field_tipId), Integer.valueOf(localbm.field_tipVersion) });
    }
    while (ah.getContext().getSharedPreferences(ah.doA() + "_newtips_report", 0).getBoolean(str1, false));
    int j = localbm.field_tipId;
    int k = localbm.field_tipVersion;
    int m = localbm.field_tipType;
    long l1 = ah.getContext().getSharedPreferences(ah.doA() + "_newtips_report", 0).getLong("newtips_gettipstime", 0L);
    long l3 = localbm.field_beginShowTime;
    long l4 = localbm.field_overdueTime;
    long l5 = localbm.field_disappearTime;
    long l6 = ah.getContext().getSharedPreferences(ah.doA() + "_newtips_report", 0).getLong("newtips_realshow_time", 0L);
    long l2 = ah.getContext().getSharedPreferences(ah.doA() + "_newtips_report", 0).getLong("newtips_makeread_time", 0L);
    int i = 0;
    long l7 = bo.anT();
    if ((!b(localbm)) || (!c(localbm)))
    {
      paramInt = 1;
      label802: if (localbm.field_tipsShowInfo == null)
        break label1271;
      i = localbm.field_tipsShowInfo.showType;
      label818: if (localbm.field_tipsShowInfo == null)
        break label1277;
      str2 = localbm.field_tipsShowInfo.title;
      label834: if (localbm.field_tipsShowInfo == null)
        break label1284;
      localObject = localbm.field_tipsShowInfo.kKZ;
      label850: if (localbm.field_tipsShowInfo == null)
        break label1291;
    }
    label1284: label1291: for (String str3 = localbm.field_tipsShowInfo.path; ; str3 = "")
    {
      l7 = localbm.field_pagestaytime;
      h.pYm.e(14995, new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Long.valueOf(l1), Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l5), Long.valueOf(l6), Long.valueOf(l2), Long.valueOf(l2 - l6), Integer.valueOf(paramInt), Integer.valueOf(i), str2, localObject, str3, "", Integer.valueOf(b.fKS), Long.valueOf(l7) });
      if (m == b.fKC)
      {
        localObject = a.bVu();
        str2 = "delete from NewTipsInfo where tipId = " + localbm.field_tipId;
        ab.i("MicroMsg.NewTipsInfoStorage", "delete sql: ".concat(String.valueOf(str2)));
        ((bn)localObject).bSd.hY("NewTipsInfo", str2);
        ((bn)localObject).b(localbm.field_tipId, 5, Integer.valueOf(localbm.field_tipId));
      }
      ah.getContext().getSharedPreferences(ah.doA() + "_newtips_report", 0).edit().putBoolean(str1, true).commit();
      break;
      if (localbm.field_hadRead)
      {
        paramInt = 4;
        break label802;
      }
      if ((localbm.field_disappearTime != 0L) && (l7 > localbm.field_disappearTime))
      {
        paramInt = 3;
        break label802;
      }
      paramInt = i;
      if (localbm.field_overdueTime == 0L)
        break label802;
      paramInt = i;
      if (localbm.field_beginShowTime + localbm.field_overdueTime > localbm.field_disappearTime)
        break label802;
      paramInt = i;
      if (l7 <= localbm.field_beginShowTime + localbm.field_overdueTime)
        break label802;
      paramInt = 2;
      break label802;
      label1271: i = 0;
      break label818;
      label1277: str2 = "";
      break label834;
      localObject = "";
      break label850;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ax.c
 * JD-Core Version:    0.6.2
 */