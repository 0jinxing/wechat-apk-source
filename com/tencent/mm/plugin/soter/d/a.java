package com.tencent.mm.plugin.soter.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static int rOf = -1;
  private static int rOg = -1;

  public static void EB(int paramInt)
  {
    rOf = paramInt;
  }

  public static void EC(int paramInt)
  {
    AppMethodBeat.i(59324);
    if (rOg == -1)
    {
      ab.e("MicroMsg.FingerpirntReporter", "hy: no current pay session");
      AppMethodBeat.o(59324);
    }
    while (true)
    {
      return;
      h.pYm.e(12927, new Object[] { Integer.valueOf(rOg), Integer.valueOf(paramInt) });
      rOg = -1;
      AppMethodBeat.o(59324);
    }
  }

  public static void ED(int paramInt)
  {
    AppMethodBeat.i(59325);
    if (rOg == -1)
    {
      ab.e("MicroMsg.FingerpirntReporter", "hy: no current pay session");
      AppMethodBeat.o(59325);
    }
    while (true)
    {
      return;
      h.pYm.e(16995, new Object[] { Integer.valueOf(rOg), Integer.valueOf(paramInt) });
      rOg = -1;
      AppMethodBeat.o(59325);
    }
  }

  public static void EE(int paramInt)
  {
    AppMethodBeat.i(59328);
    String str = bo.l(new Throwable());
    ab.i("MicroMsg.FingerpirntReporter", "alvinluo soter cLog report, sceneType: %d, detailScene: %d, content: %s", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt), str });
    HashMap localHashMap = new HashMap();
    localHashMap.put("sceneType", "3");
    localHashMap.put("scene", String.valueOf(paramInt));
    h.pYm.g("Soter", "Fingerprint pay add authentication task failed: ".concat(String.valueOf(str)), localHashMap);
    AppMethodBeat.o(59328);
  }

  public static void cvN()
  {
    AppMethodBeat.i(59319);
    if (rOf == -1)
    {
      ab.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
      AppMethodBeat.o(59319);
    }
    while (true)
    {
      return;
      h.pYm.e(12925, new Object[] { Integer.valueOf(rOf) });
      AppMethodBeat.o(59319);
    }
  }

  public static void cvO()
  {
    AppMethodBeat.i(59320);
    if (rOf == -1)
    {
      ab.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
      AppMethodBeat.o(59320);
    }
    while (true)
    {
      return;
      h.pYm.e(12926, new Object[] { Integer.valueOf(rOf) });
      AppMethodBeat.o(59320);
    }
  }

  public static void cvP()
  {
    AppMethodBeat.i(59323);
    rOg = (int)(System.currentTimeMillis() / 1000L);
    AppMethodBeat.o(59323);
  }

  public static void d(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    AppMethodBeat.i(59321);
    if (rOf == -1)
    {
      ab.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
      AppMethodBeat.o(59321);
    }
    while (true)
    {
      return;
      h.pYm.e(13413, new Object[] { Integer.valueOf(rOf), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
      rOf = -1;
      AppMethodBeat.o(59321);
    }
  }

  public static void e(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    AppMethodBeat.i(59322);
    if (rOf == -1)
    {
      ab.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
      AppMethodBeat.o(59322);
    }
    while (true)
    {
      return;
      h.pYm.e(16992, new Object[] { Integer.valueOf(rOf), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
      AppMethodBeat.o(59322);
    }
  }

  public static void fG(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(59326);
    ab.v("MicroMsg.FingerpirntReporter", "alvinluo report open guide count, actionType: %d, actionCount: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    h.pYm.e(14381, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(59326);
  }

  public static void fH(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(59327);
    switch (paramInt2)
    {
    default:
      paramInt1 = -1;
    case 26:
    case 4:
    case 9:
    case 5:
    case 10:
    case 1001:
    }
    while (true)
    {
      if (paramInt1 != -1)
      {
        ab.i("MicroMsg.FingerpirntReporter", "alvinluo soter idkey report id: %d, key: %d, value: %d", new Object[] { Integer.valueOf(672), Integer.valueOf(paramInt1), Long.valueOf(1L) });
        h.pYm.a(672L, paramInt1, 1L, false);
      }
      AppMethodBeat.o(59327);
      return;
      if (paramInt1 == 3)
      {
        paramInt1 = 0;
        continue;
        paramInt1 = 1;
        continue;
        paramInt1 = 2;
        continue;
        paramInt1 = 3;
        continue;
        paramInt1 = 4;
        continue;
        paramInt1 = 5;
      }
      else
      {
        paramInt1 = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.d.a
 * JD-Core Version:    0.6.2
 */