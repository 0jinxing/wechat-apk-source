package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzl
  implements Runnable
{
  zzl(WearableListenerService.zzd paramzzd, DataHolder paramDataHolder)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71482);
    DataEventBuffer localDataEventBuffer = new DataEventBuffer(this.zzan);
    try
    {
      this.zzao.zzak.onDataChanged(localDataEventBuffer);
      return;
    }
    finally
    {
      localDataEventBuffer.release();
      AppMethodBeat.o(71482);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.zzl
 * JD-Core Version:    0.6.2
 */