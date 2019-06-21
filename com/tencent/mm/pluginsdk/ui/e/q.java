package com.tencent.mm.pluginsdk.ui.e;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.t;
import java.io.File;

public final class q
{
  public static boolean BX()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(28155);
    boolean bool3;
    if (!com.tencent.mm.kernel.g.RN().QY())
    {
      ab.e("MicroMsg.WxPhoneBookHelper", "needDisplayWxPBMenuItem, account not ready");
      AppMethodBeat.o(28155);
      bool3 = bool2;
    }
    while (true)
    {
      return bool3;
      label80: boolean bool4;
      label101: boolean bool5;
      if ((!bo.gT(ah.getContext())) && (com.tencent.mm.sdk.platformtools.g.cdf != 1) && (bo.getInt(com.tencent.mm.m.g.Nu().getValue("ShowWeixinPBIntro"), 0) == 0) && (!p.u(ah.getContext(), "com.tencent.pb")))
      {
        i = 1;
        if (i != 0)
          break label203;
        bool4 = bo.gT(ah.getContext());
        if (com.tencent.mm.sdk.platformtools.g.cdf == 1)
          break label187;
        bool3 = true;
        if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("ShowWeixinPBIntro"), 0) != 0)
          break label192;
        bool5 = true;
        label119: if (p.u(ah.getContext(), "com.tencent.pb"))
          break label198;
      }
      while (true)
      {
        ab.d("MicroMsg.WxPhoneBookHelper", "%b, %b, %b, %b", new Object[] { Boolean.valueOf(bool4), Boolean.valueOf(bool3), Boolean.valueOf(bool5), Boolean.valueOf(bool1) });
        AppMethodBeat.o(28155);
        bool3 = bool2;
        break;
        i = 0;
        break label80;
        label187: bool3 = false;
        break label101;
        label192: bool5 = false;
        break label119;
        label198: bool1 = false;
      }
      label203: int i = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJT, null), 3);
      ab.v("MicroMsg.WxPhoneBookHelper", "needDisplayWxPBMenuItem, counter = %d", new Object[] { Integer.valueOf(i) });
      if (i <= 0)
      {
        AppMethodBeat.o(28155);
        bool3 = bool2;
      }
      else
      {
        com.tencent.mm.kernel.g.RP().Ry().set(352257, Integer.valueOf(i - 1));
        AppMethodBeat.o(28155);
        bool3 = true;
      }
    }
  }

  public static void dli()
  {
    AppMethodBeat.i(28156);
    int i = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJT, null), 3);
    ab.v("MicroMsg.WxPhoneBookHelper", "hy: minus pb counter, ori counter = %d", new Object[] { Integer.valueOf(i) });
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJT, Integer.valueOf(i - 1));
    AppMethodBeat.o(28156);
  }

  public static void h(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(28157);
    int i;
    if (paramBundle != null)
    {
      i = paramBundle.getInt("fromScene");
      h.pYm.e(11621, new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
      paramBundle = d.bij().Is("http://dianhua.qq.com/cgi-bin/cloudgrptemplate?t=dianhuaben_download&channel=100008");
      if ((paramBundle == null) || (paramBundle.status != 3))
        break label113;
      ab.i("MicroMsg.WxPhoneBookHelper", "weixin phonebook already download successfully, install directly");
      if (com.tencent.mm.a.e.ct(paramBundle.path))
        com.tencent.mm.pluginsdk.model.app.q.a(paramContext, Uri.fromFile(new File(paramBundle.path)), null);
      AppMethodBeat.o(28157);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label113: t.makeText(paramContext, paramContext.getString(2131298198), 2000).show();
      paramBundle = new e.a();
      paramBundle.It("http://dianhua.qq.com/cgi-bin/cloudgrptemplate?t=dianhuaben_download&channel=100008");
      paramBundle.Iv(paramContext.getString(2131298204));
      paramBundle.tN(1);
      paramBundle.ga(true);
      d.bij().a(paramBundle.kNl);
      AppMethodBeat.o(28157);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.q
 * JD-Core Version:    0.6.2
 */