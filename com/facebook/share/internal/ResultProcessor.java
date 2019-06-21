package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;

public abstract class ResultProcessor
{
  private FacebookCallback appCallback;

  public ResultProcessor(FacebookCallback paramFacebookCallback)
  {
    this.appCallback = paramFacebookCallback;
  }

  public void onCancel(AppCall paramAppCall)
  {
    if (this.appCallback != null)
      this.appCallback.onCancel();
  }

  public void onError(AppCall paramAppCall, FacebookException paramFacebookException)
  {
    if (this.appCallback != null)
      this.appCallback.onError(paramFacebookException);
  }

  public abstract void onSuccess(AppCall paramAppCall, Bundle paramBundle);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.ResultProcessor
 * JD-Core Version:    0.6.2
 */