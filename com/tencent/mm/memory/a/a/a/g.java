package com.tencent.mm.memory.a.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class g<T, V> extends e<T, V, a<V>, V>
{
  public g()
  {
    super(10);
  }

  protected final T Xn()
  {
    return null;
  }

  protected final V o(T paramT, V paramV)
  {
    return paramV;
  }

  public final Map<T, V> snapshot()
  {
    return null;
  }

  static final class a<T>
  {
    WeakReference<T> bSI;
    T obj;

    public a(T paramT)
    {
      AppMethodBeat.i(115472);
      this.obj = null;
      this.bSI = null;
      this.obj = paramT;
      this.bSI = new WeakReference(paramT);
      al.n(new Runnable()
      {
        public final void run()
        {
          g.a.this.obj = null;
        }
      }
      , 2000L);
      AppMethodBeat.o(115472);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.a.a.a.g
 * JD-Core Version:    0.6.2
 */