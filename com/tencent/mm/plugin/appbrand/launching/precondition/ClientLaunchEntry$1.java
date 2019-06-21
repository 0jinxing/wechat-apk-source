package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

class ClientLaunchEntry$1 extends ResultReceiver
{
  ClientLaunchEntry$1(b paramb, Handler paramHandler, Context paramContext)
  {
    super(paramHandler);
  }

  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(132055);
    boolean bool1 = i.pb(i.ijV);
    boolean bool2;
    if (paramInt == -1)
    {
      bool2 = true;
      if ((!(this.val$context instanceof AppBrandUI)) || (!((AppBrandUI)this.val$context).iIX))
        break label131;
    }
    label131: for (boolean bool3 = true; ; bool3 = false)
    {
      ab.i("MicroMsg.AppBrand.Precondition.ClientLaunchEntry", "[appswitch] onReceiveResult, %s, proxyLaunchBack %b, pendingNewIntents %b, handlingNewIntent %b", new Object[] { this.val$context.getClass().getSimpleName(), Boolean.valueOf(bool2), Boolean.valueOf(bool1), Boolean.valueOf(bool3) });
      if ((bool2) && (!bool1) && (!bool3))
        ((MMActivity)this.val$context).moveTaskToBack(true);
      AppMethodBeat.o(132055);
      return;
      bool2 = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.ClientLaunchEntry.1
 * JD-Core Version:    0.6.2
 */