package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.previewimageview.c.a;
import com.tencent.mm.plugin.sns.ui.previewimageview.e;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;

final class ag$2
  implements c.a
{
  ag$2(ag paramag)
  {
  }

  public final void fu(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38477);
    ag.b localb = this.rlW.rlP;
    String str;
    if ((paramInt1 != paramInt2) && (localb.rma.size() > paramInt1))
    {
      str = (String)localb.rma.remove(paramInt1);
      if (paramInt2 >= localb.rma.size())
        break label95;
      localb.rma.add(paramInt2, str);
    }
    while (true)
    {
      this.rlW.crP.getIntent().putExtra("sns_kemdia_path_list", this.rlW.rlP.rma);
      AppMethodBeat.o(38477);
      return;
      label95: localb.rma.add(str);
    }
  }

  public final void removeItem(int paramInt)
  {
    AppMethodBeat.i(38478);
    ag.b localb = this.rlW.rlP;
    if (localb.rma.size() > paramInt)
      localb.rma.remove(paramInt);
    if ((this.rlW.crP instanceof SnsUploadUI))
      ((SnsUploadUI)this.rlW.crP).cuE();
    this.rlW.crP.getIntent().putExtra("sns_kemdia_path_list", this.rlW.rlP.rma);
    ((e)this.rlW.rlQ).Eu(this.rlW.rlP.rma.size());
    AppMethodBeat.o(38478);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ag.2
 * JD-Core Version:    0.6.2
 */