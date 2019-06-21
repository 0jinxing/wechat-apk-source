package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.o;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

public class ArtistUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private SharedPreferences ehZ;
  private ListView gGW;
  ak lda;
  private String nJy;
  private f rgL;
  private ArtistHeader rgM;
  private com.tencent.mm.ai.m rgN;
  com.tencent.mm.plugin.sns.model.g rgO;
  com.tencent.mm.plugin.sns.model.b rgP;
  private Runnable rgQ;
  private Runnable rgR;
  private com.tencent.mm.ui.base.p tipDialog;

  public ArtistUI()
  {
    AppMethodBeat.i(38122);
    this.nJy = "";
    this.rgN = null;
    this.tipDialog = null;
    this.lda = af.bCo();
    this.rgO = af.cnC();
    this.rgP = af.cnA();
    this.rgQ = new ArtistUI.1(this);
    this.rgR = new ArtistUI.2(this);
    AppMethodBeat.o(38122);
  }

  public final int getLayoutId()
  {
    return 2130970747;
  }

  public final void initView()
  {
    AppMethodBeat.i(38127);
    setMMTitle(2131303268);
    getString(2131297061);
    this.tipDialog = h.b(this, getString(2131296966), true, new ArtistUI.3(this));
    this.gGW = ((ListView)findViewById(2131827689));
    a.gkF.bj(false);
    this.rgL = new f(this, this.nJy, new ArtistUI.4(this), new ArtistUI.5(this));
    this.gGW.setOnScrollListener(new ArtistUI.6(this));
    this.rgM = new ArtistHeader(this);
    this.gGW.addHeaderView(this.rgM);
    this.gGW.setAdapter(this.rgL);
    this.rgL.notifyDataSetChanged();
    this.rgM.setVisibility(8);
    setBackBtn(new ArtistUI.7(this));
    AppMethodBeat.o(38127);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(38123);
    super.onCreate(paramBundle);
    String str = aa.g(getSharedPreferences(ah.doA(), 0));
    ab.d("MicroMsg.ArtistUI", "filterLan temp ".concat(String.valueOf(str)));
    paramBundle = str;
    if (!str.equals("zh_CN"))
    {
      paramBundle = str;
      if (!str.equals("en"))
      {
        if (!str.equals("zh_TW"))
          break label149;
        paramBundle = str;
      }
    }
    while (true)
    {
      this.nJy = paramBundle;
      ab.d("MicroMsg.ArtistUI", "lan " + this.nJy);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(159, this);
      this.ehZ = getSharedPreferences(ah.doA(), 0);
      initView();
      paramBundle = this.rgM;
      af.cnA().a(paramBundle);
      AppMethodBeat.o(38123);
      return;
      label149: if (str.equals("zh_HK"))
        paramBundle = "zh_TW";
      else
        paramBundle = "en";
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(38124);
    super.onDestroy();
    if (this.tipDialog != null)
      this.tipDialog = null;
    if (this.rgM != null)
    {
      ArtistHeader localArtistHeader = this.rgM;
      af.cnA().b(localArtistHeader);
    }
    af.cnC().ab(this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(159, this);
    AppMethodBeat.o(38124);
  }

  public void onPause()
  {
    AppMethodBeat.i(38126);
    super.onPause();
    AppMethodBeat.o(38126);
  }

  public void onResume()
  {
    AppMethodBeat.i(38125);
    super.onResume();
    AppMethodBeat.o(38125);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(38128);
    if ((!(paramm instanceof o)) || (((o)paramm).acR() != 4))
    {
      ab.d("MicroMsg.ArtistUI", "another scene");
      AppMethodBeat.o(38128);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ArtistUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramm.getType() + " @" + hashCode());
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break;
      if ((paramm.getType() == 159) && (this.tipDialog != null))
        this.tipDialog.dismiss();
      AppMethodBeat.o(38128);
    }
    switch (paramm.getType())
    {
    default:
    case 159:
    }
    while (true)
    {
      AppMethodBeat.o(38128);
      break;
      if (this.rgL != null)
        this.rgL.KC();
      this.rgN = null;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ArtistUI
 * JD-Core Version:    0.6.2
 */