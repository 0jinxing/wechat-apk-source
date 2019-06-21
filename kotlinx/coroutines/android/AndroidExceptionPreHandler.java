package kotlinx.coroutines.android;

import a.c.e;
import a.c.e.c;
import a.f.b.j;
import a.l;
import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import kotlinx.coroutines.x;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "()V", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-android"})
@Keep
public final class AndroidExceptionPreHandler extends a.c.a
  implements x
{
  public AndroidExceptionPreHandler()
  {
    super((e.c)x.BPJ);
    AppMethodBeat.i(118260);
    AppMethodBeat.o(118260);
  }

  public final void handleException(e parame, Throwable paramThrowable)
  {
    AppMethodBeat.i(118259);
    j.p(parame, "context");
    j.p(paramThrowable, "exception");
    parame = a.elD();
    if (parame != null)
    {
      parame = parame.invoke(null, new Object[0]);
      e locale = parame;
      if (!(parame instanceof Thread.UncaughtExceptionHandler))
        locale = null;
      parame = (Thread.UncaughtExceptionHandler)locale;
      if (parame == null)
        break label76;
      parame.uncaughtException(Thread.currentThread(), paramThrowable);
      AppMethodBeat.o(118259);
    }
    while (true)
    {
      return;
      parame = null;
      break;
      label76: AppMethodBeat.o(118259);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.android.AndroidExceptionPreHandler
 * JD-Core Version:    0.6.2
 */