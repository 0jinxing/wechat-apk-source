package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class g$1$1$1
  implements Runnable
{
  g$1$1$1(g.1.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50693);
    g.m(this.fVO.fVN.fVM);
    g.g(this.fVO.fVN.fVM).status = 104;
    g.g(this.fVO.fVN.fVM).createTime = bo.anT();
    g.g(this.fVO.fVN.fVM).fXb = bo.anT();
    g.g(this.fVO.fVN.fVM).fVG = 0;
    g.g(this.fVO.fVN.fVM).bJt = 1800;
    boolean bool = u.f(g.g(this.fVO.fVN.fVM));
    ab.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", new Object[] { g.a(this.fVO.fVN.fVM), Boolean.valueOf(g.h(this.fVO.fVN.fVM)), Boolean.valueOf(bool), Long.valueOf(g.g(this.fVO.fVN.fVM).createTime) });
    this.fVO.fVN.fVM.a(g.n(this.fVO.fVN.fVM), g.f(this.fVO.fVN.fVM));
    AppMethodBeat.o(50693);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.g.1.1.1
 * JD-Core Version:    0.6.2
 */