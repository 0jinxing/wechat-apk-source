package com.tencent.mm.plugin.fav.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class FavSearchActionView$1
  implements FavTagPanel.a
{
  FavSearchActionView$1(FavSearchActionView paramFavSearchActionView)
  {
  }

  public final void JR(String paramString)
  {
    AppMethodBeat.i(74682);
    ab.d("MicroMsg.FavSearchActionView", "unselected tag %s", new Object[] { paramString });
    FavSearchActionView.a(this.mpV).removeTag(paramString);
    JT(paramString);
    AppMethodBeat.o(74682);
  }

  public final void JS(String paramString)
  {
  }

  public final void JT(String paramString)
  {
    AppMethodBeat.i(74683);
    FavSearchActionView.a(this.mpV, FavSearchActionView.a(this.mpV).getEditText());
    FavSearchActionView.b(this.mpV).remove(paramString);
    FavSearchActionView.c(this.mpV);
    if (FavSearchActionView.d(this.mpV) == null)
      AppMethodBeat.o(74683);
    while (true)
    {
      return;
      FavSearchActionView.d(this.mpV).a(FavSearchActionView.e(this.mpV), FavSearchActionView.f(this.mpV), FavSearchActionView.b(this.mpV), true);
      AppMethodBeat.o(74683);
    }
  }

  public final void JU(String paramString)
  {
    AppMethodBeat.i(74684);
    FavSearchActionView.a(this.mpV, FavSearchActionView.a(this.mpV).getEditText());
    FavSearchActionView.c(this.mpV);
    if (FavSearchActionView.d(this.mpV) == null)
      AppMethodBeat.o(74684);
    while (true)
    {
      return;
      FavSearchActionView.d(this.mpV).a(paramString, FavSearchActionView.e(this.mpV), FavSearchActionView.f(this.mpV), FavSearchActionView.b(this.mpV));
      AppMethodBeat.o(74684);
    }
  }

  public final void JV(String paramString)
  {
    AppMethodBeat.i(74685);
    FavSearchActionView.a(this.mpV, paramString);
    FavSearchActionView.d(this.mpV).a(FavSearchActionView.e(this.mpV), FavSearchActionView.f(this.mpV), FavSearchActionView.b(this.mpV), false);
    AppMethodBeat.o(74685);
  }

  public final void Mi(String paramString)
  {
    AppMethodBeat.i(74687);
    ab.d("MicroMsg.FavSearchActionView", "unselected type %s", new Object[] { paramString });
    FavSearchActionView.a(this.mpV);
    FavSearchActionView.a(this.mpV, FavSearchActionView.a(this.mpV).getEditText());
    FavSearchActionView.e(this.mpV).remove(FavSearchActionView.ap(this.mpV.getContext(), paramString));
    FavSearchActionView.c(this.mpV);
    if (FavSearchActionView.d(this.mpV) != null)
      FavSearchActionView.d(this.mpV).a(FavSearchActionView.e(this.mpV), FavSearchActionView.f(this.mpV), FavSearchActionView.b(this.mpV), true);
    AppMethodBeat.o(74687);
  }

  public final void bmm()
  {
    AppMethodBeat.i(74686);
    if (FavSearchActionView.d(this.mpV) == null)
      AppMethodBeat.o(74686);
    while (true)
    {
      return;
      FavSearchActionView.d(this.mpV).app();
      AppMethodBeat.o(74686);
    }
  }

  public final void q(boolean paramBoolean, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView.1
 * JD-Core Version:    0.6.2
 */