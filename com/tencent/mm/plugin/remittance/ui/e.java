package com.tencent.mm.plugin.remittance.ui;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;
import java.lang.ref.WeakReference;

public final class e
{
  WeakReference<Context> bSI;

  public static e cfP()
  {
    try
    {
      e locale = e.a.pSh;
      return locale;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final c a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(44867);
    ab.w("MicroMsg.RemittanceBusiDialogMgr", "showAlert2() msg:%s, title:%s", new Object[] { bo.nullAsNil(paramString), bo.nullAsNil(null) });
    Context localContext = (Context)this.bSI.get();
    if (localContext == null)
    {
      ab.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
      AppMethodBeat.o(44867);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = h.a(localContext, paramString, null, false, paramOnClickListener);
      AppMethodBeat.o(44867);
    }
  }

  public final c a(String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(44866);
    ab.w("MicroMsg.RemittanceBusiDialogMgr", "showAlert1() msg:%s, title:%s, yes:%s, no:%s", new Object[] { bo.nullAsNil(paramString1), bo.nullAsNil(paramString2), bo.nullAsNil(paramString3), bo.nullAsNil(paramString4) });
    Context localContext = (Context)this.bSI.get();
    if (localContext == null)
    {
      ab.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
      paramString1 = null;
      AppMethodBeat.o(44866);
    }
    while (true)
    {
      return paramString1;
      paramString1 = h.d(localContext, paramString1, paramString2, paramString3, paramString4, paramOnClickListener1, paramOnClickListener2);
      AppMethodBeat.o(44866);
    }
  }

  public final void eL(Context paramContext)
  {
    AppMethodBeat.i(44865);
    this.bSI = new WeakReference(paramContext);
    AppMethodBeat.o(44865);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.e
 * JD-Core Version:    0.6.2
 */