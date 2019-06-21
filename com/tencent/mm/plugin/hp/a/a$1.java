package com.tencent.mm.plugin.hp.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.c.a;
import com.tencent.mm.plugin.hp.d.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.che;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import java.io.File;

public final class a$1
  implements Runnable
{
  public a$1(String paramString1, Context paramContext, String paramString2, com.tencent.mm.plugin.hp.d.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(90545);
    int i;
    if (!e.ct(this.ntq))
    {
      long l = System.currentTimeMillis();
      i = b.b(d.en(this.val$context), this.ntr, this.ntq, this.nts.nun);
      SharePatchFileUtil.as(new File(this.ntr));
      ab.i("MicroMsg.Tinker.CTinkerInstaller", "merge apk use :%d second retCode:%d", new Object[] { Long.valueOf((System.currentTimeMillis() - l) / 1000L), Integer.valueOf(i) });
    }
    while (true)
    {
      String str;
      if (i == 0)
      {
        boolean bool = a.cM(this.ntq);
        if (bool)
        {
          ab.i("MicroMsg.Tinker.CTinkerInstaller", "checkApk:%s", new Object[] { Boolean.valueOf(bool) });
          Context localContext = ah.getContext();
          if (bo.isNullOrNil(this.nts.bGx()))
          {
            str = localContext.getString(2131304177);
            che localche = new che();
            localche.num = this.nts.num;
            localche.title = localContext.getString(2131300006);
            localche.xgb = localContext.getString(2131300625);
            localche.nna = localContext.getString(2131304158);
            localche.nun = this.nts.nun;
            localche.nuo = this.nts.nuo;
            localche.iCm = this.nts.fileSize;
            localche.nuk = this.nts.nuk;
            localche.cdy = this.nts.nul;
            localche.versionCode = this.nts.versionCode;
            localche.xga = this.ntq;
            localche.bzH = str;
            d.a(localche);
            if (this.nts.nui.intValue() == 3)
              h.pYm.a(614L, 58L, 1L, false);
            ab.d("MicroMsg.Tinker.CTinkerInstaller", "boots download success.");
            label342: switch (i)
            {
            default:
            case -1:
            case -2:
            }
          }
        }
      }
      while (true)
      {
        AppMethodBeat.o(90545);
        while (true)
        {
          return;
          str = this.nts.bGx();
          break;
          ab.i("MicroMsg.Tinker.CTinkerInstaller", "md5 is no equal.");
          break label342;
          ab.i("MicroMsg.Tinker.CTinkerInstaller", "merge apk failed.");
          break label342;
          h.pYm.a(614L, 52L, 1L, false);
          ab.d("MicroMsg.Tinker.CTinkerInstaller", "boots download failed sdcard full.");
          AppMethodBeat.o(90545);
        }
        h.pYm.a(614L, 53L, 1L, false);
        ab.d("MicroMsg.Tinker.CTinkerInstaller", "boots download failed apk md5 no equal.");
      }
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.a.a.1
 * JD-Core Version:    0.6.2
 */