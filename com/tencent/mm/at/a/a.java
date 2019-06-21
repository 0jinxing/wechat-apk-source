package com.tencent.mm.at.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.at.a.c.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

public final class a
{
  private static a fGJ = null;
  private b fGG;
  private com.tencent.mm.at.a.a.b fGH;
  private final i fGI;

  public a(Context paramContext)
  {
    AppMethodBeat.i(116018);
    this.fGI = new com.tencent.mm.at.a.b.h();
    a(com.tencent.mm.at.a.a.b.bZ(paramContext));
    AppMethodBeat.o(116018);
  }

  public a(com.tencent.mm.at.a.a.b paramb)
  {
    AppMethodBeat.i(116019);
    this.fGI = new com.tencent.mm.at.a.b.h();
    a(paramb);
    AppMethodBeat.o(116019);
  }

  private static ak a(com.tencent.mm.at.a.a.c paramc)
  {
    AppMethodBeat.i(116035);
    paramc = paramc.handler;
    if ((paramc == null) || (Looper.myLooper() == Looper.getMainLooper()))
      paramc = new ak();
    AppMethodBeat.o(116035);
    return paramc;
  }

  private void a(ImageView paramImageView, com.tencent.mm.at.a.a.c paramc)
  {
    AppMethodBeat.i(116033);
    if ((paramImageView == null) || (paramc == null))
    {
      ab.w("MicroMsg.imageloader.ImageLoader", "[cpan] should show default background view or options is null.");
      AppMethodBeat.o(116033);
    }
    while (true)
    {
      return;
      if (paramc.ahB())
      {
        if (paramc.ePV == 0)
        {
          paramImageView.setBackgroundDrawable(paramc.e(this.fGH.aEH));
          AppMethodBeat.o(116033);
        }
        else
        {
          paramImageView.setBackgroundResource(paramc.ePV);
          AppMethodBeat.o(116033);
        }
      }
      else
      {
        paramImageView.setBackgroundDrawable(null);
        AppMethodBeat.o(116033);
      }
    }
  }

  private void a(com.tencent.mm.at.a.a.b paramb)
  {
    try
    {
      AppMethodBeat.i(116020);
      if (paramb == null)
      {
        paramb = new java/lang/IllegalArgumentException;
        paramb.<init>("[cpan] image loader configuration is null.");
        AppMethodBeat.o(116020);
        throw paramb;
      }
    }
    finally
    {
    }
    if (this.fGH == null)
    {
      b localb = new com/tencent/mm/at/a/b;
      localb.<init>(paramb);
      this.fGG = localb;
      this.fGH = paramb;
      AppMethodBeat.o(116020);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.imageloader.ImageLoader", "[cpan] image loader had init.");
      AppMethodBeat.o(116020);
    }
  }

  public static a ahv()
  {
    try
    {
      AppMethodBeat.i(116017);
      if (fGJ == null)
      {
        locala = new com/tencent/mm/at/a/a;
        locala.<init>(ah.getContext());
        fGJ = locala;
      }
      a locala = fGJ;
      AppMethodBeat.o(116017);
      return locala;
    }
    finally
    {
    }
  }

  private void b(ImageView paramImageView, com.tencent.mm.at.a.a.c paramc)
  {
    AppMethodBeat.i(116034);
    if ((paramImageView == null) || (paramc == null))
    {
      ab.w("MicroMsg.imageloader.ImageLoader", "[cpan] should show default image view or options is null.");
      AppMethodBeat.o(116034);
    }
    while (true)
    {
      return;
      if (paramc.ahA())
      {
        if (paramc.ePT == 0)
        {
          paramImageView.setImageDrawable(paramc.d(this.fGH.aEH));
          AppMethodBeat.o(116034);
        }
        else
        {
          paramImageView.setImageResource(paramc.ePT);
          AppMethodBeat.o(116034);
        }
      }
      else
      {
        if (paramc.ePZ)
          paramImageView.setImageDrawable(null);
        AppMethodBeat.o(116034);
      }
    }
  }

  private void b(String paramString, ImageView paramImageView, com.tencent.mm.at.a.a.c paramc, i parami, g paramg)
  {
    AppMethodBeat.i(116027);
    if (paramc == null)
      paramc = this.fGH.fGS;
    while (true)
    {
      if (parami == null)
        parami = this.fGI;
      while (true)
      {
        c localc = new c(paramImageView, paramString);
        a(paramImageView, paramc);
        if (bo.isNullOrNil(paramString))
        {
          ab.w("MicroMsg.imageloader.ImageLoader", "[cpan load image url is null.]");
          b(paramImageView, paramc);
          this.fGG.a(localc);
          parami.a(paramString, paramImageView, null, paramc.eQd);
          AppMethodBeat.o(116027);
        }
        while (true)
        {
          return;
          com.tencent.mm.at.a.f.b localb = new com.tencent.mm.at.a.f.b(paramString, localc, a(paramc), paramc, parami, this.fGG, paramg);
          parami = localb.sJ(paramString);
          Bitmap localBitmap = this.fGG.sB(parami);
          if ((localBitmap != null) && (!localBitmap.isRecycled()))
          {
            ab.d("MicroMsg.imageloader.ImageLoader", "[cpan] load from cache. not need to load:%s", new Object[] { parami });
            parami = localBitmap;
            if (paramc.fHf)
              parami = d.e(localBitmap, paramc.fHg);
            if (paramImageView != null)
              paramImageView.setImageBitmap(parami);
            localb.fN(0L);
            if (paramg != null)
              paramg.b(paramString, paramImageView, new com.tencent.mm.at.a.d.b(parami));
            this.fGG.a(localc);
            AppMethodBeat.o(116027);
          }
          else
          {
            if (paramImageView != null)
              b(paramImageView, paramc);
            if (((localb.fGS.ePI) || (!this.fGG.DA())) && (this.fGG.a(localc, paramString)))
            {
              this.fGG.a(localb);
              this.fGG.a(localb, paramc.ePG);
            }
            AppMethodBeat.o(116027);
          }
        }
      }
    }
  }

  public final void a(String paramString, ImageView paramImageView)
  {
    AppMethodBeat.i(116021);
    b(paramString, paramImageView, null, null, null);
    AppMethodBeat.o(116021);
  }

  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.at.a.a.c paramc)
  {
    AppMethodBeat.i(116025);
    b(paramString, paramImageView, paramc, null, null);
    AppMethodBeat.o(116025);
  }

  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.at.a.a.c paramc, g paramg)
  {
    AppMethodBeat.i(116023);
    b(paramString, paramImageView, paramc, null, paramg);
    AppMethodBeat.o(116023);
  }

  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.at.a.a.c paramc, i parami)
  {
    AppMethodBeat.i(116026);
    b(paramString, paramImageView, paramc, parami, null);
    AppMethodBeat.o(116026);
  }

  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.at.a.a.c paramc, i parami, g paramg)
  {
    AppMethodBeat.i(116024);
    b(paramString, paramImageView, paramc, parami, paramg);
    AppMethodBeat.o(116024);
  }

  public final void a(String paramString, ImageView paramImageView, g paramg)
  {
    AppMethodBeat.i(116022);
    b(paramString, paramImageView, null, null, paramg);
    AppMethodBeat.o(116022);
  }

  public final void a(String paramString, com.tencent.mm.at.a.a.c paramc, com.tencent.mm.at.a.c.c paramc1)
  {
    AppMethodBeat.i(116036);
    paramString = new com.tencent.mm.at.a.f.a(paramString, paramc, this.fGG, paramc1);
    this.fGG.fGL.execute(paramString);
    AppMethodBeat.o(116036);
  }

  public final void b(String paramString, ImageView paramImageView)
  {
    AppMethodBeat.i(116028);
    paramString = new c(paramImageView, paramString);
    this.fGG.a(paramString);
    AppMethodBeat.o(116028);
  }

  public final void cm(int paramInt)
  {
    AppMethodBeat.i(116029);
    ab.d("MicroMsg.imageloader.ImageLoader", "[cpan] on scroll state changed :%d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt == 0) || (paramInt == 1))
    {
      ab.d("MicroMsg.imageloader.ImageLoader", "[cpan] resume");
      this.fGG.fGL.resume();
      AppMethodBeat.o(116029);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.imageloader.ImageLoader", "[cpan] pause");
      this.fGG.fGL.pause();
      AppMethodBeat.o(116029);
    }
  }

  public final void detach()
  {
    AppMethodBeat.i(116030);
    if (this.fGG != null)
      this.fGG.ahw();
    AppMethodBeat.o(116030);
  }

  public final void j(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(116032);
    if (this.fGG != null)
    {
      b localb = this.fGG;
      if (localb.fGK != null)
        localb.fGK.fGT.c(paramString, paramBitmap);
    }
    AppMethodBeat.o(116032);
  }

  public final Bitmap sB(String paramString)
  {
    AppMethodBeat.i(116031);
    if (this.fGG != null)
    {
      paramString = this.fGG.sB(paramString);
      AppMethodBeat.o(116031);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(116031);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.a
 * JD-Core Version:    0.6.2
 */