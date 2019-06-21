package com.tencent.mm.plugin.freewifi.d;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.plugin.freewifi.g.d;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.protobuf.aa;
import com.tencent.mm.protocal.protobuf.acq;
import com.tencent.mm.protocal.protobuf.bns;
import com.tencent.mm.protocal.protobuf.bzt;
import com.tencent.mm.protocal.protobuf.dh;
import com.tencent.mm.protocal.protobuf.gj;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLDecoder;
import java.util.LinkedList;

public final class a extends c
{
  private static int mwv = 7200;
  private int czE;
  private String mac;
  private String ssid;

  public a(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(20773);
    bzd();
    this.czE = 4;
    aa localaa = (aa)this.ehh.fsG.fsP;
    localaa.OpCode = 4;
    localaa.URL = paramString1;
    localaa.vAM = paramInt;
    localaa.vAN = paramString2;
    localaa.vAO = m.byt();
    localaa.vAL = new LinkedList();
    paramString2 = new dh();
    paramString2.ssid = m.Mx("MicroMsg.FreeWifi.NetSceneAPAuth");
    paramString2.mac = m.My("MicroMsg.FreeWifi.NetSceneAPAuth");
    localaa.vAL.add(paramString2);
    localaa.vAP = m.Mz("MicroMsg.FreeWifi.NetSceneAPAuth");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "Constructing get front page request, HasMobile=%d, Ap_info[0].ssid=%s, Ap_info[0].mac=%s", new Object[] { Integer.valueOf(localaa.vAO), paramString2.ssid, paramString2.mac });
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "opCode = %d, url = %s", new Object[] { Integer.valueOf(4), paramString1 });
    AppMethodBeat.o(20773);
  }

  public a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    AppMethodBeat.i(20772);
    bzd();
    this.ssid = paramString3;
    this.mac = paramString2;
    this.czE = 1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new dh();
    ((dh)localObject).ssid = paramString3;
    ((dh)localObject).mac = paramString2;
    ((dh)localObject).vFl = paramInt1;
    localLinkedList.add(localObject);
    localObject = (aa)this.ehh.fsG.fsP;
    ((aa)localObject).OpCode = 1;
    ((aa)localObject).vAL = localLinkedList;
    ((aa)localObject).URL = paramString1;
    ((aa)localObject).vAM = paramInt2;
    ((aa)localObject).vAN = paramString4;
    ((aa)localObject).vAP = m.Mz("MicroMsg.FreeWifi.NetSceneAPAuth");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "opcode = %d, mac = %s, ssid = %s, rssi = %d", new Object[] { Integer.valueOf(1), paramString2, paramString3, Integer.valueOf(paramInt1) });
    AppMethodBeat.o(20772);
  }

  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt, String paramString7)
  {
    AppMethodBeat.i(20771);
    bzd();
    this.ssid = paramString2;
    this.mac = paramString3;
    aa localaa = (aa)this.ehh.fsG.fsP;
    String str = URLDecoder.decode(paramString5);
    localaa.OpCode = 0;
    localaa.URL = paramString1;
    localaa.SSID = paramString2;
    localaa.vAI = paramString4;
    localaa.vAJ = str;
    localaa.vAK = paramString6;
    localaa.vAM = paramInt;
    localaa.vAN = paramString7;
    LinkedList localLinkedList = new LinkedList();
    paramString7 = new dh();
    paramString7.ssid = paramString2;
    paramString7.mac = paramString3;
    localLinkedList.add(paramString7);
    localaa.vAL = localLinkedList;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "url : %s, ssid : %s, mid : %s, mac : %s, apauthdata : %s, decoded apauthdata :%s,  token : %s", new Object[] { paramString1, paramString2, paramString4, paramString3, paramString5, str, paramString6 });
    AppMethodBeat.o(20771);
  }

  public final String Ge()
  {
    Object localObject = (com.tencent.mm.protocal.protobuf.ab)this.ehh.fsH.fsP;
    if (localObject != null);
    for (localObject = ((com.tencent.mm.protocal.protobuf.ab)localObject).vBb; ; localObject = null)
      return localObject;
  }

  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    AppMethodBeat.i(20774);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, opCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(this.czE) });
    switch (this.czE)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(20774);
      boolean bool;
      label113: Object localObject2;
      while (true)
      {
        return;
        if ((paramInt2 != 0) || (paramInt3 != 0))
          break;
        localObject1 = j.byW().ML(this.ssid);
        paramString = this.ssid;
        if (localObject1 == null)
        {
          bool = true;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "get freewifi by ssid :%s, is wifi info = null ? %b", new Object[] { paramString, Boolean.valueOf(bool) });
          paramInt1 = 0;
          paramString = (String)localObject1;
          if (localObject1 == null)
          {
            paramInt1 = 1;
            paramString = new com.tencent.mm.plugin.freewifi.g.c();
            paramString.field_ssidmd5 = ag.ck(this.ssid);
          }
          paramString.field_wifiType = 1;
          localObject1 = (com.tencent.mm.protocal.protobuf.ab)this.ehh.fsH.fsP;
          localObject2 = ((com.tencent.mm.protocal.protobuf.ab)localObject1).vAU;
          if (localObject2 == null)
            break label472;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "en : %s, cn : %s, tw : %s", new Object[] { ((bzt)localObject2).wYO, ((bzt)localObject2).wYP, ((bzt)localObject2).wYQ });
          paramString.field_showWordCn = ((bzt)localObject2).wYP;
          paramString.field_showWordEn = ((bzt)localObject2).wYO;
        }
        for (paramString.field_showWordTw = ((bzt)localObject2).wYQ; ; paramString.field_showWordTw = ah.getContext().getResources().getString(2131300083))
        {
          paramString.field_action = ((com.tencent.mm.protocal.protobuf.ab)localObject1).vAS;
          paramString.field_verifyResult = 1;
          paramString.field_connectState = -1;
          if (((com.tencent.mm.protocal.protobuf.ab)localObject1).vBc <= 0)
            ((com.tencent.mm.protocal.protobuf.ab)localObject1).vBc = mwv;
          paramString.field_expiredTime = (bo.anT() + ((com.tencent.mm.protocal.protobuf.ab)localObject1).vBc);
          paramString.field_showUrl = ((com.tencent.mm.protocal.protobuf.ab)localObject1).vAT;
          paramString.field_action = ((com.tencent.mm.protocal.protobuf.ab)localObject1).vAS;
          paramString.field_ssid = this.ssid;
          paramString.field_mac = this.mac;
          paramString.field_wifiType = 1;
          if (paramInt1 == 0)
            break label526;
          bool = j.byW().b(paramString);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(bool) });
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert local freewifi info : %s, %b, expiredTime : %d, action :%d, showurl : %s", new Object[] { this.ssid, Boolean.valueOf(bool), Integer.valueOf(((com.tencent.mm.protocal.protobuf.ab)localObject1).vAR), Integer.valueOf(((com.tencent.mm.protocal.protobuf.ab)localObject1).vAS), ((com.tencent.mm.protocal.protobuf.ab)localObject1).vAT });
          AppMethodBeat.o(20774);
          break;
          bool = false;
          break label113;
          label472: paramString.field_showWordCn = ah.getContext().getResources().getString(2131300083);
          paramString.field_showWordEn = ah.getContext().getResources().getString(2131300083);
        }
        label526: bool = j.byW().c(paramString, new String[0]);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "update local freewifi info : %s, %b, expiredTime : %d, action :%d, showurl : %s", new Object[] { this.ssid, Boolean.valueOf(bool), Integer.valueOf(((com.tencent.mm.protocal.protobuf.ab)localObject1).vAR), Integer.valueOf(((com.tencent.mm.protocal.protobuf.ab)localObject1).vAS), ((com.tencent.mm.protocal.protobuf.ab)localObject1).vAT });
        AppMethodBeat.o(20774);
      }
      Object localObject1 = j.byW().ML(this.ssid);
      paramInt1 = 0;
      paramString = (String)localObject1;
      if (localObject1 == null)
      {
        paramInt1 = 1;
        paramString = new com.tencent.mm.plugin.freewifi.g.c();
        paramString.field_ssidmd5 = ag.ck(this.ssid);
      }
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        localObject2 = (com.tencent.mm.protocal.protobuf.ab)this.ehh.fsH.fsP;
        paramString.field_ssid = this.ssid;
        paramString.field_showUrl = ((com.tencent.mm.protocal.protobuf.ab)localObject2).vAT;
        localObject1 = ((com.tencent.mm.protocal.protobuf.ab)localObject2).vAU;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "get resp info : %s, expiredTime : %d, action :%d, showurl : %s", new Object[] { this.ssid, Integer.valueOf(((com.tencent.mm.protocal.protobuf.ab)localObject2).vAR), Integer.valueOf(((com.tencent.mm.protocal.protobuf.ab)localObject2).vAS), ((com.tencent.mm.protocal.protobuf.ab)localObject2).vAT });
        if (localObject1 != null)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "en : %s, cn : %s, tw : %s", new Object[] { ((bzt)localObject1).wYO, ((bzt)localObject1).wYP, ((bzt)localObject1).wYQ });
          paramString.field_showWordCn = ((bzt)localObject1).wYP;
          paramString.field_showWordEn = ((bzt)localObject1).wYO;
          paramString.field_showWordTw = ((bzt)localObject1).wYQ;
          label820: paramString.field_action = ((com.tencent.mm.protocal.protobuf.ab)localObject2).vAS;
          paramString.field_verifyResult = 1;
          paramString.field_connectState = -1;
          if (((com.tencent.mm.protocal.protobuf.ab)localObject2).vBc <= 0)
            ((com.tencent.mm.protocal.protobuf.ab)localObject2).vBc = mwv;
          paramString.field_expiredTime = (bo.anT() + ((com.tencent.mm.protocal.protobuf.ab)localObject2).vBc);
          paramString.field_mac = this.mac;
          if (paramInt1 == 0)
            break label985;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.byW().b(paramString)) });
        }
        while (true)
        {
          j.byW().MM(this.ssid);
          AppMethodBeat.o(20774);
          break;
          paramString.field_showWordCn = ah.getContext().getResources().getString(2131300083);
          paramString.field_showWordEn = ah.getContext().getResources().getString(2131300083);
          paramString.field_showWordTw = ah.getContext().getResources().getString(2131300083);
          break label820;
          label985: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.byW().c(paramString, new String[0])) });
        }
      }
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.FreeWifi.NetSceneAPAuth", "check this ap failed, ssid is :%s", new Object[] { this.ssid });
      if (paramInt1 == 0)
      {
        bool = j.byW().a(paramString, new String[0]);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FreeWifi.NetSceneAPAuth", "freewifi verify failed, delte local db infos : %s, ret = %b", new Object[] { this.ssid, Boolean.valueOf(bool) });
      }
    }
  }

  protected final void bzd()
  {
    AppMethodBeat.i(20770);
    b.a locala = new b.a();
    locala.fsJ = new aa();
    locala.fsK = new com.tencent.mm.protocal.protobuf.ab();
    locala.uri = "/cgi-bin/micromsg-bin/apauth";
    locala.fsI = 640;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(20770);
  }

  public final String bze()
  {
    Object localObject = (com.tencent.mm.protocal.protobuf.ab)this.ehh.fsH.fsP;
    if (localObject != null);
    for (localObject = ((com.tencent.mm.protocal.protobuf.ab)localObject).vAQ; ; localObject = null)
      return localObject;
  }

  public final bns bzf()
  {
    Object localObject = (com.tencent.mm.protocal.protobuf.ab)this.ehh.fsH.fsP;
    if (localObject != null);
    for (localObject = ((com.tencent.mm.protocal.protobuf.ab)localObject).vAX; ; localObject = null)
      return localObject;
  }

  public final boolean bzg()
  {
    com.tencent.mm.protocal.protobuf.ab localab = (com.tencent.mm.protocal.protobuf.ab)this.ehh.fsH.fsP;
    boolean bool;
    if ((localab != null) && (localab.vAY != null))
      if (localab.vAY.vAO == 1)
        bool = true;
    while (true)
    {
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }

  public final acq bzh()
  {
    Object localObject = (com.tencent.mm.protocal.protobuf.ab)this.ehh.fsH.fsP;
    if (localObject != null);
    for (localObject = ((com.tencent.mm.protocal.protobuf.ab)localObject).vAY; ; localObject = null)
      return localObject;
  }

  public final String bzi()
  {
    Object localObject = (com.tencent.mm.protocal.protobuf.ab)this.ehh.fsH.fsP;
    if (localObject != null);
    for (localObject = ((com.tencent.mm.protocal.protobuf.ab)localObject).vBa; ; localObject = null)
      return localObject;
  }

  public final gj bzj()
  {
    Object localObject = (com.tencent.mm.protocal.protobuf.ab)this.ehh.fsH.fsP;
    if (localObject != null);
    for (localObject = ((com.tencent.mm.protocal.protobuf.ab)localObject).vAZ; ; localObject = null)
      return localObject;
  }

  public final int getType()
  {
    return 640;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.a
 * JD-Core Version:    0.6.2
 */