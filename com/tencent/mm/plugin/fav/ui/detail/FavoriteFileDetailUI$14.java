package com.tencent.mm.plugin.fav.ui.detail;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class FavoriteFileDetailUI$14
  implements View.OnClickListener
{
  FavoriteFileDetailUI$14(FavoriteFileDetailUI paramFavoriteFileDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74336);
    ab.i("MicroMsg.FavoriteFileDetailUI", "click item favid %d, localid %d, itemstatus %d", new Object[] { Integer.valueOf(FavoriteFileDetailUI.b(this.mlX).field_id), Long.valueOf(FavoriteFileDetailUI.b(this.mlX).field_localId), Integer.valueOf(FavoriteFileDetailUI.b(this.mlX).field_itemStatus) });
    if (!f.Mn())
    {
      h.g(this.mlX.mController.ylL, 2131299671, 2131299589);
      AppMethodBeat.o(74336);
      return;
    }
    if ((FavoriteFileDetailUI.b(this.mlX).bux()) || (bo.isNullOrNil(FavoriteFileDetailUI.a(this.mlX).wfZ)))
      b.l(FavoriteFileDetailUI.b(this.mlX));
    while (true)
    {
      FavoriteFileDetailUI.g(this.mlX);
      AppMethodBeat.o(74336);
      break;
      if (!FavoriteFileDetailUI.f(this.mlX))
      {
        b.a(FavoriteFileDetailUI.b(this.mlX), FavoriteFileDetailUI.a(this.mlX), true);
      }
      else
      {
        FavoriteFileDetailUI.b(this.mlX).field_itemStatus = 7;
        b.b(FavoriteFileDetailUI.a(this.mlX), 18, -1L);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.14
 * JD-Core Version:    0.6.2
 */