package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Bitmap.CompressFormat;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.q;
import com.tencent.mm.plugin.scanner.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.widget.snackbar.b;
import java.io.IOException;

final class ScanTranslationCaptureUI$22
  implements View.OnClickListener
{
  ScanTranslationCaptureUI$22(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(81279);
    if (ScanTranslationCaptureUI.e(this.qgh) == 2);
    while (true)
    {
      try
      {
        ScanTranslationCaptureUI.j(this.qgh).cXd = 1L;
        q.a(ScanTranslationCaptureUI.o(this.qgh), this.qgh, false, -1);
        b.i(this.qgh, this.qgh.getString(2131302784));
        AppMethodBeat.o(81279);
        return;
      }
      catch (Exception paramView)
      {
        ab.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", paramView, "copy to gallery error", new Object[0]);
        AppMethodBeat.o(81279);
        continue;
      }
      if (ScanTranslationCaptureUI.e(this.qgh) == 3)
        try
        {
          ScanTranslationCaptureUI.j(this.qgh).cXc = 1L;
          int i = ScanTranslationCaptureUI.p(this.qgh);
          if (i == 0);
          try
          {
            paramView = this.qgh;
            e.cgy();
            ScanTranslationCaptureUI.a(paramView, e.Wb("jpg"));
            d.a(ScanTranslationCaptureUI.n(this.qgh), 80, Bitmap.CompressFormat.JPEG, ScanTranslationCaptureUI.q(this.qgh), false);
            q.a(ScanTranslationCaptureUI.q(this.qgh), this.qgh, false, -1);
            b.i(this.qgh, this.qgh.getString(2131302784));
            AppMethodBeat.o(81279);
          }
          catch (IOException paramView)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", paramView, "save translate result file error", new Object[0]);
          }
        }
        catch (Exception paramView)
        {
          ab.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", paramView, "save to gallery error", new Object[0]);
        }
      else
        AppMethodBeat.o(81279);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.22
 * JD-Core Version:    0.6.2
 */