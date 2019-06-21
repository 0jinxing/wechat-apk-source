package com.google.android.gms.common.api;

public abstract class OptionalPendingResult<R extends Result> extends PendingResult<R>
{
  public abstract R get();

  public abstract boolean isDone();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.OptionalPendingResult
 * JD-Core Version:    0.6.2
 */