package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.g.a.im;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.topstory.ui.video.l;
import com.tencent.mm.plugin.topstory.ui.video.n;
import com.tencent.mm.plugin.topstory.ui.video.o;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog;
import com.tencent.mm.protocal.protobuf.bzs;
import com.tencent.mm.protocal.protobuf.chr;
import com.tencent.mm.protocal.protobuf.chs;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class TopStoryFSVideoUI extends MMActivity
  implements com.tencent.mm.plugin.topstory.a.c, com.tencent.mm.plugin.topstory.ui.video.b
{
  private static long sGE = 0L;
  protected RecyclerView.m eja;
  protected ImageButton oOO;
  private Point qLw;
  protected LinearLayoutManager qYS;
  protected View qpb;
  protected chv sBa;
  protected View sDU;
  protected ImageView sDV;
  protected RecyclerView sDY;
  protected int sEg;
  protected long sEh;
  protected long sEi;
  private l sEk;
  private o sEl;
  private com.tencent.mm.plugin.topstory.ui.video.m sEm;
  r sEn;
  n sEo;
  private boolean sEp;
  protected com.tencent.mm.plugin.topstory.ui.widget.b sEq;
  private am sEr;
  private com.tencent.mm.ai.f sEu;
  com.tencent.mm.plugin.topstory.ui.widget.c sGA;
  View sGB;
  TopStoryCommentFloatDialog sGC;
  private boolean sGD;
  protected i sGs;
  protected h sGt;
  private ProgressDialog sGu;
  private View sGv;
  private View sGw;
  private View sGx;
  private Button sGy;
  View sGz;
  private int videoHeight;

  public TopStoryFSVideoUI()
  {
    AppMethodBeat.i(1970);
    this.eja = new RecyclerView.m()
    {
      public final void a(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(1969);
        if (paramAnonymousInt2 == 0)
          AppMethodBeat.o(1969);
        while (true)
        {
          return;
          TopStoryFSVideoUI.this.cGG();
          AppMethodBeat.o(1969);
        }
      }

      public final void c(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt)
      {
        AppMethodBeat.i(1968);
        switch (paramAnonymousInt)
        {
        default:
        case 0:
        }
        while (true)
        {
          AppMethodBeat.o(1968);
          return;
          TopStoryFSVideoUI.this.sGt.b(TopStoryFSVideoUI.this);
        }
      }
    };
    this.sEg = 0;
    this.sEh = -1L;
    this.sEi = -1L;
    this.sEu = new com.tencent.mm.ai.f()
    {
      public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.m paramAnonymousm)
      {
        AppMethodBeat.i(1957);
        paramAnonymousm = (com.tencent.mm.plugin.topstory.a.c.i)paramAnonymousm;
        Object localObject = (chr)paramAnonymousm.ehh.fsG.fsP;
        boolean bool;
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          ab.w("MicroMsg.TopStory.TopStoryFSVideoUI", "NetSceneTopStorySetComment response, errType:%s, errCode:%s, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          t.makeText(TopStoryFSVideoUI.this.mController.ylL, TopStoryFSVideoUI.this.getString(2131304103), 0).show();
          if (paramAnonymousm.sAX != null)
          {
            paramAnonymousString = paramAnonymousm.sAX;
            if (paramAnonymousm.sAX.xhh)
              break label178;
            bool = true;
            paramAnonymousString.xhh = bool;
            ab.i("MicroMsg.TopStory.TopStoryFSVideoUI", "setCmtListener onSceneEnd error, thumb:" + paramAnonymousm.sAX.xhh);
          }
        }
        while (true)
        {
          TopStoryFSVideoUI.this.runOnUiThread(new TopStoryFSVideoUI.5.1(this, paramAnonymousm));
          AppMethodBeat.o(1957);
          return;
          label178: bool = false;
          break;
          JSONObject localJSONObject = new JSONObject();
          try
          {
            localJSONObject.put("docId", ((chr)localObject).wUo);
            localJSONObject.put("opType", "LIKE");
            if (((chr)localObject).nbk == 4)
            {
              bool = true;
              label228: localJSONObject.put("isLike", bool);
              if (paramAnonymousm.sAX != null)
              {
                paramAnonymousString = paramAnonymousm.sAX;
                if (((chr)localObject).nbk != 4)
                  break label477;
              }
            }
            label477: for (bool = true; ; bool = false)
            {
              paramAnonymousString.xhh = bool;
              ab.i("MicroMsg.TopStory.TopStoryFSVideoUI", "setCmtListener onSceneEnd succ, thumb:" + paramAnonymousm.sAX.xhh);
              if (((chr)localObject).nbk != 4)
                break label483;
              localObject = TopStoryFSVideoUI.this.cGa().b(paramAnonymousm.sAX);
              if ((TopStoryFSVideoUI.i(TopStoryFSVideoUI.this).sFv == null) || (TopStoryFSVideoUI.i(TopStoryFSVideoUI.this).sFv.xgS == null) || (!TopStoryFSVideoUI.i(TopStoryFSVideoUI.this).sFv.xgS.equals(paramAnonymousm.sAX.xgS)) || (!(localObject instanceof g)))
                break label558;
              paramAnonymousString = ((com.tencent.mm.plugin.topstory.ui.video.h)localObject).getWowView();
              if (paramAnonymousString != null)
              {
                TopStoryFSVideoUI.this.a(paramAnonymousm.sAX, paramAnonymousString, true);
                if ((localObject instanceof g))
                  ((com.tencent.mm.plugin.topstory.ui.video.h)localObject).cGA().getControlBar().show();
              }
              paramAnonymousString = new im();
              paramAnonymousString.cDD.cDE = localJSONObject.toString();
              paramAnonymousString.cDD.cDF = "";
              com.tencent.mm.sdk.b.a.xxA.m(paramAnonymousString);
              break;
              bool = false;
              break label228;
            }
            label483: if (paramAnonymousm.cFw().xgy)
              com.tencent.mm.ui.base.h.b(TopStoryFSVideoUI.this, TopStoryFSVideoUI.this.getString(2131304111), "", true);
            while (true)
            {
              TopStoryFSVideoUI.this.a(paramAnonymousm.sAX, null, false);
              break;
              t.makeText(TopStoryFSVideoUI.this.mController.ylL, 2131306045, 0).show();
            }
          }
          catch (JSONException paramAnonymousString)
          {
            while (true)
            {
              continue;
              label558: paramAnonymousString = null;
            }
          }
        }
      }
    };
    AppMethodBeat.o(1970);
  }

  private void cGB()
  {
    AppMethodBeat.i(1973);
    getWindow().setFlags(201327616, 201327616);
    View localView = getWindow().getDecorView();
    if (com.tencent.mm.compatible.util.d.fP(19))
      localView.setSystemUiVisibility(2);
    while (true)
    {
      getWindow().addFlags(128);
      AppMethodBeat.o(1973);
      return;
      localView.setSystemUiVisibility(4102);
    }
  }

  private boolean cGI()
  {
    if ((this.sBa.scene == 36) || (this.sBa.xgP));
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  @SuppressLint({"ResourceType"})
  private void cGL()
  {
    AppMethodBeat.i(1987);
    if (this.sBa.eif)
      this.sDV.setBackgroundResource(2131232064);
    while (true)
    {
      if (this.sEn.sFw)
        this.sEn.setMute(this.sBa.eif);
      AppMethodBeat.o(1987);
      return;
      this.sDV.setBackgroundResource(2131232065);
    }
  }

  private void cHg()
  {
    AppMethodBeat.i(1979);
    this.sGw.setVisibility(0);
    this.sGv.setVisibility(0);
    this.sEo.FM(0);
    AppMethodBeat.o(1979);
  }

  private int getSystemVolume()
  {
    AppMethodBeat.i(1984);
    int i = ((AudioManager)this.mController.ylL.getSystemService("audio")).getStreamVolume(3);
    AppMethodBeat.o(1984);
    return i;
  }

  public final boolean DX()
  {
    return this.sBa.eif;
  }

  public final boolean FC(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(1976);
    this.sGz.setVisibility(8);
    ab.i("MicroMsg.TopStory.TopStoryFSVideoUI", "tryToPlayPositionVideo %d", new Object[] { Integer.valueOf(paramInt) });
    try
    {
      int i = this.sGs.getItemCount();
      int j = this.sGs.getFootersCount();
      int k = this.sGs.getHeadersCount();
      if (paramInt >= i - j - k)
        AppMethodBeat.o(1976);
      while (true)
      {
        return bool;
        this.sDY.smoothScrollToPosition(this.sGs.getHeadersCount() + paramInt);
        AppMethodBeat.o(1976);
        bool = true;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.TopStory.TopStoryFSVideoUI", "tryToPlayPositionVideo Exception:%s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(1976);
      }
    }
  }

  public final void FD(int paramInt)
  {
    this.sBa.xgL = paramInt;
  }

  public final void FE(int paramInt)
  {
    this.sBa.xgO = paramInt;
  }

  public final void a(bzs parambzs)
  {
  }

  public final void a(chw paramchw)
  {
    AppMethodBeat.i(1996);
    int i;
    label59: int k;
    if (paramchw != null)
    {
      if (!at.isConnected(this))
      {
        Toast.makeText(this.mController.ylL, getString(2131304103), 0).show();
        AppMethodBeat.o(1996);
        return;
      }
      Object localObject = paramchw.ubA;
      if (!paramchw.xhh)
        break label194;
      i = 5;
      String str1 = System.currentTimeMillis();
      int j = this.sBa.scene;
      String str2 = this.sBa.hlm;
      if (!cGb())
        break label199;
      k = 318;
      label107: localObject = new com.tencent.mm.plugin.topstory.a.c.i(paramchw, (String)localObject, i, str1, j, str2, k, paramchw.xgS, paramchw.xhi);
      com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      if (paramchw.xhh)
        break label207;
    }
    label194: label199: label207: for (boolean bool = true; ; bool = false)
    {
      paramchw.xhh = bool;
      ab.i("MicroMsg.TopStory.TopStoryFSVideoUI", "onWowBtnClick thumb:" + paramchw.xhh);
      AppMethodBeat.o(1996);
      break;
      i = 4;
      break label59;
      k = 317;
      break label107;
    }
  }

  public final void a(chw paramchw, View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(1999);
    ab.i("MicroMsg.TopStory.TopStoryFSVideoUI", "onLikeSceneEnd vid:%s, thumb:%s", new Object[] { paramchw.xgS, Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
    {
      if ((this.sGz.getVisibility() == 0) && (this.sGA != null) && (this.sGA.fgd != null) && (this.sGA.fgd.equals(paramchw.xgS)))
        this.sGz.setVisibility(8);
      AppMethodBeat.o(1999);
      return;
    }
    String str1 = System.currentTimeMillis();
    Object localObject = paramchw.ubA;
    String str2 = paramchw.title;
    String str3 = this.sBa.hlm;
    int i = this.sBa.scene;
    if (cGb());
    for (int j = 318; ; j = 317)
    {
      localObject = new com.tencent.mm.plugin.topstory.a.c.f(str1, (String)localObject, "", "", "", "", str2, str3, i, j, paramchw.xgS, paramchw.xhi);
      this.sGz.setVisibility(0);
      this.sGA = new com.tencent.mm.plugin.topstory.ui.widget.c(this.sGB, new TopStoryFSVideoUI.7(this, paramchw), (com.tencent.mm.plugin.topstory.a.c.f)localObject, paramchw.xgS);
      this.sGz.postDelayed(new TopStoryFSVideoUI.8(this), 2000L);
      this.sGA.a(paramView, true, com.tencent.mm.plugin.topstory.ui.widget.f.dip2px(this, 10.0F));
      AppMethodBeat.o(1999);
      break;
    }
  }

  public final void abH(String paramString)
  {
    AppMethodBeat.i(1990);
    al.d(new TopStoryFSVideoUI.4(this, paramString));
    AppMethodBeat.o(1990);
  }

  public final void abI(String paramString)
  {
    this.sBa.xgN = paramString;
  }

  public final void ad(View paramView, int paramInt)
  {
    AppMethodBeat.i(1988);
    if (this.sEn.cGZ())
    {
      this.sEn.cpN();
      this.sEp = true;
    }
    chw localchw = this.sEo.FL(paramInt);
    this.sEq = new com.tencent.mm.plugin.topstory.ui.widget.b(this.mController.ylL, localchw.xhc, new TopStoryFSVideoUI.2(this, localchw, paramInt));
    this.sEq.a(paramView, true, 0, com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 16));
    try
    {
      ((f)this.sEn.sFu.getControlBar()).cHd();
      AppMethodBeat.o(1988);
      return;
    }
    catch (Exception paramView)
    {
      while (true)
        AppMethodBeat.o(1988);
    }
  }

  public final MMActivity bKU()
  {
    return this;
  }

  public final void cFN()
  {
    AppMethodBeat.i(1974);
    this.qpb.animate().alpha(0.0F).setDuration(200L).setStartDelay(1800L);
    this.sGz.setVisibility(8);
    AppMethodBeat.o(1974);
  }

  public final void cFO()
  {
    AppMethodBeat.i(1975);
    this.qpb.animate().cancel();
    this.qpb.setAlpha(1.0F);
    AppMethodBeat.o(1975);
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
    AppMethodBeat.i(1980);
    String str = com.tencent.mm.plugin.topstory.a.g.abz(this.sBa.xgj);
    AppMethodBeat.o(1980);
    return str;
  }

  public final chv cFT()
  {
    return this.sBa;
  }

  public final com.tencent.mm.plugin.topstory.ui.video.m cFU()
  {
    return this.sEm;
  }

  public final r cFV()
  {
    return this.sEn;
  }

  public final Point cFW()
  {
    AppMethodBeat.i(1983);
    if (this.qLw == null)
      this.qLw = ae.hy(this);
    Point localPoint = this.qLw;
    AppMethodBeat.o(1983);
    return localPoint;
  }

  public final am cFX()
  {
    return this.sEr;
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

  protected final void cGG()
  {
    int i = 1;
    AppMethodBeat.i(1972);
    this.sGt.a(this);
    this.sEg = this.qYS.iS();
    int j = this.qYS.getItemCount();
    if ((this.sEh <= 0L) || (bo.az(this.sEh) >= 50L))
    {
      this.sEh = bo.yz();
      if (this.sEo.sEZ == 1)
        break label161;
      if ((this.sEg < j - 1) || (this.sEo.sEY) || (bo.az(this.sEi) < 50L))
        break label195;
    }
    while (true)
    {
      if (!cGI())
        i = 0;
      if (i != 0)
      {
        this.sGw.setVisibility(0);
        this.sGv.setVisibility(0);
        this.sEo.FM(this.sEo.cGR());
      }
      AppMethodBeat.o(1972);
      return;
      label161: if ((j - this.sEg > 2) || (this.sEo.sEY) || (bo.az(this.sEi) < 50L))
        label195: i = 0;
    }
  }

  public final com.tencent.mm.plugin.topstory.ui.video.e cGa()
  {
    return this.sGs;
  }

  public final boolean cGb()
  {
    if (this.sBa.xgG == 100203L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void cGc()
  {
    AppMethodBeat.i(1995);
    cGB();
    AppMethodBeat.o(1995);
  }

  public final int cGd()
  {
    return 0;
  }

  public final void cGe()
  {
  }

  public final void cGf()
  {
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
    AppMethodBeat.i(1997);
    runOnUiThread(new TopStoryFSVideoUI.6(this));
    AppMethodBeat.o(1997);
  }

  public final int cGk()
  {
    AppMethodBeat.i(1998);
    int i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIy, 0);
    AppMethodBeat.o(1998);
    return i;
  }

  public final void cHh()
  {
    AppMethodBeat.i(1986);
    if (this.sBa.eif)
    {
      this.sBa.eif = false;
      if (getSystemVolume() == 0)
        com.tencent.mm.compatible.b.a.b((AudioManager)this.mController.ylL.getSystemService("audio"), 3, 1);
    }
    while (true)
    {
      cGL();
      cFO();
      cFN();
      AppMethodBeat.o(1986);
      return;
      this.sBa.eif = true;
    }
  }

  public final void fP(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1994);
    if (((paramInt2 == 2) || (paramInt2 == 1)) && (this.sGD))
      cHg();
    this.sEn.fT(paramInt1, paramInt2);
    AppMethodBeat.o(1994);
  }

  public final boolean fS(int paramInt1, int paramInt2)
  {
    return true;
  }

  public final int getForceOrientation()
  {
    AppMethodBeat.i(1977);
    int i;
    if (cGb())
    {
      i = 1;
      AppMethodBeat.o(1977);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(1977);
    }
  }

  public final int getLayoutId()
  {
    return 2130970946;
  }

  public final RecyclerView.i getLayoutManager()
  {
    return this.qYS;
  }

  public final RecyclerView getRecyclerView()
  {
    return this.sDY;
  }

  public final int getVideoHeight()
  {
    AppMethodBeat.i(1981);
    if (this.videoHeight == 0)
    {
      if (cGb())
        break label49;
      this.videoHeight = (getVideoWidth() * 280 / 496);
    }
    while (true)
    {
      int i = this.videoHeight;
      AppMethodBeat.o(1981);
      return i;
      label49: this.videoHeight = 1280;
      i = cFW().y * 3 / 5;
      if (this.videoHeight > i)
        this.videoHeight = i;
      ab.i("MicroMsg.TopStory.TopStoryFSVideoUI", "getVideoHeight %d maxVideoHeight %d", new Object[] { Integer.valueOf(this.videoHeight), Integer.valueOf(i) });
    }
  }

  public final int getVideoWidth()
  {
    AppMethodBeat.i(1982);
    int i = Math.min(cFW().x, cFW().y);
    AppMethodBeat.o(1982);
    return i;
  }

  public final void i(List<chw> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(1989);
    this.sGs.j(paramList, paramBoolean);
    al.n(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(1954);
        TopStoryFSVideoUI.e(TopStoryFSVideoUI.this).setVisibility(4);
        TopStoryFSVideoUI.f(TopStoryFSVideoUI.this).setVisibility(4);
        TopStoryFSVideoUI.this.sDY.a(0, 3, null);
        if (TopStoryFSVideoUI.g(TopStoryFSVideoUI.this) != null)
        {
          TopStoryFSVideoUI.g(TopStoryFSVideoUI.this).dismiss();
          TopStoryFSVideoUI.h(TopStoryFSVideoUI.this);
        }
        AppMethodBeat.o(1954);
      }
    }
    , 50L);
    AppMethodBeat.o(1989);
  }

  public final boolean isFullscreenMode()
  {
    return false;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(1978);
    com.tencent.mm.plugin.topstory.ui.video.p.sFq.a(this, paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 10001) && ((this.sEk.bkJ()) || (com.tencent.mm.plugin.topstory.a.g.cFp())))
    {
      paramIntent = com.tencent.mm.plugin.topstory.ui.video.list.d.c(this);
      if (paramIntent != null)
        paramIntent.mc(false);
    }
    AppMethodBeat.o(1978);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(1971);
    if (Build.VERSION.SDK_INT >= 28)
      this.ylm = true;
    super.onCreate(paramBundle);
    paramBundle = getIntent().getByteArrayExtra("key_context");
    this.sBa = new chv();
    try
    {
      this.sBa.parseFrom(paramBundle);
      this.sEo = new n();
      this.sEo.sDo = this;
      this.sEm = new com.tencent.mm.plugin.topstory.ui.video.m();
      this.sEm.d(this);
      this.sEl = new o();
      this.sEl.d(this);
      this.sEn = new r();
      this.sEn.d(this);
      this.sEk = new l();
      this.sGt = new h();
      if (this.sBa.xgH != null)
        this.sEo.d(this.sBa.xgH);
      if (getSupportActionBar() != null)
      {
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0));
        getSupportActionBar().hide();
      }
      if (Build.VERSION.SDK_INT >= 21)
        getWindow().setStatusBarColor(getResources().getColor(2131690072));
      if (this.sBa.xgJ)
        this.sEk.sEM = true;
      cGB();
      this.qpb = findViewById(2131827963);
      this.sDU = findViewById(2131828302);
      this.sDV = ((ImageView)findViewById(2131828303));
      this.oOO = ((ImageButton)findViewById(2131826267));
      this.oOO.getDrawable().setColorFilter(getResources().getColor(2131690691), PorterDuff.Mode.SRC_ATOP);
      this.oOO.setOnClickListener(new TopStoryFSVideoUI.1(this));
      this.sDU.setOnClickListener(new TopStoryFSVideoUI.9(this));
      this.sGx = findViewById(2131828300);
      this.sGy = ((Button)findViewById(2131828301));
      this.sDY = ((RecyclerView)findViewById(2131828299));
      this.sDY.a(this.eja);
      this.qYS = new LinearLayoutManager();
      this.sDY.setLayoutManager(this.qYS);
      this.sEr = am.e(this.qYS);
      this.sGs = new i(this);
      i locali = this.sGs;
      paramBundle = LayoutInflater.from(this).inflate(2130970958, null);
      paramBundle.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
      this.sGw = paramBundle.findViewById(2131828338);
      this.sGv = paramBundle.findViewById(2131824238);
      locali.ei(paramBundle);
      this.sDY.setAdapter(this.sGs);
      this.oOO.setOnClickListener(new TopStoryFSVideoUI.10(this));
      new b().i(this.sDY);
      if (cGI())
        if (this.sEk.isConnected())
        {
          cHg();
          this.sGD = false;
          if ((this.sBa.scene != 21) && (this.sBa.xgI == null))
            this.sGu = com.tencent.mm.ui.base.h.b(this, getString(2131300968), true, new TopStoryFSVideoUI.11(this));
          this.sGs.sGI = true;
          this.sGx.setVisibility(8);
          if ((this.sEk.cGN()) && (com.tencent.mm.plugin.topstory.a.g.cFp()) && (System.currentTimeMillis() - sGE > 86400000L))
          {
            Toast.makeText(this, 2131304108, 0).show();
            sGE = System.currentTimeMillis();
          }
          this.sGz = findViewById(2131828304);
          this.sGB = findViewById(2131828305);
          this.sGz.setVisibility(8);
          this.sGz.setOnTouchListener(new TopStoryFSVideoUI.12(this));
          this.sGC = ((TopStoryCommentFloatDialog)findViewById(2131828306));
          this.sGC.setVisibility(8);
          this.sGC.k(this);
          getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new TopStoryFSVideoUI.13(this));
          com.tencent.mm.kernel.g.Rg().a(2802, this.sEu);
          AppMethodBeat.o(1971);
          return;
        }
    }
    catch (IOException paramBundle)
    {
      while (true)
      {
        finish();
        continue;
        Toast.makeText(this, 2131302192, 1).show();
        this.sGD = true;
        continue;
        this.sGw.setVisibility(4);
        this.sGv.setVisibility(4);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(1991);
    com.tencent.mm.plugin.topstory.a.h.a(this.sBa, dyi(), this.sEo.FL(this.sBa.xgL));
    com.tencent.mm.kernel.g.Rg().b(2802, this.sEu);
    this.sEo.aEX();
    ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).onVideoListUIDestroy(this.sBa);
    this.sEn.aEX();
    this.sEk.aEX();
    this.sEl.aEX();
    this.sEm.aEX();
    this.sGC.sIl.close();
    com.tencent.mm.plugin.websearch.api.a.a.kT(16);
    super.onDestroy();
    AppMethodBeat.o(1991);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(1985);
    if ((paramInt == 4) && (this.sGC.getVisibility() == 0))
    {
      this.sGC.hide();
      AppMethodBeat.o(1985);
      return bool2;
    }
    if ((paramInt == 25) && (paramKeyEvent.getAction() == 0))
    {
      ab.i("MicroMsg.TopStory.TopStoryFSVideoUI", "onKeyDown KEYCODE_VOLUME_DOWN %d", new Object[] { Integer.valueOf(getSystemVolume()) });
      chv localchv = this.sBa;
      if (getSystemVolume() <= 1)
      {
        bool2 = bool1;
        label95: localchv.eif = bool2;
        cGL();
      }
    }
    while (true)
    {
      bool2 = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(1985);
      break;
      bool2 = false;
      break label95;
      if ((paramInt == 24) && (paramKeyEvent.getAction() == 0))
      {
        ab.i("MicroMsg.TopStory.TopStoryFSVideoUI", "onKeyDown KEYCODE_VOLUME_UP %d", new Object[] { Integer.valueOf(getSystemVolume()) });
        this.sBa.eif = false;
        cGL();
      }
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(1993);
    super.onPause();
    this.sEn.akV();
    ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).onVideoListUIPause();
    this.sGC.onPause();
    com.tencent.mm.plugin.websearch.api.a.a.kT(15);
    AppMethodBeat.o(1993);
  }

  public void onResume()
  {
    AppMethodBeat.i(1992);
    super.onResume();
    cGB();
    cGL();
    ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).onVideoListUIResume();
    this.sEn.akW();
    this.sEk.sEO = l.cGO();
    this.sGC.onResume();
    com.tencent.mm.plugin.websearch.api.a.a.kT(14);
    AppMethodBeat.o(1992);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI
 * JD-Core Version:    0.6.2
 */