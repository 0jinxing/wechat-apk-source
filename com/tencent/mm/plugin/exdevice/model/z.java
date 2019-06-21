package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ajm;
import com.tencent.mm.protocal.protobuf.ajn;
import com.tencent.mm.protocal.protobuf.ajo;
import com.tencent.mm.protocal.protobuf.ajp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class z extends m
  implements k
{
  private f eIc;
  private String ltK;
  b lty;

  public z(LinkedList<ajn> paramLinkedList, String paramString1, String paramString2)
  {
    AppMethodBeat.i(19355);
    this.ltK = "";
    this.lty = null;
    this.eIc = null;
    this.ltK = paramString2;
    paramString2 = new b.a();
    paramString2.fsJ = new ajo();
    paramString2.fsK = new ajp();
    paramString2.uri = "/cgi-bin/micromsg-bin/getharddeviceoperticket";
    paramString2.fsI = 543;
    paramString2.fsL = 0;
    paramString2.fsM = 0;
    this.lty = paramString2.acD();
    paramString2 = (ajo)this.lty.fsG.fsP;
    if (!bo.isNullOrNil(paramString1))
    {
      ajm localajm = new ajm();
      localajm.vKE = paramString1;
      paramString2.wpn = localajm;
    }
    paramString2.wpm = paramLinkedList;
    AppMethodBeat.o(19355);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19356);
    this.eIc = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(19356);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19357);
    ab.i("MicroMsg.exdevice.NetsceneGetHardDeviceOperTicket", "GetHardDeviceOperTicket onGYNetEnd netId = %s, errType = %s, errCode = %s, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19357);
  }

  public final int getType()
  {
    return 543;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.z
 * JD-Core Version:    0.6.2
 */