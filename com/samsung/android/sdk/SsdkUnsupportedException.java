package com.samsung.android.sdk;

public class SsdkUnsupportedException extends Exception
{
  public static final int DEVICE_NOT_SUPPORTED = 1;
  public static final int LIBRARY_NOT_INSTALLED = 2;
  public static final int LIBRARY_UPDATE_IS_RECOMMENDED = 4;
  public static final int LIBRARY_UPDATE_IS_REQUIRED = 3;
  public static final int VENDOR_NOT_SUPPORTED = 0;
  private int mErrorType = 0;

  public SsdkUnsupportedException(String paramString, int paramInt)
  {
    super(paramString);
    this.mErrorType = paramInt;
  }

  public int getType()
  {
    return this.mErrorType;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.SsdkUnsupportedException
 * JD-Core Version:    0.6.2
 */