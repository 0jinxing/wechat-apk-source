package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMFormMobileInputView$1
  implements View.OnFocusChangeListener
{
  MMFormMobileInputView$1(MMFormMobileInputView paramMMFormMobileInputView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(106570);
    if ((paramView == MMFormMobileInputView.a(this.yus)) || (paramView == MMFormMobileInputView.b(this.yus)))
      this.yus.qb(paramBoolean);
    AppMethodBeat.o(106570);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFormMobileInputView.1
 * JD-Core Version:    0.6.2
 */