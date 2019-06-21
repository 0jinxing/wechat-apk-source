package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.MMGestureGallery;
import java.util.ArrayList;

final class FavImgGalleryUI$8
  implements Runnable
{
  FavImgGalleryUI$8(FavImgGalleryUI paramFavImgGalleryUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74009);
    if (this.mir != -1)
    {
      ab.d("MicroMsg.FavImgGalleryUI", "match selection %d", new Object[] { Integer.valueOf(this.mir) });
      FavImgGalleryUI.a(this.miq).setSelection(this.mir);
      FavImgGalleryUI.a(this.miq, this.mir);
      AppMethodBeat.o(74009);
    }
    while (true)
    {
      return;
      if ((FavImgGalleryUI.d(this.miq) - 1 >= 0) && (FavImgGalleryUI.d(this.miq) - 1 < FavImgGalleryUI.h(this.miq).size()))
      {
        ab.d("MicroMsg.FavImgGalleryUI", "adjust selection %d, list size %d", new Object[] { Integer.valueOf(FavImgGalleryUI.d(this.miq) - 1), Integer.valueOf(FavImgGalleryUI.h(this.miq).size()) });
        FavImgGalleryUI.a(this.miq).setSelection(FavImgGalleryUI.d(this.miq) - 1);
        FavImgGalleryUI.a(this.miq, FavImgGalleryUI.d(this.miq) - 1);
        AppMethodBeat.o(74009);
      }
      else if (FavImgGalleryUI.h(this.miq).size() > 0)
      {
        ab.d("MicroMsg.FavImgGalleryUI", "adjust selection fail, set selection 0, list size %d", new Object[] { Integer.valueOf(FavImgGalleryUI.h(this.miq).size()) });
        FavImgGalleryUI.a(this.miq).setSelection(0);
        FavImgGalleryUI.a(this.miq, 0);
        AppMethodBeat.o(74009);
      }
      else
      {
        ab.w("MicroMsg.FavImgGalleryUI", "data list size %d, empty, finish", new Object[] { Integer.valueOf(FavImgGalleryUI.h(this.miq).size()) });
        this.miq.finish();
        AppMethodBeat.o(74009);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavImgGalleryUI.8
 * JD-Core Version:    0.6.2
 */