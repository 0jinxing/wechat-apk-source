package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.i;
import com.tencent.mm.m.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class j
{
  public static void run()
  {
    AppMethodBeat.i(15853);
    int i = com.tencent.mm.m.g.Nu().getInt("EnableForgroundService", 0);
    aw.ZK();
    int j = i.bL(c.QF(), 101);
    if ((b.dnO()) || ((i > 0) && (j >= 0) && (j <= i)));
    for (boolean bool1 = true; ; bool1 = false)
    {
      boolean bool2 = bool1;
      if (!bool1)
        bool2 = d.vxr;
      bool1 = bool2;
      if (!bool2)
        bool1 = b.dnO();
      if (com.tencent.mm.sdk.platformtools.g.cdf == 1)
        bool1 = false;
      ah.getContext().getSharedPreferences("system_config_prefs", 0).edit().putBoolean("set_service", bool1).commit();
      ab.i("MicroMsg.PostTaskSetPushForegroundService", "Set service, userHash:%d, prob:%d, enabled: %b  isalpha:%b channel:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool1), Boolean.valueOf(d.vxr), Integer.valueOf(com.tencent.mm.sdk.platformtools.g.cdf) });
      AppMethodBeat.o(15853);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.j
 * JD-Core Version:    0.6.2
 */