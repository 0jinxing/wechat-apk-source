package com.tencent.mm.memory.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.a.f.b;
import java.util.Map;

public final class c<T, V> extends a<T, V, V, V>
{
  public c(int paramInt)
  {
    super(paramInt);
  }

  public c(f.b<T, V> paramb)
  {
    super(paramb);
  }

  public final T Xn()
  {
    return null;
  }

  public final V aV(V paramV)
  {
    return paramV;
  }

  public final V aX(V paramV)
  {
    return paramV;
  }

  public final V o(T paramT, V paramV)
  {
    return paramV;
  }

  public final Map<T, V> snapshot()
  {
    AppMethodBeat.i(115443);
    Map localMap = this.feD.snapshot();
    AppMethodBeat.o(115443);
    return localMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.a.c
 * JD-Core Version:    0.6.2
 */