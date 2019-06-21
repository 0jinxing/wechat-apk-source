package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.DexLoader;
import dalvik.system.DexClassLoader;

class bj
{
  protected DexLoader a = null;

  public bj(DexLoader paramDexLoader)
  {
    this.a = paramDexLoader;
  }

  public Object a(Context paramContext)
  {
    AppMethodBeat.i(64679);
    DexLoader localDexLoader = this.a;
    DexClassLoader localDexClassLoader = this.a.getClassLoader();
    paramContext = localDexLoader.newInstance("com.tencent.tbs.player.TbsPlayerProxy", new Class[] { Context.class, DexClassLoader.class }, new Object[] { paramContext, localDexClassLoader });
    AppMethodBeat.o(64679);
    return paramContext;
  }

  public void a(Object paramObject)
  {
    AppMethodBeat.i(64682);
    this.a.invokeMethod(paramObject, "com.tencent.tbs.player.TbsPlayerProxy", "onUserStateChanged", new Class[0], new Object[0]);
    AppMethodBeat.o(64682);
  }

  public void a(Object paramObject, Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(64681);
    this.a.invokeMethod(paramObject, "com.tencent.tbs.player.TbsPlayerProxy", "onActivity", new Class[] { Activity.class, Integer.TYPE }, new Object[] { paramActivity, Integer.valueOf(paramInt) });
    AppMethodBeat.o(64681);
  }

  public boolean a(Object paramObject1, Bundle paramBundle, FrameLayout paramFrameLayout, Object paramObject2)
  {
    AppMethodBeat.i(64680);
    boolean bool;
    if (paramObject2 != null)
    {
      paramObject1 = this.a.invokeMethod(paramObject1, "com.tencent.tbs.player.TbsPlayerProxy", "play", new Class[] { Bundle.class, FrameLayout.class, Object.class }, new Object[] { paramBundle, paramFrameLayout, paramObject2 });
      if (!(paramObject1 instanceof Boolean))
        break label125;
      bool = ((Boolean)paramObject1).booleanValue();
      AppMethodBeat.o(64680);
    }
    while (true)
    {
      return bool;
      paramObject1 = this.a.invokeMethod(paramObject1, "com.tencent.tbs.player.TbsPlayerProxy", "play", new Class[] { Bundle.class, FrameLayout.class }, new Object[] { paramBundle, paramFrameLayout });
      break;
      label125: AppMethodBeat.o(64680);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bj
 * JD-Core Version:    0.6.2
 */