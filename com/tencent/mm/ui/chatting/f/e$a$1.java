package com.tencent.mm.ui.chatting.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicBoolean;

final class e$a$1
  implements d.b
{
  e$a$1(e.a parama, d.d paramd)
  {
  }

  public final void dY()
  {
    AppMethodBeat.i(32486);
    this.yYK.yYJ.c(this.yYm);
    e.a locala = this.yYK;
    d.d locald = this.yYm;
    if (locala.yYF.get())
    {
      ab.w("MicroMsg.ChattingLoader.ListDataLoader", "has cancel!");
      AppMethodBeat.o(32486);
    }
    while (true)
    {
      return;
      Message localMessage = new Message();
      localMessage.what = 1;
      localMessage.obj = locald;
      if ((locala.cNi) && (Looper.myLooper() == Looper.getMainLooper()))
      {
        e.d(locala.yYI).handleMessage(localMessage);
        AppMethodBeat.o(32486);
      }
      else
      {
        e.d(locala.yYI).sendMessage(localMessage);
        AppMethodBeat.o(32486);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.f.e.a.1
 * JD-Core Version:    0.6.2
 */