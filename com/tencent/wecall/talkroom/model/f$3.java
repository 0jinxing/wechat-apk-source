package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.c.c;
import com.tencent.wecall.talkroom.a.m;
import java.util.TimerTask;

final class f$3 extends TimerTask
{
  f$3(f paramf, m paramm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127872);
    if (this.AKf == null)
    {
      c.w("TalkRoomService", new Object[] { "doHelloTimeOutTask scene is null" });
      AppMethodBeat.o(127872);
    }
    while (true)
    {
      return;
      if (!f.a(this.AKd, this.AKf.neq, this.AKf.nCF, this.AKf.sZg, false))
      {
        c.w("TalkRoomService", new Object[] { "doHelloTimeOutTask isCurrentRoom is false scene.mGroupId: ", this.AKf.neq, " scene.mRoomId: ", Integer.valueOf(this.AKf.nCF), " scene.mRoomKey: ", Long.valueOf(this.AKf.sZg) });
        AppMethodBeat.o(127872);
      }
      else
      {
        c.w("TalkRoomService", new Object[] { "doHelloTimeOutTask mGroupId: ", f.b(this.AKd), " mRoomId: ", Integer.valueOf(f.g(this.AKd)), " mRoomKey: ", Long.valueOf(f.h(this.AKd)) });
        this.AKd.AJC.Su(330);
        h.Sq(-1606);
        this.AKd.a(this.AKf.neq, this.AKf.nCF, this.AKf.sZg, 117, true);
        f.f(this.AKd).k(-600, null);
        AppMethodBeat.o(127872);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.f.3
 * JD-Core Version:    0.6.2
 */