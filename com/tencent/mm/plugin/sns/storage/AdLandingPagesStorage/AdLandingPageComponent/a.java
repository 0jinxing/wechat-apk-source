package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.d;
import android.view.ViewGroup;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class a extends h
{
  public boolean qVI;
  private boolean qVJ = true;
  public boolean qVK;
  private BroadcastReceiver receiver = new a.1(this);

  public a(Context paramContext, r paramr, ViewGroup paramViewGroup)
  {
    super(paramContext, paramr, paramViewGroup);
    d.S(this.context).a(this.receiver, new IntentFilter("com.tencent.mm.adlanding.close_exposure_voice"));
    ab.v("AbsVideoPlayComp", "register receiver " + this.receiver);
  }

  public void coY()
  {
    this.qVI = false;
  }

  public void coZ()
  {
    super.coZ();
    d.S(this.context).unregisterReceiver(this.receiver);
    this.qVK = true;
    ab.v("AbsVideoPlayComp", "unregister receiver " + this.receiver);
  }

  public void cpa()
  {
    super.cpa();
    this.qVK = true;
  }

  public void cpb()
  {
    super.cpb();
    this.qVK = false;
  }

  public void cpc()
  {
    super.cpc();
    if (this.qVJ)
    {
      this.qVJ = false;
      if (cpC().qXq)
        break label31;
      coY();
    }
    while (true)
    {
      return;
      label31: cpd();
    }
  }

  public void cpd()
  {
    this.qVI = true;
  }

  public final void cpe()
  {
    Intent localIntent = new Intent("com.tencent.mm.adlanding.close_exposure_voice");
    localIntent.putExtra("para_id", cpv().qWO);
    d.S(this.context).c(localIntent);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a
 * JD-Core Version:    0.6.2
 */