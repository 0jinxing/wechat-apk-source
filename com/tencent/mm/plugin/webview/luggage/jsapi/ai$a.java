package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key;
import com.tencent.mm.plugin.webview.luggage.q;
import com.tencent.mm.plugin.webview.ui.tools.bag.h;
import com.tencent.mm.plugin.webview.ui.tools.game.g;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.d;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c;
import com.tencent.mm.protocal.c.g;
import com.tencent.mm.protocal.protobuf.avi;
import com.tencent.mm.protocal.protobuf.avp;
import com.tencent.mm.protocal.protobuf.cmu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class ai$a
  implements b.a
{
  private String appId;
  private a<d>.a ujY;

  ai$a(a<d>.a parama, String paramString)
  {
    this.ujY = parama;
    this.appId = paramString;
  }

  private void AR(String paramString)
  {
    AppMethodBeat.i(6345);
    if (bo.isNullOrNil(paramString))
      this.ujY.a("", null);
    while (true)
    {
      g.aG(((d)this.ujY.bOZ).cWL(), System.currentTimeMillis());
      release();
      AppMethodBeat.o(6345);
      return;
      this.ujY.a(paramString, null);
    }
  }

  private void release()
  {
    this.ujY = null;
    this.appId = null;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(6344);
    if (this.ujY == null)
      AppMethodBeat.o(6344);
    while (true)
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.JsApiPreVerify", "errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        AR(paramString);
        AppMethodBeat.o(6344);
      }
      else
      {
        paramb = (avp)paramb.fsH.fsP;
        if ((paramb == null) || (paramb.wzj == null) || (paramb.wzj.cyE != 0))
        {
          AR(paramString);
          AppMethodBeat.o(6344);
        }
        else
        {
          Object localObject = ((d)this.ujY.bOZ).uij;
          paramString = this.appId;
          if ((!bo.isNullOrNil(paramString)) && (!bo.isNullOrNil(((q)localObject).uiI.getUrl())))
            ((q)localObject).ujw.put(q.aef(((q)localObject).uiI.getUrl()), paramString);
          localObject = new c.d();
          ((c.d)localObject).appId = this.appId;
          ((c.d)localObject).uFm = paramb.wzA;
          paramString = ((d)this.ujY.bOZ).uij;
          if (!bo.isNullOrNil(paramString.uiI.getUrl()))
            paramString.ujx.put(q.aef(paramString.uiI.getUrl()), localObject);
          localObject = paramb.wzz;
          paramString = ((d)this.ujY.bOZ).cWM().aei(((d)this.ujY.bOZ).getUrl());
          if (paramString == null)
          {
            AR("");
            AppMethodBeat.o(6344);
          }
          else
          {
            if (!bo.ek((List)localObject))
            {
              localObject = ((LinkedList)localObject).iterator();
              while (((Iterator)localObject).hasNext())
              {
                cmu localcmu = (cmu)((Iterator)localObject).next();
                c.g localg = c.akD(localcmu.wzd);
                if ((localg != null) && (paramString.Lx(localg.dmb()) != localcmu.state))
                  paramString.a(localg.dmb(), (byte)localcmu.state);
              }
            }
            ((d)this.ujY.bOZ).cWP().afX(paramb.wzB);
            AR("");
            AppMethodBeat.o(6344);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ai.a
 * JD-Core Version:    0.6.2
 */