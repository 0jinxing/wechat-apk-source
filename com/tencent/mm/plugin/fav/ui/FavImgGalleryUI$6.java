package com.tencent.mm.plugin.fav.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavImgGalleryUI$6
  implements DialogInterface.OnCancelListener
{
  FavImgGalleryUI$6(FavImgGalleryUI paramFavImgGalleryUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(74007);
    FavImgGalleryUI.c(this.miq);
    AppMethodBeat.o(74007);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavImgGalleryUI.6
 * JD-Core Version:    0.6.2
 */