package com.tencent.mm.bf;

import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;

public final class e$1
  implements MessageQueue.IdleHandler
{
  public e$1(e parame)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(116554);
    if (g.Rg().foreground)
    {
      ab.w("MicroMsg.SpeexUploadCore", "skiped resume speex uploader, not foreground");
      AppMethodBeat.o(116554);
    }
    while (true)
    {
      return false;
      ab.d("MicroMsg.SpeexUploadCore", "now resume speex uploader");
      e.a(this.fQT).pk(false);
      AppMethodBeat.o(116554);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bf.e.1
 * JD-Core Version:    0.6.2
 */