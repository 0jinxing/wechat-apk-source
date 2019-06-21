package com.tencent.mm.kiss.widget.textview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  public ConcurrentHashMap<String, LinkedList<f>> eNi;

  public b()
  {
    AppMethodBeat.i(105691);
    this.eNi = new ConcurrentHashMap();
    AppMethodBeat.o(105691);
  }

  public final void a(f paramf)
  {
    try
    {
      AppMethodBeat.i(105692);
      if ((paramf == null) || (paramf.eNM == null))
        AppMethodBeat.o(105692);
      while (true)
      {
        return;
        LinkedList localLinkedList1 = (LinkedList)this.eNi.get(paramf.eNM.toString());
        LinkedList localLinkedList2 = localLinkedList1;
        if (localLinkedList1 == null)
        {
          localLinkedList2 = new java/util/LinkedList;
          localLinkedList2.<init>();
        }
        localLinkedList2.add(paramf);
        this.eNi.put(paramf.eNM.toString(), localLinkedList2);
        AppMethodBeat.o(105692);
      }
    }
    finally
    {
    }
    throw paramf;
  }

  public final f u(CharSequence paramCharSequence)
  {
    try
    {
      AppMethodBeat.i(105693);
      paramCharSequence = (LinkedList)this.eNi.get(paramCharSequence.toString());
      if ((paramCharSequence == null) || (paramCharSequence.size() == 0))
      {
        paramCharSequence = null;
        AppMethodBeat.o(105693);
      }
      while (true)
      {
        return paramCharSequence;
        paramCharSequence = (f)paramCharSequence.removeFirst();
        AppMethodBeat.o(105693);
      }
    }
    finally
    {
    }
    throw paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.widget.textview.b
 * JD-Core Version:    0.6.2
 */