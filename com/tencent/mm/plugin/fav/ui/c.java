package com.tencent.mm.plugin.fav.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.ThumbnailUtils;
import android.support.v4.app.Fragment;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.widget.snackbar.a.b;
import com.tencent.mm.ui.widget.snackbar.a.c;
import com.tencent.mm.vfs.e;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class c
{
  private static f<String, Bitmap> mic;
  private static Map<String, Integer> mid;

  static
  {
    AppMethodBeat.i(73996);
    mic = new com.tencent.mm.memory.a.b(20, c.class);
    mid = new HashMap();
    HashMap localHashMap = new HashMap();
    mid = localHashMap;
    localHashMap.put("avi", Integer.valueOf(2131230817));
    mid.put("m4v", Integer.valueOf(2131230817));
    mid.put("vob", Integer.valueOf(2131230817));
    mid.put("mpeg", Integer.valueOf(2131230817));
    mid.put("mpe", Integer.valueOf(2131230817));
    mid.put("asx", Integer.valueOf(2131230817));
    mid.put("asf", Integer.valueOf(2131230817));
    mid.put("f4v", Integer.valueOf(2131230817));
    mid.put("flv", Integer.valueOf(2131230817));
    mid.put("mkv", Integer.valueOf(2131230817));
    mid.put("wmv", Integer.valueOf(2131230817));
    mid.put("wm", Integer.valueOf(2131230817));
    mid.put("3gp", Integer.valueOf(2131230817));
    mid.put("mp4", Integer.valueOf(2131230817));
    mid.put("rmvb", Integer.valueOf(2131230817));
    mid.put("rm", Integer.valueOf(2131230817));
    mid.put("ra", Integer.valueOf(2131230817));
    mid.put("ram", Integer.valueOf(2131230817));
    mid.put("mp3pro", Integer.valueOf(2131230800));
    mid.put("vqf", Integer.valueOf(2131230800));
    mid.put("cd", Integer.valueOf(2131230800));
    mid.put("md", Integer.valueOf(2131230800));
    mid.put("mod", Integer.valueOf(2131230800));
    mid.put("vorbis", Integer.valueOf(2131230800));
    mid.put("au", Integer.valueOf(2131230800));
    mid.put("amr", Integer.valueOf(2131230800));
    mid.put("silk", Integer.valueOf(2131230800));
    mid.put("wma", Integer.valueOf(2131230800));
    mid.put("mmf", Integer.valueOf(2131230800));
    mid.put("mid", Integer.valueOf(2131230800));
    mid.put("midi", Integer.valueOf(2131230800));
    mid.put("mp3", Integer.valueOf(2131230800));
    mid.put("aac", Integer.valueOf(2131230800));
    mid.put("ape", Integer.valueOf(2131230800));
    mid.put("aiff", Integer.valueOf(2131230800));
    mid.put("aif", Integer.valueOf(2131230800));
    mid.put("jfif", Integer.valueOf(2131230806));
    mid.put("tiff", Integer.valueOf(2131230806));
    mid.put("tif", Integer.valueOf(2131230806));
    mid.put("jpe", Integer.valueOf(2131230806));
    mid.put("dib", Integer.valueOf(2131230806));
    mid.put("jpeg", Integer.valueOf(2131230806));
    mid.put("jpg", Integer.valueOf(2131230806));
    mid.put("png", Integer.valueOf(2131230806));
    mid.put("bmp", Integer.valueOf(2131230806));
    mid.put("gif", Integer.valueOf(2131230806));
    mid.put("rar", Integer.valueOf(2131230809));
    mid.put("zip", Integer.valueOf(2131230809));
    mid.put("7z", Integer.valueOf(2131230809));
    mid.put("iso", Integer.valueOf(2131230809));
    mid.put("cab", Integer.valueOf(2131230809));
    mid.put("doc", Integer.valueOf(2131230821));
    mid.put("docx", Integer.valueOf(2131230821));
    mid.put("ppt", Integer.valueOf(2131230807));
    mid.put("pptx", Integer.valueOf(2131230807));
    mid.put("xls", Integer.valueOf(2131230793));
    mid.put("xlsx", Integer.valueOf(2131230793));
    mid.put("txt", Integer.valueOf(2131230812));
    mid.put("rtf", Integer.valueOf(2131230812));
    mid.put("pdf", Integer.valueOf(2131230804));
    mid.put("unknown", Integer.valueOf(2131230813));
    AppMethodBeat.o(73996);
  }

  public static int LX(String paramString)
  {
    AppMethodBeat.i(73994);
    paramString = (Integer)mid.get(paramString);
    int i;
    if (paramString == null)
    {
      i = ((Integer)mid.get("unknown")).intValue();
      AppMethodBeat.o(73994);
    }
    while (true)
    {
      return i;
      i = paramString.intValue();
      AppMethodBeat.o(73994);
    }
  }

  @TargetApi(8)
  public static Bitmap LY(String paramString)
  {
    AppMethodBeat.i(73995);
    Bitmap localBitmap = null;
    if (com.tencent.mm.compatible.util.d.iW(8))
      localBitmap = ThumbnailUtils.createVideoThumbnail(paramString, 1);
    AppMethodBeat.o(73995);
    return localBitmap;
  }

  private static int a(cl paramcl, int paramInt)
  {
    AppMethodBeat.i(73989);
    aar localaar;
    if ((paramcl.cvA.cvC.wiv != null) && (paramcl.cvA.cvC.wiv.size() > 0))
    {
      localaar = (aar)paramcl.cvA.cvC.wiv.getLast();
      if (paramInt <= 0)
        switch (paramInt)
        {
        default:
          localaar.LG(0);
        case -4:
        case -5:
        }
    }
    while (true)
    {
      b(paramcl, paramInt);
      AppMethodBeat.o(73989);
      return paramInt;
      localaar.LG(1);
      localaar.akV(null);
      continue;
      localaar.LG(2);
      localaar.akV(null);
    }
  }

  public static int a(bi parambi, cl paramcl, boolean paramBoolean)
  {
    AppMethodBeat.i(73988);
    ab.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo msg type is %d", new Object[] { Integer.valueOf(parambi.getType()) });
    int i;
    if ((!paramBoolean) && (paramcl.cvA.cvG > 0))
    {
      ab.i("MicroMsg.FavExportLogic", "(!result)&&(favoriteEvent.data.errorType > FavExportLogic.KEY_FAV_PARA_NO_ERROR)");
      i = a(paramcl, paramcl.cvA.cvG);
      AppMethodBeat.o(73988);
      return i;
    }
    if ((paramcl.cvA.type == 4) || (paramcl.cvA.type == 8) || (paramcl.cvA.type == 16) || (paramcl.cvA.type == 2));
    for (paramBoolean = false; ; paramBoolean = true)
    {
      boolean bool = paramBoolean;
      Object localObject;
      if (paramcl.cvA.type == 14)
      {
        bool = paramBoolean;
        if (paramcl.cvA.cvC.wiv.size() > 0)
        {
          localObject = (aar)paramcl.cvA.cvC.wiv.getLast();
          if ((((aar)localObject).dataType != 4) && (((aar)localObject).dataType != 8) && (((aar)localObject).dataType != 15))
          {
            bool = paramBoolean;
            if (((aar)localObject).dataType != 2);
          }
          else
          {
            bool = false;
          }
        }
      }
      ab.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo msg type skipCheck %B", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        i = a(paramcl, 0);
        AppMethodBeat.o(73988);
        break;
      }
      if (paramcl.cvA.cvC == null)
      {
        i = a(paramcl, -1);
        AppMethodBeat.o(73988);
        break;
      }
      if (paramcl.cvA.cvC.wiv == null)
      {
        i = a(paramcl, -1);
        AppMethodBeat.o(73988);
        break;
      }
      if (System.currentTimeMillis() - parambi.field_createTime > 259200000L);
      for (paramBoolean = true; ; paramBoolean = false)
      {
        ab.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo isOverThreeDays %B", new Object[] { Boolean.valueOf(paramBoolean) });
        if (1 <= paramcl.cvA.cvC.wiv.size());
        for (localObject = ((aar)paramcl.cvA.cvC.wiv.getLast()).wgx; ; localObject = "")
        {
          if (paramBoolean)
          {
            if ((!bo.isNullOrNil((String)localObject)) && (e.ct((String)localObject)))
              break label613;
            if ((parambi != null) && ((parambi.getType() == 43) || (parambi.getType() == 44) || (parambi.getType() == 62)))
            {
              localObject = u.ut(parambi.field_imgPath);
              if ((localObject != null) && (((s)localObject).fXk == -1))
              {
                localObject = ((s)localObject).alv();
                if (!e.ct((String)localObject));
              }
            }
            while (true)
            {
              if (!bo.isNullOrNil((String)localObject))
                break label504;
              i = a(paramcl, -4);
              AppMethodBeat.o(73988);
              break;
              localObject = null;
            }
            label504: ((aar)paramcl.cvA.cvC.wiv.getLast()).akV((String)localObject);
          }
          label613: 
          while (true)
          {
            if (a(parambi, paramcl, (String)localObject, true))
            {
              i = a(paramcl, -5);
              AppMethodBeat.o(73988);
              break;
            }
            ab.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  isOverThreeDays true not big not expired");
            do
            {
              ab.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  fav data is normal");
              i = a(paramcl, 0);
              AppMethodBeat.o(73988);
              break;
            }
            while (!a(parambi, paramcl, (String)localObject, false));
            i = a(paramcl, -5);
            AppMethodBeat.o(73988);
            break;
          }
        }
      }
    }
  }

  private static void a(int paramInt1, int paramInt2, Activity paramActivity, Fragment paramFragment, DialogInterface.OnClickListener paramOnClickListener, a.b paramb, a.c paramc)
  {
    AppMethodBeat.i(73987);
    Object localObject;
    String str;
    if (paramFragment == null)
    {
      localObject = paramActivity;
      if (paramInt2 != -4)
        break label199;
      switch (paramInt1)
      {
      default:
        str = "";
      case 2:
      case 8:
      case 4:
      case 16:
      case 14:
      }
    }
    while (true)
    {
      label77: h.a((Context)localObject, str, "", ((Context)localObject).getString(2131301955), ((Context)localObject).getString(2131298419), new c.5(paramOnClickListener, paramFragment, paramb, paramc, paramActivity), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(73982);
          paramAnonymousDialogInterface.dismiss();
          if (this.mif != null)
            this.mif.onClick(paramAnonymousDialogInterface, -1);
          AppMethodBeat.o(73982);
        }
      }
      , 2131690683);
      AppMethodBeat.o(73987);
      while (true)
      {
        return;
        localObject = paramFragment.getActivity();
        break;
        str = ((Context)localObject).getString(2131299619);
        break label77;
        str = ((Context)localObject).getString(2131299618);
        break label77;
        str = ((Context)localObject).getString(2131299620);
        break label77;
        str = ((Context)localObject).getString(2131299634);
        break label77;
        label199: if (paramInt2 == -5)
        {
          if (paramInt1 != 14)
          {
            str = ((Context)localObject).getString(2131299591);
            break label77;
          }
          str = ((Context)localObject).getString(2131299633);
          break label77;
        }
        if (paramInt2 == -6)
        {
          str = ((Context)localObject).getString(2131299634);
          break label77;
        }
        if (paramInt2 == -7)
        {
          str = ((Context)localObject).getString(2131299633);
          break label77;
        }
        if (paramInt2 == -8)
        {
          str = ((Context)localObject).getString(2131299635);
          break label77;
        }
        if (paramInt2 != -9)
          break label370;
        if (paramFragment != null)
        {
          com.tencent.mm.ui.widget.snackbar.b.a(paramFragment, ((Context)localObject).getString(2131299673), ((Context)localObject).getString(2131299590), paramb, paramc);
          AppMethodBeat.o(73987);
        }
        else
        {
          com.tencent.mm.ui.widget.snackbar.b.a(paramActivity, ((Context)localObject).getString(2131299673), ((Context)localObject).getString(2131299590), paramb, paramc);
          AppMethodBeat.o(73987);
        }
      }
      label370: str = ((Context)localObject).getString(2131299622);
    }
  }

  public static void a(int paramInt1, int paramInt2, Activity paramActivity, Fragment paramFragment, a.c paramc, DialogInterface.OnClickListener paramOnClickListener, a.b paramb)
  {
    AppMethodBeat.i(73984);
    if ((paramActivity == null) && (paramFragment == null))
    {
      ab.e("MicroMsg.FavExportLogic", "handleErrorType activity = null && fragment = null");
      AppMethodBeat.o(73984);
      return;
    }
    if (paramb == null)
      paramb = new c.1();
    while (true)
    {
      if (paramInt2 == 0)
      {
        if (paramFragment != null)
        {
          com.tencent.mm.ui.widget.snackbar.b.a(paramFragment, paramFragment.getString(2131299673), paramFragment.getString(2131299590), paramb, paramc);
          AppMethodBeat.o(73984);
          break;
        }
        if (paramActivity == null)
          break label196;
        com.tencent.mm.ui.widget.snackbar.b.a(paramActivity, paramActivity.getString(2131299673), paramActivity.getString(2131299590), paramb, paramc);
        AppMethodBeat.o(73984);
        break;
      }
      if (paramActivity == null)
        paramActivity = paramFragment.getActivity();
      while (true)
        switch (paramInt2)
        {
        case -3:
        default:
          h.a(paramActivity, paramInt2, 0, new c.2(paramOnClickListener));
          AppMethodBeat.o(73984);
          break;
        case -2:
          a(paramActivity, paramOnClickListener);
          AppMethodBeat.o(73984);
          break;
        case -9:
        case -8:
        case -7:
        case -6:
        case -5:
        case -4:
          a(paramInt1, paramInt2, paramActivity, paramFragment, paramOnClickListener, paramb, paramc);
          AppMethodBeat.o(73984);
          break;
        case -10:
          label196: a(paramActivity, paramFragment);
          AppMethodBeat.o(73984);
          break;
        }
    }
  }

  public static void a(int paramInt, Activity paramActivity, a.b paramb)
  {
    AppMethodBeat.i(73983);
    a(-1, paramInt, paramActivity, null, null, null, paramb);
    AppMethodBeat.o(73983);
  }

  private static void a(Activity paramActivity, Fragment paramFragment)
  {
    AppMethodBeat.i(73985);
    if (paramFragment != null)
      paramActivity = paramFragment.getActivity();
    t.makeText(paramActivity, 2131299631, 0).show();
    AppMethodBeat.o(73985);
  }

  private static void a(Context paramContext, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(73986);
    h.a(paramContext, paramContext.getString(2131299624), paramContext.getString(2131299625), paramContext.getString(2131299627), paramContext.getString(2131298419), new c.3(paramContext, paramOnClickListener), new c.4(paramOnClickListener), 2131690683);
    AppMethodBeat.o(73986);
  }

  private static boolean a(bi parambi, cl paramcl, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(73990);
    Object localObject;
    if (!bo.isNullOrNil(paramString))
    {
      localObject = new com.tencent.mm.vfs.b(paramString);
      if (((com.tencent.mm.vfs.b)localObject).exists())
      {
        if (((com.tencent.mm.vfs.b)localObject).length() > com.tencent.mm.m.b.Nc())
        {
          ab.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file is big");
          AppMethodBeat.o(73990);
          paramBoolean = true;
          return paramBoolean;
        }
        ab.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file not big");
      }
    }
    else
    {
      label72: localObject = parambi.field_content;
      if (localObject == null)
        break label265;
    }
    label265: for (parambi = j.b.X((String)localObject, parambi.field_reserved); ; parambi = null)
    {
      if (parambi != null)
      {
        if ((parambi.fgs != 0) || (parambi.fgo > com.tencent.mm.m.b.Nc()))
        {
          ab.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file is big");
          AppMethodBeat.o(73990);
          paramBoolean = true;
          break;
          if (paramBoolean)
            break label72;
          ab.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  not download finish ！attachFile.exists()");
          ((aar)paramcl.cvA.cvC.wiv.getLast()).akV(null);
          break label72;
        }
        if ((!bo.isNullOrNil(paramString)) && (e.ct(paramString)) && (!paramBoolean))
        {
          long l = e.asZ(paramString);
          if (parambi.fgo > l)
          {
            ab.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  not download finish content.attachlen > datasize");
            ((aar)paramcl.cvA.cvC.wiv.getLast()).akV(null);
          }
        }
      }
      if ((localObject == null) || (parambi == null))
        ab.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  (xml == null ) ||(content == null)");
      paramBoolean = false;
      AppMethodBeat.o(73990);
      break;
    }
  }

  public static Bitmap aI(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(73993);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(73993);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Bitmap localBitmap = (Bitmap)mic.get(paramString);
      if (localBitmap != null)
      {
        ab.d("MicroMsg.FavExportLogic", "get bm from cache %s", new Object[] { paramString });
        AppMethodBeat.o(73993);
        paramString = localBitmap;
      }
      else if (paramBoolean)
      {
        AppMethodBeat.o(73993);
        paramString = null;
      }
      else if (!e.ct(paramString))
      {
        AppMethodBeat.o(73993);
        paramString = null;
      }
      else
      {
        ab.d("MicroMsg.FavExportLogic", "get from cache fail, try to decode from file");
        BitmapFactory.Options localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        localBitmap = BitmapFactory.decodeFile(paramString, localOptions);
        if (localBitmap != null)
        {
          ab.i("MicroMsg.FavExportLogic", "bitmap recycle %s", new Object[] { localBitmap });
          localBitmap.recycle();
        }
        int j;
        if ((ad.cJ(localOptions.outWidth, localOptions.outHeight)) && (localOptions.outWidth > 480))
        {
          i = 1;
          if ((!ad.cI(localOptions.outWidth, localOptions.outHeight)) || (localOptions.outHeight <= 480))
            break label275;
          j = 1;
        }
        label275: 
        while (true)
          label219: if ((i != 0) || (j != 0))
          {
            i = localOptions.outHeight;
            j = localOptions.outWidth;
            while (true)
              if (j * i > 2764800)
              {
                j >>= 1;
                i >>= 1;
                continue;
                i = 0;
                break;
                j = 0;
                break label219;
              }
            j = Math.max(1, j);
            i = Math.max(1, i);
            ab.w("MicroMsg.FavExportLogic", "fit long picture, beg %d*%d, after %d*%d", new Object[] { Integer.valueOf(localOptions.outWidth), Integer.valueOf(localOptions.outHeight), Integer.valueOf(j), Integer.valueOf(i) });
          }
        int i = BackwardSupportUtil.ExifHelper.bJ(paramString);
        if ((MMNativeJpeg.IsJpegFile(paramString)) && (MMNativeJpeg.isProgressive(paramString)))
        {
          localBitmap = MMNativeJpeg.decodeAsBitmap(paramString);
          if (localBitmap == null)
          {
            paramBoolean = bool;
            label379: ab.i("MicroMsg.FavExportLogic", "Progressive jpeg, result isNull:%b", new Object[] { Boolean.valueOf(paramBoolean) });
          }
        }
        while (true)
        {
          if (localBitmap != null)
            break label443;
          ab.e("MicroMsg.FavExportLogic", "getSuitableBmp fail, temBmp is null, filePath = ".concat(String.valueOf(paramString)));
          AppMethodBeat.o(73993);
          paramString = null;
          break;
          paramBoolean = false;
          break label379;
          localBitmap = com.tencent.mm.sdk.platformtools.d.aml(paramString);
        }
        label443: localBitmap = com.tencent.mm.sdk.platformtools.d.b(localBitmap, i);
        if (localBitmap.getHeight() * localBitmap.getWidth() > 20971520)
        {
          AppMethodBeat.o(73993);
          paramString = localBitmap;
        }
        else
        {
          mic.put(paramString, localBitmap);
          AppMethodBeat.o(73993);
          paramString = localBitmap;
        }
      }
    }
  }

  private static void b(cl paramcl, int paramInt)
  {
    AppMethodBeat.i(73991);
    if ((paramcl.cvA.cvC.wiv == null) || (paramcl.cvA.cvC.wiv.size() == 0))
    {
      paramcl.cvA.cvG = paramInt;
      AppMethodBeat.o(73991);
    }
    while (true)
    {
      return;
      if (paramcl.cvA.cvG != -9)
        break;
      AppMethodBeat.o(73991);
    }
    if ((paramInt > 0) || (paramcl.cvA.cvG > 0));
    for (int i = 1; ; i = 0)
    {
      int j = 0;
      int k = 0;
      int m = 0;
      int n = 0;
      if (j < paramcl.cvA.cvC.wiv.size())
      {
        switch (((aar)paramcl.cvA.cvC.wiv.get(j)).whh)
        {
        default:
        case 1:
        case 2:
        case 0:
        }
        while (true)
        {
          j++;
          break;
          k++;
          continue;
          m++;
          continue;
          n++;
        }
      }
      if (i > 0)
      {
        if ((m > 0) || (k > 0))
        {
          paramcl.cvA.cvG = -9;
          AppMethodBeat.o(73991);
          break;
        }
        paramcl.cvA.cvG = paramInt;
        AppMethodBeat.o(73991);
        break;
      }
      if (m > 0)
      {
        if (k > 0)
        {
          paramcl.cvA.cvG = -8;
          AppMethodBeat.o(73991);
          break;
        }
        if (n == 0)
        {
          paramcl.cvA.cvG = -5;
          AppMethodBeat.o(73991);
          break;
        }
        if (n > 0)
        {
          paramcl.cvA.cvG = -7;
          AppMethodBeat.o(73991);
          break;
        }
        AppMethodBeat.o(73991);
        break;
      }
      if (k > 0)
      {
        if (n == 0)
        {
          paramcl.cvA.cvG = -4;
          AppMethodBeat.o(73991);
          break;
        }
        if (n > 0)
        {
          paramcl.cvA.cvG = -6;
          AppMethodBeat.o(73991);
          break;
        }
      }
      AppMethodBeat.o(73991);
      break;
    }
  }

  public static void bvC()
  {
    AppMethodBeat.i(73992);
    mic = new com.tencent.mm.memory.a.b(20, c.class);
    AppMethodBeat.o(73992);
  }

  public static void bvD()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.c
 * JD-Core Version:    0.6.2
 */