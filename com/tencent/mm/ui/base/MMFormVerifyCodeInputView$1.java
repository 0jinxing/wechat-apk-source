package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMFormVerifyCodeInputView$1
  implements View.OnFocusChangeListener
{
  MMFormVerifyCodeInputView$1(MMFormVerifyCodeInputView paramMMFormVerifyCodeInputView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(106592);
    if (paramView == MMFormVerifyCodeInputView.a(this.yuy))
    {
      MMFormVerifyCodeInputView.b(this.yuy);
      if (!paramBoolean)
        break label73;
      this.yuy.setBackgroundResource(2130839104);
    }
    while (true)
    {
      MMFormVerifyCodeInputView.c(this.yuy);
      if (MMFormVerifyCodeInputView.d(this.yuy) != null)
        MMFormVerifyCodeInputView.d(this.yuy).onFocusChange(paramView, paramBoolean);
      AppMethodBeat.o(106592);
      return;
      label73: this.yuy.setBackgroundResource(2130839105);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFormVerifyCodeInputView.1
 * JD-Core Version:    0.6.2
 */