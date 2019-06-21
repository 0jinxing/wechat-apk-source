package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.c;

final class FavImgGalleryUI$3
  implements MMGestureGallery.c
{
  FavImgGalleryUI$3(FavImgGalleryUI paramFavImgGalleryUI)
  {
  }

  public final void bvE()
  {
    AppMethodBeat.i(74004);
    if ((!this.miq.isFinishing()) && (!this.miq.uiu))
    {
      v.b localb = v.Zp().y("basescanui@datacenter", true);
      localb.j("key_basescanui_screen_x", Integer.valueOf(FavImgGalleryUI.a(this.miq).getXDown()));
      localb.j("key_basescanui_screen_y", Integer.valueOf(FavImgGalleryUI.a(this.miq).getYDown()));
      FavImgGalleryUI.b(this.miq);
    }
    AppMethodBeat.o(74004);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavImgGalleryUI.3
 * JD-Core Version:    0.6.2
 */