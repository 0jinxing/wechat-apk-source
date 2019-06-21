package com.tencent.mm.wallet_core.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.ui.base.h.d;

final class e$1
  implements h.d
{
  e$1(Context paramContext, String paramString)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49256);
    Intent localIntent = new Intent();
    switch (paramInt1)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      localIntent.putExtra("showShare", false);
      d.b(this.val$context, "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(49256);
      return;
      localIntent.putExtra("rawUrl", this.val$context.getString(2131304510, new Object[] { aa.dor() }));
      continue;
      if (this.AhF != null)
      {
        localIntent.putExtra("rawUrl", this.val$context.getString(2131304508, new Object[] { aa.dor(), this.AhF }));
        continue;
        if (this.AhF != null)
        {
          localIntent.putExtra("rawUrl", this.val$context.getString(2131304511, new Object[] { aa.dor(), this.AhF }));
          continue;
          if (this.AhF != null)
            localIntent.putExtra("rawUrl", this.val$context.getString(2131304512, new Object[] { aa.dor(), this.AhF }));
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.e.1
 * JD-Core Version:    0.6.2
 */