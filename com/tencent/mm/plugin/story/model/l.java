package com.tencent.mm.plugin.story.model;

import a.k.d;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.FileSystem.a;
import com.tencent.mm.vfs.e;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryFileNameUtil;", "", "()V", "MIX_AUDIO_FILE", "", "MIX_CP_DIR", "MIX_DIR", "MIX_THUMB_FILE", "MIX_VIDEO_FILE", "PICFILE", "PIC_FILE", "TAG", "TMP_FILE", "UP_FILE", "VIDEOFILE", "VIDEO_FILE", "selfName", "getSelfName", "()Ljava/lang/String;", "setSelfName", "(Ljava/lang/String;)V", "accMixStoryPath", "accPath", "audioEnsurePath", "parentPath", "mediaId", "autoPath", "user", "cachePath", "checkSelfName", "checkToCreateDir", "", "newVideoPath", "noMedia", "", "cleanFiles", "copyCacheDir", "path", "dumpCacheDir", "Lkotlin/Pair;", "", "subDir", "getMixAudioPath", "localId", "getMixThumbPath", "getMixVideoPath", "init", "isNoMedia", "name", "isSelf", "userName", "primaryPathVideoPath", "username", "reset", "testCreateFiles", "thumbEnsurePath", "thumbPath", "url", "thumbPathInDownload", "thumbPathInUpload", "videoEnsurePath", "videoPath", "videoPathInDownload", "videoPathInUpload", "plugin-story_release"})
public final class l
{
  private static String ecX;
  public static final l rTg;

  static
  {
    AppMethodBeat.i(109117);
    rTg = new l();
    ecX = "";
    AppMethodBeat.o(109117);
  }

  private static o<String, Long> aaA(String paramString)
  {
    AppMethodBeat.i(109115);
    com.tencent.mm.ab.a locala = new com.tencent.mm.ab.a("dumpCacheDir");
    Object localObject1 = new StringBuilder();
    Object localObject2 = j.rST;
    localObject1 = j.a.getAccStoryCachePath() + paramString;
    ab.i("MicroMsg.StoryFileNameUtil", "dumpCacheDir cache ".concat(String.valueOf(localObject1)));
    localObject1 = e.cl((String)localObject1, true);
    if ((localObject1 != null) && (((List)localObject1).size() > 1))
      a.a.j.a((List)localObject1, (Comparator)new a());
    long l1 = 0L;
    long l2 = l1;
    if (localObject1 != null)
    {
      localObject2 = (Iterable)localObject1;
      int i = 0;
      localObject2 = ((Iterable)localObject2).iterator();
      while (true)
      {
        l2 = l1;
        if (!((Iterator)localObject2).hasNext())
          break;
        Object localObject3 = ((Iterator)localObject2).next();
        if (i < 0)
          a.a.j.dWs();
        localObject3 = (FileSystem.a)localObject3;
        l2 = l1;
        if (localObject3 != null)
        {
          ab.i("MicroMsg.StoryFileNameUtil", "dumpCacheDir " + i + " filePath: " + ((FileSystem.a)localObject3).name + " time: " + ((FileSystem.a)localObject3).zYM + " size: " + bo.ga(((FileSystem.a)localObject3).size) + ' ' + ((FileSystem.a)localObject3).zYK);
          String str = ((FileSystem.a)localObject3).name;
          a.f.b.j.o(str, "fileEntry.name");
          l2 = l1;
          if (!aaz(str))
            l2 = l1 + ((FileSystem.a)localObject3).size;
        }
        i++;
        l1 = l2;
      }
    }
    localObject2 = new StringBuilder("dumpCacheDir ").append(paramString).append(" totalSize ").append(bo.ga(l2)).append(" fileCounts ");
    if (localObject1 != null);
    for (paramString = Integer.valueOf(((List)localObject1).size()); ; paramString = null)
    {
      paramString = paramString + " cost:" + locala + " \n";
      ab.i("MicroMsg.StoryFileNameUtil", paramString);
      paramString = new o(paramString, Long.valueOf(l2));
      AppMethodBeat.o(109115);
      return paramString;
    }
  }

  public static String aar(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(109101);
    CharSequence localCharSequence = (CharSequence)paramString;
    int j;
    if ((localCharSequence == null) || (localCharSequence.length() == 0))
    {
      j = 1;
      if (j == 0)
      {
        localCharSequence = (CharSequence)ecX;
        if ((localCharSequence != null) && (localCharSequence.length() != 0))
          break label123;
        j = 1;
        label54: if (j == 0)
          break label133;
        paramString = (CharSequence)ecX;
        j = i;
        if (paramString != null)
        {
          if (paramString.length() != 0)
            break label128;
          j = i;
        }
        label82: if (j != 0)
        {
          paramString = j.rST;
          ecX = j.a.cnk();
        }
      }
      label96: j = 0;
      label98: if (j == 0)
        break label148;
      paramString = j.rST;
      paramString = j.a.getAccStoryPath();
      AppMethodBeat.o(109101);
    }
    while (true)
    {
      return paramString;
      j = 0;
      break;
      label123: j = 0;
      break label54;
      label128: j = 0;
      break label82;
      label133: if (!a.f.b.j.j(ecX, paramString))
        break label96;
      j = 1;
      break label98;
      label148: paramString = j.rST;
      paramString = j.a.getAccStoryCachePath();
      AppMethodBeat.o(109101);
    }
  }

  public static String aas(String paramString)
  {
    AppMethodBeat.i(109106);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(109106);
    }
    while (true)
    {
      return paramString;
      StringBuilder localStringBuilder = new StringBuilder();
      j.a locala = j.rST;
      paramString = gv(j.a.getAccStoryPath(), paramString) + ".u";
      AppMethodBeat.o(109106);
    }
  }

  public static String aat(String paramString)
  {
    AppMethodBeat.i(109107);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(109107);
    }
    while (true)
    {
      return paramString;
      StringBuilder localStringBuilder = new StringBuilder();
      j.a locala = j.rST;
      paramString = gw(j.a.getAccStoryPath(), paramString) + ".u";
      AppMethodBeat.o(109107);
    }
  }

  public static final String aau(String paramString)
  {
    AppMethodBeat.i(109108);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(109108);
    }
    while (true)
    {
      return paramString;
      paramString = gw(cyj(), paramString) + ".mixv";
      AppMethodBeat.o(109108);
    }
  }

  public static final String aav(String paramString)
  {
    AppMethodBeat.i(109109);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(109109);
    }
    while (true)
    {
      return paramString;
      paramString = gv(cyj(), paramString) + ".mixt";
      AppMethodBeat.o(109109);
    }
  }

  public static final String aaw(String paramString)
  {
    AppMethodBeat.i(109110);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(109110);
      return paramString;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    String str = cyj();
    if (paramString == null);
    for (paramString = ""; ; paramString = str + paramString + ".p")
    {
      paramString = paramString + ".mixa";
      AppMethodBeat.o(109110);
      break;
    }
  }

  public static void aax(String paramString)
  {
    AppMethodBeat.i(109111);
    a.f.b.j.p(paramString, "newVideoPath");
    int i;
    if (((CharSequence)paramString).length() == 0)
    {
      i = 1;
      if (i == 0)
        break label43;
      AppMethodBeat.o(109111);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label43: paramString = e.atb(paramString);
      e.tf(paramString);
      e.ate(paramString);
      AppMethodBeat.o(109111);
    }
  }

  public static boolean aaz(String paramString)
  {
    AppMethodBeat.i(109113);
    a.f.b.j.p(paramString, "name");
    boolean bool;
    if (a.f.b.j.j(".nomedia", paramString))
    {
      bool = true;
      AppMethodBeat.o(109113);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109113);
    }
  }

  private static String cyj()
  {
    AppMethodBeat.i(109098);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = j.rST;
    localObject = j.a.getAccStoryPath() + "coming/";
    AppMethodBeat.o(109098);
    return localObject;
  }

  static String cyk()
  {
    AppMethodBeat.i(138747);
    Object localObject = j.rST;
    localObject = j.a.getAccStoryPath();
    AppMethodBeat.o(138747);
    return localObject;
  }

  static String cyl()
  {
    AppMethodBeat.i(109100);
    Object localObject = j.rST;
    localObject = j.a.getAccStoryCachePath();
    AppMethodBeat.o(109100);
    return localObject;
  }

  public static String cym()
  {
    AppMethodBeat.i(109114);
    new com.tencent.mm.ab.a("dumpCacheDir");
    o localo = aaA("/pic/");
    Object localObject = aaA("/video/");
    StringBuilder localStringBuilder = new StringBuilder().append((String)localo.first).append("  ").append((String)((o)localObject).first).append(" total: ");
    long l = ((Number)localo.second).longValue();
    localObject = bo.my(((Number)((o)localObject).second).longValue() + l);
    AppMethodBeat.o(109114);
    return localObject;
  }

  public static void cyn()
  {
    AppMethodBeat.i(109116);
    Object localObject1 = j.rST;
    localObject1 = j.a.getAccStoryCachePath();
    ab.i("MicroMsg.StoryFileNameUtil", "dumpCacheDir cache ".concat(String.valueOf(localObject1)));
    List localList = e.cl((String)localObject1, true);
    for (int i = 0; i < 100; i++)
    {
      a.f.b.j.o(localList, "files");
      Iterator localIterator = ((Iterable)localList).iterator();
      for (int j = 0; localIterator.hasNext(); j++)
      {
        Object localObject2 = localIterator.next();
        if (j < 0)
          a.a.j.dWs();
        localObject2 = (FileSystem.a)localObject2;
        String str = ((FileSystem.a)localObject2).name;
        a.f.b.j.o(str, "it.name");
        if (!aaz(str))
        {
          e.y(((FileSystem.a)localObject2).zYK, ((FileSystem.a)localObject2).zYK + System.currentTimeMillis());
          if (j > 2)
            break;
        }
      }
    }
    ab.i("MicroMsg.StoryFileNameUtil", "testCreateFiles done cache ".concat(String.valueOf(localObject1)));
    AppMethodBeat.o(109116);
  }

  public static String gv(String paramString1, String paramString2)
  {
    AppMethodBeat.i(109102);
    if (paramString2 == null)
    {
      paramString1 = "";
      AppMethodBeat.o(109102);
    }
    while (true)
    {
      return paramString1;
      paramString1 = paramString1 + paramString2 + ".p";
      AppMethodBeat.o(109102);
    }
  }

  private static String gw(String paramString1, String paramString2)
  {
    AppMethodBeat.i(109103);
    if (paramString2 == null)
    {
      paramString1 = "";
      AppMethodBeat.o(109103);
    }
    while (true)
    {
      return paramString1;
      paramString1 = paramString1 + paramString2 + ".v";
      AppMethodBeat.o(109103);
    }
  }

  public static String gx(String paramString1, String paramString2)
  {
    AppMethodBeat.i(109104);
    if (paramString1 == null)
    {
      paramString1 = "";
      AppMethodBeat.o(109104);
    }
    while (true)
    {
      return paramString1;
      paramString2 = aar(paramString2) + "/pic/";
      paramString1 = paramString1.getBytes(d.UTF_8);
      a.f.b.j.o(paramString1, "(this as java.lang.String).getBytes(charset)");
      paramString1 = gv(paramString2, g.x(paramString1));
      AppMethodBeat.o(109104);
    }
  }

  public static String gy(String paramString1, String paramString2)
  {
    AppMethodBeat.i(109105);
    if (paramString1 == null)
    {
      paramString1 = "";
      AppMethodBeat.o(109105);
    }
    while (true)
    {
      return paramString1;
      paramString2 = aar(paramString2) + "/video/";
      paramString1 = paramString1.getBytes(d.UTF_8);
      a.f.b.j.o(paramString1, "(this as java.lang.String).getBytes(charset)");
      paramString1 = gw(paramString2, g.x(paramString1));
      AppMethodBeat.o(109105);
    }
  }

  public static void reset()
  {
    ecX = "";
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
  public static final class a<T>
    implements Comparator<T>
  {
    public final int compare(T paramT1, T paramT2)
    {
      AppMethodBeat.i(109097);
      int i = a.b.a.a((Comparable)Long.valueOf(((FileSystem.a)paramT1).zYM), (Comparable)Long.valueOf(((FileSystem.a)paramT2).zYM));
      AppMethodBeat.o(109097);
      return i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.l
 * JD-Core Version:    0.6.2
 */