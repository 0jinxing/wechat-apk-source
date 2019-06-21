package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.q;

final class NewTaskUI$2
  implements DialogInterface.OnCancelListener
{
  NewTaskUI$2(NewTaskUI paramNewTaskUI, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(34917);
    aw.Rg().c(this.zGG);
    AppMethodBeat.o(34917);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.NewTaskUI.2
 * JD-Core Version:    0.6.2
 */