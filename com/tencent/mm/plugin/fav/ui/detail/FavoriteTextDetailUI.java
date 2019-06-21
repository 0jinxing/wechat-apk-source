package com.tencent.mm.plugin.fav.ui.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.b;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMLoadScrollView;

public class FavoriteTextDetailUI extends BaseFavDetailReportUI
{
  private static final int mmM;
  private com.tencent.mm.ui.tools.j contextMenuHelper;
  private long mmC;
  private TextView mmN;
  private ClipboardManager mmO;
  private com.tencent.mm.plugin.fav.a.g mmP;
  private n.d mmQ;
  private com.tencent.mm.plugin.fav.a.g mmj;

  static
  {
    AppMethodBeat.i(74455);
    mmM = b.MY();
    AppMethodBeat.o(74455);
  }

  public FavoriteTextDetailUI()
  {
    AppMethodBeat.i(74445);
    this.mmQ = new FavoriteTextDetailUI.3(this);
    AppMethodBeat.o(74445);
  }

  private void bwp()
  {
    AppMethodBeat.i(74451);
    this.mmj = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(this.mmC);
    F(this.mmj);
    if ((this.mmj == null) || (this.mmj.field_favProto == null))
    {
      ab.w("MicroMsg.FavoriteTextDetailUI", "id[%d] info is null, return", new Object[] { Long.valueOf(this.mmC) });
      AppMethodBeat.o(74451);
    }
    while (true)
    {
      return;
      a.a(this, this.mmj);
      if ((this.mmP != null) && (this.mmP.field_edittime == this.mmj.field_edittime))
      {
        ab.w("MicroMsg.FavoriteTextDetailUI", "not change, return");
        AppMethodBeat.o(74451);
      }
      else
      {
        this.mmP = this.mmj;
        this.mmN.setText(this.mmj.field_favProto.desc);
        com.tencent.mm.pluginsdk.ui.e.j.h(this.mmN, 1);
        AppMethodBeat.o(74451);
      }
    }
  }

  protected final MMLoadScrollView bwd()
  {
    AppMethodBeat.i(74446);
    MMLoadScrollView localMMLoadScrollView = (MMLoadScrollView)findViewById(2131823999);
    AppMethodBeat.o(74446);
    return localMMLoadScrollView;
  }

  public final int getLayoutId()
  {
    return 2130969542;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(74453);
    if ((1 == paramInt1) && (-1 == paramInt2))
    {
      h.bQ(this.mController.ylL, getString(2131297039));
      new ak().postDelayed(new FavoriteTextDetailUI.4(this), 250L);
      AppMethodBeat.o(74453);
    }
    while (true)
    {
      return;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(74453);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74447);
    super.onCreate(paramBundle);
    this.mmN = ((TextView)findViewById(2131824004));
    this.mmO = ((ClipboardManager)ah.getContext().getSystemService("clipboard"));
    this.mmC = getIntent().getLongExtra("key_detail_info_id", -1L);
    i.Lt(5);
    this.contextMenuHelper = new com.tencent.mm.ui.tools.j(this.mController.ylL);
    this.contextMenuHelper.a(this.mmN, this, this.mmQ);
    setMMTitle(getString(2131299596));
    setBackBtn(new FavoriteTextDetailUI.1(this));
    addIconOptionMenu(0, 2131304081, 2130839555, new FavoriteTextDetailUI.2(this));
    AppMethodBeat.o(74447);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(74452);
    paramContextMenu.add(0, 1, 0, getString(2131296875));
    AppMethodBeat.o(74452);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74448);
    super.onDestroy();
    AppMethodBeat.o(74448);
  }

  public void onPause()
  {
    AppMethodBeat.i(74450);
    super.onPause();
    AppMethodBeat.o(74450);
  }

  public void onResume()
  {
    AppMethodBeat.i(74449);
    super.onResume();
    bwp();
    AppMethodBeat.o(74449);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI
 * JD-Core Version:    0.6.2
 */