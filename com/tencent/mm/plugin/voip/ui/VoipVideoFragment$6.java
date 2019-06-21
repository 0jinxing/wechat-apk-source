package com.tencent.mm.plugin.voip.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipVideoFragment$6
  implements Runnable
{
  VoipVideoFragment$6(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4875);
    VoipVideoFragment.r(this.sYn).setText(2131304432);
    this.sYn.sWv.a(VoipVideoFragment.s(this.sYn), VoipBaseFragment.sWo);
    AppMethodBeat.o(4875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.6
 * JD-Core Version:    0.6.2
 */