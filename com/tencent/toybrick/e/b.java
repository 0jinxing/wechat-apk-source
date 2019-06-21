package com.tencent.toybrick.e;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.h.c;
import android.support.v7.h.c.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.toybrick.a.a;
import com.tencent.toybrick.c.f;
import com.tencent.toybrick.c.g;
import com.tencent.toybrick.c.g.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  WeakReference<com.tencent.toybrick.b.b> AGX;
  public Runnable AGY;
  public Handler mMainHandler;

  public b(com.tencent.toybrick.b.b paramb)
  {
    AppMethodBeat.i(113233);
    this.mMainHandler = new Handler(Looper.getMainLooper());
    this.AGX = new WeakReference(paramb);
    AppMethodBeat.o(113233);
  }

  final class b
    implements Runnable
  {
    boolean AGR;
    private LinkedList<g> AHd;
    private ArrayList<g> AHe;

    public b(LinkedList<g> paramArrayList, ArrayList<g> arg3)
    {
      AppMethodBeat.i(113230);
      this.AGR = paramArrayList;
      Collection localCollection1;
      this.AHd = new LinkedList(localCollection1);
      Collection localCollection2;
      this.AHe = new ArrayList(localCollection2);
      AppMethodBeat.o(113230);
    }

    private void a(List<g> paramList, HashMap<g, Integer> paramHashMap)
    {
      AppMethodBeat.i(113232);
      paramList.clear();
      Iterator localIterator = this.AHd.iterator();
      g localg;
      while (localIterator.hasNext())
      {
        localg = (g)localIterator.next();
        if (localg.isVisible)
          paramList.add(localg);
        paramHashMap.put(localg, Integer.valueOf(paramHashMap.size()));
      }
      Collections.sort(paramList);
      if (this.AGR)
      {
        localIterator = paramList.iterator();
        int i = 0;
        for (paramHashMap = null; localIterator.hasNext(); paramHashMap = localg)
        {
          localg = (g)localIterator.next();
          if (localg.dSy() == g.b.AGO)
          {
            localg.AGG = false;
            if (paramHashMap != null)
              paramHashMap.AGG = false;
          }
          if (i == paramList.size() - 1)
            localg.AGG = false;
          i++;
        }
      }
      AppMethodBeat.o(113232);
    }

    public final void run()
    {
      AppMethodBeat.i(113231);
      ArrayList localArrayList = new ArrayList();
      HashMap localHashMap = new HashMap();
      a(localArrayList, localHashMap);
      c.b localb = c.a(new a(this.AHe, localArrayList), true);
      b.a locala = new b.a(b.this, (byte)0);
      locala.AHc = localHashMap;
      locala.AHa = localb;
      locala.AHb = localArrayList;
      b.this.mMainHandler.post(new b.b.1(this, locala));
      AppMethodBeat.o(113231);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.e.b
 * JD-Core Version:    0.6.2
 */