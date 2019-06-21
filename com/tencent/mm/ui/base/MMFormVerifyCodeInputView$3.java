package com.tencent.mm.ui.base;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class MMFormVerifyCodeInputView$3
  implements ap.a
{
  MMFormVerifyCodeInputView$3(MMFormVerifyCodeInputView paramMMFormVerifyCodeInputView)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(106594);
    MMFormVerifyCodeInputView.f(this.yuy);
    MMFormVerifyCodeInputView.h(this.yuy).setText(this.yuy.getContext().getString(2131301471, new Object[] { Integer.valueOf(MMFormVerifyCodeInputView.g(this.yuy)) }));
    if (MMFormVerifyCodeInputView.g(this.yuy) == 0)
    {
      MMFormVerifyCodeInputView.i(this.yuy).stopTimer();
      MMFormVerifyCodeInputView.a(this.yuy, MMFormVerifyCodeInputView.j(this.yuy));
      MMFormVerifyCodeInputView.k(this.yuy).setVisibility(0);
      MMFormVerifyCodeInputView.h(this.yuy).setVisibility(8);
    }
    AppMethodBeat.o(106594);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFormVerifyCodeInputView.3
 * JD-Core Version:    0.6.2
 */