package com.tencent.mm.plugin.fav.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.d.a.b;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.snackbar.b;

final class FavSelectUI$4
  implements q.a
{
  FavSelectUI$4(FavSelectUI paramFavSelectUI, a.b paramb)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(74106);
    this.mjF.aqX();
    if (paramBoolean)
    {
      final p localp = h.b(this.mjF.mController.ylL, this.mjF.getString(2131299643), false, null);
      i.a(this.mjF.mController.ylL, FavSelectUI.b(this.mjF), paramString, this.mjt.mgf, new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(74105);
          if (localp != null)
            localp.dismiss();
          b.i(FavSelectUI.4.this.mjF, FavSelectUI.4.this.mjF.getString(2131299583));
          al.n(new FavSelectUI.4.1.1(this), 1800L);
          AppMethodBeat.o(74105);
        }
      });
    }
    AppMethodBeat.o(74106);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSelectUI.4
 * JD-Core Version:    0.6.2
 */