package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class SnsTimeLineUI$c
{
  public boolean active = true;
  public String rAf = "";
  public long rAg;
  public int rAh;
  public int rAi;
  public long rAj;
  public long rAk;
  public int rAl;
  public long rAm;
  public int rAn;
  public long rAo;
  public int scene;

  private SnsTimeLineUI$c(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void Ei(int paramInt)
  {
    AppMethodBeat.i(39550);
    if (!this.active)
      AppMethodBeat.o(39550);
    while (true)
    {
      return;
      this.rAi = paramInt;
      this.rAj = bo.anU();
      AppMethodBeat.o(39550);
    }
  }

  public final void Ej(int paramInt)
  {
    AppMethodBeat.i(39551);
    if (!this.active)
      AppMethodBeat.o(39551);
    while (true)
    {
      return;
      reset();
      this.scene = 2;
      this.rAk = bo.anU();
      this.rAl = paramInt;
      AppMethodBeat.o(39551);
    }
  }

  public final void Ek(int paramInt)
  {
    AppMethodBeat.i(39552);
    if (!this.active)
      AppMethodBeat.o(39552);
    while (true)
    {
      return;
      reset();
      this.scene = 3;
      this.rAm = bo.anU();
      this.rAo = 0L;
      this.rAn = paramInt;
      AppMethodBeat.o(39552);
    }
  }

  final void reset()
  {
    this.scene = 0;
    this.rAg = 0L;
    this.rAh = -1;
    this.rAi = 0;
    this.rAj = 0L;
    this.rAk = 0L;
    this.rAl = 0;
    this.rAm = 0L;
    this.rAn = 0;
    this.rAo = 0L;
  }

  public final String toString()
  {
    AppMethodBeat.i(39553);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(this.rAf).append(",").append(this.scene).append(",").append(this.rAg).append(",").append(this.rAh).append(",").append(this.rAi).append(",").append(this.rAj).append(",").append(this.rAk).append(",").append(this.rAl).append(",").append(this.rAm).append(",").append(this.rAn).append(",").append(this.rAo);
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(39553);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.c
 * JD-Core Version:    0.6.2
 */