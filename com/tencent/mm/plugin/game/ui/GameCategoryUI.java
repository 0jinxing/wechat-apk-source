package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.ar;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class GameCategoryUI extends MMActivity
  implements f
{
  private View emz;
  private Dialog iMU;
  private int mType;
  private int mXC;
  private int mXJ;
  private k neZ;
  private ListView nfg;
  private l nfh;
  private boolean nfi;
  private boolean nfj;
  private int nfk;
  private String nfl;
  private m.a nfm;
  private AbsListView.OnScrollListener nfn;

  public GameCategoryUI()
  {
    AppMethodBeat.i(111751);
    this.nfi = false;
    this.mXJ = 0;
    this.nfj = false;
    this.mXC = 0;
    this.neZ = new k();
    this.nfm = new GameCategoryUI.3(this);
    this.nfn = new GameCategoryUI.4(this);
    AppMethodBeat.o(111751);
  }

  private void bFi()
  {
    AppMethodBeat.i(111754);
    ar localar = new ar(this.mXJ, this.mType, this.nfk);
    g.Rg().a(localar, 0);
    this.nfi = true;
    AppMethodBeat.o(111754);
  }

  public final int getLayoutId()
  {
    return 2130969657;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(111756);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.GameCategoryUI", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 != 1)
    {
      ab.e("MicroMsg.GameCategoryUI", "error request code");
      AppMethodBeat.o(111756);
      return;
    }
    String str = null;
    if (paramIntent != null)
      str = paramIntent.getStringExtra("game_app_id");
    switch (paramInt2)
    {
    default:
    case 3:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(111756);
      break;
      if (bo.isNullOrNil(str))
      {
        AppMethodBeat.o(111756);
        break;
      }
      this.nfh.Ok(str);
      AppMethodBeat.o(111756);
      break;
      if (bo.isNullOrNil(str))
      {
        AppMethodBeat.o(111756);
        break;
      }
      this.nfh.Oj(str);
      this.nfh.Ol(str);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(111752);
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("extra_type", 0);
    this.nfk = getIntent().getIntExtra("extra_category_id", 0);
    this.nfl = getIntent().getStringExtra("extra_category_name");
    this.mXC = getIntent().getIntExtra("game_report_from_scene", 0);
    g.Rg().a(1220, this);
    setMMTitle(this.nfl);
    setBackBtn(new GameCategoryUI.1(this));
    if (!bo.isNullOrNil(e.bEe()))
      addIconOptionMenu(0, 2131304082, 2131230741, new GameCategoryUI.2(this));
    this.nfg = ((ListView)findViewById(2131824303));
    this.nfg.setOnItemClickListener(this.neZ);
    this.neZ.setSourceScene(this.mXC);
    this.nfg.setOnScrollListener(this.nfn);
    this.nfh = new l(this);
    this.nfh.setSourceScene(this.mXC);
    this.nfh.a(this.nfm);
    this.emz = ((LayoutInflater)this.mController.ylL.getSystemService("layout_inflater")).inflate(2130969741, this.nfg, false);
    this.emz.setVisibility(8);
    this.nfg.addFooterView(this.emz);
    this.nfg.setAdapter(this.nfh);
    this.iMU = c.ej(this);
    this.iMU.show();
    bFi();
    AppMethodBeat.o(111752);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(111753);
    super.onDestroy();
    g.Rg().b(1220, this);
    this.nfh.clear();
    AppMethodBeat.o(111753);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(111755);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.GameCategoryUI", "errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(111755);
    }
    while (true)
    {
      return;
      paramString = ((ar)paramm).lty.fsH.fsP;
      g.RS().aa(new GameCategoryUI.5(this, paramString));
      AppMethodBeat.o(111755);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCategoryUI
 * JD-Core Version:    0.6.2
 */