package com.tencent.mm.plugin.sns.ui;

import android.widget.Gallery;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.h.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.a.a;
import com.tencent.mm.ui.base.MultiTouchImageView.a;

final class SnsInfoFlip$6
  implements MultiTouchImageView.a
{
  SnsInfoFlip$6(SnsInfoFlip paramSnsInfoFlip)
  {
  }

  public final void ctq()
  {
    AppMethodBeat.i(38972);
    if ((SnsInfoFlip.g(this.rsU).getSelectedItem() == null) || (SnsInfoFlip.d(this.rsU) == null))
      AppMethodBeat.o(38972);
    while (true)
    {
      return;
      int i = SnsInfoFlip.g(this.rsU).getSelectedItemPosition();
      Object localObject = ((b)SnsInfoFlip.g(this.rsU).getSelectedItem()).qQd;
      localObject = af.cnF().YT((String)localObject);
      if (localObject != null)
        a.d((n)localObject, i);
      AppMethodBeat.o(38972);
    }
  }

  public final void ctr()
  {
    AppMethodBeat.i(38973);
    if ((SnsInfoFlip.g(this.rsU).getSelectedItem() == null) || (SnsInfoFlip.d(this.rsU) == null))
      AppMethodBeat.o(38973);
    while (true)
    {
      return;
      int i = SnsInfoFlip.g(this.rsU).getSelectedItemPosition();
      Object localObject = ((b)SnsInfoFlip.g(this.rsU).getSelectedItem()).qQd;
      localObject = af.cnF().YT((String)localObject);
      if (localObject != null)
        a.e((n)localObject, i);
      AppMethodBeat.o(38973);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsInfoFlip.6
 * JD-Core Version:    0.6.2
 */