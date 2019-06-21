package kotlinx.coroutines.android;

import a.f.b.j;
import a.l;
import a.y;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.i;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", "name", "", "(Landroid/os/Handler;Ljava/lang/String;)V", "invokeImmediately", "", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "_immediate", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "isDispatchNeeded", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "kotlinx-coroutines-android"})
public final class b extends c
  implements aj
{
  private volatile b BQX;
  private final b BQY;
  private final boolean BQZ;
  private final Handler handler;
  private final String name;

  public b(Handler paramHandler, String paramString)
  {
    this(paramHandler, paramString, false);
    AppMethodBeat.i(118254);
    AppMethodBeat.o(118254);
  }

  private b(Handler paramHandler, String paramString, boolean paramBoolean)
  {
    super((byte)0);
    AppMethodBeat.i(118253);
    this.handler = paramHandler;
    this.name = paramString;
    this.BQZ = paramBoolean;
    if (this.BQZ);
    for (paramHandler = this; ; paramHandler = null)
    {
      this.BQX = paramHandler;
      paramString = this.BQX;
      paramHandler = paramString;
      if (paramString == null)
      {
        paramHandler = new b(this.handler, this.name, true);
        this.BQX = paramHandler;
      }
      this.BQY = paramHandler;
      AppMethodBeat.o(118253);
      return;
    }
  }

  public final void a(a.c.e parame, Runnable paramRunnable)
  {
    AppMethodBeat.i(118249);
    j.p(parame, "context");
    j.p(paramRunnable, "block");
    this.handler.post(paramRunnable);
    AppMethodBeat.o(118249);
  }

  public final void a(i<? super y> parami)
  {
    AppMethodBeat.i(118250);
    j.p(parami, "continuation");
    Runnable localRunnable = (Runnable)new b.a(this, parami);
    this.handler.postDelayed(localRunnable, a.h.e.aj(1000L, 4611686018427387903L));
    parami.h((a.f.a.b)new b.b(this, localRunnable));
    AppMethodBeat.o(118250);
  }

  public final boolean b(a.c.e parame)
  {
    AppMethodBeat.i(118248);
    j.p(parame, "context");
    boolean bool;
    if ((!this.BQZ) || ((j.j(Looper.myLooper(), this.handler.getLooper()) ^ true)))
    {
      bool = true;
      AppMethodBeat.o(118248);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118248);
    }
  }

  public final boolean equals(Object paramObject)
  {
    if (((paramObject instanceof b)) && (((b)paramObject).handler == this.handler));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(118252);
    int i = System.identityHashCode(this.handler);
    AppMethodBeat.o(118252);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(118251);
    String str;
    if (this.name != null)
      if (this.BQZ)
      {
        str = this.name + " [immediate]";
        AppMethodBeat.o(118251);
      }
    while (true)
    {
      return str;
      str = this.name;
      AppMethodBeat.o(118251);
      continue;
      str = this.handler.toString();
      j.o(str, "handler.toString()");
      AppMethodBeat.o(118251);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.android.b
 * JD-Core Version:    0.6.2
 */