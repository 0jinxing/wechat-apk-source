package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.ListenerHolder.Notifier;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzhl
  implements ListenerHolder.Notifier<DataApi.DataListener>
{
  zzhl(DataHolder paramDataHolder)
  {
  }

  public final void onNotifyListenerFailed()
  {
    AppMethodBeat.i(71430);
    this.zzan.close();
    AppMethodBeat.o(71430);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzhl
 * JD-Core Version:    0.6.2
 */