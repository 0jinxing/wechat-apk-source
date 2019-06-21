package com.tencent.mm.plugin.appbrand;

import com.tencent.mm.d.a.t.a;

final class ae$a extends t.a
{
  String appId;
  String gQB;
  boolean gQC;

  ae$a(t.a parama, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(parama.filePath, parama.script);
    this.gQB = paramString1;
    this.appId = paramString2;
    this.gQC = paramBoolean;
  }

  ae$a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    super(paramString1, paramString2);
    this.gQB = null;
    this.appId = paramString3;
    this.gQC = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ae.a
 * JD-Core Version:    0.6.2
 */