package android.arch.lifecycle;

import java.util.List;
import java.util.Map;

class ReflectiveGenericLifecycleObserver
  implements GenericLifecycleObserver
{
  private final Object cM;
  private final ClassesInfoCache.CallbackInfo cN;

  ReflectiveGenericLifecycleObserver(Object paramObject)
  {
    this.cM = paramObject;
    this.cN = ClassesInfoCache.cd.f(this.cM.getClass());
  }

  public void onStateChanged(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
  {
    ClassesInfoCache.CallbackInfo localCallbackInfo = this.cN;
    Object localObject = this.cM;
    ClassesInfoCache.CallbackInfo.a((List)localCallbackInfo.cg.get(paramEvent), paramLifecycleOwner, paramEvent, localObject);
    ClassesInfoCache.CallbackInfo.a((List)localCallbackInfo.cg.get(Lifecycle.Event.ON_ANY), paramLifecycleOwner, paramEvent, localObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.ReflectiveGenericLifecycleObserver
 * JD-Core Version:    0.6.2
 */