package com.tencent.mm.ui.appbrand;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.tz;
import com.tencent.mm.g.a.tz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelappbrand.o;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.protocal.protobuf.cfx;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class b
{
  public static String aqJ(String paramString)
  {
    AppMethodBeat.i(29955);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(29955);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = ((d)g.K(d.class)).zb(paramString);
      if ((paramString != null) && (paramString.ayJ() != null))
      {
        paramString = paramString.ayJ().hhY;
        AppMethodBeat.o(29955);
      }
      else
      {
        ab.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
        AppMethodBeat.o(29955);
        paramString = null;
      }
    }
  }

  public static String aqK(String paramString)
  {
    AppMethodBeat.i(29957);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(29957);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = ((d)g.K(d.class)).zb(paramString);
      if (paramString != null)
      {
        paramString = paramString.field_nickname;
        AppMethodBeat.o(29957);
      }
      else
      {
        ab.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
        AppMethodBeat.o(29957);
        paramString = null;
      }
    }
  }

  public static void k(Context paramContext, String paramString, boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(29954);
    Object localObject1 = new tz();
    ((tz)localObject1).cQf.csl = paramString;
    Object localObject2 = ((tz)localObject1).cQf;
    if (paramBoolean)
    {
      j = 2;
      ((tz.a)localObject2).action = j;
      ((tz)localObject1).cQf.cQh = 2;
      a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new LinkedList();
      localObject2 = new cfx();
      ((cfx)localObject2).xeX = paramString;
      if (!paramBoolean)
        break label168;
    }
    label168: for (int j = i; ; j = 0)
    {
      ((cfx)localObject2).xeW = j;
      ((cfx)localObject2).jCt = 3;
      ((LinkedList)localObject1).add(localObject2);
      aw.Rg().a(1176, new b.1(paramContext, paramString, paramBoolean));
      paramContext = new o((LinkedList)localObject1);
      aw.Rg().a(paramContext, 0);
      AppMethodBeat.o(29954);
      return;
      j = 1;
      break;
    }
  }

  public static String zm(String paramString)
  {
    AppMethodBeat.i(29956);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(29956);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = ((d)g.K(d.class)).zb(paramString);
      if ((paramString != null) && (paramString.ayJ() != null))
      {
        paramString = paramString.field_appId;
        AppMethodBeat.o(29956);
      }
      else
      {
        ab.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
        AppMethodBeat.o(29956);
        paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.appbrand.b
 * JD-Core Version:    0.6.2
 */