package com.tencent.mm.emoji.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.gif.MMWXGFJNI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class e
{
  private static boolean ezc = false;
  private static boolean ezd = false;
  private static boolean eze = false;
  private static boolean ezf = false;
  private static boolean ezg = false;
  private static boolean ezh = false;

  public static boolean OJ()
  {
    boolean bool = false;
    AppMethodBeat.i(62250);
    if ((com.tencent.mm.m.g.Nu().getInt("EmotionRewardOption", 0) & 0x1) == 1)
      AppMethodBeat.o(62250);
    while (true)
    {
      return bool;
      AppMethodBeat.o(62250);
      bool = true;
    }
  }

  public static boolean OK()
  {
    boolean bool = false;
    AppMethodBeat.i(62251);
    if ((com.tencent.mm.m.g.Nu().getInt("EmotionRewardOption", 0) & 0x2) == 2)
      AppMethodBeat.o(62251);
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(62251);
    }
  }

  public static boolean OL()
  {
    boolean bool = false;
    AppMethodBeat.i(62252);
    if ((com.tencent.mm.m.g.Nu().getInt("EmotionRewardOption", 0) & 0x4) == 4)
    {
      bool = true;
      AppMethodBeat.o(62252);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(62252);
    }
  }

  public static int OM()
  {
    AppMethodBeat.i(62253);
    int i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("CustomEmojiMaxSize"), 300);
    AppMethodBeat.o(62253);
    return i;
  }

  public static int ON()
  {
    AppMethodBeat.i(62254);
    int i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("CustomEmojiMaxSize"), 300);
    AppMethodBeat.o(62254);
    return i;
  }

  public static String OO()
  {
    AppMethodBeat.i(62255);
    String str = com.tencent.mm.m.g.Nu().getValue("C2CEmojiNotAutoDownloadTimeRange");
    AppMethodBeat.o(62255);
    return str;
  }

  public static String OP()
  {
    AppMethodBeat.i(62256);
    String str = com.tencent.mm.m.g.Nu().getValue("EmotionPanelConfigName");
    AppMethodBeat.o(62256);
    return str;
  }

  public static boolean OQ()
  {
    AppMethodBeat.i(62257);
    if (!ezc)
    {
      int i = com.tencent.mm.m.g.Nu().getInt("EnableEmoticonExternUrl", 0);
      int j = MMWXGFJNI.getErrorCode();
      if ((i & 0x1) != 1)
        break label138;
      if ((OX()) || (OY()))
        break label131;
      ezf = true;
      if (j < 0)
      {
        ezf = false;
        switch (j)
        {
        default:
        case -901:
        case -902:
        case -903:
        case -904:
        case -905:
        case -906:
        }
      }
    }
    while (true)
    {
      ezc = true;
      ab.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcDownload:%b", new Object[] { Boolean.valueOf(ezf) });
      boolean bool = ezf;
      AppMethodBeat.o(62257);
      return bool;
      label131: ezf = false;
      break;
      label138: ezf = false;
      break;
      h.pYm.a(711L, 5L, 1L, false);
      continue;
      h.pYm.a(711L, 6L, 1L, false);
      continue;
      h.pYm.a(711L, 7L, 1L, false);
      continue;
      h.pYm.a(711L, 8L, 1L, false);
      continue;
      h.pYm.a(711L, 9L, 1L, false);
      continue;
      h.pYm.a(711L, 10L, 1L, false);
    }
  }

  public static boolean OR()
  {
    AppMethodBeat.i(62258);
    int j;
    if (!ezd)
    {
      int i = com.tencent.mm.m.g.Nu().getInt("EnableEmoticonExternUrl", 0);
      j = MMWXGFJNI.getErrorCode();
      if ((i & 0x2) != 2)
        break label115;
      if ((OX()) || (OY()))
        break label103;
      ezg = true;
      h.pYm.a(711L, 1L, 1L, false);
    }
    while (true)
    {
      if (j < 0)
        ezg = false;
      ezd = true;
      ab.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcDecode:%b", new Object[] { Boolean.valueOf(ezg) });
      boolean bool = ezg;
      AppMethodBeat.o(62258);
      return bool;
      label103: h.pYm.a(711L, 0L, 1L, false);
      label115: ezg = false;
    }
  }

  public static boolean OS()
  {
    AppMethodBeat.i(62259);
    if (!eze)
      if ((com.tencent.mm.m.g.Nu().getInt("EnableEmoticonExternUrl", 0) & 0x4) != 4)
        break label65;
    label65: for (ezh = true; ; ezh = false)
    {
      eze = true;
      ab.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcUpload:%b", new Object[] { Boolean.valueOf(ezh) });
      boolean bool = ezh;
      AppMethodBeat.o(62259);
      return bool;
    }
  }

  public static boolean OT()
  {
    AppMethodBeat.i(62260);
    boolean bool;
    if ((com.tencent.mm.m.g.Nu().getInt("ShowEmoticonCameraEntrance", 3) & 0x1) > 0)
    {
      bool = true;
      AppMethodBeat.o(62260);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62260);
    }
  }

  public static boolean OU()
  {
    AppMethodBeat.i(62261);
    boolean bool;
    if ((com.tencent.mm.m.g.Nu().getInt("ShowEmoticonCameraEntrance", 3) & 0x2) > 0)
    {
      bool = true;
      AppMethodBeat.o(62261);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62261);
    }
  }

  public static boolean OV()
  {
    boolean bool = true;
    AppMethodBeat.i(62263);
    if (com.tencent.mm.kernel.g.RP().Ry().getInt(ac.a.xWU, 1) == 0)
      AppMethodBeat.o(62263);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62263);
    }
  }

  public static boolean OW()
  {
    boolean bool = false;
    AppMethodBeat.i(62264);
    if (com.tencent.mm.m.g.Nu().getInt("ForbiddenEmotionSpringFestivalMsgTail", 0) > 0)
      AppMethodBeat.o(62264);
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(62264);
    }
  }

  private static boolean OX()
  {
    boolean bool = true;
    AppMethodBeat.i(62265);
    PackageManager localPackageManager = ah.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app.cn", 1);
      AppMethodBeat.o(62265);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        bool = false;
    }
  }

  private static boolean OY()
  {
    boolean bool = true;
    AppMethodBeat.i(62266);
    PackageManager localPackageManager = ah.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app", 1);
      AppMethodBeat.o(62266);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        bool = false;
    }
  }

  public static boolean isSpringFestivalEnable()
  {
    AppMethodBeat.i(62262);
    ((a)com.tencent.mm.kernel.g.K(a.class)).a(a.a.lIG, 0);
    com.tencent.mm.m.g.Nu().getInt("EmotionSpringFestivalPendantSwitch", 0);
    AppMethodBeat.o(62262);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.a.e
 * JD-Core Version:    0.6.2
 */