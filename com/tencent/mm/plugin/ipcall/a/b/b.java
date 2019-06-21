package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.b.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.ui.j;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bf;
import com.tencent.mm.ui.MMActivity;

public final class b
  implements g.a, d.a, HeadsetPlugReceiver.a
{
  public MMActivity crP;
  public com.tencent.mm.compatible.util.b gar;
  public HeadsetPlugReceiver kzs;
  public boolean kzt;
  public boolean kzu;
  public a nxf;
  public c nxg;
  public d nxh;
  public j nxi;
  private boolean nxj;
  public b.a nxk;
  public long nxl;

  public b()
  {
    AppMethodBeat.i(21804);
    this.nxj = false;
    this.kzu = false;
    this.kzt = false;
    this.nxl = 0L;
    this.nxf = new a();
    this.nxg = new c();
    this.nxh = new d();
    this.gar = new com.tencent.mm.compatible.util.b(ah.getContext());
    this.kzs = new HeadsetPlugReceiver();
    AppMethodBeat.o(21804);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(21805);
    this.nxi = paramj;
    if (paramj != null)
      i.bHv().bGT();
    AppMethodBeat.o(21805);
  }

  public final void bHI()
  {
    AppMethodBeat.i(21806);
    this.nxh.nxu = this;
    d locald = this.nxh;
    if (!locald.mfW.aGA)
    {
      locald.mfW.a(locald);
      d.1 local1 = new d.1(locald);
      if (locald.mfS.aj(local1))
      {
        locald.mfT = 0L;
        AppMethodBeat.o(21806);
      }
    }
    while (true)
    {
      return;
      locald.mfT = -1L;
      AppMethodBeat.o(21806);
    }
  }

  public final int bHJ()
  {
    AppMethodBeat.i(21811);
    a locala = this.nxf;
    int i;
    if ((locala.kzq != null) && (locala.cFy))
    {
      i = locala.kzq.cIt();
      AppMethodBeat.o(21811);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(21811);
    }
  }

  public final void fS(boolean paramBoolean)
  {
    AppMethodBeat.i(21810);
    ab.i("MicroMsg.IPCallDeviceManager", "onHeadsetState, on: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.nxk != null) && (paramBoolean != this.kzt))
    {
      this.kzt = paramBoolean;
      if (!this.kzu)
        this.nxk.ir(paramBoolean);
    }
    AppMethodBeat.o(21810);
  }

  public final void gE(int paramInt)
  {
    AppMethodBeat.i(21809);
    ab.i("MicroMsg.IPCallDeviceManager", "onAudioStatChange, status: %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
    case 3:
    case 1:
    case 2:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(21809);
      while (true)
      {
        return;
        aw.ZL().KM();
        if ((!aw.ZL().KP()) || (this.nxk == null))
          break;
        this.nxk.ir(true);
        AppMethodBeat.o(21809);
        continue;
        this.kzu = true;
        if ((this.nxk == null) || (this.kzt))
          break;
        this.nxk.is(true);
        AppMethodBeat.o(21809);
        continue;
        this.kzu = false;
        if ((this.nxk == null) || (this.kzt))
          break;
        this.nxk.is(false);
        AppMethodBeat.o(21809);
      }
      g.KK().KM();
    }
  }

  public final void io(boolean paramBoolean)
  {
    AppMethodBeat.i(21807);
    this.nxf.io(paramBoolean);
    AppMethodBeat.o(21807);
  }

  public final void iq(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(21808);
    ab.i("MicroMsg.IPCallDeviceManager", "onScreenDistanceChange, isClose: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (this.crP != null)
    {
      MMActivity localMMActivity = this.crP;
      if (!paramBoolean)
        localMMActivity.setScreenEnable(bool);
    }
    else
    {
      if (!i.bHu().bHl())
        break label98;
      if (!paramBoolean)
        break label87;
      this.nxj = a.KU();
      this.nxf.io(false);
      AppMethodBeat.o(21808);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label87: this.nxf.io(this.nxj);
      label98: AppMethodBeat.o(21808);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.b.b
 * JD-Core Version:    0.6.2
 */