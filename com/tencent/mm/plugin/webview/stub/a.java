package com.tencent.mm.plugin.webview.stub;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public static final boolean bl(Context paramContext, String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(7058);
    boolean bool2;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(7058);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        paramContext = u.getPackageInfo(paramContext, "com.tencent.weread");
        if (paramContext != null);
        for (bool2 = true; ; bool2 = false)
        {
          ab.d("MicroMsg.ConstantsWebViewStub", "isWeReadSupportShare(%s).", new Object[] { Boolean.valueOf(bool2) });
          if (paramContext != null)
            break label76;
          AppMethodBeat.o(7058);
          bool2 = bool1;
          break;
        }
        label76: bool2 = Uri.parse(paramString).getHost().startsWith("mp.weixin.qq.com");
        if (!bool2)
        {
          AppMethodBeat.o(7058);
          bool2 = bool1;
        }
        else
        {
          int i = paramContext.versionCode;
          if (i > 2000812)
          {
            AppMethodBeat.o(7058);
            bool2 = true;
          }
        }
      }
      catch (Exception paramContext)
      {
        ab.e("MicroMsg.ConstantsWebViewStub", "exception has occurred in isQzoneSupportShare(), e : %s.", new Object[] { paramContext.getMessage() });
        AppMethodBeat.o(7058);
        bool2 = bool1;
      }
    }
  }

  public static final boolean fq(Context paramContext)
  {
    boolean bool1 = true;
    AppMethodBeat.i(7057);
    try
    {
      paramContext = u.getPackageInfo(paramContext, "com.tencent.mobileqq");
      if (paramContext != null);
      for (bool2 = true; ; bool2 = false)
      {
        ab.d("MicroMsg.ConstantsWebViewStub", "isQQSupportShare(%s).", new Object[] { Boolean.valueOf(bool2) });
        if (paramContext == null)
          break;
        AppMethodBeat.o(7057);
        bool2 = bool1;
        return bool2;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.ConstantsWebViewStub", "exception has occurred in isQQSupportShare(), e : %s.", new Object[] { paramContext.getMessage() });
        AppMethodBeat.o(7057);
        boolean bool2 = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.a
 * JD-Core Version:    0.6.2
 */