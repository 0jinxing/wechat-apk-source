package org.b.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.b.g.c;

public final class e
{
  public final List<d> BYO;

  public e()
  {
    AppMethodBeat.i(77261);
    this.BYO = new ArrayList();
    AppMethodBeat.o(77261);
  }

  public e(List<d> paramList)
  {
    AppMethodBeat.i(77262);
    this.BYO = new ArrayList(paramList);
    AppMethodBeat.o(77262);
  }

  public e(Map<String, String> paramMap)
  {
    this();
    AppMethodBeat.i(77263);
    paramMap = paramMap.entrySet().iterator();
    while (true)
    {
      if (!paramMap.hasNext())
      {
        AppMethodBeat.o(77263);
        return;
      }
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      this.BYO.add(new d((String)localEntry.getKey(), (String)localEntry.getValue()));
    }
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(77265);
    this.BYO.addAll(parame.BYO);
    AppMethodBeat.o(77265);
  }

  public final void awV(String paramString)
  {
    AppMethodBeat.i(77266);
    String[] arrayOfString;
    int j;
    if ((paramString != null) && (paramString.length() > 0))
    {
      arrayOfString = paramString.split("&");
      int i = arrayOfString.length;
      j = 0;
      if (j < i);
    }
    else
    {
      AppMethodBeat.o(77266);
      return;
    }
    paramString = arrayOfString[j].split("=");
    String str = c.decode(paramString[0]);
    if (paramString.length > 1);
    for (paramString = c.decode(paramString[1]); ; paramString = "")
    {
      this.BYO.add(new d(str, paramString));
      j++;
      break;
    }
  }

  public final String enh()
  {
    AppMethodBeat.i(77264);
    if (this.BYO.size() == 0)
    {
      localObject = "";
      AppMethodBeat.o(77264);
      return localObject;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = this.BYO.iterator();
    while (true)
    {
      if (!((Iterator)localObject).hasNext())
      {
        localObject = localStringBuilder.toString().substring(1);
        AppMethodBeat.o(77264);
        break;
      }
      d locald = (d)((Iterator)localObject).next();
      localStringBuilder.append('&').append(locald.eng());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     org.b.d.e
 * JD-Core Version:    0.6.2
 */