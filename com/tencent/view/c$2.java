package com.tencent.view;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$2 extends HandlerThread
{
  c$2(c paramc, String paramString)
  {
    super(paramString);
  }

  protected final void onLooperPrepared()
  {
    AppMethodBeat.i(86632);
    super.onLooperPrepared();
    AppMethodBeat.o(86632);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.view.c.2
 * JD-Core Version:    0.6.2
 */