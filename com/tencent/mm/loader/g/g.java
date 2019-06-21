package com.tencent.mm.loader.g;

import a.f.b.j;
import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/loader/LoaderPair;", "A", "B", "", "first", "second", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "setSecond", "(Ljava/lang/Object;)V", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tencent/mm/loader/loader/LoaderPair;", "equals", "", "other", "hashCode", "", "toString", "", "libimageloader_release"})
public final class g<A, B>
{
  final A first;
  B second;

  public g(A paramA, B paramB)
  {
    this.first = paramA;
    this.second = paramB;
  }

  public final boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if (!(paramObject instanceof g))
        break label49;
      paramObject = (g)paramObject;
      if ((!j.j(this.first, paramObject.first)) || (!j.j(this.second, paramObject.second)))
        break label49;
    }
    label49: for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int hashCode()
  {
    int i = 0;
    Object localObject = this.first;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      localObject = this.second;
      if (localObject != null)
        i = localObject.hashCode();
      return j * 31 + i;
    }
  }

  public final String toString()
  {
    return "LoaderPair(first=" + this.first + ", second=" + this.second + ")";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.g.g
 * JD-Core Version:    0.6.2
 */