package com.tinkerboots.sdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tinkerboots.sdk.a.a.b;
import com.tinkerboots.sdk.b.c;

public final class a
{
  private static volatile a ATY;
  public b ATX;
  public final com.tinkerboots.sdk.a.b.a ATZ;
  public long hgu;
  public boolean isDebug;

  private a(b paramb)
  {
    AppMethodBeat.i(65525);
    this.hgu = 10800000L;
    this.ATZ = com.tinkerboots.sdk.a.b.a.dWl();
    this.ATX = paramb;
    AppMethodBeat.o(65525);
  }

  public static a a(b paramb)
  {
    AppMethodBeat.i(65526);
    if (ATY != null)
    {
      paramb = new RuntimeException("tinker server client is already init");
      AppMethodBeat.o(65526);
      throw paramb;
    }
    if (ATY == null);
    try
    {
      if (ATY == null)
      {
        a locala = new com/tinkerboots/sdk/a/a;
        locala.<init>(paramb);
        ATY = locala;
      }
      paramb = ATY;
      AppMethodBeat.o(65526);
      return paramb;
    }
    finally
    {
      AppMethodBeat.o(65526);
    }
    throw paramb;
  }

  private static boolean dWk()
  {
    AppMethodBeat.i(65529);
    com.tencent.tinker.lib.util.a.i("Tinker.ServerClient", "Warning, disableFetchPatchUpdate", new Object[0]);
    boolean bool = c.getContext().getSharedPreferences("patch_server_config", 0).edit().putLong("fetch_patch_last_check", -1L).commit();
    AppMethodBeat.o(65529);
    return bool;
  }

  public final void SH(int paramInt)
  {
    AppMethodBeat.i(65528);
    if (paramInt == -1L)
    {
      dWk();
      AppMethodBeat.o(65528);
    }
    while (true)
    {
      return;
      if ((paramInt < 0) || (paramInt > 24))
      {
        TinkerRuntimeException localTinkerRuntimeException = new TinkerRuntimeException("hours must be between 0 and 24");
        AppMethodBeat.o(65528);
        throw localTinkerRuntimeException;
      }
      this.hgu = (paramInt * 3600L * 1000L);
      AppMethodBeat.o(65528);
    }
  }

  public final void iO(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65527);
    this.ATZ.iP(paramString1, paramString2);
    AppMethodBeat.o(65527);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.a.a
 * JD-Core Version:    0.6.2
 */