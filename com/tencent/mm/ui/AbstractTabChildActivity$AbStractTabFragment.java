package com.tencent.mm.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class AbstractTabChildActivity$AbStractTabFragment extends MMFragment
  implements m
{
  private Bundle rnR;
  private boolean ydY;
  private boolean ydZ;
  private boolean yea;
  protected boolean yeb;
  protected boolean yec = false;
  protected boolean yed = false;
  protected boolean yee;
  protected boolean yef = false;

  private void dwk()
  {
    if (this.ydZ)
    {
      dvY();
      this.ydZ = false;
    }
    while (true)
    {
      this.yef = true;
      return;
      if (this.ydY)
      {
        if (this.yef)
          dwd();
        dvY();
        ab.v("MicroMsg.INIT", "KEVIN tab onRecreate " + toString());
        this.ydY = false;
      }
    }
  }

  protected abstract void dvY();

  protected abstract void dvZ();

  protected abstract void dwa();

  protected abstract void dwb();

  protected abstract void dwc();

  protected abstract void dwd();

  public abstract void dwe();

  public abstract void dwf();

  public abstract void dwg();

  public final void dwh()
  {
    dwf();
    this.yea = true;
  }

  public final void dwi()
  {
  }

  public final void dwj()
  {
    this.yed = true;
  }

  public final void dwl()
  {
    if (!this.yec);
    while (true)
    {
      return;
      dwk();
      long l = System.currentTimeMillis();
      if (this.yea)
      {
        this.yea = false;
        dwg();
      }
      dvZ();
      ab.d("MicroMsg.INIT", "KEVIN " + toString() + " OnTabResume last : " + (System.currentTimeMillis() - l));
      this.yeb = true;
      this.yec = false;
    }
  }

  protected int getLayoutId()
  {
    return 0;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.ydZ = true;
    this.rnR = paramBundle;
  }

  public void onDestroy()
  {
    if (this.yef)
      dwd();
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0));
    for (boolean bool = false; ; bool = super.onKeyDown(paramInt, paramKeyEvent))
      return bool;
  }

  public void onPause()
  {
    super.onPause();
    this.yee = true;
    if (this.yee)
      if (this.yeb)
        break label29;
    for (this.yee = false; ; this.yee = false)
    {
      return;
      label29: long l = System.currentTimeMillis();
      dwb();
      ab.d("MicroMsg.INIT", "KEVIN " + toString() + " onTabPause last : " + (System.currentTimeMillis() - l));
      this.yeb = false;
    }
  }

  public void onResume()
  {
    super.onResume();
    LauncherUI localLauncherUI = LauncherUI.getInstance();
    if ((localLauncherUI == null) || (!localLauncherUI.yjM));
    while (true)
    {
      return;
      this.yec = true;
      if (this.yed)
      {
        dwl();
        this.yed = false;
      }
    }
  }

  public void onStart()
  {
    super.onStart();
    LauncherUI localLauncherUI = LauncherUI.getInstance();
    if ((localLauncherUI == null) || (!localLauncherUI.yjM));
    while (true)
    {
      return;
      dwa();
    }
  }

  public void onStop()
  {
    super.onStop();
    dwc();
  }

  public boolean supportNavigationSwipeBack()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
 * JD-Core Version:    0.6.2
 */