package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.element.MapPoi;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class jc$1
  implements Runnable
{
  jc$1(jc paramjc)
  {
  }

  public void run()
  {
    AppMethodBeat.i(100008);
    jc.a(this.a).clear();
    jc.b(this.a).clear();
    jc.c(this.a).clear();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (jc.d(this.a) != null)
    {
      localObject1 = jc.d(this.a).S();
      localObject2 = jc.d(this.a).T();
      if (localObject1 == null)
        break label341;
      Iterator localIterator = ((List)localObject1).iterator();
      localObject1 = null;
      while (localIterator.hasNext())
      {
        localObject3 = (hx)localIterator.next();
        String str = ((hx)localObject3).m();
        if (!StringUtil.isEmpty(str))
          if (str.startsWith("我的位置"))
            localObject1 = localObject3;
          else
            jc.b(this.a).add(new jd(jc.d(this.a), (hx)localObject3));
      }
      Collections.sort(jc.b(this.a));
      jc.a(this.a).addAll(jc.b(this.a));
    }
    while (true)
    {
      if (localObject2 != null)
      {
        localObject3 = ((List)localObject2).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (MapPoi)((Iterator)localObject3).next();
          if (!StringUtil.isEmpty(((MapPoi)localObject2).getPoiName()))
            jc.c(this.a).add(new je(jc.d(this.a), (MapPoi)localObject2));
        }
        Collections.sort(jc.c(this.a));
        jc.a(this.a).addAll(jc.c(this.a));
      }
      if (localObject1 != null)
        jc.a(this.a).add(new jd(jc.d(this.a), (hx)localObject1));
      AppMethodBeat.o(100008);
      return;
      label341: localObject1 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jc.1
 * JD-Core Version:    0.6.2
 */