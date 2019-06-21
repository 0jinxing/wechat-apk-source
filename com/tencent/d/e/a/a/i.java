package com.tencent.d.e.a.a;

import com.tencent.d.e.a.b.f;
import com.tencent.d.e.a.b.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i
{
  final int Adk;
  private final int AtU;
  Object[] Ll;
  final int mCapacity;
  int mbt;

  public i(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(114569);
    this.AtU = paramInt1;
    this.Ll = new Object[(int)Math.ceil(1.0F * paramInt3 / paramInt2)];
    this.mbt = 0;
    this.mCapacity = paramInt3;
    this.Adk = paramInt2;
    AppMethodBeat.o(114569);
  }

  private ArrayList<f> Rd(int paramInt)
  {
    AppMethodBeat.i(114570);
    ArrayList localArrayList = new ArrayList();
    List localList = (List)this.Ll[paramInt];
    if (localList == null)
      AppMethodBeat.o(114570);
    while (true)
    {
      return localArrayList;
      for (paramInt = 0; paramInt < localList.size(); paramInt++)
      {
        j localj = (j)localList.get(paramInt);
        f localf = new f();
        localf.x = localj.values[0];
        localf.y = localj.values[1];
        localf.z = localj.values[2];
        localf.Auo = localj.timestamp;
        localArrayList.add(localf);
      }
      AppMethodBeat.o(114570);
    }
  }

  public final Object[] dQB()
  {
    AppMethodBeat.i(114572);
    Object[] arrayOfObject = (Object[])this.Ll.clone();
    AppMethodBeat.o(114572);
    return arrayOfObject;
  }

  public final ArrayList<g> fB(List<k> paramList)
  {
    AppMethodBeat.i(114571);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i < this.Ll.length)
    {
      List localList = (List)this.Ll[i];
      g localg;
      Object localObject;
      HashMap localHashMap;
      int j;
      if ((localList != null) && (localList.size() != 0))
      {
        localg = new g();
        localObject = Rd(i);
        localHashMap = new HashMap();
        if (this.AtU != 1)
          break label216;
        j = 0;
      }
      while (true)
      {
        localHashMap.put(Integer.valueOf(j), localObject);
        localg.Auq = localHashMap;
        localObject = (j)localList.get(0);
        if (localObject != null)
        {
          localg.Aup = ((j)localObject).timestamp;
          if (paramList.size() > i)
          {
            localObject = (k)paramList.get(i);
            if (localObject != null)
            {
              localg.AtW = ((k)localObject).AtW;
              localg.AtX = ((k)localObject).AtX;
              localg.AtY = ((k)localObject).AtY;
              localg.AtZ = ((k)localObject).AtZ;
            }
          }
          localArrayList.add(localg);
        }
        i++;
        break;
        label216: if (this.AtU == 4)
          j = 2;
        else if (this.AtU == 9)
          j = 4;
        else
          j = -1;
      }
    }
    AppMethodBeat.o(114571);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.a.i
 * JD-Core Version:    0.6.2
 */