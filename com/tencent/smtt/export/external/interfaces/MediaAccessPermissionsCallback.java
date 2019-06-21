package com.tencent.smtt.export.external.interfaces;

public abstract interface MediaAccessPermissionsCallback
{
  public static final long ALLOW_AUDIO_CAPTURE = 4L;
  public static final long ALLOW_VIDEO_CAPTURE = 2L;
  public static final long BITMASK_RESOURCE_AUDIO_CAPTURE = 4L;
  public static final long BITMASK_RESOURCE_VIDEO_CAPTURE = 2L;

  public abstract void invoke(String paramString, long paramLong, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.MediaAccessPermissionsCallback
 * JD-Core Version:    0.6.2
 */