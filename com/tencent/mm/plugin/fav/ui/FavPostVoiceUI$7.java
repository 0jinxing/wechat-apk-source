package com.tencent.mm.plugin.fav.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class FavPostVoiceUI$7
  implements ap.a
{
  FavPostVoiceUI$7(FavPostVoiceUI paramFavPostVoiceUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(74047);
    if (FavPostVoiceUI.q(this.miR) == -1L)
      FavPostVoiceUI.a(this.miR, bo.yz());
    long l = bo.az(FavPostVoiceUI.q(this.miR));
    boolean bool;
    if ((l >= 3590000L) && (l <= 3600000L))
    {
      if (FavPostVoiceUI.r(this.miR) == null)
      {
        FavPostVoiceUI.a(this.miR, Toast.makeText(this.miR, this.miR.getString(2131299586, new Object[] { Integer.valueOf((int)((3600000L - l) / 1000L)) }), 0));
        FavPostVoiceUI.r(this.miR).show();
      }
    }
    else
    {
      if (l < 3600000L)
        break label203;
      ab.v("MicroMsg.FavPostVoiceUI", "record stop on countdown");
      FavPostVoiceUI.s(this.miR);
      FavPostVoiceUI.p(this.miR);
      bool = false;
      AppMethodBeat.o(74047);
    }
    while (true)
    {
      return bool;
      FavPostVoiceUI.r(this.miR).setText(this.miR.getString(2131299586, new Object[] { Integer.valueOf((int)((3600000L - l) / 1000L)) }));
      break;
      label203: bool = true;
      AppMethodBeat.o(74047);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavPostVoiceUI.7
 * JD-Core Version:    0.6.2
 */