package com.tencent.mm.a;

public final class p extends Number
{
  private int uin = 0;

  public p(int paramInt)
  {
    this.uin = paramInt;
  }

  public p(long paramLong)
  {
    this.uin = ((int)(0xFFFFFFFF & paramLong));
  }

  public static int cB(String paramString)
  {
    try
    {
      paramString = Long.valueOf(paramString);
      p localp = new com/tencent/mm/a/p;
      localp.<init>(paramString.longValue());
      i = localp.intValue();
      return i;
    }
    catch (Exception paramString)
    {
      while (true)
        int i = 0;
    }
  }

  public static String getString(int paramInt)
  {
    return new p(paramInt).toString();
  }

  public final double doubleValue()
  {
    return (this.uin | 0L) + 0.0D;
  }

  public final float floatValue()
  {
    return (float)((this.uin | 0L) + 0.0D);
  }

  public final int intValue()
  {
    return this.uin;
  }

  public final long longValue()
  {
    return this.uin & 0xFFFFFFFF;
  }

  public final String toString()
  {
    return String.valueOf(this.uin & 0xFFFFFFFF);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.p
 * JD-Core Version:    0.6.2
 */