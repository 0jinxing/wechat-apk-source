package com.tencent.mm.d.a;

import com.eclipsesource.v8.V8Context;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Value;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class l$10
  implements Runnable
{
  public l$10(l paraml, Object paramObject, String paramString, Class paramClass)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113844);
    l locall = this.chT;
    Object localObject1 = this.bRN;
    String str = this.val$name;
    Object localObject2 = this.cic;
    Object localObject3 = localObject1.getClass();
    Object localObject4 = new ArrayList();
    while (localObject3 != Object.class)
    {
      Iterator localIterator = new ArrayList(Arrays.asList(((Class)localObject3).getDeclaredMethods())).iterator();
      while (localIterator.hasNext())
      {
        Method localMethod = (Method)localIterator.next();
        if ((localObject2 == null) || (localMethod.isAnnotationPresent((Class)localObject2)))
          ((List)localObject4).add(localMethod);
      }
      localObject3 = ((Class)localObject3).getSuperclass();
    }
    localObject3 = locall.CB().newV8Object();
    localObject2 = ((List)localObject4).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = (Method)((Iterator)localObject2).next();
      ((V8Object)localObject3).registerJavaMethod(localObject1, ((Method)localObject4).getName(), ((Method)localObject4).getName(), ((Method)localObject4).getParameterTypes());
    }
    locall.CB().add(str, (V8Value)localObject3);
    ((V8Object)localObject3).release();
    AppMethodBeat.o(113844);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.l.10
 * JD-Core Version:    0.6.2
 */