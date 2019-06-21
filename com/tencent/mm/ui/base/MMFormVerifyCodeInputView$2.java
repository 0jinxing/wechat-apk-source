package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMFormVerifyCodeInputView$2
  implements View.OnClickListener
{
  MMFormVerifyCodeInputView$2(MMFormVerifyCodeInputView paramMMFormVerifyCodeInputView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(106593);
    if (MMFormVerifyCodeInputView.e(this.yuy) != null)
      MMFormVerifyCodeInputView.e(this.yuy).onClick(paramView);
    AppMethodBeat.o(106593);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFormVerifyCodeInputView.2
 * JD-Core Version:    0.6.2
 */