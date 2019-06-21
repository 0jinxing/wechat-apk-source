package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.c.a;
import com.tencent.mm.plugin.appbrand.widget.input.c.b;
import com.tencent.mm.sdk.platformtools.ab;

final class i$14
  implements b
{
  i$14(i parami)
  {
  }

  public final void aAL()
  {
    AppMethodBeat.i(123639);
    if (this.jeg.jdV == null)
      AppMethodBeat.o(123639);
    while (true)
    {
      return;
      ab.d("MicroMsg.AppBrandInputInvokeHandler", "[bindInput] onComposingDismissed %s", new Object[] { this.jeg.jdV.getEditableText() });
      this.jeg.jdZ.a(this.jeg.jdV.getEditableText(), false);
      AppMethodBeat.o(123639);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.i.14
 * JD-Core Version:    0.6.2
 */