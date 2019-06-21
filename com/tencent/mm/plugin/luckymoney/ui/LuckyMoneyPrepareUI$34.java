package com.tencent.mm.plugin.luckymoney.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyPrepareUI$34
  implements View.OnFocusChangeListener
{
  boolean ohP = true;

  LuckyMoneyPrepareUI$34(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI, int paramInt, EditText paramEditText)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(42983);
    if ((paramView.isFocused()) && (!this.gnT))
    {
      ((InputMethodManager)this.ohI.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(paramView.getWindowToken(), 0);
      new ak().postDelayed(new LuckyMoneyPrepareUI.34.1(this, paramView), 300L);
      AppMethodBeat.o(42983);
    }
    while (true)
    {
      return;
      new ak().postDelayed(new LuckyMoneyPrepareUI.34.2(this), 200L);
      AppMethodBeat.o(42983);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.34
 * JD-Core Version:    0.6.2
 */