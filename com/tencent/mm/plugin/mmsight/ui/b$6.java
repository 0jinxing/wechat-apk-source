package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.e;
import com.tencent.mm.api.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

final class b$6
  implements r
{
  b$6(b paramb)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(55147);
    ab.i("MicroMsg.MMSightVideoEditor", "photoEditor [onSelectedFeature] features:%s", new Object[] { parame.name() });
    if (parame == e.ccM)
      b.i(this.oBV);
    AppMethodBeat.o(55147);
  }

  public final void a(e parame, int paramInt)
  {
    AppMethodBeat.i(55148);
    ab.i("MicroMsg.MMSightVideoEditor", "photoEditor [onSelectedDetailFeature] features:%s index:%s", new Object[] { parame.name(), Integer.valueOf(paramInt) });
    AppMethodBeat.o(55148);
  }

  public final void bd(boolean paramBoolean)
  {
    AppMethodBeat.i(55149);
    if (paramBoolean)
    {
      b.e(this.oBV).showVKB();
      AppMethodBeat.o(55149);
    }
    while (true)
    {
      return;
      b.e(this.oBV).hideVKB(b.j(this.oBV));
      AppMethodBeat.o(55149);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.6
 * JD-Core Version:    0.6.2
 */