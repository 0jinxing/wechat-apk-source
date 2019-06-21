package com.tencent.mm.plugin.collect.ui;

import android.widget.ImageView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.collect.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bci;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class CollectBillUI$6
  implements MMSwitchBtn.a
{
  CollectBillUI$6(CollectBillUI paramCollectBillUI)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(41216);
    ab.i("MicroMsg.CollectBillUI", "update switch: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    CollectBillUI.j(this.kFX).setCheck(paramBoolean);
    CollectBillUI.k(this.kFX).setCheck(paramBoolean);
    int i;
    if (paramBoolean)
    {
      CollectBillUI.a(this.kFX, CollectBillUI.l(this.kFX) | 0x8000);
      CollectBillUI.m(this.kFX).setImageResource(2131231131);
      CollectBillUI.n(this.kFX).setImageResource(2131231131);
      Toast.makeText(this.kFX.mController.ylL, 2131298376, 1).show();
      h.pYm.e(13944, new Object[] { Integer.valueOf(11) });
      i = 1;
      g.RQ();
      g.RP().Ry().set(147457, Long.valueOf(CollectBillUI.l(this.kFX)));
      bci localbci = new bci();
      localbci.pXD = i;
      ((j)g.K(j.class)).XL().c(new j.a(209, localbci));
      if (i != 1)
        break label306;
      a.bgv().bgy();
      AppMethodBeat.o(41216);
    }
    while (true)
    {
      return;
      CollectBillUI.a(this.kFX, CollectBillUI.l(this.kFX) & 0xFFFF7FFF);
      CollectBillUI.m(this.kFX).setImageResource(2131231130);
      CollectBillUI.n(this.kFX).setImageResource(2131231130);
      Toast.makeText(this.kFX.mController.ylL, 2131298366, 1).show();
      h.pYm.e(13944, new Object[] { Integer.valueOf(12) });
      i = 2;
      break;
      label306: a.bgv().bgz();
      AppMethodBeat.o(41216);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillUI.6
 * JD-Core Version:    0.6.2
 */