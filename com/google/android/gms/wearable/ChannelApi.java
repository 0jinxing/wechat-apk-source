package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.Nullable;

@Deprecated
public abstract interface ChannelApi
{
  public static final String ACTION_CHANNEL_EVENT = "com.google.android.gms.wearable.CHANNEL_EVENT";

  public abstract PendingResult<Status> addListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener);

  public abstract PendingResult<OpenChannelResult> openChannel(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2);

  public abstract PendingResult<Status> removeListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener);

  @Retention(RetentionPolicy.SOURCE)
  public static @interface CloseReason
  {
  }

  @Deprecated
  public static abstract interface OpenChannelResult extends Result
  {
    @Nullable
    public abstract Channel getChannel();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.ChannelApi
 * JD-Core Version:    0.6.2
 */