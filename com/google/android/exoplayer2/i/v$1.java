package com.google.android.exoplayer2.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ThreadFactory;

final class v$1
  implements ThreadFactory
{
  v$1(String paramString)
  {
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(95952);
    paramRunnable = new Thread(paramRunnable, this.brR);
    AppMethodBeat.o(95952);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.v.1
 * JD-Core Version:    0.6.2
 */