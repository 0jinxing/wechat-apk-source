package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;

@VisibleForTesting
public class DataItemBuffer extends EntityBuffer<DataItem>
  implements Result
{
  private final Status zzp;

  public DataItemBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    AppMethodBeat.i(70801);
    this.zzp = new Status(paramDataHolder.getStatusCode());
    AppMethodBeat.o(70801);
  }

  public String getPrimaryDataMarkerColumn()
  {
    return "path";
  }

  public Status getStatus()
  {
    return this.zzp;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataItemBuffer
 * JD-Core Version:    0.6.2
 */