package com.tencent.matrix.mrs.core;

public abstract interface MrsCallback
{
  public abstract String getCryptKey(MatrixUploadDataSlice paramMatrixUploadDataSlice);

  public abstract String getHost(MatrixUploadDataSlice paramMatrixUploadDataSlice);

  public abstract String getPublicSharePath();

  public abstract String getUrl(MatrixUploadDataSlice paramMatrixUploadDataSlice);

  public abstract boolean onRequestGetMrsStrategy(byte[] paramArrayOfByte);

  public abstract void onStrategyNotify(String paramString, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.mrs.core.MrsCallback
 * JD-Core Version:    0.6.2
 */