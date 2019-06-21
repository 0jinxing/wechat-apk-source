package com.bumptech.glide.c.d.a;

import android.util.Log;
import com.bumptech.glide.c.b.a.b;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class f
  implements com.bumptech.glide.c.f
{
  static final byte[] aEW;
  private static final int[] aEX;

  static
  {
    AppMethodBeat.i(92214);
    aEW = "".getBytes(Charset.forName("UTF-8"));
    aEX = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8 };
    AppMethodBeat.o(92214);
  }

  private static int a(f.b paramb)
  {
    AppMethodBeat.i(92213);
    ByteOrder localByteOrder;
    label75: int m;
    int n;
    int i1;
    switch (paramb.dh(6))
    {
    default:
      Log.isLoggable("DfltImageHeaderParser", 3);
      localByteOrder = ByteOrder.BIG_ENDIAN;
      paramb.aEY.order(localByteOrder);
      int i = paramb.dg(10) + 6;
      int j = paramb.dh(i);
      k = 0;
      if (k >= j)
        break label374;
      m = i + 2 + k * 12;
      n = paramb.dh(m);
      if (n == 274)
      {
        i1 = paramb.dh(m + 2);
        if ((i1 > 0) && (i1 <= 12))
          break label159;
        if (!Log.isLoggable("DfltImageHeaderParser", 3))
          break;
      }
      break;
    case 19789:
    case 18761:
    }
    while (true)
    {
      k++;
      break label75;
      localByteOrder = ByteOrder.BIG_ENDIAN;
      break;
      localByteOrder = ByteOrder.LITTLE_ENDIAN;
      break;
      label159: int i2 = paramb.dg(m + 4);
      if (i2 < 0)
      {
        if (!Log.isLoggable("DfltImageHeaderParser", 3));
      }
      else
      {
        if (Log.isLoggable("DfltImageHeaderParser", 3))
          new StringBuilder("Got tagIndex=").append(k).append(" tagType=").append(n).append(" formatCode=").append(i1).append(" componentCount=").append(i2);
        i2 = aEX[i1] + i2;
        if (i2 > 4)
        {
          if (!Log.isLoggable("DfltImageHeaderParser", 3));
        }
        else
        {
          m += 8;
          if ((m < 0) || (m > paramb.aEY.remaining()))
          {
            if (Log.isLoggable("DfltImageHeaderParser", 3))
              new StringBuilder("Illegal tagValueOffset=").append(m).append(" tagType=").append(n);
          }
          else
          {
            if ((i2 >= 0) && (m + i2 <= paramb.aEY.remaining()))
              break label358;
            if (!Log.isLoggable("DfltImageHeaderParser", 3));
          }
        }
      }
    }
    label358: int k = paramb.dh(m);
    AppMethodBeat.o(92213);
    while (true)
    {
      return k;
      label374: k = -1;
      AppMethodBeat.o(92213);
    }
  }

  private static int a(f.c paramc, b paramb)
  {
    int i = -1;
    AppMethodBeat.i(92212);
    int j = paramc.nn();
    int k;
    if (((j & 0xFFD8) == 65496) || (j == 19789) || (j == 18761))
    {
      j = 1;
      if (j != 0)
        break label66;
      Log.isLoggable("DfltImageHeaderParser", 3);
      AppMethodBeat.o(92212);
      k = i;
    }
    while (true)
    {
      return k;
      j = 0;
      break;
      label66: if (paramc.no() != 255)
      {
        Log.isLoggable("DfltImageHeaderParser", 3);
        j = -1;
      }
      while (true)
      {
        if (j != -1)
          break label237;
        Log.isLoggable("DfltImageHeaderParser", 3);
        AppMethodBeat.o(92212);
        k = i;
        break;
        k = paramc.no();
        if (k == 218)
        {
          j = -1;
        }
        else if (k == 217)
        {
          Log.isLoggable("DfltImageHeaderParser", 3);
          j = -1;
        }
        else
        {
          j = paramc.nn() - 2;
          if (k != 225)
          {
            long l = paramc.skip(j);
            if (l == j)
              break label66;
            if (Log.isLoggable("DfltImageHeaderParser", 3))
              new StringBuilder("Unable to skip enough data, type: ").append(k).append(", wanted to skip: ").append(j).append(", but actually skipped: ").append(l);
            j = -1;
          }
        }
      }
      label237: byte[] arrayOfByte = (byte[])paramb.a(j, [B.class);
      try
      {
        int m = paramc.read(arrayOfByte, j);
        if (m != j)
        {
          k = i;
          if (Log.isLoggable("DfltImageHeaderParser", 3))
          {
            paramc = new java/lang/StringBuilder;
            paramc.<init>("Unable to read exif segment data, length: ");
            paramc.append(j).append(", actually read: ").append(m);
            k = i;
          }
        }
        while (true)
        {
          paramb.put(arrayOfByte);
          AppMethodBeat.o(92212);
          break;
          if (c(arrayOfByte, j))
          {
            paramc = new com/bumptech/glide/c/d/a/f$b;
            paramc.<init>(arrayOfByte, j);
            k = a(paramc);
          }
          else
          {
            Log.isLoggable("DfltImageHeaderParser", 3);
            k = i;
          }
        }
      }
      finally
      {
        paramb.put(arrayOfByte);
        AppMethodBeat.o(92212);
      }
    }
    throw paramc;
  }

  private static com.bumptech.glide.c.f.a a(f.c paramc)
  {
    AppMethodBeat.i(92211);
    int i = paramc.nn();
    if (i == 65496)
    {
      paramc = com.bumptech.glide.c.f.a.ayT;
      AppMethodBeat.o(92211);
    }
    while (true)
    {
      return paramc;
      i = i << 16 & 0xFFFF0000 | paramc.nn() & 0xFFFF;
      if (i == -1991225785)
      {
        paramc.skip(21L);
        if (paramc.np() >= 3)
        {
          paramc = com.bumptech.glide.c.f.a.ayV;
          AppMethodBeat.o(92211);
        }
        else
        {
          paramc = com.bumptech.glide.c.f.a.ayW;
          AppMethodBeat.o(92211);
        }
      }
      else if (i >> 8 == 4671814)
      {
        paramc = com.bumptech.glide.c.f.a.ayS;
        AppMethodBeat.o(92211);
      }
      else if (i != 1380533830)
      {
        paramc = com.bumptech.glide.c.f.a.ayZ;
        AppMethodBeat.o(92211);
      }
      else
      {
        paramc.skip(4L);
        if ((paramc.nn() << 16 & 0xFFFF0000 | paramc.nn() & 0xFFFF) != 1464156752)
        {
          paramc = com.bumptech.glide.c.f.a.ayZ;
          AppMethodBeat.o(92211);
        }
        else
        {
          i = paramc.nn() << 16 & 0xFFFF0000 | paramc.nn() & 0xFFFF;
          if ((i & 0xFFFFFF00) != 1448097792)
          {
            paramc = com.bumptech.glide.c.f.a.ayZ;
            AppMethodBeat.o(92211);
          }
          else if ((i & 0xFF) == 88)
          {
            paramc.skip(4L);
            if ((paramc.np() & 0x10) != 0)
            {
              paramc = com.bumptech.glide.c.f.a.ayX;
              AppMethodBeat.o(92211);
            }
            else
            {
              paramc = com.bumptech.glide.c.f.a.ayY;
              AppMethodBeat.o(92211);
            }
          }
          else if ((i & 0xFF) == 76)
          {
            paramc.skip(4L);
            if ((paramc.np() & 0x8) != 0)
            {
              paramc = com.bumptech.glide.c.f.a.ayX;
              AppMethodBeat.o(92211);
            }
            else
            {
              paramc = com.bumptech.glide.c.f.a.ayY;
              AppMethodBeat.o(92211);
            }
          }
          else
          {
            paramc = com.bumptech.glide.c.f.a.ayY;
            AppMethodBeat.o(92211);
          }
        }
      }
    }
  }

  private static boolean c(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool1 = false;
    boolean bool2;
    if ((paramArrayOfByte != null) && (paramInt > aEW.length))
    {
      bool2 = true;
      if (!bool2)
        break label56;
      paramInt = 0;
      label22: if (paramInt >= aEW.length)
        break label56;
      if (paramArrayOfByte[paramInt] == aEW[paramInt])
        break label50;
      bool2 = bool1;
    }
    label50: label56: 
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      paramInt++;
      break label22;
    }
  }

  public final int a(InputStream paramInputStream, b paramb)
  {
    AppMethodBeat.i(92210);
    int i = a(new f.d((InputStream)i.d(paramInputStream, "Argument must not be null")), (b)i.d(paramb, "Argument must not be null"));
    AppMethodBeat.o(92210);
    return i;
  }

  public final com.bumptech.glide.c.f.a b(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(92209);
    paramByteBuffer = a(new f.a((ByteBuffer)i.d(paramByteBuffer, "Argument must not be null")));
    AppMethodBeat.o(92209);
    return paramByteBuffer;
  }

  public final com.bumptech.glide.c.f.a c(InputStream paramInputStream)
  {
    AppMethodBeat.i(92208);
    paramInputStream = a(new f.d((InputStream)i.d(paramInputStream, "Argument must not be null")));
    AppMethodBeat.o(92208);
    return paramInputStream;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.f
 * JD-Core Version:    0.6.2
 */