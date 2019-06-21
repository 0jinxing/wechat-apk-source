package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class ma extends RuntimeException
{
  private final List<Throwable> a;
  private final String b;
  private Throwable c;

  public ma(String paramString, Collection<? extends Throwable> paramCollection)
  {
    AppMethodBeat.i(100493);
    this.c = null;
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    paramString = new ArrayList();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      Throwable localThrowable = (Throwable)paramCollection.next();
      if ((localThrowable instanceof ma))
        localLinkedHashSet.addAll(((ma)localThrowable).a());
      else
        localLinkedHashSet.add(localThrowable);
    }
    paramString.addAll(localLinkedHashSet);
    this.a = Collections.unmodifiableList(paramString);
    this.b = (this.a.size() + " exceptions occurred. ");
    AppMethodBeat.o(100493);
  }

  public ma(Collection<? extends Throwable> paramCollection)
  {
    this(null, paramCollection);
  }

  private final List<Throwable> a(Throwable paramThrowable)
  {
    AppMethodBeat.i(100500);
    ArrayList localArrayList = new ArrayList();
    Throwable localThrowable = paramThrowable.getCause();
    paramThrowable = localThrowable;
    if (localThrowable == null)
      AppMethodBeat.o(100500);
    while (true)
    {
      return localArrayList;
      do
      {
        paramThrowable = paramThrowable.getCause();
        localArrayList.add(paramThrowable);
      }
      while (paramThrowable.getCause() != null);
      AppMethodBeat.o(100500);
    }
  }

  private void a(ma.b paramb)
  {
    AppMethodBeat.i(100498);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this).append("\n");
    for (??? : getStackTrace())
      localStringBuilder.append("\tat ").append(???).append("\n");
    ??? = this.a.iterator();
    for (??? = 1; ((Iterator)???).hasNext(); ???++)
    {
      ??? = (Throwable)((Iterator)???).next();
      localStringBuilder.append("  ComposedException ").append(???).append(" :\n");
      a(localStringBuilder, (Throwable)???, "\t");
    }
    synchronized (paramb.a())
    {
      paramb.a(localStringBuilder.toString());
      AppMethodBeat.o(100498);
      return;
    }
  }

  private void a(StringBuilder paramStringBuilder, Throwable paramThrowable, String paramString)
  {
    AppMethodBeat.i(100499);
    while (true)
    {
      paramStringBuilder.append(paramString).append(paramThrowable).append("\n");
      for (Object localObject : paramThrowable.getStackTrace())
        paramStringBuilder.append("\t\tat ").append(localObject).append("\n");
      if (paramThrowable.getCause() == null)
        break;
      paramStringBuilder.append("\tCaused by: ");
      paramThrowable = paramThrowable.getCause();
      paramString = "";
    }
    AppMethodBeat.o(100499);
  }

  public final List<Throwable> a()
  {
    return this.a;
  }

  public final Throwable getCause()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(100494);
        if (this.c == null)
        {
          ma.a locala1 = new com/tencent/tencentmap/mapsdk/maps/a/ma$a;
          locala1.<init>();
          HashSet localHashSet = new java/util/HashSet;
          localHashSet.<init>();
          Iterator localIterator1 = this.a.iterator();
          ma.a locala2 = locala1;
          Object localObject2;
          if (localIterator1.hasNext())
          {
            localObject2 = (Throwable)localIterator1.next();
            if (localHashSet.contains(localObject2))
              continue;
            localHashSet.add(localObject2);
            Iterator localIterator2 = a((Throwable)localObject2).iterator();
            if (localIterator2.hasNext())
            {
              Throwable localThrowable3 = (Throwable)localIterator2.next();
              if (localHashSet.contains(localThrowable3))
              {
                localObject2 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                continue;
              }
              localHashSet.add(localThrowable3);
              continue;
            }
          }
        }
      }
      finally
      {
      }
      try
      {
        localObject1.initCause((Throwable)localObject2);
        label170: Throwable localThrowable1 = localObject1.getCause();
        continue;
        this.c = locala1;
        localThrowable1 = this.c;
        AppMethodBeat.o(100494);
        return localThrowable1;
      }
      catch (Throwable localThrowable2)
      {
        break label170;
      }
    }
  }

  public final String getMessage()
  {
    return this.b;
  }

  public final void printStackTrace()
  {
    AppMethodBeat.i(100495);
    printStackTrace(System.err);
    AppMethodBeat.o(100495);
  }

  public final void printStackTrace(PrintStream paramPrintStream)
  {
    AppMethodBeat.i(100496);
    a(new ma.c(paramPrintStream));
    AppMethodBeat.o(100496);
  }

  public final void printStackTrace(PrintWriter paramPrintWriter)
  {
    AppMethodBeat.i(100497);
    a(new ma.d(paramPrintWriter));
    AppMethodBeat.o(100497);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ma
 * JD-Core Version:    0.6.2
 */