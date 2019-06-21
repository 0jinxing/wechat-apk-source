package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.a.c;
import com.tencent.mm.plugin.fav.ui.widget.FavTagPanel;
import com.tencent.mm.ui.base.MMTagPanel.a;

final class FavTagEditUI$8
  implements MMTagPanel.a
{
  FavTagEditUI$8(FavTagEditUI paramFavTagEditUI)
  {
  }

  public final void JR(String paramString)
  {
    AppMethodBeat.i(74149);
    FavTagEditUI.d(this.mjZ).removeTag(paramString);
    FavTagEditUI.f(this.mjZ).Mf(paramString);
    FavTagEditUI.c(this.mjZ);
    AppMethodBeat.o(74149);
  }

  public final void JS(String paramString)
  {
    AppMethodBeat.i(74150);
    FavTagEditUI.d(this.mjZ).cc(paramString, true);
    FavTagEditUI.f(this.mjZ).Me(paramString);
    FavTagEditUI.c(this.mjZ);
    AppMethodBeat.o(74150);
  }

  public final void JT(String paramString)
  {
  }

  public final void JU(String paramString)
  {
  }

  public final void JV(String paramString)
  {
  }

  public final void bmm()
  {
  }

  public final void q(boolean paramBoolean, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavTagEditUI.8
 * JD-Core Version:    0.6.2
 */