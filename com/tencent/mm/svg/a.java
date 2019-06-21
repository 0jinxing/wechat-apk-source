package com.tencent.mm.svg;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

final class a<T>
{
  private HashMap<Looper, LinkedList<T>> ycD;
  private Queue<T> ycE;

  a()
  {
    AppMethodBeat.i(70053);
    this.ycD = new HashMap();
    this.ycE = new ArrayDeque();
    AppMethodBeat.o(70053);
  }

  protected final void a(Looper paramLooper, T paramT)
  {
    try
    {
      AppMethodBeat.i(70055);
      LinkedList localLinkedList;
      if (!this.ycD.containsKey(paramLooper))
      {
        localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        this.ycD.put(paramLooper, localLinkedList);
      }
      for (paramLooper = localLinkedList; ; paramLooper = (LinkedList)this.ycD.get(paramLooper))
      {
        if (paramLooper.size() < 20)
          paramLooper.add(paramT);
        AppMethodBeat.o(70055);
        return;
      }
    }
    finally
    {
    }
    throw paramLooper;
  }

  protected final T dvC()
  {
    try
    {
      AppMethodBeat.i(70054);
      Object localObject1 = null;
      if (this.ycE.size() != 0)
        localObject1 = this.ycE.poll();
      AppMethodBeat.o(70054);
      return localObject1;
    }
    finally
    {
    }
  }

  protected final void e(Looper paramLooper)
  {
    try
    {
      AppMethodBeat.i(70056);
      if (this.ycD.containsKey(paramLooper))
      {
        paramLooper = (LinkedList)this.ycD.remove(paramLooper);
        if (this.ycE.size() < 40)
          this.ycE.addAll(paramLooper);
      }
      AppMethodBeat.o(70056);
      return;
    }
    finally
    {
    }
    throw paramLooper;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.svg.a
 * JD-Core Version:    0.6.2
 */