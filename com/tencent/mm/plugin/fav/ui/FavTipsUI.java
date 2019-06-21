package com.tencent.mm.plugin.fav.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public class FavTipsUI extends MMBaseActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74167);
    super.onCreate(paramBundle);
    paramBundle = new c.a(this);
    paramBundle.asD(getString(2131299653));
    paramBundle.asE(getString(2131299651) + "\n\n" + getString(2131299652));
    paramBundle.Qc(2131299650).a(new FavTipsUI.1(this));
    paramBundle.f(new FavTipsUI.2(this));
    paramBundle.aMb().show();
    AppMethodBeat.o(74167);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavTipsUI
 * JD-Core Version:    0.6.2
 */