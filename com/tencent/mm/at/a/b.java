package com.tencent.mm.at.a;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.h;
import com.tencent.mm.at.a.c.m;
import com.tencent.mm.at.a.f.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public final class b
{
  public com.tencent.mm.at.a.a.b fGK;
  h fGL;
  private Executor fGM;
  public final Map<Integer, String> fGN;
  public HashMap<Integer, com.tencent.mm.at.a.f.b> fGO;

  public b(com.tencent.mm.at.a.a.b paramb)
  {
    AppMethodBeat.i(116037);
    this.fGN = Collections.synchronizedMap(new HashMap());
    this.fGO = new HashMap();
    this.fGK = paramb;
    this.fGL = paramb.fHa;
    this.fGM = paramb.fHb;
    this.fGK.fGU.a(this.fGK.fGW);
    AppMethodBeat.o(116037);
  }

  private void Td()
  {
    AppMethodBeat.i(116042);
    if (this.fGK.fHa.isShutdown())
      this.fGL = com.tencent.mm.at.a.a.a.cs(this.fGK.fGQ, this.fGK.fGR);
    AppMethodBeat.o(116042);
  }

  public final boolean DA()
  {
    AppMethodBeat.i(116039);
    boolean bool = this.fGL.DA();
    AppMethodBeat.o(116039);
    return bool;
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(116044);
    this.fGN.remove(Integer.valueOf(paramc.eQF));
    ab.d("MicroMsg.imageloader.ImageLoaderManager", "[cpan] remove image weak holder size:%d viewcode:%s", new Object[] { Integer.valueOf(this.fGN.size()), Integer.valueOf(paramc.eQF) });
    AppMethodBeat.o(116044);
  }

  public final void a(com.tencent.mm.at.a.f.b paramb)
  {
    AppMethodBeat.i(116045);
    if ((this.fGO != null) && (paramb.fHr != null))
    {
      com.tencent.mm.at.a.f.b localb = (com.tencent.mm.at.a.f.b)this.fGO.get(Integer.valueOf(paramb.fHr.eQF));
      if ((localb != null) && (localb.fHr != null) && (paramb.fHr.eQF == localb.fHr.eQF))
      {
        this.fGL.remove(localb);
        ab.d("MicroMsg.imageloader.ImageLoaderManager", "remove taks url:%s", new Object[] { localb.url });
      }
      this.fGO.put(Integer.valueOf(paramb.fHr.eQF), paramb);
    }
    AppMethodBeat.o(116045);
  }

  public final void a(com.tencent.mm.at.a.f.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(116038);
    Td();
    this.fGL.execute(paramb);
    if ((paramBoolean) && (com.tencent.mm.at.a.g.b.Us()))
      this.fGM.execute(new d());
    AppMethodBeat.o(116038);
  }

  public final boolean a(c paramc, String paramString)
  {
    AppMethodBeat.i(116043);
    boolean bool;
    if (!bo.isNullOrNil(paramString))
    {
      String str = (String)this.fGN.get(Integer.valueOf(paramc.eQF));
      if ((bo.isNullOrNil(str)) || (!paramString.equals(str)))
      {
        this.fGN.put(Integer.valueOf(paramc.eQF), paramString);
        bool = true;
        AppMethodBeat.o(116043);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(116043);
    }
  }

  public final void ahw()
  {
    AppMethodBeat.i(116041);
    if (this.fGK != null)
    {
      this.fGK.fGT.clear();
      this.fGK.fGU.ahH();
    }
    AppMethodBeat.o(116041);
  }

  public final Bitmap sB(String paramString)
  {
    AppMethodBeat.i(116040);
    if (this.fGK != null)
    {
      paramString = this.fGK.fGT.kR(paramString);
      AppMethodBeat.o(116040);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(116040);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.b
 * JD-Core Version:    0.6.2
 */