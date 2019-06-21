package com.tencent.mm.v;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.f;
import com.tencent.mm.model.cb;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ba;
import com.tencent.mm.u.b.a;
import com.tencent.mm.u.d;
import com.tencent.mm.u.e;
import java.util.LinkedList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/executor/OpUpdateExecutor;", "Lcom/tencent/mm/executor/IOpExecutor;", "()V", "execute", "", "timer", "Lcom/tencent/mm/engine/FunctionMsgTimer;", "dispatcher", "Lcom/tencent/mm/api/IFunctionMsgDispatcher;", "storage", "Lcom/tencent/mm/storage/FunctionMsgStorage;", "newFunctionMsgItem", "Lcom/tencent/mm/api/FunctionMsgItem;", "oldFunctionMsgItem", "newXmlCreateTime", "", "onTaskExpired", "task", "Lcom/tencent/mm/engine/FunctionMsgTask;", "Companion", "plugin-functionmsg_release"})
public final class g
  implements b
{
  public static final g.a eAV;

  static
  {
    AppMethodBeat.i(35496);
    eAV = new g.a((byte)0);
    AppMethodBeat.o(35496);
  }

  public final void a(e parame, com.tencent.mm.api.l paraml, ba paramba, f paramf1, f paramf2, long paramLong)
  {
    AppMethodBeat.i(35494);
    j.p(parame, "timer");
    j.p(paraml, "dispatcher");
    j.p(paramba, "storage");
    j.p(paramf1, "newFunctionMsgItem");
    paramf1.be(true);
    if (paramf2 == null)
    {
      ab.i("FunctionMsg.OpUpdateExecutor", "[OpUpdateExecutor] op update, insert a new one! ".concat(String.valueOf(paramf1)));
      paramba.b((c)paramf1);
      parame.a(0, paramf1, (b)this);
      AppMethodBeat.o(35494);
    }
    while (true)
    {
      return;
      if (paramf2.getVersion() < paramf1.getVersion())
      {
        ab.i("FunctionMsg.OpUpdateExecutor", "[OpUpdateExecutor] op update, update the exist one! [%s:%s]", new Object[] { paramf1, paramf2 });
        paramf2.aH(paramf2.getVersion());
        paramf1.aH(paramf2.getVersion());
        paraml = paramf2.Ai();
        j.o(paraml, "oldFunctionMsgItem!!.functionMsgId");
        ba.a(paraml, paramf1);
        parame.a(0, paramf1, (b)this);
        AppMethodBeat.o(35494);
      }
      else
      {
        if (paramf2.getVersion() >= paramf1.getVersion())
          ab.e("FunctionMsg.OpUpdateExecutor", "[OpUpdateExecutor], id:%s old:new [%s:%s]", new Object[] { paramf2.Ai(), Long.valueOf(paramf2.getVersion()), Long.valueOf(paramf1.getVersion()) });
        AppMethodBeat.o(35494);
      }
    }
  }

  public final void a(e parame, com.tencent.mm.api.l paraml, d paramd)
  {
    AppMethodBeat.i(35495);
    j.p(parame, "timer");
    j.p(paraml, "dispatcher");
    j.p(paramd, "task");
    f localf = paramd.eAH;
    if (localf.getStatus() == -1)
    {
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(localf);
      new com.tencent.mm.u.b((List)localLinkedList, paraml, (b.a)new g.b(parame, paramd, localf, paraml)).Pn();
      AppMethodBeat.o(35495);
    }
    while (true)
    {
      return;
      if ((localf.getStatus() == 2) || (localf.getStatus() == -2))
      {
        ab.i("FunctionMsg.OpUpdateExecutor", "[onTaskExpired] id" + localf.Ai() + " actionTime:" + localf.An());
        if (localf.An() <= cb.aaD() / 1000L)
        {
          paraml.a(localf.Ai(), localf, localf.Al());
          AppMethodBeat.o(35495);
        }
        else
        {
          parame.a(localf.Ah(), localf, paramd.eAI);
        }
      }
      else
      {
        AppMethodBeat.o(35495);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.g
 * JD-Core Version:    0.6.2
 */