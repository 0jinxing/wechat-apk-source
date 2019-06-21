package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.Editable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.g;
import java.lang.ref.WeakReference;

final class i$13 extends g
{
  i$13(i parami)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(123638);
    if ((this.jeg.jdT == null) || (this.jeg.jdT.get() == null) || (this.jeg.jdV == null))
      AppMethodBeat.o(123638);
    while (true)
    {
      return;
      i.c(this.jeg);
      if (aj.D(paramEditable))
      {
        ab.d("MicroMsg.AppBrandInputInvokeHandler", "[bindInput] text composing %s", new Object[] { paramEditable });
        AppMethodBeat.o(123638);
      }
      else
      {
        ab.d("MicroMsg.AppBrandInputInvokeHandler", "[bindInput] not composing text %s", new Object[] { paramEditable });
        paramEditable = this.jeg.jdV.getEditableText();
        this.jeg.jdZ.a(paramEditable, this.jeg.jea);
        AppMethodBeat.o(123638);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.i.13
 * JD-Core Version:    0.6.2
 */