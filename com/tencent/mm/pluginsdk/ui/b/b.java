package com.tencent.mm.pluginsdk.ui.b;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;

public abstract class b
  implements a
{
  public boolean eVH = false;
  public boolean nfA = false;
  public View view = null;
  public WeakReference<Context> vlu = null;

  public b(Context paramContext)
  {
    this.vlu = new WeakReference(paramContext);
    if (getLayoutId() > 0)
      this.view = View.inflate((Context)this.vlu.get(), getLayoutId(), null);
  }

  public boolean aMN()
  {
    if ((this.view != null) && (this.view.getVisibility() == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public abstract void destroy();

  public abstract int getLayoutId();

  public int getOrder()
  {
    return 0;
  }

  public View getView()
  {
    return this.view;
  }

  public void release()
  {
  }

  public void setVisibility(int paramInt)
  {
    if (getView() != null)
      getView().setVisibility(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.b.b
 * JD-Core Version:    0.6.2
 */