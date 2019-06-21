package android.arch.lifecycle;

import android.arch.a.a.a;
import android.arch.a.a.c;
import android.arch.a.b.b;
import android.arch.a.b.b.d;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class LiveData<T>
{
  private static final Object cz = new Object();
  private b<Observer<T>, LiveData<T>.ObserverWrapper> cA = new b();
  private int cB = 0;
  private volatile Object cC = cz;
  private int cD = -1;
  private boolean cE;
  private boolean cF;
  private final Runnable cG = new Runnable()
  {
    public void run()
    {
      synchronized (LiveData.a(LiveData.this))
      {
        Object localObject2 = LiveData.b(LiveData.this);
        LiveData.a(LiveData.this, LiveData.al());
        LiveData.this.setValue(localObject2);
        return;
      }
    }
  };
  private final Object cy = new Object();
  private volatile Object mData = cz;

  private void a(LiveData<T>.ObserverWrapper paramLiveData)
  {
    if (!paramLiveData.mActive);
    while (true)
    {
      return;
      if (!paramLiveData.am())
      {
        paramLiveData.m(false);
      }
      else if (paramLiveData.cK < this.cD)
      {
        paramLiveData.cK = this.cD;
        paramLiveData.cJ.onChanged(this.mData);
      }
    }
  }

  private void b(LiveData<T>.ObserverWrapper paramLiveData)
  {
    if (this.cE)
    {
      this.cF = true;
      return;
    }
    this.cE = true;
    LiveData<T>.ObserverWrapper localLiveData = paramLiveData;
    label20: this.cF = false;
    if (localLiveData != null)
    {
      a(localLiveData);
      paramLiveData = null;
    }
    while (true)
    {
      localLiveData = paramLiveData;
      if (this.cF)
        break label20;
      this.cE = false;
      break;
      b.d locald = this.cA.Z();
      do
      {
        paramLiveData = localLiveData;
        if (!locald.hasNext())
          break;
        a((ObserverWrapper)((Map.Entry)locald.next()).getValue());
      }
      while (!this.cF);
      paramLiveData = localLiveData;
    }
  }

  private static void z(String paramString)
  {
    if (!a.Y().bM.isMainThread())
      throw new IllegalStateException("Cannot invoke " + paramString + " on a background thread");
  }

  protected void ag()
  {
  }

  public T getValue()
  {
    Object localObject = this.mData;
    if (localObject != cz);
    while (true)
    {
      return localObject;
      localObject = null;
    }
  }

  public boolean hasActiveObservers()
  {
    if (this.cB > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean hasObservers()
  {
    if (this.cA.mSize > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void observe(LifecycleOwner paramLifecycleOwner, Observer<T> paramObserver)
  {
    if (paramLifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED);
    while (true)
    {
      return;
      LifecycleBoundObserver localLifecycleBoundObserver = new LifecycleBoundObserver(paramLifecycleOwner, paramObserver);
      paramObserver = (ObserverWrapper)this.cA.putIfAbsent(paramObserver, localLifecycleBoundObserver);
      if ((paramObserver != null) && (!paramObserver.c(paramLifecycleOwner)))
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
      if (paramObserver == null)
        paramLifecycleOwner.getLifecycle().addObserver(localLifecycleBoundObserver);
    }
  }

  public void observeForever(Observer<T> paramObserver)
  {
    AlwaysActiveObserver localAlwaysActiveObserver = new AlwaysActiveObserver(paramObserver);
    paramObserver = (ObserverWrapper)this.cA.putIfAbsent(paramObserver, localAlwaysActiveObserver);
    if ((paramObserver != null) && ((paramObserver instanceof LifecycleBoundObserver)))
      throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    if (paramObserver != null);
    while (true)
    {
      return;
      localAlwaysActiveObserver.m(true);
    }
  }

  protected void onActive()
  {
  }

  protected void postValue(T paramT)
  {
    while (true)
    {
      synchronized (this.cy)
      {
        int i;
        if (this.cC == cz)
        {
          i = 1;
          this.cC = paramT;
          if (i != 0);
        }
        else
        {
          i = 0;
        }
      }
      a.Y().d(this.cG);
    }
  }

  public void removeObserver(Observer<T> paramObserver)
  {
    z("removeObserver");
    paramObserver = (ObserverWrapper)this.cA.remove(paramObserver);
    if (paramObserver == null);
    while (true)
    {
      return;
      paramObserver.an();
      paramObserver.m(false);
    }
  }

  public void removeObservers(LifecycleOwner paramLifecycleOwner)
  {
    z("removeObservers");
    Iterator localIterator = this.cA.iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((ObserverWrapper)localEntry.getValue()).c(paramLifecycleOwner))
        removeObserver((Observer)localEntry.getKey());
    }
  }

  protected void setValue(T paramT)
  {
    z("setValue");
    this.cD += 1;
    this.mData = paramT;
    b(null);
  }

  class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper
  {
    AlwaysActiveObserver()
    {
      super(localObserver);
    }

    final boolean am()
    {
      return true;
    }
  }

  class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper
    implements GenericLifecycleObserver
  {
    final LifecycleOwner cI;

    LifecycleBoundObserver(Observer<T> arg2)
    {
      super(localObserver);
      Object localObject;
      this.cI = localObject;
    }

    final boolean am()
    {
      return this.cI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
    }

    final void an()
    {
      this.cI.getLifecycle().removeObserver(this);
    }

    final boolean c(LifecycleOwner paramLifecycleOwner)
    {
      if (this.cI == paramLifecycleOwner);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public void onStateChanged(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
    {
      if (this.cI.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED)
        LiveData.this.removeObserver(this.cJ);
      while (true)
      {
        return;
        m(am());
      }
    }
  }

  abstract class ObserverWrapper
  {
    final Observer<T> cJ;
    int cK = -1;
    boolean mActive;

    ObserverWrapper()
    {
      Object localObject;
      this.cJ = localObject;
    }

    abstract boolean am();

    void an()
    {
    }

    boolean c(LifecycleOwner paramLifecycleOwner)
    {
      return false;
    }

    final void m(boolean paramBoolean)
    {
      int i = 1;
      if (paramBoolean == this.mActive)
        return;
      this.mActive = paramBoolean;
      int j;
      label28: LiveData localLiveData;
      int k;
      if (LiveData.c(LiveData.this) == 0)
      {
        j = 1;
        localLiveData = LiveData.this;
        k = LiveData.c(localLiveData);
        if (!this.mActive)
          break label123;
      }
      while (true)
      {
        LiveData.a(localLiveData, i + k);
        if ((j != 0) && (this.mActive))
          LiveData.this.onActive();
        if ((LiveData.c(LiveData.this) == 0) && (!this.mActive))
          LiveData.this.ag();
        if (!this.mActive)
          break;
        LiveData.a(LiveData.this, this);
        break;
        j = 0;
        break label28;
        label123: i = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.LiveData
 * JD-Core Version:    0.6.2
 */