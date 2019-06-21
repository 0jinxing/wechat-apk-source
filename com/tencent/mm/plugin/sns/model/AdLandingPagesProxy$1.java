package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.a.b.e;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.c;
import com.tencent.mm.protocal.protobuf.qc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.Map;

final class AdLandingPagesProxy$1
  implements f
{
  AdLandingPagesProxy$1(AdLandingPagesProxy paramAdLandingPagesProxy)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(35911);
    ab.i("AdLandingPagesProxy", "errType %d,errCode %d,errMsg %s,scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm.toString() });
    long l;
    if ((paramm instanceof c))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((c)paramm).jsonString;
        ab.i("AdLandingPagesProxy", "the dynamic string is " + paramString + ", sceneType is " + paramm.getType());
      }
      while (true)
      {
        if (AdLandingPagesProxy.a(this.qHs).containsKey(paramm))
        {
          l = ((Long)AdLandingPagesProxy.a(this.qHs).remove(paramm)).longValue();
          this.qHs.CLIENT_CALL("onDynamicUpdateEnd", new Object[] { Long.valueOf(l), paramString });
          g.Rg().b(paramm.getType(), AdLandingPagesProxy.b(this.qHs));
        }
        AppMethodBeat.o(35911);
        return;
        ab.e("AdLandingPagesProxy", "the netscene is error ,error type is " + paramInt1 + " error msg is " + paramString + " sceneType is " + paramm.getType());
        paramString = "";
      }
    }
    if ((paramm instanceof a))
    {
      if (!AdLandingPagesProxy.a(this.qHs).containsKey(paramm))
        break label598;
      l = ((Long)AdLandingPagesProxy.a(this.qHs).remove(paramm)).longValue();
      ab.i("AdLandingPagesProxy", "onSceneEnd id %d", new Object[] { Long.valueOf(l) });
      paramString = (qc)((com.tencent.mm.ai.b)paramm.ftl).fsH.fsP;
      if ((paramInt1 != 0) || (paramInt2 != 0) || (paramString == null))
        break label606;
    }
    while (true)
    {
      try
      {
        paramString = paramString.toByteArray();
        this.qHs.CLIENT_CALL("onAdChannelEnd", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        g.Rg().b(paramm.getType(), AdLandingPagesProxy.b(this.qHs));
        AppMethodBeat.o(35911);
      }
      catch (IOException paramString)
      {
        ab.e("AdLandingPagesProxy", bo.l(paramString));
        AppMethodBeat.o(35911);
      }
      break;
      if ((paramm instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.b))
      {
        if (AdLandingPagesProxy.a(this.qHs).containsKey(paramm))
        {
          l = ((Long)AdLandingPagesProxy.a(this.qHs).remove(paramm)).longValue();
          AdLandingPagesProxy localAdLandingPagesProxy = this.qHs;
          paramString = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.b)paramm;
          if (paramString.rdB != null);
          for (paramString = paramString.rdB; ; paramString = "")
          {
            localAdLandingPagesProxy.CLIENT_CALL("onFavOfficialItemEnd", new Object[] { Long.valueOf(l), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
            g.Rg().b(paramm.getType(), AdLandingPagesProxy.b(this.qHs));
            AppMethodBeat.o(35911);
            break;
          }
        }
      }
      else if ((paramm instanceof e))
      {
        ab.i("AdLandingPagesProxy", "real time report done.");
        g.Rg().b(paramm.getType(), AdLandingPagesProxy.b(this.qHs));
      }
      label598: AppMethodBeat.o(35911);
      break;
      label606: paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.1
 * JD-Core Version:    0.6.2
 */