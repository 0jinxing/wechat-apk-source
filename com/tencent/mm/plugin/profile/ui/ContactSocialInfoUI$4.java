package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class ContactSocialInfoUI$4
  implements DialogInterface.OnClickListener
{
  ContactSocialInfoUI$4(ContactSocialInfoUI paramContactSocialInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23443);
    ContactSocialInfoUI.d(this.pmv);
    aw.ZK();
    c.Ry().set(ac.a.xMw, Integer.valueOf(1));
    AppMethodBeat.o(23443);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI.4
 * JD-Core Version:    0.6.2
 */