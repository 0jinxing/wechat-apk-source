package com.tencent.mm.plugin.fts.a;

import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.l;
import java.util.HashMap;

public abstract interface k
{
  public abstract a a(i parami);

  public abstract void a(String paramString, l paraml, int paramInt, HashMap<String, String> paramHashMap);

  public abstract void addSOSHistory(String paramString);

  public abstract void create();

  public abstract void deleteSOSHistory();

  public abstract void deleteSOSHistory(String paramString);

  public abstract void destroy();

  public abstract String getName();

  public abstract boolean isCreated();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.k
 * JD-Core Version:    0.6.2
 */