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
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.radar.b.e.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarStateChooseView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isShowing", "", "mStatus", "Lcom/tencent/mm/plugin/radar/model/RadarManager$ChooseStatus;", "getMStatus", "()Lcom/tencent/mm/plugin/radar/model/RadarManager$ChooseStatus;", "setMStatus", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$ChooseStatus;)V", "mTrunOn", "slideInAnim", "Landroid/view/animation/Animation;", "getSlideInAnim", "()Landroid/view/animation/Animation;", "slideInAnim$delegate", "Lkotlin/Lazy;", "slideOutAnim", "getSlideOutAnim", "slideOutAnim$delegate", "hide", "", "show", "stateAlignment", "trunOff", "trunOn", "trunToStatus", "status", "Companion", "plugin-radar_release"})
public final class RadarStateChooseView extends RelativeLayout
{
  private static final String TAG = "MicroMsg.Radar.RadarStateChooseView";
  public static final RadarStateChooseView.a pCX;
  boolean pCS;
  private final f pCT;
  private final f pCU;
  boolean pCV;
  e.a pCW;

  static
  {
    AppMethodBeat.i(103025);
    eQB = new k[] { (k)v.a(new t(v.aN(RadarStateChooseView.class), "slideOutAnim", "getSlideOutAnim()Landroid/view/animation/Animation;")), (k)v.a(new t(v.aN(RadarStateChooseView.class), "slideInAnim", "getSlideInAnim()Landroid/view/animation/Animation;")) };
    pCX = new RadarStateChooseView.a((byte)0);
    TAG = "MicroMsg.Radar.RadarStateChooseView";
    AppMethodBeat.o(103025);
  }

  public RadarStateChooseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(103030);
    this.pCT = g.g((a)new RadarStateChooseView.c(this));
    this.pCU = g.g((a)new RadarStateChooseView.b(this));
    this.pCV = true;
    this.pCW = e.a.pBI;
    AppMethodBeat.o(103030);
  }

  public RadarStateChooseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(103031);
    this.pCT = g.g((a)new RadarStateChooseView.c(this));
    this.pCU = g.g((a)new RadarStateChooseView.b(this));
    this.pCV = true;
    this.pCW = e.a.pBI;
    AppMethodBeat.o(103031);
  }

  final void cdK()
  {
    AppMethodBeat.i(103029);
    e.a locala = this.pCW;
    switch (e.eQZ[locala.ordinal()])
    {
    default:
      setVisibility(4);
      AppMethodBeat.o(103029);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      setVisibility(4);
      AppMethodBeat.o(103029);
      continue;
      setBackgroundResource(2131231850);
      setVisibility(0);
      AppMethodBeat.o(103029);
    }
  }

  public final e.a getMStatus()
  {
    return this.pCW;
  }

  final Animation getSlideInAnim()
  {
    AppMethodBeat.i(103027);
    Animation localAnimation = (Animation)this.pCU.getValue();
    AppMethodBeat.o(103027);
    return localAnimation;
  }

  final Animation getSlideOutAnim()
  {
    AppMethodBeat.i(103026);
    Animation localAnimation = (Animation)this.pCT.getValue();
    AppMethodBeat.o(103026);
    return localAnimation;
  }

  public final void setMStatus(e.a parama)
  {
    AppMethodBeat.i(103028);
    j.p(parama, "<set-?>");
    this.pCW = parama;
    AppMethodBeat.o(103028);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarStateChooseView
 * JD-Core Version:    0.6.2
 */