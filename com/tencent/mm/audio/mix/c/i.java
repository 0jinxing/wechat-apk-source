package com.tencent.mm.audio.mix.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.h.b;
import com.tencent.mm.audio.mix.jni.SilkResampleJni;

public final class i
  implements h
{
  private int clA = 0;
  private int clz = 0;
  private String fileName;

  public final byte[] F(byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(137034);
    short[] arrayOfShort1 = new short[paramArrayOfByte.length / 2];
    for (int j = 0; j < arrayOfShort1.length; j++)
      arrayOfShort1[j] = ((short)(short)(paramArrayOfByte[(j * 2)] & 0xFF | (paramArrayOfByte[(j * 2 + 1)] & 0xFF) << 8));
    short[] arrayOfShort2 = new short[arrayOfShort1.length * this.clA / this.clz];
    if (SilkResampleJni.resamplePcm(this.fileName, this.clz, this.clA, arrayOfShort1, arrayOfShort1.length, arrayOfShort2) == -1)
    {
      b.e("MicroMsg.Mix.SilkResampleAlgorithm", "resamplePcm result is -1, fileName:%s", new Object[] { this.fileName });
      paramArrayOfByte = null;
      AppMethodBeat.o(137034);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = new byte[arrayOfShort2.length << 1];
      for (j = i; j < arrayOfShort2.length; j++)
      {
        paramArrayOfByte[(j * 2)] = ((byte)(byte)(arrayOfShort2[j] & 0xFF));
        paramArrayOfByte[(j * 2 + 1)] = ((byte)(byte)((arrayOfShort2[j] & 0xFF00) >> 8));
      }
      AppMethodBeat.o(137034);
    }
  }

  public final boolean g(String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(137033);
    this.clz = paramInt1;
    this.clA = paramInt2;
    this.fileName = paramString;
    b.i("MicroMsg.Mix.SilkResampleAlgorithm", "initResample, fileName:%s, sSample:%d, dSample:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (SilkResampleJni.initResample(paramString, paramInt1, paramInt2) == -1)
    {
      b.e("MicroMsg.Mix.SilkResampleAlgorithm", "initResample result is -1, fileName:%s", new Object[] { paramString });
      AppMethodBeat.o(137033);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137033);
      bool = true;
    }
  }

  public final boolean release()
  {
    AppMethodBeat.i(137035);
    boolean bool;
    if (SilkResampleJni.clearResample(this.fileName) == -1)
    {
      b.e("MicroMsg.Mix.SilkResampleAlgorithm", "clearResample result is -1");
      bool = false;
      AppMethodBeat.o(137035);
    }
    while (true)
    {
      return bool;
      b.i("MicroMsg.Mix.SilkResampleAlgorithm", "release");
      bool = true;
      AppMethodBeat.o(137035);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.c.i
 * JD-Core Version:    0.6.2
 */