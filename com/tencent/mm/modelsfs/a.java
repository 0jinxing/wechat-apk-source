package com.tencent.mm.modelsfs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.imgenc.MMIMAGEENCJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  private static boolean fNO = false;
  private long fNP;
  private String fNQ;
  private long fNR;
  private long mNativePtr;

  public a(long paramLong)
  {
    AppMethodBeat.i(93147);
    this.fNP = 0L;
    this.mNativePtr = 0L;
    this.fNR = 0L;
    this.fNQ = String.valueOf(paramLong);
    init();
    AppMethodBeat.o(93147);
  }

  public a(String paramString)
  {
    AppMethodBeat.i(93148);
    this.fNP = 0L;
    this.mNativePtr = 0L;
    this.fNR = 0L;
    this.fNQ = paramString;
    init();
    AppMethodBeat.o(93148);
  }

  private void init()
  {
    AppMethodBeat.i(93149);
    ab.i("MicroMsg.EncEngine", "init  key  enckey " + this.fNQ + "  hashcode " + hashCode());
    this.mNativePtr = MMIMAGEENCJNI.open(this.fNQ);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("mNativePtr ");
      ab.i("MicroMsg.EncEngine", this.mNativePtr + " " + hashCode());
      AppMethodBeat.o(93149);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.EncEngine", "exception " + localException.getMessage());
        AppMethodBeat.o(93149);
      }
    }
  }

  public final long aiO()
  {
    this.fNR = this.fNP;
    return this.fNR;
  }

  public final void free()
  {
    AppMethodBeat.i(93153);
    ab.i("MicroMsg.EncEngine", "free mNativePtr: " + this.mNativePtr + " hashcode " + hashCode());
    MMIMAGEENCJNI.free(this.mNativePtr);
    this.mNativePtr = 0L;
    AppMethodBeat.o(93153);
  }

  public final void reset()
  {
    AppMethodBeat.i(93150);
    ab.i("MicroMsg.EncEngine", "reset " + bo.dpG());
    free();
    if (this.fNR == 0L)
    {
      init();
      this.fNP = 0L;
      AppMethodBeat.o(93150);
    }
    while (true)
    {
      return;
      init();
      MMIMAGEENCJNI.seek(this.mNativePtr, this.fNR, 1);
      this.fNP = this.fNR;
      AppMethodBeat.o(93150);
    }
  }

  public final void seek(long paramLong)
  {
    AppMethodBeat.i(93152);
    this.fNP = paramLong;
    MMIMAGEENCJNI.seek(this.mNativePtr, paramLong, 1);
    AppMethodBeat.o(93152);
  }

  public final int z(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(93151);
    if (this.mNativePtr == 0L)
      ab.i("MicroMsg.EncEngine", "transFor " + bo.dpG().toString());
    if (fNO)
      ab.i("MicroMsg.EncEngine", "trans for  " + hashCode() + " " + paramArrayOfByte.length);
    if ((fNO) && (this.fNP < 64L))
      ab.d("MicroMsg.EncEngine", "dump before _offset " + this.fNP + "  length:" + paramInt + " " + bo.ca(paramArrayOfByte) + " hashcode " + hashCode());
    MMIMAGEENCJNI.transFor(this.mNativePtr, paramArrayOfByte, this.fNP, paramInt);
    if ((fNO) && (this.fNP < 64L))
      ab.d("MicroMsg.EncEngine", "dump after _offset " + this.fNP + "  length:" + paramInt + " " + bo.ca(paramArrayOfByte) + " hashcode " + hashCode());
    this.fNP += paramInt;
    AppMethodBeat.o(93151);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.a
 * JD-Core Version:    0.6.2
 */