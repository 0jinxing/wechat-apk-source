package com.tencent.mm.plugin.exdevice.model;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.he;
import com.tencent.mm.g.a.he.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.asr;
import com.tencent.mm.protocal.protobuf.ayj;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.protocal.protobuf.bvd;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.protocal.protobuf.cdm;
import com.tencent.mm.protocal.protobuf.cw;
import com.tencent.mm.protocal.protobuf.da;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import java.util.ArrayList;
import java.util.LinkedList;

public final class ab extends com.tencent.mm.sdk.b.c<he>
  implements f
{
  private ProgressDialog ehJ;
  he ltT;

  public ab()
  {
    AppMethodBeat.i(19368);
    this.xxI = he.class.getName().hashCode();
    AppMethodBeat.o(19368);
  }

  private boolean a(he paramhe)
  {
    AppMethodBeat.i(19369);
    if (!(paramhe instanceof he))
    {
      com.tencent.mm.sdk.platformtools.ab.f("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "mismatched event");
      AppMethodBeat.o(19369);
    }
    while (true)
    {
      return false;
      this.ltT = paramhe;
      paramhe = this.ltT.cBW.result;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "action = %s, key = %s", new Object[] { Integer.valueOf(this.ltT.cBW.actionCode), paramhe });
      if (!bo.isNullOrNil(paramhe))
        break;
      AppMethodBeat.o(19369);
    }
    switch (this.ltT.cBW.actionCode)
    {
    default:
    case 15:
    }
    while (true)
    {
      AppMethodBeat.o(19369);
      break;
      if ((this.ltT.cBW.context == null) || (!(this.ltT.cBW.context instanceof Activity)))
      {
        AppMethodBeat.o(19369);
        break;
      }
      aw.Rg().a(540, this);
      final u localu = new u(paramhe);
      aw.Rg().a(localu, 0);
      paramhe = this.ltT.cBW.context;
      this.ltT.cBW.context.getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b(paramhe, this.ltT.cBW.context.getString(2131302753), new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(19367);
          aw.Rg().c(localu);
          if (ab.this.ltT.callback != null)
          {
            ab.this.ltT.cBX.ret = 1;
            ab.this.ltT.callback.run();
          }
          AppMethodBeat.o(19367);
        }
      });
    }
  }

  private void boU()
  {
    AppMethodBeat.i(19371);
    if ((this.ltT != null) && (this.ltT.callback != null))
    {
      this.ltT.cBX.ret = 1;
      this.ltT.callback.run();
    }
    AppMethodBeat.o(19371);
  }

  private void stopScan()
  {
    AppMethodBeat.i(19372);
    if ((this.ltT != null) && (this.ltT.callback != null))
    {
      this.ltT.cBX.ret = 2;
      this.ltT.callback.run();
    }
    AppMethodBeat.o(19372);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(19370);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
      this.ehJ.dismiss();
    if (paramm == null)
    {
      boU();
      AppMethodBeat.o(19370);
    }
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "scene.getType() = %s", new Object[] { Integer.valueOf(paramm.getType()) });
      boU();
      AppMethodBeat.o(19370);
    }
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "scene.getType() = %s", new Object[] { Integer.valueOf(paramm.getType()) });
    bvd localbvd;
    label243: asq localasq;
    asr localasr;
    Object localObject1;
    Object localObject2;
    if (paramm.getType() == 540)
    {
      aw.Rg().b(540, this);
      paramString = (u)paramm;
      if ((paramString.ehh != null) && (paramString.ehh.fsH.fsP != null));
      for (localbvd = (bvd)paramString.ehh.fsH.fsP; ; localbvd = null)
      {
        if (localbvd != null)
          break label243;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "resp == null");
        boU();
        AppMethodBeat.o(19370);
        break;
      }
      localasq = localbvd.vLi;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "deviceId = %s, deviceType = %s", new Object[] { localasq.jBE, localasq.vIk });
      localasr = localbvd.vLj;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "AuthKey = %s, BrandName = %s, CloseStrategy = %s, ConnProto = %s, ConnStrategy = %s, Mac = %s", new Object[] { localasr.vHO, localasr.wwm, Integer.valueOf(localasr.wwp), localasr.wwn, Integer.valueOf(localasr.wwo), localasr.vKF });
      paramm = "";
      paramString = "";
      localObject1 = new LinkedList();
      localObject2 = paramm;
      localObject3 = paramString;
      if (localbvd.wWu == null)
        break label2449;
      if (localbvd.wWu.vFh != null)
        paramm = localbvd.wWu.vFh;
      if (localbvd.wWu.title != null)
        paramString = localbvd.wWu.title;
      localObject2 = paramm;
      localObject3 = paramString;
      if (localbvd.wWu.vFi == null)
        break label2449;
    }
    for (Object localObject3 = localbvd.wWu.vFi; ; localObject3 = localObject1)
    {
      localObject2 = new ArrayList();
      if ((localObject3 != null) && (((LinkedList)localObject3).size() > 0))
        for (paramInt1 = 0; paramInt1 < ((LinkedList)localObject3).size(); paramInt1++)
        {
          localObject1 = (cdm)((LinkedList)localObject3).get(paramInt1);
          if (((cdm)localObject1).type.contains("text"))
            ((ArrayList)localObject2).add(((cdm)localObject1).content);
        }
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "resp.BindTicket = %s", new Object[] { localbvd.vKK });
      boolean bool;
      if (localbvd.wWt == 1)
      {
        localObject3 = new Intent();
        ((Intent)localObject3).putExtra("device_scan_mode", "SCAN_CATALOG");
        if ((localasr.wwn.contains("3")) || (localasr.wwn.contains("1")));
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          bool = localasr.wwn.contains("4");
          if ((paramInt1 == 0) || (!bool))
            break label651;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Category connect proto can not be blue&wifi at the same time...");
          AppMethodBeat.o(19370);
          break;
        }
        label651: if (paramInt1 != 0)
          ((Intent)localObject3).putExtra("device_scan_conn_proto", "blue");
        while (true)
        {
          ((Intent)localObject3).putExtra("device_id", localasq.jBE);
          ((Intent)localObject3).putExtra("device_type", localasq.vIk);
          ((Intent)localObject3).putExtra("device_title", localasr.wwt);
          ((Intent)localObject3).putExtra("device_desc", localasr.wwu);
          ((Intent)localObject3).putExtra("device_icon_url", localasr.IconUrl);
          ((Intent)localObject3).putExtra("device_category_id", localasr.wwv);
          ((Intent)localObject3).putExtra("device_brand_name", localasr.wwm);
          ((Intent)localObject3).putExtra("bind_ticket", localbvd.vKK);
          ((Intent)localObject3).putExtra("device_ble_simple_proto", localasr.dFq);
          ((Intent)localObject3).putExtra("device_airkiss_key", paramm);
          ((Intent)localObject3).putExtra("device_airkiss_title", paramString);
          ((Intent)localObject3).putStringArrayListExtra("device_airkiss_steps", (ArrayList)localObject2);
          com.tencent.mm.bp.d.b(this.ltT.cBW.context, "exdevice", ".ui.ExdeviceBindDeviceGuideUI", (Intent)localObject3);
          stopScan();
          AppMethodBeat.o(19370);
          break;
          if (bool)
            ((Intent)localObject3).putExtra("device_scan_conn_proto", "wifi");
        }
      }
      paramString = localbvd.vKL;
      if (paramString == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "mContact == null");
        boU();
        AppMethodBeat.o(19370);
        break;
      }
      stopScan();
      if (paramString == null)
        com.tencent.mm.sdk.platformtools.ab.f("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "unable to parse mod contact");
      while (true)
      {
        paramm = aa.a(paramString.wcB);
        if ((this.ltT != null) && (this.ltT.cBW != null) && (this.ltT.cBW.context != null))
          break label2066;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "a8KeyRedirectEvent null");
        AppMethodBeat.o(19370);
        break;
        localObject3 = aa.a(paramString.wcB);
        paramm = bo.nullAsNil(paramString.wGl);
        if ((bo.isNullOrNil((String)localObject3)) && (bo.isNullOrNil(paramm)))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "processModContact user is null user:%s enuser:%s", new Object[] { localObject3, paramm });
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "processModContact : %s", new Object[] { localObject3 });
          aw.ZK();
          localObject2 = com.tencent.mm.model.c.XM().aoO((String)localObject3);
          if ((localObject2 != null) && (((String)localObject3).equals(((ap)localObject2).field_encryptUsername)))
          {
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "cat's replace user with stranger");
          }
          else
          {
            localObject1 = new com.tencent.mm.storage.ad((String)localObject3);
            ((com.tencent.mm.storage.ad)localObject1).iy(paramString.guS);
            ((com.tencent.mm.storage.ad)localObject1).setType(paramString.wbu & paramString.wbv);
            label1152: long l;
            if (!bo.isNullOrNil(paramm))
            {
              ((com.tencent.mm.storage.ad)localObject1).iH(paramm);
              if (localObject2 != null)
                break label1685;
              l = 0L;
              label1160: ((com.tencent.mm.storage.ad)localObject1).ewQ = l;
              ((com.tencent.mm.storage.ad)localObject1).iB(aa.a(paramString.wyX));
              ((com.tencent.mm.storage.ad)localObject1).iC(aa.a(paramString.wce));
              ((com.tencent.mm.storage.ad)localObject1).iD(aa.a(paramString.wcf));
              ((com.tencent.mm.storage.ad)localObject1).hA(paramString.guN);
              ((com.tencent.mm.storage.ad)localObject1).hD(paramString.wbA);
              ((com.tencent.mm.storage.ad)localObject1).iA(aa.a(paramString.wGf));
              ((com.tencent.mm.storage.ad)localObject1).hE(paramString.wbE);
              ((com.tencent.mm.storage.ad)localObject1).hF(paramString.guR);
              ((com.tencent.mm.storage.ad)localObject1).iW(RegionCodeDecoder.aC(paramString.guW, paramString.guO, paramString.guP));
              ((com.tencent.mm.storage.ad)localObject1).iQ(paramString.guQ);
              ((com.tencent.mm.storage.ad)localObject1).hw(paramString.wBT);
              ((com.tencent.mm.storage.ad)localObject1).iV(paramString.wBU);
              ((com.tencent.mm.storage.ad)localObject1).setSource(paramString.vFH);
              ((com.tencent.mm.storage.ad)localObject1).hv(paramString.wBX);
              ((com.tencent.mm.storage.ad)localObject1).iE(paramString.wBW);
              if (t.nO(paramString.wBV))
                ((com.tencent.mm.storage.ad)localObject1).iU(paramString.wBV);
              ((com.tencent.mm.storage.ad)localObject1).hH((int)bo.anT());
              ((com.tencent.mm.storage.ad)localObject1).iz(aa.a(paramString.wFK));
              ((com.tencent.mm.storage.ad)localObject1).iF(aa.a(paramString.wFM));
              ((com.tencent.mm.storage.ad)localObject1).iG(aa.a(paramString.wFL));
              ((com.tencent.mm.storage.ad)localObject1).iX(paramString.vEA);
              ((com.tencent.mm.storage.ad)localObject1).iY(paramString.wGv);
              if ((localObject2 != null) && (!bo.nullAsNil(((ap)localObject2).dum).equals(bo.nullAsNil(paramString.wGv))))
              {
                com.tencent.mm.bc.c.aiB();
                com.tencent.mm.bc.c.sY((String)localObject3);
              }
              aw.ZK();
              com.tencent.mm.model.c.XM().aoT((String)localObject3);
              if (!bo.isNullOrNil(((ap)localObject1).field_username))
                break label1697;
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "dkinit dealModContactExtInfo failed invalid contact");
              label1477: ((com.tencent.mm.storage.ad)localObject1).hy(paramString.wGu);
              if ((paramString.wGq != null) && (paramString.wGq.vEU != null))
              {
                ((com.tencent.mm.storage.ad)localObject1).iZ(paramString.wGq.vEU.vLl);
                ((com.tencent.mm.storage.ad)localObject1).ja(paramString.wGq.vEU.vLm);
                ((com.tencent.mm.storage.ad)localObject1).jb(paramString.wGq.vEU.vLn);
              }
              if (t.nI((String)localObject3))
                ((com.tencent.mm.storage.ad)localObject1).NK();
              if (((com.tencent.mm.storage.ad)localObject1).dsf())
                ((com.tencent.mm.storage.ad)localObject1).NN();
              if (bo.isNullOrNil(paramm))
                break label2027;
              aw.ZK();
              com.tencent.mm.model.c.XM().c(paramm, (com.tencent.mm.storage.ad)localObject1);
            }
            while (true)
            {
              if ((localObject2 == null) || ((((ap)localObject2).field_type & 0x800) == (((ap)localObject1).field_type & 0x800)))
                break label2043;
              if ((((ap)localObject1).field_type & 0x800) == 0)
                break label2045;
              aw.ZK();
              com.tencent.mm.model.c.XR().apf(((ap)localObject1).field_username);
              break;
              if ((localObject2 == null) || ((int)((com.tencent.mm.n.a)localObject2).ewQ <= 0))
                break label1152;
              ((com.tencent.mm.storage.ad)localObject1).iH(((ap)localObject2).field_encryptUsername);
              break label1152;
              label1685: l = (int)((com.tencent.mm.n.a)localObject2).ewQ;
              break label1160;
              label1697: Object localObject4 = ((ap)localObject1).field_username;
              Object localObject5 = com.tencent.mm.ah.b.a((String)localObject4, paramString);
              o.act().b((com.tencent.mm.ah.h)localObject5);
              localObject5 = paramString.wBZ;
              if ((!((ap)localObject1).field_username.endsWith("@chatroom")) && (localObject5 != null))
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsFlag modcontact " + ((ccl)localObject5).guY + " " + paramString.wcB);
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsBg modcontact " + ((ccl)localObject5).guZ);
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsBgId modcontact " + ((ccl)localObject5).gva);
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsBgId modcontact " + ((ccl)localObject5).xbQ);
                if (com.tencent.mm.plugin.sns.b.n.qFy != null)
                  com.tencent.mm.plugin.sns.b.n.qFy.a(((ap)localObject1).field_username, (ccl)localObject5);
              }
              localObject5 = r.Yz();
              if ((localObject5 == null) || (((String)localObject5).equals(localObject4)))
                break label1477;
              localObject5 = z.aeR().qP((String)localObject4);
              ((com.tencent.mm.aj.d)localObject5).field_username = ((String)localObject4);
              ((com.tencent.mm.aj.d)localObject5).field_brandList = paramString.guX;
              localObject4 = paramString.wCa;
              if (localObject4 != null)
              {
                ((com.tencent.mm.aj.d)localObject5).field_brandFlag = ((uy)localObject4).gvb;
                ((com.tencent.mm.aj.d)localObject5).field_brandInfo = ((uy)localObject4).gvd;
                ((com.tencent.mm.aj.d)localObject5).field_brandIconURL = ((uy)localObject4).gve;
                ((com.tencent.mm.aj.d)localObject5).field_extInfo = ((uy)localObject4).gvc;
                ((com.tencent.mm.aj.d)localObject5).field_attrSyncVersion = null;
                ((com.tencent.mm.aj.d)localObject5).field_incrementUpdateTime = 0L;
              }
              if (!z.aeR().e((com.tencent.mm.aj.d)localObject5))
                z.aeR().d((com.tencent.mm.aj.d)localObject5);
              ((com.tencent.mm.storage.ad)localObject1).hI(((com.tencent.mm.aj.d)localObject5).field_type);
              break label1477;
              label2027: aw.ZK();
              com.tencent.mm.model.c.XM().Y((com.tencent.mm.storage.ad)localObject1);
            }
            label2043: continue;
            label2045: aw.ZK();
            com.tencent.mm.model.c.XR().apg(((ap)localObject1).field_username);
          }
        }
      }
      label2066: aw.ZK();
      paramString = com.tencent.mm.model.c.XM().aoO(paramm);
      if (paramString != null)
      {
        if (localasr.dFp != 0)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Jump to DeviceProfileUI.");
          localObject3 = this.ltT.cBW.context;
          paramm = new Intent((Context)localObject3, ExdeviceDeviceProfileUI.class);
          if (!(localObject3 instanceof Activity))
            paramm.addFlags(268435456);
          paramm.putExtra("device_id", localasq.jBE);
          paramm.putExtra("device_type", localasq.vIk);
          paramm.putExtra("device_mac", localasr.vKF);
          paramm.putExtra("device_brand_name", localasr.wwm);
          paramm.putExtra("device_alias", localasr.guS);
          paramm.putExtra("device_desc", localasr.wwu);
          paramm.putExtra("device_title", localasr.wwt);
          paramm.putExtra("device_icon_url", localasr.IconUrl);
          paramm.putExtra("device_jump_url", localasr.mZj);
          paramm.putExtra("bind_ticket", localbvd.vKK);
          if (ad.boW().dT(paramString.field_username, localasq.jBE) != null);
          for (bool = true; ; bool = false)
          {
            paramm.putExtra("device_has_bound", bool);
            ((Context)localObject3).startActivity(paramm);
            AppMethodBeat.o(19370);
            break;
          }
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Jump to ContactInfoUI.");
        paramString = new Intent();
        paramString.putExtra("Contact_User", paramm);
        paramString.putExtra("KIsHardDevice", true);
        paramString.putExtra("KHardDeviceBindTicket", localbvd.vKK);
        paramString.putExtra("device_id", localasq.jBE);
        paramString.putExtra("device_type", localasq.vIk);
        com.tencent.mm.plugin.exdevice.a.lqt.c(paramString, this.ltT.cBW.context);
        AppMethodBeat.o(19370);
        break;
      }
      AppMethodBeat.o(19370);
      break;
      label2449: paramm = (m)localObject2;
      paramString = (String)localObject3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ab
 * JD-Core Version:    0.6.2
 */