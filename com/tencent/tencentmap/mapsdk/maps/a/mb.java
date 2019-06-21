package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class mb
{
  public static void a(Throwable paramThrowable)
  {
    AppMethodBeat.i(100501);
    if ((paramThrowable instanceof md))
    {
      paramThrowable = (md)paramThrowable;
      AppMethodBeat.o(100501);
      throw paramThrowable;
    }
    if ((paramThrowable instanceof mc))
    {
      Throwable localThrowable = ((mc)paramThrowable).getCause();
      if ((localThrowable instanceof RuntimeException))
      {
        paramThrowable = (RuntimeException)localThrowable;
        AppMethodBeat.o(100501);
        throw paramThrowable;
      }
      paramThrowable = (mc)paramThrowable;
      AppMethodBeat.o(100501);
      throw paramThrowable;
    }
    if ((paramThrowable instanceof StackOverflowError))
    {
      paramThrowable = (StackOverflowError)paramThrowable;
      AppMethodBeat.o(100501);
      throw paramThrowable;
    }
    if ((paramThrowable instanceof VirtualMachineError))
    {
      paramThrowable = (VirtualMachineError)paramThrowable;
      AppMethodBeat.o(100501);
      throw paramThrowable;
    }
    if ((paramThrowable instanceof ThreadDeath))
    {
      paramThrowable = (ThreadDeath)paramThrowable;
      AppMethodBeat.o(100501);
      throw paramThrowable;
    }
    if ((paramThrowable instanceof LinkageError))
    {
      paramThrowable = (LinkageError)paramThrowable;
      AppMethodBeat.o(100501);
      throw paramThrowable;
    }
    AppMethodBeat.o(100501);
  }

  public static void a(List<? extends Throwable> paramList)
  {
    AppMethodBeat.i(100502);
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      if (paramList.size() == 1)
      {
        paramList = (Throwable)paramList.get(0);
        if ((paramList instanceof RuntimeException))
        {
          paramList = (RuntimeException)paramList;
          AppMethodBeat.o(100502);
          throw paramList;
        }
        if ((paramList instanceof Error))
        {
          paramList = (Error)paramList;
          AppMethodBeat.o(100502);
          throw paramList;
        }
        paramList = new RuntimeException(paramList);
        AppMethodBeat.o(100502);
        throw paramList;
      }
      paramList = new ma("Multiple exceptions", paramList);
      AppMethodBeat.o(100502);
      throw paramList;
    }
    AppMethodBeat.o(100502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.mb
 * JD-Core Version:    0.6.2
 */