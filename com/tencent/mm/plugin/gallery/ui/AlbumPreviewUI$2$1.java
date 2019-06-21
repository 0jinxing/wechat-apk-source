package com.tencent.mm.plugin.gallery.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.sdk.platformtools.ab;

final class AlbumPreviewUI$2$1
  implements DialogInterface.OnClickListener
{
  AlbumPreviewUI$2$1(AlbumPreviewUI.2 param2, GalleryItem.MediaItem paramMediaItem, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(21388);
    if (this.mPP == null)
    {
      ab.w("MicroMsg.AlbumPreviewUI", "get item for video error, null, position %d", new Object[] { Integer.valueOf(this.sN) });
      this.mPQ.mPO.setResult(0);
    }
    while (true)
    {
      this.mPQ.mPO.finish();
      AppMethodBeat.o(21388);
      return;
      ab.i("MicroMsg.AlbumPreviewUI", "ShowAlert");
      paramDialogInterface = new Intent();
      paramDialogInterface.setData(Uri.parse("file://" + Uri.encode(this.mPP.fPT)));
      this.mPQ.mPO.setResult(-1, paramDialogInterface);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.2.1
 * JD-Core Version:    0.6.2
 */