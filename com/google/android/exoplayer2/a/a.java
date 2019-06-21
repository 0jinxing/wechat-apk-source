package com.google.android.exoplayer2.a;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.i.k;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public final class a
{
  private static final int[] aPs = { 1, 2, 3, 6 };
  private static final int[] aPt = { 48000, 44100, 32000 };
  private static final int[] aPu = { 24000, 22050, 16000 };
  private static final int[] aPv = { 2, 1, 2, 3, 3, 4, 4, 5 };
  private static final int[] aPw = { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640 };
  private static final int[] aPx = { 69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };

  public static Format a(l paraml, String paramString1, String paramString2, DrmInitData paramDrmInitData)
  {
    AppMethodBeat.i(94638);
    int i = paraml.readUnsignedByte();
    int j = aPt[((i & 0xC0) >> 6)];
    int k = paraml.readUnsignedByte();
    int m = aPv[((k & 0x38) >> 3)];
    i = m;
    if ((k & 0x4) != 0)
      i = m + 1;
    paraml = Format.a(paramString1, "audio/ac3", -1, -1, i, j, null, paramDrmInitData, paramString2);
    AppMethodBeat.o(94638);
    return paraml;
  }

  public static a.a a(k paramk)
  {
    int i = 1;
    AppMethodBeat.i(94640);
    int j = paramk.baF;
    int k = paramk.baG;
    paramk.ee(40);
    int m;
    label96: int i1;
    String str;
    if (paramk.ed(5) == 16)
    {
      m = 1;
      paramk.setPosition(k + j * 8);
      if (m == 0)
        break label198;
      paramk.ee(21);
      n = (paramk.ed(11) + 1) * 2;
      m = paramk.ed(2);
      if (m != 3)
        break label175;
      m = aPu[paramk.ed(2)];
      k = 6;
      j = k * 256;
      i1 = paramk.ed(3);
      str = "audio/eac3";
      k = n;
      n = i1;
      label120: boolean bool = paramk.rl();
      i1 = aPv[n];
      if (!bool)
        break label296;
    }
    label296: for (int n = i; ; n = 0)
    {
      paramk = new a.a(str, n + i1, m, k, j, (byte)0);
      AppMethodBeat.o(94640);
      return paramk;
      m = 0;
      break;
      label175: k = paramk.ed(2);
      k = aPs[k];
      m = aPt[m];
      break label96;
      label198: paramk.ee(32);
      m = paramk.ed(2);
      k = bc(m, paramk.ed(6));
      paramk.ee(8);
      n = paramk.ed(3);
      if (((n & 0x1) != 0) && (n != 1))
        paramk.ee(2);
      if ((n & 0x4) != 0)
        paramk.ee(2);
      if (n == 2)
        paramk.ee(2);
      m = aPt[m];
      j = 1536;
      str = "audio/ac3";
      break label120;
    }
  }

  public static Format b(l paraml, String paramString1, String paramString2, DrmInitData paramDrmInitData)
  {
    AppMethodBeat.i(94639);
    paraml.eM(2);
    int i = paraml.readUnsignedByte();
    int j = aPt[((i & 0xC0) >> 6)];
    int k = paraml.readUnsignedByte();
    int m = aPv[((k & 0xE) >> 1)];
    i = m;
    if ((k & 0x1) != 0)
      i = m + 1;
    paraml = Format.a(paramString1, "audio/eac3", -1, -1, i, j, null, paramDrmInitData, paramString2);
    AppMethodBeat.o(94639);
    return paraml;
  }

  private static int bc(int paramInt1, int paramInt2)
  {
    int i = paramInt2 / 2;
    if ((paramInt1 < 0) || (paramInt1 >= aPt.length) || (paramInt2 < 0) || (i >= aPx.length))
      paramInt1 = -1;
    while (true)
    {
      return paramInt1;
      paramInt1 = aPt[paramInt1];
      if (paramInt1 == 44100)
      {
        paramInt1 = (aPx[i] + paramInt2 % 2) * 2;
      }
      else
      {
        paramInt2 = aPw[i];
        if (paramInt1 == 32000)
          paramInt1 = paramInt2 * 6;
        else
          paramInt1 = paramInt2 * 4;
      }
    }
  }

  public static int f(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(94642);
    if ((paramByteBuffer.get(paramByteBuffer.position() + 4) & 0xC0) >> 6 == 3);
    for (int i = 6; ; i = aPs[((paramByteBuffer.get(paramByteBuffer.position() + 4) & 0x30) >> 4)])
    {
      AppMethodBeat.o(94642);
      return i * 256;
    }
  }

  public static int j(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(94641);
    int i;
    if (paramArrayOfByte.length < 5)
    {
      i = -1;
      AppMethodBeat.o(94641);
    }
    while (true)
    {
      return i;
      i = bc((paramArrayOfByte[4] & 0xC0) >> 6, paramArrayOfByte[4] & 0x3F);
      AppMethodBeat.o(94641);
    }
  }

  public static int qj()
  {
    return 1536;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.a
 * JD-Core Version:    0.6.2
 */