package android.arch.lifecycle;

public class CompositeGeneratedAdaptersObserver
  implements GenericLifecycleObserver
{
  private final GeneratedAdapter[] cj;

  CompositeGeneratedAdaptersObserver(GeneratedAdapter[] paramArrayOfGeneratedAdapter)
  {
    this.cj = paramArrayOfGeneratedAdapter;
  }

  public void onStateChanged(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
  {
    int i = 0;
    MethodCallsLogger localMethodCallsLogger = new MethodCallsLogger();
    GeneratedAdapter[] arrayOfGeneratedAdapter = this.cj;
    int j = arrayOfGeneratedAdapter.length;
    for (int k = 0; k < j; k++)
      arrayOfGeneratedAdapter[k].callMethods(paramLifecycleOwner, paramEvent, false, localMethodCallsLogger);
    arrayOfGeneratedAdapter = this.cj;
    j = arrayOfGeneratedAdapter.length;
    for (k = i; k < j; k++)
      arrayOfGeneratedAdapter[k].callMethods(paramLifecycleOwner, paramEvent, true, localMethodCallsLogger);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.CompositeGeneratedAdaptersObserver
 * JD-Core Version:    0.6.2
 */