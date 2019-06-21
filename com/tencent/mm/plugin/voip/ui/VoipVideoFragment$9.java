package com.tencent.mm.plugin.voip.ui;

import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipVideoFragment$9
  implements Runnable
{
  VoipVideoFragment$9(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4878);
    if ((this.sYn.getActivity() == null) || (this.sYn.getActivity().isFinishing()))
      AppMethodBeat.o(4878);
    while (true)
    {
      return;
      VoipVideoFragment.g(this.sYn).setVisibility(8);
      AppMethodBeat.o(4878);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.9
 * JD-Core Version:    0.6.2
 */