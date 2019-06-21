package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener;
import com.google.android.gms.wearable.CapabilityInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzae
  implements CapabilityClient.OnCapabilityChangedListener
{
  private final String zzbc;
  private final CapabilityClient.OnCapabilityChangedListener zzby;

  zzae(CapabilityClient.OnCapabilityChangedListener paramOnCapabilityChangedListener, String paramString)
  {
    this.zzby = paramOnCapabilityChangedListener;
    this.zzbc = paramString;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(70985);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(70985);
    }
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(70985);
      }
      else
      {
        paramObject = (zzae)paramObject;
        if (!this.zzby.equals(paramObject.zzby))
        {
          AppMethodBeat.o(70985);
        }
        else
        {
          bool = this.zzbc.equals(paramObject.zzbc);
          AppMethodBeat.o(70985);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(70986);
    int i = this.zzby.hashCode();
    int j = this.zzbc.hashCode();
    AppMethodBeat.o(70986);
    return i * 31 + j;
  }

  public final void onCapabilityChanged(CapabilityInfo paramCapabilityInfo)
  {
    AppMethodBeat.i(70984);
    this.zzby.onCapabilityChanged(paramCapabilityInfo);
    AppMethodBeat.o(70984);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzae
 * JD-Core Version:    0.6.2
 */