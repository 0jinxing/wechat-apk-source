package com.tencent.mm.plugin.voiceprint.ui;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseVoicePrintUI$6
  implements Runnable
{
  BaseVoicePrintUI$6(BaseVoicePrintUI paramBaseVoicePrintUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26136);
    BaseVoicePrintUI.c(this.sLV).setErr(2131304312);
    BaseVoicePrintUI.c(this.sLV).cIg();
    BaseVoicePrintUI.f(this.sLV).setPressed(false);
    BaseVoicePrintUI.f(this.sLV).setEnabled(false);
    BaseVoicePrintUI.g(this.sLV).stop();
    AppMethodBeat.o(26136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI.6
 * JD-Core Version:    0.6.2
 */