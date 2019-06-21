package com.bumptech.glide.c.b;

import android.support.v4.f.k.a;
import android.util.Log;
import com.bumptech.glide.c.j;
import com.bumptech.glide.c.k;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class h<DataType, ResourceType, Transcode>
{
  private final Class<DataType> aBd;
  private final List<? extends k<DataType, ResourceType>> aBe;
  final com.bumptech.glide.c.d.f.e<ResourceType, Transcode> aBf;
  private final k.a<List<Throwable>> aBg;
  private final String aBh;

  public h(Class<DataType> paramClass, Class<ResourceType> paramClass1, Class<Transcode> paramClass2, List<? extends k<DataType, ResourceType>> paramList, com.bumptech.glide.c.d.f.e<ResourceType, Transcode> parame, k.a<List<Throwable>> parama)
  {
    AppMethodBeat.i(91804);
    this.aBd = paramClass;
    this.aBe = paramList;
    this.aBf = parame;
    this.aBg = parama;
    this.aBh = ("Failed DecodePath{" + paramClass.getSimpleName() + "->" + paramClass1.getSimpleName() + "->" + paramClass2.getSimpleName() + "}");
    AppMethodBeat.o(91804);
  }

  private u<ResourceType> a(com.bumptech.glide.c.a.e<DataType> parame, int paramInt1, int paramInt2, j paramj, List<Throwable> paramList)
  {
    AppMethodBeat.i(91806);
    Object localObject1 = null;
    int i = this.aBe.size();
    int j = 0;
    while (true)
    {
      Object localObject2 = localObject1;
      k localk;
      if (j < i)
        localk = (k)this.aBe.get(j);
      try
      {
        if (localk.a(parame.mj(), paramj))
        {
          localObject2 = localk.a(parame.mj(), paramInt1, paramInt2, paramj);
          localObject1 = localObject2;
          localObject2 = localObject1;
          if (localObject1 == null)
            j++;
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        while (true)
        {
          if (Log.isLoggable("DecodePath", 2))
            new StringBuilder("Failed to decode data for ").append(localk);
          paramList.add(localRuntimeException);
        }
        if (localRuntimeException == null)
        {
          parame = new p(this.aBh, new ArrayList(paramList));
          AppMethodBeat.o(91806);
          throw parame;
        }
        AppMethodBeat.o(91806);
        return localRuntimeException;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        break label107;
      }
      catch (IOException localIOException)
      {
        label107: 
        while (true);
      }
    }
  }

  final u<ResourceType> a(com.bumptech.glide.c.a.e<DataType> parame, int paramInt1, int paramInt2, j paramj)
  {
    AppMethodBeat.i(91805);
    List localList = (List)i.d(this.aBg.aA(), "Argument must not be null");
    try
    {
      parame = a(parame, paramInt1, paramInt2, paramj, localList);
      return parame;
    }
    finally
    {
      this.aBg.release(localList);
      AppMethodBeat.o(91805);
    }
    throw parame;
  }

  public final String toString()
  {
    AppMethodBeat.i(91807);
    String str = "DecodePath{ dataClass=" + this.aBd + ", decoders=" + this.aBe + ", transcoder=" + this.aBf + '}';
    AppMethodBeat.o(91807);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.h
 * JD-Core Version:    0.6.2
 */