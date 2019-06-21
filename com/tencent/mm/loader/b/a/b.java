package com.tencent.mm.loader.b.a;

import a.f.b.j;
import a.k.m;
import a.l;
import a.v;
import android.graphics.Bitmap;
import com.tencent.mm.loader.f<*Landroid.graphics.Bitmap;>;
import com.tencent.mm.loader.h.a.a<Ljava.lang.String;>;
import com.tencent.mm.modelsfs.SFSContext;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.FileNotFoundException;
import java.io.InputStream;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/cache/disk/DefaultImageDiskCache;", "Lcom/tencent/mm/loader/cache/disk/IDiskCache;", "", "Landroid/graphics/Bitmap;", "()V", "mFileNameCreator", "Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;", "buildFilePath", "url", "Lcom/tencent/mm/loader/model/data/DataItem;", "opts", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "reaper", "Lcom/tencent/mm/loader/Reaper;", "clear", "", "delete", "", "exists", "get", "Lcom/tencent/mm/loader/model/datasource/DataSource;", "getGeneralFilePathFromOptions", "onSaveCompleted", "diskResource", "Lcom/tencent/mm/loader/model/Resource;", "onSaveStarted", "httpResponse", "Lcom/tencent/mm/loader/model/Response;", "resource", "save", "source", "Companion", "libimageloader_release"})
public final class b extends d<String, Bitmap>
{
  private static final String TAG = "MicroMsg.Loader.imageloader.DefaultImageDiskCache";
  public static final b.a ePk = new b.a((byte)0);
  private com.tencent.mm.loader.f.f ePi;

  public final String a(com.tencent.mm.loader.h.a.a<String> parama, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, Bitmap> paramf)
  {
    j.p(parama, "url");
    j.p(parame, "opts");
    j.p(paramf, "reaper");
    String str1 = parame.Tx();
    if (str1 != null)
    {
      paramf = str1;
      if (str1.length() != 0);
    }
    else
    {
      String str2 = parame.Tv();
      paramf = str1;
      if (str2 != null)
      {
        paramf = str1;
        if (str2.length() > 0)
        {
          parame = parame.Tw();
          if ((parame == null) || (parame.length() == 0) || (!m.jb(str2, parame)))
          {
            ab.e(TAG, "[johnw] SFS can't deal with absolute path: %s", new Object[] { str2 });
            throw ((Throwable)new IllegalArgumentException("SFS can't deal with absolute path: ".concat(String.valueOf(str2))));
          }
          parame = str2.substring(parame.length());
          j.o(parame, "(this as java.lang.String).substring(startIndex)");
          paramf = parame;
          if (m.jb(parame, "/"))
          {
            if (parame == null)
              throw new v("null cannot be cast to non-null type java.lang.String");
            paramf = parame.substring(1);
            j.o(paramf, "(this as java.lang.String).substring(startIndex)");
          }
        }
      }
    }
    if (paramf != null)
    {
      parame = paramf;
      if (paramf.length() != 0);
    }
    else
    {
      parame = this.ePi;
      if (parame == null)
        j.dWJ();
      parame = parame.b(parama);
    }
    if (parame != null)
    {
      parama = parame;
      if (parame.length() != 0);
    }
    else
    {
      parama = "";
    }
    return parama;
  }

  public final boolean a(com.tencent.mm.loader.h.a.a<String> parama, com.tencent.mm.loader.h.f<?> paramf, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, Bitmap> paramf1)
  {
    j.p(parama, "url");
    j.p(paramf, "httpResponse");
    j.p(parame, "opts");
    j.p(paramf1, "reaper");
    return true;
  }

  public final boolean a(com.tencent.mm.loader.h.a.a<String> parama, com.tencent.mm.loader.h.f<?> paramf, com.tencent.mm.loader.h.e<Bitmap> parame1, com.tencent.mm.loader.h.e<Bitmap> parame2, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, Bitmap> paramf1)
  {
    j.p(parama, "url");
    j.p(paramf, "httpResponse");
    j.p(parame1, "source");
    j.p(parame, "opts");
    j.p(paramf1, "reaper");
    return true;
  }

  public final boolean b(com.tencent.mm.loader.h.a.a<String> parama, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, Bitmap> paramf)
  {
    j.p(parama, "url");
    j.p(parame, "opts");
    j.p(paramf, "reaper");
    return true;
  }

  public final com.tencent.mm.loader.h.b.a c(com.tencent.mm.loader.h.a.a<String> parama, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, Bitmap> paramf)
  {
    int i = 0;
    j.p(parama, "url");
    j.p(parame, "opts");
    j.p(paramf, "reaper");
    try
    {
      com.tencent.mm.loader.h.b.a locala;
      if (parama.Uf() == com.tencent.mm.loader.h.a.b.eRX)
        locala = com.tencent.mm.loader.h.b.a.lU(parama.Uh());
      for (parama = locala; ; parama = locala)
      {
        return parama;
        if (parama.Uf() != com.tencent.mm.loader.h.a.b.eRY)
          break;
        locala = com.tencent.mm.loader.h.b.a.i(parama.Uh(), com.tencent.mm.vending.j.b.cW(parama.Uh()));
      }
    }
    catch (Exception localException)
    {
      while (true)
        try
        {
          Object localObject = parame.TF();
          if (localObject != null)
          {
            parama = a(parama, parame, paramf);
            parame = (CharSequence)parama;
            if ((parame == null) || (parame.length() == 0))
              i = 1;
            if (i != 0)
              parama = null;
            else
              parama = com.tencent.mm.loader.h.b.a.a(((SFSContext)localObject).openRead(parama), ((SFSContext)localObject).openRead(parama));
          }
          else
          {
            localObject = parame.Tv();
            if (localObject != null)
            {
              paramf = (com.tencent.mm.loader.f<?, Bitmap>)localObject;
              if (((String)localObject).length() != 0);
            }
            else
            {
              localObject = parame.Tw();
              paramf = (com.tencent.mm.loader.f<?, Bitmap>)localObject;
              if (localObject != null)
              {
                paramf = (com.tencent.mm.loader.f<?, Bitmap>)localObject;
                if (((String)localObject).length() != 0)
                {
                  paramf = new java/lang/StringBuilder;
                  paramf.<init>();
                  paramf = paramf.append((String)localObject).append("/");
                  localObject = this.ePi;
                  if (localObject == null)
                    j.dWJ();
                  paramf = ((com.tencent.mm.loader.f.f)localObject).b(parama);
                }
              }
            }
            localObject = paramf;
            if (parame.Tu())
            {
              localObject = paramf;
              if (bo.isNullOrNil(paramf))
              {
                parame = new java/lang/StringBuilder;
                parame.<init>();
                parame = parame.append(com.tencent.mm.loader.l.b.Ur()).append("/");
                paramf = this.ePi;
                if (paramf == null)
                  j.dWJ();
                localObject = paramf.b(parama);
              }
            }
            if (localObject != null)
            {
              parama = (com.tencent.mm.loader.h.a.a<String>)localObject;
              if (((String)localObject).length() != 0);
            }
            else
            {
              parama = null;
            }
            parame = (CharSequence)parama;
            if ((parame == null) || (parame.length() == 0))
            {
              i = 1;
              if (i != 0)
                parama = null;
            }
            else
            {
              i = 0;
              continue;
              parame = new com/tencent/mm/vfs/d;
              parame.<init>(parama);
              paramf = (InputStream)parame;
              parame = new com/tencent/mm/vfs/d;
              parame.<init>(parama);
              parama = com.tencent.mm.loader.h.b.a.a(paramf, (InputStream)parame);
            }
          }
        }
        catch (FileNotFoundException parama)
        {
          parama = null;
        }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.b.a.b
 * JD-Core Version:    0.6.2
 */