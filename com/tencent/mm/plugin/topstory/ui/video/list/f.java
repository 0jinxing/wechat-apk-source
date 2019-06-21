package com.tencent.mm.plugin.topstory.ui.video.list;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.k;
import com.tencent.mm.plugin.topstory.ui.video.l;
import com.tencent.mm.plugin.topstory.ui.video.o;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public final class f extends com.tencent.mm.plugin.topstory.ui.video.f
{
  private boolean isLoading;
  private k sFL;
  private View.OnClickListener sFM;
  private h.b sFS;
  private g sGU;

  public f(Context paramContext, com.tencent.mm.plugin.topstory.ui.video.b paramb, com.tencent.mm.plugin.topstory.ui.video.a parama)
  {
    super(paramContext, paramb, parama);
    AppMethodBeat.i(2061);
    this.sFS = new f.6(this);
    AppMethodBeat.o(2061);
  }

  private boolean aFf()
  {
    AppMethodBeat.i(2071);
    boolean bool;
    if (this.sDz.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(2071);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(2071);
    }
  }

  public final boolean O(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(2066);
    paramBoolean1 = super.O(paramBoolean1, paramBoolean2);
    getListVideoUIComponent().cFV().setMute(getListVideoUIComponent().DX());
    AppMethodBeat.o(2066);
    return paramBoolean1;
  }

  public final void cGn()
  {
    AppMethodBeat.i(2064);
    ab.d("MicroMsg.TopStory.TopStoryListVideoContainer", "setListScrollPlayContainerStatus");
    this.sDz.setVisibility(8);
    this.kuG.setVisibility(0);
    this.sDq.setVisibility(8);
    this.sDp.setVisibility(8);
    this.sDD.setVisibility(8);
    AppMethodBeat.o(2064);
  }

  public final void cGo()
  {
    AppMethodBeat.i(2065);
    ab.d("MicroMsg.TopStory.TopStoryListVideoContainer", "setListScrollStopContainerStatus");
    this.sDz.setVisibility(0);
    this.kuG.setVisibility(0);
    this.sDq.setVisibility(8);
    this.sDp.setVisibility(8);
    this.sDD.setVisibility(8);
    this.sDB.setVisibility(0);
    this.sDA.setVisibility(8);
    this.sDt.setVisibility(0);
    this.sDu.setVisibility(8);
    this.sDx.setVisibility(8);
    AppMethodBeat.o(2065);
  }

  public final void cGp()
  {
    AppMethodBeat.i(2063);
    super.cGp();
    AppMethodBeat.o(2063);
  }

  public final void cGs()
  {
    AppMethodBeat.i(2069);
    if (this.sGU != null)
      this.sGU.setVisibility(8);
    AppMethodBeat.o(2069);
  }

  public final void cGt()
  {
    AppMethodBeat.i(2067);
    g localg = this.sGU;
    if (localg.sGn != null)
      localg.sGn.stopTimer();
    AppMethodBeat.o(2067);
  }

  public final void cu()
  {
    AppMethodBeat.i(2068);
    super.cu();
    if (this.sGU != null)
      this.sGU.setVideoTotalTime(this.sAX.xgR);
    if ((getListItemUIComponent() != null) && (getListItemUIComponent().cFP() != getListVideoUIComponent().cFY()))
      if (getListVideoUIComponent().cFQ().isConnected())
      {
        cGq();
        AppMethodBeat.o(2068);
      }
    while (true)
    {
      return;
      gE(getNoNetTip(), getContext().getString(2131304271));
      AppMethodBeat.o(2068);
    }
  }

  public final g getControlBar()
  {
    return this.sGU;
  }

  public final int getLayoutId()
  {
    return 2130970954;
  }

  public final a getListItemUIComponent()
  {
    return (a)this.sDG;
  }

  public final b getListVideoUIComponent()
  {
    return (b)this.sDo;
  }

  public final h.d getScaleType()
  {
    return h.d.vhF;
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
    AppMethodBeat.i(2062);
    super.init();
    this.sFM = new f.1(this);
    this.sDv.setOnClickListener(new f.2(this));
    this.sDt.setOnClickListener(new f.3(this));
    this.sDu.setOnClickListener(new f.4(this));
    this.sDz.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(2039);
        if ((f.this.getListItemUIComponent() != null) && (f.this.getListItemUIComponent().cFP() != f.this.getListVideoUIComponent().cFY()))
        {
          f.this.getListVideoUIComponent().cFR().sFo = 2;
          f.this.getListVideoUIComponent().FC(f.k(f.this).cFP());
          f.this.getListVideoUIComponent().cFR().f(f.l(f.this));
          ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(f.this.getListVideoUIComponent().cFT(), f.m(f.this), f.n(f.this).cFP(), 2, "");
        }
        AppMethodBeat.o(2039);
      }
    });
    this.sFL = new k(getContext(), this, new f.a(this));
    this.sGU = new g(getContext());
    this.sGU.setVisibility(8);
    this.sGU.setFullScreenBtnClickListener(this.sFM);
    this.sGU.setOnUpdateProgressLenListener(new f.7(this));
    this.sGU.setIplaySeekCallback(new f.8(this));
    this.sGU.setOnPlayButtonClickListener(new f.9(this));
    AppMethodBeat.o(2062);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(2070);
    if (this.sFL != null)
      this.sFL.z(paramMotionEvent);
    AppMethodBeat.o(2070);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.f
 * JD-Core Version:    0.6.2
 */