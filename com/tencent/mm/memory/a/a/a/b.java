package com.tencent.mm.memory.a.a.a;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.a.f.b;
import com.tencent.mm.a.f.c;
import com.tencent.mm.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class b<T, V>
{
  b<T, V> feA;
  private ConcurrentLinkedQueue<Pair<T, f<T, V>>> fex;
  private a fey;
  a<T, V> fez;

  public b(a parama, a<T, V> parama1, b<T, V> paramb)
  {
    AppMethodBeat.i(115464);
    this.fex = new ConcurrentLinkedQueue();
    this.fey = null;
    this.fey = parama;
    this.fez = parama1;
    this.feA = paramb;
    AppMethodBeat.o(115464);
  }

  final f<T, V> aY(final T paramT)
  {
    AppMethodBeat.i(115466);
    Iterator localIterator = this.fex.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (Pair)localIterator.next();
      if ((localObject != null) && (((Pair)localObject).first != null) && (((Pair)localObject).first.equals(paramT)))
      {
        paramT = (f)((Pair)localObject).second;
        AppMethodBeat.o(115466);
      }
    }
    while (true)
    {
      return paramT;
      if (this.fex.size() >= this.fey.fev)
      {
        localObject = (Pair)this.fex.poll();
        if ((localObject != null) && (((Pair)localObject).second != null))
          ((f)((Pair)localObject).second).trimToSize(-1);
      }
      localObject = this.fey;
      int i = (int)(((a)localObject).feu * ((a)localObject).fer * 1.0D / ((a)localObject).fev);
      ab.i("MicroMsg.ExtraLruMap", "handlerMap %s %s", new Object[] { paramT, Integer.valueOf(i) });
      paramT = new Pair(paramT, new h(i, new f.b()
      {
        public final void c(T paramAnonymousT, V paramAnonymousV1, V paramAnonymousV2)
        {
          AppMethodBeat.i(115462);
          if (b.this.fez != null)
            b.this.fez.r(paramT, paramAnonymousT);
          AppMethodBeat.o(115462);
        }
      }
      , new f.c()
      {
        public final int l(T paramAnonymousT, V paramAnonymousV)
        {
          AppMethodBeat.i(115463);
          int i;
          if (b.this.feA != null)
          {
            i = b.this.feA.d(paramT, paramAnonymousT, paramAnonymousV);
            AppMethodBeat.o(115463);
          }
          while (true)
          {
            return i;
            i = 0;
            AppMethodBeat.o(115463);
          }
        }
      }));
      this.fex.add(paramT);
      paramT = (f)paramT.second;
      AppMethodBeat.o(115466);
    }
  }

  public final boolean q(T paramT1, T paramT2)
  {
    AppMethodBeat.i(115465);
    Iterator localIterator = this.fex.iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      if ((localPair != null) && (localPair.first != null) && (localPair.first.equals(paramT1)))
      {
        paramT1 = (f)localPair.second;
        if (paramT1 == null)
          break label93;
        bool = paramT1.aj(paramT2);
        AppMethodBeat.o(115465);
      }
    }
    while (true)
    {
      return bool;
      paramT1 = null;
      break;
      label93: bool = false;
      AppMethodBeat.o(115465);
    }
  }

  public static abstract interface a<K, O>
  {
    public abstract void r(K paramK1, K paramK2);
  }

  public static abstract interface b<K, O>
  {
    public abstract int d(K paramK1, K paramK2, O paramO);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.a.a.a.b
 * JD-Core Version:    0.6.2
 */