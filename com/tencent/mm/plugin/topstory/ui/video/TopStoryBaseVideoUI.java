package com.tencent.mm.plugin.topstory.ui.video;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.am;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.topstory.a.c;
import com.tencent.mm.plugin.topstory.a.h;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.q;
import java.io.IOException;
import java.util.List;

public abstract class TopStoryBaseVideoUI extends MMActivity
  implements c, b
{
  public static final int sDT = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 56);
  protected RecyclerView.m eja = new TopStoryBaseVideoUI.3(this);
  protected TextView gnB;
  private boolean hVI = false;
  protected ImageButton oOO;
  private Point qLw;
  protected LinearLayoutManager qYS;
  protected View qpb;
  public chv sBa;
  protected View sDU;
  protected ImageView sDV;
  protected ImageView sDW;
  protected i sDX;
  protected RecyclerView sDY;
  protected e sDZ;
  protected d sEa;
  public RecyclerView sEb;
  protected LinearLayoutManager sEc;
  protected e sEd;
  public d sEe;
  public boolean sEf = true;
  protected int sEg = 0;
  protected long sEh = -1L;
  protected long sEi = -1L;
  private i.a sEj = new TopStoryBaseVideoUI.4(this);
  protected l sEk;
  public o sEl;
  private m sEm;
  public r sEn;
  protected n sEo;
  private boolean sEp;
  protected com.tencent.mm.plugin.topstory.ui.widget.b sEq;
  private am sEr;
  private am sEs;
  public boolean sEt;
  private com.tencent.mm.ai.f sEu = new TopStoryBaseVideoUI.7(this);
  private int videoHeight;

  private void cGB()
  {
    getWindow().setFlags(201327616, 201327616);
    View localView = getWindow().getDecorView();
    if (com.tencent.mm.compatible.util.d.fP(19))
      localView.setSystemUiVisibility(2);
    while (true)
    {
      getWindow().addFlags(128);
      return;
      localView.setSystemUiVisibility(4098);
    }
  }

  private void cGL()
  {
    if (this.sBa.eif)
      this.sDV.setBackgroundResource(2131232064);
    while (true)
    {
      if (this.sEn.sFw)
        this.sEn.setMute(this.sBa.eif);
      return;
      this.sDV.setBackgroundResource(2131232065);
    }
  }

  private void cGM()
  {
    com.tencent.mm.compatible.b.a.b((AudioManager)this.mController.ylL.getSystemService("audio"), 3, 1);
  }

  private int getSystemVolume()
  {
    return ((AudioManager)this.mController.ylL.getSystemService("audio")).getStreamVolume(3);
  }

  public final boolean DX()
  {
    return this.sBa.eif;
  }

  public final void FD(int paramInt)
  {
    this.sBa.xgL = paramInt;
  }

  public final void FE(int paramInt)
  {
    this.sBa.xgO = paramInt;
  }

  protected void FJ(int paramInt)
  {
  }

  protected void Kh()
  {
    byte[] arrayOfByte = getIntent().getByteArrayExtra("key_context");
    this.sBa = new chv();
    try
    {
      this.sBa.parseFrom(arrayOfByte);
      this.sEo = new n();
      this.sEo.sDo = this;
      this.sEm = new m();
      this.sEm.d(this);
      this.sEl = new o();
      this.sEl.d(this);
      this.sEn = new r();
      this.sEn.d(this);
      this.sEk = new l();
      this.sEa = cGE();
      this.sEe = cGF();
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        finish();
    }
  }

  public final void a(chw paramchw)
  {
    if (paramchw != null)
    {
      if (!at.isConnected(this))
        Toast.makeText(this.mController.ylL, getString(2131304103), 0).show();
    }
    else
      return;
    String str1 = paramchw.ubA;
    int i;
    label47: int k;
    if (paramchw.xhh)
    {
      i = 5;
      String str2 = System.currentTimeMillis();
      int j = this.sBa.scene;
      Object localObject = this.sBa.hlm;
      if (!cGb())
        break label183;
      k = 318;
      label95: localObject = new com.tencent.mm.plugin.topstory.a.c.i(paramchw, str1, i, str2, j, (String)localObject, k, paramchw.xgS, paramchw.xhi);
      com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      if (paramchw.xhh)
        break label191;
    }
    label183: label191: for (boolean bool = true; ; bool = false)
    {
      paramchw.xhh = bool;
      ab.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onWowBtnClick thumb:" + paramchw.xhh);
      break;
      i = 4;
      break label47;
      k = 317;
      break label95;
    }
  }

  public abstract void a(chw paramchw, View paramView, boolean paramBoolean);

  public void abH(String paramString)
  {
  }

  public final void abI(String paramString)
  {
    this.sBa.xgN = paramString;
  }

  public final void ad(View paramView, int paramInt)
  {
    if (this.sEn.cGZ())
    {
      this.sEn.cpN();
      this.sEp = true;
    }
    chw localchw = this.sEo.FL(paramInt);
    this.sEq = new com.tencent.mm.plugin.topstory.ui.widget.b(this.mController.ylL, localchw.xhc, new TopStoryBaseVideoUI.5(this, localchw, paramInt));
    if (this.sEt)
      this.sEq.a(paramView, true, 0 - com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 40), com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 16));
    try
    {
      ((com.tencent.mm.plugin.topstory.ui.video.fs.f)this.sEn.sFu.getControlBar()).cHd();
      while (true)
      {
        label121: return;
        this.sEq.a(paramView, false, 0, 0 - com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 10));
      }
    }
    catch (Exception paramView)
    {
      break label121;
    }
  }

  public final MMActivity bKU()
  {
    return this;
  }

  public void cFN()
  {
  }

  public void cFO()
  {
  }

  public final l cFQ()
  {
    return this.sEk;
  }

  public final o cFR()
  {
    return this.sEl;
  }

  public final String cFS()
  {
    return com.tencent.mm.plugin.topstory.a.g.abz(this.sBa.xgj);
  }

  public final chv cFT()
  {
    return this.sBa;
  }

  public final m cFU()
  {
    return this.sEm;
  }

  public final r cFV()
  {
    return this.sEn;
  }

  public final Point cFW()
  {
    if (this.qLw == null)
      this.qLw = ae.hy(this);
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "lxl screenSize:%s, %s", new Object[] { Integer.valueOf(this.qLw.x), Integer.valueOf(this.qLw.y) });
    return this.qLw;
  }

  public final am cFX()
  {
    if (this.sEt);
    for (am localam = this.sEs; ; localam = this.sEr)
      return localam;
  }

  public final int cFY()
  {
    return this.sBa.xgL;
  }

  public final boolean cFZ()
  {
    if (this.sBa.scene == 36);
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  protected void cGC()
  {
  }

  protected void cGD()
  {
    if (getSupportActionBar() != null)
    {
      getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0));
      getSupportActionBar().hide();
    }
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setStatusBarColor(getResources().getColor(2131690072));
    cGB();
    this.qpb = findViewById(2131827963);
    this.gnB = ((TextView)findViewById(2131821185));
    this.sDW = ((ImageView)findViewById(2131828267));
    this.sDU = findViewById(2131828302);
    this.sDV = ((ImageView)findViewById(2131828303));
    this.oOO = ((ImageButton)findViewById(2131826267));
    this.oOO.getDrawable().setColorFilter(getResources().getColor(2131690691), PorterDuff.Mode.SRC_ATOP);
    this.oOO.setOnClickListener(new TopStoryBaseVideoUI.1(this));
    this.sDU.setOnClickListener(new TopStoryBaseVideoUI.2(this));
    this.sDY = ((RecyclerView)findViewById(2131828299));
    this.sDY.a(this.eja);
    this.sDY.setItemAnimator(new TopStoryBaseVideoUI.a(this, (byte)0));
    this.qYS = new LinearLayoutManager();
    this.sDY.setLayoutManager(this.qYS);
    this.sEr = am.e(this.qYS);
    this.sDZ = cGJ();
    this.sDY.setAdapter(this.sDZ);
    this.sEb = ((RecyclerView)findViewById(2131828339));
    this.sEb.a(this.eja);
    this.sEb.setItemAnimator(new TopStoryBaseVideoUI.a(this, (byte)0));
    this.sEc = new LinearLayoutManager();
    this.sEb.setLayoutManager(this.sEc);
    this.sEs = am.e(this.sEc);
    this.sEd = cGK();
    this.sEb.setAdapter(this.sEd);
    this.sEb.setVisibility(8);
    if ((!this.hVI) && (!cGb()))
    {
      this.sDX = new i(this);
      this.sDX.enable();
      this.sDX.sEB = this.sEj;
      this.hVI = true;
    }
    if (this.sBa.eif)
      me(this.sBa.eif);
    this.sEk.sEN = this;
  }

  protected abstract d cGE();

  protected abstract d cGF();

  protected void cGG()
  {
    int i = 0;
    int j;
    if (this.sEt)
    {
      this.sEe.a(this);
      this.sEg = ((LinearLayoutManager)getLayoutManager()).iS();
      j = getLayoutManager().getItemCount();
      if ((this.sEh <= 0L) || (bo.az(this.sEh) >= 50L))
      {
        this.sEh = bo.yz();
        if (this.sEo.sEZ == 1)
          break label145;
        if ((this.sEg < j - 1) || (this.sEo.sEY) || (bo.az(this.sEi) < 50L))
          break label187;
        j = 1;
      }
    }
    while (true)
    {
      label116: if (!cGI())
        j = i;
      while (true)
      {
        if (j != 0)
          cGH();
        return;
        this.sEa.a(this);
        break;
        label145: if ((j - this.sEg > 2) || (this.sEo.sEY) || (bo.az(this.sEi) < 50L))
          break label187;
        j = 1;
        break label116;
      }
      label187: j = 0;
    }
  }

  protected void cGH()
  {
    this.sEi = bo.yz();
  }

  protected final boolean cGI()
  {
    if ((this.sBa.scene == 36) || (this.sBa.xgP));
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  protected abstract e cGJ();

  protected abstract e cGK();

  public final e cGa()
  {
    if (this.sEt);
    for (e locale = this.sEd; ; locale = this.sDZ)
      return locale;
  }

  public final boolean cGb()
  {
    if (this.sBa.xgG == 100203L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void cGc()
  {
    cGB();
  }

  public final int cGd()
  {
    return sDT;
  }

  public final void cGe()
  {
    if (!this.sEt)
    {
      this.gnB.setText(2131302196);
      this.sDW.setVisibility(8);
    }
  }

  public final n cGg()
  {
    return this.sEo;
  }

  public final String cGh()
  {
    if (this.sBa.xgN == null);
    for (String str = ""; ; str = this.sBa.xgN)
      return str;
  }

  public final int cGi()
  {
    return this.sBa.xgO;
  }

  public final void cGj()
  {
    runOnUiThread(new Runnable()
    {
      private static void a(e paramAnonymouse)
      {
        AppMethodBeat.i(1728);
        int i = paramAnonymouse.getFootersCount();
        int j = paramAnonymouse.getItemCount();
        paramAnonymouse.cGm();
        paramAnonymouse.au(j - i, i);
        AppMethodBeat.o(1728);
      }

      public final void run()
      {
        AppMethodBeat.i(1727);
        a(TopStoryBaseVideoUI.this.sDZ);
        a(TopStoryBaseVideoUI.this.sEd);
        AppMethodBeat.o(1727);
      }
    });
  }

  public void fP(int paramInt1, int paramInt2)
  {
    this.sEn.fT(paramInt1, paramInt2);
  }

  public final RecyclerView.i getLayoutManager()
  {
    if (this.sEt);
    for (LinearLayoutManager localLinearLayoutManager = this.sEc; ; localLinearLayoutManager = this.qYS)
      return localLinearLayoutManager;
  }

  public final RecyclerView getRecyclerView()
  {
    if (this.sEt);
    for (RecyclerView localRecyclerView = this.sEb; ; localRecyclerView = this.sDY)
      return localRecyclerView;
  }

  public final int getVideoHeight()
  {
    if (this.videoHeight == 0)
    {
      if (cGb())
        break label35;
      this.videoHeight = (getVideoWidth() * 280 / 496);
    }
    while (true)
    {
      return this.videoHeight;
      label35: this.videoHeight = 1280;
      int i = cFW().y * 3 / 5;
      if (this.videoHeight > i)
        this.videoHeight = i;
      ab.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "getVideoHeight %d maxVideoHeight %d", new Object[] { Integer.valueOf(this.videoHeight), Integer.valueOf(i) });
    }
  }

  public final int getVideoWidth()
  {
    return Math.min(cFW().x, cFW().y);
  }

  public void i(List<chw> paramList, boolean paramBoolean)
  {
    al.d(new TopStoryBaseVideoUI.6(this, paramList, paramBoolean));
  }

  public final boolean isFullscreenMode()
  {
    return this.sEt;
  }

  public final void md(boolean paramBoolean)
  {
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "setNeedScrollEvent %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.sEf = paramBoolean;
  }

  public final void me(boolean paramBoolean)
  {
    if (paramBoolean)
      this.sBa.eif = true;
    while (true)
    {
      cGL();
      return;
      this.sBa.eif = false;
      if (getSystemVolume() == 0)
        cGM();
    }
  }

  public void onBackPressed()
  {
    cGC();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Kh();
    cGD();
    com.tencent.mm.kernel.g.Rg().a(2802, this.sEu);
  }

  public void onDestroy()
  {
    h.a(this.sBa, dyi(), this.sEo.FL(this.sBa.xgL));
    if (this.hVI)
    {
      this.sDX.disable();
      this.sDX.sEB = null;
      this.sDX = null;
    }
    com.tencent.mm.kernel.g.Rg().b(2802, this.sEu);
    this.sEo.aEX();
    ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).onVideoListUIDestroy(this.sBa);
    this.sEn.aEX();
    this.sEk.aEX();
    this.sEl.aEX();
    this.sEm.aEX();
    com.tencent.mm.plugin.websearch.api.a.a.kT(16);
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if ((paramInt == 25) && (paramKeyEvent.getAction() == 0))
    {
      ab.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onKeyDown KEYCODE_VOLUME_DOWN %d", new Object[] { Integer.valueOf(getSystemVolume()) });
      chv localchv = this.sBa;
      if (getSystemVolume() <= 1)
      {
        localchv.eif = bool;
        cGL();
      }
    }
    while (true)
    {
      return super.onKeyDown(paramInt, paramKeyEvent);
      bool = false;
      break;
      if ((paramInt == 24) && (paramKeyEvent.getAction() == 0))
      {
        ab.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onKeyDown KEYCODE_VOLUME_UP %d", new Object[] { Integer.valueOf(getSystemVolume()) });
        this.sBa.eif = false;
        cGL();
      }
    }
  }

  public void onPause()
  {
    super.onPause();
    try
    {
      this.sEn.akV();
      ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).onVideoListUIPause();
      label25: com.tencent.mm.plugin.websearch.api.a.a.kT(15);
      return;
    }
    catch (Exception localException)
    {
      break label25;
    }
  }

  public void onResume()
  {
    super.onResume();
    cGB();
    cGL();
    ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).onVideoListUIResume();
    this.sEn.akW();
    this.sEk.sEO = l.cGO();
    com.tencent.mm.plugin.websearch.api.a.a.kT(14);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI
 * JD-Core Version:    0.6.2
 */