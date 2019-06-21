package com.tencent.mm.plugin.downloader.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.sdk.platformtools.ab;

final class FileDownloadConfirmUI$1
  implements DialogInterface.OnClickListener
{
  FileDownloadConfirmUI$1(FileDownloadConfirmUI paramFileDownloadConfirmUI, long paramLong)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(2516);
    d.bij().hl(this.kMG);
    ab.i("MicroMsg.FileDownloadConfirmUI", "Remove task: %d", new Object[] { Long.valueOf(this.kMG) });
    AppMethodBeat.o(2516);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI.1
 * JD-Core Version:    0.6.2
 */