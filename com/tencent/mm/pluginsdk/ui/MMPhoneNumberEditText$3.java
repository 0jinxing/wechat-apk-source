package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMPhoneNumberEditText$3
  implements View.OnFocusChangeListener
{
  MMPhoneNumberEditText$3(MMPhoneNumberEditText paramMMPhoneNumberEditText)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(27494);
    if (MMPhoneNumberEditText.e(this.vhV) != null)
      MMPhoneNumberEditText.e(this.vhV).onFocusChange(paramView, paramBoolean);
    MMPhoneNumberEditText.c(this.vhV);
    AppMethodBeat.o(27494);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText.3
 * JD-Core Version:    0.6.2
 */