package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.e;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.h;
import com.google.android.exoplayer2.c.i;
import com.google.android.exoplayer2.c.j;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.a.a;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.EOFException;

public final class b
  implements e
{
  public static final h aTh;
  private static final int aVq;
  private static final int aVr;
  private static final int aVs;
  private Metadata aOb;
  private final l aTj;
  private g aTn;
  private long aVA;
  private int aVB;
  private final long aVt;
  private final j aVu;
  private final i aVv;
  private m aVw;
  private int aVx;
  private b.a aVy;
  private long aVz;
  private final int flags;

  static
  {
    AppMethodBeat.i(94930);
    aTh = new b.1();
    aVq = v.aT("Xing");
    aVr = v.aT("Info");
    aVs = v.aT("VBRI");
    AppMethodBeat.o(94930);
  }

  public b()
  {
    this(0);
  }

  public b(int paramInt)
  {
    this(paramInt, -9223372036854775807L);
  }

  public b(int paramInt, long paramLong)
  {
    AppMethodBeat.i(94923);
    this.flags = paramInt;
    this.aVt = paramLong;
    this.aTj = new l(10);
    this.aVu = new j();
    this.aVv = new i();
    this.aVz = -9223372036854775807L;
    AppMethodBeat.o(94923);
  }

  private boolean a(f paramf, boolean paramBoolean)
  {
    boolean bool1 = false;
    AppMethodBeat.i(94927);
    int i;
    int j;
    int k;
    int m;
    int n;
    if (paramBoolean)
    {
      i = 16384;
      paramf.qY();
      if (paramf.getPosition() != 0L)
        break label341;
      e(paramf);
      j = (int)paramf.qZ();
      if (!paramBoolean)
        paramf.dG(j);
      k = 0;
      m = 0;
      n = 0;
    }
    while (true)
    {
      label68: byte[] arrayOfByte = this.aTj.data;
      boolean bool2;
      if (n > 0)
        bool2 = true;
      while (true)
        if (paramf.b(arrayOfByte, 0, 4, bool2))
        {
          this.aTj.setPosition(0);
          int i1 = this.aTj.readInt();
          int i2;
          if ((m == 0) || (i(i1, m)))
          {
            i2 = j.dN(i1);
            if (i2 != -1);
          }
          else
          {
            m = k + 1;
            if (k == i)
            {
              if (!paramBoolean)
              {
                paramf = new o("Searched too many bytes.");
                AppMethodBeat.o(94927);
                throw paramf;
                i = 131072;
                break;
                bool2 = false;
                continue;
              }
              AppMethodBeat.o(94927);
              paramBoolean = bool1;
              return paramBoolean;
            }
            if (paramBoolean)
            {
              paramf.qY();
              paramf.dH(j + m);
              k = m;
              m = 0;
              n = 0;
              break label68;
            }
            paramf.dG(1);
            k = m;
            m = 0;
            n = 0;
            break label68;
          }
          n++;
          if (n == 1)
          {
            j.a(i1, this.aVu);
            m = i1;
          }
          while (n != 4)
          {
            paramf.dH(i2 - 4);
            break;
          }
        }
      if (paramBoolean)
        paramf.dG(j + k);
      while (true)
      {
        this.aVx = m;
        AppMethodBeat.o(94927);
        paramBoolean = true;
        break;
        paramf.qY();
      }
      label341: k = 0;
      j = 0;
      m = 0;
      n = 0;
    }
  }

  private void e(f paramf)
  {
    AppMethodBeat.i(94928);
    int i = 0;
    paramf.b(this.aTj.data, 0, 10);
    this.aTj.setPosition(0);
    if (this.aTj.tD() == com.google.android.exoplayer2.metadata.id3.a.bbg)
    {
      this.aTj.eM(3);
      int j = this.aTj.tH();
      int k = j + 10;
      a.a locala;
      if (this.aOb == null)
      {
        byte[] arrayOfByte = new byte[k];
        System.arraycopy(this.aTj.data, 0, arrayOfByte, 0, 10);
        paramf.b(arrayOfByte, 10, j);
        if ((this.flags & 0x2) != 0)
        {
          locala = i.aSR;
          label120: this.aOb = new com.google.android.exoplayer2.metadata.id3.a(locala).d(arrayOfByte, k);
          if (this.aOb != null)
            this.aVv.c(this.aOb);
        }
      }
      while (true)
      {
        i += k;
        break;
        locala = null;
        break label120;
        paramf.dH(j);
      }
    }
    paramf.qY();
    paramf.dH(i);
    AppMethodBeat.o(94928);
  }

  private b.a f(f paramf)
  {
    AppMethodBeat.i(94929);
    paramf.b(this.aTj.data, 0, 4);
    this.aTj.setPosition(0);
    j.a(this.aTj.readInt(), this.aVu);
    paramf = new a(paramf.getPosition(), this.aVu.bitrate, paramf.getLength());
    AppMethodBeat.o(94929);
    return paramf;
  }

  private static boolean i(int paramInt, long paramLong)
  {
    if ((0xFFFE0C00 & paramInt) == (0xFFFE0C00 & paramLong));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int a(f paramf, k paramk)
  {
    AppMethodBeat.i(94926);
    if (this.aVx == 0);
    label797: label1061: 
    try
    {
      a(paramf, false);
      if (this.aVy == null)
      {
        paramk = new l(this.aVu.aPy);
        paramf.b(paramk.data, 0, this.aVu.aPy);
        if ((this.aVu.version & 0x1) == 0)
          break label572;
        if (this.aVu.channels != 1)
        {
          i = 36;
          if (paramk.limit < i + 4)
            break label595;
          paramk.setPosition(i);
          j = paramk.readInt();
          if ((j != aVq) && (j != aVr))
            break label595;
          if ((j != aVq) && (j != aVr))
            break label749;
          localObject1 = this.aVu;
          l1 = paramf.getPosition();
          l2 = paramf.getLength();
          k = ((j)localObject1).aTa;
          m = ((j)localObject1).sampleRate;
          l1 += ((j)localObject1).aPy;
          n = paramk.readInt();
          if ((n & 0x1) == 1)
          {
            i1 = paramk.tI();
            if (i1 != 0)
              break label634;
          }
          paramk = null;
          if ((paramk != null) && (!this.aVv.rc()))
          {
            paramf.qY();
            paramf.dH(i + 141);
            paramf.b(this.aTj.data, 0, 3);
            this.aTj.setPosition(0);
            localObject2 = this.aVv;
            i1 = this.aTj.tD();
            i = i1 >> 12;
            i1 &= 4095;
            if ((i > 0) || (i1 > 0))
            {
              ((i)localObject2).aOp = i;
              ((i)localObject2).aOq = i1;
            }
          }
          paramf.dG(this.aVu.aPy);
          localObject2 = paramk;
          if (paramk != null)
          {
            localObject2 = paramk;
            if (!paramk.qX())
            {
              localObject2 = paramk;
              if (j == aVr)
                localObject2 = f(paramf);
            }
          }
          this.aVy = ((b.a)localObject2);
          if ((this.aVy == null) || ((!this.aVy.qX()) && ((this.flags & 0x1) != 0)))
            this.aVy = f(paramf);
          this.aTn.a(this.aVy);
          localObject2 = this.aVw;
          localObject1 = this.aVu.mimeType;
          j = this.aVu.channels;
          i1 = this.aVu.sampleRate;
          i = this.aVv.aOp;
          m = this.aVv.aOq;
          if ((this.flags & 0x2) == 0)
            break label1091;
          paramk = null;
          ((m)localObject2).f(Format.a(null, (String)localObject1, -1, 4096, j, i1, -1, i, m, null, null, 0, null, paramk));
        }
      }
      else
      {
        if (this.aVB != 0)
          break label1250;
        paramf.qY();
        if (paramf.b(this.aTj.data, 0, 4, true))
          break label1099;
        i = -1;
        AppMethodBeat.o(94926);
        return i;
      }
    }
    catch (EOFException paramf)
    {
      label572: label1091: label1099: 
      while (true)
      {
        int j;
        Object localObject1;
        long l1;
        long l2;
        int k;
        int m;
        int n;
        int i1;
        Object localObject2;
        int i = -1;
        AppMethodBeat.o(94926);
        continue;
        i = 21;
        continue;
        label974: if (this.aVu.channels != 1)
        {
          i = 21;
        }
        else
        {
          i = 13;
          continue;
          label595: if (paramk.limit >= 40)
          {
            paramk.setPosition(36);
            if (paramk.readInt() == aVs)
              j = aVs;
          }
          else
          {
            j = 0;
            continue;
            label634: long l3 = v.b(i1, k * 1000000L, m);
            if ((n & 0x6) != 6)
            {
              paramk = new d(l1, l3, l2);
            }
            else
            {
              long l4 = paramk.tI();
              paramk.eM(1);
              localObject2 = new long[99];
              for (i1 = 0; i1 < 99; i1++)
                localObject2[i1] = paramk.readUnsignedByte();
              paramk = new d(l1, l3, l2, (long[])localObject2, l4, ((j)localObject1).aPy);
              continue;
              label749: if (j == aVs)
              {
                localObject2 = this.aVu;
                l2 = paramf.getPosition();
                l4 = paramf.getLength();
                paramk.eM(10);
                i = paramk.readInt();
                if (i <= 0)
                  localObject2 = null;
                while (true)
                {
                  paramf.dG(this.aVu.aPy);
                  break;
                  j = ((j)localObject2).sampleRate;
                  l1 = i;
                  if (j >= 32000);
                  for (i = 1152; ; i = 576)
                  {
                    l3 = v.b(l1, i * 1000000L, j);
                    n = paramk.readUnsignedShort();
                    i1 = paramk.readUnsignedShort();
                    m = paramk.readUnsignedShort();
                    paramk.eM(2);
                    l2 += ((j)localObject2).aPy;
                    localObject2 = new long[n + 1];
                    localObject1 = new long[n + 1];
                    localObject2[0] = 0L;
                    localObject1[0] = l2;
                    j = 1;
                    if (j >= localObject2.length)
                      break label1061;
                    switch (m)
                    {
                    default:
                      localObject2 = null;
                      break label797;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    }
                  }
                  i = paramk.readUnsignedByte();
                  l2 += i * i1;
                  localObject2[j] = (j * l3 / n);
                  if (l4 == -1L);
                  for (l1 = l2; ; l1 = Math.min(l4, l2))
                  {
                    localObject1[j] = l1;
                    j++;
                    break;
                    i = paramk.readUnsignedShort();
                    break label974;
                    i = paramk.tD();
                    break label974;
                    i = paramk.tI();
                    break label974;
                  }
                  localObject2 = new c((long[])localObject2, (long[])localObject1, l3);
                }
              }
              localObject2 = null;
              paramf.qY();
              continue;
              paramk = this.aOb;
              continue;
              this.aTj.setPosition(0);
              i = this.aTj.readInt();
              if ((!i(i, this.aVx)) || (j.dN(i) == -1))
              {
                paramf.dG(1);
                this.aVx = 0;
                i = 0;
                AppMethodBeat.o(94926);
              }
              else
              {
                j.a(i, this.aVu);
                if (this.aVz == -9223372036854775807L)
                {
                  this.aVz = this.aVy.O(paramf.getPosition());
                  if (this.aVt != -9223372036854775807L)
                  {
                    l1 = this.aVy.O(0L);
                    l2 = this.aVz;
                    this.aVz = (this.aVt - l1 + l2);
                  }
                }
                this.aVB = this.aVu.aPy;
                label1250: i = this.aVw.a(paramf, this.aVB, true);
                if (i == -1)
                {
                  i = -1;
                  AppMethodBeat.o(94926);
                }
                else
                {
                  this.aVB -= i;
                  if (this.aVB > 0)
                  {
                    i = 0;
                    AppMethodBeat.o(94926);
                  }
                  else
                  {
                    l2 = this.aVz;
                    l1 = this.aVA * 1000000L / this.aVu.sampleRate;
                    this.aVw.a(l1 + l2, 1, this.aVu.aPy, 0, null);
                    this.aVA += this.aVu.aTa;
                    this.aVB = 0;
                    i = 0;
                    AppMethodBeat.o(94926);
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(94925);
    this.aTn = paramg;
    this.aVw = this.aTn.dM(0);
    this.aTn.rb();
    AppMethodBeat.o(94925);
  }

  public final boolean a(f paramf)
  {
    AppMethodBeat.i(94924);
    boolean bool = a(paramf, true);
    AppMethodBeat.o(94924);
    return bool;
  }

  public final void g(long paramLong1, long paramLong2)
  {
    this.aVx = 0;
    this.aVz = -9223372036854775807L;
    this.aVA = 0L;
    this.aVB = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.c.b
 * JD-Core Version:    0.6.2
 */