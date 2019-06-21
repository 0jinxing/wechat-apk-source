package com.facebook.internal;

import android.graphics.Bitmap;

public class ImageResponse
{
  private Bitmap bitmap;
  private Exception error;
  private boolean isCachedRedirect;
  private ImageRequest request;

  ImageResponse(ImageRequest paramImageRequest, Exception paramException, boolean paramBoolean, Bitmap paramBitmap)
  {
    this.request = paramImageRequest;
    this.error = paramException;
    this.bitmap = paramBitmap;
    this.isCachedRedirect = paramBoolean;
  }

  public Bitmap getBitmap()
  {
    return this.bitmap;
  }

  public Exception getError()
  {
    return this.error;
  }

  public ImageRequest getRequest()
  {
    return this.request;
  }

  public boolean isCachedRedirect()
  {
    return this.isCachedRedirect;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.internal.ImageResponse
 * JD-Core Version:    0.6.2
 */