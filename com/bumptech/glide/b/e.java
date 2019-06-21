package com.bumptech.glide.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class e
  implements a
{
  private static final String TAG;
  private int ayA;
  private Boolean ayB;
  private Bitmap.Config ayC;
  private byte[] ayl;
  private ByteBuffer aym;
  private c ayn;
  private int[] ayo;
  private final int[] ayp;
  private final a.a ayq;
  private short[] ayr;
  private byte[] ays;
  private byte[] ayt;
  private byte[] ayu;
  private int[] ayv;
  private int ayw;
  private Bitmap ayx;
  private boolean ayy;
  private int ayz;
  private int sampleSize;
  private int status;

  static
  {
    AppMethodBeat.i(123391);
    TAG = e.class.getSimpleName();
    AppMethodBeat.o(123391);
  }

  private e(a.a parama)
  {
    AppMethodBeat.i(123381);
    this.ayp = new int[256];
    this.ayC = Bitmap.Config.ARGB_8888;
    this.ayq = parama;
    this.ayn = new c();
    AppMethodBeat.o(123381);
  }

  public e(a.a parama, c paramc, ByteBuffer paramByteBuffer, int paramInt)
  {
    this(parama);
    AppMethodBeat.i(123380);
    a(paramc, paramByteBuffer, paramInt);
    AppMethodBeat.o(123380);
  }

  private Bitmap a(b paramb1, b paramb2)
  {
    AppMethodBeat.i(123388);
    int[] arrayOfInt = this.ayv;
    if (paramb2 == null)
    {
      if (this.ayx != null)
        this.ayq.f(this.ayx);
      this.ayx = null;
      Arrays.fill(arrayOfInt, 0);
    }
    if ((paramb2 != null) && (paramb2.axZ == 3) && (this.ayx == null))
      Arrays.fill(arrayOfInt, 0);
    int i;
    int n;
    int i1;
    if ((paramb2 != null) && (paramb2.axZ > 0))
    {
      if (paramb2.axZ == 2)
      {
        i = 0;
        if (!paramb1.axY)
        {
          i = this.ayn.bgColor;
          j = i;
          if (paramb1.ayc != null)
          {
            j = i;
            if (this.ayn.ayi == paramb1.aya)
              j = 0;
          }
          k = paramb2.axW / this.sampleSize;
          i = paramb2.axU / this.sampleSize;
          m = paramb2.axV / this.sampleSize;
          n = paramb2.axT / this.sampleSize;
          i1 = i * this.ayA + n;
          i2 = this.ayA;
          i = i1;
        }
        while (true)
        {
          if (i >= i1 + k * i2)
            break label318;
          n = i;
          while (true)
            if (n < i + m)
            {
              arrayOfInt[n] = j;
              n++;
              continue;
              j = i;
              if (this.ayw != 0)
                break;
              this.ayB = Boolean.TRUE;
              j = i;
              break;
            }
          i += this.ayA;
        }
      }
      if ((paramb2.axZ == 3) && (this.ayx != null))
        this.ayx.getPixels(arrayOfInt, 0, this.ayA, 0, 0, this.ayA, this.ayz);
    }
    label318: if (paramb1 != null)
      this.aym.position(paramb1.ayb);
    if (paramb1 == null);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i4;
    int i5;
    for (int i3 = this.ayn.width * this.ayn.height; ; i3 = paramb1.axV * paramb1.axW)
    {
      if ((this.ayu == null) || (this.ayu.length < i3))
        this.ayu = this.ayq.da(i3);
      localObject1 = this.ayu;
      if (this.ayr == null)
        this.ayr = new short[4096];
      localObject2 = this.ayr;
      if (this.ays == null)
        this.ays = new byte[4096];
      localObject3 = this.ays;
      if (this.ayt == null)
        this.ayt = new byte[4097];
      paramb2 = this.ayt;
      i4 = me();
      i5 = 1 << i4;
      i1 = i5 + 2;
      i6 = -1;
      n = i4 + 1;
      i = (1 << n) - 1;
      for (j = 0; j < i5; j++)
      {
        localObject2[j] = ((short)0);
        localObject3[j] = ((byte)(byte)j);
      }
    }
    Object localObject4 = this.ayl;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int m = 0;
    int k = 0;
    int i10 = 0;
    int i2 = 0;
    int i11 = 0;
    int j = i6;
    int i6 = i7;
    while (true)
    {
      int i12;
      if (i6 < i3)
      {
        i12 = m;
        i13 = i11;
        if (m != 0)
          break label1015;
        i12 = me();
        if (i12 > 0)
          break label984;
      }
      int i18;
      while (i12 <= 0)
      {
        this.status = 3;
        Arrays.fill((byte[])localObject1, i2, i3, (byte)0);
        if ((!paramb1.axX) && (this.sampleSize == 1))
          break label2070;
        localObject3 = this.ayv;
        int i14 = paramb1.axW / this.sampleSize;
        int i15 = paramb1.axU / this.sampleSize;
        int i16 = paramb1.axV / this.sampleSize;
        int i17 = paramb1.axT / this.sampleSize;
        i = 1;
        m = 8;
        n = 0;
        if (this.ayw != 0)
          break label1369;
        i8 = 1;
        i18 = this.sampleSize;
        int i19 = this.ayA;
        int i20 = this.ayz;
        localObject4 = this.ayu;
        localObject2 = this.ayo;
        paramb2 = this.ayB;
        k = 0;
        if (k >= i14)
          break label1946;
        if (!paramb1.axX)
          break label2322;
        i1 = m;
        j = n;
        i2 = i;
        if (n >= i14)
          i2 = i + 1;
        switch (i2)
        {
        default:
          j = n;
          i1 = m;
          label828: n = i1;
          m = j;
          i = j + i1;
          j = i2;
          i2 = m;
          i1 = i2 + i15;
          if (i18 != 1)
            break label1403;
          m = 1;
          label867: localObject1 = paramb2;
          if (i1 >= i20)
            break label1435;
          i2 = i1 * i19;
          i1 = i2 + i17;
          i11 = i1 + i16;
          if (i2 + i19 >= i11)
            break label2319;
          i11 = i2 + i19;
          label915: i2 = paramb1.axV * (k * i18);
          if (m == 0)
            break label1456;
          while (true)
          {
            if (i1 >= i11)
              break label1432;
            m = localObject2[(localObject4[i2] & 0xFF)];
            if (m == 0)
              break;
            localObject3[i1] = m;
            localObject1 = paramb2;
            label968: i2 += i18;
            i1++;
            paramb2 = (b)localObject1;
          }
          label984: this.aym.get(this.ayl, 0, Math.min(i12, this.aym.remaining()));
        case 2:
        case 3:
        case 4:
        }
      }
      int i13 = 0;
      label1015: i7 = ((localObject4[i13] & 0xFF) << i9) + i8;
      i11 = i9 + 8;
      while (true)
      {
        label1039: i8 = i7;
        i9 = i11;
        if (i11 < n)
          break label2374;
        m = i7 & i;
        i7 >>= n;
        i11 -= n;
        if (m == i5)
        {
          n = i4 + 1;
          i = (1 << n) - 1;
          i1 = i5 + 2;
          j = -1;
        }
        else
        {
          i8 = i7;
          i9 = i11;
          if (m == i5 + 1)
            break label2374;
          if (j != -1)
            break;
          localObject1[i2] = ((byte)localObject3[m]);
          i6++;
          k = m;
          i2++;
          j = m;
        }
      }
      if (m >= i1)
      {
        paramb2[i10] = ((byte)(byte)k);
        k = i10 + 1;
        i10 = j;
      }
      while (true)
        if (i10 >= i5)
        {
          paramb2[k] = ((byte)localObject3[i10]);
          k++;
          i10 = localObject2[i10];
        }
        else
        {
          i9 = localObject3[i10] & 0xFF;
          localObject1[i2] = ((byte)(byte)i9);
          i2++;
          i6++;
          i10 = k;
          k = i2;
          while (i10 > 0)
          {
            i10--;
            localObject1[k] = ((byte)paramb2[i10]);
            k++;
            i6++;
          }
          i2 = i1;
          if (i1 < 4096)
          {
            localObject2[i1] = ((short)(short)j);
            localObject3[i1] = ((byte)(byte)i9);
            i1++;
            i2 = i1;
            if ((i1 & i) == 0)
            {
              i2 = i1;
              if (i1 < 4096)
              {
                n++;
                j = i + i1;
                i = n;
              }
            }
          }
          while (true)
          {
            i2 = k;
            n = i;
            i = j;
            j = m;
            k = i9;
            break label1039;
            label1369: i8 = 0;
            break;
            j = 4;
            i1 = m;
            break label828;
            j = 2;
            i1 = 4;
            break label828;
            j = 1;
            i1 = 2;
            break label828;
            label1403: m = 0;
            break label867;
            localObject1 = paramb2;
            if (i8 == 0)
              break label968;
            localObject1 = paramb2;
            if (paramb2 != null)
              break label968;
            localObject1 = Boolean.TRUE;
            break label968;
            label1432: localObject1 = paramb2;
            label1435: label1456: int i21;
            label1477: 
            do
            {
              k++;
              m = n;
              n = i;
              i = j;
              paramb2 = (b)localObject1;
              break;
              i21 = i2 + (i11 - i1) * i18;
              i7 = i1;
              i1 = i2;
              localObject1 = paramb2;
            }
            while (i7 >= i11);
            int i22 = paramb1.axV;
            i9 = 0;
            i10 = 0;
            i6 = 0;
            i2 = 0;
            m = 0;
            i3 = i1;
            int i23;
            int i24;
            while ((i3 < this.sampleSize + i1) && (i3 < this.ayu.length) && (i3 < i21))
            {
              i13 = this.ayu[i3];
              i23 = this.ayo[(i13 & 0xFF)];
              i24 = m;
              i4 = i2;
              i5 = i6;
              i12 = i10;
              i13 = i9;
              if (i23 != 0)
              {
                i13 = i9 + (i23 >> 24 & 0xFF);
                i12 = i10 + (i23 >> 16 & 0xFF);
                i5 = i6 + (i23 >> 8 & 0xFF);
                i4 = i2 + (i23 & 0xFF);
                i24 = m + 1;
              }
              i3++;
              m = i24;
              i2 = i4;
              i6 = i5;
              i10 = i12;
              i9 = i13;
            }
            i13 = i1 + i22;
            i3 = i10;
            i10 = i6;
            i6 = m;
            m = i13;
            while ((m < i1 + i22 + this.sampleSize) && (m < this.ayu.length) && (m < i21))
            {
              i13 = this.ayu[m];
              i23 = this.ayo[(i13 & 0xFF)];
              i24 = i6;
              i4 = i2;
              i5 = i10;
              i12 = i3;
              i13 = i9;
              if (i23 != 0)
              {
                i13 = i9 + (i23 >> 24 & 0xFF);
                i12 = i3 + (i23 >> 16 & 0xFF);
                i5 = i10 + (i23 >> 8 & 0xFF);
                i4 = i2 + (i23 & 0xFF);
                i24 = i6 + 1;
              }
              m++;
              i6 = i24;
              i2 = i4;
              i10 = i5;
              i3 = i12;
              i9 = i13;
            }
            if (i6 == 0)
            {
              m = 0;
              label1868: if (m == 0)
                break label1930;
              localObject3[i7] = m;
            }
            while (true)
            {
              i1 += i18;
              i7++;
              break label1477;
              m = i9 / i6 << 24 | i3 / i6 << 16 | i10 / i6 << 8 | i2 / i6;
              break label1868;
              label1930: if ((i8 != 0) && (paramb2 == null))
              {
                paramb2 = Boolean.TRUE;
                continue;
                label1946: if (this.ayB == null)
                  if (paramb2 != null)
                    break label2061;
                label2061: for (boolean bool = false; ; bool = paramb2.booleanValue())
                {
                  this.ayB = Boolean.valueOf(bool);
                  if ((this.ayy) && ((paramb1.axZ == 0) || (paramb1.axZ == 1)))
                  {
                    if (this.ayx == null)
                      this.ayx = mf();
                    this.ayx.setPixels(arrayOfInt, 0, this.ayA, 0, 0, this.ayA, this.ayz);
                  }
                  paramb1 = mf();
                  paramb1.setPixels(arrayOfInt, 0, this.ayA, 0, 0, this.ayA, this.ayz);
                  AppMethodBeat.o(123388);
                  return paramb1;
                }
                label2070: localObject4 = this.ayv;
                i9 = paramb1.axW;
                i10 = paramb1.axU;
                i11 = paramb1.axV;
                i8 = paramb1.axT;
                if (this.ayw == 0)
                {
                  i = 1;
                  i7 = this.ayA;
                  localObject1 = this.ayu;
                  paramb2 = this.ayo;
                  n = 0;
                  j = -1;
                  label2133: if (n >= i9)
                    break label2277;
                  k = (n + i10) * i7;
                  m = k + i8;
                  i1 = m + i11;
                  if (k + i7 >= i1)
                    break label2316;
                  i1 = k + i7;
                }
                label2316: 
                while (true)
                {
                  k = n * paramb1.axV;
                  label2190: if (m < i1)
                  {
                    i6 = localObject1[k];
                    i3 = i6 & 0xFF;
                    i2 = j;
                    if (i3 != j)
                    {
                      i2 = paramb2[i3];
                      if (i2 == 0)
                        break label2264;
                      localObject4[m] = i2;
                    }
                    label2264: for (i2 = j; ; i2 = i6)
                    {
                      k++;
                      m++;
                      j = i2;
                      break label2190;
                      i = 0;
                      break;
                    }
                  }
                  n++;
                  break label2133;
                  label2277: if ((this.ayB == null) && (i != 0) && (j != -1));
                  for (bool = true; ; bool = false)
                  {
                    this.ayB = Boolean.valueOf(bool);
                    break;
                  }
                }
                label2319: break label915;
                label2322: i2 = k;
                i1 = n;
                j = i;
                n = m;
                i = i1;
                break;
              }
            }
            j = i;
            i = n;
            i1 = i2;
          }
          k = i10;
          i10 = m;
        }
      label2374: m = i12 - 1;
      i11 = i13 + 1;
    }
  }

  private void a(c paramc, ByteBuffer paramByteBuffer, int paramInt)
  {
    try
    {
      AppMethodBeat.i(123386);
      if (paramInt <= 0)
      {
        paramc = new java/lang/IllegalArgumentException;
        paramc.<init>("Sample size must be >=0, not: ".concat(String.valueOf(paramInt)));
        AppMethodBeat.o(123386);
        throw paramc;
      }
    }
    finally
    {
    }
    paramInt = Integer.highestOneBit(paramInt);
    this.status = 0;
    this.ayn = paramc;
    this.ayw = -1;
    this.aym = paramByteBuffer.asReadOnlyBuffer();
    this.aym.position(0);
    this.aym.order(ByteOrder.LITTLE_ENDIAN);
    this.ayy = false;
    paramByteBuffer = paramc.ayf.iterator();
    while (paramByteBuffer.hasNext())
      if (((b)paramByteBuffer.next()).axZ == 3)
        this.ayy = true;
    this.sampleSize = paramInt;
    this.ayA = (paramc.width / paramInt);
    this.ayz = (paramc.height / paramInt);
    this.ayu = this.ayq.da(paramc.width * paramc.height);
    this.ayv = this.ayq.db(this.ayA * this.ayz);
    AppMethodBeat.o(123386);
  }

  private int me()
  {
    AppMethodBeat.i(123389);
    int i = this.aym.get();
    AppMethodBeat.o(123389);
    return i & 0xFF;
  }

  private Bitmap mf()
  {
    AppMethodBeat.i(123390);
    if ((this.ayB == null) || (this.ayB.booleanValue()));
    for (Object localObject = Bitmap.Config.ARGB_8888; ; localObject = this.ayC)
    {
      localObject = this.ayq.b(this.ayA, this.ayz, (Bitmap.Config)localObject);
      ((Bitmap)localObject).setHasAlpha(true);
      AppMethodBeat.o(123390);
      return localObject;
    }
  }

  public final void a(Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(123387);
    if ((paramConfig != Bitmap.Config.ARGB_8888) && (paramConfig != Bitmap.Config.RGB_565))
    {
      paramConfig = new IllegalArgumentException("Unsupported format: " + paramConfig + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
      AppMethodBeat.o(123387);
      throw paramConfig;
    }
    this.ayC = paramConfig;
    AppMethodBeat.o(123387);
  }

  public final void advance()
  {
    this.ayw = ((this.ayw + 1) % this.ayn.frameCount);
  }

  public final void clear()
  {
    AppMethodBeat.i(123385);
    this.ayn = null;
    if (this.ayu != null)
      this.ayq.g(this.ayu);
    if (this.ayv != null)
      this.ayq.k(this.ayv);
    if (this.ayx != null)
      this.ayq.f(this.ayx);
    this.ayx = null;
    this.aym = null;
    this.ayB = null;
    if (this.ayl != null)
      this.ayq.g(this.ayl);
    AppMethodBeat.o(123385);
  }

  public final ByteBuffer getData()
  {
    return this.aym;
  }

  public final int getFrameCount()
  {
    return this.ayn.frameCount;
  }

  public final int lT()
  {
    AppMethodBeat.i(123382);
    int i;
    if ((this.ayn.frameCount <= 0) || (this.ayw < 0))
    {
      i = 0;
      AppMethodBeat.o(123382);
    }
    while (true)
    {
      return i;
      int j = this.ayw;
      int k = -1;
      i = k;
      if (j >= 0)
      {
        i = k;
        if (j < this.ayn.frameCount)
          i = ((b)this.ayn.ayf.get(j)).delay;
      }
      AppMethodBeat.o(123382);
    }
  }

  public final int lU()
  {
    return this.ayw;
  }

  public final void lV()
  {
    this.ayw = -1;
  }

  public final int lW()
  {
    AppMethodBeat.i(123383);
    int i = this.aym.limit();
    int j = this.ayu.length;
    int k = this.ayv.length;
    AppMethodBeat.o(123383);
    return i + j + k * 4;
  }

  public final Bitmap lX()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(123384);
        Object localObject1;
        if ((this.ayn.frameCount <= 0) || (this.ayw < 0))
        {
          if (Log.isLoggable(TAG, 3))
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("Unable to decode frame, frameCount=");
            ((StringBuilder)localObject1).append(this.ayn.frameCount).append(", framePointer=").append(this.ayw);
          }
          this.status = 1;
        }
        if ((this.status == 1) || (this.status == 2))
        {
          if (Log.isLoggable(TAG, 3))
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("Unable to decode frame, status=");
            ((StringBuilder)localObject1).append(this.status);
          }
          AppMethodBeat.o(123384);
          localObject1 = null;
          return localObject1;
        }
        this.status = 0;
        if (this.ayl == null)
          this.ayl = this.ayq.da(255);
        b localb = (b)this.ayn.ayf.get(this.ayw);
        int i = this.ayw - 1;
        if (i >= 0)
        {
          localObject1 = (b)this.ayn.ayf.get(i);
          if (localb.ayc != null)
          {
            arrayOfInt = localb.ayc;
            this.ayo = arrayOfInt;
            if (this.ayo != null)
              continue;
            if (Log.isLoggable(TAG, 3))
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("No valid color table found for frame #");
              ((StringBuilder)localObject1).append(this.ayw);
            }
            this.status = 1;
            AppMethodBeat.o(123384);
            localObject1 = null;
            continue;
          }
          int[] arrayOfInt = this.ayn.ayd;
          continue;
          if (localb.axY)
          {
            System.arraycopy(this.ayo, 0, this.ayp, 0, this.ayo.length);
            this.ayo = this.ayp;
            this.ayo[localb.aya] = 0;
          }
          localObject1 = a(localb, (b)localObject1);
          AppMethodBeat.o(123384);
          continue;
        }
      }
      finally
      {
      }
      Object localObject3 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.b.e
 * JD-Core Version:    0.6.2
 */