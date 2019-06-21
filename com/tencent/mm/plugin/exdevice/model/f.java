package com.tencent.mm.plugin.exdevice.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ce;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.asr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class f
{
  public static void a(com.tencent.mm.plugin.exdevice.h.b paramb, asq paramasq, asr paramasr)
  {
    AppMethodBeat.i(19248);
    if (paramasr != null)
    {
      paramb.field_connProto = paramasr.wwn;
      paramb.field_connStrategy = paramasr.wwo;
      paramb.field_closeStrategy = paramasr.wwp;
      paramb.field_mac = com.tencent.mm.plugin.exdevice.j.b.KK(com.tencent.mm.plugin.exdevice.j.b.KL(paramasr.vKF));
      paramb.field_authKey = paramasr.vHO;
      paramb.field_brandName = paramasr.wwm;
      paramb.iy(paramasr.guS);
      paramb.eH(paramasr.dFq);
      paramb.jp(paramasr.wwv);
      paramb.jo(paramasr.wwu);
      paramb.jn(paramasr.wwt);
      paramb.hV(paramasr.www);
      paramb.jl(paramasr.IconUrl);
      paramb.hW(paramasr.dFp);
      paramb.jm(paramasr.mZj);
      paramb.jq(paramasr.dFr);
      paramb.jr(paramasr.dFs);
      paramb.js(paramasr.dFt);
      paramb.jt(paramasr.dFu);
    }
    if (paramasq != null)
    {
      paramb.field_deviceID = paramasq.jBE;
      paramb.field_deviceType = paramasq.vIk;
      paramb.field_md5Str = g.x(new String(paramasq.vIk + paramasq.jBE).getBytes());
      if (bo.isNullOrNil(paramb.field_brandName))
        paramb.field_brandName = paramasq.vIk;
    }
    AppMethodBeat.o(19248);
  }

  public static boolean ao(Context paramContext, String paramString)
  {
    AppMethodBeat.i(19247);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.exdevice.ExdeviceLogic", "Jump to webview failed, url is null or nil.");
      bool = false;
      AppMethodBeat.o(19247);
    }
    while (true)
    {
      return bool;
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramString);
      d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
      bool = true;
      AppMethodBeat.o(19247);
    }
  }

  public static boolean b(com.tencent.mm.plugin.exdevice.h.b paramb)
  {
    if ((paramb != null) && ((paramb.dFq & 1L) == 1L));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.f
 * JD-Core Version:    0.6.2
 */