package com.tencent.mm.plugin.collect.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.qbar.QbarNative;

public final class b
{
  public static Bitmap a(Context paramContext, String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, x.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(40921);
    int i = (int)(paramInt2 * 0.26F);
    int j = (int)(paramInt2 * 0.22F);
    paramInt2 = (int)(paramInt2 * 0.076F);
    try
    {
      Paint localPaint = new android/graphics/Paint;
      localPaint.<init>();
      localPaint.setAntiAlias(true);
      ab.i("MicroMsg.CollectBitmapFactory", "createCollectQrcode size avatarSize %s dpCanvas %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      Bitmap localBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
      Object localObject1 = null;
      Object localObject2 = localObject1;
      if (paramInt1 == 1)
      {
        localObject2 = localObject1;
        if (!bo.isNullOrNil(paramString3))
        {
          localObject2 = new com/tencent/mm/plugin/collect/model/c;
          ((c)localObject2).<init>(paramString3);
          localObject2 = x.a((v)localObject2);
          x.b(parama);
        }
      }
      paramString3 = (String)localObject2;
      if (localObject2 == null)
        paramString3 = com.tencent.mm.ah.b.d(paramString2, j, j, (int)(j * 0.06F));
      paramString2 = paramString3;
      if (paramString3 == null)
      {
        paramString2 = BackwardSupportUtil.b.b(ah.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bz.a.getDensity(null));
        paramString2 = d.a(paramString2, false, 0.06F * paramString2.getWidth());
      }
      paramString3 = paramString2;
      if (paramString2 != null)
      {
        paramString3 = paramString2;
        if (paramBoolean)
          paramString3 = d.a(paramString2, false, paramString2.getWidth() * 0.5F);
      }
      paramString2 = new android/graphics/Canvas;
      paramString2.<init>(localBitmap);
      paramInt1 = (i - j) / 2;
      parama = new android/graphics/Rect;
      parama.<init>(paramInt1, paramInt1, i - paramInt1, i - paramInt1);
      paramString2.drawBitmap(paramString3, null, parama, localPaint);
      paramString3 = MMBitmapFactory.decodeStream(paramContext.getResources().openRawResource(2130838359));
      parama = new android/graphics/Rect;
      parama.<init>(i - paramInt2, i - paramInt2, i, i);
      paramString2.drawBitmap(paramString3, null, parama, localPaint);
      paramString3 = new byte[40000];
      paramString2 = new int[2];
      paramInt1 = QbarNative.a(paramString3, paramString2, paramString1, 12, 3, "UTF-8");
      QbarNative.nativeRelease();
      if (paramInt1 == 0)
      {
        paramContext = com.tencent.mm.bw.a.a.a(paramContext, localBitmap, paramString3, paramString2);
        if (paramContext == null)
          ab.i("MicroMsg.QRCodeBitmapFactory", "createBitmap bm is error result %d %s", new Object[] { Integer.valueOf(paramInt1), bo.dpG().toString() });
        while (true)
        {
          ab.i("MicroMsg.CollectBitmapFactory", "bitmap recycle %s", new Object[] { localBitmap });
          localBitmap.recycle();
          AppMethodBeat.o(40921);
          return paramContext;
          ab.i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", new Object[] { paramContext });
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.CollectBitmapFactory", paramContext, "", new Object[0]);
        paramContext = null;
        AppMethodBeat.o(40921);
        continue;
        ab.i("MicroMsg.QRCodeBitmapFactory", "result %d %s", new Object[] { Integer.valueOf(paramInt1), bo.dpG().toString() });
        paramContext = null;
      }
    }
  }

  public static Bitmap a(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3, x.a parama)
  {
    AppMethodBeat.i(40919);
    paramContext = a(paramContext, paramString1, paramString2, paramInt, paramString3, parama, false);
    AppMethodBeat.o(40919);
    return paramContext;
  }

  public static Bitmap a(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3, x.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(40920);
    paramContext = a(paramContext, paramString1, paramString2, paramInt, paramString3, BackwardSupportUtil.b.b(paramContext, 197.0F), parama, paramBoolean);
    AppMethodBeat.o(40920);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.b
 * JD-Core Version:    0.6.2
 */