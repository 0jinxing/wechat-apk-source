package com.tencent.pb.common.b;

import java.lang.ref.WeakReference;

public final class i
  implements c
{
  private WeakReference<c> Jq;

  public i(c paramc)
  {
    this.Jq = new WeakReference(paramc);
  }

  public final void r(int paramInt, byte[] paramArrayOfByte)
  {
    if ((this.Jq != null) && (this.Jq.get() != null))
      ((c)this.Jq.get()).r(paramInt, paramArrayOfByte);
    while (true)
    {
      return;
      com.tencent.pb.common.c.c.w("OnRespForLongAIDLImpl fail", new Object[] { "callback is null, errCode=".concat(String.valueOf(paramInt)) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.i
 * JD-Core Version:    0.6.2
 */