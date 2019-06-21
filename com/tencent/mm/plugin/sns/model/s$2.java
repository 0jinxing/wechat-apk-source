package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.a.nr.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

final class s$2 extends c<nr>
{
  s$2(s params)
  {
    AppMethodBeat.i(36283);
    this.xxI = nr.class.getName().hashCode();
    AppMethodBeat.o(36283);
  }

  private boolean a(nr paramnr)
  {
    AppMethodBeat.i(36284);
    if (!this.qJy.qJw.containsKey(paramnr.cJX.filePath))
      AppMethodBeat.o(36284);
    while (true)
    {
      return false;
      int i = ((Integer)this.qJy.qJw.remove(paramnr.cJX.filePath)).intValue();
      try
      {
        str1 = URLEncoder.encode(paramnr.cJX.result, "UTF-8");
        if (this.qJy.eFs != 0)
        {
          bau localbau = (bau)this.qJy.qJv.get(paramnr.cJX.filePath);
          this.qJy.qJu += String.format("position=%d&qrUrl=%s&md5=%s&imgUrl=%s&codeType=%d|", new Object[] { Integer.valueOf(i), str1, localbau.wEV, localbau.Url, Integer.valueOf(paramnr.cJX.cvn) });
        }
        if (this.qJy.qJs == 12)
        {
          str1 = "2,3,,".concat(String.valueOf(str1));
          paramnr = str1;
          if (i != 0);
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        try
        {
          String str1;
          paramnr = new java/lang/StringBuilder;
          paramnr.<init>();
          paramnr = str1 + "," + URLEncoder.encode(this.qJy.qJx, "UTF-8");
          ab.i("MicroMsg.NetSceneSnsPost", "androidSystemShareFixed(13717) fileToIndex:%d,  %s", new Object[] { Integer.valueOf(i), paramnr });
          h.pYm.X(13717, paramnr);
          s.a(this.qJy);
          AppMethodBeat.o(36284);
          continue;
          localUnsupportedEncodingException = localUnsupportedEncodingException;
          ab.printErrStackTrace("MicroMsg.NetSceneSnsPost", localUnsupportedEncodingException, "", new Object[0]);
          str2 = "";
        }
        catch (UnsupportedEncodingException paramnr)
        {
          while (true)
          {
            String str2;
            ab.e("MicroMsg.NetSceneSnsPost", "", new Object[] { paramnr.getMessage() });
            paramnr = str2;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.s.2
 * JD-Core Version:    0.6.2
 */