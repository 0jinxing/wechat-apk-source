package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

public abstract class GameBaseActivity extends MMActivity
{
  private long mStartTime = 0L;
  private int neK = 1;
  private long neL = 0L;
  private long neM = 0L;

  protected boolean bFe()
  {
    return true;
  }

  public abstract int bFf();

  public abstract int bFg();

  public abstract int bFh();

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  public void onDestroy()
  {
    if (this.mStartTime != 0L)
    {
      long l = System.currentTimeMillis() - this.mStartTime;
      ab.i("MicroMsg.GameBaseActivity", "visit page(%s), stayTime:%sms, foregroundTime:%sms", new Object[] { getClass().getSimpleName(), Long.valueOf(l), Long.valueOf(this.neL) });
      if (bFe())
        a.a(this.neK, bFf(), bFg(), bFh(), "", "", l / 1000L, this.neL / 1000L);
    }
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    this.neL += System.currentTimeMillis() - this.neM;
  }

  public void onResume()
  {
    if (this.mStartTime == 0L)
      this.mStartTime = System.currentTimeMillis();
    this.neM = System.currentTimeMillis();
    super.onResume();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameBaseActivity
 * JD-Core Version:    0.6.2
 */