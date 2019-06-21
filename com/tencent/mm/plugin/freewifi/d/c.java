package com.tencent.mm.plugin.freewifi.d;

import android.app.Activity;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.al;

public abstract class c extends com.tencent.mm.ai.m
  implements k
{
  protected Activity activity;
  protected b ehh;
  protected f ehi;
  protected f mww;

  public final c O(Activity paramActivity)
  {
    this.activity = paramActivity;
    return this;
  }

  public final int a(e parame, f paramf)
  {
    this.mww = paramf;
    return a(parame, this.ehh, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.plugin.freewifi.m.MA("netscene " + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()) + " returns [" + paramInt2 + "," + paramInt3 + "]");
    if (this.mww != null)
      this.mww.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if ((this.activity != null) && (this.activity.isFinishing()));
    while (true)
    {
      return;
      if (this.ehi != null)
        al.d(new c.1(this, paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte));
    }
  }

  protected void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
  }

  protected abstract void bzd();

  public final void c(f paramf)
  {
    this.ehi = paramf;
    com.tencent.mm.plugin.freewifi.m.MA("netscene " + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()) + " is started.");
    aw.Rg().a(this, 0);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.c
 * JD-Core Version:    0.6.2
 */