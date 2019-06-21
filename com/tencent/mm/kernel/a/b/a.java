package com.tencent.mm.kernel.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import junit.framework.Assert;

public final class a
{
  private static ThreadLocal<Stack<b>> eLD;

  static
  {
    AppMethodBeat.i(123305);
    eLD = new ThreadLocal();
    AppMethodBeat.o(123305);
  }

  static b So()
  {
    AppMethodBeat.i(123304);
    b localb = (b)((Stack)eLD.get()).pop();
    AppMethodBeat.o(123304);
    return localb;
  }

  public static a a(Object paramObject, Class paramClass)
  {
    AppMethodBeat.i(123302);
    b localb = (b)((Stack)eLD.get()).peek();
    Assert.assertNotNull(localb);
    if (localb.cS == null)
      localb.cS = new HashMap();
    a locala1 = (a)localb.cS.get(paramClass);
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new a(paramObject, paramClass);
      localb.cS.put(locala2.eLE, locala2);
    }
    AppMethodBeat.o(123302);
    return locala2;
  }

  static void start()
  {
    AppMethodBeat.i(123303);
    b localb = new b();
    Stack localStack1 = (Stack)eLD.get();
    Stack localStack2 = localStack1;
    if (localStack1 == null)
    {
      localStack2 = new Stack();
      eLD.set(localStack2);
    }
    localStack2.push(localb);
    AppMethodBeat.o(123303);
  }

  public static final class a
  {
    Object eLA;
    Class eLE;
    Set eLF;

    a(Object paramObject, Class paramClass)
    {
      AppMethodBeat.i(123299);
      this.eLF = new HashSet();
      this.eLA = paramObject;
      if (paramClass != null)
        this.eLE = paramClass;
      aI(this.eLA);
      AppMethodBeat.o(123299);
    }

    private void aI(Object paramObject)
    {
      AppMethodBeat.i(123300);
      Assert.assertNotNull(paramObject);
      Assert.assertNotNull(this.eLE);
      if (!this.eLE.isInstance(paramObject))
      {
        paramObject = new IllegalArgumentException("Your depend object " + paramObject + " must implement your type " + this.eLE);
        AppMethodBeat.o(123300);
        throw paramObject;
      }
      AppMethodBeat.o(123300);
    }

    public final a aJ(Object paramObject)
    {
      AppMethodBeat.i(123301);
      this.eLF.add(paramObject);
      aI(paramObject);
      AppMethodBeat.o(123301);
      return this;
    }
  }

  static final class b
  {
    public HashMap<Class, a.a> cS = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.a.b.a
 * JD-Core Version:    0.6.2
 */