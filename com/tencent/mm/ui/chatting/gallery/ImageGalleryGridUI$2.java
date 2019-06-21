package com.tencent.mm.ui.chatting.gallery;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.List;

final class ImageGalleryGridUI$2
  implements DialogInterface.OnClickListener
{
  ImageGalleryGridUI$2(ImageGalleryGridUI paramImageGalleryGridUI, List paramList)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(32035);
    c.f(this.yUT.mController.ylL, this.yUU);
    this.yUT.bwr();
    AppMethodBeat.o(32035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.2
 * JD-Core Version:    0.6.2
 */