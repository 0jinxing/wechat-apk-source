package com.google.android.gms.iid;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzh
  implements Runnable
{
  zzh(zzg paramzzg, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57566);
    String str = this.zzbb.getAction();
    new StringBuilder(String.valueOf(str).length() + 61).append("Service took too long to process intent: ").append(str).append(" App may get closed.");
    this.zzbh.finish();
    AppMethodBeat.o(57566);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzh
 * JD-Core Version:    0.6.2
 */