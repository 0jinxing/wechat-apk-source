package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Context;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$a extends FrameLayout
{
  View WL;
  Vibrator iVt;
  ImageView lBT;

  public a$a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(8143);
    this.iVt = ((Vibrator)paramContext.getSystemService("vibrator"));
    LayoutInflater.from(paramContext).inflate(2130971210, this);
    this.lBT = ((ImageView)findViewById(2131829163));
    this.WL = findViewById(2131821019);
    AppMethodBeat.o(8143);
  }

  final void af(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(8144);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 1.0F, 1, 1.0F);
    localScaleAnimation.setFillAfter(true);
    localScaleAnimation.setDuration(50L);
    this.lBT.startAnimation(localScaleAnimation);
    AppMethodBeat.o(8144);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.a.a
 * JD-Core Version:    0.6.2
 */