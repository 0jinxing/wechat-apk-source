package com.tencent.mm.plugin.collect.reward.a;

import android.app.Activity;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.ui.base.h;
import java.lang.ref.WeakReference;

public abstract class a extends m
  implements k
{
  protected String aIm;
  protected int errCode = 0;
  protected int errType = 0;
  protected WeakReference<Activity> hxY;
  protected boolean kDr = false;
  protected boolean kDs = false;

  public final a a(a.a parama)
  {
    if ((!this.kDr) && (!this.kDs))
      parama.j(this);
    return this;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.kDr = true;
      if ((bgQ()) && (this.hxY != null))
      {
        paramArrayOfByte = (Activity)this.hxY.get();
        if (paramArrayOfByte != null)
          h.a(paramArrayOfByte, paramArrayOfByte.getString(2131305389), null, false, new a.1(this));
      }
    }
    this.errCode = paramInt3;
    this.errType = paramInt2;
    this.aIm = paramString;
    b(paramInt2, paramInt3, paramString, paramq);
  }

  public final a b(a.a parama)
  {
    if (this.kDs)
      parama.j(this);
    return this;
  }

  protected abstract void b(int paramInt1, int paramInt2, String paramString, q paramq);

  protected boolean bgQ()
  {
    return true;
  }

  public final a c(a.a parama)
  {
    if (this.kDr)
      parama.j(this);
    return this;
  }

  public final void z(Activity paramActivity)
  {
    this.hxY = new WeakReference(paramActivity);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.a.a
 * JD-Core Version:    0.6.2
 */