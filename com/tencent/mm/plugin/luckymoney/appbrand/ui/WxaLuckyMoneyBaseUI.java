package com.tencent.mm.plugin.luckymoney.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBar;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyCompleteUI;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI;
import com.tencent.mm.plugin.luckymoney.ui.j;
import com.tencent.mm.plugin.luckymoney.ui.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public abstract class WxaLuckyMoneyBaseUI extends MMActivity
{
  private c nSh = null;
  private int nSi = 4095;
  private final SparseArray<d.a> nSj = new SparseArray();
  private final Class[][] nSk;

  public WxaLuckyMoneyBaseUI()
  {
    Class[] arrayOfClass1 = { com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.b.class, WxaLuckyMoneyReceiveUI.class };
    Class[] arrayOfClass2 = { com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.b.class, WxaLuckyMoneyCompleteUI.class };
    this.nSk = new Class[][] { arrayOfClass1, { com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.c.class, WxaLuckyMoneyPrepareUI.class }, { com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.b.class, WxaLuckyMoneyDetailUI.class }, arrayOfClass2 };
  }

  private Class<? extends MMActivity> aq(Class paramClass)
  {
    Class<? extends MMActivity> localClass = null;
    for (Class[] arrayOfClass1 : this.nSk)
      if (arrayOfClass1[0] == paramClass)
        localClass = arrayOfClass1[1];
    return localClass;
  }

  public final void a(Class paramClass, Intent paramIntent, d.a parama)
  {
    if (getMainLooper().getThread() != Thread.currentThread())
      runOnUiThread(new WxaLuckyMoneyBaseUI.1(this, paramClass, paramIntent, parama));
    while (true)
    {
      return;
      Intent localIntent = paramIntent;
      if (paramIntent == null)
        localIntent = new Intent();
      paramIntent = aq(paramClass);
      if (paramIntent == null)
        throw new IllegalStateException("proceed to ui = [" + paramClass.getName() + "], but Target is null");
      localIntent.setClass(this.mController.ylL, paramIntent);
      if (parama == null)
      {
        startActivity(localIntent);
      }
      else
      {
        int i = this.nSi;
        this.nSi = (i + 1);
        startActivityForResult(localIntent, i);
        this.nSj.put(i, parama);
      }
    }
  }

  public final void c(int paramInt, Intent paramIntent)
  {
    setResult(paramInt, paramIntent);
    finish();
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    d.a locala = (d.a)this.nSj.get(paramInt1);
    if (locala != null)
    {
      ab.i("MicroMsg.HjLuckyMoneyBaseUI", "damon warns you, requestCode == [%d], I used it, and skip. check your code if needed!!!!", new Object[] { Integer.valueOf(paramInt1) });
      locala.d(paramInt2, paramIntent);
    }
    while (true)
    {
      return;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.nSh = new c(this);
    this.nSh.oic = 1;
    paramBundle = this.nSh;
    Object localObject1 = paramBundle.knn;
    int i = paramBundle.oic;
    j.a locala = new j.a();
    localObject1 = ((Context)localObject1).getResources();
    switch (i)
    {
    default:
      locala.oie = ((Resources)localObject1).getDrawable(2130839226);
      locala.jlo = -1;
      locala.oig = ((Resources)localObject1).getColor(2131690255);
    case 1:
    }
    for (locala.oii = ((Resources)localObject1).getColor(2131690219); ; locala.oii = ((Resources)localObject1).getColor(2131690238))
    {
      if (paramBundle.knn.getSupportActionBar() != null)
      {
        if (locala.oie != null)
          paramBundle.knn.getSupportActionBar().setBackgroundDrawable(locala.oie);
        localObject1 = paramBundle.knn.getSupportActionBar().getCustomView();
        if (localObject1 != null)
        {
          Object localObject2 = ((View)localObject1).findViewById(2131821128);
          if ((localObject2 != null) && (locala.jlo != 0))
            ((View)localObject2).setBackgroundColor(locala.jlo);
          localObject2 = (TextView)((View)localObject1).findViewById(16908308);
          if ((localObject2 != null) && (locala.oif != 0))
            ((TextView)localObject2).setTextColor(locala.oif);
          localObject2 = (TextView)((View)localObject1).findViewById(16908309);
          if ((localObject2 != null) && (locala.oig != 0))
            ((TextView)localObject2).setTextColor(locala.oig);
          localObject1 = (ImageView)((View)localObject1).findViewById(2131820974);
          if ((localObject1 != null) && (locala.oih != 0))
            ((ImageView)localObject1).setImageResource(locala.oih);
        }
        if (locala.oii != 0)
        {
          i = locala.oii;
          if (j.bMM())
          {
            paramBundle = paramBundle.knn.getWindow();
            paramBundle.addFlags(-2147483648);
            paramBundle.setStatusBarColor(i);
          }
        }
      }
      return;
      locala.oie = new ColorDrawable(((Resources)localObject1).getColor(2131690223));
      locala.jlo = ((Resources)localObject1).getColor(2131690224);
      locala.oif = ((Resources)localObject1).getColor(2131690231);
      locala.oig = ((Resources)localObject1).getColor(2131690231);
      locala.oih = 2130839237;
    }
  }

  public void onDestroy()
  {
    this.nSh = null;
    this.nSj.clear();
    super.onDestroy();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void t(Drawable paramDrawable)
  {
    this.nSh.t(paramDrawable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI
 * JD-Core Version:    0.6.2
 */