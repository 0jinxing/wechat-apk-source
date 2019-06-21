package com.bumptech.glide.c.b.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.bumptech.glide.h.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public final class n
  implements l
{
  private static final Bitmap.Config[] aCQ;
  private static final Bitmap.Config[] aCR;
  private static final Bitmap.Config[] aCS;
  private static final Bitmap.Config[] aCT;
  private static final Bitmap.Config[] aCU;
  private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> aCC;
  private final n.b aCV;
  private final h<n.a, Bitmap> aCr;

  static
  {
    AppMethodBeat.i(91974);
    Bitmap.Config[] arrayOfConfig1 = new Bitmap.Config[2];
    arrayOfConfig1[0] = Bitmap.Config.ARGB_8888;
    arrayOfConfig1[1] = null;
    Bitmap.Config[] arrayOfConfig2 = arrayOfConfig1;
    if (Build.VERSION.SDK_INT >= 26)
    {
      arrayOfConfig2 = (Bitmap.Config[])Arrays.copyOf(arrayOfConfig1, 3);
      arrayOfConfig2[(arrayOfConfig2.length - 1)] = Bitmap.Config.RGBA_F16;
    }
    aCQ = arrayOfConfig2;
    aCR = arrayOfConfig2;
    aCS = new Bitmap.Config[] { Bitmap.Config.RGB_565 };
    aCT = new Bitmap.Config[] { Bitmap.Config.ARGB_4444 };
    aCU = new Bitmap.Config[] { Bitmap.Config.ALPHA_8 };
    AppMethodBeat.o(91974);
  }

  public n()
  {
    AppMethodBeat.i(91963);
    this.aCV = new n.b();
    this.aCr = new h();
    this.aCC = new HashMap();
    AppMethodBeat.o(91963);
  }

  static String a(int paramInt, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(91973);
    paramConfig = "[" + paramInt + "](" + paramConfig + ")";
    AppMethodBeat.o(91973);
    return paramConfig;
  }

  private void a(Integer paramInteger, Bitmap paramBitmap)
  {
    AppMethodBeat.i(91967);
    NavigableMap localNavigableMap = b(paramBitmap.getConfig());
    Integer localInteger = (Integer)localNavigableMap.get(paramInteger);
    if (localInteger == null)
    {
      paramInteger = new NullPointerException("Tried to decrement empty size, size: " + paramInteger + ", removed: " + h(paramBitmap) + ", this: " + this);
      AppMethodBeat.o(91967);
      throw paramInteger;
    }
    if (localInteger.intValue() == 1)
    {
      localNavigableMap.remove(paramInteger);
      AppMethodBeat.o(91967);
    }
    while (true)
    {
      return;
      localNavigableMap.put(paramInteger, Integer.valueOf(localInteger.intValue() - 1));
      AppMethodBeat.o(91967);
    }
  }

  private NavigableMap<Integer, Integer> b(Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(91968);
    NavigableMap localNavigableMap = (NavigableMap)this.aCC.get(paramConfig);
    Object localObject = localNavigableMap;
    if (localNavigableMap == null)
    {
      localObject = new TreeMap();
      this.aCC.put(paramConfig, localObject);
    }
    AppMethodBeat.o(91968);
    return localObject;
  }

  public final Bitmap c(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    int i = 0;
    AppMethodBeat.i(91965);
    int j = j.j(paramInt1, paramInt2, paramConfig);
    n.a locala = this.aCV.c(j, paramConfig);
    Object localObject;
    label56: Bitmap.Config localConfig;
    if ((Build.VERSION.SDK_INT >= 26) && (Bitmap.Config.RGBA_F16.equals(paramConfig)))
    {
      localObject = aCR;
      int k = localObject.length;
      if (i >= k)
        break label306;
      localConfig = localObject[i];
      Integer localInteger = (Integer)b(localConfig).ceilingKey(Integer.valueOf(j));
      if ((localInteger == null) || (localInteger.intValue() > j * 8))
        break label312;
      if (localInteger.intValue() == j)
      {
        if (localConfig != null)
          break label297;
        if (paramConfig == null)
          break label306;
      }
      label128: this.aCV.a(locala);
      paramConfig = this.aCV.c(localInteger.intValue(), localConfig);
      label152: localObject = (Bitmap)this.aCr.b(paramConfig);
      if (localObject != null)
      {
        a(Integer.valueOf(paramConfig.size), (Bitmap)localObject);
        if (((Bitmap)localObject).getConfig() == null)
          break label318;
      }
    }
    label297: label306: label312: label318: for (paramConfig = ((Bitmap)localObject).getConfig(); ; paramConfig = Bitmap.Config.ARGB_8888)
    {
      ((Bitmap)localObject).reconfigure(paramInt1, paramInt2, paramConfig);
      AppMethodBeat.o(91965);
      return localObject;
      switch (1.$SwitchMap$android$graphics$Bitmap$Config[paramConfig.ordinal()])
      {
      default:
        localObject = new Bitmap.Config[] { paramConfig };
        break;
      case 1:
        localObject = aCQ;
        break;
      case 2:
        localObject = aCS;
        break;
      case 3:
        localObject = aCT;
        break;
      case 4:
        localObject = aCU;
        break;
        if (!localConfig.equals(paramConfig))
          break label128;
        paramConfig = locala;
        break label152;
        i++;
        break label56;
      }
    }
  }

  public final String d(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(91970);
    paramConfig = a(j.j(paramInt1, paramInt2, paramConfig), paramConfig);
    AppMethodBeat.o(91970);
    return paramConfig;
  }

  public final void g(Bitmap paramBitmap)
  {
    AppMethodBeat.i(91964);
    int i = j.k(paramBitmap);
    n.a locala = this.aCV.c(i, paramBitmap.getConfig());
    this.aCr.a(locala, paramBitmap);
    NavigableMap localNavigableMap = b(paramBitmap.getConfig());
    paramBitmap = (Integer)localNavigableMap.get(Integer.valueOf(locala.size));
    int j = locala.size;
    if (paramBitmap == null);
    for (i = 1; ; i = paramBitmap.intValue() + 1)
    {
      localNavigableMap.put(Integer.valueOf(j), Integer.valueOf(i));
      AppMethodBeat.o(91964);
      return;
    }
  }

  public final String h(Bitmap paramBitmap)
  {
    AppMethodBeat.i(91969);
    paramBitmap = a(j.k(paramBitmap), paramBitmap.getConfig());
    AppMethodBeat.o(91969);
    return paramBitmap;
  }

  public final int i(Bitmap paramBitmap)
  {
    AppMethodBeat.i(91971);
    int i = j.k(paramBitmap);
    AppMethodBeat.o(91971);
    return i;
  }

  public final Bitmap mP()
  {
    AppMethodBeat.i(91966);
    Bitmap localBitmap = (Bitmap)this.aCr.removeLast();
    if (localBitmap != null)
      a(Integer.valueOf(j.k(localBitmap)), localBitmap);
    AppMethodBeat.o(91966);
    return localBitmap;
  }

  public final String toString()
  {
    AppMethodBeat.i(91972);
    StringBuilder localStringBuilder = new StringBuilder("SizeConfigStrategy{groupedMap=").append(this.aCr).append(", sortedSizes=(");
    Object localObject = this.aCC.entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      localStringBuilder.append(localEntry.getKey()).append('[').append(localEntry.getValue()).append("], ");
    }
    if (!this.aCC.isEmpty())
      localStringBuilder.replace(localStringBuilder.length() - 2, localStringBuilder.length(), "");
    localObject = ")}";
    AppMethodBeat.o(91972);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.n
 * JD-Core Version:    0.6.2
 */