package com.b.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class j
{
  private double[] bDC;
  final j.b bDD;
  private final j.b bDE;

  j()
  {
    AppMethodBeat.i(55621);
    this.bDC = new double[4];
    this.bDD = new j.b((byte)0);
    this.bDE = new j.b((byte)0);
    AppMethodBeat.o(55621);
  }

  private static void a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    double d = 1.0D / (paramArrayOfDouble1[0] * paramArrayOfDouble1[3] - paramArrayOfDouble1[1] * paramArrayOfDouble1[2]);
    paramArrayOfDouble2[0] = (paramArrayOfDouble1[3] * d);
    paramArrayOfDouble2[3] = (paramArrayOfDouble1[0] * d);
    paramArrayOfDouble2[1] = (-paramArrayOfDouble1[1] * d);
    paramArrayOfDouble2[2] = (d * -paramArrayOfDouble1[2]);
  }

  private static boolean a(double[][] paramArrayOfDouble1, double[][] paramArrayOfDouble2)
  {
    double[][] arrayOfDouble = new double[4][4];
    arrayOfDouble[0][0] = (paramArrayOfDouble1[1][1] * paramArrayOfDouble1[2][2] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[1][1] * paramArrayOfDouble1[2][3] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[2][1] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[2][1] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[3][1] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[2][3] - paramArrayOfDouble1[3][1] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[2][2]);
    arrayOfDouble[1][0] = (-paramArrayOfDouble1[1][0] * paramArrayOfDouble1[2][2] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[2][3] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[2][3] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[2][2]);
    arrayOfDouble[2][0] = (paramArrayOfDouble1[1][0] * paramArrayOfDouble1[2][1] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[2][3] * paramArrayOfDouble1[3][1] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[3][1] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[2][3] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[2][1]);
    arrayOfDouble[3][0] = (-paramArrayOfDouble1[1][0] * paramArrayOfDouble1[2][1] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[2][2] * paramArrayOfDouble1[3][1] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[3][1] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[2][2] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[2][1]);
    arrayOfDouble[0][1] = (-paramArrayOfDouble1[0][1] * paramArrayOfDouble1[2][2] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[0][1] * paramArrayOfDouble1[2][3] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[2][1] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[2][1] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[3][1] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[2][3] + paramArrayOfDouble1[3][1] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[2][2]);
    arrayOfDouble[1][1] = (paramArrayOfDouble1[0][0] * paramArrayOfDouble1[2][2] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[0][0] * paramArrayOfDouble1[2][3] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[2][3] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[2][2]);
    arrayOfDouble[2][1] = (-paramArrayOfDouble1[0][0] * paramArrayOfDouble1[2][1] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[0][0] * paramArrayOfDouble1[2][3] * paramArrayOfDouble1[3][1] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[3][1] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[2][3] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[2][1]);
    arrayOfDouble[3][1] = (paramArrayOfDouble1[0][0] * paramArrayOfDouble1[2][1] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[0][0] * paramArrayOfDouble1[2][2] * paramArrayOfDouble1[3][1] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[3][1] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[2][2] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[2][1]);
    arrayOfDouble[0][2] = (paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[1][1] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[1][1] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[3][1] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[1][3] - paramArrayOfDouble1[3][1] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[1][2]);
    arrayOfDouble[1][2] = (-paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[1][3] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[1][2]);
    arrayOfDouble[2][2] = (paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[3][3] - paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[3][1] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[3][3] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[3][1] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][3] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[1][1]);
    arrayOfDouble[3][2] = (-paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[3][2] + paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[3][1] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[3][2] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[3][1] - paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][2] + paramArrayOfDouble1[3][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[1][1]);
    arrayOfDouble[0][3] = (-paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[2][3] + paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[2][2] + paramArrayOfDouble1[1][1] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[2][3] - paramArrayOfDouble1[1][1] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[2][2] - paramArrayOfDouble1[2][1] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[1][3] + paramArrayOfDouble1[2][1] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[1][2]);
    arrayOfDouble[1][3] = (paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[2][3] - paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[2][2] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[2][3] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[2][2] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[1][3] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[1][2]);
    arrayOfDouble[2][3] = (-paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[2][3] + paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][3] * paramArrayOfDouble1[2][1] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[2][3] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[2][1] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][3] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][3] * paramArrayOfDouble1[1][1]);
    arrayOfDouble[3][3] = (paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][1] * paramArrayOfDouble1[2][2] - paramArrayOfDouble1[0][0] * paramArrayOfDouble1[1][2] * paramArrayOfDouble1[2][1] - paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[2][2] + paramArrayOfDouble1[1][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[2][1] + paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][1] * paramArrayOfDouble1[1][2] - paramArrayOfDouble1[2][0] * paramArrayOfDouble1[0][2] * paramArrayOfDouble1[1][1]);
    double d = paramArrayOfDouble1[0][0] * arrayOfDouble[0][0] + paramArrayOfDouble1[0][1] * arrayOfDouble[1][0] + paramArrayOfDouble1[0][2] * arrayOfDouble[2][0] + paramArrayOfDouble1[0][3] * arrayOfDouble[3][0];
    if (d == 0.0D);
    int i;
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      d = 1.0D / d;
      i = 0;
      if (i < 4)
        break;
    }
    for (int j = 0; ; j++)
    {
      if (j >= 4)
      {
        i++;
        break;
      }
      arrayOfDouble[i][j] *= d;
    }
  }

  private void aX(boolean paramBoolean)
  {
    AppMethodBeat.i(55624);
    if (this.bDD.bEt != paramBoolean)
    {
      this.bDD.bEt = paramBoolean;
      if (paramBoolean)
      {
        this.bDD.bDS = this.bDD.bEA[1];
        this.bDD.bEj = this.bDD.bEz[1];
        b(this.bDD.bDF, true);
        AppMethodBeat.o(55624);
      }
    }
    while (true)
    {
      return;
      this.bDD.bDS = this.bDD.bEA[0];
      this.bDD.bEj = this.bDD.bEz[0];
      b(this.bDD.bDF, true);
      AppMethodBeat.o(55624);
    }
  }

  private void b(double paramDouble, boolean paramBoolean)
  {
    double d1 = paramDouble - this.bDD.bDF;
    double d2 = d1 * d1;
    double d3;
    double d4;
    label97: Object localObject;
    if (paramBoolean)
    {
      this.bDD.bEp[2][2] = this.bDD.bEj;
      this.bDD.bEp[2][3] = 0.0D;
      this.bDD.bEp[3][2] = 0.0D;
      this.bDD.bEp[3][3] = this.bDD.bEj;
      if (d1 > 0.5D)
      {
        d3 = 1.0D;
        d4 = 0.0D;
        if (d4 < d1)
          break label496;
        localObject = this.bDD;
        ((j.b)localObject).bEr = (d3 * ((j.b)localObject).bEr);
      }
      this.bDD.bEo[0] += this.bDD.bEo[2] * d1;
      this.bDD.bEo[1] += this.bDD.bEo[3] * d1;
      if (!this.bDD.bEt)
        break label517;
      this.bDD.bEp[0][0] += this.bDD.bEp[2][2] * d2;
      this.bDD.bEp[0][1] += this.bDD.bEp[2][3] * d2;
      this.bDD.bEp[1][0] += this.bDD.bEp[3][2] * d2;
      this.bDD.bEp[1][1] += this.bDD.bEp[3][3] * d2;
    }
    while (true)
    {
      this.bDD.bDF = paramDouble;
      return;
      d3 = 1.0D;
      d4 = d3;
      if (d1 > 0.5D);
      for (d4 = 0.0D; ; d4 += 1.0D)
      {
        if (d4 >= d1)
        {
          d4 = d3;
          localObject = this.bDD.bEp[2];
          localObject[2] *= d4;
          localObject = this.bDD.bEp[2];
          localObject[3] *= d4;
          localObject = this.bDD.bEp[3];
          localObject[2] *= d4;
          localObject = this.bDD.bEp[3];
          localObject[3] = (d4 * localObject[3]);
          break;
        }
        d3 *= this.bDD.bDS;
      }
      label496: d3 *= this.bDD.bEs;
      d4 += 1.0D;
      break label97;
      label517: this.bDD.bEp[0][0] = (this.bDD.bEp[0][0] + (this.bDD.bEp[0][2] + this.bDD.bEp[2][0]) * d1 + this.bDD.bEp[2][2] * d2);
      this.bDD.bEp[1][1] = (this.bDD.bEp[1][1] + (this.bDD.bEp[1][3] + this.bDD.bEp[3][1]) * d1 + d2 * this.bDD.bEp[3][3]);
      this.bDD.bEp[0][2] += this.bDD.bEp[2][2] * d1;
      this.bDD.bEp[2][0] += this.bDD.bEp[2][2] * d1;
      this.bDD.bEp[1][3] += this.bDD.bEp[3][3] * d1;
      this.bDD.bEp[3][1] += d1 * this.bDD.bEp[3][3];
    }
  }

  private void b(double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(55626);
    double d3;
    double d4;
    double d5;
    int i;
    if ((this.bDD.bEm) && (this.bDD.bDW))
    {
      Object localObject = new double[2];
      double[] arrayOfDouble = new double[2];
      double d1 = this.bDD.bEy;
      localObject[0] = (this.bDD.bEo[0] - this.bDD.bDX[0]);
      localObject[1] = (this.bDD.bEo[1] - this.bDD.bDX[1]);
      paramArrayOfDouble[0] -= this.bDD.bDX[0];
      paramArrayOfDouble[1] -= this.bDD.bDX[1];
      double d2 = Math.sqrt(localObject[0] * localObject[0] + localObject[1] * localObject[1]);
      d3 = Math.sqrt(arrayOfDouble[0] * arrayOfDouble[0] + arrayOfDouble[1] * arrayOfDouble[1]);
      if ((d2 > this.bDD.bEe) && (d3 > this.bDD.bEe))
      {
        d4 = Math.atan2(localObject[1], localObject[0]);
        d5 = Math.atan2(arrayOfDouble[1], arrayOfDouble[0]) - d4;
        if (d5 <= 3.141592653589793D)
          break label370;
        d4 = d5 - 6.283185307179586D;
        localObject = this.bDD;
        ((j.b)localObject).bEq = (d1 * d4 + ((j.b)localObject).bEq);
        if (d4 * d4 <= 4.0D * this.bDD.bEr)
          break label394;
        i = 1;
        label268: d5 = Math.sqrt(this.bDD.bEp[0][0] + this.bDD.bEp[1][1]);
        if (d2 >= d3)
          break label400;
        d4 = d2;
        label308: d4 = d5 / d4;
        if (i == 0)
          break label407;
      }
    }
    label394: label400: label407: for (this.bDD.bEr = (d4 * d4); ; this.bDD.bEr = (1.0D / (1.0D / (d4 * d4) + 1.0D / this.bDD.bEr)))
    {
      this.bDD.bDX[0] = paramArrayOfDouble[0];
      this.bDD.bDX[1] = paramArrayOfDouble[1];
      this.bDD.bDW = true;
      AppMethodBeat.o(55626);
      return;
      label370: d4 = d5;
      if (d5 >= -3.141592653589793D)
        break;
      d4 = d5 + 6.283185307179586D;
      break;
      i = 0;
      break label268;
      d4 = d3;
      break label308;
    }
  }

  private void c(double paramDouble, boolean paramBoolean)
  {
    double d1 = paramDouble - this.bDE.bDF;
    double d2 = d1 * d1;
    double d3;
    double d4;
    label97: Object localObject;
    if (paramBoolean)
    {
      this.bDE.bEp[2][2] = this.bDE.bEj;
      this.bDE.bEp[2][3] = 0.0D;
      this.bDE.bEp[3][2] = 0.0D;
      this.bDE.bEp[3][3] = this.bDE.bEj;
      if (d1 > 0.5D)
      {
        d3 = 1.0D;
        d4 = 0.0D;
        if (d4 < d1)
          break label496;
        localObject = this.bDE;
        ((j.b)localObject).bEr = (d3 * ((j.b)localObject).bEr);
      }
      this.bDE.bEo[0] += this.bDE.bEo[2] * d1;
      this.bDE.bEo[1] += this.bDE.bEo[3] * d1;
      if (!this.bDE.bEt)
        break label517;
      this.bDE.bEp[0][0] += this.bDE.bEp[2][2] * d2;
      this.bDE.bEp[0][1] += this.bDE.bEp[2][3] * d2;
      this.bDE.bEp[1][0] += this.bDE.bEp[3][2] * d2;
      this.bDE.bEp[1][1] += this.bDE.bEp[3][3] * d2;
    }
    while (true)
    {
      this.bDE.bDF = paramDouble;
      return;
      d4 = 1.0D;
      d3 = d4;
      if (d1 > 0.5D);
      for (d3 = 0.0D; ; d3 += 1.0D)
      {
        if (d3 >= d1)
        {
          d3 = d4;
          localObject = this.bDE.bEp[2];
          localObject[2] *= d3;
          localObject = this.bDE.bEp[2];
          localObject[3] *= d3;
          localObject = this.bDE.bEp[3];
          localObject[2] *= d3;
          localObject = this.bDE.bEp[3];
          localObject[3] = (d3 * localObject[3]);
          break;
        }
        d4 *= this.bDE.bDS;
      }
      label496: d3 *= this.bDE.bEs;
      d4 += 1.0D;
      break label97;
      label517: this.bDE.bEp[0][0] = (this.bDE.bEp[0][0] + (this.bDE.bEp[0][2] + this.bDE.bEp[2][0]) * d1 + this.bDE.bEp[2][2] * d2);
      this.bDE.bEp[1][1] = (this.bDE.bEp[1][1] + (this.bDE.bEp[1][3] + this.bDE.bEp[3][1]) * d1 + d2 * this.bDE.bEp[3][3]);
      this.bDE.bEp[0][2] += this.bDE.bEp[2][2] * d1;
      this.bDE.bEp[2][0] += this.bDE.bEp[2][2] * d1;
      this.bDE.bEp[1][3] += this.bDE.bEp[3][3] * d1;
      this.bDE.bEp[3][1] += d1 * this.bDE.bEp[3][3];
    }
  }

  final void a(int paramInt, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    AppMethodBeat.i(55627);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(55627);
      while (true)
      {
        return;
        paramArrayOfDouble2[0] = ((paramArrayOfDouble1[1] - this.bDD.bEk[1]) * 6378137.0D * Math.cos(this.bDD.bEk[0]));
        paramArrayOfDouble2[1] = ((paramArrayOfDouble1[0] - this.bDD.bEk[0]) * 6378137.0D);
        AppMethodBeat.o(55627);
      }
      paramArrayOfDouble2[0] = (paramArrayOfDouble1[1] / 6378137.0D + this.bDD.bEk[0]);
      paramArrayOfDouble2[1] = (paramArrayOfDouble1[0] / (Math.cos(this.bDD.bEk[0]) * 6378137.0D) + this.bDD.bEk[1]);
    }
  }

  protected final void a(long paramLong, double paramDouble1, double paramDouble2, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(55622);
    double d1 = paramLong;
    double d2 = paramFloat * paramFloat;
    double[] arrayOfDouble1 = new double[2];
    double[] tmp24_22 = arrayOfDouble1;
    tmp24_22[0] = 0.0D;
    double[] tmp28_24 = tmp24_22;
    tmp28_24[1] = 0.0D;
    tmp28_24;
    if (paramBoolean1);
    for (int i = 3; ; i = 5)
    {
      double[] arrayOfDouble2 = new double[2];
      arrayOfDouble2[0] = paramDouble1;
      arrayOfDouble2[1] = paramDouble2;
      this.bDD.bEt = true;
      this.bDD.bEA[0] = 3.0D;
      this.bDD.bEA[1] = 1.2D;
      this.bDD.bEy = 0.5D;
      this.bDD.bDS = 1.2D;
      this.bDD.bDY = 4.0D;
      this.bDD.bDZ = 0;
      this.bDD.bEb = true;
      this.bDD.bEa = i;
      this.bDD.bDT = false;
      this.bDD.bDW = false;
      this.bDD.bEh = 40.0D;
      this.bDD.bEi = 0.1570796326794897D;
      this.bDD.bEj = 1.0D;
      this.bDD.bEz[0] = 400.0D;
      this.bDD.bEz[1] = 1.0D;
      this.bDD.bEm = paramBoolean2;
      this.bDD.bEn = false;
      this.bDD.bEc = true;
      this.bDD.bEd = 0.3333333333333333D;
      this.bDD.bEe = 5.0D;
      this.bDD.bEf = 0.5D;
      this.bDD.bEg = 1.0D;
      this.bDD.bEu = 0.5D;
      this.bDD.bEv = 1.0D;
      this.bDD.bEw = 0;
      this.bDD.bEx = 2;
      this.bDD.bEB = false;
      this.bDD.bEk[0] = arrayOfDouble2[0];
      this.bDD.bEk[1] = arrayOfDouble2[1];
      arrayOfDouble2 = new double[2];
      a(0, new double[] { paramDouble1, paramDouble2 }, arrayOfDouble2);
      this.bDD.bDF = d1;
      this.bDD.bEo[0] = arrayOfDouble2[0];
      this.bDD.bEo[1] = arrayOfDouble2[1];
      this.bDD.bEo[2] = arrayOfDouble1[0];
      this.bDD.bEo[3] = arrayOfDouble1[1];
      this.bDD.bEq = 0.0D;
      this.bDD.bEr = 1.0D;
      this.bDD.bEs = 1.005D;
      this.bDD.bEp[0][0] = tmp24_22;
      this.bDD.bEp[0][1] = 0.0D;
      this.bDD.bEp[0][2] = 0.0D;
      this.bDD.bEp[0][3] = 0.0D;
      this.bDD.bEp[1][0] = 0.0D;
      this.bDD.bEp[1][1] = tmp24_22;
      this.bDD.bEp[1][2] = 0.0D;
      this.bDD.bEp[1][3] = 0.0D;
      this.bDD.bEp[2][0] = 0.0D;
      this.bDD.bEp[2][1] = 0.0D;
      this.bDD.bEp[2][2] = 1.0D;
      this.bDD.bEp[2][3] = 0.0D;
      this.bDD.bEp[3][0] = 0.0D;
      this.bDD.bEp[3][1] = 0.0D;
      this.bDD.bEp[3][2] = 0.0D;
      this.bDD.bEp[3][3] = 1.0D;
      aW(paramBoolean1);
      AppMethodBeat.o(55622);
      return;
    }
  }

  protected final void a(j.a parama)
  {
    AppMethodBeat.i(55625);
    if (parama.bDK <= 0.0D)
      AppMethodBeat.o(55625);
    double d1;
    while (true)
    {
      return;
      if (!this.bDD.bDT)
        break label80;
      d1 = parama.bDF - this.bDD.bDV;
      if (d1 >= -10.0D)
        break;
      AppMethodBeat.o(55625);
    }
    if (d1 <= 0.0D)
      parama.bDF = (this.bDD.bDV + 0.5D);
    label80: double[] arrayOfDouble = new double[2];
    a(0, new double[] { parama.bDG, parama.bDH }, arrayOfDouble);
    parama.bDI[0] = arrayOfDouble[0];
    parama.bDI[1] = arrayOfDouble[1];
    Object localObject1;
    Object localObject2;
    double d3;
    double d4;
    double d5;
    label350: Object localObject3;
    label1165: label1173: label1181: int i;
    if (this.bDD.bEt)
    {
      double d2;
      if ((parama.mType != 3) || (this.bDD.bDT))
      {
        if (parama.mType != 3)
          break label1181;
        d2 = parama.bDF - this.bDD.bDV;
        if (d2 > 0.0D)
        {
          localObject1 = new double[2][2];
          localObject2 = new double[2];
          d3 = arrayOfDouble[0] - this.bDD.bDU[0];
          d4 = arrayOfDouble[1] - this.bDD.bDU[1];
          d5 = d4;
          d1 = d3;
          if (this.bDD.bEm)
          {
            d1 = d3 * Math.cos(this.bDD.bEq) - Math.sin(this.bDD.bEq) * d4;
            d5 = Math.sin(this.bDD.bEq);
            d5 = d4 * Math.cos(this.bDD.bEq) + d5 * d1;
          }
          d3 = Math.sqrt(d1 * d1 + d5 * d5);
          d4 = d3 / this.bDD.bEh;
          d4 *= d4;
          if (d4 <= 0.0625D)
            break label1165;
          d3 *= this.bDD.bEi;
          d3 *= d3;
          if (d3 <= 0.0625D)
            break label1173;
        }
      }
      while (true)
      {
        d4 = (d4 + d3) / d2;
        double d6 = this.bDD.bEp[2][2];
        double d7 = this.bDD.bEp[2][3];
        d3 = this.bDD.bEp[3][2];
        double d8 = this.bDD.bEp[3][3];
        localObject3 = this.bDC;
        a(new double[] { d6, d7, d3, d8 }, (double[])localObject3);
        localObject1[0][0] = this.bDC[0];
        localObject1[0][1] = this.bDC[1];
        localObject1[1][0] = this.bDC[2];
        localObject1[1][1] = this.bDC[3];
        d7 = d1 / d2 - this.bDD.bEo[2];
        d8 = d5 / d2 - this.bDD.bEo[3];
        d6 = localObject1[0][0];
        d3 = localObject1[0][1];
        if (Math.sqrt(d7 * d8 * localObject1[1][0] + (d7 * d7 * d6 + d7 * d8 * d3) + d8 * d8 * localObject1[1][1]) > 2.0D)
        {
          this.bDD.bEp[2][2] = this.bDD.bEj;
          this.bDD.bEp[2][3] = 0.0D;
          this.bDD.bEp[3][2] = 0.0D;
          this.bDD.bEp[3][3] = this.bDD.bEj;
          localObject1[0][0] = (1.0D / this.bDD.bEj);
          localObject1[0][1] = 0.0D;
          localObject1[1][0] = 0.0D;
          localObject1[1][1] = (1.0D / this.bDD.bEj);
        }
        localObject2[0] = (localObject1[0][0] * this.bDD.bEo[2] + localObject1[0][1] * this.bDD.bEo[3]);
        localObject2[1] = (localObject1[1][0] * this.bDD.bEo[2] + localObject1[1][1] * this.bDD.bEo[3]);
        localObject3 = localObject1[0];
        localObject3[0] += 1.0D / d4;
        localObject3 = localObject1[1];
        localObject3[1] += 1.0D / d4;
        d3 = localObject2[0];
        localObject2[0] = (d1 / (d2 * d4) + d3);
        d1 = localObject2[1];
        localObject2[1] = (d5 / (d4 * d2) + d1);
        d5 = localObject1[0][0];
        d4 = localObject1[0][1];
        d1 = localObject1[1][0];
        d3 = localObject1[1][1];
        localObject1 = this.bDC;
        a(new double[] { d5, d4, d1, d3 }, (double[])localObject1);
        this.bDD.bEp[2][2] = this.bDC[0];
        this.bDD.bEp[2][3] = this.bDC[1];
        this.bDD.bEp[3][2] = this.bDC[2];
        this.bDD.bEp[3][3] = this.bDC[3];
        this.bDD.bEo[2] = (this.bDD.bEp[2][2] * localObject2[0] + this.bDD.bEp[2][3] * localObject2[1]);
        this.bDD.bEo[3] = (this.bDD.bEp[3][2] * localObject2[0] + this.bDD.bEp[3][3] * localObject2[1]);
        b(parama.bDF, false);
        if (parama.mType != 3)
          break label4261;
        this.bDD.bDU[0] = arrayOfDouble[0];
        this.bDD.bDU[1] = arrayOfDouble[1];
        this.bDD.bDV = parama.bDF;
        this.bDD.bDT = true;
        AppMethodBeat.o(55625);
        break;
        d4 = 0.0625D;
        break label350;
        d3 = 0.0625D;
      }
      d1 = 0.0D;
      d5 = 0.0D;
      localObject1 = new double[2];
      localObject2 = new double[2];
      b(parama.bDF, false);
      if (this.bDD.bEc)
      {
        if (!this.bDD.bDW)
        {
          i = 1;
          j = 1;
          label1231: if (i == 0)
            break label2032;
          if (this.bDD.bDW)
          {
            if (d1 >= d5)
              break label2034;
            d4 = this.bDD.bEf;
            label1262: d1 = d4 + d5 / d1 * (1.0D - d4);
            arrayOfDouble[0] = (this.bDD.bDX[0] + localObject2[0] * d1);
            d5 = this.bDD.bDX[1];
            arrayOfDouble[1] = (d1 * localObject2[1] + d5);
          }
          if (j == 0)
            break label2046;
          b(arrayOfDouble);
        }
        while (true)
        {
          this.bDD.bEo[0] = arrayOfDouble[0];
          this.bDD.bEo[1] = arrayOfDouble[1];
          this.bDD.bEp[0][0] = (parama.bDK * parama.bDK);
          this.bDD.bEp[0][1] = 0.0D;
          this.bDD.bEp[1][0] = 0.0D;
          this.bDD.bEp[1][1] = (parama.bDK * parama.bDK);
          break;
          localObject1[0] = (this.bDD.bEo[0] - this.bDD.bDX[0]);
          localObject1[1] = (this.bDD.bEo[1] - this.bDD.bDX[1]);
          arrayOfDouble[0] -= this.bDD.bDX[0];
          arrayOfDouble[1] -= this.bDD.bDX[1];
          d3 = Math.sqrt(localObject1[0] * localObject1[0] + localObject1[1] * localObject1[1]);
          d4 = Math.sqrt(localObject2[0] * localObject2[0] + localObject2[1] * localObject2[1]);
          if ((d4 > this.bDD.bEe) && (d3 > this.bDD.bEe))
          {
            d1 = d4 / d3;
            d5 = d4 - d3;
            d2 = Math.sqrt(this.bDD.bEp[0][0] + this.bDD.bEp[1][1]);
            if (d3 > 3.0D * this.bDD.bEe)
            {
              d1 = d5;
              if (d5 < 0.0D)
                d1 = -d5;
              d2 = d1 / d2;
              d1 = Math.atan2(localObject1[1], localObject1[0]);
              d5 = Math.atan2(localObject2[1], localObject2[0]) - d1;
              if (d5 > 3.141592653589793D)
              {
                d1 = d5 - 6.283185307179586D;
                label1700: d5 = d1;
                if (d1 < 0.0D)
                  d5 = -d1;
                d1 = d5 / Math.sqrt(this.bDD.bEr);
                d5 = Math.sqrt(d1 * d1 + d2 * d2);
                if (d5 >= this.bDD.bDY)
                  break label1815;
                this.bDD.bEw = 0;
                d1 = d5;
              }
              while (true)
              {
                if (d1 <= this.bDD.bDY)
                  break label1882;
                i = 0;
                j = 0;
                d5 = d3;
                d1 = d4;
                break;
                d1 = d5;
                if (d5 >= -3.141592653589793D)
                  break label1700;
                d1 = d5 + 6.283185307179586D;
                break label1700;
                label1815: d1 = d5;
                if (d2 < this.bDD.bDY)
                {
                  localObject1 = this.bDD;
                  i = ((j.b)localObject1).bEw + 1;
                  ((j.b)localObject1).bEw = i;
                  d1 = d5;
                  if (i >= this.bDD.bEx)
                  {
                    this.bDD.bEw = 0;
                    d1 = d2;
                  }
                }
              }
              label1882: i = 1;
              j = 1;
              d5 = d3;
              d1 = d4;
              break label1231;
            }
            if ((d1 < this.bDD.bEd) || (1.0D / d1 < this.bDD.bEd))
            {
              i = 0;
              j = 0;
              d5 = d3;
              d1 = d4;
              break label1231;
            }
            i = 1;
            j = 0;
            d5 = d3;
            d1 = d4;
            break label1231;
          }
          if (((d4 < this.bDD.bEe) && (parama.mType == 2)) || ((d4 < this.bDD.bEe * 0.5D) && (parama.mType == 1)))
          {
            i = 0;
            j = 0;
            d5 = d3;
            d1 = d4;
            break label1231;
          }
          i = 1;
          j = 0;
          d5 = d3;
          d1 = d4;
          break label1231;
          label2032: break;
          label2034: d4 = this.bDD.bEg;
          break label1262;
          label2046: this.bDD.bDX[0] = arrayOfDouble[0];
          this.bDD.bDX[1] = arrayOfDouble[1];
        }
      }
      j.b.a(this.bDE, this.bDD);
      c(parama.bDF, false);
      if (this.bDE.bEb)
        if (!this.bDD.bDW)
        {
          d1 = 0.0D;
          label2117: if (d1 <= this.bDD.bDY)
            break label3132;
          j.b.a(this.bDE, this.bDD);
          c(parama.bDF, true);
          if (!this.bDD.bEb)
            break label2856;
          d3 = this.bDD.bDX[0] - this.bDE.bEo[0];
          d4 = this.bDD.bDX[1] - this.bDE.bEo[1];
          d5 = this.bDD.bDX[0] - arrayOfDouble[0];
          d1 = this.bDD.bDX[1] - arrayOfDouble[1];
          d4 = Math.sqrt(d3 * d3 + d4 * d4);
          d1 = Math.sqrt(d5 * d5 + d1 * d1);
          d5 = Math.sqrt(this.bDE.bEp[0][0] * this.bDE.bEp[0][0] + this.bDE.bEp[1][1] * this.bDE.bEp[1][1]);
          d1 = Math.abs(d4 - d1) / d5;
          label2324: if (d1 <= this.bDE.bDY)
            break label3104;
          if (this.bDD.bDZ >= this.bDD.bEa)
            break label3082;
          this.bDD.bDZ += 1;
        }
      while (true)
      {
        this.bDD.bEo[0] = arrayOfDouble[0];
        this.bDD.bEo[1] = arrayOfDouble[1];
        this.bDD.bEp[0][0] = (parama.bDK * parama.bDK);
        this.bDD.bEp[0][1] = 0.0D;
        this.bDD.bEp[1][0] = 0.0D;
        this.bDD.bEp[1][1] = (parama.bDK * parama.bDK);
        break;
        d4 = this.bDD.bDX[0] - this.bDE.bEo[0];
        d3 = this.bDD.bDX[1] - this.bDE.bEo[1];
        d5 = this.bDD.bDX[0] - arrayOfDouble[0];
        d1 = this.bDD.bDX[1] - arrayOfDouble[1];
        d4 = Math.sqrt(d4 * d4 + d3 * d3);
        d1 = Math.sqrt(d5 * d5 + d1 * d1);
        d5 = Math.sqrt(this.bDD.bEp[0][0] * this.bDD.bEp[0][0] + this.bDD.bEp[1][1] * this.bDD.bEp[1][1]);
        d1 = Math.abs(d4 - d1) / d5;
        break label2117;
        d5 = arrayOfDouble[0] - this.bDE.bEo[0];
        d1 = arrayOfDouble[1] - this.bDE.bEo[1];
        localObject2 = new double[2][2];
        d4 = 1.0D / (this.bDE.bEp[0][0] * this.bDE.bEp[1][1] - this.bDE.bEp[0][1] * this.bDE.bEp[1][0]);
        localObject2[0][0] = (this.bDE.bEp[1][1] * d4);
        localObject2[1][1] = (this.bDE.bEp[0][0] * d4);
        localObject2[0][1] = (-this.bDE.bEp[0][1] * d4);
        localObject2[1][0] = (d4 * -this.bDE.bEp[1][0]);
        d4 = localObject2[0][0];
        d3 = localObject2[1][0];
        d1 = Math.sqrt(localObject2[1][1] * (d1 * d1) + (d5 * 2.0D * d1 * d3 + d5 * d5 * d4));
        break label2117;
        label2856: d5 = arrayOfDouble[0] - this.bDE.bEo[0];
        d1 = arrayOfDouble[1] - this.bDE.bEo[1];
        localObject2 = new double[2][2];
        d4 = 1.0D / (this.bDE.bEp[0][0] * this.bDE.bEp[1][1] - this.bDE.bEp[0][1] * this.bDE.bEp[1][0]);
        localObject2[0][0] = (this.bDE.bEp[1][1] * d4);
        localObject2[1][1] = (this.bDE.bEp[0][0] * d4);
        localObject2[0][1] = (-this.bDE.bEp[0][1] * d4);
        localObject2[1][0] = (d4 * -this.bDE.bEp[1][0]);
        d4 = localObject2[0][0];
        d3 = localObject2[1][0];
        d1 = Math.sqrt(localObject2[1][1] * (d1 * d1) + (d5 * 2.0D * d1 * d3 + d5 * d5 * d4));
        break label2324;
        label3082: j.b.a(this.bDD, this.bDE);
        this.bDD.bDZ = 0;
        continue;
        label3104: j.b.a(this.bDD, this.bDE);
        this.bDD.bDZ = 0;
        b(arrayOfDouble);
        continue;
        label3132: j.b.a(this.bDD, this.bDE);
        this.bDD.bDZ = 0;
        b(arrayOfDouble);
      }
    }
    if (parama.mType != 3)
    {
      j = 0;
      localObject3 = new double[2];
      localObject1 = new double[2];
      arrayOfDouble = new double[2];
      b(parama.bDF, false);
      if (!this.bDD.bDW)
      {
        i = 1;
        j = 0;
        this.bDD.bDZ = 0;
      }
      while (true)
        if (i != 0)
        {
          if (j == 0)
          {
            this.bDD.bEo[0] = parama.bDI[0];
            this.bDD.bEo[1] = parama.bDI[1];
            this.bDD.bEo[2] = 0.0D;
            this.bDD.bEo[3] = 0.0D;
            this.bDD.bEp[0][0] = (parama.bDK * parama.bDK);
            this.bDD.bEp[0][1] = 0.0D;
            this.bDD.bEp[0][2] = 0.0D;
            this.bDD.bEp[0][3] = 0.0D;
            this.bDD.bEp[1][0] = 0.0D;
            this.bDD.bEp[1][1] = this.bDD.bEp[0][0];
            this.bDD.bEp[1][2] = 0.0D;
            this.bDD.bEp[1][2] = 0.0D;
            this.bDD.bEp[2][0] = 0.0D;
            this.bDD.bEp[2][1] = 0.0D;
            this.bDD.bEp[2][2] = this.bDD.bEj;
            this.bDD.bEp[2][3] = 0.0D;
            this.bDD.bEp[3][0] = 0.0D;
            this.bDD.bEp[3][1] = 0.0D;
            this.bDD.bEp[3][2] = 0.0D;
            this.bDD.bEp[3][3] = this.bDD.bEj;
            this.bDD.bDX[0] = parama.bDI[0];
            this.bDD.bDX[1] = parama.bDI[1];
            this.bDD.bDW = true;
            AppMethodBeat.o(55625);
            break;
            double[][] arrayOfDouble1 = new double[2][2];
            localObject3[0] = (parama.bDI[0] - this.bDD.bEo[0]);
            localObject3[1] = (parama.bDI[1] - this.bDD.bEo[1]);
            d4 = this.bDD.bEp[0][0];
            d1 = this.bDD.bEp[0][1];
            d5 = this.bDD.bEp[1][0];
            d3 = this.bDD.bEp[1][1];
            localObject2 = this.bDC;
            a(new double[] { d4, d1, d5, d3 }, (double[])localObject2);
            arrayOfDouble1[0][0] = this.bDC[0];
            arrayOfDouble1[0][1] = this.bDC[1];
            arrayOfDouble1[1][0] = this.bDC[2];
            arrayOfDouble1[1][1] = this.bDC[3];
            if (Math.sqrt(localObject3[0] * localObject3[0] * arrayOfDouble1[0][0] + 2.0D * localObject3[0] * localObject3[1] * arrayOfDouble1[1][0] + localObject3[1] * localObject3[1] * arrayOfDouble1[1][1]) > this.bDD.bDY)
            {
              localObject2 = this.bDD;
              i = ((j.b)localObject2).bDZ + 1;
              ((j.b)localObject2).bDZ = i;
              if (i >= this.bDD.bEa)
              {
                i = 1;
                j = 0;
                this.bDD.bDZ = 0;
                continue;
              }
              i = 0;
              continue;
            }
            this.bDD.bDZ = 0;
            i = 1;
            j = 1;
            continue;
          }
          localObject3 = new double[4][4];
          localObject2 = new double[2];
          localObject1[0] = (this.bDD.bEo[0] - this.bDD.bDX[0]);
          localObject1[1] = (this.bDD.bEo[1] - this.bDD.bDX[1]);
          arrayOfDouble[0] = (parama.bDI[0] - this.bDD.bDX[0]);
          arrayOfDouble[1] = (parama.bDI[1] - this.bDD.bDX[1]);
          d5 = Math.sqrt(arrayOfDouble[0] * arrayOfDouble[0] + arrayOfDouble[1] * arrayOfDouble[1]);
          d3 = localObject1[0];
          d4 = localObject1[0];
          d1 = localObject1[1];
          d3 = Math.sqrt(localObject1[1] * d1 + d3 * d4);
          if (d5 >= d3)
            break label4269;
          d1 = this.bDD.bEu;
          label4042: if (a(this.bDD.bEp, (double[][])localObject3))
          {
            d4 = 1.0D / (parama.bDK * parama.bDK);
            localObject1 = new double[4];
            if (!this.bDD.bEB)
              break label4280;
            d5 = d1 + d3 / d5 * (1.0D - d1);
            localObject2[0] = (this.bDD.bDX[0] + arrayOfDouble[0] * d5);
            d1 = this.bDD.bDX[1];
            localObject2[1] = (d5 * arrayOfDouble[1] + d1);
          }
        }
    }
    while (true)
    {
      i = 0;
      if (i < 4)
        break label4339;
      parama = localObject3[0];
      parama[0] += d4;
      parama = localObject3[1];
      parama[1] += d4;
      if (a((double[][])localObject3, this.bDD.bEp))
      {
        localObject1[0] += localObject2[0] * d4;
        localObject1[1] += localObject2[1] * d4;
        i = 0;
        if (i < 4)
          break label4396;
        this.bDD.bDX[0] = localObject2[0];
        this.bDD.bDX[1] = localObject2[1];
      }
      label4261: AppMethodBeat.o(55625);
      break;
      label4269: d1 = this.bDD.bEv;
      break label4042;
      label4280: localObject2[0] = (this.bDD.bEo[0] * (1.0D - d1) + parama.bDI[0] * d1);
      d5 = this.bDD.bEo[1];
      localObject2[1] = (d1 * parama.bDI[1] + d5 * (1.0D - d1));
    }
    label4339: localObject1[i] = 0.0D;
    for (int j = 0; ; j++)
    {
      if (j >= 4)
      {
        i++;
        break;
      }
      localObject1[i] += localObject3[i][j] * this.bDD.bEo[j];
    }
    label4396: this.bDD.bEo[i] = 0.0D;
    for (j = 0; ; j++)
    {
      if (j >= 4)
      {
        i++;
        break;
      }
      parama = this.bDD.bEo;
      parama[i] += this.bDD.bEp[i][j] * localObject1[j];
    }
  }

  protected final void aW(boolean paramBoolean)
  {
    AppMethodBeat.i(55623);
    if (paramBoolean);
    for (paramBoolean = false; ; paramBoolean = true)
    {
      aX(paramBoolean);
      AppMethodBeat.o(55623);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.b.a.a.j
 * JD-Core Version:    0.6.2
 */