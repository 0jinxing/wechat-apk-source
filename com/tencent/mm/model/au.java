package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

public final class au
{
  public static void k(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 2;
    AppMethodBeat.i(77812);
    boolean bool1 = a.MC();
    boolean bool2 = a.ME();
    g.RQ();
    boolean bool3 = ((Boolean)g.RP().Ry().get(73217, Boolean.TRUE)).booleanValue();
    g.RQ();
    boolean bool4 = ((Boolean)g.RP().Ry().get(73218, Boolean.TRUE)).booleanValue();
    boolean bool5;
    h localh;
    int j;
    label159: int k;
    label167: int m;
    label175: int n;
    if ((bool3) || (bool4))
    {
      bool5 = true;
      ab.i("MicroMsg.KvNotificationStat", "doStatSysNotificationAfterModify, switchNewMsg: %s, switchVoipInvite: %s, isNewMsgNotification: %s, isNewVoipMsgNotification: %s, voipSound: %s, voipAudioSound: %s, voipHasSound: %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5) });
      localh = h.pYm;
      if (!bool1)
        break label282;
      j = 1;
      if (!bool2)
        break label288;
      k = 1;
      if (!bool5)
        break label294;
      m = 1;
      if (!paramBoolean1)
        break label306;
      if (!bool1)
        break label300;
      n = 2;
      label186: if (!paramBoolean2)
        break label317;
      if (!bool2)
        break label312;
    }
    while (true)
    {
      localh.e(14852, new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(0), Integer.valueOf(n), Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(0) });
      AppMethodBeat.o(77812);
      return;
      bool5 = false;
      break;
      label282: j = 0;
      break label159;
      label288: k = 0;
      break label167;
      label294: m = 0;
      break label175;
      label300: n = 1;
      break label186;
      label306: n = 0;
      break label186;
      label312: i = 1;
      continue;
      label317: i = 0;
    }
  }

  public static void kB(int paramInt)
  {
    AppMethodBeat.i(77810);
    boolean bool1 = a.MC();
    boolean bool2 = a.ME();
    boolean bool3 = a.MF();
    boolean bool4 = a.MG();
    boolean bool5 = a.MI();
    boolean bool6 = a.MR();
    int i = a.MS();
    int j = a.MU();
    int k = a.MT();
    int m = a.MV();
    g.RQ();
    boolean bool7 = ((Boolean)g.RP().Ry().get(73217, Boolean.TRUE)).booleanValue();
    g.RQ();
    boolean bool8 = ((Boolean)g.RP().Ry().get(73218, Boolean.TRUE)).booleanValue();
    boolean bool9;
    h localh;
    int n;
    label281: int i1;
    label288: int i2;
    label295: int i3;
    label303: int i4;
    label311: int i5;
    label319: String str1;
    String str2;
    if ((bool7) || (bool8))
    {
      bool9 = true;
      ab.i("MicroMsg.KvNotificationStat", "doStatNotification, isNewMsgNotification: %s, isNewVoipMsgNotification: %s, isNotificationShowDetail: %s, isNotificationSound: %s, isNotificationShake: %s, isActiveSilentTime: %s, activeBegin: %s, activeEnd: %s, scene: %s, voipSound: %s, voipAudioSound: %s, voipHasSound: %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5), Boolean.valueOf(bool6), kC(i) + kC(j), kC(k) + kC(m), Integer.valueOf(paramInt), Boolean.valueOf(bool7), Boolean.valueOf(bool8), Boolean.valueOf(bool9) });
      localh = h.pYm;
      if (!bool1)
        break label485;
      n = 1;
      if (!bool2)
        break label491;
      i1 = 1;
      if (!bool3)
        break label497;
      i2 = 1;
      if (!bool4)
        break label503;
      i3 = 1;
      if (!bool5)
        break label509;
      i4 = 1;
      if (!bool6)
        break label515;
      i5 = 2;
      str1 = kC(k) + kC(m);
      str2 = kC(i) + kC(j);
      if (!bool9)
        break label521;
    }
    label515: label521: for (i = 1; ; i = 2)
    {
      localh.e(15308, new Object[] { Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str1, str2, Integer.valueOf(paramInt), Integer.valueOf(i) });
      AppMethodBeat.o(77810);
      return;
      bool9 = false;
      break;
      label485: n = 2;
      break label281;
      label491: i1 = 2;
      break label288;
      label497: i2 = 2;
      break label295;
      label503: i3 = 2;
      break label303;
      label509: i4 = 2;
      break label311;
      i5 = 1;
      break label319;
    }
  }

  private static String kC(int paramInt)
  {
    AppMethodBeat.i(77811);
    String str;
    if (paramInt > 10)
    {
      str = String.valueOf(paramInt);
      AppMethodBeat.o(77811);
    }
    while (true)
    {
      return str;
      str = "0".concat(String.valueOf(paramInt));
      AppMethodBeat.o(77811);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.au
 * JD-Core Version:    0.6.2
 */