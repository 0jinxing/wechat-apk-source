package com.tencent.mm.plugin.freewifi.d;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.plugin.freewifi.g.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.protobuf.aer;
import com.tencent.mm.protocal.protobuf.aes;
import com.tencent.mm.protocal.protobuf.bzt;
import com.tencent.mm.protocal.protobuf.dh;
import com.tencent.mm.protocal.protobuf.gj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class f extends c
{
  private static int mwv = 7200;
  private String mac;
  private String ssid;

  public f(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    AppMethodBeat.i(20785);
    bzd();
    this.ssid = paramString1;
    this.mac = paramString2;
    dh localdh = new dh();
    localdh.mac = paramString2;
    localdh.ssid = paramString1;
    paramString1 = (aer)this.ehh.fsG.fsP;
    paramString1.appId = paramString3;
    paramString1.mwU = paramString4;
    paramString1.mwV = paramString5;
    paramString1.mwW = paramString6;
    paramString1.cvO = paramString7;
    paramString1.sign = paramString8;
    paramString1.wmv = localdh;
    AppMethodBeat.o(20785);
  }

  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    AppMethodBeat.i(20786);
    Object localObject = j.byW().ML(this.ssid);
    paramInt1 = 0;
    paramString = (String)localObject;
    if (localObject == null)
    {
      paramInt1 = 1;
      paramString = new com.tencent.mm.plugin.freewifi.g.c();
      paramString.field_ssidmd5 = ag.ck(this.ssid);
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      aes localaes = (aes)this.ehh.fsH.fsP;
      paramString.field_ssid = this.ssid;
      paramString.field_showUrl = localaes.vAT;
      localObject = localaes.vAU;
      if (localObject != null)
      {
        ab.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "en : %s, cn : %s, tw : %s", new Object[] { ((bzt)localObject).wYO, ((bzt)localObject).wYP, ((bzt)localObject).wYQ });
        paramString.field_showWordCn = ((bzt)localObject).wYP;
        paramString.field_showWordEn = ((bzt)localObject).wYO;
        paramString.field_showWordTw = ((bzt)localObject).wYQ;
        paramString.field_action = localaes.vAS;
        paramString.field_verifyResult = 1;
        paramString.field_connectState = -1;
        if (localaes.vBc <= 0)
          localaes.vBc = mwv;
        paramString.field_expiredTime = (bo.anT() + localaes.vBc);
        paramString.field_mac = this.mac;
        if (paramInt1 == 0)
          break label330;
        ab.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.byW().b(paramString)) });
        label262: j.byW().MM(this.ssid);
        AppMethodBeat.o(20786);
      }
    }
    while (true)
    {
      return;
      paramString.field_showWordCn = ah.getContext().getResources().getString(2131300083);
      paramString.field_showWordEn = ah.getContext().getResources().getString(2131300083);
      paramString.field_showWordTw = ah.getContext().getResources().getString(2131300083);
      break;
      label330: ab.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.byW().c(paramString, new String[0])) });
      break label262;
      ab.e("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "check this ap failed, ssid is :%s", new Object[] { this.ssid });
      if (paramInt1 == 0)
      {
        boolean bool = j.byW().a(paramString, new String[0]);
        ab.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "freewifi verify failed, delte local db infos : %s, ret = %b", new Object[] { this.ssid, Boolean.valueOf(bool) });
      }
      AppMethodBeat.o(20786);
    }
  }

  protected final void bzd()
  {
    AppMethodBeat.i(20784);
    b.a locala = new b.a();
    locala.fsJ = new aer();
    locala.fsK = new aes();
    locala.uri = "/cgi-bin/mmo2o-bin/getbackpagefor33";
    locala.fsI = 1726;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(20784);
  }

  public final gj bzj()
  {
    return ((aes)this.ehh.fsH.fsP).mzh;
  }

  public final int getType()
  {
    return 1726;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.f
 * JD-Core Version:    0.6.2
 */