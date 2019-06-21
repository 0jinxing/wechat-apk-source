package com.eclipsesource.v8.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

class V8ObjectUtils$ListWrapper
{
  private List<? extends Object> list;

  public V8ObjectUtils$ListWrapper(List<? extends Object> paramList)
  {
    this.list = paramList;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((paramObject instanceof ListWrapper))
    {
      bool2 = bool1;
      if (((ListWrapper)paramObject).list == this.list)
        bool2 = true;
    }
    return bool2;
  }

  public int hashCode()
  {
    AppMethodBeat.i(75105);
    int i = System.identityHashCode(this.list);
    AppMethodBeat.o(75105);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.utils.V8ObjectUtils.ListWrapper
 * JD-Core Version:    0.6.2
 */