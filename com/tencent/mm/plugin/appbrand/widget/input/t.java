package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class t extends r
{
  public t(Context paramContext)
  {
    super(paramContext);
  }

  public final void aQR()
  {
    AppMethodBeat.i(123740);
    try
    {
      aj.cS(this).restartInput(this);
      AppMethodBeat.o(123740);
      return;
    }
    catch (RuntimeException localRuntimeException1)
    {
      while (true)
      {
        ab.e("Luggage.Wxa.AppBrandInputWidgetSingleLineWithSoftKeyboard", "ensureInputConnection restartInput re=%s", new Object[] { localRuntimeException1 });
        try
        {
          aj.cS(this).showSoftInput(this, 0);
          AppMethodBeat.o(123740);
        }
        catch (RuntimeException localRuntimeException2)
        {
          ab.e("Luggage.Wxa.AppBrandInputWidgetSingleLineWithSoftKeyboard", "ensureInputConnection showSoftInput re=%s", new Object[] { localRuntimeException2 });
          AppMethodBeat.o(123740);
        }
      }
    }
  }

  public final View getInputPanel()
  {
    AppMethodBeat.i(123738);
    w localw = w.cN(this);
    AppMethodBeat.o(123738);
    return localw;
  }

  public final void setPasswordMode(boolean paramBoolean)
  {
    AppMethodBeat.i(123739);
    aRm();
    int i = getInputType() | 0x1;
    if (paramBoolean)
      i |= 128;
    while (true)
    {
      setInputType(i);
      super.setPasswordMode(paramBoolean);
      aRn();
      AppMethodBeat.o(123739);
      return;
      i &= -129;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.t
 * JD-Core Version:    0.6.2
 */