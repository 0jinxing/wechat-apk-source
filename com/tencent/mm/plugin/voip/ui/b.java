package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import com.tencent.mm.plugin.voip.video.CaptureView;

public abstract interface b
{
  public abstract void GC(int paramInt);

  public abstract void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);

  public abstract void abY(String paramString);

  public abstract void bIK();

  public abstract void br(int paramInt, String paramString);

  public abstract void c(int paramInt1, int paramInt2, int[] paramArrayOfInt);

  public abstract void cJD();

  public abstract Context cKS();

  public abstract void cKT();

  public abstract byte[] cKU();

  public abstract void fY(int paramInt1, int paramInt2);

  public abstract void my(boolean paramBoolean);

  public abstract void setCaptureView(CaptureView paramCaptureView);

  public abstract void setConnectSec(long paramLong);

  public abstract void setHWDecMode(int paramInt);

  public abstract void setMute(boolean paramBoolean);

  public abstract void setScreenEnable(boolean paramBoolean);

  public abstract void setVoipBeauty(int paramInt);

  public abstract void uninit();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.b
 * JD-Core Version:    0.6.2
 */