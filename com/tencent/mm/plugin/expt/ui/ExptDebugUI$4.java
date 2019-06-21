package com.tencent.mm.plugin.expt.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.e.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.picker.b;
import java.util.ArrayList;

final class ExptDebugUI$4
  implements View.OnClickListener
{
  ExptDebugUI$4(ExptDebugUI paramExptDebugUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(73636);
    paramView = com.tencent.mm.plugin.expt.b.a.bqR();
    if (paramView.lNF != null)
      paramView = paramView.lNF.brx();
    while ((paramView != null) && (paramView.size() > 0))
    {
      String[] arrayOfString = new String[paramView.size()];
      int i = 0;
      while (true)
        if (i < arrayOfString.length)
        {
          arrayOfString[i] = paramView.get(i);
          i++;
          continue;
          paramView = null;
          break;
        }
      paramView = new b(this.lPd.mController.ylL, arrayOfString);
      paramView.Qq(0);
      paramView.zSq = new ExptDebugUI.4.1(this, paramView, arrayOfString);
      paramView.Qp(com.tencent.mm.bz.a.fromDPToPix(this.lPd.mController.ylL, 288));
      paramView.show();
    }
    AppMethodBeat.o(73636);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.ui.ExptDebugUI.4
 * JD-Core Version:    0.6.2
 */