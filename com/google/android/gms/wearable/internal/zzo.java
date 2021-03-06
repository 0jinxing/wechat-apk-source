package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult;
import com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult;
import com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzo
  implements CapabilityApi
{
  private static PendingResult<Status> zza(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener, IntentFilter[] paramArrayOfIntentFilter)
  {
    AppMethodBeat.i(71461);
    paramGoogleApiClient = zzb.zza(paramGoogleApiClient, new zzt(paramArrayOfIntentFilter), paramCapabilityListener);
    AppMethodBeat.o(71461);
    return paramGoogleApiClient;
  }

  public final PendingResult<Status> addCapabilityListener(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener, String paramString)
  {
    AppMethodBeat.i(71459);
    Asserts.checkNotNull(paramString, "capability must not be null");
    zzv localzzv = new zzv(paramCapabilityListener, paramString);
    IntentFilter localIntentFilter = zzgj.zzc("com.google.android.gms.wearable.CAPABILITY_CHANGED");
    if (!paramString.startsWith("/"))
    {
      paramCapabilityListener = String.valueOf(paramString);
      if (paramCapabilityListener.length() != 0)
        paramCapabilityListener = "/".concat(paramCapabilityListener);
    }
    while (true)
    {
      localIntentFilter.addDataPath(paramCapabilityListener, 0);
      paramGoogleApiClient = zza(paramGoogleApiClient, localzzv, new IntentFilter[] { localIntentFilter });
      AppMethodBeat.o(71459);
      return paramGoogleApiClient;
      paramCapabilityListener = new String("/");
      continue;
      paramCapabilityListener = paramString;
    }
  }

  public final PendingResult<Status> addListener(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener, Uri paramUri, int paramInt)
  {
    AppMethodBeat.i(71460);
    Asserts.checkNotNull(paramUri, "uri must not be null");
    if ((paramInt == 0) || (paramInt == 1));
    for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkArgument(bool, "invalid filter type");
      paramGoogleApiClient = zza(paramGoogleApiClient, paramCapabilityListener, new IntentFilter[] { zzgj.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED", paramUri, paramInt) });
      AppMethodBeat.o(71460);
      return paramGoogleApiClient;
    }
  }

  public final PendingResult<CapabilityApi.AddLocalCapabilityResult> addLocalCapability(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    AppMethodBeat.i(71457);
    paramGoogleApiClient = paramGoogleApiClient.enqueue(new zzr(this, paramGoogleApiClient, paramString));
    AppMethodBeat.o(71457);
    return paramGoogleApiClient;
  }

  public final PendingResult<CapabilityApi.GetAllCapabilitiesResult> getAllCapabilities(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(71456);
    boolean bool2 = bool1;
    if (paramInt != 0)
      if (paramInt != 1)
        break label49;
    label49: for (bool2 = bool1; ; bool2 = false)
    {
      Preconditions.checkArgument(bool2);
      paramGoogleApiClient = paramGoogleApiClient.enqueue(new zzq(this, paramGoogleApiClient, paramInt));
      AppMethodBeat.o(71456);
      return paramGoogleApiClient;
    }
  }

  public final PendingResult<CapabilityApi.GetCapabilityResult> getCapability(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(71455);
    boolean bool2 = bool1;
    if (paramInt != 0)
      if (paramInt != 1)
        break label53;
    label53: for (bool2 = bool1; ; bool2 = false)
    {
      Preconditions.checkArgument(bool2);
      paramGoogleApiClient = paramGoogleApiClient.enqueue(new zzp(this, paramGoogleApiClient, paramString, paramInt));
      AppMethodBeat.o(71455);
      return paramGoogleApiClient;
    }
  }

  public final PendingResult<Status> removeCapabilityListener(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener, String paramString)
  {
    AppMethodBeat.i(71462);
    paramGoogleApiClient = paramGoogleApiClient.enqueue(new zzz(paramGoogleApiClient, new zzv(paramCapabilityListener, paramString), null));
    AppMethodBeat.o(71462);
    return paramGoogleApiClient;
  }

  public final PendingResult<Status> removeListener(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener)
  {
    AppMethodBeat.i(71463);
    paramGoogleApiClient = paramGoogleApiClient.enqueue(new zzz(paramGoogleApiClient, paramCapabilityListener, null));
    AppMethodBeat.o(71463);
    return paramGoogleApiClient;
  }

  public final PendingResult<CapabilityApi.RemoveLocalCapabilityResult> removeLocalCapability(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    AppMethodBeat.i(71458);
    paramGoogleApiClient = paramGoogleApiClient.enqueue(new zzs(this, paramGoogleApiClient, paramString));
    AppMethodBeat.o(71458);
    return paramGoogleApiClient;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzo
 * JD-Core Version:    0.6.2
 */