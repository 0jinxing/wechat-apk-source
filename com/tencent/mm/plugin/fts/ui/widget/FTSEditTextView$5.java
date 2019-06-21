package com.tencent.mm.plugin.fts.ui.widget;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSEditTextView$5
  implements Runnable
{
  FTSEditTextView$5(FTSEditTextView paramFTSEditTextView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62109);
    ((InputMethodManager)this.mLW.getContext().getSystemService("input_method")).showSoftInput(FTSEditTextView.a(this.mLW), 0);
    AppMethodBeat.o(62109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.5
 * JD-Core Version:    0.6.2
 */