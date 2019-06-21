package com.tencent.mm.ui.chatting.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.cb;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class a extends com.tencent.mm.ay.a
{
  public String yYO;
  public long yYP = 0L;

  public a(Map<String, String> paramMap, bi parambi)
  {
    super(paramMap, parambi);
  }

  public final boolean Yt()
  {
    boolean bool = false;
    AppMethodBeat.i(32503);
    if (this.values == null)
    {
      ab.e("MicroMsg.InvokeMessageNewXmlMsg", "[parseXml] values == null ");
      AppMethodBeat.o(32503);
      return bool;
    }
    if (this.values.containsKey(".sysmsg.invokeMessage.preContent"))
      this.yYO = ((String)this.values.get(".sysmsg.invokeMessage.preContent"));
    if (this.values.containsKey(".sysmsg.invokeMessage.timestamp"))
      this.yYP = bo.anl((String)this.values.get(".sysmsg.invokeMessage.timestamp"));
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.values.keySet().iterator();
    int i = 0;
    label123: 
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.startsWith(".sysmsg.invokeMessage.text"))
      {
        if (localStringBuilder.length() > 0)
          localStringBuilder.insert(0, (String)this.values.get(str));
        else
          localStringBuilder.append((String)this.values.get(str));
      }
      else
      {
        if ((!str.startsWith(".sysmsg.invokeMessage.link.text")) || (bo.isNullOrNil((String)this.values.get(str))))
          break label367;
        str = (String)this.values.get(str);
        localStringBuilder.append(str);
        this.fKY.add(str);
        i = str.length();
      }
    }
    label367: 
    while (true)
    {
      break label123;
      this.fKZ.addFirst(Integer.valueOf(localStringBuilder.length() - i));
      this.fLa.add(Integer.valueOf(localStringBuilder.length()));
      this.fKW = localStringBuilder.toString();
      if ((cb.aaE() - this.yYP >= 300000L) && (!bo.isNullOrNil(this.yYO)))
        d.post(new a.1(this), "[checkExpired]");
      bool = true;
      AppMethodBeat.o(32503);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.h.a
 * JD-Core Version:    0.6.2
 */