package com.tencent.mm.plugin.record.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.record.b.s;
import com.tencent.mm.r.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;

final class RecordVoiceBaseView$1
  implements View.OnClickListener
{
  RecordVoiceBaseView$1(RecordVoiceBaseView paramRecordVoiceBaseView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24324);
    ab.d("MicroMsg.RecordVoiceBaseView", "clicked path %s, isPlay %s", new Object[] { RecordVoiceBaseView.a(this.pKS), Boolean.valueOf(RecordVoiceBaseView.b(this.pKS).buH()) });
    if ((a.bJ(RecordVoiceBaseView.c(this.pKS))) || (a.bH(RecordVoiceBaseView.c(this.pKS))))
      AppMethodBeat.o(24324);
    while (true)
    {
      return;
      if ((!f.Mn()) && (!bo.isNullOrNil(RecordVoiceBaseView.a(this.pKS))))
      {
        t.hO(paramView.getContext());
        AppMethodBeat.o(24324);
      }
      else if (!bo.bc(RecordVoiceBaseView.a(this.pKS), "").equals(RecordVoiceBaseView.b(this.pKS).path))
      {
        RecordVoiceBaseView.d(this.pKS);
        AppMethodBeat.o(24324);
      }
      else if (RecordVoiceBaseView.b(this.pKS).buH())
      {
        this.pKS.stopPlay();
        AppMethodBeat.o(24324);
      }
      else
      {
        if (!RecordVoiceBaseView.e(this.pKS))
          RecordVoiceBaseView.d(this.pKS);
        AppMethodBeat.o(24324);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordVoiceBaseView.1
 * JD-Core Version:    0.6.2
 */