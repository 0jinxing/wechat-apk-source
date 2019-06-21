package com.tencent.mm.plugin.emojicapture.ui.capture;

import a.l;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.plugin.emojicapture.model.a.b;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class CaptureDecoration$c
  implements Runnable
{
  CaptureDecoration$c(CaptureDecoration paramCaptureDecoration)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2990);
    CaptureDecoration localCaptureDecoration = this.lmI;
    localCaptureDecoration.lmz.setVisibility(8);
    localCaptureDecoration.lmB.setVisibility(0);
    localCaptureDecoration.lmB.animate().cancel();
    localCaptureDecoration.lmB.setAlpha(1.0F);
    Object localObject = localCaptureDecoration.lhH;
    if (localObject != null)
    {
      localCaptureDecoration.lmD.setText((CharSequence)((b)localObject).kfM);
      AnimationDrawable localAnimationDrawable = new AnimationDrawable();
      Iterator localIterator = ((Iterable)((b)localObject).lhM).iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        localAnimationDrawable.addFrame((Drawable)new BitmapDrawable(localCaptureDecoration.getResources(), (String)localObject), 300);
      }
      localCaptureDecoration.lmC.setImageDrawable((Drawable)localAnimationDrawable);
      localAnimationDrawable.start();
    }
    localCaptureDecoration.postDelayed(localCaptureDecoration.lmH, 2000L);
    AppMethodBeat.o(2990);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration.c
 * JD-Core Version:    0.6.2
 */