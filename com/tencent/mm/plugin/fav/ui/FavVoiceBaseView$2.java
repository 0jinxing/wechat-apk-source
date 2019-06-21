package com.tencent.mm.plugin.fav.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.fav.a.n;
import com.tencent.mm.r.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;

final class FavVoiceBaseView$2
  implements View.OnClickListener
{
  FavVoiceBaseView$2(FavVoiceBaseView paramFavVoiceBaseView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74169);
    if ((a.bJ(paramView.getContext())) || (a.bH(paramView.getContext())))
      AppMethodBeat.o(74169);
    while (true)
    {
      return;
      if ((!f.Mn()) && (!bo.isNullOrNil(FavVoiceBaseView.g(this.mkh))))
      {
        t.hO(paramView.getContext());
        AppMethodBeat.o(74169);
      }
      else if (!bo.bc(FavVoiceBaseView.g(this.mkh), "").equals(FavVoiceBaseView.h(this.mkh).path))
      {
        FavVoiceBaseView.i(this.mkh);
        AppMethodBeat.o(74169);
      }
      else if (FavVoiceBaseView.h(this.mkh).buH())
      {
        this.mkh.buJ();
        AppMethodBeat.o(74169);
      }
      else
      {
        if (!FavVoiceBaseView.j(this.mkh))
          FavVoiceBaseView.i(this.mkh);
        AppMethodBeat.o(74169);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavVoiceBaseView.2
 * JD-Core Version:    0.6.2
 */