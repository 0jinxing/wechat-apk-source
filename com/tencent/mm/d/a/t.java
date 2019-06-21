package com.tencent.mm.d.a;

import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class t
{
  private final AtomicInteger ciE;
  public final HashMap<Integer, l> ciF;
  u ciG;
  private f ciH;

  public t(u paramu)
  {
    AppMethodBeat.i(113897);
    this.ciE = new AtomicInteger(0);
    this.ciF = new HashMap();
    this.ciH = new t.4(this);
    this.ciG = paramu;
    AppMethodBeat.o(113897);
  }

  protected void a(l paraml, t.a parama)
  {
    AppMethodBeat.i(113899);
    ab.i("MicroMsg.V8EngineWorkerManager", "hy: evaluating %s", new Object[] { parama.filePath });
    paraml.a(parama.filePath, parama.script, null);
    AppMethodBeat.o(113899);
  }

  public final int e(ArrayList<t.a> paramArrayList)
  {
    AppMethodBeat.i(113898);
    final int i = this.ciE.addAndGet(1);
    Object localObject1 = v.CD();
    ((a)localObject1).chr = this.ciH;
    localObject1 = ((v)localObject1).gm(1);
    Object localObject2 = new JavaVoidCallback()
    {
      public final void invoke(V8Object paramAnonymousV8Object, V8Array paramAnonymousV8Array)
      {
        AppMethodBeat.i(113892);
        if ((paramAnonymousV8Array.length() <= 0) || (paramAnonymousV8Array.getType(0) != 4))
          AppMethodBeat.o(113892);
        while (true)
        {
          return;
          t.this.ciG.h(i, paramAnonymousV8Array.getString(0));
          AppMethodBeat.o(113892);
        }
      }
    };
    ((l)localObject1).chO.k(new l.9((l)localObject1, (JavaVoidCallback)localObject2, "postMessage"));
    ((l)localObject1).a(1, new t.1(this, (l)localObject1));
    localObject2 = paramArrayList.iterator();
    label150: 
    while (((Iterator)localObject2).hasNext())
    {
      paramArrayList = (t.a)((Iterator)localObject2).next();
      if (paramArrayList != null)
      {
        if ((!bo.isNullOrNil(paramArrayList.script)) || (!bo.isNullOrNil(paramArrayList.filePath)));
        for (int j = 1; ; j = 0)
        {
          if (j == 0)
            break label150;
          a((l)localObject1, paramArrayList);
          break;
        }
      }
    }
    this.ciF.put(Integer.valueOf(i), localObject1);
    AppMethodBeat.o(113898);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.t
 * JD-Core Version:    0.6.2
 */