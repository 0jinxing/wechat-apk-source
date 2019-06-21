package com.tencent.mm.az;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.messenger.foundation.a.a.g.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements com.tencent.mm.plugin.messenger.foundation.a.a.g
{
  SparseArray<LinkedList<g.a>> fLo;

  public a()
  {
    AppMethodBeat.i(984);
    this.fLo = new SparseArray();
    AppMethodBeat.o(984);
  }

  public final void a(int paramInt, g.a parama)
  {
    AppMethodBeat.i(986);
    if (this.fLo.indexOfKey(paramInt) < 0)
      this.fLo.put(paramInt, new LinkedList());
    ((LinkedList)this.fLo.get(paramInt)).add(parama);
    AppMethodBeat.o(986);
  }

  public final void a(j.b paramb)
  {
    AppMethodBeat.i(985);
    if ((com.tencent.mm.kernel.g.RO().eJo == null) || (com.tencent.mm.kernel.g.RO().eJo.ftA == null))
      AppMethodBeat.o(985);
    while (true)
    {
      return;
      Object localObject = new ArrayList(1);
      ((ArrayList)localObject).add(paramb);
      localObject = new b((List)localObject);
      com.tencent.mm.kernel.g.RQ();
      ((b)localObject).a(com.tencent.mm.kernel.g.RO().eJo.ftA, new a.1(this, paramb));
      AppMethodBeat.o(985);
    }
  }

  public final void b(int paramInt, g.a parama)
  {
    AppMethodBeat.i(987);
    if (this.fLo.indexOfKey(paramInt) >= 0)
      ((LinkedList)this.fLo.get(paramInt)).remove(parama);
    AppMethodBeat.o(987);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.a
 * JD-Core Version:    0.6.2
 */