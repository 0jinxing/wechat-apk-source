package g.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import g.a.c.b;
import java.io.InputStream;
import java.io.OutputStream;

public final class a
{
  short[] BZA;
  short[] BZB;
  short[] BZC;
  g.a.c.a[] BZD;
  short[] BZE;
  g.a.c.a BZF;
  a.a BZG;
  a.a BZH;
  a.b BZI;
  int BZJ;
  int BZK;
  int BZL;
  g.a.a.a BZv;
  b BZw;
  short[] BZx;
  short[] BZy;
  short[] BZz;

  public a()
  {
    AppMethodBeat.i(86242);
    this.BZv = new g.a.a.a();
    this.BZw = new b();
    this.BZx = new short['À'];
    this.BZy = new short[12];
    this.BZz = new short[12];
    this.BZA = new short[12];
    this.BZB = new short[12];
    this.BZC = new short['À'];
    this.BZD = new g.a.c.a[4];
    this.BZE = new short[114];
    this.BZF = new g.a.c.a(4);
    this.BZG = new a.a(this);
    this.BZH = new a.a(this);
    this.BZI = new a.b(this);
    this.BZJ = -1;
    this.BZK = -1;
    for (int i = 0; i < 4; i++)
      this.BZD[i] = new g.a.c.a(6);
    AppMethodBeat.o(86242);
  }

  public final boolean a(InputStream paramInputStream, OutputStream paramOutputStream, long paramLong)
  {
    AppMethodBeat.i(86243);
    this.BZw.Cab = paramInputStream;
    paramInputStream = this.BZv;
    paramInputStream.eno();
    paramInputStream.BZu = paramOutputStream;
    paramInputStream = this.BZv;
    paramInputStream.BZt = 0;
    paramInputStream.BUo = 0;
    b.c(this.BZx);
    b.c(this.BZC);
    b.c(this.BZy);
    b.c(this.BZz);
    b.c(this.BZA);
    b.c(this.BZB);
    b.c(this.BZE);
    paramInputStream = this.BZI;
    int i = paramInputStream.BZT;
    int j = paramInputStream.BZU;
    for (int k = 0; k < 1 << i + j; k++)
      b.c(paramInputStream.BZS[k].BZW);
    for (k = 0; k < 4; k++)
      b.c(this.BZD[k].BZY);
    this.BZG.enq();
    this.BZH.enq();
    b.c(this.BZF.BZY);
    paramInputStream = this.BZw;
    paramInputStream.xcZ = 0;
    paramInputStream.Caa = -1;
    for (k = 0; k < 5; k++)
      paramInputStream.xcZ = (paramInputStream.xcZ << 8 | paramInputStream.Cab.read());
    int m = 0;
    i = 0;
    j = 0;
    k = 0;
    int n = 0;
    int i1 = 0;
    long l = 0L;
    int i2;
    int i3;
    int i4;
    int i5;
    if ((paramLong < 0L) || (l < paramLong))
    {
      i2 = (int)l & this.BZL;
      if (this.BZw.g(this.BZx, (m << 4) + i2) == 0)
      {
        paramInputStream = this.BZI;
        i3 = (int)l;
        paramOutputStream = paramInputStream.BZS;
        i2 = paramInputStream.BZV;
        i4 = paramInputStream.BZT;
        paramInputStream = paramOutputStream[(((i1 & 0xFF) >>> 8 - paramInputStream.BZT) + ((i3 & i2) << i4))];
        if (m < 7)
        {
          i1 = 1;
          if (i1 == 0)
          {
            paramOutputStream = this.BZw;
            i2 = this.BZv.Vn(i);
            i4 = 1;
          }
        }
        else
        {
          do
          {
            i3 = i2 >> 7 & 0x1;
            i2 = (byte)(i2 << 1);
            i5 = paramOutputStream.g(paramInputStream.BZW, (i3 + 1 << 8) + i4);
            i1 = i4 << 1 | i5;
            if (i3 != i5)
            {
              while (true)
              {
                i4 = i1;
                if (i1 >= 256)
                  break;
                i1 = paramOutputStream.g(paramInputStream.BZW, i1) | i1 << 1;
              }
              i1 = 0;
              break;
            }
            i4 = i1;
          }
          while (i1 < 256);
          i4 = i1;
          i1 = (byte)i4;
          label506: paramInputStream = this.BZv;
          paramOutputStream = paramInputStream.BZr;
          i4 = paramInputStream.BUo;
          paramInputStream.BUo = (i4 + 1);
          paramOutputStream[i4] = ((byte)i1);
          if (paramInputStream.BUo >= paramInputStream.BZs)
            paramInputStream.enp();
          if (m >= 4)
            break label615;
          m = 0;
        }
        while (true)
        {
          l = 1L + l;
          break;
          paramOutputStream = this.BZw;
          i1 = 1;
          do
          {
            i4 = paramOutputStream.g(paramInputStream.BZW, i1) | i1 << 1;
            i1 = i4;
          }
          while (i4 < 256);
          i1 = (byte)i4;
          break label506;
          label615: if (m < 10)
            m -= 3;
          else
            m -= 6;
        }
      }
      if (this.BZw.g(this.BZy, m) == 1)
      {
        i4 = 0;
        if (this.BZw.g(this.BZz, m) == 0)
        {
          if (this.BZw.g(this.BZC, (m << 4) + i2) != 0)
            break label1631;
          if (m < 7)
          {
            m = 9;
            i1 = 1;
          }
        }
      }
    }
    while (true)
    {
      label705: if (i1 == 0)
      {
        i2 = this.BZH.a(this.BZw, i2) + 2;
        if (m < 7)
        {
          m = 8;
          label738: i4 = n;
          i1 = i;
          n = j;
          j = k;
          i = i4;
          k = i2;
        }
      }
      while (true)
      {
        label762: boolean bool;
        if ((i1 >= l) || (i1 >= this.BZK))
        {
          bool = false;
          AppMethodBeat.o(86243);
          while (true)
          {
            label788: return bool;
            m = 11;
            break;
            if (this.BZw.g(this.BZA, m) == 0)
            {
              i1 = i;
              i = j;
              j = i1;
              i1 = i4;
              break label705;
            }
            if (this.BZw.g(this.BZB, m) == 0);
            while (true)
            {
              i1 = j;
              j = k;
              k = i1;
              break;
              i1 = n;
              n = k;
              k = i1;
            }
            m = 11;
            break label738;
            i1 = this.BZG.a(this.BZw, i2) + 2;
            if (m < 7)
            {
              n = 7;
              paramInputStream = this.BZD;
              m = i1 - 2;
              if (m >= 4)
                break label1051;
            }
            int i6;
            while (true)
            {
              i5 = paramInputStream[m].a(this.BZw);
              if (i5 < 4)
                break label1355;
              i3 = (i5 >> 1) - 1;
              i6 = (i5 & 0x1 | 0x2) << i3;
              if (i5 >= 14)
                break label1099;
              paramInputStream = this.BZE;
              paramOutputStream = this.BZw;
              i2 = 1;
              m = 0;
              for (i4 = 0; i4 < i3; i4++)
              {
                int i7 = paramOutputStream.g(paramInputStream, i6 - i5 - 1 + i2);
                i2 = (i2 << 1) + i7;
                m |= i7 << i4;
              }
              n = 10;
              break;
              label1051: m = 3;
            }
            i2 = i1;
            i4 = k;
            i1 = i;
            i3 = m + i6;
            m = n;
            k = i2;
            i = i4;
            n = i1;
            i1 = i3;
            break label762;
            label1099: paramInputStream = this.BZw;
            i4 = i3 - 4;
            m = 0;
            while (i4 != 0)
            {
              paramInputStream.Caa >>>= 1;
              i2 = paramInputStream.xcZ - paramInputStream.Caa >>> 31;
              paramInputStream.xcZ -= (paramInputStream.Caa & i2 - 1);
              m = m << 1 | 1 - i2;
              if ((paramInputStream.Caa & 0xFF000000) == 0)
              {
                paramInputStream.xcZ = (paramInputStream.xcZ << 8 | paramInputStream.Cab.read());
                paramInputStream.Caa <<= 8;
              }
              i4--;
            }
            paramInputStream = this.BZF;
            paramOutputStream = this.BZw;
            i3 = 1;
            i4 = 0;
            for (i2 = 0; i2 < paramInputStream.BZZ; i2++)
            {
              i5 = paramOutputStream.g(paramInputStream.BZY, i3);
              i3 = (i3 << 1) + i5;
              i4 |= i5 << i2;
            }
            i3 = i6 + (m << 4) + i4;
            if (i3 >= 0)
              break label1316;
            if (i3 == -1)
              break label1552;
            bool = false;
            AppMethodBeat.o(86243);
          }
          label1316: i2 = i1;
          i1 = k;
          m = i;
          i4 = n;
          k = i2;
          i = i1;
          n = m;
          i1 = i3;
          m = i4;
          continue;
          label1355: i3 = k;
          m = i;
          i4 = i5;
          i2 = n;
          k = i1;
          i = i3;
          n = m;
          i1 = i4;
          m = i2;
        }
        else
        {
          paramOutputStream = this.BZv;
          i4 = paramOutputStream.BUo - i1 - 1;
          if (i4 < 0)
          {
            i4 += paramOutputStream.BZs;
            i2 = k;
          }
          while (true)
            if (i2 != 0)
            {
              i3 = i4;
              if (i4 >= paramOutputStream.BZs)
                i3 = 0;
              paramInputStream = paramOutputStream.BZr;
              i4 = paramOutputStream.BUo;
              paramOutputStream.BUo = (i4 + 1);
              paramInputStream[i4] = ((byte)paramOutputStream.BZr[i3]);
              if (paramOutputStream.BUo >= paramOutputStream.BZs)
                paramOutputStream.enp();
              i2--;
              i4 = i3 + 1;
            }
            else
            {
              l += k;
              i2 = this.BZv.Vn(0);
              k = j;
              j = n;
              i4 = i1;
              i1 = i2;
              n = i;
              i = i4;
              break;
              label1552: this.BZv.enp();
              this.BZv.eno();
              this.BZw.Cab = null;
              bool = true;
              AppMethodBeat.o(86243);
              break label788;
              i2 = k;
            }
          i4 = n;
          n = k;
          i3 = j;
          i2 = i;
          k = i1;
          i = i4;
          j = n;
          n = i3;
          i1 = i2;
        }
      }
      label1631: i1 = i4;
    }
  }

  public final boolean cR(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(86244);
    int i = paramArrayOfByte[0] & 0xFF;
    int j = i % 9;
    i /= 9;
    int k = i % 5;
    int m = i / 5;
    int n = 0;
    i = 0;
    while (n < 4)
    {
      i += ((paramArrayOfByte[(n + 1)] & 0xFF) << n * 8);
      n++;
    }
    if ((j > 8) || (k > 4) || (m > 4))
    {
      n = 0;
      if (n != 0)
        break label249;
      AppMethodBeat.o(86244);
    }
    while (true)
    {
      return bool;
      paramArrayOfByte = this.BZI;
      if ((paramArrayOfByte.BZS == null) || (paramArrayOfByte.BZT != j) || (paramArrayOfByte.BZU != k))
      {
        paramArrayOfByte.BZU = k;
        paramArrayOfByte.BZV = ((1 << k) - 1);
        paramArrayOfByte.BZT = j;
        j = 1 << paramArrayOfByte.BZT + paramArrayOfByte.BZU;
        paramArrayOfByte.BZS = new a.b.a[j];
        for (n = 0; n < j; n++)
          paramArrayOfByte.BZS[n] = new a.b.a(paramArrayOfByte);
      }
      n = 1 << m;
      this.BZG.Vo(n);
      this.BZH.Vo(n);
      this.BZL = (n - 1);
      n = 1;
      break;
      label249: if (i < 0)
      {
        AppMethodBeat.o(86244);
      }
      else
      {
        if (this.BZJ != i)
        {
          this.BZJ = i;
          this.BZK = Math.max(this.BZJ, 1);
          paramArrayOfByte = this.BZv;
          i = Math.max(this.BZK, 4096);
          if ((paramArrayOfByte.BZr == null) || (paramArrayOfByte.BZs != i))
            paramArrayOfByte.BZr = new byte[i];
          paramArrayOfByte.BZs = i;
          paramArrayOfByte.BUo = 0;
          paramArrayOfByte.BZt = 0;
        }
        AppMethodBeat.o(86244);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     g.a.b.a
 * JD-Core Version:    0.6.2
 */