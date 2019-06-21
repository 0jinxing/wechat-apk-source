package com.tencent.mm.plugin.websearch.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Map;

public class aj
{
  private static volatile aj uaG;
  private al fPG;
  private volatile boolean uaB;
  private volatile boolean uaC;
  private volatile Boolean uaD;
  private l uaE;
  private Map<Integer, ak> uaF;

  private aj()
  {
    AppMethodBeat.i(124179);
    this.uaB = false;
    this.uaC = false;
    this.uaE = new ae();
    AppMethodBeat.o(124179);
  }

  public static aj cVp()
  {
    AppMethodBeat.i(124180);
    if (uaG == null);
    try
    {
      if (uaG == null)
      {
        localaj = new com/tencent/mm/plugin/websearch/api/aj;
        localaj.<init>();
        uaG = localaj;
      }
      aj localaj = uaG;
      AppMethodBeat.o(124180);
      return localaj;
    }
    finally
    {
      AppMethodBeat.o(124180);
    }
  }

  public final l Ih(int paramInt)
  {
    AppMethodBeat.i(124181);
    Object localObject;
    if (paramInt <= 0)
    {
      localObject = this.uaE;
      AppMethodBeat.o(124181);
    }
    while (true)
    {
      return localObject;
      if (this.uaF == null)
        this.uaF = new HashMap();
      ak localak = (ak)this.uaF.get(Integer.valueOf(paramInt));
      localObject = localak;
      if (localak == null)
      {
        localObject = new ak(paramInt);
        this.uaF.put(Integer.valueOf(paramInt), localObject);
      }
      AppMethodBeat.o(124181);
    }
  }

  public final boolean Ii(int paramInt)
  {
    AppMethodBeat.i(124187);
    if (!ah.bqo())
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("please call from main process");
      AppMethodBeat.o(124187);
      throw localIllegalStateException;
    }
    boolean bool;
    switch (paramInt)
    {
    default:
      bool = false;
      AppMethodBeat.o(124187);
    case 1:
    case 2:
    }
    while (true)
    {
      return bool;
      bool = cVr();
      AppMethodBeat.o(124187);
      continue;
      bool = cVs();
      AppMethodBeat.o(124187);
    }
  }

  public final void cVq()
  {
    AppMethodBeat.i(124184);
    if (this.fPG == null)
    {
      this.fPG = new al();
      this.fPG.aa(new aj.2(this));
    }
    AppMethodBeat.o(124184);
  }

  public final boolean cVr()
  {
    boolean bool = false;
    AppMethodBeat.i(124185);
    if (this.uaD != null)
    {
      ab.i("MicroMsg.WebSearch.WebSearchPreloadExport", "openSearchPreload cmdPreloadSwitch %b", new Object[] { this.uaD });
      bool = this.uaD.booleanValue();
      AppMethodBeat.o(124185);
    }
    while (true)
    {
      return bool;
      if (aa.HV(0) < 80007181)
      {
        ab.e("MicroMsg.WebSearch.WebSearchPreloadExport", "current search template not support preload");
        AppMethodBeat.o(124185);
      }
      else
      {
        bool = this.uaB;
        AppMethodBeat.o(124185);
      }
    }
  }

  public final boolean cVs()
  {
    AppMethodBeat.i(124186);
    boolean bool;
    if (this.uaD != null)
    {
      ab.i("MicroMsg.WebSearch.WebSearchPreloadExport", "isOpenRecommendPreload cmdPreloadSwitch %b", new Object[] { this.uaD });
      bool = this.uaD.booleanValue();
      AppMethodBeat.o(124186);
    }
    while (true)
    {
      return bool;
      bool = this.uaC;
      AppMethodBeat.o(124186);
    }
  }

  public final void dy(String paramString, int paramInt)
  {
    AppMethodBeat.i(124182);
    ab.i("MicroMsg.WebSearch.WebSearchPreloadExport", "preloadWebview 1 %s", new Object[] { ah.getProcessName() });
    if (ah.doF())
    {
      Ih(paramInt).adF(paramString);
      AppMethodBeat.o(124182);
    }
    while (true)
    {
      return;
      if (ah.bqo())
        g.RS().aa(new aj.1(this, paramInt, paramString));
      AppMethodBeat.o(124182);
    }
  }

  public final void nE(boolean paramBoolean)
  {
    AppMethodBeat.i(124183);
    this.uaD = Boolean.valueOf(paramBoolean);
    AppMethodBeat.o(124183);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.aj
 * JD-Core Version:    0.6.2
 */