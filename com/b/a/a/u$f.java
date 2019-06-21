package com.b.a.a;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class u$f
{
  private ArrayList<u.b> bIc;
  private u.f.a[] bId;
  private int bIe;
  private float[][] bIf;
  private float[][] bIg;
  private float[][] bIh;
  private int[] bIi;
  private int bIj;
  private int bIk;
  private int bIl;

  private u$f(u paramu)
  {
    AppMethodBeat.i(55634);
    this.bIc = new ArrayList();
    this.bId = new u.f.a[5];
    this.bIe = 0;
    paramu = new float[] { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F };
    float[] arrayOfFloat = { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F };
    this.bIf = new float[][] { paramu, { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F }, arrayOfFloat };
    this.bIg = new float[][] { { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F }, { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F }, { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F } };
    this.bIh = new float[3][3];
    this.bIi = new int[6];
    this.bIj = 5;
    this.bIk = -1;
    this.bIl = 0;
    AppMethodBeat.o(55634);
  }

  private void a(u.f.a parama)
  {
    try
    {
      AppMethodBeat.i(55638);
      System.arraycopy(this.bId, 1, this.bId, 0, 4);
      if ((this.bId[4] != null) && (SystemClock.elapsedRealtime() - parama.bIq > 1000L))
      {
        u.f.a locala = this.bId[4];
        locala.x = ((locala.x + parama.x) / 2.0F);
        locala.y = ((locala.y + parama.y) / 2.0F);
        locala.z = ((locala.z + parama.z) / 2.0F);
        locala.bIm = Math.round((locala.bIm + parama.bIm) / 2.0F);
        locala.bIn = ((locala.bIn + parama.bIn) / 2.0F);
        locala.bIo = ((locala.bIo + parama.bIo) / 2.0F);
        locala.bIq = parama.bIq;
        locala.bIp = parama.bIp;
        AppMethodBeat.o(55638);
      }
      while (true)
      {
        return;
        this.bId[4] = parama;
        AppMethodBeat.o(55638);
      }
    }
    finally
    {
    }
    throw parama;
  }

  private boolean wy()
  {
    try
    {
      AppMethodBeat.i(55636);
      boolean bool;
      if (this.bIe >= 20)
      {
        float[] arrayOfFloat = this.bIf[0];
        arrayOfFloat[2] /= 20.0F;
        arrayOfFloat = this.bIf[1];
        arrayOfFloat[2] /= 20.0F;
        arrayOfFloat = this.bIf[2];
        arrayOfFloat[2] /= 20.0F;
        arrayOfFloat = this.bIg[0];
        arrayOfFloat[2] /= 20.0F;
        arrayOfFloat = this.bIg[1];
        arrayOfFloat[2] /= 20.0F;
        arrayOfFloat = this.bIg[2];
        arrayOfFloat[2] /= 20.0F;
        float f1 = this.bIg[0][2];
        float f2 = this.bIf[0][0];
        float f3 = this.bIf[0][2];
        float f4 = this.bIf[0][2];
        float f5 = this.bIf[0][1];
        float f6 = this.bIg[1][2];
        float f7 = this.bIf[1][0];
        float f8 = this.bIf[1][2];
        float f9 = this.bIf[1][2];
        float f10 = this.bIf[1][1];
        float f11 = this.bIg[2][2];
        float f12 = this.bIf[2][0];
        float f13 = this.bIf[2][2];
        float f14 = this.bIf[2][2];
        float f15 = this.bIf[2][1];
        this.bIh[0][0] = (f1 * 0.33F + 0.67F * this.bIh[0][0]);
        this.bIh[0][1] = ((f2 - f3) * 0.33F + 0.67F * this.bIh[0][1]);
        this.bIh[0][2] = ((f4 - f5) * 0.33F + 0.67F * this.bIh[0][2]);
        this.bIh[1][0] = (0.67F * this.bIh[1][0] + f6 * 0.33F);
        this.bIh[1][1] = (0.67F * this.bIh[1][1] + 0.33F * (f7 - f8));
        this.bIh[1][2] = (0.67F * this.bIh[1][2] + 0.33F * (f9 - f10));
        this.bIh[2][0] = (0.67F * this.bIh[2][0] + 0.33F * f11);
        this.bIh[2][1] = (0.67F * this.bIh[2][1] + 0.33F * (f12 - f13));
        this.bIh[2][2] = (0.67F * this.bIh[2][2] + 0.33F * (f14 - f15));
        a(wz());
        this.bIe = 0;
        this.bIf = new float[][] { { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F }, { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F }, { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F } };
        this.bIg = new float[][] { { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F }, { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F }, { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F } };
        if (this.bIc.size() >= 100)
        {
          this.bIc.subList(0, 20).clear();
          this.bIc.trimToSize();
        }
        bool = true;
        AppMethodBeat.o(55636);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(55636);
      }
    }
    finally
    {
    }
  }

  private u.f.a wz()
  {
    int i;
    int j;
    u.f.a locala;
    int m;
    Object localObject3;
    Object localObject5;
    float f1;
    float f2;
    float f4;
    float f6;
    float f7;
    float f8;
    float f9;
    float f10;
    label444: float f11;
    label1330: label1337: label1344: label1350: label1357: label1380: float f12;
    label1391: float f13;
    while (true)
    {
      int k;
      Object localObject4;
      float f3;
      try
      {
        AppMethodBeat.i(55637);
        Object localObject1;
        if (this.bIl == 0)
        {
          i = 1;
          if (i == 0)
            continue;
          if (Math.abs(this.bIh[2][0]) < 9.300000000000001D)
          {
            j = 5;
            this.bIj = j;
            this.bIi = new int[6];
            k = 0;
            if ((this.bIk >= 0) && (this.bIk <= 5))
              this.bIj = this.bIk;
            locala = new com/b/a/a/u$f$a;
            locala.<init>(this, (byte)0);
            localObject1 = new com/b/a/a/u$f$a;
            ((u.f.a)localObject1).<init>(this, (byte)0);
            if (this.bId[0] != null)
            {
              locala.bIq = this.bId[0].bIq;
              locala.bIn = this.bId[0].bIn;
            }
            if (this.bId[4] != null)
            {
              ((u.f.a)localObject1).bIq = this.bId[4].bIq;
              ((u.f.a)localObject1).bIn = this.bId[4].bIn;
            }
            if (!this.bIc.isEmpty())
            {
              m = this.bIc.size();
              localObject3 = new float[6];
              localObject4 = new float[6];
              localObject5 = this.bIc.iterator();
              f1 = 0.0F;
              f2 = 0.0F;
              if (((Iterator)localObject5).hasNext())
                continue;
              f3 = f2 / m;
              f4 = f1 / m;
              if (k != 0)
                break label1330;
              f5 = f3;
              localObject5 = new float[6];
              localObject5[0] = ((float)Math.atan2(localObject3[0], localObject4[0]));
              localObject5[1] = ((float)Math.atan2(localObject3[1], localObject4[1]));
              localObject5[2] = ((float)Math.atan2(localObject3[2], localObject4[2]));
              localObject5[3] = ((float)Math.atan2(localObject3[3], localObject4[3]));
              localObject5[4] = ((float)Math.atan2(localObject3[4], localObject4[4]));
              localObject5[5] = ((float)Math.atan2(localObject3[5], localObject4[5]));
              if (k != 0)
                break label1337;
              f6 = f3;
              f7 = 0.0F;
              if (k != 0)
                break label1344;
              f2 = 1.2F;
              if (i == 0)
                break label1350;
              f8 = 0.08726647F;
              localObject4 = this.bIc.iterator();
              f1 = f4;
              f9 = 0.0F;
              f10 = 0.0F;
              j = 0;
              if (((Iterator)localObject4).hasNext())
                break label1357;
              if (locala.bIm > 0)
              {
                if (k != 0)
                  break label1948;
                f1 = 0.0F;
                f2 = f7 / locala.bIm;
                f11 = locala.bIn;
                f2 = f1 + ((f2 - f5) / 15.0F + 0.537F);
                f1 = f2;
                if (f11 != 0.0F)
                  f1 = f2 * 0.67F + 0.33F * f11;
                locala.bIn = f1;
                locala.x *= locala.bIn;
                locala.y *= locala.bIn;
                locala.bIo = (locala.bIm * locala.bIn);
              }
            }
            locala.bIp = (locala.bIo / (this.bIc.size() / 20));
            if (this.bId[0] != null)
            {
              locala.x += this.bId[0].x;
              locala.y += this.bId[0].y;
              locala.z += this.bId[0].z;
              locala.bIm += this.bId[0].bIm;
              locala.bIo += this.bId[0].bIo;
            }
            if ((this.bId[4] != null) && (((u.f.a)localObject1).bIm > 0))
            {
              this.bId[4].x = ((this.bId[4].x + locala.x + ((u.f.a)localObject1).x * locala.bIn) / 2.0F);
              this.bId[4].y = ((this.bId[4].y + locala.y + ((u.f.a)localObject1).y * locala.bIn) / 2.0F);
            }
            AppMethodBeat.o(55637);
            return locala;
          }
        }
        else
        {
          i = 0;
          continue;
        }
        j = 2;
        continue;
        if ((Math.abs(this.bIh[0][0]) >= 7.0F) && ((this.bIh[1][1] >= 2.3F) || (this.bIh[1][2] >= 2.3F)))
        {
          j = 1;
          if (j == 0)
            continue;
          this.bIj = 2;
          this.bIi = new int[6];
          k = j;
          continue;
        }
        j = 0;
        continue;
        f1 = Math.abs(this.bIh[0][0]);
        f11 = Math.abs(this.bIh[1][0]);
        f2 = Math.abs(this.bIh[2][0]);
        int n;
        int i1;
        if (f1 > f11)
        {
          if (f1 > f2)
          {
            k = 0;
            f1 = 0.0F;
            n = 0;
            i1 = 0;
            m = 0;
            if (m < 3)
              continue;
            k = n * 2 + i1 - 1;
            localObject1 = this.bIi;
            localObject1[k] += 1;
            k = 0;
            if (k <= 5)
              continue;
            k = j;
            continue;
          }
          k = 2;
          continue;
        }
        if (f11 > f2)
        {
          k = 1;
          continue;
        }
        k = 2;
        continue;
        int i2 = i1;
        int i3 = n;
        f2 = f1;
        if (m != k)
        {
          i2 = 1;
          i3 = n;
          n = i2;
          if (n >= 3)
          {
            f2 = f1;
            i2 = i1;
          }
        }
        else
        {
          m++;
          i1 = i2;
          n = i3;
          f1 = f2;
          continue;
        }
        f2 = f1;
        if (this.bIh[m][n] > f1)
        {
          f2 = this.bIh[m][n];
          i1 = n;
          i3 = m;
        }
        n++;
        f1 = f2;
        continue;
        if ((k != this.bIj) && (this.bIi[k] > this.bIi[this.bIj]))
          this.bIj = k;
        k++;
        continue;
        u.b localb = (u.b)((Iterator)localObject5).next();
        if (k == 0)
        {
          f11 = localb.bHB;
          f11 = f2 + f11;
          if (k != 0)
            continue;
          f2 = localb.bHJ;
          f4 = f1 + f2;
          j = 0;
          f1 = f4;
          f2 = f11;
          if (j > 5)
            continue;
          localObject3[j] += localb.bHN[j];
          localObject4[j] += localb.bHO[j];
          j++;
          continue;
        }
        f11 = localb.bHE;
        continue;
        f2 = (float)Math.sqrt(localb.bHC * localb.bHC + localb.bHD * localb.bHD + localb.bHE * localb.bHE);
        localb.bHI = f2;
        continue;
      }
      finally
      {
      }
      float f5 = f4;
      continue;
      f6 = f4;
      continue;
      f2 = 1.0F;
      continue;
      f8 = 0.261799F;
      continue;
      localObject3 = (u.b)((Iterator)localObject4).next();
      if (k == 0)
      {
        f11 = ((u.b)localObject3).bHB;
        if (k != 0)
          break label1448;
        f12 = ((u.b)localObject3).bHJ;
        if (k != 0)
          break label1458;
      }
      label1448: label1458: for (f13 = f3; ; f13 = f4)
      {
        if (j > 0)
          break label1489;
        if (f11 > f13)
          break label1465;
        f10 = localObject3.bHN[this.bIj];
        f9 = localObject3.bHO[this.bIj];
        break;
        f11 = ((u.b)localObject3).bHI;
        break label1380;
        f12 = ((u.b)localObject3).bHI;
        break label1391;
      }
      label1465: if (f11 - f13 >= f2)
      {
        f1 = f12;
        j = 1;
        f6 = f11;
      }
    }
    label1489: if (f6 < f11)
      if (i == 0)
      {
        f6 = f11 - f13;
        if (f6 > 2.0F * f2)
        {
          f2 = f6 / 2.0F;
          f6 = f11;
        }
      }
    while (true)
    {
      if (f1 < f12)
        f1 = f12;
      while (true)
      {
        if (f11 > f13)
        {
          j++;
          break;
        }
        f11 = f7;
        if (j <= 10)
        {
          m = 1;
          j = m;
          if (locala.bIq != 0L)
          {
            j = m;
            if (((u.b)localObject3).time - locala.bIq < 250L)
              j = 0;
          }
          m = j;
          if (j != 0)
          {
            m = j;
            if (f1 - f4 < 0.3F)
              m = 0;
          }
          f11 = f7;
          if (m != 0)
          {
            locala.bIm += 1;
            f7 += f6;
            f12 = localObject3.bHN[this.bIj];
            f11 = localObject3.bHO[this.bIj];
            f12 = (float)Math.atan2(f12 + f10, f11 + f9);
            f9 = Math.abs(f12 - localObject5[this.bIj]);
            f11 = f9;
            if (f9 > 3.141593F)
              f11 = 6.283186F - f9;
            if (f11 < f8)
              break label1923;
            j = 1;
            label1741: f11 = 1.0F;
            if (j == 0)
              break label1928;
            f9 = 0.93F;
            f11 = f12;
            f12 = f9;
          }
        }
        while (true)
        {
          f9 = (float)(Math.sin(f11) * f12);
          double d = Math.cos(f11);
          f12 = (float)(f12 * d);
          locala.x += f9;
          locala.y += f12;
          f11 = f7;
          if (((u.b)localObject3).time - localObject2.bIq > 250L)
          {
            localObject2.x -= f9;
            localObject2.y -= f12;
            localObject2.bIm += 1;
            f11 = f7;
          }
          locala.bIq = ((u.b)localObject3).time;
          f10 = localObject3.bHN[this.bIj];
          f9 = localObject3.bHO[this.bIj];
          j = 0;
          f7 = f11;
          break;
          label1923: j = 0;
          break label1741;
          label1928: f9 = localObject5[this.bIj];
          f12 = f11;
          f11 = f9;
        }
        label1948: f1 = 0.08F;
        break label444;
      }
      f6 = f11;
    }
  }

  final void a(u.b paramb)
  {
    try
    {
      AppMethodBeat.i(55639);
      if ((this.bIl > 0) && (this.bIl < 101))
        this.bIl -= 1;
      this.bIc.add(paramb);
      this.bIe += 1;
      if (paramb.bHC > this.bIf[0][0])
        this.bIf[0][0] = paramb.bHC;
      if (paramb.bHC < this.bIf[0][1])
        this.bIf[0][1] = paramb.bHC;
      float[] arrayOfFloat = this.bIf[0];
      arrayOfFloat[2] += paramb.bHC;
      if (paramb.bHD > this.bIf[1][0])
        this.bIf[1][0] = paramb.bHD;
      if (paramb.bHD < this.bIf[1][1])
        this.bIf[1][1] = paramb.bHD;
      arrayOfFloat = this.bIf[1];
      arrayOfFloat[2] += paramb.bHD;
      if (paramb.bHE > this.bIf[2][0])
        this.bIf[2][0] = paramb.bHE;
      if (paramb.bHE < this.bIf[2][1])
        this.bIf[2][1] = paramb.bHE;
      arrayOfFloat = this.bIf[2];
      arrayOfFloat[2] += paramb.bHE;
      if (paramb.bHF > this.bIg[0][0])
        this.bIg[0][0] = paramb.bHF;
      if (paramb.bHF < this.bIg[0][1])
        this.bIg[0][1] = paramb.bHF;
      arrayOfFloat = this.bIg[0];
      arrayOfFloat[2] += paramb.bHF;
      if (paramb.bHG > this.bIg[1][0])
        this.bIg[1][0] = paramb.bHG;
      if (paramb.bHG < this.bIg[1][1])
        this.bIg[1][1] = paramb.bHG;
      arrayOfFloat = this.bIg[1];
      arrayOfFloat[2] += paramb.bHG;
      if (paramb.bHH > this.bIg[2][0])
        this.bIg[2][0] = paramb.bHH;
      if (paramb.bHH < this.bIg[2][1])
        this.bIg[2][1] = paramb.bHH;
      arrayOfFloat = this.bIg[2];
      arrayOfFloat[2] += paramb.bHH;
      if (wy())
        u.b(this.bHP);
      AppMethodBeat.o(55639);
      return;
    }
    finally
    {
    }
    throw paramb;
  }

  final void reset()
  {
    try
    {
      AppMethodBeat.i(55635);
      this.bIc.clear();
      this.bId = new u.f.a[5];
      this.bIe = 0;
      float[] arrayOfFloat = { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F };
      this.bIf = new float[][] { { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F }, arrayOfFloat, { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F } };
      this.bIg = new float[][] { { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F }, { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F }, { (1.0F / -1.0F), (1.0F / 1.0F), 0.0F } };
      this.bIh = new float[3][3];
      this.bIi = new int[6];
      this.bIj = 5;
      AppMethodBeat.o(55635);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final u.f.a wA()
  {
    try
    {
      AppMethodBeat.i(55640);
      u.f.a locala;
      if (this.bId[4] != null)
      {
        locala = this.bId[4].wB();
        AppMethodBeat.o(55640);
      }
      while (true)
      {
        return locala;
        locala = null;
        AppMethodBeat.o(55640);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.b.a.a.u.f
 * JD-Core Version:    0.6.2
 */