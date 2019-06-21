package com.tencent.mm.plugin.game.f;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.io.File;
import java.lang.ref.WeakReference;

public class e
{
  private static final String nnA;
  private static e nnB;
  private f<String, Bitmap> neb;
  private f<String, Bitmap> nkP;
  private ColorDrawable nnC;
  private Bitmap nnD;
  private Bitmap nnE;

  static
  {
    AppMethodBeat.i(112353);
    nnA = com.tencent.mm.loader.j.b.eSn + "Game/Image/";
    AppMethodBeat.o(112353);
  }

  private e()
  {
    AppMethodBeat.i(112336);
    this.neb = new com.tencent.mm.memory.a.b(6, getClass());
    this.nkP = new com.tencent.mm.memory.a.b(15, getClass());
    this.nnC = new ColorDrawable(android.support.v4.content.b.i(ah.getContext(), 2131690079));
    try
    {
      this.nnD = BackwardSupportUtil.b.b(ah.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bz.a.getDensity(null));
      if ((this.nnD != null) && (!this.nnD.isRecycled()))
        this.nnE = d.a(this.nnD, false, 0.5F * this.nnD.getWidth());
      com.tencent.mm.plugin.s.a.bYJ().c(new k.a()
      {
        public final void a(String paramAnonymousString, m paramAnonymousm)
        {
          AppMethodBeat.i(112326);
          if (e.a(e.this).aj(paramAnonymousString))
          {
            paramAnonymousm = com.tencent.mm.pluginsdk.model.app.g.b(paramAnonymousString, 1, com.tencent.mm.bz.a.getDensity(null));
            e.a(e.this).k(paramAnonymousString, paramAnonymousm);
          }
          AppMethodBeat.o(112326);
        }
      });
      AppMethodBeat.o(112336);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.i("MicroMsg.GameImageUtil", localException.getMessage());
    }
  }

  private static boolean Ov(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(112350);
    File localFile1 = new File(paramString);
    File localFile2;
    if (!localFile1.exists())
      if (!localFile1.getParentFile().exists())
      {
        localFile2 = localFile1.getParentFile();
        File localFile3 = new File(localFile2.getAbsolutePath() + System.currentTimeMillis());
        if (localFile3.mkdir())
          localFile3.renameTo(localFile2);
      }
      else
      {
        if ((localFile1.mkdir()) && (localFile1.isDirectory()))
          break label147;
        ab.e("MicroMsg.GameImageUtil", "mkdir error. %s", new Object[] { paramString });
        AppMethodBeat.o(112350);
      }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.GameImageUtil", "mkdir error, %s", new Object[] { localFile2.getAbsolutePath() });
      AppMethodBeat.o(112350);
      continue;
      label147: AppMethodBeat.o(112350);
      bool = true;
    }
  }

  private void a(ImageView paramImageView, e.a parama)
  {
    AppMethodBeat.i(112343);
    if ((paramImageView != null) && (parama.nnQ))
      if (parama.nnS == 0)
      {
        paramImageView.setImageDrawable(this.nnC);
        AppMethodBeat.o(112343);
      }
    while (true)
    {
      return;
      paramImageView.setImageResource(parama.nnS);
      AppMethodBeat.o(112343);
    }
  }

  private void a(String paramString, int paramInt1, int paramInt2, e.b paramb)
  {
    AppMethodBeat.i(112346);
    ab.d("MicroMsg.GameImageUtil", "getBitmapWithWH, start");
    Bitmap localBitmap = (Bitmap)this.nkP.ai(paramString);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      paramb.a(null, localBitmap);
      AppMethodBeat.o(112346);
    }
    while (true)
    {
      return;
      c(null, paramString, new e.a.a().bFI(), new e.4(this, paramb, paramInt1, paramInt2, paramString));
      AppMethodBeat.o(112346);
    }
  }

  private static Bitmap b(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112347);
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    if ((i == paramInt1) && (j == paramInt2))
      AppMethodBeat.o(112347);
    while (true)
    {
      return paramBitmap;
      float f1 = j / paramInt2;
      float f2 = i / paramInt1;
      if (f1 < f2)
        paramInt2 = (int)(f1 * paramInt1);
      try
      {
        Bitmap localBitmap = Bitmap.createBitmap(paramBitmap, (i - paramInt2) / 2, 0, paramInt2, j);
        paramInt1 = j;
        while (true)
        {
          ab.i("MicroMsg.GameImageUtil", "resizeBitmap, bitmapW = %d, bitmapH = %d, newWidth = %d, newHeight = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
          AppMethodBeat.o(112347);
          paramBitmap = localBitmap;
          break;
          paramInt1 = (int)(paramInt2 * f2);
          localBitmap = Bitmap.createBitmap(paramBitmap, 0, (j - paramInt1) / 2, i, paramInt1);
          paramInt2 = i;
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        AppMethodBeat.o(112347);
      }
    }
  }

  private void b(ImageView paramImageView, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(112345);
    a(paramString, paramInt1, paramInt2, new e.3(this, paramImageView, paramInt2, paramInt1, paramInt3));
    AppMethodBeat.o(112345);
  }

  private boolean b(ImageView paramImageView, String paramString, e.a parama, e.b paramb)
  {
    AppMethodBeat.i(112341);
    boolean bool;
    if ((!parama.ePF) || (parama.nnR))
    {
      AppMethodBeat.o(112341);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!this.nkP.aj(paramString))
      {
        AppMethodBeat.o(112341);
        bool = false;
      }
      else
      {
        paramString = (Bitmap)this.nkP.ai(paramString);
        if ((paramString != null) && (!paramString.isRecycled()))
        {
          if (paramImageView != null)
            paramImageView.setImageBitmap(paramString);
          if (paramb != null)
            paramb.a(paramImageView, paramString);
          bool = true;
          AppMethodBeat.o(112341);
        }
        else
        {
          AppMethodBeat.o(112341);
          bool = false;
        }
      }
    }
  }

  public static e bFH()
  {
    AppMethodBeat.i(112335);
    if (nnB == null);
    try
    {
      if (nnB == null)
      {
        locale = new com/tencent/mm/plugin/game/f/e;
        locale.<init>();
        nnB = locale;
      }
      e locale = nnB;
      AppMethodBeat.o(112335);
      return locale;
    }
    finally
    {
      AppMethodBeat.o(112335);
    }
  }

  private void c(ImageView paramImageView, String paramString, e.a parama, e.b paramb)
  {
    AppMethodBeat.i(112342);
    c.a locala = new c.a();
    boolean bool;
    Object localObject;
    if (!parama.nnR)
    {
      bool = true;
      locala.ePF = bool;
      Ov(nnA);
      localObject = nnA + com.tencent.mm.a.g.x(paramString.getBytes());
      locala.ePH = parama.ePH;
      if (parama.nnR)
        break label153;
      locala.ePJ = ((String)localObject);
    }
    while (true)
    {
      locala.eQf = parama.eQf;
      locala.ePZ = false;
      a(paramImageView, parama);
      localObject = locala.ahG();
      o.ahp().a(paramString, null, (c)localObject, new e.2(this, paramb, parama, paramImageView));
      AppMethodBeat.o(112342);
      return;
      bool = false;
      break;
      label153: locala.ePH = false;
      com.tencent.mm.pluginsdk.g.a.d.a.ajj((String)localObject);
    }
  }

  public final void a(ImageView paramImageView, String paramString, float paramFloat)
  {
    AppMethodBeat.i(112349);
    if ((paramImageView == null) || (bo.isNullOrNil(paramString)))
      AppMethodBeat.o(112349);
    while (true)
    {
      return;
      Bitmap localBitmap;
      if (this.neb.aj(paramString))
      {
        localBitmap = (Bitmap)this.neb.ai(paramString);
        if ((localBitmap != null) && (!localBitmap.isRecycled()))
        {
          paramImageView.setImageBitmap(localBitmap);
          AppMethodBeat.o(112349);
        }
      }
      else
      {
        localBitmap = com.tencent.mm.pluginsdk.model.app.g.b(paramString, 1, paramFloat);
        if ((localBitmap != null) && (!localBitmap.isRecycled()))
        {
          paramImageView.setImageBitmap(localBitmap);
          this.neb.put(paramString, localBitmap);
          AppMethodBeat.o(112349);
        }
        else
        {
          paramImageView.setImageResource(2130838911);
          paramImageView = new WeakReference(paramImageView);
          com.tencent.mm.plugin.s.a.bYJ().c(new e.5(this, paramString, paramFloat, paramImageView));
          AppMethodBeat.o(112349);
        }
      }
    }
  }

  public final void a(ImageView paramImageView, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(112344);
    b(paramImageView, paramString, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(112344);
  }

  public final void a(ImageView paramImageView, String paramString, e.a parama)
  {
    AppMethodBeat.i(112338);
    a(paramImageView, paramString, parama, null);
    AppMethodBeat.o(112338);
  }

  public final void a(ImageView paramImageView, String paramString, e.a parama, e.b paramb)
  {
    AppMethodBeat.i(112340);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(112340);
    while (true)
    {
      return;
      e.a locala = parama;
      if (parama == null)
        locala = new e.a.a().bFI();
      if (b(paramImageView, paramString, locala, paramb))
      {
        AppMethodBeat.o(112340);
      }
      else
      {
        c(paramImageView, paramString, locala, paramb);
        AppMethodBeat.o(112340);
      }
    }
  }

  public final void h(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(112337);
    a(paramImageView, paramString, null, null);
    AppMethodBeat.o(112337);
  }

  public final void i(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(112339);
    e.a.a locala = new e.a.a();
    locala.eQf = true;
    a(paramImageView, paramString, locala.bFI(), null);
    AppMethodBeat.o(112339);
  }

  public final Bitmap j(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(112348);
    paramString = com.tencent.mm.ah.b.a(paramString, false, -1);
    if (((paramString != null) && (!paramString.isRecycled())) || ((this.nnD == null) || (this.nnD.isRecycled())));
    try
    {
      this.nnD = BackwardSupportUtil.b.b(ah.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bz.a.getDensity(null));
      label63: if ((this.nnD != null) && (!this.nnD.isRecycled()) && (paramImageView != null))
        paramImageView.setImageBitmap(this.nnD);
      paramImageView = this.nnD;
      AppMethodBeat.o(112348);
      while (true)
      {
        return paramImageView;
        if (paramImageView != null)
          paramImageView.setImageBitmap(paramString);
        AppMethodBeat.o(112348);
        paramImageView = paramString;
      }
    }
    catch (Exception paramString)
    {
      break label63;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.f.e
 * JD-Core Version:    0.6.2
 */