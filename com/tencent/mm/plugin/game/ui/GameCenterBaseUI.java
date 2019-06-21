package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.a;
import com.tencent.mm.plugin.game.f.a.a;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public abstract class GameCenterBaseUI extends GameCenterActivity
{
  protected int mXC = 0;
  private boolean nfA = true;
  protected boolean nfv = false;
  protected n nfw;
  protected n nfx;
  protected n nfy;
  protected boolean nfz = false;

  public final int bFf()
  {
    return 10;
  }

  public final int bFg()
  {
    return 1000;
  }

  public final int bFh()
  {
    return this.mXC;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!g.RK())
    {
      ab.e("MicroMsg.GameCenterBaseUI", "account not ready");
      finish();
    }
    while (true)
    {
      return;
      this.mXC = getIntent().getIntExtra("game_report_from_scene", 0);
      this.nfv = getIntent().getBooleanExtra("from_find_more_friend", false);
      c.aNS().aa(new GameCenterBaseUI.1(this));
      b.a(this, 10, 1000, 0, 1, 0, null, this.mXC, 0, null, null, null);
    }
  }

  public void onResume()
  {
    super.onResume();
    if (!g.RK())
      ab.e("MicroMsg.GameCenterBaseUI", "account not ready");
    while (true)
    {
      return;
      if ((!this.nfA) && (a.a.bFE().nns))
      {
        a.a.bFE().nns = false;
        ab.i("MicroMsg.GameCenterBaseUI", "restart page from country setting");
        if (!isFinishing())
          finish();
        sendBroadcast(new Intent("com.tencent.mm.ACTION_EXIT"), "com.tencent.mm.permission.MM_MESSAGE");
        Intent localIntent = new Intent();
        localIntent.putExtra("game_report_from_scene", 901);
        localIntent.putExtra("switch_country_no_anim", true);
        d.b(this, "game", ".ui.GameCenterUI", localIntent);
      }
      this.nfA = false;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCenterBaseUI
 * JD-Core Version:    0.6.2
 */