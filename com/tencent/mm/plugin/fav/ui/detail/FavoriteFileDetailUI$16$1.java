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

final class FavoriteFileDetailUI$16$1
  implements n.c
{
  FavoriteFileDetailUI$16$1(FavoriteFileDetailUI.16 param16)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(74338);
    if (this.mme.mmc)
    {
      FavoriteFileDetailUI.j(this.mme.mlX);
      if ((!k.h(FavoriteFileDetailUI.a(this.mme.mlX))) && (FavoriteFileDetailUI.a(this.mme.mlX).whh == 0))
      {
        if (this.mme.bVv != 8)
          break label146;
        paraml.e(0, this.mme.mlX.getString(2131299734));
      }
    }
    while (true)
    {
      if (this.mme.mmd)
      {
        paraml.e(3, this.mme.mlX.getString(2131299612));
        paraml.e(2, this.mme.mlX.mController.ylL.getString(2131296881));
      }
      AppMethodBeat.o(74338);
      return;
      label146: if (this.mme.bVv == 15)
      {
        paraml.e(0, this.mme.mlX.getString(2131299734));
        paraml.e(4, this.mme.mlX.getString(2131302712));
      }
      else if (this.mme.bVv == 4)
      {
        paraml.e(0, this.mme.mlX.getString(2131299734));
        paraml.e(4, this.mme.mlX.getString(2131302712));
      }
      else
      {
        paraml.e(0, this.mme.mlX.getString(2131299734));
        if ((this.mme.mmd) && (FavoriteFileDetailUI.b(this.mme.mlX).buu()))
          paraml.e(1, this.mme.mlX.getString(2131299688));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.16.1
 * JD-Core Version:    0.6.2
 */