package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

class fa extends fe
{
  private boolean g = true;

  public fa(fd.a[] paramArrayOfa)
  {
    super(paramArrayOfa);
  }

  public fa a()
  {
    AppMethodBeat.i(98858);
    ArrayList localArrayList = this.e;
    int i = this.e.size();
    Object localObject = new fd.a[i];
    for (int j = 0; j < i; j++)
      localObject[j] = ((fd.a)((fd)localArrayList.get(j)).d());
    localObject = new fa((fd.a[])localObject);
    AppMethodBeat.o(98858);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fa
 * JD-Core Version:    0.6.2
 */