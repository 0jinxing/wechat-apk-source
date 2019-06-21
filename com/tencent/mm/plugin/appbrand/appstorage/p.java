package com.tencent.mm.plugin.appbrand.appstorage;

import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public abstract interface p extends com.tencent.luggage.a.b
{
  public abstract j X(String paramString, boolean paramBoolean);

  public abstract j Y(String paramString, boolean paramBoolean);

  public abstract File Z(String paramString, boolean paramBoolean);

  public abstract j a(com.tencent.mm.plugin.appbrand.r.j<String> paramj);

  public abstract j a(File paramFile, String paramString, com.tencent.mm.plugin.appbrand.r.j<String> paramj);

  public abstract j a(File paramFile, String paramString, boolean paramBoolean, com.tencent.mm.plugin.appbrand.r.j<String> paramj);

  public abstract j a(String paramString, k paramk);

  public abstract j a(String paramString, com.tencent.mm.plugin.appbrand.r.j<List<h>> paramj);

  public abstract j a(String paramString, File paramFile, boolean paramBoolean);

  public abstract j a(String paramString, InputStream paramInputStream, boolean paramBoolean);

  public abstract List<? extends p.a> awQ();

  public abstract j b(String paramString, com.tencent.mm.plugin.appbrand.r.j<ByteBuffer> paramj);

  public abstract j b(String paramString, File paramFile);

  public abstract boolean ca(String paramString);

  public abstract j g(String paramString, List<u> paramList);

  public abstract void initialize();

  public abstract void release();

  public abstract InputStream xt(String paramString);

  public abstract j yd(String paramString);

  public abstract j ye(String paramString);

  public abstract j yf(String paramString);

  public abstract File yg(String paramString);

  public abstract com.tencent.mm.vfs.b yh(String paramString);

  public abstract boolean yi(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.p
 * JD-Core Version:    0.6.2
 */