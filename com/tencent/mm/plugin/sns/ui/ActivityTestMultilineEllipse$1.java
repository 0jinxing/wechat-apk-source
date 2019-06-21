package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ActivityTestMultilineEllipse$1
  implements View.OnClickListener
{
  ActivityTestMultilineEllipse$1(ActivityTestMultilineEllipse paramActivityTestMultilineEllipse, QTextView paramQTextView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38044);
    if (this.rfL.getIsExpanded())
    {
      paramView = this.rfL;
      paramView.rms = false;
      paramView.requestLayout();
      paramView.invalidate();
      AppMethodBeat.o(38044);
    }
    while (true)
    {
      return;
      paramView = this.rfL;
      paramView.rms = true;
      paramView.requestLayout();
      paramView.invalidate();
      AppMethodBeat.o(38044);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse.1
 * JD-Core Version:    0.6.2
 */