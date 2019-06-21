package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class FakeSwitchAccountUI$1
  implements ap.a
{
  FakeSwitchAccountUI$1(FakeSwitchAccountUI paramFakeSwitchAccountUI)
  {
  }

  public final boolean BI()
  {
    boolean bool = true;
    AppMethodBeat.i(126954);
    int i = FakeSwitchAccountUI.a(this.qkT);
    ab.i("MicroMsg.FakeSwitchAccountUI", "oldPid %d, mm pid %d", new Object[] { Integer.valueOf(FakeSwitchAccountUI.b(this.qkT)), Integer.valueOf(i) });
    if ((FakeSwitchAccountUI.b(this.qkT) != 0) && (i != 0) && (FakeSwitchAccountUI.b(this.qkT) != i))
      if (FakeSwitchAccountUI.c(this.qkT) <= 0)
      {
        FakeSwitchAccountUI.d(this.qkT);
        AppMethodBeat.o(126954);
      }
    while (true)
    {
      return bool;
      FakeSwitchAccountUI.e(this.qkT);
      AppMethodBeat.o(126954);
      bool = false;
      continue;
      FakeSwitchAccountUI.d(this.qkT);
      if (FakeSwitchAccountUI.c(this.qkT) <= 20)
      {
        AppMethodBeat.o(126954);
      }
      else
      {
        FakeSwitchAccountUI.e(this.qkT);
        AppMethodBeat.o(126954);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI.1
 * JD-Core Version:    0.6.2
 */