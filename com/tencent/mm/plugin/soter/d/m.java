package com.tencent.mm.plugin.soter.d;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.aa;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.s;
import com.tencent.mm.kernel.c;
import com.tencent.mm.m.e;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class m
{
  private static String TAG = "MicroMsg.SoterUtil";

  public static void cvR()
  {
    AppMethodBeat.i(59347);
    if (bo.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.RL().K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("SoterEntry"), 0) == 1);
    for (boolean bool = true; ; bool = false)
    {
      ab.i(TAG, "alvinluo dynamic config support soter: %b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        ab.d(TAG, "alvinluo set all soter support flag to true");
        q.eti.cOQ = true;
        q.eti.eue = 255;
        q.etg.etr = 1;
        q.etg.ets = 1;
        ab.d(TAG, "alvinluo deviceInfo soter support: %b, force status: %d, allow external: %d", new Object[] { Boolean.valueOf(q.eti.cOQ), Integer.valueOf(q.etg.etr), Integer.valueOf(q.etg.ets) });
      }
      AppMethodBeat.o(59347);
      return;
    }
  }

  public static String cvS()
  {
    AppMethodBeat.i(59348);
    try
    {
      String str1 = com.tencent.mm.a.g.x(r.YC().getBytes());
      if (str1 != null)
      {
        str1 = str1.substring(0, 8);
        AppMethodBeat.o(59348);
        return str1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(TAG, localException, "alvinluo get md5 exception", new Object[0]);
        String str2 = "";
        AppMethodBeat.o(59348);
      }
    }
  }

  public static String cvT()
  {
    AppMethodBeat.i(59349);
    String str = "WechatAuthKeyPay&" + r.YC();
    AppMethodBeat.o(59349);
    return str;
  }

  public static boolean cvU()
  {
    AppMethodBeat.i(138532);
    boolean bool = cvV();
    AppMethodBeat.o(138532);
    return bool;
  }

  private static boolean cvV()
  {
    AppMethodBeat.i(59352);
    boolean bool;
    if (!q.eti.cOQ)
    {
      ab.i(TAG, "hy: dynamic config is not support soter");
      bool = false;
      AppMethodBeat.o(59352);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.soter.a.a.dRc();
      AppMethodBeat.o(59352);
    }
  }

  public static boolean eT(Context paramContext)
  {
    AppMethodBeat.i(59350);
    boolean bool;
    if ((cvV()) && (com.tencent.soter.core.a.iP(paramContext)))
    {
      bool = true;
      AppMethodBeat.o(59350);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59350);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.d.m
 * JD-Core Version:    0.6.2
 */