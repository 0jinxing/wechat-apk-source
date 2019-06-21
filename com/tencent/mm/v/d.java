package com.tencent.mm.v;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.f;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ba;
import com.tencent.mm.u.e;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/executor/OpDeleteExecutor;", "Lcom/tencent/mm/executor/IOpExecutor;", "()V", "execute", "", "timer", "Lcom/tencent/mm/engine/FunctionMsgTimer;", "dispatcher", "Lcom/tencent/mm/api/IFunctionMsgDispatcher;", "storage", "Lcom/tencent/mm/storage/FunctionMsgStorage;", "newFunctionMsgItem", "Lcom/tencent/mm/api/FunctionMsgItem;", "oldFunctionMsg", "newXmlCreateTime", "", "onTaskExpired", "task", "Lcom/tencent/mm/engine/FunctionMsgTask;", "Companion", "plugin-functionmsg_release"})
public final class d
  implements b
{
  public static final d.a eAS;

  static
  {
    AppMethodBeat.i(35483);
    eAS = new d.a((byte)0);
    AppMethodBeat.o(35483);
  }

  public final void a(e parame, com.tencent.mm.api.l paraml, ba paramba, f paramf1, f paramf2, long paramLong)
  {
    AppMethodBeat.i(35481);
    j.p(parame, "timer");
    j.p(paraml, "dispatcher");
    j.p(paramba, "storage");
    j.p(paramf1, "newFunctionMsgItem");
    ab.i("FunctionMsg.OpDeleteExecutor", "[OpDeleteExecutor] op delete! id:".concat(String.valueOf(paramf1)));
    if (paramf2 != null)
    {
      ab.i("FunctionMsg.OpDeleteExecutor", "[OpDeleteExecutor] op delete, newFunctionMsgItem.version: %s, functionMsgItem.version: %s, %s", new Object[] { Long.valueOf(paramf1.getVersion()), Long.valueOf(paramf2.getVersion()), paramf2 });
      if ((paramf1.getVersion() == paramf2.getVersion()) || (paramf1.getVersion() == 0L))
      {
        paramf2.aJ(paramf1.An());
        paramba.a((c)paramf2, new String[0]);
        parame.a(1, paramf2, (b)this);
      }
      AppMethodBeat.o(35481);
    }
    while (true)
    {
      return;
      ab.i("FunctionMsg.OpDeleteExecutor", "[OpDeleteExecutor] op delete, the origin one not exist! ".concat(String.valueOf(paramf1)));
      AppMethodBeat.o(35481);
    }
  }

  public final void a(e parame, com.tencent.mm.api.l paraml, com.tencent.mm.u.d paramd)
  {
    AppMethodBeat.i(35482);
    j.p(parame, "timer");
    j.p(paraml, "dispatcher");
    j.p(paramd, "task");
    ab.i("FunctionMsg.OpDeleteExecutor", "[onTaskExpired] delete " + paramd.eAH.Ai());
    parame = paramd.eAH;
    paraml.b(parame.Ai(), parame, parame.Al());
    AppMethodBeat.o(35482);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.d
 * JD-Core Version:    0.6.2
 */