package e.a.a.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.io.UnsupportedEncodingException;

public final class a
{
  private final byte[] buffer;
  private final int limit;
  private int position;

  public a(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(51891);
    this.buffer = paramArrayOfByte;
    this.position = 0;
    this.limit = (paramInt + 0);
    AppMethodBeat.o(51891);
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

  public static int b(int paramInt, b paramb)
  {
    AppMethodBeat.i(51903);
    if (paramb == null)
    {
      paramInt = 0;
      AppMethodBeat.o(51903);
    }
    while (true)
    {
      return paramInt;
      paramInt = fv(paramInt) + fx(paramb.wR.length) + paramb.wR.length;
      AppMethodBeat.o(51903);
    }
  }

  public static int bs(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51901);
    if (paramInt2 >= 0)
    {
      paramInt1 = fv(paramInt1) + fx(paramInt2);
      AppMethodBeat.o(51901);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = fv(paramInt1) + 10;
      AppMethodBeat.o(51901);
    }
  }

  private void c(byte paramByte)
  {
    byte[] arrayOfByte = this.buffer;
    int i = this.position;
    this.position = (i + 1);
    arrayOfByte[i] = ((byte)paramByte);
  }

  private void cC(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(51904);
    if (paramArrayOfByte == null)
      AppMethodBeat.o(51904);
    while (true)
    {
      return;
      q(paramArrayOfByte, paramArrayOfByte.length);
      AppMethodBeat.o(51904);
    }
  }

  public static int f(int paramInt, String paramString)
  {
    AppMethodBeat.i(51902);
    if (paramString == null)
    {
      paramInt = 0;
      AppMethodBeat.o(51902);
    }
    while (true)
    {
      return paramInt;
      try
      {
        paramString = paramString.getBytes("UTF-8");
        paramInt = fv(paramInt);
        int i = fx(paramString.length);
        int j = paramString.length;
        paramInt = j + (paramInt + i);
        AppMethodBeat.o(51902);
      }
      catch (UnsupportedEncodingException paramString)
      {
        paramString = new IllegalStateException("UTF-8 not supported.");
        AppMethodBeat.o(51902);
      }
    }
    throw paramString;
  }

  public static int fv(int paramInt)
  {
    AppMethodBeat.i(51907);
    paramInt = fx(e.a.a.b.a.bv(paramInt, 0));
    AppMethodBeat.o(51907);
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

  public static int o(int paramInt, long paramLong)
  {
    AppMethodBeat.i(51900);
    paramInt = fv(paramInt);
    int i = aw(paramLong);
    AppMethodBeat.o(51900);
    return paramInt + i;
  }

  private void q(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(51905);
    if (paramArrayOfByte == null)
      AppMethodBeat.o(51905);
    while (true)
    {
      return;
      if (this.limit - this.position >= paramInt)
      {
        System.arraycopy(paramArrayOfByte, 0, this.buffer, this.position, paramInt);
        this.position += paramInt;
        AppMethodBeat.o(51905);
      }
      else
      {
        int i = this.limit - this.position;
        System.arraycopy(paramArrayOfByte, 0, this.buffer, this.position, i);
        paramInt -= i;
        this.position = this.limit;
        if (paramInt <= this.limit)
        {
          System.arraycopy(paramArrayOfByte, i + 0, this.buffer, 0, paramInt);
          this.position = paramInt;
        }
        AppMethodBeat.o(51905);
      }
    }
  }

  public final void a(int paramInt, b paramb)
  {
    AppMethodBeat.i(51898);
    if (paramb == null)
      AppMethodBeat.o(51898);
    while (true)
    {
      return;
      bu(paramInt, 2);
      paramb = paramb.toByteArray();
      fw(paramb.length);
      cC(paramb);
      AppMethodBeat.o(51898);
    }
  }

  public final void aN(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(51896);
    bu(paramInt, 0);
    paramInt = i;
    if (paramBoolean)
      paramInt = 1;
    c((byte)paramInt);
    AppMethodBeat.o(51896);
  }

  public final void av(long paramLong)
  {
    AppMethodBeat.i(51909);
    while (true)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        c((byte)(int)paramLong);
        AppMethodBeat.o(51909);
        return;
      }
      c((byte)((int)paramLong & 0x7F | 0x80));
      paramLong >>>= 7;
    }
  }

  public final void bq(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51895);
    bu(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      fw(paramInt2);
      AppMethodBeat.o(51895);
    }
    while (true)
    {
      return;
      av(paramInt2);
      AppMethodBeat.o(51895);
    }
  }

  public final void bu(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51906);
    fw(e.a.a.b.a.bv(paramInt1, paramInt2));
    AppMethodBeat.o(51906);
  }

  public final void e(int paramInt, String paramString)
  {
    AppMethodBeat.i(51897);
    if (paramString == null)
      AppMethodBeat.o(51897);
    while (true)
    {
      return;
      bu(paramInt, 2);
      paramString = paramString.getBytes("UTF-8");
      fw(paramString.length);
      cC(paramString);
      AppMethodBeat.o(51897);
    }
  }

  public final void f(int paramInt, double paramDouble)
  {
    AppMethodBeat.i(51892);
    bu(paramInt, 1);
    long l = Double.doubleToLongBits(paramDouble);
    c((byte)((int)l & 0xFF));
    c((byte)((int)(l >> 8) & 0xFF));
    c((byte)((int)(l >> 16) & 0xFF));
    c((byte)((int)(l >> 24) & 0xFF));
    c((byte)((int)(l >> 32) & 0xFF));
    c((byte)((int)(l >> 40) & 0xFF));
    c((byte)((int)(l >> 48) & 0xFF));
    c((byte)((int)(l >> 56) & 0xFF));
    AppMethodBeat.o(51892);
  }

  public final void fw(int paramInt)
  {
    AppMethodBeat.i(51908);
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        c((byte)paramInt);
        AppMethodBeat.o(51908);
        return;
      }
      c((byte)(paramInt & 0x7F | 0x80));
      paramInt >>>= 7;
    }
  }

  public final void iy(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51899);
    bu(paramInt1, 2);
    fw(paramInt2);
    AppMethodBeat.o(51899);
  }

  public final void m(int paramInt, long paramLong)
  {
    AppMethodBeat.i(51894);
    bu(paramInt, 0);
    av(paramLong);
    AppMethodBeat.o(51894);
  }

  public final void r(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(51893);
    bu(paramInt, 5);
    paramInt = Float.floatToIntBits(paramFloat);
    c((byte)(paramInt & 0xFF));
    c((byte)(paramInt >> 8 & 0xFF));
    c((byte)(paramInt >> 16 & 0xFF));
    c((byte)(paramInt >> 24 & 0xFF));
    AppMethodBeat.o(51893);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     e.a.a.b.b.a
 * JD-Core Version:    0.6.2
 */