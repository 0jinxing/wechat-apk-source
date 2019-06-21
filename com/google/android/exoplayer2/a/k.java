package com.google.android.exoplayer2.a;

import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class k
{
  private final int aRA;
  final int aRB;
  private final short[] aRC;
  private int aRD;
  short[] aRE;
  private int aRF;
  short[] aRG;
  private int aRH;
  private short[] aRI;
  private int aRJ;
  private int aRK;
  int aRL;
  int aRM;
  int aRN;
  int aRO;
  private int aRP;
  private int aRQ;
  private int aRR;
  private int aRS;
  final int aRy;
  private final int aRz;
  float pitch;
  private final int sampleRate;
  float speed;

  public k(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94722);
    this.sampleRate = paramInt1;
    this.aRy = paramInt2;
    this.aRz = (paramInt1 / 400);
    this.aRA = (paramInt1 / 65);
    this.aRB = (this.aRA * 2);
    this.aRC = new short[this.aRB];
    this.aRD = this.aRB;
    this.aRE = new short[this.aRB * paramInt2];
    this.aRF = this.aRB;
    this.aRG = new short[this.aRB * paramInt2];
    this.aRH = this.aRB;
    this.aRI = new short[this.aRB * paramInt2];
    this.aRJ = 0;
    this.aRK = 0;
    this.aRP = 0;
    this.speed = 1.0F;
    this.pitch = 1.0F;
    AppMethodBeat.o(94722);
  }

  private int a(short[] paramArrayOfShort, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(94726);
    int i = 0;
    int j = 255;
    int k = 1;
    int m = 0;
    int n = paramInt1 * this.aRy;
    paramInt1 = paramInt2;
    int i1;
    int i2;
    if (paramInt1 <= paramInt3)
    {
      paramInt2 = 0;
      for (i1 = 0; i1 < paramInt1; i1++)
        paramInt2 += Math.abs(paramArrayOfShort[(n + i1)] - paramArrayOfShort[(n + paramInt1 + i1)]);
      i2 = k;
      i1 = i;
      if (paramInt2 * i < k * paramInt1)
      {
        i2 = paramInt2;
        i1 = paramInt1;
      }
      if (paramInt2 * j <= m * paramInt1)
        break label157;
      j = paramInt1;
    }
    while (true)
    {
      paramInt1++;
      m = paramInt2;
      k = i2;
      i = i1;
      break;
      this.aRR = (k / i);
      this.aRS = (m / j);
      AppMethodBeat.o(94726);
      return i;
      label157: paramInt2 = m;
    }
  }

  private static void a(int paramInt1, int paramInt2, short[] paramArrayOfShort1, int paramInt3, short[] paramArrayOfShort2, int paramInt4, short[] paramArrayOfShort3, int paramInt5)
  {
    for (int i = 0; i < paramInt2; i++)
    {
      int j = paramInt3 * paramInt2 + i;
      int k = paramInt5 * paramInt2 + i;
      int m = paramInt4 * paramInt2 + i;
      for (int n = 0; n < paramInt1; n++)
      {
        paramArrayOfShort1[j] = ((short)(short)((paramArrayOfShort2[m] * (paramInt1 - n) + paramArrayOfShort3[k] * n) / paramInt1));
        j += paramInt2;
        m += paramInt2;
        k += paramInt2;
      }
    }
  }

  private void a(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94725);
    dz(paramInt2);
    System.arraycopy(paramArrayOfShort, this.aRy * paramInt1, this.aRG, this.aRM * this.aRy, this.aRy * paramInt2);
    this.aRM += paramInt2;
    AppMethodBeat.o(94725);
  }

  private void b(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    int i = this.aRB / paramInt2;
    int j = this.aRy * paramInt2;
    int k = this.aRy;
    for (paramInt2 = 0; paramInt2 < i; paramInt2++)
    {
      int m = 0;
      int n = 0;
      while (m < j)
      {
        n += paramArrayOfShort[(paramInt2 * j + paramInt1 * k + m)];
        m++;
      }
      n /= j;
      this.aRC[paramInt2] = ((short)(short)n);
    }
  }

  private void dz(int paramInt)
  {
    AppMethodBeat.i(94723);
    if (this.aRM + paramInt > this.aRF)
    {
      this.aRF += this.aRF / 2 + paramInt;
      this.aRG = Arrays.copyOf(this.aRG, this.aRF * this.aRy);
    }
    AppMethodBeat.o(94723);
  }

  final void dA(int paramInt)
  {
    AppMethodBeat.i(94724);
    if (this.aRL + paramInt > this.aRD)
    {
      this.aRD += this.aRD / 2 + paramInt;
      this.aRE = Arrays.copyOf(this.aRE, this.aRD * this.aRy);
    }
    AppMethodBeat.o(94724);
  }

  final void qE()
  {
    AppMethodBeat.i(94727);
    int i = this.aRM;
    float f = this.speed / this.pitch;
    int j;
    int k;
    int m;
    int n;
    label163: short[] arrayOfShort1;
    if ((f > 1.00001D) || (f < 0.9999900000000001D))
    {
      if (this.aRL >= this.aRB)
      {
        j = this.aRL;
        k = 0;
        do
        {
          if (this.aRO <= 0)
            break;
          m = Math.min(this.aRB, this.aRO);
          a(this.aRE, k, m);
          this.aRO -= m;
          m = k + m;
          k = m;
        }
        while (this.aRB + m <= j);
        n = this.aRL - m;
        System.arraycopy(this.aRE, this.aRy * m, this.aRE, 0, this.aRy * n);
        this.aRL = n;
      }
      if (this.pitch == 1.0F)
        break label1245;
      f = this.pitch;
      if (this.aRM == i)
        break label1245;
      n = (int)(this.sampleRate / f);
      m = this.sampleRate;
      while ((n > 16384) || (m > 16384))
      {
        n /= 2;
        m /= 2;
      }
      arrayOfShort1 = this.aRE;
      if (this.sampleRate > 4000)
      {
        m = this.sampleRate / 4000;
        label258: if ((this.aRy != 1) || (m != 1))
          break label435;
        m = a(arrayOfShort1, k, this.aRz, this.aRA);
      }
    }
    while (true)
    {
      label290: n = this.aRR;
      int i1 = this.aRS;
      if ((n == 0) || (this.aRP == 0))
      {
        n = 0;
        label317: if (n == 0)
          break label623;
        n = this.aRP;
        label328: this.aRQ = this.aRR;
        this.aRP = m;
        if (f <= 1.0D)
          break label653;
        arrayOfShort1 = this.aRE;
        if (f < 2.0F)
          break label630;
        m = (int)(n / (f - 1.0F));
        label371: dz(m);
        a(m, this.aRy, this.aRG, this.aRM, arrayOfShort1, k, arrayOfShort1, k + n);
        this.aRM += m;
        m = k + (m + n);
        break;
        m = 1;
        break label258;
        label435: b(arrayOfShort1, k, m);
        n = a(this.aRC, 0, this.aRz / m, this.aRA / m);
        if (m == 1)
          break label1261;
        n *= m;
        i1 = n - m * 4;
        n += m * 4;
        if (i1 >= this.aRz)
          break label1254;
      }
      label653: label1184: label1245: label1254: for (m = this.aRz; ; m = i1)
      {
        if (n > this.aRA)
          n = this.aRA;
        while (true)
        {
          if (this.aRy == 1)
          {
            m = a(arrayOfShort1, k, m, n);
            break label290;
          }
          b(arrayOfShort1, k, 1);
          m = a(this.aRC, 0, m, n);
          break label290;
          if (i1 > n * 3)
          {
            n = 0;
            break label317;
          }
          if (n * 2 <= this.aRQ * 3)
          {
            n = 0;
            break label317;
          }
          n = 1;
          break label317;
          label623: n = m;
          break label328;
          label630: this.aRO = ((int)(n * (2.0F - f) / (f - 1.0F)));
          m = n;
          break label371;
          arrayOfShort1 = this.aRE;
          if (f < 0.5F);
          for (m = (int)(n * f / (1.0F - f)); ; m = n)
          {
            dz(n + m);
            System.arraycopy(arrayOfShort1, this.aRy * k, this.aRG, this.aRM * this.aRy, this.aRy * n);
            a(m, this.aRy, this.aRG, this.aRM + n, arrayOfShort1, k + n, arrayOfShort1, k);
            this.aRM += n + m;
            m = k + m;
            break;
            this.aRO = ((int)(n * (2.0F * f - 1.0F) / (1.0F - f)));
          }
          a(this.aRE, 0, this.aRL);
          this.aRL = 0;
          break label163;
          k = this.aRM - i;
          if (this.aRN + k > this.aRH)
          {
            this.aRH += this.aRH / 2 + k;
            this.aRI = Arrays.copyOf(this.aRI, this.aRH * this.aRy);
          }
          System.arraycopy(this.aRG, this.aRy * i, this.aRI, this.aRN * this.aRy, this.aRy * k);
          this.aRM = i;
          this.aRN = (k + this.aRN);
          k = 0;
          if (k < this.aRN - 1)
          {
            while ((this.aRJ + 1) * n > this.aRK * m)
            {
              dz(1);
              for (i1 = 0; i1 < this.aRy; i1++)
              {
                arrayOfShort1 = this.aRG;
                int i2 = this.aRM;
                j = this.aRy;
                short[] arrayOfShort2 = this.aRI;
                int i3 = this.aRy * k + i1;
                i = arrayOfShort2[i3];
                i3 = arrayOfShort2[(i3 + this.aRy)];
                int i4 = this.aRK;
                int i5 = this.aRJ;
                int i6 = (this.aRJ + 1) * n;
                i4 = i6 - i4 * m;
                i5 = i6 - i5 * n;
                arrayOfShort1[(i2 * j + i1)] = ((short)(short)((i3 * (i5 - i4) + i * i4) / i5));
              }
              this.aRK += 1;
              this.aRM += 1;
            }
            this.aRJ += 1;
            if (this.aRJ == m)
            {
              this.aRJ = 0;
              if (this.aRK != n)
                break label1184;
            }
            for (boolean bool = true; ; bool = false)
            {
              a.checkState(bool);
              this.aRK = 0;
              k++;
              break;
            }
          }
          m = this.aRN - 1;
          if (m != 0)
          {
            System.arraycopy(this.aRI, this.aRy * m, this.aRI, 0, (this.aRN - m) * this.aRy);
            this.aRN -= m;
          }
          AppMethodBeat.o(94727);
          return;
        }
      }
      label1261: m = n;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.k
 * JD-Core Version:    0.6.2
 */