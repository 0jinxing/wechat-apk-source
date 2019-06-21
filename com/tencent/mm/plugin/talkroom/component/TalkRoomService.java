package com.tencent.mm.plugin.talkroom.component;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class TalkRoomService extends Service
{
  private g sxG;

  static
  {
    AppMethodBeat.i(25748);
    ab.i("MicroMsg.TalkRoomService", Thread.currentThread().getId());
    AppMethodBeat.o(25748);
  }

  public IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(25746);
    ab.d("MicroMsg.TalkRoomService", "onBind~~~ threadID:" + Thread.currentThread());
    paramIntent = this.sxG;
    AppMethodBeat.o(25746);
    return paramIntent;
  }

  public void onCreate()
  {
    AppMethodBeat.i(25743);
    ab.d("MicroMsg.TalkRoomService", "onCreate~~~threadID:" + Thread.currentThread());
    super.onCreate();
    if (Build.VERSION.SDK_INT < 18)
      startForeground(9999, new Notification());
    if (this.sxG == null)
      this.sxG = new g();
    AppMethodBeat.o(25743);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(25744);
    ab.d("MicroMsg.TalkRoomService", "onDestroy~~~ threadID:" + Thread.currentThread());
    super.onDestroy();
    AppMethodBeat.o(25744);
  }

  public void onRebind(Intent paramIntent)
  {
    AppMethodBeat.i(25747);
    ab.d("MicroMsg.TalkRoomService", "onRebind~~~ threadID:" + Thread.currentThread());
    super.onRebind(paramIntent);
    AppMethodBeat.o(25747);
  }

  public boolean onUnbind(Intent paramIntent)
  {
    AppMethodBeat.i(25745);
    ab.d("MicroMsg.TalkRoomService", "onUnbind~~~ threadID:" + Thread.currentThread());
    boolean bool = super.onUnbind(paramIntent);
    AppMethodBeat.o(25745);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.TalkRoomService
 * JD-Core Version:    0.6.2
 */