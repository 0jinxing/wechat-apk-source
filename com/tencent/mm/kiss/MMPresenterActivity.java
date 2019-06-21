package com.tencent.mm.kiss;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.vending.app.c;

public abstract class MMPresenterActivity extends MMActivity
{
  private c eMI = new c();

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eMI.A(getIntent(), this);
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.eMI.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    this.eMI.a(3);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.MMPresenterActivity
 * JD-Core Version:    0.6.2
 */