package com.tencent.mm.audio.b;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class h$a$1 extends ak
{
  h$a$1(h.a parama, h paramh)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(116499);
    if (h.b(this.cqP.cqN) <= 0)
    {
      AppMethodBeat.o(116499);
      return;
    }
    paramMessage = new StringBuilder("On Part :");
    if (this.cqP.cqN.cqI == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.SceneVoice.Recorder", bool);
      h.c(this.cqP.cqN);
      if (this.cqP.cqN.cqI != null)
        this.cqP.cqN.cqI.acE();
      AppMethodBeat.o(116499);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.h.a.1
 * JD-Core Version:    0.6.2
 */