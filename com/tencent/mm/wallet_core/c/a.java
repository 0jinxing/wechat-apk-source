package com.tencent.mm.wallet_core.c;

import com.tencent.mm.ci.f;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

public abstract class a<K extends btd, P extends com.tencent.mm.ai.a<K>>
{
  protected List<a.a<K>> callbacks = new ArrayList();
  protected P fsz;
  protected boolean okX = false;

  public final void a(a.a<K> parama)
  {
    ab.i("MicroMsg.AsyncCgiLoader", "try do cgi: %s", new Object[] { Boolean.TRUE });
    parama.bY(bLr());
    if (!this.callbacks.contains(parama))
      this.callbacks.add(parama);
    ab.i("MicroMsg.AsyncCgiLoader", "trigger cgi: %s", new Object[] { Boolean.valueOf(this.okX) });
    if (!this.okX)
    {
      this.okX = true;
      parama = this.fsz;
      Assert.assertNotNull("cgi must not be null", parama);
      parama.acy().h(new a.2(this)).b(new a.1(this));
    }
  }

  public final void b(P paramP)
  {
    this.fsz = paramP;
  }

  protected abstract K bLr();

  protected abstract void e(com.tencent.mm.ai.a.a<K> parama);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.a
 * JD-Core Version:    0.6.2
 */