package com.google.firebase.components;

import com.google.firebase.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class s
  implements b
{
  private final Set<Class<?>> bvm;
  private final Set<Class<?>> bvn;
  private final b bvo;

  public s(Iterable<f> paramIterable, b paramb)
  {
    AppMethodBeat.i(10632);
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      f localf = (f)paramIterable.next();
      if (localf.uB())
        localHashSet1.add(localf.buW);
      else
        localHashSet2.add(localf.buW);
    }
    this.bvm = Collections.unmodifiableSet(localHashSet1);
    this.bvn = Collections.unmodifiableSet(localHashSet2);
    this.bvo = paramb;
    AppMethodBeat.o(10632);
  }

  public final <T> T x(Class<T> paramClass)
  {
    AppMethodBeat.i(10633);
    if (!this.bvm.contains(paramClass))
    {
      paramClass = new IllegalArgumentException(String.format("Requesting %s is not allowed.", new Object[] { paramClass }));
      AppMethodBeat.o(10633);
      throw paramClass;
    }
    paramClass = this.bvo.x(paramClass);
    AppMethodBeat.o(10633);
    return paramClass;
  }

  public final <T> a<T> z(Class<T> paramClass)
  {
    AppMethodBeat.i(10634);
    if (!this.bvn.contains(paramClass))
    {
      paramClass = new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", new Object[] { paramClass }));
      AppMethodBeat.o(10634);
      throw paramClass;
    }
    paramClass = this.bvo.z(paramClass);
    AppMethodBeat.o(10634);
    return paramClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.firebase.components.s
 * JD-Core Version:    0.6.2
 */