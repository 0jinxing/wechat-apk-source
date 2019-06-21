package com.tencent.mm.pluginsdk.model.app;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class e
{
  private ak handler;
  public Map<String, Integer> hoQ;
  public List<r> qoT;
  public List<r> vbN;
  private ap vbO;

  public e()
  {
    AppMethodBeat.i(79244);
    this.vbN = null;
    this.qoT = null;
    this.hoQ = null;
    this.vbO = new ap(new e.1(this), false);
    this.handler = new e.2(this, g.RS().oAl.getLooper());
    this.vbN = new ArrayList();
    this.qoT = new ArrayList();
    this.hoQ = new HashMap();
    this.vbO.ae(600000L, 600000L);
    AppMethodBeat.o(79244);
  }

  private boolean b(r paramr)
  {
    AppMethodBeat.i(79247);
    boolean bool;
    if (paramr == null)
    {
      ab.e("MicroMsg.AppIconService", "increaseCounter fail, info is null");
      AppMethodBeat.o(79247);
      bool = false;
    }
    while (true)
    {
      return bool;
      Integer localInteger = Integer.valueOf(bo.a((Integer)this.hoQ.get(paramr.toString()), 0));
      if (localInteger.intValue() >= 5)
      {
        ab.e("MicroMsg.AppIconService", "increaseCounter fail, has reached the max try count");
        AppMethodBeat.o(79247);
        bool = false;
      }
      else
      {
        this.hoQ.put(paramr.toString(), Integer.valueOf(localInteger.intValue() + 1));
        bool = true;
        AppMethodBeat.o(79247);
      }
    }
  }

  final boolean a(r paramr)
  {
    boolean bool = false;
    AppMethodBeat.i(79246);
    if (paramr == null)
    {
      ab.e("MicroMsg.AppIconService", "startDownload fail, geticoninfo is null");
      AppMethodBeat.o(79246);
    }
    while (true)
    {
      return bool;
      if (!b(paramr))
      {
        ab.e("MicroMsg.AppIconService", "increaseCounter fail");
        AppMethodBeat.o(79246);
      }
      else
      {
        localObject = a.bYJ().aiJ(paramr.appId);
        if (localObject == null)
        {
          ab.e("MicroMsg.AppIconService", "push, appinfo does not exist, appId = " + paramr.appId);
          AppMethodBeat.o(79246);
        }
        else
        {
          switch (paramr.fOZ)
          {
          default:
            ab.e("MicroMsg.AppIconService", "push, unknown iconType = " + paramr.fOZ);
            AppMethodBeat.o(79246);
            break;
          case 1:
            if ((((f)localObject).field_appIconUrl != null) && (((f)localObject).field_appIconUrl.length() != 0))
              break label213;
            ab.e("MicroMsg.AppIconService", "push, appIconUrl is null, appId = " + paramr.appId);
            AppMethodBeat.o(79246);
          case 2:
          case 3:
          case 4:
          case 5:
          }
        }
      }
    }
    label213: Object localObject = ((f)localObject).field_appIconUrl;
    while (true)
    {
      ab.i("MicroMsg.AppIconService", "appIconUrl = ".concat(String.valueOf(localObject)));
      d.post(new s(this.handler, paramr.appId, paramr.fOZ, (String)localObject), "AppIconService_getIcon");
      bool = true;
      AppMethodBeat.o(79246);
      break;
      if ((((f)localObject).field_appWatermarkUrl == null) || (((f)localObject).field_appWatermarkUrl.length() == 0))
      {
        ab.e("MicroMsg.AppIconService", "push, appWatermarkUrl is null, appId = " + paramr.appId);
        AppMethodBeat.o(79246);
        break;
      }
      localObject = ((f)localObject).field_appWatermarkUrl;
      continue;
      if ((((com.tencent.mm.g.c.s)localObject).dnh == null) || (((com.tencent.mm.g.c.s)localObject).dnh.length() == 0))
      {
        ab.e("MicroMsg.AppIconService", "push, appSuggestionIconUrl is null, appId = " + paramr.appId);
        AppMethodBeat.o(79246);
        break;
      }
      localObject = ((com.tencent.mm.g.c.s)localObject).dnh;
      continue;
      if ((((com.tencent.mm.g.c.s)localObject).dns == null) || (((com.tencent.mm.g.c.s)localObject).dns.length() == 0))
      {
        ab.e("MicroMsg.AppIconService", "push, servicePanelIconUrl is null, appId = " + paramr.appId);
        AppMethodBeat.o(79246);
        break;
      }
      localObject = ((com.tencent.mm.g.c.s)localObject).dns;
      continue;
      if ((((com.tencent.mm.g.c.s)localObject).dnt == null) || (((com.tencent.mm.g.c.s)localObject).dnt.length() == 0))
      {
        ab.e("MicroMsg.AppIconService", "push, serviceListIconUrl is null, appId = " + paramr.appId);
        AppMethodBeat.o(79246);
        break;
      }
      localObject = ((com.tencent.mm.g.c.s)localObject).dnt;
    }
  }

  public final void dW(String paramString, int paramInt)
  {
    AppMethodBeat.i(79245);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppIconService", "push fail, appId is null");
      AppMethodBeat.o(79245);
    }
    while (true)
    {
      return;
      r localr = new r(paramString, paramInt);
      if (this.vbN.contains(localr))
      {
        ab.i("MicroMsg.AppIconService", "push, appId = " + paramString + ", iconType = " + paramInt + " already in running list");
        AppMethodBeat.o(79245);
      }
      else if (this.vbN.size() >= 5)
      {
        ab.i("MicroMsg.AppIconService", "running list has reached the max count");
        if (!this.qoT.contains(localr))
          this.qoT.add(localr);
        AppMethodBeat.o(79245);
      }
      else
      {
        if (a(localr))
          this.vbN.add(localr);
        AppMethodBeat.o(79245);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.e
 * JD-Core Version:    0.6.2
 */