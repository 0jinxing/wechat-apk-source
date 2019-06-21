package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.a.c;
import com.tencent.mm.plugin.fav.ui.a.d;
import com.tencent.mm.plugin.fav.ui.widget.FavTagPanel;

final class FavTagEditUI$10 extends d
{
  FavTagEditUI$10(FavTagEditUI paramFavTagEditUI, Context paramContext)
  {
    super(paramContext);
  }

  public final void KI(String paramString)
  {
    AppMethodBeat.i(74152);
    FavTagEditUI.d(this.mjZ).cc(paramString, true);
    FavTagEditUI.f(this.mjZ).Me(paramString);
    FavTagEditUI.d(this.mjZ).dAb();
    FavTagEditUI.d(this.mjZ).dAd();
    FavTagEditUI.c(this.mjZ);
    AppMethodBeat.o(74152);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavTagEditUI.10
 * JD-Core Version:    0.6.2
 */