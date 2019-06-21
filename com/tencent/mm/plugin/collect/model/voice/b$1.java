package com.tencent.mm.plugin.collect.model.voice;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1 extends Handler
{
  b$1(b paramb)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(41025);
    if (this.kDo.kDh != null)
      switch (paramMessage.what)
      {
      default:
      case 0:
      case -1:
      }
    while (true)
    {
      AppMethodBeat.o(41025);
      while (true)
      {
        return;
        paramMessage = paramMessage.getData().getByteArray("data");
        this.kDo.kDh.l(0, paramMessage);
        AppMethodBeat.o(41025);
      }
      this.kDo.kDh.l(-203, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.voice.b.1
 * JD-Core Version:    0.6.2
 */