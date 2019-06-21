package com.tencent.mm.plugin.luckymoney.sns;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class SnsLuckyMoneyPrepareUI$20
  implements View.OnClickListener
{
  SnsLuckyMoneyPrepareUI$20(SnsLuckyMoneyPrepareUI paramSnsLuckyMoneyPrepareUI, EditText paramEditText1, EditText paramEditText2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42530);
    this.gnV.setOnClickListener(null);
    this.nTp.setOnClickListener(null);
    this.obN.V(this.obN.obC, 2);
    this.obN.V(this.obN.nTd, 0);
    this.obN.mKeyboard.setXMode(2);
    SnsLuckyMoneyPrepareUI.k(this.obN);
    AppMethodBeat.o(42530);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.20
 * JD-Core Version:    0.6.2
 */