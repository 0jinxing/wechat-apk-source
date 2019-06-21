package com.tencent.mm.plugin.masssend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MassSendMsgUI$8$1
  implements DialogInterface.OnClickListener
{
  MassSendMsgUI$8$1(MassSendMsgUI.8 param8, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22832);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("CropImage_OutputPath", this.hWl);
    MassSendMsgUI.a(this.opk.opf, paramDialogInterface);
    AppMethodBeat.o(22832);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.8.1
 * JD-Core Version:    0.6.2
 */