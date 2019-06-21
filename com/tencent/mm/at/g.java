package com.tencent.mm.at;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.MMJpegOptim;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.storage.aa;
import com.tencent.mm.storage.bi;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import junit.framework.Assert;

public final class g extends k
{
  public static int fEg = 0;
  public static long fEt = 0L;
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS ImgInfo ( id INTEGER PRIMARY KEY, msgSvrId LONG, offset INT, totalLen INT, bigImgPath TEXT, thumbImgPath TEXT )", "CREATE TABLE IF NOT EXISTS ImgInfo2 ( id INTEGER PRIMARY KEY, msgSvrId LONG, offset INT, totalLen INT, bigImgPath TEXT, thumbImgPath TEXT, createtime INT, msglocalid INT, status INT, nettimes INT, reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text, hashdthumb int DEFAULT 0, iscomplete INT DEFAULT 1, origImgMD5 TEXT, compressType INT DEFAULT 0, midImgPath TEXT, forwardType INT DEFAULT 0, hevcPath TEXT )", "CREATE INDEX IF NOT EXISTS  serverImgInfoIndex ON ImgInfo2 ( msgSvrId ) ", "CREATE INDEX IF NOT EXISTS  serverImgInfoHdIndex ON ImgInfo2 ( reserved1 ) ", "CREATE INDEX IF NOT EXISTS  msgLocalIdIndex ON ImgInfo2 ( msglocalid ) ", "insert into imginfo2 (id,msgSvrId , offset , totalLen , bigImgPath , thumbImgPath) select id, msgSvrId, offset ,totallen , bigimgpath , thumbimgpath from imginfo; ", "delete from ImgInfo ; ", "CREATE INDEX IF NOT EXISTS iscomplete_index ON ImgInfo2 ( iscomplete ) ", "CREATE INDEX IF NOT EXISTS origImgMD5_index ON ImgInfo2 ( origImgMD5 ) " };
  com.tencent.mm.a.f<String, Bitmap> fEh;
  private com.tencent.mm.a.f<String, String> fEi;
  private List<g.b> fEj;
  private Map<Integer, WeakReference<ImageView>> fEk;
  private Map<Integer, WeakReference<ImageView>> fEl;
  private Map<Integer, WeakReference<View>> fEm;
  private Set<Integer> fEn;
  private Map<String, String> fEo;
  private final AtomicLong fEp;
  private FrameLayout.LayoutParams fEq;
  private SoftReference<ColorDrawable> fEr;
  public int fEs;
  private ak fbD;
  public com.tencent.mm.cd.h fni;

  public g(com.tencent.mm.cd.h paramh)
  {
    AppMethodBeat.i(78208);
    this.fEh = new com.tencent.mm.memory.a.b(40, new g.1(this), getClass());
    this.fEi = new com.tencent.mm.memory.a.c(40);
    this.fEj = new ArrayList();
    this.fEk = new HashMap();
    this.fEl = new HashMap();
    this.fEm = new HashMap();
    this.fEn = new HashSet();
    this.fbD = new ak(Looper.getMainLooper());
    this.fEo = new HashMap();
    this.fEp = new AtomicLong(1L);
    this.fni = null;
    this.fEq = new FrameLayout.LayoutParams(-2, -2);
    this.fEs = 150;
    a(paramh);
    this.fni = paramh;
    agT();
    AppMethodBeat.o(78208);
  }

  private e X(String paramString, int paramInt)
  {
    AppMethodBeat.i(78239);
    e locale = new e();
    paramString = a("ImgInfo2", null, "origImgMD5=? AND compressType=?", new String[] { String.valueOf(paramString), String.valueOf(paramInt) });
    if (paramString.moveToFirst())
      locale.d(paramString);
    paramString.close();
    AppMethodBeat.o(78239);
    return locale;
  }

  private String Y(String paramString, int paramInt)
  {
    AppMethodBeat.i(78257);
    paramString = X(f.sh(paramString), paramInt);
    if (!bo.isNullOrNil(paramString.fDB))
    {
      paramString = I(paramString.fDB, true);
      if (com.tencent.mm.vfs.e.ct(paramString))
        AppMethodBeat.o(78257);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(78257);
    }
  }

  private Bitmap a(String paramString1, int paramInt1, int paramInt2, PInt paramPInt1, PInt paramPInt2, boolean paramBoolean, String paramString2, com.tencent.mm.a.b paramb)
  {
    AppMethodBeat.i(78258);
    ab.d("MicroMsg.ImgInfoStorage", "summersafecdn getPreSendBitmap origPath[%s], compressType[%d],needSave[%b], stack[%s], thumbPath: %s", new Object[] { paramString1, Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), bo.dpG(), paramString2 });
    Bitmap localBitmap1 = (Bitmap)this.fEh.ai(f.sh(paramString1));
    Object localObject1 = null;
    Bitmap localBitmap2;
    Object localObject2;
    Object localObject3;
    if (localBitmap1 != null)
    {
      localBitmap2 = localBitmap1;
      if (!localBitmap1.isRecycled());
    }
    else
    {
      localObject2 = Y(paramString1, paramInt1);
      if (bo.isNullOrNil((String)localObject2))
        break label426;
      if (((String)localObject2).endsWith("hd"))
        localObject3 = localObject2;
    }
    while (true)
    {
      if (localBitmap1 != null)
      {
        localBitmap2 = localBitmap1;
        localObject1 = localObject2;
        if (!localBitmap1.isRecycled());
      }
      else
      {
        int i = ad.amy((String)localObject3);
        int j = BackwardSupportUtil.ExifHelper.bJ((String)localObject3);
        if (i > 0)
          localObject1 = ad.ar((String)localObject3, i, j + paramInt2 * 90);
      }
      while (true)
      {
        label171: if (localObject1 != null)
        {
          this.fEh.k(f.sh(paramString1), localObject1);
          paramPInt1.value = ((Bitmap)localObject1).getWidth();
          paramPInt2.value = ((Bitmap)localObject1).getHeight();
          if (paramBoolean)
            if (localObject2 != null)
              break label409;
        }
        label398: label403: label409: for (paramString1 = Y(paramString1, paramInt1); ; paramString1 = (String)localObject2)
        {
          paramPInt1 = paramString1;
          if (!bo.isNullOrNil(paramString1))
          {
            paramPInt1 = paramString1;
            if (paramString1.endsWith("hd"))
              paramPInt1 = paramString1.substring(0, paramString1.length() - 2);
          }
          if (paramb != null)
            paramb.getFile();
          if ((!bo.isNullOrNil(paramPInt1)) && (com.tencent.mm.vfs.e.ct(paramPInt1)))
          {
            com.tencent.mm.vfs.e.y(paramPInt1, paramString2);
            ab.i("MicroMsg.ImgInfoStorage", "copy from old thumbPath %s", new Object[] { paramPInt1 });
            AppMethodBeat.o(78258);
            return localObject1;
            localBitmap1 = com.tencent.mm.sdk.platformtools.d.aml((String)localObject2);
            localObject3 = paramString1;
            break;
            localObject1 = com.tencent.mm.sdk.platformtools.d.ao((String)localObject3, 120, 120);
            break label171;
          }
          while (true)
          {
            try
            {
              if ((bo.isNullOrNil(paramPInt1)) || (!paramPInt1.endsWith("hd")))
                break label398;
              paramInt1 = 1;
              if (paramInt1 == 0)
                break label403;
              paramInt1 = 80;
              com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject1, paramInt1, Bitmap.CompressFormat.JPEG, paramString2, false);
            }
            catch (IOException paramString1)
            {
            }
            break;
            paramInt1 = 0;
            continue;
            paramInt1 = 90;
          }
        }
        localObject2 = localObject1;
        localObject1 = localBitmap2;
      }
      label426: localObject3 = paramString1;
    }
  }

  private Bitmap a(String paramString, boolean paramBoolean1, float paramFloat, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt, boolean paramBoolean5)
  {
    AppMethodBeat.i(78232);
    paramString = a(paramString, paramBoolean1, paramFloat, paramBoolean2, paramBoolean3, paramBoolean4, paramInt, paramBoolean5, null);
    AppMethodBeat.o(78232);
    return paramString;
  }

  private Bitmap a(String paramString, boolean paramBoolean1, float paramFloat, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt, boolean paramBoolean5, Bitmap paramBitmap)
  {
    AppMethodBeat.i(78233);
    String str = paramString;
    if (!paramBoolean1)
      str = c(paramString, false, true);
    Object localObject1;
    if (str == null)
    {
      localObject1 = null;
      AppMethodBeat.o(78233);
      return localObject1;
    }
    Object localObject2 = null;
    int i;
    label58: label91: long l;
    label149: int j;
    int k;
    int m;
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      i = 1;
      if (paramBoolean5)
      {
        paramString = (Bitmap)this.fEh.ai(str);
        localObject2 = paramString;
        if (paramString == null)
        {
          if (paramString != null)
            break label695;
          paramBoolean1 = true;
          ab.b("MicroMsg.ImgInfoStorage", "bm is null:%b,  url:%s", new Object[] { Boolean.valueOf(paramBoolean1), str });
          localObject2 = paramString;
        }
      }
      if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
      {
        localObject1 = localObject2;
        if (i == 0);
      }
      else
      {
        bo.anU();
        if (i == 0)
          break label700;
        paramString = paramBitmap;
        if (paramBitmap == null)
          paramString = x.vv(str);
        if (paramString == null)
          break label912;
        l = System.currentTimeMillis();
        j = paramString.getWidth();
        k = paramString.getHeight();
        m = k;
        n = j;
        if (paramBoolean3)
        {
          if (fEg == 0)
            fEg = com.tencent.mm.bz.a.am(ah.getContext(), 2131428381);
          if (j <= fEg)
          {
            m = k;
            n = j;
            if (k <= fEg);
          }
          else
          {
            if (j <= k)
              break label711;
            m = k * fEg / j;
            n = fEg;
          }
        }
        label262: j = m;
        k = n;
        if (paramBoolean4)
        {
          if (str.endsWith("hd"))
            break label950;
          m = (int)(paramString.getWidth() * paramFloat * 1.25F);
        }
      }
    }
    for (int n = (int)(paramString.getHeight() * paramFloat * 1.25F); ; n = k)
    {
      float f;
      if ((m >= 160.0F * paramFloat) || (n >= 160.0F * paramFloat))
        if (n > m)
        {
          f = 160.0F * paramFloat / n;
          label356: m = (int)(m * f);
          n = (int)(f * n);
        }
      while (true)
      {
        k = m;
        if (m < 60.0F * paramFloat)
        {
          ab.d("MicroMsg.ImgInfoStorage", "pic to small width is %d ", new Object[] { Integer.valueOf(m) });
          k = (int)(60.0F * paramFloat);
        }
        m = n;
        if (n < 60.0F * paramFloat)
        {
          ab.d("MicroMsg.ImgInfoStorage", "pic to small height is %d ", new Object[] { Integer.valueOf(n) });
          m = (int)(60.0F * paramFloat);
        }
        paramBitmap = ah.getContext();
        localObject2 = new int[2];
        if (m >= k)
        {
          paramFloat = m / k;
          if (paramFloat <= 2.0F)
          {
            n = com.tencent.mm.bz.a.am(paramBitmap, 2131427524);
            m = (int)(n / paramFloat);
            label511: localObject2[0] = m;
            localObject2[1] = n;
            k = localObject2[0];
            j = localObject2[1];
          }
        }
        while (true)
        {
          try
          {
            paramBitmap = Bitmap.createScaledBitmap(paramString, k, j, true);
            if ((paramString != paramBitmap) && (i == 0))
            {
              ab.i("MicroMsg.ImgInfoStorage", "[bitmapFromUriPath]:bitmap recycle %s", new Object[] { paramString.toString() });
              paramString.recycle();
            }
            if (paramBoolean4)
            {
              paramString = com.tencent.mm.sdk.platformtools.d.d(paramBitmap, paramInt);
              localObject2 = System.currentTimeMillis() - l;
              if (paramString != null)
                continue;
              paramBitmap = "";
              ab.i("MicroMsg.ImgInfoStorage", "cached file :%s bitmap time:%s bitmap:%s", new Object[] { str, localObject2, paramBitmap });
              localObject1 = paramString;
              if (paramString != null)
              {
                localObject1 = paramString;
                if (i == 0)
                {
                  this.fEh.k(str, paramString);
                  localObject1 = paramString;
                }
              }
              AppMethodBeat.o(78233);
              break;
              i = 0;
              break label58;
              label695: paramBoolean1 = false;
              break label91;
              label700: paramBitmap = com.tencent.mm.sdk.platformtools.d.j(str, paramFloat);
              break label149;
              label711: if (j == k)
              {
                m = fEg;
                n = fEg;
                break label262;
              }
              n = j * fEg / k;
              m = fEg;
              break label262;
              f = 160.0F * paramFloat / m;
              break label356;
              m = com.tencent.mm.bz.a.am(paramBitmap, 2131427526);
              n = (int)(m * paramFloat);
              break label511;
              paramFloat = k / m;
              if (paramFloat <= 2.0F)
              {
                m = com.tencent.mm.bz.a.am(paramBitmap, 2131427524);
                n = (int)(m / paramFloat);
                break label511;
              }
              n = com.tencent.mm.bz.a.am(paramBitmap, 2131427526);
              m = (int)(n * paramFloat);
            }
          }
          catch (OutOfMemoryError paramBitmap)
          {
            paramBitmap = paramString;
            continue;
            if (paramBoolean2)
            {
              paramString = com.tencent.mm.sdk.platformtools.d.a(paramBitmap, true, com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 3));
              ab.i("MicroMsg.ImgInfoStorage", "[bitmapFromUriPath]:bitmap recycle %s", new Object[] { paramBitmap.toString() });
              paramBitmap.recycle();
              continue;
            }
            paramString = paramBitmap;
            continue;
            paramBitmap = paramString.toString();
            continue;
          }
          label912: ab.e("MicroMsg.ImgInfoStorage", "img maybe delete, %s, %s", new Object[] { str, Boolean.valueOf(FileOp.ct(str)) });
          localObject1 = localObject2;
        }
      }
      label950: k = m;
      m = n;
    }
  }

  private e a(String paramString1, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, PInt paramPInt1, PInt paramPInt2, String paramString2, long paramLong, String paramString3, String paramString4, com.tencent.mm.a.b paramb1, com.tencent.mm.a.b paramb2, n.a parama)
  {
    AppMethodBeat.i(78264);
    if (!com.tencent.mm.vfs.e.ct(paramString1))
    {
      paramString1 = null;
      AppMethodBeat.o(78264);
    }
    String str;
    while (true)
    {
      return paramString1;
      str = f.sh(paramString1);
      paramb1 = a(paramString1, paramInt1, paramBoolean, paramInt3, paramPInt1, paramPInt2, paramString2, paramString3, paramb1);
      if ((parama == null) || (parama.fDC != paramInt1))
        break;
      paramString4 = parama.ahe();
      paramString3 = paramString4.fFU;
      paramPInt2 = paramString4.fFV;
      paramPInt1 = paramString4.fDK;
      paramString2 = paramString4.fFW;
      paramString4 = paramString4.fFX;
      ab.i("MicroMsg.ImgInfoStorage", "summersafecdn found CompressType path %s, source:%d, compressType:%d, pMidImgName[%s], pMidImgPath[%s]", new Object[] { paramString1, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString2.value, paramString4.value });
      paramString4 = new e();
      paramString4.bJt = -1;
      paramString4.fH(agU());
      paramString4.fG(paramLong);
      if (!bo.isNullOrNil(paramPInt1))
        paramString4.se(paramPInt1);
      paramString4.lw(0);
      paramString4.setSource(paramInt2);
      if (paramInt2 != 4)
        break label569;
      if (!paramString1.startsWith(aa.Ya()))
        break label560;
      paramString4.lv(3);
      label234: if (paramBoolean)
      {
        paramString4.sb(paramString3.value + ".jpg");
        if (!bo.isNullOrNil(paramString2.value))
          paramString4.sc(paramString2.value + ".jpg");
        if (bo.isNullOrNil(paramString4.fDB))
          paramString4.sd(paramb1);
        paramString4.lt((int)com.tencent.mm.vfs.e.asZ(paramPInt2.value));
        if (paramString4.frO == 0)
          ab.i("MicroMsg.ImgInfoStorage", "thumb file totlen is 0 %s", new Object[] { paramPInt2.value });
        paramString4.sa(str);
      }
      paramString4.ls((int)bo.anT());
      paramString4.lx(paramInt1);
      ab.d("MicroMsg.ImgInfoStorage", "fromPathToImgInfo insert: compress img size = " + paramString4.frO);
      AppMethodBeat.o(78264);
      paramString1 = paramString4;
    }
    if ((parama != null) && (parama.fDC != paramInt1))
      paramPInt2 = null;
    for (paramPInt1 = null; ; paramPInt1 = paramString4)
    {
      paramString3 = new PString();
      paramString4 = new PString();
      paramString2 = new PString();
      paramb2 = new PString();
      paramPInt1 = a(paramString1, str, paramInt1, paramBoolean, paramString3, paramString4, paramString2, paramb2, paramPInt1, paramPInt2);
      ab.i("MicroMsg.ImgInfoStorage", "summersafecdn user change CompressType path %s, source:%d, compressType:%d, pMidImgName[%s], pMidImgPath[%s]", new Object[] { paramString1, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString2.value, paramb2.value });
      paramPInt2 = paramString4;
      break;
      label560: paramString4.lv(2);
      break label234;
      label569: paramString4.lv(1);
      break label234;
      paramPInt2 = paramb2;
    }
  }

  private String a(String paramString1, int paramInt1, boolean paramBoolean, int paramInt2, PInt paramPInt1, PInt paramPInt2, String paramString2, String paramString3, com.tencent.mm.a.b paramb)
  {
    AppMethodBeat.i(78262);
    ab.i("MicroMsg.ImgInfoStorage", "genThumbImg, orig:%s", new Object[] { paramString1 });
    if (!com.tencent.mm.vfs.e.ct(paramString1))
    {
      ab.e("MicroMsg.ImgInfoStorage", "file not exit:%s", new Object[] { paramString1 });
      paramString1 = null;
      AppMethodBeat.o(78262);
      return paramString1;
    }
    String str = paramString3;
    if (bo.isNullOrNil(paramString3))
      str = agW();
    str = "THUMBNAIL_DIRPATH://th_".concat(String.valueOf(str));
    paramString3 = b(str, "th_", "", false);
    if (paramb == null)
      paramString3 = q(str, "th_", "");
    if (paramBoolean)
    {
      if ((!bo.isNullOrNil(paramString2)) && (com.tencent.mm.vfs.e.ct(paramString2)))
        break label262;
      long l = bo.yz();
      a(paramString1, paramInt1, paramInt2, paramPInt1, paramPInt2, true, paramString3, paramb);
      if (!com.tencent.mm.vfs.e.ct(paramString3))
        break label251;
      com.tencent.mm.plugin.report.service.h.pYm.e(10921, new Object[] { Long.valueOf(com.tencent.mm.vfs.e.asZ(paramString3)), Long.valueOf(com.tencent.mm.vfs.e.asZ(paramString1)), Integer.valueOf(90), Long.valueOf(bo.az(l)) });
    }
    while (true)
    {
      ab.d("MicroMsg.ImgInfoStorage", "insert: thumbName = ".concat(String.valueOf(str)));
      AppMethodBeat.o(78262);
      paramString1 = str;
      break;
      label251: ab.e("MicroMsg.ImgInfoStorage", " thumbImg not exits");
      continue;
      label262: com.tencent.mm.vfs.e.y(paramString2, paramString3);
    }
  }

  private void a(ImageView paramImageView1, ImageView paramImageView2, View paramView, String paramString, float paramFloat)
  {
    AppMethodBeat.i(78228);
    int i = paramString.hashCode();
    int j = paramImageView1.hashCode();
    Iterator localIterator = this.fEj.iterator();
    while (localIterator.hasNext())
    {
      g.b localb = (g.b)localIterator.next();
      if (j == localb.fEz)
      {
        ab.i("MicroMsg.ImgInfoStorage", "setbitmapFromUri  [%d, %s] ", new Object[] { Integer.valueOf(localb.fEz), localb.url });
        localb.url = paramString;
        if (!this.fEn.contains(Integer.valueOf(i)))
        {
          this.fEn.add(Integer.valueOf(i));
          f(paramString, paramFloat);
        }
        AppMethodBeat.o(78228);
        return;
      }
    }
    this.fEk.put(Integer.valueOf(j), new WeakReference(paramImageView1));
    int k;
    if (paramImageView2 != null)
    {
      k = paramImageView2.hashCode();
      this.fEl.put(Integer.valueOf(k), new WeakReference(paramImageView2));
    }
    while (true)
    {
      int m;
      if (paramView != null)
      {
        m = paramView.hashCode();
        this.fEm.put(Integer.valueOf(m), new WeakReference(paramView));
      }
      while (true)
      {
        paramImageView1 = new g.b(j, paramString, k, m);
        this.fEj.add(paramImageView1);
        if (!this.fEn.contains(Integer.valueOf(i)))
        {
          this.fEn.add(Integer.valueOf(i));
          f(paramString, paramFloat);
        }
        AppMethodBeat.o(78228);
        break;
        m = 0;
      }
      k = 0;
    }
  }

  private static void a(com.tencent.mm.cd.h paramh)
  {
    AppMethodBeat.i(78211);
    Cursor localCursor = paramh.a("PRAGMA table_info(ImgInfo2)", null, 2);
    int i = localCursor.getColumnIndex("name");
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    String str;
    while (localCursor.moveToNext())
      if (i >= 0)
      {
        str = localCursor.getString(i);
        if ("hashdthumb".equals(str))
          i3 = 1;
        if ("iscomplete".equals(str))
          i2 = 1;
        if ("origImgMD5".equals(str))
          i1 = 1;
        if ("compressType".equals(str))
          n = 1;
        if ("midImgPath".equals(str))
          m = 1;
        if (!"forwardType".equals(str))
          break label321;
        k = 1;
      }
    label321: 
    while (true)
    {
      if ("hevcPath".equals(str))
        j = 1;
      break;
      localCursor.close();
      long l = com.tencent.mm.kernel.g.RP().eJN.iV(Thread.currentThread().getId());
      if (i3 == 0)
        paramh.hY("ImgInfo2", "Alter table ImgInfo2 add hashdthumb INT DEFAULT 0");
      if (i2 == 0)
        paramh.hY("ImgInfo2", "Alter table ImgInfo2 add iscomplete INT DEFAULT 1");
      if (i1 == 0)
        paramh.hY("ImgInfo2", "Alter table ImgInfo2 add origImgMD5 TEXT");
      if (n == 0)
        paramh.hY("ImgInfo2", "Alter table ImgInfo2 add compressType INT DEFAULT 0");
      if (m == 0)
        paramh.hY("ImgInfo2", "Alter table ImgInfo2 add midImgPath TEXT");
      if (k == 0)
        paramh.hY("ImgInfo2", "Alter table ImgInfo2 add forwardType INT DEFAULT 0");
      if (j == 0)
        paramh.hY("ImgInfo2", "Alter table ImgInfo2 add hevcPath TEXT");
      if (l > 0L)
        com.tencent.mm.kernel.g.RP().eJN.mB(l);
      AppMethodBeat.o(78211);
      return;
    }
  }

  public static String agW()
  {
    try
    {
      AppMethodBeat.i(78260);
      String str = sn("");
      AppMethodBeat.o(78260);
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private Cursor b(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(78250);
    paramString1 = a(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2);
    AppMethodBeat.o(78250);
    return paramString1;
  }

  private void f(String paramString, float paramFloat)
  {
    AppMethodBeat.i(78229);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RS().aa(new g.2(this, paramString, paramFloat, true, 2130838182));
    AppMethodBeat.o(78229);
  }

  public static String si(String paramString)
  {
    AppMethodBeat.i(78215);
    paramString = "THUMBNAIL_DIRPATH://th_".concat(String.valueOf(paramString));
    AppMethodBeat.o(78215);
    return paramString;
  }

  private static String sn(String paramString)
  {
    try
    {
      AppMethodBeat.i(78261);
      long l1 = System.currentTimeMillis();
      long l2 = fEt;
      long l3 = l1;
      if (l2 == l1);
      try
      {
        Thread.sleep(1L);
        label30: l3 = System.currentTimeMillis();
        fEt = l3;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        paramString = com.tencent.mm.a.g.x((paramString + l3).getBytes());
        ab.i("MicroMsg.ImgInfoStorage", "generateMd5: %s, %s", new Object[] { paramString, Long.valueOf(l3) });
        AppMethodBeat.o(78261);
        return paramString;
      }
      catch (InterruptedException localInterruptedException)
      {
        break label30;
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public static String y(bi parambi)
  {
    AppMethodBeat.i(78275);
    if (parambi == null)
    {
      ab.w("MicroMsg.ImgInfoStorage", "[getBigPicPath] msg is null.");
      AppMethodBeat.o(78275);
      parambi = null;
    }
    long l;
    Object localObject2;
    while (true)
    {
      return parambi;
      l = System.currentTimeMillis();
      if (parambi.field_isSend == 1)
      {
        localObject1 = o.ahl().fJ(parambi.field_msgId);
        localObject2 = localObject1;
        if (((e)localObject1).fDy != 0L);
      }
      else
      {
        localObject2 = o.ahl().fI(parambi.field_msgSvrId);
      }
      if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
        break label280;
      if (parambi.field_isSend != 1)
        break;
      Object localObject1 = f.c((e)localObject2);
      parambi = o.ahl().q((String)localObject1, "", "");
      if ((localObject1 != null) && (((String)localObject1).length() > 0) && (com.tencent.mm.vfs.e.ct(parambi)))
      {
        AppMethodBeat.o(78275);
      }
      else
      {
        localObject2 = ((e)localObject2).fDz;
        parambi = o.ahl().q((String)localObject2, "", "");
        if ((localObject2 == null) || (((String)localObject2).length() <= 0) || (!com.tencent.mm.vfs.e.ct(parambi)))
          break label280;
        AppMethodBeat.o(78275);
      }
    }
    if (((e)localObject2).agP())
    {
      parambi = ((e)localObject2).fDz;
      if (!((e)localObject2).agQ())
        break label324;
      localObject2 = f.a((e)localObject2);
      if ((localObject2 == null) || (((e)localObject2).fDy <= 0L) || (!((e)localObject2).agP()) || (!com.tencent.mm.vfs.e.ct(o.ahl().q(((e)localObject2).fDz, "", ""))))
        break label324;
      parambi = ((e)localObject2).fDz;
    }
    label280: label324: 
    while (true)
    {
      AppMethodBeat.o(78275);
      break;
      ab.d("MicroMsg.ImgInfoStorage", "getBigPicPath use time:%s", new Object[] { System.currentTimeMillis() - l });
      AppMethodBeat.o(78275);
      parambi = null;
      break;
    }
  }

  public final String I(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(78223);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(78223);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      String str = paramString.trim();
      if (str.startsWith("THUMBNAIL://"))
        paramString = str.substring(12);
      do
      {
        try
        {
          paramString = ly(Integer.valueOf(paramString).intValue()).fDB;
          paramString = b(paramString, "", "", paramBoolean);
          AppMethodBeat.o(78223);
        }
        catch (NumberFormatException paramString)
        {
          ab.e("MicroMsg.ImgInfoStorage", "read img buf failed: " + paramString.getMessage());
          AppMethodBeat.o(78223);
          paramString = null;
        }
        break;
        paramString = str;
      }
      while (!str.startsWith("THUMBNAIL_DIRPATH://"));
      paramString = b(str.substring(20).substring(3), "th_", "", paramBoolean);
      AppMethodBeat.o(78223);
    }
  }

  public final String W(byte[] paramArrayOfByte)
  {
    String str = null;
    AppMethodBeat.i(78222);
    if (bo.cb(paramArrayOfByte))
    {
      ab.e("MicroMsg.ImgInfoStorage", "save dir thumb error, thumbBuf is null");
      AppMethodBeat.o(78222);
      paramArrayOfByte = str;
    }
    while (true)
    {
      return paramArrayOfByte;
      Object localObject = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
      MMBitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, (BitmapFactory.Options)localObject);
      if ((((BitmapFactory.Options)localObject).outWidth < 0) || (((BitmapFactory.Options)localObject).outHeight < 0))
      {
        ab.e("MicroMsg.ImgInfoStorage", "Bad thumbBuf, perhaps it's not complete or damaged ??");
        AppMethodBeat.o(78222);
        paramArrayOfByte = str;
      }
      else
      {
        str = agW();
        localObject = q(str, "th_", "");
        ab.d("MicroMsg.ImgInfoStorage", "saveDirThumb, fullPath = ".concat(String.valueOf(localObject)));
        com.tencent.mm.vfs.e.deleteFile((String)localObject);
        com.tencent.mm.vfs.e.b((String)localObject, paramArrayOfByte, paramArrayOfByte.length);
        paramArrayOfByte = "THUMBNAIL_DIRPATH://th_".concat(String.valueOf(str));
        AppMethodBeat.o(78222);
      }
    }
  }

  public final int a(int paramInt, e parame)
  {
    AppMethodBeat.i(78267);
    paramInt = a(Long.valueOf(paramInt), parame);
    AppMethodBeat.o(78267);
    return paramInt;
  }

  public final int a(Long paramLong, e parame)
  {
    AppMethodBeat.i(78268);
    long l = System.currentTimeMillis();
    ContentValues localContentValues = parame.Hl();
    if (localContentValues.size() == 0);
    for (int i = 1; ; i = this.fni.update("ImgInfo2", localContentValues, "id=?", new String[] { String.valueOf(paramLong) }))
    {
      ab.i("MicroMsg.ImgInfoStorage", "update last :%d values : %s %s", new Object[] { Long.valueOf(System.currentTimeMillis() - Long.valueOf(l).longValue()), localContentValues.toString(), Integer.valueOf(i) });
      if (i != -1)
      {
        parame.agS();
        doNotify();
      }
      AppMethodBeat.o(78268);
      return i;
    }
  }

  public final long a(String paramString1, int paramInt1, int paramInt2, int paramInt3, PString paramPString, PInt paramPInt1, PInt paramPInt2, String paramString2, String paramString3, long paramLong, com.tencent.mm.a.b paramb1, com.tencent.mm.a.b paramb2, n.a parama)
  {
    AppMethodBeat.i(78252);
    paramLong = a(paramString1, null, paramInt1, paramInt2, paramInt3, paramPString, paramPInt1, paramPInt2, paramString2, paramString3, paramLong, paramb1, paramb2, parama);
    AppMethodBeat.o(78252);
    return paramLong;
  }

  public final long a(String paramString, int paramInt1, int paramInt2, PString paramPString, PInt paramPInt1, PInt paramPInt2)
  {
    AppMethodBeat.i(78251);
    long l = a(paramString, paramInt1, paramInt2, 0, paramPString, paramPInt1, paramPInt2, "", "", -1L, null, null, null);
    AppMethodBeat.o(78251);
    return l;
  }

  final long a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, PString paramPString, PInt paramPInt1, PInt paramPInt2, String paramString3, String paramString4, long paramLong, com.tencent.mm.a.b paramb1, com.tencent.mm.a.b paramb2, n.a parama)
  {
    AppMethodBeat.i(78253);
    if (paramInt1 == 0)
    {
      paramString1 = a(paramString1, 0, true, paramInt2, paramInt3, paramPInt1, paramPInt2, paramPString.value, paramLong, paramString3, paramString4, paramb2, paramb1, parama);
      if (paramString1 == null)
      {
        paramLong = -1L;
        AppMethodBeat.o(78253);
      }
    }
    while (true)
    {
      return paramLong;
      paramPString.value = paramString1.fDB;
      if (com.tencent.mm.vfs.e.ct(paramString2))
      {
        paramPString = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.c.class)).IP(paramString1.fDz);
        com.tencent.mm.vfs.e.y(paramString2, q(paramPString, "", ""));
        paramString1.sf(paramPString);
      }
      paramLong = e(paramString1);
      if (paramLong != -1L)
        doNotify();
      AppMethodBeat.o(78253);
      continue;
      if (paramInt1 == 1)
      {
        paramString2 = a(paramString1, 1, true, paramInt2, paramInt3, paramPInt1, paramPInt2, paramPString.value, paramLong, paramString3, paramString4, paramb2, paramb1, parama);
        if (paramString2 == null)
        {
          paramLong = -1L;
          AppMethodBeat.o(78253);
        }
        else
        {
          paramPString.value = paramString2.fDB;
          paramString2.fG(0L);
          paramString2.eI(0L);
          paramString2.lt((int)com.tencent.mm.vfs.e.asZ(q(paramString2.fDz, "", "")));
          paramString1 = a(paramString1, 0, false, paramInt2, paramInt3, new PInt(), new PInt(), "", paramLong, paramString3, paramString4, paramb2, paramb1, parama);
          if (paramString1 == null)
          {
            paramLong = 0L;
            AppMethodBeat.o(78253);
          }
          else
          {
            paramString1.sb(paramString2.fDz);
            paramString1.sd(paramString2.fDB);
            paramString1.sc(paramString2.fDA);
            paramString1.lt(0);
            long l = this.fni.iV(Thread.currentThread().getId());
            paramString1.lu((int)e(paramString2));
            paramLong = e(paramString1);
            ab.d("MicroMsg.ImgInfoStorage", "summersafecdn insert ret[%d],  getLocalId[%d], getMsgLocalId[%d], getBigImgPath[%s], getMidImgPath[%s], getTotalLen[%d]", new Object[] { Long.valueOf(paramLong), Long.valueOf(paramString1.fDy), Long.valueOf(paramString1.fDH), paramString1.fDz, paramString1.fDA, Integer.valueOf(paramString1.frO) });
            if (l > 0L)
              com.tencent.mm.kernel.g.RP().eJN.mB(l);
            if (paramLong != -1L)
              doNotify();
            AppMethodBeat.o(78253);
          }
        }
      }
      else
      {
        Assert.assertTrue(false);
        paramLong = 0L;
        AppMethodBeat.o(78253);
      }
    }
  }

  public final long a(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean, String paramString1, int paramInt, String paramString2, PString paramPString, PInt paramPInt1, PInt paramPInt2)
  {
    AppMethodBeat.i(78266);
    String str1 = "SERVERID://".concat(String.valueOf(paramLong));
    String str2 = com.tencent.mm.a.g.x(str1.getBytes());
    String str3 = q(str2, "th_", "");
    Bitmap localBitmap;
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length >= 0))
    {
      localBitmap = com.tencent.mm.sdk.platformtools.d.bQ(paramArrayOfByte);
      if (localBitmap == null)
        ab.e("MicroMsg.ImgInfoStorage", "create decodeByteArray failed: " + new String(paramArrayOfByte));
      if ((paramBoolean) || (localBitmap == null));
    }
    try
    {
      localBitmap = com.tencent.mm.sdk.platformtools.d.ah(localBitmap);
      paramPInt1.value = localBitmap.getWidth();
      paramPInt2.value = localBitmap.getHeight();
      com.tencent.mm.sdk.platformtools.d.a(localBitmap, 90, Bitmap.CompressFormat.JPEG, str3, true);
      paramPInt1 = new e();
      if (!bo.isNullOrNil(paramString1))
      {
        paramPInt1.setOffset(paramInt);
        paramPInt1.lt(paramInt);
        paramArrayOfByte = paramString1;
        paramPInt1.bJt = -1;
        paramPInt1.fH(agU());
        paramPInt1.sb(paramArrayOfByte);
        paramPInt1.sd("THUMBNAIL_DIRPATH://th_".concat(String.valueOf(str2)));
        paramPString.value = paramPInt1.fDB;
        if (paramBoolean)
        {
          paramPInt1.eI(0L);
          paramPInt1.lx(1);
          paramPInt1.se(paramString2);
          paramPInt1.ls((int)bo.anT());
          paramLong = e(paramPInt1);
          if (paramLong != -1L)
            doNotify();
          AppMethodBeat.o(78266);
          return paramLong;
        }
      }
    }
    catch (IOException paramPInt1)
    {
      while (true)
      {
        ab.e("MicroMsg.ImgInfoStorage", "create thumbnail from byte failed: " + str2 + " " + new String(paramArrayOfByte));
        continue;
        paramPInt1.eI(paramLong);
        paramPInt1.lx(0);
        continue;
        paramArrayOfByte = str1;
      }
    }
  }

  public final long a(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean, String paramString, PString paramPString, PInt paramPInt1, PInt paramPInt2)
  {
    AppMethodBeat.i(78265);
    paramLong = a(paramArrayOfByte, paramLong, paramBoolean, "", 0, paramString, paramPString, paramPInt1, paramPInt2);
    AppMethodBeat.o(78265);
    return paramLong;
  }

  public final Cursor a(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(78249);
    paramString1 = this.fni.query(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, null, null, null);
    AppMethodBeat.o(78249);
    return paramString1;
  }

  public final Bitmap a(long paramLong, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(78270);
    if (paramBoolean);
    for (String str = "location_backgroup_key_from".concat(String.valueOf(paramLong)); ; str = "location_backgroup_key_tor".concat(String.valueOf(paramLong)))
    {
      Bitmap localBitmap1 = (Bitmap)this.fEh.ai(str);
      Bitmap localBitmap2;
      if (localBitmap1 != null)
      {
        localBitmap2 = localBitmap1;
        if (!localBitmap1.isRecycled());
      }
      else
      {
        localBitmap2 = com.tencent.mm.sdk.platformtools.d.o(paramString, paramInt1, paramInt2, paramInt3);
        this.fEh.k(str, localBitmap2);
      }
      AppMethodBeat.o(78270);
      return localBitmap2;
    }
  }

  public final Bitmap a(String paramString, float paramFloat, Context paramContext)
  {
    AppMethodBeat.i(78235);
    paramString = a(paramString, paramFloat, paramContext, -1);
    AppMethodBeat.o(78235);
    return paramString;
  }

  public final Bitmap a(String paramString, float paramFloat, Context paramContext, int paramInt)
  {
    AppMethodBeat.i(78236);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = null;
      AppMethodBeat.o(78236);
      return paramString;
    }
    String str = paramString.trim();
    Bitmap localBitmap = (Bitmap)this.fEh.ai(str);
    int i;
    int j;
    int k;
    int m;
    if (localBitmap != null)
    {
      paramString = localBitmap;
      if (!localBitmap.isRecycled());
    }
    else
    {
      localBitmap = BackwardSupportUtil.b.i(str, paramFloat);
      if (localBitmap == null)
        break label360;
      i = localBitmap.getWidth();
      j = localBitmap.getHeight();
      if (i < j)
        break label279;
      k = BackwardSupportUtil.b.b(paramContext, this.fEs);
      m = (int)(j / i * k);
      label124: if ((k > 0) && (m > 0) && (k <= 2048) && (m <= 2048))
        break label307;
      ab.e("MicroMsg.ImgInfoStorage", "getVideoThumb, error Scale Size %d*%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
      com.tencent.mm.plugin.report.service.h.pYm.a(111L, 188L, 1L, false);
      paramString = null;
      label194: paramContext = paramString;
      if (paramInt != -1)
        paramContext = com.tencent.mm.sdk.platformtools.d.d(paramString, paramInt);
      if (localBitmap != paramContext)
      {
        ab.i("MicroMsg.ImgInfoStorage", "[getVideoThumb] bitmap:%s", new Object[] { localBitmap.toString() });
        localBitmap.recycle();
      }
      ab.d("MicroMsg.ImgInfoStorage", "cached file ".concat(String.valueOf(str)));
      this.fEh.k(str, paramContext);
    }
    label279: label307: label360: for (paramString = paramContext; ; paramString = localBitmap)
    {
      while (true)
      {
        AppMethodBeat.o(78236);
        break;
        m = BackwardSupportUtil.b.b(paramContext, this.fEs);
        k = (int)(i / j * m);
        break label124;
        try
        {
          paramString = Bitmap.createScaledBitmap(localBitmap, k, m, true);
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.ImgInfoStorage", "getVideoThumb, Bitmap.createScaledBitmap Exception:%s", new Object[] { paramString.getMessage() });
          paramString = null;
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 188L, 1L, false);
        }
      }
      break label194;
    }
  }

  public final Bitmap a(String paramString, float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(78225);
    paramString = a(paramString, false, paramFloat, paramBoolean, false, false, -1);
    AppMethodBeat.o(78225);
    return paramString;
  }

  public final Bitmap a(String paramString, boolean paramBoolean1, float paramFloat, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt)
  {
    AppMethodBeat.i(78231);
    paramString = a(paramString, paramBoolean1, paramFloat, paramBoolean2, paramBoolean3, paramBoolean4, paramInt, true);
    AppMethodBeat.o(78231);
    return paramString;
  }

  public final String a(String paramString1, int paramInt1, PString paramPString, PInt paramPInt1, PInt paramPInt2, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(78259);
    if (!com.tencent.mm.vfs.e.ct(paramString1))
    {
      ab.e("MicroMsg.ImgInfoStorage", "file not exit:%s", new Object[] { paramString1 });
      str1 = null;
      AppMethodBeat.o(78259);
      return str1;
    }
    String str1 = paramString2;
    if (bo.isNullOrNil(paramString2))
      str1 = agW();
    String str2 = "THUMBNAIL_DIRPATH://th_".concat(String.valueOf(str1));
    paramString2 = b(str2, "th_", "", false);
    paramPString.value = str2;
    long l = bo.yz();
    paramPInt2 = a(paramString1, paramInt1, paramInt2, paramPInt1, paramPInt2, false, null, null);
    paramPString = (String)this.fEi.get(paramString1);
    if (paramPString != null);
    for (paramPString = (Bitmap)this.fEh.get(paramPString); ; paramPString = null)
    {
      if (paramPString != null)
      {
        paramPInt1 = paramPString;
        if (!paramPString.isRecycled());
      }
      else
      {
        paramPInt1 = a(paramString1, true, com.tencent.mm.bz.a.getDensity(ah.getContext()), false, false, true, 2130838182, true, paramPInt2);
        this.fEi.put(paramString1, paramString2);
      }
      if (paramPInt1 != null)
        this.fEh.k(paramString2, paramPInt1);
      ab.i("MicroMsg.ImgInfoStorage", "test decode thumb img:%d", new Object[] { Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(78259);
      break;
    }
  }

  public final String a(String paramString1, String paramString2, int paramInt, boolean paramBoolean, PString paramPString1, PString paramPString2, PString paramPString3, PString paramPString4, String paramString3, com.tencent.mm.a.b paramb)
  {
    AppMethodBeat.i(78263);
    Object localObject = paramString3;
    if (bo.isNullOrNil(paramString3))
    {
      localObject = sn(paramString1);
      ab.i("MicroMsg.ImgInfoStorage", "generateMd5: %s, %s", new Object[] { localObject, paramString1 });
    }
    paramString3 = b((String)localObject, "", ".jpg", false);
    if (paramb == null)
      paramString3 = b((String)localObject, "", ".jpg", true);
    ab.i("MicroMsg.ImgInfoStorage", "fullPath is %s", new Object[] { paramString3 });
    if (com.tencent.mm.vfs.e.asZ(paramString3) > 0L)
    {
      ab.i("MicroMsg.ImgInfoStorage", "genBigImg file already exist!");
      com.tencent.mm.plugin.report.service.h.pYm.k(944L, 8L, 1L);
    }
    paramPString1.value = ((String)localObject);
    paramPString2.value = paramString3;
    if ((paramBoolean) && (!bo.isNullOrNil(paramString2)) && (paramInt == 0))
    {
      localObject = X(paramString2, paramInt);
      if (!bo.isNullOrNil(((e)localObject).fDz))
      {
        paramString2 = q(((e)localObject).fDz, "", "");
        if (paramb != null)
          paramb.getFile();
        com.tencent.mm.vfs.e.y(paramString2, paramString3);
        if (com.tencent.mm.vfs.e.asZ(paramString2) > 0L)
          if (!bo.isNullOrNil(((e)localObject).fDK))
          {
            paramString1 = ((e)localObject).fDK;
            AppMethodBeat.o(78263);
          }
      }
    }
    while (true)
    {
      return paramString1;
      paramString1 = null;
      AppMethodBeat.o(78263);
      continue;
      ab.w("MicroMsg.ImgInfoStorage", "ERR: copy old match file failed ,:%s ,%s ", new Object[] { paramString1, paramString3 });
      try
      {
        if (at.isWifi(ah.getContext()))
        {
          i = bo.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressPicLevelForWifi"), 60);
          ab.i("MicroMsg.ImgInfoStorage", "genBigImg CompressPicLevel-level:%d", new Object[] { Integer.valueOf(i) });
          if ((i > 10) && (i <= 100))
            break label3571;
          j = 70;
          k = 0;
          m = 0;
          n = 1080;
          i = k;
        }
      }
      catch (Exception paramString2)
      {
        while (true)
        {
          int i;
          try
          {
            while (true)
            {
              label400: int i1;
              if (at.isWifi(ah.getContext()))
              {
                i = k;
                paramString2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressResolutionForWifi");
                i = k;
                i1 = paramString2.indexOf("*");
                if (-1 != i1)
                {
                  i = k;
                  m = Integer.valueOf(paramString2.substring(0, i1)).intValue();
                  i = m;
                  k = Integer.valueOf(paramString2.substring(i1 + 1)).intValue();
                  i = k;
                  n = i;
                }
              }
              else
              {
                try
                {
                  i = bo.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("UseOptImage"), 0);
                  paramString2 = new com/tencent/mm/a/p;
                  com.tencent.mm.kernel.g.RN();
                  paramString2.<init>(com.tencent.mm.kernel.a.QF());
                  if ((int)(paramString2.longValue() / 100L) % 100 + 1 <= i)
                  {
                    bool1 = true;
                    ab.i("MicroMsg.ImgInfoStorage", "fromPathToImgInfo useOpt:%b opt:%d uin:(%d,%d) debug:%b sdk:%d", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(i), Long.valueOf(paramString2.longValue()), Long.valueOf(paramString2.longValue() / 100L), Boolean.valueOf(com.tencent.mm.sdk.a.b.dnO()), Integer.valueOf(Build.VERSION.SDK_INT) });
                    if (com.tencent.mm.sdk.a.b.dnO())
                      bool1 = true;
                    if (com.tencent.mm.compatible.util.d.fP(16))
                    {
                      bool1 = false;
                      ab.i("MicroMsg.ImgInfoStorage", "genBigImg configLong:%d configShort:%d", new Object[] { Integer.valueOf(m), Integer.valueOf(n) });
                      if ((m <= 0) && (n <= 0))
                      {
                        k = 0;
                        i = 1080;
                        n = bo.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("PicCompressAvoidanceActiveSizeNormal"), 100);
                        m = n;
                        if (n <= 0)
                          m = 100;
                        i2 = m * 1024;
                        i1 = bo.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("PicCompressAvoidanceRemainderPerc"), 10);
                        if ((i1 > 0) && (i1 < 100))
                          break label3551;
                        i1 = 10;
                        i3 = MMNativeJpeg.queryQuality(paramString1);
                        m = 1;
                        n = m;
                        if (i3 != 0)
                        {
                          n = m;
                          if (i3 <= j)
                            n = 0;
                        }
                        ab.d("MicroMsg.ImgInfoStorage", "genBigImg insert : original img path: %s, fullpath:%s, needimg:%b,comresstype:%d Avoidance[%d,%d] ", new Object[] { paramString1, paramString3, Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Integer.valueOf(i2), Integer.valueOf(i1) });
                        if (!paramBoolean)
                          break label3228;
                        localObject = com.tencent.mm.sdk.platformtools.d.amj(paramString1);
                        if ((localObject != null) && (((BitmapFactory.Options)localObject).outWidth != 0) && (((BitmapFactory.Options)localObject).outHeight != 0))
                          break label1233;
                        if (localObject != null)
                          break label1227;
                        paramBoolean = true;
                        ab.w("MicroMsg.ImgInfoStorage", "genBigImg getImageOptions error:%s, origOptions_null:%b", new Object[] { paramString1, Boolean.valueOf(paramBoolean) });
                        paramString1 = null;
                        AppMethodBeat.o(78263);
                        break;
                        if (at.is2G(ah.getContext()))
                        {
                          i = bo.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressPicLevelFor2G"), 40);
                          continue;
                        }
                        if (at.is3G(ah.getContext()))
                        {
                          i = bo.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressPicLevelFor3G"), 40);
                          continue;
                        }
                        i = bo.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressPicLevelFor4G"), 60);
                        continue;
                        paramString2 = paramString2;
                        i = 0;
                        continue;
                        i = k;
                        if (at.is2G(ah.getContext()))
                        {
                          i = k;
                          paramString2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressResolutionFor2G");
                          break label400;
                        }
                        i = k;
                        if (at.is3G(ah.getContext()))
                        {
                          i = k;
                          paramString2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressResolutionFor3G");
                          break label400;
                        }
                        i = k;
                        paramString2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressResolutionFor4G");
                      }
                    }
                  }
                }
                catch (Exception paramString2)
                {
                  while (true)
                  {
                    int i2;
                    int i3;
                    ab.e("MicroMsg.ImgInfoStorage", "get useopt :%s", new Object[] { bo.l(paramString2) });
                    bool1 = false;
                    continue;
                    if (n >= 2160)
                    {
                      k = 0;
                      i = 1080;
                    }
                    else
                    {
                      i = n;
                      k = m;
                      if (n <= 0)
                      {
                        i = n;
                        k = m;
                        if (m > 3240)
                        {
                          k = 1620;
                          i = 0;
                          continue;
                          label1227: paramBoolean = false;
                          continue;
                          label1233: int i4 = ((BitmapFactory.Options)localObject).outWidth;
                          int i5 = ((BitmapFactory.Options)localObject).outHeight;
                          label1267: int i6;
                          label1287: int i7;
                          label1322: label1345: long l1;
                          label1458: boolean bool2;
                          if (((BitmapFactory.Options)localObject).outWidth > ((BitmapFactory.Options)localObject).outHeight)
                          {
                            m = ((BitmapFactory.Options)localObject).outWidth;
                            if (((BitmapFactory.Options)localObject).outWidth >= ((BitmapFactory.Options)localObject).outHeight)
                              break label1853;
                            i6 = ((BitmapFactory.Options)localObject).outWidth;
                            if (i <= 0)
                              break label1883;
                            i7 = i6 / i;
                            if (((BitmapFactory.Options)localObject).outHeight <= i)
                              break label1863;
                            k = ((BitmapFactory.Options)localObject).outHeight * i / i6;
                            if (((BitmapFactory.Options)localObject).outWidth <= i)
                              break label1873;
                            i = i * ((BitmapFactory.Options)localObject).outWidth / i6;
                            m = i;
                            i = k;
                            if (i * m <= 10240000)
                              break label3544;
                            double d = Math.sqrt(10240000.0D / (i * m));
                            k = (int)(i / d);
                            m = (int)(m / d);
                            ab.i("MicroMsg.ImgInfoStorage", "genBigImg [%d, %d] -> target:[h,w]:[%d,%d]", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject).outHeight), Integer.valueOf(((BitmapFactory.Options)localObject).outWidth), Integer.valueOf(k), Integer.valueOf(m) });
                            if (localObject == null)
                              break label1963;
                            paramString2 = ((BitmapFactory.Options)localObject).outMimeType;
                            l1 = com.tencent.mm.vfs.e.asZ(paramString1);
                            bool2 = MMNativeJpeg.IsJpegFile(paramString1);
                            if ((paramString2 == null) || ((!paramString2.endsWith("jpeg")) && (!paramString2.endsWith("jpg")) && (!paramString2.endsWith("bmp")) && (!paramString2.endsWith("png")) && (!paramString2.endsWith("gif"))))
                              break label1970;
                            i6 = 1;
                            label1527: if ((paramInt != 0) || ((n == 0) && (l1 <= 204800L) && ((localObject == null) || (i7 <= 0))) || (l1 <= i2))
                              break label1983;
                            if ((i3 >= 55) && (bool2))
                              break label3537;
                            paramBoolean = false;
                            if (!paramBoolean)
                              break label1976;
                          }
                          long l2;
                          long l3;
                          label1953: label1963: label1970: label1976: for (i = 18; ; i = 8)
                          {
                            l2 = bo.anU();
                            n = com.tencent.mm.sdk.platformtools.d.a(paramBoolean, paramString1, k, m, Bitmap.CompressFormat.JPEG, j, paramString3, paramb);
                            if ((n == 1) || (!paramBoolean))
                              break label3530;
                            i = 28;
                            n = com.tencent.mm.sdk.platformtools.d.a(false, paramString1, k, m, Bitmap.CompressFormat.JPEG, j, paramString3, paramb);
                            bool1 = false;
                            l3 = com.tencent.mm.vfs.e.asZ(paramString3);
                            ab.i("MicroMsg.ImgInfoStorage", "genBigImg check use orig , orig:%d aftercomp:%d diff percent:[%d] picCompressAvoidanceRemainderPerc:%d  %s ", new Object[] { Long.valueOf(l1), Long.valueOf(l3), Long.valueOf(100L * l3 / l1), Integer.valueOf(i1), paramString3 });
                            k = n;
                            paramBoolean = bool1;
                            m = i;
                            if (i6 != 0)
                            {
                              k = n;
                              paramBoolean = bool1;
                              m = i;
                              if ((l1 - l3) * 100L < i1 * l1)
                              {
                                com.tencent.mm.vfs.e.y(paramString1, paramString3);
                                paramBoolean = false;
                                m = 48;
                                k = 1;
                              }
                            }
                            l2 = bo.anU() - l2;
                            i = k;
                            i1 = m;
                            if (k == 1)
                              break label2395;
                            com.tencent.mm.plugin.report.service.h.pYm.a(111L, 187L, 1L, false);
                            ab.e("MicroMsg.ImgInfoStorage", "createThumbNail big pic fail: %s", new Object[] { paramString1 });
                            paramString1 = null;
                            AppMethodBeat.o(78263);
                            break;
                            m = ((BitmapFactory.Options)localObject).outHeight;
                            break label1267;
                            label1853: i6 = ((BitmapFactory.Options)localObject).outHeight;
                            break label1287;
                            label1863: k = ((BitmapFactory.Options)localObject).outHeight;
                            break label1322;
                            label1873: i = ((BitmapFactory.Options)localObject).outWidth;
                            break label1345;
                            label1883: i7 = m / k;
                            if (((BitmapFactory.Options)localObject).outHeight > k)
                            {
                              i = ((BitmapFactory.Options)localObject).outHeight * k / m;
                              label1913: if (((BitmapFactory.Options)localObject).outWidth <= k)
                                break label1953;
                            }
                            for (k = k * ((BitmapFactory.Options)localObject).outWidth / m; ; k = ((BitmapFactory.Options)localObject).outWidth)
                            {
                              m = k;
                              break;
                              i = ((BitmapFactory.Options)localObject).outHeight;
                              break label1913;
                            }
                            paramString2 = "";
                            break label1458;
                            i6 = 0;
                            break label1527;
                          }
                          label1983: ab.i("MicroMsg.ImgInfoStorage", "summersafecdn createThumbNail big pic no compress, calculatedQuality:%d, origLen:%d oriWidth:%d oriHeight:%d", new Object[] { Integer.valueOf(i3), Long.valueOf(l1), Integer.valueOf(i4), Integer.valueOf(i5) });
                          if (i6 != 0)
                          {
                            com.tencent.mm.vfs.e.y(paramString1, paramString3);
                            label2039: i6 = 38;
                            l2 = 0L;
                            com.tencent.mm.al.f.afx();
                            if (!com.tencent.mm.al.b.lg(256))
                              break label3412;
                            if (paramInt != 1)
                              break label3420;
                            i = 0;
                          }
                          try
                          {
                            n = Integer.valueOf(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressMidPicLevel")).intValue();
                            i = n;
                            label3228: label3490: label3496: 
                            while (true)
                            {
                              try
                              {
                                label2099: n = Integer.valueOf(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("CompressMidPicSize")).intValue();
                                ab.i("MicroMsg.ImgInfoStorage", "summersafecdn CompressMidPicLevel-level:%d size:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(n) });
                                if (i > 10)
                                {
                                  i1 = i;
                                  if (i <= 100);
                                }
                                else
                                {
                                  i1 = 52;
                                }
                                if ((n > 0) && (n <= 800))
                                  break label3523;
                                i = 800;
                                if (m <= i)
                                  break label3520;
                                m = i;
                                if (k <= i)
                                  break label3517;
                                k = i;
                                bool1 = true;
                                paramBoolean = bool1;
                                if (i3 != 0)
                                {
                                  paramBoolean = bool1;
                                  if (i3 <= i1)
                                    paramBoolean = false;
                                }
                                if ((paramBoolean) || (l1 > 800L) || ((localObject != null) && ((i5 > i) || (i4 > i))))
                                {
                                  paramPString3.value = sn(paramString1);
                                  paramPString4.value = b(paramPString3.value, "", ".jpg", false);
                                  i = com.tencent.mm.sdk.platformtools.d.a(false, paramString1, k, m, Bitmap.CompressFormat.JPEG, i1, paramPString4.value, paramb);
                                  ab.d("MicroMsg.ImgInfoStorage", "summersafecdn pMidImgName[%s], pMidImgPath[%s], useOpt[%b], ret[%b] [%d, %d]", new Object[] { paramPString3.value, paramPString4.value, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(m) });
                                  paramBoolean = false;
                                  i1 = i6;
                                  label2395: paramString2 = com.tencent.mm.sdk.platformtools.d.amj(paramString3);
                                  if (paramString2 == null)
                                    break label3433;
                                  m = paramString2.outWidth;
                                  if (paramString2 == null)
                                    break label3439;
                                  n = paramString2.outHeight;
                                  l3 = com.tencent.mm.vfs.e.asZ(paramString3);
                                  i6 = MMNativeJpeg.queryQuality(paramString3);
                                  boolean bool3 = MMNativeJpeg.IsJpegFile(paramString3);
                                  paramString2 = com.tencent.mm.plugin.report.service.h.pYm;
                                  if (!bool2)
                                    break label3445;
                                  k = 1;
                                  paramString2.e(11713, new Object[] { Integer.valueOf(i), Long.valueOf(l2), Integer.valueOf(i1), Integer.valueOf(k), Long.valueOf(l1), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(paramInt), Long.valueOf(l3), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i3), Integer.valueOf(i6) });
                                  ab.i("MicroMsg.ImgInfoStorage", "genBigImg ret:%d useOpt:%b scene:%d [%d,%d,%d,%d,%b]->[%d,%d,%d,%d,%b] [%s]->[%s]", new Object[] { Integer.valueOf(i), Boolean.valueOf(paramBoolean), Integer.valueOf(i1), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i3), Long.valueOf(l1), Boolean.valueOf(bool2), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i6), Long.valueOf(l3), Boolean.valueOf(bool3), paramString1, paramString3 });
                                  if ((paramInt == 0) && (l3 >= 40960L) && (bool3) && (!MMNativeJpeg.isProgressive(paramString3)))
                                  {
                                    paramString2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("EnableCDNUploadImg");
                                    if ((!bo.isNullOrNil(paramString2)) && (paramString2.equals("1")))
                                    {
                                      long l4 = bo.anU();
                                      if (!paramBoolean)
                                        break label3474;
                                      k = 19;
                                      paramString2 = paramString3 + ".prog";
                                      com.tencent.mm.vfs.e.y(paramString3, paramString2);
                                      if ((!bo.isNullOrNil(paramString2)) && (!bo.isNullOrNil(paramString3)) && (new File(paramString2).exists()))
                                        break label3451;
                                      bool1 = false;
                                      com.tencent.mm.vfs.e.deleteFile(paramString2);
                                      if (bool1)
                                        break label3514;
                                      bool1 = MMNativeJpeg.convertToProgressive(paramString3, j);
                                      k = 29;
                                      l2 = bo.anU();
                                      long l5 = com.tencent.mm.vfs.e.asZ(paramString3);
                                      paramString2 = com.tencent.mm.plugin.report.service.h.pYm;
                                      if (!bool1)
                                        break label3490;
                                      j = 1;
                                      if (!bool2)
                                        break label3496;
                                      i1 = 1;
                                      paramString2.e(11713, new Object[] { Integer.valueOf(j), Long.valueOf(l2 - l4), Integer.valueOf(k), Integer.valueOf(i1), Long.valueOf(l1), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(paramInt), Long.valueOf(l3), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i3), Integer.valueOf(i6), Long.valueOf(l5) });
                                      ab.i("MicroMsg.ImgInfoStorage", "genBigImg PROGRESS ret:%d progret:%b size:%d useOpt:%b scene:%d [%d,%d,%d,%d,%b]->[%d,%d,%d,%d,%b] [%s]->[%s]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool1), Long.valueOf(l5), Boolean.valueOf(paramBoolean), Integer.valueOf(k), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i3), Long.valueOf(l1), Boolean.valueOf(bool2), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i6), Long.valueOf(l3), Boolean.valueOf(bool3), paramString1, paramString3 });
                                      if (!bool1)
                                      {
                                        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 186L, 1L, false);
                                        ab.e("MicroMsg.ImgInfoStorage", "genBigImg convert to progressive failed %s", new Object[] { paramString3 });
                                      }
                                    }
                                  }
                                  paramString1 = null;
                                  AppMethodBeat.o(78263);
                                  break;
                                  if (com.tencent.mm.sdk.platformtools.d.a(false, paramString1, i4, i5, Bitmap.CompressFormat.JPEG, 100, paramString3, paramb) == 1)
                                    break label2039;
                                  com.tencent.mm.plugin.report.service.h.pYm.a(111L, 187L, 1L, false);
                                  ab.e("MicroMsg.ImgInfoStorage", "createThumbNail big pic fail (for cvrt to jpg): %s", new Object[] { paramString1 });
                                  paramString1 = null;
                                  AppMethodBeat.o(78263);
                                }
                              }
                              catch (Exception paramString2)
                              {
                                n = 0;
                                continue;
                                paramPString3.value = paramPString1.value;
                                paramPString4.value = paramPString2.value;
                                ab.d("MicroMsg.ImgInfoStorage", "summersafecdn not need to compress mid pic needCompressByQuality[%b], [%d, %d; %d, %d] use big pMidImgName[%s], pMidImgPath[%s]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(k), Integer.valueOf(m), paramPString3.value, paramPString4.value });
                                i = 1;
                                paramBoolean = false;
                                i1 = i6;
                                continue;
                              }
                              label3412: ab.d("MicroMsg.ImgInfoStorage", "summersafecdn not use CDNNEWPROTO");
                              label3420: i = 1;
                              paramBoolean = false;
                              i1 = i6;
                              continue;
                              label3433: m = -1;
                              continue;
                              label3439: n = -1;
                              continue;
                              label3445: k = 2;
                              continue;
                              label3451: if (MMJpegOptim.convertToProgressive(paramString2, paramString3, j) == 0)
                              {
                                bool1 = true;
                              }
                              else
                              {
                                bool1 = false;
                                continue;
                                k = 9;
                                bool1 = MMNativeJpeg.convertToProgressive(paramString3, j);
                                continue;
                                j = -1;
                                continue;
                                i1 = 2;
                              }
                            }
                          }
                          catch (Exception paramString2)
                          {
                            label3474: break label2099;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          catch (Exception paramString2)
          {
            int n;
            int m = i;
            continue;
            label3514: continue;
            label3517: continue;
            label3520: continue;
            label3523: i = n;
            continue;
            label3530: boolean bool1 = paramBoolean;
            continue;
            label3537: paramBoolean = bool1;
            continue;
            label3544: int k = i;
            continue;
            label3551: continue;
            continue;
            bool1 = false;
            continue;
            i = 1080;
            continue;
          }
          label3571: int j = i;
        }
      }
    }
  }

  public final String a(byte[] paramArrayOfByte, Bitmap.CompressFormat paramCompressFormat)
  {
    AppMethodBeat.i(78218);
    if (bo.cb(paramArrayOfByte))
    {
      ab.e("MicroMsg.ImgInfoStorage", "save dir thumb error, thumbBuf is null");
      paramArrayOfByte = null;
      AppMethodBeat.o(78218);
    }
    while (true)
    {
      return paramArrayOfByte;
      String str1 = agW();
      String str2 = q(str1, "th_", "");
      ab.d("MicroMsg.ImgInfoStorage", "saveDirThumb, fullPath = %s", new Object[] { str2 });
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length), 100, paramCompressFormat, str2, true);
        paramArrayOfByte = "THUMBNAIL_DIRPATH://th_".concat(String.valueOf(str1));
        AppMethodBeat.o(78218);
      }
      catch (IOException localIOException)
      {
        ab.e("MicroMsg.ImgInfoStorage", "save bitmap to image error, %s", new Object[] { localIOException });
        paramArrayOfByte = a(paramArrayOfByte, true, paramCompressFormat);
        AppMethodBeat.o(78218);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ImgInfoStorage", "save bitmap to image error, %s", new Object[] { localException });
        paramArrayOfByte = a(paramArrayOfByte, true, paramCompressFormat);
        AppMethodBeat.o(78218);
      }
    }
  }

  // ERROR //
  public final String a(byte[] paramArrayOfByte, Bitmap.CompressFormat paramCompressFormat, int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 1396
    //   3: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 938	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   10: ifeq +21 -> 31
    //   13: ldc 238
    //   15: ldc_w 940
    //   18: invokestatic 623	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aconst_null
    //   22: astore_1
    //   23: ldc_w 1396
    //   26: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: aload_1
    //   30: areturn
    //   31: invokestatic 378	java/lang/System:currentTimeMillis	()J
    //   34: lstore 7
    //   36: invokestatic 580	com/tencent/mm/at/g:agW	()Ljava/lang/String;
    //   39: astore 9
    //   41: aload_0
    //   42: aload 9
    //   44: ldc_w 587
    //   47: ldc_w 425
    //   50: invokevirtual 594	com/tencent/mm/at/g:q	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   53: astore 10
    //   55: new 417	java/lang/StringBuilder
    //   58: dup
    //   59: invokespecial 418	java/lang/StringBuilder:<init>	()V
    //   62: aload 10
    //   64: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: ldc_w 1398
    //   70: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 423	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: astore 11
    //   78: ldc 238
    //   80: ldc_w 963
    //   83: aload 10
    //   85: invokestatic 184	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   88: invokevirtual 585	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   91: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: aload_1
    //   95: arraylength
    //   96: istore 12
    //   98: new 942	android/graphics/BitmapFactory$Options
    //   101: dup
    //   102: invokespecial 943	android/graphics/BitmapFactory$Options:<init>	()V
    //   105: astore 13
    //   107: aload 13
    //   109: iconst_1
    //   110: putfield 947	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   113: aload_1
    //   114: iconst_0
    //   115: aload_1
    //   116: arraylength
    //   117: aload 13
    //   119: invokestatic 1399	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   122: pop
    //   123: aconst_null
    //   124: astore 14
    //   126: aload 11
    //   128: iconst_0
    //   129: invokestatic 1403	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   132: astore 15
    //   134: aload 15
    //   136: astore 14
    //   138: aload 14
    //   140: astore 15
    //   142: aload 14
    //   144: aload_1
    //   145: invokevirtual 1408	java/io/OutputStream:write	([B)V
    //   148: aload 14
    //   150: astore 15
    //   152: aload 14
    //   154: invokevirtual 1411	java/io/OutputStream:flush	()V
    //   157: aload 14
    //   159: astore 15
    //   161: aload_1
    //   162: iload_3
    //   163: iload 4
    //   165: invokestatic 1412	com/tencent/mm/sdk/platformtools/d:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   168: astore 16
    //   170: aload 14
    //   172: astore 15
    //   174: aload_1
    //   175: arraylength
    //   176: istore 17
    //   178: aload 16
    //   180: ifnull +319 -> 499
    //   183: bipush 100
    //   185: istore 18
    //   187: aload 14
    //   189: astore 15
    //   191: aload_1
    //   192: arraylength
    //   193: istore_3
    //   194: iload_3
    //   195: ldc_w 1413
    //   198: if_icmple +527 -> 725
    //   201: new 1415	java/io/ByteArrayOutputStream
    //   204: astore 19
    //   206: aload 19
    //   208: invokespecial 1416	java/io/ByteArrayOutputStream:<init>	()V
    //   211: aload 19
    //   213: astore 15
    //   215: aload 16
    //   217: aload_2
    //   218: bipush 100
    //   220: aload 19
    //   222: invokevirtual 1420	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   225: pop
    //   226: aload 19
    //   228: astore 15
    //   230: aload 19
    //   232: invokevirtual 1423	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   235: arraylength
    //   236: istore 4
    //   238: bipush 100
    //   240: istore_3
    //   241: aload 19
    //   243: astore 15
    //   245: iload_3
    //   246: istore 18
    //   248: aload 19
    //   250: invokevirtual 1423	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   253: arraylength
    //   254: ldc_w 1413
    //   257: if_icmple +63 -> 320
    //   260: iload_3
    //   261: bipush 15
    //   263: if_icmplt +57 -> 320
    //   266: aload 19
    //   268: astore 15
    //   270: iload_3
    //   271: istore 18
    //   273: aload 19
    //   275: invokevirtual 1426	java/io/ByteArrayOutputStream:reset	()V
    //   278: iinc 3 251
    //   281: aload 19
    //   283: astore 15
    //   285: iload_3
    //   286: istore 18
    //   288: aload 16
    //   290: aload_2
    //   291: iload_3
    //   292: aload 19
    //   294: invokevirtual 1420	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   297: pop
    //   298: aload 19
    //   300: astore 15
    //   302: iload_3
    //   303: istore 18
    //   305: aload 19
    //   307: invokevirtual 1423	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   310: arraylength
    //   311: istore 17
    //   313: iload 17
    //   315: istore 4
    //   317: goto -76 -> 241
    //   320: aload 14
    //   322: astore 15
    //   324: aload 19
    //   326: invokevirtual 1427	java/io/ByteArrayOutputStream:close	()V
    //   329: aload 14
    //   331: astore 15
    //   333: aload 16
    //   335: iload_3
    //   336: aload_2
    //   337: aload 10
    //   339: iconst_1
    //   340: invokestatic 347	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   343: aload 14
    //   345: astore 15
    //   347: ldc 238
    //   349: ldc_w 1429
    //   352: iconst_3
    //   353: anewarray 94	java/lang/Object
    //   356: dup
    //   357: iconst_0
    //   358: aload 11
    //   360: aastore
    //   361: dup
    //   362: iconst_1
    //   363: aload 10
    //   365: aastore
    //   366: dup
    //   367: iconst_2
    //   368: iload_3
    //   369: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   372: aastore
    //   373: invokestatic 259	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   376: aload 14
    //   378: astore 15
    //   380: getstatic 605	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   383: sipush 16498
    //   386: bipush 10
    //   388: anewarray 94	java/lang/Object
    //   391: dup
    //   392: iconst_0
    //   393: aload 5
    //   395: invokestatic 1432	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   398: ldc_w 1434
    //   401: invokestatic 1440	com/tencent/mm/compatible/util/q:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   404: aastore
    //   405: dup
    //   406: iconst_1
    //   407: iload 6
    //   409: invokestatic 250	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   412: aastore
    //   413: dup
    //   414: iconst_2
    //   415: iload 12
    //   417: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   420: aastore
    //   421: dup
    //   422: iconst_3
    //   423: aload 13
    //   425: getfield 959	android/graphics/BitmapFactory$Options:outHeight	I
    //   428: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   431: aastore
    //   432: dup
    //   433: iconst_4
    //   434: aload 13
    //   436: getfield 956	android/graphics/BitmapFactory$Options:outWidth	I
    //   439: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   442: aastore
    //   443: dup
    //   444: iconst_5
    //   445: iload 4
    //   447: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   450: aastore
    //   451: dup
    //   452: bipush 6
    //   454: aload 16
    //   456: invokevirtual 308	android/graphics/Bitmap:getHeight	()I
    //   459: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   462: aastore
    //   463: dup
    //   464: bipush 7
    //   466: aload 16
    //   468: invokevirtual 300	android/graphics/Bitmap:getWidth	()I
    //   471: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   474: aastore
    //   475: dup
    //   476: bipush 8
    //   478: iconst_0
    //   479: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   482: aastore
    //   483: dup
    //   484: bipush 9
    //   486: invokestatic 378	java/lang/System:currentTimeMillis	()J
    //   489: lload 7
    //   491: lsub
    //   492: invokestatic 610	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   495: aastore
    //   496: invokevirtual 617	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   499: aload 11
    //   501: invokestatic 232	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   504: ifeq +17 -> 521
    //   507: ldc 238
    //   509: ldc_w 1442
    //   512: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   515: aload 11
    //   517: invokestatic 966	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   520: pop
    //   521: aload 14
    //   523: ifnull +8 -> 531
    //   526: aload 14
    //   528: invokevirtual 1443	java/io/OutputStream:close	()V
    //   531: ldc_w 582
    //   534: aload 9
    //   536: invokestatic 184	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   539: invokevirtual 585	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   542: astore_1
    //   543: ldc_w 1396
    //   546: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   549: goto -520 -> 29
    //   552: astore 15
    //   554: goto -225 -> 329
    //   557: astore 15
    //   559: aconst_null
    //   560: astore 19
    //   562: aload 19
    //   564: astore 15
    //   566: ldc 238
    //   568: ldc_w 1445
    //   571: invokestatic 623	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   574: iload 18
    //   576: istore_3
    //   577: iload 17
    //   579: istore 4
    //   581: aload 19
    //   583: ifnull -254 -> 329
    //   586: aload 14
    //   588: astore 15
    //   590: aload 19
    //   592: invokevirtual 1427	java/io/ByteArrayOutputStream:close	()V
    //   595: iload 18
    //   597: istore_3
    //   598: iload 17
    //   600: istore 4
    //   602: goto -273 -> 329
    //   605: astore 15
    //   607: iload 18
    //   609: istore_3
    //   610: iload 17
    //   612: istore 4
    //   614: goto -285 -> 329
    //   617: astore 5
    //   619: aconst_null
    //   620: astore 19
    //   622: aload 19
    //   624: ifnull +12 -> 636
    //   627: aload 14
    //   629: astore 15
    //   631: aload 19
    //   633: invokevirtual 1427	java/io/ByteArrayOutputStream:close	()V
    //   636: aload 14
    //   638: astore 15
    //   640: ldc_w 1396
    //   643: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   646: aload 14
    //   648: astore 15
    //   650: aload 5
    //   652: athrow
    //   653: astore 15
    //   655: aload 14
    //   657: astore 5
    //   659: ldc 238
    //   661: ldc_w 1391
    //   664: iconst_1
    //   665: anewarray 94	java/lang/Object
    //   668: dup
    //   669: iconst_0
    //   670: aload 15
    //   672: aastore
    //   673: invokestatic 446	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   676: aload_0
    //   677: aload_1
    //   678: iconst_1
    //   679: aload_2
    //   680: invokevirtual 1394	com/tencent/mm/at/g:a	([BZLandroid/graphics/Bitmap$CompressFormat;)Ljava/lang/String;
    //   683: astore_1
    //   684: aload 11
    //   686: invokestatic 232	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   689: ifeq +17 -> 706
    //   692: ldc 238
    //   694: ldc_w 1442
    //   697: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   700: aload 11
    //   702: invokestatic 966	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   705: pop
    //   706: aload 5
    //   708: ifnull +8 -> 716
    //   711: aload 5
    //   713: invokevirtual 1443	java/io/OutputStream:close	()V
    //   716: ldc_w 1396
    //   719: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   722: goto -693 -> 29
    //   725: aload 14
    //   727: astore 15
    //   729: aload 11
    //   731: aload 10
    //   733: invokestatic 1448	com/tencent/mm/vfs/e:aQ	(Ljava/lang/String;Ljava/lang/String;)Z
    //   736: pop
    //   737: iload 18
    //   739: istore_3
    //   740: iload 17
    //   742: istore 4
    //   744: goto -401 -> 343
    //   747: astore 5
    //   749: aload 14
    //   751: astore 15
    //   753: ldc 238
    //   755: ldc_w 1391
    //   758: iconst_1
    //   759: anewarray 94	java/lang/Object
    //   762: dup
    //   763: iconst_0
    //   764: aload 5
    //   766: aastore
    //   767: invokestatic 446	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   770: aload 14
    //   772: astore 15
    //   774: aload_0
    //   775: aload_1
    //   776: iconst_1
    //   777: aload_2
    //   778: invokevirtual 1394	com/tencent/mm/at/g:a	([BZLandroid/graphics/Bitmap$CompressFormat;)Ljava/lang/String;
    //   781: astore_1
    //   782: aload 11
    //   784: invokestatic 232	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   787: ifeq +17 -> 804
    //   790: ldc 238
    //   792: ldc_w 1442
    //   795: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   798: aload 11
    //   800: invokestatic 966	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   803: pop
    //   804: aload 14
    //   806: ifnull +8 -> 814
    //   809: aload 14
    //   811: invokevirtual 1443	java/io/OutputStream:close	()V
    //   814: ldc_w 1396
    //   817: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   820: goto -791 -> 29
    //   823: astore_1
    //   824: aconst_null
    //   825: astore 15
    //   827: aload 11
    //   829: invokestatic 232	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   832: ifeq +17 -> 849
    //   835: ldc 238
    //   837: ldc_w 1442
    //   840: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   843: aload 11
    //   845: invokestatic 966	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   848: pop
    //   849: aload 15
    //   851: ifnull +8 -> 859
    //   854: aload 15
    //   856: invokevirtual 1443	java/io/OutputStream:close	()V
    //   859: ldc_w 1396
    //   862: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   865: aload_1
    //   866: athrow
    //   867: astore 15
    //   869: goto -233 -> 636
    //   872: astore_1
    //   873: goto -342 -> 531
    //   876: astore_2
    //   877: goto -161 -> 716
    //   880: astore_2
    //   881: goto -67 -> 814
    //   884: astore_2
    //   885: goto -26 -> 859
    //   888: astore_1
    //   889: goto -62 -> 827
    //   892: astore_1
    //   893: aload 5
    //   895: astore 15
    //   897: goto -70 -> 827
    //   900: astore 5
    //   902: aconst_null
    //   903: astore 14
    //   905: goto -156 -> 749
    //   908: astore 15
    //   910: aload 14
    //   912: astore 5
    //   914: goto -255 -> 659
    //   917: astore 5
    //   919: aload 15
    //   921: astore 19
    //   923: goto -301 -> 622
    //   926: astore 15
    //   928: goto -366 -> 562
    //   931: astore 15
    //   933: iload 4
    //   935: istore 17
    //   937: goto -375 -> 562
    //
    // Exception table:
    //   from	to	target	type
    //   324	329	552	java/lang/Exception
    //   201	211	557	java/lang/Exception
    //   590	595	605	java/lang/Exception
    //   201	211	617	finally
    //   142	148	653	java/io/IOException
    //   152	157	653	java/io/IOException
    //   161	170	653	java/io/IOException
    //   174	178	653	java/io/IOException
    //   191	194	653	java/io/IOException
    //   324	329	653	java/io/IOException
    //   333	343	653	java/io/IOException
    //   347	376	653	java/io/IOException
    //   380	499	653	java/io/IOException
    //   590	595	653	java/io/IOException
    //   631	636	653	java/io/IOException
    //   640	646	653	java/io/IOException
    //   650	653	653	java/io/IOException
    //   729	737	653	java/io/IOException
    //   142	148	747	java/lang/Exception
    //   152	157	747	java/lang/Exception
    //   161	170	747	java/lang/Exception
    //   174	178	747	java/lang/Exception
    //   191	194	747	java/lang/Exception
    //   333	343	747	java/lang/Exception
    //   347	376	747	java/lang/Exception
    //   380	499	747	java/lang/Exception
    //   640	646	747	java/lang/Exception
    //   650	653	747	java/lang/Exception
    //   729	737	747	java/lang/Exception
    //   126	134	823	finally
    //   631	636	867	java/lang/Exception
    //   526	531	872	java/lang/Exception
    //   711	716	876	java/lang/Exception
    //   809	814	880	java/lang/Exception
    //   854	859	884	java/lang/Exception
    //   142	148	888	finally
    //   152	157	888	finally
    //   161	170	888	finally
    //   174	178	888	finally
    //   191	194	888	finally
    //   324	329	888	finally
    //   333	343	888	finally
    //   347	376	888	finally
    //   380	499	888	finally
    //   590	595	888	finally
    //   631	636	888	finally
    //   640	646	888	finally
    //   650	653	888	finally
    //   729	737	888	finally
    //   753	770	888	finally
    //   774	782	888	finally
    //   659	684	892	finally
    //   126	134	900	java/lang/Exception
    //   126	134	908	java/io/IOException
    //   215	226	917	finally
    //   230	238	917	finally
    //   248	260	917	finally
    //   273	278	917	finally
    //   288	298	917	finally
    //   305	313	917	finally
    //   566	574	917	finally
    //   215	226	926	java/lang/Exception
    //   230	238	926	java/lang/Exception
    //   248	260	931	java/lang/Exception
    //   273	278	931	java/lang/Exception
    //   288	298	931	java/lang/Exception
    //   305	313	931	java/lang/Exception
  }

  // ERROR //
  public final String a(byte[] paramArrayOfByte, Bitmap.CompressFormat paramCompressFormat, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 1450
    //   3: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 938	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   10: ifeq +21 -> 31
    //   13: ldc 238
    //   15: ldc_w 940
    //   18: invokestatic 623	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aconst_null
    //   22: astore_1
    //   23: ldc_w 1450
    //   26: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: aload_1
    //   30: areturn
    //   31: invokestatic 378	java/lang/System:currentTimeMillis	()J
    //   34: lstore 5
    //   36: invokestatic 580	com/tencent/mm/at/g:agW	()Ljava/lang/String;
    //   39: astore 7
    //   41: aload_0
    //   42: aload 7
    //   44: ldc_w 587
    //   47: ldc_w 425
    //   50: invokevirtual 594	com/tencent/mm/at/g:q	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   53: astore 8
    //   55: new 417	java/lang/StringBuilder
    //   58: dup
    //   59: invokespecial 418	java/lang/StringBuilder:<init>	()V
    //   62: aload 8
    //   64: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: ldc_w 1398
    //   70: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 423	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: astore 9
    //   78: ldc 238
    //   80: ldc_w 963
    //   83: aload 8
    //   85: invokestatic 184	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   88: invokevirtual 585	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   91: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: aload_1
    //   95: arraylength
    //   96: istore 10
    //   98: new 942	android/graphics/BitmapFactory$Options
    //   101: dup
    //   102: invokespecial 943	android/graphics/BitmapFactory$Options:<init>	()V
    //   105: astore 11
    //   107: aload 11
    //   109: iconst_1
    //   110: putfield 947	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   113: aload_1
    //   114: iconst_0
    //   115: aload_1
    //   116: arraylength
    //   117: aload 11
    //   119: invokestatic 1399	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   122: pop
    //   123: aload 11
    //   125: getfield 956	android/graphics/BitmapFactory$Options:outWidth	I
    //   128: istore 12
    //   130: aload 11
    //   132: getfield 959	android/graphics/BitmapFactory$Options:outHeight	I
    //   135: istore 13
    //   137: sipush 720
    //   140: iload 12
    //   142: if_icmpgt +13 -> 155
    //   145: ldc_w 1451
    //   148: iload 13
    //   150: i2f
    //   151: fcmpl
    //   152: ifle +281 -> 433
    //   155: iload 12
    //   157: istore 14
    //   159: aconst_null
    //   160: astore 15
    //   162: aload 9
    //   164: iconst_0
    //   165: invokestatic 1403	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   168: astore 16
    //   170: aload 16
    //   172: astore 15
    //   174: aload 15
    //   176: astore 16
    //   178: aload 15
    //   180: aload_1
    //   181: invokevirtual 1408	java/io/OutputStream:write	([B)V
    //   184: aload 15
    //   186: astore 16
    //   188: aload 15
    //   190: invokevirtual 1411	java/io/OutputStream:flush	()V
    //   193: aload 15
    //   195: astore 16
    //   197: aload_1
    //   198: iload 14
    //   200: iload 13
    //   202: invokestatic 1412	com/tencent/mm/sdk/platformtools/d:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   205: astore 17
    //   207: aload 15
    //   209: astore 16
    //   211: iload 14
    //   213: aload 17
    //   215: invokevirtual 300	android/graphics/Bitmap:getWidth	()I
    //   218: if_icmpeq +234 -> 452
    //   221: aload 15
    //   223: astore 16
    //   225: aload 17
    //   227: iload 14
    //   229: iload 13
    //   231: iconst_1
    //   232: invokestatic 403	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   235: astore 17
    //   237: aload 15
    //   239: astore 16
    //   241: aload 17
    //   243: invokevirtual 308	android/graphics/Bitmap:getHeight	()I
    //   246: i2f
    //   247: aload 17
    //   249: invokevirtual 300	android/graphics/Bitmap:getWidth	()I
    //   252: i2f
    //   253: ldc_w 1452
    //   256: fmul
    //   257: fcmpl
    //   258: ifle +197 -> 455
    //   261: aload 15
    //   263: astore 16
    //   265: aload 17
    //   267: iconst_0
    //   268: iconst_0
    //   269: aload 17
    //   271: invokevirtual 300	android/graphics/Bitmap:getWidth	()I
    //   274: aload 17
    //   276: invokevirtual 300	android/graphics/Bitmap:getWidth	()I
    //   279: i2f
    //   280: ldc_w 1452
    //   283: fmul
    //   284: f2i
    //   285: invokestatic 1456	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   288: astore 18
    //   290: aload 15
    //   292: astore 16
    //   294: aload_1
    //   295: arraylength
    //   296: istore 12
    //   298: aload 18
    //   300: ifnull +397 -> 697
    //   303: bipush 70
    //   305: istore 13
    //   307: new 1415	java/io/ByteArrayOutputStream
    //   310: astore 17
    //   312: aload 17
    //   314: invokespecial 1416	java/io/ByteArrayOutputStream:<init>	()V
    //   317: aload 17
    //   319: astore 16
    //   321: aload 18
    //   323: aload_2
    //   324: bipush 70
    //   326: aload 17
    //   328: invokevirtual 1420	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   331: pop
    //   332: aload 17
    //   334: astore 16
    //   336: aload 17
    //   338: invokevirtual 1423	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   341: arraylength
    //   342: istore 14
    //   344: bipush 70
    //   346: istore 13
    //   348: aload 17
    //   350: astore 16
    //   352: iload 13
    //   354: istore 12
    //   356: aload 17
    //   358: invokevirtual 1423	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   361: arraylength
    //   362: ldc_w 1413
    //   365: if_icmple +122 -> 487
    //   368: iload 13
    //   370: bipush 15
    //   372: if_icmplt +115 -> 487
    //   375: aload 17
    //   377: astore 16
    //   379: iload 13
    //   381: istore 12
    //   383: aload 17
    //   385: invokevirtual 1426	java/io/ByteArrayOutputStream:reset	()V
    //   388: iinc 13 251
    //   391: aload 17
    //   393: astore 16
    //   395: iload 13
    //   397: istore 12
    //   399: aload 18
    //   401: aload_2
    //   402: iload 13
    //   404: aload 17
    //   406: invokevirtual 1420	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   409: pop
    //   410: aload 17
    //   412: astore 16
    //   414: iload 13
    //   416: istore 12
    //   418: aload 17
    //   420: invokevirtual 1423	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   423: arraylength
    //   424: istore 19
    //   426: iload 19
    //   428: istore 14
    //   430: goto -82 -> 348
    //   433: sipush 720
    //   436: istore 14
    //   438: iload 13
    //   440: sipush 720
    //   443: imul
    //   444: iload 12
    //   446: idiv
    //   447: istore 13
    //   449: goto -290 -> 159
    //   452: goto -215 -> 237
    //   455: aload 15
    //   457: astore 16
    //   459: aload 17
    //   461: iconst_0
    //   462: iconst_0
    //   463: aload 17
    //   465: invokevirtual 308	android/graphics/Bitmap:getHeight	()I
    //   468: i2f
    //   469: ldc_w 1452
    //   472: fdiv
    //   473: f2i
    //   474: aload 17
    //   476: invokevirtual 308	android/graphics/Bitmap:getHeight	()I
    //   479: invokestatic 1456	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   482: astore 18
    //   484: goto -194 -> 290
    //   487: aload 15
    //   489: astore 16
    //   491: aload 17
    //   493: invokevirtual 1427	java/io/ByteArrayOutputStream:close	()V
    //   496: iload 14
    //   498: istore 19
    //   500: iload 13
    //   502: istore 12
    //   504: aload 15
    //   506: astore 16
    //   508: aload 18
    //   510: iload 12
    //   512: aload_2
    //   513: aload 8
    //   515: iconst_1
    //   516: invokestatic 347	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   519: aload 15
    //   521: astore 16
    //   523: ldc 238
    //   525: ldc_w 1429
    //   528: iconst_3
    //   529: anewarray 94	java/lang/Object
    //   532: dup
    //   533: iconst_0
    //   534: aload 9
    //   536: aastore
    //   537: dup
    //   538: iconst_1
    //   539: aload 8
    //   541: aastore
    //   542: dup
    //   543: iconst_2
    //   544: iload 12
    //   546: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   549: aastore
    //   550: invokestatic 259	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   553: aload 15
    //   555: astore 16
    //   557: getstatic 605	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   560: astore 17
    //   562: aload 15
    //   564: astore 16
    //   566: aload_3
    //   567: invokestatic 1432	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   570: ldc_w 1434
    //   573: invokestatic 1440	com/tencent/mm/compatible/util/q:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   576: astore_3
    //   577: iload 4
    //   579: ifeq +354 -> 933
    //   582: iconst_1
    //   583: istore 13
    //   585: aload 15
    //   587: astore 16
    //   589: aload 17
    //   591: sipush 16498
    //   594: bipush 10
    //   596: anewarray 94	java/lang/Object
    //   599: dup
    //   600: iconst_0
    //   601: aload_3
    //   602: aastore
    //   603: dup
    //   604: iconst_1
    //   605: iload 13
    //   607: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   610: aastore
    //   611: dup
    //   612: iconst_2
    //   613: iload 10
    //   615: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   618: aastore
    //   619: dup
    //   620: iconst_3
    //   621: aload 11
    //   623: getfield 959	android/graphics/BitmapFactory$Options:outHeight	I
    //   626: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   629: aastore
    //   630: dup
    //   631: iconst_4
    //   632: aload 11
    //   634: getfield 956	android/graphics/BitmapFactory$Options:outWidth	I
    //   637: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   640: aastore
    //   641: dup
    //   642: iconst_5
    //   643: iload 19
    //   645: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   648: aastore
    //   649: dup
    //   650: bipush 6
    //   652: aload 18
    //   654: invokevirtual 308	android/graphics/Bitmap:getHeight	()I
    //   657: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   660: aastore
    //   661: dup
    //   662: bipush 7
    //   664: aload 18
    //   666: invokevirtual 300	android/graphics/Bitmap:getWidth	()I
    //   669: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   672: aastore
    //   673: dup
    //   674: bipush 8
    //   676: iconst_1
    //   677: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   680: aastore
    //   681: dup
    //   682: bipush 9
    //   684: invokestatic 378	java/lang/System:currentTimeMillis	()J
    //   687: lload 5
    //   689: lsub
    //   690: invokestatic 610	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   693: aastore
    //   694: invokevirtual 617	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   697: aload 9
    //   699: invokestatic 232	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   702: ifeq +17 -> 719
    //   705: ldc 238
    //   707: ldc_w 1442
    //   710: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   713: aload 9
    //   715: invokestatic 966	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   718: pop
    //   719: aload 15
    //   721: ifnull +8 -> 729
    //   724: aload 15
    //   726: invokevirtual 1443	java/io/OutputStream:close	()V
    //   729: ldc_w 582
    //   732: aload 7
    //   734: invokestatic 184	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   737: invokevirtual 585	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   740: astore_1
    //   741: ldc_w 1450
    //   744: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   747: goto -718 -> 29
    //   750: astore 16
    //   752: iload 13
    //   754: istore 12
    //   756: iload 14
    //   758: istore 19
    //   760: goto -256 -> 504
    //   763: astore 16
    //   765: aconst_null
    //   766: astore 17
    //   768: iload 12
    //   770: istore 14
    //   772: aload 17
    //   774: astore 16
    //   776: ldc 238
    //   778: ldc_w 1445
    //   781: invokestatic 623	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   784: iload 13
    //   786: istore 12
    //   788: iload 14
    //   790: istore 19
    //   792: aload 17
    //   794: ifnull -290 -> 504
    //   797: aload 15
    //   799: astore 16
    //   801: aload 17
    //   803: invokevirtual 1427	java/io/ByteArrayOutputStream:close	()V
    //   806: iload 13
    //   808: istore 12
    //   810: iload 14
    //   812: istore 19
    //   814: goto -310 -> 504
    //   817: astore 16
    //   819: iload 13
    //   821: istore 12
    //   823: iload 14
    //   825: istore 19
    //   827: goto -323 -> 504
    //   830: astore_3
    //   831: aconst_null
    //   832: astore 17
    //   834: aload 17
    //   836: ifnull +12 -> 848
    //   839: aload 15
    //   841: astore 16
    //   843: aload 17
    //   845: invokevirtual 1427	java/io/ByteArrayOutputStream:close	()V
    //   848: aload 15
    //   850: astore 16
    //   852: ldc_w 1450
    //   855: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   858: aload 15
    //   860: astore 16
    //   862: aload_3
    //   863: athrow
    //   864: astore 16
    //   866: aload 15
    //   868: astore_3
    //   869: ldc 238
    //   871: ldc_w 1391
    //   874: iconst_1
    //   875: anewarray 94	java/lang/Object
    //   878: dup
    //   879: iconst_0
    //   880: aload 16
    //   882: aastore
    //   883: invokestatic 446	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   886: aload_0
    //   887: aload_1
    //   888: iconst_1
    //   889: aload_2
    //   890: invokevirtual 1394	com/tencent/mm/at/g:a	([BZLandroid/graphics/Bitmap$CompressFormat;)Ljava/lang/String;
    //   893: astore_1
    //   894: aload 9
    //   896: invokestatic 232	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   899: ifeq +17 -> 916
    //   902: ldc 238
    //   904: ldc_w 1442
    //   907: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   910: aload 9
    //   912: invokestatic 966	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   915: pop
    //   916: aload_3
    //   917: ifnull +7 -> 924
    //   920: aload_3
    //   921: invokevirtual 1443	java/io/OutputStream:close	()V
    //   924: ldc_w 1450
    //   927: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   930: goto -901 -> 29
    //   933: iconst_0
    //   934: istore 13
    //   936: goto -351 -> 585
    //   939: astore_3
    //   940: aconst_null
    //   941: astore 15
    //   943: aload 15
    //   945: astore 16
    //   947: ldc 238
    //   949: ldc_w 1391
    //   952: iconst_1
    //   953: anewarray 94	java/lang/Object
    //   956: dup
    //   957: iconst_0
    //   958: aload_3
    //   959: aastore
    //   960: invokestatic 446	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   963: aload 15
    //   965: astore 16
    //   967: aload_0
    //   968: aload_1
    //   969: iconst_1
    //   970: aload_2
    //   971: invokevirtual 1394	com/tencent/mm/at/g:a	([BZLandroid/graphics/Bitmap$CompressFormat;)Ljava/lang/String;
    //   974: astore_1
    //   975: aload 9
    //   977: invokestatic 232	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   980: ifeq +17 -> 997
    //   983: ldc 238
    //   985: ldc_w 1442
    //   988: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   991: aload 9
    //   993: invokestatic 966	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   996: pop
    //   997: aload 15
    //   999: ifnull +8 -> 1007
    //   1002: aload 15
    //   1004: invokevirtual 1443	java/io/OutputStream:close	()V
    //   1007: ldc_w 1450
    //   1010: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1013: goto -984 -> 29
    //   1016: astore_1
    //   1017: aconst_null
    //   1018: astore 16
    //   1020: aload 9
    //   1022: invokestatic 232	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   1025: ifeq +17 -> 1042
    //   1028: ldc 238
    //   1030: ldc_w 1442
    //   1033: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1036: aload 9
    //   1038: invokestatic 966	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   1041: pop
    //   1042: aload 16
    //   1044: ifnull +8 -> 1052
    //   1047: aload 16
    //   1049: invokevirtual 1443	java/io/OutputStream:close	()V
    //   1052: ldc_w 1450
    //   1055: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1058: aload_1
    //   1059: athrow
    //   1060: astore 16
    //   1062: goto -214 -> 848
    //   1065: astore_1
    //   1066: goto -337 -> 729
    //   1069: astore_2
    //   1070: goto -146 -> 924
    //   1073: astore_2
    //   1074: goto -67 -> 1007
    //   1077: astore_2
    //   1078: goto -26 -> 1052
    //   1081: astore_1
    //   1082: goto -62 -> 1020
    //   1085: astore_1
    //   1086: aload_3
    //   1087: astore 16
    //   1089: goto -69 -> 1020
    //   1092: astore_3
    //   1093: goto -150 -> 943
    //   1096: astore 16
    //   1098: aload 15
    //   1100: astore_3
    //   1101: goto -232 -> 869
    //   1104: astore_3
    //   1105: aload 16
    //   1107: astore 17
    //   1109: goto -275 -> 834
    //   1112: astore 16
    //   1114: iload 12
    //   1116: istore 14
    //   1118: goto -346 -> 772
    //   1121: astore 16
    //   1123: iload 12
    //   1125: istore 13
    //   1127: goto -355 -> 772
    //
    // Exception table:
    //   from	to	target	type
    //   491	496	750	java/lang/Exception
    //   307	317	763	java/lang/Exception
    //   801	806	817	java/lang/Exception
    //   307	317	830	finally
    //   178	184	864	java/io/IOException
    //   188	193	864	java/io/IOException
    //   197	207	864	java/io/IOException
    //   211	221	864	java/io/IOException
    //   225	237	864	java/io/IOException
    //   241	261	864	java/io/IOException
    //   265	290	864	java/io/IOException
    //   294	298	864	java/io/IOException
    //   459	484	864	java/io/IOException
    //   491	496	864	java/io/IOException
    //   508	519	864	java/io/IOException
    //   523	553	864	java/io/IOException
    //   557	562	864	java/io/IOException
    //   566	577	864	java/io/IOException
    //   589	697	864	java/io/IOException
    //   801	806	864	java/io/IOException
    //   843	848	864	java/io/IOException
    //   852	858	864	java/io/IOException
    //   862	864	864	java/io/IOException
    //   162	170	939	java/lang/Exception
    //   162	170	1016	finally
    //   843	848	1060	java/lang/Exception
    //   724	729	1065	java/lang/Exception
    //   920	924	1069	java/lang/Exception
    //   1002	1007	1073	java/lang/Exception
    //   1047	1052	1077	java/lang/Exception
    //   178	184	1081	finally
    //   188	193	1081	finally
    //   197	207	1081	finally
    //   211	221	1081	finally
    //   225	237	1081	finally
    //   241	261	1081	finally
    //   265	290	1081	finally
    //   294	298	1081	finally
    //   459	484	1081	finally
    //   491	496	1081	finally
    //   508	519	1081	finally
    //   523	553	1081	finally
    //   557	562	1081	finally
    //   566	577	1081	finally
    //   589	697	1081	finally
    //   801	806	1081	finally
    //   843	848	1081	finally
    //   852	858	1081	finally
    //   862	864	1081	finally
    //   947	963	1081	finally
    //   967	975	1081	finally
    //   869	894	1085	finally
    //   178	184	1092	java/lang/Exception
    //   188	193	1092	java/lang/Exception
    //   197	207	1092	java/lang/Exception
    //   211	221	1092	java/lang/Exception
    //   225	237	1092	java/lang/Exception
    //   241	261	1092	java/lang/Exception
    //   265	290	1092	java/lang/Exception
    //   294	298	1092	java/lang/Exception
    //   459	484	1092	java/lang/Exception
    //   508	519	1092	java/lang/Exception
    //   523	553	1092	java/lang/Exception
    //   557	562	1092	java/lang/Exception
    //   566	577	1092	java/lang/Exception
    //   589	697	1092	java/lang/Exception
    //   852	858	1092	java/lang/Exception
    //   862	864	1092	java/lang/Exception
    //   162	170	1096	java/io/IOException
    //   321	332	1104	finally
    //   336	344	1104	finally
    //   356	368	1104	finally
    //   383	388	1104	finally
    //   399	410	1104	finally
    //   418	426	1104	finally
    //   776	784	1104	finally
    //   321	332	1112	java/lang/Exception
    //   336	344	1112	java/lang/Exception
    //   356	368	1121	java/lang/Exception
    //   383	388	1121	java/lang/Exception
    //   399	410	1121	java/lang/Exception
    //   418	426	1121	java/lang/Exception
  }

  public final String a(byte[] paramArrayOfByte, boolean paramBoolean, Bitmap.CompressFormat paramCompressFormat)
  {
    AppMethodBeat.i(78217);
    paramArrayOfByte = a(paramArrayOfByte, paramBoolean, paramCompressFormat, false);
    AppMethodBeat.o(78217);
    return paramArrayOfByte;
  }

  // ERROR //
  public final String a(byte[] paramArrayOfByte, boolean paramBoolean1, Bitmap.CompressFormat paramCompressFormat, boolean paramBoolean2)
  {
    // Byte code:
    //   0: ldc_w 1461
    //   3: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 938	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   10: ifeq +21 -> 31
    //   13: ldc 238
    //   15: ldc_w 940
    //   18: invokestatic 623	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aconst_null
    //   22: astore_1
    //   23: ldc_w 1461
    //   26: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: aload_1
    //   30: areturn
    //   31: invokestatic 580	com/tencent/mm/at/g:agW	()Ljava/lang/String;
    //   34: astore 5
    //   36: aload_0
    //   37: aload 5
    //   39: ldc_w 587
    //   42: ldc_w 425
    //   45: invokevirtual 594	com/tencent/mm/at/g:q	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   48: astore 6
    //   50: new 417	java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial 418	java/lang/StringBuilder:<init>	()V
    //   57: aload 6
    //   59: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: ldc_w 1398
    //   65: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 423	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: astore 7
    //   73: ldc 238
    //   75: ldc_w 963
    //   78: aload 6
    //   80: invokestatic 184	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   83: invokevirtual 585	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   86: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   89: aload 7
    //   91: iconst_0
    //   92: invokestatic 1403	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   95: astore 8
    //   97: aload 8
    //   99: aload_1
    //   100: invokevirtual 1408	java/io/OutputStream:write	([B)V
    //   103: aload 8
    //   105: invokevirtual 1411	java/io/OutputStream:flush	()V
    //   108: iload_2
    //   109: ifeq +118 -> 227
    //   112: sipush 128
    //   115: istore 9
    //   117: iload_2
    //   118: ifeq +116 -> 234
    //   121: sipush 128
    //   124: istore 10
    //   126: iload 4
    //   128: ifeq +113 -> 241
    //   131: aload 7
    //   133: aconst_null
    //   134: invokestatic 1465	com/tencent/mm/sdk/platformtools/d:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   137: astore_1
    //   138: aload_1
    //   139: ifnull +35 -> 174
    //   142: aload_1
    //   143: bipush 90
    //   145: aload_3
    //   146: aload 6
    //   148: iconst_1
    //   149: invokestatic 347	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   152: ldc 238
    //   154: ldc_w 1467
    //   157: iconst_2
    //   158: anewarray 94	java/lang/Object
    //   161: dup
    //   162: iconst_0
    //   163: aload 7
    //   165: aastore
    //   166: dup
    //   167: iconst_1
    //   168: aload 6
    //   170: aastore
    //   171: invokestatic 259	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   174: aload 7
    //   176: invokestatic 232	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   179: ifeq +17 -> 196
    //   182: ldc 238
    //   184: ldc_w 1442
    //   187: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   190: aload 7
    //   192: invokestatic 966	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   195: pop
    //   196: aload 8
    //   198: ifnull +8 -> 206
    //   201: aload 8
    //   203: invokevirtual 1443	java/io/OutputStream:close	()V
    //   206: ldc_w 582
    //   209: aload 5
    //   211: invokestatic 184	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   214: invokevirtual 585	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   217: astore_1
    //   218: ldc_w 1461
    //   221: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   224: goto -195 -> 29
    //   227: bipush 120
    //   229: istore 9
    //   231: goto -114 -> 117
    //   234: bipush 120
    //   236: istore 10
    //   238: goto -112 -> 126
    //   241: aload 7
    //   243: iload 9
    //   245: iload 10
    //   247: iconst_0
    //   248: invokestatic 1470	com/tencent/mm/sdk/platformtools/d:d	(Ljava/lang/String;IIZ)Landroid/graphics/Bitmap;
    //   251: astore_1
    //   252: goto -114 -> 138
    //   255: astore_3
    //   256: aconst_null
    //   257: astore_1
    //   258: getstatic 605	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   261: ldc2_w 1115
    //   264: ldc2_w 1471
    //   267: lconst_1
    //   268: iconst_0
    //   269: invokevirtual 1121	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   272: new 417	java/lang/StringBuilder
    //   275: astore 8
    //   277: aload 8
    //   279: ldc_w 1474
    //   282: invokespecial 559	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   285: ldc 238
    //   287: aload 8
    //   289: aload 5
    //   291: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: ldc_w 1476
    //   297: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: aload_3
    //   301: invokevirtual 1128	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   304: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: invokevirtual 423	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: invokestatic 623	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   313: aload 7
    //   315: invokestatic 232	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   318: ifeq +17 -> 335
    //   321: ldc 238
    //   323: ldc_w 1442
    //   326: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   329: aload 7
    //   331: invokestatic 966	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   334: pop
    //   335: aload_1
    //   336: ifnull +7 -> 343
    //   339: aload_1
    //   340: invokevirtual 1443	java/io/OutputStream:close	()V
    //   343: aconst_null
    //   344: astore_1
    //   345: ldc_w 1461
    //   348: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   351: goto -322 -> 29
    //   354: astore_3
    //   355: aconst_null
    //   356: astore_1
    //   357: aload 7
    //   359: invokestatic 232	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   362: ifeq +17 -> 379
    //   365: ldc 238
    //   367: ldc_w 1442
    //   370: invokestatic 565	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   373: aload 7
    //   375: invokestatic 966	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   378: pop
    //   379: aload_1
    //   380: ifnull +7 -> 387
    //   383: aload_1
    //   384: invokevirtual 1443	java/io/OutputStream:close	()V
    //   387: ldc_w 1461
    //   390: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   393: aload_3
    //   394: athrow
    //   395: astore_1
    //   396: goto -190 -> 206
    //   399: astore_1
    //   400: goto -57 -> 343
    //   403: astore_1
    //   404: goto -17 -> 387
    //   407: astore_3
    //   408: aload 8
    //   410: astore_1
    //   411: goto -54 -> 357
    //   414: astore_3
    //   415: goto -58 -> 357
    //   418: astore_3
    //   419: aload 8
    //   421: astore_1
    //   422: goto -164 -> 258
    //
    // Exception table:
    //   from	to	target	type
    //   89	97	255	java/lang/Exception
    //   89	97	354	finally
    //   201	206	395	java/lang/Exception
    //   339	343	399	java/lang/Exception
    //   383	387	403	java/lang/Exception
    //   97	108	407	finally
    //   131	138	407	finally
    //   142	174	407	finally
    //   241	252	407	finally
    //   258	313	414	finally
    //   97	108	418	java/lang/Exception
    //   131	138	418	java/lang/Exception
    //   142	174	418	java/lang/Exception
    //   241	252	418	java/lang/Exception
  }

  public final HashMap<Long, e> a(Long[] paramArrayOfLong)
  {
    AppMethodBeat.i(78243);
    Object localObject1 = "(";
    int i = paramArrayOfLong.length;
    int j = 0;
    int k = 1;
    if (j < i)
    {
      long l = paramArrayOfLong[j].longValue();
      localObject2 = new StringBuilder().append((String)localObject1);
      if (k != 0);
      for (localObject1 = Long.valueOf(l); ; localObject1 = ",".concat(String.valueOf(l)))
      {
        localObject1 = localObject1;
        j++;
        k = 0;
        break;
      }
    }
    localObject1 = b("ImgInfo2", null, "msgSvrId in ".concat(String.valueOf((String)localObject1 + ")")), null);
    Object localObject2 = new HashMap();
    while (((Cursor)localObject1).moveToNext())
    {
      paramArrayOfLong = new e();
      paramArrayOfLong.d((Cursor)localObject1);
      ((HashMap)localObject2).put(Long.valueOf(paramArrayOfLong.cKK), paramArrayOfLong);
    }
    ((Cursor)localObject1).close();
    AppMethodBeat.o(78243);
    return localObject2;
  }

  public final boolean a(ImageView paramImageView1, String paramString, float paramFloat, int paramInt1, int paramInt2, ImageView paramImageView2, int paramInt3, int paramInt4, View paramView)
  {
    AppMethodBeat.i(78226);
    boolean bool = a(paramImageView1, paramString, false, paramFloat, paramInt1, paramInt2, paramImageView2, paramInt3, paramInt4, paramView);
    AppMethodBeat.o(78226);
    return bool;
  }

  public final boolean a(ImageView paramImageView1, String paramString, boolean paramBoolean, float paramFloat, int paramInt1, int paramInt2, ImageView paramImageView2, int paramInt3, int paramInt4, View paramView)
  {
    AppMethodBeat.i(78227);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.ImgInfoStorage", "invalid uri is %s", new Object[] { paramString });
      paramBoolean = false;
      AppMethodBeat.o(78227);
      return paramBoolean;
    }
    label610: label748: 
    while (true)
    {
      synchronized (this.fEo)
      {
        boolean bool = this.fEo.containsKey(paramString);
        String str = c(paramString, paramBoolean, false);
        if (bo.isNullOrNil(str))
        {
          ab.e("MicroMsg.ImgInfoStorage", "getFullThumbPathByCache uri is null, uri:%s", new Object[] { bo.nullAsNil(paramString) });
          paramBoolean = false;
          AppMethodBeat.o(78227);
          break;
        }
        localObject = str;
        if (!bool)
        {
          localObject = str;
          if (!str.endsWith("hd"))
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localObject = str;
            if (com.tencent.mm.vfs.e.ct(str + "hd"))
            {
              localObject = this.fEo;
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              ((Map)localObject).put(paramString, str + "hd");
              paramString = new java/lang/StringBuilder;
              paramString.<init>();
              localObject = str + "hd";
            }
          }
        }
        if (!((String)localObject).endsWith("hd"))
          break label1153;
        paramString = (Bitmap)this.fEh.ai(localObject);
        if (paramString == null)
        {
          a(paramImageView1, paramImageView2, paramView, (String)localObject, paramFloat);
          localObject = ((String)localObject).substring(0, ((String)localObject).length() - 2);
          i = 1;
          if (paramString != null)
            break label1150;
          paramString = (Bitmap)this.fEh.ai(localObject);
          if ((paramString == null) || (paramString.isRecycled()))
            break label677;
          ab.i("MicroMsg.ImgInfoStorage", "[setbitmapFromUri] bitmap width %d,height %d", new Object[] { Integer.valueOf(paramString.getWidth()), Integer.valueOf(paramString.getHeight()) });
          paramImageView1.setBackgroundDrawable(null);
          g.a.a(paramString, paramImageView1);
          if (paramImageView1.getLayoutParams().width == -2)
            break label610;
          localObject = this.fEq;
          if (paramInt4 != 0)
            break label622;
          ((FrameLayout.LayoutParams)localObject).gravity = 5;
          paramImageView1.setLayoutParams((ViewGroup.LayoutParams)localObject);
          if (paramString.getWidth() < paramString.getHeight() * 2.5D)
            break label637;
          paramInt1 = 1;
          if (paramString.getHeight() < paramString.getWidth() * 2.5D)
            break label643;
          paramInt2 = 1;
          if ((paramInt1 != 0) || (paramInt2 != 0))
            paramImageView1.setScaleType(ImageView.ScaleType.CENTER);
          if (paramImageView2 != null)
          {
            paramImageView1 = new FrameLayout.LayoutParams(paramString.getWidth(), paramString.getHeight());
            if (paramInt4 != 0)
              break label649;
            paramImageView1.gravity = 5;
            paramImageView2.setLayoutParams(paramImageView1);
          }
          if (paramView != null)
          {
            paramImageView1 = new FrameLayout.LayoutParams(paramString.getWidth(), paramString.getHeight());
            if (paramInt4 != 0)
              break label663;
            paramImageView1.gravity = 5;
            paramView.setLayoutParams(paramImageView1);
          }
          paramBoolean = true;
          AppMethodBeat.o(78227);
        }
      }
      if (this.fEh.remove(((String)localObject).substring(0, ((String)localObject).length() - 2)) != null)
        ab.d("MicroMsg.ImgInfoStorage", "remove low quality thumb from cacheMap, path: ".concat(String.valueOf(localObject)));
      int i = 0;
      continue;
      Object localObject = (FrameLayout.LayoutParams)paramImageView1.getLayoutParams();
      continue;
      label622: if (paramInt4 == 1)
      {
        ((FrameLayout.LayoutParams)localObject).gravity = 3;
        continue;
        label637: paramInt1 = 0;
        continue;
        paramInt2 = 0;
        continue;
        if (paramInt4 == 1)
        {
          paramImageView1.gravity = 3;
          continue;
          if (paramInt4 == 1)
          {
            paramImageView1.gravity = 3;
            continue;
            float f;
            if (paramInt3 > 0)
            {
              paramImageView1.setBackgroundResource(paramInt3);
              paramImageView1.setImageDrawable(null);
              if ((paramInt1 >= 160) || (paramInt2 >= 160))
                if (paramInt2 > paramInt1)
                {
                  f = 160.0F / paramInt2;
                  paramInt1 = (int)(paramInt1 * f);
                  paramInt2 = (int)(f * paramInt2);
                  if (paramInt1 <= 0)
                    break label946;
                  paramInt3 = (int)(paramInt1 * paramFloat);
                  if (paramInt2 <= 0)
                    break label953;
                  paramInt1 = paramInt2;
                  label766: paramInt1 = (int)(paramInt1 * paramFloat);
                  paramInt2 = paramInt3;
                  if (paramInt2 >= 60.0F * paramFloat)
                    break label1147;
                  ab.d("MicroMsg.ImgInfoStorage", "pic to small width is %d ", new Object[] { Integer.valueOf(paramInt2) });
                  paramInt2 = (int)(60.0F * paramFloat);
                }
            }
            label889: label1147: 
            while (true)
            {
              paramInt3 = paramInt1;
              if (paramInt1 < 60.0F * paramFloat)
              {
                ab.d("MicroMsg.ImgInfoStorage", "pic to small height is %d ", new Object[] { Integer.valueOf(paramInt1) });
                paramInt3 = (int)(60.0F * paramFloat);
              }
              paramString = new FrameLayout.LayoutParams(paramInt2, paramInt3);
              if (paramInt4 == 0)
              {
                paramString.gravity = 5;
                if (paramView == null)
                  break label1144;
                paramView.setLayoutParams(paramString);
              }
              while (true)
              {
                paramImageView1.setLayoutParams(paramString);
                if (i == 0)
                  a(paramImageView1, paramImageView2, paramView, (String)localObject, paramFloat);
                paramBoolean = false;
                AppMethodBeat.o(78227);
                break;
                f = 160.0F / paramInt1;
                break label725;
                paramInt1 = 120;
                break label748;
                paramInt1 = 75;
                break label766;
                if (paramInt1 > 0)
                {
                  paramInt3 = (int)(paramInt1 * paramFloat * 1.25F);
                  if (paramInt2 <= 0)
                    break label1010;
                }
                while (true)
                {
                  paramInt1 = (int)(paramInt2 * paramFloat * 1.25F);
                  paramInt2 = paramInt3;
                  break;
                  paramInt1 = 120;
                  break label965;
                  paramInt2 = 75;
                }
                if (paramInt4 != 1)
                  break label889;
                paramString.gravity = 3;
                break label889;
                if ((this.fEr == null) || (this.fEr.get() == null))
                  this.fEr = new SoftReference(new ColorDrawable(-1118482));
                paramImageView1.setImageDrawable((ColorDrawable)this.fEr.get());
                if (paramInt1 > 0)
                {
                  paramInt1 = (int)(paramInt1 * paramFloat * 1.25F);
                  if (paramInt2 <= 0)
                    break label1137;
                }
                while (true)
                {
                  paramString = new FrameLayout.LayoutParams(paramInt1, (int)(paramInt2 * paramFloat * 1.25F));
                  break;
                  paramInt1 = 120;
                  break label1088;
                  paramInt2 = 75;
                }
              }
            }
            label1010: label1144: label1150: continue;
            label1137: i = 0;
            paramString = null;
          }
        }
      }
    }
  }

  public final boolean a(bi parambi, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(78271);
    String str = y(parambi);
    if (!bo.isNullOrNil(str))
    {
      bool = a(str, parambi.field_imgPath, paramInt1, paramInt2, 0, 0);
      AppMethodBeat.o(78271);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(78271);
    }
  }

  // ERROR //
  public final boolean a(String arg1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    // Byte code:
    //   0: ldc_w 1563
    //   3: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 238
    //   8: ldc_w 1565
    //   11: iconst_5
    //   12: anewarray 94	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: aload_1
    //   18: aastore
    //   19: dup
    //   20: iconst_1
    //   21: aload_2
    //   22: aastore
    //   23: dup
    //   24: iconst_2
    //   25: iload_3
    //   26: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   29: aastore
    //   30: dup
    //   31: iconst_3
    //   32: iload 4
    //   34: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   37: aastore
    //   38: dup
    //   39: iconst_4
    //   40: invokestatic 254	com/tencent/mm/sdk/platformtools/bo:dpG	()Lcom/tencent/mm/sdk/platformtools/an;
    //   43: aastore
    //   44: invokestatic 259	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: invokestatic 378	java/lang/System:currentTimeMillis	()J
    //   50: lstore 7
    //   52: invokestatic 384	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   55: invokestatic 1143	com/tencent/mm/bz/a:getDensity	(Landroid/content/Context;)F
    //   58: fstore 9
    //   60: aload_1
    //   61: invokestatic 224	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   64: ifne +10 -> 74
    //   67: aload_2
    //   68: invokestatic 224	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   71: ifeq +15 -> 86
    //   74: iconst_0
    //   75: istore 10
    //   77: ldc_w 1563
    //   80: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: iload 10
    //   85: ireturn
    //   86: aload_0
    //   87: aload_2
    //   88: iconst_0
    //   89: iconst_1
    //   90: invokevirtual 359	com/tencent/mm/at/g:c	(Ljava/lang/String;ZZ)Ljava/lang/String;
    //   93: astore 11
    //   95: aload 11
    //   97: invokestatic 224	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   100: ifeq +15 -> 115
    //   103: iconst_0
    //   104: istore 10
    //   106: ldc_w 1563
    //   109: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   112: goto -29 -> 83
    //   115: aload 11
    //   117: ldc_w 274
    //   120: invokevirtual 277	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   123: ifne +102 -> 225
    //   126: new 417	java/lang/StringBuilder
    //   129: dup
    //   130: invokespecial 418	java/lang/StringBuilder:<init>	()V
    //   133: aload 11
    //   135: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: ldc_w 274
    //   141: invokevirtual 520	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: invokevirtual 423	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: astore 12
    //   149: aload 11
    //   151: astore 13
    //   153: aload 12
    //   155: astore 11
    //   157: aload 13
    //   159: invokestatic 1249	com/tencent/mm/sdk/platformtools/d:amj	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   162: astore 14
    //   164: aload 14
    //   166: ifnull +23 -> 189
    //   169: aload 14
    //   171: getfield 956	android/graphics/BitmapFactory$Options:outWidth	I
    //   174: ifle +15 -> 189
    //   177: aload 14
    //   179: astore 12
    //   181: aload 14
    //   183: getfield 959	android/graphics/BitmapFactory$Options:outHeight	I
    //   186: ifgt +122 -> 308
    //   189: getstatic 605	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   192: ldc2_w 1115
    //   195: ldc2_w 1566
    //   198: lconst_1
    //   199: iconst_0
    //   200: invokevirtual 1121	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   203: aload 13
    //   205: invokestatic 535	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   208: lconst_0
    //   209: lcmp
    //   210: ifle +33 -> 243
    //   213: iconst_0
    //   214: istore 10
    //   216: ldc_w 1563
    //   219: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   222: goto -139 -> 83
    //   225: aload 11
    //   227: iconst_0
    //   228: aload 11
    //   230: invokevirtual 311	java/lang/String:length	()I
    //   233: iconst_2
    //   234: isub
    //   235: invokevirtual 315	java/lang/String:substring	(II)Ljava/lang/String;
    //   238: astore 13
    //   240: goto -83 -> 157
    //   243: new 942	android/graphics/BitmapFactory$Options
    //   246: dup
    //   247: invokespecial 943	android/graphics/BitmapFactory$Options:<init>	()V
    //   250: astore 12
    //   252: invokestatic 1570	com/tencent/mm/sdk/platformtools/d:dnX	()V
    //   255: ldc 238
    //   257: ldc_w 1572
    //   260: iconst_3
    //   261: anewarray 94	java/lang/Object
    //   264: dup
    //   265: iconst_0
    //   266: aload 12
    //   268: aastore
    //   269: dup
    //   270: iconst_1
    //   271: aload 12
    //   273: getfield 956	android/graphics/BitmapFactory$Options:outWidth	I
    //   276: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   279: aastore
    //   280: dup
    //   281: iconst_2
    //   282: aload 12
    //   284: getfield 959	android/graphics/BitmapFactory$Options:outHeight	I
    //   287: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   290: aastore
    //   291: invokestatic 329	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   294: getstatic 605	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   297: ldc2_w 1115
    //   300: ldc2_w 1573
    //   303: lconst_1
    //   304: iconst_0
    //   305: invokevirtual 1121	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   308: aload 12
    //   310: getfield 956	android/graphics/BitmapFactory$Options:outWidth	I
    //   313: ifne +10 -> 323
    //   316: aload 12
    //   318: iload 5
    //   320: putfield 956	android/graphics/BitmapFactory$Options:outWidth	I
    //   323: aload 12
    //   325: getfield 959	android/graphics/BitmapFactory$Options:outHeight	I
    //   328: ifne +10 -> 338
    //   331: aload 12
    //   333: iload 6
    //   335: putfield 959	android/graphics/BitmapFactory$Options:outHeight	I
    //   338: aload 12
    //   340: getfield 956	android/graphics/BitmapFactory$Options:outWidth	I
    //   343: i2f
    //   344: fload 9
    //   346: fmul
    //   347: ldc_w 392
    //   350: fmul
    //   351: f2i
    //   352: istore 15
    //   354: aload 12
    //   356: getfield 959	android/graphics/BitmapFactory$Options:outHeight	I
    //   359: i2f
    //   360: fload 9
    //   362: fmul
    //   363: ldc_w 392
    //   366: fmul
    //   367: f2i
    //   368: istore 16
    //   370: iload 15
    //   372: i2f
    //   373: ldc_w 393
    //   376: fload 9
    //   378: fmul
    //   379: fcmpl
    //   380: ifge +24 -> 404
    //   383: iload 16
    //   385: istore 6
    //   387: iload 15
    //   389: istore 5
    //   391: iload 16
    //   393: i2f
    //   394: ldc_w 393
    //   397: fload 9
    //   399: fmul
    //   400: fcmpl
    //   401: iflt +40 -> 441
    //   404: iload 16
    //   406: iload 15
    //   408: if_icmple +229 -> 637
    //   411: ldc_w 393
    //   414: fload 9
    //   416: fmul
    //   417: iload 16
    //   419: i2f
    //   420: fdiv
    //   421: fstore 9
    //   423: iload 15
    //   425: i2f
    //   426: fload 9
    //   428: fmul
    //   429: f2i
    //   430: istore 5
    //   432: fload 9
    //   434: iload 16
    //   436: i2f
    //   437: fmul
    //   438: f2i
    //   439: istore 6
    //   441: iload 4
    //   443: ifne +209 -> 652
    //   446: getstatic 344	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   449: astore 17
    //   451: new 302	com/tencent/mm/pointers/PInt
    //   454: astore 14
    //   456: aload 14
    //   458: invokespecial 1035	com/tencent/mm/pointers/PInt:<init>	()V
    //   461: new 302	com/tencent/mm/pointers/PInt
    //   464: astore 12
    //   466: aload 12
    //   468: invokespecial 1035	com/tencent/mm/pointers/PInt:<init>	()V
    //   471: aload_1
    //   472: iload 6
    //   474: iload 5
    //   476: aload 17
    //   478: aload 11
    //   480: aload 14
    //   482: aload 12
    //   484: invokestatic 1577	com/tencent/mm/sdk/platformtools/d:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Z
    //   487: istore 10
    //   489: ldc 238
    //   491: ldc_w 1579
    //   494: iconst_4
    //   495: anewarray 94	java/lang/Object
    //   498: dup
    //   499: iconst_0
    //   500: new 417	java/lang/StringBuilder
    //   503: dup
    //   504: invokespecial 418	java/lang/StringBuilder:<init>	()V
    //   507: invokestatic 378	java/lang/System:currentTimeMillis	()J
    //   510: lload 7
    //   512: lsub
    //   513: invokevirtual 422	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   516: invokevirtual 423	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   519: aastore
    //   520: dup
    //   521: iconst_1
    //   522: iload 6
    //   524: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   527: aastore
    //   528: dup
    //   529: iconst_2
    //   530: iload 5
    //   532: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   535: aastore
    //   536: dup
    //   537: iconst_3
    //   538: iload 10
    //   540: invokestatic 250	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   543: aastore
    //   544: invokestatic 259	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   547: aload_0
    //   548: aload 13
    //   550: iconst_1
    //   551: invokestatic 384	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   554: invokestatic 1143	com/tencent/mm/bz/a:getDensity	(Landroid/content/Context;)F
    //   557: iconst_1
    //   558: iconst_0
    //   559: iconst_1
    //   560: iload_3
    //   561: iconst_0
    //   562: invokespecial 1136	com/tencent/mm/at/g:a	(Ljava/lang/String;ZFZZZIZ)Landroid/graphics/Bitmap;
    //   565: pop
    //   566: iload 10
    //   568: ifeq +187 -> 755
    //   571: aload_0
    //   572: getfield 143	com/tencent/mm/at/g:fEo	Ljava/util/Map;
    //   575: astore_1
    //   576: aload_1
    //   577: monitorenter
    //   578: aload_0
    //   579: getfield 143	com/tencent/mm/at/g:fEo	Ljava/util/Map;
    //   582: aload_2
    //   583: invokeinterface 1508 2 0
    //   588: ifeq +38 -> 626
    //   591: aload_0
    //   592: getfield 143	com/tencent/mm/at/g:fEo	Ljava/util/Map;
    //   595: aload_2
    //   596: invokeinterface 693 2 0
    //   601: checkcast 49	java/lang/String
    //   604: ldc_w 274
    //   607: invokevirtual 277	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   610: ifne +16 -> 626
    //   613: aload_0
    //   614: getfield 143	com/tencent/mm/at/g:fEo	Ljava/util/Map;
    //   617: aload_2
    //   618: aload 11
    //   620: invokeinterface 676 3 0
    //   625: pop
    //   626: aload_1
    //   627: monitorexit
    //   628: ldc_w 1563
    //   631: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   634: goto -551 -> 83
    //   637: ldc_w 393
    //   640: fload 9
    //   642: fmul
    //   643: iload 15
    //   645: i2f
    //   646: fdiv
    //   647: fstore 9
    //   649: goto -226 -> 423
    //   652: getstatic 344	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   655: astore 12
    //   657: new 302	com/tencent/mm/pointers/PInt
    //   660: astore 17
    //   662: aload 17
    //   664: invokespecial 1035	com/tencent/mm/pointers/PInt:<init>	()V
    //   667: new 302	com/tencent/mm/pointers/PInt
    //   670: astore 14
    //   672: aload 14
    //   674: invokespecial 1035	com/tencent/mm/pointers/PInt:<init>	()V
    //   677: aload_1
    //   678: iload 6
    //   680: iload 5
    //   682: aload 12
    //   684: aload 11
    //   686: aload 17
    //   688: aload 14
    //   690: invokestatic 1581	com/tencent/mm/sdk/platformtools/d:b	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Z
    //   693: istore 10
    //   695: goto -206 -> 489
    //   698: astore_1
    //   699: getstatic 605	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   702: ldc2_w 1115
    //   705: ldc2_w 1582
    //   708: lconst_1
    //   709: iconst_0
    //   710: invokevirtual 1121	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   713: ldc 238
    //   715: ldc_w 1585
    //   718: iconst_1
    //   719: anewarray 94	java/lang/Object
    //   722: dup
    //   723: iconst_0
    //   724: aload_1
    //   725: invokevirtual 1586	java/lang/Exception:toString	()Ljava/lang/String;
    //   728: aastore
    //   729: invokestatic 446	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   732: iconst_0
    //   733: istore 10
    //   735: ldc_w 1563
    //   738: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   741: goto -658 -> 83
    //   744: astore_2
    //   745: aload_1
    //   746: monitorexit
    //   747: ldc_w 1563
    //   750: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   753: aload_2
    //   754: athrow
    //   755: getstatic 605	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   758: ldc2_w 1115
    //   761: ldc2_w 1582
    //   764: lconst_1
    //   765: iconst_0
    //   766: invokevirtual 1121	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   769: goto -141 -> 628
    //
    // Exception table:
    //   from	to	target	type
    //   446	489	698	java/lang/Exception
    //   652	695	698	java/lang/Exception
    //   578	626	744	finally
    //   626	628	744	finally
    //   745	747	744	finally
  }

  public final void agT()
  {
    AppMethodBeat.i(78209);
    Cursor localCursor = this.fni.a("SELECT max(id) FROM ImgInfo2", null, 2);
    long l;
    if (localCursor.moveToFirst())
      l = localCursor.getLong(0) + 1L;
    synchronized (this.fEp)
    {
      if (l > this.fEp.get())
        this.fEp.set(l);
      localCursor.close();
      ab.i("MicroMsg.ImgInfoStorage", "loading new img id: " + this.fEp.get());
      AppMethodBeat.o(78209);
      return;
    }
  }

  public final long agU()
  {
    AppMethodBeat.i(78210);
    synchronized (this.fEp)
    {
      long l = this.fEp.getAndIncrement();
      AppMethodBeat.o(78210);
      return l;
    }
  }

  public final List<e> agV()
  {
    Object localObject1 = null;
    AppMethodBeat.i(78240);
    Object localObject2 = "select * " + " FROM ImgInfo2";
    localObject2 = (String)localObject2 + " WHERE iscomplete= 0 AND totalLen != 0 ";
    localObject2 = this.fni.a((String)localObject2, null, 0);
    if (!((Cursor)localObject2).moveToFirst())
    {
      ((Cursor)localObject2).close();
      AppMethodBeat.o(78240);
      return localObject1;
    }
    localObject1 = new ArrayList();
    label202: 
    while (true)
    {
      e locale1 = new e();
      locale1.d((Cursor)localObject2);
      e locale2 = lz((int)locale1.fDy);
      if (locale2 != null)
        if ((locale2.cKK != 0L) || (locale2.fDH != 0L))
          ((List)localObject1).add(locale1);
      while (true)
      {
        if (((Cursor)localObject2).moveToNext())
          break label202;
        ((Cursor)localObject2).close();
        AppMethodBeat.o(78240);
        break;
        if ((locale1.cKK != 0L) || (locale1.fDH != 0L))
          ((List)localObject1).add(locale1);
      }
    }
  }

  public final Bitmap b(String paramString, float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(78230);
    paramString = a(paramString, true, paramFloat, paramBoolean, true, false, 0);
    AppMethodBeat.o(78230);
    return paramString;
  }

  public final e b(Long paramLong)
  {
    AppMethodBeat.i(78238);
    e locale = new e();
    paramLong = a("ImgInfo2", null, "id=?", new String[] { String.valueOf(paramLong) });
    if ((paramLong != null) && (paramLong.moveToFirst()))
      locale.d(paramLong);
    paramLong.close();
    AppMethodBeat.o(78238);
    return locale;
  }

  public final String b(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(78212);
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(78212);
      paramString1 = null;
      return paramString1;
    }
    if (paramString1.startsWith("SERVERID://"));
    for (String str1 = paramString1.substring(11); ; str1 = "")
      label164: 
      while (true)
      {
        try
        {
          str1 = fI(Long.valueOf(str1).longValue()).fDz;
          if (!paramString1.startsWith("THUMBNAIL_DIRPATH://"))
            break label164;
          paramString1 = paramString1.substring(23);
          paramString2 = "th_";
          String str2 = com.tencent.mm.plugin.i.c.XW();
          String str3 = com.tencent.mm.plugin.i.c.XX();
          String str4 = str1;
          if (bo.isNullOrNil(str1))
            str4 = paramString1;
          paramString1 = j.b(str2, str3, paramString2, str4, paramString3, paramBoolean);
          AppMethodBeat.o(78212);
        }
        catch (NumberFormatException paramString1)
        {
          ab.e("MicroMsg.ImgInfoStorage", "read img buf failed: " + paramString1.getMessage());
          AppMethodBeat.o(78212);
          paramString1 = null;
        }
        break;
      }
  }

  public final HashMap<Long, e> b(Long[] paramArrayOfLong)
  {
    AppMethodBeat.i(78244);
    Object localObject1 = "(";
    int i = paramArrayOfLong.length;
    int j = 0;
    int k = 1;
    if (j < i)
    {
      long l = paramArrayOfLong[j].longValue();
      localObject2 = new StringBuilder().append((String)localObject1);
      if (k != 0);
      for (localObject1 = Long.valueOf(l); ; localObject1 = ",".concat(String.valueOf(l)))
      {
        localObject1 = localObject1;
        j++;
        k = 0;
        break;
      }
    }
    paramArrayOfLong = b("ImgInfo2", null, "msglocalid in ".concat(String.valueOf((String)localObject1 + ")")), null);
    Object localObject2 = new HashMap();
    while (paramArrayOfLong.moveToNext())
    {
      localObject1 = new e();
      ((e)localObject1).d(paramArrayOfLong);
      ((HashMap)localObject2).put(Long.valueOf(((e)localObject1).cKK), localObject1);
    }
    paramArrayOfLong.close();
    AppMethodBeat.o(78244);
    return localObject2;
  }

  public final String c(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(78273);
    Object localObject;
    if ((paramString != null) && (this.fEo.containsKey(paramString)))
    {
      localObject = (String)this.fEo.get(paramString);
      AppMethodBeat.o(78273);
      return localObject;
    }
    if (paramBoolean1);
    for (String str = paramString; ; str = I(paramString, paramBoolean2))
    {
      localObject = str;
      if (bo.isNullOrNil(str))
        break;
      this.fEo.put(paramString, str);
      localObject = str;
      break;
    }
  }

  public final String d(e parame)
  {
    Object localObject = null;
    Cursor localCursor = null;
    AppMethodBeat.i(78242);
    if (parame == null)
    {
      AppMethodBeat.o(78242);
      parame = localCursor;
    }
    while (true)
    {
      return parame;
      if (parame.agQ())
      {
        parame = parame.fDJ;
        localCursor = b("ImgInfo2", new String[] { "bigImgPath" }, "id=? and totalLen = offset", new String[] { parame });
        parame = localObject;
        if (localCursor.moveToFirst())
          parame = localCursor.getString(0);
        localCursor.close();
        AppMethodBeat.o(78242);
      }
      else
      {
        AppMethodBeat.o(78242);
        parame = localCursor;
      }
    }
  }

  public final long e(e parame)
  {
    AppMethodBeat.i(78254);
    long l = this.fni.insert("ImgInfo2", "id", parame.Hl());
    if (l != -1L)
      parame.agS();
    ab.i("MicroMsg.ImgInfoStorage", "insert img, result:%d, localId:%d, msgLocalId:%d, msgSvrId:%d, hdID:%d", new Object[] { Long.valueOf(l), Long.valueOf(parame.fDy), Long.valueOf(parame.fDH), Long.valueOf(parame.cKK), Integer.valueOf(parame.fDJ) });
    AppMethodBeat.o(78254);
    return l;
  }

  public final Bitmap e(String paramString, float paramFloat)
  {
    AppMethodBeat.i(78224);
    paramString = a(paramString, paramFloat, false);
    AppMethodBeat.o(78224);
    return paramString;
  }

  public final e fI(long paramLong)
  {
    AppMethodBeat.i(78246);
    e locale = new e();
    Cursor localCursor = b("ImgInfo2", null, "msgSvrId=?", new String[] { String.valueOf(paramLong) });
    if (localCursor.moveToFirst())
      locale.d(localCursor);
    localCursor.close();
    AppMethodBeat.o(78246);
    return locale;
  }

  public final e fJ(long paramLong)
  {
    AppMethodBeat.i(78247);
    e locale = new e();
    Cursor localCursor = b("ImgInfo2", null, "msglocalid=?", new String[] { String.valueOf(paramLong) });
    if (localCursor.moveToLast())
      locale.d(localCursor);
    localCursor.close();
    AppMethodBeat.o(78247);
    return locale;
  }

  public final Bitmap g(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(78269);
    if (paramBoolean);
    for (String str = "location_backgroup_key_from"; ; str = "location_backgroup_key_tor")
    {
      Bitmap localBitmap1 = (Bitmap)this.fEh.ai(str);
      Bitmap localBitmap2;
      if (localBitmap1 != null)
      {
        localBitmap2 = localBitmap1;
        if (!localBitmap1.isRecycled());
      }
      else
      {
        localBitmap2 = com.tencent.mm.sdk.platformtools.d.gU(paramInt1, paramInt2);
        this.fEh.k(str, localBitmap2);
      }
      AppMethodBeat.o(78269);
      return localBitmap2;
    }
  }

  public final String getFullPath(String paramString)
  {
    AppMethodBeat.i(78214);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(78214);
      paramString = null;
      return paramString;
    }
    String str1 = "";
    if (paramString.startsWith("SERVERID://"))
      str1 = paramString.substring(11);
    while (true)
    {
      try
      {
        str1 = fI(Long.valueOf(str1).longValue()).fDz;
        String str2 = com.tencent.mm.plugin.i.c.XW();
        String str3 = com.tencent.mm.plugin.i.c.XX();
        if (!bo.isNullOrNil(str1))
          break label135;
        paramString = j.g(str2, str3, "th_", paramString, "");
        AppMethodBeat.o(78214);
      }
      catch (NumberFormatException paramString)
      {
        ab.e("MicroMsg.ImgInfoStorage", "read img buf failed: " + paramString.getMessage());
        AppMethodBeat.o(78214);
        paramString = null;
      }
      break;
      label135: paramString = str1;
    }
  }

  public final e ly(int paramInt)
  {
    AppMethodBeat.i(78245);
    e locale = b(Long.valueOf(paramInt));
    AppMethodBeat.o(78245);
    return locale;
  }

  // ERROR //
  public final e lz(int paramInt)
  {
    // Byte code:
    //   0: ldc_w 1686
    //   3: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ldc 178
    //   9: aconst_null
    //   10: ldc_w 1688
    //   13: iconst_1
    //   14: anewarray 49	java/lang/String
    //   17: dup
    //   18: iconst_0
    //   19: iload_1
    //   20: invokestatic 187	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   23: aastore
    //   24: invokespecial 1491	com/tencent/mm/at/g:b	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   27: astore_2
    //   28: aload_2
    //   29: ifnull +149 -> 178
    //   32: aload_2
    //   33: astore_3
    //   34: aload_2
    //   35: invokeinterface 196 1 0
    //   40: ifeq +138 -> 178
    //   43: aload_2
    //   44: astore_3
    //   45: new 175	com/tencent/mm/at/e
    //   48: astore 4
    //   50: aload_2
    //   51: astore_3
    //   52: aload 4
    //   54: invokespecial 176	com/tencent/mm/at/e:<init>	()V
    //   57: aload_2
    //   58: astore_3
    //   59: aload 4
    //   61: aload_2
    //   62: invokevirtual 200	com/tencent/mm/at/e:d	(Landroid/database/Cursor;)V
    //   65: aload 4
    //   67: astore_3
    //   68: aload_2
    //   69: ifnull +12 -> 81
    //   72: aload_2
    //   73: invokeinterface 203 1 0
    //   78: aload 4
    //   80: astore_3
    //   81: ldc_w 1686
    //   84: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_3
    //   88: areturn
    //   89: astore 5
    //   91: aconst_null
    //   92: astore 4
    //   94: aconst_null
    //   95: astore_2
    //   96: aload_2
    //   97: astore_3
    //   98: ldc 238
    //   100: ldc_w 1690
    //   103: iconst_1
    //   104: anewarray 94	java/lang/Object
    //   107: dup
    //   108: iconst_0
    //   109: aload 5
    //   111: invokevirtual 1586	java/lang/Exception:toString	()Ljava/lang/String;
    //   114: aastore
    //   115: invokestatic 1165	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: aload 4
    //   120: astore_3
    //   121: aload_2
    //   122: ifnull -41 -> 81
    //   125: aload_2
    //   126: invokeinterface 203 1 0
    //   131: aload 4
    //   133: astore_3
    //   134: goto -53 -> 81
    //   137: astore 4
    //   139: aconst_null
    //   140: astore_3
    //   141: aload_3
    //   142: ifnull +9 -> 151
    //   145: aload_3
    //   146: invokeinterface 203 1 0
    //   151: ldc_w 1686
    //   154: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: aload 4
    //   159: athrow
    //   160: astore 4
    //   162: goto -21 -> 141
    //   165: astore 5
    //   167: aconst_null
    //   168: astore 4
    //   170: goto -74 -> 96
    //   173: astore 5
    //   175: goto -79 -> 96
    //   178: aconst_null
    //   179: astore 4
    //   181: goto -116 -> 65
    //
    // Exception table:
    //   from	to	target	type
    //   6	28	89	java/lang/Exception
    //   6	28	137	finally
    //   34	43	160	finally
    //   45	50	160	finally
    //   52	57	160	finally
    //   59	65	160	finally
    //   98	118	160	finally
    //   34	43	165	java/lang/Exception
    //   45	50	165	java/lang/Exception
    //   52	57	165	java/lang/Exception
    //   59	65	173	java/lang/Exception
  }

  public final String q(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(78213);
    paramString1 = b(paramString1, paramString2, paramString3, true);
    AppMethodBeat.o(78213);
    return paramString1;
  }

  public final String sj(String paramString)
  {
    AppMethodBeat.i(78216);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(78216);
      paramString = null;
      return paramString;
    }
    String str1 = "";
    String str2 = paramString.trim();
    if (str2.startsWith("THUMBNAIL://"))
      paramString = str2.substring(12);
    while (true)
    {
      try
      {
        paramString = ly(Integer.valueOf(paramString).intValue()).fDB;
        paramString = q(paramString, str1, "");
        AppMethodBeat.o(78216);
      }
      catch (NumberFormatException paramString)
      {
        ab.e("MicroMsg.ImgInfoStorage", "read img buf failed: " + paramString.getMessage());
        AppMethodBeat.o(78216);
        paramString = null;
      }
      break;
      paramString = str2;
      if (str2.startsWith("THUMBNAIL_DIRPATH://"))
      {
        paramString = str2.substring(23);
        str1 = "th_";
      }
    }
  }

  public final Bitmap sk(String paramString)
  {
    AppMethodBeat.i(78234);
    float f = com.tencent.mm.bz.a.getDensity(ah.getContext());
    paramString = com.tencent.mm.sdk.platformtools.d.j(c(paramString, false, true), f);
    AppMethodBeat.o(78234);
    return paramString;
  }

  public final String sl(String paramString)
  {
    AppMethodBeat.i(78255);
    paramString = b("THUMBNAIL_DIRPATH://th_".concat(String.valueOf(paramString)), "th_", "", false);
    AppMethodBeat.o(78255);
    return paramString;
  }

  public final String sm(String paramString)
  {
    AppMethodBeat.i(78256);
    paramString = b(paramString, "", ".jpg", false);
    AppMethodBeat.o(78256);
    return paramString;
  }

  public final String so(String paramString)
  {
    AppMethodBeat.i(138578);
    paramString = c(paramString, false, true);
    AppMethodBeat.o(138578);
    return paramString;
  }

  public final e w(bi parambi)
  {
    AppMethodBeat.i(78237);
    e locale = fJ(parambi.field_msgId);
    Object localObject = locale;
    if (locale.fDy == 0L)
    {
      parambi = fI(parambi.field_msgSvrId);
      localObject = parambi;
      if (parambi.fDy == 0L)
      {
        ab.e("MicroMsg.ImgInfoStorage", "deleteByMsg can't find correspond imgInfo");
        localObject = null;
        AppMethodBeat.o(78237);
      }
    }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(78237);
    }
  }

  public final void x(bi parambi)
  {
    AppMethodBeat.i(78241);
    parambi = w(parambi);
    if ((parambi == null) || (parambi.fDy == 0L))
    {
      ab.e("MicroMsg.ImgInfoStorage", "deleteByMsg can't find correspond imgInfo");
      AppMethodBeat.o(78241);
    }
    while (true)
    {
      return;
      com.tencent.mm.vfs.e.deleteFile(q(parambi.fDz, "", ""));
      com.tencent.mm.vfs.e.deleteFile(q(parambi.fDE, "", ""));
      com.tencent.mm.vfs.e.deleteFile(q(parambi.fDB, "", ""));
      com.tencent.mm.vfs.e.deleteFile(q(parambi.fDB, "", "") + "hd");
      this.fni.delete("ImgInfo2", "id=?", new String[] { parambi.fDy });
      if (parambi.agQ())
      {
        parambi = ly(parambi.fDJ);
        if (parambi == null)
        {
          AppMethodBeat.o(78241);
        }
        else
        {
          com.tencent.mm.vfs.e.deleteFile(q(parambi.fDz, "", ""));
          com.tencent.mm.vfs.e.deleteFile(q(parambi.fDE, "", ""));
          com.tencent.mm.vfs.e.deleteFile(q(parambi.fDB, "", ""));
          com.tencent.mm.vfs.e.deleteFile(q(parambi.fDB, "", "") + "hd");
          this.fni.delete("ImgInfo2", "id=?", new String[] { parambi.fDy });
        }
      }
      else
      {
        AppMethodBeat.o(78241);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.g
 * JD-Core Version:    0.6.2
 */