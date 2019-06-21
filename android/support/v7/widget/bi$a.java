package android.support.v7.widget;

final class bi$a
{
  int auT = 0;
  int auU;
  int auV;
  int auW;
  int auX;

  private static int compare(int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2)
      paramInt1 = 1;
    while (true)
    {
      return paramInt1;
      if (paramInt1 == paramInt2)
        paramInt1 = 2;
      else
        paramInt1 = 4;
    }
  }

  final void addFlags(int paramInt)
  {
    this.auT |= paramInt;
  }

  final boolean lx()
  {
    boolean bool1 = false;
    boolean bool2;
    if (((this.auT & 0x7) != 0) && ((this.auT & compare(this.auW, this.auU) << 0) == 0))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if ((this.auT & 0x70) != 0)
      {
        bool2 = bool1;
        if ((this.auT & compare(this.auW, this.auV) << 4) == 0);
      }
      else if ((this.auT & 0x700) != 0)
      {
        bool2 = bool1;
        if ((this.auT & compare(this.auX, this.auU) << 8) == 0);
      }
      else if ((this.auT & 0x7000) != 0)
      {
        bool2 = bool1;
        if ((this.auT & compare(this.auX, this.auV) << 12) == 0);
      }
      else
      {
        bool2 = true;
      }
    }
  }

  final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.auU = paramInt1;
    this.auV = paramInt2;
    this.auW = paramInt3;
    this.auX = paramInt4;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bi.a
 * JD-Core Version:    0.6.2
 */