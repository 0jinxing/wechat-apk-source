package com.bumptech.glide.c.b;

import android.os.Handler.Callback;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class x$a
  implements Handler.Callback
{
  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(91887);
    boolean bool;
    if (paramMessage.what == 1)
    {
      ((u)paramMessage.obj).recycle();
      AppMethodBeat.o(91887);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91887);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.x.a
 * JD-Core Version:    0.6.2
 */