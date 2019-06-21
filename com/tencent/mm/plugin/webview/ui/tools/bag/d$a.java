package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$a extends FrameLayout
{
  ImageView iUn;
  Vibrator iVt;
  private ImageView lBT;
  d.a.a uyG;

  public d$a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(8158);
    this.iVt = ((Vibrator)paramContext.getSystemService("vibrator"));
    LayoutInflater.from(paramContext).inflate(2130971211, this);
    this.lBT = ((ImageView)findViewById(2131829163));
    this.iUn = ((ImageView)findViewById(2131820915));
    AppMethodBeat.o(8158);
  }

  final void af(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(8160);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setFillAfter(true);
    localScaleAnimation.setDuration(50L);
    this.lBT.startAnimation(localScaleAnimation);
    AppMethodBeat.o(8160);
  }

  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(8159);
    super.onConfigurationChanged(paramConfiguration);
    d.a.a locala;
    if ((this.uyG != null) && (paramConfiguration != null))
    {
      locala = this.uyG;
      if (paramConfiguration.orientation != 2)
        break label51;
    }
    label51: for (boolean bool = true; ; bool = false)
    {
      locala.onChange(bool);
      AppMethodBeat.o(8159);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.d.a
 * JD-Core Version:    0.6.2
 */