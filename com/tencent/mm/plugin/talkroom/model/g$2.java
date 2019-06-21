package com.tencent.mm.plugin.talkroom.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.talkroom.component.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class g$2 extends b.a
{
  g$2(g paramg)
  {
  }

  public final void keep_OnError(int paramInt)
  {
    AppMethodBeat.i(25806);
    ab.e("MicroMsg.TalkRoomServer", "engineCallback OnError: %d", new Object[] { Integer.valueOf(paramInt) });
    b.cEk().cEp();
    b.cEk().sxX = 1;
    g.a(this.syS).l("component OnError ".concat(String.valueOf(paramInt)), 99, paramInt);
    new ak(Looper.getMainLooper()).post(new g.2.2(this));
    AppMethodBeat.o(25806);
  }

  public final void keep_OnOpenSuccess()
  {
    AppMethodBeat.i(25805);
    ab.i("MicroMsg.TalkRoomServer", "OnOpenSuccess");
    if (g.b(this.syS) != 1)
    {
      ab.w("MicroMsg.TalkRoomServer", "has exit the talkroom state:%d", new Object[] { Integer.valueOf(g.b(this.syS)) });
      AppMethodBeat.o(25805);
    }
    while (true)
    {
      return;
      b.cEk().cEp();
      new ak(Looper.getMainLooper()).post(new g.2.1(this));
      g.d(this.syS);
      g.a(this.syS).akC();
      AppMethodBeat.o(25805);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.g.2
 * JD-Core Version:    0.6.2
 */