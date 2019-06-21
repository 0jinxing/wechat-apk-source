package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L>
{
  private final ListenerHolder.ListenerKey<L> zzlj;

  @KeepForSdk
  protected UnregisterListenerMethod(ListenerHolder.ListenerKey<L> paramListenerKey)
  {
    this.zzlj = paramListenerKey;
  }

  @KeepForSdk
  public ListenerHolder.ListenerKey<L> getListenerKey()
  {
    return this.zzlj;
  }

  @KeepForSdk
  protected abstract void unregisterListener(A paramA, TaskCompletionSource<Boolean> paramTaskCompletionSource);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.UnregisterListenerMethod
 * JD-Core Version:    0.6.2
 */