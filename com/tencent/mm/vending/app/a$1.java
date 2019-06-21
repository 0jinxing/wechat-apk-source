package com.tencent.mm.vending.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class a$1 extends com.tencent.mm.vending.base.a<Object>
{
  a$1(a parama)
  {
  }

  public final Object aH(Class<?> paramClass)
  {
    AppMethodBeat.i(126094);
    a.a locala = (a.a)this.zXf.c.get(paramClass);
    Object localObject;
    if (locala != null)
    {
      locala.c = true;
      localObject = locala.aoq();
      locala.c = false;
      if (locala.b)
        locala.zXg = defer(paramClass);
    }
    else
    {
      paramClass = null;
      AppMethodBeat.o(126094);
    }
    while (true)
    {
      return paramClass;
      AppMethodBeat.o(126094);
      paramClass = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.app.a.1
 * JD-Core Version:    0.6.2
 */