package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
{
  public boolean cFy;
  public boolean eif;
  c.a kzo;
  public com.tencent.mm.audio.b.c nxm;
  public final Object nxn;
  int nxo;
  boolean nxp;
  int nxq;
  boolean nxr;

  public c()
  {
    AppMethodBeat.i(21815);
    this.nxm = null;
    this.nxn = new Object();
    this.cFy = false;
    this.eif = false;
    this.nxo = 92;
    this.nxp = true;
    this.nxq = 0;
    this.nxr = true;
    this.kzo = new c.1(this);
    this.cFy = false;
    AppMethodBeat.o(21815);
  }

  public final void aDm()
  {
    AppMethodBeat.i(21816);
    if (this.cFy)
    {
      ab.d("MicroMsg.IPCallRecorder", "startRecorder, already start");
      AppMethodBeat.o(21816);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.IPCallRecorder", "start record");
      this.cFy = true;
      this.nxo = i.bHt().nxf.nxb;
      if (this.nxo <= 10)
      {
        if (this.nxo <= 0)
        {
          ab.e("MicroMsg.IPCallRecorder", "playDelayInMs<=0");
          i.bHs().bHQ();
        }
        this.nxo = 92;
      }
      synchronized (this.nxn)
      {
        c.2 local2 = new com/tencent/mm/plugin/ipcall/a/b/c$2;
        local2.<init>(this);
        d.post(local2, "IPCallRecorder_startRecord");
        AppMethodBeat.o(21816);
      }
    }
  }

  public final void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(21817);
    ab.i("MicroMsg.IPCallRecorder", "setMute: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.cFy) && (this.nxm != null))
      this.nxm.bs(paramBoolean);
    this.eif = paramBoolean;
    AppMethodBeat.o(21817);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.b.c
 * JD-Core Version:    0.6.2
 */