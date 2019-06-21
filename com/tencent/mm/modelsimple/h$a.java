package com.tencent.mm.modelsimple;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ado;
import com.tencent.mm.protocal.protobuf.adp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

final class h$a
{
  static b a(h.a.a parama)
  {
    AppMethodBeat.i(78568);
    b.a locala = new b.a();
    locala.fsJ = new ado();
    locala.fsK = new adp();
    switch (h.1.fOw[parama.ordinal()])
    {
    default:
      locala.uri = "/cgi-bin/micromsg-bin/3rd-geta8key";
      locala.fsI = 226;
      locala.fsL = 388;
      locala.fsM = 1000000388;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      parama = locala.acD();
      AppMethodBeat.o(78568);
      return parama;
      locala.uri = "/cgi-bin/micromsg-bin/geta8key";
      locala.fsI = 233;
      locala.fsL = 155;
      locala.fsM = 1000000155;
      continue;
      locala.uri = "/cgi-bin/micromsg-bin/mp-geta8key";
      locala.fsI = 238;
      locala.fsL = 345;
      locala.fsM = 1000000345;
      continue;
      locala.uri = "/cgi-bin/micromsg-bin/pay-geta8key";
      locala.fsI = 835;
      locala.fsL = 346;
      locala.fsM = 1000000346;
      continue;
      locala.uri = "/cgi-bin/micromsg-bin/minor-geta8key";
      locala.fsI = 812;
      locala.fsL = 387;
      locala.fsM = 1000000387;
      continue;
      locala.uri = "/cgi-bin/micromsg-bin/3rd-geta8key";
      locala.fsI = 226;
      locala.fsL = 388;
      locala.fsM = 1000000388;
    }
  }

  static h.a.a aa(String paramString, int paramInt)
  {
    AppMethodBeat.i(78569);
    if (paramInt == 5)
    {
      paramString = h.a.a.fOB;
      AppMethodBeat.o(78569);
    }
    while (true)
    {
      return paramString;
      if (bo.isNullOrNil(paramString))
      {
        ab.i("MicroMsg.NetSceneGetA8Key", "getTypeFromUrl reqUrl is null, getA8Key");
        paramString = h.a.a.fOy;
        AppMethodBeat.o(78569);
      }
      else
      {
        try
        {
          Object localObject = Uri.parse(paramString);
          if (localObject == null)
          {
            paramString = h.a.a.fOC;
            AppMethodBeat.o(78569);
          }
          else
          {
            String str = bo.nullAsNil(((Uri)localObject).getHost()).toLowerCase();
            if (bo.isNullOrNil(((Uri)localObject).getFragment()));
            StringBuilder localStringBuilder;
            for (localObject = ""; ; localObject = ((Uri)localObject).getFragment())
            {
              ab.d("MicroMsg.NetSceneGetA8Key", "get TypeFromUrl domain:%s, fragment:%s", new Object[] { str, localObject });
              if ((!str.equals("open.weixin.qq.com")) && (!str.equals("mp.weixin.qq.com")) && (!str.equals("mp.weixinbridge.com")))
                break label178;
              paramString = h.a.a.fOz;
              AppMethodBeat.o(78569);
              break;
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>("#");
            }
            label178: if (((String)localObject).contains("wechat_pay"))
            {
              paramString = h.a.a.fOA;
              AppMethodBeat.o(78569);
            }
            else if ((str.contains(".qq.com")) || (str.equals("qq.com")) || (str.contains(".wechat.com")) || (str.equals("wechat.com")) || (str.contains(".tenpay.com")) || (str.equals("tenpay.com")) || (str.contains(".url.cn")) || (str.equals("url.com")) || ((!paramString.startsWith("http://")) && (!paramString.startsWith("https://"))))
            {
              paramString = h.a.a.fOy;
              AppMethodBeat.o(78569);
            }
            else
            {
              paramString = h.a.a.fOC;
              AppMethodBeat.o(78569);
            }
          }
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.NetSceneGetA8Key", "getTypeFromUrl parse uri fail %s", new Object[] { paramString.getMessage() });
          paramString = h.a.a.fOy;
          AppMethodBeat.o(78569);
        }
      }
    }
  }

  static b d(b paramb)
  {
    AppMethodBeat.i(78570);
    ado localado = (ado)paramb.fsG.fsP;
    g.RQ();
    String str1 = bo.nullAsNil((String)g.RP().Ry().get(46, null));
    localado.vHP = new SKBuiltinBuffer_t().setBuffer(bo.anf(str1));
    g.RQ();
    String str2 = bo.nullAsNil((String)g.RP().Ry().get(72, null));
    localado.wlr = new SKBuiltinBuffer_t().setBuffer(bo.anf(str2));
    ab.d("MicroMsg.NetSceneGetA8Key", "dkwt get a2=" + str1 + " newa2=" + str2);
    AppMethodBeat.o(78570);
    return paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.h.a
 * JD-Core Version:    0.6.2
 */