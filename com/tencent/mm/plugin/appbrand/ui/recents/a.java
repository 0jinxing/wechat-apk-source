package com.tencent.mm.plugin.appbrand.ui.recents;

import android.view.View;

public abstract class a
  implements l
{
  a iLV;

  public abstract void aNh();

  public abstract View aNi();

  protected final boolean aNj()
  {
    boolean bool = false;
    if (aNi() == null);
    while (true)
    {
      return bool;
      if (aNi().getVisibility() == 0)
        bool = true;
    }
  }

  protected final void eG(boolean paramBoolean)
  {
    if (aNi() == null);
    label77: 
    while (true)
    {
      return;
      if (paramBoolean)
        if (aNi().getVisibility() != 0)
          aNi().setVisibility(0);
      while (true)
      {
        if (this.iLV == null)
          break label77;
        this.iLV.a(this, aNi(), paramBoolean);
        break;
        if (aNi().getVisibility() != 8)
          aNi().setVisibility(8);
      }
    }
  }

  public abstract void onDetached();

  public abstract void onResume();

  public abstract void pS(int paramInt);

  public abstract void pT(int paramInt);

  static abstract interface a
  {
    public abstract void a(a parama, View paramView, boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.a
 * JD-Core Version:    0.6.2
 */