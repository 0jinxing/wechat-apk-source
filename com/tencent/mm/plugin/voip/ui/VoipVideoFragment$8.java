package com.tencent.mm.plugin.voip.ui;

import android.support.v4.app.FragmentActivity;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VoipVideoFragment$8
  implements Runnable
{
  VoipVideoFragment$8(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4877);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "dismiss bar");
    VoipVideoFragment.v(this.sYn);
    if ((this.sYn.getActivity() == null) || (this.sYn.getActivity().isFinishing()))
      AppMethodBeat.o(4877);
    while (true)
    {
      return;
      if (VoipVideoFragment.w(this.sYn) > 0)
      {
        AppMethodBeat.o(4877);
      }
      else
      {
        VoipVideoFragment.t(this.sYn).setVisibility(8);
        VoipVideoFragment.x(this.sYn).setVisibility(8);
        VoipVideoFragment.y(this.sYn).setVisibility(8);
        VoipVideoFragment.a(this.sYn).setVisibility(8);
        VoipVideoFragment.b(this.sYn).setVisibility(8);
        VoipVideoFragment.e(this.sYn, false);
        AppMethodBeat.o(4877);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.8
 * JD-Core Version:    0.6.2
 */