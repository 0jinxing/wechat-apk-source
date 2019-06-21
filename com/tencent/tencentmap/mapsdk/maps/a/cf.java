package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class cf extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(98633);
    bt.j().post(new cg(this));
    AppMethodBeat.o(98633);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cf
 * JD-Core Version:    0.6.2
 */