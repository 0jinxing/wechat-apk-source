package com.tencent.smtt.export.external.interfaces;

public abstract class UrlRequest$Builder
{
  public static final int REQUEST_PRIORITY_HIGHEST = 4;
  public static final int REQUEST_PRIORITY_IDLE = 0;
  public static final int REQUEST_PRIORITY_LOW = 2;
  public static final int REQUEST_PRIORITY_LOWEST = 1;
  public static final int REQUEST_PRIORITY_MEDIUM = 3;

  public abstract Builder addHeader(String paramString1, String paramString2);

  public abstract UrlRequest build();

  public abstract Builder disableCache();

  public abstract Builder setHttpMethod(String paramString);

  public abstract Builder setPriority(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
 * JD-Core Version:    0.6.2
 */