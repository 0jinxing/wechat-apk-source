package com.tencent.tinker.a.b.a;

public final class h extends a
{
  public short[] Azg;

  public h(int paramInt)
  {
    if (paramInt < 0)
      throw new IllegalArgumentException("initSize < 0");
    this.Azg = new short[paramInt];
  }

  public final void a(short paramShort1, short paramShort2, short paramShort3)
  {
    c(paramShort1);
    c(paramShort2);
    c(paramShort3);
  }

  public final void c(short paramShort)
  {
    int i = this.akp;
    if (this.Azg.length - i <= 0)
    {
      short[] arrayOfShort = new short[this.Azg.length + (this.Azg.length >> 1)];
      System.arraycopy(this.Azg, 0, arrayOfShort, 0, i);
      this.Azg = arrayOfShort;
    }
    this.Azg[this.akp] = ((short)paramShort);
    dSc();
  }

  public final void c(short paramShort1, short paramShort2)
  {
    c(paramShort1);
    c(paramShort2);
  }

  public final void writeInt(int paramInt)
  {
    c((short)paramInt);
    c((short)(paramInt >> 16));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.b.a.h
 * JD-Core Version:    0.6.2
 */