package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.platformtools.ah;
import java.lang.ref.WeakReference;

final class o$5
  implements View.OnClickListener
{
  o$5(o paramo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34714);
    if (!ah.M((Context)this.zxg.vlu.get(), this.zxg.zwW))
    {
      paramView = new Intent();
      paramView.putExtra("title", ((Context)this.zxg.vlu.get()).getString(2131301657));
      paramView.putExtra("rawUrl", ((Context)this.zxg.vlu.get()).getString(2131301651));
      paramView.putExtra("showShare", false);
      d.b((Context)this.zxg.vlu.get(), "webview", ".ui.tools.WebViewUI", paramView);
    }
    AppMethodBeat.o(34714);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.o.5
 * JD-Core Version:    0.6.2
 */