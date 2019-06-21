package com.tencent.mm.plugin.story.ui.view;

import a.f.a.b;
import a.l;
import android.graphics.Color;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.at;
import com.tencent.mm.media.widget.camerarecordview.a;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar.a;
import com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton;
import com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.b;
import com.tencent.mm.plugin.story.c.a.c;
import com.tencent.mm.plugin.story.c.a.c.a;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/CaptureView$initCaptureButton$2", "Lcom/tencent/mm/plugin/mmsight/ui/MMSightRecordButton$LongPressCallback;", "onLongPress", "", "onLongPressFinish", "onPressDown", "plugin-story_release"})
public final class CaptureView$i
  implements MMSightRecordButton.b
{
  public final void bnU()
  {
    AppMethodBeat.i(110314);
    if (!CaptureView.b(this.sij).a((b)new CaptureView.i.b(this)))
      CaptureView.a(this.sij, 2131303943);
    CaptureView.d(this.sij).setVisibility(0);
    CaptureView.e(this.sij).setVisibility(0);
    AppMethodBeat.o(110314);
  }

  public final void bnV()
  {
    AppMethodBeat.i(110312);
    Object localObject = new int[2];
    CaptureView.a(this.sij).getLocationOnScreen((int[])localObject);
    CaptureView.b(this.sij).km(localObject[1]);
    CaptureView.c(this.sij);
    localObject = h.scu;
    h.EU(2);
    localObject = h.scu;
    h.cAq().FV();
    AppMethodBeat.o(110312);
  }

  public final void jdMethod_if()
  {
    AppMethodBeat.i(110313);
    c.a locala = (c.a)c.rRk.Uw();
    CaptureView.a(this.sij).a(locala.rRl.duration * 1000, Color.parseColor("#0E9CE6"), (MMSightCircularProgressBar.a)new CaptureView.i.a(this));
    CaptureView.b(this.sij).EL();
    CaptureView.d(this.sij).setVisibility(8);
    CaptureView.e(this.sij).setVisibility(8);
    CaptureView.a(this.sij, bo.yz());
    AppMethodBeat.o(110313);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CaptureView.i
 * JD-Core Version:    0.6.2
 */