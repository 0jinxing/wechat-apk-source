package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class b
{
  public final List<byte[]> aOf;
  public final int aTz;

  private b(List<byte[]> paramList, int paramInt)
  {
    this.aOf = paramList;
    this.aTz = paramInt;
  }

  public static b M(l paraml)
  {
    AppMethodBeat.i(95995);
    try
    {
      paraml.eM(21);
      int i = paraml.readUnsignedByte();
      int j = paraml.readUnsignedByte();
      int k = paraml.position;
      int m = 0;
      int n = 0;
      int i1;
      int i2;
      int i3;
      while (m < j)
      {
        paraml.eM(1);
        i1 = paraml.readUnsignedShort();
        for (i2 = 0; i2 < i1; i2++)
        {
          i3 = paraml.readUnsignedShort();
          n += i3 + 4;
          paraml.eM(i3);
        }
        m++;
      }
      paraml.setPosition(k);
      byte[] arrayOfByte = new byte[n];
      m = 0;
      k = 0;
      while (m < j)
      {
        paraml.eM(1);
        i1 = paraml.readUnsignedShort();
        for (i2 = 0; i2 < i1; i2++)
        {
          i3 = paraml.readUnsignedShort();
          System.arraycopy(j.bqY, 0, arrayOfByte, k, j.bqY.length);
          k += j.bqY.length;
          System.arraycopy(paraml.data, paraml.position, arrayOfByte, k, i3);
          k += i3;
          paraml.eM(i3);
        }
        m++;
      }
      if (n == 0);
      for (paraml = null; ; paraml = Collections.singletonList(arrayOfByte))
      {
        paraml = new b(paraml, (i & 0x3) + 1);
        AppMethodBeat.o(95995);
        return paraml;
      }
    }
    catch (ArrayIndexOutOfBoundsException paraml)
    {
      paraml = new o("Error parsing HEVC config", paraml);
      AppMethodBeat.o(95995);
    }
    throw paraml;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.video.b
 * JD-Core Version:    0.6.2
 */