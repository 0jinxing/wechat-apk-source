package android.arch.lifecycle;

class FullLifecycleObserverAdapter
  implements GenericLifecycleObserver
{
  private final FullLifecycleObserver ck;

  FullLifecycleObserverAdapter(FullLifecycleObserver paramFullLifecycleObserver)
  {
    this.ck = paramFullLifecycleObserver;
  }

  public void onStateChanged(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
  {
    switch (1.cl[paramEvent.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
      while (true)
      {
        return;
        this.ck.onCreate(paramLifecycleOwner);
        continue;
        this.ck.onStart(paramLifecycleOwner);
        continue;
        this.ck.onResume(paramLifecycleOwner);
        continue;
        this.ck.onPause(paramLifecycleOwner);
        continue;
        this.ck.onStop(paramLifecycleOwner);
        continue;
        this.ck.onDestroy(paramLifecycleOwner);
      }
    case 7:
    }
    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.FullLifecycleObserverAdapter
 * JD-Core Version:    0.6.2
 */