package com.tencent.mm.vending.app;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.e.b;

public abstract class PresenterActivity extends Activity
  implements b
{
  private c zXm = new c();

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.zXm.A(getIntent(), this);
  }

  protected void onDestroy()
  {
    this.zXm.onDestroy();
    super.onDestroy();
  }

  protected void onPause()
  {
    this.zXm.a(3);
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    this.zXm.a(2);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.app.PresenterActivity
 * JD-Core Version:    0.6.2
 */