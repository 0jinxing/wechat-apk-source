package com.tencent.mm.plugin.downloader_app.search;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  String appId;
  String iconUrl;
  String jumpUrl;
  String kPJ;
  String kPK;
  List<String> kPL;
  int position;
  long size;
  int state;
  int type;

  public static void al(Context paramContext, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(136195);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(136195);
    while (true)
    {
      return;
      am(paramContext, paramString);
      paramContext = paramContext.getSharedPreferences("search_history_href", 0);
      String str = paramContext.getString("search_history_list", "");
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(Base64.encodeToString(paramString.getBytes(), 0));
      localStringBuffer.append(";");
      localStringBuffer.append(str);
      paramString = localStringBuffer.toString().split(";");
      localStringBuffer.setLength(0);
      while ((i < paramString.length) && (i < 10))
      {
        localStringBuffer.append(paramString[i]);
        localStringBuffer.append(";");
        i++;
      }
      paramContext.edit().putString("search_history_list", localStringBuffer.toString()).commit();
      AppMethodBeat.o(136195);
    }
  }

  public static void am(Context paramContext, String paramString)
  {
    AppMethodBeat.i(136196);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(136196);
    while (true)
    {
      return;
      paramContext = paramContext.getSharedPreferences("search_history_href", 0);
      paramString = paramContext.getString("search_history_list", "").replace(Base64.encodeToString(paramString.getBytes(), 0) + ";", "");
      paramContext.edit().putString("search_history_list", paramString).commit();
      AppMethodBeat.o(136196);
    }
  }

  public static List<b> dD(Context paramContext)
  {
    AppMethodBeat.i(136194);
    ArrayList localArrayList = new ArrayList();
    paramContext = paramContext.getSharedPreferences("search_history_href", 0).getString("search_history_list", "");
    if (bo.isNullOrNil(paramContext))
      AppMethodBeat.o(136194);
    while (true)
    {
      return localArrayList;
      paramContext = paramContext.split(";");
      int i = paramContext.length;
      int j = 0;
      int m;
      for (int k = 0; j < i; k = m)
      {
        String str = paramContext[j];
        m = k;
        if (!bo.isNullOrNil(str))
        {
          b localb = new b();
          localb.type = 2;
          localb.kPJ = new String(Base64.decode(str, 0));
          m = k + 1;
          localb.position = m;
          localArrayList.add(localb);
        }
        j++;
      }
      if (!bo.ek(localArrayList))
      {
        paramContext = new b();
        paramContext.type = 1;
        localArrayList.add(0, paramContext);
      }
      AppMethodBeat.o(136194);
    }
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(136193);
    boolean bool;
    if (((paramObject instanceof b)) && (((b)paramObject).kPJ != null))
    {
      bool = ((b)paramObject).kPJ.equals(this.kPJ);
      AppMethodBeat.o(136193);
    }
    while (true)
    {
      return bool;
      bool = super.equals(paramObject);
      AppMethodBeat.o(136193);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.search.b
 * JD-Core Version:    0.6.2
 */