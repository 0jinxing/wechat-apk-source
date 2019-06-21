package com.tencent.mm.storage;

import com.tencent.mm.model.bf.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.plugin.messenger.foundation.a.l;

public abstract class e
{
  public static l xHP;
  protected com.tencent.mm.plugin.messenger.foundation.a.a.h xHO;

  public e(com.tencent.mm.plugin.messenger.foundation.a.a.h paramh)
  {
    this.xHO = paramh;
  }

  protected final String Rr(String paramString)
  {
    return this.xHO.Rr(paramString);
  }

  protected final void a(com.tencent.mm.cd.h paramh, String paramString)
  {
    this.xHO.a(paramh, paramString);
  }

  protected final void a(h.b paramb)
  {
    this.xHO.a(paramb);
  }

  protected final void a(h.c paramc)
  {
    this.xHO.a(paramc);
  }

  protected boolean a(bi parambi, bf.b paramb)
  {
    return true;
  }

  public abstract String aog(String paramString);

  public final com.tencent.mm.cd.h bOy()
  {
    return this.xHO.bOy();
  }

  protected final void hZ(String paramString1, String paramString2)
  {
    this.xHO.b(paramString1, paramString2, null);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.e
 * JD-Core Version:    0.6.2
 */