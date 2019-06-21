package com.tencent.mm.ui.applet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public final class SecurityImage$a
{
  public static SecurityImage a(Context paramContext, int paramInt, byte[] paramArrayOfByte, String paramString1, String paramString2, final DialogInterface.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener, DialogInterface.OnDismissListener paramOnDismissListener, SecurityImage.b paramb)
  {
    AppMethodBeat.i(106233);
    SecurityImage localSecurityImage = (SecurityImage)View.inflate(paramContext, 2130970579, null);
    localSecurityImage.setNetworkModel(paramb);
    localSecurityImage.a(paramInt, paramArrayOfByte, paramString1, paramString2);
    paramContext = new c.a(paramContext);
    paramContext.PV(2131302328);
    paramContext.Qc(2131296874).a(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(106232);
        paramOnClickListener.onClick(paramAnonymousDialogInterface, paramAnonymousInt);
        AppMethodBeat.o(106232);
      }
    });
    paramContext.f(paramOnCancelListener);
    paramContext.fn(localSecurityImage);
    paramContext.rc(true);
    SecurityImage.a(localSecurityImage, paramContext.aMb());
    SecurityImage.c(localSecurityImage).setOnDismissListener(paramOnDismissListener);
    SecurityImage.c(localSecurityImage).show();
    AppMethodBeat.o(106233);
    return localSecurityImage;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.SecurityImage.a
 * JD-Core Version:    0.6.2
 */