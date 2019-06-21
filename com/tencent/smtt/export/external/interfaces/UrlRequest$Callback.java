package com.tencent.smtt.export.external.interfaces;

import java.nio.ByteBuffer;

public abstract class UrlRequest$Callback
{
  public void onCanceled(UrlRequest paramUrlRequest, UrlResponseInfo paramUrlResponseInfo)
  {
  }

  public abstract void onFailed(UrlRequest paramUrlRequest, UrlResponseInfo paramUrlResponseInfo, X5netException paramX5netException);

  public abstract void onReadCompleted(UrlRequest paramUrlRequest, UrlResponseInfo paramUrlResponseInfo, ByteBuffer paramByteBuffer);

  public abstract void onRedirectReceived(UrlRequest paramUrlRequest, UrlResponseInfo paramUrlResponseInfo, String paramString);

  public abstract void onResponseStarted(UrlRequest paramUrlRequest, UrlResponseInfo paramUrlResponseInfo);

  public abstract void onSucceeded(UrlRequest paramUrlRequest, UrlResponseInfo paramUrlResponseInfo);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.UrlRequest.Callback
 * JD-Core Version:    0.6.2
 */