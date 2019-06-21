package com.bumptech.glide.c.b;

import android.support.v4.f.k.a;
import com.bumptech.glide.c.j;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class s<Data, ResourceType, Transcode>
{
  private final Class<Data> aBd;
  private final k.a<List<Throwable>> aBg;
  private final String aBh;
  private final List<? extends h<Data, ResourceType, Transcode>> aCc;

  public s(Class<Data> paramClass, Class<ResourceType> paramClass1, Class<Transcode> paramClass2, List<h<Data, ResourceType, Transcode>> paramList, k.a<List<Throwable>> parama)
  {
    AppMethodBeat.i(91864);
    this.aBd = paramClass;
    this.aBg = parama;
    this.aCc = ((List)i.c(paramList));
    this.aBh = ("Failed LoadPath{" + paramClass.getSimpleName() + "->" + paramClass1.getSimpleName() + "->" + paramClass2.getSimpleName() + "}");
    AppMethodBeat.o(91864);
  }

  private u<Transcode> a(com.bumptech.glide.c.a.e<Data> parame, j paramj, int paramInt1, int paramInt2, h.a<ResourceType> parama, List<Throwable> paramList)
  {
    AppMethodBeat.i(91866);
    Object localObject1 = null;
    int i = this.aCc.size();
    int j = 0;
    while (true)
      if (j < i)
      {
        Object localObject2 = (h)this.aCc.get(j);
        try
        {
          u localu = parama.a(((h)localObject2).a(parame, paramInt1, paramInt2, paramj));
          localObject2 = ((h)localObject2).aBf.a(localu, paramj);
          localObject1 = localObject2;
          localObject2 = localObject1;
          if (localObject1 != null)
            break label117;
          j++;
        }
        catch (p localp)
        {
          while (true)
            paramList.add(localp);
        }
      }
    Object localObject3 = localObject1;
    label117: if (localObject3 == null)
    {
      parame = new p(this.aBh, new ArrayList(paramList));
      AppMethodBeat.o(91866);
      throw parame;
    }
    AppMethodBeat.o(91866);
    return localObject3;
  }

  public final u<Transcode> a(com.bumptech.glide.c.a.e<Data> parame, j paramj, int paramInt1, int paramInt2, h.a<ResourceType> parama)
  {
    AppMethodBeat.i(91865);
    List localList = (List)i.d(this.aBg.aA(), "Argument must not be null");
    try
    {
      parame = a(parame, paramj, paramInt1, paramInt2, parama, localList);
      return parame;
    }
    finally
    {
      this.aBg.release(localList);
      AppMethodBeat.o(91865);
    }
    throw parame;
  }

  public final String toString()
  {
    AppMethodBeat.i(91867);
    String str = "LoadPath{decodePaths=" + Arrays.toString(this.aCc.toArray()) + '}';
    AppMethodBeat.o(91867);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.s
 * JD-Core Version:    0.6.2
 */