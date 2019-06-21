package com.tencent.mm.plugin.sns.ui.previewimageview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class e$6
  implements Runnable
{
  e$6(e parame, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40326);
    this.rLd.Eu(this.rLf.size());
    this.rLd.rKS.notifyDataSetChanged();
    AppMethodBeat.o(40326);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.e.6
 * JD-Core Version:    0.6.2
 */