package android.arch.lifecycle;

abstract interface FullLifecycleObserver extends LifecycleObserver
{
  public abstract void onCreate(LifecycleOwner paramLifecycleOwner);

  public abstract void onDestroy(LifecycleOwner paramLifecycleOwner);

  public abstract void onPause(LifecycleOwner paramLifecycleOwner);

  public abstract void onResume(LifecycleOwner paramLifecycleOwner);

  public abstract void onStart(LifecycleOwner paramLifecycleOwner);

  public abstract void onStop(LifecycleOwner paramLifecycleOwner);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.FullLifecycleObserver
 * JD-Core Version:    0.6.2
 */