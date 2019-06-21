package com.tencent.mm.plugin.a;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h extends a
{
  private int[] aZD;
  long duration;
  private long[] gkA;
  private int[] gkB;
  private int[] gkC;
  long gki;
  long[] gkl;
  List<g> gkn;
  List<Pair> gko;
  private long gks;
  private long gkt;
  private long gku;
  private long gkv;
  private long gkw;
  private int[] gkx;
  private int[] gky;
  private int[] gkz;

  public h(int paramInt1, long paramLong, int paramInt2)
  {
    super(paramInt1, paramLong, paramInt2, 0L);
    AppMethodBeat.i(117852);
    this.gkn = new LinkedList();
    this.gko = new LinkedList();
    AppMethodBeat.o(117852);
  }

  private boolean aoa()
  {
    AppMethodBeat.i(117854);
    if (this.gkz != null);
    int k;
    for (int i = this.gkz.length; ; i = this.gkA.length)
    {
      j = i - 1;
      k = this.gkx.length;
      for (i = 1; i < k; i++)
        this.gkx[(i - 1)] = (this.gkx[i] - this.gkx[(i - 1)]);
    }
    this.gkx[(k - 1)] = (j - this.gkx[(k - 1)] + 1);
    this.gkC = new int[j + 1];
    this.gkC[0] = 0;
    int j = 1;
    int i1;
    Object localObject;
    for (i = 0; i < k; i++)
    {
      int m = this.gkx[i];
      int n = this.gky[i];
      for (i1 = 0; i1 < m; i1++)
      {
        localObject = this.gkC;
        localObject[j] = (localObject[(j - 1)] + n);
        j++;
      }
    }
    i = 0;
    while (i < this.gkl.length)
    {
      k = (int)this.gkl[i];
      i1 = mM(k);
      j = this.gkC[(i1 - 1)] + 1;
      if (this.aZD.length == 1)
      {
        l1 = this.aZD[0] * (k - j);
        l2 = mN(i1);
        this.gkl[i] = (l1 + l2);
        i++;
      }
      else
      {
        l2 = 0L;
        while (true)
        {
          l1 = l2;
          if (j > k)
            break;
          l2 += this.aZD[j];
          j++;
        }
      }
    }
    j = 1;
    i = 0;
    long l2 = 0L;
    Iterator localIterator = this.gkn.iterator();
    long l1 = 0L;
    if (localIterator.hasNext())
    {
      localObject = (g)localIterator.next();
      ((g)localObject).size = this.aZD[j];
      i1 = mM(j);
      if (i1 != i);
      for (((g)localObject).start = mN(i1); ; ((g)localObject).start = l1)
      {
        l1 = ((g)localObject).start + ((g)localObject).size;
        l2 += ((g)localObject).gkq;
        ((g)localObject).gkq = (()((float)l2 * 1.0F / (float)this.gki * 1000.0F * 1000.0F));
        ((g)localObject).id = j;
        j++;
        i = i1;
        break;
      }
    }
    for (i = 0; i < this.gkB.length; i++)
    {
      localObject = (g)this.gkn.get(this.gkB[i] - 1);
      ((g)localObject).gkr = 1;
      localObject = new Pair(Integer.valueOf(this.gkB[i] - 1), Long.valueOf(((g)localObject).gkq));
      ab.d("MicroMsg.StblAtom", "stss key frame [%s %s]", new Object[] { ((Pair)localObject).first, ((Pair)localObject).second });
      this.gko.add(localObject);
    }
    AppMethodBeat.o(117854);
    return true;
  }

  private int mM(int paramInt)
  {
    int i = 0;
    if (i < this.gkC.length)
      if (paramInt > this.gkC[i]);
    while (true)
    {
      return i;
      i++;
      break;
      i = 0;
    }
  }

  private long mN(int paramInt)
  {
    long l;
    if (this.gkz != null)
      l = this.gkz[paramInt];
    while (true)
    {
      return l;
      if (this.gkA != null)
        l = this.gkA[paramInt];
      else
        l = 0L;
    }
  }

  public final void d(RandomAccessFile paramRandomAccessFile)
  {
    AppMethodBeat.i(117853);
    byte[] arrayOfByte1 = new byte[8];
    int i = paramRandomAccessFile.read(arrayOfByte1);
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2;
    int i3;
    long l1;
    label85: int i4;
    if (i >= 8)
    {
      i2 = c.readInt(arrayOfByte1, 0);
      i3 = c.readInt(arrayOfByte1, 4);
      l1 = 0L;
      if (i3 == a.aWT)
      {
        this.gks = paramRandomAccessFile.getFilePointer();
        if (!c.a(paramRandomAccessFile, 4L))
        {
          l1 = -1L;
          j = 1;
          i4 = i1;
          i3 = k;
          i1 = m;
          m = i4;
        }
      }
    }
    while (true)
    {
      if (!c.a(paramRandomAccessFile, i2 - l1 - i))
      {
        paramRandomAccessFile = new IOException("skip file error.");
        AppMethodBeat.o(117853);
        throw paramRandomAccessFile;
        byte[] arrayOfByte2 = new byte[8];
        if (paramRandomAccessFile.read(arrayOfByte2, 0, 4) < 4)
        {
          ab.w("MicroMsg.StblAtom", "stts read entry count error");
          l1 = -1L;
          break label85;
        }
        i3 = c.readInt(arrayOfByte2, 0);
        long l2 = 8L * i3;
        if ((l2 > i2 - 16) || (l2 <= 0L))
        {
          ab.w("MicroMsg.StblAtom", "stts error entryCount : ".concat(String.valueOf(i3)));
          l1 = -1L;
          break label85;
        }
        i4 = 0;
        i3 = 0;
        this.gkl = new long[(int)(this.duration / this.gki) + 2];
        Object localObject = this.gkl;
        j = 1;
        localObject[0] = 1L;
        l1 = 0L;
        int i5 = paramRandomAccessFile.read(arrayOfByte2);
        long l3;
        while (true)
        {
          int i6 = j;
          int i7 = i3;
          l3 = l1;
          if (i5 >= 8)
          {
            l1 += i5;
            i6 = c.readInt(arrayOfByte2, 0);
            int i8 = c.readInt(arrayOfByte2, 4);
            i5 = 0;
            i7 = i4;
            i4 = i5;
            while (i4 < i6)
            {
              localObject = new g();
              ((g)localObject).gkq = i8;
              this.gkn.add(localObject);
              i7 += i8;
              i5 = i3 + 1;
              i3 = i7;
              while ((i3 >= this.gki) && (j < this.gkl.length))
              {
                i3 = (int)(i3 - this.gki);
                this.gkl[j] = i5;
                j++;
              }
              i4++;
              i7 = i3;
              i3 = i5;
            }
            if (l1 >= l2)
            {
              ab.d("MicroMsg.StblAtom", "read stts Atom end");
              l3 = l1;
              i7 = i3;
              i6 = j;
            }
          }
          else
          {
            if (i6 < this.gkl.length)
              this.gkl[i6] = i7;
            l1 = 8L + l3;
            break;
          }
          i5 = paramRandomAccessFile.read(arrayOfByte2);
          i4 = i7;
        }
        if (i3 == a.aWW)
        {
          this.gkt = paramRandomAccessFile.getFilePointer();
          if (!c.a(paramRandomAccessFile, 4L))
            l1 = -1L;
          while (true)
          {
            i3 = 1;
            m = i1;
            i1 = i3;
            i3 = k;
            break;
            arrayOfByte2 = new byte[12];
            if (paramRandomAccessFile.read(arrayOfByte2, 0, 4) < 4)
            {
              ab.w("MicroMsg.StblAtom", "stsc read entry count error");
              l1 = -1L;
            }
            else
            {
              m = c.readInt(arrayOfByte2, 0);
              l2 = 12L * m;
              if ((l2 <= i2 - 16) && (l2 > 0L))
                break label661;
              ab.w("MicroMsg.StblAtom", "stsc error entryCount : ".concat(String.valueOf(m)));
              l1 = -1L;
            }
          }
          label661: ab.d("MicroMsg.StblAtom", "handle stsc entryCount : ".concat(String.valueOf(m)));
          this.gkx = new int[m];
          this.gky = new int[m];
          i3 = 0;
          l1 = 0L;
          for (m = paramRandomAccessFile.read(arrayOfByte2); ; m = paramRandomAccessFile.read(arrayOfByte2))
          {
            l3 = l1;
            if (m >= 12)
            {
              l1 += m;
              this.gkx[i3] = c.readInt(arrayOfByte2, 0);
              this.gky[i3] = c.readInt(arrayOfByte2, 4);
              i3++;
              if (l1 >= l2)
              {
                ab.d("MicroMsg.StblAtom", "read stsc atom end");
                l3 = l1;
              }
            }
            else
            {
              l1 = l3 + 8L;
              break;
            }
          }
        }
        if (i3 == a.aWZ)
        {
          this.gku = paramRandomAccessFile.getFilePointer();
          if (!c.a(paramRandomAccessFile, 4L))
            l1 = -1L;
          while (true)
          {
            k = 1;
            i3 = m;
            m = i1;
            i1 = i3;
            i3 = k;
            break;
            arrayOfByte2 = new byte[4];
            if (paramRandomAccessFile.read(arrayOfByte2, 0, 4) < 4)
            {
              ab.w("MicroMsg.StblAtom", "stco read entry count error");
              l1 = -1L;
            }
            else
            {
              i3 = c.readInt(arrayOfByte2, 0);
              l2 = 4L * i3;
              if ((l2 > 0L) && (l2 <= i2 - 16))
                break label939;
              ab.w("MicroMsg.StblAtom", "stco error entryCount : ".concat(String.valueOf(i3)));
              l1 = -1L;
            }
          }
          label939: this.gkz = new int[i3 + 1];
          i3 = 1;
          l1 = 0L;
          k = paramRandomAccessFile.read(arrayOfByte2);
          while (true)
          {
            l3 = l1;
            if (k >= 4)
            {
              l1 += k;
              this.gkz[i3] = c.readInt(arrayOfByte2, 0);
              if (l1 >= l2)
              {
                ab.d("MicroMsg.StblAtom", "read stco atom end");
                l3 = l1;
              }
            }
            else
            {
              l1 = l3 + 8L;
              break;
            }
            k = paramRandomAccessFile.read(arrayOfByte2);
            i3++;
          }
        }
        if (i3 == a.aXa)
        {
          this.gkv = paramRandomAccessFile.getFilePointer();
          if (!c.a(paramRandomAccessFile, 4L))
            l1 = -1L;
          while (true)
          {
            k = 1;
            i3 = i1;
            i1 = m;
            m = i3;
            i3 = k;
            break;
            arrayOfByte2 = new byte[8];
            if (paramRandomAccessFile.read(arrayOfByte2, 0, 4) < 4)
            {
              ab.w("MicroMsg.StblAtom", "co64 read entry count error");
              l1 = -1L;
            }
            else
            {
              i3 = c.readInt(arrayOfByte2, 0);
              l2 = 8L * i3;
              if ((l2 > 0L) && (l2 <= i2 - 16))
                break label1184;
              ab.w("MicroMsg.StblAtom", "stco error entryCount : ".concat(String.valueOf(i3)));
              l1 = -1L;
            }
          }
          label1184: this.gkA = new long[i3 + 1];
          i3 = 1;
          k = paramRandomAccessFile.read(arrayOfByte2);
          l1 = 0L;
          while (true)
          {
            l3 = l1;
            if (k >= 8)
            {
              l1 += k;
              this.gkA[i3] = c.af(arrayOfByte2);
              if (l1 >= l2)
              {
                ab.d("MicroMsg.StblAtom", "read stco atom end");
                l3 = l1;
              }
            }
            else
            {
              l1 = l3 + 8L;
              break;
            }
            k = paramRandomAccessFile.read(arrayOfByte2);
            i3++;
          }
        }
        if (i3 == a.aWX)
        {
          this.gkw = paramRandomAccessFile.getFilePointer();
          if (!c.a(paramRandomAccessFile, 4L))
            l1 = -1L;
          while (true)
          {
            i3 = 1;
            n = i1;
            i1 = m;
            m = n;
            n = i3;
            i3 = k;
            break;
            arrayOfByte2 = new byte[4];
            if (paramRandomAccessFile.read(arrayOfByte2, 0, 4) < 4)
            {
              ab.w("MicroMsg.StblAtom", "stsz read sample size error");
              l1 = -1L;
            }
            else
            {
              n = c.readInt(arrayOfByte2, 0);
              if (n > 0)
              {
                this.aZD = new int[1];
                this.aZD[0] = n;
                ab.i("MicroMsg.StblAtom", "all sample size is the same. size : ".concat(String.valueOf(n)));
                l1 = 8L;
              }
              else if (paramRandomAccessFile.read(arrayOfByte2, 0, 4) < 4)
              {
                ab.w("MicroMsg.StblAtom", "stsz read entry count error");
                l1 = -1L;
              }
              else
              {
                n = c.readInt(arrayOfByte2, 0);
                l2 = 4L * n;
                if ((l2 > 0L) && (l2 <= i2 - 20))
                  break label1512;
                ab.w("MicroMsg.StblAtom", "stco error entryCount : ".concat(String.valueOf(n)));
                l1 = -1L;
              }
            }
          }
          label1512: this.aZD = new int[n + 1];
          n = 1;
          i3 = paramRandomAccessFile.read(arrayOfByte2);
          l1 = 0L;
          while (true)
          {
            l3 = l1;
            if (i3 >= 4)
            {
              l1 += i3;
              this.aZD[n] = c.readInt(arrayOfByte2, 0);
              if (l1 >= l2)
              {
                ab.d("MicroMsg.StblAtom", "read stsz atom end");
                l3 = l1;
              }
            }
            else
            {
              l1 = l3 + 12L;
              break;
            }
            i3 = paramRandomAccessFile.read(arrayOfByte2);
            n++;
          }
        }
        if (i3 != a.aWU)
          break label1913;
        if (!c.a(paramRandomAccessFile, 4L))
          l1 = -1L;
        while (true)
        {
          i3 = 1;
          i1 = m;
          m = i3;
          i3 = k;
          break;
          arrayOfByte2 = new byte[4];
          if (paramRandomAccessFile.read(arrayOfByte2, 0, 4) < 4)
          {
            ab.w("MicroMsg.StblAtom", "stss rread entry count error");
            l1 = -1L;
          }
          else
          {
            i1 = c.readInt(arrayOfByte2, 0);
            l2 = 4L * i1;
            if ((l2 > 0L) && (l2 <= i2 - 16))
              break label1746;
            ab.w("MicroMsg.StblAtom", "stss error entryCount : ".concat(String.valueOf(i1)));
            l1 = -1L;
          }
        }
        label1746: this.gkB = new int[i1];
        i1 = 0;
        i3 = paramRandomAccessFile.read(arrayOfByte2);
        l1 = 0L;
        while (true)
        {
          l3 = l1;
          if (i3 >= 4)
          {
            l1 += i3;
            this.gkB[i1] = c.readInt(arrayOfByte2, 0);
            if (l1 >= l2)
            {
              ab.d("MicroMsg.StblAtom", "read stss atom end");
              l3 = l1;
            }
          }
          else
          {
            l1 = l3 + 8L;
            break;
          }
          i3 = paramRandomAccessFile.read(arrayOfByte2);
          i1++;
        }
      }
      if ((j != 0) && (i3 != 0) && (i1 != 0) && (n != 0) && (m != 0))
      {
        ab.i("MicroMsg.StblAtom", "read stbl atom finish");
        aoa();
        AppMethodBeat.o(117853);
        return;
      }
      i = paramRandomAccessFile.read(arrayOfByte1);
      k = i1;
      i1 = m;
      m = k;
      k = i3;
      break;
      label1913: i3 = i1;
      i1 = m;
      m = i3;
      i3 = k;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.a.h
 * JD-Core Version:    0.6.2
 */