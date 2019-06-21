package com.tencent.ttpic.model;

public class CharmRange
{
  public static final int HIT = 1;
  public static final int NOT_HIT = 2;
  public static final int PENDING = 0;
  public double max;
  public double min;
  public int status = 0;

  public void clearStatus()
  {
    this.status = 0;
  }

  public void hit(double paramDouble)
  {
    if ((paramDouble >= this.min) && ((paramDouble < this.max) || ((this.max == 1.0D) && (paramDouble <= this.max))));
    for (this.status = 1; ; this.status = 2)
      return;
  }

  public boolean isHit()
  {
    boolean bool = true;
    if (this.status == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.CharmRange
 * JD-Core Version:    0.6.2
 */