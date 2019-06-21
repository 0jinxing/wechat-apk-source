package com.google.android.gms.wearable;

import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.GoogleApi.Settings.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class Wearable$WearableOptions
  implements Api.ApiOptions.Optional
{
  private final Looper zzac;

  private Wearable$WearableOptions(Builder paramBuilder)
  {
    AppMethodBeat.i(70890);
    this.zzac = Builder.zza(paramBuilder);
    AppMethodBeat.o(70890);
  }

  private final GoogleApi.Settings zza()
  {
    AppMethodBeat.i(70891);
    GoogleApi.Settings localSettings;
    if (this.zzac != null)
    {
      localSettings = new GoogleApi.Settings.Builder().setLooper(this.zzac).build();
      AppMethodBeat.o(70891);
    }
    while (true)
    {
      return localSettings;
      localSettings = GoogleApi.Settings.DEFAULT_SETTINGS;
      AppMethodBeat.o(70891);
    }
  }

  public static class Builder
  {
    private Looper zzac;

    public Wearable.WearableOptions build()
    {
      AppMethodBeat.i(70889);
      Wearable.WearableOptions localWearableOptions = new Wearable.WearableOptions(this, null);
      AppMethodBeat.o(70889);
      return localWearableOptions;
    }

    public Builder setLooper(Looper paramLooper)
    {
      this.zzac = paramLooper;
      return this;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.Wearable.WearableOptions
 * JD-Core Version:    0.6.2
 */