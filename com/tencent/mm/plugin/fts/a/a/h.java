package com.tencent.mm.plugin.fts.a.a;

import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;

public abstract class h extends a
{
  private WeakReference<l> mAK;
  public i mEl;
  public j mEm;

  public h(i parami)
  {
    this.mEl = parami;
    this.mAK = new WeakReference(parami.mEw);
    this.mEl.mEw = null;
  }

  protected void a(j paramj)
  {
    paramj.mDz = g.aO(this.mEl.query, false);
    paramj.bFZ = -5;
  }

  public final boolean execute()
  {
    i locali = this.mEl;
    if (!bo.isNullOrNil(locali.query));
    try
    {
      Object localObject2 = new java/lang/String;
      ((String)localObject2).<init>(locali.query.getBytes("UTF8"), "UTF8");
      locali.query = ((String)localObject2);
      label39: this.mEm = new j(this.mEl);
      try
      {
        this.mEm.mEx = this;
        a(this.mEm);
        this.mEm.bFZ = 0;
        if (this.mEl.handler == null)
        {
          localObject2 = (l)this.mAK.get();
          if (localObject2 != null)
            ((l)localObject2).b(this.mEm);
        }
        while (true)
        {
          return true;
          this.mEl.handler.post(new h.1(this));
        }
      }
      catch (Exception localException)
      {
        if ((localException instanceof InterruptedException))
        {
          this.mEm.bFZ = 1;
          throw localException;
        }
      }
      finally
      {
        if (this.mEl.handler == null)
        {
          l locall = (l)this.mAK.get();
          if (locall != null)
            locall.b(this.mEm);
        }
        while (true)
        {
          throw localObject1;
          this.mEm.bFZ = -1;
          break;
          this.mEl.handler.post(new h.1(this));
        }
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label39;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.h
 * JD-Core Version:    0.6.2
 */