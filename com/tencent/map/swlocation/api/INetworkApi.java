package com.tencent.map.swlocation.api;

import com.b.a.a.q;

public abstract interface INetworkApi extends q
{
  @Deprecated
  public abstract byte[] httpRequest(String paramString, byte[] paramArrayOfByte);

  public abstract byte[] httpRequest(byte[] paramArrayOfByte);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.map.swlocation.api.INetworkApi
 * JD-Core Version:    0.6.2
 */