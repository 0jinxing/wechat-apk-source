package com.tencent.mm.plugin.ext.c;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.d.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public class e
{
  public static e lQY = null;
  public Context mContext = null;

  public static void Q(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(20425);
    h.pYm.e(14869, new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(20425);
  }

  public static void R(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(20426);
    h.pYm.e(14868, new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(20426);
  }

  public static d.b aH(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(20428);
    paramString = d.brV().aG(paramString, paramBoolean);
    AppMethodBeat.o(20428);
    return paramString;
  }

  public static e brW()
  {
    AppMethodBeat.i(20424);
    if (lQY == null);
    while (true)
    {
      try
      {
        if (lQY == null)
        {
          locale1 = new com/tencent/mm/plugin/ext/c/e;
          locale1.<init>();
          lQY = locale1;
        }
        e locale1 = lQY;
        return locale1;
      }
      finally
      {
        AppMethodBeat.o(20424);
      }
      e locale2 = lQY;
      AppMethodBeat.o(20424);
    }
  }

  public static Cursor brX()
  {
    AppMethodBeat.i(20427);
    ab.i("MicroMsg.ExtQrCodeHandler", "hy: release temp mapping");
    c.clearCache();
    MatrixCursor localMatrixCursor = a.Kn(1);
    AppMethodBeat.o(20427);
    return localMatrixCursor;
  }

  public static ak brY()
  {
    AppMethodBeat.i(20430);
    ak localak = new ak(Looper.getMainLooper());
    AppMethodBeat.o(20430);
    return localak;
  }

  public final e.a a(d.b paramb)
  {
    AppMethodBeat.i(20429);
    long l = System.currentTimeMillis();
    e.a locala = (e.a)new e.1(this, new e.a(), paramb).b(brY());
    if (locala != null);
    for (paramb = locala.toString(); ; paramb = "null")
    {
      ab.i("MicroMsg.ExtQrCodeHandler", "hy: resolved qrcode: %s, using: %d ms", new Object[] { paramb, Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(20429);
      return locala;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.c.e
 * JD-Core Version:    0.6.2
 */