package com.tencent.mm.u;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.cb;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/engine/FunctionMsgQueue;", "", "timer", "Lcom/tencent/mm/engine/FunctionMsgTimer;", "(Lcom/tencent/mm/engine/FunctionMsgTimer;)V", "mList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/engine/FunctionMsgTask;", "mMap", "Ljava/util/HashMap;", "", "mTimer", "add", "", "task", "isNeedRemove", "", "old", "new", "loop", "Companion", "plugin-functionmsg_release"})
public final class c
{
  public static final c.a eAG;
  private final HashMap<String, d> cS;
  private final LinkedList<d> eAF;
  private final e eAx;

  static
  {
    AppMethodBeat.i(35467);
    eAG = new c.a((byte)0);
    AppMethodBeat.o(35467);
  }

  public c(e parame)
  {
    AppMethodBeat.i(35466);
    this.eAF = new LinkedList();
    this.cS = new HashMap();
    this.eAx = parame;
    AppMethodBeat.o(35466);
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(35464);
    j.p(paramd, "task");
    Object localObject1 = null;
    if (this.cS.containsKey(paramd.eAH.Ai()))
      localObject1 = (d)this.cS.remove(paramd.eAH.Ai());
    int i;
    label91: Object localObject2;
    if (localObject1 != null)
      if (101 == paramd.czW)
      {
        i = 1;
        if (i == 0)
          break label251;
        ab.w("FunctionMsg.FunctionMsgQueue", "[add] remove old task[%s]", new Object[] { localObject1 });
        this.eAF.remove(localObject1);
        localObject2 = new Object[2];
        localObject2[0] = paramd;
        if ((localObject1 != null) && (localObject1 != null))
          break label282;
        localObject1 = "@null";
      }
    label282: 
    while (true)
    {
      localObject2[1] = localObject1;
      ab.i("FunctionMsg.FunctionMsgQueue", "[add] add task[%s] old Task[%s]", (Object[])localObject2);
      this.eAF.add(paramd);
      localObject2 = (Map)this.cS;
      localObject1 = paramd.eAH.Ai();
      j.o(localObject1, "task.mItem.functionMsgId");
      ((Map)localObject2).put(localObject1, paramd);
      AppMethodBeat.o(35464);
      while (true)
      {
        return;
        if (1 == paramd.czW)
        {
          if ((((d)localObject1).eAH.getVersion() < paramd.eAH.getVersion()) || (paramd.eAH.getVersion() == 0L))
          {
            i = 1;
            break;
          }
          i = 0;
          break;
        }
        if (((d)localObject1).eAH.getVersion() < paramd.eAH.getVersion())
        {
          i = 1;
          break;
        }
        i = 0;
        break;
        label251: if (localObject1 == null)
          break label91;
        ab.e("FunctionMsg.FunctionMsgQueue", "[add] is wrong! new task:%s old task:%s", new Object[] { paramd, localObject1 });
        AppMethodBeat.o(35464);
      }
    }
  }

  public final void loop()
  {
    AppMethodBeat.i(35465);
    ab.i("FunctionMsg.FunctionMsgQueue", "[loop] size:" + this.eAF.size());
    ListIterator localListIterator = this.eAF.listIterator();
    j.o(localListIterator, "mList.listIterator()");
    while (localListIterator.hasNext())
    {
      Object localObject = localListIterator.next();
      j.o(localObject, "iterator.next()");
      d locald = (d)localObject;
      if (locald.eAH.An() <= cb.aaD() / 1000L)
      {
        localListIterator.remove();
        this.cS.remove(locald.eAH.Ai());
        localObject = this.eAx;
        j.p(locald, "task");
        ((e)localObject).eAJ.a(locald.czW, locald);
      }
    }
    AppMethodBeat.o(35465);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.u.c
 * JD-Core Version:    0.6.2
 */