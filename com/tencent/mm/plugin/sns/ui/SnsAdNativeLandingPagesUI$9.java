package com.tencent.mm.plugin.sns.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsAdNativeLandingPagesUI$9 extends BroadcastReceiver
{
  SnsAdNativeLandingPagesUI$9(SnsAdNativeLandingPagesUI paramSnsAdNativeLandingPagesUI)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(38635);
    if (paramIntent.getAction().equals("android.intent.action.SCREEN_OFF"))
    {
      ab.d("MicroMsg.SnsAdNativeLandingPagesUI", "android.intent.action.SCREEN_OFF");
      AppMethodBeat.o(38635);
    }
    while (true)
    {
      return;
      if (paramIntent.getAction().equals("android.intent.action.SCREEN_ON"))
      {
        ab.d("MicroMsg.SnsAdNativeLandingPagesUI", "android.intent.action.SCREEN_ON");
        ad.ac(this.roM);
      }
      AppMethodBeat.o(38635);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.9
 * JD-Core Version:    0.6.2
 */