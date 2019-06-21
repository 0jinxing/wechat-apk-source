package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.protocal.protobuf.aap;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class l
{
  private static Map<String, g.a> mkp;
  private static com.tencent.mm.a.f<String, Bitmap> mkq;
  private static com.tencent.mm.a.f<String, Bitmap> mkr;
  public Context context;
  public e mkm;
  public HashMap<String, String[]> mkn;
  private HashMap<String, String[]> mko;

  static
  {
    AppMethodBeat.i(74218);
    mkp = new HashMap();
    mkq = new com.tencent.mm.memory.a.b(10, l.class);
    mkr = new com.tencent.mm.memory.a.b(20, l.class);
    AppMethodBeat.o(74218);
  }

  public l(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(74201);
    this.mkn = new HashMap();
    this.mko = new HashMap();
    this.context = paramContext;
    int i = paramInt;
    if (paramInt <= 0)
      i = 24;
    this.mkm = new e(i);
    AppMethodBeat.o(74201);
  }

  public static Bitmap a(aar paramaar, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74211);
    if (!com.tencent.mm.compatible.util.f.Mn())
    {
      paramaar = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707);
      AppMethodBeat.o(74211);
    }
    while (true)
    {
      return paramaar;
      if (com.tencent.mm.plugin.fav.a.b.LA(paramaar.mnd) == null)
      {
        paramaar = null;
        AppMethodBeat.o(74211);
      }
      else
      {
        Bitmap localBitmap = a(paramaar, true, false);
        if (localBitmap == null)
        {
          String str = com.tencent.mm.plugin.fav.a.b.c(paramaar);
          com.tencent.mm.kernel.g.RS().aa(new l.5(str, paramg, paramaar));
        }
        AppMethodBeat.o(74211);
        paramaar = localBitmap;
      }
    }
  }

  public static Bitmap a(aar paramaar, com.tencent.mm.plugin.fav.a.g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(74210);
    if (!com.tencent.mm.compatible.util.f.Mn())
    {
      paramaar = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707);
      AppMethodBeat.o(74210);
    }
    while (true)
    {
      return paramaar;
      if (paramaar.mnd == null)
      {
        paramaar = null;
        AppMethodBeat.o(74210);
      }
      else
      {
        Bitmap localBitmap = a(paramaar, false, false);
        if (localBitmap == null)
        {
          String str = com.tencent.mm.plugin.fav.a.b.b(paramaar);
          com.tencent.mm.kernel.g.RS().aa(new l.4(paramBoolean, str, paramg, paramaar));
        }
        AppMethodBeat.o(74210);
        paramaar = localBitmap;
      }
    }
  }

  private static Bitmap a(aar paramaar, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(74207);
    if (paramBoolean1)
    {
      paramaar = com.tencent.mm.plugin.fav.a.b.c(paramaar);
      if (com.tencent.mm.vfs.e.ct(paramaar))
        break label45;
      ab.w("MicroMsg.FavoriteImageLogic", "getBitmap file not exist");
      paramaar = null;
      AppMethodBeat.o(74207);
    }
    while (true)
    {
      return paramaar;
      paramaar = com.tencent.mm.plugin.fav.a.b.b(paramaar);
      break;
      label45: paramaar = c.aI(paramaar, paramBoolean2);
      AppMethodBeat.o(74207);
    }
  }

  public static void a(ImageView paramImageView, aar paramaar, com.tencent.mm.plugin.fav.a.g paramg, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(74213);
    if (!com.tencent.mm.compatible.util.f.Mn())
      paramImageView.setImageBitmap(BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707));
    if (paramaar.mnd == null)
      paramImageView.setImageResource(2131231262);
    Bitmap localBitmap = a(paramaar, paramg);
    String str = com.tencent.mm.plugin.fav.a.b.b(paramaar);
    if (com.tencent.mm.vfs.e.ct(str))
      localBitmap = b(str, paramInt1, paramInt2, true);
    if (localBitmap == null)
    {
      paramImageView.setImageResource(2131231262);
      paramImageView.setTag(str);
      com.tencent.mm.kernel.g.RS().aa(new l.6(str, paramInt1, paramInt2, paramg, paramaar, paramBoolean, paramImageView));
      AppMethodBeat.o(74213);
    }
    while (true)
    {
      return;
      paramImageView.setImageBitmap(localBitmap);
      AppMethodBeat.o(74213);
    }
  }

  public static Bitmap b(aar paramaar, com.tencent.mm.plugin.fav.a.g paramg, int paramInt)
  {
    AppMethodBeat.i(74208);
    if (!com.tencent.mm.compatible.util.f.Mn())
    {
      localBitmap = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707);
      AppMethodBeat.o(74208);
    }
    while (true)
    {
      return localBitmap;
      if (paramaar.mnd != null)
        break;
      AppMethodBeat.o(74208);
      localBitmap = null;
    }
    String str = com.tencent.mm.plugin.fav.a.b.b(paramaar);
    if (!com.tencent.mm.vfs.e.ct(str))
    {
      ab.w("MicroMsg.FavoriteImageLogic", "getBitmap file not exist");
      localBitmap = null;
    }
    while (true)
    {
      if (localBitmap == null)
      {
        str = com.tencent.mm.plugin.fav.a.b.b(paramaar);
        com.tencent.mm.kernel.g.RS().aa(new l.3(str, paramg, paramaar));
      }
      AppMethodBeat.o(74208);
      break;
      localBitmap = (Bitmap)mkq.get(str);
      if (localBitmap == null)
        break label143;
      ab.d("MicroMsg.FavoriteImageLogic", "get bm from cache %s", new Object[] { str });
    }
    label143: ab.d("MicroMsg.FavoriteImageLogic", "get from cache fail, try to decode from file");
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(str, localOptions);
    if (localBitmap != null)
    {
      ab.i("MicroMsg.FavoriteImageLogic", "bitmap recycle %s", new Object[] { localBitmap });
      localBitmap.recycle();
    }
    int i = localOptions.outWidth;
    int j = localOptions.outHeight;
    ab.d("MicroMsg.FavoriteImageLogic", "width: %s, height: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    if (i > paramInt)
      j = localOptions.outHeight * paramInt / localOptions.outWidth;
    while (true)
    {
      paramInt = Math.max(1, paramInt);
      j = Math.max(1, j);
      ab.w("MicroMsg.FavoriteImageLogic", "fit long picture, beg %d*%d, after %d*%d", new Object[] { Integer.valueOf(localOptions.outWidth), Integer.valueOf(localOptions.outHeight), Integer.valueOf(paramInt), Integer.valueOf(j) });
      int k = BackwardSupportUtil.ExifHelper.bJ(str);
      if ((k == 90) || (k == 270))
        i = paramInt;
      while (true)
      {
        localBitmap = d.d(str, i, j, false);
        if (localBitmap == null)
        {
          ab.e("MicroMsg.FavoriteImageLogic", "getSuitableBmp fail, temBmp is null, filePath = ".concat(String.valueOf(str)));
          localBitmap = null;
          break;
        }
        localBitmap = d.b(localBitmap, k);
        mkq.put(str, localBitmap);
        break;
        i = j;
        j = paramInt;
      }
      paramInt = i;
    }
  }

  public static Bitmap b(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(74212);
    boolean bool = false;
    if (!com.tencent.mm.vfs.e.ct(paramString))
    {
      ab.w("MicroMsg.FavoriteImageLogic", "file not exist");
      localObject1 = null;
      AppMethodBeat.o(74212);
      return localObject1;
    }
    Object localObject2 = (Bitmap)mkr.get(paramString);
    if ((localObject2 != null) || (paramBoolean))
    {
      if (localObject2 != null);
      for (paramBoolean = true; ; paramBoolean = false)
      {
        ab.d("MicroMsg.FavoriteImageLogic", "return bm path %s, bm %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(74212);
        localObject1 = localObject2;
        break;
      }
    }
    Object localObject1 = localObject2;
    while (true)
    {
      int k;
      try
      {
        localObject3 = new android/graphics/BitmapFactory$Options;
        localObject1 = localObject2;
        ((BitmapFactory.Options)localObject3).<init>();
        localObject1 = localObject2;
        ((BitmapFactory.Options)localObject3).inJustDecodeBounds = true;
        localObject1 = localObject2;
        d.decodeFile(paramString, (BitmapFactory.Options)localObject3);
        localObject1 = localObject2;
        i = ((BitmapFactory.Options)localObject3).outWidth;
        localObject1 = localObject2;
        j = ((BitmapFactory.Options)localObject3).outHeight;
        localObject1 = localObject2;
        k = BackwardSupportUtil.ExifHelper.bJ(paramString);
        if ((k != 90) && (k != 270))
          break label630;
        paramBoolean = true;
        m = i;
        localObject1 = localObject2;
        ((BitmapFactory.Options)localObject3).inSampleSize = 1;
        localObject1 = localObject2;
        if (m / ((BitmapFactory.Options)localObject3).inSampleSize <= paramInt2)
          break label279;
        localObject1 = localObject2;
        if (j / ((BitmapFactory.Options)localObject3).inSampleSize <= paramInt1)
          break label279;
        localObject1 = localObject2;
        ((BitmapFactory.Options)localObject3).inSampleSize += 1;
        continue;
      }
      catch (IOException paramString)
      {
        ab.e("MicroMsg.FavoriteImageLogic", paramString.getMessage());
        AppMethodBeat.o(74212);
      }
      break;
      label279: localObject1 = localObject2;
      int i = j * paramInt2 / paramInt1;
      localObject1 = localObject2;
      ab.d("MicroMsg.FavoriteImageLogic", "decode top region width: %d, height: %d, scaleheight: %d, rotate: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(i), Boolean.valueOf(paramBoolean) });
      Rect localRect;
      label414: BitmapRegionDecoder localBitmapRegionDecoder;
      if ((i > 0) && (m > i))
      {
        localObject1 = localObject2;
        localRect = new android/graphics/Rect;
        localObject1 = localObject2;
        localRect.<init>();
        localObject1 = localObject2;
        localRect.top = 0;
        localObject1 = localObject2;
        localRect.left = 0;
        if (paramBoolean)
        {
          localObject1 = localObject2;
          localRect.right = i;
          localObject1 = localObject2;
          localRect.bottom = j;
          localObject1 = localObject2;
          localBitmapRegionDecoder = BitmapRegionDecoder.newInstance(paramString, true);
          localObject1 = localObject2;
          ((BitmapFactory.Options)localObject3).inJustDecodeBounds = false;
          localObject1 = localObject2;
        }
      }
      for (Object localObject3 = localBitmapRegionDecoder.decodeRegion(localRect, (BitmapFactory.Options)localObject3); ; localObject3 = d.decodeFile(paramString, (BitmapFactory.Options)localObject3))
      {
        localObject2 = localObject3;
        if (localObject3 != null)
        {
          localObject2 = localObject3;
          if (paramBoolean)
          {
            localObject1 = localObject3;
            localObject2 = d.b((Bitmap)localObject3, k);
          }
        }
        if (localObject2 == null)
          break label611;
        localObject1 = localObject2;
        ab.d("MicroMsg.FavoriteImageLogic", "width %d, height %d, tw %d, th %d", new Object[] { Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        localObject1 = localObject2;
        mkr.put(paramString, localObject2);
        localObject1 = localObject2;
        break;
        localObject1 = localObject2;
        localRect.right = j;
        localObject1 = localObject2;
        localRect.bottom = i;
        break label414;
        localObject1 = localObject2;
        ((BitmapFactory.Options)localObject3).inJustDecodeBounds = false;
        localObject1 = localObject2;
      }
      label611: localObject1 = localObject2;
      ab.w("MicroMsg.FavoriteImageLogic", "decode bm fail!");
      localObject1 = localObject2;
      continue;
      label630: int m = j;
      int j = i;
      paramBoolean = bool;
    }
  }

  public static void b(com.tencent.mm.plugin.fav.a.g paramg, aar paramaar)
  {
    AppMethodBeat.i(74215);
    b(paramg, paramaar, true);
    AppMethodBeat.o(74215);
  }

  private static void b(com.tencent.mm.plugin.fav.a.g paramg, aar paramaar, boolean paramBoolean)
  {
    AppMethodBeat.i(74214);
    String str = com.tencent.mm.plugin.fav.a.b.b(paramaar);
    com.tencent.mm.kernel.g.RS().aa(new l.7(paramBoolean, str, paramg, paramaar));
    AppMethodBeat.o(74214);
  }

  private void bvP()
  {
    AppMethodBeat.i(74202);
    e locale = this.mkm;
    synchronized (locale.eMl)
    {
      ab.d("MicroMsg.ImageEngine", "do clear mark");
      locale.vuu.clear();
      locale.vuv.clear();
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      locale.vuu = localHashMap;
      localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      locale.vuv = localHashMap;
      AppMethodBeat.o(74202);
      return;
    }
  }

  public static Bitmap j(aar paramaar)
  {
    AppMethodBeat.i(74209);
    if (!com.tencent.mm.compatible.util.f.Mn())
    {
      paramaar = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707);
      AppMethodBeat.o(74209);
    }
    while (true)
    {
      return paramaar;
      if (paramaar.mnd == null)
      {
        paramaar = null;
        AppMethodBeat.o(74209);
      }
      else
      {
        paramaar = a(paramaar, false, true);
        AppMethodBeat.o(74209);
      }
    }
  }

  public final void a(ImageView paramImageView, aar paramaar, com.tencent.mm.plugin.fav.a.g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
    String str = null;
    AppMethodBeat.i(74205);
    if (paramImageView == null)
      AppMethodBeat.o(74205);
    abu localabu;
    while (true)
    {
      return;
      if (!com.tencent.mm.compatible.util.f.Mn())
      {
        paramImageView.setImageResource(2130839707);
        AppMethodBeat.o(74205);
      }
      else if (paramg == null)
      {
        AppMethodBeat.o(74205);
      }
      else
      {
        switch (paramg.field_type)
        {
        case 6:
        case 8:
        case 9:
        case 12:
        case 13:
        case 14:
        default:
          ab.w("MicroMsg.FavoriteImageLogic", "attach thumb, pass type is %d", new Object[] { Integer.valueOf(paramg.field_type) });
          AppMethodBeat.o(74205);
          break;
        case 7:
          if (paramaar == null)
            break label435;
          a(paramImageView, paramaar, paramg, paramaar.cvq, paramInt1, paramInt2, paramInt3);
          AppMethodBeat.o(74205);
          break;
        case 4:
        case 16:
          if (paramaar == null)
            break label435;
          a(paramImageView, paramaar, paramg, paramaar.cvq, paramInt1, paramInt2, paramInt3);
          AppMethodBeat.o(74205);
          break;
        case 5:
          localabu = paramg.field_favProto.whA;
          if (paramaar != null)
            break label262;
          if (localabu != null)
            this.mkm.a(paramImageView, null, localabu.thumbUrl, paramInt1, paramInt2, paramInt3);
          AppMethodBeat.o(74205);
        case 10:
        case 15:
        case 11:
        }
      }
    }
    label262: if (localabu == null)
    {
      label267: if (!bo.isNullOrNil(str))
        break label444;
      str = paramaar.cvq;
    }
    label435: label444: 
    while (true)
    {
      a(paramImageView, paramaar, paramg, str, paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(74205);
      break;
      str = localabu.thumbUrl;
      break label267;
      paramaar = paramg.field_favProto.whC;
      if (paramaar != null)
      {
        this.mkm.a(paramImageView, null, paramaar.thumbUrl, paramInt1, paramInt2, paramInt3);
        AppMethodBeat.o(74205);
        break;
        paramaar = paramg.field_favProto.whE;
        if (paramaar != null)
        {
          this.mkm.a(paramImageView, null, paramaar.thumbUrl, paramInt1, paramInt2, paramInt3);
          AppMethodBeat.o(74205);
          break;
          paramaar = paramg.field_favProto.whC;
          if (paramaar != null)
          {
            this.mkm.a(paramImageView, null, paramaar.thumbUrl, paramInt1, paramInt2, paramInt3);
            AppMethodBeat.o(74205);
            break;
          }
        }
      }
      AppMethodBeat.o(74205);
      break;
    }
  }

  public final void a(ImageView paramImageView, aar paramaar, com.tencent.mm.plugin.fav.a.g paramg, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(74204);
    String str = com.tencent.mm.plugin.fav.a.b.LA(paramaar.mnd);
    String[] arrayOfString = null;
    if (paramaar.mnd != null)
    {
      arrayOfString = (String[])this.mko.get(str);
      if (arrayOfString != null)
        break label138;
      arrayOfString = new String[1];
      arrayOfString[0] = com.tencent.mm.plugin.fav.a.b.c(paramaar);
      this.mko.put(str, arrayOfString);
    }
    label138: 
    while (true)
    {
      this.mkm.a(paramImageView, arrayOfString, paramString, paramInt1, paramInt2, paramInt3);
      if ((arrayOfString == null) || (arrayOfString.length <= 0))
        AppMethodBeat.o(74204);
      while (true)
      {
        return;
        paramImageView = arrayOfString[0];
        com.tencent.mm.kernel.g.RS().aa(new l.1(this, paramImageView, paramg, paramaar));
        AppMethodBeat.o(74204);
      }
    }
  }

  public final void b(ImageView paramImageView, aar paramaar, com.tencent.mm.plugin.fav.a.g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    AppMethodBeat.i(74206);
    if (paramImageView == null)
      AppMethodBeat.o(74206);
    while (true)
    {
      return;
      if (!com.tencent.mm.compatible.util.f.Mn())
      {
        paramImageView.setImageResource(2130839707);
        AppMethodBeat.o(74206);
      }
      else if ((paramg == null) || (paramaar == null))
      {
        paramImageView.setImageDrawable(a.g(this.context, paramInt1));
        AppMethodBeat.o(74206);
      }
      else
      {
        switch (paramaar.dataType)
        {
        case 6:
        case 8:
        case 9:
        case 12:
        case 13:
        case 16:
        case 17:
        case 18:
        default:
          ab.w("MicroMsg.FavoriteImageLogic", "attach thumb, pass type is %d", new Object[] { Integer.valueOf(paramg.field_type) });
          AppMethodBeat.o(74206);
          break;
        case 7:
          a(paramImageView, paramaar, paramg, paramaar.cvq, paramInt1, paramInt2, paramInt3);
          AppMethodBeat.o(74206);
          break;
        case 4:
        case 15:
          a(paramImageView, paramaar, paramg, paramaar.cvq, paramInt1, paramInt2, paramInt3);
          AppMethodBeat.o(74206);
        case 5:
        case 10:
        case 14:
        case 11:
        case 19:
        }
      }
    }
    Object localObject2;
    if (paramaar.wgT != null)
    {
      localObject2 = paramaar.wgT.whA;
      label251: if (localObject2 != null)
        break label343;
      localObject2 = localObject1;
      label260: if (!bo.isNullOrNil((String)localObject2))
        break label742;
      localObject2 = paramaar.cvq;
    }
    label343: label742: 
    while (true)
    {
      a(paramImageView, paramaar, paramg, (String)localObject2, paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(74206);
      break;
      ab.w("MicroMsg.FavoriteImageLogic", "webpage: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramaar.mnd, Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
      localObject2 = null;
      break label251;
      localObject2 = ((abu)localObject2).thumbUrl;
      break label260;
      if (paramaar.wgT == null)
      {
        ab.w("MicroMsg.FavoriteImageLogic", "good: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramaar.mnd, Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
        AppMethodBeat.o(74206);
        break;
      }
      paramaar = paramaar.wgT.whC;
      if (paramaar != null)
      {
        this.mkm.a(paramImageView, null, paramaar.thumbUrl, paramInt1, paramInt2, paramInt3);
        AppMethodBeat.o(74206);
        break;
        if (paramaar.wgT == null)
        {
          ab.w("MicroMsg.FavoriteImageLogic", "tv: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramaar.mnd, Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
          AppMethodBeat.o(74206);
          break;
        }
        paramaar = paramaar.wgT.whE;
        if (paramaar != null)
        {
          this.mkm.a(paramImageView, null, paramaar.thumbUrl, paramInt1, paramInt2, paramInt3);
          AppMethodBeat.o(74206);
          break;
          if (paramaar.wgT == null)
          {
            ab.w("MicroMsg.FavoriteImageLogic", "product: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramaar.mnd, Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
            AppMethodBeat.o(74206);
            break;
          }
          paramaar = paramaar.wgT.whC;
          if (paramaar != null)
          {
            this.mkm.a(paramImageView, null, paramaar.thumbUrl, paramInt1, paramInt2, paramInt3);
            AppMethodBeat.o(74206);
            break;
            if (paramaar.wgT == null)
            {
              ab.w("MicroMsg.FavoriteImageLogic", "app brand: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramaar.mnd, Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
              AppMethodBeat.o(74206);
              break;
            }
            paramaar = paramaar.wgT.whN;
            if (paramaar != null)
            {
              this.mkm.a(paramImageView, null, paramaar.iconUrl, paramInt1, paramInt2, paramInt3);
              AppMethodBeat.o(74206);
              break;
            }
          }
        }
      }
      AppMethodBeat.o(74206);
      break;
    }
  }

  public final void destory()
  {
    AppMethodBeat.i(74203);
    bvP();
    this.mkn.clear();
    this.mko.clear();
    this.mkm.destroy();
    this.context = null;
    this.mkn = null;
    this.mko = null;
    this.mkm = null;
    AppMethodBeat.o(74203);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.l
 * JD-Core Version:    0.6.2
 */