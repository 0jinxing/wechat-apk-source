package com.tencent.mm.plugin.webview.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;

public final class c extends j<a>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(5644);
    fnj = new String[] { j.a(a.ccO, "WebViewData") };
    AppMethodBeat.o(5644);
  }

  public c(e parame)
  {
    super(parame, a.ccO, "WebViewData", null);
  }

  static String at(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(5641);
    paramString1 = paramString1 + paramString3 + paramString2;
    AppMethodBeat.o(5641);
    return paramString1;
  }

  private Cursor gX(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5638);
    paramString1 = String.format("select * from %s where %s=\"%s\"", new Object[] { "WebViewData", "appIdKey", gY(paramString1, paramString2) });
    ab.d("MicroMsg.WebViewDataStorage", "getData: ".concat(String.valueOf(paramString1)));
    paramString1 = rawQuery(paramString1, new String[0]);
    AppMethodBeat.o(5638);
    return paramString1;
  }

  static String gY(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5643);
    paramString1 = paramString1 + "_" + paramString2;
    AppMethodBeat.o(5643);
    return paramString1;
  }

  public final void adY(String paramString)
  {
    AppMethodBeat.i(5640);
    paramString = String.format("delete from %s where %s=\"%s\"", new Object[] { "WebViewData", "appId", paramString });
    ab.d("MicroMsg.WebViewDataStorage", "cleanAllData: ".concat(String.valueOf(paramString)));
    ab.d("MicroMsg.WebViewDataStorage", "cleanAllData: ".concat(String.valueOf(hY("WebViewData", paramString))));
    AppMethodBeat.o(5640);
  }

  public final long adZ(String paramString)
  {
    AppMethodBeat.i(5642);
    paramString = String.format("select %s from %s where %s=\"%s\"", new Object[] { "size", "WebViewData", "appIdKey", at(paramString, "###@@@@TOTAL@@@###SIZE####", "_") });
    ab.d("MicroMsg.WebViewDataStorage", "getAppIdSize: ".concat(String.valueOf(paramString)));
    long l1 = 0L;
    paramString = rawQuery(paramString, new String[0]);
    long l2 = l1;
    if (paramString != null)
    {
      l2 = l1;
      if (paramString.moveToFirst())
        l2 = paramString.getLong(0);
      paramString.close();
    }
    ab.d("MicroMsg.WebViewDataStorage", "getAppIdSize: ".concat(String.valueOf(l2)));
    AppMethodBeat.o(5642);
    return l2;
  }

  public final void b(String paramString, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(5639);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
      AppMethodBeat.o(5639);
    while (true)
    {
      return;
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("(");
      int i = 0;
      while (true)
        if (i < paramJSONArray.length())
          try
          {
            String str = paramJSONArray.getString(i);
            StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
            localStringBuilder2.<init>("\"");
            localStringBuilder1.append(gY(paramString, str) + "\",");
            i++;
          }
          catch (Exception localException)
          {
            while (true)
              ab.e("MicroMsg.WebViewDataStorage", "clearData: " + localException.getMessage());
          }
      localStringBuilder1.deleteCharAt(localStringBuilder1.length() - 1);
      localStringBuilder1.append(")");
      paramString = String.format("delete from %s where %s in %s", new Object[] { "WebViewData", "appIdKey", localStringBuilder1.toString() });
      ab.d("MicroMsg.WebViewDataStorage", "deleteData: ".concat(String.valueOf(paramString)));
      ab.d("MicroMsg.WebViewDataStorage", "clearData: ".concat(String.valueOf(hY("WebViewData", paramString))));
      AppMethodBeat.o(5639);
    }
  }

  public final a gV(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5637);
    paramString2 = gX(paramString1, paramString2);
    paramString1 = new a();
    if (paramString2 != null)
    {
      if (paramString2.moveToFirst())
        paramString1.d(paramString2);
      paramString2.close();
    }
    AppMethodBeat.o(5637);
    return paramString1;
  }

  public final long gW(String paramString1, String paramString2)
  {
    long l = 0L;
    AppMethodBeat.i(5636);
    paramString1 = rawQuery(String.format("select %s from %s where %s=\"%s\"", new Object[] { "size", "WebViewData", "appIdKey", gY(paramString1, paramString2) }), new String[0]);
    if (paramString1 == null)
      AppMethodBeat.o(5636);
    while (true)
    {
      return l;
      if (paramString1.moveToFirst())
        l = paramString1.getLong(0);
      paramString1.close();
      AppMethodBeat.o(5636);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.b.c
 * JD-Core Version:    0.6.2
 */