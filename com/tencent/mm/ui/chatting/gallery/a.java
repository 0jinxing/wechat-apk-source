package com.tencent.mm.ui.chatting.gallery;

import android.view.View;
import com.tencent.mm.storage.bi;

public abstract class a
{
  protected c yTG;

  public a(c paramc)
  {
    this.yTG = paramc;
  }

  public final k OJ(int paramInt)
  {
    Object localObject;
    if (this.yTG == null)
      localObject = null;
    while (true)
    {
      return localObject;
      localObject = this.yTG.Fp(paramInt);
      if (localObject == null)
        localObject = null;
      else
        localObject = (k)((View)localObject).getTag();
    }
  }

  public final void OK(int paramInt)
  {
    if (this.yTG == null);
    while (true)
    {
      return;
      View localView = this.yTG.Fp(paramInt);
      if ((localView != null) && (localView.getTag() != null))
        a((k)localView.getTag(), this.yTG.Ou(paramInt), paramInt);
    }
  }

  public boolean a(k paramk, bi parambi, int paramInt)
  {
    return false;
  }

  public void detach()
  {
    this.yTG = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.a
 * JD-Core Version:    0.6.2
 */