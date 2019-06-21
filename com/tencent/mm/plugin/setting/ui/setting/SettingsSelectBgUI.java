package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.o;
import com.tencent.mm.ai.p;
import com.tencent.mm.ba.j;
import com.tencent.mm.ba.k;
import com.tencent.mm.ba.n;
import com.tencent.mm.ba.r;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SettingsSelectBgUI extends MMActivity
  implements f
{
  private boolean qmZ;
  private SettingsSelectBgUI.a qoQ;
  private GridView qoR;
  private j qoS;
  private List<j> qoT;
  private ap qoU;
  private String username;

  public SettingsSelectBgUI()
  {
    AppMethodBeat.i(127480);
    this.qoT = new ArrayList();
    this.qoU = new ap(new SettingsSelectBgUI.1(this), true);
    AppMethodBeat.o(127480);
  }

  private void cZ(List<j> paramList)
  {
    AppMethodBeat.i(127485);
    if (paramList.size() > 0)
    {
      this.qoS = ((j)paramList.remove(0));
      g.Rg().a(this.qoS, 0);
      AppMethodBeat.o(127485);
    }
    while (true)
    {
      return;
      this.qoS = null;
      AppMethodBeat.o(127485);
    }
  }

  public final int getLayoutId()
  {
    return 2130970642;
  }

  public final void initView()
  {
    AppMethodBeat.i(127483);
    setMMTitle(2131303063);
    setBackBtn(new SettingsSelectBgUI.2(this));
    this.qmZ = getIntent().getBooleanExtra("isApplyToAll", true);
    this.username = getIntent().getStringExtra("username");
    this.qoU.ae(20L, 20L);
    AppMethodBeat.o(127483);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127481);
    super.onCreate(paramBundle);
    initView();
    g.Rg().a(159, this);
    g.Rg().a(160, this);
    if (g.RP().isSDCardAvailable())
    {
      paramBundle = new k(1);
      g.Rg().a(paramBundle, 0);
    }
    AppMethodBeat.o(127481);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127482);
    super.onDestroy();
    if (this.qoS != null)
    {
      g.Rg().c(this.qoS);
      r.aix().cz(this.qoS.fMn, 1);
    }
    List localList = this.qoT;
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      r.aix().cz(localj.fMn, 1);
    }
    localList.clear();
    g.Rg().b(159, this);
    g.Rg().b(160, this);
    this.qoQ.bIf();
    r.aix().d(this.qoQ);
    AppMethodBeat.o(127482);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(127484);
    if ((!(paramm instanceof o)) || (((o)paramm).acR() != 1))
    {
      ab.d("MicroMsg.SettingsSelectBgUI", "another scene");
      AppMethodBeat.o(127484);
    }
    while (true)
    {
      return;
      int i = paramm.getType();
      if ((i != 159) && (i != 160))
      {
        AppMethodBeat.o(127484);
      }
      else
      {
        if (i == 160)
          cZ(this.qoT);
        if ((paramInt1 != 0) || (paramInt2 != 0))
          AppMethodBeat.o(127484);
        else
          AppMethodBeat.o(127484);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI
 * JD-Core Version:    0.6.2
 */