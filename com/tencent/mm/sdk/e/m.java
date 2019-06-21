package com.tencent.mm.sdk.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m
{
  public String ctq;
  public int hsh;
  public Object obj;
  public k xDr;

  public m()
  {
    this.ctq = null;
    this.xDr = null;
    this.hsh = -1;
    this.obj = null;
  }

  public m(String paramString)
  {
    this.ctq = paramString;
    this.xDr = null;
    this.hsh = -1;
    this.obj = null;
  }

  public final String toString()
  {
    AppMethodBeat.i(52518);
    String str = "MStorageEventData [event=" + this.ctq + ", eventId=" + this.hsh + ", stg=" + this.xDr + ", obj=" + this.obj + "]";
    AppMethodBeat.o(52518);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.e.m
 * JD-Core Version:    0.6.2
 */