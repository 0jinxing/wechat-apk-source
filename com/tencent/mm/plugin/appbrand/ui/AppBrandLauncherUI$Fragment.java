package com.tencent.mm.plugin.appbrand.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.mm.sdk.platformtools.ak;

public abstract class AppBrandLauncherUI$Fragment extends Fragment
{
  public View WL;
  public int gOW;
  private final ak iGP = new ak(Looper.getMainLooper());
  public String iGQ;

  public final void N(Runnable paramRunnable)
  {
    this.iGP.post(paramRunnable);
  }

  public void aMf()
  {
  }

  public final <T extends View> T aMg()
  {
    return this.WL.findViewById(16908298);
  }

  public final View getContentView()
  {
    return this.WL;
  }

  public abstract int getLayoutId();

  public abstract void initView();

  @SuppressLint({"ResourceType"})
  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (getLayoutId() < 0);
    for (this.WL = new FrameLayout(paramViewGroup.getContext()); ; this.WL = paramLayoutInflater.inflate(getLayoutId(), null))
    {
      initView();
      return this.WL;
    }
  }

  public final void runOnUiThread(Runnable paramRunnable)
  {
    if (getActivity() == null);
    while (true)
    {
      return;
      getActivity().runOnUiThread(paramRunnable);
    }
  }

  public void setScene(int paramInt)
  {
    this.gOW = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
 * JD-Core Version:    0.6.2
 */