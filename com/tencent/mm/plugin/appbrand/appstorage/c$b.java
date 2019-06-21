package com.tencent.mm.plugin.appbrand.appstorage;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandKVStorageTransfer$Result;", "", "readTime", "", "writeTime", "size", "", "(JJI)V", "getReadTime", "()J", "setReadTime", "(J)V", "getSize", "()I", "getWriteTime", "setWriteTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "plugin-appbrand-integration_release"})
final class c$b
{
  long gXf;
  long gXg;
  final int size;

  public c$b(long paramLong1, long paramLong2, int paramInt)
  {
    this.gXf = paramLong1;
    this.gXg = paramLong2;
    this.size = paramInt;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (this != paramObject)
    {
      bool2 = bool1;
      if (!(paramObject instanceof b))
        break label88;
      paramObject = (b)paramObject;
      if (this.gXf != paramObject.gXf)
        break label90;
      i = 1;
      bool2 = bool1;
      if (i == 0)
        break label88;
      if (this.gXg != paramObject.gXg)
        break label96;
      i = 1;
      label58: bool2 = bool1;
      if (i == 0)
        break label88;
      if (this.size != paramObject.size)
        break label102;
    }
    label88: label90: label96: label102: for (int i = 1; ; i = 0)
    {
      bool2 = bool1;
      if (i != 0)
        bool2 = true;
      return bool2;
      i = 0;
      break;
      i = 0;
      break label58;
    }
  }

  public final int hashCode()
  {
    long l = this.gXf;
    int i = (int)(l ^ l >>> 32);
    l = this.gXg;
    return (i * 31 + (int)(l ^ l >>> 32)) * 31 + this.size;
  }

  public final String toString()
  {
    AppMethodBeat.i(134480);
    String str = "Result(readTime=" + this.gXf + ", writeTime=" + this.gXg + ", size=" + this.size + ")";
    AppMethodBeat.o(134480);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.c.b
 * JD-Core Version:    0.6.2
 */