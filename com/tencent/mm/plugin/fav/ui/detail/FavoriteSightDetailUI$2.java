package com.tencent.mm.plugin.fav.ui.detail;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.vfs.e;

final class FavoriteSightDetailUI$2
  implements e.a
{
  FavoriteSightDetailUI$2(FavoriteSightDetailUI paramFavoriteSightDetailUI)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(74413);
    FavoriteSightDetailUI.d(this.mmH).B(0.0D);
    AppMethodBeat.o(74413);
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(74412);
    ab.e("MicroMsg.FavoriteSightDetailUI", "VideoPlay: on play video error what %d extra %d.", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == -1)
    {
      FavoriteSightDetailUI.d(this.mmH).stop();
      if (e.ct(b.b(FavoriteSightDetailUI.b(this.mmH))))
      {
        FavoriteSightDetailUI.f(this.mmH);
        AppMethodBeat.o(74412);
      }
    }
    while (true)
    {
      return;
      if (e.ct(b.c(FavoriteSightDetailUI.b(this.mmH))))
        FavoriteSightDetailUI.e(this.mmH).setVisibility(0);
      AppMethodBeat.o(74412);
      continue;
      if (FavoriteSightDetailUI.g(this.mmH))
      {
        EA();
        AppMethodBeat.o(74412);
      }
      else
      {
        FavoriteSightDetailUI.d(this.mmH).stop();
        if (FavoriteSightDetailUI.h(this.mmH))
        {
          AppMethodBeat.o(74412);
        }
        else
        {
          FavoriteSightDetailUI.i(this.mmH);
          al.d(new FavoriteSightDetailUI.2.2(this));
          AppMethodBeat.o(74412);
        }
      }
    }
  }

  public final void pL()
  {
    AppMethodBeat.i(74411);
    ab.i("MicroMsg.FavoriteSightDetailUI", " onPrepared");
    FavoriteSightDetailUI.d(this.mmH).setLoop(true);
    FavoriteSightDetailUI.b(this.mmH, FavoriteSightDetailUI.d(this.mmH).start());
    al.d(new FavoriteSightDetailUI.2.1(this));
    AppMethodBeat.o(74411);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI.2
 * JD-Core Version:    0.6.2
 */