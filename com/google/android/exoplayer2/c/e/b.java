package com.google.android.exoplayer2.c.e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.i.f;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class b extends h
{
  f aZZ;
  private b.a baa;

  private static boolean p(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    if (paramArrayOfByte[0] == -1)
      bool = true;
    return bool;
  }

  public static boolean r(l paraml)
  {
    AppMethodBeat.i(95029);
    boolean bool;
    if ((paraml.tB() >= 5) && (paraml.readUnsignedByte() == 127) && (paraml.cM() == 1179402563L))
    {
      bool = true;
      AppMethodBeat.o(95029);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95029);
    }
  }

  protected final boolean a(l paraml, long paramLong, h.a parama)
  {
    int i = 0;
    AppMethodBeat.i(95032);
    Object localObject = paraml.data;
    if (this.aZZ == null)
    {
      this.aZZ = new f((byte[])localObject);
      paraml = Arrays.copyOfRange((byte[])localObject, 9, paraml.limit);
      paraml[4] = ((byte)-128);
      localObject = Collections.singletonList(paraml);
      paraml = this.aZZ;
      i = paraml.bdU;
      parama.aOv = Format.a(null, "audio/flac", -1, paraml.sampleRate * i, this.aZZ.channels, this.aZZ.sampleRate, (List)localObject, null, null);
      AppMethodBeat.o(95032);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      if ((localObject[0] & 0x7F) == 3)
      {
        this.baa = new b.a(this);
        parama = this.baa;
        paraml.eM(1);
        int j = paraml.tD() / 18;
        parama.bab = new long[j];
        parama.bac = new long[j];
        while (i < j)
        {
          parama.bab[i] = paraml.readLong();
          parama.bac[i] = paraml.readLong();
          paraml.eM(2);
          i++;
        }
        break;
      }
      if (!p((byte[])localObject))
        break;
      if (this.baa != null)
      {
        this.baa.firstFrameOffset = paramLong;
        parama.bax = this.baa;
      }
      AppMethodBeat.o(95032);
    }
  }

  protected final void reset(boolean paramBoolean)
  {
    AppMethodBeat.i(95030);
    super.reset(paramBoolean);
    if (paramBoolean)
    {
      this.aZZ = null;
      this.baa = null;
    }
    AppMethodBeat.o(95030);
  }

  protected final long s(l paraml)
  {
    int i = 1;
    AppMethodBeat.i(95031);
    long l1;
    if (!p(paraml.data))
    {
      l1 = -1L;
      AppMethodBeat.o(95031);
      return l1;
    }
    int j = (paraml.data[2] & 0xFF) >> 4;
    int k;
    switch (j)
    {
    default:
      k = -1;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
      while (true)
      {
        l1 = k;
        AppMethodBeat.o(95031);
        break;
        k = 192;
        continue;
        k = 576 << j - 2;
      }
    case 6:
    case 7:
      paraml.eM(4);
      l1 = paraml.data[paraml.position];
      k = 7;
      label176: if (k >= 0)
        if ((1 << k & l1) == 0L)
          if (k < 6)
          {
            l1 &= (1 << k) - 1;
            k = 7 - k;
          }
      break;
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    }
    while (true)
    {
      long l2 = l1;
      if (k == 0)
      {
        paraml = new NumberFormatException("Invalid UTF-8 sequence first byte: ".concat(String.valueOf(l1)));
        AppMethodBeat.o(95031);
        throw paraml;
        if (k != 7)
          break label399;
        k = 1;
        continue;
        k--;
        break label176;
      }
      int m;
      do
      {
        l2 = l2 << 6 | m & 0x3F;
        i++;
        if (i >= k)
          break;
        m = paraml.data[(paraml.position + i)];
      }
      while ((m & 0xC0) == 128);
      paraml = new NumberFormatException("Invalid UTF-8 sequence continuation byte: ".concat(String.valueOf(l2)));
      AppMethodBeat.o(95031);
      throw paraml;
      paraml.position += k;
      if (j == 6);
      for (k = paraml.readUnsignedByte(); ; k = paraml.readUnsignedShort())
      {
        paraml.setPosition(0);
        k++;
        break;
      }
      k = 256 << j - 8;
      break;
      label399: k = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.e.b
 * JD-Core Version:    0.6.2
 */