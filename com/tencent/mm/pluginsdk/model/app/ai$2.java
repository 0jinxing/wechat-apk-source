package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.a.nr.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.n;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class ai$2 extends com.tencent.mm.sdk.b.c<nr>
{
  ai$2(ai paramai)
  {
    AppMethodBeat.i(27377);
    this.xxI = nr.class.getName().hashCode();
    AppMethodBeat.o(27377);
  }

  private boolean a(nr paramnr)
  {
    AppMethodBeat.i(27378);
    if (!paramnr.cJX.filePath.equals(this.vcF.pJj.field_fileFullPath))
      AppMethodBeat.o(27378);
    while (true)
    {
      return false;
      Object localObject1 = "";
      try
      {
        Object localObject2 = URLEncoder.encode(paramnr.cJX.result, "UTF-8");
        localObject1 = localObject2;
        if (this.vcF.eFs == 1)
        {
          aw.ZK();
          Object localObject3 = com.tencent.mm.model.c.XO().jf(this.vcF.pJj.field_msgInfoId);
          com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
          locald.l("20toUser", this.vcF.toUser + ",");
          locald.l("21source", "4,");
          locald.l("22qrUrl", (String)localObject1 + ",");
          localObject2 = new StringBuilder();
          if (this.vcF.eFt == null)
          {
            localObject1 = "";
            locald.l("23md5", (String)localObject1 + ",");
            localObject2 = new StringBuilder();
            if (this.vcF.eFt != null)
              break label492;
            localObject1 = "";
            locald.l("24cdnFileId", (String)localObject1 + ",");
            localObject2 = new StringBuilder();
            if (this.vcF.eFt != null)
              break label506;
            localObject1 = "";
            locald.l("25cdnAesKey", (String)localObject1 + ",");
            localObject2 = "";
            localObject1 = localObject2;
            if (((bi)localObject3).bAA())
            {
              localObject3 = j.b.me(((cy)localObject3).field_content);
              localObject1 = localObject2;
              if (localObject3 != null)
                localObject1 = ((j.b)localObject3).appId;
            }
            locald.l("26appip", (String)localObject1 + ",");
            locald.l("27toUsersCount", n.mA(this.vcF.toUser) + ",");
            locald.l("28codeType", Integer.valueOf(paramnr.cJX.cvn));
            ab.i("MicroMsg.NetSceneUploadAppAttach", "report qrCodeImgChatting(13628): " + locald.Fk());
            o.y(13628, locald.toString());
          }
        }
        else
        {
          a.xxA.d(this.vcF.eFv);
          AppMethodBeat.o(27378);
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneUploadAppAttach", localUnsupportedEncodingException, "", new Object[0]);
          continue;
          localObject1 = this.vcF.eFt.field_filemd5;
          continue;
          label492: localObject1 = this.vcF.eFt.field_fileId;
          continue;
          label506: localObject1 = this.vcF.eFt.field_aesKey;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ai.2
 * JD-Core Version:    0.6.2
 */