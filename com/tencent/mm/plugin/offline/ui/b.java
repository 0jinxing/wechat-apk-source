package com.tencent.mm.plugin.offline.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

public final class b
{
  public static void T(Activity paramActivity)
  {
    AppMethodBeat.i(43471);
    ab.e("MicroMsg.OfflineErrorHelper", "offline code size is 0, show check network error dialog");
    h.a(paramActivity, paramActivity.getString(2131305437), null, false, new b.4(paramActivity));
    AppMethodBeat.o(43471);
  }

  public static void b(Activity paramActivity, String paramString)
  {
    AppMethodBeat.i(43469);
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
      str = paramActivity.getString(2131305389);
    h.a(paramActivity, str, null, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(43465);
        paramAnonymousDialogInterface.dismiss();
        AppMethodBeat.o(43465);
      }
    });
    AppMethodBeat.o(43469);
  }

  public static void c(Activity paramActivity, String paramString1, String paramString2)
  {
    AppMethodBeat.i(43470);
    if (TextUtils.isEmpty(paramString1))
      paramString1 = paramActivity.getString(2131305389);
    while (true)
    {
      if (!bo.isNullOrNil(paramString2))
      {
        ab.i("MicroMsg.OfflineErrorHelper", "error_detail_url is not null ");
        h.a(paramActivity, paramString1, null, paramActivity.getResources().getString(2131304787), paramActivity.getResources().getString(2131296994), true, new b.2(paramString2, paramActivity), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(43467);
            paramAnonymousDialogInterface.dismiss();
            AppMethodBeat.o(43467);
          }
        });
        AppMethodBeat.o(43470);
      }
      while (true)
      {
        return;
        b(paramActivity, paramString1);
        AppMethodBeat.o(43470);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.b
 * JD-Core Version:    0.6.2
 */