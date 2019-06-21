package com.tencent.qqvideo.proxy.pi;

public class IRefObject
{
  private long mNativePtr;

  public IRefObject(long paramLong)
  {
    this.mNativePtr = paramLong;
  }

  private static native void freeNativePtr(long paramLong);

  private long getNativePtr()
  {
    try
    {
      long l = this.mNativePtr;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public native void finalize();

  public synchronized native void release();

  public synchronized native void retain();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqvideo.proxy.pi.IRefObject
 * JD-Core Version:    0.6.2
 */