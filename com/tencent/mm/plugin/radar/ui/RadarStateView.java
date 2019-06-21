package com.tencent.mm.plugin.radar.ui;

import a.f;
import a.f.b.j;
import a.f.b.t;
import a.f.b.v;
import a.g;
import a.i.k;
import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.radar.b.c.e;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarStateView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "isShowing", "()Z", "setShowing", "(Z)V", "isVisible", "ivState", "Landroid/widget/ImageView;", "slideInAnim", "Landroid/view/animation/Animation;", "getSlideInAnim", "()Landroid/view/animation/Animation;", "slideInAnim$delegate", "Lkotlin/Lazy;", "slideOutAnim", "getSlideOutAnim", "slideOutAnim$delegate", "state", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;", "getState", "()Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;", "setState", "(Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;)V", "switchHandler", "com/tencent/mm/plugin/radar/ui/RadarStateView$switchHandler$1", "Lcom/tencent/mm/plugin/radar/ui/RadarStateView$switchHandler$1;", "trunOn", "init", "", "reset", "slideIn", "slideOut", "stateAlignment", "trunOff", "turnToState", "Companion", "plugin-radar_release"})
public final class RadarStateView extends RelativeLayout
{
  static final String TAG = "MicroMsg.RadarStateView";
  static final int pDe = 300;
  public static final RadarStateView.a pDf;
  c.e pBL;
  boolean pCS;
  private final f pCT;
  private final f pCU;
  boolean pDb;
  final RadarStateView.d pDc;
  private ImageView pDd;

  static
  {
    AppMethodBeat.i(103042);
    eQB = new k[] { (k)v.a(new t(v.aN(RadarStateView.class), "slideOutAnim", "getSlideOutAnim()Landroid/view/animation/Animation;")), (k)v.a(new t(v.aN(RadarStateView.class), "slideInAnim", "getSlideInAnim()Landroid/view/animation/Animation;")) };
    pDf = new RadarStateView.a((byte)0);
    TAG = "MicroMsg.RadarStateView";
    pDe = 300;
    AppMethodBeat.o(103042);
  }

  public RadarStateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(103050);
    this.pBL = c.e.pAW;
    this.pDb = true;
    this.pDc = new RadarStateView.d(this);
    this.pCT = g.g((a.f.a.a)new RadarStateView.c(this));
    this.pCU = g.g((a.f.a.a)new RadarStateView.b(this));
    AppMethodBeat.o(103050);
  }

  public RadarStateView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(103051);
    this.pBL = c.e.pAW;
    this.pDb = true;
    this.pDc = new RadarStateView.d(this);
    this.pCT = g.g((a.f.a.a)new RadarStateView.c(this));
    this.pCU = g.g((a.f.a.a)new RadarStateView.b(this));
    AppMethodBeat.o(103051);
  }

  private final Animation getSlideInAnim()
  {
    AppMethodBeat.i(103045);
    Animation localAnimation = (Animation)this.pCU.getValue();
    AppMethodBeat.o(103045);
    return localAnimation;
  }

  private final Animation getSlideOutAnim()
  {
    AppMethodBeat.i(103044);
    Animation localAnimation = (Animation)this.pCT.getValue();
    AppMethodBeat.o(103044);
    return localAnimation;
  }

  private final void setShowing(boolean paramBoolean)
  {
    this.pCS = paramBoolean;
  }

  final void cdK()
  {
    AppMethodBeat.i(103046);
    ab.d(TAG, " state : " + this.pBL);
    if (!this.pDb)
    {
      setVisibility(8);
      AppMethodBeat.o(103046);
      return;
    }
    Object localObject = this.pBL;
    switch (f.eQZ[localObject.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(103046);
      break;
      setVisibility(8);
      AppMethodBeat.o(103046);
      break;
      setBackgroundResource(2131231845);
      localObject = this.pDd;
      if (localObject == null)
        j.dWJ();
      ((ImageView)localObject).setImageResource(2131231849);
      setVisibility(0);
      AppMethodBeat.o(103046);
      break;
      setBackgroundResource(2131231846);
      localObject = this.pDd;
      if (localObject == null)
        j.dWJ();
      ((ImageView)localObject).setImageResource(2131231848);
      setVisibility(0);
      AppMethodBeat.o(103046);
      break;
      setBackgroundResource(2131231846);
      localObject = this.pDd;
      if (localObject == null)
        j.dWJ();
      ((ImageView)localObject).setImageResource(2131231847);
      setVisibility(0);
    }
  }

  public final void cdL()
  {
    AppMethodBeat.i(103048);
    if (!this.pDb)
      AppMethodBeat.o(103048);
    while (true)
    {
      return;
      init();
      cdK();
      this.pCS = true;
      startAnimation(getSlideOutAnim());
      AppMethodBeat.o(103048);
    }
  }

  public final void cdM()
  {
    AppMethodBeat.i(103049);
    if (!this.pDb)
      AppMethodBeat.o(103049);
    while (true)
    {
      return;
      init();
      cdK();
      startAnimation(getSlideInAnim());
      AppMethodBeat.o(103049);
    }
  }

  public final c.e getState()
  {
    return this.pBL;
  }

  final void init()
  {
    AppMethodBeat.i(103047);
    if (this.pDd == null)
    {
      this.pDd = new ImageView(getContext());
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(11);
      localLayoutParams.addRule(15);
      localLayoutParams.setMargins(0, 0, com.tencent.mm.bz.a.fromDPToPix(getContext(), 5), com.tencent.mm.bz.a.fromDPToPix(getContext(), 2));
      ImageView localImageView = this.pDd;
      if (localImageView != null)
        localImageView.setLayoutParams((ViewGroup.LayoutParams)localLayoutParams);
      addView((View)this.pDd);
    }
    AppMethodBeat.o(103047);
  }

  public final void setState(c.e parame)
  {
    AppMethodBeat.i(103043);
    j.p(parame, "<set-?>");
    this.pBL = parame;
    AppMethodBeat.o(103043);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarStateView
 * JD-Core Version:    0.6.2
 */