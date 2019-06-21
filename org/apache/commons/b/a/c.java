package org.apache.commons.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class c
  implements Serializable
{
  public static boolean BYA = true;
  public static boolean BYy = true;
  public static boolean BYz = true;
  private Throwable BYx;

  public c(b paramb)
  {
    AppMethodBeat.i(116944);
    this.BYx = null;
    this.BYx = ((Throwable)paramb);
    AppMethodBeat.o(116944);
  }

  private static void gd(List paramList)
  {
    AppMethodBeat.i(116947);
    for (int i = paramList.size() - 1; i > 0; i--)
    {
      String[] arrayOfString1 = (String[])paramList.get(i);
      String[] arrayOfString2 = (String[])paramList.get(i - 1);
      ArrayList localArrayList = new ArrayList(Arrays.asList(arrayOfString1));
      a.v(localArrayList, new ArrayList(Arrays.asList(arrayOfString2)));
      int j = arrayOfString1.length - localArrayList.size();
      if (j > 0)
      {
        localArrayList.add("\t... " + j + " more");
        paramList.set(i, localArrayList.toArray(new String[localArrayList.size()]));
      }
    }
    AppMethodBeat.o(116947);
  }

  public final void printStackTrace(PrintStream paramPrintStream)
  {
    AppMethodBeat.i(116945);
    try
    {
      PrintWriter localPrintWriter = new java/io/PrintWriter;
      localPrintWriter.<init>(paramPrintStream, false);
      printStackTrace(localPrintWriter);
      localPrintWriter.flush();
      return;
    }
    finally
    {
      AppMethodBeat.o(116945);
    }
  }

  public final void printStackTrace(PrintWriter paramPrintWriter)
  {
    AppMethodBeat.i(116946);
    Object localObject1 = this.BYx;
    if (a.emS())
      if ((localObject1 instanceof b))
      {
        ((b)localObject1).b(paramPrintWriter);
        AppMethodBeat.o(116946);
      }
    while (true)
    {
      return;
      ((Throwable)localObject1).printStackTrace(paramPrintWriter);
      AppMethodBeat.o(116946);
      continue;
      Object localObject3 = new ArrayList();
      Object localObject4;
      if (localObject1 != null)
      {
        StringWriter localStringWriter = new StringWriter();
        localObject4 = new PrintWriter(localStringWriter, true);
        if ((localObject1 instanceof b))
          ((b)localObject1).b((PrintWriter)localObject4);
        while (true)
        {
          ((List)localObject3).add(a.awP(localStringWriter.getBuffer().toString()));
          localObject1 = a.C((Throwable)localObject1);
          break;
          ((Throwable)localObject1).printStackTrace((PrintWriter)localObject4);
        }
      }
      localObject1 = "Caused by: ";
      if (!BYy)
      {
        localObject1 = "Rethrown as: ";
        Collections.reverse((List)localObject3);
      }
      if (BYz)
        gd((List)localObject3);
      try
      {
        localObject3 = ((List)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (String[])((Iterator)localObject3).next();
          int i = 0;
          int j = localObject4.length;
          while (i < j)
          {
            paramPrintWriter.println(localObject4[i]);
            i++;
          }
          if (((Iterator)localObject3).hasNext())
            paramPrintWriter.print((String)localObject1);
        }
      }
      finally
      {
        AppMethodBeat.o(116946);
      }
      AppMethodBeat.o(116946);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     org.apache.commons.b.a.c
 * JD-Core Version:    0.6.2
 */