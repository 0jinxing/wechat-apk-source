package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.ui.MMWizardActivity;

final class BakToPcUI$2
  implements View.OnClickListener
{
  BakToPcUI$2(BakToPcUI paramBakToPcUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17968);
    if (BakToPcUI.b(this.jAK) == 0)
    {
      a.aUB().aUD().flQ = 1;
      a.aUB().aUC().rE(0);
      paramView = new Intent(this.jAK, BakWaitingUI.class);
      MMWizardActivity.J(this.jAK, paramView);
    }
    AppMethodBeat.o(17968);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI.2
 * JD-Core Version:    0.6.2
 */