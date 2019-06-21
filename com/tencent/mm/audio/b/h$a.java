package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class h$a
  implements Runnable
{
  ak handler;

  public h$a(h paramh)
  {
    AppMethodBeat.i(116500);
    this.handler = new h.a.1(this, paramh);
    AppMethodBeat.o(116500);
  }

  public final void run()
  {
    boolean bool = true;
    AppMethodBeat.i(116501);
    al.af(h.d(this.cqN));
    ab.i("MicroMsg.SceneVoice.Recorder", "RecordStartRunnable begin run %s", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
    synchronized (this.cqN)
    {
      ab.i("MicroMsg.SceneVoice.Recorder", "lock[%s] of runnable[%s]!", new Object[] { Long.valueOf(Thread.currentThread().getId()), this.cqN });
      if (h.e(this.cqN) == null)
      {
        ab.e("MicroMsg.SceneVoice.Recorder", "Stop Record Failed recorder == null");
        AppMethodBeat.o(116501);
        return;
      }
      Object localObject1 = h.a(this.cqN);
      if (!h.f(this.cqN));
      while (true)
      {
        localObject1 = q.U((String)localObject1, bool);
        ab.i("MicroMsg.SceneVoice.Recorder", "Thread Started Record, fullPath: %s, useSpeex: %s", new Object[] { localObject1, Boolean.valueOf(h.f(this.cqN)) });
        if (h.e(this.cqN).el((String)localObject1))
          break label314;
        q.uS(h.a(this.cqN));
        h.g(this.cqN);
        h.h(this.cqN);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("Thread Start Record  Error fileName[");
        ab.e("MicroMsg.SceneVoice.Recorder", h.a(this.cqN) + "]");
        h.a(this.cqN, bo.yz());
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("Thread Started Record fileName[");
        ab.i("MicroMsg.SceneVoice.Recorder", h.a(this.cqN) + "] time:" + bo.az(h.j(this.cqN)));
        this.handler.sendEmptyMessageDelayed(0, 1L);
        AppMethodBeat.o(116501);
        break;
        bool = false;
      }
      label314: h.i(this.cqN).requestFocus();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.h.a
 * JD-Core Version:    0.6.2
 */