package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class ai$1$3$1
  implements Runnable
{
  ai$1$3$1(ai.1.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27373);
    this.vcI.vcG.vcF.fFs = false;
    this.vcI.vcG.vcF.pJj.field_createTime = bo.anU();
    this.vcI.vcG.vcF.pJj.field_lastModifyTime = bo.anT();
    this.vcI.vcG.vcF.pJj.field_offset = 0L;
    this.vcI.vcG.vcF.pJj.field_status = 101L;
    boolean bool = am.aUq().a(this.vcI.vcG.vcF.pJj, new String[0]);
    ab.i("MicroMsg.NetSceneUploadAppAttach", "summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", new Object[] { Boolean.valueOf(this.vcI.vcG.vcF.fFs), Boolean.valueOf(bool), Long.valueOf(this.vcI.vcG.vcF.pJj.field_createTime) });
    this.vcI.vcG.vcF.a(this.vcI.vcG.vcF.ftf, this.vcI.vcG.vcF.ehi);
    AppMethodBeat.o(27373);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ai.1.3.1
 * JD-Core Version:    0.6.2
 */