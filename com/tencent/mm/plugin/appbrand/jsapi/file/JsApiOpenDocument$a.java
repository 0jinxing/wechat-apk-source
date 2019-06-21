package com.tencent.mm.plugin.appbrand.jsapi.file;

import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Window;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.pluginsdk.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.g;
import com.tencent.mm.ui.MMActivity;
import java.io.File;

final class JsApiOpenDocument$a extends AppBrandProxyUIProcessTask
{
  private static final int hJQ;

  static
  {
    AppMethodBeat.i(131067);
    hJQ = a.class.hashCode() & 0xFFFF;
    AppMethodBeat.o(131067);
  }

  private void cf(String paramString1, String paramString2)
  {
    AppMethodBeat.i(131061);
    paramString2 = com.tencent.mm.sdk.f.b.anI(paramString2);
    JsApiOpenDocument.OpenResult localOpenResult = new JsApiOpenDocument.OpenResult();
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      localIntent.setPackage(null);
      localIntent.setAction("android.intent.action.VIEW");
      File localFile = new java/io/File;
      localFile.<init>(paramString1);
      localIntent.setDataAndType(Uri.fromFile(localFile), paramString2);
      localIntent.addFlags(268435456);
      int i = Build.VERSION.SDK_INT;
      localIntent.addFlags(524288);
      aBQ().startActivity(localIntent);
      localOpenResult.ret = 0;
      a(localOpenResult);
      AppMethodBeat.o(131061);
      return;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.JsApiOpenDocument", "start outer view with mime(%s), e = %s", new Object[] { paramString2, paramString1 });
        localOpenResult.ret = 2147483646;
        al.d(new JsApiOpenDocument.a.1(this));
      }
    }
  }

  public final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
  {
    AppMethodBeat.i(131062);
    String str1 = ((JsApiOpenDocument.OpenRequest)paramProcessRequest).filePath;
    paramProcessRequest = ((JsApiOpenDocument.OpenRequest)paramProcessRequest).eov;
    String str2 = Integer.toString(aBQ().hashCode());
    if (g.dnY())
    {
      cf(str1, paramProcessRequest);
      AppMethodBeat.o(131062);
    }
    while (true)
    {
      return;
      int i = p.a(aBQ(), str1, paramProcessRequest, str2, new ValueCallback()
      {
      });
      ab.i("MicroMsg.AppBrand.JsApiOpenDocument", "QB openReadFile, ret = %d", new Object[] { Integer.valueOf(i) });
      if (i == -102)
      {
        try
        {
          cf(str1, paramProcessRequest);
          AppMethodBeat.o(131062);
        }
        catch (Exception paramProcessRequest)
        {
          ab.printErrStackTrace("MicroMsg.AppBrand.JsApiOpenDocument", paramProcessRequest, " openOuterAppDirectly exp = %s ", new Object[] { paramProcessRequest });
        }
      }
      else
      {
        paramProcessRequest = new JsApiOpenDocument.OpenResult();
        paramProcessRequest.ret = i;
        if (paramProcessRequest.ret != 0)
        {
          a(paramProcessRequest);
          AppMethodBeat.o(131062);
        }
        else
        {
          if (this.hvt != null)
            this.hvt.b(paramProcessRequest);
          AppMethodBeat.o(131062);
        }
      }
    }
  }

  public final void aBX()
  {
    AppMethodBeat.i(131063);
    super.aBX();
    aBQ().getWindow().setBackgroundDrawableResource(2131690597);
    AppMethodBeat.o(131063);
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131064);
    if (hJQ == paramInt1)
    {
      paramIntent = new JsApiOpenDocument.OpenResult();
      if (-1 == paramInt2)
      {
        paramIntent.ret = 0;
        a(paramIntent);
        AppMethodBeat.o(131064);
      }
    }
    while (true)
    {
      return;
      paramIntent.ret = 2147483647;
      break;
      a(null);
      AppMethodBeat.o(131064);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.JsApiOpenDocument.a
 * JD-Core Version:    0.6.2
 */