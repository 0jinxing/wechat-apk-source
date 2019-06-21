package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzh<O extends Api.ApiOptions>
{
  private final Api<O> mApi;
  private final O zzcl;
  private final boolean zzeb;
  private final int zzec;

  private zzh(Api<O> paramApi)
  {
    AppMethodBeat.i(60918);
    this.zzeb = true;
    this.mApi = paramApi;
    this.zzcl = null;
    this.zzec = System.identityHashCode(this);
    AppMethodBeat.o(60918);
  }

  private zzh(Api<O> paramApi, O paramO)
  {
    AppMethodBeat.i(60917);
    this.zzeb = false;
    this.mApi = paramApi;
    this.zzcl = paramO;
    this.zzec = Objects.hashCode(new Object[] { this.mApi, this.zzcl });
    AppMethodBeat.o(60917);
  }

  public static <O extends Api.ApiOptions> zzh<O> zza(Api<O> paramApi)
  {
    AppMethodBeat.i(60920);
    paramApi = new zzh(paramApi);
    AppMethodBeat.o(60920);
    return paramApi;
  }

  public static <O extends Api.ApiOptions> zzh<O> zza(Api<O> paramApi, O paramO)
  {
    AppMethodBeat.i(60919);
    paramApi = new zzh(paramApi, paramO);
    AppMethodBeat.o(60919);
    return paramApi;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(60922);
    if (paramObject == this)
      AppMethodBeat.o(60922);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzh))
      {
        AppMethodBeat.o(60922);
        bool = false;
      }
      else
      {
        paramObject = (zzh)paramObject;
        if ((!this.zzeb) && (!paramObject.zzeb) && (Objects.equal(this.mApi, paramObject.mApi)) && (Objects.equal(this.zzcl, paramObject.zzcl)))
        {
          AppMethodBeat.o(60922);
        }
        else
        {
          AppMethodBeat.o(60922);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    return this.zzec;
  }

  public final String zzq()
  {
    AppMethodBeat.i(60921);
    String str = this.mApi.getName();
    AppMethodBeat.o(60921);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzh
 * JD-Core Version:    0.6.2
 */