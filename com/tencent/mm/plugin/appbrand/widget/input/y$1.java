package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.Editable;
import android.text.Editable.Factory;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class y$1 extends Editable.Factory
{
  y$1(y paramy)
  {
  }

  public final Editable newEditable(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(123816);
    paramCharSequence = super.newEditable(paramCharSequence);
    paramCharSequence = this.jgs.c(paramCharSequence);
    AppMethodBeat.o(123816);
    return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.y.1
 * JD-Core Version:    0.6.2
 */