package com.tencent.toybrick.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.toybrick.b.b;
import com.tencent.toybrick.b.c;
import com.tencent.toybrick.c.g;
import com.tencent.toybrick.d.a.a;

public abstract class VerticalToyUI<T extends com.tencent.toybrick.g.a> extends BaseToyUI<g>
{
  private a.a AFT;
  private b AHu;
  private com.tencent.toybrick.d.a AHv;
  protected T AHw = null;

  static
  {
    if (!VerticalToyUI.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    try
    {
      throw new NullPointerException();
      this.AHv = new com.tencent.toybrick.d.a(this);
      this.AFT = this.AHv.AFT;
      paramBundle = (RecyclerView)findViewById(2131828399);
      getBaseContext();
      Object localObject = new LinearLayoutManager();
      ((LinearLayoutManager)localObject).alM = 4;
      ((LinearLayoutManager)localObject).an(true);
      paramBundle.setLayoutManager((RecyclerView.i)localObject);
      localObject = new b(this, this.AFT);
      this.AHu = ((b)localObject);
      paramBundle.setAdapter((RecyclerView.a)localObject);
      paramBundle.setRecycledViewPool(com.tencent.toybrick.b.a.dSx());
      paramBundle.setViewCacheExtension(new VerticalToyUI.1(this));
      localObject = new c(this);
      ((c)localObject).AFT = this.AFT;
      paramBundle.a((RecyclerView.h)localObject);
      if (this.AHu != null)
        this.AHu.aop.notifyChanged();
      return;
    }
    catch (InstantiationException paramBundle)
    {
      while (true)
        ai.printErrStackTrace("VerticalToyUI", paramBundle, "", new Object[0]);
    }
    catch (IllegalAccessException paramBundle)
    {
      while (true)
        ai.printErrStackTrace("VerticalToyUI", paramBundle, "", new Object[0]);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.ui.VerticalToyUI
 * JD-Core Version:    0.6.2
 */