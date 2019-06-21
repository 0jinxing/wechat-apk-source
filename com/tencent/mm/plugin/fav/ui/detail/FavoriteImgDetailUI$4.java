package com.tencent.mm.plugin.fav.ui.detail;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class FavoriteImgDetailUI$4
  implements Runnable
{
  FavoriteImgDetailUI$4(FavoriteImgDetailUI paramFavoriteImgDetailUI, FavoriteImgDetailUI.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74384);
    Bitmap localBitmap1 = l.a(this.mms.cAv, FavoriteImgDetailUI.b(this.mmn), false);
    Bitmap localBitmap2 = localBitmap1;
    if (localBitmap1 == null)
    {
      ab.d("MicroMsg.FavoriteImgDetailUI", "get big img fail");
      localBitmap2 = FavoriteImgDetailUI.a(this.mmn, this.mms.cAv);
    }
    al.d(new FavoriteImgDetailUI.4.1(this, localBitmap2));
    AppMethodBeat.o(74384);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.4
 * JD-Core Version:    0.6.2
 */