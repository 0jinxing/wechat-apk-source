package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragment;

public class OpenIMAddressUI extends MMActivity
{
  public MMFragment zjY;

  public final int getLayoutId()
  {
    return 2130970335;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33800);
    super.onCreate(paramBundle);
    paramBundle = getSupportFragmentManager();
    if (paramBundle.findFragmentById(16908290) == null)
    {
      this.zjY = new OpenIMAddressUI.OpenIMAddressUIFragment();
      this.zjY.setArguments(getIntent().getExtras());
      paramBundle.beginTransaction().a(2131826448, this.zjY).commit();
    }
    AppMethodBeat.o(33800);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.OpenIMAddressUI
 * JD-Core Version:    0.6.2
 */