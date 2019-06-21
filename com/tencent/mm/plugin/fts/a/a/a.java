package com.tencent.mm.plugin.fts.a.a;

import java.util.ArrayList;
import java.util.List;

public abstract class a
  implements Comparable<a>
{
  public boolean mCancelled = false;
  public long mDp = 0L;
  public long mDq = 0L;
  public List<a.a> mDr;
  public Object mDs;
  public int mPriority = 2147483647;

  protected final void Ng(String paramString)
  {
    if (this.mDr == null)
      this.mDr = new ArrayList();
    a.a locala = new a.a(this);
    locala.mDt = paramString;
    locala.timestamp = System.currentTimeMillis();
    this.mDr.add(locala);
  }

  public String aAo()
  {
    return "";
  }

  public abstract boolean execute();

  public int getId()
  {
    return -1;
  }

  public String getName()
  {
    return "";
  }

  public int getPriority()
  {
    return this.mPriority;
  }

  public boolean isCancelled()
  {
    return this.mCancelled;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.a
 * JD-Core Version:    0.6.2
 */