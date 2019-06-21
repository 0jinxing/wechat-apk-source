package com.tencent.mm.plugin.game.ui;

import android.support.v4.view.ViewPager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.LinkedList;

final class GameBannerView$1
  implements ap.a
{
  GameBannerView$1(GameBannerView paramGameBannerView)
  {
  }

  public final boolean BI()
  {
    boolean bool = true;
    AppMethodBeat.i(111718);
    if ((GameBannerView.a(this.neI) != null) && (GameBannerView.b(this.neI).size() > 1))
    {
      GameBannerView.a(this.neI).setCurrentItem(GameBannerView.a(this.neI).getCurrentItem() + 1, true);
      AppMethodBeat.o(111718);
    }
    while (true)
    {
      return bool;
      GameBannerView.c(this.neI).stopTimer();
      bool = false;
      AppMethodBeat.o(111718);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameBannerView.1
 * JD-Core Version:    0.6.2
 */