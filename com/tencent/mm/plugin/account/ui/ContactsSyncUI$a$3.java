package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.z;

final class ContactsSyncUI$a$3
  implements DialogInterface.OnClickListener
{
  ContactsSyncUI$a$3(ContactsSyncUI.a parama, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(124746);
    g.RP().Ry().set(12322, Boolean.FALSE);
    this.gAC.gAz.getSharedPreferences(ah.doA(), 0).edit().putBoolean("upload_contacts_already_displayed", true).commit();
    if ((this.val$context instanceof Activity))
      ((Activity)this.val$context).finish();
    AppMethodBeat.o(124746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ContactsSyncUI.a.3
 * JD-Core Version:    0.6.2
 */