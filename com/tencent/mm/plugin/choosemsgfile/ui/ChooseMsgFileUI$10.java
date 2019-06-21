package com.tencent.mm.plugin.choosemsgfile.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.choosemsgfile.b.d.a;
import com.tencent.mm.ui.widget.a.e.a;

final class ChooseMsgFileUI$10
  implements View.OnClickListener
{
  ChooseMsgFileUI$10(ChooseMsgFileUI paramChooseMsgFileUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(54454);
    if (ChooseMsgFileUI.a(this.kvQ).bfF())
    {
      paramView = new e.a(this.kvQ);
      paramView.asL(this.kvQ.getString(2131298276)).re(true);
      paramView.c(new ChooseMsgFileUI.10.1(this)).show();
      AppMethodBeat.o(54454);
    }
    while (true)
    {
      return;
      ChooseMsgFileUI.d(this.kvQ);
      AppMethodBeat.o(54454);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI.10
 * JD-Core Version:    0.6.2
 */