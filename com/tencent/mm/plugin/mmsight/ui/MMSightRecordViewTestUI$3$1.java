package com.tencent.mm.plugin.mmsight.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.g;

final class MMSightRecordViewTestUI$3$1
  implements MMSightRecordView.g
{
  MMSightRecordViewTestUI$3$1(MMSightRecordViewTestUI.3 param3)
  {
  }

  public final void F(Bitmap paramBitmap)
  {
    AppMethodBeat.i(55118);
    if (paramBitmap != null)
      ((ImageView)this.oBv.oBu.findViewById(2131822184)).setImageBitmap(paramBitmap);
    AppMethodBeat.o(55118);
  }

  public final void aDq()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI.3.1
 * JD-Core Version:    0.6.2
 */