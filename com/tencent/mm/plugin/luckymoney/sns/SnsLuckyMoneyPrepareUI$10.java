package com.tencent.mm.plugin.luckymoney.sns;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsLuckyMoneyPrepareUI$10
  implements View.OnFocusChangeListener
{
  SnsLuckyMoneyPrepareUI$10(SnsLuckyMoneyPrepareUI paramSnsLuckyMoneyPrepareUI, int paramInt, EditText paramEditText)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(42519);
    if ((paramView.isFocused()) && (!this.gnT))
    {
      ((InputMethodManager)this.obN.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(paramView.getWindowToken(), 0);
      new ak().postDelayed(new SnsLuckyMoneyPrepareUI.10.1(this, paramView), 300L);
      AppMethodBeat.o(42519);
    }
    while (true)
    {
      return;
      new ak().postDelayed(new SnsLuckyMoneyPrepareUI.10.2(this), 200L);
      AppMethodBeat.o(42519);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.10
 * JD-Core Version:    0.6.2
 */