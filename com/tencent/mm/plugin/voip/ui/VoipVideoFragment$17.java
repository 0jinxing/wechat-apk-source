package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.base.h;

final class VoipVideoFragment$17
  implements View.OnClickListener
{
  VoipVideoFragment$17(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4889);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "click accept video invite use voice button");
    if ((at.isWifi(this.sYn.getActivity())) || (q.cJV()))
    {
      VoipVideoFragment.c(this.sYn);
      AppMethodBeat.o(4889);
    }
    while (true)
    {
      return;
      h.a(this.sYn.getActivity(), 2131304448, 2131304449, new VoipVideoFragment.17.1(this), new VoipVideoFragment.17.2(this));
      AppMethodBeat.o(4889);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.17
 * JD-Core Version:    0.6.2
 */