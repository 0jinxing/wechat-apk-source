package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.av;
import com.tencent.mm.model.bp;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.r;
import com.tencent.mm.plugin.messenger.foundation.a.t;
import com.tencent.mm.plugin.messenger.foundation.a.u;
import com.tencent.mm.protocal.protobuf.bcr;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.xe;
import com.tencent.mm.protocal.protobuf.xf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;

public final class g
  implements r
{
  public final void a(tb paramtb, byte[] paramArrayOfByte, boolean paramBoolean, t paramt)
  {
    AppMethodBeat.i(1065);
    switch (paramtb.wat)
    {
    default:
      AppMethodBeat.o(1065);
      return;
    case 1:
    }
    bcr localbcr = (bcr)new bcr().parseFrom(paramArrayOfByte);
    com.tencent.mm.kernel.g.RP().Ry().get(2, null);
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    ab.i("MicroMsg.UserInfoSyncExtension", "processModUserInfo bitFlag:%d status:%d PluginFlag:%d PluginSwitch:%d", new Object[] { Integer.valueOf(localbcr.wGW), Integer.valueOf(localbcr.jBT), Integer.valueOf(localbcr.vCi), Integer.valueOf(localbcr.wHd) });
    Object localObject = aa.a(localbcr.wcB);
    paramt = aa.a(localbcr.wyX);
    String str = aa.a(localbcr.wGX);
    paramArrayOfByte = aa.a(localbcr.wGY);
    int i = localbcr.vCf;
    paramtb = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO((String)localObject);
    if ((paramtb == null) || (paramtb.field_username == null) || (!paramtb.field_username.equals(localObject)))
      paramtb = new ad((String)localObject);
    label1046: label1190: label2091: 
    while (true)
    {
      paramtb.iy(localbcr.guS);
      paramtb.iB(paramt);
      paramtb.iW(RegionCodeDecoder.aC(localbcr.guW, localbcr.guO, localbcr.guP));
      paramtb.hA(localbcr.guN);
      paramtb.iQ(localbcr.guQ);
      paramtb.hv(localbcr.wBX);
      paramtb.iU(localbcr.wBV);
      paramtb.iE(localbcr.wBW);
      paramtb.hB(i);
      ((j)com.tencent.mm.kernel.g.K(j.class)).XM().Y(paramtb);
      localz.set(2, localObject);
      localz.set(4, paramt);
      localz.set(5, str);
      localz.set(6, paramArrayOfByte);
      localz.set(9, Integer.valueOf(i));
      localObject = new StringBuilder("doCmd : status ");
      i = localbcr.jBT;
      paramtb = "code=" + Integer.toHexString(i) + ", status = " + i;
      paramArrayOfByte = paramtb;
      if ((i & 0x1) != 0)
        paramArrayOfByte = paramtb + ", open";
      paramtb = paramArrayOfByte;
      if ((i & 0x2) != 0)
        paramtb = paramArrayOfByte + ", email-verified";
      paramArrayOfByte = paramtb;
      if ((i & 0x4) != 0)
        paramArrayOfByte = paramtb + ", mobile-verified";
      paramtb = paramArrayOfByte;
      if ((i & 0x8) != 0)
        paramtb = paramArrayOfByte + ", hide-qq-search";
      paramArrayOfByte = paramtb;
      if ((i & 0x10) != 0)
        paramArrayOfByte = paramtb + ", hide-qq-promote";
      paramt = paramArrayOfByte;
      if ((i & 0x20) != 0)
        paramt = paramArrayOfByte + ", need-verify";
      paramtb = paramt;
      if ((i & 0x40) != 0)
        paramtb = paramt + ", has-qq-msg";
      paramArrayOfByte = paramtb;
      if ((i & 0x80) != 0)
        paramArrayOfByte = paramtb + ", no-qq-promote";
      paramtb = paramArrayOfByte;
      if ((i & 0x100) != 0)
        paramtb = paramArrayOfByte + ", no-mobile-promote";
      paramArrayOfByte = paramtb;
      if ((i & 0x200) != 0)
        paramArrayOfByte = paramtb + ", hide-mobile_search";
      paramtb = paramArrayOfByte;
      if ((i & 0x1000) != 0)
        paramtb = paramArrayOfByte + ", open-float-bottle";
      paramArrayOfByte = paramtb;
      if ((i & 0x20000) != 0)
        paramArrayOfByte = paramtb + ", bind but not upload";
      ab.d("MicroMsg.UserInfoSyncExtension", paramArrayOfByte);
      localz.set(7, Integer.valueOf(localbcr.jBT));
      if (localbcr.guR != 0)
      {
        paramtb = new bp();
        paramtb.dub = 1;
        paramtb.dtS = localbcr.guN;
        paramtb.signature = localbcr.guQ;
        paramtb.countryCode = localbcr.guW;
        paramtb.fnp = localbcr.guO;
        paramtb.fno = localbcr.guP;
        paramtb.dug = localbcr.wBV;
        ab.d("MicroMsg.UserInfoSyncExtension", " getPersonalCard weibo url : " + paramtb.dug + " nickName :" + localbcr.wBW);
        bp.a(paramtb);
      }
      paramArrayOfByte = new StringBuilder("userinfo Plugstate: ");
      i = localbcr.vCi;
      paramtb = "code=" + Integer.toHexString(i) + ", pluginFlag = " + i;
      if ((i & 0x1) != 0)
      {
        paramtb = paramtb + ", QQMAIL_UNINSTALL";
        label1018: if ((i & 0x2) == 0)
          break label1947;
        paramtb = paramtb + ", PM_UNINSTALL";
        if ((i & 0x4) == 0)
          break label1971;
        paramtb = paramtb + ", FM_UNINSTALL";
        label1074: if ((i & 0x8) == 0)
          break label1995;
        paramtb = paramtb + ", WEIBO_UNINSTALL";
        label1103: if ((i & 0x10) == 0)
          break label2019;
        paramtb = paramtb + ", MEDIANOTE_UNINSTALL";
        label1132: if ((i & 0x20) == 0)
          break label2043;
        paramtb = paramtb + ", QMSG_UNINSTALL";
        if ((i & 0x40) == 0)
          break label2067;
        paramtb = paramtb + ", BOTTLE_UNINSTALL";
        if ((i & 0x80) == 0)
          break label2091;
        paramtb = paramtb + ", QSYNC_UNISTALL";
        label1220: if ((i & 0x100) == 0)
          break label2115;
        paramtb = paramtb + ", SHAKE_UNISTALL";
        label1250: if ((i & 0x200) == 0)
          break label2139;
        paramtb = paramtb + ", LBS_UNISTALL";
        if ((i & 0x400) == 0)
          break label2163;
        paramtb = paramtb + ", BOTTLE_CHART_INSTALL";
        if ((i & 0x1000) == 0)
          break label2187;
        paramtb = paramtb + ",CHECKQQF_UNINSTALL";
        label1340: if ((i & 0x8000) == 0)
          break label2211;
        paramtb = paramtb + ",MM_FEEDSAPP_UNINSTALL";
        label1370: ab.i("MicroMsg.UserInfoSyncExtension", paramtb);
        localz.set(34, Integer.valueOf(localbcr.vCi));
        if (1 != localbcr.wGB.wcX)
          break label2235;
      }
      label1971: label2235: for (paramBoolean = true; ; paramBoolean = false)
      {
        localz.set(8200, Boolean.valueOf(bo.a(Boolean.valueOf(paramBoolean), false)));
        localz.set(8201, Integer.valueOf(bo.a(Integer.valueOf(localbcr.wGB.wcY.wdb), 22)));
        localz.set(8208, Integer.valueOf(bo.a(Integer.valueOf(localbcr.wGB.wcY.wdc), 8)));
        localz.set(66049, Integer.valueOf(localbcr.wBT));
        localz.set(66050, localbcr.wBU);
        localz.set(40, Integer.valueOf(localbcr.wHd));
        av.fly.ak("last_login_use_voice", localbcr.wHd);
        localz.set(41, Integer.valueOf(localbcr.wBX));
        localz.set(43, localbcr.wBW);
        ab.d("MicroMsg.UserInfoSyncExtension", "doCmd PluginSwitch:" + localbcr.wHd + " WeiboFlag:" + localbcr.wBX);
        localz.set(868518889, Integer.valueOf(localbcr.wGO));
        ab.d("MicroMsg.UserInfoSyncExtension", "doCmd USERINFO_TXNEWSCATEGORY:" + localbcr.wGO);
        localz.set(42, localbcr.guS);
        ab.d("MicroMsg.UserInfoSyncExtension", "userid:" + localbcr.wfm + " username:" + localbcr.wfn);
        localz.set(65825, localbcr.wfm);
        localz.set(65826, localbcr.wfn);
        ab.d("MicroMsg.UserInfoSyncExtension", "getiAlbumFlag " + localbcr.guT);
        ab.d("MicroMsg.UserInfoSyncExtension", "getiAlbumStyle " + localbcr.guU);
        ab.d("MicroMsg.UserInfoSyncExtension", "getPcAlbumBGImgID " + localbcr.guV);
        paramtb = bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(65830, null));
        if ((paramtb == null) || (paramtb.length() == 0))
        {
          paramtb = localbcr.wHg;
          if ((paramtb != null) && (paramtb.length() > 0))
            com.tencent.mm.kernel.g.RP().Ry().set(65830, paramtb);
        }
        u.b(1, localbcr);
        break;
        paramtb = paramtb + ", QQMAIL_INSTALL";
        break label1018;
        paramtb = paramtb + ", PM_INSTALL";
        break label1046;
        paramtb = paramtb + ", FM_INSTALL";
        break label1074;
        label1995: paramtb = paramtb + ", WEIBO_INSTALL";
        break label1103;
        label2019: paramtb = paramtb + ", MEDIANOTE_INSTALL";
        break label1132;
        label2043: paramtb = paramtb + ", QMSG_INSTALL";
        break label1161;
        paramtb = paramtb + ", BOTTLE_INSTALL";
        break label1190;
        paramtb = paramtb + ", QSYNC_INSTALL";
        break label1220;
        label2115: paramtb = paramtb + ", SHAKE_INSTALL";
        break label1250;
        label2139: paramtb = paramtb + ", LBS_INSTALL";
        break label1280;
        label2163: paramtb = paramtb + ", BOTTLE_CHART_INSTALL";
        break label1310;
        paramtb = paramtb + ",CHECKQQF_INSTALL";
        break label1340;
        paramtb = paramtb + ",MM_FEEDSAPP_INSTALL";
        break label1370;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.g
 * JD-Core Version:    0.6.2
 */