package com.tencent.mm.plugin.sns.ui.e;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.api.e;
import com.tencent.mm.plugin.story.api.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class a
{
  private static SparseArray<HashMap> rMe;
  private static l rMf;

  static
  {
    AppMethodBeat.i(40419);
    rMe = new SparseArray();
    rMf = new a.1();
    ((e)g.M(e.class)).addStoryStatusNotifyListener(rMf);
    AppMethodBeat.o(40419);
  }

  public static void a(int paramInt, String paramString, l paraml)
  {
    AppMethodBeat.i(40416);
    if ((TextUtils.isEmpty(paramString)) || (paraml == null))
    {
      AppMethodBeat.o(40416);
      return;
    }
    HashMap localHashMap = (HashMap)rMe.get(paramInt);
    if (localHashMap == null)
      localHashMap = new HashMap();
    while (true)
    {
      Set localSet = (Set)localHashMap.get(paramString);
      Object localObject = localSet;
      if (localSet == null)
        localObject = new HashSet();
      ((Set)localObject).add(new WeakReference(paraml));
      localHashMap.put(paramString, localObject);
      rMe.put(paramInt, localHashMap);
      AppMethodBeat.o(40416);
      break;
    }
  }

  public static void b(int paramInt, String paramString, l paraml)
  {
    AppMethodBeat.i(40417);
    if ((TextUtils.isEmpty(paramString)) || (paraml == null))
      AppMethodBeat.o(40417);
    while (true)
    {
      return;
      Object localObject = (HashMap)rMe.get(paramInt);
      if (localObject == null)
      {
        AppMethodBeat.o(40417);
      }
      else
      {
        paramString = (Set)((HashMap)localObject).get(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(40417);
        }
        else
        {
          localObject = paramString.iterator();
          while (((Iterator)localObject).hasNext())
          {
            paramString = (l)((WeakReference)((Iterator)localObject).next()).get();
            if ((paramString == null) || (paramString.equals(paraml)))
              ((Iterator)localObject).remove();
          }
          AppMethodBeat.o(40417);
        }
      }
    }
  }

  public static void cvo()
  {
    AppMethodBeat.i(40418);
    rMe.remove(4);
    AppMethodBeat.o(40418);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.e.a
 * JD-Core Version:    0.6.2
 */