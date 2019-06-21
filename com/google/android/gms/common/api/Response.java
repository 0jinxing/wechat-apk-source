package com.google.android.gms.common.api;

public class Response<T extends Result>
{
  private T zzdm;

  public Response()
  {
  }

  protected Response(T paramT)
  {
    this.zzdm = paramT;
  }

  protected T getResult()
  {
    return this.zzdm;
  }

  public void setResult(T paramT)
  {
    this.zzdm = paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Response
 * JD-Core Version:    0.6.2
 */