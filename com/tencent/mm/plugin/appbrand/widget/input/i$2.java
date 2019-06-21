package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.pointers.PBool;
import java.lang.ref.WeakReference;

final class i$2
  implements Runnable
{
  i$2(i parami, PBool paramPBool)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123628);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, before run checkForInput");
    this.jeh.value = true;
    u localu;
    if (this.jeg.jdT == null)
    {
      localu = null;
      if ((localu != null) && (this.jeg.jdV != null))
        break label69;
      AppMethodBeat.o(123628);
    }
    while (true)
    {
      return;
      localu = (u)this.jeg.jdT.get();
      break;
      label69: if (o.x(localu) != this.jeg)
      {
        AppMethodBeat.o(123628);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, run checkForInput");
        h.aQx().c(localu.aJz());
        aj.cT(this.jeg.jdV);
        if ((this.jeg.jdW != null) && (this.jeg.jdW.b(null)))
          this.jeg.jdW.hide();
        this.jeg.jdV.a(this.jeg.jdO);
        this.jeg.jdV.setFocusable(true);
        this.jeg.jdV.setFocusableInTouchMode(true);
        this.jeg.jdW.jfW = this.jeg.jdV;
        this.jeg.jdV.requestFocus();
        aj.cT(this.jeg.jdV);
        if (this.jeg.jdW != null)
          this.jeg.jdW.show();
        AppMethodBeat.o(123628);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.i.2
 * JD-Core Version:    0.6.2
 */