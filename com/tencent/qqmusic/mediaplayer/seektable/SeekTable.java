package com.tencent.qqmusic.mediaplayer.seektable;

import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;

public abstract interface SeekTable
{
  public abstract void parse(IDataSource paramIDataSource);

  public abstract long seek(long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.SeekTable
 * JD-Core Version:    0.6.2
 */