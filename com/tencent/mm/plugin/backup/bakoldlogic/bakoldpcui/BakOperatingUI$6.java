package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.c;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.f;

final class BakOperatingUI$6
  implements DialogInterface.OnClickListener
{
  BakOperatingUI$6(BakOperatingUI paramBakOperatingUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17938);
    paramDialogInterface = a.aUB().aUC();
    paramDialogInterface.jzD.cancel();
    paramDialogInterface.jzE.cancel();
    if ((paramDialogInterface.jzH == 1) || (paramDialogInterface.jzL == 2))
      e.rF(4);
    while (true)
    {
      a.aUB().aUC().jzK = -1;
      paramDialogInterface = a.aUB().aUD();
      paramDialogInterface.jzp += 1;
      BakOperatingUI.b(this.jAF);
      BakOperatingUI.g(this.jAF);
      AppMethodBeat.o(17938);
      return;
      if ((paramDialogInterface.jzH == 6) || (paramDialogInterface.jzL == 4) || (paramDialogInterface.jzL == 6))
        e.rF(7);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI.6
 * JD-Core Version:    0.6.2
 */