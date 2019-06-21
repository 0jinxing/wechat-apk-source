package com.tencent.mm.plugin.fts.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class FTSEditTextView$6
  implements View.OnClickListener
{
  FTSEditTextView$6(FTSEditTextView paramFTSEditTextView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(62110);
    int i = -1;
    if (paramView.getId() == 2131824220)
      i = 0;
    while (true)
    {
      if ((FTSEditTextView.h(this.mLW) != null) && (i >= 0))
      {
        paramView = FTSEditTextView.h(this.mLW);
        FTSEditTextView.b(this.mLW).get(i);
        paramView.bAR();
      }
      AppMethodBeat.o(62110);
      return;
      if (paramView.getId() == 2131824221)
        i = 1;
      else if (paramView.getId() == 2131824222)
        i = 2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.6
 * JD-Core Version:    0.6.2
 */