package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.i.c;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.j.b;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  public final List<byte[]> aOf;
  public final int aTz;
  public final float brq;
  public final int height;
  public final int width;

  private a(List<byte[]> paramList, int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    this.aOf = paramList;
    this.aTz = paramInt1;
    this.width = paramInt2;
    this.height = paramInt3;
    this.brq = paramFloat;
  }

  public static a K(l paraml)
  {
    int i = 0;
    AppMethodBeat.i(95979);
    int j;
    try
    {
      paraml.eM(4);
      j = (paraml.readUnsignedByte() & 0x3) + 1;
      if (j == 3)
      {
        paraml = new java/lang/IllegalStateException;
        paraml.<init>();
        AppMethodBeat.o(95979);
        throw paraml;
      }
    }
    catch (ArrayIndexOutOfBoundsException paraml)
    {
      paraml = new o("Error parsing AVC config", paraml);
      AppMethodBeat.o(95979);
      throw paraml;
    }
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int k = paraml.readUnsignedByte() & 0x1F;
    for (int m = 0; m < k; m++)
      localArrayList.add(L(paraml));
    int n = paraml.readUnsignedByte();
    for (m = i; m < n; m++)
      localArrayList.add(L(paraml));
    float f = 1.0F;
    if (k > 0)
    {
      paraml = (byte[])localArrayList.get(0);
      paraml = j.k((byte[])localArrayList.get(0), j, paraml.length);
      m = paraml.width;
      i = paraml.height;
      f = paraml.brq;
    }
    while (true)
    {
      paraml = new a(localArrayList, j, m, i, f);
      AppMethodBeat.o(95979);
      return paraml;
      m = -1;
      i = -1;
    }
  }

  private static byte[] L(l paraml)
  {
    AppMethodBeat.i(95980);
    int i = paraml.readUnsignedShort();
    int j = paraml.position;
    paraml.eM(i);
    paraml = c.j(paraml.data, j, i);
    AppMethodBeat.o(95980);
    return paraml;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.video.a
 * JD-Core Version:    0.6.2
 */