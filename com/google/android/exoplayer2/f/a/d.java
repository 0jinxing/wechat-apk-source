package com.google.android.exoplayer2.f.a;

import com.google.android.exoplayer2.f.h;
import com.google.android.exoplayer2.f.i;
import com.google.android.exoplayer2.i.a;
import java.util.LinkedList;
import java.util.PriorityQueue;

abstract class d
  implements com.google.android.exoplayer2.f.e
{
  private long bfY;
  private final LinkedList<h> bmv = new LinkedList();
  final LinkedList<i> bmw;
  private final PriorityQueue<h> bmx;
  private h bmy;

  public d()
  {
    for (int j = 0; j < 10; j++)
      this.bmv.add(new h());
    this.bmw = new LinkedList();
    for (j = i; j < 2; j++)
      this.bmw.add(new e(this));
    this.bmx = new PriorityQueue();
  }

  private void c(h paramh)
  {
    paramh.clear();
    this.bmv.add(paramh);
  }

  protected abstract void a(h paramh);

  public void ai(long paramLong)
  {
    this.bfY = paramLong;
  }

  public void b(h paramh)
  {
    boolean bool;
    if (paramh == this.bmy)
    {
      bool = true;
      a.checkArgument(bool);
      if (!paramh.qF())
        break label37;
      c(paramh);
    }
    while (true)
    {
      this.bmy = null;
      return;
      bool = false;
      break;
      label37: this.bmx.add(paramh);
    }
  }

  public void flush()
  {
    this.bfY = 0L;
    while (!this.bmx.isEmpty())
      c((h)this.bmx.poll());
    if (this.bmy != null)
    {
      c(this.bmy);
      this.bmy = null;
    }
  }

  public void release()
  {
  }

  protected abstract boolean sL();

  protected abstract com.google.android.exoplayer2.f.d sM();

  public i sP()
  {
    i locali;
    if (this.bmw.isEmpty())
      locali = null;
    while (true)
    {
      return locali;
      h localh;
      com.google.android.exoplayer2.f.d locald;
      do
      {
        do
        {
          c(localh);
          if ((this.bmx.isEmpty()) || (((h)this.bmx.peek()).aSk > this.bfY))
            break label147;
          localh = (h)this.bmx.poll();
          if (localh.qG())
          {
            locali = (i)this.bmw.pollFirst();
            locali.dB(4);
            c(localh);
            break;
          }
          a(localh);
        }
        while (!sL());
        locald = sM();
      }
      while (localh.qF());
      locali = (i)this.bmw.pollFirst();
      locali.a(localh.aSk, locald, 9223372036854775807L);
      c(localh);
      continue;
      label147: locali = null;
    }
  }

  public h sQ()
  {
    boolean bool;
    if (this.bmy == null)
    {
      bool = true;
      a.checkState(bool);
      if (!this.bmv.isEmpty())
        break label32;
    }
    for (h localh = null; ; localh = this.bmy)
    {
      return localh;
      bool = false;
      break;
      label32: this.bmy = ((h)this.bmv.pollFirst());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.a.d
 * JD-Core Version:    0.6.2
 */