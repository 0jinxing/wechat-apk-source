package com.tencent.mm.plugin.luckymoney.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class LuckyMoneyPrepareUI$36
  implements View.OnClickListener
{
  LuckyMoneyPrepareUI$36(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI, EditText paramEditText, View paramView, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42986);
    if ((this.ohI.nTi.isShown()) && (!this.gnT))
    {
      if (this.ohI.mKeyboard == null)
        break label178;
      this.ohI.mKeyboard.setInputEditText(this.gnV);
      AppMethodBeat.o(42986);
    }
    while (true)
    {
      return;
      if ((!this.ohI.nTi.isShown()) && (!this.gnT))
      {
        ((InputMethodManager)this.ohI.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(paramView.getWindowToken(), 0);
        new ak().postDelayed(new LuckyMoneyPrepareUI.36.1(this), 200L);
        AppMethodBeat.o(42986);
      }
      else
      {
        if (this.gnT)
        {
          this.ohI.nTi.setVisibility(8);
          ((InputMethodManager)this.ohI.mController.ylL.getSystemService("input_method")).showSoftInput(this.gnV, 0);
        }
        label178: AppMethodBeat.o(42986);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.36
 * JD-Core Version:    0.6.2
 */