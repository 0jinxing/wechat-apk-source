package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.base.h;

final class a$2 extends AsyncTask<Integer, Integer, Integer>
{
  private String filePath;
  private Uri uri;
  private boolean zAA;
  private ProgressDialog zAz;

  a$2(Intent paramIntent1, Activity paramActivity, String paramString, a.a parama, Intent paramIntent2, int paramInt)
  {
  }

  private Integer dJy()
  {
    AppMethodBeat.i(107593);
    try
    {
      Object localObject = this.uri;
      if (localObject == null)
        AppMethodBeat.o(107593);
      while (true)
      {
        return null;
        localObject = d.u(this.uri);
        this.filePath = a.v(this.zAC, (Bitmap)localObject);
        AppMethodBeat.o(107593);
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.AsyncObtainImage", localException, "doInBackground", new Object[0]);
    }
  }

  protected final void onPreExecute()
  {
    AppMethodBeat.i(107592);
    try
    {
      this.uri = this.val$data.getData();
      this.zAA = false;
      Activity localActivity = this.zAF;
      this.zAF.getString(2131297061);
      String str = this.zAF.getString(2131296951);
      a.2.1 local1 = new com/tencent/mm/ui/tools/a$2$1;
      local1.<init>(this);
      this.zAz = h.b(localActivity, str, true, local1);
      AppMethodBeat.o(107592);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AsyncObtainImage", localException, "onPreExecute", new Object[0]);
        AppMethodBeat.o(107592);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.2
 * JD-Core Version:    0.6.2
 */