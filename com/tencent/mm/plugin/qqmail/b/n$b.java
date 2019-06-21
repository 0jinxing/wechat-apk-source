package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class n$b
{
  int pub;
  Map<String, String> puc;
  Map<String, String> pud;
  n.d pue;

  public n$b(int paramInt, Map<String, String> paramMap1, Map<String, String> paramMap2, n.d paramd)
  {
    this.pub = paramInt;
    this.puc = paramMap1;
    this.pud = paramMap2;
    this.pue = paramd;
  }

  public final String toString()
  {
    AppMethodBeat.i(67958);
    StringBuilder localStringBuilder = new StringBuilder("Request method:").append(this.pub).append(", params:");
    if (this.puc != null)
    {
      localObject = this.puc;
      localStringBuilder = localStringBuilder.append(localObject).append(", cookie:");
      if (this.pud == null)
        break label84;
    }
    label84: for (Object localObject = this.pud; ; localObject = "")
    {
      localObject = localObject;
      AppMethodBeat.o(67958);
      return localObject;
      localObject = "";
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.n.b
 * JD-Core Version:    0.6.2
 */