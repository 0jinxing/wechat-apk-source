package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class HoneyPayGiveCardUI$6
  implements View.OnFocusChangeListener
{
  HoneyPayGiveCardUI$6(HoneyPayGiveCardUI paramHoneyPayGiveCardUI)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(41864);
    if (!paramBoolean)
    {
      HoneyPayGiveCardUI.a(this.nst, HoneyPayGiveCardUI.e(this.nst).getText().toString());
      HoneyPayGiveCardUI.f(this.nst);
    }
    AppMethodBeat.o(41864);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI.6
 * JD-Core Version:    0.6.2
 */