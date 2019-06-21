package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class d
  implements f
{
  public Map<Integer, Set<t>> ftE;

  public d()
  {
    AppMethodBeat.i(79237);
    this.ftE = new HashMap();
    g.RO().eJo.a(452, this);
    AppMethodBeat.o(79237);
  }

  public static void a(int paramInt, x paramx)
  {
    AppMethodBeat.i(79240);
    paramx = new y(paramInt, paramx);
    g.RO().eJo.a(paramx, 0);
    AppMethodBeat.o(79240);
  }

  public final void a(int paramInt, t paramt)
  {
    AppMethodBeat.i(79238);
    if (!this.ftE.containsKey(Integer.valueOf(paramInt)))
      this.ftE.put(Integer.valueOf(paramInt), new HashSet());
    if (!((Set)this.ftE.get(Integer.valueOf(paramInt))).contains(paramt))
      ((Set)this.ftE.get(Integer.valueOf(paramInt))).add(paramt);
    AppMethodBeat.o(79238);
  }

  public final void b(int paramInt, t paramt)
  {
    AppMethodBeat.i(79239);
    if (this.ftE.get(Integer.valueOf(paramInt)) != null)
      ((Set)this.ftE.get(Integer.valueOf(paramInt))).remove(paramt);
    AppMethodBeat.o(79239);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(79241);
    if (!(paramm instanceof y))
    {
      ab.i("MicroMsg.AppCenterNetSceneService", "onSceneEnd, the scene is not a instance of NetSceneAppCenter");
      AppMethodBeat.o(79241);
    }
    while (true)
    {
      return;
      paramm = (y)paramm;
      Set localSet = (Set)this.ftE.get(Integer.valueOf(paramm.vco));
      if ((localSet != null) && (localSet.size() > 0))
      {
        Object localObject = new HashSet();
        ((Set)localObject).addAll(localSet);
        Iterator localIterator = ((Set)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (t)localIterator.next();
          if ((localObject != null) && (localSet.contains(localObject)))
            ((t)localObject).a(paramInt1, paramInt2, paramString, paramm.vcp);
        }
      }
      AppMethodBeat.o(79241);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.d
 * JD-Core Version:    0.6.2
 */