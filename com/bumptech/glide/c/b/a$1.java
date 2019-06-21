package com.bumptech.glide.c.b;

import android.os.Handler.Callback;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements Handler.Callback
{
  a$1(a parama)
  {
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(91745);
    boolean bool;
    if (paramMessage.what == 1)
    {
      this.azO.a((a.b)paramMessage.obj);
      AppMethodBeat.o(91745);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91745);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.1
 * JD-Core Version:    0.6.2
 */