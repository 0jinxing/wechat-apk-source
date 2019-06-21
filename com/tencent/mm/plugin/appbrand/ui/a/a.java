package com.tencent.mm.plugin.appbrand.ui.a;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.ui.MMActivity;

public abstract class a extends ContextWrapper
  implements LifecycleObserver, b
{
  public a(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
  }

  public void N(Intent paramIntent)
  {
  }

  protected final MMActivity aNg()
  {
    return (MMActivity)getBaseContext();
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
  public final void onActivityDidCreateCall()
  {
    N(((MMActivity)getBaseContext()).getIntent());
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
  public void onActivityDidResume()
  {
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
  public void onActivityWillDestroy()
  {
    View localView = ((MMActivity)getBaseContext()).findViewById(16908290);
    if ((localView instanceof ViewGroup))
      com.tencent.mm.plugin.appbrand.widget.j.a.k((ViewGroup)localView);
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
  public void onActivityWillPause()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.a.a
 * JD-Core Version:    0.6.2
 */