package com.tencent.mm.plugin.exdevice.f.a;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;

final class e$2
  implements h.d
{
  e$2(MMActivity paramMMActivity)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(19440);
    switch (paramInt2)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(19440);
      return;
      MMActivity localMMActivity = this.lvu;
      Intent localIntent = new Intent();
      localIntent.putExtra("query_source_type", 9);
      localIntent.putExtra("query_media_type", 1);
      localIntent.putExtra("max_select_count", 1);
      d.b(localMMActivity, "gallery", ".ui.AlbumPreviewUI", localIntent, 1001);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.e.2
 * JD-Core Version:    0.6.2
 */