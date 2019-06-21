package com.tencent.mm.plugin.fav.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.fav.a.n;
import com.tencent.mm.r.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;

final class FavChatVoiceView$1
  implements View.OnClickListener
{
  FavChatVoiceView$1(FavChatVoiceView paramFavChatVoiceView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(73937);
    String str1 = FavChatVoiceView.a(this.mhM);
    String str2;
    if (FavChatVoiceView.b(this.mhM).buH())
    {
      str2 = "true";
      ab.i("MicroMsg.FavChatVoiceView", "clicked path:%s, player isPlay:%s, path:%s", new Object[] { str1, str2, FavChatVoiceView.b(this.mhM).path });
      if ((!a.bJ(FavChatVoiceView.c(this.mhM))) && (!a.bH(FavChatVoiceView.c(this.mhM))))
        break label99;
      AppMethodBeat.o(73937);
    }
    while (true)
    {
      return;
      str2 = "false";
      break;
      label99: if ((!f.Mn()) && (!bo.isNullOrNil(FavChatVoiceView.a(this.mhM))))
      {
        t.hO(paramView.getContext());
        AppMethodBeat.o(73937);
      }
      else if ((bo.bc(FavChatVoiceView.a(this.mhM), "").equals(FavChatVoiceView.b(this.mhM).path)) && (FavChatVoiceView.b(this.mhM).buH()))
      {
        this.mhM.stopPlay();
        AppMethodBeat.o(73937);
      }
      else
      {
        FavChatVoiceView.d(this.mhM);
        AppMethodBeat.o(73937);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavChatVoiceView.1
 * JD-Core Version:    0.6.2
 */