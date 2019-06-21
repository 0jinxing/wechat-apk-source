package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.c;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.all;
import com.tencent.mm.protocal.protobuf.bgf;
import com.tencent.mm.protocal.protobuf.bgg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

public final class s
{
  public static int a(all paramall)
  {
    AppMethodBeat.i(78887);
    int i = paramall.ret;
    paramall = paramall.wqL;
    ad localad = a(paramall);
    ab.i("MicroMsg.OpenIMContactLogic", "onGYNetEnd openim_processModContact user:%s nick:%s remark:%s, source:%d, sex%d, appId:%s, customDetail:%s, customDetailVisible:%d， type:%d, wordingId:%s", new Object[] { localad.field_username, localad.field_nickname, localad.field_conRemark, Integer.valueOf(localad.getSource()), Integer.valueOf(localad.dtS), localad.field_openImAppid, localad.duw, Integer.valueOf(localad.duv), Integer.valueOf(localad.field_type), localad.field_descWordingId });
    ((j)g.K(j.class)).XM().Y(localad);
    ((b)g.K(b.class)).aZ(paramall.app_id, paramall.wKh);
    b(paramall);
    AppMethodBeat.o(78887);
    return i;
  }

  public static ad a(bgf parambgf)
  {
    AppMethodBeat.i(78888);
    Object localObject1 = ((j)g.K(j.class)).XM().aoO(parambgf.geZ);
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = new ad();
    ((ad)localObject2).setUsername(parambgf.geZ);
    ((ad)localObject2).iB(parambgf.nickname);
    ((ad)localObject2).setType(parambgf.type);
    ((ad)localObject2).iz(parambgf.hHV);
    ((ad)localObject2).setSource(parambgf.cvd);
    ((ad)localObject2).iC(parambgf.wKj);
    ((ad)localObject2).iD(parambgf.wKk);
    ((ad)localObject2).iG(parambgf.wKl);
    ((ad)localObject2).iF(parambgf.wKm);
    if (parambgf.wKn == null)
    {
      localObject1 = "";
      ((ad)localObject2).jf((String)localObject1);
      if (parambgf.wKn != null)
        break label201;
    }
    label201: for (int i = 0; ; i = parambgf.wKn.wKo)
    {
      ((ad)localObject2).hK(i);
      ((ad)localObject2).je(parambgf.vEP);
      ((ad)localObject2).iK(parambgf.app_id);
      ((ad)localObject2).hA(parambgf.dtS);
      ((ad)localObject2).iJ(parambgf.wKh);
      ((ad)localObject2).hH((int)bo.anT());
      AppMethodBeat.o(78888);
      return localObject2;
      localObject1 = parambgf.wKn.naq;
      break;
    }
  }

  public static void b(bgf parambgf)
  {
    int i = 1;
    AppMethodBeat.i(78889);
    String str1 = "";
    String str2 = "";
    h localh = o.act().qo(parambgf.geZ);
    if (localh != null)
    {
      str1 = localh.ack();
      str2 = localh.acl();
    }
    localh = new h();
    localh.bJt = -1;
    localh.username = parambgf.geZ;
    localh.frV = parambgf.wJX;
    localh.frW = parambgf.wJW;
    ab.i("MicroMsg.OpenIMContactLogic", "dealwithAvatarFromModContact contact %s b[%s] s[%s]", new Object[] { localh.getUsername(), localh.ack(), localh.acl() });
    if (!localh.ack().equals(str1))
    {
      o.acd();
      d.E(parambgf.geZ, true);
    }
    for (int j = 1; ; j = 0)
    {
      if (!localh.acl().equals(str2))
      {
        o.acd();
        d.E(parambgf.geZ, false);
        j = i;
      }
      while (true)
      {
        if (j != 0)
        {
          o.acv().pZ(parambgf.geZ);
          o.act().b(localh);
        }
        AppMethodBeat.o(78889);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.s
 * JD-Core Version:    0.6.2
 */