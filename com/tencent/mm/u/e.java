package com.tencent.mm.u;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.cb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.v.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/engine/FunctionMsgTimer;", "", "callback", "Lcom/tencent/mm/engine/ITimerCallback;", "(Lcom/tencent/mm/engine/ITimerCallback;)V", "mCallback", "mQueue", "Lcom/tencent/mm/engine/FunctionMsgQueue;", "add", "", "op", "", "item", "Lcom/tencent/mm/api/FunctionMsgItem;", "executor", "Lcom/tencent/mm/executor/IOpExecutor;", "check", "handleTask", "task", "Lcom/tencent/mm/engine/FunctionMsgTask;", "Companion", "plugin-functionmsg_release"})
public final class e
{
  public static final e.a eAL;
  final f eAJ;
  final c eAK;

  static
  {
    AppMethodBeat.i(35473);
    eAL = new e.a((byte)0);
    AppMethodBeat.o(35473);
  }

  public e(f paramf)
  {
    AppMethodBeat.i(35472);
    this.eAJ = paramf;
    this.eAK = new c(this);
    AppMethodBeat.o(35472);
  }

  public final void a(int paramInt, com.tencent.mm.api.f paramf, b paramb)
  {
    AppMethodBeat.i(35471);
    j.p(paramf, "item");
    j.p(paramb, "executor");
    long l = System.currentTimeMillis();
    ab.i("FunctionMsg.FunctionMsgTimer", "[add] op:%s delay:%ss id:%s", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramf.An() - cb.aaD() / 1000L), paramf.Ai() });
    this.eAK.a(new d(paramInt, paramf, paramb));
    ab.i("FunctionMsg.FunctionMsgTimer", "[add] Cost:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(35471);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.u.e
 * JD-Core Version:    0.6.2
 */