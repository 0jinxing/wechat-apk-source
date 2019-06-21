package com.tencent.mm.plugin.story.e;

import a.f.b.j;
import a.l;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.q;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.ae;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/data/StoryUtil$Companion;", "", "()V", "B_PRE", "", "INVALID_GEO", "", "getINVALID_GEO", "()F", "LOCAL_PATH_PRE", "getLOCAL_PATH_PRE", "()Ljava/lang/String;", "RESPONE_COUNT", "TAG", "bitmapAvailable", "", "bm", "Landroid/graphics/Bitmap;", "dumpMedia", "media", "Lcom/tencent/mm/protocal/protobuf/StoryMediaObj;", "exportVideo", "", "videoPath", "getFullStrSeq", "stringSeq", "getStoryResponeCount", "", "getVideoInfo", "Lcom/tencent/mm/plugin/story/data/StoryUtil$Companion$VideoInfo;", "path", "getVideoMIME", "longToFullString", "seq", "", "longToString", "VideoInfo", "plugin-story_release"})
public final class c$a
{
  public static void aai(String paramString)
  {
    AppMethodBeat.i(108994);
    j.p(paramString, "videoPath");
    if (g.RP().Ry().getBoolean(ac.a.xPV, true))
    {
      String str = com.tencent.mm.plugin.mmsight.d.RL("mp4");
      j.o(str, "MMSightUtil.getExportImagePath(\"mp4\")");
      ab.i(c.access$getTAG$cp(), "auto save " + paramString + " exportPath " + str, new Object[] { paramString, str });
      com.tencent.mm.vfs.e.y(paramString, str);
      q.a(str, ah.getContext());
    }
    AppMethodBeat.o(108994);
  }

  public static c.a.a aaj(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(108995);
    j.p(paramString, "path");
    a locala = com.tencent.mm.plugin.sight.base.d.WR(paramString);
    if (locala == null)
    {
      paramString = null;
      AppMethodBeat.o(108995);
    }
    while (true)
    {
      return paramString;
      if ((locala.height <= 0) || (locala.width <= 0));
      try
      {
        MediaMetadataRetriever localMediaMetadataRetriever = new android/media/MediaMetadataRetriever;
        localMediaMetadataRetriever.<init>();
        localMediaMetadataRetriever.setDataSource(paramString);
        locala.width = bo.getInt(localMediaMetadataRetriever.extractMetadata(18), 0);
        locala.height = bo.getInt(localMediaMetadataRetriever.extractMetadata(19), 0);
        locala.videoBitrate = bo.getInt(localMediaMetadataRetriever.extractMetadata(20), 0);
        localMediaMetadataRetriever.release();
        label104: int i = SightVideoJNI.getMp4Rotate(paramString);
        paramString = ae.hy(ah.getContext());
        int j;
        label135: int k;
        if ((i == 270) || (i == 90))
        {
          j = 1;
          if (j == 0)
            break label232;
          k = locala.height;
          label146: if (j == 0)
            break label241;
          j = locala.width;
          label157: if (Math.abs(k / j - paramString.x / paramString.y) > 0.01D)
            break label250;
        }
        while (true)
        {
          paramString = new c.a.a(locala.width, locala.height, locala.eWK, i, locala.videoBitrate, locala.eTk, bool);
          AppMethodBeat.o(108995);
          break;
          j = 0;
          break label135;
          label232: k = locala.width;
          break label146;
          label241: j = locala.height;
          break label157;
          label250: bool = false;
        }
      }
      catch (Exception localException)
      {
        break label104;
      }
    }
  }

  // ERROR //
  public static String aak(String paramString)
  {
    // Byte code:
    //   0: ldc 230
    //   2: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ldc 155
    //   8: invokestatic 70	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   11: aload_0
    //   12: invokestatic 234	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   15: ifeq +13 -> 28
    //   18: ldc 235
    //   20: astore_0
    //   21: ldc 230
    //   23: invokestatic 149	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   26: aload_0
    //   27: areturn
    //   28: aconst_null
    //   29: astore_1
    //   30: new 237	com/tencent/mm/media/e/a
    //   33: astore_2
    //   34: aload_2
    //   35: aload_0
    //   36: invokespecial 238	com/tencent/mm/media/e/a:<init>	(Ljava/lang/String;)V
    //   39: aload_2
    //   40: invokevirtual 241	com/tencent/mm/media/e/a:UV	()Ljava/lang/String;
    //   43: astore_1
    //   44: aload_1
    //   45: astore_0
    //   46: aload_1
    //   47: ifnonnull +6 -> 53
    //   50: ldc 235
    //   52: astore_0
    //   53: aload_2
    //   54: invokevirtual 242	com/tencent/mm/media/e/a:release	()V
    //   57: ldc 230
    //   59: invokestatic 149	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   62: goto -36 -> 26
    //   65: astore_0
    //   66: aload_1
    //   67: astore_2
    //   68: aload_2
    //   69: ifnull +7 -> 76
    //   72: aload_2
    //   73: invokevirtual 242	com/tencent/mm/media/e/a:release	()V
    //   76: ldc 235
    //   78: astore_0
    //   79: ldc 230
    //   81: invokestatic 149	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   84: goto -58 -> 26
    //   87: astore_2
    //   88: aconst_null
    //   89: astore_0
    //   90: aload_0
    //   91: ifnull +7 -> 98
    //   94: aload_0
    //   95: invokevirtual 242	com/tencent/mm/media/e/a:release	()V
    //   98: ldc 230
    //   100: invokestatic 149	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: aload_2
    //   104: athrow
    //   105: astore_1
    //   106: aload_2
    //   107: astore_0
    //   108: aload_1
    //   109: astore_2
    //   110: goto -20 -> 90
    //   113: astore_0
    //   114: goto -46 -> 68
    //
    // Exception table:
    //   from	to	target	type
    //   30	39	65	java/lang/Exception
    //   30	39	87	finally
    //   39	44	105	finally
    //   39	44	113	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.e.c.a
 * JD-Core Version:    0.6.2
 */