package com.tencent.mm.ipcinvoker.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import junit.framework.Assert;

public class d
{
  public String ctq;
  public com.tencent.mm.ipcinvoker.d eGv;
  private String process;

  public <T extends b> d(String paramString, Class<T> paramClass)
  {
    AppMethodBeat.i(114078);
    Assert.assertNotNull(paramString);
    Assert.assertNotNull(paramClass);
    this.process = paramString;
    this.ctq = paramClass.getName();
    this.eGv = new com.tencent.mm.ipcinvoker.d(paramString);
    AppMethodBeat.o(114078);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.d.d
 * JD-Core Version:    0.6.2
 */