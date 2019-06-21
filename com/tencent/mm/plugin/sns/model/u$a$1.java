package com.tencent.mm.plugin.sns.model;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cbx;
import com.tencent.mm.protocal.protobuf.cby;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.LinkedList;

final class u$a$1 extends ak
{
  u$a$1(u.a parama)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(36303);
    g.RQ();
    if (!g.RN().QY())
      AppMethodBeat.o(36303);
    while (true)
    {
      return;
      if ((this.qJK.mgm == null) || (this.qJK.mgm.isEmpty()))
      {
        u localu = this.qJK.qJH;
        paramMessage = (cby)localu.ehh.fsH.fsP;
        cbx localcbx = (cbx)localu.ehh.fsG.fsP;
        byte[] arrayOfByte = paramMessage.vTO.getBuffer().toByteArray();
        arrayOfByte = aa.j(localcbx.vTO.getBuffer().toByteArray(), arrayOfByte);
        if ((arrayOfByte != null) && (arrayOfByte.length > 0))
        {
          g.RQ();
          g.RP().Ry().set(8195, bo.cd(arrayOfByte));
        }
        localcbx.vTO.setBuffer(arrayOfByte);
        if ((paramMessage.vQe & localcbx.vTN) == 0)
        {
          localu.ehi.onSceneEnd(0, 0, "", localu);
          AppMethodBeat.o(36303);
        }
        else
        {
          localu.a(localu.ftf, localu.ehi);
          AppMethodBeat.o(36303);
        }
      }
      else
      {
        paramMessage = (tb)this.qJK.mgm.getFirst();
        ab.d("MicroMsg.NetSceneNewSyncAlbum", "cmdId = " + paramMessage.wat);
        this.qJK.mgm.removeFirst();
        switch (paramMessage.wat)
        {
        default:
          this.qJK.mgn.sendEmptyMessage(0);
          AppMethodBeat.o(36303);
          break;
        case 45:
          af.cno().post(new u.a.1.1(this, paramMessage));
          AppMethodBeat.o(36303);
          break;
        case 46:
          af.cno().post(new u.a.1.2(this, paramMessage));
          AppMethodBeat.o(36303);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.u.a.1
 * JD-Core Version:    0.6.2
 */