package com.tencent.mm.sdk.f;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class b
{
  private static final Map<String, String> xDv;
  private static final Map<String, String> xDw;

  static
  {
    AppMethodBeat.i(65365);
    Object localObject = new ArrayList();
    ((ArrayList)localObject).add(new Pair("silk", "audio/silk"));
    ((ArrayList)localObject).add(new Pair("jpg", "image/jpg"));
    ((ArrayList)localObject).add(new Pair("json", "application/json"));
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Pair localPair = (Pair)((Iterator)localObject).next();
      localHashMap1.put(localPair.first, localPair.second);
      localHashMap2.put(localPair.second, localPair.first);
    }
    xDv = Collections.unmodifiableMap(localHashMap1);
    xDw = Collections.unmodifiableMap(localHashMap2);
    AppMethodBeat.o(65365);
  }

  public static String ajn(String paramString)
  {
    AppMethodBeat.i(65364);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = null;
      AppMethodBeat.o(65364);
    }
    while (true)
    {
      return paramString;
      String str1 = (String)xDw.get(paramString.toLowerCase());
      String str2 = str1;
      if (TextUtils.isEmpty(str1))
        str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(paramString);
      if (TextUtils.isEmpty(str2))
      {
        if ("audio/mpeg".equals(paramString))
        {
          paramString = "mp3";
          AppMethodBeat.o(65364);
        }
        else if ("audio/mp3".equals(paramString))
        {
          paramString = "mp3";
          AppMethodBeat.o(65364);
        }
        else if ("audio/mp4".equals(paramString))
        {
          paramString = "mp4";
          AppMethodBeat.o(65364);
        }
      }
      else
      {
        AppMethodBeat.o(65364);
        paramString = str2;
      }
    }
  }

  public static String ako(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(65363);
    Object localObject2;
    if (TextUtils.isEmpty(paramString))
      localObject2 = localObject1;
    while (true)
    {
      paramString = anI((String)localObject2);
      AppMethodBeat.o(65363);
      return paramString;
      int i = paramString.lastIndexOf('.');
      localObject2 = localObject1;
      if (i >= 0)
      {
        localObject2 = localObject1;
        if (i < paramString.length() - 1)
          localObject2 = paramString.substring(i + 1);
      }
    }
  }

  public static String anI(String paramString)
  {
    AppMethodBeat.i(65362);
    Object localObject;
    if (TextUtils.isEmpty(paramString))
    {
      localObject = null;
      AppMethodBeat.o(65362);
    }
    while (true)
    {
      return localObject;
      String str = (String)xDv.get(paramString.toLowerCase());
      localObject = str;
      if (TextUtils.isEmpty(str))
      {
        localObject = str;
        if (!TextUtils.isEmpty(paramString))
          localObject = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
      }
      if ((TextUtils.isEmpty((CharSequence)localObject)) && ("mp3".equals(paramString)))
      {
        localObject = "audio/mpeg";
        AppMethodBeat.o(65362);
      }
      else
      {
        AppMethodBeat.o(65362);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.f.b
 * JD-Core Version:    0.6.2
 */