package android.support.v7.h;

public final class b
  implements d
{
  final d Yr;
  int Ys = 0;
  int Yt = -1;
  int Yu = -1;
  Object Yv = null;

  public b(d paramd)
  {
    this.Yr = paramd;
  }

  public final void G(int paramInt1, int paramInt2)
  {
    if ((this.Ys == 1) && (paramInt1 >= this.Yt) && (paramInt1 <= this.Yt + this.Yu))
    {
      this.Yu += paramInt2;
      this.Yt = Math.min(paramInt1, this.Yt);
    }
    while (true)
    {
      return;
      fU();
      this.Yt = paramInt1;
      this.Yu = paramInt2;
      this.Ys = 1;
    }
  }

  public final void H(int paramInt1, int paramInt2)
  {
    if ((this.Ys == 2) && (this.Yt >= paramInt1) && (this.Yt <= paramInt1 + paramInt2))
    {
      this.Yu += paramInt2;
      this.Yt = paramInt1;
    }
    while (true)
    {
      return;
      fU();
      this.Yt = paramInt1;
      this.Yu = paramInt2;
      this.Ys = 2;
    }
  }

  public final void I(int paramInt1, int paramInt2)
  {
    fU();
    this.Yr.I(paramInt1, paramInt2);
  }

  public final void a(int paramInt1, int paramInt2, Object paramObject)
  {
    if ((this.Ys == 3) && (paramInt1 <= this.Yt + this.Yu) && (paramInt1 + paramInt2 >= this.Yt) && (this.Yv == paramObject))
    {
      int i = this.Yt;
      int j = this.Yu;
      this.Yt = Math.min(paramInt1, this.Yt);
      this.Yu = (Math.max(i + j, paramInt1 + paramInt2) - this.Yt);
    }
    while (true)
    {
      return;
      fU();
      this.Yt = paramInt1;
      this.Yu = paramInt2;
      this.Yv = paramObject;
      this.Ys = 3;
    }
  }

  public final void fU()
  {
    if (this.Ys == 0)
      return;
    switch (this.Ys)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      this.Yv = null;
      this.Ys = 0;
      break;
      this.Yr.G(this.Yt, this.Yu);
      continue;
      this.Yr.H(this.Yt, this.Yu);
      continue;
      this.Yr.a(this.Yt, this.Yu, this.Yv);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.h.b
 * JD-Core Version:    0.6.2
 */