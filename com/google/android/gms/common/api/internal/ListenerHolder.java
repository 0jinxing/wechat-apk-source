package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;

@KeepForSdk
public final class ListenerHolder<L>
{
  private final zza zzlh;
  private volatile L zzli;
  private final ListenerKey<L> zzlj;

  @KeepForSdk
  ListenerHolder(Looper paramLooper, L paramL, String paramString)
  {
    AppMethodBeat.i(60642);
    this.zzlh = new zza(paramLooper);
    this.zzli = Preconditions.checkNotNull(paramL, "Listener must not be null");
    this.zzlj = new ListenerKey(paramL, Preconditions.checkNotEmpty(paramString));
    AppMethodBeat.o(60642);
  }

  @KeepForSdk
  public final void clear()
  {
    this.zzli = null;
  }

  @KeepForSdk
  public final ListenerKey<L> getListenerKey()
  {
    return this.zzlj;
  }

  @KeepForSdk
  public final boolean hasListener()
  {
    if (this.zzli != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  @KeepForSdk
  public final void notifyListener(Notifier<? super L> paramNotifier)
  {
    AppMethodBeat.i(60643);
    Preconditions.checkNotNull(paramNotifier, "Notifier must not be null");
    paramNotifier = this.zzlh.obtainMessage(1, paramNotifier);
    this.zzlh.sendMessage(paramNotifier);
    AppMethodBeat.o(60643);
  }

  @KeepForSdk
  final void notifyListenerInternal(Notifier<? super L> paramNotifier)
  {
    AppMethodBeat.i(60644);
    Object localObject = this.zzli;
    if (localObject == null)
    {
      paramNotifier.onNotifyListenerFailed();
      AppMethodBeat.o(60644);
    }
    while (true)
    {
      return;
      try
      {
        paramNotifier.notifyListener(localObject);
        AppMethodBeat.o(60644);
      }
      catch (RuntimeException localRuntimeException)
      {
        paramNotifier.onNotifyListenerFailed();
        AppMethodBeat.o(60644);
        throw localRuntimeException;
      }
    }
  }

  @KeepForSdk
  public static final class ListenerKey<L>
  {
    private final L zzli;
    private final String zzll;

    @KeepForSdk
    ListenerKey(L paramL, String paramString)
    {
      this.zzli = paramL;
      this.zzll = paramString;
    }

    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      AppMethodBeat.i(60639);
      if (this == paramObject)
        AppMethodBeat.o(60639);
      while (true)
      {
        return bool;
        if (!(paramObject instanceof ListenerKey))
        {
          AppMethodBeat.o(60639);
          bool = false;
        }
        else
        {
          paramObject = (ListenerKey)paramObject;
          if ((this.zzli == paramObject.zzli) && (this.zzll.equals(paramObject.zzll)))
          {
            AppMethodBeat.o(60639);
          }
          else
          {
            AppMethodBeat.o(60639);
            bool = false;
          }
        }
      }
    }

    public final int hashCode()
    {
      AppMethodBeat.i(60640);
      int i = System.identityHashCode(this.zzli);
      int j = this.zzll.hashCode();
      AppMethodBeat.o(60640);
      return i * 31 + j;
    }
  }

  @KeepForSdk
  public static abstract interface Notifier<L>
  {
    @KeepForSdk
    public abstract void notifyListener(L paramL);

    @KeepForSdk
    public abstract void onNotifyListenerFailed();
  }

  final class zza extends Handler
  {
    public zza(Looper arg2)
    {
      super();
    }

    public final void handleMessage(Message paramMessage)
    {
      boolean bool = true;
      AppMethodBeat.i(60641);
      if (paramMessage.what == 1);
      while (true)
      {
        Preconditions.checkArgument(bool);
        ListenerHolder.this.notifyListenerInternal((ListenerHolder.Notifier)paramMessage.obj);
        AppMethodBeat.o(60641);
        return;
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.ListenerHolder
 * JD-Core Version:    0.6.2
 */