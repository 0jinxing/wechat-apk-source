package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.game.d.bk;
import com.tencent.mm.plugin.game.f.a.a;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class GameOverSeaCenterUI extends GameCenterBaseUI
  implements f
{
  private boolean exX;
  private Dialog lud;
  private bk mYh;
  k neZ;
  private boolean nhR;
  private String nhS;
  private View.OnClickListener nkd;
  private GameCenterListView nlA;
  private g nlB;
  private GameInfoViewForeign nlC;
  private GameMessageBubbleView nlD;
  private GameInstalledView nlE;
  private View nlF;
  private TextView nlG;

  public GameOverSeaCenterUI()
  {
    AppMethodBeat.i(112135);
    this.neZ = new k();
    this.nhS = "";
    this.exX = true;
    this.nkd = new GameOverSeaCenterUI.4(this);
    AppMethodBeat.o(112135);
  }

  private void bFx()
  {
    AppMethodBeat.i(112140);
    this.nlA = ((GameCenterListView)findViewById(2131824361));
    this.nlA.setOnItemClickListener(this.neZ);
    this.neZ.setSourceScene(this.mXC);
    this.nlB = new g(this);
    this.nlB.setSourceScene(this.mXC);
    Object localObject = (LayoutInflater)this.mController.ylL.getSystemService("layout_inflater");
    View localView = ((LayoutInflater)localObject).inflate(2130969679, this.nlA, false);
    this.nlC = ((GameInfoViewForeign)localView.findViewById(2131824391));
    this.nlA.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(2130969668, this.nlA, false);
    this.nlD = ((GameMessageBubbleView)localView.findViewById(2131824333));
    this.nlA.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(2130969680, this.nlA, false);
    this.nlE = ((GameInstalledView)localView.findViewById(2131824395));
    this.nlA.addHeaderView(localView);
    localObject = ((LayoutInflater)localObject).inflate(2130969673, this.nlA, false);
    this.nlA.addFooterView((View)localObject);
    this.nlF = ((View)localObject).findViewById(2131824364);
    this.nlF.setOnClickListener(this.nkd);
    this.nlG = ((TextView)((View)localObject).findViewById(2131824365));
    this.nlA.setAdapter(this.nlB);
    AppMethodBeat.o(112140);
  }

  public final int getLayoutId()
  {
    return 2130969671;
  }

  public final void initView()
  {
    AppMethodBeat.i(112139);
    setBackBtn(new GameOverSeaCenterUI.1(this));
    setMMTitle(2131300361);
    bFx();
    AppMethodBeat.o(112139);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(112136);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.GameOverSeaCenterUI", "GameOverSeaCenterUI create");
    com.tencent.mm.kernel.g.Rg().a(2855, this);
    initView();
    c.aNS().aa(new GameOverSeaCenterUI.2(this));
    AppMethodBeat.o(112136);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(112138);
    ab.i("MicroMsg.GameOverSeaCenterUI", "onDestroy");
    super.onDestroy();
    a.a.bFE().clearCache();
    com.tencent.mm.kernel.g.Rg().b(2855, this);
    ((com.tencent.mm.plugin.game.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.b.class)).bCV().clearCache();
    AppMethodBeat.o(112138);
  }

  public void onResume()
  {
    AppMethodBeat.i(112137);
    super.onResume();
    if (!this.exX)
    {
      if (this.nfv)
        this.nlD.bFu();
      this.nlC.bFo();
    }
    this.exX = false;
    AppMethodBeat.o(112137);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(112141);
    ab.i("MicroMsg.GameOverSeaCenterUI", "errType: %d errCode: %d, scene: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramm.hashCode()) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (paramm.getType())
      {
      default:
        AppMethodBeat.o(112141);
      case 2855:
      }
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      paramString = ((ap)paramm).lty.fsH.fsP;
      c.aNS().aa(new GameOverSeaCenterUI.6(this, paramString, l));
      break;
      if (!com.tencent.mm.plugin.game.b.a.gkF.a(this, paramInt1, paramInt2, paramString))
        Toast.makeText(this, getString(2131300298, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      if (this.lud != null)
        this.lud.cancel();
      AppMethodBeat.o(112141);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI
 * JD-Core Version:    0.6.2
 */