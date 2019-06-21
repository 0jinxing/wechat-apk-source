package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.y;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ar
  implements InvocationHandler
{
  private final Map<String, Method> gUD;
  private final ar.b gUE;

  private ar(u paramu)
  {
    AppMethodBeat.i(86810);
    this.gUD = new ConcurrentHashMap();
    this.gUE = new ar.b(paramu, (byte)0);
    AppMethodBeat.o(86810);
  }

  private static Object a(Method paramMethod)
  {
    AppMethodBeat.i(86808);
    if (paramMethod.getReturnType().equals(j.class))
    {
      paramMethod = j.gXE;
      AppMethodBeat.o(86808);
    }
    while (true)
    {
      return paramMethod;
      paramMethod = null;
      AppMethodBeat.o(86808);
    }
  }

  private Method b(Method paramMethod)
  {
    AppMethodBeat.i(86809);
    String str = paramMethod.toGenericString();
    Method localMethod1 = (Method)this.gUD.get(str);
    Method localMethod2 = localMethod1;
    if (localMethod1 == null)
    {
      paramMethod = y.class.getMethod(paramMethod.getName(), paramMethod.getParameterTypes());
      localMethod2 = paramMethod;
      if (paramMethod != null)
      {
        this.gUD.put(str, paramMethod);
        localMethod2 = paramMethod;
      }
    }
    AppMethodBeat.o(86809);
    return localMethod2;
  }

  public static IWxaFileSystemWithModularizing o(i parami)
  {
    AppMethodBeat.i(86806);
    try
    {
      ar localar = new com/tencent/mm/plugin/appbrand/appcache/ar;
      localar.<init>(aw.q(parami));
      parami = (IWxaFileSystemWithModularizing)Proxy.newProxyInstance(IWxaFileSystemWithModularizing.class.getClassLoader(), new Class[] { IWxaFileSystemWithModularizing.class }, localar);
      AppMethodBeat.o(86806);
      return parami;
    }
    catch (Exception parami)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.WxaPkgFileSystemWithModuleInvokeAdapter", "createInstance e=%s", new Object[] { parami });
        parami = new ar.a((byte)0);
        AppMethodBeat.o(86806);
      }
    }
  }

  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(86807);
    if (paramMethod.getReturnType().equals(Boolean.TYPE))
    {
      paramObject = Boolean.TRUE;
      AppMethodBeat.o(86807);
    }
    while (true)
    {
      return paramObject;
      if (Modifier.isStatic(paramMethod.getModifiers()))
      {
        AppMethodBeat.o(86807);
        paramObject = null;
      }
      else
      {
        Object localObject;
        if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0) && ((paramArrayOfObject[0] instanceof String)))
        {
          paramObject = this.gUE.xA((String)paramArrayOfObject[0]);
          if (paramObject == null)
          {
            paramObject = a(paramMethod);
            AppMethodBeat.o(86807);
          }
          else if (paramMethod.getReturnType().equals(ao.class))
          {
            paramObject = paramObject.gTI;
            AppMethodBeat.o(86807);
          }
          else
          {
            localObject = b(paramMethod);
            if (localObject != null)
            {
              paramObject = ((Method)localObject).invoke(paramObject, paramArrayOfObject);
              AppMethodBeat.o(86807);
            }
          }
        }
        else if (paramMethod.getReturnType().equals(Void.TYPE))
        {
          localObject = this.gUE.awi();
          if (localObject != null)
          {
            paramObject = b(paramMethod);
            if (paramObject != null)
            {
              paramMethod = ((Collection)localObject).iterator();
              while (paramMethod.hasNext())
                paramObject.invoke((y)paramMethod.next(), paramArrayOfObject);
            }
          }
          AppMethodBeat.o(86807);
          paramObject = null;
        }
        else
        {
          paramObject = a(paramMethod);
          AppMethodBeat.o(86807);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ar
 * JD-Core Version:    0.6.2
 */