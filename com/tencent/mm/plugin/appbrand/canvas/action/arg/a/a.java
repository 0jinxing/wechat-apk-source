package com.tencent.mm.plugin.appbrand.canvas.action.arg.a;

import android.text.TextUtils;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.sdk.c;
import java.util.HashMap;
import java.util.Map;

public abstract class a<T>
{
  private Map<String, c> map = new HashMap();

  private c yz(String paramString)
  {
    c localc1 = (c)this.map.get(paramString);
    c localc2 = localc1;
    if (localc1 == null)
    {
      localc2 = new c(500);
      this.map.put(paramString, localc2);
    }
    return localc2;
  }

  public final void a(BaseDrawActionArg paramBaseDrawActionArg)
  {
    if (paramBaseDrawActionArg == null);
    while (true)
    {
      return;
      if (TextUtils.isEmpty(paramBaseDrawActionArg.method))
        throw new IllegalStateException("method is empty " + paramBaseDrawActionArg.toString());
      yz(paramBaseDrawActionArg.method).release(paramBaseDrawActionArg);
    }
  }

  public abstract <T> T yA(String paramString);

  public final <T extends BaseDrawActionArg> T yy(String paramString)
  {
    BaseDrawActionArg localBaseDrawActionArg1 = (BaseDrawActionArg)yz(paramString).aA();
    BaseDrawActionArg localBaseDrawActionArg2 = localBaseDrawActionArg1;
    if (localBaseDrawActionArg1 == null)
      localBaseDrawActionArg2 = (BaseDrawActionArg)yA(paramString);
    return localBaseDrawActionArg2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.a.a
 * JD-Core Version:    0.6.2
 */