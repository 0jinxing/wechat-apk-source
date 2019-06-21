package com.tencent.mm.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.MMPreferenceFragment;

public abstract class AbstractTabChildPreference extends MMPreferenceFragment
  implements m
{
  private Bundle rnR;
  private boolean ydY;
  private boolean ydZ;
  private boolean yea;
  private boolean yeb;
  protected boolean yec = false;
  protected boolean yed = false;
  protected boolean yee;

  private void dwk()
  {
    if (this.ydZ)
    {
      dvY();
      this.ydZ = false;
    }
    while (true)
    {
      return;
      if (this.ydY)
      {
        dwd();
        dvY();
        ab.v("MicroMsg.INIT", "KEVIN tab onRecreate ");
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

  public final void dwh()
  {
    dwf();
    this.yea = true;
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
        dwg();
        this.yea = false;
      }
      dAE();
      dvZ();
      ab.d("MicroMsg.INIT", "KEVIN " + toString() + " OnTabResume last : " + (System.currentTimeMillis() - l));
      this.yeb = true;
      this.yec = false;
    }
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.rnR = paramBundle;
    this.ydZ = true;
  }

  public void onDestroy()
  {
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
    dwi();
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
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AbstractTabChildPreference
 * JD-Core Version:    0.6.2
 */