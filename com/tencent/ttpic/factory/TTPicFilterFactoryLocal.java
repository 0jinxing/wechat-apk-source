package com.tencent.ttpic.factory;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.text.TextUtils;
import com.tencent.a.a;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.a.ab;
import com.tencent.filter.m.k;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.filter.ChannelSplitFilter;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.util.e;
import com.tencent.util.g;
import com.tencent.view.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class TTPicFilterFactoryLocal
{
  public static String LUT_DIR_ROOT;
  private static final String TAG;

  static
  {
    AppMethodBeat.i(81933);
    TAG = TTPicFilterFactoryLocal.class.getSimpleName();
    LUT_DIR_ROOT = null;
    AppMethodBeat.o(81933);
  }

  public static void clearLutFiles()
  {
    AppMethodBeat.i(81931);
    if (LUT_DIR_ROOT == null)
      AppMethodBeat.o(81931);
    while (true)
    {
      return;
      FileUtils.delete(new File(LUT_DIR_ROOT));
      AppMethodBeat.o(81931);
    }
  }

  public static BaseFilter creatFilterById(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(81930);
    if (LUT_DIR_ROOT == null)
      AppMethodBeat.o(81930);
    while (true)
    {
      return localObject;
      String str;
      switch (paramInt)
      {
      default:
        str = null;
        localObject = null;
      case 297:
      case 289:
      case 283:
      case 285:
      case 286:
      case 287:
      case 288:
      case 1000:
      case 245:
      case 254:
      case 271:
      case 270:
      case 253:
      case 215:
      case 252:
      case 267:
      case 246:
      case 244:
      case 256:
      case 258:
      case 257:
      case 255:
      case 273:
      case 249:
      case 250:
      case 268:
      case 292:
      case 293:
      }
      while (true)
      {
        if (localObject == null)
          break label823;
        AppMethodBeat.o(81930);
        break;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/wuxia_lf.png", 33986));
        str = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/ziran_lf.png", 33986));
        str = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/qiangwei_lf.png", 33986));
        str = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/xinye_lf.png", 33986));
        str = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/tangguomeigui_lf.png", 33986));
        str = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/shuilian_lf.png", 33986));
        str = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/youjiali_lf.png", 33986));
        str = null;
        continue;
        localObject = new ChannelSplitFilter();
        str = null;
        continue;
        str = "MIC_PTU_ZIPAI_LIGHTWHITE";
        localObject = null;
        continue;
        str = "MIC_PTU_ZIPAI_LIGHTRED";
        localObject = null;
        continue;
        str = "MIC_PTU_ZIPAI_LIGHT";
        localObject = null;
        continue;
        str = "MIC_PTU_ZIPAI_TEAMILK";
        localObject = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/fenbi_lf.png", 33986));
        str = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/fennen_lf.png", 33986));
        str = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/tianbohe_lf.png", 33986));
        str = null;
        continue;
        str = "MIC_PTU_ZIPAI_GRADIENT_LIPNEW";
        localObject = null;
        continue;
        str = "MIC_PTU_ZIPAI_FAIRYTALE";
        localObject = null;
        continue;
        str = "MIC_PTU_ZIPAI_RICHRED";
        localObject = null;
        continue;
        str = "MIC_PTU_ZIPAI_YOUNG";
        localObject = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/zhahuang_lf.png", 33986));
        str = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/dongjing_lf.png", 33986));
        str = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/chongsheng_lf.png", 33986));
        str = null;
        continue;
        str = "MIC_PTU_ZIPAI_MAPLERED";
        localObject = null;
        continue;
        str = "MIC_PTU_ZIPAI_RICHBLUE";
        localObject = null;
        continue;
        str = "MIC_PTU_ZIPAI_RICHYELLOW";
        localObject = null;
        continue;
        str = "MIC_PTU_ZIPAI_BLACKWHITEZIPAI";
        localObject = null;
        continue;
        localObject = new ab();
        ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/nuanyang_lf.png", 33986));
        str = null;
        continue;
        str = "MIC_PTU_FBBS_LANGMAN";
        localObject = null;
      }
      label823: if (str == null)
      {
        localObject = a.createFilter(paramInt);
        AppMethodBeat.o(81930);
      }
      else
      {
        localObject = lutFilterWithID(str);
        if (localObject == null)
        {
          filter2Image(paramInt, str);
          localObject = a.createFilter(paramInt);
          AppMethodBeat.o(81930);
        }
        else
        {
          AppMethodBeat.o(81930);
        }
      }
    }
  }

  public static void filter2Image(int paramInt, String paramString)
  {
    AppMethodBeat.i(81929);
    if (LUT_DIR_ROOT == null)
      AppMethodBeat.o(81929);
    while (true)
    {
      return;
      c.dSN().queue(new TTPicFilterFactoryLocal.1(paramInt, paramString));
      AppMethodBeat.o(81929);
    }
  }

  public static Bitmap getBitmapFromEncryptedFile(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(81932);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(81932);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      try
      {
        if (paramString.startsWith("assets://"))
        {
          localObject3 = VideoGlobalContext.getContext().getAssets().open(FileUtils.getRealPath(paramString));
          label48: paramString = e.O((InputStream)localObject3);
        }
      }
      catch (Exception paramString)
      {
        try
        {
          Object localObject3;
          g.closeQuietly((InputStream)localObject3);
          while (true)
          {
            while (true)
            {
              label57: if (paramString == null)
              {
                AppMethodBeat.o(81932);
                paramString = localObject2;
                break;
                localObject3 = new FileInputStream(paramString);
                break label48;
              }
              localObject3 = new BitmapFactory.Options();
              ((BitmapFactory.Options)localObject3).inPreferredConfig = Bitmap.Config.ARGB_8888;
              try
              {
                paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length, (BitmapFactory.Options)localObject3);
                AppMethodBeat.o(81932);
              }
              catch (OutOfMemoryError paramString)
              {
                while (true)
                  paramString = localObject1;
              }
            }
            paramString = paramString;
            paramString = null;
          }
        }
        catch (Exception localException)
        {
          break label57;
        }
      }
    }
  }

  public static BaseFilter lutFilterWithBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(81927);
    if (paramBitmap == null)
    {
      paramBitmap = null;
      AppMethodBeat.o(81927);
    }
    while (true)
    {
      return paramBitmap;
      ab localab = new ab();
      localab.addParam(new m.k("inputImageTexture2", paramBitmap, 33986, true));
      AppMethodBeat.o(81927);
      paramBitmap = localab;
    }
  }

  public static BaseFilter lutFilterWithID(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(81928);
    if (LUT_DIR_ROOT == null)
    {
      AppMethodBeat.o(81928);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Bitmap localBitmap = getBitmapFromEncryptedFile(LUT_DIR_ROOT + File.separator + paramString + ".png2");
      if (localBitmap == null)
      {
        AppMethodBeat.o(81928);
        paramString = localObject;
      }
      else
      {
        paramString = new ab();
        paramString.addParam(new m.k("inputImageTexture2", localBitmap, 33986, true));
        AppMethodBeat.o(81928);
      }
    }
  }

  public static Bitmap preloadBaseLUTImage()
  {
    AppMethodBeat.i(81926);
    try
    {
      byte[] arrayOfByte = new byte[1048576];
      Object localObject1 = new byte[64];
      for (int i = 0; i < 64; i++)
        localObject1[i] = ((byte)(byte)Math.round(i * 4.047619F));
      for (i = 0; i < 64; i++)
      {
        int j = i / 8;
        for (int k = 0; k < 64; k++)
        {
          int m = i % 8 * 64 * 4 + (j * 64 + k) * 512 * 4;
          for (int n = 0; n < 64; n++)
          {
            int i1 = m + 1;
            arrayOfByte[m] = ((byte)localObject1[n]);
            m = i1 + 1;
            arrayOfByte[i1] = ((byte)localObject1[k]);
            i1 = m + 1;
            arrayOfByte[m] = ((byte)localObject1[i]);
            m = i1 + 1;
            arrayOfByte[i1] = ((byte)-1);
          }
        }
      }
      localObject1 = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
      ((Bitmap)localObject1).copyPixelsFromBuffer(ByteBuffer.wrap(arrayOfByte));
      AppMethodBeat.o(81926);
      return localObject1;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
        Object localObject2 = null;
    }
  }

  public static void saveLutOrg()
  {
    AppMethodBeat.i(81925);
    if (LUT_DIR_ROOT == null)
      AppMethodBeat.o(81925);
    while (true)
    {
      return;
      Bitmap localBitmap = preloadBaseLUTImage();
      if (localBitmap == null)
      {
        AppMethodBeat.o(81925);
      }
      else
      {
        BitmapUtils.saveBitmap2PNG(localBitmap, LUT_DIR_ROOT + File.separator + "LUT_ORG.png");
        AppMethodBeat.o(81925);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.factory.TTPicFilterFactoryLocal
 * JD-Core Version:    0.6.2
 */