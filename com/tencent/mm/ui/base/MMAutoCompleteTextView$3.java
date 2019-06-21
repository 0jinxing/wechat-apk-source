package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMAutoCompleteTextView$3
  implements View.OnFocusChangeListener
{
  MMAutoCompleteTextView$3(MMAutoCompleteTextView paramMMAutoCompleteTextView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(106474);
    MMAutoCompleteTextView.b(this.ytF);
    AppMethodBeat.o(106474);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoCompleteTextView.3
 * JD-Core Version:    0.6.2
 */