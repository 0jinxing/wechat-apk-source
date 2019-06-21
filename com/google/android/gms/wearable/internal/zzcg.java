package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataItem;

public final class zzcg
  implements DataApi.DataItemResult
{
  private final DataItem zzdg;
  private final Status zzp;

  public zzcg(Status paramStatus, DataItem paramDataItem)
  {
    this.zzp = paramStatus;
    this.zzdg = paramDataItem;
  }

  public final DataItem getDataItem()
  {
    return this.zzdg;
  }

  public final Status getStatus()
  {
    return this.zzp;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzcg
 * JD-Core Version:    0.6.2
 */