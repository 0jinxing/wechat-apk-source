package com.tencent.mm.plugin.welab.ui;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import java.util.List;

final class WelabAppInfoUI$5
  implements View.OnClickListener
{
  WelabAppInfoUI$5(WelabAppInfoUI paramWelabAppInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(80603);
    Object localObject = paramView.getTag().toString();
    paramView = new Intent();
    paramView.putExtra("nowUrl", (String)localObject);
    paramView.putExtra("urlList", (String[])((WelabAppInfoUI.a)WelabAppInfoUI.e(this.uMr).getAdapter()).kFl.toArray(new String[0]));
    WelabAppInfoUI localWelabAppInfoUI = this.uMr;
    localObject = new Intent();
    ((Intent)localObject).putExtras(paramView.getExtras());
    if (paramView.getFlags() != 0)
      ((Intent)localObject).addFlags(paramView.getFlags());
    d.b(localWelabAppInfoUI, "subapp", ".ui.gallery.GestureGalleryUI", (Intent)localObject);
    AppMethodBeat.o(80603);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.ui.WelabAppInfoUI.5
 * JD-Core Version:    0.6.2
 */