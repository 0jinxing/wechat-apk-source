package com.tencent.mm.plugin.soter.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.a;

final class SoterTestUI$1
  implements View.OnClickListener
{
  SoterTestUI$1(SoterTestUI paramSoterTestUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(59379);
    TextView localTextView = SoterTestUI.a(this.rOJ);
    if (a.dRc());
    for (paramView = "passed"; ; paramView = "not support")
    {
      localTextView.setText(paramView);
      AppMethodBeat.o(59379);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.ui.SoterTestUI.1
 * JD-Core Version:    0.6.2
 */