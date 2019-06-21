package com.tencent.mm.ui.chatting.gallery;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.at.d.a;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.y;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.MMJpegOptim;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.n;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.WxImageView;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.chatting.al;
import com.tencent.mm.ui.chatting.al.a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class e extends a
  implements d.a, f.a
{
  private static boolean yVd;
  private static long yVf;
  public HashMap<Long, Integer> jNM;
  int mScrollState;
  private HashMap<String, WeakReference<Bitmap>> usl;
  private com.tencent.mm.sdk.b.c yUZ;
  public final f yVa;
  private HashMap<bi, String> yVb;
  private HashMap<bi, String> yVc;
  private b yVe;
  private long yVg;

  static
  {
    AppMethodBeat.i(32135);
    yVd = true;
    yVf = ()(Runtime.getRuntime().maxMemory() * 0.05D);
    AppMethodBeat.o(32135);
  }

  public e(c paramc)
  {
    super(paramc);
    AppMethodBeat.i(32092);
    this.jNM = new HashMap();
    this.yVa = new f(this);
    this.usl = new HashMap();
    this.yVb = new HashMap();
    this.yVc = new HashMap();
    this.yVe = new b();
    this.yVg = 0L;
    this.mScrollState = 0;
    com.tencent.mm.sdk.b.a locala = com.tencent.mm.sdk.b.a.xxA;
    paramc = new al(al.a.yMe, paramc.yTI);
    this.yUZ = paramc;
    locala.c(paramc);
    paramc = g.a.yVD.mQK.snapshot();
    this.yVa.aW(paramc);
    l.dGI().yXN = this;
    AppMethodBeat.o(32092);
  }

  private static boolean OX(int paramInt)
  {
    boolean bool = true;
    if (paramInt == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private int a(long paramLong, Object paramObject)
  {
    AppMethodBeat.i(32125);
    int i;
    if ((paramObject instanceof Integer))
    {
      i = ((Integer)paramObject).intValue();
      paramObject = this.yTG.Ou(i);
      if ((paramObject != null) && (paramObject.field_msgId == paramLong))
        AppMethodBeat.o(32125);
    }
    while (true)
    {
      return i;
      paramObject = this.yTG.yyK.values().iterator();
      while (true)
        if (paramObject.hasNext())
        {
          i = ((Integer)paramObject.next()).intValue();
          bi localbi = this.yTG.Ou(i);
          if ((localbi != null) && (localbi.field_msgId == paramLong))
          {
            AppMethodBeat.o(32125);
            break;
          }
        }
      i = -1;
      AppMethodBeat.o(32125);
    }
  }

  public static String a(bi parambi, com.tencent.mm.at.e parame)
  {
    AppMethodBeat.i(32120);
    parambi = a(parambi, parame, false);
    AppMethodBeat.o(32120);
    return parambi;
  }

  private static String a(bi parambi, com.tencent.mm.at.e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(32121);
    if (parambi.field_isSend == 1)
    {
      str = o.ahl().d(parame);
      parambi = o.ahl().q(str, "", "");
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ImageGalleryHolderImage", "getImgPath() pre fileName:%s bigImgPath:%s", new Object[] { str, parambi });
      if (com.tencent.mm.vfs.e.ct(parambi))
        AppMethodBeat.o(32121);
    }
    while (true)
    {
      return parambi;
      parame = parame.fDz;
      parambi = o.ahl().q(parame, "", "");
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ImageGalleryHolderImage", "getImgPath() after fileName:%s bigImgPath:%s", new Object[] { parame, parambi });
      if (com.tencent.mm.vfs.e.ct(parambi))
      {
        AppMethodBeat.o(32121);
      }
      else
      {
        AppMethodBeat.o(32121);
        parambi = null;
        continue;
        if ((paramBoolean) || (parame.agP()))
          break;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ImageGalleryHolderImage", "getImagePath is null because of isTryToGetProgress %s img.isGetCompleted() %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(parame.agP()) });
        AppMethodBeat.o(32121);
        parambi = null;
      }
    }
    String str = parame.fDz;
    if (parame.agQ())
    {
      parambi = o.ahl().d(parame);
      if (parambi != null)
      {
        parame = o.ahl().q(parambi, "", "");
        if (com.tencent.mm.vfs.e.ct(parame))
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "hasHdImg");
      }
    }
    while (true)
    {
      parambi = parame;
      if (parame == null)
        parambi = o.ahl().q(str, "", "");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "the path : %s", new Object[] { parambi });
      AppMethodBeat.o(32121);
      break;
      parame = null;
    }
  }

  private static void a(bi parambi, k paramk, int paramInt)
  {
    AppMethodBeat.i(32104);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "edw dealFail", new Object[0]);
    String str = o.ahl().I(parambi.field_imgPath, true);
    k.am(paramk.yXx, 8);
    k.am(paramk.yXs, 8);
    k.am(paramk.yXB, 8);
    k.am(paramk.yXC, 8);
    k.am(paramk.yXD, 8);
    paramk.dGF().yXy.setVisibility(0);
    paramk.dGF().yXA.setImageResource(2131231499);
    if ((str == null) || (!com.tencent.mm.vfs.e.ct(str)))
    {
      paramk.dGF().yXz.setText(2131300611);
      AppMethodBeat.o(32104);
    }
    while (true)
    {
      return;
      if (paramInt == 6)
      {
        paramk.dGF().yXz.setText(2131300609);
        AppMethodBeat.o(32104);
      }
      else if (parambi.dtH())
      {
        paramk.dGF().yXz.setText(2131300607);
        AppMethodBeat.o(32104);
      }
      else
      {
        paramk.dGF().yXz.setText(2131300608);
        AppMethodBeat.o(32104);
      }
    }
  }

  private static void a(bi parambi, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(32126);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "[oreh download_and_save] hdImg end, msgLocalId:%d, %s", new Object[] { Long.valueOf(parambi.field_msgId), paramString });
    c.b(ah.getContext(), parambi, paramBoolean);
    AppMethodBeat.o(32126);
  }

  private void a(k paramk, bi parambi, com.tencent.mm.at.e parame, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(32102);
    a(paramk, parambi, parame, paramBoolean, true, paramInt);
    AppMethodBeat.o(32102);
  }

  private void a(k paramk, bi parambi, com.tencent.mm.at.e parame, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(32103);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "edw dealDownloading, isHd = ".concat(String.valueOf(paramBoolean1)));
    k.am(paramk.yXy, 8);
    String str1 = null;
    if (!paramBoolean1)
      paramk.yXB.setVisibility(0);
    com.tencent.mm.at.e locale = com.tencent.mm.at.f.a(parame);
    if ((paramBoolean1) && (paramInt == this.yTG.yTI.getCurrentItem()))
      this.yTG.yTI.dGv();
    if (paramBoolean1)
      str1 = a(parambi, parame, true);
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = o.ahl().q(locale.fDB, "", "");
    str1 = o.ahl().I(parambi.field_imgPath, true);
    if (paramBoolean2)
      a(paramk, str1, str2, parambi);
    long l;
    if (!paramBoolean1)
    {
      paramInt = parame.frO;
      int i = parame.offset;
      if (paramInt == 0)
        break label258;
      l = i * 100L / paramInt - 1L;
      if (Math.max(1, (int)l) <= 50)
        break label264;
      paramk.dGE().yXx.setVisibility(8);
    }
    while (true)
    {
      paramk.dGE().yXv.setVisibility(8);
      paramk.dGE().yXu.setVisibility(8);
      paramk.dGE().yXt.setVisibility(8);
      AppMethodBeat.o(32103);
      return;
      label258: l = 0L;
      break;
      label264: paramk.dGE().yXx.setVisibility(0);
    }
  }

  private static void a(k paramk, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 8;
    AppMethodBeat.i(32111);
    Object localObject;
    int j;
    if (paramk != null)
      if (paramk.yXC != null)
      {
        localObject = paramk.yXC;
        if (!paramBoolean1)
          break label95;
        j = 0;
        ((WxImageView)localObject).setVisibility(j);
        if (!paramBoolean1)
          break label102;
      }
    label95: label102: for (paramk.yXE = true; ; paramk.yXE = false)
    {
      if (paramk.yXB != null)
      {
        localObject = paramk.yXB;
        j = i;
        if (paramBoolean2)
          j = 0;
        ((MultiTouchImageView)localObject).setVisibility(j);
        if (paramBoolean2)
          paramk.yXE = false;
      }
      AppMethodBeat.o(32111);
      return;
      j = 8;
      break;
    }
  }

  private boolean a(MultiTouchImageView paramMultiTouchImageView, String paramString1, String paramString2, int paramInt, bi parambi, k paramk)
  {
    AppMethodBeat.i(32109);
    boolean bool = a(true, paramMultiTouchImageView, paramString1, paramString2, false, paramInt, parambi, paramk, null, false);
    AppMethodBeat.o(32109);
    return bool;
  }

  private boolean a(k paramk, bi parambi, com.tencent.mm.at.e parame, int paramInt)
  {
    AppMethodBeat.i(32101);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "edw dealSucc");
    String str1 = d(parambi, parame);
    k.am(paramk.yXx, 8);
    String str2 = (String)this.yVc.get(parambi);
    parame = str2;
    if (str2 == null)
    {
      parame = o.ahl().I(parambi.field_imgPath, true);
      this.yVc.put(parambi, parame);
    }
    boolean bool = a(paramk, parame, str1, parambi);
    if ((paramInt == this.yTG.yTI.getCurrentItem()) && (this.yTG.yTM))
    {
      this.yTG.bw(parambi);
      this.yTG.yTM = false;
    }
    AppMethodBeat.o(32101);
    return bool;
  }

  private boolean a(k paramk, String paramString1, String paramString2, bi parambi)
  {
    AppMethodBeat.i(32105);
    boolean bool = b(paramk, paramString1, paramString2, parambi);
    AppMethodBeat.o(32105);
    return bool;
  }

  private boolean a(boolean paramBoolean1, MultiTouchImageView paramMultiTouchImageView, String paramString1, String paramString2, boolean paramBoolean2, int paramInt, bi parambi, k paramk, com.tencent.mm.at.e parame, boolean paramBoolean3)
  {
    AppMethodBeat.i(32110);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "initImageView image : %s bigImgPath %s position : %s", new Object[] { Integer.valueOf(paramMultiTouchImageView.hashCode()), paramString2, Integer.valueOf(paramInt) });
    Object localObject1 = null;
    boolean bool1 = true;
    if ((paramString2 != null) && (com.tencent.mm.vfs.e.ct(paramString2)))
    {
      localObject1 = paramString2;
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = localObject1;
        if (paramString1 != null)
        {
          localObject2 = localObject1;
          if (com.tencent.mm.vfs.e.ct(paramString1))
            if (!com.tencent.mm.vfs.e.ct(paramString1 + "hd"))
              break label785;
        }
      }
    }
    label389: label395: label527: label785: for (Object localObject2 = paramString1 + "hd"; ; localObject2 = paramString1)
    {
      if (localObject2 == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "getSuitableBmp fail, file does not exist, filePath %s", new Object[] { paramString2 });
        paramBoolean1 = false;
        AppMethodBeat.o(32110);
      }
      label228: int i;
      label275: boolean bool2;
      while (true)
      {
        return paramBoolean1;
        bool1 = false;
        break;
        if (paramk == null)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "alvinluo initImageView holder is null");
          paramBoolean1 = false;
          AppMethodBeat.o(32110);
        }
        else
        {
          if ((!((String)localObject2).equals(paramString1)) && (!paramBoolean3) && (arw((String)localObject2)))
          {
            paramBoolean3 = true;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "alvinluo checkUseBigImageOpt result: %b, path: %s", new Object[] { Boolean.valueOf(paramBoolean3), localObject2 });
            if ((paramk.yXC == null) || (paramk.yXC.getVisibility() != 0))
              break label383;
            i = 1;
            if ((!paramBoolean3) || (i != 0))
              break label389;
          }
          for (bool2 = true; ; bool2 = false)
          {
            if ((paramBoolean3) || (paramBoolean2) || (!this.yVa.mQK.aj(localObject2)))
              break label395;
            localObject1 = (Bitmap)this.yVa.mQK.ai(localObject2);
            if (((Bitmap)localObject1).isRecycled())
              break label395;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "use cache, fillBitmap path : %s", new Object[] { localObject2 });
            b(paramMultiTouchImageView, (Bitmap)localObject1);
            paramBoolean1 = true;
            AppMethodBeat.o(32110);
            break;
            paramBoolean3 = false;
            break label228;
            label383: i = 0;
            break label275;
          }
          if (paramBoolean1)
            paramMultiTouchImageView.setImageBitmap(null);
          localObject1 = parame;
          if (!paramBoolean3)
            break label474;
          if (paramk.yXC != null)
            break label432;
          paramBoolean1 = false;
          AppMethodBeat.o(32110);
        }
      }
      label432: localObject1 = parame;
      if (parame == null)
        localObject1 = f(parambi, true);
      paramk.yXC.setOnImageLoadEventListener(new e.1(this, (String)localObject2, paramInt, paramk, parambi));
      label474: if (!this.yTG.yTS)
      {
        if (paramInt >= 0)
        {
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ImageGalleryHolderImage", "alvinluo loadThumb postion: %d", new Object[] { Integer.valueOf(paramInt) });
          a(paramk, false, true);
          this.yVa.c(paramMultiTouchImageView, paramInt);
        }
        if (!paramBoolean3)
          break label745;
        a(paramk, true, bool2);
        paramString2 = e(parambi, (com.tencent.mm.at.e)localObject1);
        paramMultiTouchImageView = this.yVa;
        paramString1 = paramk.yXC;
        i = paramInt;
        if (paramInt < 0)
          i = paramk.mPosition;
        paramMultiTouchImageView.b(paramString1, (String)localObject2, paramString2, i);
      }
      while (true)
      {
        AppMethodBeat.o(32110);
        paramBoolean1 = bool1;
        break;
        if (paramBoolean3)
        {
          paramMultiTouchImageView = e(parambi, (com.tencent.mm.at.e)localObject1);
          a(paramk, true, bool2);
          paramString1 = paramk.yXC;
          if (paramMultiTouchImageView != null);
          for (paramMultiTouchImageView = com.davemorrissey.labs.subscaleview.view.a.af(paramMultiTouchImageView); ; paramMultiTouchImageView = null)
          {
            a(paramString1, (String)localObject2, paramMultiTouchImageView);
            AppMethodBeat.o(32110);
            paramBoolean1 = bool1;
            break;
          }
        }
        Bitmap localBitmap = arx((String)localObject2);
        parame = localBitmap;
        if (localBitmap == null)
          parame = arx(paramString1);
        if (parame == null)
          break label527;
        a(paramk, false, true);
        b(paramMultiTouchImageView, parame);
        if (((String)localObject2).equals(paramString2))
        {
          this.yVa.u((String)localObject2, parame);
          this.yVa.c(paramInt, parame);
        }
        AppMethodBeat.o(32110);
        paramBoolean1 = bool1;
        break;
        label745: a(paramk, false, true);
        paramString1 = this.yVa;
        i = paramInt;
        if (paramInt < 0)
          i = paramk.mPosition;
        paramString1.g(paramMultiTouchImageView, (String)localObject2, i);
      }
    }
  }

  protected static BitmapFactory.Options arv(String paramString)
  {
    AppMethodBeat.i(32107);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    paramString = BitmapFactory.decodeFile(paramString, localOptions);
    if (paramString != null)
      paramString.recycle();
    AppMethodBeat.o(32107);
    return localOptions;
  }

  private boolean arw(String paramString)
  {
    AppMethodBeat.i(32108);
    boolean bool;
    if (!yVd)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "alvinluo checkUseBigImageOpt not enable BigImageOpt");
      AppMethodBeat.o(32108);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (Build.VERSION.SDK_INT == 27)
      {
        localObject = com.tencent.mm.compatible.e.ab.get("ro.mediatek.platform");
        if ((localObject != null) && ((((String)localObject).startsWith("mt6765")) || (((String)localObject).startsWith("MT6765"))))
          i = 0;
      }
      while (true)
      {
        if (i == 0)
          break label223;
        AppMethodBeat.o(32108);
        bool = false;
        break;
        if (com.tencent.mm.compatible.util.m.Mx())
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "alvinluo checkUseBigImageOpt is MTK platform");
          if ((Build.VERSION.SDK_INT == 24) || (Build.VERSION.SDK_INT == 25) || (Build.VERSION.SDK_INT == 27))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "alvinluo checkUseBigImgOpt is MTK platform, android api: %d, cannot use BigImgOpt", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
            i = Build.VERSION.SDK_INT;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "alvinluo reportMTKPlatform apiLevel: %d", new Object[] { Integer.valueOf(i) });
            if (i == 24)
              com.tencent.mm.plugin.report.service.h.pYm.k(896L, 0L, 1L);
            while (true)
            {
              i = 1;
              break;
              if (i == 25)
                com.tencent.mm.plugin.report.service.h.pYm.k(896L, 1L, 1L);
            }
          }
        }
        i = 0;
      }
      label223: paramString = arv(paramString);
      int j = paramString.outWidth;
      int k = paramString.outHeight;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "alvinluo checkUseBigImgOpt ignore abTestFlag, widthFactor: %f, heightFactor: %f, width: %d, height: %d", new Object[] { Float.valueOf(1.0F), Float.valueOf(1.0F), Integer.valueOf(j), Integer.valueOf(k) });
      Object localObject = this.yVe;
      int i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFX, 0);
      if (i == 1)
        com.tencent.luggage.g.d.i("MicroMsg.BigImageFilter", "alvinluo BigImageFilter clicfg notFilter: %d", new Object[] { Integer.valueOf(i) });
      label337: label491: 
      while (true)
      {
        i = 0;
        if (i == 0)
          break label493;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "alvinluo checkUseBigImageOpt filter image");
        AppMethodBeat.o(32108);
        bool = false;
        break;
        if (((j >= 5700) && (k >= 8000)) || ((j >= 8000) && (k >= 5700)))
        {
          i = 1;
          if (i != 0)
          {
            paramString = Build.MODEL;
            if (bo.isNullOrNil(paramString))
              continue;
            localObject = ((b)localObject).yTH;
            m = localObject.length;
          }
        }
        else
        {
          for (i = 0; ; i++)
          {
            if (i >= m)
              break label491;
            if (paramString.equalsIgnoreCase(localObject[i]))
            {
              com.tencent.luggage.g.d.i("MicroMsg.BigImageFilter", "alvinluo BigImageFilter filter model: %s, width: %d, height: %d", new Object[] { paramString, Integer.valueOf(j), Integer.valueOf(k) });
              i = 1;
              break label337;
              i = 0;
              break label396;
              break;
            }
          }
        }
      }
      label396: label493: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "alvinluo checkUseBigImageOpt not filter");
      i = getScreenWidth(ah.getContext());
      int m = getScreenHeight(ah.getContext());
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ImageGalleryHolderImage", "alvinluo checkUseBigImageOpt width: %d, height: %d, screenWidth: %d, screenHeight: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(m) });
      if (j >= i * 1.0F)
      {
        AppMethodBeat.o(32108);
        bool = true;
      }
      else if (k >= m * 1.0F)
      {
        AppMethodBeat.o(32108);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(32108);
        bool = false;
      }
    }
  }

  private static Bitmap arx(String paramString)
  {
    AppMethodBeat.i(32116);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(32116);
    }
    while (true)
    {
      return paramString;
      Object localObject1 = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject1).inJustDecodeBounds = true;
      Object localObject2 = BitmapFactory.decodeFile(paramString, (BitmapFactory.Options)localObject1);
      if (localObject2 != null)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "recycle bitmap:%s", new Object[] { localObject2.toString() });
        ((Bitmap)localObject2).recycle();
      }
      int i = BackwardSupportUtil.ExifHelper.bJ(paramString);
      int j = ((BitmapFactory.Options)localObject1).outWidth;
      int k = ((BitmapFactory.Options)localObject1).outHeight;
      int m = k;
      int n = j;
      try
      {
        long l1 = Math.max(Runtime.getRuntime().maxMemory() - Runtime.getRuntime().totalMemory() - yVf, 0L);
        m = k;
        n = j;
        int i1 = ((BitmapFactory.Options)localObject1).outHeight;
        m = k;
        n = j;
        long l2 = ((BitmapFactory.Options)localObject1).outWidth * i1 * 4;
        m = k;
        n = j;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "hy: current free memory: %d, previewDecodedBmLength: %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
        int i2 = k;
        i1 = j;
        if (l1 < l2)
        {
          m = k;
          n = j;
          double d = Math.sqrt(l1 / l2);
          m = k;
          n = j;
          com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.ImageGalleryHolderImage", "hy: sample is %f", new Object[] { Double.valueOf(d) });
          i1 = (int)(j * d);
          i2 = (int)(k * d);
        }
        m = i2;
        n = i1;
        localObject1 = aw(paramString, i2, i1);
        localObject2 = localObject1;
        if (localObject1 == null)
        {
          m = i2;
          n = i1;
          localObject2 = com.tencent.mm.sdk.platformtools.d.a(paramString, i1, i2, 0.0F);
        }
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = localObject2;
          m = i2;
          n = i1;
          if (MMNativeJpeg.IsJpegFile(paramString))
          {
            localObject1 = localObject2;
            m = i2;
            n = i1;
            if (MMNativeJpeg.isProgressive(paramString))
            {
              m = i2;
              n = i1;
              localObject1 = MMNativeJpeg.decodeAsBitmap(paramString);
              if (localObject1 != null)
                break label427;
            }
          }
        }
        label427: for (boolean bool = true; ; bool = false)
        {
          m = i2;
          n = i1;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "Progressive jpeg, result isNull:%b", new Object[] { Boolean.valueOf(bool) });
          localObject2 = localObject1;
          if (localObject2 != null)
            break label471;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "getSuitableBmp fail, temBmp is null, filePath = ".concat(String.valueOf(paramString)));
          paramString = null;
          AppMethodBeat.o(32116);
          break;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        Bitmap localBitmap;
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.ImageGalleryHolderImage", localOutOfMemoryError, "hy: out of memory! try use fallback bitmap", new Object[0]);
          localBitmap = c(paramString, n, m, getScreenWidth(ah.getContext()), getScreenHeight(ah.getContext()));
        }
        label471: paramString = com.tencent.mm.sdk.platformtools.d.b(localBitmap, i);
        if ((paramString == localBitmap) && (i % 360 != 0))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "rotate failed degree:%d", new Object[] { Integer.valueOf(i) });
          paramString = null;
          AppMethodBeat.o(32116);
        }
        else
        {
          AppMethodBeat.o(32116);
        }
      }
    }
  }

  private static Bitmap aw(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(32115);
    String str = paramString + "_tmp.jpg";
    try
    {
      bool1 = com.tencent.mm.compatible.util.d.fP(16);
      if (bool1)
      {
        paramString = null;
        AppMethodBeat.o(32115);
      }
      while (true)
      {
        return paramString;
        bool1 = com.tencent.mm.sdk.a.b.dnO();
        if (bool1)
          break;
        try
        {
          i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("UseOptImageRecv"), 0);
          p localp = new com/tencent/mm/a/p;
          aw.ZK();
          localp.<init>(com.tencent.mm.model.c.QF());
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "fromPathToImgInfo opt:%d uin:(%d,%d) debug:%b sdk:%d", new Object[] { Integer.valueOf(i), Long.valueOf(localp.longValue()), Long.valueOf(localp.longValue() / 100L), Boolean.valueOf(com.tencent.mm.sdk.a.b.dnO()), Integer.valueOf(Build.VERSION.SDK_INT) });
          j = (int)(localp.longValue() / 100L);
          if (j % 100 + 1 <= i)
            break;
          paramString = null;
          AppMethodBeat.o(32115);
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "get useopt :%s", new Object[] { bo.l(localException) });
          paramString = null;
          AppMethodBeat.o(32115);
        }
      }
      com.tencent.mm.vfs.e.tf(com.tencent.mm.vfs.e.atb(str));
      com.tencent.mm.vfs.e.y(paramString, str);
      bool2 = MMNativeJpeg.IsJpegFile(str);
      bool3 = MMNativeJpeg.isProgressive(str);
      if (!bo.isNullOrNil(str))
      {
        localObject1 = new java/io/File;
        ((File)localObject1).<init>(str);
        if (((File)localObject1).exists());
      }
      else
      {
        bool1 = false;
        i = (int)com.tencent.mm.vfs.e.asZ(str);
        if ((!bool2) || (!bool3))
          break label482;
        if (!bool1)
          break label476;
        localObject1 = MMNativeJpeg.decodeAsBitmap(str);
        if (localObject1 == null)
          break label427;
        j = i;
        localObject3 = localObject1;
      }
    }
    catch (Throwable localThrowable1)
    {
      while (true)
      {
        try
        {
          int i;
          boolean bool2;
          boolean bool3;
          Object localObject1;
          e.a.p(paramString, paramInt2, paramInt1, j);
          Object localObject3 = localObject1;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "dkprog tryUseImageOpt jpeg:%b isprog:%b inte:%b len:%d [%d,%d] bm:%s path:%s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool1), Integer.valueOf(i), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), localObject1, paramString });
          paramString = (String)localObject1;
          com.tencent.mm.vfs.e.deleteFile(str);
          AppMethodBeat.o(32115);
          continue;
          boolean bool1 = MMJpegOptim.checkIntegrity(str);
          continue;
          label427: int j = 0 - i;
          continue;
          localThrowable1 = localThrowable1;
          localObject3 = null;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "dkprog tryUseImageOpt failed. file:%s e:%s", new Object[] { paramString, bo.l(localThrowable1) });
          paramString = localObject3;
          continue;
        }
        catch (Throwable localThrowable2)
        {
          continue;
        }
        label476: Object localObject2 = null;
        continue;
        label482: localObject2 = null;
      }
    }
  }

  @TargetApi(11)
  private void b(MultiTouchImageView paramMultiTouchImageView, Bitmap paramBitmap)
  {
    AppMethodBeat.i(32130);
    if ((this.yTG == null) || (this.yTG.yTI == null))
    {
      AppMethodBeat.o(32130);
      return;
    }
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "fillBitmap image : %s bmp %s", new Object[] { Integer.valueOf(paramMultiTouchImageView.hashCode()), Integer.valueOf(paramBitmap.hashCode()) });
    if (Build.VERSION.SDK_INT == 20)
      paramMultiTouchImageView.setLayerType(1, null);
    while (true)
    {
      paramMultiTouchImageView.setEnableHorLongBmpMode(false);
      paramMultiTouchImageView.bW(paramBitmap.getWidth(), paramBitmap.getHeight());
      paramMultiTouchImageView.setImageBitmap(null);
      paramMultiTouchImageView.setImageBitmap(paramBitmap);
      paramMultiTouchImageView.invalidate();
      AppMethodBeat.o(32130);
      break;
      n.w((View)paramMultiTouchImageView.getParent(), paramBitmap.getWidth(), paramBitmap.getHeight());
    }
  }

  private boolean b(k paramk, String paramString1, String paramString2, bi parambi)
  {
    AppMethodBeat.i(32106);
    k.am(paramk.yXB, 0);
    k.am(paramk.yXs, 8);
    k.am(paramk.yXx, 8);
    k.am(paramk.yXy, 8);
    boolean bool = a(paramk.yXB, paramString1, paramString2, paramk.mPosition, parambi, paramk);
    AppMethodBeat.o(32106);
    return bool;
  }

  private static Bitmap c(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = null;
    AppMethodBeat.i(32117);
    com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "hy: enter fallback bitmap logic");
    paramInt2 = paramInt1 * paramInt2;
    paramInt1 = paramInt3 * paramInt4;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "hy: oriImgPixelRate %d, displayPixelRate %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    if (paramInt2 > paramInt1);
    try
    {
      paramString = com.tencent.mm.sdk.platformtools.d.a(paramString, paramInt3, paramInt4, 0.0F);
      AppMethodBeat.o(32117);
      while (true)
      {
        return paramString;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "hy: the picture is even smaller the screen! display nothing");
        AppMethodBeat.o(32117);
        paramString = localObject;
      }
    }
    catch (OutOfMemoryError paramString)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.ImageGalleryHolderImage", paramString, "hy: oom in fallback bitmap!", new Object[0]);
        AppMethodBeat.o(32117);
        paramString = localObject;
      }
    }
  }

  public static com.tencent.mm.at.e d(bi parambi)
  {
    AppMethodBeat.i(32098);
    Object localObject;
    if (!c.c(parambi))
    {
      localObject = null;
      AppMethodBeat.o(32098);
    }
    while (true)
    {
      return localObject;
      long l;
      if (parambi.field_isSend == 1)
      {
        l = parambi.field_msgId;
        com.tencent.mm.at.e locale = o.ahl().fJ(l);
        localObject = locale;
        if (locale.fDy != 0L);
      }
      else
      {
        l = parambi.field_msgSvrId;
        localObject = o.ahl().fI(l);
      }
      AppMethodBeat.o(32098);
    }
  }

  private String d(bi parambi, com.tencent.mm.at.e parame)
  {
    AppMethodBeat.i(32100);
    String str1 = (String)this.yVb.get(parambi);
    String str2 = str1;
    if (str1 == null)
    {
      str2 = a(parambi, parame, false);
      if ((str2 == null) || (str2.length() == 0))
      {
        str2 = null;
        AppMethodBeat.o(32100);
      }
    }
    while (true)
    {
      return str2;
      this.yVb.put(parambi, str2);
      AppMethodBeat.o(32100);
    }
  }

  public static void dFV()
  {
    yVd = false;
  }

  private static String e(bi parambi, com.tencent.mm.at.e parame)
  {
    AppMethodBeat.i(32122);
    if ((parambi == null) || (parame == null))
    {
      AppMethodBeat.o(32122);
      parambi = null;
    }
    while (true)
    {
      return parambi;
      if (parambi.field_isSend == 1)
      {
        parame = parame.fDB;
        parambi = o.ahl().q(parame, "", "") + "hd";
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ImageGalleryHolderImage", "alvinluo preview fileName: %s, fullPath: %s", new Object[] { parame, parambi });
        if ((!bo.isNullOrNil(parambi)) && (com.tencent.mm.vfs.e.ct(parambi)))
        {
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ImageGalleryHolderImage", "alvinluo preview image exist");
          AppMethodBeat.o(32122);
        }
        else
        {
          parambi = o.ahl().q(parame, "", "");
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ImageGalleryHolderImage", "preview fileName: %s, fullPath:%s", new Object[] { parame, parambi });
          if ((!bo.isNullOrNil(parambi)) && (com.tencent.mm.vfs.e.ct(parambi)))
          {
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ImageGalleryHolderImage", "preview image exist");
            AppMethodBeat.o(32122);
          }
          else
          {
            AppMethodBeat.o(32122);
            parambi = null;
          }
        }
      }
      else if (!parame.agP())
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "alvinluo get previewPath img not completed");
        AppMethodBeat.o(32122);
        parambi = null;
      }
      else
      {
        parame = parame.fDB;
        parambi = o.ahl().q(parame, "", "") + "hd";
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "alvinluo preview fileName: %s, fullPath: %s", new Object[] { parame, parambi });
        if ((!bo.isNullOrNil(parambi)) && (com.tencent.mm.vfs.e.ct(parambi)))
        {
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ImageGalleryHolderImage", "alvinluo preview image exist");
          AppMethodBeat.o(32122);
        }
        else
        {
          AppMethodBeat.o(32122);
          parambi = null;
        }
      }
    }
  }

  private static int getScreenHeight(Context paramContext)
  {
    AppMethodBeat.i(32119);
    int i;
    if (paramContext == null)
    {
      i = 0;
      AppMethodBeat.o(32119);
    }
    while (true)
    {
      return i;
      i = paramContext.getResources().getDisplayMetrics().heightPixels;
      AppMethodBeat.o(32119);
    }
  }

  private static int getScreenWidth(Context paramContext)
  {
    AppMethodBeat.i(32118);
    int i;
    if (paramContext == null)
    {
      i = 0;
      AppMethodBeat.o(32118);
    }
    while (true)
    {
      return i;
      i = paramContext.getResources().getDisplayMetrics().widthPixels;
      AppMethodBeat.o(32118);
    }
  }

  private void h(bi parambi, int paramInt)
  {
    AppMethodBeat.i(32095);
    this.jNM.put(Long.valueOf(parambi.field_msgId), Integer.valueOf(paramInt));
    AppMethodBeat.o(32095);
  }

  private void l(long paramLong, int paramInt)
  {
    AppMethodBeat.i(32096);
    this.jNM.put(Long.valueOf(paramLong), Integer.valueOf(paramInt));
    AppMethodBeat.o(32096);
  }

  public final Bitmap OY(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(32131);
    if (this.yTG == null)
      AppMethodBeat.o(32131);
    while (true)
    {
      return localObject;
      bi localbi = this.yTG.yTJ.OV(paramInt);
      if (localbi != null)
      {
        String str = (String)this.yVc.get(localbi);
        localObject = str;
        if (str == null)
        {
          localObject = o.ahl().I(localbi.field_imgPath, true);
          this.yVc.put(localbi, localObject);
        }
        str = (String)localObject + "hd";
        if (com.tencent.mm.vfs.e.ct(str))
        {
          localObject = arx(str);
          AppMethodBeat.o(32131);
        }
        else
        {
          localObject = arx((String)localObject);
          AppMethodBeat.o(32131);
        }
      }
      else
      {
        AppMethodBeat.o(32131);
      }
    }
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(32127);
    if (!(paramObject instanceof Integer))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "param data not integer instance");
      AppMethodBeat.o(32127);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "image task canceled at pos ".concat(String.valueOf(((Integer)paramObject).intValue())), new Object[0]);
      AppMethodBeat.o(32127);
    }
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(32123);
    if ((this.yTG == null) || (this.yTG.yTI == null))
      AppMethodBeat.o(32123);
    int i;
    while (true)
    {
      return;
      if (this.mScrollState != 0)
      {
        AppMethodBeat.o(32123);
      }
      else
      {
        if (!l.dGI().nr(paramLong2))
          break label704;
        i = a(paramLong2, paramObject);
        if (i != -1)
          break;
        AppMethodBeat.o(32123);
      }
    }
    paramObject = Integer.valueOf(i);
    label686: label695: label704: 
    while (true)
    {
      if (!(paramObject instanceof Integer))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "param data not integer instance");
        AppMethodBeat.o(32123);
        break;
      }
      i = ((Integer)paramObject).intValue();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "onImgTaskProgress, pos[%d], offset[%d], totalLen[%d], resId[%d], compressType[%d], imgLocalId[%d],", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Long.valueOf(paramLong1) });
      if (i == -1)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "onImgTaskProgress, pos is -1");
        AppMethodBeat.o(32123);
        break;
      }
      if (this.yTG.Fp(i) == null)
      {
        AppMethodBeat.o(32123);
        break;
      }
      paramObject = (k)this.yTG.Fp(i).getTag();
      if (paramObject == null)
      {
        AppMethodBeat.o(32123);
        break;
      }
      if ((i == this.yTG.yTI.getCurrentItem()) && (!OX(paramInt1)))
        this.yTG.yTI.hG(false);
      if (paramInt3 == 0)
      {
        paramInt2 = 0;
        paramInt2 = Math.max(1, paramInt2);
        if ((i == this.yTG.yTI.getCurrentItem()) && (OX(paramInt1)))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "jacks loading hd from progress : %d, time: %d", new Object[] { Integer.valueOf(paramInt2), Long.valueOf(System.currentTimeMillis()) });
          this.yTG.yTI.Pe(paramInt2);
        }
        paramm = (com.tencent.mm.at.k)paramm;
        boolean bool1 = MMNativeJpeg.isProgressive(paramm.fFd);
        boolean bool2 = paramm.fFf;
        paramLong1 = bo.az(this.yVg);
        e.a.eD(paramm.fFd, paramInt4);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "dkprog onImgTaskProgress getCanShow:%b isProg:%b timeDiff:%d  [%d/%d] %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), Long.valueOf(paramLong1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramm.fFd });
        if ((!bool2) || (!bool1) || (paramLong1 <= 1000L))
          break label695;
        this.yVg = bo.yz();
        bi localbi = this.yTG.Ou(i);
        paramm = f(localbi, true);
        if (!a(false, paramObject.yXB, o.ahl().I(localbi.field_imgPath, true), a(localbi, paramm, true), true, -1, localbi, paramObject, paramm, true))
          break label695;
        k.am(paramObject.yXv, 8);
        k.am(paramObject.yXy, 8);
        if ((i != this.yTG.yTI.getCurrentItem()) || (OX(paramInt1)))
          break label695;
        if (paramInt2 <= 50)
          break label686;
        k.am(paramObject.yXx, 8);
        if (this.yTG == null)
          break label695;
        this.yTG.a(localbi, paramm, paramInt1, com.tencent.mm.g.b.a.e.a.cUX);
        AppMethodBeat.o(32123);
        break;
      }
      if (paramInt4 != 0);
      for (float f = paramInt3 / paramInt4 * 100.0F - 1.0F; ; f = 0.0F)
      {
        paramInt2 = (int)f;
        break;
      }
      k.am(paramObject.yXx, 0);
      AppMethodBeat.o(32123);
      break;
    }
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(32124);
    if ((this.yTG == null) || (this.yTG.yTI == null))
      AppMethodBeat.o(32124);
    while (true)
    {
      return;
      if (!l.dGI().nr(paramLong2))
        break label947;
      paramInt2 = a(paramLong2, paramObject);
      if (paramInt2 != -1)
        break;
      aw.ZK();
      a(com.tencent.mm.model.c.XO().jf(paramLong2), "background", false);
      AppMethodBeat.o(32124);
    }
    paramObject = Integer.valueOf(paramInt2);
    label277: label428: label947: 
    while (true)
    {
      if (!(paramObject instanceof Integer))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "param data not integer instance");
        AppMethodBeat.o(32124);
        break;
      }
      paramInt2 = ((Integer)paramObject).intValue();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "onSceneEnd, pos = ".concat(String.valueOf(paramInt2)));
      if (paramInt2 == -1)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "onSceneEnd, pos is -1");
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 3L, 1L, true);
        AppMethodBeat.o(32124);
        break;
      }
      paramObject = null;
      if (this.yTG.Fp(paramInt2) != null)
        paramObject = (k)this.yTG.Fp(paramInt2).getTag();
      boolean bool = l.dGI().nr(paramLong2);
      if ((paramInt3 != 0) || (paramInt4 != 0))
      {
        if (bool)
        {
          paramObject = this.yTG.Ou(paramInt2);
          paramString = "hd_failed:".concat(String.valueOf(paramInt2));
          if (paramInt2 == this.yTG.yTI.getCurrentItem())
          {
            bool = true;
            a(paramObject, paramString, bool);
          }
        }
        else
        {
          if (paramInt2 == this.yTG.yTI.getCurrentItem())
            this.yTG.yTI.hG(true);
          if (paramInt4 != -5103059)
            break label428;
          l(paramLong2, 5);
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 0L, 1L, true);
        }
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "onSceneEnd, errType = " + paramInt3 + ", errCode = " + paramInt4);
          this.yTG.yTN.OK(paramInt2);
          if (this.yTG != null)
            this.yTG.a(this.yTG.Ou(paramInt2), null, paramInt1, com.tencent.mm.g.b.a.e.a.cUZ);
          AppMethodBeat.o(32124);
          break;
          bool = false;
          break label277;
          l(paramLong2, 6);
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 1L, 1L, true);
        }
      }
      if (bool)
      {
        paramm = this.yTG.Ou(paramInt2);
        paramString = "hd_suc:".concat(String.valueOf(paramInt2));
        if (paramInt2 != this.yTG.yTI.getCurrentItem())
          break label597;
      }
      bi localbi;
      com.tencent.mm.at.e locale;
      label597: for (bool = true; ; bool = false)
      {
        a(paramm, paramString, bool);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "pos = " + paramInt2 + ", selectedPos = " + this.yTG.yTI.getCurrentItem(), new Object[0]);
        l(paramLong2, 4);
        localbi = this.yTG.Ou(paramInt2);
        locale = f(localbi, true);
        if ((localbi != null) && (locale != null))
          break label603;
        AppMethodBeat.o(32124);
        break;
      }
      label603: if (paramObject != null)
      {
        this.yTG.yTI.hG(true);
        if (paramInt2 == this.yTG.yTI.getCurrentItem())
        {
          if (!OX(paramInt1))
            break label894;
          paramString = this.yTG.yTI;
          paramString.hG(true);
          paramString.hG(true);
          paramm = ImageGalleryUI.Pd(1000);
          paramm.setAnimationListener(new ImageGalleryUI.17(paramString));
          paramString.dGm();
          paramString.dFY().yVQ.setVisibility(0);
          paramString.dFY().yVR.setVisibility(8);
          paramString.dFY().yVS.setVisibility(8);
          paramString.dFY().yVT.setVisibility(0);
          paramString.dFY().yVT.startAnimation(paramm);
        }
        while (true)
        {
          if (!a(false, paramObject.yXB, o.ahl().I(localbi.field_imgPath, true), a(localbi, locale, true), true, -1, localbi, paramObject, locale, false))
            break label916;
          k.am(paramObject.yXs, 8);
          k.am(paramObject.yXx, 8);
          k.am(paramObject.yXy, 8);
          if ((bA(localbi) == 4) && (this.yTG.yTM))
          {
            this.yTG.bw(localbi);
            this.yTG.yTM = false;
          }
          if (this.yTG == null)
            break label938;
          this.yTG.a(localbi, locale, paramInt1, com.tencent.mm.g.b.a.e.a.cUX);
          AppMethodBeat.o(32124);
          break;
          label894: paramObject.yXB.post(new e.2(this, paramInt2));
        }
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "failed to show downloaded image!");
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 2L, 1L, true);
      }
      AppMethodBeat.o(32124);
      break;
    }
  }

  public final void a(WxImageView paramWxImageView, String paramString, com.davemorrissey.labs.subscaleview.view.a parama)
  {
    AppMethodBeat.i(32114);
    BitmapFactory.Options localOptions = arv(paramString);
    paramWxImageView.setOrientation(BackwardSupportUtil.ExifHelper.bJ(paramString));
    paramWxImageView.bW(localOptions.outWidth, localOptions.outHeight);
    paramWxImageView.dzA();
    paramWxImageView.a(paramString, parama);
    AppMethodBeat.o(32114);
  }

  public final boolean a(k paramk, bi parambi, int paramInt)
  {
    AppMethodBeat.i(32097);
    super.a(paramk, parambi, paramInt);
    boolean bool1;
    if ((paramk == null) || (parambi == null) || (paramInt < 0))
    {
      bool1 = false;
      AppMethodBeat.o(32097);
    }
    int i;
    com.tencent.mm.at.e locale;
    while (true)
    {
      return bool1;
      i = bA(parambi);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "filling image : %s position : %s currentState : %s", new Object[] { Integer.valueOf(paramk.yXB.hashCode()), Integer.valueOf(paramInt), Integer.valueOf(i) });
      k.am(paramk.yXs, 8);
      locale = f(parambi, false);
      if (locale != null)
        break;
      bool1 = false;
      AppMethodBeat.o(32097);
    }
    switch (i)
    {
    default:
    case 0:
    case 1:
    case 4:
    case 2:
    case 3:
    case 5:
    case 6:
    }
    while (true)
    {
      bool1 = true;
      AppMethodBeat.o(32097);
      break;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "edw dealDownloadOrSucc");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "deal LoadFail");
      if (parambi.field_isSend == 1)
        bool1 = parambi.dtH();
      Object localObject;
      while (true)
      {
        if (!bool1)
          break label332;
        h(parambi, 5);
        a(parambi, paramk, 5);
        break;
        if (parambi.dtH())
        {
          bool1 = true;
        }
        else
        {
          localObject = d(parambi, locale);
          if ((locale.agP()) && ((localObject == null) || (!com.tencent.mm.vfs.e.ct((String)localObject))))
          {
            bool1 = true;
          }
          else
          {
            if ((System.currentTimeMillis() - parambi.field_createTime > 259200000L) && ((bo.isNullOrNil((String)localObject)) || (!com.tencent.mm.vfs.e.ct((String)localObject))));
            for (i = 1; ; i = 0)
            {
              if (i == 0)
                break label326;
              bool1 = true;
              break;
            }
            label326: bool1 = false;
          }
        }
      }
      label332: if (a(paramk, parambi, locale, paramInt))
      {
        bool1 = false;
        boolean bool2 = false;
        localObject = o.ahl().w(parambi);
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ImageGalleryHolderImage", "dealDownloadOrSucc temp, localId:%d, msgLocalId:%d, msgSvrId:%d, hdID:%d, totalLen:%s", new Object[] { Long.valueOf(((com.tencent.mm.at.e)localObject).fDy), Long.valueOf(((com.tencent.mm.at.e)localObject).fDH), Long.valueOf(((com.tencent.mm.at.e)localObject).cKK), Integer.valueOf(((com.tencent.mm.at.e)localObject).fDJ), Integer.valueOf(((com.tencent.mm.at.e)localObject).frO) });
        if (localObject != null)
          if (!bo.gW(((com.tencent.mm.at.e)localObject).fDJ, 0))
          {
            localObject = o.ahl().ly(((com.tencent.mm.at.e)localObject).fDJ);
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ImageGalleryHolderImage", "dealDownloadOrSucc hdTemp, localId:%d, msgLocalId:%d, msgSvrId:%d, hdID:%d, totalLen:%s", new Object[] { Long.valueOf(((com.tencent.mm.at.e)localObject).fDy), Long.valueOf(((com.tencent.mm.at.e)localObject).fDH), Long.valueOf(((com.tencent.mm.at.e)localObject).cKK), Integer.valueOf(((com.tencent.mm.at.e)localObject).fDJ), Integer.valueOf(((com.tencent.mm.at.e)localObject).frO) });
            i = ((com.tencent.mm.at.e)localObject).frO;
            int j = (int)com.tencent.mm.vfs.e.asZ(o.ahl().q(locale.fDz, "", ""));
            bool1 = bool2;
            if (parambi.field_isSend == 1)
            {
              bool1 = bool2;
              if (bo.gW(i, j))
                bool1 = true;
            }
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "dealDownloadOrSucc() sizeInDb:%s oriSize:%s noNeedDownLoad:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool1) });
          }
        while (true)
        {
          if ((!bool1) && (!locale.agP()))
            break label659;
          h(parambi, 4);
          break;
          i = ((com.tencent.mm.at.e)localObject).frO;
          break label530;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "dealDownloadOrSucc() temp == null");
        }
        h(parambi, 1);
      }
      while (true)
      {
        label530: label659: y.C(parambi);
        i = o.ahm().a(locale.fDy, parambi.field_msgId, 0, Integer.valueOf(paramInt), 2130838182, this, 0, true);
        if (this.yTG != null)
          this.yTG.g(parambi, false);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "put image download task downloadCode [%d].", new Object[] { Integer.valueOf(i) });
        if (i != -2)
          break label888;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ImageGalleryHolderImage", "it is already download image finish, but imgInfo is old, search db and repair.");
        locale = f(parambi, true);
        if (locale != null)
          break label789;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ImageGalleryHolderImage", "get imgInfo by db but it is null.");
        break;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "dealDownloadOrSucc dealSucc() == false");
        h(parambi, 2);
      }
      label789: if (a(paramk, parambi, locale, paramInt))
      {
        if ((parambi.field_isSend == 1) || (locale.agP()))
          h(parambi, 4);
        else
          h(parambi, 1);
      }
      else
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ImageGalleryHolderImage", "it repair fail show thumb image.ImgInfo[%d, %b]", new Object[] { Long.valueOf(locale.fDy), Boolean.valueOf(locale.agP()) });
          a(paramk, parambi, locale, false, paramInt);
          break;
          h(parambi, 2);
        }
        label888: a(paramk, parambi, locale, false, paramInt);
        continue;
        a(paramk, parambi, locale, paramInt);
        continue;
        a(paramk, parambi, locale, false, paramInt);
        continue;
        a(paramk, parambi, locale, true, paramInt);
        continue;
        a(parambi, paramk, i);
        paramk.mRR.invalidate();
      }
    }
  }

  public final void aF(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(32128);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "viewHdImg, pos = ".concat(String.valueOf(paramInt)));
    Object localObject1 = this.yTG.Ou(paramInt);
    if ((localObject1 == null) || (((cy)localObject1).field_msgId == 0L))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "msg is null");
      AppMethodBeat.o(32128);
    }
    while (true)
    {
      return;
      if (!c.c((bi)localObject1))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "not img can't download hd");
        AppMethodBeat.o(32128);
      }
      else
      {
        com.tencent.mm.at.e locale = f((bi)localObject1, true);
        Object localObject2;
        if ((locale == null) || (locale.fDy == 0L))
        {
          localObject2 = new StringBuilder("viewHdImg fail, msgLocalId = ");
          if (localObject1 == null)
          {
            localObject1 = "null";
            label125: localObject2 = ((StringBuilder)localObject2).append(localObject1).append(", imgLocalId = ");
            if (locale != null)
              break label182;
          }
          label182: for (localObject1 = "null"; ; localObject1 = Long.valueOf(locale.fDy))
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", localObject1);
            AppMethodBeat.o(32128);
            break;
            localObject1 = Long.valueOf(((cy)localObject1).field_msgId);
            break label125;
          }
        }
        h((bi)localObject1, 3);
        if (OJ(paramInt) != null)
          a(OJ(paramInt), (bi)localObject1, locale, true, false, paramInt);
        if (this.yTG != null)
          this.yTG.g((bi)localObject1, true);
        if (paramBoolean)
        {
          localObject2 = l.dGI();
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageHDDownloadAndSaveMgr", "[oreh download_and_save] startScene, msgLoacalID:%d", new Object[] { Long.valueOf(((cy)localObject1).field_msgId) });
          ((l)localObject2).yXM.add(Long.valueOf(((cy)localObject1).field_msgId));
          o.ahm().a(locale.fDy, ((cy)localObject1).field_msgId, Integer.valueOf(paramInt), (f.a)localObject2);
          AppMethodBeat.o(32128);
        }
        else
        {
          o.ahm().a(locale.fDy, ((cy)localObject1).field_msgId, Integer.valueOf(paramInt), this);
          AppMethodBeat.o(32128);
        }
      }
    }
  }

  public final void b(View paramView, Bitmap paramBitmap)
  {
    AppMethodBeat.i(32112);
    if (paramBitmap == null)
      AppMethodBeat.o(32112);
    while (true)
    {
      return;
      if (paramView != null)
      {
        int i = paramView.hashCode();
        int j = paramBitmap.hashCode();
        int k = this.yVa.mQL.indexOfValue(i);
        if (k >= 0)
          this.yVa.mQL.removeAt(k);
        this.yVa.mQL.put(j, i);
        if ((paramView instanceof MultiTouchImageView))
        {
          b((MultiTouchImageView)paramView, paramBitmap);
          AppMethodBeat.o(32112);
        }
        else if ((paramView instanceof ImageView))
        {
          ((ImageView)paramView).setImageBitmap(paramBitmap);
        }
      }
      else
      {
        AppMethodBeat.o(32112);
      }
    }
  }

  public final int bA(bi parambi)
  {
    AppMethodBeat.i(32094);
    int i;
    if ((parambi != null) && (this.jNM.containsKey(Long.valueOf(parambi.field_msgId))))
    {
      i = ((Integer)this.jNM.get(Long.valueOf(parambi.field_msgId))).intValue();
      AppMethodBeat.o(32094);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(32094);
    }
  }

  public final void bB(bi parambi)
  {
    AppMethodBeat.i(32129);
    com.tencent.mm.at.e locale = d(parambi);
    if ((locale == null) || (parambi == null))
      AppMethodBeat.o(32129);
    while (true)
    {
      return;
      if (this.yTG != null)
        this.yTG.a(parambi, null, 1, com.tencent.mm.g.b.a.e.a.cUY);
      if (l.dGI().nr(parambi.field_msgId))
      {
        l locall = l.dGI();
        locall.yXM.remove(Long.valueOf(parambi.field_msgId));
        o.ahm().a(locale.fDy, parambi.field_msgId, locall);
        o.ahm().x(locale.fDy, parambi.field_msgId);
        AppMethodBeat.o(32129);
      }
      else
      {
        o.ahm().a(locale.fDy, parambi.field_msgId, this);
        o.ahm().x(locale.fDy, parambi.field_msgId);
        AppMethodBeat.o(32129);
      }
    }
  }

  public final void detach()
  {
    AppMethodBeat.i(32093);
    super.detach();
    com.tencent.mm.sdk.b.a.xxA.d(this.yUZ);
    if (this.usl != null)
    {
      Iterator localIterator = this.usl.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (Bitmap)((WeakReference)this.usl.get(localIterator.next())).get();
        if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryHolderImage", "recycle bitmap:%s", new Object[] { localObject.toString() });
          ((Bitmap)localObject).recycle();
        }
      }
    }
    Object localObject = this.yVa;
    ((f)localObject).yVo = null;
    ((f)localObject).mQG.clear();
    ((f)localObject).mQJ.clear();
    ((f)localObject).mQI.clear();
    ((f)localObject).mQH.clear();
    ((f)localObject).yVn.clear();
    ((f)localObject).bCH();
    if ((((f)localObject).yVt != null) && (!((f)localObject).yVt.isRecycled()))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ImageGalleryLazyLoader", "bitmap recycle %s", new Object[] { ((f)localObject).yVt.toString() });
      ((f)localObject).yVt.recycle();
      ((f)localObject).yVt = null;
    }
    o.ahm().a(this);
    localObject = l.dGI();
    if (equals(((l)localObject).yXN))
      ((l)localObject).yXN = null;
    AppMethodBeat.o(32093);
  }

  public final com.tencent.mm.at.e f(bi parambi, boolean paramBoolean)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    AppMethodBeat.i(32099);
    if (!c.c(parambi))
    {
      AppMethodBeat.o(32099);
      localObject1 = localObject3;
    }
    while (true)
    {
      return localObject1;
      if ((this.yTG == null) || (this.yTG.yTJ == null))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ImageGalleryHolderImage", "adapter is null!!");
        AppMethodBeat.o(32099);
        localObject1 = localObject3;
      }
      else
      {
        localObject3 = localObject2;
        if (!paramBoolean)
        {
          if (parambi.field_isSend == 1)
            localObject1 = (com.tencent.mm.at.e)this.yTG.yTJ.yUg.get(Long.valueOf(parambi.field_msgId));
          localObject3 = localObject1;
          if (localObject1 == null)
          {
            localObject3 = localObject1;
            if (parambi.field_msgSvrId > 0L)
              localObject3 = (com.tencent.mm.at.e)this.yTG.yTJ.yUf.get(Long.valueOf(parambi.field_msgSvrId));
          }
        }
        localObject1 = localObject3;
        if (localObject3 == null)
        {
          paramBoolean = false;
          long l;
          if (parambi.field_isSend == 1)
          {
            l = parambi.field_msgId;
            localObject1 = o.ahl().fJ(l);
            localObject3 = localObject1;
            if (((com.tencent.mm.at.e)localObject1).fDy != 0L);
          }
          else
          {
            l = parambi.field_msgSvrId;
            localObject3 = o.ahl().fI(l);
            paramBoolean = true;
          }
          this.yTG.yTJ.a(l, (com.tencent.mm.at.e)localObject3, paramBoolean);
          localObject1 = localObject3;
        }
        AppMethodBeat.o(32099);
      }
    }
  }

  public final Bitmap loadImage(String paramString)
  {
    AppMethodBeat.i(138625);
    paramString = arx(paramString);
    AppMethodBeat.o(138625);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.e
 * JD-Core Version:    0.6.2
 */