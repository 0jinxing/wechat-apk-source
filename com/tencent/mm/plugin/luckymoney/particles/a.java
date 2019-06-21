package com.tencent.mm.plugin.luckymoney.particles;

import android.content.res.Resources;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static int nZA;
  private static int nZB;
  private static int nZC;
  private static int nZx;
  private static int nZy;
  private static int nZz;
  public c nZD;

  public a(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(42432);
    if (nZx == 0)
    {
      paramViewGroup = paramViewGroup.getResources();
      nZx = paramViewGroup.getDimensionPixelSize(2131428262);
      nZy = paramViewGroup.getDimensionPixelOffset(2131428267);
      nZz = paramViewGroup.getDimensionPixelOffset(2131428266);
      nZA = paramViewGroup.getDimensionPixelOffset(2131428265);
      nZB = paramViewGroup.getDimensionPixelOffset(2131428268);
      nZC = paramViewGroup.getDimensionPixelOffset(2131428263);
    }
    AppMethodBeat.o(42432);
  }

  public static a a(ViewGroup paramViewGroup, b paramb)
  {
    AppMethodBeat.i(42433);
    a locala = new a(paramViewGroup);
    locala.b(paramViewGroup, paramb);
    AppMethodBeat.o(42433);
    return locala;
  }

  private void b(ViewGroup paramViewGroup, b paramb)
  {
    AppMethodBeat.i(42435);
    paramViewGroup = new c(paramViewGroup.getContext(), paramb, new d(paramViewGroup.getWidth() / 2, paramViewGroup.getHeight() + 400), paramViewGroup).R(0.0F, 800.0F).S(-2000.0F, 1250.0F).aH(2000.0F);
    paramViewGroup.oal = 3000.0F;
    paramViewGroup.oam = 500.0F;
    paramViewGroup = paramViewGroup.bLH();
    paramViewGroup.nZO = e.bLQ();
    this.nZD = paramViewGroup.bLI().bLJ();
    AppMethodBeat.o(42435);
  }

  public final c P(int paramInt, long paramLong)
  {
    AppMethodBeat.i(42434);
    c localc = this.nZD;
    localc.nZL = 0;
    localc.nZM = paramLong;
    localc = localc.aF(paramInt).bLL();
    AppMethodBeat.o(42434);
    return localc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.particles.a
 * JD-Core Version:    0.6.2
 */