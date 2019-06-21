package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.topstory.a.g;
import com.tencent.mm.plugin.topstory.ui.c;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.video.l;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.protocal.protobuf.bzs;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class e extends com.tencent.mm.plugin.topstory.ui.video.f
{
  private boolean isLoading;
  private f sFK;
  private com.tencent.mm.plugin.topstory.ui.video.k sFL;
  private View.OnClickListener sFM;
  private View.OnClickListener sFN;
  private View.OnClickListener sFO;
  private View.OnClickListener sFP;
  private View.OnClickListener sFQ;
  private View.OnClickListener sFR;
  private h.b sFS;
  public boolean sFT;

  public e(Context paramContext, b paramb, com.tencent.mm.plugin.topstory.ui.video.a parama)
  {
    super(paramContext, paramb, parama);
    AppMethodBeat.i(1909);
    this.sFS = new e.3(this);
    if (this.sDo.cGb())
      this.kuG.setScaleType(ImageView.ScaleType.CENTER_CROP);
    AppMethodBeat.o(1909);
  }

  private boolean aFf()
  {
    AppMethodBeat.i(1920);
    boolean bool;
    if (this.sDz.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(1920);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1920);
    }
  }

  public final void cGn()
  {
    AppMethodBeat.i(1912);
    ab.d("MicroMsg.TopStory.TopStoryFSVideoContainer", "setListScrollPlayContainerStatus");
    this.sDz.setVisibility(8);
    this.sDy.setVisibility(8);
    this.kuG.setVisibility(0);
    this.sDq.setVisibility(8);
    this.sDp.setVisibility(8);
    this.sDD.setVisibility(8);
    AppMethodBeat.o(1912);
  }

  public final void cGo()
  {
    AppMethodBeat.i(1913);
    ab.d("MicroMsg.TopStory.TopStoryFSVideoContainer", "setListScrollStopContainerStatus");
    this.sDz.setVisibility(0);
    if ((getFSVideoUIComponent().cFQ().cGN()) && (!g.cFp()))
      this.sDy.setVisibility(0);
    while (true)
    {
      this.kuG.setVisibility(0);
      this.sDq.setVisibility(8);
      this.sDp.setVisibility(8);
      this.sDD.setVisibility(8);
      this.sDB.setVisibility(0);
      this.sDA.setVisibility(8);
      this.sDt.setVisibility(0);
      this.sDu.setVisibility(8);
      this.sDx.setVisibility(8);
      AppMethodBeat.o(1913);
      return;
      this.sDy.setVisibility(8);
    }
  }

  public final void cGp()
  {
    AppMethodBeat.i(1911);
    super.cGp();
    AppMethodBeat.o(1911);
  }

  public final void cGs()
  {
    AppMethodBeat.i(1917);
    if (this.sFK != null)
      this.sFK.setVisibility(8);
    AppMethodBeat.o(1917);
  }

  public final void cGt()
  {
    AppMethodBeat.i(1914);
    f localf = this.sFK;
    if (localf.sGn != null)
      localf.sGn.stopTimer();
    AppMethodBeat.o(1914);
  }

  public final void cGw()
  {
    AppMethodBeat.i(1918);
    if (this.sFK != null)
      this.sFK.show();
    AppMethodBeat.o(1918);
  }

  public final void cu()
  {
    AppMethodBeat.i(1915);
    super.cu();
    f localf;
    if (this.sFK != null)
    {
      this.sFK.setVideoTotalTime(this.sAX.xgR);
      localf = this.sFK;
      chw localchw = this.sAX;
      localf.sFY.setVisibility(0);
      localf.aFL();
      Object localObject = localf.sGe.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = localf.getResources().getDimensionPixelSize(2131428414);
      localf.sGe.setLayoutParams((ViewGroup.LayoutParams)localObject);
      if (localchw.wiH.size() <= 0)
        break label592;
      if (localf.sGf != null)
        localf.sGf.setVisibility(0);
      localf.sGg.setVisibility(0);
      localf.sGh.setVisibility(8);
      localObject = (bzs)localchw.wiH.get(0);
      localf.sGi.setTag(localObject);
      localf.mLM.setText(((bzs)localObject).cEh);
      localf.mLM.setVisibility(0);
      localf.sGi.setVisibility(0);
      localf.sGk.setVisibility(8);
      if (!bo.isNullOrNil(((bzs)localObject).cIY))
      {
        o.ahp().a(((bzs)localObject).cIY, localf.sGk, c.sBn);
        localf.sGk.setVisibility(0);
      }
      if (localchw.wiH.size() <= 1)
        break label571;
      localObject = (bzs)localchw.wiH.get(1);
      localf.sGj.setTag(localObject);
      localf.mLN.setText(((bzs)localObject).cEh);
      localf.mLN.setVisibility(0);
      localf.sGj.setVisibility(0);
      localf.sGl.setVisibility(8);
      if (!bo.isNullOrNil(((bzs)localObject).cIY))
      {
        o.ahp().a(((bzs)localObject).cIY, localf.sGl, c.sBn);
        localf.sGl.setVisibility(0);
      }
      localf.h(localchw);
      if (localf.sFT)
      {
        localf.sGg.setVisibility(8);
        localf.sFX.setVisibility(8);
      }
      if ((localf.sGm != null) && (localf.qeX != null) && (localf.sDW != null))
      {
        localf.sGm.setVisibility(8);
        localf.qeX.setVisibility(8);
        localf.sDW.setVisibility(8);
        if (!bo.isNullOrNil(localchw.source))
        {
          localf.qeX.setText(localchw.source);
          localf.qeX.setVisibility(0);
          if (!bo.isNullOrNil(localchw.phw))
            localf.sGm.setVisibility(0);
          if (bo.isNullOrNil(localchw.xgY))
            break label620;
          o.ahp().a(localchw.xgY, localf.sDW, c.sBm);
          label470: localf.sDW.setVisibility(0);
        }
      }
      if (localf.gne != null)
        localf.gne.setText(localchw.title);
    }
    if ((getFSItemUIComponent() != null) && (getFSItemUIComponent().cFP() != getFSVideoUIComponent().cFY()))
    {
      if (!getFSVideoUIComponent().cFQ().isConnected())
        break label633;
      cGq();
    }
    while (true)
    {
      if (this.gne != null)
        this.gne.setText(this.sAX.title);
      AppMethodBeat.o(1915);
      return;
      label571: localf.sGj.setVisibility(8);
      localf.mLN.setVisibility(8);
      break;
      label592: if (localf.sGf != null)
        localf.sGf.setVisibility(8);
      localf.sGg.setVisibility(8);
      break;
      label620: localf.sDW.setImageResource(2130838444);
      break label470;
      label633: gE(getNoNetTip(), getContext().getString(2131304271));
    }
  }

  public final f getControlBar()
  {
    return this.sFK;
  }

  public final a getFSItemUIComponent()
  {
    return (a)this.sDG;
  }

  public final b getFSVideoUIComponent()
  {
    return this.sDo;
  }

  public final int getLayoutId()
  {
    return 2130970941;
  }

  public final h.d getScaleType()
  {
    AppMethodBeat.i(1916);
    h.d locald;
    if (this.sDo.cGb())
    {
      locald = h.d.vhG;
      AppMethodBeat.o(1916);
    }
    while (true)
    {
      return locald;
      locald = h.d.vhF;
      AppMethodBeat.o(1916);
    }
  }

  public final String getSessionId()
  {
    return this.cvF;
  }

  public final chw getVideoInfo()
  {
    return this.sAX;
  }

  public final h.b getVideoViewCallback()
  {
    return this.sFS;
  }

  public final void init()
  {
    AppMethodBeat.i(1910);
    super.init();
    this.sFM = new e.1(this);
    this.sFN = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(1893);
        e.this.getFSVideoUIComponent().ad(paramAnonymousView, e.a(e.this).cFP());
        AppMethodBeat.o(1893);
      }
    };
    this.sFO = new e.9(this);
    this.sFP = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(1895);
        e.this.getFSVideoUIComponent().a(e.c(e.this));
        e.e(e.this).h(e.d(e.this));
        AppMethodBeat.o(1895);
      }
    };
    this.sFQ = new e.11(this);
    this.sFR = new e.12(this);
    this.sDv.setOnClickListener(new e.13(this));
    this.sDt.setOnClickListener(new e.14(this));
    this.sDu.setOnClickListener(new e.15(this));
    this.sDz.setOnClickListener(new e.2(this));
    this.sFL = new com.tencent.mm.plugin.topstory.ui.video.k(getContext(), this, new e.a(this));
    if (getFSVideoUIComponent().cGb());
    for (this.sFK = new k(getContext()); ; this.sFK = new f(getContext()))
    {
      this.sFK.setOnlyFS(this.sFT);
      this.sFK.setVisibility(8);
      this.sFK.setFullScreenBtnClickListener(this.sFM);
      this.sFK.setFeedbackBtnClickListener(this.sFN);
      this.sFK.setShareBtnClickListener(this.sFO);
      this.sFK.setWowBtnClickListener(this.sFP);
      this.sFK.setTagBtnClickListener(this.sFQ);
      this.sFK.setSourceItemClickListener(this.sFR);
      if (g.cFm())
        this.sFK.setTitleClickListener(new e.4(this));
      this.sFK.setOnUpdateProgressLenListener(new e.5(this));
      this.sFK.setIplaySeekCallback(new e.6(this));
      this.sFK.setOnPlayButtonClickListener(new e.7(this));
      AppMethodBeat.o(1910);
      return;
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(1919);
    if (this.sFL != null)
      this.sFL.z(paramMotionEvent);
    AppMethodBeat.o(1919);
    return true;
  }

  public final void setOnlyFS(boolean paramBoolean)
  {
    AppMethodBeat.i(1921);
    this.sFT = paramBoolean;
    if (this.sFK != null)
      this.sFK.setOnlyFS(paramBoolean);
    AppMethodBeat.o(1921);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e
 * JD-Core Version:    0.6.2
 */