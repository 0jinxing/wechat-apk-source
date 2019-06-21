package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$9
  implements DialogInterface.OnClickListener
{
  a$9(boolean paramBoolean, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46674);
    ab.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click cancel");
    paramDialogInterface.dismiss();
    if (this.tvZ)
      this.ghG.finish();
    AppMethodBeat.o(46674);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.util.a.9
 * JD-Core Version:    0.6.2
 */