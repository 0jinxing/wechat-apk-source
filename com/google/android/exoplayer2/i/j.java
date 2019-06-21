package com.google.android.exoplayer2.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class j
{
  public static final byte[] bqY;
  public static final float[] brl;
  private static final Object brm;
  private static int[] brn;

  static
  {
    AppMethodBeat.i(95892);
    bqY = new byte[] { 0, 0, 0, 1 };
    brl = new float[] { 1.0F, 1.0F, 1.090909F, 0.9090909F, 1.454546F, 1.212121F, 2.181818F, 1.818182F, 2.909091F, 2.424243F, 1.636364F, 1.363636F, 1.939394F, 1.616162F, 1.333333F, 1.5F, 2.0F };
    brm = new Object();
    brn = new int[10];
    AppMethodBeat.o(95892);
  }

  public static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean[] paramArrayOfBoolean)
  {
    boolean bool1 = true;
    AppMethodBeat.i(95891);
    int i = paramInt2 - paramInt1;
    if (i >= 0)
    {
      bool2 = true;
      a.checkState(bool2);
      if (i != 0)
        break label44;
      AppMethodBeat.o(95891);
    }
    while (true)
    {
      return paramInt2;
      bool2 = false;
      break;
      label44: if (paramArrayOfBoolean == null)
        break label148;
      if (paramArrayOfBoolean[0] != 0)
      {
        b(paramArrayOfBoolean);
        paramInt2 = paramInt1 - 3;
        AppMethodBeat.o(95891);
      }
      else if ((i > 1) && (paramArrayOfBoolean[1] != 0) && (paramArrayOfByte[paramInt1] == 1))
      {
        b(paramArrayOfBoolean);
        paramInt2 = paramInt1 - 2;
        AppMethodBeat.o(95891);
      }
      else
      {
        if ((i <= 2) || (paramArrayOfBoolean[2] == 0) || (paramArrayOfByte[paramInt1] != 0) || (paramArrayOfByte[(paramInt1 + 1)] != 1))
          break label148;
        b(paramArrayOfBoolean);
        paramInt2 = paramInt1 - 1;
        AppMethodBeat.o(95891);
      }
    }
    label148: paramInt1 += 2;
    while (true)
    {
      if (paramInt1 >= paramInt2 - 1)
        break label227;
      int j = paramInt1;
      if ((paramArrayOfByte[paramInt1] & 0xFE) == 0)
      {
        if ((paramArrayOfByte[(paramInt1 - 2)] == 0) && (paramArrayOfByte[(paramInt1 - 1)] == 0) && (paramArrayOfByte[paramInt1] == 1))
        {
          if (paramArrayOfBoolean != null)
            b(paramArrayOfBoolean);
          paramInt2 = paramInt1 - 2;
          AppMethodBeat.o(95891);
          break;
        }
        j = paramInt1 - 2;
      }
      paramInt1 = j + 3;
    }
    label227: if (paramArrayOfBoolean != null)
    {
      if (i <= 2)
        break label331;
      if ((paramArrayOfByte[(paramInt2 - 3)] != 0) || (paramArrayOfByte[(paramInt2 - 2)] != 0) || (paramArrayOfByte[(paramInt2 - 1)] != 1))
        break label325;
      bool2 = true;
      paramArrayOfBoolean[0] = bool2;
      if (i <= 1)
        break label405;
      if ((paramArrayOfByte[(paramInt2 - 2)] != 0) || (paramArrayOfByte[(paramInt2 - 1)] != 0))
        break label399;
      bool2 = true;
      paramArrayOfBoolean[1] = bool2;
      if (paramArrayOfByte[(paramInt2 - 1)] != 0)
        break label431;
    }
    label265: label295: label431: for (boolean bool2 = bool1; ; bool2 = false)
    {
      paramArrayOfBoolean[2] = bool2;
      AppMethodBeat.o(95891);
      break;
      label325: bool2 = false;
      break label265;
      label331: if (i == 2)
      {
        if ((paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[(paramInt2 - 2)] == 0) && (paramArrayOfByte[(paramInt2 - 1)] == 1))
        {
          bool2 = true;
          break label265;
        }
        bool2 = false;
        break label265;
      }
      if ((paramArrayOfBoolean[1] != 0) && (paramArrayOfByte[(paramInt2 - 1)] == 1))
      {
        bool2 = true;
        break label265;
      }
      bool2 = false;
      break label265;
      bool2 = false;
      break label295;
      if ((paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[(paramInt2 - 1)] == 0))
      {
        bool2 = true;
        break label295;
      }
      bool2 = false;
      break label295;
    }
  }

  public static void b(boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = false;
    paramArrayOfBoolean[1] = false;
    paramArrayOfBoolean[2] = false;
  }

  public static boolean b(String paramString, byte paramByte)
  {
    AppMethodBeat.i(95888);
    boolean bool;
    if ((("video/avc".equals(paramString)) && ((paramByte & 0x1F) == 6)) || (("video/hevc".equals(paramString)) && ((paramByte & 0x7E) >> 1 == 39)))
    {
      bool = true;
      AppMethodBeat.o(95888);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95888);
    }
  }

  public static void i(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(95887);
    int i = paramByteBuffer.position();
    int j = 0;
    int k = 0;
    int m;
    int n;
    if (j + 1 < i)
    {
      m = paramByteBuffer.get(j) & 0xFF;
      if (k == 3)
      {
        n = k;
        if (m != 1)
          break label118;
        n = k;
        if ((paramByteBuffer.get(j + 1) & 0x1F) != 7)
          break label118;
        ByteBuffer localByteBuffer = paramByteBuffer.duplicate();
        localByteBuffer.position(j - 3);
        localByteBuffer.limit(i);
        paramByteBuffer.position(0);
        paramByteBuffer.put(localByteBuffer);
        AppMethodBeat.o(95887);
      }
    }
    while (true)
    {
      return;
      n = k;
      if (m == 0)
        n = k + 1;
      label118: k = n;
      if (m != 0)
        k = 0;
      j++;
      break;
      paramByteBuffer.clear();
      AppMethodBeat.o(95887);
    }
  }

  public static int j(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(95886);
    Object localObject = brm;
    int i = 0;
    int j = 0;
    while (true)
    {
      label22: int k;
      if (j < paramInt)
      {
        if (j < paramInt - 2)
          if ((paramArrayOfByte[j] == 0) && (paramArrayOfByte[(j + 1)] == 0) && (paramArrayOfByte[(j + 2)] == 3))
          {
            k = j;
            label60: j = k;
            if (k >= paramInt)
              continue;
          }
      }
      else
        try
        {
          if (brn.length <= i)
          {
            int[] arrayOfInt = brn;
            brn = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
          }
          brn[i] = k;
          j = k + 3;
          i++;
          continue;
          j++;
          break label22;
          k = paramInt;
          break label60;
          int m = paramInt - i;
          k = 0;
          paramInt = 0;
          j = 0;
          while (paramInt < i)
          {
            int n = brn[paramInt] - j;
            System.arraycopy(paramArrayOfByte, j, paramArrayOfByte, k, n);
            k += n;
            int i1 = k + 1;
            paramArrayOfByte[k] = ((byte)0);
            k = i1 + 1;
            paramArrayOfByte[i1] = ((byte)0);
            j += n + 3;
            paramInt++;
          }
          System.arraycopy(paramArrayOfByte, j, paramArrayOfByte, k, m - k);
          return m;
        }
        finally
        {
          AppMethodBeat.o(95886);
        }
    }
    throw paramArrayOfByte;
  }

  public static int k(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[(paramInt + 3)] & 0x1F;
  }

  public static j.b k(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95889);
    paramArrayOfByte = new m(paramArrayOfByte, paramInt1, paramInt2);
    paramArrayOfByte.ee(8);
    paramInt1 = paramArrayOfByte.ed(8);
    paramArrayOfByte.ee(16);
    int i = paramArrayOfByte.tO();
    int j = 1;
    boolean bool1 = false;
    int k;
    int m;
    label184: int n;
    int i1;
    int i2;
    if ((paramInt1 == 100) || (paramInt1 == 110) || (paramInt1 == 122) || (paramInt1 == 244) || (paramInt1 == 44) || (paramInt1 == 83) || (paramInt1 == 86) || (paramInt1 == 118) || (paramInt1 == 128) || (paramInt1 == 138))
    {
      k = paramArrayOfByte.tO();
      if (k == 3)
        bool1 = paramArrayOfByte.rl();
      paramArrayOfByte.tO();
      paramArrayOfByte.tO();
      paramArrayOfByte.tz();
      if (paramArrayOfByte.rl())
      {
        if (k != 3)
          paramInt2 = 8;
        for (j = 0; ; j++)
        {
          if (j >= paramInt2)
            break label264;
          if (paramArrayOfByte.rl())
          {
            if (j < 6)
            {
              m = 16;
              n = 8;
              i1 = 8;
              i2 = 0;
              label195: if (i2 >= m)
                continue;
              paramInt1 = i1;
              if (i1 != 0)
                paramInt1 = (paramArrayOfByte.tN() + n + 256) % 256;
              if (paramInt1 != 0)
                break label252;
            }
            while (true)
            {
              i2++;
              i1 = paramInt1;
              break label195;
              paramInt2 = 12;
              break;
              m = 64;
              break label184;
              label252: n = paramInt1;
            }
          }
        }
      }
      label264: j = k;
    }
    while (true)
    {
      i1 = paramArrayOfByte.tO();
      k = paramArrayOfByte.tO();
      m = 0;
      boolean bool2 = false;
      boolean bool3;
      if (k == 0)
      {
        paramInt2 = paramArrayOfByte.tO() + 4;
        paramArrayOfByte.tO();
        paramArrayOfByte.tz();
        i2 = paramArrayOfByte.tO();
        m = paramArrayOfByte.tO();
        bool3 = paramArrayOfByte.rl();
        if (!bool3)
          break label615;
        paramInt1 = 1;
        label332: if (!bool3)
          paramArrayOfByte.tz();
        paramArrayOfByte.tz();
        n = (i2 + 1) * 16;
        i2 = (2 - paramInt1) * (m + 1) * 16;
        if (!paramArrayOfByte.rl())
          break label711;
        int i3 = paramArrayOfByte.tO();
        int i4 = paramArrayOfByte.tO();
        int i5 = paramArrayOfByte.tO();
        int i6 = paramArrayOfByte.tO();
        if (j != 0)
          break label625;
        j = 1;
        if (!bool3)
          break label620;
        paramInt1 = 1;
        label413: paramInt1 = 2 - paramInt1;
        m = n - j * (i3 + i4);
        j = i2 - paramInt1 * (i5 + i6);
        paramInt1 = m;
      }
      while (true)
      {
        float f1 = 1.0F;
        float f2;
        if ((paramArrayOfByte.rl()) && (paramArrayOfByte.rl()))
        {
          m = paramArrayOfByte.ed(8);
          if (m == 255)
          {
            m = paramArrayOfByte.ed(16);
            i2 = paramArrayOfByte.ed(16);
            f2 = f1;
            if (m != 0)
            {
              f2 = f1;
              if (i2 != 0)
                f2 = m / i2;
            }
          }
        }
        while (true)
        {
          paramArrayOfByte = new j.b(i, paramInt1, j, f2, bool1, bool3, i1 + 4, k, paramInt2, bool2);
          AppMethodBeat.o(95889);
          return paramArrayOfByte;
          paramInt2 = m;
          if (k != 1)
            break;
          bool3 = paramArrayOfByte.rl();
          paramArrayOfByte.tN();
          paramArrayOfByte.tN();
          long l = paramArrayOfByte.tO();
          for (paramInt1 = 0; ; paramInt1++)
          {
            paramInt2 = m;
            bool2 = bool3;
            if (paramInt1 >= l)
              break;
            paramArrayOfByte.tO();
          }
          label615: paramInt1 = 0;
          break label332;
          label620: paramInt1 = 0;
          break label413;
          label625: if (j == 3)
          {
            paramInt1 = 1;
            label633: if (j != 1)
              break label673;
            j = 2;
            if (!bool3)
              break label679;
          }
          label642: label673: label679: for (m = 1; ; m = 0)
          {
            m = (2 - m) * j;
            j = paramInt1;
            paramInt1 = m;
            break;
            paramInt1 = 2;
            break label633;
            j = 1;
            break label642;
          }
          if (m < brl.length)
            f2 = brl[m];
          else
            f2 = 1.0F;
        }
        label711: paramInt1 = n;
        j = i2;
      }
      bool1 = false;
    }
  }

  public static int l(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[(paramInt + 3)] & 0x7E) >> 1;
  }

  public static a m(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(95890);
    paramArrayOfByte = new m(paramArrayOfByte, 3, paramInt);
    paramArrayOfByte.ee(8);
    paramInt = paramArrayOfByte.tO();
    int i = paramArrayOfByte.tO();
    paramArrayOfByte.tz();
    paramArrayOfByte = new a(paramInt, i, paramArrayOfByte.rl());
    AppMethodBeat.o(95890);
    return paramArrayOfByte;
  }

  public static final class a
  {
    public final int bcu;
    public final int bro;
    public final boolean brp;

    public a(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      this.bcu = paramInt1;
      this.bro = paramInt2;
      this.brp = paramBoolean;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.j
 * JD-Core Version:    0.6.2
 */