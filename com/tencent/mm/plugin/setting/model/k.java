package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bbx;
import com.tencent.mm.protocal.protobuf.xe;
import com.tencent.mm.protocal.protobuf.xf;

public final class k extends j.b
{
  private bbx qjJ;

  public k()
  {
    this(false, 22, 8);
  }

  public k(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    super(31);
    AppMethodBeat.i(126861);
    this.qjJ = new bbx();
    xe localxe = new xe();
    if (paramBoolean);
    for (int j = 1; ; j = 0)
    {
      localxe.wcX = j;
      j = i;
      if (paramBoolean)
        j = 0;
      localxe.wcZ = j;
      xf localxf = new xf();
      localxf.wdb = paramInt1;
      localxf.wdc = paramInt2;
      localxe.wcY = localxf;
      localxf.wdb = 0;
      localxf.wdc = 0;
      localxe.wda = localxf;
      this.qjJ.wGB = localxe;
      this.oqT = this.qjJ;
      AppMethodBeat.o(126861);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.k
 * JD-Core Version:    0.6.2
 */