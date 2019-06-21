package com.google.android.gms.common.api;

public abstract class TransformedResult<R extends Result>
{
  public abstract void andFinally(ResultCallbacks<? super R> paramResultCallbacks);

  public abstract <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> paramResultTransform);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.TransformedResult
 * JD-Core Version:    0.6.2
 */