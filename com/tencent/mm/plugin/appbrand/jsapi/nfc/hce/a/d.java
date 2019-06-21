package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class d
{
  @TargetApi(21)
  public static boolean aEA()
  {
    AppMethodBeat.i(137936);
    boolean bool;
    if (aEz())
    {
      bool = ah.getContext().getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
      AppMethodBeat.o(137936);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137936);
    }
  }

  public static boolean aEB()
  {
    boolean bool = false;
    AppMethodBeat.i(137937);
    Context localContext = ah.getContext();
    if (!localContext.getPackageManager().hasSystemFeature("android.hardware.nfc"))
      AppMethodBeat.o(137937);
    while (true)
    {
      return bool;
      if (NfcAdapter.getDefaultAdapter(localContext) == null)
      {
        AppMethodBeat.o(137937);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(137937);
      }
    }
  }

  public static boolean aEC()
  {
    boolean bool = false;
    AppMethodBeat.i(137938);
    NfcAdapter localNfcAdapter = NfcAdapter.getDefaultAdapter(ah.getContext());
    if (localNfcAdapter == null)
    {
      ab.i("MicroMsg.HceUtils", "alvinluo no nfc chip !");
      AppMethodBeat.o(137938);
    }
    while (true)
    {
      return bool;
      if (!localNfcAdapter.isEnabled())
      {
        AppMethodBeat.o(137938);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(137938);
      }
    }
  }

  private static boolean aEz()
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.d
 * JD-Core Version:    0.6.2
 */