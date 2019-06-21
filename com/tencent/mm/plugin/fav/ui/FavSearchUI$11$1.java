package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.d.a.b;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;

final class FavSearchUI$11$1
  implements q.a
{
  FavSearchUI$11$1(FavSearchUI.11 param11, a.b paramb)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(74081);
    this.mju.mjo.aqX();
    if (paramBoolean)
    {
      p localp = h.b(this.mju.mjo.mController.ylL, this.mju.mjo.getString(2131299643), false, null);
      i.a(this.mju.mjo.mController.ylL, FavSearchUI.j(this.mju.mjo), paramString, this.mjt.mgf, new FavSearchUI.11.1.1(this, localp));
    }
    AppMethodBeat.o(74081);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSearchUI.11.1
 * JD-Core Version:    0.6.2
 */