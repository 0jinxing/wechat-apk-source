package com.tencent.mm.kiss;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.vending.app.c;
import com.tencent.mm.vending.c.b;

public abstract class WxPresenterActivity extends MMActivity
{
  protected c eMI = new c();

  public final com.tencent.mm.vending.app.a SK()
  {
    return this.eMI.SK();
  }

  public final <T extends b<? extends com.tencent.mm.vending.app.a>> T V(Class<? extends b<? extends com.tencent.mm.vending.app.a>> paramClass)
  {
    return this.eMI.a(this, paramClass);
  }

  public void keep(com.tencent.mm.vending.e.a parama)
  {
    this.eMI.keep(parama);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eMI.A(getIntent(), this);
  }

  public void onDestroy()
  {
    this.eMI.onDestroy();
    super.onDestroy();
  }

  public void onPause()
  {
    this.eMI.a(3);
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    this.eMI.a(2);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.WxPresenterActivity
 * JD-Core Version:    0.6.2
 */