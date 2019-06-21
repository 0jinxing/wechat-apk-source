package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

import android.os.Bundle;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.a;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class b$a
  implements a
{
  private b$a(b paramb)
  {
  }

  public final void cl(String paramString1, String paramString2)
  {
    AppMethodBeat.i(137913);
    ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND send to AppBrand, appId: %s, command: %s", new Object[] { paramString1, paramString2 });
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.e("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND invalid appId or command when send request command to AppBrand");
      AppMethodBeat.o(137913);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putString("key_apdu_command", paramString2);
      this.hSH.b(paramString1, 31, localBundle);
      b.a(this.hSH);
      if (!b.b(this.hSH))
      {
        b.c(this.hSH);
        b.a(this.hSH, false);
        b.go(System.currentTimeMillis());
        m.aNS().m(new b.a.1(this), b.d(this.hSH));
        AppMethodBeat.o(137913);
      }
      else
      {
        if (b.g(this.hSH))
        {
          ab.w("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND TimeExceeded, just return default command");
          b.a(this.hSH, b.aEy(), true, b.f(this.hSH));
          b.a(this.hSH, false);
        }
        AppMethodBeat.o(137913);
      }
    }
  }

  public final void cm(String paramString1, String paramString2)
  {
    AppMethodBeat.i(137914);
    if ((b.h(this.hSH) == null) || (!b.h(this.hSH).equals(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.e("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND not the same appId, or invalid response command, mAppId: %s, appId: %s, responseCommand: %s", new Object[] { b.h(this.hSH), paramString1, paramString2 });
      AppMethodBeat.o(137914);
    }
    while (true)
    {
      return;
      byte[] arrayOfByte = Base64.decode(paramString2, 2);
      ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND response from AppBrand, appId: %s, command in base64: %s, send to system: %s, hasCommandNotResponded: %b", new Object[] { paramString1, paramString2, c.ak(arrayOfByte), Boolean.valueOf(b.e(this.hSH)) });
      b.a(this.hSH, arrayOfByte, false, b.f(this.hSH));
      AppMethodBeat.o(137914);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.b.a
 * JD-Core Version:    0.6.2
 */