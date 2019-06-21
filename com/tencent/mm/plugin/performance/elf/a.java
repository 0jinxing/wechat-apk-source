package com.tencent.mm.plugin.performance.elf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class a
{
  public static HashMap<Class, AbstractProcessChecker> cag;

  static
  {
    AppMethodBeat.i(111068);
    cag = new HashMap();
    AppMethodBeat.o(111068);
  }

  public static <T extends AbstractProcessChecker> T as(Class<? extends AbstractProcessChecker> paramClass)
  {
    AppMethodBeat.i(111067);
    if (cag.containsKey(paramClass))
    {
      paramClass = (AbstractProcessChecker)cag.get(paramClass);
      AppMethodBeat.o(111067);
    }
    while (true)
    {
      return paramClass;
      try
      {
        AbstractProcessChecker localAbstractProcessChecker = (AbstractProcessChecker)paramClass.newInstance();
        cag.put(paramClass, localAbstractProcessChecker);
        AppMethodBeat.o(111067);
        paramClass = localAbstractProcessChecker;
      }
      catch (IllegalAccessException paramClass)
      {
        paramClass = null;
        AppMethodBeat.o(111067);
      }
      catch (InstantiationException paramClass)
      {
        label61: break label61;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.elf.a
 * JD-Core Version:    0.6.2
 */