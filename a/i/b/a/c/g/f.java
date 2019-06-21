package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public final class f
{
  private int Bzy;
  private final byte[] buffer;
  private final int limit;
  private final OutputStream output;
  private int position;

  private f(OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(121450);
    this.Bzy = 0;
    this.output = paramOutputStream;
    this.buffer = paramArrayOfByte;
    this.position = 0;
    this.limit = paramArrayOfByte.length;
    AppMethodBeat.o(121450);
  }

  public static int UB(int paramInt)
  {
    return paramInt << 1 ^ paramInt >> 31;
  }

  public static int a(m paramm)
  {
    AppMethodBeat.i(121476);
    int i = paramm.vq();
    int j = fx(i);
    AppMethodBeat.o(121476);
    return i + j;
  }

  private void a(d paramd, int paramInt)
  {
    AppMethodBeat.i(121484);
    if (this.limit - this.position >= paramInt)
    {
      paramd.f(this.buffer, 0, this.position, paramInt);
      this.position += paramInt;
    }
    while (true)
    {
      this.Bzy += paramInt;
      AppMethodBeat.o(121484);
      return;
      int i = this.limit - this.position;
      paramd.f(this.buffer, 0, this.position, i);
      int j = i + 0;
      paramInt -= i;
      this.position = this.limit;
      this.Bzy = (i + this.Bzy);
      eid();
      if (paramInt <= this.limit)
      {
        paramd.f(this.buffer, j, 0, paramInt);
        this.position = paramInt;
      }
      else
      {
        paramd.a(this.output, j, paramInt);
      }
    }
  }

  public static int aw(long paramLong)
  {
    int i;
    if ((0xFFFFFF80 & paramLong) == 0L)
      i = 1;
    while (true)
    {
      return i;
      if ((0xFFFFC000 & paramLong) == 0L)
        i = 2;
      else if ((0xFFE00000 & paramLong) == 0L)
        i = 3;
      else if ((0xF0000000 & paramLong) == 0L)
        i = 4;
      else if ((0x0 & paramLong) == 0L)
        i = 5;
      else if ((0x0 & paramLong) == 0L)
        i = 6;
      else if ((0x0 & paramLong) == 0L)
        i = 7;
      else if ((0x0 & paramLong) == 0L)
        i = 8;
      else if ((0x0 & paramLong) == 0L)
        i = 9;
      else
        i = 10;
    }
  }

  public static int b(int paramInt, d paramd)
  {
    AppMethodBeat.i(121470);
    int i = fv(paramInt);
    paramInt = c(paramd);
    AppMethodBeat.o(121470);
    return i + paramInt;
  }

  public static int bf(String paramString)
  {
    AppMethodBeat.i(121474);
    try
    {
      paramString = paramString.getBytes("UTF-8");
      int i = fx(paramString.length);
      int j = paramString.length;
      AppMethodBeat.o(121474);
      return j + i;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString = new RuntimeException("UTF-8 not supported.", paramString);
      AppMethodBeat.o(121474);
    }
    throw paramString;
  }

  public static int bs(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121468);
    paramInt1 = fv(paramInt1);
    paramInt2 = ft(paramInt2);
    AppMethodBeat.o(121468);
    return paramInt1 + paramInt2;
  }

  public static int c(int paramInt, q paramq)
  {
    AppMethodBeat.i(121469);
    paramInt = fv(paramInt);
    int i = c(paramq);
    AppMethodBeat.o(121469);
    return paramInt + i;
  }

  public static int c(d paramd)
  {
    AppMethodBeat.i(121477);
    int i = fx(paramd.size());
    int j = paramd.size();
    AppMethodBeat.o(121477);
    return i + j;
  }

  public static int c(q paramq)
  {
    AppMethodBeat.i(121475);
    int i = paramq.vq();
    int j = fx(i);
    AppMethodBeat.o(121475);
    return i + j;
  }

  private void c(byte paramByte)
  {
    AppMethodBeat.i(121481);
    if (this.position == this.limit)
      eid();
    byte[] arrayOfByte = this.buffer;
    int i = this.position;
    this.position = (i + 1);
    arrayOfByte[i] = ((byte)paramByte);
    this.Bzy += 1;
    AppMethodBeat.o(121481);
  }

  public static int cz(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(121478);
    int i = fx(paramArrayOfByte.length);
    int j = paramArrayOfByte.length;
    AppMethodBeat.o(121478);
    return i + j;
  }

  public static f e(OutputStream paramOutputStream, int paramInt)
  {
    AppMethodBeat.i(121451);
    paramOutputStream = new f(paramOutputStream, new byte[paramInt]);
    AppMethodBeat.o(121451);
    return paramOutputStream;
  }

  private void eid()
  {
    AppMethodBeat.i(121479);
    if (this.output == null)
    {
      f.a locala = new f.a();
      AppMethodBeat.o(121479);
      throw locala;
    }
    this.output.write(this.buffer, 0, this.position);
    this.position = 0;
    AppMethodBeat.o(121479);
  }

  public static int ft(int paramInt)
  {
    AppMethodBeat.i(121473);
    if (paramInt >= 0)
    {
      paramInt = fx(paramInt);
      AppMethodBeat.o(121473);
    }
    while (true)
    {
      return paramInt;
      paramInt = 10;
      AppMethodBeat.o(121473);
    }
  }

  public static int fv(int paramInt)
  {
    AppMethodBeat.i(121486);
    paramInt = fx(z.bv(paramInt, 0));
    AppMethodBeat.o(121486);
    return paramInt;
  }

  public static int fx(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0)
      paramInt = 1;
    while (true)
    {
      return paramInt;
      if ((paramInt & 0xFFFFC000) == 0)
        paramInt = 2;
      else if ((0xFFE00000 & paramInt) == 0)
        paramInt = 3;
      else if ((0xF0000000 & paramInt) == 0)
        paramInt = 4;
      else
        paramInt = 5;
    }
  }

  public static int ip(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121471);
    paramInt1 = fv(paramInt1);
    paramInt2 = ft(paramInt2);
    AppMethodBeat.o(121471);
    return paramInt1 + paramInt2;
  }

  public static int nU(long paramLong)
  {
    AppMethodBeat.i(121472);
    int i = fv(2);
    int j = aw(nW(paramLong));
    AppMethodBeat.o(121472);
    return i + j;
  }

  public static long nW(long paramLong)
  {
    return paramLong << 1 ^ paramLong >> 63;
  }

  private void q(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(121483);
    if (this.limit - this.position >= paramInt)
    {
      System.arraycopy(paramArrayOfByte, 0, this.buffer, this.position, paramInt);
      this.position += paramInt;
    }
    while (true)
    {
      this.Bzy += paramInt;
      AppMethodBeat.o(121483);
      return;
      int i = this.limit - this.position;
      System.arraycopy(paramArrayOfByte, 0, this.buffer, this.position, i);
      int j = i + 0;
      paramInt -= i;
      this.position = this.limit;
      this.Bzy = (i + this.Bzy);
      eid();
      if (paramInt <= this.limit)
      {
        System.arraycopy(paramArrayOfByte, j, this.buffer, 0, paramInt);
        this.position = paramInt;
      }
      else
      {
        this.output.write(paramArrayOfByte, j, paramInt);
      }
    }
  }

  public final void J(double paramDouble)
  {
    AppMethodBeat.i(121458);
    nV(Double.doubleToRawLongBits(paramDouble));
    AppMethodBeat.o(121458);
  }

  public final void UA(int paramInt)
  {
    AppMethodBeat.i(121489);
    c((byte)(paramInt & 0xFF));
    c((byte)(paramInt >> 8 & 0xFF));
    c((byte)(paramInt >> 16 & 0xFF));
    c((byte)(paramInt >> 24 & 0xFF));
    AppMethodBeat.o(121489);
  }

  public final void Uy(int paramInt)
  {
    AppMethodBeat.i(121460);
    if (paramInt >= 0)
    {
      fw(paramInt);
      AppMethodBeat.o(121460);
    }
    while (true)
    {
      return;
      av(paramInt);
      AppMethodBeat.o(121460);
    }
  }

  public final void Uz(int paramInt)
  {
    AppMethodBeat.i(121466);
    fw(UB(paramInt));
    AppMethodBeat.o(121466);
  }

  public final void a(int paramInt, d paramd)
  {
    AppMethodBeat.i(121455);
    bu(paramInt, 2);
    b(paramd);
    AppMethodBeat.o(121455);
  }

  public final void a(int paramInt, q paramq)
  {
    AppMethodBeat.i(121454);
    bu(paramInt, 2);
    b(paramq);
    AppMethodBeat.o(121454);
  }

  public final void av(long paramLong)
  {
    AppMethodBeat.i(121488);
    while (true)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        c((byte)(int)paramLong);
        AppMethodBeat.o(121488);
        return;
      }
      c((byte)((int)paramLong & 0x7F | 0x80));
      paramLong >>>= 7;
    }
  }

  public final void awd(String paramString)
  {
    AppMethodBeat.i(121462);
    paramString = paramString.getBytes("UTF-8");
    fw(paramString.length);
    q(paramString, paramString.length);
    AppMethodBeat.o(121462);
  }

  public final void b(int paramInt, q paramq)
  {
    AppMethodBeat.i(121457);
    bu(1, 3);
    bu(2, 0);
    fw(paramInt);
    a(3, paramq);
    bu(1, 4);
    AppMethodBeat.o(121457);
  }

  public final void b(d paramd)
  {
    AppMethodBeat.i(121464);
    fw(paramd.size());
    d(paramd);
    AppMethodBeat.o(121464);
  }

  public final void b(q paramq)
  {
    AppMethodBeat.i(121463);
    fw(paramq.vq());
    paramq.a(this);
    AppMethodBeat.o(121463);
  }

  public final void bq(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121452);
    bu(paramInt1, 0);
    Uy(paramInt2);
    AppMethodBeat.o(121452);
  }

  public final void bu(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121485);
    fw(z.bv(paramInt1, paramInt2));
    AppMethodBeat.o(121485);
  }

  public final void bz(float paramFloat)
  {
    AppMethodBeat.i(121459);
    UA(Float.floatToRawIntBits(paramFloat));
    AppMethodBeat.o(121459);
  }

  public final void cy(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(121465);
    fw(paramArrayOfByte.length);
    q(paramArrayOfByte, paramArrayOfByte.length);
    AppMethodBeat.o(121465);
  }

  public final void d(d paramd)
  {
    AppMethodBeat.i(121482);
    a(paramd, paramd.size());
    AppMethodBeat.o(121482);
  }

  public final void flush()
  {
    AppMethodBeat.i(121480);
    if (this.output != null)
      eid();
    AppMethodBeat.o(121480);
  }

  public final void fw(int paramInt)
  {
    AppMethodBeat.i(121487);
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        c((byte)paramInt);
        AppMethodBeat.o(121487);
        return;
      }
      c((byte)(paramInt & 0x7F | 0x80));
      paramInt >>>= 7;
    }
  }

  public final void io(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121456);
    bu(paramInt1, 0);
    Uy(paramInt2);
    AppMethodBeat.o(121456);
  }

  public final void nT(long paramLong)
  {
    AppMethodBeat.i(121467);
    av(nW(paramLong));
    AppMethodBeat.o(121467);
  }

  public final void nV(long paramLong)
  {
    AppMethodBeat.i(121490);
    c((byte)((int)paramLong & 0xFF));
    c((byte)((int)(paramLong >> 8) & 0xFF));
    c((byte)((int)(paramLong >> 16) & 0xFF));
    c((byte)((int)(paramLong >> 24) & 0xFF));
    c((byte)((int)(paramLong >> 32) & 0xFF));
    c((byte)((int)(paramLong >> 40) & 0xFF));
    c((byte)((int)(paramLong >> 48) & 0xFF));
    c((byte)((int)(paramLong >> 56) & 0xFF));
    AppMethodBeat.o(121490);
  }

  public final void rP(boolean paramBoolean)
  {
    AppMethodBeat.i(121453);
    bu(3, 0);
    rQ(paramBoolean);
    AppMethodBeat.o(121453);
  }

  public final void rQ(boolean paramBoolean)
  {
    AppMethodBeat.i(121461);
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      c((byte)i);
      AppMethodBeat.o(121461);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.f
 * JD-Core Version:    0.6.2
 */