package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class IPCallRechargeUI$7 extends ClickableSpan
{
  IPCallRechargeUI$7(IPCallRechargeUI paramIPCallRechargeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22257);
    ((TextView)paramView).setHighlightColor(this.nEu.getResources().getColor(2131690597));
    Intent localIntent = new Intent();
    paramView = this.nEu.getString(2131300762) + "&usedcc=";
    Object localObject = com.tencent.mm.plugin.ipcall.a.c.bHc().bHf();
    int i;
    if (((List)localObject).size() > 0)
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
          break label251;
        paramView = paramView + str + "|";
      }
    }
    label251: 
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
        d.b(this.nEu, "webview", ".ui.tools.WebViewUI", localIntent);
        AppMethodBeat.o(22257);
        return;
      }
    }
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(22258);
    paramTextPaint.setColor(this.nEu.getResources().getColor(2131690208));
    paramTextPaint.setUnderlineText(false);
    AppMethodBeat.o(22258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI.7
 * JD-Core Version:    0.6.2
 */