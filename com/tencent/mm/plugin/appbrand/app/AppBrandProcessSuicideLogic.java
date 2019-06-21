package com.tencent.mm.plugin.appbrand.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.a;
import com.tencent.mm.sdk.g.d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class AppBrandProcessSuicideLogic extends a
{
  private static final AppBrandProcessSuicideLogic gQS;
  private final AtomicInteger gQT;
  private final AtomicBoolean gQU;

  static
  {
    AppMethodBeat.i(129207);
    gQS = new AppBrandProcessSuicideLogic();
    AppMethodBeat.o(129207);
  }

  private AppBrandProcessSuicideLogic()
  {
    AppMethodBeat.i(129203);
    this.gQT = new AtomicInteger(0);
    this.gQU = new AtomicBoolean();
    AppMethodBeat.o(129203);
  }

  public static void auG()
  {
    AppMethodBeat.i(138692);
    gQS.gQU.set(true);
    AppMethodBeat.o(138692);
  }

  public static void e(Application paramApplication)
  {
    AppMethodBeat.i(129202);
    paramApplication.registerActivityLifecycleCallbacks(gQS);
    AppMethodBeat.o(129202);
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(129204);
    this.gQU.set(false);
    this.gQT.incrementAndGet();
    AppMethodBeat.o(129204);
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
    AppMethodBeat.i(129205);
    if (this.gQT.decrementAndGet() == 0)
      d.post(new AppBrandProcessSuicideLogic.1(this, paramActivity.getClass()), "CleanupWhenNoActivitiesAliveInAppBrandProcess");
    AppMethodBeat.o(129205);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic
 * JD-Core Version:    0.6.2
 */