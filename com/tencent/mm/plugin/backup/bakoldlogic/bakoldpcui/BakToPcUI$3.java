package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.c;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;

final class BakToPcUI$3
  implements View.OnClickListener
{
  BakToPcUI$3(BakToPcUI paramBakToPcUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17969);
    if (BakToPcUI.b(this.jAK) == 0)
    {
      a.aUB().aUD().flQ = 2;
      a.aUB().aUD().aar();
      a.aUB().aUC().rE(1);
      BakToPcUI.c(this.jAK);
    }
    AppMethodBeat.o(17969);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI.3
 * JD-Core Version:    0.6.2
 */