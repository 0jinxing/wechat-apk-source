package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class IPCallShareCouponUI$3
  implements View.OnClickListener
{
  IPCallShareCouponUI$3(IPCallShareCouponUI paramIPCallShareCouponUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22319);
    Intent localIntent = new Intent();
    paramView = this.nFI.getString(2131300762) + "&usedcc=";
    Object localObject = com.tencent.mm.plugin.ipcall.a.c.bHc().bHf();
    int i;
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      i = ((List)localObject).size();
      int j = i;
      if (i > 5)
        j = 5;
      i = 0;
      if (i < j)
      {
        String str = a.Pr(((Integer)((List)localObject).get(i)).toString());
        if (bo.isNullOrNil(str))
          break label236;
        paramView = paramView + str + "|";
      }
    }
    label236: 
    while (true)
    {
      i++;
      break;
      localObject = paramView;
      if (paramView.endsWith("|"));
      for (localObject = paramView.substring(0, paramView.length() - 1); ; localObject = paramView + a.Pr(com.tencent.mm.plugin.ipcall.b.c.bIR()))
      {
        localIntent.putExtra("rawUrl", (String)localObject);
        localIntent.putExtra("showShare", false);
        d.b(this.nFI, "webview", ".ui.tools.WebViewUI", localIntent);
        AppMethodBeat.o(22319);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.3
 * JD-Core Version:    0.6.2
 */