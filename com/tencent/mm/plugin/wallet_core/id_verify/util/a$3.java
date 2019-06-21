package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$3
  implements DialogInterface.OnClickListener
{
  a$3(Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46668);
    ab.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click cancel");
    paramDialogInterface.dismiss();
    if (this.tvZ)
      this.ghG.finish();
    AppMethodBeat.o(46668);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.util.a.3
 * JD-Core Version:    0.6.2
 */