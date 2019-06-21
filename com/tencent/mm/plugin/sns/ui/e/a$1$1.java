package com.tencent.mm.plugin.sns.ui.e;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

final class a$1$1
  implements Runnable
{
  a$1$1(a.1 param1, String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40414);
    int i = 0;
    Object localObject;
    if (i < a.cvp().size())
    {
      localObject = (Set)((HashMap)a.cvp().valueAt(i)).get(this.eiH);
      if ((localObject == null) || (((Set)localObject).size() == 0))
        AppMethodBeat.o(40414);
    }
    while (true)
    {
      return;
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        l locall = (l)((WeakReference)((Iterator)localObject).next()).get();
        if (locall != null)
          locall.br(this.eiH, this.rMg);
      }
      i++;
      break;
      AppMethodBeat.o(40414);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.e.a.1.1
 * JD-Core Version:    0.6.2
 */