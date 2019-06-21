package com.tencent.c.a.a;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b
{
  static b.a cbd;
  Integer cbe;
  String cbf;

  public b(Context paramContext)
  {
    AppMethodBeat.i(125746);
    this.cbe = null;
    this.cbf = null;
    try
    {
      aF(paramContext);
      TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (localTelephonyManager != null)
        this.cbe = Integer.valueOf(localTelephonyManager.getNetworkType());
      this.cbf = s.aP(paramContext);
      AppMethodBeat.o(125746);
      return;
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        s.zY();
        AppMethodBeat.o(125746);
      }
    }
  }

  private static b.a aF(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(125745);
      if (cbd == null)
      {
        b.a locala = new com/tencent/c/a/a/b$a;
        locala.<init>(paramContext.getApplicationContext(), (byte)0);
        cbd = locala;
      }
      paramContext = cbd;
      AppMethodBeat.o(125745);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.b
 * JD-Core Version:    0.6.2
 */