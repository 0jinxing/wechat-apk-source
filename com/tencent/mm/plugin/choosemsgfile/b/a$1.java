package com.tencent.mm.plugin.choosemsgfile.b;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.a.a;
import com.tencent.mm.plugin.choosemsgfile.b.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity.a;

final class a$1
  implements MMActivity.a
{
  a$1(a parama, a.a parama1)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(54249);
    ab.i("MicroMsg.ChooseMsgFileService", "requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    ab.d("MicroMsg.ChooseMsgFileService", "data:%s", new Object[] { paramIntent });
    b.a(paramInt1, paramInt2, paramIntent, this.ktR);
    AppMethodBeat.o(54249);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.a.1
 * JD-Core Version:    0.6.2
 */