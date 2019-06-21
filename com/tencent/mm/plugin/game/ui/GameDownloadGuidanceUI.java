package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.d.at;
import com.tencent.mm.plugin.game.d.bi;
import com.tencent.mm.plugin.game.f.a.a;
import com.tencent.mm.plugin.game.model.ao;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public class GameDownloadGuidanceUI extends GameCenterBaseUI
  implements f
{
  private Dialog lud;
  private bi mXT;
  private LinearLayout mpt;
  private TextView nhO;
  private TextView nhP;
  private TextView nhQ;
  private boolean nhR;
  private String nhS = "";

  public final void a(com.tencent.mm.plugin.game.model.ab paramab, int paramInt)
  {
    AppMethodBeat.i(111890);
    if (isFinishing())
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.GameDownloadGuidanceUI", "GameDownloadGuidanceUI hasFinished");
      AppMethodBeat.o(111890);
    }
    while (true)
    {
      return;
      if ((paramab != null) && (paramab.bEJ() != null))
        break;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.GameDownloadGuidanceUI", "Null data");
      AppMethodBeat.o(111890);
    }
    if ((paramab != null) && (paramab.bEK() != null))
    {
      this.nhS = paramab.bEK().mZj;
      label73: if (bo.isNullOrNil(this.nhS))
        break label247;
      if (!this.nhR)
      {
        addIconOptionMenu(0, 2131230758, new GameDownloadGuidanceUI.4(this));
        this.nhR = true;
      }
      label110: this.mpt.setVisibility(0);
      paramab = paramab.bEJ();
      if (bo.isNullOrNil(paramab.mZZ))
        break label268;
      this.nhO.setText(paramab.mZZ);
      this.nhO.setVisibility(0);
      label152: if (bo.isNullOrNil(paramab.naa))
        break label280;
      this.nhP.setText(paramab.naa);
      this.nhP.setVisibility(0);
      label181: if (bo.isNullOrNil(paramab.nab))
        break label292;
      this.nhQ.setText(paramab.nab);
      this.nhQ.setVisibility(0);
    }
    while (true)
    {
      if (paramInt == 2)
        com.tencent.mm.plugin.game.f.c.aNS().aa(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(111883);
            ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCZ().b("pb_over_sea", GameDownloadGuidanceUI.b(GameDownloadGuidanceUI.this));
            AppMethodBeat.o(111883);
          }
        });
      AppMethodBeat.o(111890);
      break;
      this.nhS = "";
      break label73;
      label247: if (!this.nhR)
        break label110;
      removeOptionMenu(0);
      this.nhR = false;
      break label110;
      label268: this.nhO.setVisibility(8);
      break label152;
      label280: this.nhP.setVisibility(8);
      break label181;
      label292: this.nhQ.setVisibility(8);
    }
  }

  public final int getLayoutId()
  {
    return 2130969722;
  }

  public final void initView()
  {
    AppMethodBeat.i(111889);
    setBackBtn(new GameDownloadGuidanceUI.1(this));
    setMMTitle(2131300361);
    this.mpt = ((LinearLayout)findViewById(2131821064));
    this.nhO = ((TextView)findViewById(2131824519));
    this.nhP = ((TextView)findViewById(2131824520));
    this.nhQ = ((TextView)findViewById(2131824521));
    AppMethodBeat.o(111889);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(111887);
    super.onCreate(paramBundle);
    g.Rg().a(2586, this);
    initView();
    com.tencent.mm.plugin.game.f.c.aNS().aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(111882);
        Object localObject = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCZ().NK("pb_download_guidance");
        if (localObject == null)
          al.d(new GameDownloadGuidanceUI.2.1(this));
        while (true)
        {
          localObject = new ao(aa.dor(), e.bDR(), GameDownloadGuidanceUI.this.nfw, GameDownloadGuidanceUI.this.nfx, GameDownloadGuidanceUI.this.nfy, GameDownloadGuidanceUI.this.nfv);
          g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
          e.bDW();
          a.a.bFE().bFC();
          AppMethodBeat.o(111882);
          return;
          al.d(new GameDownloadGuidanceUI.2.2(this, new com.tencent.mm.plugin.game.model.ab((byte[])localObject)));
        }
      }
    });
    AppMethodBeat.o(111887);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(111888);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.GameDownloadGuidanceUI", "onDestroy");
    super.onDestroy();
    a.a.bFE().clearCache();
    g.Rg().b(2586, this);
    ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCV().clearCache();
    AppMethodBeat.o(111888);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(111891);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.GameDownloadGuidanceUI", "errType: %d errCode: %d, scene: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramm.hashCode()) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (paramm.getType())
      {
      default:
        AppMethodBeat.o(111891);
      case 2586:
      }
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      paramString = ((ao)paramm).lty.fsH.fsP;
      com.tencent.mm.plugin.game.f.c.aNS().aa(new GameDownloadGuidanceUI.5(this, paramString, l));
      break;
      if (!com.tencent.mm.plugin.game.b.a.gkF.a(this, paramInt1, paramInt2, paramString))
        Toast.makeText(this, getString(2131300298, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      if (this.lud != null)
        this.lud.cancel();
      AppMethodBeat.o(111891);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI
 * JD-Core Version:    0.6.2
 */