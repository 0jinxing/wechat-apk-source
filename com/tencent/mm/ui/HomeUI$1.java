package com.tencent.mm.ui;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class HomeUI$1
  implements MainTabUI.a
{
  HomeUI$1(HomeUI paramHomeUI)
  {
  }

  public final void MU(int paramInt)
  {
    AppMethodBeat.i(29339);
    HomeUI.a(this.yjm);
    if (paramInt != 0)
      this.yjm.a(1.0F, HomeUI.b(this.yjm).getResources().getColor(2131690310), HomeUI.b(this.yjm).getResources().getColor(2131689650), HomeUI.b(this.yjm).getResources().getColor(2131689761));
    AppMethodBeat.o(29339);
  }

  public final void MV(int paramInt)
  {
    AppMethodBeat.i(29341);
    if ((HomeUI.c(this.yjm) == 0) && (paramInt == 1))
      HomeUI.a(this.yjm, HomeUI.d(this.yjm).mbt);
    while (true)
    {
      HomeUI.c(this.yjm, paramInt);
      ab.d("MicroMsg.LauncherUI.HomeUI", "tabSelectedStateChanged:%s begin:%s end:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(HomeUI.e(this.yjm)), Integer.valueOf(HomeUI.f(this.yjm)) });
      AppMethodBeat.o(29341);
      return;
      if (paramInt == 2)
      {
        HomeUI.b(this.yjm, HomeUI.d(this.yjm).mbt);
      }
      else if (paramInt == 0)
      {
        HomeUI.a(this.yjm, 0);
        HomeUI.b(this.yjm, 0);
      }
    }
  }

  public final void p(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(29340);
    HomeUI.a(this.yjm, paramInt, paramFloat);
    AppMethodBeat.o(29340);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.1
 * JD-Core Version:    0.6.2
 */