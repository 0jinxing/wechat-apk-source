package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicReference;

public class ml
{
  static final mi a;
  private static final ml b;
  private final AtomicReference<mi> c;
  private final AtomicReference<mj> d;
  private final AtomicReference<Object> e;

  static
  {
    AppMethodBeat.i(100518);
    b = new ml();
    a = new ml.1();
    AppMethodBeat.o(100518);
  }

  ml()
  {
    AppMethodBeat.i(100514);
    this.c = new AtomicReference();
    this.d = new AtomicReference();
    this.e = new AtomicReference();
    AppMethodBeat.o(100514);
  }

  public static ml a()
  {
    return b;
  }

  private static Object a(Class<?> paramClass)
  {
    AppMethodBeat.i(100517);
    String str1 = paramClass.getSimpleName();
    String str2 = System.getProperty("rxjava.plugin." + str1 + ".implementation");
    if (str2 != null);
    while (true)
    {
      try
      {
        paramClass = Class.forName(str2).asSubclass(paramClass).newInstance();
        AppMethodBeat.o(100517);
        return paramClass;
      }
      catch (ClassCastException paramClass)
      {
        paramClass = new RuntimeException(str1 + " implementation is not an instance of " + str1 + ": " + str2);
        AppMethodBeat.o(100517);
        throw paramClass;
      }
      catch (ClassNotFoundException paramClass)
      {
        paramClass = new RuntimeException(str1 + " implementation class not found: " + str2, paramClass);
        AppMethodBeat.o(100517);
        throw paramClass;
      }
      catch (InstantiationException paramClass)
      {
        paramClass = new RuntimeException(str1 + " implementation not able to be instantiated: " + str2, paramClass);
        AppMethodBeat.o(100517);
        throw paramClass;
      }
      catch (IllegalAccessException paramClass)
      {
        paramClass = new RuntimeException(str1 + " implementation not able to be accessed: " + str2, paramClass);
        AppMethodBeat.o(100517);
        throw paramClass;
      }
      paramClass = null;
      AppMethodBeat.o(100517);
    }
  }

  public mi b()
  {
    AppMethodBeat.i(100515);
    Object localObject;
    if (this.c.get() == null)
    {
      localObject = a(mi.class);
      if (localObject != null)
        break label55;
      this.c.compareAndSet(null, a);
    }
    while (true)
    {
      localObject = (mi)this.c.get();
      AppMethodBeat.o(100515);
      return localObject;
      label55: this.c.compareAndSet(null, (mi)localObject);
    }
  }

  public mj c()
  {
    AppMethodBeat.i(100516);
    Object localObject;
    if (this.d.get() == null)
    {
      localObject = a(mj.class);
      if (localObject != null)
        break label55;
      this.d.compareAndSet(null, mk.a());
    }
    while (true)
    {
      localObject = (mj)this.d.get();
      AppMethodBeat.o(100516);
      return localObject;
      label55: this.d.compareAndSet(null, (mj)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ml
 * JD-Core Version:    0.6.2
 */