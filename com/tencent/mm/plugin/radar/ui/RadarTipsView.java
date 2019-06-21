package com.tencent.mm.plugin.radar.ui;

import a.f;
import a.f.a.a;
import a.f.b.j;
import a.f.b.t;
import a.f.b.v;
import a.g;
import a.i.k;
import a.l;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarTipsView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DelayShowNoviceEducationTips", "DelayShowSearchingTips", "HideNoviceEducationTips", "HideTips", "ShowNoMemberTips", "gone", "com/tencent/mm/plugin/radar/ui/RadarTipsView$gone$1", "Lcom/tencent/mm/plugin/radar/ui/RadarTipsView$gone$1;", "<set-?>", "", "isPressing", "()Z", "setPressing", "(Z)V", "mCurrentTipsPurpose", "mDontHideFlag", "mHasShownNoviceEducation", "mNoMember", "mPressCount", "mPressForShow", "mPressStartAt", "", "mPressTooShortCount", "mStartWithClick", "noviceEducationTips", "Landroid/widget/LinearLayout;", "getNoviceEducationTips", "()Landroid/widget/LinearLayout;", "noviceEducationTips$delegate", "Lkotlin/Lazy;", "textTipsContainer", "Landroid/view/View;", "getTextTipsContainer", "()Landroid/view/View;", "textTipsContainer$delegate", "tipsFadeIn", "Landroid/view/animation/Animation;", "getTipsFadeIn", "()Landroid/view/animation/Animation;", "tipsFadeIn$delegate", "tipsFadeOut", "getTipsFadeOut", "tipsFadeOut$delegate", "tipsHandler", "com/tencent/mm/plugin/radar/ui/RadarTipsView$tipsHandler$1", "Lcom/tencent/mm/plugin/radar/ui/RadarTipsView$tipsHandler$1;", "tvTextTips", "Landroid/widget/TextView;", "getTvTextTips", "()Landroid/widget/TextView;", "tvTextTips$delegate", "hideAll", "", "hideNoviceEducation", "hideRadarTips", "init", "removeShowTipsMessages", "reset", "setNoMember", "noMember", "setPressingDown", "show", "setPressingUp", "showErrMsg", "msg", "", "showNoviceEducation", "showPressTooShortTips", "showRadarTips", "res", "during", "showSearchingTips", "Companion", "plugin-radar_release"})
public final class RadarTipsView extends RelativeLayout
{
  static final String TAG = "MicroMsg.RadarTipsView";
  private static final int pDC = 3;
  private static final int pDD = 0;
  static final int pDE = 1;
  static final int pDF = 2;
  private static final int pDG = 3;
  public static final a pDH;
  private boolean pDA;
  int pDB;
  private final RadarTipsView.b pDi;
  private final f pDj;
  private final f pDk;
  private final f pDl;
  private final f pDm;
  private final f pDn;
  private final int pDo;
  final int pDp;
  final int pDq;
  private final int pDr;
  private final int pDs;
  final f pDt;
  boolean pDu;
  private boolean pDv;
  boolean pDw;
  boolean pDx;
  private int pDy;
  private long pDz;

  static
  {
    AppMethodBeat.i(103061);
    eQB = new k[] { (k)v.a(new t(v.aN(RadarTipsView.class), "tipsFadeIn", "getTipsFadeIn()Landroid/view/animation/Animation;")), (k)v.a(new t(v.aN(RadarTipsView.class), "tipsFadeOut", "getTipsFadeOut()Landroid/view/animation/Animation;")), (k)v.a(new t(v.aN(RadarTipsView.class), "tvTextTips", "getTvTextTips()Landroid/widget/TextView;")), (k)v.a(new t(v.aN(RadarTipsView.class), "textTipsContainer", "getTextTipsContainer()Landroid/view/View;")), (k)v.a(new t(v.aN(RadarTipsView.class), "noviceEducationTips", "getNoviceEducationTips()Landroid/widget/LinearLayout;")) };
    pDH = new a((byte)0);
    TAG = "MicroMsg.RadarTipsView";
    pDC = 3;
    pDE = 1;
    pDF = 2;
    pDG = 3;
    AppMethodBeat.o(103061);
  }

  public RadarTipsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(103075);
    this.pDi = new RadarTipsView.b(this);
    this.pDj = g.g((a)new RadarTipsView.d(this));
    this.pDk = g.g((a)new RadarTipsView.e(this));
    this.pDl = i.aa(this, 2131826799);
    this.pDm = i.aa(this, 2131826798);
    this.pDn = i.aa(this, 2131826800);
    this.pDp = 1;
    this.pDq = 2;
    this.pDr = 3;
    this.pDs = 3;
    this.pDt = new f(this, Looper.getMainLooper());
    this.pDv = true;
    this.pDB = pDD;
    AppMethodBeat.o(103075);
  }

  public RadarTipsView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(103076);
    this.pDi = new RadarTipsView.b(this);
    this.pDj = g.g((a)new RadarTipsView.d(this));
    this.pDk = g.g((a)new RadarTipsView.e(this));
    this.pDl = i.aa(this, 2131826799);
    this.pDm = i.aa(this, 2131826798);
    this.pDn = i.aa(this, 2131826800);
    this.pDp = 1;
    this.pDq = 2;
    this.pDr = 3;
    this.pDs = 3;
    this.pDt = new f(this, Looper.getMainLooper());
    this.pDv = true;
    this.pDB = pDD;
    AppMethodBeat.o(103076);
  }

  private void cT(String paramString, int paramInt)
  {
    AppMethodBeat.i(103068);
    j.p(paramString, "msg");
    this.pDu = true;
    getNoviceEducationTips().setVisibility(8);
    getNoviceEducationTips().clearAnimation();
    getTvTextTips().setText((CharSequence)paramString);
    setVisibility(0);
    getTextTipsContainer().setVisibility(0);
    getTextTipsContainer().startAnimation(getTipsFadeIn());
    this.pDt.removeMessages(this.pDo);
    this.pDt.removeMessages(this.pDq);
    if (paramInt > 0)
      this.pDt.sendEmptyMessageDelayed(this.pDo, paramInt);
    AppMethodBeat.o(103068);
  }

  private void cdQ()
  {
    AppMethodBeat.i(103074);
    this.pDu = false;
    f localf = this.pDt;
    localf.removeMessages(this.pDp);
    localf.removeMessages(this.pDq);
    localf.removeMessages(this.pDr);
    AppMethodBeat.o(103074);
  }

  private final Animation getTipsFadeOut()
  {
    AppMethodBeat.i(103063);
    Animation localAnimation = (Animation)this.pDk.getValue();
    AppMethodBeat.o(103063);
    return localAnimation;
  }

  private final TextView getTvTextTips()
  {
    AppMethodBeat.i(103064);
    TextView localTextView = (TextView)this.pDl.getValue();
    AppMethodBeat.o(103064);
    return localTextView;
  }

  private final void setPressing(boolean paramBoolean)
  {
    this.pDx = paramBoolean;
  }

  public final void Vz(String paramString)
  {
    AppMethodBeat.i(103069);
    j.p(paramString, "msg");
    this.pDB = pDG;
    cT(paramString, 5000);
    AppMethodBeat.o(103069);
  }

  public final void cdO()
  {
    AppMethodBeat.i(103070);
    this.pDu = false;
    this.pDB = pDD;
    ab.d(TAG, "hidNoviceEducation");
    this.pDt.removeMessages(this.pDr);
    if ((getVisibility() == 0) && (getNoviceEducationTips().getVisibility() == 0))
    {
      getNoviceEducationTips().clearAnimation();
      if (getTextTipsContainer().getAnimation() == getTipsFadeOut())
        getTextTipsContainer().clearAnimation();
      ab.d(TAG, "hideNoviceEducation real");
      getNoviceEducationTips().startAnimation(getTipsFadeOut());
    }
    AppMethodBeat.o(103070);
  }

  public final void cdP()
  {
    AppMethodBeat.i(103073);
    ab.d(TAG, "hideRadarTips");
    if ((getVisibility() == 0) && (getTextTipsContainer().getVisibility() == 0))
    {
      if (getNoviceEducationTips().getAnimation() == getTipsFadeOut())
        getNoviceEducationTips().clearAnimation();
      getTextTipsContainer().clearAnimation();
      ab.d(TAG, "hideRadarTips real");
      this.pDB = pDD;
      this.pDu = false;
      getTextTipsContainer().startAnimation(getTipsFadeOut());
    }
    AppMethodBeat.o(103073);
  }

  final LinearLayout getNoviceEducationTips()
  {
    AppMethodBeat.i(103066);
    LinearLayout localLinearLayout = (LinearLayout)this.pDn.getValue();
    AppMethodBeat.o(103066);
    return localLinearLayout;
  }

  final View getTextTipsContainer()
  {
    AppMethodBeat.i(103065);
    View localView = (View)this.pDm.getValue();
    AppMethodBeat.o(103065);
    return localView;
  }

  final Animation getTipsFadeIn()
  {
    AppMethodBeat.i(103062);
    Animation localAnimation = (Animation)this.pDj.getValue();
    AppMethodBeat.o(103062);
    return localAnimation;
  }

  public final void setNoMember(boolean paramBoolean)
  {
    AppMethodBeat.i(103071);
    this.pDv = paramBoolean;
    if (!this.pDv)
    {
      cdP();
      cdQ();
      cdO();
    }
    AppMethodBeat.o(103071);
  }

  public final void setPressingDown(boolean paramBoolean)
  {
    AppMethodBeat.i(103072);
    if (this.pDz != 0L)
    {
      this.pDB = pDD;
      cdQ();
      cdP();
      getTextTipsContainer().setVisibility(8);
      getNoviceEducationTips().setVisibility(8);
      setVisibility(8);
    }
    this.pDx = true;
    this.pDz = bo.yz();
    this.pDA = paramBoolean;
    this.pDy += 1;
    AppMethodBeat.o(103072);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarTipsView$Companion;", "", "()V", "PressTooShortCountThreshold", "", "TAG", "", "TIPS_PURPOSE_ERROR_MESSAGE", "TIPS_PURPOSE_NORMAL", "TIPS_PURPOSE_NOVICE_EDUCATION", "TIPS_PURPOSE_SHEARING", "plugin-radar_release"})
  public static final class a
  {
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/ui/RadarTipsView$tipsHandler$1", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "handleMessage", "", "msg", "Landroid/os/Message;", "plugin-radar_release"})
  public static final class f extends ak
  {
    f(Looper paramLooper)
    {
      super();
    }

    public final void handleMessage(Message paramMessage)
    {
      AppMethodBeat.i(103060);
      j.p(paramMessage, "msg");
      int i = paramMessage.what;
      if (i == RadarTipsView.d(this.pDI))
      {
        this.pDI.cdP();
        AppMethodBeat.o(103060);
      }
      while (true)
      {
        return;
        if (i == RadarTipsView.e(this.pDI))
        {
          if ((RadarTipsView.f(this.pDI)) && (this.pDI.pDx))
          {
            RadarTipsView.a(this.pDI);
            AppMethodBeat.o(103060);
          }
        }
        else if (i == RadarTipsView.g(this.pDI))
        {
          paramMessage = this.pDI;
          paramMessage.pDu = true;
          paramMessage.pDB = RadarTipsView.pDF;
          ab.d(RadarTipsView.TAG, "showNoviceEducation");
          paramMessage.pDw = true;
          paramMessage.getTextTipsContainer().setVisibility(8);
          paramMessage.getTextTipsContainer().clearAnimation();
          paramMessage.setVisibility(0);
          paramMessage.getNoviceEducationTips().setVisibility(0);
          paramMessage.getNoviceEducationTips().startAnimation(paramMessage.getTipsFadeIn());
          paramMessage.getNoviceEducationTips().requestFocus();
          AppMethodBeat.o(103060);
        }
        else
        {
          if (i == RadarTipsView.h(this.pDI))
            this.pDI.cdO();
          AppMethodBeat.o(103060);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarTipsView
 * JD-Core Version:    0.6.2
 */