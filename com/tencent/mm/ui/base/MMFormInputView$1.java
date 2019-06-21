package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMFormInputView$1
  implements View.OnFocusChangeListener
{
  MMFormInputView$1(MMFormInputView paramMMFormInputView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(106556);
    if (paramView == MMFormInputView.a(this.yul))
    {
      MMFormInputView.b(this.yul);
      if (!paramBoolean)
        break label73;
      this.yul.setBackgroundResource(2130839104);
    }
    while (true)
    {
      MMFormInputView.c(this.yul);
      if (MMFormInputView.d(this.yul) != null)
        MMFormInputView.d(this.yul).onFocusChange(paramView, paramBoolean);
      AppMethodBeat.o(106556);
      return;
      label73: this.yul.setBackgroundResource(2130839105);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFormInputView.1
 * JD-Core Version:    0.6.2
 */