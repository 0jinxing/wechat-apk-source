package android.arch.lifecycle;

public class SingleGeneratedAdapterObserver
  implements GenericLifecycleObserver
{
  private final GeneratedAdapter cP;

  SingleGeneratedAdapterObserver(GeneratedAdapter paramGeneratedAdapter)
  {
    this.cP = paramGeneratedAdapter;
  }

  public void onStateChanged(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
  {
    this.cP.callMethods(paramLifecycleOwner, paramEvent, false, null);
    this.cP.callMethods(paramLifecycleOwner, paramEvent, true, null);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.SingleGeneratedAdapterObserver
 * JD-Core Version:    0.6.2
 */