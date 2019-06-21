package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NewTaskUI$4
  implements DialogInterface.OnCancelListener
{
  NewTaskUI$4(NewTaskUI paramNewTaskUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(34920);
    if (NewTaskUI.zGD != null)
    {
      NewTaskUI.zGD = null;
      this.zGF.finish();
    }
    AppMethodBeat.o(34920);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.NewTaskUI.4
 * JD-Core Version:    0.6.2
 */