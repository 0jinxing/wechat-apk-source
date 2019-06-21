package com.tencent.mm.plugin.soter.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.a;
import com.tencent.soter.core.c.f;

final class SoterTestUI$6
  implements View.OnClickListener
{
  SoterTestUI$6(SoterTestUI paramSoterTestUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(59384);
    paramView = a.cn("sample_auth_key_name", false);
    TextView localTextView = SoterTestUI.a(this.rOJ);
    if (paramView.isSuccess());
    for (paramView = "pass"; ; paramView = "not passed")
    {
      localTextView.setText(paramView);
      AppMethodBeat.o(59384);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.ui.SoterTestUI.6
 * JD-Core Version:    0.6.2
 */