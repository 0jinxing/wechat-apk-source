package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzabw
{
  private final ByteBuffer zzbwv;

  private zzabw(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(3453);
    this.zzbwv = paramByteBuffer;
    this.zzbwv.order(ByteOrder.LITTLE_ENDIAN);
    AppMethodBeat.o(3453);
  }

  private zzabw(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2));
    AppMethodBeat.i(3452);
    AppMethodBeat.o(3452);
  }

  private static int zza(CharSequence paramCharSequence)
  {
    int i = 0;
    AppMethodBeat.i(3464);
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
                    AppMethodBeat.o(3464);
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
            AppMethodBeat.o(3464);
            throw paramCharSequence;
          }
          AppMethodBeat.o(3464);
          return n;
        }
        n = j;
      }
    }
  }

  private static void zza(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    int i = 0;
    AppMethodBeat.i(3465);
    if (paramByteBuffer.isReadOnly())
    {
      paramCharSequence = new ReadOnlyBufferException();
      AppMethodBeat.o(3465);
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
          AppMethodBeat.o(3465);
          return;
        }
        i += j;
        if (j >= k)
          break label627;
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
      catch (ArrayIndexOutOfBoundsException paramCharSequence)
      {
        paramByteBuffer = new BufferOverflowException();
        paramByteBuffer.initCause(paramCharSequence);
        AppMethodBeat.o(3465);
        throw paramByteBuffer;
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
            AppMethodBeat.o(3465);
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
          paramCharSequence = new java/lang/ArrayIndexOutOfBoundsException;
          paramByteBuffer = new java/lang/StringBuilder;
          paramByteBuffer.<init>(37);
          paramCharSequence.<init>("Failed writing " + i1 + " at index " + i);
          AppMethodBeat.o(3465);
          throw paramCharSequence;
          label627: continue;
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
                  AppMethodBeat.o(3465);
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
          AppMethodBeat.o(3465);
        }
      }
    }
  }

  private final void zzan(long paramLong)
  {
    AppMethodBeat.i(3479);
    while (true)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        zzap((int)paramLong);
        AppMethodBeat.o(3479);
        return;
      }
      zzap((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }

  public static int zzao(int paramInt)
  {
    AppMethodBeat.i(3471);
    if (paramInt >= 0)
    {
      paramInt = zzas(paramInt);
      AppMethodBeat.o(3471);
    }
    while (true)
    {
      return paramInt;
      paramInt = 10;
      AppMethodBeat.o(3471);
    }
  }

  public static int zzao(long paramLong)
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

  private final void zzap(int paramInt)
  {
    AppMethodBeat.i(3474);
    byte b = (byte)paramInt;
    if (!this.zzbwv.hasRemaining())
    {
      zzabx localzzabx = new zzabx(this.zzbwv.position(), this.zzbwv.limit());
      AppMethodBeat.o(3474);
      throw localzzabx;
    }
    this.zzbwv.put(b);
    AppMethodBeat.o(3474);
  }

  public static int zzaq(int paramInt)
  {
    AppMethodBeat.i(3477);
    paramInt = zzas(paramInt << 3);
    AppMethodBeat.o(3477);
    return paramInt;
  }

  public static int zzas(int paramInt)
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

  public static int zzb(int paramInt, zzace paramzzace)
  {
    AppMethodBeat.i(3470);
    int i = zzaq(paramInt);
    int j = paramzzace.zzvm();
    paramInt = zzas(j);
    AppMethodBeat.o(3470);
    return i + (j + paramInt);
  }

  public static zzabw zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3455);
    paramArrayOfByte = new zzabw(paramArrayOfByte, 0, paramInt2);
    AppMethodBeat.o(3455);
    return paramArrayOfByte;
  }

  public static int zzc(int paramInt, long paramLong)
  {
    AppMethodBeat.i(3467);
    paramInt = zzaq(paramInt);
    int i = zzao(paramLong);
    AppMethodBeat.o(3467);
    return paramInt + i;
  }

  public static int zzc(int paramInt, String paramString)
  {
    AppMethodBeat.i(3469);
    paramInt = zzaq(paramInt);
    int i = zzfm(paramString);
    AppMethodBeat.o(3469);
    return paramInt + i;
  }

  public static int zzf(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3468);
    paramInt1 = zzaq(paramInt1);
    paramInt2 = zzao(paramInt2);
    AppMethodBeat.o(3468);
    return paramInt1 + paramInt2;
  }

  public static int zzfm(String paramString)
  {
    AppMethodBeat.i(3472);
    int i = zza(paramString);
    int j = zzas(i);
    AppMethodBeat.o(3472);
    return i + j;
  }

  public static zzabw zzj(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(3454);
    paramArrayOfByte = zzb(paramArrayOfByte, 0, paramArrayOfByte.length);
    AppMethodBeat.o(3454);
    return paramArrayOfByte;
  }

  public final void zza(int paramInt, double paramDouble)
  {
    AppMethodBeat.i(3456);
    zzg(paramInt, 1);
    long l = Double.doubleToLongBits(paramDouble);
    if (this.zzbwv.remaining() < 8)
    {
      zzabx localzzabx = new zzabx(this.zzbwv.position(), this.zzbwv.limit());
      AppMethodBeat.o(3456);
      throw localzzabx;
    }
    this.zzbwv.putLong(l);
    AppMethodBeat.o(3456);
  }

  public final void zza(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(3457);
    zzg(paramInt, 5);
    paramInt = Float.floatToIntBits(paramFloat);
    if (this.zzbwv.remaining() < 4)
    {
      zzabx localzzabx = new zzabx(this.zzbwv.position(), this.zzbwv.limit());
      AppMethodBeat.o(3457);
      throw localzzabx;
    }
    this.zzbwv.putInt(paramInt);
    AppMethodBeat.o(3457);
  }

  public final void zza(int paramInt, long paramLong)
  {
    AppMethodBeat.i(3458);
    zzg(paramInt, 0);
    zzan(paramLong);
    AppMethodBeat.o(3458);
  }

  public final void zza(int paramInt, zzace paramzzace)
  {
    AppMethodBeat.i(3463);
    zzg(paramInt, 2);
    zzb(paramzzace);
    AppMethodBeat.o(3463);
  }

  public final void zza(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(3461);
    zzg(paramInt, 0);
    paramInt = i;
    if (paramBoolean)
      paramInt = 1;
    byte b = (byte)paramInt;
    if (!this.zzbwv.hasRemaining())
    {
      zzabx localzzabx = new zzabx(this.zzbwv.position(), this.zzbwv.limit());
      AppMethodBeat.o(3461);
      throw localzzabx;
    }
    this.zzbwv.put(b);
    AppMethodBeat.o(3461);
  }

  public final void zzar(int paramInt)
  {
    AppMethodBeat.i(3478);
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        zzap(paramInt);
        AppMethodBeat.o(3478);
        return;
      }
      zzap(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }

  public final void zzb(int paramInt, long paramLong)
  {
    AppMethodBeat.i(3459);
    zzg(paramInt, 0);
    zzan(paramLong);
    AppMethodBeat.o(3459);
  }

  public final void zzb(int paramInt, String paramString)
  {
    AppMethodBeat.i(3462);
    zzg(paramInt, 2);
    int i;
    try
    {
      i = zzas(paramString.length());
      if (i != zzas(paramString.length() * 3))
        break label182;
      paramInt = this.zzbwv.position();
      if (this.zzbwv.remaining() < i)
      {
        paramString = new com/google/android/gms/internal/measurement/zzabx;
        paramString.<init>(i + paramInt, this.zzbwv.limit());
        AppMethodBeat.o(3462);
        throw paramString;
      }
    }
    catch (BufferOverflowException paramString)
    {
      zzabx localzzabx = new zzabx(this.zzbwv.position(), this.zzbwv.limit());
      localzzabx.initCause(paramString);
      AppMethodBeat.o(3462);
      throw localzzabx;
    }
    this.zzbwv.position(paramInt + i);
    zza(paramString, this.zzbwv);
    int j = this.zzbwv.position();
    this.zzbwv.position(paramInt);
    zzar(j - paramInt - i);
    this.zzbwv.position(j);
    AppMethodBeat.o(3462);
    while (true)
    {
      return;
      label182: zzar(zza(paramString));
      zza(paramString, this.zzbwv);
      AppMethodBeat.o(3462);
    }
  }

  public final void zzb(zzace paramzzace)
  {
    AppMethodBeat.i(3466);
    zzar(paramzzace.zzvl());
    paramzzace.zza(this);
    AppMethodBeat.o(3466);
  }

  public final void zze(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3460);
    zzg(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      zzar(paramInt2);
      AppMethodBeat.o(3460);
    }
    while (true)
    {
      return;
      zzan(paramInt2);
      AppMethodBeat.o(3460);
    }
  }

  public final void zzg(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3476);
    zzar(paramInt1 << 3 | paramInt2);
    AppMethodBeat.o(3476);
  }

  public final void zzk(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(3475);
    int i = paramArrayOfByte.length;
    if (this.zzbwv.remaining() >= i)
    {
      this.zzbwv.put(paramArrayOfByte, 0, i);
      AppMethodBeat.o(3475);
      return;
    }
    paramArrayOfByte = new zzabx(this.zzbwv.position(), this.zzbwv.limit());
    AppMethodBeat.o(3475);
    throw paramArrayOfByte;
  }

  public final void zzve()
  {
    AppMethodBeat.i(3473);
    if (this.zzbwv.remaining() != 0)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[] { Integer.valueOf(this.zzbwv.remaining()) }));
      AppMethodBeat.o(3473);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(3473);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzabw
 * JD-Core Version:    0.6.2
 */