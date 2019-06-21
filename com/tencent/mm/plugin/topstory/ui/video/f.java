package com.tencent.mm.plugin.topstory.ui.video;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import java.util.UUID;

public abstract class f extends RelativeLayout
{
  public static c sCQ = locala.ahG();
  public String cvF = "";
  protected TextView gne;
  protected ImageView kuG;
  public chw sAX;
  protected View sDA;
  protected View sDB;
  protected View sDC;
  public FrameLayout sDD;
  public ImageView sDE;
  public ImageView sDF;
  public a sDG;
  protected TextView sDH;
  public f.a sDI = f.a.sDJ;
  public b sDo;
  protected FrameLayout sDp;
  public TextView sDq;
  protected View sDr;
  protected TextView sDs;
  protected ImageView sDt;
  protected ImageView sDu;
  protected Button sDv;
  protected TextView sDw;
  protected TextView sDx;
  protected View sDy;
  protected View sDz;

  static
  {
    c.a locala = new c.a();
    locala.ePH = true;
    locala.ePG = true;
  }

  public f(Context paramContext, b paramb, a parama)
  {
    super(paramContext);
    this.sDo = paramb;
    this.sDG = parama;
    init();
  }

  public boolean O(boolean paramBoolean1, boolean paramBoolean2)
  {
    paramBoolean1 = false;
    Object localObject1 = this.sDo.cGh();
    Object localObject2 = com.tencent.mm.plugin.topstory.a.g.cFq();
    int i = this.sDo.cGi();
    if (!this.sDo.cFQ().isConnected())
    {
      this.sDI = f.a.sDL;
      cGs();
      gE(getNoNetTip(), getContext().getString(2131304271));
      this.sDo.cFV().a(this, getScaleType());
      return paramBoolean1;
    }
    if ((!((String)localObject2).equals("wifi")) && (!((String)localObject2).equals(localObject1)))
    {
      if (!((String)localObject2).equals("wangka"))
        break label577;
      if ((i != 1) && (i != 2))
      {
        this.sDo.FE(1);
        if (this.sDH == null)
          break label555;
        this.sDH.setVisibility(0);
        this.sDH.setAlpha(1.0F);
        this.sDH.animate().alpha(0.0F).setDuration(3000L).start();
      }
    }
    label184: cGw();
    this.sDo.abI((String)localObject2);
    cGv();
    this.sDI = f.a.sDJ;
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setStartPlayContainerStatus");
    this.sDz.setVisibility(0);
    this.sDB.setVisibility(8);
    this.sDy.setVisibility(8);
    this.sDD.setVisibility(8);
    this.sDA.setVisibility(0);
    this.sDC.setVisibility(8);
    this.sDr.setVisibility(0);
    this.sDr.setVisibility(0);
    this.sDr.setAlpha(0.0F);
    this.sDr.animate().setDuration(4000L).setInterpolator(new AccelerateInterpolator()).alpha(1.0F).start();
    this.kuG.setVisibility(0);
    this.sDq.setVisibility(8);
    this.sDp.setVisibility(0);
    this.sDp.setAlpha(0.0F);
    this.sDo.cFV().a(this, getScaleType());
    localObject1 = this.sDo.cFV();
    b localb = this.sDo;
    localObject2 = this.sAX;
    String str = this.cvF;
    i = this.sDG.cFP();
    ab.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "startPlay, pos:%s, vid:%s", new Object[] { Integer.valueOf(i), ((chw)localObject2).xgS });
    if (((r)localObject1).sFv != null)
    {
      if ((!((r)localObject1).sFv.ubA.equals(((chw)localObject2).ubA)) || (paramBoolean2))
      {
        ((r)localObject1).sFt.stop();
        localb.cFR().b(localb.cFT());
        localb.cFR().cGS();
      }
    }
    else
    {
      if (!bo.isNullOrNil(((chw)localObject2).videoUrl))
        break label607;
      ab.e("MicroMsg.TopStory.TopStoryVideoViewMgr", "start play video url is null %s %s %s", new Object[] { str, ((chw)localObject2).xgS, ((chw)localObject2).title });
    }
    while (true)
    {
      paramBoolean1 = true;
      break;
      label555: t.makeText(this.sDo.bKU(), 2131304108, 0).show();
      break label184;
      label577: if (i == 2)
        break label184;
      cGu();
      this.sDo.cFV().a(this, getScaleType());
      break;
      label607: localb.cFR().a((chw)localObject2, i, str);
      ((r)localObject1).sDo.cFR().e((chw)localObject2);
      ((r)localObject1).sFt.setLoop(false);
      ((r)localObject1).sFt.setVideoInfo((chw)localObject2);
      ((r)localObject1).sFt.setMute(localb.DX());
      ((r)localObject1).sFt.setKeepScreenOn(true);
      ((r)localObject1).sFt.abJ(str);
      ((r)localObject1).sFt.cGV();
      ((r)localObject1).sFv = ((chw)localObject2);
      ((r)localObject1).sFw = true;
      ((r)localObject1).sFx = false;
    }
  }

  public final void a(chw paramchw, int paramInt)
  {
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "updateView position:%s", new Object[] { Integer.valueOf(paramInt) });
    this.sAX = paramchw;
    cu();
  }

  public abstract void cGn();

  public abstract void cGo();

  public void cGp()
  {
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setPlayingContainerStatus, pos:%d", new Object[] { Integer.valueOf(this.sDG.cFP()) });
    this.sDz.setVisibility(8);
    this.kuG.setVisibility(8);
    this.sDq.setVisibility(8);
    this.sDy.setVisibility(8);
    this.sDp.setVisibility(0);
    this.sDp.setAlpha(1.0F);
  }

  public final void cGq()
  {
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setStopContainerStatus, pos:%d", new Object[] { Integer.valueOf(this.sDG.cFP()) });
    this.kuG.setVisibility(0);
    this.sDz.setVisibility(0);
    this.sDD.setVisibility(8);
    this.sDA.setVisibility(8);
    this.sDy.setVisibility(0);
    this.sDB.setVisibility(0);
    this.sDt.setVisibility(0);
    this.sDu.setVisibility(8);
    this.sDx.setVisibility(8);
    this.sDs.setVisibility(8);
  }

  public final void cGr()
  {
    gE(getNoNetTip(), this.sDo.bKU().getString(2131304271));
    getContext().getString(2131304106, new Object[] { bo.b(this.sAX.xha, 100.0D) });
  }

  public void cGs()
  {
  }

  public void cGt()
  {
  }

  public final void cGu()
  {
    this.sDI = f.a.sDK;
    cGs();
    gE(getMobileNetTip(), getContext().getString(2131304087));
  }

  public final String cGv()
  {
    this.cvF = UUID.randomUUID().toString();
    return this.cvF;
  }

  public void cGw()
  {
  }

  public final void cGx()
  {
    this.sDD.setVisibility(0);
  }

  protected void cu()
  {
    this.kuG.setImageDrawable(null);
    com.tencent.mm.at.o.ahp().a(this.sAX.xgQ, this.kuG, sCQ);
    if (this.sDH != null)
    {
      this.sDH.animate().cancel();
      this.sDH.setVisibility(8);
    }
  }

  public final void gE(String paramString1, String paramString2)
  {
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setWarningTipContainerStatus %s %s", new Object[] { paramString1, paramString2 });
    this.kuG.setVisibility(0);
    this.sDz.setVisibility(0);
    this.sDA.setVisibility(0);
    this.sDy.setVisibility(0);
    this.sDB.setVisibility(8);
    this.sDC.setVisibility(0);
    this.sDr.setVisibility(8);
    if (!TextUtils.isEmpty(paramString1))
    {
      this.sDw.setText(paramString1);
      this.sDw.setVisibility(0);
      if (TextUtils.isEmpty(paramString2))
        break label137;
      this.sDv.setText(paramString2);
      this.sDv.setVisibility(0);
    }
    while (true)
    {
      return;
      this.sDw.setVisibility(8);
      break;
      label137: this.sDv.setVisibility(8);
    }
  }

  public abstract g getControlBar();

  public a getItemUIComponent()
  {
    return this.sDG;
  }

  protected abstract int getLayoutId();

  protected String getMobileNetTip()
  {
    if (this.sAX.xha == 0L);
    for (String str = getContext().getString(2131304107); ; str = getContext().getString(2131304106, new Object[] { bo.b(this.sAX.xha, 100.0D) }))
      return str;
  }

  public String getNoNetTip()
  {
    return getContext().getString(2131304258);
  }

  public f.a getPauseReason()
  {
    return this.sDI;
  }

  public h.d getScaleType()
  {
    return h.d.vhD;
  }

  public abstract h.b getVideoViewCallback();

  public FrameLayout getVideoViewParent()
  {
    return this.sDp;
  }

  protected void init()
  {
    LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
    this.sDp = ((FrameLayout)findViewById(2131828286));
    this.sDq = ((TextView)findViewById(2131828297));
    this.sDy = findViewById(2131828288);
    this.sDz = findViewById(2131828287);
    this.sDA = findViewById(2131828293);
    this.sDB = findViewById(2131828289);
    this.sDC = findViewById(2131828294);
    this.sDr = findViewById(2131828296);
    this.kuG = ((ImageView)findViewById(2131821842));
    this.sDs = ((TextView)findViewById(2131828292));
    this.gne = ((TextView)findViewById(2131821185));
    this.sDt = ((ImageView)findViewById(2131824280));
    this.sDu = ((ImageView)findViewById(2131828290));
    this.sDx = ((TextView)findViewById(2131828291));
    this.sDv = ((Button)findViewById(2131828295));
    this.sDw = ((TextView)findViewById(2131824283));
    this.sDE = ((ImageView)findViewById(2131821415));
    this.sDF = ((ImageView)findViewById(2131821414));
    this.sDD = ((FrameLayout)findViewById(2131821413));
    this.sDH = ((TextView)findViewById(2131828330));
  }

  public final void seekTo(int paramInt)
  {
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "seek to position=%d current=%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.sDo.cFV().getCurrPosSec()) });
    Object localObject = this.sDo.cFV();
    if (((r)localObject).sFt != null)
      ((r)localObject).sFt.C(paramInt, true);
    localObject = this.sDo.cFR().sFp;
    if (localObject != null)
      ((com.tencent.mm.plugin.topstory.a.b.a)localObject).sAJ = 1L;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.f
 * JD-Core Version:    0.6.2
 */