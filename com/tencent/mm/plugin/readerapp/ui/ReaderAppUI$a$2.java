package com.tencent.mm.plugin.readerapp.ui;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class ReaderAppUI$a$2
  implements e.a
{
  ReaderAppUI$a$2(ReaderAppUI.a parama, boolean paramBoolean, ReaderAppUI.a.b paramb)
  {
  }

  public final void onFinish()
  {
    AppMethodBeat.i(76823);
    if (!this.pFr)
    {
      this.pFs.pFv.setTextColor(this.pFq.pFj.mController.ylL.getResources().getColor(2131690691));
      this.pFs.pFv.setBackgroundResource(2130837923);
    }
    this.pFs.pFw.setVisibility(0);
    AppMethodBeat.o(76823);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.a.2
 * JD-Core Version:    0.6.2
 */