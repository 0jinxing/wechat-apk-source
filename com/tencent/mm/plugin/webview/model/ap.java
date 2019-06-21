package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.webview.modeltools.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONStringer;

public final class ap
{
  public static String ab(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(6754);
    if (paramArrayList.size() == 0)
    {
      ab.e("MicroMsg.WebviewJSSDKUtil", "data is null");
      paramArrayList = null;
      AppMethodBeat.o(6754);
    }
    while (true)
    {
      return paramArrayList;
      JSONArray localJSONArray = new JSONArray();
      for (int i = 0; i < paramArrayList.size(); i++)
        localJSONArray.put((String)paramArrayList.get(i));
      paramArrayList = localJSONArray.toString();
      AppMethodBeat.o(6754);
    }
  }

  public static String ac(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(6755);
    if (paramArrayList.size() == 0)
    {
      ab.e("MicroMsg.WebviewJSSDKUtil", "data is null");
      paramArrayList = "";
      AppMethodBeat.o(6755);
    }
    while (true)
    {
      return paramArrayList;
      JSONStringer localJSONStringer = new JSONStringer();
      try
      {
        localJSONStringer.array();
        localJSONStringer.object();
        for (int i = 0; i < paramArrayList.size(); i++)
        {
          String str = (String)paramArrayList.get(i);
          localJSONStringer.key("localId");
          localJSONStringer.value(str);
        }
        localJSONStringer.endObject();
        localJSONStringer.endArray();
        paramArrayList = localJSONStringer.toString();
        AppMethodBeat.o(6755);
      }
      catch (Exception paramArrayList)
      {
        ab.printErrStackTrace("MicroMsg.WebviewJSSDKUtil", paramArrayList, "", new Object[0]);
        paramArrayList = "";
        AppMethodBeat.o(6755);
      }
    }
  }

  private static Intent aeA(String paramString)
  {
    AppMethodBeat.i(6748);
    Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
    paramString = aez(paramString);
    localIntent.putExtra("output", k.d(ah.getContext(), new File(paramString)));
    AppMethodBeat.o(6748);
    return localIntent;
  }

  public static String aeB(String paramString)
  {
    AppMethodBeat.i(6751);
    ab.i("MicroMsg.WebviewJSSDKUtil", "genLocalIdByFilePath, file path is ：%s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(6751);
    }
    while (true)
    {
      return paramString;
      String str = "weixin://resourceid/" + ag.ck(paramString);
      ab.i("MicroMsg.WebviewJSSDKUtil", "gen local id by filepath, filepath : %s, localid : %s", new Object[] { paramString, str });
      AppMethodBeat.o(6751);
      paramString = str;
    }
  }

  public static String aeC(String paramString)
  {
    AppMethodBeat.i(6752);
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = g.cYF().aex(paramString);
    if (localWebViewJSSDKFileItem != null)
    {
      ab.i("MicroMsg.WebviewJSSDKUtil", "get local thumb filepath from local id :%s", new Object[] { localWebViewJSSDKFileItem.hGG });
      paramString = localWebViewJSSDKFileItem.hGG;
      AppMethodBeat.o(6752);
    }
    while (true)
    {
      return paramString;
      ab.e("MicroMsg.WebviewJSSDKUtil", "fromLocalIdToFilePath, local map not contains the local id : %s", new Object[] { paramString });
      paramString = null;
      AppMethodBeat.o(6752);
    }
  }

  public static String aeD(String paramString)
  {
    AppMethodBeat.i(6753);
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = g.cYF().aex(paramString);
    if (localWebViewJSSDKFileItem != null)
    {
      ab.i("MicroMsg.WebviewJSSDKUtil", "get orignal filepath from local id :%s", new Object[] { localWebViewJSSDKFileItem.hGG });
      paramString = localWebViewJSSDKFileItem.heo;
      AppMethodBeat.o(6753);
    }
    while (true)
    {
      return paramString;
      ab.e("MicroMsg.WebviewJSSDKUtil", "getOrigFilePathByLocalId, local map not contains the local id : %s", new Object[] { paramString });
      paramString = null;
      AppMethodBeat.o(6753);
    }
  }

  static InputStream aeE(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(6757);
    ab.i("MicroMsg.WebviewJSSDKUtil", "getDataFromLocalId : %s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(6757);
    for (paramString = localObject; ; paramString = localObject)
    {
      while (true)
      {
        return paramString;
        if ((!bo.isNullOrNil(paramString)) && (com.tencent.mm.a.e.ct(paramString)))
          try
          {
            FileInputStream localFileInputStream = new java/io/FileInputStream;
            localFileInputStream.<init>(paramString);
            AppMethodBeat.o(6757);
            paramString = localFileInputStream;
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.WebviewJSSDKUtil", "init file input stream error : %s", new Object[] { paramString.getMessage() });
          }
      }
      AppMethodBeat.o(6757);
    }
  }

  public static String aeF(String paramString)
  {
    AppMethodBeat.i(6758);
    paramString = "_USER_FOR_WEBVIEW_JSAPI" + p.m(paramString, bo.anU());
    AppMethodBeat.o(6758);
    return paramString;
  }

  public static String aez(String paramString)
  {
    AppMethodBeat.i(6747);
    Object localObject = new File(com.tencent.mm.compatible.util.e.euR);
    if (!((File)localObject).mkdirs())
      ab.i("MicroMsg.WebviewJSSDKUtil", "mkdirs failed.File is exist = " + ((File)localObject).exists());
    if (!((File)localObject).exists())
      ab.e("MicroMsg.WebviewJSSDKUtil", "camera storage path do not exist.(%s)", new Object[] { com.tencent.mm.compatible.util.e.euR });
    localObject = ((File)localObject).getAbsolutePath() + File.separator + paramString + ".jpg";
    ab.i("MicroMsg.WebviewJSSDKUtil", "get file path from capture file name : %s == %s", new Object[] { paramString, localObject });
    AppMethodBeat.o(6747);
    return localObject;
  }

  public static Intent av(String paramString1, String paramString2, String paramString3)
  {
    int i = 1;
    AppMethodBeat.i(6746);
    Intent localIntent = new Intent("android.intent.action.GET_CONTENT");
    localIntent.addCategory("android.intent.category.OPENABLE");
    Object localObject;
    if (bo.isNullOrNil(paramString1))
    {
      localIntent.setType("*/*");
      localObject = null;
      if (bo.isNullOrNil(paramString2))
        break label345;
      if (!"camera".equalsIgnoreCase(paramString2))
        break label159;
      paramString1 = aeA(paramString3);
      i = 0;
      paramString1 = new Intent[] { paramString1 };
    }
    while (true)
    {
      label79: if ((i != 0) || (paramString1 == null) || (paramString1.length == 0))
      {
        paramString2 = new Intent("android.intent.action.CHOOSER");
        paramString2.putExtra("android.intent.extra.INITIAL_INTENTS", paramString1);
        paramString2.putExtra("android.intent.extra.TITLE", ah.getContext().getString(2131305722));
        paramString2.putExtra("android.intent.extra.INTENT", localIntent);
        AppMethodBeat.o(6746);
        paramString1 = paramString2;
      }
      while (true)
      {
        return paramString1;
        localIntent.setType(paramString1);
        break;
        label159: if ("camcorder".equalsIgnoreCase(paramString2))
        {
          paramString1 = cXQ();
          i = 0;
          paramString1 = new Intent[] { paramString1 };
          break label79;
        }
        if ("microphone".equalsIgnoreCase(paramString2))
        {
          paramString1 = cXR();
          i = 0;
          paramString1 = new Intent[] { paramString1 };
          break label79;
        }
        if ((!"*".equalsIgnoreCase(paramString2)) && (!"true".equalsIgnoreCase(paramString2)) && (!"false".equalsIgnoreCase(paramString2)))
          break label393;
        if (paramString1.equalsIgnoreCase("image/*"))
        {
          paramString1 = new Intent[1];
          paramString1[0] = aeA(paramString3);
          paramString3 = paramString1;
        }
        while (true)
        {
          if ((!"false".equalsIgnoreCase(paramString2)) && (!"*".equalsIgnoreCase(paramString2)))
            break label400;
          paramString1 = paramString3;
          break;
          if (paramString1.equalsIgnoreCase("audio/*"))
          {
            paramString3 = new Intent[1];
            paramString3[0] = cXR();
          }
          else
          {
            paramString3 = localObject;
            if (paramString1.equalsIgnoreCase("video/*"))
            {
              paramString3 = new Intent[1];
              paramString3[0] = cXQ();
            }
          }
        }
        label345: if (!d.fP(16))
          break label393;
        ab.i("MicroMsg.WebviewJSSDKUtil", "android API version is below 16.");
        paramString1 = aeA(paramString3);
        i = 0;
        paramString1 = new Intent[] { paramString1 };
        break label79;
        paramString1 = paramString1[0];
        AppMethodBeat.o(6746);
      }
      label393: i = 0;
      paramString1 = null;
      continue;
      label400: i = 0;
      paramString1 = paramString3;
    }
  }

  public static String c(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(6756);
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.WebviewJSSDKUtil", "parseVideoItemToJson localId is null");
      paramString1 = "";
      AppMethodBeat.o(6756);
    }
    while (true)
    {
      return paramString1;
      JSONStringer localJSONStringer = new JSONStringer();
      try
      {
        localJSONStringer.array();
        localJSONStringer.object();
        localJSONStringer.key("localId");
        localJSONStringer.value(paramString1);
        localJSONStringer.key("thumbLocalId");
        localJSONStringer.value(paramString2);
        localJSONStringer.key("duration");
        localJSONStringer.value(String.valueOf(paramInt1));
        localJSONStringer.key("height");
        localJSONStringer.value(String.valueOf(paramInt2));
        localJSONStringer.key("width");
        localJSONStringer.value(String.valueOf(paramInt3));
        localJSONStringer.key("size");
        localJSONStringer.value(String.valueOf(paramInt4));
        localJSONStringer.endObject();
        localJSONStringer.endArray();
        paramString1 = localJSONStringer.toString();
        AppMethodBeat.o(6756);
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("MicroMsg.WebviewJSSDKUtil", paramString1, "", new Object[0]);
        paramString1 = "";
        AppMethodBeat.o(6756);
      }
    }
  }

  private static Intent cXQ()
  {
    AppMethodBeat.i(6749);
    Intent localIntent = new Intent("android.media.action.VIDEO_CAPTURE");
    AppMethodBeat.o(6749);
    return localIntent;
  }

  private static Intent cXR()
  {
    AppMethodBeat.i(6750);
    Intent localIntent = new Intent("android.provider.MediaStore.RECORD_SOUND");
    AppMethodBeat.o(6750);
    return localIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.ap
 * JD-Core Version:    0.6.2
 */