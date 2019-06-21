package com.tencent.mm.plugin.websearch.c.a;

import com.tencent.mm.plugin.fts.a.a.l;
import java.util.List;

public abstract class a<T>
{
  protected String query;
  protected int ucd;

  public a(String paramString)
  {
    this.query = paramString;
    this.ucd = 2147483647;
  }

  public abstract void dZ(List<l> paramList);

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this);
    while (true)
    {
      return bool;
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((this.query == paramObject.query) || ((this.query != null) && (this.query.equalsIgnoreCase(paramObject.query))));
        for (int i = 1; ; i = 0)
        {
          if ((paramObject.ucd == this.ucd) && (i != 0))
            break label78;
          bool = false;
          break;
        }
      }
      else
      {
        label78: bool = false;
      }
    }
  }

  public int hashCode()
  {
    return super.hashCode();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.c.a.a
 * JD-Core Version:    0.6.2
 */