package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;

final class z$2
  implements e.a
{
  z$2(z paramz)
  {
  }

  public final void a(e.a.b paramb)
  {
    AppMethodBeat.i(11464);
    Object localObject;
    ak localak;
    label410: int i;
    if ((paramb.fwk == e.a.a.fwg) || (paramb.fwk == e.a.a.fwi))
    {
      if (paramb.fwl == null)
        AppMethodBeat.o(11464);
      while (true)
      {
        return;
        localObject = ((j)g.K(j.class)).XM().aoO(paramb.fuO);
        if (localObject == null)
        {
          AppMethodBeat.o(11464);
        }
        else if (!((ad)localObject).dsf())
        {
          z.j(paramb.fwl);
          AppMethodBeat.o(11464);
        }
        else if (t.nl(((ap)localObject).field_username))
        {
          AppMethodBeat.o(11464);
        }
        else
        {
          localak = ((j)g.K(j.class)).XR().aoZ(paramb.fuO);
          ab.v("MicroMsg.SubCoreBiz", "hakon onEvent bizName = %s", new Object[] { paramb.fuO });
          if ((paramb.fwl.adQ()) && (paramb.fwl.cJ(false) != null) && (paramb.fwl.cJ(false).aer() != null) && (!bo.isNullOrNil(paramb.fwl.adX())) && (bo.isNullOrNil(paramb.fwl.field_enterpriseFather)))
          {
            paramb.fwl.field_enterpriseFather = paramb.fwl.adX();
            z.aeR().e(paramb.fwl);
            ab.i("MicroMsg.SubCoreBiz", "hakon bizStgExt, %s set enterpriseFather %s", new Object[] { paramb.fuO, paramb.fwl.field_enterpriseFather });
          }
          if (localak == null)
          {
            AppMethodBeat.o(11464);
          }
          else
          {
            if (!paramb.fwl.adQ())
              break label550;
            if (paramb.fwl.cJ(false) == null)
            {
              ab.e("MicroMsg.SubCoreBiz", "getExtInfo() == null");
              AppMethodBeat.o(11464);
            }
            else
            {
              if (paramb.fwl.cJ(false).aer() != null)
                break;
              ab.e("MicroMsg.SubCoreBiz", "enterpriseBizInfo == null");
              AppMethodBeat.o(11464);
            }
          }
        }
      }
      localObject = localak.field_parentRef;
      if (!paramb.fwl.adR())
      {
        ab.i("MicroMsg.SubCoreBiz", "Enterprise belong %s, userName: %s", new Object[] { paramb.fwl.adX(), paramb.fuO });
        localak.jj(bo.nullAsNil(paramb.fwl.adX()));
        if ((localObject == null) || (localak.field_parentRef == null) || (((String)localObject).equals(localak.field_parentRef)))
          break label516;
        i = 1;
      }
    }
    while (true)
    {
      label435: ab.v("MicroMsg.SubCoreBiz", "hakon isEnterpriseChildType, %s, %s", new Object[] { paramb.fuO, localak.field_parentRef });
      while (true)
      {
        if (i != 0)
        {
          ((j)g.K(j.class)).XR().a(localak, localak.field_username);
          if (bo.isNullOrNil(localak.field_parentRef))
          {
            AppMethodBeat.o(11464);
            break;
            localak.jj(null);
            break label410;
            label516: if ((localObject == null) && (localak.field_parentRef != null))
            {
              i = 1;
              break label435;
            }
            if ((localObject == null) || (localak.field_parentRef != null))
              break label1081;
            i = 1;
            break label435;
            label550: if (paramb.fwl.adP())
            {
              ab.v("MicroMsg.SubCoreBiz", "hakon isEnterpriseFatherType, %s", new Object[] { paramb.fuO });
              i = 1;
              continue;
            }
            if ((!paramb.fwl.adM()) && (!t.nG(((ap)localObject).field_username)) && (!"officialaccounts".equals(localak.field_parentRef)))
            {
              localak.jj("officialaccounts");
              i = 1;
              continue;
            }
            if ((!paramb.fwl.adM()) || (localak.field_parentRef == null))
              break label1075;
            localak.jj(null);
            i = 1;
            continue;
          }
          if ("officialaccounts".equals(localak.field_parentRef))
          {
            localak = ((j)g.K(j.class)).XR().aoZ("officialaccounts");
            paramb = localak;
            if (localak == null)
            {
              paramb = new ak("officialaccounts");
              paramb.dsI();
              ((j)g.K(j.class)).XR().d(paramb);
            }
            if (bo.isNullOrNil(paramb.field_content))
            {
              ab.i("MicroMsg.SubCoreBiz", "conv content is null");
              paramb = ((j)g.K(j.class)).XR().dsR();
              if (bo.isNullOrNil(paramb))
              {
                ab.w("MicroMsg.SubCoreBiz", "last convBiz is null");
                AppMethodBeat.o(11464);
                break;
              }
              paramb = ((j)g.K(j.class)).bOr().Rb(paramb);
              if ((paramb == null) || (paramb.field_msgId == 0L))
              {
                ab.w("MicroMsg.SubCoreBiz", "last biz msg is error");
                AppMethodBeat.o(11464);
                break;
              }
              ((j)g.K(j.class)).bOr().a(paramb.field_msgId, paramb);
            }
            AppMethodBeat.o(11464);
            break;
          }
          ab.i("MicroMsg.SubCoreBiz", "hakon username = %s, parentRef = %s", new Object[] { paramb.fuO, localak.field_parentRef });
          paramb = ((j)g.K(j.class)).XR().aoZ(localak.field_parentRef);
          if (paramb == null)
          {
            AppMethodBeat.o(11464);
            break;
          }
          if (bo.isNullOrNil(paramb.field_content))
          {
            ab.i("MicroMsg.SubCoreBiz", "conv content is null");
            paramb = ((j)g.K(j.class)).XR().apm(localak.field_parentRef);
            if (bo.isNullOrNil(paramb))
            {
              ab.w("MicroMsg.SubCoreBiz", "last enterprise convBiz is null");
              AppMethodBeat.o(11464);
              break;
            }
            paramb = ((j)g.K(j.class)).bOr().Rb(paramb);
            if ((paramb == null) || (paramb.field_msgId == 0L))
            {
              ab.w("MicroMsg.SubCoreBiz", "last enterprise biz msg is error");
              AppMethodBeat.o(11464);
              break;
            }
            ((j)g.K(j.class)).bOr().a(paramb.field_msgId, paramb);
          }
        }
        AppMethodBeat.o(11464);
        break;
        label1075: i = 0;
      }
      label1081: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.z.2
 * JD-Core Version:    0.6.2
 */