package android.support.v7.app;

final class m
{
  private static m Wt;
  public long Wu;
  public long Wv;
  public int state;

  static m fB()
  {
    if (Wt == null)
      Wt = new m();
    return Wt;
  }

  public final void a(long paramLong, double paramDouble1, double paramDouble2)
  {
    float f1 = (float)(paramLong - 946728000000L) / 86400000.0F;
    float f2 = 6.24006F + 0.01720197F * f1;
    double d1 = f2 + 0.03341960161924362D * Math.sin(f2) + 0.0003490659873933D * Math.sin(2.0F * f2) + 5.236000106378924E-006D * Math.sin(3.0F * f2) + 1.796593063D + 3.141592653589793D;
    paramDouble2 = -paramDouble2 / 360.0D;
    double d2 = (float)Math.round(f1 - 0.0009F - paramDouble2) + 0.0009F;
    paramDouble2 = Math.sin(f2) * 0.0053D + (paramDouble2 + d2) + -0.0069D * Math.sin(2.0D * d1);
    d1 = Math.asin(Math.sin(d1) * Math.sin(0.4092797040939331D));
    double d3 = 0.0174532923847437D * paramDouble1;
    double d4 = Math.sin(-0.1047197580337524D);
    d2 = Math.sin(d3);
    paramDouble1 = Math.sin(d1);
    d3 = Math.cos(d3);
    paramDouble1 = (d4 - d2 * paramDouble1) / (Math.cos(d1) * d3);
    if (paramDouble1 >= 1.0D)
    {
      this.state = 1;
      this.Wu = -1L;
      this.Wv = -1L;
    }
    while (true)
    {
      return;
      if (paramDouble1 <= -1.0D)
      {
        this.state = 0;
        this.Wu = -1L;
        this.Wv = -1L;
      }
      else
      {
        f1 = (float)(Math.acos(paramDouble1) / 6.283185307179586D);
        this.Wu = (Math.round((f1 + paramDouble2) * 86400000.0D) + 946728000000L);
        this.Wv = (Math.round((paramDouble2 - f1) * 86400000.0D) + 946728000000L);
        if ((this.Wv < paramLong) && (this.Wu > paramLong))
          this.state = 0;
        else
          this.state = 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.m
 * JD-Core Version:    0.6.2
 */