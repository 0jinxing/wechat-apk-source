package com.tencent.mm.plugin.music.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.ae;

public final class c
{
  public com.tencent.mm.a.f<String, Bitmap> edn;
  public c.a oMq;
  private com.tencent.mm.at.a.c.g oMr;
  public ak oMs;

  public c()
  {
    AppMethodBeat.i(104879);
    this.oMr = new com.tencent.mm.at.a.c.g()
    {
      public final Bitmap a(String paramAnonymousString, View paramAnonymousView, com.tencent.mm.at.a.d.b paramAnonymousb)
      {
        return null;
      }

      public final void b(String paramAnonymousString, View paramAnonymousView, com.tencent.mm.at.a.d.b paramAnonymousb)
      {
        AppMethodBeat.i(104877);
        if (paramAnonymousb.bitmap != null);
        for (boolean bool = true; ; bool = false)
        {
          ab.i("MicroMsg.Music.MusicImageLoader", "onImageLoadFinish %s %b", new Object[] { paramAnonymousString, Boolean.valueOf(bool) });
          paramAnonymousString = (com.tencent.mm.plugin.music.model.e.a)paramAnonymousView.getTag();
          if ((paramAnonymousb.bitmap != null) && (paramAnonymousString != null))
          {
            c.this.a(paramAnonymousString, paramAnonymousb.bitmap);
            paramAnonymousView = ae.ao(paramAnonymousb.bitmap);
            if (!paramAnonymousString.w(paramAnonymousView))
              e.bUk().ac(paramAnonymousString.field_musicId, paramAnonymousView[0], paramAnonymousView[1]);
            if (c.this.oMq != null)
              al.d(new c.1.1(this, paramAnonymousString, paramAnonymousView));
          }
          AppMethodBeat.o(104877);
          return;
        }
      }

      public final void sH(String paramAnonymousString)
      {
      }
    };
    this.oMs = new ak(Looper.getMainLooper());
    this.edn = new com.tencent.mm.memory.a.b(5, getClass());
    AppMethodBeat.o(104879);
  }

  final void a(com.tencent.mm.plugin.music.model.e.a parama, Bitmap paramBitmap)
  {
    AppMethodBeat.i(104881);
    ab.i("MicroMsg.Music.MusicImageLoader", "putBitmapToCache %s", new Object[] { parama.field_musicId });
    this.edn.put(parama.field_musicId, paramBitmap);
    AppMethodBeat.o(104881);
  }

  public final void a(com.tencent.mm.plugin.music.model.e.a parama, CdnImageView paramCdnImageView, Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(104880);
    if (paramBoolean1)
      this.edn.remove(parama.field_musicId);
    Object localObject1 = (Bitmap)this.edn.get(parama.field_musicId);
    if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
    {
      ab.i("MicroMsg.Music.MusicImageLoader", "hit cache %s", new Object[] { parama.field_musicId });
      paramCdnImageView.setImageBitmap((Bitmap)localObject1);
      if (parama.bUu())
      {
        paramCdnImageView = new int[2];
        paramCdnImageView[0] = parama.field_songBgColor;
        paramCdnImageView[1] = parama.field_songLyricColor;
      }
      while (true)
      {
        if (this.oMq != null)
          this.oMq.a(parama, paramCdnImageView);
        AppMethodBeat.o(104880);
        return;
        paramCdnImageView = ae.ao((Bitmap)localObject1);
      }
    }
    localObject1 = null;
    Object localObject2 = null;
    ab.i("MicroMsg.Music.MusicImageLoader", "no hit cache %s %s %s %s", new Object[] { parama.field_musicId, parama.field_songHAlbumUrl, parama.field_songAlbumUrl, parama.field_songAlbumLocalPath });
    paramCdnImageView.setTag(parama);
    if (parama.bUv())
    {
      paramContext = new com.tencent.mm.at.a.a.c.a();
      paramContext.ePJ = com.tencent.mm.plugin.music.h.b.aY(parama.field_musicId, true);
      paramContext.ePH = true;
      paramContext.ePF = true;
      paramContext.ePT = 2130838448;
      if (paramBoolean2)
      {
        paramContext.fHf = true;
        paramContext.fHg = 10;
      }
      o.ahp().a(parama.field_songHAlbumUrl, paramCdnImageView, paramContext.ahG(), this.oMr);
      localObject1 = localObject2;
    }
    while (true)
    {
      if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
      {
        a(parama, (Bitmap)localObject1);
        paramCdnImageView.setImageBitmap((Bitmap)localObject1);
        paramContext = ae.ao((Bitmap)localObject1);
        paramCdnImageView = parama;
        if (!parama.w(paramContext))
          paramCdnImageView = e.bUk().ac(parama.field_musicId, paramContext[0], paramContext[1]);
        if ((this.oMq != null) && (paramCdnImageView != null))
          this.oMq.a(paramCdnImageView, paramContext);
      }
      AppMethodBeat.o(104880);
      break;
      switch (parama.field_musicType)
      {
      case 2:
      case 3:
      default:
        localObject1 = localObject2;
        break;
      case 0:
      case 5:
      case 7:
      case 10:
      case 11:
      case 4:
      case 6:
        while (true)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
            localObject2 = o.ahl().a(parama.field_songAlbumLocalPath, com.tencent.mm.bz.a.getDensity(paramContext), false);
          if (localObject2 == null)
            break label566;
          localObject1 = d.e((Bitmap)localObject2, 10);
          break;
          paramContext = new com.tencent.mm.at.a.a.c.a();
          paramContext.ePJ = com.tencent.mm.plugin.music.h.b.aY(parama.field_musicId, false);
          paramContext.ePH = true;
          paramContext.ePF = true;
          if (paramBoolean2)
          {
            paramContext.fHf = true;
            paramContext.fHg = 10;
          }
          o.ahp().a(parama.field_songAlbumUrl, paramCdnImageView, paramContext.ahG(), this.oMr);
          localObject1 = localObject2;
          break;
          localObject1 = o.ahl().b(parama.field_songAlbumLocalPath, com.tencent.mm.bz.a.getDensity(paramContext), false);
        }
        paramCdnImageView.setImageResource(2130838448);
        if ((!parama.bUu()) && (this.oMq != null))
          this.oMq.a(parama, new int[] { -16777216, -1 });
        ab.i("MicroMsg.Music.MusicImageLoader", "field_songAlbumUrl:%s", new Object[] { parama.field_songAlbumUrl });
        localObject1 = localObject2;
        if (!TextUtils.isEmpty(parama.field_songAlbumUrl))
        {
          paramContext = new com.tencent.mm.at.a.a.c.a();
          paramContext.ePJ = com.tencent.mm.plugin.music.h.b.aY(parama.field_musicId, true);
          paramContext.ePH = true;
          paramContext.ePF = true;
          if (paramBoolean2)
          {
            paramContext.fHf = true;
            paramContext.fHg = 10;
          }
          o.ahp().a(parama.field_songAlbumUrl, paramCdnImageView, paramContext.ahG(), this.oMr);
          localObject1 = localObject2;
        }
        break;
      case 1:
      case 8:
      case 9:
        label566: bau localbau = new bau();
        localbau.Id = parama.field_songMediaId;
        localbau.wEH = parama.field_songAlbumUrl;
        localbau.wEI = parama.field_songAlbumType;
        localbau.Url = localbau.wEH;
        localObject1 = localObject2;
        if (n.qFx != null)
        {
          localObject1 = n.qFx.b(localbau);
          if (localObject1 != null)
          {
            localObject1 = d.e((Bitmap)localObject1, 10);
          }
          else
          {
            paramCdnImageView.setImageResource(2130838448);
            if ((!parama.bUu()) && (this.oMq != null))
              this.oMq.a(parama, new int[] { -16777216, -1 });
            n.qFx.dz(paramCdnImageView);
            n.qFx.a(localbau, paramCdnImageView, paramContext.hashCode(), az.xYU);
            this.oMs.removeCallbacksAndMessages(null);
            this.oMs.postDelayed(new c.b(this, parama), 1000L);
          }
        }
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.c
 * JD-Core Version:    0.6.2
 */