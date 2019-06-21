package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.game.commlib.a;
import com.tencent.mm.plugin.game.d.dd;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class GameCenterActivity extends GameBaseActivity
{
  protected int nfs = 0;
  protected String nft = null;
  private dd nfu;

  public void onCreate(Bundle paramBundle)
  {
    this.yll = true;
    super.onCreate(paramBundle);
    this.nfu = a.bDg();
    if (this.nfu != null)
    {
      this.nfs = c.parseColor(this.nfu.color);
      this.nft = this.nfu.mYo;
    }
    ab.i("MicroMsg.GameCenterActivity", "setInitialStatusBarStyle");
    if ((d.iW(21)) && (this.nfs != 0))
      xE(this.nfs);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCenterActivity
 * JD-Core Version:    0.6.2
 */