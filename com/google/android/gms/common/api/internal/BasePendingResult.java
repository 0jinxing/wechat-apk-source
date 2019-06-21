package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
@KeepName
public abstract class BasePendingResult<R extends Result> extends PendingResult<R>
{
  static final ThreadLocal<Boolean> zzez = new zzo();

  @KeepName
  private zza mResultGuardian;
  private Status mStatus;
  private R zzdm;
  private final Object zzfa = new Object();
  private final CallbackHandler<R> zzfb;
  private final WeakReference<GoogleApiClient> zzfc;
  private final CountDownLatch zzfd = new CountDownLatch(1);
  private final ArrayList<PendingResult.StatusListener> zzfe = new ArrayList();
  private ResultCallback<? super R> zzff;
  private final AtomicReference<zzcn> zzfg = new AtomicReference();
  private volatile boolean zzfh;
  private boolean zzfi;
  private boolean zzfj;
  private ICancelToken zzfk;
  private volatile zzch<R> zzfl;
  private boolean zzfm = false;

  @Deprecated
  BasePendingResult()
  {
    this.zzfb = new CallbackHandler(Looper.getMainLooper());
    this.zzfc = new WeakReference(null);
  }

  @Deprecated
  @KeepForSdk
  protected BasePendingResult(Looper paramLooper)
  {
    this.zzfb = new CallbackHandler(paramLooper);
    this.zzfc = new WeakReference(null);
  }

  @KeepForSdk
  protected BasePendingResult(GoogleApiClient paramGoogleApiClient)
  {
    if (paramGoogleApiClient != null);
    for (Looper localLooper = paramGoogleApiClient.getLooper(); ; localLooper = Looper.getMainLooper())
    {
      this.zzfb = new CallbackHandler(localLooper);
      this.zzfc = new WeakReference(paramGoogleApiClient);
      return;
    }
  }

  @KeepForSdk
  @VisibleForTesting
  protected BasePendingResult(CallbackHandler<R> paramCallbackHandler)
  {
    this.zzfb = ((CallbackHandler)Preconditions.checkNotNull(paramCallbackHandler, "CallbackHandler must not be null"));
    this.zzfc = new WeakReference(null);
  }

  private final R get()
  {
    boolean bool = true;
    synchronized (this.zzfa)
    {
      if (!this.zzfh)
      {
        Preconditions.checkState(bool, "Result has already been consumed.");
        Preconditions.checkState(isReady(), "Result is not ready.");
        Result localResult = this.zzdm;
        this.zzdm = null;
        this.zzff = null;
        this.zzfh = true;
        ??? = (zzcn)this.zzfg.getAndSet(null);
        if (??? != null)
          ((zzcn)???).zzc(this);
        return localResult;
      }
      bool = false;
    }
  }

  private final void zza(R paramR)
  {
    this.zzdm = paramR;
    this.zzfk = null;
    this.zzfd.countDown();
    this.mStatus = this.zzdm.getStatus();
    if (this.zzfi)
      this.zzff = null;
    while (true)
    {
      paramR = (ArrayList)this.zzfe;
      int i = paramR.size();
      int j = 0;
      while (j < i)
      {
        Object localObject = paramR.get(j);
        j++;
        ((PendingResult.StatusListener)localObject).onComplete(this.mStatus);
      }
      if (this.zzff == null)
      {
        if ((this.zzdm instanceof Releasable))
          this.mResultGuardian = new zza(null);
      }
      else
      {
        this.zzfb.removeMessages(2);
        this.zzfb.zza(this.zzff, get());
      }
    }
    this.zzfe.clear();
  }

  public static void zzb(Result paramResult)
  {
    if ((paramResult instanceof Releasable));
    try
    {
      ((Releasable)paramResult).release();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        paramResult = String.valueOf(paramResult);
        new StringBuilder(String.valueOf(paramResult).length() + 18).append("Unable to release ").append(paramResult);
      }
    }
  }

  public final void addStatusListener(PendingResult.StatusListener paramStatusListener)
  {
    boolean bool;
    if (paramStatusListener != null)
      bool = true;
    while (true)
    {
      Preconditions.checkArgument(bool, "Callback cannot be null.");
      synchronized (this.zzfa)
      {
        if (isReady())
        {
          paramStatusListener.onComplete(this.mStatus);
          return;
          bool = false;
          continue;
        }
        this.zzfe.add(paramStatusListener);
      }
    }
  }

  public final R await()
  {
    boolean bool1 = true;
    Preconditions.checkNotMainThread("await must not be called on the UI thread");
    boolean bool2;
    if (!this.zzfh)
      bool2 = true;
    while (true)
    {
      Preconditions.checkState(bool2, "Result has already been consumed");
      if (this.zzfl == null)
      {
        bool2 = bool1;
        Preconditions.checkState(bool2, "Cannot await if then() has been called.");
      }
      try
      {
        this.zzfd.await();
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
        bool2 = false;
        continue;
        bool2 = false;
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
          zzb(Status.RESULT_INTERRUPTED);
      }
    }
  }

  public final R await(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool1 = true;
    if (paramLong > 0L)
      Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
    boolean bool2;
    if (!this.zzfh)
      bool2 = true;
    while (true)
    {
      Preconditions.checkState(bool2, "Result has already been consumed.");
      if (this.zzfl == null)
      {
        bool2 = bool1;
        Preconditions.checkState(bool2, "Cannot await if then() has been called.");
      }
      try
      {
        if (!this.zzfd.await(paramLong, paramTimeUnit))
          zzb(Status.RESULT_TIMEOUT);
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
        bool2 = false;
        continue;
        bool2 = false;
      }
      catch (InterruptedException paramTimeUnit)
      {
        while (true)
          zzb(Status.RESULT_INTERRUPTED);
      }
    }
  }

  @KeepForSdk
  public void cancel()
  {
    while (true)
    {
      synchronized (this.zzfa)
      {
        if ((this.zzfi) || (this.zzfh))
          return;
        ICancelToken localICancelToken = this.zzfk;
        if (localICancelToken == null);
      }
      try
      {
        this.zzfk.cancel();
        label42: zzb(this.zzdm);
        this.zzfi = true;
        zza(createFailedResult(Status.RESULT_CANCELED));
        continue;
        localObject2 = finally;
        throw localObject2;
      }
      catch (RemoteException localRemoteException)
      {
        break label42;
      }
    }
  }

  @KeepForSdk
  protected abstract R createFailedResult(Status paramStatus);

  public boolean isCanceled()
  {
    synchronized (this.zzfa)
    {
      boolean bool = this.zzfi;
      return bool;
    }
  }

  @KeepForSdk
  public final boolean isReady()
  {
    if (this.zzfd.getCount() == 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  @KeepForSdk
  protected final void setCancelToken(ICancelToken paramICancelToken)
  {
    synchronized (this.zzfa)
    {
      this.zzfk = paramICancelToken;
      return;
    }
  }

  @KeepForSdk
  public final void setResult(R paramR)
  {
    boolean bool1 = true;
    while (true)
    {
      synchronized (this.zzfa)
      {
        if ((!this.zzfj) && (!this.zzfi))
        {
          if ((!isReady()) || (!isReady()))
          {
            bool2 = true;
            Preconditions.checkState(bool2, "Results have already been set");
            if (this.zzfh)
              break label93;
            bool2 = bool1;
            Preconditions.checkState(bool2, "Result has already been consumed");
            zza(paramR);
          }
        }
        else
          zzb(paramR);
      }
      boolean bool2 = false;
      continue;
      label93: bool2 = false;
    }
  }

  @KeepForSdk
  public final void setResultCallback(ResultCallback<? super R> paramResultCallback)
  {
    boolean bool1 = true;
    Object localObject = this.zzfa;
    if (paramResultCallback == null);
    while (true)
    {
      try
      {
        this.zzff = null;
        return;
        if (!this.zzfh)
        {
          bool2 = true;
          Preconditions.checkState(bool2, "Result has already been consumed.");
          if (this.zzfl != null)
            break label79;
          bool2 = bool1;
          Preconditions.checkState(bool2, "Cannot set callbacks if then() has been called.");
          if (!isCanceled())
            break;
          continue;
        }
      }
      finally
      {
      }
      boolean bool2 = false;
      continue;
      label79: bool2 = false;
    }
    if (isReady())
      this.zzfb.zza(paramResultCallback, get());
    while (true)
    {
      break;
      this.zzff = paramResultCallback;
    }
  }

  @KeepForSdk
  public final void setResultCallback(ResultCallback<? super R> paramResultCallback, long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool1 = true;
    Object localObject = this.zzfa;
    if (paramResultCallback == null);
    while (true)
    {
      try
      {
        this.zzff = null;
        return;
        if (!this.zzfh)
        {
          bool2 = true;
          Preconditions.checkState(bool2, "Result has already been consumed.");
          if (this.zzfl != null)
            break label86;
          bool2 = bool1;
          Preconditions.checkState(bool2, "Cannot set callbacks if then() has been called.");
          if (!isCanceled())
            break;
          continue;
        }
      }
      finally
      {
      }
      boolean bool2 = false;
      continue;
      label86: bool2 = false;
    }
    if (isReady())
      this.zzfb.zza(paramResultCallback, get());
    while (true)
    {
      break;
      this.zzff = paramResultCallback;
      paramResultCallback = this.zzfb;
      paramLong = paramTimeUnit.toMillis(paramLong);
      paramResultCallback.sendMessageDelayed(paramResultCallback.obtainMessage(2, this), paramLong);
    }
  }

  public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> paramResultTransform)
  {
    boolean bool1 = true;
    boolean bool2;
    if (!this.zzfh)
      bool2 = true;
    while (true)
    {
      Preconditions.checkState(bool2, "Result has already been consumed.");
      synchronized (this.zzfa)
      {
        if (this.zzfl == null)
        {
          bool2 = true;
          label35: Preconditions.checkState(bool2, "Cannot call then() twice.");
          if (this.zzff != null)
            break label145;
          bool2 = true;
          label51: Preconditions.checkState(bool2, "Cannot call then() if callbacks are set.");
          if (this.zzfi)
            break label150;
        }
        label145: label150: for (bool2 = bool1; ; bool2 = false)
        {
          Preconditions.checkState(bool2, "Cannot call then() if result was canceled.");
          this.zzfm = true;
          zzch localzzch = new com/google/android/gms/common/api/internal/zzch;
          localzzch.<init>(this.zzfc);
          this.zzfl = localzzch;
          paramResultTransform = this.zzfl.then(paramResultTransform);
          if (!isReady())
            break label155;
          this.zzfb.zza(this.zzfl, get());
          return paramResultTransform;
          bool2 = false;
          break;
          bool2 = false;
          break label35;
          bool2 = false;
          break label51;
        }
        label155: this.zzff = this.zzfl;
      }
    }
  }

  public final void zza(zzcn paramzzcn)
  {
    this.zzfg.set(paramzzcn);
  }

  public final void zzb(Status paramStatus)
  {
    synchronized (this.zzfa)
    {
      if (!isReady())
      {
        setResult(createFailedResult(paramStatus));
        this.zzfj = true;
      }
      return;
    }
  }

  public final Integer zzo()
  {
    return null;
  }

  public final boolean zzw()
  {
    synchronized (this.zzfa)
    {
      if (((GoogleApiClient)this.zzfc.get() == null) || (!this.zzfm))
        cancel();
      boolean bool = isCanceled();
      return bool;
    }
  }

  public final void zzx()
  {
    if ((this.zzfm) || (((Boolean)zzez.get()).booleanValue()));
    for (boolean bool = true; ; bool = false)
    {
      this.zzfm = bool;
      return;
    }
  }

  @VisibleForTesting
  public static class CallbackHandler<R extends Result> extends Handler
  {
    public CallbackHandler()
    {
      this(Looper.getMainLooper());
      AppMethodBeat.i(60564);
      AppMethodBeat.o(60564);
    }

    public CallbackHandler(Looper paramLooper)
    {
      super();
    }

    public void handleMessage(Message paramMessage)
    {
      AppMethodBeat.i(60566);
      switch (paramMessage.what)
      {
      default:
        int i = paramMessage.what;
        Log.wtf("BasePendingResult", 45 + "Don't know how to handle message: " + i, new Exception());
        AppMethodBeat.o(60566);
      case 1:
      case 2:
      }
      while (true)
      {
        return;
        Object localObject = (Pair)paramMessage.obj;
        paramMessage = (ResultCallback)((Pair)localObject).first;
        localObject = (Result)((Pair)localObject).second;
        try
        {
          paramMessage.onResult((Result)localObject);
          AppMethodBeat.o(60566);
        }
        catch (RuntimeException paramMessage)
        {
          BasePendingResult.zzb((Result)localObject);
          AppMethodBeat.o(60566);
          throw paramMessage;
        }
        ((BasePendingResult)paramMessage.obj).zzb(Status.RESULT_TIMEOUT);
        AppMethodBeat.o(60566);
      }
    }

    public final void zza(ResultCallback<? super R> paramResultCallback, R paramR)
    {
      AppMethodBeat.i(60565);
      sendMessage(obtainMessage(1, new Pair(paramResultCallback, paramR)));
      AppMethodBeat.o(60565);
    }
  }

  final class zza
  {
    private zza()
    {
    }

    protected final void finalize()
    {
      AppMethodBeat.i(60567);
      BasePendingResult.zzb(BasePendingResult.zza(BasePendingResult.this));
      super.finalize();
      AppMethodBeat.o(60567);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.BasePendingResult
 * JD-Core Version:    0.6.2
 */