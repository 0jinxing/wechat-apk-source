package com.tencent.mm.loader.e.c;

import a.f.b.j;
import a.l;
import com.tencent.mm.loader.h.e;
import com.tencent.mm.loader.h.e<TT;>;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;", "T", "Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder;", "transcoder", "(Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder;)V", "asResource", "Lcom/tencent/mm/loader/model/Resource;", "targetView", "Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;", "reaper", "Lcom/tencent/mm/loader/Reaper;", "source", "when", "Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder$WHENIF;", "asResourceName", "", "ishasTransCoderWhenDownload", "", "libimageloader_release"})
public final class a<T> extends b<T>
{
  public final e<? extends T> a(com.tencent.mm.loader.e.b.f<?> paramf, com.tencent.mm.loader.f<?, T> paramf1, e<T> parame)
  {
    j.p(paramf, "targetView");
    j.p(paramf1, "reaper");
    j.p(parame, "source");
    return parame;
  }

  public final e<T> a(com.tencent.mm.loader.e.b.f<?> paramf, com.tencent.mm.loader.f<?, T> paramf1, e<T> parame, b.b paramb)
  {
    j.p(paramf, "targetView");
    j.p(paramf1, "reaper");
    j.p(parame, "source");
    j.p(paramb, "when");
    Object localObject1 = ((a)this).eQG;
    Object localObject2 = localObject1;
    if (!(localObject1 instanceof b))
      localObject2 = null;
    Object localObject3 = localObject2;
    localObject1 = parame;
    if (localObject2 == null)
    {
      localObject1 = ((a)this).eQG;
      localObject2 = localObject1;
      if (!(localObject1 instanceof b))
        localObject2 = null;
      localObject3 = localObject2;
      localObject1 = parame;
      if (localObject2 == null)
      {
        localObject1 = ((a)this).eQG;
        localObject2 = localObject1;
        if (!(localObject1 instanceof b))
          localObject2 = null;
        localObject3 = localObject2;
        localObject1 = parame;
        if (localObject2 != null)
          break label357;
        return parame;
      }
    }
    else
    {
      label135: parame = (e<T>)localObject1;
      if (localObject3.eQH == b.a.eQL)
      {
        parame = (e<T>)localObject1;
        if (paramb == localObject3.eQI)
          if ((localObject1 instanceof e))
            break label489;
      }
    }
    label357: label489: for (parame = null; ; parame = (e<T>)localObject1)
    {
      if (parame == null)
        j.dWJ();
      localObject2 = localObject3.a(paramf, paramf1, parame);
      parame = (e<T>)localObject2;
      if (!(localObject2 instanceof e))
        parame = null;
      if (parame == null)
        parame = (e<T>)localObject1;
      while (true)
      {
        localObject1 = localObject3.eQG;
        localObject2 = localObject1;
        if (!(localObject1 instanceof b))
          localObject2 = null;
        localObject3 = localObject2;
        localObject1 = parame;
        if (localObject2 != null)
          break label135;
        break;
        label246: parame = (e<T>)localObject1;
        if (localObject3.eQH == b.a.eQK)
        {
          parame = (e<T>)localObject1;
          if (paramb == localObject3.eQI)
            if ((localObject1 instanceof e))
              break label480;
        }
        for (parame = null; ; parame = (e<T>)localObject1)
        {
          if (parame == null)
            j.dWJ();
          localObject2 = localObject3.a(paramf, paramf1, parame);
          parame = (e<T>)localObject2;
          if (!(localObject2 instanceof e))
            parame = null;
          if (parame == null)
            parame = (e<T>)localObject1;
          while (true)
          {
            localObject1 = localObject3.eQG;
            localObject2 = localObject1;
            if (!(localObject1 instanceof b))
              localObject2 = null;
            localObject3 = localObject2;
            localObject1 = parame;
            if (localObject2 != null)
              break label246;
            break;
            parame = (e<T>)localObject1;
            if (localObject3.eQH == b.a.eQJ)
            {
              parame = (e<T>)localObject1;
              if (paramb == localObject3.eQI)
                if ((localObject1 instanceof e))
                  break label471;
            }
            for (parame = null; ; parame = (e<T>)localObject1)
            {
              if (parame == null)
                j.dWJ();
              localObject2 = localObject3.a(paramf, paramf1, parame);
              parame = (e<T>)localObject2;
              if (!(localObject2 instanceof e))
                parame = null;
              if (parame == null)
                parame = (e<T>)localObject1;
              while (true)
              {
                localObject1 = localObject3.eQG;
                localObject2 = localObject1;
                if (!(localObject1 instanceof b))
                  localObject2 = null;
                localObject3 = localObject2;
                localObject1 = parame;
                if (localObject2 != null)
                  break label357;
                break;
              }
            }
          }
        }
      }
    }
  }

  public final String lS(String paramString)
  {
    j.p(paramString, "source");
    b localb1 = ((a)this).eQG;
    b localb2 = localb1;
    String str = paramString;
    if (localb1 == null)
    {
      localb1 = ((a)this).eQG;
      localb2 = localb1;
      str = paramString;
      if (localb1 != null)
        break label127;
      label40: localb1 = ((a)this).eQG;
      localb2 = localb1;
      str = paramString;
      if (localb1 != null)
        break label195;
    }
    while (true)
    {
      return paramString;
      do
      {
        paramString = str;
        if (localb2.eQH == b.a.eQL)
        {
          paramString = str;
          if (b.b.eQO == localb2.eQI)
            paramString = str + localb2.lS(str);
        }
        localb1 = localb2.eQG;
        localb2 = localb1;
        str = paramString;
      }
      while (localb1 != null);
      break;
      label127: 
      do
      {
        paramString = str;
        if (localb2.eQH == b.a.eQK)
        {
          paramString = str;
          if (b.b.eQO == localb2.eQI)
            paramString = str + localb2.lS(str);
        }
        localb1 = localb2.eQG;
        localb2 = localb1;
        str = paramString;
      }
      while (localb1 != null);
      break label40;
      label195: 
      do
      {
        paramString = str;
        if (localb2.eQH == b.a.eQJ)
        {
          paramString = str;
          if (b.b.eQO == localb2.eQI)
            paramString = str + localb2.lS(str);
        }
        localb1 = localb2.eQG;
        localb2 = localb1;
        str = paramString;
      }
      while (localb1 != null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.e.c.a
 * JD-Core Version:    0.6.2
 */