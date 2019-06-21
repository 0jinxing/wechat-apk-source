package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.bb;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class at
  implements e
{
  public List<WeakReference<e>> qNf;

  public at()
  {
    AppMethodBeat.i(36670);
    this.qNf = new LinkedList();
    AppMethodBeat.o(36670);
  }

  public final void a(int paramInt, String paramString, long paramLong, TimeLineObject paramTimeLineObject, boolean paramBoolean)
  {
    AppMethodBeat.i(36673);
    Iterator localIterator = this.qNf.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null))
        ((e)localWeakReference.get()).a(paramInt, paramString, paramLong, paramTimeLineObject, paramBoolean);
    }
    AppMethodBeat.o(36673);
  }

  public final void a(int paramInt, String paramString, long paramLong, TimeLineObject paramTimeLineObject, boolean paramBoolean, bb parambb)
  {
    AppMethodBeat.i(36672);
    Iterator localIterator = this.qNf.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null))
        ((e)localWeakReference.get()).a(paramInt, paramString, paramLong, paramTimeLineObject, paramBoolean, parambb);
    }
    AppMethodBeat.o(36672);
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(36671);
    Iterator localIterator = this.qNf.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((e)localWeakReference.get()).equals(parame)))
        AppMethodBeat.o(36671);
    }
    while (true)
    {
      return;
      this.qNf.add(new WeakReference(parame));
      AppMethodBeat.o(36671);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.at
 * JD-Core Version:    0.6.2
 */