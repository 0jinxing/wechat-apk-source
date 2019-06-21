package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.g.a.jc;
import com.tencent.mm.g.a.jc.b;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.protocal.protobuf.avk;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class g$5$1
  implements Runnable
{
  g$5$1(g.5 param5, int paramInt1, int paramInt2, com.tencent.mm.ai.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9044);
    if ((this.crc != 0) || (this.crd != 0))
    {
      g.a(this.uHf.uHd, this.uHf.uqf, "launchApplication:fail_check fail", null);
      AppMethodBeat.o(9044);
    }
    Object localObject1;
    while (true)
    {
      return;
      localObject1 = (avk)this.fuz.fsH.fsP;
      ab.i("MicroMsg.MsgHandler", "launchApplication check result(showType : %d, errCode : %d)", new Object[] { Integer.valueOf(((avk)localObject1).wzs), Integer.valueOf(((avk)localObject1).cyE) });
      switch (((avk)localObject1).cyE)
      {
      case 1:
      default:
        g.a(this.uHf.uHd, this.uHf.uqf, "launchApplication:fail_check fail", null);
        AppMethodBeat.o(9044);
        break;
      case 2:
        g.a(this.uHf.uHd, this.uHf.uqf, "launchApplication:fail_check fail forbidden scene", null);
        AppMethodBeat.o(9044);
      case 0:
      }
    }
    g.d locald = new g.d(new g.5.1.1(this));
    if (!bo.isNullOrNil(this.uHf.hxf))
    {
      localObject2 = new Intent("android.intent.action.VIEW", Uri.parse(this.uHf.hxf));
      ((Intent)localObject2).addFlags(268435456);
      localObject3 = bo.H(g.i(this.uHf.uHd), (Intent)localObject2);
      if ((localObject3 != null) && (!((List)localObject3).isEmpty()))
      {
        if ((TextUtils.isEmpty(((Intent)localObject2).getPackage())) && (((List)localObject3).size() == 1));
        for (localObject3 = com.tencent.mm.pluginsdk.model.app.g.b((ResolveInfo)((List)localObject3).get(0)); ; localObject3 = ((Intent)localObject2).getPackage())
        {
          if (bo.nullAsNil(ah.getPackageName()).equals(localObject3))
            break label369;
          locald.dS(com.tencent.mm.pluginsdk.model.app.g.a(g.i(this.uHf.uHd), (Intent)localObject2, null, ((avk)localObject1).wzs, locald, this.uHf.hxg));
          AppMethodBeat.o(9044);
          break;
        }
      }
    }
    label369: Object localObject3 = new WXAppExtendObject();
    ((WXAppExtendObject)localObject3).extInfo = this.uHf.hxj;
    localObject3 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject3);
    ((WXMediaMessage)localObject3).sdkVer = 620954368;
    ((WXMediaMessage)localObject3).messageExt = this.uHf.hxj;
    Object localObject2 = new jc();
    ((jc)localObject2).cEj.cEl = ((WXMediaMessage)localObject3);
    ((jc)localObject2).cEj.appId = this.uHf.hxh;
    ((jc)localObject2).cEj.showType = ((avk)localObject1).wzs;
    ((jc)localObject2).cEj.context = g.i(this.uHf.uHd);
    ((jc)localObject2).cEj.cvs = this.uHf.hxg;
    ((jc)localObject2).cEj.cEm = locald;
    a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
    boolean bool = ((jc)localObject2).cEk.cEn;
    if ((!bool) && (!bo.isNullOrNil(this.uHf.hxh)) && (!bo.isNullOrNil(this.uHf.hxi)))
    {
      localObject3 = this.uHf.hxh + "://" + this.uHf.hxi;
      localObject1 = new Intent("android.intent.action.VIEW", Uri.parse((String)localObject3));
      ab.i("MicroMsg.MsgHandler", "launchApplication by opensdk failed, try to launch by scheme(%s).", new Object[] { localObject3 });
      ((Intent)localObject1).addFlags(268435456);
      localObject3 = bo.H(g.i(this.uHf.uHd), (Intent)localObject1);
      if ((localObject3 != null) && (!((List)localObject3).isEmpty()))
        if ((TextUtils.isEmpty(((Intent)localObject1).getPackage())) && (((List)localObject3).size() == 1))
        {
          localObject3 = com.tencent.mm.pluginsdk.model.app.g.b((ResolveInfo)((List)localObject3).get(0));
          label694: if (bo.nullAsNil(ah.getPackageName()).equals(localObject3))
            break label777;
          locald.ftW = false;
          locald.hxt = false;
          locald.hxu = false;
          locald.cEn = false;
          bool = com.tencent.mm.pluginsdk.model.app.g.a(g.i(this.uHf.uHd), (Intent)localObject1, null, locald, this.uHf.hxg);
        }
    }
    label777: 
    while (true)
    {
      locald.dS(bool);
      AppMethodBeat.o(9044);
      break;
      localObject3 = ((Intent)localObject1).getPackage();
      break label694;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.5.1
 * JD-Core Version:    0.6.2
 */