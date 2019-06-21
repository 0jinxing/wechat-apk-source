package com.tencent.mm.plugin.fav.ui.detail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.n;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.FavChatVoiceView;
import com.tencent.mm.plugin.fav.ui.j;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;

public class FavoriteVoiceDetailUI extends BaseFavDetailReportUI
  implements k.a
{
  private n mgA;
  private com.tencent.mm.plugin.fav.a.g mgf;
  private long mmC;
  private FavChatVoiceView mni;

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(74488);
    this.mgf = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(this.mmC);
    if (this.mgf == null)
    {
      ab.w("MicroMsg.FavoriteDetailUI", "on notify changed, get fav item info error");
      finish();
      AppMethodBeat.o(74488);
    }
    while (true)
    {
      return;
      if (this.mgf.field_itemStatus != 10)
      {
        AppMethodBeat.o(74488);
      }
      else if ((paramm == null) || (paramm.xDr == null))
      {
        AppMethodBeat.o(74488);
      }
      else
      {
        if (this.mgf.field_favProto.wiv.size() > 0)
        {
          paramm = b.c(this.mgf);
          paramString = b.b(paramm);
          int i = b.LE(paramm.wgo);
          ab.i("MicroMsg.FavoriteDetailUI", "on notify changed, favVoiceView.updateInfo");
          paramm = j.B(this, (int)b.iu(paramm.duration)).toString();
          this.mni.t(paramString, i, paramm);
        }
        AppMethodBeat.o(74488);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969543;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74484);
    super.onCreate(paramBundle);
    setMMTitle(getString(2131299596));
    this.mmC = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.mgf = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(this.mmC);
    if (this.mgf == null)
    {
      ab.w("MicroMsg.FavoriteDetailUI", "get fav item info error");
      finish();
    }
    while (true)
    {
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().c(this);
      AppMethodBeat.o(74484);
      return;
      F(this.mgf);
      this.mgA = new n();
      this.mni = ((FavChatVoiceView)findViewById(2131824005));
      this.mni.setVoiceHelper(this.mgA);
      a.a(this, this.mgf);
      Object localObject = b.c(this.mgf);
      paramBundle = b.b((aar)localObject);
      int i = b.LE(((aar)localObject).wgo);
      if (!e.ct(paramBundle))
        b.m(this.mgf);
      localObject = j.B(this, (int)b.iu(((aar)localObject).duration)).toString();
      this.mni.t(paramBundle, i, (String)localObject);
      setBackBtn(new FavoriteVoiceDetailUI.1(this));
      addIconOptionMenu(0, 2131304081, 2130839555, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(74483);
          paramAnonymousMenuItem = new d(FavoriteVoiceDetailUI.this.mController.ylL, 1, false);
          paramAnonymousMenuItem.rBl = new FavoriteVoiceDetailUI.2.1(this);
          paramAnonymousMenuItem.rBm = new FavoriteVoiceDetailUI.2.2(this);
          paramAnonymousMenuItem.cpD();
          AppMethodBeat.o(74483);
          return true;
        }
      });
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74485);
    super.onDestroy();
    if (this.mni != null)
      this.mni.stopPlay();
    if (this.mgA != null)
      this.mgA.destroy();
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().d(this);
    AppMethodBeat.o(74485);
  }

  public void onPause()
  {
    AppMethodBeat.i(74487);
    super.onPause();
    this.mgA.pause();
    AppMethodBeat.o(74487);
  }

  public void onResume()
  {
    AppMethodBeat.i(74486);
    super.onResume();
    AppMethodBeat.o(74486);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI
 * JD-Core Version:    0.6.2
 */