package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.n.d;

final class CropImageNewUI$20$2
  implements n.d
{
  CropImageNewUI$20$2(CropImageNewUI.20 param20)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(34833);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(34833);
      while (true)
      {
        return;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("CropImage_OutputPath", this.zBh.zBc.getIntent().getStringExtra("CropImage_OutputPath"));
        paramMenuItem.putExtra("OP_CODE", 1);
        this.zBh.zBc.setResult(-1, paramMenuItem);
        this.zBh.zBc.finish();
        AppMethodBeat.o(34833);
      }
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("CropImage_OutputPath", this.zBh.zBc.getIntent().getStringExtra("CropImage_OutputPath"));
      paramMenuItem.putExtra("OP_CODE", 2);
      this.zBh.zBc.setResult(-1, paramMenuItem);
      this.zBh.zBc.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageNewUI.20.2
 * JD-Core Version:    0.6.2
 */