package com.tencent.mm.plugin.webview.modeltools;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.ap;
import com.tencent.mm.plugin.webview.ui.tools.k;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.io.File;

public final class d
{
  private String uoA = null;
  private String uoB = null;
  private ValueCallback<Uri> uoC = null;
  private ValueCallback<Uri[]> uoD = null;
  public Pair<Intent, Integer> uoE = null;

  private Uri a(MMActivity paramMMActivity, int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(6927);
    if (paramInt != -1)
    {
      paramMMActivity = null;
      AppMethodBeat.o(6927);
    }
    label399: 
    while (true)
    {
      return paramMMActivity;
      Object localObject1 = null;
      Object localObject2;
      if (paramIntent != null)
      {
        localObject1 = null;
        if (paramIntent.getData() != null)
          break label157;
        localObject2 = paramIntent.getExtras();
        if (localObject2 != null)
        {
          if (((Bundle)localObject2).getParcelable("android.intent.extra.STREAM") != null)
            localObject1 = (Uri)((Bundle)localObject2).getParcelable("android.intent.extra.STREAM");
        }
        else
        {
          label71: localObject1 = bo.h(paramMMActivity, (Uri)localObject1);
          ab.i("MicroMsg.WebViewUI.FileChooser", "get file path:[%s]", new Object[] { localObject1 });
        }
      }
      else
      {
        if (bo.isNullOrNil((String)localObject1))
          break label399;
        paramMMActivity = u.ako((String)localObject1);
        ab.d("MicroMsg.WebViewUI.FileChooser", "get file mime type [%s]", new Object[] { paramMMActivity });
        if (!bo.isNullOrNil(this.uoA))
          break label166;
        paramInt = 1;
      }
      while (true)
      {
        if (paramInt != 0)
          break label356;
        paramMMActivity = null;
        AppMethodBeat.o(6927);
        break;
        localObject1 = null;
        break label71;
        label157: localObject1 = paramIntent.getData();
        break label71;
        label166: localObject2 = this.uoA.split(",");
        int i = localObject2.length;
        label345: for (paramInt = 0; ; paramInt++)
        {
          if (paramInt >= i)
            break label351;
          Object localObject3 = localObject2[paramInt].replace(" ", "");
          boolean bool;
          if (bo.isNullOrNil((String)localObject3))
            bool = true;
          while (true)
          {
            if (!bool)
              break label345;
            paramInt = 1;
            break;
            if (!bo.isNullOrNil(paramMMActivity))
            {
              if ((!((String)localObject3).contains("/")) || (!paramMMActivity.contains("/")))
              {
                bool = ((String)localObject3).equals(paramMMActivity);
              }
              else
              {
                String[] arrayOfString = ((String)localObject3).split("/");
                localObject3 = paramMMActivity.split("/");
                if (bo.nullAsNil(arrayOfString[0]).equals(localObject3[0]))
                {
                  if ((bo.nullAsNil(arrayOfString[1]).equals("*")) || (bo.nullAsNil(arrayOfString[1]).equals(localObject3[1])))
                  {
                    bool = true;
                    continue;
                  }
                  bool = false;
                }
              }
            }
            else
              bool = false;
          }
        }
        label351: paramInt = 0;
      }
      label356: if (paramIntent.getData() == null)
      {
        paramMMActivity = Uri.fromFile(new File((String)localObject1));
        AppMethodBeat.o(6927);
      }
      else
      {
        paramMMActivity = paramIntent.getData();
        AppMethodBeat.o(6927);
        continue;
        paramMMActivity = new File(ap.aez(this.uoB));
        if (paramMMActivity.exists())
        {
          paramMMActivity = Uri.fromFile(paramMMActivity);
          AppMethodBeat.o(6927);
        }
        else
        {
          paramMMActivity = null;
          AppMethodBeat.o(6927);
        }
      }
    }
  }

  private static String aeS(String paramString)
  {
    AppMethodBeat.i(6930);
    if (("user".equalsIgnoreCase(paramString)) || ("environment".equalsIgnoreCase(paramString)))
    {
      paramString = "true";
      AppMethodBeat.o(6930);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(6930);
    }
  }

  private void r(Uri paramUri)
  {
    AppMethodBeat.i(6931);
    if (this.uoC != null)
    {
      this.uoC.onReceiveValue(paramUri);
      AppMethodBeat.o(6931);
    }
    while (true)
    {
      return;
      if (this.uoD != null)
      {
        if (paramUri == null)
        {
          this.uoD.onReceiveValue(null);
          AppMethodBeat.o(6931);
        }
        else
        {
          this.uoD.onReceiveValue(new Uri[] { paramUri });
        }
      }
      else
        AppMethodBeat.o(6931);
    }
  }

  public final void a(Activity paramActivity, k paramk, ValueCallback<Uri> paramValueCallback, ValueCallback<Uri[]> paramValueCallback1, String paramString1, String paramString2)
  {
    AppMethodBeat.i(6929);
    ab.i("MicroMsg.WebViewUI.FileChooser", "openFileChooser with wvPerm(%s), callback(%s), callbackLL(%s), acceptType(%s), capture(%s)", new Object[] { paramk, paramValueCallback, paramValueCallback1, paramString1, paramString2 });
    cYx();
    if ((paramk == null) || (paramk.cZS() == null))
    {
      ab.e("MicroMsg.WebViewUI.FileChooser", "openFileChooser fail, wvPerm is null");
      r(null);
      AppMethodBeat.o(6929);
    }
    while (true)
    {
      return;
      if (!paramk.cZS().jB(56))
      {
        ab.e("MicroMsg.WebViewUI.FileChooser", "open file chooser failed, permission fail");
        r(null);
        AppMethodBeat.o(6929);
      }
      else
      {
        this.uoC = paramValueCallback;
        this.uoD = paramValueCallback1;
        this.uoB = System.currentTimeMillis();
        this.uoA = paramString1;
        paramk = ap.av(paramString1, aeS(paramString2), this.uoB);
        if (!b.o(paramActivity, "android.permission.CAMERA"))
        {
          b.b(paramActivity, "android.permission.CAMERA", 119);
          this.uoE = Pair.create(paramk, Integer.valueOf(1));
          ab.e("MicroMsg.WebViewUI.FileChooser", "openFileChooser no Permission");
          AppMethodBeat.o(6929);
        }
        else
        {
          try
          {
            paramActivity.startActivityForResult(paramk, 1);
            AppMethodBeat.o(6929);
          }
          catch (Exception paramActivity)
          {
            ab.e("MicroMsg.WebViewUI.FileChooser", "openFileChooser e = %s", new Object[] { paramActivity });
            AppMethodBeat.o(6929);
          }
        }
      }
    }
  }

  public final void b(MMActivity paramMMActivity, int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(6928);
    if ((this.uoC == null) && (this.uoD == null))
    {
      ab.w("MicroMsg.WebViewUI.FileChooser", "uploadFileCallback is null.");
      AppMethodBeat.o(6928);
    }
    while (true)
    {
      return;
      paramMMActivity = a(paramMMActivity, paramInt, paramIntent);
      ab.d("MicroMsg.WebViewUI.FileChooser", "result = ".concat(String.valueOf(paramMMActivity)));
      r(paramMMActivity);
      cYx();
      AppMethodBeat.o(6928);
    }
  }

  public final boolean b(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = true;
    AppMethodBeat.i(6926);
    if (this.uoE != null)
      AppMethodBeat.o(6926);
    while (true)
    {
      return bool;
      if (paramInt1 == 1)
      {
        b(paramMMActivity, paramInt2, paramIntent);
        AppMethodBeat.o(6926);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(6926);
      }
    }
  }

  public final void cYx()
  {
    this.uoA = null;
    this.uoC = null;
    this.uoD = null;
    this.uoB = null;
    this.uoE = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.d
 * JD-Core Version:    0.6.2
 */