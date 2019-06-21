package com.tencent.qqmusic.mediaplayer.seektable;

public abstract interface Parsable
{
  public abstract long available();

  public abstract void readBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public abstract int readInt();

  public abstract int[] readIntArray(int paramInt);

  public abstract void readIntArrayInterleaved(int paramInt, int[][] paramArrayOfInt);

  public abstract long readLong();

  public abstract long[] readLongArray(int paramInt);

  public abstract void readLongArrayInterleaved(int paramInt, long[][] paramArrayOfLong);

  public abstract String readString(int paramInt);

  public abstract long skip(long paramLong);

  public abstract long tell();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.Parsable
 * JD-Core Version:    0.6.2
 */