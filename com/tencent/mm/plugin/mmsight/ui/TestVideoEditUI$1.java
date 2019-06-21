package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.e;
import com.tencent.mm.api.r;
import com.tencent.mm.sdk.platformtools.ab;

final class TestVideoEditUI$1
  implements r
{
  TestVideoEditUI$1(TestVideoEditUI paramTestVideoEditUI)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(55292);
    ab.i("MicroMsg.TestVideoEditUI", "[onSelectedFeature] features:%s", new Object[] { parame.name() });
    AppMethodBeat.o(55292);
  }

  public final void a(e parame, int paramInt)
  {
    AppMethodBeat.i(55293);
    ab.i("MicroMsg.TestVideoEditUI", "[onSelectedDetailFeature] features:%s index:%s", new Object[] { parame.name(), Integer.valueOf(paramInt) });
    AppMethodBeat.o(55293);
  }

  public final void bd(boolean paramBoolean)
  {
    AppMethodBeat.i(55294);
    if (paramBoolean)
    {
      this.oDz.showVKB();
      AppMethodBeat.o(55294);
    }
    while (true)
    {
      return;
      this.oDz.hideVKB(TestVideoEditUI.a(this.oDz));
      AppMethodBeat.o(55294);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.TestVideoEditUI.1
 * JD-Core Version:    0.6.2
 */