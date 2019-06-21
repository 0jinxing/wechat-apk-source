package com.tencent.mm.plugin.voip.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class VoipVideoFragment$13$1
  implements Runnable
{
  VoipVideoFragment$13$1(VoipVideoFragment.13 param13)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4882);
    String str = VoipVideoFragment.fQ(bo.fp(this.sYo.sYn.sVZ));
    VoipVideoFragment.y(this.sYo.sYn).setText(str);
    VoipVideoFragment.z(this.sYo.sYn);
    AppMethodBeat.o(4882);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.13.1
 * JD-Core Version:    0.6.2
 */