package com.tencent.mm.plugin.subapp.ui.voicereminder;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.subapp.b;
import com.tencent.mm.plugin.subapp.c.d;
import com.tencent.mm.pluginsdk.n;

final class RemindDialog$2
  implements DialogInterface.OnClickListener
{
  RemindDialog$2(RemindDialog paramRemindDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(25560);
    paramDialogInterface = d.cDD();
    if (paramDialogInterface != null)
      paramDialogInterface.ot(RemindDialog.c(this.svI));
    if (t.nw(aw.getNotification().IG()))
    {
      this.svI.finish();
      AppMethodBeat.o(25560);
    }
    while (true)
    {
      return;
      b.gkE.d(new Intent().putExtra("Chat_User", RemindDialog.c(this.svI)), this.svI);
      this.svI.finish();
      AppMethodBeat.o(25560);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog.2
 * JD-Core Version:    0.6.2
 */