package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.LinkedList;

public final class z
{
  ArrayList<aa> puX;
  ab puY;
  y puZ;
  boolean pva;
  ab.f pvb;
  ab.e pvc;

  public z()
  {
    AppMethodBeat.i(68033);
    this.puX = new ArrayList();
    this.puY = ac.ccD();
    this.puZ = null;
    this.pva = false;
    this.pvb = new z.1(this);
    this.pvc = new z.2(this);
    AppMethodBeat.o(68033);
  }

  public final void a(aa paramaa)
  {
    AppMethodBeat.i(68034);
    if (!g.RN().QY())
    {
      AppMethodBeat.o(68034);
      return;
    }
    if (this.puZ == null)
      this.puZ = new y();
    y localy = this.puZ;
    String str = paramaa.ptN;
    if (bo.isNullOrNil(str))
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ShareMailInfoMgr", "add info fail, info is null");
    while (true)
    {
      this.puX.add(paramaa);
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ShareMailQueue", "add a new job, queue.size: %d", new Object[] { Integer.valueOf(this.puX.size()) });
      if (!this.pva)
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ShareMailQueue", "start execute");
        if (this.puX.size() > 0)
        {
          this.pva = true;
          b((aa)this.puX.remove(0));
          this.puY.a(this.pvb, this.pvc);
        }
      }
      AppMethodBeat.o(68034);
      break;
      w localw = new w();
      localw.ptN = str;
      localy.puW.oof.add(localw);
      localy.save();
    }
  }

  final void b(aa paramaa)
  {
    AppMethodBeat.i(68035);
    this.puY.clearData();
    this.puY.cEV = paramaa.cEV;
    this.puY.ptN = paramaa.ptN;
    this.puY.pur = paramaa.pur;
    this.puY.pus = paramaa.pus;
    this.puY.pve = paramaa.pve;
    this.puY.X(paramaa.pvf);
    this.puY.Y(paramaa.pvg);
    this.puY.Z(paramaa.pvh);
    AppMethodBeat.o(68035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.z
 * JD-Core Version:    0.6.2
 */