package com.tencent.mm.plugin.normsg.b;

import android.os.Handler.Callback;
import android.os.IInterface;
import android.os.Message;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.Map;

final class b$b
  implements Handler.Callback
{
  private final WeakReference<Object> oUJ;
  private final Handler.Callback oUK;

  b$b(b paramb, Object paramObject, Handler.Callback paramCallback)
  {
    AppMethodBeat.i(10395);
    this.oUJ = new WeakReference(paramObject);
    this.oUK = paramCallback;
    AppMethodBeat.o(10395);
  }

  private boolean q(Message paramMessage)
  {
    AppMethodBeat.i(10397);
    boolean bool;
    if (this.oUK != null)
    {
      bool = this.oUK.handleMessage(paramMessage);
      AppMethodBeat.o(10397);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(10397);
    }
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(10396);
    Object localObject = this.oUJ.get();
    boolean bool;
    if (localObject == null)
    {
      ab.e("MicroMsg.AED", "lost viewRootImpl instance, give up intercepting.");
      bool = q(paramMessage);
      AppMethodBeat.o(10396);
    }
    while (true)
    {
      return bool;
      try
      {
        View localView = (View)h.b(localObject, "getView", null, new Object[0]);
        if (localView == null)
        {
          ab.e("MicroMsg.AED", "cannot find root view, give up intercepting.");
          bool = q(paramMessage);
          AppMethodBeat.o(10396);
          continue;
        }
        switch (paramMessage.what)
        {
        default:
          localObject = null;
        case 1:
        case 2:
        case 3:
        case 5:
        case 6:
        case 1020:
        case 4:
        case 1023:
        case 1021:
        case 1022:
        }
        while (true)
        {
          if (localObject != null)
            break label261;
          ab.w("MicroMsg.AED", "callback is null, give up intercepting, op: %s", new Object[] { Integer.valueOf(paramMessage.what) });
          bool = q(paramMessage);
          AppMethodBeat.o(10396);
          break;
          localObject = (IInterface)h.f(paramMessage.obj, "arg1");
          continue;
          localObject = (IInterface)h.f(paramMessage.obj, "arg2");
          continue;
          localObject = (IInterface)paramMessage.obj;
        }
        label261: if ((Proxy.isProxyClass(localObject.getClass())) && ((Proxy.getInvocationHandler(localObject) instanceof b.e)))
        {
          ab.w("MicroMsg.AED", "reused callback, skip rest works.");
          bool = q(paramMessage);
          AppMethodBeat.o(10396);
          continue;
        }
        int i;
        switch (paramMessage.what)
        {
        default:
          localView = null;
          switch (paramMessage.what)
          {
          default:
            i = 0;
          case 1:
          case 2:
          case 4:
          case 6:
          case 1020:
          case 3:
          case 5:
          case 1021:
          case 1022:
          case 1023:
          }
          break;
        case 1022:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 1020:
        case 1021:
        case 1023:
        }
        Integer localInteger;
        while (true)
        {
          localInteger = (Integer)b.c(this.oUG).remove(((IInterface)localObject).asBinder());
          if (localInteger != null)
            break label851;
          ab.w("MicroMsg.AED", "callback %s's binder is unmarked, give up intercept.", new Object[] { localObject.getClass().getName() });
          bool = q(paramMessage);
          AppMethodBeat.o(10396);
          break;
          if (paramMessage.what == 1022);
          for (i = paramMessage.arg1; ; i = 0)
          {
            localView = localView.findViewById(i);
            break;
          }
          switch (paramMessage.what)
          {
          default:
            i = 0;
          case 2:
          case 4:
          case 1020:
          case 1023:
          case 1:
          case 3:
          case 6:
          case 5:
          case 1021:
          }
          while (true)
          {
            localView = (View)h.b(localView, b.bWj(), h.b(new Class[] { Integer.TYPE }), new Object[] { Integer.valueOf(i) });
            break;
            i = ((Integer)h.f(paramMessage.obj, "argi1")).intValue();
            continue;
            i = paramMessage.arg2;
            continue;
            i = ((Integer)h.f(paramMessage.obj, "argi2")).intValue();
            continue;
            i = paramMessage.arg1;
          }
          i = ((Integer)h.f(paramMessage.obj, "argi3")).intValue();
          continue;
          i = ((Integer)h.f(paramMessage.obj, "argi1")).intValue();
          continue;
          i = paramMessage.arg2;
          continue;
          i = ((Integer)h.f(paramMessage.obj, "argi2")).intValue();
        }
        label851: int j = paramMessage.what;
        switch (j)
        {
        default:
        case 1:
        case 1020:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 1021:
        case 1022:
        case 1023:
        }
        while (true)
        {
          label948: bool = q(paramMessage);
          AppMethodBeat.o(10396);
          break;
          switch (paramMessage.what)
          {
          default:
          case 1:
          case 1020:
          }
          for (j = 0; ; j = ((Integer)h.f(paramMessage.obj, "argi2")).intValue())
          {
            if (b.a(this.oUG, j, localInteger.intValue(), localView))
              break label948;
            h.b(localObject, b.bWk(), h.b(new Class[] { Boolean.TYPE, Integer.TYPE }), new Object[] { Boolean.FALSE, Integer.valueOf(i) });
            AppMethodBeat.o(10396);
            bool = true;
            break;
          }
          ClassLoader localClassLoader = b.bWd();
          Class[] arrayOfClass = localObject.getClass().getInterfaces();
          b.b.1 local1 = new com/tencent/mm/plugin/normsg/b/b$b$1;
          local1.<init>(this, (IInterface)localObject, localInteger, localView);
          localObject = (IInterface)Proxy.newProxyInstance(localClassLoader, arrayOfClass, local1);
          switch (paramMessage.what)
          {
          default:
            break;
          case 1:
          case 2:
          case 3:
          case 5:
          case 6:
          case 1020:
            h.b(paramMessage.obj, "arg1", localObject);
          case 4:
          case 1023:
          case 1021:
          case 1022:
          }
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          b.a(this.oUG, localThrowable);
          continue;
          h.b(paramMessage.obj, "arg2", localThrowable);
          continue;
          paramMessage.obj = localThrowable;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.b.b
 * JD-Core Version:    0.6.2
 */