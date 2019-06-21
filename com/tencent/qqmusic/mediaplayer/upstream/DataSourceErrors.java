package com.tencent.qqmusic.mediaplayer.upstream;

public abstract interface DataSourceErrors
{
  public static final int API_TOO_LOW = -6;
  public static final int CREATE_DATASOURCE_FAILED_TO_ENSURE_BUFFER_FILE = -8;
  public static final int CREATE_NATIVE_DATASOURCE_GENERAL = -1;
  public static final int CREATE_NATIVE_DATASOURCE_ILLEAGAL_ARUMENTS = -5;
  public static final int CREATE_NATIVE_DATASOURCE_NULL_NATIVE_INSTANCE = -4;
  public static final int CREATE_NATIVE_DATASOURCE_SO_LOAD_FAILED = -3;
  public static final int CREATE_NATIVE_DATASOURCE_UNSATISFIED_LINK = -2;
  public static final int IO = -7;
  public static final int QMERR_EMPTY_MEDIA = -9;
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.DataSourceErrors
 * JD-Core Version:    0.6.2
 */