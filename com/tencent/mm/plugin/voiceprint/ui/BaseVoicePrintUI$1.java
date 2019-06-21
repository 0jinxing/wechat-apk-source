package com.tencent.mm.plugin.voiceprint.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.plugin.voiceprint.model.p;
import com.tencent.mm.plugin.voiceprint.model.p.a;
import com.tencent.mm.sdk.platformtools.ab;

final class BaseVoicePrintUI$1
  implements p.a
{
  BaseVoicePrintUI$1(BaseVoicePrintUI paramBaseVoicePrintUI)
  {
  }

  public final void cHQ()
  {
    AppMethodBeat.i(26130);
    p localp = BaseVoicePrintUI.a(this.sLV);
    if (localp.chd != null)
    {
      localp.chd.EB();
      ab.e("MicroMsg.VoicePrintRecoder", "Reset recorder.stopReocrd");
    }
    localp.fileName = "";
    localp.sLB = null;
    localp.stk = 0;
    localp.ljM = 0L;
    if (localp.gar != null)
      localp.gar.Mm();
    ab.e("MicroMsg.BaseVoicePrintUI", "record stop on error");
    BaseVoicePrintUI.a(this.sLV, null);
    BaseVoicePrintUI.b(this.sLV);
    AppMethodBeat.o(26130);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI.1
 * JD-Core Version:    0.6.2
 */