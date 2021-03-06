package com.tencent.mm.v;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.f;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ba;
import com.tencent.mm.u.b.a;
import com.tencent.mm.u.d;
import java.util.LinkedList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/executor/OpNoShowExecutor;", "Lcom/tencent/mm/executor/IOpExecutor;", "()V", "execute", "", "timer", "Lcom/tencent/mm/engine/FunctionMsgTimer;", "dispatcher", "Lcom/tencent/mm/api/IFunctionMsgDispatcher;", "storage", "Lcom/tencent/mm/storage/FunctionMsgStorage;", "newFunctionMsgItem", "Lcom/tencent/mm/api/FunctionMsgItem;", "oldFunctionMsgItem", "newXmlCreateTime", "", "onTaskExpired", "task", "Lcom/tencent/mm/engine/FunctionMsgTask;", "Companion", "plugin-functionmsg_release"})
public final class e
  implements b
{
  public static final e.a eAT;

  static
  {
    AppMethodBeat.i(35488);
    eAT = new e.a((byte)0);
    AppMethodBeat.o(35488);
  }

  public final void a(com.tencent.mm.u.e parame, com.tencent.mm.api.l paraml, ba paramba, f paramf1, f paramf2, long paramLong)
  {
    AppMethodBeat.i(35486);
    j.p(parame, "timer");
    j.p(paraml, "dispatcher");
    j.p(paramba, "storage");
    j.p(paramf1, "newFunctionMsgItem");
    paramf1.be(false);
    if (paramf2 != null)
      if (paramf2.getVersion() < paramf1.getVersion())
      {
        ab.i("FunctionMsg.OpNoShowExecutor", "[OpNoShowExecutor] op update but no show, update the exist one, preVersion: %s oldFunctionMsgItem:%s", new Object[] { Long.valueOf(paramf2.Aj()), paramf2 });
        paramf2.aH(paramf2.getVersion());
        paramf1.aH(paramf2.getVersion());
        paramf2.aJ(paramf1.An());
        paramf2.cF(paramf1.Ak());
        paraml = paramf2.Ai();
        j.o(paraml, "oldFunctionMsgItem!!.functionMsgId");
        ba.a(paraml, paramf1);
        parame.a(2, paramf1, (b)this);
        AppMethodBeat.o(35486);
      }
    while (true)
    {
      return;
      ab.w("FunctionMsg.OpNoShowExecutor", "[OpNoShowExecutor] op update but no show! but version is smaller");
      AppMethodBeat.o(35486);
      continue;
      paraml = (e)this;
      ab.i("FunctionMsg.OpNoShowExecutor", "[OpNoShowExecutor] op update but no show, insert a new one! %s", new Object[] { paramf1 });
      paramba.b((c)paramf1);
      parame.a(2, paramf1, (b)paraml);
      AppMethodBeat.o(35486);
    }
  }

  public final void a(com.tencent.mm.u.e parame, com.tencent.mm.api.l paraml, d paramd)
  {
    AppMethodBeat.i(35487);
    j.p(parame, "timer");
    j.p(paraml, "dispatcher");
    j.p(paramd, "task");
    f localf = paramd.eAH;
    if (localf.getStatus() == -1)
    {
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(localf);
      new com.tencent.mm.u.b((List)localLinkedList, paraml, (b.a)new e.b(parame, paramd)).Pn();
    }
    AppMethodBeat.o(35487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.e
 * JD-Core Version:    0.6.2
 */