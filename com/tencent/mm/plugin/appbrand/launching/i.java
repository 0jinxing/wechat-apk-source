package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.b.c.a;
import com.tencent.mm.plugin.appbrand.appcache.b.e.b;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class i
{
  final QualitySession hgN;
  final int hgQ;
  final WxaAttributes igX;
  final i.a igY;

  i(String paramString, int paramInt, i.a parama, QualitySession paramQualitySession)
  {
    AppMethodBeat.i(131813);
    this.hgQ = paramInt;
    this.igX = f.auO().d(paramString, new String[0]);
    this.igY = parama;
    this.hgN = paramQualitySession;
    if (this.igX == null)
      ab.e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", " <init> get NULL record by username %s", new Object[] { paramString });
    AppMethodBeat.o(131813);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.i
 * JD-Core Version:    0.6.2
 */