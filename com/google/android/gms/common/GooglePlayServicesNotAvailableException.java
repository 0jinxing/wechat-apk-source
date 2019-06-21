package com.google.android.gms.common;

public final class GooglePlayServicesNotAvailableException extends Exception
{
  public final int errorCode;

  public GooglePlayServicesNotAvailableException(int paramInt)
  {
    this.errorCode = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GooglePlayServicesNotAvailableException
 * JD-Core Version:    0.6.2
 */