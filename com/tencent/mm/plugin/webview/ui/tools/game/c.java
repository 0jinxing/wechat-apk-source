package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gu;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class c
{
  long mStartTime;
  long neL;
  long neM;
  private long uDn;
  Bundle uDo;
  public c.a uDp;

  public c()
  {
    AppMethodBeat.i(8685);
    this.uDn = 0L;
    this.neL = 0L;
    this.mStartTime = 0L;
    this.neM = 0L;
    this.uDp = new c.a(this);
    AppMethodBeat.o(8685);
  }

  private String age(String paramString)
  {
    AppMethodBeat.i(8687);
    Matcher localMatcher = Pattern.compile("\\(.*?\\)").matcher(paramString);
    while (true)
      if (localMatcher.find())
        try
        {
          String str1 = bo.nullAsNil(localMatcher.group());
          String str2 = str1.replace("(", "").replace(")", "").replace(" ", "");
          String[] arrayOfString;
          if (str2.contains("__ALLSTAYTIME__"))
          {
            str2 = str2.replace("__ALLSTAYTIME__", String.valueOf(this.uDn / 1000L));
            arrayOfString = str2.split("\\+");
            if (arrayOfString.length == 2)
              str2 = String.valueOf(bo.anl(arrayOfString[0]) + bo.anl(arrayOfString[1]));
            paramString = paramString.replace(str1, str2);
          }
          else if (str1.contains("__FOREGROUNDTIME__"))
          {
            str2 = str2.replace("__FOREGROUNDTIME__", String.valueOf(this.neL / 1000L));
            arrayOfString = str2.split("\\+");
            if (arrayOfString.length == 2)
              str2 = String.valueOf(bo.anl(arrayOfString[0]) + bo.anl(arrayOfString[1]));
            paramString = paramString.replace(str1, str2);
          }
        }
        catch (NumberFormatException paramString)
        {
          ab.i("MicroMsg.GamePageTimeReport", "matchTimeMark, err:%s", new Object[] { paramString.getMessage() });
          paramString = null;
          AppMethodBeat.o(8687);
        }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(8687);
    }
  }

  public static void an(Bundle paramBundle)
  {
    AppMethodBeat.i(8686);
    if (paramBundle == null)
      AppMethodBeat.o(8686);
    while (true)
    {
      return;
      Object localObject = paramBundle.keySet();
      if (localObject == null)
      {
        AppMethodBeat.o(8686);
      }
      else
      {
        JSONObject localJSONObject = new JSONObject();
        try
        {
          Iterator localIterator = ((Set)localObject).iterator();
          while (localIterator.hasNext())
          {
            localObject = (String)localIterator.next();
            localJSONObject.put((String)localObject, paramBundle.get((String)localObject));
          }
        }
        catch (JSONException paramBundle)
        {
          AppMethodBeat.o(8686);
        }
        continue;
        paramBundle = new gu();
        paramBundle.cBw.Cn = 4;
        paramBundle.cBw.cBy = localJSONObject.toString();
        a.xxA.m(paramBundle);
        AppMethodBeat.o(8686);
      }
    }
  }

  protected void I(Bundle paramBundle)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.c
 * JD-Core Version:    0.6.2
 */