package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarWaveView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "audioPlayer", "Landroid/media/MediaPlayer;", "rotateAnim", "Landroid/view/animation/Animation;", "rotateWaveIV", "Landroid/view/View;", "init", "", "release", "startWaves", "stopWaves", "Companion", "plugin-radar_release"})
public final class RadarWaveView extends RelativeLayout
{
  static final String TAG = "MicroMsg.RadarWaveView";
  public static final RadarWaveView.a pEC;
  View pEA;
  Animation pEB;
  MediaPlayer pEz;

  static
  {
    AppMethodBeat.i(103137);
    pEC = new RadarWaveView.a((byte)0);
    TAG = "MicroMsg.RadarWaveView";
    AppMethodBeat.o(103137);
  }

  public RadarWaveView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(103136);
    AppMethodBeat.o(103136);
  }

  public final void cdU()
  {
    AppMethodBeat.i(103134);
    ab.d(TAG, "start wave animation");
    setVisibility(0);
    View localView = this.pEA;
    if (localView == null)
      j.dWJ();
    localView.startAnimation(this.pEB);
    AppMethodBeat.o(103134);
  }

  public final void cdV()
  {
    AppMethodBeat.i(103135);
    ab.d(TAG, "stop wave animation. forces, %d, %d", new Object[] { Integer.valueOf(getMeasuredHeight()), Integer.valueOf(getMeasuredWidth()) });
    setVisibility(4);
    View localView = this.pEA;
    if (localView == null)
      j.dWJ();
    localView.clearAnimation();
    AppMethodBeat.o(103135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarWaveView
 * JD-Core Version:    0.6.2
 */