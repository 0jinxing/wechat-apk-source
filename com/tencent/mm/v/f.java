package com.tencent.mm.v;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.cb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ba;
import com.tencent.mm.u.d;
import com.tencent.mm.u.e;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/executor/OpShowExecutor;", "Lcom/tencent/mm/executor/IOpExecutor;", "()V", "execute", "", "timer", "Lcom/tencent/mm/engine/FunctionMsgTimer;", "dispatcher", "Lcom/tencent/mm/api/IFunctionMsgDispatcher;", "storage", "Lcom/tencent/mm/storage/FunctionMsgStorage;", "newFunctionMsgItem", "Lcom/tencent/mm/api/FunctionMsgItem;", "oldFunctionMsgItem", "newXmlCreateTime", "", "onTaskExpired", "task", "Lcom/tencent/mm/engine/FunctionMsgTask;", "Companion", "plugin-functionmsg_release"})
public final class f
  implements b
{
  public static final f.a eAU;

  static
  {
    AppMethodBeat.i(35491);
    eAU = new f.a((byte)0);
    AppMethodBeat.o(35491);
  }

  public final void a(e parame, com.tencent.mm.api.l paraml, ba paramba, com.tencent.mm.api.f paramf1, com.tencent.mm.api.f paramf2, long paramLong)
  {
    AppMethodBeat.i(35489);
    j.p(parame, "timer");
    j.p(paraml, "dispatcher");
    j.p(paramba, "storage");
    j.p(paramf1, "newFunctionMsgItem");
    ab.i("FunctionMsg.OpShowExecutor", "[OpShowExecutor] op show, old functionMsgItem:".concat(String.valueOf(paramf2)));
    paramf1.be(true);
    if (paramf2 != null)
    {
      paraml = new StringBuilder("[OpShowExecutor] op show!,").append(paramf1.getVersion()).append(", ").append(paramf2.getVersion()).append(',');
      if (paramf2.Al() != null)
        break label236;
    }
    label236: for (boolean bool = true; ; bool = false)
    {
      ab.i("FunctionMsg.OpShowExecutor", bool);
      paramf2.be(true);
      if ((paramf2.Al() != null) && (paramf2.getStatus() == 2))
      {
        ab.i("FunctionMsg.OpShowExecutor", "show, update create time to: %s", new Object[] { Long.valueOf(paramLong) });
        paraml = paramf2.Al();
        if (paraml != null)
          paraml.pcX = ((int)(cb.aaD() / 1000L));
      }
      paramf2.aJ(paramf1.An());
      paramf2.cF(paramf1.Ak());
      paraml = paramf2.Ai();
      j.o(paraml, "oldFunctionMsgItem!!.functionMsgId");
      ba.a(paraml, paramf2);
      parame.a(3, paramf2, (b)this);
      AppMethodBeat.o(35489);
      return;
    }
  }

  public final void a(e parame, com.tencent.mm.api.l paraml, d paramd)
  {
    AppMethodBeat.i(35490);
    j.p(parame, "timer");
    j.p(paraml, "dispatcher");
    j.p(paramd, "task");
    parame = paramd.eAH;
    paraml.a(parame.Ai(), parame, parame.Al());
    AppMethodBeat.o(35490);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.f
 * JD-Core Version:    0.6.2
 */