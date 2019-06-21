package com.tencent.mm.plugin.qqmail.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.v.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.util.Map;

final class AttachDownloadPage$9 extends v.a
{
  AttachDownloadPage$9(AttachDownloadPage paramAttachDownloadPage)
  {
  }

  public final void onComplete()
  {
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(68141);
    AttachDownloadPage.a(this.pwb, 4);
    if (AttachDownloadPage.m(this.pwb) < 5)
    {
      AttachDownloadPage.n(this.pwb);
      AttachDownloadPage.f(this.pwb);
      AppMethodBeat.o(68141);
    }
    while (true)
    {
      return;
      AttachDownloadPage.d(this.pwb);
      AppMethodBeat.o(68141);
    }
  }

  public final void onProgress(int paramInt)
  {
    AppMethodBeat.i(68139);
    ab.d("MicroMsg.AttachDownloadPage", "download progress : ".concat(String.valueOf(paramInt)));
    AttachDownloadPage.j(this.pwb);
    AttachDownloadPage.a(this.pwb, 1);
    AppMethodBeat.o(68139);
  }

  public final void onSuccess(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(68140);
    e.h(AttachDownloadPage.k(this.pwb), AttachDownloadPage.l(this.pwb) + ".temp", AttachDownloadPage.l(this.pwb));
    AttachDownloadPage.a(this.pwb, 3);
    Toast.makeText(this.pwb, this.pwb.getString(2131298934) + " : " + AttachDownloadPage.a(this.pwb), 5000).show();
    AttachDownloadPage.d(this.pwb);
    AppMethodBeat.o(68140);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage.9
 * JD-Core Version:    0.6.2
 */