package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.Callable;

abstract class af<T>
  implements Callable<T>
{
  protected volatile long iil = 0L;
  protected volatile long iim = 0L;
  protected volatile long iin = 0L;

  final T aHy()
  {
    this.iil = bo.anU();
    Object localObject = call();
    this.iim = bo.anU();
    this.iin = (this.iim - this.iil);
    return localObject;
  }

  abstract String getTag();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.af
 * JD-Core Version:    0.6.2
 */