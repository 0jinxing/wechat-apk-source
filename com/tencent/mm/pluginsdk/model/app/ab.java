package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.g.c.s;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.protocal.protobuf.aef;
import com.tencent.mm.protocal.protobuf.aeg;
import com.tencent.mm.protocal.protobuf.jx;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ab extends x
{
  private static final String[] vcr = { "wxf109da3e26cf89f1", "wxc56bba830743541e", "wx41dd4f6ef137bd0b" };

  public ab(List<String> paramList)
  {
    AppMethodBeat.i(79372);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aef();
    ((b.a)localObject).fsK = new aeg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getappinfolist";
    ((b.a)localObject).fsI = 451;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (aef)this.lty.fsG.fsP;
    LinkedList localLinkedList = new LinkedList();
    if (paramList != null)
    {
      String[] arrayOfString = new String[paramList.size()];
      paramList.toArray(arrayOfString);
      int j = arrayOfString.length;
      while (i < j)
      {
        paramList = arrayOfString[i];
        if (!bo.isNullOrNil(paramList))
          localLinkedList.add(aa.vy(paramList));
        i++;
      }
    }
    ((aef)localObject).wmi = localLinkedList;
    ((aef)localObject).jBv = localLinkedList.size();
    AppMethodBeat.o(79372);
  }

  private static void a(f paramf, jx paramjx)
  {
    int i = 0;
    AppMethodBeat.i(79374);
    if (paramf == null)
    {
      paramf = new f();
      paramf.field_appId = paramjx.fKh;
    }
    for (int j = 1; ; j = 0)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGetAppInfoList", "appid:[%s], appinfoflag:[%d] AppSupportContentType:%d", new Object[] { paramjx.fKh, Integer.valueOf(paramjx.mZx), Long.valueOf(paramjx.vML) });
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGetAppInfoList", "appId=%s, appName=%s, status=%s, appInfoFlag=%s", new Object[] { paramf.field_appId, paramf.field_appName, Integer.valueOf(paramf.field_status), Integer.valueOf(paramf.field_appInfoFlag) });
      if ((!paramf.dhx()) || (bo.isNullOrNil(paramf.field_appName)))
        paramf.field_appName = paramjx.Name;
      if ((!paramf.dhx()) || (bo.isNullOrNil(paramf.field_appName_en)))
        paramf.field_appName_en = paramjx.vMv;
      if ((!paramf.dhx()) || (bo.isNullOrNil(paramf.field_appName_tw)))
        paramf.field_appName_tw = paramjx.vMx;
      paramf.field_appDiscription = paramjx.vEA;
      paramf.field_appDiscription_en = paramjx.vMw;
      paramf.field_appDiscription_tw = paramjx.vMy;
      paramf.field_appWatermarkUrl = paramjx.vMC;
      paramf.field_packageName = paramjx.vDo;
      paramf.field_signature = p.aiO(paramjx.vMD);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGetAppInfoList", "get signature, server sig : %s, gen sig: %s ", new Object[] { paramjx.vMD, paramf.field_signature });
      paramf.field_appType = paramjx.vME;
      if ((!bo.isNullOrNil(paramf.field_appType)) && ((paramf.field_appType.startsWith("1")) || (paramf.field_appType.startsWith("6"))))
        paramf.field_appType = ("," + paramf.field_appType);
      paramf.field_appInfoFlag = paramjx.mZx;
      paramf.field_appVersion = paramjx.vMG;
      paramf.ig(paramjx.vMF);
      paramf.field_appWatermarkUrl = paramjx.vMC;
      if ((!bo.isNullOrNil(paramjx.vMJ)) && (!bo.isNullOrNil(paramjx.vMK)))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGetAppInfoList", "get app download url and download md5 : [%s], [%s], [%s]", new Object[] { paramf.field_appName, paramjx.vMJ, paramjx.vMK });
        paramf.ih(paramjx.vMJ);
        paramf.ik(paramjx.vMK);
      }
      paramf.il(paramjx.vDp);
      paramf.field_svrAppSupportContentType = paramjx.vML;
      if (paramjx.vMH > paramf.dnb)
      {
        paramf.dnc = 1;
        paramf.dmv = true;
      }
      paramf.dnb = paramjx.vMH;
      paramf.dmv = true;
      Object localObject = paramjx.vDo;
      String str = paramjx.vDo;
      int k;
      if ((localObject == null) || (((String)localObject).length() == 0) || (str == null) || (str.length() == 0))
      {
        k = 1;
        if (k != 0)
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetAppInfoList", "no android app, packageName = " + paramjx.vDo + "appid: " + paramf.field_appId);
        if (paramf.xy())
          com.tencent.mm.pluginsdk.ui.tools.b.ajV(paramf.field_appId);
        localObject = a.bYJ();
        if (j == 0)
          break label755;
        if (k == 0)
          break label681;
        j = 3;
        label595: paramf.field_status = j;
        paramf.field_modifyTime = System.currentTimeMillis();
        paramf.field_appIconUrl = paramjx.vMA;
        if (paramf.field_appId != null)
        {
          j = i;
          label624: if (j < vcr.length)
          {
            if (!paramf.field_appId.equals(vcr[j]))
              break label686;
            paramf.field_status = -1;
          }
        }
        if (((i)localObject).n(paramf))
          break label692;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetAppInfoList", "onGYNetEnd : insert fail");
        AppMethodBeat.o(79374);
      }
      while (true)
      {
        return;
        k = 0;
        break;
        label681: j = 4;
        break label595;
        label686: j++;
        break label624;
        label692: a.bYH().dW(paramf.field_appId, 1);
        a.bYH().dW(paramf.field_appId, 2);
        a.bYH().dW(paramf.field_appId, 3);
        a.bYH().dW(paramf.field_appId, 4);
        a.bYH().dW(paramf.field_appId, 5);
        AppMethodBeat.o(79374);
      }
      label755: label762: boolean bool;
      if (k != 0)
      {
        j = 3;
        paramf.field_status = j;
        if (paramf.field_appId != null)
        {
          j = 0;
          label776: if (j < vcr.length)
          {
            if (!paramf.field_appId.equals(vcr[j]))
              break label984;
            paramf.field_status = -1;
          }
        }
        if ((paramf != null) && (paramf.field_appIconUrl != null) && (paramf.field_appIconUrl.length() != 0))
          break label990;
        j = 1;
        label827: if (j == 0)
          break label1040;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGetAppInfoList", "oldIcon = %s, newIcon = %s", new Object[] { paramf.field_appIconUrl, paramjx.vMA });
        paramf.field_appIconUrl = paramjx.vMA;
        bool = ((i)localObject).a(paramf, new String[0]);
        a.bYH().dW(paramf.field_appId, 1);
        a.bYH().dW(paramf.field_appId, 2);
        a.bYH().dW(paramf.field_appId, 3);
        a.bYH().dW(paramf.field_appId, 4);
        a.bYH().dW(paramf.field_appId, 5);
      }
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGetAppInfoList", "update appinfo " + bool + ", appid = " + paramjx.fKh);
        AppMethodBeat.o(79374);
        break;
        j = paramf.field_status;
        break label762;
        label984: j++;
        break label776;
        label990: if ((paramjx == null) || (paramjx.vMI == null) || (paramjx.vMI.length() == 0))
        {
          j = 0;
          break label827;
        }
        if (!paramf.field_appIconUrl.equals(paramjx.vMA))
        {
          j = 1;
          break label827;
        }
        j = 0;
        break label827;
        label1040: bool = ((i)localObject).a(paramf, new String[0]);
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79373);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneGetAppInfoList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetAppInfoList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      AppMethodBeat.o(79373);
    }
    while (true)
    {
      return;
      paramString = ((aeg)this.lty.fsH.fsP).wmj;
      if ((paramString != null) && (!paramString.isEmpty()))
      {
        paramString = paramString.iterator();
        while (paramString.hasNext())
        {
          paramq = (jx)paramString.next();
          if (paramq != null)
            a(g.bT(paramq.fKh, false), paramq);
        }
      }
      AppMethodBeat.o(79373);
    }
  }

  public final void bG(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79376);
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetAppInfoList", "buf is null");
      AppMethodBeat.o(79376);
    }
    while (true)
    {
      return;
      try
      {
        this.lty.fsH.P(paramArrayOfByte);
        AppMethodBeat.o(79376);
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetAppInfoList", "parse error: " + paramArrayOfByte.getMessage());
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.NetSceneGetAppInfoList", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(79376);
      }
    }
  }

  public final byte[] dhj()
  {
    AppMethodBeat.i(79375);
    try
    {
      byte[] arrayOfByte = ((b.b)this.lty.acF()).ZT();
      AppMethodBeat.o(79375);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetAppInfoList", "toProtBuf failed: " + localException.getMessage());
        Object localObject = null;
        AppMethodBeat.o(79375);
      }
    }
  }

  public final int getType()
  {
    return 7;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ab
 * JD-Core Version:    0.6.2
 */