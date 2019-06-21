package com.tencent.qqpinyin.voicerecoapi;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public static int MAX_FRAME_SIZE = 2000;
  private int AqA;
  public int AqB;
  public TRSpeexNative AqC;
  private byte[] Aqy;
  public byte[] Aqz;

  public a()
  {
    AppMethodBeat.i(35432);
    this.Aqy = null;
    this.Aqz = null;
    this.AqA = 0;
    this.AqB = 0;
    this.AqC = new TRSpeexNative();
    AppMethodBeat.o(35432);
  }

  public final byte[] Z(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(35434);
    if (this.AqA == 0)
    {
      paramArrayOfByte = new b(-102);
      AppMethodBeat.o(35434);
      throw paramArrayOfByte;
    }
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      paramArrayOfByte = new b(-104);
      AppMethodBeat.o(35434);
      throw paramArrayOfByte;
    }
    paramInt = this.AqC.nativeTRSpeexEncode(this.AqA, paramArrayOfByte, 0, paramInt, this.Aqy);
    if (paramInt < 0)
    {
      paramArrayOfByte = new b(paramInt);
      AppMethodBeat.o(35434);
      throw paramArrayOfByte;
    }
    if (paramInt == 0)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(35434);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = new byte[paramInt];
      System.arraycopy(this.Aqy, 0, paramArrayOfByte, 0, paramInt);
      AppMethodBeat.o(35434);
    }
  }

  public final int dPS()
  {
    AppMethodBeat.i(35433);
    int i;
    if (this.AqA != 0)
    {
      i = -103;
      AppMethodBeat.o(35433);
    }
    while (true)
    {
      return i;
      i = this.AqC.nativeTRSpeexInit();
      if (i == -1)
      {
        AppMethodBeat.o(35433);
      }
      else
      {
        this.AqA = i;
        this.Aqy = new byte[MAX_FRAME_SIZE * 10];
        i = 0;
        AppMethodBeat.o(35433);
      }
    }
  }

  public final int dPT()
  {
    AppMethodBeat.i(35435);
    int i;
    if (this.AqA == 0)
    {
      i = -102;
      AppMethodBeat.o(35435);
    }
    while (true)
    {
      return i;
      this.Aqy = null;
      i = this.AqC.nativeTRSpeexRelease(this.AqA);
      this.AqA = 0;
      AppMethodBeat.o(35435);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqpinyin.voicerecoapi.a
 * JD-Core Version:    0.6.2
 */