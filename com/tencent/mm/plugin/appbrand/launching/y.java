package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class y
{
  static void a(b paramb, String paramString, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(131909);
    int i = c.Dw(paramString);
    ab.d("MicroMsg.AppBrand.LaunchStepCostReporter", "report %s | %s | %d | %d | %d", new Object[] { paramb.name(), paramString, Long.valueOf(paramLong), Integer.valueOf(i), Integer.valueOf(0) });
    h.pYm.e(13886, new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2 + 1), Integer.valueOf(paramb.hsh), "", "", Long.valueOf(paramLong), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramInt3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(0) });
    AppMethodBeat.o(131909);
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(131905);
      ihK = new a("NONE", 0);
      ihL = new a("MISSING_PKG", 1);
      ihM = new a("NO_USE_RECENT", 2);
      ihN = new a("INVALID_FIELDS", 3);
      ihO = new a("VERSION_NOT_FOUND", 4);
      ihP = new a("PATH_NOT_FOUND", 5);
      ihQ = new a("CMD_UPDATE_VERSION", 6);
      ihR = new a("ATTRS_NOT_FOUND", 7);
      ihS = new a[] { ihK, ihL, ihM, ihN, ihO, ihP, ihQ, ihR };
      AppMethodBeat.o(131905);
    }
  }

  public static enum b
  {
    final int hsh;

    static
    {
      AppMethodBeat.i(131908);
      ihT = new b("SYNC_GET_ATTRS", 0, 20);
      ihU = new b("SYNC_LAUNCH", 1, 21);
      ihV = new b("GET_DOWNLOAD_URL", 2, 22);
      ihW = new b[] { ihT, ihU, ihV };
      AppMethodBeat.o(131908);
    }

    private b(int paramInt)
    {
      this.hsh = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.y
 * JD-Core Version:    0.6.2
 */