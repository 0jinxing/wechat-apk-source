package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.b.a;
import com.tencent.mm.plugin.game.model.aq;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.HashMap;
import java.util.LinkedList;

public class GameLibraryUI extends MMActivity
  implements f
{
  private View emz;
  private boolean exX;
  private Dialog lud;
  private boolean mGe;
  private int mXC;
  private int mXJ;
  private k neZ;
  private ListView nfg;
  private l nfh;
  private boolean nfi;
  private boolean nfj;
  private m.a nfm;
  private AbsListView.OnScrollListener nfn;
  private GameBannerView njP;
  private GameLibraryCategoriesView njQ;
  private View njR;
  private TextView njS;
  private View njT;
  private GameDropdownView njU;
  private HashMap<Integer, String> njV;
  private int njW;
  private View njX;
  private Button njY;
  private boolean njZ;
  private int nka;
  private int nkb;
  private View.OnClickListener nkc;
  private View.OnClickListener nkd;
  private GameDropdownView.a nke;

  public GameLibraryUI()
  {
    AppMethodBeat.i(112041);
    this.njW = 0;
    this.mGe = false;
    this.nfi = false;
    this.mXJ = 0;
    this.nfj = true;
    this.njZ = false;
    this.exX = true;
    this.mXC = 0;
    this.nka = 990;
    this.nkb = 0;
    this.neZ = new k();
    this.nfm = new GameLibraryUI.3(this);
    this.nkc = new GameLibraryUI.5(this);
    this.nkd = new GameLibraryUI.6(this);
    this.nke = new GameDropdownView.a()
    {
      public final void wI(int paramAnonymousInt)
      {
        AppMethodBeat.i(112037);
        LinkedList localLinkedList = new LinkedList();
        localLinkedList.addAll(GameLibraryUI.f(GameLibraryUI.this).keySet());
        if (paramAnonymousInt > localLinkedList.size() - 1)
          AppMethodBeat.o(112037);
        while (true)
        {
          return;
          GameLibraryUI.a(GameLibraryUI.this, ((Integer)localLinkedList.get(paramAnonymousInt)).intValue());
          ab.i("MicroMsg.GameLibraryUI", "Selected SortType: %d", new Object[] { Integer.valueOf(GameLibraryUI.g(GameLibraryUI.this)) });
          GameLibraryUI.b(GameLibraryUI.this, 0);
          GameLibraryUI.h(GameLibraryUI.this);
          com.tencent.mm.plugin.game.e.b.a(GameLibraryUI.this, 11, 1111, GameLibraryUI.g(GameLibraryUI.this) + GameLibraryUI.i(GameLibraryUI.this), 2, GameLibraryUI.e(GameLibraryUI.this), null);
          AppMethodBeat.o(112037);
        }
      }
    };
    this.nfn = new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        AppMethodBeat.i(112038);
        if ((paramAnonymousInt == 0) && (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1))
          if ((!GameLibraryUI.j(GameLibraryUI.this)) || (GameLibraryUI.k(GameLibraryUI.this)))
            AppMethodBeat.o(112038);
        while (true)
        {
          return;
          GameLibraryUI.l(GameLibraryUI.this).setVisibility(0);
          GameLibraryUI.h(GameLibraryUI.this);
          AppMethodBeat.o(112038);
        }
      }
    };
    AppMethodBeat.o(112041);
  }

  private void bFl()
  {
    AppMethodBeat.i(112049);
    Object localObject = getIntent().getStringExtra("jump_game_center");
    if ((!bo.isNullOrNil((String)localObject)) && (((String)localObject).equals("jump_game_center")))
    {
      localObject = new Intent(this, GameCenterUI.class);
      ((Intent)localObject).putExtra("jump_find_more_friends", "jump_find_more_friends");
      startActivity((Intent)localObject);
    }
    AppMethodBeat.o(112049);
  }

  private void bFq()
  {
    AppMethodBeat.i(112050);
    Object localObject = e.bDR();
    int i = this.mXJ;
    int j = this.njW;
    if (this.mXJ == 0);
    for (boolean bool = true; ; bool = false)
    {
      localObject = new aq(i, (LinkedList)localObject, j, bool);
      g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      this.nfi = true;
      AppMethodBeat.o(112050);
      return;
    }
  }

  private void goBack()
  {
    AppMethodBeat.i(112048);
    bFl();
    finish();
    AppMethodBeat.o(112048);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969731;
  }

  public final void initView()
  {
    AppMethodBeat.i(112047);
    setMMTitle(2131300277);
    setBackBtn(new GameLibraryUI.1(this));
    if (!bo.isNullOrNil(e.bEe()))
      addIconOptionMenu(0, 2131304082, 2131230741, new GameLibraryUI.2(this));
    this.nfg = ((ListView)findViewById(2131824543));
    this.nfg.setOnItemClickListener(this.neZ);
    this.neZ.setSourceScene(this.mXC);
    this.nfg.setOnScrollListener(this.nfn);
    this.nfh = new l(this);
    this.nfh.setSourceScene(this.mXC);
    this.nfh.a(this.nfm);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mController.ylL.getSystemService("layout_inflater");
    Object localObject = localLayoutInflater.inflate(2130969739, this.nfg, false);
    this.njP = ((GameBannerView)((View)localObject).findViewById(2131824553));
    this.njP.setSourceScene(this.mXC);
    this.nfg.addHeaderView((View)localObject);
    this.nkb += 1;
    this.njQ = ((GameLibraryCategoriesView)localLayoutInflater.inflate(2130969733, this.nfg, false));
    localObject = new LinearLayout(this);
    ((LinearLayout)localObject).addView(this.njQ);
    this.nfg.addHeaderView((View)localObject);
    this.nkb += 1;
    this.njR = localLayoutInflater.inflate(2130969738, this.nfg, false);
    this.njR.setOnClickListener(this.nkc);
    this.njS = ((TextView)this.njR.findViewById(2131824552));
    this.njT = localLayoutInflater.inflate(2130969732, this.nfg, false);
    this.njT.setOnClickListener(null);
    this.njU = ((GameDropdownView)this.njT.findViewById(2131824545));
    this.njU.setAnchorView(this.njT);
    this.njU.setOnSelectionChangedListener(this.nke);
    this.emz = localLayoutInflater.inflate(2130969741, this.nfg, false);
    this.emz.setVisibility(8);
    localObject = new LinearLayout(this);
    ((LinearLayout)localObject).addView(this.emz);
    this.nfg.addFooterView((View)localObject);
    this.njX = localLayoutInflater.inflate(2130969737, this.nfg, false);
    this.njX.setVisibility(8);
    this.njY = ((Button)this.njX.findViewById(2131824550));
    this.njY.setOnClickListener(this.nkd);
    this.nfg.addFooterView(this.njX);
    this.nfg.setAdapter(this.nfh);
    AppMethodBeat.o(112047);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(112052);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.GameLibraryUI", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 != 1)
    {
      ab.e("MicroMsg.GameLibraryUI", "error request code");
      AppMethodBeat.o(112052);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(112052);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(112042);
    super.onCreate(paramBundle);
    if (!g.RK())
    {
      ab.e("MicroMsg.GameLibraryUI", "account not ready");
      finish();
      AppMethodBeat.o(112042);
      return;
    }
    this.mXC = getIntent().getIntExtra("game_report_from_scene", 0);
    g.Rg().a(1218, this);
    initView();
    paramBundle = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCZ().NK("pb_library");
    if (paramBundle == null)
      ab.i("MicroMsg.GameLibraryUI", "No cache found");
    for (int i = 0; ; i = 1)
    {
      if (i == 0)
      {
        this.lud = com.tencent.mm.plugin.game.f.c.ej(this);
        this.lud.show();
      }
      bFq();
      com.tencent.mm.plugin.game.e.b.a(this, 11, 1100, 0, 1, this.mXC, null);
      AppMethodBeat.o(112042);
      break;
      g.RS().aa(new GameLibraryUI.4(this, paramBundle));
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(112045);
    ab.i("MicroMsg.GameLibraryUI", "onDestroy");
    super.onDestroy();
    g.Rg().b(1218, this);
    this.nfh.clear();
    if (this.njP != null)
      this.njP.neF.stopTimer();
    AppMethodBeat.o(112045);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(112046);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(112046);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(112046);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(112044);
    super.onPause();
    if (this.njP != null)
    {
      GameBannerView localGameBannerView = this.njP;
      if (localGameBannerView.neF != null)
      {
        localGameBannerView.neF.stopTimer();
        ab.i("MicroMsg.GameBannerView", "Auto scroll stopped");
      }
    }
    AppMethodBeat.o(112044);
  }

  public void onResume()
  {
    AppMethodBeat.i(112043);
    super.onResume();
    if (!g.RK())
    {
      ab.e("MicroMsg.GameLibraryUI", "account not ready");
      AppMethodBeat.o(112043);
    }
    while (true)
    {
      return;
      this.nfh.refresh();
      if ((!this.exX) && (this.njP != null))
      {
        GameBannerView localGameBannerView = this.njP;
        if ((localGameBannerView.neF != null) && (localGameBannerView.neF.doT()) && (localGameBannerView.neE.size() > 1))
        {
          localGameBannerView.neF.ae(5000L, 5000L);
          ab.i("MicroMsg.GameBannerView", "Auto scroll restarted");
        }
      }
      if (this.exX)
        this.exX = false;
      AppMethodBeat.o(112043);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(112051);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (paramm.getType())
      {
      default:
        AppMethodBeat.o(112051);
      case 1218:
      }
    while (true)
    {
      return;
      paramString = ((aq)paramm).lty.fsH.fsP;
      g.RS().aa(new GameLibraryUI.9(this, paramString));
      break;
      if (!a.gkF.a(this, paramInt1, paramInt2, paramString))
        Toast.makeText(this, getString(2131300298, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      if (this.lud != null)
        this.lud.cancel();
      AppMethodBeat.o(112051);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameLibraryUI
 * JD-Core Version:    0.6.2
 */