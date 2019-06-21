package com.tencent.mm.plugin.ipcall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.is;
import com.tencent.mm.g.a.is.a;
import com.tencent.mm.protocal.protobuf.bmc;
import com.tencent.mm.protocal.protobuf.bml;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

public final class h extends c<is>
{
  public h.a nvS;

  public h()
  {
    AppMethodBeat.i(21760);
    this.xxI = is.class.getName().hashCode();
    AppMethodBeat.o(21760);
  }

  private boolean a(is paramis)
  {
    AppMethodBeat.i(21761);
    if ((paramis instanceof is))
    {
      Object localObject = paramis.cDS.cDT;
      if ((localObject == null) || (localObject.length <= 0))
      {
        AppMethodBeat.o(21761);
        return false;
      }
      if (localObject[0] == 101)
      {
        paramis = new byte[localObject.length - 1];
        System.arraycopy(localObject, 1, paramis, 0, paramis.length);
        try
        {
          localObject = new com/tencent/mm/protocal/protobuf/bmc;
          ((bmc)localObject).<init>();
          paramis = (bmc)((bmc)localObject).parseFrom(paramis);
          ab.d("MicroMsg.IPCallSvrNotifyListener", "roomId: %d, roomKey: %d, DtmfPayloadType: %d", new Object[] { Integer.valueOf(paramis.wem), Long.valueOf(paramis.wen), Integer.valueOf(paramis.nwP) });
          localObject = paramis.wPh;
          if (localObject != null)
          {
            localObject = ((LinkedList)localObject).iterator();
            while (((Iterator)localObject).hasNext())
            {
              bml localbml = (bml)((Iterator)localObject).next();
              ab.d("MicroMsg.IPCallSvrNotifyListener", "userstatus: %d, userstatusKey: %d, memberId: %d", new Object[] { Integer.valueOf(localbml.wPr), Integer.valueOf(localbml.wPs), Integer.valueOf(localbml.wPq) });
            }
          }
        }
        catch (Exception paramis)
        {
          ab.e("MicroMsg.IPCallSvrNotifyListener", "parse PstnNotify error: %s", new Object[] { paramis.getMessage() });
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(21761);
      break;
      if (this.nvS != null)
        this.nvS.a(paramis);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.h
 * JD-Core Version:    0.6.2
 */