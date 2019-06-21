package com.tencent.mm.v;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.f;
import com.tencent.mm.model.cb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ba;
import com.tencent.mm.u.b.a;
import com.tencent.mm.u.d;
import com.tencent.mm.u.e;
import java.util.LinkedList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/executor/OpDelayExecutor;", "Lcom/tencent/mm/executor/IOpExecutor;", "()V", "execute", "", "timer", "Lcom/tencent/mm/engine/FunctionMsgTimer;", "dispatcher", "Lcom/tencent/mm/api/IFunctionMsgDispatcher;", "storage", "Lcom/tencent/mm/storage/FunctionMsgStorage;", "newFunctionMsgItem", "Lcom/tencent/mm/api/FunctionMsgItem;", "oldFunctionMsgItem", "newXmlCreateTime", "", "onTaskExpired", "task", "Lcom/tencent/mm/engine/FunctionMsgTask;", "Companion", "plugin-functionmsg_release"})
public final class c
  implements b
{
  public static final c.a eAN;

  static
  {
    AppMethodBeat.i(35480);
    eAN = new c.a((byte)0);
    AppMethodBeat.o(35480);
  }

  public final void a(e parame, com.tencent.mm.api.l paraml, ba paramba, f paramf1, f paramf2, long paramLong)
  {
    AppMethodBeat.i(35478);
    j.p(parame, "timer");
    j.p(paraml, "dispatcher");
    j.p(paramba, "storage");
    j.p(paramf1, "newFunctionMsgItem");
    if (paramf2 != null)
    {
      paramf1.be(true);
      paramf2.aH(paramf2.getVersion());
      paramf2.aG(paramf1.getVersion());
      if (0L < paramf1.An())
      {
        paramf2.aJ(paramf1.An() + paramf1.Am());
        paramf2.cF(paramf1.Ak());
        paraml = paramf2.Ai();
        j.o(paraml, "oldFunctionMsgItem!!.functionMsgId");
        ba.a(paraml, paramf2);
        ab.i("FunctionMsg.OpDelayExecutor", "[OpDelayExecutor], functionMsgId: " + paramf1.Ai() + ", op delay! update the exist one, new ActionTime:" + paramf1.An() + " new delay:" + paramf1.Am() + " reslt:" + paramf2);
        parame.a(101, paramf2, (b)this);
        AppMethodBeat.o(35478);
      }
    }
    while (true)
    {
      return;
      paramf2.aJ(paramf2.An() + paramf1.Am());
      break;
      ab.i("FunctionMsg.OpDelayExecutor", "[OpDelayExecutor] op delay, oldFunctionMsgItem is null! newFunctionMsgItem: ".concat(String.valueOf(paramf1)));
      AppMethodBeat.o(35478);
    }
  }

  public final void a(e parame, com.tencent.mm.api.l paraml, d paramd)
  {
    AppMethodBeat.i(35479);
    j.p(parame, "timer");
    j.p(paraml, "dispatcher");
    j.p(paramd, "task");
    f localf = paramd.eAH;
    if (localf.getStatus() == -1)
    {
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(localf);
      new com.tencent.mm.u.b((List)localLinkedList, paraml, (b.a)new c.b(parame, paramd, localf, paraml)).Pn();
      AppMethodBeat.o(35479);
    }
    while (true)
    {
      return;
      if ((localf.getStatus() == 2) || (localf.getStatus() == -2))
      {
        ab.i("FunctionMsg.OpDelayExecutor", "[onTaskExpired] id" + localf.Ai() + " actionTime:" + localf.An());
        if (localf.An() <= cb.aaD() / 1000L)
        {
          paraml.a(localf.Ai(), localf, localf.Al());
          AppMethodBeat.o(35479);
        }
        else
        {
          parame.a(localf.Ah(), localf, paramd.eAI);
        }
      }
      else
      {
        AppMethodBeat.o(35479);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.c
 * JD-Core Version:    0.6.2
 */