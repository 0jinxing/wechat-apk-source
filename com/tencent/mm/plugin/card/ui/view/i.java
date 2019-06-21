package com.tencent.mm.plugin.card.ui.view;

import android.view.View;
import com.tencent.mm.plugin.card.ui.n;

public abstract class i
{
  n kqK;

  public final void a(n paramn)
  {
    this.kqK = paramn;
    initView();
  }

  public void bes()
  {
  }

  public void destroy()
  {
    this.kqK = null;
  }

  protected final View findViewById(int paramInt)
  {
    return this.kqK.findViewById(paramInt);
  }

  protected final String getString(int paramInt)
  {
    return this.kqK.getString(paramInt);
  }

  public abstract void initView();

  public void update()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.i
 * JD-Core Version:    0.6.2
 */