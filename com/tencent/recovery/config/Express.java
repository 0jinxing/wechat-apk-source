package com.tencent.recovery.config;

import java.util.ArrayList;
import java.util.List;

public class Express
{
  public List<List<ExpressItem>> Ara = new ArrayList();

  public final void fA(List<ExpressItem> paramList)
  {
    this.Ara.add(paramList);
  }

  public String toString()
  {
    return this.Ara.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.config.Express
 * JD-Core Version:    0.6.2
 */