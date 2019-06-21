package com.tencent.qqmusic.mediaplayer.upstream;

public abstract interface IDataSourceFactory
{
  public abstract IDataSource createDataSource();

  public abstract INativeDataSource createNativeDataSource();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory
 * JD-Core Version:    0.6.2
 */