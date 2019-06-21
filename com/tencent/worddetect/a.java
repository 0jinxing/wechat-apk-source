package com.tencent.worddetect;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.m;
import java.io.File;
import java.nio.ByteBuffer;

public class a
{
  private static WordDetectNative ALJ;

  public static int ci(Context paramContext, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(138530);
    if (ALJ == null);
    while (true)
    {
      Object localObject;
      int j;
      try
      {
        if (ALJ == null)
        {
          localObject = new com/tencent/worddetect/WordDetectNative;
          ((WordDetectNative)localObject).<init>();
          ALJ = (WordDetectNative)localObject;
          ((WordDetectNative)localObject).init(jw(paramContext));
        }
        if ((paramString == null) || (paramString.length() <= 0))
        {
          ab.e("MicroMsg.WordDetectModHelper", "in decodeFile, file == null");
          AppMethodBeat.o(138530);
          j = i;
          return j;
        }
      }
      finally
      {
        AppMethodBeat.o(138530);
      }
      try
      {
        long l = System.currentTimeMillis();
        paramContext = d.amj(paramString);
        if (paramContext != null)
        {
          paramContext.inJustDecodeBounds = false;
          if (paramContext.outWidth * paramContext.outHeight * 8 * 4L > 268435456L)
          {
            ab.i("MicroMsg.WordDetectModHelper", "initial width %d, initial height %d", new Object[] { Integer.valueOf(paramContext.outWidth), Integer.valueOf(paramContext.outHeight) });
            paramContext.inSampleSize = 4;
          }
        }
        paramContext = d.decodeFile(paramString, paramContext);
        if (paramContext == null)
        {
          ab.e("MicroMsg.WordDetectModHelper", "decode bitmap is null!");
          AppMethodBeat.o(138530);
          j = i;
        }
        else
        {
          paramString = ByteBuffer.allocate(paramContext.getByteCount());
          paramContext.copyPixelsToBuffer(paramString);
          localObject = paramString.array();
          paramString = new byte[localObject.length / 4 * 3];
          for (j = 0; j < localObject.length / 4; j++)
          {
            paramString[(j * 3)] = ((byte)localObject[(j * 4 + 2)]);
            paramString[(j * 3 + 1)] = ((byte)localObject[(j * 4 + 1)]);
            paramString[(j * 3 + 2)] = ((byte)localObject[(j * 4)]);
          }
          int k = paramContext.getWidth();
          j = paramContext.getHeight();
          int m = ALJ.scanImage(paramString, k, j, 3);
          ab.i("MicroMsg.WordDetectModHelper", "data length = %d, w = %d, h = %d, scanImage result %d", new Object[] { Integer.valueOf(paramString.length), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(m) });
          if (m != 0)
          {
            AppMethodBeat.o(138530);
            j = i;
          }
          else
          {
            j = ALJ.getResult();
            ab.i("MicroMsg.WordDetectModHelper", "decodeFile ret = %d, cost %d", new Object[] { Integer.valueOf(j), Long.valueOf(System.currentTimeMillis() - l) });
            AppMethodBeat.o(138530);
          }
        }
      }
      catch (Exception paramContext)
      {
        ab.e("MicroMsg.WordDetectModHelper", "Detect Word Error, e: %s", new Object[] { paramContext.getMessage() });
        AppMethodBeat.o(138530);
        j = i;
      }
    }
  }

  private static WordDetectNative.ConfigParam jw(Context paramContext)
  {
    AppMethodBeat.i(138529);
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      String str = com.tencent.mm.compatible.util.e.eSi.replace("/data/user/0", "/data/data") + "files/";
      localObject1 = new java/io/File;
      ((File)localObject1).<init>(str, "word_detect");
      if (!((File)localObject1).exists())
        ((File)localObject1).mkdirs();
      str = ((File)localObject1).getAbsolutePath();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = str + "/net_fc.bin";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = str + "/net_fc.param";
      localObject2 = ah.doB();
      boolean bool = ((SharedPreferences)localObject2).getBoolean("word_detect_mode_version_2", false);
      if (!bool)
      {
        com.tencent.mm.a.e.deleteFile((String)localObject1);
        com.tencent.mm.a.e.deleteFile(str);
        ((SharedPreferences)localObject2).edit().putBoolean("word_detect_mode_version_2", true).apply();
      }
      if ((!bool) || (!com.tencent.mm.a.e.ct((String)localObject1)))
      {
        m.copyAssets(paramContext, "qbar/net_fc.bin", (String)localObject1);
        m.copyAssets(paramContext, "qbar/net_fc.param", str);
      }
      paramContext = new com/tencent/worddetect/WordDetectNative$ConfigParam;
      paramContext.<init>();
      paramContext.detect_model_bin = ((String)localObject1);
      paramContext.detect_model_param = str;
      AppMethodBeat.o(138529);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.w("MicroMsg.WordDetectModHelper", "getWordDetectParam err %s", new Object[] { paramContext.getMessage() });
        paramContext = null;
        AppMethodBeat.o(138529);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.worddetect.a
 * JD-Core Version:    0.6.2
 */