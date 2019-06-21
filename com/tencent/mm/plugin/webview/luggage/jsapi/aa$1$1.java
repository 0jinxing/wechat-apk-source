package com.tencent.mm.plugin.webview.luggage.jsapi;

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
import com.tencent.mm.pluginsdk.model.app.ak;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.protocal.protobuf.avk;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class aa$1$1
  implements Runnable
{
  aa$1$1(aa.1 param1, int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6327);
    ab.d("MicroMsg.JsApiLaunchApplication", "on RunCgi callback errType:%d errCode:%d msg:%s", new Object[] { Integer.valueOf(this.crc), Integer.valueOf(this.crd), this.ftO });
    if ((this.crc != 0) || (this.crd != 0))
    {
      this.ukh.kOx.d("check fail", null);
      AppMethodBeat.o(6327);
    }
    Object localObject1;
    while (true)
    {
      return;
      localObject1 = (avk)this.fuz.fsH.fsP;
      switch (((avk)localObject1).cyE)
      {
      case 1:
      default:
        this.ukh.kOx.d("check fail", null);
        AppMethodBeat.o(6327);
        break;
      case 2:
        this.ukh.kOx.d("check fail forbidden scene", null);
        AppMethodBeat.o(6327);
      case 0:
      }
    }
    ak localak = new ak(new aa.1.1.1(this));
    ab.i("MicroMsg.JsApiLaunchApplication", "launchApplication check result(showType : %d, errCode : %d)", new Object[] { Integer.valueOf(((avk)localObject1).wzs), Integer.valueOf(((avk)localObject1).cyE) });
    if (!bo.isNullOrNil(this.ukh.hxf))
    {
      localObject2 = new Intent("android.intent.action.VIEW", Uri.parse(this.ukh.hxf));
      ((Intent)localObject2).addFlags(268435456);
      localObject3 = bo.H(this.ukh.val$context, (Intent)localObject2);
      if ((localObject3 != null) && (!((List)localObject3).isEmpty()))
      {
        if ((TextUtils.isEmpty(((Intent)localObject2).getPackage())) && (((List)localObject3).size() == 1));
        for (localObject3 = g.b((ResolveInfo)((List)localObject3).get(0)); ; localObject3 = ((Intent)localObject2).getPackage())
        {
          if (bo.nullAsNil(ah.getPackageName()).equals(localObject3))
            break label380;
          localak.dS(g.a(this.ukh.val$context, (Intent)localObject2, null, ((avk)localObject1).wzs, localak, this.ukh.hxg));
          AppMethodBeat.o(6327);
          break;
        }
      }
    }
    label380: Object localObject3 = new WXAppExtendObject();
    ((WXAppExtendObject)localObject3).extInfo = this.ukh.hxj;
    localObject3 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject3);
    ((WXMediaMessage)localObject3).sdkVer = 620954368;
    ((WXMediaMessage)localObject3).messageExt = this.ukh.hxj;
    Object localObject2 = new jc();
    ((jc)localObject2).cEj.cEl = ((WXMediaMessage)localObject3);
    ((jc)localObject2).cEj.appId = this.ukh.hxh;
    ((jc)localObject2).cEj.showType = ((avk)localObject1).wzs;
    ((jc)localObject2).cEj.context = this.ukh.val$context;
    ((jc)localObject2).cEj.cvs = this.ukh.hxg;
    ((jc)localObject2).cEj.cEm = localak;
    a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
    boolean bool = ((jc)localObject2).cEk.cEn;
    if ((!bool) && (!bo.isNullOrNil(this.ukh.hxh)) && (!bo.isNullOrNil(this.ukh.hxi)))
    {
      localObject3 = this.ukh.hxh + "://" + this.ukh.hxi;
      localObject1 = new Intent("android.intent.action.VIEW", Uri.parse((String)localObject3));
      ab.i("MicroMsg.JsApiLaunchApplication", "launchApplication by opensdk failed, try to launch by scheme(%s).", new Object[] { localObject3 });
      ((Intent)localObject1).addFlags(268435456);
      localObject3 = bo.H(this.ukh.val$context, (Intent)localObject1);
      if ((localObject3 != null) && (!((List)localObject3).isEmpty()))
        if ((TextUtils.isEmpty(((Intent)localObject1).getPackage())) && (((List)localObject3).size() == 1))
        {
          localObject3 = g.b((ResolveInfo)((List)localObject3).get(0));
          label699: if (bo.nullAsNil(ah.getPackageName()).equals(localObject3))
            break label779;
          localak.ftW = false;
          localak.hxt = false;
          localak.hxu = false;
          localak.cEn = false;
          bool = g.a(this.ukh.val$context, (Intent)localObject1, null, localak, this.ukh.hxg);
        }
    }
    label779: 
    while (true)
    {
      localak.dS(bool);
      AppMethodBeat.o(6327);
      break;
      localObject3 = ((Intent)localObject1).getPackage();
      break label699;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.aa.1.1
 * JD-Core Version:    0.6.2
 */