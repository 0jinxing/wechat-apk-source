package com.tencent.mm.pluginsdk;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.protocal.protobuf.ciq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;

final class e$4
  implements e.a
{
  e$4(ProgressDialog paramProgressDialog, Context paramContext)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(11658);
    ab.i("MicroMsg.DeepLinkHelper", "DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Boolean.valueOf(paramBoolean) });
    if ((this.vas != null) && (this.vas.isShowing()))
      this.vas.dismiss();
    if ((paramm != null) && (paramInt1 != 0) && (paramInt2 != 0) && ((paramm instanceof z)))
    {
      paramString = ((z)paramm).ajE();
      if ((paramString != null) && (this.val$context != null))
        t.makeText(this.val$context, this.val$context.getString(2131297061) + " : " + bo.nullAsNil(paramString.xhy), 0).show();
    }
    AppMethodBeat.o(11658);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.4
 * JD-Core Version:    0.6.2
 */