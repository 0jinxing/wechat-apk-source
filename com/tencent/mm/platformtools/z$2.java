package com.tencent.mm.platformtools;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ah;

final class z$2
  implements DialogInterface.OnClickListener
{
  z$2(Runnable paramRunnable, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(124583);
    g.RP().Ry().set(12322, Boolean.FALSE);
    z.syncUploadMContactStatus(false, false);
    if (this.ghH != null)
      this.ghH.run();
    this.ghG.getSharedPreferences(ah.doA(), 0).edit().putBoolean("login_upload_contacts_already_displayed", true).commit();
    AppMethodBeat.o(124583);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.z.2
 * JD-Core Version:    0.6.2
 */