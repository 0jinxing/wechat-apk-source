package com.tencent.mm.plugin.voip.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class VoipVoiceFragment$2$1
  implements Runnable
{
  VoipVoiceFragment$2$1(VoipVoiceFragment.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4939);
    String str = VoipVoiceFragment.fQ(bo.fp(this.sYW.sYV.sVZ));
    VoipVoiceFragment.g(this.sYW.sYV).setText(str);
    AppMethodBeat.o(4939);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVoiceFragment.2.1
 * JD-Core Version:    0.6.2
 */