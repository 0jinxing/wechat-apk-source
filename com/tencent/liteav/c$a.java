package com.tencent.liteav;

import android.media.MediaFormat;
import com.tencent.liteav.basic.g.b;

public abstract interface c$a
{
  public abstract void onEncAudio(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2);

  public abstract void onEncVideo(b paramb);

  public abstract void onEncVideoFormat(MediaFormat paramMediaFormat);

  public abstract void onRecordPcm(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3);

  public abstract void onRecordRawPcm(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.c.a
 * JD-Core Version:    0.6.2
 */