package com.tencent.mm.plugin.story.model;

import android.content.Context;
import android.database.Cursor;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.h.b;
import com.tencent.mm.plugin.story.h.f;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.h.m;
import com.tencent.mm.plugin.story.h.o;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryCommand;", "Lcom/tencent/mm/pluginsdk/cmd/ProcessorCommand;", "()V", "allUnRead", "", "allmockData", "args", "", "", "([Ljava/lang/String;)V", "cleanDb", "commentClear", "commentDump", "copyFile", "copydb", "createFiles", "delfile", "dumpDbInfo", "dumpFile", "processCommand", "", "context", "Landroid/content/Context;", "username", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "resetFirst", "rsetStoryPostThreshold", "strangerClear", "strangerDump", "strangerRead", "testMakeData", "videoCacheClear", "Companion", "plugin-story_release"})
public final class h
  implements a
{
  public static final h.a rSq;

  static
  {
    AppMethodBeat.i(109033);
    rSq = new h.a((byte)0);
    AppMethodBeat.o(109033);
  }

  private static void H(String[] paramArrayOfString)
  {
    AppMethodBeat.i(109030);
    Object localObject1 = paramArrayOfString[2];
    paramArrayOfString = j.rST;
    paramArrayOfString = j.a.cxU().aap("foreverzeus");
    Object localObject2 = j.rST;
    Object localObject3 = j.a.cxT();
    localObject2 = j.rST;
    localObject2 = k.a((k)localObject3, "foreverzeus", bo.isEqual(j.a.cnk(), "foreverzeus"), cb.aaF() - 86400);
    if (((List)localObject2).isEmpty())
    {
      t.makeText(ah.getContext(), (CharSequence)"allmockData error1", 1).show();
      AppMethodBeat.o(109030);
    }
    while (true)
    {
      return;
      localObject1 = com.tencent.mm.model.n.my((String)localObject1);
      if (localObject1 != null)
      {
        localObject1 = ((Iterable)localObject1).iterator();
        if (((Iterator)localObject1).hasNext())
        {
          localObject3 = (String)((Iterator)localObject1).next();
          Object localObject4 = j.rST;
          localObject4 = j.a.cxU();
          a.f.b.j.o(localObject3, "it");
          localObject4 = ((com.tencent.mm.plugin.story.h.g)localObject4).aap((String)localObject3);
          int i = (int)((f)localObject4).xDa;
          if (!((f)localObject4).isValid())
          {
            paramArrayOfString.setUserName((String)localObject3);
            paramArrayOfString.field_storyPostTime = ((int)bo.yz());
            paramArrayOfString.xDa = -1L;
            if (i >= 0)
              break label275;
            localObject4 = j.rST;
            j.a.cxU().b((com.tencent.mm.sdk.e.c)paramArrayOfString);
          }
          while (true)
          {
            localObject4 = (com.tencent.mm.plugin.story.h.j)((List)localObject2).get(0);
            ((com.tencent.mm.plugin.story.h.j)localObject4).field_userName = ((String)localObject3);
            ((com.tencent.mm.plugin.story.h.j)localObject4).field_createTime = cb.aaF();
            cfb localcfb = ((com.tencent.mm.plugin.story.h.j)localObject4).cBR();
            localcfb.jBB = ((String)localObject3);
            ((com.tencent.mm.plugin.story.h.j)localObject4).b(localcfb);
            ((com.tencent.mm.plugin.story.h.j)localObject4).cNE = -1;
            localObject3 = j.rST;
            j.a.cxT().b((com.tencent.mm.sdk.e.c)localObject4);
            break;
            label275: localObject4 = j.rST;
            j.a.cxU().b(i * 1L, paramArrayOfString);
          }
        }
      }
      t.makeText(ah.getContext(), (CharSequence)"allmockData done", 1).show();
      AppMethodBeat.o(109030);
    }
  }

  private static void I(String[] paramArrayOfString)
  {
    AppMethodBeat.i(109031);
    int i = bo.ank(paramArrayOfString[2]);
    ab.i("MicroMsg.StoryCommand", "testMakeData datacount ".concat(String.valueOf(i)));
    paramArrayOfString = j.rST;
    Object localObject1 = j.a.cxT();
    paramArrayOfString = j.rST;
    paramArrayOfString = k.a((k)localObject1, "ychengo", bo.isEqual(j.a.cnk(), "ychengo"), cb.aaF() - 86400);
    for (int j = 0; j < i; j++)
    {
      localObject1 = (com.tencent.mm.plugin.story.h.j)paramArrayOfString.get(0);
      ((com.tencent.mm.plugin.story.h.j)localObject1).field_userName = "ychengo";
      ((com.tencent.mm.plugin.story.h.j)localObject1).field_createTime = cb.aaF();
      Object localObject2 = ((com.tencent.mm.plugin.story.h.j)localObject1).cBR();
      ((cfb)localObject2).jBB = "ychengo";
      ((com.tencent.mm.plugin.story.h.j)localObject1).b((cfb)localObject2);
      ((com.tencent.mm.plugin.story.h.j)localObject1).cNE = -1;
      localObject2 = j.rST;
      j.a.cxT().b((com.tencent.mm.sdk.e.c)localObject1);
    }
    t.makeText(ah.getContext(), (CharSequence)"testMakeData done ".concat(String.valueOf(i)), 1).show();
    AppMethodBeat.o(109031);
  }

  private static void cxD()
  {
    AppMethodBeat.i(109025);
    Object localObject = j.rST;
    Iterator localIterator = ((Iterable)j.a.cxW().cBC()).iterator();
    while (localIterator.hasNext())
    {
      localObject = (com.tencent.mm.plugin.story.h.c)localIterator.next();
      ab.i("MicroMsg.StoryCommand", "commentDump " + ((com.tencent.mm.plugin.story.h.c)localObject).field_storyId + ' ' + ((com.tencent.mm.plugin.story.h.c)localObject).field_readCommentId + ' ' + ((com.tencent.mm.plugin.story.h.c)localObject).field_syncCommentId);
    }
    AppMethodBeat.o(109025);
  }

  private static void cxE()
  {
    AppMethodBeat.i(109026);
    Object localObject = j.rST;
    localObject = ((Iterable)j.a.cxW().cBC()).iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.plugin.story.h.c localc = (com.tencent.mm.plugin.story.h.c)((Iterator)localObject).next();
      j.a locala = j.rST;
      j.a.cxW().a((com.tencent.mm.sdk.e.c)localc, new String[0]);
    }
    AppMethodBeat.o(109026);
  }

  private static void cxF()
  {
    AppMethodBeat.i(109027);
    Object localObject1 = j.rST;
    Object localObject2 = j.a.cxX();
    localObject1 = new ArrayList();
    localObject2 = ((o)localObject2).bSd.rawQuery("select * from StoryVideoCacheInfo", null);
    Object localObject3;
    if (localObject2 != null)
    {
      while (((Cursor)localObject2).moveToNext())
      {
        localObject3 = new com.tencent.mm.plugin.story.h.n();
        ((com.tencent.mm.plugin.story.h.n)localObject3).d((Cursor)localObject2);
        ((ArrayList)localObject1).add(localObject3);
      }
      ((Cursor)localObject2).close();
    }
    localObject2 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (com.tencent.mm.plugin.story.h.n)((Iterator)localObject2).next();
      localObject3 = j.rST;
      j.a.cxX().a((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
    }
    AppMethodBeat.o(109027);
  }

  public static void cxG()
  {
    AppMethodBeat.i(109028);
    ab.i("MicroMsg.StoryCommand", "cleanDb");
    j.a locala = j.rST;
    j.a.cxX().cqH();
    locala = j.rST;
    j.a.cxU().cqH();
    locala = j.rST;
    j.a.cxV().cqH();
    locala = j.rST;
    j.a.cxT().cqH();
    locala = j.rST;
    com.tencent.mm.vfs.e.cu(j.a.getAccStoryCachePath());
    AppMethodBeat.o(109028);
  }

  public static void cxH()
  {
    AppMethodBeat.i(109029);
    Object localObject = j.rST;
    j.a.cxT().cqH();
    localObject = j.rST;
    j.a.cxX().cqH();
    localObject = j.rST;
    com.tencent.mm.vfs.e.cu(j.a.getAccStoryCachePath());
    localObject = j.rST;
    Iterator localIterator = ((Iterable)j.a.cxU().cBP()).iterator();
    while (localIterator.hasNext())
    {
      localObject = (f)localIterator.next();
      ((f)localObject).field_readId = 0L;
      ((f)localObject).field_md5 = "";
      ((f)localObject).field_preLoadResource = 0L;
      ((f)localObject).aaT("");
      ((f)localObject).field_preloadStoryId = 0L;
      j.a locala = j.rST;
      j.a.cxU().b(((f)localObject).xDa, (f)localObject);
    }
    ab.i("MicroMsg.StoryCommand", "allUnRead done");
    t.makeText(ah.getContext(), (CharSequence)"allUnRead Done", 1).show();
    AppMethodBeat.o(109029);
  }

  public static void cxI()
  {
    AppMethodBeat.i(109032);
    com.tencent.mm.kernel.e locale = com.tencent.mm.kernel.g.RP();
    a.f.b.j.o(locale, "MMKernel.storage()");
    locale.Ry().set(ac.a.xWy, Integer.valueOf(0));
    AppMethodBeat.o(109032);
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(109024);
    a.f.b.j.p(paramArrayOfString, "args");
    a.f.b.j.p(paramString, "username");
    ab.i("MicroMsg.StoryCommand", a.a.e.a(paramArrayOfString, null, null, null, 0, null, null, 63));
    if (paramArrayOfString.length <= 1)
    {
      AppMethodBeat.o(109024);
      return bool;
    }
    paramContext = paramArrayOfString[1];
    switch (paramContext.hashCode())
    {
    default:
    case -2113815067:
    case 536375440:
    case 2103071987:
    case -2122675824:
    case 1550482439:
    case 1233668806:
    case -505421199:
      label208: 
      do
      {
        do
        {
          AppMethodBeat.o(109024);
          break;
        }
        while (!paramContext.equals("testcopyDb"));
        paramArrayOfString = new StringBuilder();
        paramContext = com.tencent.mm.kernel.g.RP();
        a.f.b.j.o(paramContext, "MMKernel.storage()");
        paramContext = paramContext.Rt() + "StoryMicroMsg.db";
        paramString = new StringBuilder();
        paramArrayOfString = j.rST;
        paramArrayOfString = j.a.getAccStoryPath() + "StoryMicroMsg.db";
        com.tencent.mm.vfs.e.y(paramContext, paramArrayOfString);
        ab.i("MicroMsg.StoryCommand", "copydb ".concat(String.valueOf(paramArrayOfString)));
        t.makeText(ah.getContext(), (CharSequence)"copydb done", 1).show();
        while (true)
        {
          AppMethodBeat.o(109024);
          bool = true;
          break;
          if (!paramContext.equals("allunread"))
            break label208;
          cxH();
          continue;
          if (!paramContext.equals("commentDump"))
            break label208;
          cxD();
          continue;
          if (!paramContext.equals("dumpFile"))
            break label208;
          paramContext = l.rTg;
          l.cym();
          continue;
          if (!paramContext.equals("delfile"))
            break label208;
          paramContext = l.rTg;
          com.tencent.mm.vfs.e.cu(l.cyl());
          continue;
          if (!paramContext.equals("videoCacheClear"))
            break label208;
          cxF();
        }
      }
      while (!paramContext.equals("copyfile"));
      label330: paramArrayOfString = paramArrayOfString[2];
      paramContext = l.rTg;
      l.cym();
      paramContext = l.rTg;
      a.f.b.j.p(paramArrayOfString, "path");
      l.aax(l.cyk() + "cpfiles/");
      paramContext = new File(paramArrayOfString);
      if (!paramContext.exists())
        paramContext = "";
      break;
    case 1368796312:
    case -1699823967:
    case -1522028681:
    case 769522478:
    case -2126867668:
    case 856773767:
    case -1408241804:
    case 149228377:
    case -2127268982:
    case -534114059:
    }
    while (true)
    {
      t.makeText(ah.getContext(), (CharSequence)"copyFile done ".concat(String.valueOf(paramContext)), 1).show();
      break label330;
      if (!paramContext.equals("createFile"))
        break;
      paramContext = l.rTg;
      l.cyn();
      break label330;
      if (!paramContext.equals("resetFirst"))
        break;
      paramContext = com.tencent.mm.kernel.g.RP();
      a.f.b.j.o(paramContext, "MMKernel.storage()");
      paramContext.Ry().set(ac.a.xWB, Integer.valueOf(0));
      paramContext = com.tencent.mm.kernel.g.RP();
      a.f.b.j.o(paramContext, "MMKernel.storage()");
      paramContext.Ry().set(ac.a.xWC, Boolean.FALSE);
      paramContext = com.tencent.mm.kernel.g.RP();
      a.f.b.j.o(paramContext, "MMKernel.storage()");
      paramContext.Ry().set(ac.a.xWD, Boolean.FALSE);
      break label330;
      if (!paramContext.equals("strangerClear"))
        break;
      paramContext = j.rST;
      paramContext = ((Iterable)j.a.cxU().cBP()).iterator();
      while (paramContext.hasNext())
      {
        paramArrayOfString = (f)paramContext.next();
        paramString = j.rST;
        j.a.cxU().a((com.tencent.mm.sdk.e.c)paramArrayOfString, new String[0]);
      }
      if (!paramContext.equals("commentClear"))
        break;
      cxE();
      break label330;
      if (!paramContext.equals("strangerRead"))
        break;
      paramContext = j.rST;
      paramString = ((Iterable)j.a.cxU().cBC()).iterator();
      while (paramString.hasNext())
      {
        paramContext = (f)paramString.next();
        paramContext.field_readId = paramContext.field_syncId;
        paramArrayOfString = j.rST;
        j.a.cxU().b(paramContext);
      }
      if (!paramContext.equals("cleandb"))
        break;
      cxG();
      break label330;
      if (!paramContext.equals("testDumpInfo"))
        break;
      paramContext = j.rST;
      paramContext = j.a.cxX().bSd.rawQuery("select count(*) from StoryVideoCacheInfo", null);
      a.f.b.j.o(paramContext, "cu");
      int i = paramContext.getCount();
      paramContext.close();
      paramContext = "StoryVideoCacheInfo resultData ".concat(String.valueOf(i));
      paramArrayOfString = j.rST;
      paramArrayOfString = j.a.cxT();
      paramString = "select count(*) from " + k.sdP;
      paramArrayOfString = paramArrayOfString.bSd.rawQuery(paramString, null);
      a.f.b.j.o(paramArrayOfString, "cu");
      i = paramArrayOfString.getCount();
      paramArrayOfString.close();
      paramArrayOfString = k.sdP + " resultData " + i;
      ab.i("MicroMsg.StoryCommand", "info1 " + paramContext + " info2 " + paramArrayOfString);
      break label330;
      if (!paramContext.equals("allmakeData"))
        break;
      I(paramArrayOfString);
      break label330;
      if (!paramContext.equals("strangerDump"))
        break;
      paramContext = j.rST;
      paramArrayOfString = ((Iterable)j.a.cxU().cBC()).iterator();
      while (paramArrayOfString.hasNext())
      {
        paramContext = (f)paramArrayOfString.next();
        ab.i("MicroMsg.StoryCommand", "strangerDump " + paramContext.getUserName() + ' ' + paramContext.field_syncId + ' ' + paramContext.field_readId + ' ' + paramContext.field_storyPostTime + ' ' + paramContext.field_updateTime);
      }
      if (!paramContext.equals("allmockData"))
        break;
      H(paramArrayOfString);
      break label330;
      paramContext = l.cyk() + "cpfiles/" + paramContext.getName();
      ab.i("MicroMsg.StoryFileNameUtil", "copy file path " + paramArrayOfString + " newPath " + paramContext);
      com.tencent.mm.vfs.e.y(paramArrayOfString, paramContext);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.h
 * JD-Core Version:    0.6.2
 */