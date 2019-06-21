package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
{
  private final boolean Bzu;
  private boolean Bzv;
  private int Bzw;
  private e.a Bzx;
  final byte[] buffer;
  int bufferSize;
  private int bxl;
  int bxm;
  private int bxn;
  private int bxo;
  int bxp;
  int bxq;
  private int bxr;
  private final InputStream input;

  private e(p paramp)
  {
    AppMethodBeat.i(121440);
    this.Bzv = false;
    this.bxo = 2147483647;
    this.bxq = 64;
    this.bxr = 67108864;
    this.Bzx = null;
    this.buffer = paramp.wR;
    this.bxm = paramp.ehO();
    this.bufferSize = (this.bxm + paramp.size());
    this.Bzw = (-this.bxm);
    this.input = null;
    this.Bzu = true;
    AppMethodBeat.o(121440);
  }

  private e(InputStream paramInputStream)
  {
    AppMethodBeat.i(121439);
    this.Bzv = false;
    this.bxo = 2147483647;
    this.bxq = 64;
    this.bxr = 67108864;
    this.Bzx = null;
    this.buffer = new byte[4096];
    this.bufferSize = 0;
    this.bxm = 0;
    this.Bzw = 0;
    this.input = paramInputStream;
    this.Bzu = false;
    AppMethodBeat.o(121439);
  }

  public static e S(InputStream paramInputStream)
  {
    AppMethodBeat.i(121426);
    paramInputStream = new e(paramInputStream);
    AppMethodBeat.o(121426);
    return paramInputStream;
  }

  private void Uu(int paramInt)
  {
    AppMethodBeat.i(121444);
    if (!Uv(paramInt))
    {
      k localk = k.eiq();
      AppMethodBeat.o(121444);
      throw localk;
    }
    AppMethodBeat.o(121444);
  }

  private boolean Uv(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(121445);
    Object localObject;
    if (this.bxm + paramInt <= this.bufferSize)
    {
      localObject = new IllegalStateException(77 + "refillBuffer() called when " + paramInt + " bytes were already available in buffer");
      AppMethodBeat.o(121445);
      throw ((Throwable)localObject);
    }
    if (this.Bzw + this.bxm + paramInt > this.bxo)
      AppMethodBeat.o(121445);
    while (true)
    {
      return bool;
      if (this.input != null)
      {
        int i = this.bxm;
        if (i > 0)
        {
          if (this.bufferSize > i)
          {
            localObject = this.buffer;
            System.arraycopy(localObject, i, localObject, 0, this.bufferSize - i);
          }
          this.Bzw += i;
          this.bufferSize -= i;
          this.bxm = 0;
        }
        i = this.input.read(this.buffer, this.bufferSize, this.buffer.length - this.bufferSize);
        if ((i == 0) || (i < -1) || (i > this.buffer.length))
        {
          localObject = new IllegalStateException(102 + "InputStream#read(byte[]) returned invalid result: " + i + "\nThe InputStream implementation is buggy.");
          AppMethodBeat.o(121445);
          throw ((Throwable)localObject);
        }
        if (i > 0)
        {
          this.bufferSize = (i + this.bufferSize);
          if (this.Bzw + paramInt - this.bxr > 0)
          {
            localObject = k.eix();
            AppMethodBeat.o(121445);
            throw ((Throwable)localObject);
          }
          vf();
          if (this.bufferSize < paramInt)
            break;
          bool = true;
          AppMethodBeat.o(121445);
          continue;
        }
      }
      AppMethodBeat.o(121445);
    }
  }

  private void Ux(int paramInt)
  {
    AppMethodBeat.i(121449);
    k localk;
    if (paramInt < 0)
    {
      localk = k.eir();
      AppMethodBeat.o(121449);
      throw localk;
    }
    if (this.Bzw + this.bxm + paramInt > this.bxo)
    {
      fs(this.bxo - this.Bzw - this.bxm);
      localk = k.eiq();
      AppMethodBeat.o(121449);
      throw localk;
    }
    int i = this.bufferSize - this.bxm;
    this.bxm = this.bufferSize;
    Uu(1);
    while (paramInt - i > this.bufferSize)
    {
      i += this.bufferSize;
      this.bxm = this.bufferSize;
      Uu(1);
    }
    this.bxm = (paramInt - i);
    AppMethodBeat.o(121449);
  }

  static e a(p paramp)
  {
    AppMethodBeat.i(121427);
    e locale = new e(paramp);
    try
    {
      locale.fo(paramp.size());
      AppMethodBeat.o(121427);
      return locale;
    }
    catch (k paramp)
    {
      paramp = new IllegalArgumentException(paramp);
      AppMethodBeat.o(121427);
    }
    throw paramp;
  }

  private long ehZ()
  {
    AppMethodBeat.i(121436);
    long l = 0L;
    for (int i = 0; i < 64; i += 7)
    {
      int j = vh();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0)
      {
        AppMethodBeat.o(121436);
        return l;
      }
    }
    k localk = k.eis();
    AppMethodBeat.o(121436);
    throw localk;
  }

  private boolean eic()
  {
    boolean bool = true;
    AppMethodBeat.i(121443);
    if ((this.bxm == this.bufferSize) && (!Uv(1)))
      AppMethodBeat.o(121443);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121443);
    }
  }

  private void fs(int paramInt)
  {
    AppMethodBeat.i(121448);
    if ((paramInt <= this.bufferSize - this.bxm) && (paramInt >= 0))
    {
      this.bxm += paramInt;
      AppMethodBeat.o(121448);
    }
    while (true)
    {
      return;
      Ux(paramInt);
      AppMethodBeat.o(121448);
    }
  }

  public static long nS(long paramLong)
  {
    return paramLong >>> 1 ^ -(1L & paramLong);
  }

  private void vf()
  {
    this.bufferSize += this.bxl;
    int i = this.Bzw + this.bufferSize;
    if (i > this.bxo)
    {
      this.bxl = (i - this.bxo);
      this.bufferSize -= this.bxl;
    }
    while (true)
    {
      return;
      this.bxl = 0;
    }
  }

  private byte vh()
  {
    AppMethodBeat.i(121446);
    if (this.bxm == this.bufferSize)
      Uu(1);
    byte[] arrayOfByte = this.buffer;
    int i = this.bxm;
    this.bxm = (i + 1);
    byte b = arrayOfByte[i];
    AppMethodBeat.o(121446);
    return b;
  }

  final byte[] Uw(int paramInt)
  {
    AppMethodBeat.i(121447);
    Object localObject1;
    if (paramInt <= 0)
      if (paramInt == 0)
      {
        localObject1 = j.EMPTY_BYTE_ARRAY;
        AppMethodBeat.o(121447);
      }
    while (true)
    {
      return localObject1;
      localObject1 = k.eir();
      AppMethodBeat.o(121447);
      throw ((Throwable)localObject1);
      if (this.Bzw + this.bxm + paramInt > this.bxo)
      {
        fs(this.bxo - this.Bzw - this.bxm);
        localObject1 = k.eiq();
        AppMethodBeat.o(121447);
        throw ((Throwable)localObject1);
      }
      int i;
      int j;
      if (paramInt < 4096)
      {
        localObject1 = new byte[paramInt];
        i = this.bufferSize - this.bxm;
        System.arraycopy(this.buffer, this.bxm, localObject1, 0, i);
        this.bxm = this.bufferSize;
        j = paramInt - i;
        if (this.bufferSize - this.bxm < j)
          Uu(j);
        System.arraycopy(this.buffer, 0, localObject1, i, paramInt - i);
        this.bxm = (paramInt - i);
        AppMethodBeat.o(121447);
      }
      else
      {
        int k = this.bxm;
        int m = this.bufferSize;
        this.Bzw += this.bufferSize;
        this.bxm = 0;
        this.bufferSize = 0;
        Object localObject2 = new ArrayList();
        j = paramInt - (m - k);
        while (j > 0)
        {
          localObject1 = new byte[Math.min(j, 4096)];
          i = 0;
          while (i < localObject1.length)
          {
            if (this.input == null);
            for (int n = -1; n == -1; n = this.input.read((byte[])localObject1, i, localObject1.length - i))
            {
              localObject1 = k.eiq();
              AppMethodBeat.o(121447);
              throw ((Throwable)localObject1);
            }
            this.Bzw += n;
            i += n;
          }
          i = localObject1.length;
          ((List)localObject2).add(localObject1);
          j -= i;
        }
        localObject1 = new byte[paramInt];
        paramInt = m - k;
        System.arraycopy(this.buffer, k, localObject1, 0, paramInt);
        Iterator localIterator = ((List)localObject2).iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (byte[])localIterator.next();
          System.arraycopy(localObject2, 0, localObject1, paramInt, localObject2.length);
          paramInt = localObject2.length + paramInt;
        }
        AppMethodBeat.o(121447);
      }
    }
  }

  public final <T extends q> T a(s<T> params, g paramg)
  {
    AppMethodBeat.i(121432);
    int i = vd();
    if (this.bxp >= this.bxq)
    {
      params = k.eiw();
      AppMethodBeat.o(121432);
      throw params;
    }
    i = fo(i);
    this.bxp += 1;
    params = (q)params.a(this, paramg);
    fm(0);
    this.bxp -= 1;
    fp(i);
    AppMethodBeat.o(121432);
    return params;
  }

  public final boolean a(int paramInt, f paramf)
  {
    boolean bool = true;
    AppMethodBeat.i(121430);
    long l;
    switch (z.fy(paramInt))
    {
    default:
      paramf = k.eiv();
      AppMethodBeat.o(121430);
      throw paramf;
    case 0:
      l = ve();
      paramf.fw(paramInt);
      paramf.av(l);
      AppMethodBeat.o(121430);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return bool;
      l = eib();
      paramf.fw(paramInt);
      paramf.nV(l);
      AppMethodBeat.o(121430);
      continue;
      d locald = ehY();
      paramf.fw(paramInt);
      paramf.b(locald);
      AppMethodBeat.o(121430);
      continue;
      paramf.fw(paramInt);
      do
        i = vc();
      while ((i != 0) && (a(i, paramf)));
      paramInt = z.bv(z.fz(paramInt), 4);
      fm(paramInt);
      paramf.fw(paramInt);
      AppMethodBeat.o(121430);
      continue;
      bool = false;
      AppMethodBeat.o(121430);
      continue;
      int i = eia();
      paramf.fw(paramInt);
      paramf.UA(i);
      AppMethodBeat.o(121430);
    }
  }

  public final boolean ehX()
  {
    AppMethodBeat.i(121431);
    boolean bool;
    if (ve() != 0L)
    {
      bool = true;
      AppMethodBeat.o(121431);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121431);
    }
  }

  public final d ehY()
  {
    AppMethodBeat.i(121433);
    int i = vd();
    Object localObject;
    if ((i <= this.bufferSize - this.bxm) && (i > 0))
      if ((this.Bzu) && (this.Bzv))
      {
        localObject = new c(this.buffer, this.bxm, i);
        this.bxm = (i + this.bxm);
        AppMethodBeat.o(121433);
      }
    while (true)
    {
      return localObject;
      localObject = d.A(this.buffer, this.bxm, i);
      break;
      if (i == 0)
      {
        localObject = d.Bzq;
        AppMethodBeat.o(121433);
      }
      else
      {
        localObject = new p(Uw(i));
        AppMethodBeat.o(121433);
      }
    }
  }

  public final int eia()
  {
    AppMethodBeat.i(121437);
    int i = this.bxm;
    int j = i;
    if (this.bufferSize - i < 4)
    {
      Uu(4);
      j = this.bxm;
    }
    byte[] arrayOfByte = this.buffer;
    this.bxm = (j + 4);
    int k = arrayOfByte[j];
    i = arrayOfByte[(j + 1)];
    int m = arrayOfByte[(j + 2)];
    j = arrayOfByte[(j + 3)];
    AppMethodBeat.o(121437);
    return (j & 0xFF) << 24 | (k & 0xFF | (i & 0xFF) << 8 | (m & 0xFF) << 16);
  }

  public final long eib()
  {
    AppMethodBeat.i(121438);
    int i = this.bxm;
    int j = i;
    if (this.bufferSize - i < 8)
    {
      Uu(8);
      j = this.bxm;
    }
    byte[] arrayOfByte = this.buffer;
    this.bxm = (j + 8);
    long l1 = arrayOfByte[j];
    long l2 = arrayOfByte[(j + 1)];
    long l3 = arrayOfByte[(j + 2)];
    long l4 = arrayOfByte[(j + 3)];
    long l5 = arrayOfByte[(j + 4)];
    long l6 = arrayOfByte[(j + 5)];
    long l7 = arrayOfByte[(j + 6)];
    long l8 = arrayOfByte[(j + 7)];
    AppMethodBeat.o(121438);
    return (l8 & 0xFF) << 56 | (l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48);
  }

  public final void fm(int paramInt)
  {
    AppMethodBeat.i(121429);
    if (this.bxn != paramInt)
    {
      k localk = k.eiu();
      AppMethodBeat.o(121429);
      throw localk;
    }
    AppMethodBeat.o(121429);
  }

  public final int fo(int paramInt)
  {
    AppMethodBeat.i(121441);
    k localk;
    if (paramInt < 0)
    {
      localk = k.eir();
      AppMethodBeat.o(121441);
      throw localk;
    }
    paramInt = this.Bzw + this.bxm + paramInt;
    int i = this.bxo;
    if (paramInt > i)
    {
      localk = k.eiq();
      AppMethodBeat.o(121441);
      throw localk;
    }
    this.bxo = paramInt;
    vf();
    AppMethodBeat.o(121441);
    return i;
  }

  public final void fp(int paramInt)
  {
    AppMethodBeat.i(121442);
    this.bxo = paramInt;
    vf();
    AppMethodBeat.o(121442);
  }

  public final int vc()
  {
    int i = 0;
    AppMethodBeat.i(121428);
    if (eic())
    {
      this.bxn = 0;
      AppMethodBeat.o(121428);
    }
    while (true)
    {
      return i;
      this.bxn = vd();
      if (z.fz(this.bxn) == 0)
      {
        k localk = k.eit();
        AppMethodBeat.o(121428);
        throw localk;
      }
      i = this.bxn;
      AppMethodBeat.o(121428);
    }
  }

  public final int vd()
  {
    AppMethodBeat.i(121434);
    int i = this.bxm;
    byte[] arrayOfByte;
    int j;
    int k;
    if (this.bufferSize != i)
    {
      arrayOfByte = this.buffer;
      j = i + 1;
      k = arrayOfByte[i];
      if (k >= 0)
      {
        this.bxm = j;
        AppMethodBeat.o(121434);
        return k;
      }
      if (this.bufferSize - j >= 9)
      {
        i = j + 1;
        j = k ^ arrayOfByte[j] << 7;
        if (j < 0L)
          k = (int)(j ^ 0xFFFFFF80);
      }
    }
    while (true)
    {
      this.bxm = i;
      AppMethodBeat.o(121434);
      break;
      k = i + 1;
      j ^= arrayOfByte[i] << 14;
      if (j >= 0L)
      {
        j = (int)(j ^ 0x3F80);
        i = k;
        k = j;
      }
      else
      {
        i = k + 1;
        j ^= arrayOfByte[k] << 21;
        if (j < 0L)
        {
          k = (int)(j ^ 0xFFE03F80);
        }
        else
        {
          int m = i + 1;
          k = arrayOfByte[i];
          j = (int)(j ^ k << 28 ^ 0xFE03F80);
          i = m;
          if (k < 0)
          {
            int n = m + 1;
            k = j;
            i = n;
            if (arrayOfByte[m] >= 0)
              continue;
            m = n + 1;
            i = m;
            if (arrayOfByte[n] < 0)
            {
              n = m + 1;
              k = j;
              i = n;
              if (arrayOfByte[m] >= 0)
                continue;
              m = n + 1;
              i = m;
              if (arrayOfByte[n] < 0)
              {
                i = m + 1;
                k = j;
                if (arrayOfByte[m] >= 0)
                  continue;
                k = (int)ehZ();
                AppMethodBeat.o(121434);
                break;
              }
            }
          }
          k = j;
        }
      }
    }
  }

  public final long ve()
  {
    AppMethodBeat.i(121435);
    int i = this.bxm;
    byte[] arrayOfByte;
    int j;
    long l;
    if (this.bufferSize != i)
    {
      arrayOfByte = this.buffer;
      j = i + 1;
      int k = arrayOfByte[i];
      if (k >= 0)
      {
        this.bxm = j;
        l = k;
        AppMethodBeat.o(121435);
        return l;
      }
      if (this.bufferSize - j >= 9)
      {
        i = j + 1;
        l = k ^ arrayOfByte[j] << 7;
        if (l < 0L)
          l ^= -128L;
      }
    }
    while (true)
    {
      this.bxm = i;
      AppMethodBeat.o(121435);
      break;
      j = i + 1;
      l ^= arrayOfByte[i] << 14;
      if (l >= 0L)
      {
        l ^= 16256L;
        i = j;
      }
      else
      {
        i = j + 1;
        l ^= arrayOfByte[j] << 21;
        if (l < 0L)
        {
          l ^= -2080896L;
        }
        else
        {
          j = i + 1;
          l ^= arrayOfByte[i] << 28;
          if (l >= 0L)
          {
            l ^= 266354560L;
            i = j;
          }
          else
          {
            i = j + 1;
            l ^= arrayOfByte[j] << 35;
            if (l < 0L)
            {
              l ^= -34093383808L;
            }
            else
            {
              j = i + 1;
              l ^= arrayOfByte[i] << 42;
              if (l >= 0L)
              {
                l ^= 4363953127296L;
                i = j;
              }
              else
              {
                i = j + 1;
                l ^= arrayOfByte[j] << 49;
                if (l < 0L)
                {
                  l ^= -558586000294016L;
                }
                else
                {
                  j = i + 1;
                  l = l ^ arrayOfByte[i] << 56 ^ 0xFE03F80;
                  if (l < 0L)
                  {
                    i = j + 1;
                    if (arrayOfByte[j] >= 0L)
                      continue;
                    l = ehZ();
                    AppMethodBeat.o(121435);
                    break;
                  }
                  i = j;
                }
              }
            }
          }
        }
      }
    }
  }

  public final int vg()
  {
    if (this.bxo == 2147483647);
    int j;
    for (int i = -1; ; i = this.bxo - (j + i))
    {
      return i;
      j = this.Bzw;
      i = this.bxm;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.e
 * JD-Core Version:    0.6.2
 */