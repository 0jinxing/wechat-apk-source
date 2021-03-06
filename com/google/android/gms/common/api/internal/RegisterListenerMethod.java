package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L>
{
  private final ListenerHolder<L> zzls;

  @KeepForSdk
  protected RegisterListenerMethod(ListenerHolder<L> paramListenerHolder)
  {
    this.zzls = paramListenerHolder;
  }

  @KeepForSdk
  public void clearListener()
  {
    this.zzls.clear();
  }

  @KeepForSdk
  public ListenerHolder.ListenerKey<L> getListenerKey()
  {
    return this.zzls.getListenerKey();
  }

  @KeepForSdk
  protected abstract void registerListener(A paramA, TaskCompletionSource<Void> paramTaskCompletionSource);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.RegisterListenerMethod
 * JD-Core Version:    0.6.2
 */