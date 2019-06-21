package com.tencent.mm.plugin.emoji.sync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

public final class BKGLoaderManager$ConnectivityReceiver extends BroadcastReceiver
{
  public BKGLoaderManager$ConnectivityReceiver(BKGLoaderManager paramBKGLoaderManager)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(53185);
    int i = at.getNetType(paramContext);
    if (this.kXI.mNetWorkType == i)
    {
      AppMethodBeat.o(53185);
      return;
    }
    ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] network change type:%d", new Object[] { Integer.valueOf(i) });
    if (BKGLoaderManager.bjI())
      this.kXI.bkH();
    while (true)
    {
      this.kXI.mNetWorkType = i;
      AppMethodBeat.o(53185);
      break;
      if (BKGLoaderManager.bkJ())
        this.kXI.bkG();
      else if (!at.isConnected(ah.getContext()))
        this.kXI.bkH();
      else
        this.kXI.bkI();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.sync.BKGLoaderManager.ConnectivityReceiver
 * JD-Core Version:    0.6.2
 */