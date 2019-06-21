package com.tencent.mm.cc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Iterator;

public final class a<T>
  implements b.a<T>
{
  private final String mName;
  private T mValue;
  private HashSet<Object<T>> xHH;
  private final Object xHI;

  private a(String paramString)
  {
    AppMethodBeat.i(58946);
    this.xHI = new Object();
    this.mName = paramString;
    this.xHH = new HashSet();
    AppMethodBeat.o(58946);
  }

  a(String paramString, T paramT)
  {
    this(paramString);
    this.mValue = paramT;
  }

  public final T get()
  {
    return this.mValue;
  }

  public final String name()
  {
    return this.mName;
  }

  final void set(T arg1)
  {
    AppMethodBeat.i(58947);
    Object localObject1 = this.mValue;
    int i;
    if ((??? == localObject1) || ((??? != null) && (???.equals(localObject1))))
      i = 1;
    while (i == 0)
    {
      this.mValue = ???;
      synchronized (this.xHI)
      {
        localObject1 = this.xHH.iterator();
        if (!((Iterator)localObject1).hasNext())
          break label87;
        ((Iterator)localObject1).next();
      }
      i = 0;
      continue;
      label87: AppMethodBeat.o(58947);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(58947);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(58948);
    String str = "Status: " + this.mName;
    AppMethodBeat.o(58948);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cc.a
 * JD-Core Version:    0.6.2
 */