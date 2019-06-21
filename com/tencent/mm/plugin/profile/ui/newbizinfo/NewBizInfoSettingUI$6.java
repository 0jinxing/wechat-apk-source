package com.tencent.mm.plugin.profile.ui.newbizinfo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf.a;

final class NewBizInfoSettingUI$6
  implements bf.a
{
  NewBizInfoSettingUI$6(NewBizInfoSettingUI paramNewBizInfoSettingUI, boolean paramBoolean, String paramString)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(23917);
    boolean bool = NewBizInfoSettingUI.e(this.pqr);
    AppMethodBeat.o(23917);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(23918);
    if (NewBizInfoSettingUI.f(this.pqr) != null)
    {
      NewBizInfoSettingUI.f(this.pqr).dismiss();
      NewBizInfoSettingUI.g(this.pqr);
    }
    if (this.pqs)
    {
      g.K(o.class);
      com.tencent.mm.storage.p.aok(this.pkF);
    }
    AppMethodBeat.o(23918);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI.6
 * JD-Core Version:    0.6.2
 */