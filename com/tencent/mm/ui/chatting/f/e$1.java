package com.tencent.mm.ui.chatting.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicBoolean;

final class e$1 extends Handler
{
  e$1(e parame, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(32485);
    if (e.a(this.yYI).get())
    {
      ab.w("MicroMsg.ChattingLoader.ListDataLoader", "[handleMessage] cancel update!!!");
      AppMethodBeat.o(32485);
      return;
    }
    switch (paramMessage.what)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(32485);
      break;
      paramMessage = (d.d)paramMessage.obj;
      paramMessage.yYD = e.b(this.yYI).fd(paramMessage.yYB);
      e.c(this.yYI).a(paramMessage);
      ab.i("MicroMsg.ChattingLoader.ListDataLoader", "[handleMessage] UPDATE!!! result:%s", new Object[] { paramMessage.toString() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.f.e.1
 * JD-Core Version:    0.6.2
 */