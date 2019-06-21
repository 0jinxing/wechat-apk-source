package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VoipVideoFragment$19
  implements View.OnClickListener
{
  VoipVideoFragment$19(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4893);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "click reject video invite button");
    VoipVideoFragment.d(this.sYn);
    AppMethodBeat.o(4893);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.19
 * JD-Core Version:    0.6.2
 */