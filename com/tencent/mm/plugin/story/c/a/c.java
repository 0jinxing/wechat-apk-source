package com.tencent.mm.plugin.story.c.a;

import a.f.b.j;
import a.l;
import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.v;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.story.c.b;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.ae;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryEncodeElementConfig;", "Lcom/tencent/mm/plugin/story/config/StoryElementConfig;", "Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryEncodeElementConfig$EncodeConfig;", "()V", "RECORDER_TYPE_FFMPEG", "", "RECORDER_TYPE_MEDIACODEC", "TAG", "", "getTAG", "()Ljava/lang/String;", "findVideoFps", "path", "getElementName", "Lcom/tencent/mm/plugin/story/config/StoryConfigConstant$ElementName;", "initDefaultConfig", "loadConfig", "", "EncodeConfig", "plugin-story_release"})
public final class c extends b<c.a>
{
  private static final String TAG = "MicroMsg.StoryEncodeElementConfig";
  public static final c rRk;

  static
  {
    AppMethodBeat.i(108967);
    rRk = new c();
    TAG = "MicroMsg.StoryEncodeElementConfig";
    AppMethodBeat.o(108967);
  }

  // ERROR //
  private static int ZY(String paramString)
  {
    // Byte code:
    //   0: ldc 62
    //   2: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 64	android/media/MediaExtractor
    //   8: astore_1
    //   9: aload_1
    //   10: invokespecial 65	android/media/MediaExtractor:<init>	()V
    //   13: aload_1
    //   14: astore_2
    //   15: aload_1
    //   16: aload_0
    //   17: invokevirtual 69	android/media/MediaExtractor:setDataSource	(Ljava/lang/String;)V
    //   20: aload_1
    //   21: astore_2
    //   22: aload_1
    //   23: invokevirtual 73	android/media/MediaExtractor:getTrackCount	()I
    //   26: istore_3
    //   27: iconst_0
    //   28: istore 4
    //   30: iload 4
    //   32: iload_3
    //   33: if_icmpge +208 -> 241
    //   36: aload_1
    //   37: astore_2
    //   38: aload_1
    //   39: iload 4
    //   41: invokevirtual 77	android/media/MediaExtractor:getTrackFormat	(I)Landroid/media/MediaFormat;
    //   44: astore_0
    //   45: aload_1
    //   46: astore_2
    //   47: aload_0
    //   48: ldc 79
    //   50: invokevirtual 85	android/media/MediaFormat:containsKey	(Ljava/lang/String;)Z
    //   53: ifeq +17 -> 70
    //   56: aload_1
    //   57: astore_2
    //   58: aload_0
    //   59: ldc 79
    //   61: invokevirtual 89	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   64: invokestatic 94	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   67: ifeq +9 -> 76
    //   70: iinc 4 1
    //   73: goto -43 -> 30
    //   76: aload_1
    //   77: astore_2
    //   78: aload_0
    //   79: ldc 79
    //   81: invokevirtual 89	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   84: astore 5
    //   86: aload_1
    //   87: astore_2
    //   88: getstatic 52	com/tencent/mm/plugin/story/c/a/c:TAG	Ljava/lang/String;
    //   91: ldc 96
    //   93: iconst_1
    //   94: anewarray 98	java/lang/Object
    //   97: dup
    //   98: iconst_0
    //   99: aload 5
    //   101: aastore
    //   102: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: aload_1
    //   106: astore_2
    //   107: aload 5
    //   109: ldc 79
    //   111: invokestatic 108	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   114: aload_1
    //   115: astore_2
    //   116: aload 5
    //   118: ldc 110
    //   120: invokestatic 116	a/k/m:jb	(Ljava/lang/String;Ljava/lang/String;)Z
    //   123: ifeq -53 -> 70
    //   126: aload_1
    //   127: astore_2
    //   128: aload_0
    //   129: ldc 118
    //   131: invokevirtual 121	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   134: istore 4
    //   136: aload_1
    //   137: astore_2
    //   138: getstatic 52	com/tencent/mm/plugin/story/c/a/c:TAG	Ljava/lang/String;
    //   141: ldc 123
    //   143: iconst_1
    //   144: anewarray 98	java/lang/Object
    //   147: dup
    //   148: iconst_0
    //   149: iload 4
    //   151: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   154: aastore
    //   155: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: aload_1
    //   159: invokevirtual 132	android/media/MediaExtractor:release	()V
    //   162: ldc 62
    //   164: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   167: iload 4
    //   169: ireturn
    //   170: astore 5
    //   172: aconst_null
    //   173: astore_0
    //   174: aload_0
    //   175: astore_2
    //   176: getstatic 52	com/tencent/mm/plugin/story/c/a/c:TAG	Ljava/lang/String;
    //   179: aload 5
    //   181: checkcast 134	java/lang/Throwable
    //   184: ldc 136
    //   186: iconst_0
    //   187: anewarray 98	java/lang/Object
    //   190: invokestatic 140	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   193: aload_0
    //   194: ifnull +7 -> 201
    //   197: aload_0
    //   198: invokevirtual 132	android/media/MediaExtractor:release	()V
    //   201: ldc 62
    //   203: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   206: iconst_0
    //   207: istore 4
    //   209: goto -42 -> 167
    //   212: astore_0
    //   213: aconst_null
    //   214: astore_2
    //   215: aload_2
    //   216: ifnull +7 -> 223
    //   219: aload_2
    //   220: invokevirtual 132	android/media/MediaExtractor:release	()V
    //   223: ldc 62
    //   225: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: aload_0
    //   229: athrow
    //   230: astore_0
    //   231: goto -16 -> 215
    //   234: astore 5
    //   236: aload_1
    //   237: astore_0
    //   238: goto -64 -> 174
    //   241: iconst_0
    //   242: istore 4
    //   244: goto -86 -> 158
    //
    // Exception table:
    //   from	to	target	type
    //   5	13	170	java/lang/Exception
    //   5	13	212	finally
    //   15	20	230	finally
    //   22	27	230	finally
    //   38	45	230	finally
    //   47	56	230	finally
    //   58	70	230	finally
    //   78	86	230	finally
    //   88	105	230	finally
    //   107	114	230	finally
    //   116	126	230	finally
    //   128	136	230	finally
    //   138	158	230	finally
    //   176	193	230	finally
    //   15	20	234	java/lang/Exception
    //   22	27	234	java/lang/Exception
    //   38	45	234	java/lang/Exception
    //   47	56	234	java/lang/Exception
    //   58	70	234	java/lang/Exception
    //   78	86	234	java/lang/Exception
    //   88	105	234	java/lang/Exception
    //   107	114	234	java/lang/Exception
    //   116	126	234	java/lang/Exception
    //   128	136	234	java/lang/Exception
    //   138	158	234	java/lang/Exception
  }

  public final void Uv()
  {
    AppMethodBeat.i(108965);
    Object localObject1 = (c.a)Ut();
    Object localObject2 = com.tencent.mm.plugin.story.proxy.d.sbf;
    com.tencent.mm.plugin.story.proxy.d.czO();
    localObject2 = com.tencent.mm.plugin.story.proxy.d.getVideoPara();
    j.p(localObject2, "<set-?>");
    ((c.a)localObject1).rRl = ((VideoTransPara)localObject2);
    localObject1 = ((c.a)Ut()).rRl;
    ((c.a)Ut()).eTi = ((VideoTransPara)localObject1).width;
    localObject2 = (c.a)Ut();
    Object localObject3 = com.tencent.mm.media.i.d.fan;
    int i = ((VideoTransPara)localObject1).width;
    localObject3 = ae.hy(ah.getContext());
    ((c.a)localObject2).eTj = (i * ((Point)localObject3).y / ((Point)localObject3).x);
    if (((c.a)Ut()).eTj % 16 != 0)
      ((c.a)Ut()).eTj = com.tencent.mm.plugin.mmsight.d.yN(((c.a)Ut()).eTj);
    if (((c.a)Ut()).eTi % 16 != 0)
      ((c.a)Ut()).eTi = com.tencent.mm.plugin.mmsight.d.yN(((c.a)Ut()).eTi);
    ((c.a)Ut()).rRl.width = ((c.a)Ut()).eTi;
    ((c.a)Ut()).rRl.height = ((c.a)Ut()).eTj;
    ((c.a)Ut()).videoBitrate = ((VideoTransPara)localObject1).videoBitrate;
    ((c.a)Ut()).fzS = ((VideoTransPara)localObject1).fzS;
    ((c.a)Ut()).eTk = ((VideoTransPara)localObject1).fps;
    ((c.a)Ut()).fzT = ((VideoTransPara)localObject1).fzT;
    ((c.a)Ut()).duration = ((VideoTransPara)localObject1).duration;
    ((c.a)Ut()).fzV = ((VideoTransPara)localObject1).fzV;
    ((c.a)Ut()).fzU = ((VideoTransPara)localObject1).fzU;
    ((c.a)Ut()).isDefault = ((VideoTransPara)localObject1).isDefault;
    ((c.a)Ut()).fAf = ((VideoTransPara)localObject1).fAf;
    ((c.a)Ut()).audioSampleRate = ((VideoTransPara)localObject1).audioSampleRate;
    localObject2 = (c.a)Ut();
    j.p("StoryCheckSendVideoBitrateLimit", "key");
    if (ah.bqo())
    {
      localObject1 = g.K(a.class);
      j.o(localObject1, "MMKernel.service<IConfig…onfigService::class.java)");
    }
    for (float f = bo.getFloat(((a)localObject1).Nu().getValue("StoryCheckSendVideoBitrateLimit"), 1.3F); ; f = bo.getFloat(CaptureMMProxy.getInstance().getDynamicConfig("StoryCheckSendVideoBitrateLimit"), 1.3F))
    {
      ((c.a)localObject2).rRm = f;
      if (q.etk.etz != -1)
        ((c.a)Ut()).etz = q.etk.etz;
      if (bp.dpL())
      {
        localObject2 = (c.a)Ut();
        localObject1 = g.RP();
        j.o(localObject1, "MMKernel.storage()");
        ((c.a)localObject2).etz = ((com.tencent.mm.kernel.e)localObject1).Ry().getInt(ac.a.xUN, 2);
      }
      ab.i(TAG, "loadConfigFromVideoParam: " + (c.a)Ut());
      AppMethodBeat.o(108965);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.c.a.c
 * JD-Core Version:    0.6.2
 */