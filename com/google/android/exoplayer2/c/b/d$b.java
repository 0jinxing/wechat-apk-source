package com.google.android.exoplayer2.c.b;

import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.c.m.a;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

final class d$b
{
  public DrmInitData aOg;
  public int aOk = -1;
  public byte[] aOl = null;
  public int aOn = 1;
  String aOt = "eng";
  public m aTw;
  public int aTz;
  public String aUK;
  public int aUL;
  public boolean aUM;
  public byte[] aUN;
  public m.a aUO;
  public byte[] aUP;
  public int aUQ = -1;
  public int aUR = -1;
  public int aUS = 0;
  public boolean aUT = false;
  public int aUU = -1;
  public int aUV = -1;
  public int aUW = -1;
  public int aUX = 1000;
  public int aUY = 200;
  public float aUZ = -1.0F;
  public float aVa = -1.0F;
  public float aVb = -1.0F;
  public float aVc = -1.0F;
  public float aVd = -1.0F;
  public float aVe = -1.0F;
  public float aVf = -1.0F;
  public float aVg = -1.0F;
  public float aVh = -1.0F;
  public float aVi = -1.0F;
  public int aVj = -1;
  public long aVk = 0L;
  public long aVl = 0L;
  public boolean aVm;
  public boolean aVn = true;
  public int height = -1;
  public int number;
  public int sampleRate = 8000;
  public int type;
  public int width = -1;

  static List<byte[]> i(l paraml)
  {
    AppMethodBeat.i(94896);
    try
    {
      paraml.eM(16);
      long l = paraml.tE();
      if (l != 826496599L)
      {
        paraml = null;
        AppMethodBeat.o(94896);
        return paraml;
      }
      int i = paraml.position + 20;
      paraml = paraml.data;
      while (true)
      {
        if (i >= paraml.length - 4)
          break label112;
        if ((paraml[i] == 0) && (paraml[(i + 1)] == 0) && (paraml[(i + 2)] == 1) && (paraml[(i + 3)] == 15))
        {
          paraml = Collections.singletonList(Arrays.copyOfRange(paraml, i, paraml.length));
          AppMethodBeat.o(94896);
          break;
        }
        i++;
      }
      label112: paraml = new com/google/android/exoplayer2/o;
      paraml.<init>("Failed to find FourCC VC1 initialization data");
      AppMethodBeat.o(94896);
      throw paraml;
    }
    catch (ArrayIndexOutOfBoundsException paraml)
    {
      paraml = new o("Error parsing FourCC VC1 codec private");
      AppMethodBeat.o(94896);
    }
    throw paraml;
  }

  static boolean j(l paraml)
  {
    boolean bool = true;
    AppMethodBeat.i(94898);
    while (true)
    {
      try
      {
        int i = paraml.tC();
        if (i == 1)
        {
          AppMethodBeat.o(94898);
          return bool;
        }
        if (i != 65534)
          break label100;
        paraml.setPosition(24);
        if ((paraml.readLong() == d.re().getMostSignificantBits()) && (paraml.readLong() == d.re().getLeastSignificantBits()))
        {
          AppMethodBeat.o(94898);
          continue;
        }
      }
      catch (ArrayIndexOutOfBoundsException paraml)
      {
        paraml = new o("Error parsing MS/ACM codec private");
        AppMethodBeat.o(94898);
        throw paraml;
      }
      AppMethodBeat.o(94898);
      bool = false;
      continue;
      label100: AppMethodBeat.o(94898);
      bool = false;
    }
  }

  static List<byte[]> m(byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(94897);
    if (paramArrayOfByte[0] != 2)
      try
      {
        paramArrayOfByte = new com/google/android/exoplayer2/o;
        paramArrayOfByte.<init>("Error parsing vorbis codec private");
        AppMethodBeat.o(94897);
        throw paramArrayOfByte;
      }
      catch (ArrayIndexOutOfBoundsException paramArrayOfByte)
      {
        paramArrayOfByte = new o("Error parsing vorbis codec private");
        AppMethodBeat.o(94897);
        throw paramArrayOfByte;
      }
    int j = 0;
    int k = 1;
    while (paramArrayOfByte[k] == -1)
    {
      k++;
      j += 255;
    }
    int m = k + 1;
    int n = j + paramArrayOfByte[k];
    j = m;
    k = i;
    while (paramArrayOfByte[j] == -1)
    {
      k += 255;
      j++;
    }
    i = j + 1;
    j = paramArrayOfByte[j];
    if (paramArrayOfByte[i] != 1)
    {
      paramArrayOfByte = new com/google/android/exoplayer2/o;
      paramArrayOfByte.<init>("Error parsing vorbis codec private");
      AppMethodBeat.o(94897);
      throw paramArrayOfByte;
    }
    byte[] arrayOfByte1 = new byte[n];
    System.arraycopy(paramArrayOfByte, i, arrayOfByte1, 0, n);
    i = n + i;
    if (paramArrayOfByte[i] != 3)
    {
      paramArrayOfByte = new com/google/android/exoplayer2/o;
      paramArrayOfByte.<init>("Error parsing vorbis codec private");
      AppMethodBeat.o(94897);
      throw paramArrayOfByte;
    }
    k = k + j + i;
    if (paramArrayOfByte[k] != 5)
    {
      paramArrayOfByte = new com/google/android/exoplayer2/o;
      paramArrayOfByte.<init>("Error parsing vorbis codec private");
      AppMethodBeat.o(94897);
      throw paramArrayOfByte;
    }
    byte[] arrayOfByte2 = new byte[paramArrayOfByte.length - k];
    System.arraycopy(paramArrayOfByte, k, arrayOfByte2, 0, paramArrayOfByte.length - k);
    paramArrayOfByte = new java/util/ArrayList;
    paramArrayOfByte.<init>(2);
    paramArrayOfByte.add(arrayOfByte1);
    paramArrayOfByte.add(arrayOfByte2);
    AppMethodBeat.o(94897);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.b.d.b
 * JD-Core Version:    0.6.2
 */