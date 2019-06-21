package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.i;

public abstract interface f extends q
{
  public abstract void a(i parami);

  public abstract void a(c[] paramArrayOfc);

  public abstract void b(c[] paramArrayOfc);

  @Deprecated
  public static abstract interface a extends q.a
  {
  }

  public static final class c
  {
    public final f.b aMN;
    public final int aMO;
    public final Object aMP;

    public c(f.b paramb, Object paramObject)
    {
      this.aMN = paramb;
      this.aMO = 1;
      this.aMP = paramObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f
 * JD-Core Version:    0.6.2
 */