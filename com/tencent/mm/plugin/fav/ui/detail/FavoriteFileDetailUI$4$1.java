package com.tencent.mm.plugin.fav.ui.detail;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class FavoriteFileDetailUI$4$1
  implements Runnable
{
  FavoriteFileDetailUI$4$1(FavoriteFileDetailUI.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74324);
    h.g(this.mlZ.mlX.mController.ylL, 2131304254, 2131304263);
    Bitmap localBitmap = l.a(FavoriteFileDetailUI.a(this.mlZ.mlX), FavoriteFileDetailUI.b(this.mlZ.mlX));
    ImageView localImageView = (ImageView)this.mlZ.mlX.findViewById(2131823993);
    if (localImageView != null)
    {
      localImageView.setImageBitmap(localBitmap);
      localImageView.setVisibility(0);
    }
    AppMethodBeat.o(74324);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.4.1
 * JD-Core Version:    0.6.2
 */