package com.tencent.mm.plugin.subapp.ui.voicereminder;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.subapp.c.d;

final class RemindDialog$3
  implements DialogInterface.OnClickListener
{
  RemindDialog$3(RemindDialog paramRemindDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(25561);
    paramDialogInterface = d.cDD();
    if (paramDialogInterface != null)
      paramDialogInterface.ot(RemindDialog.c(this.svI));
    this.svI.finish();
    AppMethodBeat.o(25561);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog.3
 * JD-Core Version:    0.6.2
 */