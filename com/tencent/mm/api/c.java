package com.tencent.mm.api;

import android.content.Context;
import android.widget.FrameLayout;

public abstract class c extends FrameLayout
{
  r ccE = new c.1(this);

  public c(Context paramContext)
  {
    super(paramContext);
  }

  public r getSelectedFeatureListener()
  {
    return this.ccE;
  }

  public abstract void setActionBarCallback(g paramg);

  public abstract void setActionBarVisible(boolean paramBoolean);

  public abstract void setAutoShowFooterAndBar(boolean paramBoolean);

  public abstract void setFooterVisible(boolean paramBoolean);

  public void setSelectedFeatureListener(r paramr)
  {
    this.ccE = paramr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.api.c
 * JD-Core Version:    0.6.2
 */