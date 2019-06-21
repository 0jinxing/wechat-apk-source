package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class i$7
  implements w.e
{
  i$7(i parami)
  {
  }

  public final void nS(int paramInt)
  {
    AppMethodBeat.i(123633);
    ab.d("MicroMsg.AppBrandInputInvokeHandler", "[appInput], onSmileyPanelVisibilityChanged = %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt != 2)
    {
      if ((paramInt == 0) && (this.jeg.jdV != null))
        this.jeg.jdV.requestFocus();
      i.g(this.jeg);
      if ((this.jeg.jdT == null) || (this.jeg.jdT.get() == null))
        break label137;
      o.a((u)this.jeg.jdT.get(), this.jeg.jdV);
      AppMethodBeat.o(123633);
    }
    while (true)
    {
      return;
      this.jeg.jdR = i.d.jek;
      i.f(this.jeg);
      this.jeg.jdR = null;
      label137: AppMethodBeat.o(123633);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.i.7
 * JD-Core Version:    0.6.2
 */