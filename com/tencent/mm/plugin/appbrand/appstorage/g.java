package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.luggage.g.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vfs.b;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class g
  implements p
{
  public j X(String paramString, boolean paramBoolean)
  {
    return j.gXE;
  }

  public j Y(String paramString, boolean paramBoolean)
  {
    return j.gXE;
  }

  public File Z(String paramString, boolean paramBoolean)
  {
    return null;
  }

  public j a(com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    return j.gXO;
  }

  public j a(File paramFile, String paramString, com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    return j.gXO;
  }

  public j a(File paramFile, String paramString, boolean paramBoolean, com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    return j.gXO;
  }

  public j a(String paramString, k paramk)
  {
    return j.gXE;
  }

  public j a(String paramString, com.tencent.mm.plugin.appbrand.r.j<List<h>> paramj)
  {
    return j.gXE;
  }

  public j a(String paramString, File paramFile, boolean paramBoolean)
  {
    return j.gXE;
  }

  public j a(String paramString, InputStream paramInputStream, boolean paramBoolean)
  {
    return j.gXE;
  }

  public void awP()
  {
  }

  public List<? extends p.a> awQ()
  {
    return null;
  }

  public j b(String paramString, com.tencent.mm.plugin.appbrand.r.j<ByteBuffer> paramj)
  {
    return j.gXE;
  }

  public j b(String paramString, File paramFile)
  {
    return j.gXE;
  }

  public boolean ca(String paramString)
  {
    return false;
  }

  public j g(String paramString, List<u> paramList)
  {
    return j.gXE;
  }

  public void initialize()
  {
  }

  public void release()
  {
  }

  public final InputStream xt(String paramString)
  {
    AppMethodBeat.i(90976);
    com.tencent.mm.plugin.appbrand.r.j localj = new com.tencent.mm.plugin.appbrand.r.j();
    if (b(paramString, localj) == j.gXA)
    {
      paramString = new a((ByteBuffer)localj.value);
      AppMethodBeat.o(90976);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(90976);
    }
  }

  public j yd(String paramString)
  {
    return j.gXE;
  }

  public j ye(String paramString)
  {
    return j.gXE;
  }

  public j yf(String paramString)
  {
    return j.gXE;
  }

  public File yg(String paramString)
  {
    AppMethodBeat.i(90975);
    paramString = Z(paramString, false);
    AppMethodBeat.o(90975);
    return paramString;
  }

  public b yh(String paramString)
  {
    return null;
  }

  public boolean yi(String paramString)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.g
 * JD-Core Version:    0.6.2
 */