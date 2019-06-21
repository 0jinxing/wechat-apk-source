package com.google.android.gms.tasks;

public abstract interface SuccessContinuation<TResult, TContinuationResult>
{
  public abstract Task<TContinuationResult> then(TResult paramTResult);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.SuccessContinuation
 * JD-Core Version:    0.6.2
 */