package com.tencent.mm.pluginsdk.ui.tools;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.r;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.a.c;
import java.io.File;

final class AppChooserUI$4
  implements View.OnClickListener
{
  AppChooserUI$4(AppChooserUI paramAppChooserUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125857);
    ab.i("MicroMsg.AppChooserUI", "mDownloadOnClickListener");
    if (AppChooserUI.a(this.vty) != null)
    {
      paramView = AppChooserUI.a(this.vty).vtz;
      if (paramView == AppChooserUI.f.vtK)
      {
        if ((AppChooserUI.b(this.vty) != null) && (AppChooserUI.b(this.vty).gLj.isShowing()))
        {
          AppChooserUI.a(this.vty).vtz = AppChooserUI.f.vtL;
          AppChooserUI.a(this.vty).notifyDataSetChanged();
        }
        paramView = new e.a();
        if (AppChooserUI.f(this.vty) == 1)
        {
          paramView.It("http://appchannel.html5.qq.com/directdown?app=qqbrowser&channel=10375");
          paramView.Iv(AppChooserUI.h(this.vty).dgX());
          paramView.tN(1);
          paramView.ga(true);
          d.bij().a(paramView.kNl);
          s.dhn();
          s.Ku(AppChooserUI.g(this.vty));
          if (AppChooserUI.g(this.vty) == 0)
          {
            if (!AppChooserUI.i(this.vty))
              break label275;
            h.pYm.e(11168, new Object[] { Integer.valueOf(4), Integer.valueOf(AppChooserUI.f(this.vty)) });
          }
          label216: if (AppChooserUI.g(this.vty) == 1)
            h.pYm.e(12809, new Object[] { Integer.valueOf(5), "" });
          AppMethodBeat.o(125857);
        }
      }
    }
    while (true)
    {
      return;
      paramView.It(AppChooserUI.h(this.vty).anK());
      break;
      label275: h.pYm.e(11168, new Object[] { Integer.valueOf(3), Integer.valueOf(AppChooserUI.f(this.vty)) });
      break label216;
      if (paramView == AppChooserUI.f.vtM)
      {
        paramView = this.vty;
        long l = AppChooserUI.j(this.vty);
        ab.i("MicroMsg.AppChooserUI", "installRecommendApp");
        Object localObject = d.bij().hm(l).path;
        ab.d("MicroMsg.AppChooserUI", "filepath:%s", new Object[] { String.valueOf(localObject) });
        localObject = new File((String)localObject);
        com.tencent.mm.pluginsdk.model.app.q.a(paramView.mController.ylL, Uri.fromFile((File)localObject), new AppChooserUI.7(paramView));
      }
      AppMethodBeat.o(125857);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.4
 * JD-Core Version:    0.6.2
 */