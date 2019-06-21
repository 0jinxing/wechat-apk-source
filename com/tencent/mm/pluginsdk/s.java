package com.tencent.mm.pluginsdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;

public class s
{
  private LinkedList<s.a> vay;

  public s()
  {
    AppMethodBeat.i(105834);
    this.vay = new LinkedList();
    AppMethodBeat.o(105834);
  }

  private void c(String paramString1, long paramLong, String paramString2)
  {
    AppMethodBeat.i(105836);
    this.vay.add(new s.a(this, paramString1, paramLong, paramString2));
    AppMethodBeat.o(105836);
  }

  public final void aI(String paramString, long paramLong)
  {
    AppMethodBeat.i(105835);
    c(paramString, paramLong, "");
    AppMethodBeat.o(105835);
  }

  public final long ais(String paramString)
  {
    AppMethodBeat.i(105837);
    Iterator localIterator = this.vay.iterator();
    long l;
    while (localIterator.hasNext())
    {
      s.a locala = (s.a)localIterator.next();
      if (locala.key.equals(paramString))
      {
        l = locala.time;
        AppMethodBeat.o(105837);
      }
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(105837);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.s
 * JD-Core Version:    0.6.2
 */