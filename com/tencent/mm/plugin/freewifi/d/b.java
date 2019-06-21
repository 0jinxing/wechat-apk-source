package com.tencent.mm.plugin.freewifi.d;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.plugin.freewifi.g.d;
import com.tencent.mm.plugin.freewifi.h;
import com.tencent.mm.plugin.freewifi.h.b;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.protobuf.ac;
import com.tencent.mm.protocal.protobuf.ad;
import com.tencent.mm.protocal.protobuf.bzt;
import com.tencent.mm.protocal.protobuf.dh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class b extends c
{
  private static int mwv = 7200;
  public String mac;
  private String ssid;

  public b(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(20776);
    bzd();
    this.ssid = paramString2;
    this.mac = paramString1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new dh();
    ((dh)localObject).ssid = paramString2;
    ((dh)localObject).mac = paramString1;
    ((dh)localObject).vFl = paramInt1;
    localLinkedList.add(localObject);
    localObject = (ac)this.ehh.fsG.fsP;
    ((ac)localObject).vBd = h.b.bym().byg();
    ((ac)localObject).vAL = localLinkedList;
    ((ac)localObject).vBe = m.byv();
    ((ac)localObject).vBf = paramInt2;
    ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "new apcheck request. mac = %s, ssid = %s, rssi = %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1) });
    AppMethodBeat.o(20776);
  }

  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    AppMethodBeat.i(20777);
    ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "apcheck returns. onGYNetEnd : errType : %d, errCode : %d, errMsg : %s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    boolean bool;
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null))
    {
      h.b.bym().a((ad)this.ehh.fsH.fsP);
      if ((m.eg(paramInt2, paramInt3)) || (m.eh(paramInt2, paramInt3)))
      {
        paramString = (ad)this.ehh.fsH.fsP;
        paramInt1 = paramString.vBi;
        bool = paramString.vBh;
        if ((paramInt1 != 0) && (paramInt1 != i.a.byn().getInt("LOCAL_CONFIG_APCHECK_DELAY_CRD_EXPIRED_DAYS", 7)))
          i.a.byn().ch("LOCAL_CONFIG_APCHECK_DELAY_CRD_EXPIRED_DAYS", paramInt1);
        if (bool)
          i.a.byn().F("LOCAL_CONFIG_LAST_APCHECK_SAVE_DELAY_CRD_TIMEMILLIS", System.currentTimeMillis());
      }
    }
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
      ad localad = (ad)this.ehh.fsH.fsP;
      paramString.field_ssid = this.ssid;
      paramString.field_showUrl = localad.vAT;
      localObject = localad.vAU;
      if (localObject != null)
      {
        ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "en : %s, cn : %s, tw : %s", new Object[] { ((bzt)localObject).wYO, ((bzt)localObject).wYP, ((bzt)localObject).wYQ });
        paramString.field_showWordCn = ((bzt)localObject).wYP;
        paramString.field_showWordEn = ((bzt)localObject).wYO;
        paramString.field_showWordTw = ((bzt)localObject).wYQ;
        paramString.field_action = localad.vAS;
        paramString.field_verifyResult = 1;
        paramString.field_connectState = -1;
        if (localad.vBc <= 0)
          localad.vBc = mwv;
        paramString.field_expiredTime = (bo.anT() + localad.vBc);
        paramString.field_mac = this.mac;
        if (paramInt1 == 0)
          break label490;
        ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.byW().b(paramString)) });
        label419: j.byW().MM(this.ssid);
        AppMethodBeat.o(20777);
      }
    }
    while (true)
    {
      return;
      paramString.field_showWordCn = ah.getContext().getResources().getString(2131300083);
      paramString.field_showWordEn = ah.getContext().getResources().getString(2131300083);
      paramString.field_showWordTw = ah.getContext().getResources().getString(2131300083);
      break;
      label490: ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.byW().c(paramString, new String[0])) });
      break label419;
      ab.e("MicroMsg.FreeWifi.NetSceneAPAuth", "check this ap failed, ssid is :%s", new Object[] { this.ssid });
      if (paramInt1 == 0)
      {
        bool = j.byW().a(paramString, new String[0]);
        ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "freewifi verify failed, delte local db infos : %s, ret = %b", new Object[] { this.ssid, Boolean.valueOf(bool) });
      }
      AppMethodBeat.o(20777);
    }
  }

  protected final void bzd()
  {
    AppMethodBeat.i(20775);
    b.a locala = new b.a();
    locala.fsJ = new ac();
    locala.fsK = new ad();
    locala.uri = "/cgi-bin/mmo2o-bin/apcheck";
    locala.fsI = 1744;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(20775);
  }

  public final int getType()
  {
    return 1744;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.b
 * JD-Core Version:    0.6.2
 */