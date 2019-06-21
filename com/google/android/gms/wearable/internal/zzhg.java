package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.PutDataRequest;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;

public final class zzhg extends GmsClient<zzep>
{
  private final ExecutorService zzew;
  private final zzer<Object> zzex;
  private final zzer<Object> zzey;
  private final zzer<ChannelApi.ChannelListener> zzez;
  private final zzer<DataApi.DataListener> zzfa;
  private final zzer<MessageApi.MessageListener> zzfb;
  private final zzer<Object> zzfc;
  private final zzer<Object> zzfd;
  private final zzer<CapabilityApi.CapabilityListener> zzfe;
  private final zzhp zzff;

  public zzhg(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, ClientSettings paramClientSettings)
  {
    this(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramClientSettings, Executors.newCachedThreadPool(), zzhp.zza(paramContext));
    AppMethodBeat.i(71395);
    AppMethodBeat.o(71395);
  }

  @VisibleForTesting
  private zzhg(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, ClientSettings paramClientSettings, ExecutorService paramExecutorService, zzhp paramzzhp)
  {
    super(paramContext, paramLooper, 14, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    AppMethodBeat.i(71396);
    this.zzex = new zzer();
    this.zzey = new zzer();
    this.zzez = new zzer();
    this.zzfa = new zzer();
    this.zzfb = new zzer();
    this.zzfc = new zzer();
    this.zzfd = new zzer();
    this.zzfe = new zzer();
    this.zzew = ((ExecutorService)Preconditions.checkNotNull(paramExecutorService));
    this.zzff = paramzzhp;
    AppMethodBeat.o(71396);
  }

  public final void connect(BaseGmsClient.ConnectionProgressReportCallbacks paramConnectionProgressReportCallbacks)
  {
    int i = 0;
    AppMethodBeat.i(71400);
    if (!requiresGooglePlayServices());
    while (true)
    {
      try
      {
        Object localObject = getContext().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
        if (localObject != null)
          i = ((Bundle)localObject).getInt("com.google.android.wearable.api.version", 0);
        if (i < GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)
        {
          int j = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>(86);
          ((StringBuilder)localObject).append("The Wear OS app is out of date. Requires API version ").append(j).append(" but found ").append(i);
          Context localContext1 = getContext();
          Context localContext2 = getContext();
          localObject = new android/content/Intent;
          ((Intent)localObject).<init>("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR");
          localObject = ((Intent)localObject).setPackage("com.google.android.wearable.app.cn");
          if (localContext2.getPackageManager().resolveActivity((Intent)localObject, 65536) != null)
          {
            triggerNotAvailable(paramConnectionProgressReportCallbacks, 6, PendingIntent.getActivity(localContext1, 0, (Intent)localObject, 0));
            AppMethodBeat.o(71400);
            return;
          }
          localObject = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
          continue;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        triggerNotAvailable(paramConnectionProgressReportCallbacks, 16, null);
        AppMethodBeat.o(71400);
        continue;
      }
      super.connect(paramConnectionProgressReportCallbacks);
      AppMethodBeat.o(71400);
    }
  }

  public final int getMinApkVersion()
  {
    return 12451000;
  }

  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.wearable.internal.IWearableService";
  }

  public final String getStartServiceAction()
  {
    return "com.google.android.gms.wearable.BIND";
  }

  public final String getStartServicePackage()
  {
    AppMethodBeat.i(71397);
    String str;
    if (this.zzff.zze("com.google.android.wearable.app.cn"))
    {
      str = "com.google.android.wearable.app.cn";
      AppMethodBeat.o(71397);
    }
    while (true)
    {
      return str;
      str = "com.google.android.gms";
      AppMethodBeat.o(71397);
    }
  }

  public final void onPostInitHandler(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    AppMethodBeat.i(71399);
    if (Log.isLoggable("WearableClient", 2))
      new StringBuilder(41).append("onPostInitHandler: statusCode ").append(paramInt1);
    if (paramInt1 == 0)
    {
      this.zzex.zza(paramIBinder);
      this.zzey.zza(paramIBinder);
      this.zzez.zza(paramIBinder);
      this.zzfa.zza(paramIBinder);
      this.zzfb.zza(paramIBinder);
      this.zzfc.zza(paramIBinder);
      this.zzfd.zza(paramIBinder);
      this.zzfe.zza(paramIBinder);
    }
    super.onPostInitHandler(paramInt1, paramIBinder, paramBundle, paramInt2);
    AppMethodBeat.o(71399);
  }

  public final boolean requiresGooglePlayServices()
  {
    AppMethodBeat.i(71398);
    boolean bool;
    if (!this.zzff.zze("com.google.android.wearable.app.cn"))
    {
      bool = true;
      AppMethodBeat.o(71398);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(71398);
    }
  }

  public final void zza(BaseImplementation.ResultHolder<DataApi.GetFdForAssetResult> paramResultHolder, Asset paramAsset)
  {
    AppMethodBeat.i(71402);
    ((zzep)getService()).zza(new zzgx(paramResultHolder), paramAsset);
    AppMethodBeat.o(71402);
  }

  public final void zza(BaseImplementation.ResultHolder<Status> paramResultHolder, CapabilityApi.CapabilityListener paramCapabilityListener)
  {
    AppMethodBeat.i(71411);
    this.zzfe.zza(this, paramResultHolder, paramCapabilityListener);
    AppMethodBeat.o(71411);
  }

  public final void zza(BaseImplementation.ResultHolder<Status> paramResultHolder, CapabilityApi.CapabilityListener paramCapabilityListener, ListenerHolder<CapabilityApi.CapabilityListener> paramListenerHolder, IntentFilter[] paramArrayOfIntentFilter)
  {
    AppMethodBeat.i(71407);
    this.zzfe.zza(this, paramResultHolder, paramCapabilityListener, zzhk.zzd(paramListenerHolder, paramArrayOfIntentFilter));
    AppMethodBeat.o(71407);
  }

  public final void zza(BaseImplementation.ResultHolder<Status> paramResultHolder, ChannelApi.ChannelListener paramChannelListener, ListenerHolder<ChannelApi.ChannelListener> paramListenerHolder, @Nullable String paramString, IntentFilter[] paramArrayOfIntentFilter)
  {
    AppMethodBeat.i(71408);
    if (paramString == null)
    {
      this.zzez.zza(this, paramResultHolder, paramChannelListener, zzhk.zzc(paramListenerHolder, paramArrayOfIntentFilter));
      AppMethodBeat.o(71408);
    }
    while (true)
    {
      return;
      paramChannelListener = new zzgc(paramString, paramChannelListener);
      this.zzez.zza(this, paramResultHolder, paramChannelListener, zzhk.zza(paramListenerHolder, paramString, paramArrayOfIntentFilter));
      AppMethodBeat.o(71408);
    }
  }

  public final void zza(BaseImplementation.ResultHolder<Status> paramResultHolder, ChannelApi.ChannelListener paramChannelListener, String paramString)
  {
    AppMethodBeat.i(71412);
    if (paramString == null)
    {
      this.zzez.zza(this, paramResultHolder, paramChannelListener);
      AppMethodBeat.o(71412);
    }
    while (true)
    {
      return;
      paramChannelListener = new zzgc(paramString, paramChannelListener);
      this.zzez.zza(this, paramResultHolder, paramChannelListener);
      AppMethodBeat.o(71412);
    }
  }

  public final void zza(BaseImplementation.ResultHolder<Status> paramResultHolder, DataApi.DataListener paramDataListener)
  {
    AppMethodBeat.i(71409);
    this.zzfa.zza(this, paramResultHolder, paramDataListener);
    AppMethodBeat.o(71409);
  }

  public final void zza(BaseImplementation.ResultHolder<Status> paramResultHolder, DataApi.DataListener paramDataListener, ListenerHolder<DataApi.DataListener> paramListenerHolder, IntentFilter[] paramArrayOfIntentFilter)
  {
    AppMethodBeat.i(71405);
    this.zzfa.zza(this, paramResultHolder, paramDataListener, zzhk.zza(paramListenerHolder, paramArrayOfIntentFilter));
    AppMethodBeat.o(71405);
  }

  public final void zza(BaseImplementation.ResultHolder<Status> paramResultHolder, MessageApi.MessageListener paramMessageListener)
  {
    AppMethodBeat.i(71410);
    this.zzfb.zza(this, paramResultHolder, paramMessageListener);
    AppMethodBeat.o(71410);
  }

  public final void zza(BaseImplementation.ResultHolder<Status> paramResultHolder, MessageApi.MessageListener paramMessageListener, ListenerHolder<MessageApi.MessageListener> paramListenerHolder, IntentFilter[] paramArrayOfIntentFilter)
  {
    AppMethodBeat.i(71406);
    this.zzfb.zza(this, paramResultHolder, paramMessageListener, zzhk.zzb(paramListenerHolder, paramArrayOfIntentFilter));
    AppMethodBeat.o(71406);
  }

  public final void zza(BaseImplementation.ResultHolder<DataApi.DataItemResult> paramResultHolder, PutDataRequest paramPutDataRequest)
  {
    AppMethodBeat.i(71401);
    Object localObject1 = paramPutDataRequest.getAssets().entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Asset)((Map.Entry)((Iterator)localObject1).next()).getValue();
      if ((((Asset)localObject2).getData() == null) && (((Asset)localObject2).getDigest() == null) && (((Asset)localObject2).getFd() == null) && (((Asset)localObject2).getUri() == null))
      {
        paramResultHolder = String.valueOf(paramPutDataRequest.getUri());
        paramPutDataRequest = String.valueOf(localObject2);
        paramResultHolder = new IllegalArgumentException(String.valueOf(paramResultHolder).length() + 33 + String.valueOf(paramPutDataRequest).length() + "Put for " + paramResultHolder + " contains invalid asset: " + paramPutDataRequest);
        AppMethodBeat.o(71401);
        throw paramResultHolder;
      }
    }
    PutDataRequest localPutDataRequest = PutDataRequest.zza(paramPutDataRequest.getUri());
    localPutDataRequest.setData(paramPutDataRequest.getData());
    if (paramPutDataRequest.isUrgent())
      localPutDataRequest.setUrgent();
    Object localObject2 = new ArrayList();
    Iterator localIterator = paramPutDataRequest.getAssets().entrySet().iterator();
    Map.Entry localEntry;
    while (true)
      if (localIterator.hasNext())
      {
        localEntry = (Map.Entry)localIterator.next();
        localObject1 = (Asset)localEntry.getValue();
        Object localObject3;
        if (((Asset)localObject1).getData() != null)
          try
          {
            ParcelFileDescriptor[] arrayOfParcelFileDescriptor = ParcelFileDescriptor.createPipe();
            if (Log.isLoggable("WearableClient", 3))
            {
              String str1 = String.valueOf(localObject1);
              localObject3 = String.valueOf(arrayOfParcelFileDescriptor[0]);
              String str2 = String.valueOf(arrayOfParcelFileDescriptor[1]);
              new StringBuilder(String.valueOf(str1).length() + 61 + String.valueOf(localObject3).length() + String.valueOf(str2).length()).append("processAssets: replacing data with FD in asset: ").append(str1).append(" read:").append((String)localObject3).append(" write:").append(str2);
            }
            localPutDataRequest.putAsset((String)localEntry.getKey(), Asset.createFromFd(arrayOfParcelFileDescriptor[0]));
            localObject1 = new FutureTask(new zzhh(this, arrayOfParcelFileDescriptor[1], ((Asset)localObject1).getData()));
            ((List)localObject2).add(localObject1);
            this.zzew.submit((Runnable)localObject1);
          }
          catch (IOException paramResultHolder)
          {
            paramPutDataRequest = String.valueOf(paramPutDataRequest);
            paramResultHolder = new IllegalStateException(String.valueOf(paramPutDataRequest).length() + 60 + "Unable to create ParcelFileDescriptor for asset in request: " + paramPutDataRequest, paramResultHolder);
            AppMethodBeat.o(71401);
            throw paramResultHolder;
          }
        if (((Asset)localObject1).getUri() != null)
          try
          {
            localObject3 = Asset.createFromFd(getContext().getContentResolver().openFileDescriptor(((Asset)localObject1).getUri(), "r"));
            localPutDataRequest.putAsset((String)localEntry.getKey(), (Asset)localObject3);
          }
          catch (FileNotFoundException paramPutDataRequest)
          {
            new zzhb(paramResultHolder, (List)localObject2).zza(new zzfu(4005, null));
            paramResultHolder = String.valueOf(((Asset)localObject1).getUri());
            new StringBuilder(String.valueOf(paramResultHolder).length() + 28).append("Couldn't resolve asset URI: ").append(paramResultHolder);
            AppMethodBeat.o(71401);
          }
      }
    while (true)
    {
      return;
      localPutDataRequest.putAsset((String)localEntry.getKey(), (Asset)localObject1);
      break;
      ((zzep)getService()).zza(new zzhb(paramResultHolder, (List)localObject2), localPutDataRequest);
      AppMethodBeat.o(71401);
    }
  }

  public final void zza(BaseImplementation.ResultHolder<Status> paramResultHolder, String paramString, Uri paramUri, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(71404);
    try
    {
      ExecutorService localExecutorService = this.zzew;
      Preconditions.checkNotNull(paramResultHolder);
      Preconditions.checkNotNull(paramString);
      Preconditions.checkNotNull(paramUri);
      if (paramLong1 >= 0L)
      {
        bool = true;
        Preconditions.checkArgument(bool, "startOffset is negative: %s", new Object[] { Long.valueOf(paramLong1) });
        if (paramLong2 < -1L)
          break label129;
      }
      label129: for (boolean bool = true; ; bool = false)
      {
        Preconditions.checkArgument(bool, "invalid length: %s", new Object[] { Long.valueOf(paramLong2) });
        zzhj localzzhj = new com/google/android/gms/wearable/internal/zzhj;
        localzzhj.<init>(this, paramUri, paramResultHolder, paramString, paramLong1, paramLong2);
        localExecutorService.execute(localzzhj);
        AppMethodBeat.o(71404);
        return;
        bool = false;
        break;
      }
    }
    catch (RuntimeException paramString)
    {
      paramResultHolder.setFailedResult(new Status(8));
      AppMethodBeat.o(71404);
    }
    throw paramString;
  }

  public final void zza(BaseImplementation.ResultHolder<Status> paramResultHolder, String paramString, Uri paramUri, boolean paramBoolean)
  {
    AppMethodBeat.i(71403);
    try
    {
      ExecutorService localExecutorService = this.zzew;
      Preconditions.checkNotNull(paramResultHolder);
      Preconditions.checkNotNull(paramString);
      Preconditions.checkNotNull(paramUri);
      zzhi localzzhi = new com/google/android/gms/wearable/internal/zzhi;
      localzzhi.<init>(this, paramUri, paramResultHolder, paramBoolean, paramString);
      localExecutorService.execute(localzzhi);
      AppMethodBeat.o(71403);
      return;
    }
    catch (RuntimeException paramString)
    {
      paramResultHolder.setFailedResult(new Status(8));
      AppMethodBeat.o(71403);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzhg
 * JD-Core Version:    0.6.2
 */