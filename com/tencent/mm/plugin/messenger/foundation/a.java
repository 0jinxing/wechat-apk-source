package com.tencent.mm.plugin.messenger.foundation;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.r;
import com.tencent.mm.plugin.messenger.foundation.a.u;
import com.tencent.mm.protocal.protobuf.ayj;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.protocal.protobuf.cw;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.vl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.vending.b.b;

public final class a
  implements r
{
  private static final a.a opU;

  static
  {
    AppMethodBeat.i(1023);
    opU = new a.a((byte)0);
    AppMethodBeat.o(1023);
  }

  public static b a(c paramc)
  {
    AppMethodBeat.i(1020);
    paramc = opU.aD(paramc);
    AppMethodBeat.o(1020);
    return paramc;
  }

  public static void a(bbv parambbv, String paramString, byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(1022);
    if (parambbv == null)
    {
      ab.f("MicroMsg.ContactSyncExtension", "unable to parse mod contact");
      AppMethodBeat.o(1022);
    }
    String str1;
    String str2;
    Object localObject1;
    while (true)
    {
      return;
      str1 = aa.a(parambbv.wcB);
      str2 = bo.nullAsNil(parambbv.wGl);
      if ((bo.isNullOrNil(str1)) && (bo.isNullOrNil(str2)))
      {
        ab.e("MicroMsg.ContactSyncExtension", "processModContact user is null user:%s enuser:%s", new Object[] { str1, str2 });
        AppMethodBeat.o(1022);
      }
      else
      {
        ab.i("MicroMsg.ContactSyncExtension", "username %s mobileHash %s mobileFullHash %s", new Object[] { parambbv.wcB, parambbv.wGo, parambbv.wGp });
        localObject1 = ((j)g.K(j.class)).XM().aoO(str1);
        if ((localObject1 == null) || (!str1.equals(((ap)localObject1).field_encryptUsername)))
          break;
        ab.w("MicroMsg.ContactSyncExtension", "cat's replace user with stranger  user:%s", new Object[] { str1 });
        AppMethodBeat.o(1022);
      }
    }
    Object localObject2 = null;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject3 = ((ad)localObject1).dsl();
      if (localObject3 == null);
    }
    while (true)
    {
      localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = new ad(str1);
      ((ad)localObject2).setUsername(str1);
      ((ad)localObject2).iy(parambbv.guS);
      ((ad)localObject2).setType(parambbv.wbu & parambbv.wbv);
      if ((paramBoolean1) && (localObject3 != null) && ((int)((com.tencent.mm.n.a)localObject3).ewQ > 0))
      {
        ab.w("MicroMsg.ContactSyncExtension", "processModContact Fuck GETCONTACT can't give the REAL_TYPE (mariohuang), user:%s old:%d get:%d", new Object[] { str1, Integer.valueOf(((ap)localObject3).field_type), Integer.valueOf(((ap)localObject2).field_type) });
        ((ad)localObject2).setType(((ap)localObject2).field_type | ((ap)localObject3).field_type);
      }
      label342: long l;
      label350: boolean bool;
      label656: label875: int i4;
      if (!bo.isNullOrNil(str2))
      {
        ((ad)localObject2).iH(str2);
        if (localObject3 != null)
          break label1239;
        l = 0L;
        ((ad)localObject2).ewQ = l;
        ((ad)localObject2).iB(aa.a(parambbv.wyX));
        ((ad)localObject2).iC(aa.a(parambbv.wce));
        ((ad)localObject2).iD(aa.a(parambbv.wcf));
        ((ad)localObject2).hA(parambbv.guN);
        ((ad)localObject2).hD(parambbv.wbA);
        ((ad)localObject2).iA(aa.a(parambbv.wGf));
        ((ad)localObject2).hE(parambbv.wbE);
        ((ad)localObject2).hF(parambbv.guR);
        ((ad)localObject2).iW(RegionCodeDecoder.aC(parambbv.guW, parambbv.guO, parambbv.guP));
        ((ad)localObject2).iQ(parambbv.guQ);
        ((ad)localObject2).hw(parambbv.wBT);
        ((ad)localObject2).iV(parambbv.wBU);
        ((ad)localObject2).setSource(parambbv.vFH);
        ((ad)localObject2).hv(parambbv.wBX);
        ((ad)localObject2).iE(parambbv.wBW);
        if (com.tencent.mm.model.t.nO(parambbv.wBV))
          ((ad)localObject2).iU(parambbv.wBV);
        if (((ad)localObject2).dsi())
          ((ad)localObject2).hH((int)bo.anT());
        if (!TextUtils.isEmpty(paramString))
          ((ad)localObject2).je(paramString);
        ((ad)localObject2).iz(aa.a(parambbv.wFK));
        ((ad)localObject2).iF(aa.a(parambbv.wFM));
        ((ad)localObject2).iG(aa.a(parambbv.wFL));
        ((ad)localObject2).iI(parambbv.wcD);
        ((ad)localObject2).iX(parambbv.vEA);
        ((ad)localObject2).iY(parambbv.wGv);
        if (bo.cb(paramArrayOfByte))
          break label1251;
        ((j)g.K(j.class)).XM().F(str1, paramArrayOfByte);
        ((ad)localObject2).hy(parambbv.wGu);
        if ((parambbv.wGq != null) && (parambbv.wGq.vEU != null))
        {
          ((ad)localObject2).iZ(parambbv.wGq.vEU.vLl);
          ((ad)localObject2).ja(parambbv.wGq.vEU.vLm);
          ((ad)localObject2).jb(parambbv.wGq.vEU.vLn);
        }
        if (com.tencent.mm.model.t.nI(str1))
          ((ad)localObject2).NK();
        if (((ad)localObject2).dsf())
          ((ad)localObject2).NN();
        ((ad)localObject2).jc(parambbv.duq);
        ((ad)localObject2).hJ(parambbv.wGz);
        int i = (int)((com.tencent.mm.n.a)localObject2).ewQ;
        String str3 = ((ap)localObject2).field_nickname;
        localObject1 = ((ad)localObject2).Hu();
        int j = ((ap)localObject2).field_deleteFlag;
        int k = ((ap)localObject2).field_type;
        int m = parambbv.wbu;
        int n = parambbv.wbv;
        int i1 = ((ap)localObject2).dtX;
        int i2 = ((ap)localObject2).dua;
        String str4 = parambbv.guW;
        String str5 = parambbv.guO;
        String str6 = parambbv.guP;
        int i3 = ((ad)localObject2).getSource();
        String str7 = ((ap)localObject2).field_contactLabelIds;
        if (parambbv.vEA != null)
          break label1292;
        bool = true;
        if (parambbv.vEA != null)
          break label1298;
        i4 = 0;
        label885: if (parambbv.vEA != null)
          break label1310;
        paramString = "";
        label896: ab.i("MicroMsg.ContactSyncExtension", "processModContact:user[%s,%s] id:%d nick:%s pin:%s delflag:%d type:%d [%d,%d] contype:%d notify:%d region[%s,%s,%s] src:%d LabelIDList:%s fromGetContactService:%b remark_Description:(%s,%s,%s)", new Object[] { str1, str2, Integer.valueOf(i), str3, localObject1, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), str4, str5, str6, Integer.valueOf(i3), str7, Boolean.valueOf(paramBoolean1), Boolean.valueOf(bool), Integer.valueOf(i4), paramString });
        opU.a((ad)localObject2, (ad)localObject3, parambbv, paramArrayOfByte, paramBoolean2);
        if (bo.isNullOrNil(str2))
          break label1321;
        ((j)g.K(j.class)).XM().c(str2, (ad)localObject2);
        label1099: opU.b((ad)localObject2, (ad)localObject3, parambbv, paramArrayOfByte, paramBoolean2);
        if ((((ap)localObject2).field_type & 0x800) == 0)
          break label1345;
        if ((localObject3 == null) || ((((ap)localObject3).field_type & 0x800) != (((ap)localObject2).field_type & 0x800)))
          ((j)g.K(j.class)).XR().apf(((ap)localObject2).field_username);
      }
      while (true)
      {
        ab.i("MicroMsg.ContactSyncExtension", "operationModSnsBlackContact username:%s isSnsBlackContact:%s", new Object[] { str1, Boolean.valueOf(((ad)localObject2).Od()) });
        AppMethodBeat.o(1022);
        break;
        if ((localObject3 == null) || ((int)((com.tencent.mm.n.a)localObject3).ewQ <= 0))
          break label342;
        ((ad)localObject2).iH(((ap)localObject3).field_encryptUsername);
        break label342;
        label1239: l = (int)((com.tencent.mm.n.a)localObject3).ewQ;
        break label350;
        label1251: ((j)g.K(j.class)).XM().aoT(str1);
        ab.e("MicroMsg.ContactSyncExtension", "[processModContact] cmdBuf is null! user:%s", new Object[] { str1 });
        break label656;
        label1292: bool = false;
        break label875;
        label1298: i4 = parambbv.vEA.length();
        break label885;
        label1310: paramString = bo.anv(parambbv.vEA);
        break label896;
        label1321: ((j)g.K(j.class)).XM().Y((ad)localObject2);
        break label1099;
        label1345: if ((localObject3 == null) || ((((ap)localObject3).field_type & 0x800) != (((ap)localObject2).field_type & 0x800)))
          ((j)g.K(j.class)).XR().apg(((ap)localObject2).field_username);
      }
      localObject3 = localObject1;
      localObject1 = localObject2;
    }
  }

  public final void a(tb paramtb, byte[] paramArrayOfByte, boolean paramBoolean, com.tencent.mm.plugin.messenger.foundation.a.t paramt)
  {
    AppMethodBeat.i(1021);
    switch (paramtb.wat)
    {
    default:
    case 2:
    case 17:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(1021);
      return;
      paramtb = (bbv)new bbv().parseFrom(paramArrayOfByte);
      if (paramBoolean);
      while (true)
      {
        a(paramtb, "", paramArrayOfByte, false, paramBoolean);
        AppMethodBeat.o(1021);
        break;
        paramArrayOfByte = null;
      }
      paramArrayOfByte = (vl)new vl().parseFrom(paramArrayOfByte);
      paramtb = aa.a(paramArrayOfByte.wcB);
      ab.i("MicroMsg.ContactSyncExtension", "processDelContact user:%s", new Object[] { paramtb });
      ((j)g.K(j.class)).XR().aoX(paramtb);
      com.tencent.mm.model.t.nb(paramtb);
      u.b(4, paramArrayOfByte);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.a
 * JD-Core Version:    0.6.2
 */