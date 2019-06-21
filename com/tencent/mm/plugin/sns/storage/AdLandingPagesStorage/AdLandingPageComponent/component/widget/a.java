package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public abstract class a extends h
{
  public a(Context paramContext, r paramr, ViewGroup paramViewGroup)
  {
    super(paramContext, paramr, paramViewGroup);
  }

  public abstract void cps();

  public abstract List<h> cpt();

  public final boolean cpx()
  {
    boolean bool = true;
    int i = cpw();
    ab.i("MicroMsg.AdLandingPageContainerComponent", "inScreenHeight %d", new Object[] { Integer.valueOf(i) });
    if (i > 0);
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a
 * JD-Core Version:    0.6.2
 */