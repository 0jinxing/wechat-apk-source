package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.a;

final class z$10
  implements be.a
{
  z$10(z paramz)
  {
  }

  public final void a(ak paramak, be parambe)
  {
    AppMethodBeat.i(11466);
    Object localObject;
    if ((paramak != null) && (!bo.isNullOrNil(paramak.field_username)))
    {
      parambe = paramak.field_username;
      localObject = ((j)g.K(j.class)).XM().aoO(parambe);
      if (localObject == null)
        AppMethodBeat.o(11466);
    }
    while (true)
    {
      return;
      if ((((ad)localObject).dsf()) && (!t.nl(parambe)))
      {
        localObject = z.aeR().qP(parambe);
        if (((d)localObject).xDa == -1L)
        {
          ab.i("MicroMsg.SubCoreBiz", "onMsgChangeNotify: no bizInfo");
          AppMethodBeat.o(11466);
        }
        else if (((d)localObject).adQ())
        {
          if (((d)localObject).cJ(false) == null)
          {
            paramak.jj(null);
            ab.e("MicroMsg.SubCoreBiz", "getExtInfo() == null");
            AppMethodBeat.o(11466);
          }
          else if (((d)localObject).cJ(false).aer() == null)
          {
            paramak.jj(null);
            ab.e("MicroMsg.SubCoreBiz", "enterpriseBizInfo == null");
            AppMethodBeat.o(11466);
          }
          else if (!((d)localObject).adR())
          {
            paramak.jj(bo.nullAsNil(((d)localObject).adX()));
            if (bo.isNullOrNil(((d)localObject).adX()))
            {
              ab.w("MicroMsg.SubCoreBiz", "Enterprise belong is null:%s", new Object[] { paramak.field_username });
              AppMethodBeat.o(11466);
            }
          }
          else
          {
            paramak.jj(null);
            AppMethodBeat.o(11466);
          }
        }
        else if ((((d)localObject).adM()) || (((d)localObject).adP()) || (t.nG(parambe)))
        {
          paramak.jj(null);
          AppMethodBeat.o(11466);
        }
        else
        {
          paramak.jj("officialaccounts");
        }
      }
      else
      {
        AppMethodBeat.o(11466);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.z.10
 * JD-Core Version:    0.6.2
 */