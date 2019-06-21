package com.tencent.mm.plugin.fts.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSEditTextView$4
  implements View.OnClickListener
{
  FTSEditTextView$4(FTSEditTextView paramFTSEditTextView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(62108);
    this.mLW.clearText();
    if (FTSEditTextView.h(this.mLW) != null)
      FTSEditTextView.h(this.mLW).onClickClearTextBtn(paramView);
    AppMethodBeat.o(62108);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.4
 * JD-Core Version:    0.6.2
 */