package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.exdevice.e.e;

public abstract class c
{
  public long jJa = -1L;
  public short lqB = (short)-1;
  public e lqC = null;
  protected a lqD = null;

  protected final e as(int paramInt, String paramString)
  {
    this.lqC = new e();
    this.lqC.luT = paramInt;
    this.lqC.luU = paramString;
    return this.lqC;
  }

  public abstract short bor();

  public abstract short bos();

  public abstract byte[] bot();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.c
 * JD-Core Version:    0.6.2
 */