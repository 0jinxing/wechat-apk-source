package com.google.android.gms.common.server.response;

public abstract interface PostProcessor<T extends FastJsonResponse>
{
  public abstract T postProcess(T paramT);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.response.PostProcessor
 * JD-Core Version:    0.6.2
 */