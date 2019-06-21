package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.c.c;

final class f$8
  implements Runnable
{
  f$8(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127877);
    if ((this.AKd.cIJ()) && (f.s(this.AKd)))
    {
      c.d("TalkRoomService", new Object[] { "syscall", "finishtalk becos holdtimeout" });
      h.Sr(-2003);
      this.AKd.AJC.Su(401);
      this.AKd.az(f.b(this.AKd), 3, 108);
    }
    AppMethodBeat.o(127877);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.f.8
 * JD-Core Version:    0.6.2
 */