package android.arch.lifecycle;

import android.arch.a.b.a;
import android.arch.a.b.b;
import android.arch.a.b.b.b;
import android.arch.a.b.b.c;
import android.arch.a.b.b.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class LifecycleRegistry extends Lifecycle
{
  private a<LifecycleObserver, ObserverWithState> cm = new a();
  private Lifecycle.State cn;
  private final WeakReference<LifecycleOwner> co;
  private int cp = 0;
  private boolean cq = false;
  private boolean cs = false;
  private ArrayList<Lifecycle.State> ct = new ArrayList();

  public LifecycleRegistry(LifecycleOwner paramLifecycleOwner)
  {
    this.co = new WeakReference(paramLifecycleOwner);
    this.cn = Lifecycle.State.INITIALIZED;
  }

  static Lifecycle.State a(Lifecycle.Event paramEvent)
  {
    switch (1.cl[paramEvent.ordinal()])
    {
    default:
      throw new IllegalArgumentException("Unexpected event value ".concat(String.valueOf(paramEvent)));
    case 1:
    case 2:
      paramEvent = Lifecycle.State.CREATED;
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      return paramEvent;
      paramEvent = Lifecycle.State.STARTED;
      continue;
      paramEvent = Lifecycle.State.RESUMED;
      continue;
      paramEvent = Lifecycle.State.DESTROYED;
    }
  }

  static Lifecycle.State a(Lifecycle.State paramState1, Lifecycle.State paramState2)
  {
    if ((paramState2 != null) && (paramState2.compareTo(paramState1) < 0))
      paramState1 = paramState2;
    while (true)
      return paramState1;
  }

  private Lifecycle.State a(LifecycleObserver paramLifecycleObserver)
  {
    Object localObject = this.cm;
    if (((a)localObject).contains(paramLifecycleObserver))
    {
      paramLifecycleObserver = ((b.c)((a)localObject).bR.get(paramLifecycleObserver)).bX;
      if (paramLifecycleObserver == null)
        break label93;
      paramLifecycleObserver = ((ObserverWithState)paramLifecycleObserver.getValue()).cn;
      label45: if (this.ct.isEmpty())
        break label98;
    }
    label93: label98: for (localObject = (Lifecycle.State)this.ct.get(this.ct.size() - 1); ; localObject = null)
    {
      return a(a(this.cn, paramLifecycleObserver), (Lifecycle.State)localObject);
      paramLifecycleObserver = null;
      break;
      paramLifecycleObserver = null;
      break label45;
    }
  }

  private void a(Lifecycle.State paramState)
  {
    if (this.cn == paramState);
    while (true)
    {
      return;
      this.cn = paramState;
      if ((this.cq) || (this.cp != 0))
      {
        this.cs = true;
      }
      else
      {
        this.cq = true;
        sync();
        this.cq = false;
      }
    }
  }

  private void a(LifecycleOwner paramLifecycleOwner)
  {
    b.d locald = this.cm.Z();
    while ((locald.hasNext()) && (!this.cs))
    {
      Map.Entry localEntry = (Map.Entry)locald.next();
      ObserverWithState localObserverWithState = (ObserverWithState)localEntry.getValue();
      while ((localObserverWithState.cn.compareTo(this.cn) < 0) && (!this.cs) && (this.cm.contains(localEntry.getKey())))
      {
        b(localObserverWithState.cn);
        localObserverWithState.a(paramLifecycleOwner, c(localObserverWithState.cn));
        af();
      }
    }
  }

  private boolean ad()
  {
    boolean bool;
    if (this.cm.mSize == 0)
      bool = true;
    while (true)
    {
      return bool;
      Lifecycle.State localState1 = ((ObserverWithState)this.cm.bS.getValue()).cn;
      Lifecycle.State localState2 = ((ObserverWithState)this.cm.bT.getValue()).cn;
      if ((localState1 == localState2) && (this.cn == localState2))
        bool = true;
      else
        bool = false;
    }
  }

  private void af()
  {
    this.ct.remove(this.ct.size() - 1);
  }

  private void b(Lifecycle.State paramState)
  {
    this.ct.add(paramState);
  }

  private void b(LifecycleOwner paramLifecycleOwner)
  {
    Object localObject = this.cm;
    b.b localb = new b.b(((b)localObject).bT, ((b)localObject).bS);
    ((b)localObject).bU.put(localb, Boolean.FALSE);
    while ((localb.hasNext()) && (!this.cs))
    {
      Map.Entry localEntry = (Map.Entry)localb.next();
      ObserverWithState localObserverWithState = (ObserverWithState)localEntry.getValue();
      if ((localObserverWithState.cn.compareTo(this.cn) > 0) && (!this.cs) && (this.cm.contains(localEntry.getKey())))
      {
        localObject = localObserverWithState.cn;
        switch (1.cu[localObject.ordinal()])
        {
        default:
          throw new IllegalArgumentException("Unexpected state value ".concat(String.valueOf(localObject)));
        case 1:
          throw new IllegalArgumentException();
        case 2:
          localObject = Lifecycle.Event.ON_DESTROY;
        case 3:
        case 4:
          while (true)
          {
            b(a((Lifecycle.Event)localObject));
            localObserverWithState.a(paramLifecycleOwner, (Lifecycle.Event)localObject);
            af();
            break;
            localObject = Lifecycle.Event.ON_STOP;
            continue;
            localObject = Lifecycle.Event.ON_PAUSE;
          }
        case 5:
        }
        throw new IllegalArgumentException();
      }
    }
  }

  private static Lifecycle.Event c(Lifecycle.State paramState)
  {
    switch (1.cu[paramState.ordinal()])
    {
    default:
      throw new IllegalArgumentException("Unexpected state value ".concat(String.valueOf(paramState)));
    case 1:
    case 5:
      paramState = Lifecycle.Event.ON_CREATE;
    case 2:
    case 3:
      while (true)
      {
        return paramState;
        paramState = Lifecycle.Event.ON_START;
        continue;
        paramState = Lifecycle.Event.ON_RESUME;
      }
    case 4:
    }
    throw new IllegalArgumentException();
  }

  private void sync()
  {
    LifecycleOwner localLifecycleOwner = (LifecycleOwner)this.co.get();
    if (localLifecycleOwner == null);
    while (true)
    {
      return;
      while (!ad())
      {
        this.cs = false;
        if (this.cn.compareTo(((ObserverWithState)this.cm.bS.getValue()).cn) < 0)
          b(localLifecycleOwner);
        b.c localc = this.cm.bT;
        if ((!this.cs) && (localc != null) && (this.cn.compareTo(((ObserverWithState)localc.getValue()).cn) > 0))
          a(localLifecycleOwner);
      }
      this.cs = false;
    }
  }

  public void addObserver(LifecycleObserver paramLifecycleObserver)
  {
    Lifecycle.State localState;
    ObserverWithState localObserverWithState;
    if (this.cn == Lifecycle.State.DESTROYED)
    {
      localState = Lifecycle.State.DESTROYED;
      localObserverWithState = new ObserverWithState(paramLifecycleObserver, localState);
      if ((ObserverWithState)this.cm.putIfAbsent(paramLifecycleObserver, localObserverWithState) == null)
        break label47;
    }
    while (true)
    {
      return;
      localState = Lifecycle.State.INITIALIZED;
      break;
      label47: LifecycleOwner localLifecycleOwner = (LifecycleOwner)this.co.get();
      if (localLifecycleOwner != null)
      {
        if ((this.cp != 0) || (this.cq));
        for (int i = 1; ; i = 0)
        {
          localState = a(paramLifecycleObserver);
          this.cp += 1;
          while ((localObserverWithState.cn.compareTo(localState) < 0) && (this.cm.contains(paramLifecycleObserver)))
          {
            b(localObserverWithState.cn);
            localObserverWithState.a(localLifecycleOwner, c(localObserverWithState.cn));
            af();
            localState = a(paramLifecycleObserver);
          }
        }
        if (i == 0)
          sync();
        this.cp -= 1;
      }
    }
  }

  public Lifecycle.State getCurrentState()
  {
    return this.cn;
  }

  public int getObserverCount()
  {
    return this.cm.mSize;
  }

  public void handleLifecycleEvent(Lifecycle.Event paramEvent)
  {
    a(a(paramEvent));
  }

  public void markState(Lifecycle.State paramState)
  {
    a(paramState);
  }

  public void removeObserver(LifecycleObserver paramLifecycleObserver)
  {
    this.cm.remove(paramLifecycleObserver);
  }

  static class ObserverWithState
  {
    Lifecycle.State cn;
    GenericLifecycleObserver cv;

    ObserverWithState(LifecycleObserver paramLifecycleObserver, Lifecycle.State paramState)
    {
      this.cv = Lifecycling.e(paramLifecycleObserver);
      this.cn = paramState;
    }

    final void a(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
    {
      Lifecycle.State localState = LifecycleRegistry.a(paramEvent);
      this.cn = LifecycleRegistry.a(this.cn, localState);
      this.cv.onStateChanged(paramLifecycleOwner, paramEvent);
      this.cn = localState;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.LifecycleRegistry
 * JD-Core Version:    0.6.2
 */