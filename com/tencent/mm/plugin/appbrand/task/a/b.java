package com.tencent.mm.plugin.appbrand.task.a;

import a.f.b.j;
import a.l;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentCallbacks;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.g;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/task/preload/PreloadMemoryStressReceiver;", "Lcom/tencent/mm/plugin/appbrand/utils/ApplicationTrimMemoryListener;", "()V", "onTrimMemory", "", "level", "", "setup", "app", "Landroid/app/Application;", "plugin-appbrand-integration_release"})
public final class b extends g
{
  public static final b iFy;

  static
  {
    AppMethodBeat.i(134973);
    iFy = new b();
    AppMethodBeat.o(134973);
  }

  public static final void e(Application paramApplication)
  {
    AppMethodBeat.i(134971);
    j.p(paramApplication, "app");
    paramApplication.registerComponentCallbacks((ComponentCallbacks)iFy);
    AppMethodBeat.o(134971);
  }

  @SuppressLint({"SwitchIntDef"})
  public final void onTrimMemory(int paramInt)
  {
    AppMethodBeat.i(134972);
    switch (paramInt)
    {
    default:
    case 5:
    case 10:
    case 15:
    }
    while (true)
    {
      AppMethodBeat.o(134972);
      return;
      a.onTrimMemory(paramInt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.a.b
 * JD-Core Version:    0.6.2
 */