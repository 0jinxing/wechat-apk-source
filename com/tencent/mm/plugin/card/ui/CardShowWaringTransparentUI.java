package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;

@a(7)
public class CardShowWaringTransparentUI extends MMActivity
{
  public final int getLayoutId()
  {
    return 2130968985;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88652);
    super.onCreate(paramBundle);
    h.a(this, getString(2131298002, new Object[] { getIntent().getStringExtra("KEY_BRAND_NAME") }), getString(2131298003), getString(2131297883), new CardShowWaringTransparentUI.1(this));
    AppMethodBeat.o(88652);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(88653);
    if (paramInt == 4)
      finish();
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(88653);
    return bool;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardShowWaringTransparentUI
 * JD-Core Version:    0.6.2
 */