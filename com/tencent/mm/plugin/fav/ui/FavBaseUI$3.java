package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class FavBaseUI$3
  implements k.a
{
  long mhH = 0L;

  FavBaseUI$3(FavBaseUI paramFavBaseUI)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(73928);
    this.mhG.mcy.removeCallbacks(FavBaseUI.h(this.mhG));
    if (bo.az(this.mhH) > 200L)
    {
      this.mhH = bo.yz();
      this.mhG.mcy.post(FavBaseUI.h(this.mhG));
      AppMethodBeat.o(73928);
    }
    while (true)
    {
      return;
      this.mhG.mcy.postDelayed(FavBaseUI.h(this.mhG), 200L);
      AppMethodBeat.o(73928);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavBaseUI.3
 * JD-Core Version:    0.6.2
 */