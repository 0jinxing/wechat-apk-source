package com.tencent.mm.ipcinvoker.wx_extension.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class b$b<T> extends WeakReference<T>
{
  public b$b(T paramT)
  {
    super(paramT);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(126213);
    if (paramObject == this)
      AppMethodBeat.o(126213);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof b))
      {
        AppMethodBeat.o(126213);
        bool = false;
      }
      else
      {
        paramObject = ((b)paramObject).get();
        Object localObject = get();
        if ((paramObject == localObject) || ((localObject != null) && (localObject.equals(paramObject))))
        {
          AppMethodBeat.o(126213);
        }
        else
        {
          AppMethodBeat.o(126213);
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.wx_extension.b.b.b
 * JD-Core Version:    0.6.2
 */