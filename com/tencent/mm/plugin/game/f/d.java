package com.tencent.mm.plugin.game.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.s;
import com.tencent.mm.plugin.s.a.a.a;
import com.tencent.mm.pluginsdk.model.app.e;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
{
  public static void a(f paramf)
  {
    AppMethodBeat.i(112323);
    if (paramf == null)
    {
      ab.e("MicroMsg.GameDataUtil", "Null appInfo");
      AppMethodBeat.o(112323);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(paramf.field_appId))
        break;
      ab.e("MicroMsg.GameDataUtil", "Invalid appId");
      AppMethodBeat.o(112323);
    }
    String str1 = paramf.field_appId;
    f localf = g.bT(str1, true);
    if (localf == null)
    {
      localf = new f();
      localf.field_appId = str1;
    }
    for (boolean bool1 = true; ; bool1 = false)
    {
      String str2 = aa.dor();
      label100: boolean bool2;
      if (str2.equals("zh_CN"))
      {
        localf.field_appName = paramf.field_appName;
        localf.field_appType = paramf.field_appType;
        localf.field_packageName = paramf.field_packageName;
        localf.ih(paramf.dna);
        localf.ik(paramf.dnf);
        localf.hq(paramf.dnj);
        localf.il(paramf.dng);
        localf.iq(paramf.dnm);
        localf.ir(paramf.dnn);
        localf.io(paramf.dnk);
        localf.ip(paramf.dnl);
        localf.hr(paramf.dnp);
        if (!bo.isNullOrNil(paramf.dnd))
          localf.ii(paramf.dnd);
        if (!bool1)
          break label308;
        bool2 = com.tencent.mm.plugin.s.a.bYJ().n(localf);
        a.a.bYQ().Us(str1);
      }
      while (true)
      {
        ab.i("MicroMsg.GameDataUtil", "Saving AppInfo, appId: %s, insert?: %s, return: %s", new Object[] { str1, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        AppMethodBeat.o(112323);
        break;
        if ((str2.equals("zh_TW")) || (str2.equals("zh_HK")))
        {
          localf.field_appName_tw = paramf.field_appName;
          break label100;
        }
        localf.field_appName_en = paramf.field_appName;
        break label100;
        label308: if (localf.field_appVersion < paramf.field_appVersion)
        {
          ab.i("MicroMsg.GameDataUtil", "oldVersion = %s, newVersion = %s", new Object[] { Integer.valueOf(localf.field_appVersion), Integer.valueOf(paramf.field_appVersion) });
          bool2 = com.tencent.mm.plugin.s.a.bYJ().a(localf, new String[0]);
          a.a.bYQ().Us(str1);
        }
        else if (a(localf, paramf))
        {
          ab.i("MicroMsg.GameDataUtil", "oldIcon = %s, newIcon = %s", new Object[] { localf.field_appIconUrl, paramf.field_appIconUrl });
          localf.field_appIconUrl = paramf.field_appIconUrl;
          bool2 = com.tencent.mm.plugin.s.a.bYJ().a(localf, new String[0]);
          com.tencent.mm.plugin.s.a.bYH().dW(str1, 1);
          com.tencent.mm.plugin.s.a.bYH().dW(str1, 2);
          com.tencent.mm.plugin.s.a.bYH().dW(str1, 3);
          com.tencent.mm.plugin.s.a.bYH().dW(str1, 4);
          com.tencent.mm.plugin.s.a.bYH().dW(str1, 5);
        }
        else
        {
          bool2 = com.tencent.mm.plugin.s.a.bYJ().a(localf, new String[0]);
        }
      }
    }
  }

  private static boolean a(f paramf1, f paramf2)
  {
    boolean bool = true;
    AppMethodBeat.i(112324);
    if ((paramf1 == null) || (bo.isNullOrNil(paramf1.field_appIconUrl)))
      AppMethodBeat.o(112324);
    while (true)
    {
      return bool;
      if ((paramf2 == null) || (bo.isNullOrNil(paramf2.field_appIconUrl)))
      {
        AppMethodBeat.o(112324);
        bool = false;
      }
      else if (!paramf1.field_appIconUrl.equals(paramf2.field_appIconUrl))
      {
        AppMethodBeat.o(112324);
      }
      else
      {
        AppMethodBeat.o(112324);
        bool = false;
      }
    }
  }

  public static void ac(LinkedList<? extends f> paramLinkedList)
  {
    AppMethodBeat.i(112325);
    if (paramLinkedList == null)
    {
      ab.e("MicroMsg.GameDataUtil", "Null appInfos");
      AppMethodBeat.o(112325);
    }
    while (true)
    {
      return;
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
        a((f)paramLinkedList.next());
      AppMethodBeat.o(112325);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.f.d
 * JD-Core Version:    0.6.2
 */