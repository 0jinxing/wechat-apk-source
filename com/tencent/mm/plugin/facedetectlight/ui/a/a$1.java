package com.tencent.mm.plugin.facedetectlight.ui.a;

import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetectlight.ui.FaceReflectMask;
import com.tencent.mm.plugin.facedetectlight.ui.PreviewFrameLayout;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;

public final class a$1
  implements Runnable
{
  public a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(823);
    Object localObject = (ViewGroup.MarginLayoutParams)this.meh.mee.getLayoutParams();
    ((ViewGroup.MarginLayoutParams)localObject).width = ((int)(this.meh.mdz.getWidth() * 0.8D));
    ((ViewGroup.MarginLayoutParams)localObject).height = ((int)(this.meh.mdz.getWidth() * 0.8D));
    ((ViewGroup.MarginLayoutParams)localObject).topMargin = ((int)(this.meh.mdz.getHeight() * 0.4D - this.meh.mdz.getWidth() * 0.4D));
    this.meh.mee.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.meh.mee.setVisibility(0);
    this.meh.mcO.setVisibility(0);
    this.meh.mcQ.setVisibility(0);
    a locala = this.meh;
    ab.i(locala.TAG, "beginLoadAnimation()");
    localObject = new RotateAnimation(0.0F, 180.0F, 1, 0.5F, 1, 0.5F);
    ((Animation)localObject).setDuration(1000L);
    locala.mee.startAnimation((Animation)localObject);
    AppMethodBeat.o(823);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.a.a.1
 * JD-Core Version:    0.6.2
 */