package com.tencent.mm.ui.chatting.gallery;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.i;
import java.util.Set;

final class ImageGalleryGridUI$9
  implements DialogInterface.OnClickListener
{
  ImageGalleryGridUI$9(ImageGalleryGridUI paramImageGalleryGridUI, Set paramSet)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(32047);
    ab.i("MicroMsg.GalleryGridUI", "delete message");
    i.a(this.yUT, this.yUY, this.yUT);
    this.yUT.bwr();
    AppMethodBeat.o(32047);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.9
 * JD-Core Version:    0.6.2
 */