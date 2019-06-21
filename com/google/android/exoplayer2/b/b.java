package com.google.android.exoplayer2.b;

import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public int aRX;
  public int aRY;
  public final MediaCodec.CryptoInfo aRZ;
  private final b.a aSa;
  public byte[] iv;
  public byte[] key;
  public int mode;
  public int[] numBytesOfClearData;
  public int[] numBytesOfEncryptedData;
  public int numSubSamples;

  public b()
  {
    AppMethodBeat.i(94737);
    if (v.SDK_INT >= 16);
    for (Object localObject2 = new MediaCodec.CryptoInfo(); ; localObject2 = null)
    {
      this.aRZ = ((MediaCodec.CryptoInfo)localObject2);
      localObject2 = localObject1;
      if (v.SDK_INT >= 24)
        localObject2 = new b.a(this.aRZ, (byte)0);
      this.aSa = ((b.a)localObject2);
      AppMethodBeat.o(94737);
      return;
    }
  }

  public final void a(int paramInt1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(94738);
    this.numSubSamples = paramInt1;
    this.numBytesOfClearData = paramArrayOfInt1;
    this.numBytesOfEncryptedData = paramArrayOfInt2;
    this.key = paramArrayOfByte1;
    this.iv = paramArrayOfByte2;
    this.mode = paramInt2;
    this.aRX = paramInt3;
    this.aRY = paramInt4;
    if (v.SDK_INT >= 16)
    {
      this.aRZ.numSubSamples = this.numSubSamples;
      this.aRZ.numBytesOfClearData = this.numBytesOfClearData;
      this.aRZ.numBytesOfEncryptedData = this.numBytesOfEncryptedData;
      this.aRZ.key = this.key;
      this.aRZ.iv = this.iv;
      this.aRZ.mode = this.mode;
      if (v.SDK_INT >= 24)
      {
        paramArrayOfInt1 = this.aSa;
        paramInt2 = this.aRX;
        paramInt1 = this.aRY;
        paramArrayOfInt1.aSb.set(paramInt2, paramInt1);
        paramArrayOfInt1.aRZ.setPattern(paramArrayOfInt1.aSb);
      }
    }
    AppMethodBeat.o(94738);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.b.b
 * JD-Core Version:    0.6.2
 */