package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.an;
import com.tencent.mm.g.a.an.a;
import com.tencent.mm.g.a.np;
import com.tencent.mm.g.a.np.a;
import com.tencent.mm.plugin.scanner.e;
import com.tencent.mm.plugin.u.a.b.2;
import com.tencent.mm.plugin.u.a.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public final class o
{
  public c qah;
  public c qai;
  b.a qaj;

  public o()
  {
    AppMethodBeat.i(80883);
    this.qah = new o.1(this);
    this.qai = new o.2(this);
    this.qaj = new o.3(this);
    AppMethodBeat.o(80883);
  }

  public final boolean h(com.tencent.mm.sdk.b.b paramb)
  {
    AppMethodBeat.i(80884);
    if (paramb == null)
    {
      AppMethodBeat.o(80884);
      return false;
    }
    if ((paramb instanceof np))
    {
      m.pZK.reset();
      m.pZK.BU(m.pZJ);
      paramb = (np)paramb;
      e.cgy().pYI.a(paramb.cJU.filePath, this.qaj, paramb.cJU.cJV);
    }
    while (true)
    {
      AppMethodBeat.o(80884);
      break;
      if ((paramb instanceof an))
      {
        m.pZK.bHT();
        Object localObject = (an)paramb;
        paramb = e.cgy().pYI;
        localObject = ((an)localObject).ctC.filePath;
        b.a locala = this.qaj;
        ab.i("MicroMsg.FileScanQueueService", "cancelDecode, fileUri: %s, callback: %x", new Object[] { localObject, Integer.valueOf(locala.hashCode()) });
        if (bo.isNullOrNil((String)localObject))
          ab.e("MicroMsg.FileScanQueueService", "cancel failed, uri is null or nil");
        else
          paramb.iGP.post(new b.2(paramb, (String)localObject, locala));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.o
 * JD-Core Version:    0.6.2
 */