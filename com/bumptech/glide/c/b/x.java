package com.bumptech.glide.c.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.h.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class x
{
  private boolean aCl;
  private final Handler handler;

  x()
  {
    AppMethodBeat.i(91888);
    this.handler = new Handler(Looper.getMainLooper(), new x.a());
    AppMethodBeat.o(91888);
  }

  final void e(u<?> paramu)
  {
    AppMethodBeat.i(91889);
    j.om();
    if (this.aCl)
    {
      this.handler.obtainMessage(1, paramu).sendToTarget();
      AppMethodBeat.o(91889);
    }
    while (true)
    {
      return;
      this.aCl = true;
      paramu.recycle();
      this.aCl = false;
      AppMethodBeat.o(91889);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.x
 * JD-Core Version:    0.6.2
 */