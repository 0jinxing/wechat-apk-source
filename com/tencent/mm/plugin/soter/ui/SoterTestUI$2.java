package com.tencent.mm.plugin.soter.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.a;
import com.tencent.soter.core.c.f;

final class SoterTestUI$2
  implements View.OnClickListener
{
  SoterTestUI$2(SoterTestUI paramSoterTestUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(59380);
    paramView = a.dQO();
    TextView localTextView = SoterTestUI.a(this.rOJ);
    if (paramView.isSuccess());
    for (paramView = "passed"; ; paramView = "not support")
    {
      localTextView.setText(paramView);
      AppMethodBeat.o(59380);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.ui.SoterTestUI.2
 * JD-Core Version:    0.6.2
 */