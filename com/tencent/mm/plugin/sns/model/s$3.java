package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nq;
import com.tencent.mm.g.a.nq.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

final class s$3 extends c<nq>
{
  s$3(s params)
  {
    AppMethodBeat.i(36286);
    this.xxI = nq.class.getName().hashCode();
    AppMethodBeat.o(36286);
  }

  private boolean a(nq paramnq)
  {
    AppMethodBeat.i(36287);
    if (!this.qJy.qJw.containsKey(paramnq.cJW.filePath))
      AppMethodBeat.o(36287);
    while (true)
    {
      return false;
      int i = ((Integer)this.qJy.qJw.remove(paramnq.cJW.filePath)).intValue();
      String str;
      if (this.qJy.qJs == 12)
      {
        str = "2,3,,";
        paramnq = str;
        if (i != 0);
      }
      try
      {
        paramnq = new java/lang/StringBuilder;
        paramnq.<init>();
        paramnq = "2,3,," + "," + URLEncoder.encode(this.qJy.qJx, "UTF-8");
        ab.i("MicroMsg.NetSceneSnsPost", "androidSystemShareFixed(13717) fileToIndex:%d,  %s", new Object[] { Integer.valueOf(i), paramnq });
        h.pYm.X(13717, paramnq);
        s.a(this.qJy);
        AppMethodBeat.o(36287);
      }
      catch (UnsupportedEncodingException paramnq)
      {
        while (true)
        {
          ab.e("MicroMsg.NetSceneSnsPost", "", new Object[] { paramnq.getMessage() });
          paramnq = str;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.s.3
 * JD-Core Version:    0.6.2
 */