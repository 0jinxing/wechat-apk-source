package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.LinkedList;

public class f
{
  public byte[] eMl;
  ak fbD;
  private boolean vuA;
  private x.a vuB;
  volatile boolean vur;
  private HandlerThread vus;
  private ak vut;
  public HashMap<String, ImageView> vuu;
  public HashMap<ImageView, String> vuv;
  b<Bitmap> vuw;
  private SparseArray<Bitmap> vux;
  f.a<f.d> vuy;
  f.a<f.b> vuz;

  public f(int paramInt)
  {
    AppMethodBeat.i(79941);
    this.vur = false;
    this.eMl = new byte[0];
    this.vuA = true;
    this.vuB = new f.5(this);
    this.vuu = new HashMap();
    this.vuv = new HashMap();
    this.vus = d.anM("ImageEngine_handlerThread" + System.currentTimeMillis());
    this.vus.start();
    this.vut = new ak(this.vus.getLooper());
    this.fbD = new ak(Looper.getMainLooper());
    this.vuy = new f.1(this, this.vus.getLooper());
    this.vuz = new f.2(this, Looper.getMainLooper());
    this.vux = new SparseArray();
    this.vuw = new b(paramInt, new f.3(this), getClass());
    x.b(this.vuB);
    AppMethodBeat.o(79941);
  }

  private void b(ImageView paramImageView, int paramInt)
  {
    AppMethodBeat.i(79943);
    if (paramInt == 0)
    {
      f.c.k(paramImageView);
      AppMethodBeat.o(79943);
    }
    while (true)
    {
      return;
      Bitmap localBitmap1 = (Bitmap)this.vux.get(paramInt);
      Bitmap localBitmap2 = localBitmap1;
      if (localBitmap1 == null)
      {
        localBitmap2 = a.decodeResource(paramImageView.getResources(), paramInt);
        this.vux.put(paramInt, localBitmap2);
      }
      f.c.b(paramImageView, localBitmap2);
      AppMethodBeat.o(79943);
    }
  }

  static String o(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(79944);
    paramString1 = bo.bc(paramString1, "null") + "_" + bo.bc(paramString2, "null") + "_" + paramInt1 + "_" + paramInt2;
    AppMethodBeat.o(79944);
    return paramString1;
  }

  public final void a(ImageView paramImageView, String[] paramArrayOfString, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(79945);
    if (!this.vuA)
      AppMethodBeat.o(79945);
    String str1;
    while (true)
    {
      return;
      if (this.vur)
      {
        ab.w("MicroMsg.ImageEngine", "on attach, isQuit, return");
        AppMethodBeat.o(79945);
      }
      else if (paramImageView == null)
      {
        ab.w("MicroMsg.ImageEngine", "attach from file path fail, imageview is null");
        AppMethodBeat.o(79945);
      }
      else if (((paramArrayOfString == null) || (paramArrayOfString.length <= 0)) && (bo.isNullOrNil(paramString)))
      {
        ab.w("MicroMsg.ImageEngine", "attach from file path fail, path and url are null or empty");
        b(paramImageView, paramInt1);
        AppMethodBeat.o(79945);
      }
      else
      {
        if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
        {
          str1 = null;
          str1 = o(str1, paramString, paramInt2, paramInt3);
        }
        synchronized (this.eMl)
        {
          String str2 = (String)this.vuv.get(paramImageView);
          if (str2 != null)
            this.vuu.remove(str2);
          this.vuv.put(paramImageView, str1);
          ??? = (Bitmap)this.vuw.get(str1);
          if ((??? != null) && (!((Bitmap)???).isRecycled()))
          {
            f.c.b(paramImageView, (Bitmap)???);
            AppMethodBeat.o(79945);
            continue;
            str1 = paramArrayOfString[0];
          }
        }
      }
    }
    ab.v("MicroMsg.ImageEngine", "get first render bmp fail, key[%s]", new Object[] { str1 });
    boolean bool;
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 1))
    {
      i = 1;
      if (i < paramArrayOfString.length)
      {
        ??? = o(paramArrayOfString[i], paramString, paramInt2, paramInt3);
        ??? = (Bitmap)this.vuw.get((String)???);
        if (??? != null)
        {
          bool = true;
          label305: ab.v("MicroMsg.ImageEngine", "get next render bmp, key[%s], result[%B]", new Object[] { str1, Boolean.valueOf(bool) });
          if (??? == null)
            break label454;
          f.c.b(paramImageView, (Bitmap)???);
        }
      }
    }
    for (int i = 1; ; i = 0)
      while (true)
      {
        if (i == 0)
        {
          ab.v("MicroMsg.ImageEngine", "use default res to render");
          b(paramImageView, paramInt1);
        }
        synchronized (this.eMl)
        {
          this.vuu.put(str1, paramImageView);
          paramImageView = (f.b)this.vuz.dls();
          f.b.a(paramImageView, paramArrayOfString);
          f.b.a(paramImageView, paramString);
          f.b.b(paramImageView, str1);
          f.b.a(paramImageView, paramInt2);
          f.b.b(paramImageView, paramInt3);
          this.vut.postAtFrontOfQueueV2(paramImageView);
          AppMethodBeat.o(79945);
          break;
          bool = false;
          break label305;
          label454: i++;
        }
      }
  }

  public final void destroy()
  {
    AppMethodBeat.i(79942);
    ab.d("MicroMsg.ImageEngine", "do destroy");
    this.vur = true;
    this.vus.quit();
    x.c(this.vuB);
    SparseArray localSparseArray = this.vux;
    b localb = this.vuw;
    this.vux = new SparseArray();
    this.vuw = new b(1, getClass());
    d.post(new f.4(this, localSparseArray, localb), "ImageEngine_destroy_" + System.currentTimeMillis());
    AppMethodBeat.o(79942);
  }

  protected v h(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.f
 * JD-Core Version:    0.6.2
 */