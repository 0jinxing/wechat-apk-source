package android.arch.lifecycle;

public abstract interface GenericLifecycleObserver extends LifecycleObserver
{
  public abstract void onStateChanged(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.GenericLifecycleObserver
 * JD-Core Version:    0.6.2
 */