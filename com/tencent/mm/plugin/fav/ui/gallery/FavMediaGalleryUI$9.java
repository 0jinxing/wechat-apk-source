package com.tencent.mm.plugin.fav.ui.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.MMGestureGallery;
import java.util.ArrayList;

final class FavMediaGalleryUI$9
  implements Runnable
{
  FavMediaGalleryUI$9(FavMediaGalleryUI paramFavMediaGalleryUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74516);
    if (this.mir != -1)
    {
      ab.d("MicroMsg.FavMediaGalleryUI", "match selection %d", new Object[] { Integer.valueOf(this.mir) });
      FavMediaGalleryUI.g(this.mnH).setSelection(this.mir);
      FavMediaGalleryUI.a(this.mnH, this.mir);
      AppMethodBeat.o(74516);
    }
    while (true)
    {
      return;
      if ((FavMediaGalleryUI.c(this.mnH) - 1 >= 0) && (FavMediaGalleryUI.c(this.mnH) - 1 < FavMediaGalleryUI.h(this.mnH).size()))
      {
        ab.d("MicroMsg.FavMediaGalleryUI", "adjust selection %d, list size %d", new Object[] { Integer.valueOf(FavMediaGalleryUI.c(this.mnH) - 1), Integer.valueOf(FavMediaGalleryUI.h(this.mnH).size()) });
        FavMediaGalleryUI.g(this.mnH).setSelection(FavMediaGalleryUI.c(this.mnH) - 1);
        FavMediaGalleryUI.a(this.mnH, FavMediaGalleryUI.c(this.mnH) - 1);
        AppMethodBeat.o(74516);
      }
      else if (FavMediaGalleryUI.h(this.mnH).size() > 0)
      {
        ab.d("MicroMsg.FavMediaGalleryUI", "adjust selection fail, set selection 0, list size %d", new Object[] { Integer.valueOf(FavMediaGalleryUI.h(this.mnH).size()) });
        FavMediaGalleryUI.g(this.mnH).setSelection(0);
        FavMediaGalleryUI.a(this.mnH, 0);
        AppMethodBeat.o(74516);
      }
      else
      {
        ab.w("MicroMsg.FavMediaGalleryUI", "data list size %d, empty, finish", new Object[] { Integer.valueOf(FavMediaGalleryUI.h(this.mnH).size()) });
        this.mnH.finish();
        AppMethodBeat.o(74516);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI.9
 * JD-Core Version:    0.6.2
 */