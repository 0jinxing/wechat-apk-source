package com.tencent.mm.plugin.fav.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.snackbar.b;

final class FavImgGalleryUI$10
  implements Runnable
{
  FavImgGalleryUI$10(FavImgGalleryUI paramFavImgGalleryUI, Dialog paramDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74011);
    this.mhZ.dismiss();
    b.i(this.miq, this.miq.getString(2131299583));
    AppMethodBeat.o(74011);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavImgGalleryUI.10
 * JD-Core Version:    0.6.2
 */