package com.tencent.mm.ui.chatting.viewitems;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.lang.ref.WeakReference;
import java.util.Map;

final class am$d$1
  implements Runnable
{
  am$d$1(s params)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(33350);
    Object localObject = (WeakReference)am.d.aEd().get(this.zhm.getFileName());
    if (localObject == null)
    {
      ab.w("MicroMsg.VideoItemHoder", "update status, filename %s, holder not found", new Object[] { this.zhm.getFileName() });
      AppMethodBeat.o(33350);
    }
    while (true)
    {
      return;
      localObject = (am.d)((WeakReference)localObject).get();
      if (localObject == null)
      {
        ab.w("MicroMsg.VideoItemHoder", "update status, filename %s, holder gc!", new Object[] { this.zhm.getFileName() });
        AppMethodBeat.o(33350);
      }
      else
      {
        ((am.d)localObject).zbR.setVisibility(8);
        ((am.d)localObject).raP.setVisibility(8);
        ((am.d)localObject).zhp.setVisibility(0);
        int i = this.zhm.status;
        ab.i("MicroMsg.VideoItemHoder", "updateStatus videoStatus : ".concat(String.valueOf(i)));
        if ((i == 112) || (i == 122) || (i == 120))
        {
          ((am.d)localObject).zhp.setProgress(u.g(this.zhm));
          AppMethodBeat.o(33350);
        }
        else
        {
          ((am.d)localObject).zhp.setProgress(u.h(this.zhm));
          AppMethodBeat.o(33350);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.am.d.1
 * JD-Core Version:    0.6.2
 */