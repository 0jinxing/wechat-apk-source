package com.tencent.mm.plugin.fav.ui.detail;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.m;
import com.tencent.mm.plugin.fav.a.m.a;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.r.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

final class FavoriteSightDetailUI$1
  implements View.OnClickListener
{
  FavoriteSightDetailUI$1(FavoriteSightDetailUI paramFavoriteSightDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74408);
    if ((a.bJ(paramView.getContext())) || (a.bH(paramView.getContext())))
      AppMethodBeat.o(74408);
    while (true)
    {
      return;
      ab.i("MicroMsg.FavoriteSightDetailUI", "click item favid %d, localid %d, itemstatus %d", new Object[] { Integer.valueOf(FavoriteSightDetailUI.a(this.mmH).field_id), Long.valueOf(FavoriteSightDetailUI.a(this.mmH).field_localId), Integer.valueOf(FavoriteSightDetailUI.a(this.mmH).field_itemStatus) });
      if (!FavoriteSightDetailUI.a(this.mmH).isDone())
        break label231;
      if (b.f(FavoriteSightDetailUI.b(this.mmH)))
      {
        m.a(m.a.mft, FavoriteSightDetailUI.a(this.mmH));
        FavoriteSightDetailUI.a(this.mmH, true, paramView.getContext());
        AppMethodBeat.o(74408);
      }
      else
      {
        if (!bo.isNullOrNil(FavoriteSightDetailUI.b(this.mmH).wfZ))
          break;
        FavoriteSightDetailUI.a(this.mmH, false, paramView.getContext());
        AppMethodBeat.o(74408);
      }
    }
    ab.w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
    label192: if (FavoriteSightDetailUI.a(this.mmH).bux())
      b.l(FavoriteSightDetailUI.a(this.mmH));
    while (true)
    {
      FavoriteSightDetailUI.a(this.mmH, false);
      AppMethodBeat.o(74408);
      break;
      label231: if (FavoriteSightDetailUI.a(this.mmH).buy())
      {
        if (!bo.isNullOrNil(FavoriteSightDetailUI.b(this.mmH).wfZ))
          break label192;
        FavoriteSightDetailUI.a(this.mmH, false, paramView.getContext());
        AppMethodBeat.o(74408);
        break;
      }
      if ((!FavoriteSightDetailUI.a(this.mmH).isDownloading()) && (!FavoriteSightDetailUI.a(this.mmH).buw()))
        break label192;
      if (FavoriteSightDetailUI.c(this.mmH).getVisibility() == 8)
        FavoriteSightDetailUI.a(this.mmH, false);
      AppMethodBeat.o(74408);
      break;
      b.m(FavoriteSightDetailUI.a(this.mmH));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI.1
 * JD-Core Version:    0.6.2
 */