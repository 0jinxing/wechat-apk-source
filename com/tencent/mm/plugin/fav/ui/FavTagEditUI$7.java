package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.a.c;
import com.tencent.mm.plugin.fav.ui.widget.FavTagPanel;

final class FavTagEditUI$7 extends c
{
  FavTagEditUI$7(FavTagEditUI paramFavTagEditUI, Context paramContext)
  {
    super(paramContext);
  }

  public final void Ma(String paramString)
  {
    AppMethodBeat.i(74147);
    FavTagEditUI.d(this.mjZ).cc(paramString, true);
    if (FavTagEditUI.g(this.mjZ) != null)
      FavTagEditUI.g(this.mjZ).cd(paramString, true);
    FavTagEditUI.c(this.mjZ);
    AppMethodBeat.o(74147);
  }

  public final void Mb(String paramString)
  {
    AppMethodBeat.i(74148);
    FavTagEditUI.d(this.mjZ).removeTag(paramString);
    if (FavTagEditUI.g(this.mjZ) != null)
      FavTagEditUI.g(this.mjZ).cd(paramString, false);
    FavTagEditUI.c(this.mjZ);
    AppMethodBeat.o(74148);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavTagEditUI.7
 * JD-Core Version:    0.6.2
 */