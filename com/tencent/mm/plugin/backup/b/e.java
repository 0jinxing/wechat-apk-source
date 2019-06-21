package com.tencent.mm.plugin.backup.b;

public final class e
{
  public int jqW = -100;
  public int jqX;
  public int jqY;
  public int jqZ;
  public long jra;
  public long jrb;
  public long jrc;

  public final void O(int paramInt1, int paramInt2, int paramInt3)
  {
    this.jqW = paramInt1;
    this.jqX = paramInt2;
    this.jqY = paramInt3;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2)
  {
    this.jqW = paramInt1;
    this.jqX = paramInt2;
    this.jqY = paramInt3;
    this.jra = paramLong1;
    this.jrb = paramLong2;
  }

  public final int aSD()
  {
    int i;
    if (this.jrb == 0L)
    {
      i = 1;
      return i;
    }
    double d = this.jra * 100L / this.jrb;
    if (d <= 5.0D);
    for (d *= 4.0D; ; d = (d - 5.0D) * 80.0D / 95.0D + 20.0D)
    {
      i = (int)d;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.b.e
 * JD-Core Version:    0.6.2
 */