package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$b
  implements com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.b
{
  private b$b(b paramb)
  {
  }

  public final void onCreate()
  {
    AppMethodBeat.i(137915);
    ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCELifeCycle AppBrandUI onCreate");
    AppMethodBeat.o(137915);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(137918);
    ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCELifeCycle AppBrandUI onDestroy");
    AppMethodBeat.o(137918);
  }

  public final void onPause()
  {
    AppMethodBeat.i(137917);
    ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCELifeCycle AppBrandUI onPause");
    this.hSH.aEx();
    b.b(this.hSH, true);
    AppMethodBeat.o(137917);
  }

  public final void onResume()
  {
    AppMethodBeat.i(137916);
    ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCELifeCycle AppBrandUI onResume");
    if (b.i(this.hSH))
    {
      this.hSH.aEw();
      b.b(this.hSH, false);
    }
    AppMethodBeat.o(137916);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.b.b
 * JD-Core Version:    0.6.2
 */