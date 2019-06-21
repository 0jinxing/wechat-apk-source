package com.tencent.mm.plugin.fts.ui.widget;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSEditTextView$7
  implements View.OnFocusChangeListener
{
  FTSEditTextView$7(FTSEditTextView paramFTSEditTextView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(62111);
    if (FTSEditTextView.h(this.mLW) != null)
      FTSEditTextView.h(this.mLW).hz(paramBoolean);
    AppMethodBeat.o(62111);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.7
 * JD-Core Version:    0.6.2
 */