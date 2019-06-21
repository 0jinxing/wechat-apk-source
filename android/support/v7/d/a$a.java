package android.support.v7.d;

import java.util.Arrays;

final class a$a
{
  private int XA;
  private int XB;
  private int XC;
  private int Xu;
  int Xv;
  private int Xw;
  private int Xx;
  private int Xy;
  private int Xz;

  a$a(a parama, int paramInt1, int paramInt2)
  {
    this.Xu = paramInt1;
    this.Xv = paramInt2;
    fN();
  }

  private int fM()
  {
    return this.Xv + 1 - this.Xu;
  }

  final boolean fL()
  {
    boolean bool = true;
    if (fM() > 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  final void fN()
  {
    int[] arrayOfInt1 = this.XD.Pn;
    int[] arrayOfInt2 = this.XD.mHistogram;
    int i = 0;
    int j = this.Xu;
    int k = -2147483648;
    int m = -2147483648;
    int n = -2147483648;
    int i1 = 2147483647;
    int i2 = 2147483647;
    int i3 = 2147483647;
    int i4;
    int i5;
    int i7;
    int i8;
    if (j <= this.Xv)
    {
      i4 = arrayOfInt1[j];
      i5 = i + arrayOfInt2[i4];
      int i6 = a.bn(i4);
      i7 = a.bo(i4);
      i = a.bp(i4);
      i4 = k;
      if (i6 > k)
        i4 = i6;
      i8 = i1;
      if (i6 < i1)
        i8 = i6;
      if (i7 <= m)
        break label239;
      m = i7;
    }
    label239: 
    while (true)
    {
      if (i7 < i2)
        i2 = i7;
      while (true)
      {
        i1 = n;
        if (i > n)
          i1 = i;
        i7 = i3;
        if (i < i3)
          i7 = i;
        j++;
        i = i5;
        k = i4;
        n = i1;
        i1 = i8;
        i3 = i7;
        break;
        this.Xx = i1;
        this.Xy = k;
        this.Xz = i2;
        this.XA = m;
        this.XB = i3;
        this.XC = n;
        this.Xw = i;
        return;
      }
    }
  }

  final int fO()
  {
    int i = this.Xy - this.Xx;
    int j = this.XA - this.Xz;
    int k = this.XC - this.XB;
    if ((i >= j) && (i >= k))
    {
      k = -3;
      int[] arrayOfInt1 = this.XD.Pn;
      int[] arrayOfInt2 = this.XD.mHistogram;
      a.a(arrayOfInt1, k, this.Xu, this.Xv);
      Arrays.sort(arrayOfInt1, this.Xu, this.Xv + 1);
      a.a(arrayOfInt1, k, this.Xu, this.Xv);
      j = this.Xw / 2;
      k = this.Xu;
      i = 0;
      label118: if (k > this.Xv)
        break label181;
      i += arrayOfInt2[arrayOfInt1[k]];
      if (i < j)
        break label175;
    }
    label175: label181: for (k = Math.min(this.Xv - 1, k); ; k = this.Xu)
    {
      return k;
      if ((j >= i) && (j >= k))
      {
        k = -2;
        break;
      }
      k = -1;
      break;
      k++;
      break label118;
    }
  }

  final b.c fP()
  {
    int[] arrayOfInt1 = this.XD.Pn;
    int[] arrayOfInt2 = this.XD.mHistogram;
    int i = this.Xu;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    while (i <= this.Xv)
    {
      int i1 = arrayOfInt1[i];
      int i2 = arrayOfInt2[i1];
      j += i2;
      n += a.bn(i1) * i2;
      m += a.bo(i1) * i2;
      i1 = a.bp(i1);
      i++;
      k = i1 * i2 + k;
    }
    return new b.c(a.j(Math.round(n / j), Math.round(m / j), Math.round(k / j)), j);
  }

  final int getVolume()
  {
    return (this.Xy - this.Xx + 1) * (this.XA - this.Xz + 1) * (this.XC - this.XB + 1);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.d.a.a
 * JD-Core Version:    0.6.2
 */