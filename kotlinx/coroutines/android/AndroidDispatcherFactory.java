package kotlinx.coroutines.android;

import a.l;
import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.bj;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "()V", "loadPriority", "", "getLoadPriority", "()I", "createDispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Companion", "kotlinx-coroutines-android"})
@Keep
public final class AndroidDispatcherFactory
{
  public static final AndroidDispatcherFactory.a Companion;

  static
  {
    AppMethodBeat.i(118247);
    Companion = new AndroidDispatcherFactory.a((byte)0);
    AppMethodBeat.o(118247);
  }

  public static final bj getDispatcher()
  {
    return (bj)d.BRd;
  }

  public final bj createDispatcher()
  {
    return (bj)d.BRd;
  }

  public final int getLoadPriority()
  {
    return 2147483647;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.android.AndroidDispatcherFactory
 * JD-Core Version:    0.6.2
 */