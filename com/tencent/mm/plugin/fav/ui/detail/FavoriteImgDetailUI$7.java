package com.tencent.mm.plugin.fav.ui.detail;

import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.scanner.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.q;

final class FavoriteImgDetailUI$7
  implements n.c
{
  FavoriteImgDetailUI$7(FavoriteImgDetailUI paramFavoriteImgDetailUI, FavoriteImgDetailUI.a parama)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(74387);
    if (FavoriteImgDetailUI.a(this.mmn))
    {
      if (FavoriteImgDetailUI.b(this.mmn).but())
        paraml.e(2, this.mmn.mController.ylL.getString(2131299734));
      if (FavoriteImgDetailUI.b(this.mmn).buu())
        paraml.e(1, this.mmn.mController.ylL.getString(2131299688));
      paraml.e(3, this.mmn.mController.ylL.getString(2131299727));
      if (!bo.isNullOrNil(this.mms.mmw))
        if (a.BR(this.mms.cvn))
        {
          paraml.e(4, this.mmn.getString(2131299695));
          AppMethodBeat.o(74387);
        }
    }
    while (true)
    {
      return;
      if (a.ba(this.mms.cvn, this.mms.mmw))
      {
        paraml.e(4, this.mmn.getString(2131299696));
        AppMethodBeat.o(74387);
      }
      else if (a.BQ(this.mms.cvn))
      {
        paraml.e(4, this.mmn.getString(2131299694));
        AppMethodBeat.o(74387);
      }
      else
      {
        paraml.e(4, this.mmn.getString(2131299695));
        AppMethodBeat.o(74387);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.7
 * JD-Core Version:    0.6.2
 */