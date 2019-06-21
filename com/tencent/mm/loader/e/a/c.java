package com.tencent.mm.loader.e.a;

import a.f.b.j;
import a.l;
import a.y;
import android.graphics.Bitmap;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.InputStream;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/impr/imageproducer/InputStreamBitmapProducer;", "Lcom/tencent/mm/loader/impr/imageproducer/ImageBitmapProducer;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "asResource", "Lcom/tencent/mm/loader/model/Resource;", "Landroid/graphics/Bitmap;", "targetView", "Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;", "reaper", "Lcom/tencent/mm/loader/Reaper;", "input", "Lcom/tencent/mm/loader/model/datasource/DataSource;", "libimageloader_release"})
public class c extends b
{
  private String TAG = "MicroMsg.Loader.InputStreamBitmapProducer";

  public com.tencent.mm.loader.h.e<Bitmap> a(com.tencent.mm.loader.e.b.f<?> paramf, com.tencent.mm.loader.f<?, Bitmap> paramf1, com.tencent.mm.loader.h.b.a parama)
  {
    j.p(paramf, "targetView");
    j.p(paramf1, "reaper");
    j.p(parama, "input");
    InputStream localInputStream = parama.Uj();
    boolean bool = paramf1.eOF.TD();
    String str = paramf1.eOF.TE();
    parama = new com.tencent.mm.ab.a("InputStreamBitmapProducer");
    ab.d(this.TAG, "hy: should check md5:".concat(String.valueOf(bool)));
    if (localInputStream != null)
      if (bool)
      {
        com.tencent.mm.loader.d.c localc = paramf1.eOM;
        if ((localc == null) || (localc.b(str, localInputStream) != true))
          break label164;
      }
    label164: for (paramf = com.tencent.mm.loader.l.a.a(paramf, localInputStream, paramf1.eOF.Tz(), paramf1.eOF.TA(), paramf1.eOF.TH(), paramf1.eOF.getAlpha(), paramf1.eOF.TB()); ; paramf = null)
    {
      paramf1 = y.AUy;
      parama.SW();
      return new com.tencent.mm.loader.h.e(paramf);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.e.a.c
 * JD-Core Version:    0.6.2
 */