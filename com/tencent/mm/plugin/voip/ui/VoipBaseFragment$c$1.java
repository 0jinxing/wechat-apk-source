package com.tencent.mm.plugin.voip.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class VoipBaseFragment$c$1
  implements ap.a
{
  VoipBaseFragment$c$1(VoipBaseFragment.c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(4848);
    int i = this.sWF.sWC[(this.sWF.sWE % this.sWF.sWC.length)];
    if (this.sWF.sW != null)
    {
      if (-1 != i)
        break label80;
      this.sWF.sW.setText(null);
    }
    while (true)
    {
      VoipBaseFragment.c localc = this.sWF;
      localc.sWE += 1;
      AppMethodBeat.o(4848);
      return true;
      label80: this.sWF.sW.setText(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipBaseFragment.c.1
 * JD-Core Version:    0.6.2
 */