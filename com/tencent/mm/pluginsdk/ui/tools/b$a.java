package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class b$a
{
  List<String> qnw;

  private b$a()
  {
    AppMethodBeat.i(79908);
    this.qnw = new ArrayList();
    AppMethodBeat.o(79908);
  }

  final void We(String paramString)
  {
    AppMethodBeat.i(79910);
    this.qnw = new ArrayList();
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(79910);
    while (true)
    {
      return;
      for (Object localObject : paramString.split(";"))
        this.qnw.add(localObject);
      AppMethodBeat.o(79910);
    }
  }

  final String dll()
  {
    AppMethodBeat.i(79909);
    Object localObject;
    if ((this.qnw == null) || (this.qnw.size() == 0))
    {
      localObject = "";
      AppMethodBeat.o(79909);
    }
    while (true)
    {
      return localObject;
      StringBuffer localStringBuffer = new StringBuffer();
      localObject = this.qnw.iterator();
      while (((Iterator)localObject).hasNext())
      {
        localStringBuffer.append((String)((Iterator)localObject).next());
        localStringBuffer.append(";");
      }
      localObject = localStringBuffer.toString();
      AppMethodBeat.o(79909);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.b.a
 * JD-Core Version:    0.6.2
 */