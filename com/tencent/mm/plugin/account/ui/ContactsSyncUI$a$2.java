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

final class ContactsSyncUI$a$2
  implements DialogInterface.OnClickListener
{
  ContactsSyncUI$a$2(ContactsSyncUI.a parama, Context paramContext, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(124745);
    g.RP().Ry().set(12322, Boolean.TRUE);
    this.gAC.gAz.getSharedPreferences(ah.doA(), 0).edit().putBoolean("upload_contacts_already_displayed", true).commit();
    this.gAC.P(this.val$context, this.gAD);
    if ((this.val$context instanceof Activity))
      ((Activity)this.val$context).finish();
    AppMethodBeat.o(124745);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ContactsSyncUI.a.2
 * JD-Core Version:    0.6.2
 */