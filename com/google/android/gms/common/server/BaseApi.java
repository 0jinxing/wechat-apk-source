package com.google.android.gms.common.server;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class BaseApi
{
  @Deprecated
  public static String append(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(61434);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    if (paramString1.indexOf("?") != -1)
      localStringBuilder.append('&');
    while (true)
    {
      localStringBuilder.append(paramString2);
      localStringBuilder.append('=');
      localStringBuilder.append(paramString3);
      paramString1 = localStringBuilder.toString();
      AppMethodBeat.o(61434);
      return paramString1;
      localStringBuilder.append('?');
    }
  }

  public static void append(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    AppMethodBeat.i(61435);
    if (paramStringBuilder.indexOf("?") != -1)
      paramStringBuilder.append('&');
    while (true)
    {
      paramStringBuilder.append(paramString1);
      paramStringBuilder.append('=');
      paramStringBuilder.append(paramString2);
      AppMethodBeat.o(61435);
      return;
      paramStringBuilder.append('?');
    }
  }

  public static String enc(String paramString)
  {
    AppMethodBeat.i(61432);
    Preconditions.checkNotNull(paramString, "Encoding a null parameter!");
    paramString = Uri.encode(paramString);
    AppMethodBeat.o(61432);
    return paramString;
  }

  protected static List<String> enc(List<String> paramList)
  {
    AppMethodBeat.i(61433);
    int i = paramList.size();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
      localArrayList.add(enc((String)paramList.get(j)));
    AppMethodBeat.o(61433);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.BaseApi
 * JD-Core Version:    0.6.2
 */