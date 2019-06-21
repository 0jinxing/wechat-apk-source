package com.tencent.mm.loader.b.a;

import a.f.b.j;
import a.k.m;
import a.l;
import a.v;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/cache/disk/IDiskCache;", "T", "R", "", "()V", "mFileNameCreator", "Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;", "buildFilePath", "", "url", "Lcom/tencent/mm/loader/model/data/DataItem;", "opts", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "reaper", "Lcom/tencent/mm/loader/Reaper;", "clear", "", "configure", "Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder;", "delete", "", "diskGet", "Lcom/tencent/mm/loader/model/datasource/DataSource;", "exists", "get", "makeConfig", "onSaveCompleted", "diskResource", "Lcom/tencent/mm/loader/model/Resource;", "onSaveStarted", "httpResponse", "Lcom/tencent/mm/loader/model/Response;", "resource", "save", "source", "Companion", "libimageloader_release"})
public abstract class d<T, R>
{
  private static final String TAG = "MicroMsg.Loader.IDiskCache";
  public static final a ePm = new a((byte)0);
  private com.tencent.mm.loader.f.f ePi;

  public String a(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, R> paramf)
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

  public abstract boolean a(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.h.f<?> paramf, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, R> paramf1);

  public abstract boolean a(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.h.f<?> paramf, com.tencent.mm.loader.h.e<R> parame1, com.tencent.mm.loader.h.e<R> parame2, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, R> paramf1);

  public abstract boolean b(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, R> paramf);

  public abstract com.tencent.mm.loader.h.b.a c(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, R> paramf);

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/cache/disk/IDiskCache$Companion;", "", "()V", "TAG", "", "libimageloader_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.b.a.d
 * JD-Core Version:    0.6.2
 */