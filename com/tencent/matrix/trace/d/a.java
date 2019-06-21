package com.tencent.matrix.trace.d;

public final class a
{
  public int bZt;
  public int bZu;
  public int bna;
  public int count = 1;

  public a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.bZt = paramInt1;
    this.bZu = paramInt2;
    this.bna = paramInt3;
  }

  public final void aD(long paramLong)
  {
    this.count += 1;
    this.bZu = ((int)(this.bZu + paramLong));
  }

  public final String toString()
  {
    return this.bna + "," + this.bZt + "," + this.count + "," + this.bZu;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.d.a
 * JD-Core Version:    0.6.2
 */