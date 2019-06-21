package com.tencent.mm.plugin.sight.draft.ui;

import android.graphics.Bitmap;
import com.tencent.mm.a.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.lang.ref.WeakReference;

public abstract class c
{
  f<String, Bitmap> qzU = new com.tencent.mm.memory.a.c(24);
  private Bitmap qzV;

  private Bitmap cly()
  {
    if (this.qzV == null)
      this.qzV = d.LV(2131231790);
    return this.qzV;
  }

  public abstract void r(String paramString, Bitmap paramBitmap);

  public final Bitmap x(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject;
    if (bo.isNullOrNil(paramString1))
      localObject = cly();
    while (true)
    {
      return localObject;
      Bitmap localBitmap = (Bitmap)this.qzU.get(paramString1);
      localObject = localBitmap;
      if (localBitmap == null)
      {
        localObject = new c.a((byte)0);
        ((c.a)localObject).key = paramString1;
        ((c.a)localObject).path = paramString2;
        ((c.a)localObject).qzW = paramBoolean;
        ((c.a)localObject).qzX = new WeakReference(this);
        if (paramBoolean)
          aw.RS().aa((Runnable)localObject);
        do
        {
          localObject = cly();
          break;
          ((c.a)localObject).run();
          localObject = (Bitmap)this.qzU.get(paramString1);
        }
        while (localObject == null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.c
 * JD-Core Version:    0.6.2
 */