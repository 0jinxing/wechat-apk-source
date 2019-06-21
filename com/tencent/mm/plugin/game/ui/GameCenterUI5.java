package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.f.a.a;
import com.tencent.mm.plugin.game.model.ac;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.ax;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class GameCenterUI5 extends GameCenterBaseUI
  implements f
{
  private boolean exX = true;
  private Dialog lud;
  private GameNewTopBannerView nfM;
  private GameIndexSearchView nfN;
  private GameIndexWxagView nfO;
  private GameMessageBubbleView nfP;
  private GameBlockView nfQ;
  private GameRecomBlockView nfR;
  private GameNewClassifyView nfS;
  private GameIndexListView nfT;

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969665;
  }

  public final void initView()
  {
    AppMethodBeat.i(111796);
    setBackBtn(new GameCenterUI5.1(this));
    setMMTitle(2131300361);
    this.nfT = ((GameIndexListView)findViewById(2131824328));
    this.nfT.setVisibility(8);
    View localView = getLayoutInflater().inflate(2130969727, this.nfT, false);
    this.nfT.addHeaderView(localView);
    this.nfM = ((GameNewTopBannerView)localView.findViewById(2131824534));
    this.nfN = ((GameIndexSearchView)localView.findViewById(2131824536));
    this.nfO = ((GameIndexWxagView)localView.findViewById(2131824537));
    this.nfP = ((GameMessageBubbleView)localView.findViewById(2131824333));
    this.nfQ = ((GameBlockView)localView.findViewById(2131824538));
    this.nfR = ((GameRecomBlockView)localView.findViewById(2131824539));
    this.nfS = ((GameNewClassifyView)localView.findViewById(2131824540));
    AppMethodBeat.o(111796);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(111793);
    super.onCreate(paramBundle);
    if (!g.RK())
    {
      ab.e("MicroMsg.GameCenterUI5", "account not ready");
      finish();
      AppMethodBeat.o(111793);
    }
    while (true)
    {
      return;
      GameIndexListView.setSourceScene(this.mXC);
      g.Rg().a(2994, this);
      initView();
      com.tencent.mm.plugin.game.f.c.aNS().aa(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(111792);
          Object localObject = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCZ().NK("pb_index_4");
          if (localObject == null)
            al.d(new GameCenterUI5.3.1(this));
          while (true)
          {
            ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCV().init(GameCenterUI5.this);
            com.tencent.mm.plugin.game.f.c.ab(e.bDR());
            localObject = new an(aa.dor(), e.bDR(), GameCenterUI5.this.nfw, GameCenterUI5.this.nfx, GameCenterUI5.this.nfy, GameCenterUI5.this.nfv);
            g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
            e.dY(GameCenterUI5.this.mController.ylL);
            e.bDW();
            a.a.bFE().bFC();
            AppMethodBeat.o(111792);
            return;
            al.d(new GameCenterUI5.3.2(this, new ac((byte[])localObject)));
          }
        }
      });
      ab.i("MicroMsg.GameCenterUI5", "fromScene = %d", new Object[] { Integer.valueOf(this.mXC) });
      AppMethodBeat.o(111793);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(111795);
    ab.i("MicroMsg.GameCenterUI5", "onDestroy");
    super.onDestroy();
    if (!g.RK())
    {
      ab.e("MicroMsg.GameCenterUI5", "account not ready");
      AppMethodBeat.o(111795);
    }
    while (true)
    {
      return;
      a.a.bFE().clearCache();
      g.Rg().b(2994, this);
      ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCV().clearCache();
      ax.bEU();
      ax.bEW();
      AppMethodBeat.o(111795);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(111794);
    super.onResume();
    if (!g.RK())
    {
      ab.e("MicroMsg.GameCenterUI5", "account not ready");
      AppMethodBeat.o(111794);
    }
    while (true)
    {
      return;
      if (!this.exX)
      {
        ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCV().init(this);
        Object localObject = this.nfP;
        ((GameMessageBubbleView)localObject).nle.setOnClickListener(null);
        ((GameMessageBubbleView)localObject).setVisibility(8);
        if (this.nfv)
          this.nfP.bFu();
        localObject = this.nfQ;
        if (((GameBlockView)localObject).nfa != null)
          ((GameBlockView)localObject).nfa.nff.refresh();
        localObject = this.nfT;
        LinearLayoutManager localLinearLayoutManager = (LinearLayoutManager)((GameIndexListView)localObject).getLayoutManager();
        int i = localLinearLayoutManager.iQ();
        int j = localLinearLayoutManager.iS();
        ((GameIndexListView)localObject).njg.ar(i, j - i + 1);
      }
      this.exX = false;
      AppMethodBeat.o(111794);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(111797);
    ab.i("MicroMsg.GameCenterUI5", "errType: %d errCode: %d, scene: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramm.hashCode()) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (paramm.getType())
      {
      default:
        AppMethodBeat.o(111797);
      case 2994:
      }
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      paramString = ((an)paramm).lty.fsH.fsP;
      com.tencent.mm.plugin.game.f.c.aNS().aa(new GameCenterUI5.2(this, paramString, l));
      break;
      if (!com.tencent.mm.plugin.game.b.a.gkF.a(this, paramInt1, paramInt2, paramString))
        Toast.makeText(this, getString(2131300298, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      if (this.lud != null)
        this.lud.cancel();
      AppMethodBeat.o(111797);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCenterUI5
 * JD-Core Version:    0.6.2
 */