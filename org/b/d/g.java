package org.b.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.b.b.b;
import org.b.g.e;

public final class g
{
  private String BYW;
  private InputStream azv;
  public int code;
  private Map<String, String> headers;

  g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(77242);
    try
    {
      paramHttpURLConnection.connect();
      this.code = paramHttpURLConnection.getResponseCode();
      this.headers = i(paramHttpURLConnection);
      int i;
      if ((this.code >= 200) && (this.code < 400))
      {
        i = 1;
        if (i == 0)
          break label76;
      }
      label76: for (paramHttpURLConnection = paramHttpURLConnection.getInputStream(); ; paramHttpURLConnection = paramHttpURLConnection.getErrorStream())
      {
        this.azv = paramHttpURLConnection;
        AppMethodBeat.o(77242);
        return;
        i = 0;
        break;
      }
    }
    catch (UnknownHostException paramHttpURLConnection)
    {
      paramHttpURLConnection = new b("The IP address of a host could not be determined.", paramHttpURLConnection);
      AppMethodBeat.o(77242);
    }
    throw paramHttpURLConnection;
  }

  private static Map<String, String> i(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(77243);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramHttpURLConnection.getHeaderFields().keySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        AppMethodBeat.o(77243);
        return localHashMap;
      }
      String str = (String)localIterator.next();
      localHashMap.put(str, (String)((List)paramHttpURLConnection.getHeaderFields().get(str)).get(0));
    }
  }

  public final String getBody()
  {
    AppMethodBeat.i(77244);
    String str;
    if (this.BYW != null)
    {
      str = this.BYW;
      AppMethodBeat.o(77244);
    }
    while (true)
    {
      return str;
      this.BYW = e.T(this.azv);
      str = this.BYW;
      AppMethodBeat.o(77244);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.b.d.g
 * JD-Core Version:    0.6.2
 */