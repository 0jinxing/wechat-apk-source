package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class a$4
  implements DialogInterface.OnClickListener
{
  a$4(Bundle paramBundle, int paramInt, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46669);
    ab.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click OK");
    ab.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog click OK");
    Bundle localBundle = this.hXc;
    if (this.hXc == null)
      localBundle = new Bundle();
    localBundle.putInt("real_name_verify_mode", 0);
    localBundle.putInt("entry_scene", this.tvW);
    localBundle.putBoolean("key_from_set_pwd", true);
    com.tencent.mm.wallet_core.a.a(this.ghG, com.tencent.mm.plugin.wallet_core.id_verify.a.class, localBundle);
    e.a(19, bo.anT(), this.tvW);
    paramDialogInterface.dismiss();
    if (this.tvZ)
      this.ghG.finish();
    AppMethodBeat.o(46669);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.util.a.4
 * JD-Core Version:    0.6.2
 */