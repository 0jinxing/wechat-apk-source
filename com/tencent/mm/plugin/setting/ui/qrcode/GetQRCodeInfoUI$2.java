package com.tencent.mm.plugin.setting.ui.qrcode;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GetQRCodeInfoUI$2
  implements DialogInterface.OnCancelListener
{
  GetQRCodeInfoUI$2(GetQRCodeInfoUI paramGetQRCodeInfoUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(126903);
    this.qkv.finish();
    AppMethodBeat.o(126903);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI.2
 * JD-Core Version:    0.6.2
 */