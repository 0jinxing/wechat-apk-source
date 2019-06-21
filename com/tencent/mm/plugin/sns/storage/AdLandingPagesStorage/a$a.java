package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.ConcurrentHashMap;

final class a$a extends BroadcastReceiver
{
  private a$a(a parama)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(36928);
    if (paramIntent != null)
    {
      paramContext = paramIntent.getAction();
      if ("android.intent.action.PACKAGE_ADDED".equals(paramContext))
      {
        paramContext = paramIntent.getData().getSchemeSpecificPart();
        if ((!bo.isNullOrNil(paramContext)) && (this.qVG.qVC.containsKey(paramContext)))
          ((a.c)this.qVG.qVC.remove(paramContext)).Xz(paramContext);
        AppMethodBeat.o(36928);
      }
    }
    while (true)
    {
      return;
      if ("android.intent.action.PACKAGE_REMOVED".equals(paramContext))
      {
        paramContext = paramIntent.getData().getSchemeSpecificPart();
        if ((!bo.isNullOrNil(paramContext)) && (this.qVG.qVC.containsKey(paramContext)))
          ((a.c)this.qVG.qVC.remove(paramContext)).XA(paramContext);
      }
      AppMethodBeat.o(36928);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.a
 * JD-Core Version:    0.6.2
 */