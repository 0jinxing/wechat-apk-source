package com.google.android.exoplayer2.c.a;

import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.l;

abstract class d
{
  protected final m aTw;

  protected d(m paramm)
  {
    this.aTw = paramm;
  }

  protected abstract void a(l paraml, long paramLong);

  protected abstract boolean a(l paraml);

  public final void b(l paraml, long paramLong)
  {
    if (a(paraml))
      a(paraml, paramLong);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.a.d
 * JD-Core Version:    0.6.2
 */