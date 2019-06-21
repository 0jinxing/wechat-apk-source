package com.tencent.mm.ui.conversation;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.c.i.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.network.e;
import com.tencent.mm.protocal.protobuf.che;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.g;

final class k$5$2
  implements Runnable
{
  k$5$2(k.5 param5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34469);
    ab.i("MicroMsg.InitHelper", "path:%s,apkMd5:%s", new Object[] { this.zuS.zuR.xga, this.zuS.zuR.nun });
    try
    {
      com.tencent.mm.network.c localc = aw.Rg().ftA.adg();
      if (localc == null)
      {
        AppMethodBeat.o(34469);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.InitHelper", localThrowable, "", new Object[0]);
        Object localObject1 = null;
        continue;
        Object localObject2 = this.zuS.zuR.nuk.substring(0, this.zuS.zuR.nuk.lastIndexOf('/') + 1);
        Object localObject3 = this.zuS.zuR.nuk.substring(this.zuS.zuR.nuk.lastIndexOf('/') + 1);
        localObject2 = new com.tencent.mm.c.i((String)localObject2, this.zuS.zuR.versionCode);
        ((com.tencent.mm.c.i)localObject2).a(new i.a(this.zuS.zuR.nuo, this.zuS.zuR.nun, this.zuS.zuR.cdy, (String)localObject3, this.zuS.zuR.iCm));
        localObject3 = new Intent();
        ((Intent)localObject3).putExtra("intent_short_ips", com.tencent.mm.pluginsdk.f.i.getShortIps());
        ((Intent)localObject3).putExtra("intent_client_version", com.tencent.mm.protocal.d.vxo);
        ((Intent)localObject3).putExtra("intent_extra_session", localObject1.jQ(1));
        ((Intent)localObject3).putExtra("intent_extra_cookie", localObject1.ada());
        ((Intent)localObject3).putExtra("intent_extra_ecdhkey", localObject1.adc());
        ((Intent)localObject3).putExtra("intent_extra_uin", localObject1.QF());
        ((Intent)localObject3).putExtra("intent_update_type", 3);
        ((Intent)localObject3).putExtra("intent_extra_desc", this.zuS.zuR.bzH);
        ((Intent)localObject3).putExtra("intent_extra_md5", this.zuS.zuR.cdy);
        ((Intent)localObject3).putExtra("intent_extra_size", this.zuS.zuR.iCm);
        ((Intent)localObject3).putExtra("intent_extra_download_url", new String[] { this.zuS.zuR.nuk });
        ((Intent)localObject3).putExtra("intent_extra_patchInfo", ((com.tencent.mm.c.i)localObject2).AM());
        ((Intent)localObject3).putExtra("intent_extra_updateMode", g.cdh);
        ((Intent)localObject3).putExtra("intent_extra_marketUrl", g.xyc);
        ((Intent)localObject3).putExtra("intent_extra_extinfo", "<extinfo></extinfo>");
        ((Intent)localObject3).putExtra("intent_extra_tinker_patch", true);
        ((Intent)localObject3).putExtra("intent_extra_download_mode", 1);
        com.tencent.mm.plugin.p.d.bQU().y(k.a(this.zuS.zuQ), (Intent)localObject3);
        com.tencent.mm.pluginsdk.f.i.dia();
        AppMethodBeat.o(34469);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.5.2
 * JD-Core Version:    0.6.2
 */