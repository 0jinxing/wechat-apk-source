package com.tencent.mm.plugin.voip.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class VideoActivity$ScreenActionReceiver extends BroadcastReceiver
{
  public VideoActivity$ScreenActionReceiver(VideoActivity paramVideoActivity)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(4802);
    paramContext = paramIntent.getAction();
    if ((paramContext != null) && (paramContext.equals("android.intent.action.SCREEN_OFF")))
    {
      ab.i("MicroMsg.Voip.VideoActivity", "receive action screen off");
      this.sWl.cKW();
    }
    AppMethodBeat.o(4802);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VideoActivity.ScreenActionReceiver
 * JD-Core Version:    0.6.2
 */