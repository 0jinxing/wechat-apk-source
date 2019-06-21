package com.tencent.mm.plugin.mmsight.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.a.d;
import com.tencent.mm.plugin.mmsight.model.a.d.c;
import com.tencent.mm.plugin.mmsight.model.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

final class SightCaptureUI$23
  implements MMSightRecordButton.b
{
  SightCaptureUI$23(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void bnU()
  {
    AppMethodBeat.i(55222);
    String str = bo.dpG().toString();
    d locald = SightCaptureUI.p(this.oDf);
    long l;
    if (SightCaptureUI.p(this.oDf) != null)
    {
      l = SightCaptureUI.p(this.oDf).WK();
      ab.i("MicroMsg.TestCaptureUiEvent", "onLongPressFinish %s, recorder: %s, recordTime: %s", new Object[] { str, locald, Long.valueOf(l) });
      if (SightCaptureUI.l(this.oDf) != 0)
        break label188;
      if ((SightCaptureUI.p(this.oDf) == null) || (SightCaptureUI.p(this.oDf).WK() > 1000L) || (SightCaptureUI.p(this.oDf).WL() != d.c.ovB))
        break label173;
      ab.i("MicroMsg.SightCaptureUI", "video record too short, cancel and convert to takepicture");
      SightCaptureUI.p(this.oDf).cancel();
      if (SightCaptureUI.l(this.oDf) != 0)
        break label280;
      SightCaptureUI.q(this.oDf);
      AppMethodBeat.o(55222);
    }
    label280: 
    while (true)
    {
      return;
      l = 0L;
      break;
      label173: SightCaptureUI.r(this.oDf);
      AppMethodBeat.o(55222);
      continue;
      label188: if (SightCaptureUI.l(this.oDf) == 1)
      {
        if (((SightCaptureUI.p(this.oDf) != null) && (SightCaptureUI.p(this.oDf).WK() <= 1000L)) || (SightCaptureUI.p(this.oDf) == null))
        {
          ab.i("MicroMsg.SightCaptureUI", "video record too short");
          Toast.makeText(this.oDf, 2131301446, 1).show();
          SightCaptureUI.s(this.oDf);
          AppMethodBeat.o(55222);
        }
        else
        {
          SightCaptureUI.r(this.oDf);
        }
      }
      else
        AppMethodBeat.o(55222);
    }
  }

  public final void bnV()
  {
    AppMethodBeat.i(55220);
    ab.i("MicroMsg.SightCaptureUI", "onPressDown, currentStatus: %s", new Object[] { Integer.valueOf(SightCaptureUI.g(this.oDf)) });
    if ((SightCaptureUI.g(this.oDf) == 0) || (SightCaptureUI.j(this.oDf) == null) || (!SightCaptureUI.j(this.oDf).bPu()))
      AppMethodBeat.o(55220);
    while (true)
    {
      return;
      int[] arrayOfInt = new int[2];
      SightCaptureUI.k(this.oDf).getLocationOnScreen(arrayOfInt);
      SightCaptureUI.j(this.oDf).kj(arrayOfInt[1]);
      if (SightCaptureUI.l(this.oDf) == 0)
        SightCaptureUI.a(this.oDf, SightCaptureUI.m(this.oDf));
      AppMethodBeat.o(55220);
    }
  }

  public final void jdMethod_if()
  {
    AppMethodBeat.i(55221);
    if ((SightCaptureUI.g(this.oDf) == 0) || (SightCaptureUI.j(this.oDf) == null) || (!SightCaptureUI.j(this.oDf).bPu()))
      AppMethodBeat.o(55221);
    while (true)
    {
      return;
      SightCaptureUI.n(this.oDf);
      ab.i("MicroMsg.TestCaptureUiEvent", "onLongPress %s", new Object[] { bo.dpG().toString() });
      SightCaptureUI.o(this.oDf);
      AppMethodBeat.o(55221);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.23
 * JD-Core Version:    0.6.2
 */