package com.tencent.mm.plugin.voiceprint.model;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class p$1 extends ak
{
  public p$1(p paramp)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(26122);
    ab.d("MicroMsg.VoicePrintRecoder", " Recorder handleMessage");
    if (p.a(this.sLF))
      AppMethodBeat.o(26122);
    while (true)
    {
      return;
      aw.ZL().b(this.sLF);
      aw.ZL().KN();
      this.sLF.gE(200);
      AppMethodBeat.o(26122);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.p.1
 * JD-Core Version:    0.6.2
 */