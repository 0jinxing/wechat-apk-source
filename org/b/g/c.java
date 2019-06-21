package org.b.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;
import org.b.b.b;

public final class c
{
  private static final Map<String, String> BZp;
  private static String CHARSET;

  static
  {
    AppMethodBeat.i(77311);
    CHARSET = "UTF-8";
    HashMap localHashMap = new HashMap();
    localHashMap.put("*", "%2A");
    localHashMap.put("+", "%20");
    localHashMap.put("%7E", "~");
    BZp = Collections.unmodifiableMap(localHashMap);
    AppMethodBeat.o(77311);
  }

  public static String decode(String paramString)
  {
    AppMethodBeat.i(77313);
    d.r(paramString, "Cannot decode null object");
    try
    {
      paramString = URLDecoder.decode(paramString, CHARSET);
      AppMethodBeat.o(77313);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString = new b("Charset not found while decoding string: " + CHARSET, paramString);
      AppMethodBeat.o(77313);
    }
    throw paramString;
  }

  public static String encode(String paramString)
  {
    AppMethodBeat.i(77312);
    d.r(paramString, "Cannot encode null object");
    while (true)
    {
      Iterator localIterator;
      try
      {
        paramString = URLEncoder.encode(paramString, CHARSET);
        localIterator = BZp.entrySet().iterator();
        if (!localIterator.hasNext())
        {
          AppMethodBeat.o(77312);
          return paramString;
        }
      }
      catch (UnsupportedEncodingException paramString)
      {
        paramString = new b("Charset not found while encoding string: " + CHARSET, paramString);
        AppMethodBeat.o(77312);
        throw paramString;
      }
      Object localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      paramString = paramString.replaceAll(Pattern.quote(str), (String)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     org.b.g.c
 * JD-Core Version:    0.6.2
 */