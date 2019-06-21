package com.tencent.mm.plugin.offline;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class a<T>
{
  protected List<WeakReference<T>> oWP = new ArrayList();

  public final void cl(T paramT)
  {
    if (this.oWP != null)
      this.oWP = new ArrayList();
    this.oWP.add(new WeakReference(paramT));
  }

  public final void cm(T paramT)
  {
    if (this.oWP == null);
    while (true)
    {
      return;
      for (int i = 0; i < this.oWP.size(); i++)
      {
        WeakReference localWeakReference = (WeakReference)this.oWP.get(i);
        if (localWeakReference != null)
        {
          Object localObject = localWeakReference.get();
          if ((localObject != null) && (localObject.equals(paramT)))
          {
            localWeakReference.clear();
            this.oWP.remove(localWeakReference);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a
 * JD-Core Version:    0.6.2
 */