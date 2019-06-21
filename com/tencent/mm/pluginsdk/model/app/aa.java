package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.c.s;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.protocal.protobuf.aeh;
import com.tencent.mm.protocal.protobuf.aei;
import com.tencent.mm.protocal.protobuf.bfu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class aa extends com.tencent.mm.ai.m
  implements k
{
  private static final String[] vcr = { "wxf109da3e26cf89f1", "wxc56bba830743541e", "wx41dd4f6ef137bd0b" };
  final String appId;
  private com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private final int fOZ;

  public aa(String paramString)
  {
    AppMethodBeat.i(79369);
    this.appId = paramString;
    this.fOZ = 3;
    paramString = new b.a();
    paramString.fsJ = new aeh();
    paramString.fsK = new aei();
    paramString.uri = "/cgi-bin/micromsg-bin/getappinfo";
    paramString.fsI = 231;
    paramString.fsL = 0;
    paramString.fsM = 0;
    this.ehh = paramString.acD();
    AppMethodBeat.o(79369);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(79370);
    this.ehi = paramf;
    int i;
    if ((this.appId == null) || (this.appId.length() == 0))
    {
      ab.e("MicroMsg.NetSceneGetAppInfo", "doScene fail, appId is null");
      i = -1;
      AppMethodBeat.o(79370);
    }
    while (true)
    {
      return i;
      paramf = (aeh)this.ehh.fsG.fsP;
      paramf.mZr = this.appId;
      paramf.weH = this.fOZ;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(79370);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79371);
    ab.d("MicroMsg.NetSceneGetAppInfo", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 4) && (paramInt3 == -1011))
    {
      ab.e("MicroMsg.NetSceneGetAppInfo", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", appinfo does not exist");
      a.bYJ();
      paramq = i.dhF();
      paramq.field_appId = this.appId;
      a.bYJ().a(paramq);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(79371);
    }
    while (true)
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        ab.e("MicroMsg.NetSceneGetAppInfo", "errType = " + paramInt2 + ", errCode = " + paramInt3);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(79371);
      }
      else
      {
        localObject1 = (aei)((com.tencent.mm.ai.b)paramq).fsH.fsP;
        paramArrayOfByte = ((aei)localObject1).wmk.vDo;
        Object localObject2 = ((aei)localObject1).wmk;
        if (localObject2 == null)
        {
          ab.e("MicroMsg.NetSceneGetAppInfo", "convertToAppInfo : openAppInfo is null");
          paramq = null;
        }
        while (true)
        {
          if (paramq != null)
            break label457;
          ab.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : info is null");
          this.ehi.onSceneEnd(3, -1, paramString, this);
          AppMethodBeat.o(79371);
          break;
          paramq = new f();
          paramq.field_appId = ((bfu)localObject2).mZr;
          paramq.field_appName = ((bfu)localObject2).ncH;
          paramq.field_appDiscription = ((bfu)localObject2).wJA;
          paramq.field_appIconUrl = ((bfu)localObject2).vDm;
          paramq.field_appStoreUrl = ((bfu)localObject2).mZJ;
          paramq.field_appVersion = ((bfu)localObject2).vMG;
          paramq.field_appWatermarkUrl = ((bfu)localObject2).wJB;
          paramq.field_packageName = ((bfu)localObject2).vDo;
          paramq.field_signature = p.aiO(((bfu)localObject2).vMD);
          paramq.field_appName_en = ((bfu)localObject2).wJC;
          paramq.field_appName_tw = ((bfu)localObject2).wJE;
          paramq.field_appDiscription_en = ((bfu)localObject2).wJD;
          paramq.field_appDiscription_tw = ((bfu)localObject2).wJF;
          paramq.field_appInfoFlag = ((bfu)localObject2).mZx;
          ab.d("MicroMsg.NetSceneGetAppInfo", "appid = %s, appInfoFlag = %s", new Object[] { paramq.field_appId, Integer.valueOf(paramq.field_appInfoFlag) });
        }
        label457: paramq.field_appType = ((aei)localObject1).vME;
        localObject2 = ((aei)localObject1).wmk;
        localObject1 = ((bfu)localObject2).vDo;
        localObject2 = ((bfu)localObject2).vMD;
        if ((localObject1 == null) || (((String)localObject1).length() == 0) || (localObject2 == null) || (((String)localObject2).length() == 0));
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          if ((paramInt1 != 0) || (paramq.xy()))
          {
            ab.e("MicroMsg.NetSceneGetAppInfo", "no android app, packageName = ".concat(String.valueOf(paramArrayOfByte)));
            com.tencent.mm.pluginsdk.ui.tools.b.ajV(this.appId);
          }
          if (paramq.field_appId != null)
            break label595;
          ab.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : info.appId is null");
          this.ehi.onSceneEnd(3, -1, paramString, this);
          AppMethodBeat.o(79371);
          break;
        }
        label595: if (paramq.field_appId.equals(this.appId))
          break;
        ab.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : appId is different");
        this.ehi.onSceneEnd(3, -1, paramString, this);
        AppMethodBeat.o(79371);
      }
    }
    paramArrayOfByte = a.bYJ();
    Object localObject1 = paramArrayOfByte.aiJ(this.appId);
    if ((localObject1 == null) || (((f)localObject1).field_appId == null) || (((f)localObject1).field_appId.length() == 0))
    {
      if (paramInt1 != 0)
      {
        paramInt1 = 3;
        label686: paramq.field_status = paramInt1;
        paramq.field_modifyTime = System.currentTimeMillis();
        if (paramq.field_appId == null);
      }
      for (paramInt1 = 0; ; paramInt1++)
        if (paramInt1 < vcr.length)
        {
          if (paramq.field_appId.equals(vcr[paramInt1]))
            paramq.field_status = -1;
        }
        else
        {
          if (paramArrayOfByte.n(paramq))
            break label791;
          ab.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : insert fail");
          this.ehi.onSceneEnd(3, -1, paramString, this);
          AppMethodBeat.o(79371);
          break;
          paramInt1 = 4;
          break label686;
        }
      label791: a.bYH().dW(this.appId, 1);
      a.bYH().dW(this.appId, 2);
      a.bYH().dW(this.appId, 3);
      a.bYH().dW(this.appId, 4);
      a.bYH().dW(this.appId, 5);
    }
    label922: label938: label1456: 
    while (true)
    {
      if (bo.isNullOrNil(paramq.field_openId))
      {
        ab.d("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd, openId is null, trigger getAppSetting, appId = " + paramq.field_appId);
        a.bYL().wy(paramq.field_appId);
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(79371);
      break;
      if (paramInt1 != 0)
      {
        paramInt1 = 3;
        paramq.field_status = paramInt1;
        if (paramq.field_appId != null)
        {
          paramInt1 = 0;
          if (paramInt1 < vcr.length)
          {
            if (!paramq.field_appId.equals(vcr[paramInt1]))
              break label1034;
            paramq.field_status = -1;
          }
        }
        if (localObject1 != null)
          break label1040;
        ab.e("MicroMsg.NetSceneGetAppInfo", "merge failed, some appinfo is null");
      }
      while (true)
      {
        if (paramArrayOfByte.a(paramq, new String[0]))
          break label1266;
        ab.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : update fail");
        this.ehi.onSceneEnd(3, -1, paramString, this);
        AppMethodBeat.o(79371);
        break;
        paramInt1 = ((f)localObject1).field_status;
        break label922;
        paramInt1++;
        break label938;
        if (((f)localObject1).dhx())
        {
          if (!bo.isNullOrNil(((f)localObject1).field_appIconUrl))
            paramq.field_appIconUrl = ((f)localObject1).field_appIconUrl;
          if (!bo.isNullOrNil(((f)localObject1).field_appName))
            paramq.field_appName = ((f)localObject1).field_appName;
          if (!bo.isNullOrNil(((f)localObject1).field_appName_en))
            paramq.field_appName_en = ((f)localObject1).field_appName_en;
          if (!bo.isNullOrNil(((f)localObject1).field_appName_tw))
            paramq.field_appName_tw = ((f)localObject1).field_appName_tw;
          if (!bo.isNullOrNil(((f)localObject1).field_appName_hk))
            paramq.field_appName_hk = ((f)localObject1).field_appName_hk;
        }
        if ((bo.isNullOrNil(paramq.field_appId)) || (bo.isNullOrNil(((f)localObject1).field_appId)))
        {
          ab.e("MicroMsg.NetSceneGetAppInfo", "merge failed, some appid is null");
        }
        else if (!paramq.field_appId.equalsIgnoreCase(((f)localObject1).field_appId))
        {
          ab.e("MicroMsg.NetSceneGetAppInfo", "merge failed, appis is different");
        }
        else
        {
          paramq.field_openId = ((f)localObject1).field_openId;
          paramq.field_authFlag = ((f)localObject1).field_authFlag;
          paramq.jdMethod_if(((s)localObject1).dmY);
          paramq.ig(((s)localObject1).dmZ);
          paramq.ih(((s)localObject1).dna);
        }
      }
      label1266: if ((localObject1 == null) || (((f)localObject1).field_appIconUrl == null) || (((f)localObject1).field_appIconUrl.length() == 0))
        paramInt1 = 1;
      while (true)
      {
        if (paramInt1 == 0)
          break label1456;
        a.bYH().dW(this.appId, 1);
        a.bYH().dW(this.appId, 2);
        a.bYH().dW(this.appId, 3);
        a.bYH().dW(this.appId, 4);
        a.bYH().dW(this.appId, 5);
        break;
        if ((!bo.isNullOrNil(paramq.dns)) && (bo.isNullOrNil(((s)localObject1).dns)))
          paramInt1 = 1;
        else if ((!bo.isNullOrNil(paramq.dnt)) && (bo.isNullOrNil(((s)localObject1).dnt)))
          paramInt1 = 1;
        else if ((paramq.field_appIconUrl == null) || (paramq.field_appIconUrl.length() == 0))
          paramInt1 = 0;
        else if (!((f)localObject1).field_appIconUrl.equals(paramq.field_appIconUrl))
          paramInt1 = 1;
        else
          paramInt1 = 0;
      }
    }
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 231;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.aa
 * JD-Core Version:    0.6.2
 */