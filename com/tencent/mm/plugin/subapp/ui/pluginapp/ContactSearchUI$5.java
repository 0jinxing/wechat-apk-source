package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.a.f;

final class ContactSearchUI$5
  implements DialogInterface.OnCancelListener
{
  ContactSearchUI$5(ContactSearchUI paramContactSearchUI, f paramf)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(25529);
    aw.Rg().c(this.mIc);
    AppMethodBeat.o(25529);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI.5
 * JD-Core Version:    0.6.2
 */