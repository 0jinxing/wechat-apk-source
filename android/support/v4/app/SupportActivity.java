package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.ReportFragment;
import android.os.Bundle;
import android.support.v4.f.m;

public class SupportActivity extends Activity
  implements LifecycleOwner
{
  private m<Class<? extends a>, a> mExtraDataMap = new m();
  private LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);

  public <T extends a> T getExtraData(Class<T> paramClass)
  {
    return (a)this.mExtraDataMap.get(paramClass);
  }

  public Lifecycle getLifecycle()
  {
    return this.mLifecycleRegistry;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ReportFragment.injectIfNeededIn(this);
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    this.mLifecycleRegistry.markState(Lifecycle.State.CREATED);
    super.onSaveInstanceState(paramBundle);
  }

  public void putExtraData(a parama)
  {
    this.mExtraDataMap.put(parama.getClass(), parama);
  }

  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.SupportActivity
 * JD-Core Version:    0.6.2
 */