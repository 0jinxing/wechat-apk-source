package com.tencent.mm.loader.a;

import a.f.b.j;
import a.f.b.u.c;
import a.l;
import a.v;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.mm.loader.e.b.d.a;
import com.tencent.mm.loader.e.c.b.b;
import com.tencent.mm.loader.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/builder/BitmapRequestBuilder;", "T", "Lcom/tencent/mm/loader/builder/RequestBuilder;", "Landroid/graphics/Bitmap;", "reqValue", "Lcom/tencent/mm/loader/model/data/DataItem;", "mImageLoaderConfiguration", "Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;", "(Lcom/tencent/mm/loader/model/data/DataItem;Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;)V", "into", "", "imageView", "Landroid/widget/ImageView;", "withStruct", "Lcom/tencent/mm/loader/IRequestBuilder;", "V", "(Ljava/lang/Object;)Lcom/tencent/mm/loader/IRequestBuilder;", "libimageloader_release"})
public final class a<T> extends b<T, Bitmap>
{
  public a(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.c.d<T, Bitmap> paramd)
  {
    super(parama, paramd);
  }

  public final void d(ImageView paramImageView)
  {
    j.p(paramImageView, "imageView");
    this.eOZ = ((com.tencent.mm.loader.e.b.c)new com.tencent.mm.loader.e.b.b(new com.tencent.mm.loader.e.b.f(paramImageView)));
    com.tencent.mm.loader.f localf = new com.tencent.mm.loader.f(this, this.ePg);
    localf.eOY = localf.ePb.ePf;
    Object localObject1 = localf.ePb.eOZ;
    paramImageView = (ImageView)localObject1;
    if (localObject1 == null)
      paramImageView = (com.tencent.mm.loader.e.b.c)new com.tencent.mm.loader.e.b.a();
    localf.eOZ = paramImageView;
    paramImageView = com.tencent.mm.loader.e.b.d.eQA;
    paramImageView = d.a.TN();
    Object localObject2 = localf.eOZ;
    if (localObject2 == null)
      j.avw("target");
    if (localObject2 == null)
      throw new v("null cannot be cast to non-null type com.tencent.mm.loader.impr.target.ResourceShowTarget<kotlin.Any>");
    Object localObject3 = localf.eOY;
    j.p(localObject2, "target");
    j.p(localObject3, "data");
    ab.i(com.tencent.mm.loader.e.b.d.TAG, "register " + localObject2 + " data " + localObject3);
    ConcurrentMap localConcurrentMap = (ConcurrentMap)paramImageView.map;
    paramImageView = localConcurrentMap.get(localObject2);
    if (paramImageView == null)
    {
      localObject1 = (Set)new LinkedHashSet();
      localObject2 = localConcurrentMap.putIfAbsent(localObject2, localObject1);
      paramImageView = (ImageView)localObject2;
      if (localObject2 == null)
        paramImageView = (ImageView)localObject1;
    }
    while (true)
    {
      ((Collection)paramImageView).add(localObject3);
      paramImageView = localf.eOY;
      int i;
      if (localf.eOY.Ug())
      {
        if ((localf.eOY.value() instanceof String))
        {
          localObject1 = localf.eOY.value();
          if (localObject1 == null)
            throw new v("null cannot be cast to non-null type kotlin.String");
          if (!bo.isNullOrNil((String)localObject1));
        }
      }
      else
      {
        i = 1;
        if (i == 0)
          break label356;
      }
      while (true)
        if (paramImageView != null)
        {
          paramImageView = com.tencent.mm.loader.e.b.d.eQA;
          paramImageView = d.a.TN();
          localObject1 = localf.eOZ;
          if (localObject1 == null)
            j.avw("target");
          if (localObject1 == null)
          {
            throw new v("null cannot be cast to non-null type com.tencent.mm.loader.impr.target.ResourceShowTarget<kotlin.Any>");
            i = 0;
            break;
            label356: paramImageView = null;
            continue;
          }
          paramImageView.a((com.tencent.mm.loader.e.b.c)localObject1);
          paramImageView = localf.eOF;
          if (paramImageView != null)
          {
            paramImageView = paramImageView.TG();
            Arrays.copyOf(paramImageView, paramImageView.length);
          }
        }
      while (true)
      {
        return;
        paramImageView = null;
        break;
        localObject1 = new u.c();
        if (localf.eOF.Ts())
        {
          paramImageView = localf.eOK.a(localf.eOY, localf.eOQ);
          label427: ((u.c)localObject1).AVE = paramImageView;
          bool = ((Boolean)((a.f.a.a)new f.b(localf, (u.c)localObject1)).invoke()).booleanValue();
          paramImageView = (com.tencent.mm.loader.h.e)((u.c)localObject1).AVE;
          if (paramImageView == null)
            break label669;
          if (!paramImageView.isValid())
            break label654;
        }
        while (true)
          if (paramImageView != null)
          {
            paramImageView = paramImageView.getValue();
            if (paramImageView != null)
            {
              ab.d(com.tencent.mm.loader.f.TAG, "[ImageLoader] load from cache. not need to url: %s", new Object[] { localf.eOY });
              localObject2 = new com.tencent.mm.loader.h.e(paramImageView);
              localObject1 = localf.eOQ;
              if (localObject1 != null)
              {
                localObject3 = localf.eOZ;
                if (localObject3 == null)
                  j.avw("target");
                ((com.tencent.mm.loader.e.c.a)localObject1).a(((com.tencent.mm.loader.e.b.c)localObject3).eQw, localf, (com.tencent.mm.loader.h.e)localObject2, b.b.eQN);
              }
              localObject1 = localf.eOZ;
              if (localObject1 == null)
                j.avw("target");
              ((com.tencent.mm.loader.e.b.c)localObject1).aP(paramImageView);
              if (localf.eOI != null)
              {
                localObject1 = com.tencent.mm.loader.h.c.eRS;
                i = com.tencent.mm.loader.h.c.TY();
                localObject1 = com.tencent.mm.loader.h.c.eRS;
                new com.tencent.mm.loader.h.c(i, com.tencent.mm.loader.h.c.Ub(), paramImageView);
              }
              paramImageView = com.tencent.mm.loader.e.b.d.eQA;
              localObject1 = d.a.TN();
              paramImageView = localf.eOZ;
              if (paramImageView == null)
                j.avw("target");
              if (paramImageView == null)
              {
                throw new v("null cannot be cast to non-null type com.tencent.mm.loader.impr.target.ResourceShowTarget<kotlin.Any>");
                paramImageView = null;
                break label427;
                label654: paramImageView = null;
                continue;
              }
              ((com.tencent.mm.loader.e.b.d)localObject1).a(paramImageView);
              if (!bool)
                break;
            }
          }
        label669: localObject1 = localf.eOY;
        paramImageView = localf.eOZ;
        if (paramImageView == null)
          j.avw("target");
        paramImageView = new com.tencent.mm.loader.k.a((com.tencent.mm.loader.h.a.a)localObject1, paramImageView, localf);
        if (com.tencent.mm.loader.c.e.DEBUG)
        {
          localObject1 = bo.dpG().toString();
          j.o(localObject1, "Util.getStack().toString()");
          paramImageView.ePa = ((String)localObject1);
          localf.ePa = ((String)localObject1);
        }
        ab.d(com.tencent.mm.loader.f.TAG, "[ImageLoader] load from task:%s", new Object[] { localf.eOY });
        localObject2 = localf.eOZ;
        if (localObject2 == null)
          j.avw("target");
        localObject1 = localf.eOZ;
        if (localObject1 == null)
          j.avw("target");
        ((com.tencent.mm.loader.e.b.c)localObject2).a(((com.tencent.mm.loader.e.b.c)localObject1).eQw, localf);
        paramImageView = (com.tencent.mm.loader.k.b)paramImageView;
        boolean bool = localf.eOF.Tu();
        localf.Td();
        localObject1 = localf.eOT;
        if (localObject1 != null)
          ((com.tencent.mm.loader.g.d)localObject1).a((com.tencent.mm.loader.g.c)paramImageView);
        if (bool)
          com.tencent.mm.loader.l.b.Us();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.a.a
 * JD-Core Version:    0.6.2
 */