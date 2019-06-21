package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class BaseVoicePrintUI$4
  implements ap.a
{
  BaseVoicePrintUI$4(BaseVoicePrintUI paramBaseVoicePrintUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(26133);
    Object localObject1 = BaseVoicePrintUI.c(this.sLV);
    if (((VoiceTipInfoView)localObject1).poi.getAnimation() == null)
    {
      TextView localTextView = ((VoiceTipInfoView)localObject1).poi;
      Object localObject2 = ((VoiceTipInfoView)localObject1).getContext();
      localObject1 = new VoiceTipInfoView.1((VoiceTipInfoView)localObject1);
      float f = localTextView.getWidth();
      ab.d("MicroMsg.VoiceViewAnimationHelper", "target ".concat(String.valueOf(f)));
      int[] arrayOfInt = new int[2];
      localTextView.getLocationInWindow(arrayOfInt);
      int i = (int)(f + arrayOfInt[0]);
      ab.d("MicroMsg.VoiceViewAnimationHelper", "location %d %d preX=%d", new Object[] { Integer.valueOf(arrayOfInt[0]), Integer.valueOf(arrayOfInt[1]), Integer.valueOf(i) });
      localObject2 = AnimationUtils.loadAnimation((Context)localObject2, 2131034279);
      ((Animation)localObject2).setDuration(200L);
      ((Animation)localObject2).setStartOffset(0L);
      ((Animation)localObject2).setRepeatCount(0);
      ((Animation)localObject2).setFillAfter(true);
      ((Animation)localObject2).setAnimationListener(new a.1((a.a)localObject1));
      localTextView.startAnimation((Animation)localObject2);
    }
    AppMethodBeat.o(26133);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI.4
 * JD-Core Version:    0.6.2
 */