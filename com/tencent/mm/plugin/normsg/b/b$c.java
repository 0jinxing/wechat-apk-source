package com.tencent.mm.plugin.normsg.b;

import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.IInterface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

final class b$c extends b.e
{
  private InvocationHandler oUO;

  b$c(b paramb, IInterface paramIInterface)
  {
    super(paramb, paramIInterface);
    AppMethodBeat.i(10399);
    this.oUO = new InvocationHandler()
    {
      public final Object invoke(Object paramAnonymousObject, Method paramAnonymousMethod, Object[] paramAnonymousArrayOfObject)
      {
        AppMethodBeat.i(10398);
        while (true)
        {
          synchronized (b.c.this.oUG)
          {
            paramAnonymousObject = paramAnonymousMethod.getName();
            if (b.biF().equals(paramAnonymousObject))
            {
              paramAnonymousObject = b.b(b.c.this.oUG);
              AppMethodBeat.o(10398);
              return paramAnonymousObject;
            }
          }
          try
          {
            paramAnonymousObject = paramAnonymousMethod.invoke(b.c.this.oUR.asBinder(), paramAnonymousArrayOfObject);
            AppMethodBeat.o(10398);
          }
          catch (InvocationTargetException paramAnonymousObject)
          {
            paramAnonymousObject = paramAnonymousObject.getTargetException();
            paramAnonymousArrayOfObject = paramAnonymousMethod.getExceptionTypes();
            if ((paramAnonymousArrayOfObject != null) && (paramAnonymousArrayOfObject.length > 0))
            {
              paramAnonymousArrayOfObject = paramAnonymousMethod.getExceptionTypes();
              int i = paramAnonymousArrayOfObject.length;
              for (int j = 0; j < i; j++)
                if (paramAnonymousArrayOfObject[j].isAssignableFrom(paramAnonymousObject.getClass()))
                {
                  AppMethodBeat.o(10398);
                  throw paramAnonymousObject;
                  paramAnonymousObject = finally;
                  AppMethodBeat.o(10398);
                  throw paramAnonymousObject;
                }
            }
            b.a(b.c.this.oUG, paramAnonymousObject);
            paramAnonymousObject = b.c(paramAnonymousMethod);
            AppMethodBeat.o(10398);
          }
          catch (Throwable paramAnonymousObject)
          {
            b.a(b.c.this.oUG, paramAnonymousObject);
            paramAnonymousObject = b.c(paramAnonymousMethod);
            AppMethodBeat.o(10398);
          }
        }
      }
    };
    AppMethodBeat.o(10399);
  }

  public final IBinder asBinder()
  {
    AppMethodBeat.i(10401);
    Object localObject = b.bWd();
    InvocationHandler localInvocationHandler = this.oUO;
    localObject = (IBinder)Proxy.newProxyInstance((ClassLoader)localObject, new Class[] { IBinder.class }, localInvocationHandler);
    AppMethodBeat.o(10401);
    return localObject;
  }

  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(10400);
    Object localObject1;
    Object localObject2;
    if ((b.access$100().equals(paramMethod.getName())) && (paramArrayOfObject != null) && (paramArrayOfObject.length >= 2))
    {
      localObject1 = paramArrayOfObject[1];
      try
      {
        if (!h.findClass(b.access$200()).isAssignableFrom(localObject1.getClass()))
        {
          localObject2 = new java/lang/IllegalStateException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("mismatched conn class: ");
          ((IllegalStateException)localObject2).<init>(localObject1.getClass() + ", give up intercepting.");
          AppMethodBeat.o(10400);
          throw ((Throwable)localObject2);
        }
      }
      catch (Throwable localThrowable)
      {
        ab.printErrStackTrace("MicroMsg.AED", localThrowable, "unexpected exception.", new Object[0]);
        b.a(this.oUG, localThrowable);
        paramArrayOfObject[1] = localObject1;
      }
    }
    WeakReference localWeakReference;
    while (true)
    {
      paramObject = super.invoke(paramObject, paramMethod, paramArrayOfObject);
      AppMethodBeat.o(10400);
      return paramObject;
      localWeakReference = (WeakReference)h.f(localObject1, b.access$300());
      localObject2 = localWeakReference.get();
      if (localObject2 != null)
        break;
      ab.e("MicroMsg.AED", "lost viewRootImpl instance, give up intercepting.");
    }
    if (Build.VERSION.SDK_INT < 16);
    Object localObject5;
    for (Object localObject3 = localObject2; ; localObject5 = h.f(h.b(localObject2, b.access$600(), null, new Object[0]), "mHandler"))
      while (true)
      {
        Handler.Callback localCallback = (Handler.Callback)h.f(localObject3, b.access$700());
        Object localObject6;
        if (!(localCallback instanceof b.b))
        {
          localObject6 = b.access$700();
          ??? = new com/tencent/mm/plugin/normsg/b/b$b;
          ((b.b)???).<init>(this.oUG, localObject2, localCallback);
          h.b(localObject3, (String)localObject6, ???);
        }
        synchronized (b.a(this.oUG))
        {
          localObject6 = (IBinder)b.a(this.oUG).get(localObject2);
          localObject3 = localObject6;
          if (localObject6 == null)
          {
            localObject6 = ((IInterface)localObject1).asBinder();
            localObject3 = new com/tencent/mm/plugin/normsg/b/b$a;
            ((b.a)localObject3).<init>(this.oUG, localWeakReference.get(), (IBinder)localObject6);
            b.a(this.oUG).put(localObject2, localObject3);
          }
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramArrayOfObject[1] = ((IInterface)h.a(b.access$200() + "$Stub", "asInterface", h.b(new Class[] { IBinder.class }), new Object[] { localObject3 }));
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.b.c
 * JD-Core Version:    0.6.2
 */