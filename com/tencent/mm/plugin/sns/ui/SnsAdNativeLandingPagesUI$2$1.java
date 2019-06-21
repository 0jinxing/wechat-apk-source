package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class SnsAdNativeLandingPagesUI$2$1
  implements n.c
{
  SnsAdNativeLandingPagesUI$2$1(SnsAdNativeLandingPagesUI.2 param2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(38622);
    if ((SnsAdNativeLandingPagesUI.z(this.roN.roM) == 0) || ((SnsAdNativeLandingPagesUI.z(this.roN.roM) & 0x2) == 0))
      paraml.a(1, this.roN.roM.getString(2131302498), 2131231019);
    if ((SnsAdNativeLandingPagesUI.z(this.roN.roM) == 0) || ((SnsAdNativeLandingPagesUI.z(this.roN.roM) & 0x1) == 0))
      paraml.a(2, this.roN.roM.getString(2131303589), 2131231005);
    if (((SnsAdNativeLandingPagesUI.z(this.roN.roM) == 0) || ((SnsAdNativeLandingPagesUI.z(this.roN.roM) & 0x4) == 0)) && (SnsAdNativeLandingPagesUI.t(this.roN.roM) != 7))
      paraml.a(3, this.roN.roM.getString(2131298092), 2131230996);
    if (((SnsAdNativeLandingPagesUI.z(this.roN.roM) == 0) || (SnsAdNativeLandingPagesUI.A(this.roN.roM))) && (SnsAdNativeLandingPagesUI.s(this.roN.roM) == 2) && (SnsAdNativeLandingPagesUI.B(this.roN.roM)))
      if (SnsAdNativeLandingPagesUI.C(this.roN.roM) == null)
        break label255;
    label255: for (String str = SnsAdNativeLandingPagesUI.C(this.roN.roM); ; str = "")
    {
      paraml.a(4, str, 0);
      AppMethodBeat.o(38622);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.2.1
 * JD-Core Version:    0.6.2
 */