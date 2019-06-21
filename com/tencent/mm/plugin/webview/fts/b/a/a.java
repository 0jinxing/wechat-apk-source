package com.tencent.mm.plugin.webview.fts.b.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  public static final a ugy;
  private Map<String, com.tencent.mm.plugin.webview.fts.b.a.a.a> ugx;

  static
  {
    AppMethodBeat.i(5775);
    ugy = new a();
    AppMethodBeat.o(5775);
  }

  public a()
  {
    AppMethodBeat.i(5773);
    this.ugx = new HashMap();
    AppMethodBeat.o(5773);
  }

  public static com.tencent.mm.plugin.webview.fts.b.a.a.a aeb(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(5774);
    if ((TextUtils.isEmpty(paramString)) || (!paramString.startsWith("//test-widget-ui")))
    {
      ab.w("SearchWidgetTestUiMgr", "not test-widget-ui formate");
      AppMethodBeat.o(5774);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = paramString.split("\\s+");
      if (paramString.length != 2)
      {
        ab.w("SearchWidgetTestUiMgr", "test-widget-ui arg length illegal");
        AppMethodBeat.o(5774);
        paramString = localObject;
      }
      else
      {
        String str = paramString[1];
        try
        {
          paramString = new com/tencent/mm/plugin/webview/fts/b/a/a/a;
          paramString.<init>(str);
          if (paramString == null)
          {
            AppMethodBeat.o(5774);
            paramString = localObject;
          }
        }
        catch (Exception paramString)
        {
          while (true)
          {
            ab.printErrStackTrace("SearchWidgetTestUiMgr", paramString, "", new Object[0]);
            paramString = null;
          }
          ugy.ugx.put(paramString.csB, paramString);
          ab.i("SearchWidgetTestUiMgr", "test-widget-ui args %s, %s, %s, %s", new Object[] { paramString.ugB, paramString.csB, paramString.ugz, paramString.ugA });
          AppMethodBeat.o(5774);
        }
      }
    }
  }

  public static a cWt()
  {
    return ugy;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.b.a.a
 * JD-Core Version:    0.6.2
 */