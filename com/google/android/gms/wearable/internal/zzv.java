package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.CapabilityInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzv
  implements CapabilityApi.CapabilityListener
{
  private final String zzbc;
  private final CapabilityApi.CapabilityListener zzbs;

  zzv(CapabilityApi.CapabilityListener paramCapabilityListener, String paramString)
  {
    this.zzbs = paramCapabilityListener;
    this.zzbc = paramString;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(71474);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(71474);
    }
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(71474);
      }
      else
      {
        paramObject = (zzv)paramObject;
        if (!this.zzbs.equals(paramObject.zzbs))
        {
          AppMethodBeat.o(71474);
        }
        else
        {
          bool = this.zzbc.equals(paramObject.zzbc);
          AppMethodBeat.o(71474);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(71475);
    int i = this.zzbs.hashCode();
    int j = this.zzbc.hashCode();
    AppMethodBeat.o(71475);
    return i * 31 + j;
  }

  public final void onCapabilityChanged(CapabilityInfo paramCapabilityInfo)
  {
    AppMethodBeat.i(71473);
    this.zzbs.onCapabilityChanged(paramCapabilityInfo);
    AppMethodBeat.o(71473);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzv
 * JD-Core Version:    0.6.2
 */