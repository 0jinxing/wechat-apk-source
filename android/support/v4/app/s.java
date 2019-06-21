package android.support.v4.app;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProvider.Factory;
import android.arch.lifecycle.ViewModelStore;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.content.c;
import android.support.v4.content.c.b;
import android.support.v4.f.d;
import android.support.v4.f.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class s extends r
{
  static boolean DEBUG = false;
  private final LifecycleOwner Eq;
  final c Er;
  private boolean Es;

  s(LifecycleOwner paramLifecycleOwner, ViewModelStore paramViewModelStore)
  {
    this.Eq = paramLifecycleOwner;
    this.Er = c.a(paramViewModelStore);
  }

  private <D> c<D> b(r.a<D> parama)
  {
    Object localObject;
    try
    {
      this.Es = true;
      localObject = parama.onCreateLoader(0, null);
      if ((localObject.getClass().isMemberClass()) && (!Modifier.isStatic(localObject.getClass().getModifiers())))
      {
        parama = new java/lang/IllegalArgumentException;
        parama.<init>("Object returned from onCreateLoader must not be a non-static inner member class: ".concat(String.valueOf(localObject)));
        throw parama;
      }
    }
    finally
    {
      this.Es = false;
    }
    a locala = new android/support/v4/app/s$a;
    locala.<init>((c)localObject);
    if (DEBUG)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("  Created new loader ");
      ((StringBuilder)localObject).append(locala);
    }
    this.Er.EA.put(0, locala);
    this.Es = false;
    return locala.a(this.Eq, parama);
  }

  public final <D> c<D> a(r.a<D> parama)
  {
    if (this.Es)
      throw new IllegalStateException("Called while creating a loader");
    if (Looper.getMainLooper() != Looper.myLooper())
      throw new IllegalStateException("initLoader must be called on the main thread");
    a locala = (a)this.Er.EA.aH(0);
    if (DEBUG)
      new StringBuilder("initLoader in ").append(this).append(": args=").append(null);
    if (locala == null);
    for (parama = b(parama); ; parama = locala.a(this.Eq, parama))
    {
      return parama;
      if (DEBUG)
        new StringBuilder("  Re-using existing loader ").append(locala);
    }
  }

  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.Er.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    d.a(this.Eq, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }

  public static final class a<D> extends MutableLiveData<D>
    implements c.b<D>
  {
    private LifecycleOwner Eq;
    private final Bundle Et = null;
    final c<D> Eu;
    s.b<D> Ev;
    c<D> Ew;
    private final int mId = 0;

    a(c<D> paramc)
    {
      this.Eu = paramc;
      this.Ew = null;
      this.Eu.registerListener(0, this);
    }

    final c<D> a(LifecycleOwner paramLifecycleOwner, r.a<D> parama)
    {
      parama = new s.b(this.Eu, parama);
      observe(paramLifecycleOwner, parama);
      if (this.Ev != null)
        removeObserver(this.Ev);
      this.Eq = paramLifecycleOwner;
      this.Ev = parama;
      return this.Eu;
    }

    public final void ag()
    {
      if (s.DEBUG)
        new StringBuilder("  Stopping: ").append(this);
      this.Eu.stopLoading();
    }

    final void dr()
    {
      LifecycleOwner localLifecycleOwner = this.Eq;
      s.b localb = this.Ev;
      if ((localLifecycleOwner != null) && (localb != null))
      {
        super.removeObserver(localb);
        observe(localLifecycleOwner, localb);
      }
    }

    public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(this.mId);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(this.Et);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(this.Eu);
      this.Eu.dump(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      if (this.Ev != null)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mCallbacks=");
        paramPrintWriter.println(this.Ev);
        paramFileDescriptor = this.Ev;
        paramPrintWriter.print(paramString + "  ");
        paramPrintWriter.print("mDeliveredData=");
        paramPrintWriter.println(paramFileDescriptor.Ey);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mData=");
      paramPrintWriter.println(this.Eu.dataToString(getValue()));
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.println(hasActiveObservers());
    }

    public final void m(D paramD)
    {
      if (s.DEBUG)
        new StringBuilder("onLoadComplete: ").append(this);
      if (Looper.myLooper() == Looper.getMainLooper())
        setValue(paramD);
      while (true)
      {
        return;
        boolean bool = s.DEBUG;
        postValue(paramD);
      }
    }

    public final void onActive()
    {
      if (s.DEBUG)
        new StringBuilder("  Starting: ").append(this);
      this.Eu.startLoading();
    }

    public final void removeObserver(Observer<D> paramObserver)
    {
      super.removeObserver(paramObserver);
      this.Eq = null;
      this.Ev = null;
    }

    public final void setValue(D paramD)
    {
      super.setValue(paramD);
      if (this.Ew != null)
      {
        this.Ew.reset();
        this.Ew = null;
      }
    }

    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(64);
      localStringBuilder.append("LoaderInfo{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" #");
      localStringBuilder.append(this.mId);
      localStringBuilder.append(" : ");
      d.a(this.Eu, localStringBuilder);
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
    }
  }

  static final class b<D>
    implements Observer<D>
  {
    final c<D> Eu;
    final r.a<D> Ex;
    boolean Ey = false;

    b(c<D> paramc, r.a<D> parama)
    {
      this.Eu = paramc;
      this.Ex = parama;
    }

    public final void onChanged(D paramD)
    {
      if (s.DEBUG)
        new StringBuilder("  onLoadFinished in ").append(this.Eu).append(": ").append(this.Eu.dataToString(paramD));
      this.Ex.onLoadFinished(this.Eu, paramD);
      this.Ey = true;
    }

    public final String toString()
    {
      return this.Ex.toString();
    }
  }

  static class c extends ViewModel
  {
    private static final ViewModelProvider.Factory Ez = new ViewModelProvider.Factory()
    {
      public final <T extends ViewModel> T create(Class<T> paramAnonymousClass)
      {
        return new s.c();
      }
    };
    n<s.a> EA = new n();

    static c a(ViewModelStore paramViewModelStore)
    {
      return (c)new ViewModelProvider(paramViewModelStore, Ez).get(c.class);
    }

    public final void ao()
    {
      super.ao();
      int i = this.EA.size();
      for (int j = 0; j < i; j++)
      {
        s.a locala = (s.a)this.EA.valueAt(j);
        if (s.DEBUG)
          new StringBuilder("  Destroying: ").append(locala);
        locala.Eu.cancelLoad();
        locala.Eu.abandon();
        s.b localb = locala.Ev;
        if (localb != null)
        {
          locala.removeObserver(localb);
          if (localb.Ey)
          {
            if (s.DEBUG)
              new StringBuilder("  Resetting: ").append(localb.Eu);
            localb.Ex.onLoaderReset(localb.Eu);
          }
        }
        locala.Eu.unregisterListener(locala);
        locala.Eu.reset();
      }
      this.EA.clear();
    }

    final void dr()
    {
      int i = this.EA.size();
      for (int j = 0; j < i; j++)
        ((s.a)this.EA.valueAt(j)).dr();
    }

    public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      if (this.EA.size() > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Loaders:");
        String str = paramString + "    ";
        for (int i = 0; i < this.EA.size(); i++)
        {
          s.a locala = (s.a)this.EA.valueAt(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(this.EA.keyAt(i));
          paramPrintWriter.print(": ");
          paramPrintWriter.println(locala.toString());
          locala.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.s
 * JD-Core Version:    0.6.2
 */