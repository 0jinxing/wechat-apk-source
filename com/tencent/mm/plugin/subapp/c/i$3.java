package com.tencent.mm.plugin.subapp.c;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class i$3 extends ak
{
  i$3(i parami)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(25294);
    ab.d("MicroMsg.VoiceRemindRecorder", " Recorder handleMessage");
    if (i.b(this.stm))
      AppMethodBeat.o(25294);
    while (true)
    {
      return;
      aw.ZL().b(this.stm);
      aw.ZL().KN();
      this.stm.gE(200);
      AppMethodBeat.o(25294);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.i.3
 * JD-Core Version:    0.6.2
 */