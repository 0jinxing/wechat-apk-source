package com.tencent.mm.plugin.base.stub;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ak;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class WXEntryActivity$EntryReceiver extends BroadcastReceiver
{
  private static ak handler;
  private String Iw;
  private String appId;
  private String appName;
  private Context context;
  private int jDs;
  private long jEe;

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(18196);
    if ((paramContext == null) || (paramIntent == null))
      AppMethodBeat.o(18196);
    while (true)
    {
      return;
      com.tencent.mm.bp.d.dlL();
      if (handler == null)
      {
        HandlerThread localHandlerThread = com.tencent.mm.sdk.g.d.anM("WXEntryReceiver");
        localHandlerThread.start();
        handler = new ak(localHandlerThread.getLooper());
      }
      if (!g.RQ().eKi.eKC)
      {
        g.RQ().a(new WXEntryActivity.EntryReceiver.1(this, paramContext, paramIntent));
        AppMethodBeat.o(18196);
      }
      else
      {
        handler.post(new WXEntryActivity.EntryReceiver.2(this, paramContext, paramIntent));
        AppMethodBeat.o(18196);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver
 * JD-Core Version:    0.6.2
 */