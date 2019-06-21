package com.tencent.mm.plugin.honey_pay.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class HoneyPayGiveCardUI$5
  implements TextView.OnEditorActionListener
{
  HoneyPayGiveCardUI$5(HoneyPayGiveCardUI paramHoneyPayGiveCardUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(41863);
    if ((paramInt == 6) || (paramInt == 5))
    {
      HoneyPayGiveCardUI.a(this.nst, HoneyPayGiveCardUI.e(this.nst).getText().toString());
      this.nst.aqX();
      HoneyPayGiveCardUI.f(this.nst);
    }
    AppMethodBeat.o(41863);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI.5
 * JD-Core Version:    0.6.2
 */