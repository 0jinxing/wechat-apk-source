package com.tencent.xweb.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.n;
import java.util.Map;

public final class a
{
  n ANo;

  public a(n paramn)
  {
    this.ANo = paramn;
  }

  public final Bundle getBundle()
  {
    AppMethodBeat.i(84556);
    Object localObject;
    if ((this.ANo != null) && (this.ANo.getRequestHeaders() != null) && (!this.ANo.isForMainFrame()) && (this.ANo.getRequestHeaders().containsKey("Accept")))
    {
      localObject = (String)this.ANo.getRequestHeaders().get("Accept");
      if ((localObject == null) || (!((String)localObject).startsWith("text/html")));
    }
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putInt("resourceType", 1);
        AppMethodBeat.o(84556);
      }
      while (true)
      {
        return localObject;
        localObject = null;
        AppMethodBeat.o(84556);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.a.a
 * JD-Core Version:    0.6.2
 */