package com.tencent.mm.plugin.fav.ui.detail;

import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.q;

final class FavoriteSightDetailUI$4$1
  implements n.c
{
  FavoriteSightDetailUI$4$1(FavoriteSightDetailUI.4 param4)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(74415);
    if ((FavoriteSightDetailUI.a(this.mmJ.mmH).but()) && (!FavoriteSightDetailUI.j(this.mmJ.mmH).t(FavoriteSightDetailUI.a(this.mmJ.mmH))));
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) && (FavoriteSightDetailUI.b(this.mmJ.mmH).whh == 0))
        paraml.e(0, this.mmJ.mmH.getString(2131299734));
      paraml.e(4, this.mmJ.mmH.getString(2131299722));
      paraml.e(3, this.mmJ.mmH.getString(2131299612));
      paraml.e(2, this.mmJ.mmH.mController.ylL.getString(2131296881));
      AppMethodBeat.o(74415);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI.4.1
 * JD-Core Version:    0.6.2
 */