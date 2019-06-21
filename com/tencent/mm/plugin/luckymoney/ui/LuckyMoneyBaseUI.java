package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.luckymoney.model.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.j;
import com.tencent.mm.wallet_core.d.f;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class LuckyMoneyBaseUI extends MMActivity
  implements com.tencent.mm.wallet_core.c.h, f
{
  private LinkedList<j> ocA = new LinkedList();
  public s ocz = null;

  public final void a(j paramj)
  {
    if (!this.ocA.contains(paramj))
      this.ocA.add(paramj);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, m paramm, boolean paramBoolean)
  {
    if ((!c(paramInt1, paramInt2, paramString, paramm)) && ((paramInt1 != 0) || (paramInt2 != 0)))
    {
      com.tencent.mm.ui.base.h.bQ(this, paramString);
      finish();
    }
  }

  public final void b(m paramm, boolean paramBoolean)
  {
    this.ocz.b(paramm, paramBoolean);
  }

  public final void bMp()
  {
    if (getSupportActionBar() != null)
    {
      getSupportActionBar().show();
      xE(getResources().getColor(2131690223));
    }
  }

  protected final void bMq()
  {
    if (getSupportActionBar() != null)
      getSupportActionBar().hide();
  }

  public abstract boolean c(int paramInt1, int paramInt2, String paramString, m paramm);

  public final void n(m paramm)
  {
    this.ocz.b(paramm, true);
  }

  public final void nf(int paramInt)
  {
    this.ocz.nf(paramInt);
  }

  public final void ng(int paramInt)
  {
    this.ocz.ng(paramInt);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    paramIntent = ((List)this.ocA.clone()).iterator();
    while (paramIntent.hasNext())
      ((j)paramIntent.next()).dNL();
  }

  public void onCreate(Bundle paramBundle)
  {
    this.yll = true;
    super.onCreate(paramBundle);
    this.ocz = new s(this, this);
    this.ocz.nf(1554);
    this.ocz.nf(1575);
    this.ocz.nf(1668);
    this.ocz.nf(1581);
    this.ocz.nf(1685);
    this.ocz.nf(1585);
    this.ocz.nf(1514);
    this.ocz.nf(1682);
    this.ocz.nf(1612);
    this.ocz.nf(1643);
    this.ocz.nf(1558);
    this.ocz.nf(2715);
    xE(getResources().getColor(2131690223));
    Nc(getResources().getColor(2131690231));
    getLayoutId();
    paramBundle = ((List)this.ocA.clone()).iterator();
    while (paramBundle.hasNext())
      paramBundle.next();
  }

  public void onDestroy()
  {
    this.ocz.ng(1554);
    this.ocz.ng(1575);
    this.ocz.ng(1668);
    this.ocz.ng(1581);
    this.ocz.ng(1685);
    this.ocz.ng(1585);
    this.ocz.ng(1514);
    this.ocz.ng(1682);
    this.ocz.ng(1612);
    this.ocz.ng(1643);
    this.ocz.ng(1558);
    this.ocz.ng(2715);
    Iterator localIterator = ((List)this.ocA.clone()).iterator();
    while (localIterator.hasNext())
      ((j)localIterator.next()).onDestroy();
    this.ocA.clear();
    super.onDestroy();
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (this.ocz.bLA())
        this.ocz.bLz();
      if ((this.mController.contentView.getVisibility() == 8) || (this.mController.contentView.getVisibility() == 4))
        finish();
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
 * JD-Core Version:    0.6.2
 */