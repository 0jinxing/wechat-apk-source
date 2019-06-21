package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.ui.base.n.d;

final class e$2
  implements n.d
{
  e$2(Context paramContext)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(124869);
    switch (paramMenuItem.getItemId())
    {
    case 3:
    case 5:
    case 6:
    case 7:
    default:
      AppMethodBeat.o(124869);
    case 1:
    case 4:
    case 2:
      while (true)
      {
        return;
        com.tencent.mm.plugin.b.a.wA("F100_100_QQ");
        paramMenuItem = new StringBuilder();
        g.RN();
        paramMenuItem = paramMenuItem.append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.val$context.getClass().getName()).append(",F100_100_QQ,");
        g.RN();
        com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("F100_100_QQ") + ",1");
        e.Q(this.val$context, this.val$context.getString(2131304191));
        AppMethodBeat.o(124869);
        continue;
        Context localContext = this.val$context;
        String str1 = this.gBs;
        String str2 = this.gBt;
        String str3 = this.gBu;
        com.tencent.mm.plugin.b.a.wA("F100_100_phone");
        paramMenuItem = new StringBuilder();
        g.RN();
        paramMenuItem = paramMenuItem.append(com.tencent.mm.kernel.a.Rb()).append(",").append(localContext.getClass().getName()).append(",F100_100_phone,");
        g.RN();
        com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("F100_100_phone") + ",1");
        if (d.vxr)
        {
          Toast.makeText(localContext, localContext.getString(2131296515), 0).show();
          AppMethodBeat.o(124869);
        }
        else
        {
          Intent localIntent = new Intent(localContext, MobileInputUI.class);
          if (str2 != null)
          {
            paramInt = str2.indexOf("+");
            paramMenuItem = str2;
            if (paramInt != -1)
            {
              paramMenuItem = str2;
              if (str2.length() > 0)
                paramMenuItem = str2.substring(paramInt + 1);
            }
            localIntent.putExtra("couttry_code", paramMenuItem);
          }
          if (str1 != null)
            localIntent.putExtra("country_name", str1);
          if (str3 != null)
            localIntent.putExtra("bindmcontact_shortmobile", str3);
          localIntent.putExtra("mobile_input_purpose", 1);
          localContext.startActivity(localIntent);
          AppMethodBeat.o(124869);
          continue;
          com.tencent.mm.plugin.b.a.wA("F100_100_Email");
          paramMenuItem = new StringBuilder();
          g.RN();
          paramMenuItem = paramMenuItem.append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.val$context.getClass().getName()).append(",F100_100_Email,");
          g.RN();
          com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("F100_100_Email") + ",1");
          e.Q(this.val$context, this.val$context.getString(2131305914) + aa.dor());
          AppMethodBeat.o(124869);
        }
      }
    case 8:
    }
    paramMenuItem = this.val$context.getString(2131305634);
    if (aa.dor().equals("zh_CN"));
    for (paramMenuItem = paramMenuItem + "zh_CN"; ; paramMenuItem = "https://help.wechat.com/cgi-bin/newreadtemplate?t=help_center/w_index&Channel=Client&lang=")
    {
      e.Q(this.val$context, paramMenuItem);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.e.2
 * JD-Core Version:    0.6.2
 */