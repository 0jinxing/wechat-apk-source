package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.permission.a;
import com.tencent.mm.pluginsdk.permission.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class q$1
  implements d
{
  q$1(Context paramContext, Intent paramIntent, a parama)
  {
  }

  public final void Cp(int paramInt)
  {
    AppMethodBeat.i(79350);
    ab.i("MicroMsg.ApplicationUtil", "onRequestPermissionsResult, resultCode = %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == -1);
    while (true)
    {
      try
      {
        this.val$context.startActivity(this.vcl);
        if (this.kNN == null)
          break label121;
        this.kNN.dT(true);
        AppMethodBeat.o(79350);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.ApplicationUtil", localException, "install app failed! %s", new Object[] { this.vcl });
        continue;
      }
      ab.e("MicroMsg.ApplicationUtil", "no get!!!");
      Toast.makeText(ah.getContext(), 2131301726, 1).show();
      if (this.kNN != null)
        this.kNN.dT(false);
      label121: AppMethodBeat.o(79350);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.q.1
 * JD-Core Version:    0.6.2
 */