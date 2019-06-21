package com.tencent.mm.plugin.mmsight.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.h;

final class MMSightRecordViewTestUI$4$1$1
  implements MMSightRecordView.h
{
  MMSightRecordViewTestUI$4$1$1(MMSightRecordViewTestUI.4.1 param1)
  {
  }

  public final void dX(boolean paramBoolean)
  {
    AppMethodBeat.i(55120);
    Toast.makeText(this.oBx.oBw.oBu, "record finish, error: ".concat(String.valueOf(paramBoolean)), 0).show();
    AppMethodBeat.o(55120);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI.4.1.1
 * JD-Core Version:    0.6.2
 */