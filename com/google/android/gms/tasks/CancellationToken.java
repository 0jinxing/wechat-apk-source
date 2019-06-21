package com.google.android.gms.tasks;

public abstract class CancellationToken
{
  public abstract boolean isCancellationRequested();

  public abstract CancellationToken onCanceledRequested(OnTokenCanceledListener paramOnTokenCanceledListener);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.CancellationToken
 * JD-Core Version:    0.6.2
 */