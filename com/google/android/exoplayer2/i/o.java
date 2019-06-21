package com.google.android.exoplayer2.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.PriorityQueue;

public final class o
{
  public final PriorityQueue<Integer> brx;
  public int bry;
  public final Object lock;

  public final void tP()
  {
    AppMethodBeat.i(95931);
    synchronized (this.lock)
    {
      this.brx.remove(Integer.valueOf(0));
      if (this.brx.isEmpty())
      {
        i = -2147483648;
        this.bry = i;
        this.lock.notifyAll();
        AppMethodBeat.o(95931);
        return;
      }
      int i = ((Integer)this.brx.peek()).intValue();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.o
 * JD-Core Version:    0.6.2
 */