package com.tencent.mm.plugin.webview.modeltools;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.pluginsdk.ui.tools.AppChooserUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.g;

public final class a
{
  public static Intent a(Activity paramActivity, Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(6911);
    Bundle localBundle = new Bundle();
    localBundle.putString("targeturl", paramString);
    localBundle.putParcelable("targetintent", paramIntent);
    paramString = new Intent();
    paramString.setClass(paramActivity, AppChooserUI.class);
    paramString.putExtra("scene", 4);
    paramString.putExtra("type", 0);
    paramString.putExtra("title", paramActivity.getString(2131298274));
    paramString.putExtra("targetintent", paramIntent);
    paramString.putExtra("transferback", localBundle);
    AppMethodBeat.o(6911);
    return paramString;
  }

  public static boolean d(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(6912);
    String str;
    Bundle localBundle;
    if (2 == paramInt1)
      if ((-1 == paramInt2) && (paramIntent != null))
      {
        str = paramIntent.getStringExtra("selectpkg");
        localBundle = paramIntent.getBundleExtra("transferback");
        bool = paramIntent.getBooleanExtra("isalways", false);
        ab.i("MicroMsg.BrowserChooserHelper", "App Chooser Browser is %s", new Object[] { str });
        s.dhn();
        paramIntent = (o)s.y(0, null);
        if (!paramIntent.aix(str))
          break label217;
        if (paramIntent.fE(paramActivity))
        {
          o.bv(paramActivity, localBundle.getString("targeturl"));
          if (!bool)
            break label187;
          h.pYm.e(10998, new Object[] { Integer.valueOf(4), Integer.valueOf(2) });
        }
      }
      else
      {
        label135: AppMethodBeat.o(6912);
      }
    for (boolean bool = true; ; bool = false)
    {
      while (true)
      {
        return bool;
        paramIntent = new Intent((Intent)localBundle.getParcelable("targetintent"));
        paramIntent.setPackage(str);
        paramIntent.addFlags(524288);
        paramActivity.startActivity(paramIntent);
        break;
        label187: h.pYm.e(10998, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
        break label135;
        label217: paramIntent = new Intent((Intent)localBundle.getParcelable("targetintent"));
        paramIntent.setPackage(str);
        paramIntent.addFlags(524288);
        try
        {
          paramActivity.startActivity(paramIntent);
          h.pYm.e(10998, new Object[] { Integer.valueOf(5) });
          if (bool)
            h.pYm.e(10998, new Object[] { Integer.valueOf(5), Integer.valueOf(2) });
        }
        catch (Exception paramActivity)
        {
          while (true)
            ab.w("MicroMsg.BrowserChooserHelper", "onActivityResult err:%s", new Object[] { paramActivity.getMessage() });
          h.pYm.e(10998, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
        }
      }
      break label135;
      AppMethodBeat.o(6912);
    }
  }

  public static void e(Activity paramActivity, String paramString)
  {
    AppMethodBeat.i(6910);
    if ((paramActivity == null) || (paramActivity.isFinishing()) || (bo.isNullOrNil(paramString)))
      AppMethodBeat.o(6910);
    while (true)
    {
      return;
      String str = paramString;
      if (!paramString.startsWith("http://"))
      {
        str = paramString;
        if (!paramString.startsWith("https://"))
          str = "http://".concat(String.valueOf(paramString));
      }
      paramString = new Intent("android.intent.action.VIEW", Uri.parse(str));
      try
      {
        if ((!bo.gT(paramActivity)) && (!g.dnY()))
          break label132;
        paramActivity.startActivity(paramString);
        AppMethodBeat.o(6910);
      }
      catch (Exception paramActivity)
      {
        ab.e("MicroMsg.BrowserChooserHelper", "open in browser failed : %s", new Object[] { paramActivity.getMessage() });
        AppMethodBeat.o(6910);
      }
      continue;
      label132: paramActivity.startActivityForResult(a(paramActivity, paramString, str), 2);
      AppMethodBeat.o(6910);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.a
 * JD-Core Version:    0.6.2
 */