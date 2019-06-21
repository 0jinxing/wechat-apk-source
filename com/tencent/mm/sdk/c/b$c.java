package com.tencent.mm.sdk.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public class b$c
{
  public String content;
  public Map<String, String> pud = null;
  public int status = 0;
  public b.a xxP;

  public b$c(String paramString)
  {
    this.content = paramString;
  }

  public void onComplete()
  {
  }

  public String toString()
  {
    AppMethodBeat.i(51971);
    StringBuilder localStringBuilder = new StringBuilder("Response status:").append(this.status).append(", cookie:");
    Object localObject;
    if (this.pud != null)
    {
      localObject = this.pud;
      localObject = localStringBuilder.append(localObject).append(", content length :");
      if (this.content == null)
        break label87;
    }
    label87: for (int i = this.content.length(); ; i = 0)
    {
      localObject = i;
      AppMethodBeat.o(51971);
      return localObject;
      localObject = "";
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.c.b.c
 * JD-Core Version:    0.6.2
 */