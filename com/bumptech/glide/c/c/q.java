package com.bumptech.glide.c.c;

import android.support.v4.f.k.a;
import com.bumptech.glide.c.h;
import com.bumptech.glide.c.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class q<Model, Data>
  implements n<Model, Data>
{
  private final k.a<List<Throwable>> aEv;
  private final List<n<Model, Data>> azX;

  q(List<n<Model, Data>> paramList, k.a<List<Throwable>> parama)
  {
    this.azX = paramList;
    this.aEv = parama;
  }

  public final boolean X(Model paramModel)
  {
    AppMethodBeat.i(92116);
    Iterator localIterator = this.azX.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (((n)localIterator.next()).X(paramModel))
      {
        bool = true;
        AppMethodBeat.o(92116);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92116);
    }
  }

  public final n.a<Data> b(Model paramModel, int paramInt1, int paramInt2, j paramj)
  {
    AppMethodBeat.i(92115);
    int i = this.azX.size();
    ArrayList localArrayList = new ArrayList(i);
    int j = 0;
    h localh = null;
    if (j < i)
    {
      Object localObject = (n)this.azX.get(j);
      if (!((n)localObject).X(paramModel))
        break label167;
      localObject = ((n)localObject).b(paramModel, paramInt1, paramInt2, paramj);
      if (localObject == null)
        break label167;
      localh = ((n.a)localObject).azW;
      localArrayList.add(((n.a)localObject).aEq);
    }
    label167: 
    while (true)
    {
      j++;
      break;
      if ((!localArrayList.isEmpty()) && (localh != null))
      {
        paramModel = new n.a(localh, new q.a(localArrayList, this.aEv));
        AppMethodBeat.o(92115);
      }
      while (true)
      {
        return paramModel;
        AppMethodBeat.o(92115);
        paramModel = null;
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(92117);
    String str = "MultiModelLoader{modelLoaders=" + Arrays.toString(this.azX.toArray()) + '}';
    AppMethodBeat.o(92117);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.q
 * JD-Core Version:    0.6.2
 */