package com.google.android.gms.internal.wearable;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzl
{
  private final ByteBuffer zzhb;

  private zzl(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(70724);
    this.zzhb = paramByteBuffer;
    this.zzhb.order(ByteOrder.LITTLE_ENDIAN);
    AppMethodBeat.o(70724);
  }

  private zzl(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2));
    AppMethodBeat.i(70723);
    AppMethodBeat.o(70723);
  }

  private static int zza(CharSequence paramCharSequence)
  {
    int i = 0;
    AppMethodBeat.i(70732);
    int j = paramCharSequence.length();
    for (int k = 0; (k < j) && (paramCharSequence.charAt(k) < ''); k++);
    while (true)
    {
      int n;
      if (k < j)
      {
        int m = paramCharSequence.charAt(k);
        if (m < 2048)
        {
          n += (127 - m >>> 31);
          k++;
        }
        else
        {
          int i1 = paramCharSequence.length();
          if (k < i1)
          {
            int i2 = paramCharSequence.charAt(k);
            if (i2 < 2048)
            {
              i += (127 - i2 >>> 31);
              m = k;
            }
            while (true)
            {
              k = m + 1;
              break;
              int i3 = i + 2;
              i = i3;
              m = k;
              if (55296 <= i2)
              {
                i = i3;
                m = k;
                if (i2 <= 57343)
                {
                  if (Character.codePointAt(paramCharSequence, k) < 65536)
                  {
                    paramCharSequence = new IllegalArgumentException(39 + "Unpaired surrogate at index " + k);
                    AppMethodBeat.o(70732);
                    throw paramCharSequence;
                  }
                  m = k + 1;
                  i = i3;
                }
              }
            }
          }
          n = i + n;
        }
      }
      else
      {
        while (true)
        {
          if (n < j)
          {
            long l = n;
            paramCharSequence = new IllegalArgumentException(54 + "UTF-8 length does not fit in int: " + (l + 4294967296L));
            AppMethodBeat.o(70732);
            throw paramCharSequence;
          }
          AppMethodBeat.o(70732);
          return n;
        }
        n = j;
      }
    }
  }

  private final void zza(long paramLong)
  {
    AppMethodBeat.i(70747);
    while (true)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        zzj((int)paramLong);
        AppMethodBeat.o(70747);
        return;
      }
      zzj((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }

  private static void zza(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    int i = 0;
    AppMethodBeat.i(70733);
    if (paramByteBuffer.isReadOnly())
    {
      paramCharSequence = new ReadOnlyBufferException();
      AppMethodBeat.o(70733);
      throw paramCharSequence;
    }
    if (paramByteBuffer.hasArray());
    while (true)
    {
      byte[] arrayOfByte;
      int j;
      int m;
      int n;
      int i1;
      try
      {
        arrayOfByte = paramByteBuffer.array();
        i = paramByteBuffer.arrayOffset();
        i = paramByteBuffer.position() + i;
        j = paramByteBuffer.remaining();
        int k = paramCharSequence.length();
        m = i + j;
        j = 0;
        if ((j < k) && (j + i < m))
        {
          n = paramCharSequence.charAt(j);
          if (n < 128)
          {
            arrayOfByte[(i + j)] = ((byte)(byte)n);
            j++;
            continue;
          }
        }
        if (j == k)
        {
          i += k;
          paramByteBuffer.position(i - paramByteBuffer.arrayOffset());
          AppMethodBeat.o(70733);
          return;
        }
        i += j;
        if (j >= k)
          break label621;
        i1 = paramCharSequence.charAt(j);
        if ((i1 < 128) && (i < m))
        {
          n = i + 1;
          arrayOfByte[i] = ((byte)(byte)i1);
          i = n;
          j++;
          continue;
        }
        if ((i1 < 2048) && (i <= m - 2))
        {
          n = i + 1;
          arrayOfByte[i] = ((byte)(byte)(i1 >>> 6 | 0x3C0));
          i = n + 1;
          arrayOfByte[n] = ((byte)(byte)(i1 & 0x3F | 0x80));
          continue;
        }
      }
      catch (ArrayIndexOutOfBoundsException paramByteBuffer)
      {
        paramCharSequence = new BufferOverflowException();
        paramCharSequence.initCause(paramByteBuffer);
        AppMethodBeat.o(70733);
        throw paramCharSequence;
      }
      int i2;
      if (((i1 < 55296) || (57343 < i1)) && (i <= m - 3))
      {
        n = i + 1;
        i2 = (byte)(i1 >>> 12 | 0x1E0);
        arrayOfByte[i] = ((byte)i2);
        i2 = n + 1;
        arrayOfByte[n] = ((byte)(byte)(i1 >>> 6 & 0x3F | 0x80));
        i = i2 + 1;
        arrayOfByte[i2] = ((byte)(byte)(i1 & 0x3F | 0x80));
      }
      else
      {
        int i3;
        if (i <= m - 4)
        {
          n = j;
          if (j + 1 != paramCharSequence.length())
          {
            j++;
            i3 = paramCharSequence.charAt(j);
            if (!Character.isSurrogatePair(i1, i3))
              n = j;
          }
          else
          {
            paramByteBuffer = new java/lang/IllegalArgumentException;
            paramCharSequence = new java/lang/StringBuilder;
            paramCharSequence.<init>(39);
            paramByteBuffer.<init>("Unpaired surrogate at index " + (n - 1));
            AppMethodBeat.o(70733);
            throw paramByteBuffer;
          }
          n = Character.toCodePoint(i1, i3);
          i2 = i + 1;
          arrayOfByte[i] = ((byte)(byte)(n >>> 18 | 0xF0));
          i = i2 + 1;
          arrayOfByte[i2] = ((byte)(byte)(n >>> 12 & 0x3F | 0x80));
          i2 = i + 1;
          arrayOfByte[i] = ((byte)(byte)(n >>> 6 & 0x3F | 0x80));
          i = i2 + 1;
          arrayOfByte[i2] = ((byte)(byte)(n & 0x3F | 0x80));
        }
        else
        {
          paramByteBuffer = new java/lang/ArrayIndexOutOfBoundsException;
          paramCharSequence = new java/lang/StringBuilder;
          paramCharSequence.<init>(37);
          paramByteBuffer.<init>("Failed writing " + i1 + " at index " + i);
          AppMethodBeat.o(70733);
          throw paramByteBuffer;
          label621: continue;
          n = paramCharSequence.length();
          if (i < n)
          {
            i3 = paramCharSequence.charAt(i);
            if (i3 < 128)
              paramByteBuffer.put((byte)i3);
            while (true)
            {
              i++;
              break;
              if (i3 < 2048)
              {
                paramByteBuffer.put((byte)(i3 >>> 6 | 0x3C0));
                paramByteBuffer.put((byte)(i3 & 0x3F | 0x80));
              }
              else if ((i3 < 55296) || (57343 < i3))
              {
                paramByteBuffer.put((byte)(i3 >>> 12 | 0x1E0));
                paramByteBuffer.put((byte)(i3 >>> 6 & 0x3F | 0x80));
                paramByteBuffer.put((byte)(i3 & 0x3F | 0x80));
              }
              else
              {
                j = i;
                char c;
                if (i + 1 != paramCharSequence.length())
                {
                  j = i + 1;
                  c = paramCharSequence.charAt(j);
                  if (Character.isSurrogatePair(i3, c));
                }
                else
                {
                  paramCharSequence = new IllegalArgumentException(39 + "Unpaired surrogate at index " + (j - 1));
                  AppMethodBeat.o(70733);
                  throw paramCharSequence;
                }
                i = Character.toCodePoint(i3, c);
                paramByteBuffer.put((byte)(i >>> 18 | 0xF0));
                paramByteBuffer.put((byte)(i >>> 12 & 0x3F | 0x80));
                paramByteBuffer.put((byte)(i >>> 6 & 0x3F | 0x80));
                paramByteBuffer.put((byte)(i & 0x3F | 0x80));
                i = j;
              }
            }
          }
          AppMethodBeat.o(70733);
        }
      }
    }
  }

  public static int zzb(int paramInt, long paramLong)
  {
    AppMethodBeat.i(70734);
    int i = zzk(paramInt);
    if ((0xFFFFFF80 & paramLong) == 0L)
      paramInt = 1;
    while (true)
    {
      AppMethodBeat.o(70734);
      return paramInt + i;
      if ((0xFFFFC000 & paramLong) == 0L)
        paramInt = 2;
      else if ((0xFFE00000 & paramLong) == 0L)
        paramInt = 3;
      else if ((0xF0000000 & paramLong) == 0L)
        paramInt = 4;
      else if ((0x0 & paramLong) == 0L)
        paramInt = 5;
      else if ((0x0 & paramLong) == 0L)
        paramInt = 6;
      else if ((0x0 & paramLong) == 0L)
        paramInt = 7;
      else if ((0x0 & paramLong) == 0L)
        paramInt = 8;
      else if ((0x0 & paramLong) == 0L)
        paramInt = 9;
      else
        paramInt = 10;
    }
  }

  public static int zzb(int paramInt, zzt paramzzt)
  {
    AppMethodBeat.i(70737);
    int i = zzk(paramInt);
    paramInt = paramzzt.zzx();
    int j = zzm(paramInt);
    AppMethodBeat.o(70737);
    return i + (paramInt + j);
  }

  public static int zzb(int paramInt, String paramString)
  {
    AppMethodBeat.i(70736);
    int i = zzk(paramInt);
    paramInt = zzg(paramString);
    AppMethodBeat.o(70736);
    return i + paramInt;
  }

  public static zzl zzb(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(70725);
    paramArrayOfByte = zzb(paramArrayOfByte, 0, paramArrayOfByte.length);
    AppMethodBeat.o(70725);
    return paramArrayOfByte;
  }

  public static zzl zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70726);
    paramArrayOfByte = new zzl(paramArrayOfByte, 0, paramInt2);
    AppMethodBeat.o(70726);
    return paramArrayOfByte;
  }

  public static int zze(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70735);
    paramInt1 = zzk(paramInt1);
    paramInt2 = zzi(paramInt2);
    AppMethodBeat.o(70735);
    return paramInt1 + paramInt2;
  }

  public static int zzg(String paramString)
  {
    AppMethodBeat.i(70739);
    int i = zza(paramString);
    int j = zzm(i);
    AppMethodBeat.o(70739);
    return i + j;
  }

  public static int zzi(int paramInt)
  {
    AppMethodBeat.i(70738);
    if (paramInt >= 0)
    {
      paramInt = zzm(paramInt);
      AppMethodBeat.o(70738);
    }
    while (true)
    {
      return paramInt;
      paramInt = 10;
      AppMethodBeat.o(70738);
    }
  }

  private final void zzj(int paramInt)
  {
    AppMethodBeat.i(70742);
    byte b = (byte)paramInt;
    if (!this.zzhb.hasRemaining())
    {
      zzm localzzm = new zzm(this.zzhb.position(), this.zzhb.limit());
      AppMethodBeat.o(70742);
      throw localzzm;
    }
    this.zzhb.put(b);
    AppMethodBeat.o(70742);
  }

  public static int zzk(int paramInt)
  {
    AppMethodBeat.i(70745);
    paramInt = zzm(paramInt << 3);
    AppMethodBeat.o(70745);
    return paramInt;
  }

  public static int zzm(int paramInt)
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

  public static int zzn(int paramInt)
  {
    return paramInt << 1 ^ paramInt >> 31;
  }

  public final void zza(byte paramByte)
  {
    AppMethodBeat.i(70741);
    if (!this.zzhb.hasRemaining())
    {
      zzm localzzm = new zzm(this.zzhb.position(), this.zzhb.limit());
      AppMethodBeat.o(70741);
      throw localzzm;
    }
    this.zzhb.put(paramByte);
    AppMethodBeat.o(70741);
  }

  public final void zza(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(70727);
    zzf(paramInt, 5);
    paramInt = Float.floatToIntBits(paramFloat);
    if (this.zzhb.remaining() < 4)
    {
      zzm localzzm = new zzm(this.zzhb.position(), this.zzhb.limit());
      AppMethodBeat.o(70727);
      throw localzzm;
    }
    this.zzhb.putInt(paramInt);
    AppMethodBeat.o(70727);
  }

  public final void zza(int paramInt, long paramLong)
  {
    AppMethodBeat.i(70728);
    zzf(paramInt, 0);
    zza(paramLong);
    AppMethodBeat.o(70728);
  }

  public final void zza(int paramInt, zzt paramzzt)
  {
    AppMethodBeat.i(70731);
    zzf(paramInt, 2);
    if (paramzzt.zzhl < 0)
      paramzzt.zzx();
    zzl(paramzzt.zzhl);
    paramzzt.zza(this);
    AppMethodBeat.o(70731);
  }

  public final void zza(int paramInt, String paramString)
  {
    AppMethodBeat.i(70730);
    zzf(paramInt, 2);
    int i;
    try
    {
      i = zzm(paramString.length());
      if (i != zzm(paramString.length() * 3))
        break label182;
      paramInt = this.zzhb.position();
      if (this.zzhb.remaining() < i)
      {
        paramString = new com/google/android/gms/internal/wearable/zzm;
        paramString.<init>(i + paramInt, this.zzhb.limit());
        AppMethodBeat.o(70730);
        throw paramString;
      }
    }
    catch (BufferOverflowException paramString)
    {
      zzm localzzm = new zzm(this.zzhb.position(), this.zzhb.limit());
      localzzm.initCause(paramString);
      AppMethodBeat.o(70730);
      throw localzzm;
    }
    this.zzhb.position(paramInt + i);
    zza(paramString, this.zzhb);
    int j = this.zzhb.position();
    this.zzhb.position(paramInt);
    zzl(j - paramInt - i);
    this.zzhb.position(j);
    AppMethodBeat.o(70730);
    while (true)
    {
      return;
      label182: zzl(zza(paramString));
      zza(paramString, this.zzhb);
      AppMethodBeat.o(70730);
    }
  }

  public final void zzb(long paramLong)
  {
    AppMethodBeat.i(70748);
    if (this.zzhb.remaining() < 8)
    {
      zzm localzzm = new zzm(this.zzhb.position(), this.zzhb.limit());
      AppMethodBeat.o(70748);
      throw localzzm;
    }
    this.zzhb.putLong(paramLong);
    AppMethodBeat.o(70748);
  }

  public final void zzc(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(70743);
    int i = paramArrayOfByte.length;
    if (this.zzhb.remaining() >= i)
    {
      this.zzhb.put(paramArrayOfByte, 0, i);
      AppMethodBeat.o(70743);
      return;
    }
    paramArrayOfByte = new zzm(this.zzhb.position(), this.zzhb.limit());
    AppMethodBeat.o(70743);
    throw paramArrayOfByte;
  }

  public final void zzd(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70729);
    zzf(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      zzl(paramInt2);
      AppMethodBeat.o(70729);
    }
    while (true)
    {
      return;
      zza(paramInt2);
      AppMethodBeat.o(70729);
    }
  }

  public final void zzf(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70744);
    zzl(paramInt1 << 3 | paramInt2);
    AppMethodBeat.o(70744);
  }

  public final void zzl(int paramInt)
  {
    AppMethodBeat.i(70746);
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        zzj(paramInt);
        AppMethodBeat.o(70746);
        return;
      }
      zzj(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }

  public final void zzr()
  {
    AppMethodBeat.i(70740);
    if (this.zzhb.remaining() != 0)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[] { Integer.valueOf(this.zzhb.remaining()) }));
      AppMethodBeat.o(70740);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(70740);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.wearable.zzl
 * JD-Core Version:    0.6.2
 */