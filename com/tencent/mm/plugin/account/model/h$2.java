package com.tencent.mm.plugin.account.model;

import android.os.Bundle;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.f.a.a.a;
import com.tencent.mm.ui.f.a.e;
import com.tencent.mm.ui.f.a.f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

final class h$2
  implements a.a
{
  h$2(h paramh)
  {
  }

  public final void a(FileNotFoundException paramFileNotFoundException)
  {
    AppMethodBeat.i(124691);
    ab.e("MicroMsg.RefreshTokenRunner", "onFileNotFoundException");
    h.a(this.gyP, 2, paramFileNotFoundException.getMessage());
    AppMethodBeat.o(124691);
  }

  public final void a(MalformedURLException paramMalformedURLException)
  {
    AppMethodBeat.i(124692);
    ab.e("MicroMsg.RefreshTokenRunner", "onMalformedURLException");
    h.a(this.gyP, 2, paramMalformedURLException.getMessage());
    AppMethodBeat.o(124692);
  }

  public final void b(IOException paramIOException)
  {
    AppMethodBeat.i(124690);
    ab.e("MicroMsg.RefreshTokenRunner", "onIOException");
    h.a(this.gyP, 2, paramIOException.getMessage());
    AppMethodBeat.o(124690);
  }

  public final void wo(String paramString)
  {
    AppMethodBeat.i(124689);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.RefreshTokenRunner", "response is null or nil");
      h.a(this.gyP, 1, "response is null or nil");
      AppMethodBeat.o(124689);
    }
    while (true)
    {
      return;
      Object localObject2;
      if ((paramString.contains("access_token")) && (paramString.length() > 12))
      {
        while (true)
        {
          Object localObject3;
          String str;
          try
          {
            JSONObject localJSONObject = f.asb(paramString);
            if (localJSONObject.has("access_token"))
            {
              paramString = new android/os/Bundle;
              paramString.<init>();
              Iterator localIterator = localJSONObject.keys();
              if (!localIterator.hasNext())
                break label379;
              localObject1 = (String)localIterator.next();
              localObject2 = localJSONObject.optJSONArray((String)localObject1);
              localObject3 = Double.valueOf(localJSONObject.optDouble((String)localObject1));
              str = localJSONObject.optString((String)localObject1);
              if ((localObject2 == null) || (((JSONArray)localObject2).length() > 0))
                break label188;
              paramString.putStringArray((String)localObject1, new String[0]);
              continue;
            }
          }
          catch (Throwable paramString)
          {
            ab.printErrStackTrace("MicroMsg.RefreshTokenRunner", paramString, "", new Object[0]);
            h.a(this.gyP, 2, "decodeUrl fail");
            AppMethodBeat.o(124689);
          }
          break;
          label188: int i;
          if ((localObject2 != null) && (!Double.isNaN(((JSONArray)localObject2).optDouble(0))))
          {
            localObject3 = new double[((JSONArray)localObject2).length()];
            for (i = 0; i < ((JSONArray)localObject2).length(); i++)
              localObject3[i] = ((JSONArray)localObject2).optDouble(i);
            paramString.putDoubleArray((String)localObject1, (double[])localObject3);
          }
          else if ((localObject2 != null) && (((JSONArray)localObject2).optString(0) != null))
          {
            localObject3 = new String[((JSONArray)localObject2).length()];
            for (i = 0; i < ((JSONArray)localObject2).length(); i++)
              localObject3[i] = ((JSONArray)localObject2).optString(i);
            paramString.putStringArray((String)localObject1, (String[])localObject3);
          }
          else if (!((Double)localObject3).isNaN())
          {
            paramString.putDouble((String)localObject1, ((Double)localObject3).doubleValue());
          }
          else if (str != null)
          {
            paramString.putString((String)localObject1, str);
          }
          else
          {
            System.err.println("unable to transform json to bundle ".concat(String.valueOf(localObject1)));
          }
        }
        label379: Object localObject1 = this.gyP;
        localObject2 = Message.obtain();
        ((Message)localObject2).what = 2;
        ((Message)localObject2).setData(paramString);
        ((h)localObject1).handler.sendMessage((Message)localObject2);
        AppMethodBeat.o(124689);
      }
      else
      {
        try
        {
          f.asb(paramString);
          h.a(this.gyP, 2, "parseJson error");
          AppMethodBeat.o(124689);
        }
        catch (Exception paramString)
        {
          while (true)
          {
            ab.e("MicroMsg.RefreshTokenRunner", "parseJson exception : " + paramString.getMessage());
            ab.printErrStackTrace("MicroMsg.RefreshTokenRunner", paramString, "", new Object[0]);
          }
        }
        catch (e paramString)
        {
          localObject2 = "errCode = " + paramString.mErrorCode + ", errType = " + paramString.zxP + ", errMsg = " + paramString.getMessage();
          ab.e("MicroMsg.RefreshTokenRunner", "parseJson facebookerror, ".concat(String.valueOf(localObject2)));
          ab.printErrStackTrace("MicroMsg.RefreshTokenRunner", paramString, "", new Object[0]);
          h.a(this.gyP, 3, (String)localObject2);
          AppMethodBeat.o(124689);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.h.2
 * JD-Core Version:    0.6.2
 */