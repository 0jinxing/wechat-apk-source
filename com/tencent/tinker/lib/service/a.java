package com.tencent.tinker.lib.service;

import java.io.Serializable;

public final class a
  implements Serializable
{
  public String ABv;
  public String ABw;
  public Throwable Arh;
  public boolean cxT;
  public long iBv;

  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("\nPatchResult: \n");
    localStringBuffer.append("isSuccess:" + this.cxT + "\n");
    localStringBuffer.append("rawPatchFilePath:" + this.ABv + "\n");
    localStringBuffer.append("costTime:" + this.iBv + "\n");
    if (this.ABw != null)
      localStringBuffer.append("patchVersion:" + this.ABw + "\n");
    if (this.Arh != null)
      localStringBuffer.append("Throwable:" + this.Arh.getMessage() + "\n");
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.service.a
 * JD-Core Version:    0.6.2
 */