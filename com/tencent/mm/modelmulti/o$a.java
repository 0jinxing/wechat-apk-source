package com.tencent.mm.modelmulti;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.cb;
import com.tencent.mm.protocal.protobuf.bek;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.LinkedList;

final class o$a
{
  int fHZ;
  boolean fJo;
  bek fJp;
  o.b fJq;
  o.c fJr;
  ap fJs;

  private o$a(o paramo, o.c paramc, boolean paramBoolean, bek parambek, o.b paramb)
  {
    AppMethodBeat.i(58400);
    this.fHZ = 0;
    this.fJo = false;
    this.fJp = null;
    this.fJq = null;
    this.fJs = new ap(g.RS().oAl.getLooper(), new o.a.1(this), true);
    this.fJq = paramb;
    this.fJr = paramc;
    this.fJo = paramBoolean;
    this.fJp = parambek;
    this.fHZ = 0;
    boolean bool;
    if ((this.fJq != null) && (this.fJr != null))
    {
      bool = true;
      o.J("", bool);
      if (this.fJp != null)
        break label168;
      o.J("resp Not null", false);
      ab.w("MicroMsg.SyncService", "CmdProcHandler %s NewSyncResponse is null", new Object[] { this.fJr });
      this.fJq.lO(0);
      AppMethodBeat.o(58400);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label168: if ((g.RK()) && (!a.QT()))
      {
        g.RQ();
        if (g.RP() != null)
        {
          g.RQ();
          if (g.RP().Ry() != null)
            break label276;
        }
      }
      paramo = this.fJr;
      paramBoolean = g.RK();
      bool = a.QT();
      g.RQ();
      ab.e("MicroMsg.SyncService", "CmdProcHandler %s accready:%s hold:%s accstg:%s ", new Object[] { paramo, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), g.RP() });
      this.fJq.lO(0);
      AppMethodBeat.o(58400);
      continue;
      label276: o.a(parambek);
      long l1 = parambek.wIz;
      long l2 = l1;
      if (String.valueOf(l1).length() == 10)
        l2 = l1 * 1000L;
      l1 = System.currentTimeMillis();
      long l3 = l1 - l2;
      ab.i("MicroMsg.SyncService", "[oneliang] client time is:%s,server time is:%s,diff time is:%s, diff second time is:%s,just save millisecond diff time", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l3 / 1000L) });
      g.RQ();
      g.RP().Ry().set(ac.a.xRy, Long.valueOf(l3));
      cb.fo(l2);
      g.RQ();
      g.RN().cd(this.fJp.jBT, this.fJp.wIy);
      g.RQ();
      g.RN();
      a.jO(this.fJp.jBT);
      if ((this.fJp.vTR == null) || (this.fJp.vTR.jBw == null) || (this.fJp.vTR.jBw.size() <= 0))
      {
        ab.w("MicroMsg.SyncService", "CmdProcHandler %s cmdlist is null.  synckey may be changed, I have to merge it.", new Object[] { this.fJr });
        o.a(paramBoolean, this.fJp, this.fJr);
        this.fJq.lO(0);
        AppMethodBeat.o(58400);
      }
      else
      {
        ab.i("MicroMsg.SyncService", "CmdProcHandler %s Start docmd:%s respStatus:%s respOnlineVer:%s", new Object[] { this.fJr, Integer.valueOf(this.fJp.vTR.jBw.size()), Integer.valueOf(this.fJp.jBT), Integer.valueOf(this.fJp.wIy) });
        this.fJs.ae(50L, 50L);
        AppMethodBeat.o(58400);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.o.a
 * JD-Core Version:    0.6.2
 */