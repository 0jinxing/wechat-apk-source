package com.tencent.mm.wallet_core.c;

import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.lang.ref.WeakReference;
import junit.framework.Assert;

public abstract class p extends m
  implements k
{
  private static final String AfB = ah.getResources().getString(2131305389);
  protected int AfC = 0;
  protected String AfD;
  protected String aIm;
  private WeakReference<MMActivity> aIq;
  protected b ehh;
  protected f ehi;
  protected int errCode = 0;
  protected int errType = 0;
  protected boolean kDr = true;
  protected boolean kDs = false;

  public int a(e parame, f paramf)
  {
    this.ehi = paramf;
    Assert.assertNotNull("rr can't be null!", this.ehh);
    return a(parame, this.ehh, this);
  }

  public final p a(p.a parama)
  {
    if ((!this.kDr) && (!this.kDs))
      parama.e(this.errCode, this.errType, this.aIm, this);
    return this;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0))
      this.kDr = false;
    if (!this.kDr)
    {
      f(paramq);
      if (this.AfC != 0)
        this.kDs = true;
    }
    this.errCode = paramInt3;
    this.errType = paramInt2;
    this.aIm = paramString;
    ab.i("MicroMsg.NetSceneNewPayBase", "errType: %s, errCode: %s, errMsg: %s, retCode: %s, retMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(this.AfC), this.AfD });
    b(paramInt2, paramInt3, paramString, paramq);
    if (this.aIq != null)
    {
      paramString = (MMActivity)this.aIq.get();
      if (paramString != null)
      {
        if (!this.kDr)
          break label171;
        ab.w("MicroMsg.NetSceneNewPayBase", "show net error alert");
        h.a(paramString, AfB, null, false, new p.1(this, paramString));
      }
    }
    while (true)
    {
      return;
      label171: if ((this.kDs) && (!bo.isNullOrNil(this.AfD)))
        if (bgR())
        {
          ab.w("MicroMsg.NetSceneNewPayBase", "show resp error toast");
          Toast.makeText(paramString, this.AfD, 1).show();
        }
        else
        {
          ab.w("MicroMsg.NetSceneNewPayBase", "show resp error alert");
          h.a(paramString, this.AfD, null, false, new p.2(this, paramString));
        }
    }
  }

  public final p b(p.a parama)
  {
    if (this.kDs)
      parama.e(this.errCode, this.errType, this.aIm, this);
    return this;
  }

  protected abstract void b(int paramInt1, int paramInt2, String paramString, q paramq);

  public boolean bgR()
  {
    return false;
  }

  public final p c(p.a parama)
  {
    if (this.kDr)
      parama.e(this.errCode, this.errType, this.aIm, this);
    return this;
  }

  protected abstract void f(q paramq);

  public final void o(MMActivity paramMMActivity)
  {
    this.aIq = new WeakReference(paramMMActivity);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.p
 * JD-Core Version:    0.6.2
 */