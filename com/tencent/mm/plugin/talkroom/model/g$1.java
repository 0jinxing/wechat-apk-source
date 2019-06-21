package com.tencent.mm.plugin.talkroom.model;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.talkroom.component.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class g$1
  implements ServiceConnection
{
  g$1(g paramg)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(25801);
    ab.i("MicroMsg.TalkRoomServer", "onServiceConnected ");
    if (paramIBinder == null)
    {
      g.a(this.syS).l("enterTalkRoom bindServie or protocalInit failed", 3, -1);
      AppMethodBeat.o(25801);
    }
    while (true)
    {
      return;
      g.a(this.syS, a.a.C(paramIBinder));
      if (g.b(this.syS) >= 2)
        new ak(Looper.getMainLooper()).post(new g.1.1(this));
      AppMethodBeat.o(25801);
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(25802);
    ab.i("MicroMsg.TalkRoomServer", "onServiceDisconnected ");
    AppMethodBeat.o(25802);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.g.1
 * JD-Core Version:    0.6.2
 */