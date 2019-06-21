package com.tencent.mm.plugin.appbrand.launching;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandPreInitTask$2
  implements Runnable
{
  AppBrandPreInitTask$2(AppBrandPreInitTask paramAppBrandPreInitTask, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131719);
    this.ifM.run();
    Looper.myLooper().quit();
    AppMethodBeat.o(131719);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask.2
 * JD-Core Version:    0.6.2
 */