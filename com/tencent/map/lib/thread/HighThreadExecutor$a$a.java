package com.tencent.map.lib.thread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class HighThreadExecutor$a$a
  implements Iterator<E>
{
  private HighThreadExecutor.a<E>.b<E> b;
  private HighThreadExecutor.a<E>.b<E> c;
  private E d;

  HighThreadExecutor$a$a(HighThreadExecutor.a parama)
  {
    AppMethodBeat.i(98179);
    HighThreadExecutor.a.a(parama);
    try
    {
      this.b = parama.a.b;
      if (this.b != null)
        this.d = this.b.a;
      return;
    }
    finally
    {
      parama.a();
      AppMethodBeat.o(98179);
    }
  }

  private HighThreadExecutor.a<E>.b<E> a(HighThreadExecutor.a<E>.b<E> parama)
  {
    HighThreadExecutor.a.b localb;
    do
    {
      localb = parama.b;
      if (localb == null)
        break;
      parama = localb;
    }
    while (localb.a == null);
    return localb;
  }

  public boolean hasNext()
  {
    if (this.b != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public E next()
  {
    AppMethodBeat.i(98180);
    HighThreadExecutor.a.a(this.a);
    try
    {
      if (this.b == null)
      {
        NoSuchElementException localNoSuchElementException = new java/util/NoSuchElementException;
        localNoSuchElementException.<init>();
        AppMethodBeat.o(98180);
        throw localNoSuchElementException;
      }
    }
    finally
    {
      this.a.a();
      AppMethodBeat.o(98180);
    }
    Object localObject3 = this.d;
    this.c = this.b;
    this.b = a(this.b);
    if (this.b == null);
    for (Object localObject2 = null; ; localObject2 = this.b.a)
    {
      this.d = localObject2;
      this.a.a();
      AppMethodBeat.o(98180);
      return localObject3;
    }
  }

  public void remove()
  {
    AppMethodBeat.i(98181);
    HighThreadExecutor.a.a(this.a);
    try
    {
      HighThreadExecutor.a.b localb1 = this.c;
      this.c = null;
      Object localObject1 = this.a.a;
      HighThreadExecutor.a.b localb2;
      for (Object localObject2 = ((HighThreadExecutor.a.b)localObject1).b; ; localObject2 = localb2)
      {
        if (localObject2 != null)
        {
          if (localObject2 == localb1)
            this.a.a((HighThreadExecutor.a.b)localObject2, (HighThreadExecutor.a.b)localObject1);
        }
        else
          return;
        localb2 = ((HighThreadExecutor.a.b)localObject2).b;
        localObject1 = localObject2;
      }
    }
    finally
    {
      this.a.a();
      AppMethodBeat.o(98181);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.thread.HighThreadExecutor.a.a
 * JD-Core Version:    0.6.2
 */