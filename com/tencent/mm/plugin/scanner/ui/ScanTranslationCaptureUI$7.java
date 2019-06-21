package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.b.a.r;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.scanner.util.p.a;
import com.tencent.mm.plugin.scanner.util.p.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class ScanTranslationCaptureUI$7
  implements p.a
{
  ScanTranslationCaptureUI$7(ScanTranslationCaptureUI paramScanTranslationCaptureUI, String paramString)
  {
  }

  public final void a(String paramString, p.b paramb)
  {
    AppMethodBeat.i(138492);
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals(ScanTranslationCaptureUI.w(this.qgh))))
    {
      ScanTranslationCaptureUI.j(this.qgh).cWY = ((int)(System.currentTimeMillis() - ScanTranslationCaptureUI.i(this.qgh)[1]));
      ab.i("MicroMsg.ScanTranslationCaptureUI", "upload img cost %d", new Object[] { Long.valueOf(ScanTranslationCaptureUI.j(this.qgh).cWY) });
      switch (paramb.errCode)
      {
      default:
      case 0:
      case -21009:
      case -21000:
      }
    }
    while (true)
    {
      if ((ScanTranslationCaptureUI.e(this.qgh) == 1) && (ScanTranslationCaptureUI.y(this.qgh) != 0))
      {
        ab.i("delete tmp path %s", this.pZc);
        com.tencent.mm.vfs.e.deleteFile(this.pZc);
      }
      AppMethodBeat.o(138492);
      return;
      if (!bo.Q(new String[] { paramb.fileId, paramb.aeskey }))
      {
        ab.i("MicroMsg.ScanTranslationCaptureUI", "fileId %s", new Object[] { paramb.fileId });
        paramString = new com.tencent.mm.plugin.scanner.a.e(ScanTranslationCaptureUI.x(this.qgh), com.tencent.mm.a.e.cs(this.pZc), paramb.fileId, paramb.aeskey);
        g.Rg().a(paramString, 0);
      }
      else
      {
        al.d(new ScanTranslationCaptureUI.7.1(this));
        continue;
        al.d(new ScanTranslationCaptureUI.7.2(this));
        ScanTranslationCaptureUI.j(this.qgh).cWX = 3L;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.7
 * JD-Core Version:    0.6.2
 */