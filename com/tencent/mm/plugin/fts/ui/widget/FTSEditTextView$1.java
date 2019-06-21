package com.tencent.mm.plugin.fts.ui.widget;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class FTSEditTextView$1
  implements View.OnKeyListener
{
  FTSEditTextView$1(FTSEditTextView paramFTSEditTextView)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(62105);
    if ((paramKeyEvent.getAction() == 0) && (67 == paramInt))
    {
      int i = FTSEditTextView.a(this.mLW).getSelectionStart();
      paramInt = FTSEditTextView.a(this.mLW).getSelectionEnd();
      if ((i == 0) && (paramInt == 0) && (FTSEditTextView.b(this.mLW).size() > 0) && (FTSEditTextView.c(this.mLW)))
      {
        FTSEditTextView.b(this.mLW).remove(FTSEditTextView.b(this.mLW).size() - 1);
        FTSEditTextView.d(this.mLW);
        FTSEditTextView.e(this.mLW);
      }
    }
    AppMethodBeat.o(62105);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.1
 * JD-Core Version:    0.6.2
 */