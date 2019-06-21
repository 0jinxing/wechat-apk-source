package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1 extends BroadcastReceiver
{
  a$1(a parama)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(36937);
    if (("com.tencent.mm.adlanding.close_exposure_voice".equals(paramIntent.getAction())) && (!this.qVL.cpv().qWO.equals(paramIntent.getStringExtra("para_id"))))
    {
      paramContext = this.qVL;
      if (paramContext.qVK)
        paramContext.coY();
    }
    AppMethodBeat.o(36937);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.1
 * JD-Core Version:    0.6.2
 */