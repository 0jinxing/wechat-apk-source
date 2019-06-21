package com.tencent.mm.plugin.choosemsgfile.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.choosemsgfile.b.d.a;
import com.tencent.mm.ui.widget.a.e.a;

final class ChooseMsgFileListUI$3
  implements View.OnClickListener
{
  ChooseMsgFileListUI$3(ChooseMsgFileListUI paramChooseMsgFileListUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(54414);
    if (ChooseMsgFileListUI.a(this.kvB).bfF())
    {
      paramView = new e.a(this.kvB);
      paramView.asL(this.kvB.getString(2131298276)).re(true);
      paramView.c(new ChooseMsgFileListUI.3.1(this)).show();
      AppMethodBeat.o(54414);
    }
    while (true)
    {
      return;
      ChooseMsgFileListUI.b(this.kvB);
      AppMethodBeat.o(54414);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI.3
 * JD-Core Version:    0.6.2
 */