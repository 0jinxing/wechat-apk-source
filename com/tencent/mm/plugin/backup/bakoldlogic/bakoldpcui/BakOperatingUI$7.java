package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.f;
import com.tencent.mm.sdk.platformtools.ab;

final class BakOperatingUI$7
  implements DialogInterface.OnClickListener
{
  BakOperatingUI$7(BakOperatingUI paramBakOperatingUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17939);
    paramDialogInterface = a.aUB().aUC();
    if (paramDialogInterface.jzH == 1)
    {
      paramDialogInterface.jzD.resume();
      AppMethodBeat.o(17939);
    }
    while (true)
    {
      return;
      if (paramDialogInterface.jzH == 6)
      {
        paramDialogInterface.jzE.resume();
        AppMethodBeat.o(17939);
      }
      else
      {
        ab.e("MicroMsg.BakPcProcessMgr", "cancel in error state, %d", new Object[] { Integer.valueOf(paramDialogInterface.jzH) });
        AppMethodBeat.o(17939);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI.7
 * JD-Core Version:    0.6.2
 */