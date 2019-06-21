package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f extends com.tencent.mm.plugin.appbrand.jsapi.a<q>
{
  public static final int CTRL_INDEX = 30;
  public static final String NAME = "previewImage";
  private final int hQi = 524288;

  // ERROR //
  private static String Bz(String paramString)
  {
    // Byte code:
    //   0: ldc 28
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: iconst_0
    //   7: invokestatic 40	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   10: astore_1
    //   11: aload_1
    //   12: ifnull +8 -> 20
    //   15: aload_1
    //   16: arraylength
    //   17: ifne +13 -> 30
    //   20: ldc 42
    //   22: astore_0
    //   23: ldc 28
    //   25: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: aload_0
    //   29: areturn
    //   30: new 47	java/io/File
    //   33: dup
    //   34: invokestatic 53	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   37: invokevirtual 59	android/content/Context:getCacheDir	()Ljava/io/File;
    //   40: new 61	java/lang/StringBuilder
    //   43: dup
    //   44: ldc 63
    //   46: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   49: invokestatic 72	java/lang/System:currentTimeMillis	()J
    //   52: invokevirtual 76	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   55: ldc 78
    //   57: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: aload_0
    //   61: invokevirtual 87	java/lang/String:hashCode	()I
    //   64: invokevirtual 90	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   67: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokespecial 97	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   73: astore_2
    //   74: aconst_null
    //   75: astore_3
    //   76: new 99	java/io/FileOutputStream
    //   79: astore_0
    //   80: aload_0
    //   81: aload_2
    //   82: invokespecial 102	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   85: aload_0
    //   86: aload_1
    //   87: invokevirtual 106	java/io/FileOutputStream:write	([B)V
    //   90: aload_0
    //   91: invokevirtual 109	java/io/FileOutputStream:close	()V
    //   94: aload_2
    //   95: invokevirtual 112	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   98: astore_0
    //   99: ldc 28
    //   101: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   104: goto -76 -> 28
    //   107: astore_0
    //   108: aload_3
    //   109: astore_0
    //   110: ldc 42
    //   112: astore_3
    //   113: aload_0
    //   114: ifnull +7 -> 121
    //   117: aload_0
    //   118: invokevirtual 109	java/io/FileOutputStream:close	()V
    //   121: ldc 28
    //   123: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: aload_3
    //   127: astore_0
    //   128: goto -100 -> 28
    //   131: astore_0
    //   132: aconst_null
    //   133: astore_3
    //   134: aload_3
    //   135: ifnull +7 -> 142
    //   138: aload_3
    //   139: invokevirtual 109	java/io/FileOutputStream:close	()V
    //   142: ldc 28
    //   144: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_0
    //   148: athrow
    //   149: astore_0
    //   150: goto -56 -> 94
    //   153: astore_0
    //   154: goto -33 -> 121
    //   157: astore_3
    //   158: goto -16 -> 142
    //   161: astore_3
    //   162: aload_0
    //   163: astore_2
    //   164: aload_3
    //   165: astore_0
    //   166: aload_2
    //   167: astore_3
    //   168: goto -34 -> 134
    //   171: astore_3
    //   172: goto -62 -> 110
    //
    // Exception table:
    //   from	to	target	type
    //   76	85	107	java/lang/Exception
    //   76	85	131	finally
    //   90	94	149	java/io/IOException
    //   117	121	153	java/io/IOException
    //   138	142	157	java/io/IOException
    //   85	90	161	finally
    //   85	90	171	java/lang/Exception
  }

  private String a(Context paramContext, u paramu, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(131298);
    Object localObject1 = paramJSONObject.optJSONArray("urls");
    if (localObject1 == null)
    {
      paramContext = j("fail:invalid data", null);
      AppMethodBeat.o(131298);
      return paramContext;
    }
    Object localObject2 = new String[((JSONArray)localObject1).length()];
    for (int i = 0; i < ((JSONArray)localObject1).length(); i++)
      localObject2[i] = ((JSONArray)localObject1).optString(i);
    paramJSONObject = paramJSONObject.opt("current");
    if ((paramJSONObject instanceof Integer))
      i = ((Integer)paramJSONObject).intValue();
    while (true)
    {
      while (true)
      {
        int j = 0;
        while (j < localObject2.length)
        {
          paramJSONObject = paramu.asE().yg(localObject2[j]);
          if (paramJSONObject != null)
            localObject2[j] = paramJSONObject.getAbsolutePath();
          j++;
          continue;
          if (!(paramJSONObject instanceof String))
            break label819;
          int k = 0;
          for (j = 0; ; j++)
          {
            i = k;
            if (j >= localObject2.length)
              break;
            if (paramJSONObject.equals(localObject2[j]))
              k = j;
          }
        }
        localObject1 = new String[localObject2.length];
        j = 0;
        if (j < localObject2.length)
        {
          if ((localObject2[j] != null) && (localObject2[j].startsWith("data:image/")))
          {
            paramJSONObject = localObject2[j];
            if (TextUtils.isEmpty(paramJSONObject))
            {
              paramJSONObject = "";
              label258: localObject1[j] = paramJSONObject;
            }
          }
          while (true)
          {
            j++;
            break;
            paramJSONObject = Bz(paramJSONObject.substring(paramJSONObject.indexOf("base64,") + 7).trim());
            break label258;
            localObject1[j] = localObject2[j];
          }
        }
        paramJSONObject = new ArrayList();
        for (j = 0; j < localObject1.length; j++)
          if ((localObject1[j] != null) && (localObject2[j] != null) && (!localObject1[j].equals(localObject2[j])))
            paramJSONObject.add(localObject1[j]);
        paramJSONObject = (String[])paramJSONObject.toArray(new String[paramJSONObject.size()]);
        j = i;
        if (i >= localObject1.length)
          j = 0;
        if (!(paramContext instanceof MMActivity))
        {
          paramContext = j("fail:internal error invalid android context", null);
          AppMethodBeat.o(131298);
          break;
        }
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("nowUrl", localObject1[j]);
        ((Intent)localObject2).putExtra("urlList", (String[])localObject1);
        ((Intent)localObject2).putExtra("type", -255);
        ((Intent)localObject2).putExtra("isFromWebView", true);
        localObject1 = (com.tencent.mm.plugin.appbrand.l.a)paramu.aa(com.tencent.mm.plugin.appbrand.l.a.class);
        if ((localObject1 != null) && (!bo.isNullOrNil(((com.tencent.mm.plugin.appbrand.l.a)localObject1).referer)))
        {
          ((Intent)localObject2).putExtra("IsFromWebViewReffer", ((com.tencent.mm.plugin.appbrand.l.a)localObject1).referer);
          ((Intent)localObject2).putExtra("shouldShowScanQrCodeMenu", true);
          ((Intent)localObject2).putExtra("scanQrCodeGetA8KeyScene", 44);
          ((Intent)localObject2).putExtra("scanCodeTypes", new int[] { 3 });
          ((Intent)localObject2).putExtra("scanResultCodeTypes", new int[] { 22 });
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("stat_scene", 6);
          ((Bundle)localObject1).putString("stat_app_id", paramString);
          ((Bundle)localObject1).putString("stat_url", paramu.getURL());
          ((Intent)localObject2).putExtra("_stat_obj", (Bundle)localObject1);
          ((Intent)localObject2).setClassName(paramContext, paramContext.getPackageName() + ".plugin.subapp.ui.gallery.GestureGalleryUI");
        }
        try
        {
          i = ((Intent)localObject2).getExtras().toString().length();
          if (i <= 524288)
            break label764;
          ab.e("MicroMsg.JsApiPreviewImage", "data too large size:%d", new Object[] { Integer.valueOf(i) });
          paramContext = j("fail:data too large", null);
          AppMethodBeat.o(131298);
          break;
          ab.w("MicroMsg.JsApiPreviewImage", "config.referer is null");
        }
        catch (Exception paramContext)
        {
          ab.printErrStackTrace("MicroMsg.JsApiPreviewImage", paramContext, "JsApiPreviewImage get size error", new Object[0]);
          paramContext = j("fail", null);
          AppMethodBeat.o(131298);
        }
      }
      break;
      label764: ((MMActivity)paramContext).ifE = new f.1(this, paramJSONObject);
      d.a(paramContext, "subapp", ".ui.gallery.GestureGalleryUI", (Intent)localObject2, 0xFFFF & hashCode(), false);
      paramContext = j("ok", null);
      AppMethodBeat.o(131298);
      break;
      label819: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.f
 * JD-Core Version:    0.6.2
 */