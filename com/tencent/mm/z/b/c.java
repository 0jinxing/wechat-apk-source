package com.tencent.mm.z.b;

import org.json.JSONObject;

public abstract class c
  implements e
{
  private int index;
  public String name;

  public c(String paramString)
  {
    this.name = paramString;
  }

  public c(String paramString, int paramInt)
  {
    this.name = paramString;
    this.index = paramInt;
  }

  public final int getIndex()
  {
    return this.index;
  }

  public final String getName()
  {
    return this.name;
  }

  public abstract JSONObject toJSONObject();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.b.c
 * JD-Core Version:    0.6.2
 */