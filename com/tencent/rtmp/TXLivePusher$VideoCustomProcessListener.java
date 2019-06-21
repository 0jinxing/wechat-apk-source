package com.tencent.rtmp;

public abstract interface TXLivePusher$VideoCustomProcessListener
{
  public abstract void onDetectFacePoints(float[] paramArrayOfFloat);

  public abstract int onTextureCustomProcess(int paramInt1, int paramInt2, int paramInt3);

  public abstract void onTextureDestoryed();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
 * JD-Core Version:    0.6.2
 */