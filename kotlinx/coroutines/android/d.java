package kotlinx.coroutines.android;

import a.f.b.j;
import a.l;
import a.v;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"MAX_DELAY", "", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "MainDispatcher", "choreographer", "Landroid/view/Choreographer;", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postFrameCallback", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "updateChoreographerAndPostFrameCallback", "asCoroutineDispatcher", "name", "", "from", "asHandler", "Landroid/os/Looper;", "async", "", "kotlinx-coroutines-android"})
public final class d
{
  public static final c BRd;
  private static final c BRe;
  private static final Handler awA;

  static
  {
    AppMethodBeat.i(118257);
    Object localObject = Looper.getMainLooper();
    j.o(localObject, "Looper.getMainLooper()");
    awA = m((Looper)localObject);
    localObject = (c)new b(awA, "Main");
    BRd = (c)localObject;
    BRe = (c)localObject;
    AppMethodBeat.o(118257);
  }

  private static Handler m(Looper paramLooper)
  {
    AppMethodBeat.i(118256);
    j.p(paramLooper, "receiver$0");
    if (Build.VERSION.SDK_INT < 16)
    {
      paramLooper = new Handler(paramLooper);
      AppMethodBeat.o(118256);
    }
    while (true)
    {
      return paramLooper;
      if (Build.VERSION.SDK_INT >= 28)
      {
        paramLooper = Handler.class.getDeclaredMethod("createAsync", new Class[] { Looper.class }).invoke(null, new Object[] { paramLooper });
        if (paramLooper == null)
        {
          paramLooper = new v("null cannot be cast to non-null type android.os.Handler");
          AppMethodBeat.o(118256);
          throw paramLooper;
        }
        paramLooper = (Handler)paramLooper;
        AppMethodBeat.o(118256);
      }
      else
      {
        try
        {
          Constructor localConstructor = Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, Boolean.TYPE });
          j.o(localConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
          paramLooper = localConstructor.newInstance(new Object[] { paramLooper, null, Boolean.TRUE });
          j.o(paramLooper, "constructor.newInstance(this, null, true)");
          paramLooper = (Handler)paramLooper;
          AppMethodBeat.o(118256);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          paramLooper = new Handler(paramLooper);
          AppMethodBeat.o(118256);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.android.d
 * JD-Core Version:    0.6.2
 */