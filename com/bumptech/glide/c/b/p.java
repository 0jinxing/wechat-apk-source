package com.bumptech.glide.c.b;

import com.bumptech.glide.c.a;
import com.bumptech.glide.c.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class p extends Exception
{
  private static final StackTraceElement[] aBV = new StackTraceElement[0];
  private a aAL;
  private final List<Throwable> aBW;
  private String aBX;
  private Class<?> aBd;
  private h azP;

  public p(String paramString)
  {
    this(paramString, Collections.emptyList());
    AppMethodBeat.i(91848);
    AppMethodBeat.o(91848);
  }

  public p(String paramString, Throwable paramThrowable)
  {
    this(paramString, Collections.singletonList(paramThrowable));
    AppMethodBeat.i(91849);
    AppMethodBeat.o(91849);
  }

  public p(String paramString, List<Throwable> paramList)
  {
    AppMethodBeat.i(91850);
    this.aBX = paramString;
    setStackTrace(aBV);
    this.aBW = paramList;
    AppMethodBeat.o(91850);
  }

  private void a(Appendable paramAppendable)
  {
    AppMethodBeat.i(91857);
    a(this, paramAppendable);
    a(this.aBW, new p.a(paramAppendable));
    AppMethodBeat.o(91857);
  }

  private static void a(Throwable paramThrowable, Appendable paramAppendable)
  {
    AppMethodBeat.i(91859);
    try
    {
      paramAppendable.append(paramThrowable.getClass().toString()).append(": ").append(paramThrowable.getMessage()).append('\n');
      AppMethodBeat.o(91859);
      return;
    }
    catch (IOException paramAppendable)
    {
      paramThrowable = new RuntimeException(paramThrowable);
      AppMethodBeat.o(91859);
    }
    throw paramThrowable;
  }

  private void a(Throwable paramThrowable, List<Throwable> paramList)
  {
    AppMethodBeat.i(91853);
    if ((paramThrowable instanceof p))
    {
      paramThrowable = ((p)paramThrowable).aBW.iterator();
      while (paramThrowable.hasNext())
        a((Throwable)paramThrowable.next(), paramList);
      AppMethodBeat.o(91853);
    }
    while (true)
    {
      return;
      paramList.add(paramThrowable);
      AppMethodBeat.o(91853);
    }
  }

  private static void a(List<Throwable> paramList, Appendable paramAppendable)
  {
    AppMethodBeat.i(91860);
    try
    {
      b(paramList, paramAppendable);
      AppMethodBeat.o(91860);
      return;
    }
    catch (IOException paramList)
    {
      paramList = new RuntimeException(paramList);
      AppMethodBeat.o(91860);
    }
    throw paramList;
  }

  private static void b(List<Throwable> paramList, Appendable paramAppendable)
  {
    AppMethodBeat.i(91861);
    int i = paramList.size();
    int j = 0;
    if (j < i)
    {
      paramAppendable.append("Cause (").append(String.valueOf(j + 1)).append(" of ").append(String.valueOf(i)).append("): ");
      Throwable localThrowable = (Throwable)paramList.get(j);
      if ((localThrowable instanceof p))
        ((p)localThrowable).a(paramAppendable);
      while (true)
      {
        j++;
        break;
        a(localThrowable, paramAppendable);
      }
    }
    AppMethodBeat.o(91861);
  }

  private List<Throwable> mL()
  {
    AppMethodBeat.i(91851);
    ArrayList localArrayList = new ArrayList();
    a(this, localArrayList);
    AppMethodBeat.o(91851);
    return localArrayList;
  }

  final void a(h paramh, a parama, Class<?> paramClass)
  {
    this.azP = paramh;
    this.aAL = parama;
    this.aBd = paramClass;
  }

  public final Throwable fillInStackTrace()
  {
    return this;
  }

  public final String getMessage()
  {
    AppMethodBeat.i(91858);
    Object localObject1 = new StringBuilder(71).append(this.aBX);
    Object localObject2;
    if (this.aBd != null)
    {
      localObject2 = ", " + this.aBd;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      if (this.aAL == null)
        break label153;
      localObject2 = ", " + this.aAL;
      label82: localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      if (this.azP == null)
        break label159;
      localObject2 = ", " + this.azP;
      label115: localObject2 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = mL();
      if (!((List)localObject1).isEmpty())
        break label165;
      localObject2 = ((StringBuilder)localObject2).toString();
      AppMethodBeat.o(91858);
    }
    while (true)
    {
      return localObject2;
      localObject2 = "";
      break;
      label153: localObject2 = "";
      break label82;
      label159: localObject2 = "";
      break label115;
      label165: if (((List)localObject1).size() == 1)
        ((StringBuilder)localObject2).append("\nThere was 1 cause:");
      while (true)
      {
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Throwable localThrowable = (Throwable)((Iterator)localObject1).next();
          ((StringBuilder)localObject2).append('\n').append(localThrowable.getClass().getName()).append('(').append(localThrowable.getMessage()).append(')');
        }
        ((StringBuilder)localObject2).append("\nThere were ").append(((List)localObject1).size()).append(" causes:");
      }
      ((StringBuilder)localObject2).append("\n call GlideException#logRootCauses(String) for more detail");
      localObject2 = ((StringBuilder)localObject2).toString();
      AppMethodBeat.o(91858);
    }
  }

  public final void mM()
  {
    AppMethodBeat.i(91852);
    List localList = mL();
    int i = 0;
    int j = localList.size();
    while (i < j)
    {
      new StringBuilder("Root cause (").append(i + 1).append(" of ").append(j).append(")");
      localList.get(i);
      i++;
    }
    AppMethodBeat.o(91852);
  }

  public final void printStackTrace()
  {
    AppMethodBeat.i(91854);
    printStackTrace(System.err);
    AppMethodBeat.o(91854);
  }

  public final void printStackTrace(PrintStream paramPrintStream)
  {
    AppMethodBeat.i(91855);
    a(paramPrintStream);
    AppMethodBeat.o(91855);
  }

  public final void printStackTrace(PrintWriter paramPrintWriter)
  {
    AppMethodBeat.i(91856);
    a(paramPrintWriter);
    AppMethodBeat.o(91856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.p
 * JD-Core Version:    0.6.2
 */