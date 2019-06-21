package com.tencent.mm.plugin.fts.ui.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSEditTextView$3
  implements TextView.OnEditorActionListener
{
  FTSEditTextView$3(FTSEditTextView paramFTSEditTextView)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(62107);
    boolean bool;
    if ((3 == paramInt) && (FTSEditTextView.h(this.mLW) != null))
    {
      bool = FTSEditTextView.h(this.mLW).aMo();
      AppMethodBeat.o(62107);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62107);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.3
 * JD-Core Version:    0.6.2
 */