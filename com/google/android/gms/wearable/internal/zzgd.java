package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzgd
{
  public static Status zzb(int paramInt)
  {
    AppMethodBeat.i(71361);
    Status localStatus = new Status(paramInt, WearableStatusCodes.getStatusCodeString(paramInt));
    AppMethodBeat.o(71361);
    return localStatus;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgd
 * JD-Core Version:    0.6.2
 */