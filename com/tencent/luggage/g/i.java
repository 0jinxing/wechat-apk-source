package com.tencent.luggage.g;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
{
  public static JSONArray D(List<? extends Object> paramList)
  {
    AppMethodBeat.i(90917);
    JSONArray localJSONArray = new JSONArray();
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(90917);
    while (true)
    {
      return localJSONArray;
      for (int i = 0; i < paramList.size(); i++)
        localJSONArray.put(paramList.get(i));
      AppMethodBeat.o(90917);
    }
  }

  public static void b(Closeable paramCloseable)
  {
    AppMethodBeat.i(90915);
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      AppMethodBeat.o(90915);
      return;
    }
    catch (IOException paramCloseable)
    {
      while (true)
      {
        d.printErrStackTrace("Util", paramCloseable, "qualityClose", new Object[0]);
        AppMethodBeat.o(90915);
      }
    }
  }

  public static JSONObject bQ(String paramString)
  {
    AppMethodBeat.i(90918);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(90918);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        AppMethodBeat.o(90918);
        paramString = localJSONObject;
      }
      catch (JSONException paramString)
      {
        AppMethodBeat.o(90918);
        paramString = null;
      }
    }
  }

  public static String convertStreamToString(InputStream paramInputStream)
  {
    AppMethodBeat.i(90913);
    InputStreamReader localInputStreamReader = new InputStreamReader(paramInputStream);
    char[] arrayOfChar = new char[4096];
    StringWriter localStringWriter = new StringWriter();
    try
    {
      while (true)
      {
        int i = localInputStreamReader.read(arrayOfChar);
        if (-1 == i)
          break;
        localStringWriter.write(arrayOfChar, 0, i);
      }
    }
    catch (Exception localException)
    {
      d.e("Util", "convertStreamToString: read, %s", new Object[] { localException.getMessage() });
      String str = "";
      b(localInputStreamReader);
      b(paramInputStream);
      AppMethodBeat.o(90913);
      paramInputStream = str;
      while (true)
      {
        return paramInputStream;
        b(localInputStreamReader);
        b(paramInputStream);
        paramInputStream = localStringWriter.toString();
        AppMethodBeat.o(90913);
      }
    }
    finally
    {
      b(localInputStreamReader);
      b(paramInputStream);
      AppMethodBeat.o(90913);
    }
  }

  public static void d(Map paramMap)
  {
    AppMethodBeat.i(90916);
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = ((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      if (((localObject2 instanceof String)) && ((localObject1 instanceof Map)))
      {
        d((Map)localObject1);
        paramMap.put(localObject2, new JSONObject((Map)localObject1));
      }
    }
    AppMethodBeat.o(90916);
  }

  public static byte[] k(InputStream paramInputStream)
  {
    Object localObject1 = null;
    AppMethodBeat.i(90914);
    if (paramInputStream == null)
    {
      AppMethodBeat.o(90914);
      paramInputStream = localObject1;
    }
    while (true)
    {
      return paramInputStream;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[4096];
      try
      {
        while (true)
        {
          int i = paramInputStream.read(arrayOfByte, 0, 4096);
          if (i == -1)
            break;
          localByteArrayOutputStream.write(arrayOfByte, 0, i);
        }
      }
      catch (Exception localException)
      {
        localException = localException;
        d.e("Util", "readPkgCertificate: ".concat(String.valueOf(localException)));
        try
        {
          paramInputStream.close();
          AppMethodBeat.o(90914);
          paramInputStream = localObject1;
          continue;
          localException.flush();
          try
          {
            paramInputStream.close();
            paramInputStream = localException.toByteArray();
            AppMethodBeat.o(90914);
          }
          catch (Exception paramInputStream)
          {
            while (true)
              d.e("Util", "close: ".concat(String.valueOf(paramInputStream)));
          }
        }
        catch (Exception paramInputStream)
        {
          while (true)
            d.e("Util", "close: ".concat(String.valueOf(paramInputStream)));
        }
      }
      finally
      {
      }
    }
    try
    {
      paramInputStream.close();
      AppMethodBeat.o(90914);
      throw localObject2;
    }
    catch (Exception paramInputStream)
    {
      while (true)
        d.e("Util", "close: ".concat(String.valueOf(paramInputStream)));
    }
  }

  public static String p(Context paramContext, String paramString)
  {
    AppMethodBeat.i(90912);
    Object localObject = paramContext.getAssets();
    paramContext = null;
    try
    {
      localObject = ((AssetManager)localObject).open(paramString);
      paramContext = (Context)localObject;
      if (paramContext == null)
      {
        paramContext = "";
        AppMethodBeat.o(90912);
        return paramContext;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        d.e("Util", "openRead file( %s ) failed, exp = %s", new Object[] { paramString, localException });
        continue;
        paramContext = convertStreamToString(paramContext);
        AppMethodBeat.o(90912);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.g.i
 * JD-Core Version:    0.6.2
 */