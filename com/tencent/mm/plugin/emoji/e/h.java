package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.preference.PreferenceManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.by.a.b;
import com.tencent.mm.g.a.cz;
import com.tencent.mm.g.a.cz.b;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.emoji.f.n;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI;
import com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureUploadManager.UploadTask;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.protocal.protobuf.cab;
import com.tencent.mm.protocal.protobuf.cac;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.aq;
import com.tencent.mm.storage.aq.a;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.SmileyInfo;
import com.tencent.mm.storage.emotion.q;
import com.tencent.mm.storage.emotion.r;
import com.tencent.mm.storage.emotion.s;
import com.tencent.mm.storage.emotion.u;
import com.tencent.mm.storage.z;
import com.tencent.recovery.util.Util;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class h
  implements com.tencent.mm.pluginsdk.a.d
{
  private static void a(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(52895);
    if (paramString1.equals("-1"))
    {
      ab.e("MicroMsg.emoji.EmojiMgrImpl", "showEmoji fail cause md5 is no valid");
      AppMethodBeat.o(52895);
    }
    EmojiInfo localEmojiInfo;
    while (true)
    {
      return;
      localEmojiInfo = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqi(paramString1);
      if (localEmojiInfo != null)
        break;
      ab.e("MicroMsg.emoji.EmojiMgrImpl", "showEmoji fail cause md5 is no valid");
      AppMethodBeat.o(52895);
    }
    Intent localIntent = new Intent(paramContext, CustomSmileyPreviewUI.class);
    localIntent.putExtra("custom_smiley_preview_md5", paramString1);
    if (paramString2 != null)
      localIntent.putExtra("custom_smiley_preview_appid", paramString2);
    while (true)
    {
      localIntent.putExtra("custom_smiley_preview_appname", paramString3);
      localIntent.putExtra("msg_id", paramLong);
      localIntent.putExtra("msg_content", paramString5);
      paramString1 = paramString4;
      if (com.tencent.mm.model.t.kH(paramString4))
      {
        paramString1 = com.tencent.mm.model.bf.oy(paramString5);
        localIntent.putExtra("room_id", paramString6);
      }
      localIntent.putExtra("msg_sender", paramString1);
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(52895);
      break;
      localIntent.putExtra("custom_smiley_preview_appid", localEmojiInfo.field_app_id);
    }
  }

  public final EmojiInfo Jd(String paramString)
  {
    AppMethodBeat.i(52888);
    paramString = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqi(paramString);
    AppMethodBeat.o(52888);
    return paramString;
  }

  public final EmojiInfo Je(String paramString)
  {
    AppMethodBeat.i(52889);
    paramString = Jd(paramString);
    AppMethodBeat.o(52889);
    return paramString;
  }

  public final String Jf(String paramString)
  {
    AppMethodBeat.i(52900);
    paramString = EmojiLogic.Jf(paramString);
    AppMethodBeat.o(52900);
    return paramString;
  }

  public final List<EmojiInfo> Jg(String paramString)
  {
    AppMethodBeat.i(52903);
    if (com.tencent.mm.kernel.g.RP().isSDCardAvailable())
    {
      paramString = (ArrayList)com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.Jg(paramString);
      AppMethodBeat.o(52903);
    }
    while (true)
    {
      return paramString;
      paramString = new ArrayList();
      AppMethodBeat.o(52903);
    }
  }

  public final String Jh(String paramString)
  {
    AppMethodBeat.i(52905);
    paramString = com.tencent.mm.plugin.emoji.model.j.getEmojiDescMgr().Jh(paramString);
    AppMethodBeat.o(52905);
    return paramString;
  }

  public final boolean Ji(String paramString)
  {
    AppMethodBeat.i(52906);
    boolean bool;
    if ((paramString != null) && (paramString.equals("capture")))
    {
      bool = true;
      AppMethodBeat.o(52906);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYo.aqc(paramString);
      AppMethodBeat.o(52906);
    }
  }

  public final ArrayList<String> Jj(String paramString)
  {
    AppMethodBeat.i(52907);
    aq localaq = com.tencent.mm.plugin.emoji.model.j.getEmojiDescMgr();
    if (!localaq.mInit)
      localaq.dsY();
    long l = System.currentTimeMillis();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int i = com.tencent.mm.ui.tools.f.asg(paramString);
    if ((i < localaq.xXN) || (i > localaq.xXO))
    {
      ab.d("MicroMsg.emoji.EmojiDescNewMgr", "input text over checkout limit.");
      paramString = null;
      AppMethodBeat.o(52907);
    }
    while (true)
    {
      return paramString;
      if ((!bo.isNullOrNil(paramString)) && (localaq.xXS != null))
      {
        paramString = paramString.toLowerCase();
        Object localObject = new ArrayList();
        if (localaq.xXR.containsKey(paramString))
          ((ArrayList)localObject).addAll((Collection)localaq.xXQ.get(localaq.xXR.get(paramString)));
        while (true)
        {
          paramString = ((ArrayList)localObject).iterator();
          while (paramString.hasNext())
          {
            localObject = (String)paramString.next();
            localObject = (ArrayList)localaq.xXS.get(localObject);
            if ((localObject != null) && (!((ArrayList)localObject).isEmpty()))
              localArrayList1.addAll((Collection)localObject);
          }
          ((ArrayList)localObject).add(paramString);
        }
      }
      if (!localArrayList1.isEmpty())
      {
        Collections.sort(localArrayList1, localaq.xXT);
        for (i = 0; i < localArrayList1.size(); i++)
          localArrayList2.add(((aq.a)localArrayList1.get(i)).cvZ);
      }
      ab.d("MicroMsg.emoji.EmojiDescNewMgr", "cpan[check desc]User time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(52907);
      paramString = localArrayList2;
    }
  }

  public final String Jk(String paramString)
  {
    AppMethodBeat.i(52908);
    paramString = EmojiLogic.Jk(paramString);
    AppMethodBeat.o(52908);
    return paramString;
  }

  public final String Jl(String paramString)
  {
    AppMethodBeat.i(52909);
    paramString = EmojiLogic.Jl(paramString);
    AppMethodBeat.o(52909);
    return paramString;
  }

  public final int Jm(String paramString)
  {
    AppMethodBeat.i(52910);
    int i = EmojiLogic.Jm(paramString);
    AppMethodBeat.o(52910);
    return i;
  }

  public final String Jn(String paramString)
  {
    AppMethodBeat.i(52911);
    paramString = EmojiLogic.Jn(paramString);
    AppMethodBeat.o(52911);
    return paramString;
  }

  public final void Jo(String paramString)
  {
    AppMethodBeat.i(52922);
    if (bo.isNullOrNil(paramString))
      ab.i("MicroMsg.emoji.EmojiCommandMgr", "emoji command is null.");
    Object localObject1;
    if ("sync".equalsIgnoreCase(paramString))
    {
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJf, Boolean.TRUE);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJk, Boolean.TRUE);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJl, Boolean.TRUE);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJo, Long.valueOf(System.currentTimeMillis()));
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJp, Long.valueOf(System.currentTimeMillis()));
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJe, Long.valueOf(0L));
      com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.emoji.f.e(0), 0);
      com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.emoji.f.e(1), 0);
      localObject1 = new n(8, null, 15, true);
      com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject1, 0);
      if (!bp.dpL())
        break label2498;
      if (!"new".equalsIgnoreCase(paramString))
        break label1045;
      com.tencent.mm.x.c.PK().x(262147, true);
      com.tencent.mm.kernel.g.RP().Ry().set(208899, Boolean.TRUE);
      com.tencent.mm.kernel.g.RP().Ry().set(229633, "http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM5eOptD4jIj72I8icMVEKwzSYkC30IgjMvSibGfqsEdy0ibXayiaZtbibSXV5EPZEWILOvbrjjLtQ9P4QQ/0");
      com.tencent.mm.kernel.g.RP().Ry().set(229634, System.currentTimeMillis());
      AppMethodBeat.o(52922);
    }
    while (true)
    {
      Object localObject4;
      Object localObject5;
      while (true)
      {
        return;
        if ("rcheart".equalsIgnoreCase(paramString))
        {
          com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYo.duN();
          break;
        }
        if ("recover".equalsIgnoreCase(paramString))
        {
          ab.i("MicroMsg.emoji.EmojiCommandMgr", "recover   begin");
          com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.hi(ah.getContext());
          com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYo.hi(ah.getContext());
          ab.i("MicroMsg.emoji.EmojiCommandMgr", "recover   end");
          break;
        }
        if ("clean".equalsIgnoreCase(paramString))
        {
          ab.i("MicroMsg.emoji.EmojiCommandMgr", "begin clean");
          e.bjJ().Jc(com.tencent.mm.plugin.emoji.h.b.Yb());
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJk, Boolean.TRUE);
          ab.i("MicroMsg.emoji.EmojiCommandMgr", "end clean");
          break;
        }
        if ("dump".equalsIgnoreCase(paramString))
        {
          ab.i("MicroMsg.emoji.EmojiCommandMgr", "begin dump emoji db info:");
          localObject1 = (ArrayList)com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYo.duz();
          if (((ArrayList)localObject1).size() > 0)
          {
            int i = ((ArrayList)localObject1).size();
            for (int j = 0; j < i; j++)
              ab.i("MicroMsg.emoji.EmojiCommandMgr", "i:%d group info:%s", new Object[] { Integer.valueOf(j), ((EmojiGroupInfo)((ArrayList)localObject1).get(j)).toString() });
          }
          Object localObject2 = null;
          localObject1 = null;
          try
          {
            localObject4 = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.baR();
            if (localObject4 != null)
            {
              localObject1 = localObject4;
              localObject2 = localObject4;
              if (((Cursor)localObject4).moveToFirst())
              {
                boolean bool;
                do
                {
                  localObject1 = localObject4;
                  localObject2 = localObject4;
                  localObject5 = new com/tencent/mm/storage/emotion/EmojiInfo;
                  localObject1 = localObject4;
                  localObject2 = localObject4;
                  ((EmojiInfo)localObject5).<init>();
                  localObject1 = localObject4;
                  localObject2 = localObject4;
                  ((EmojiInfo)localObject5).d((Cursor)localObject4);
                  localObject1 = localObject4;
                  localObject2 = localObject4;
                  ab.i("MicroMsg.emoji.EmojiCommandMgr", "emoji info:%s", new Object[] { ((EmojiInfo)localObject5).toString() });
                  localObject1 = localObject4;
                  localObject2 = localObject4;
                  bool = ((Cursor)localObject4).moveToNext();
                }
                while (bool);
              }
            }
            if (localObject4 != null)
              ((Cursor)localObject4).close();
            ab.i("MicroMsg.emoji.EmojiCommandMgr", "end dump emoji db info:");
            break;
          }
          catch (Exception localException)
          {
            while (true)
              if (localObject1 != null)
                ((Cursor)localObject1).close();
          }
          finally
          {
            if (localException != null)
              localException.close();
            AppMethodBeat.o(52922);
          }
        }
      }
      Object localObject3;
      if ("config".equalsIgnoreCase(paramString))
      {
        b.c.dif().f(37, 1, -1, false);
        b.c.dif().f(37, 2, -1, false);
        b.c.dif().f(37, 4, -1, false);
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJw, Integer.valueOf(0));
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJx, Integer.valueOf(0));
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJz, Integer.valueOf(0));
        localObject1 = new com.tencent.mm.pluginsdk.g.a.a.m(37);
        com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject1, 0);
        localObject1 = new com.tencent.mm.g.a.bf();
        ((com.tencent.mm.g.a.bf)localObject1).cus.filePath = (com.tencent.mm.compatible.util.e.eSn + "CheckResUpdate/37.1.data.decompressed");
        ((com.tencent.mm.g.a.bf)localObject1).cus.cut = 37;
        ((com.tencent.mm.g.a.bf)localObject1).cus.cuu = 1;
        localObject3 = new com.tencent.mm.g.a.bf();
        ((com.tencent.mm.g.a.bf)localObject3).cus.filePath = (com.tencent.mm.compatible.util.e.eSn + "CheckResUpdate/37.2.data.decompressed");
        ((com.tencent.mm.g.a.bf)localObject3).cus.cut = 37;
        ((com.tencent.mm.g.a.bf)localObject3).cus.cuu = 2;
        j.bkb();
        j.a((com.tencent.mm.g.a.bf)localObject1, true);
        j.bkb();
        j.b((com.tencent.mm.g.a.bf)localObject3, true);
        com.tencent.mm.vfs.e.deleteFile(com.tencent.mm.cb.b.xFA);
        break;
      }
      if ("tuzki".equalsIgnoreCase(paramString))
      {
        com.tencent.mm.plugin.emoji.f.a.bkq();
        com.tencent.mm.plugin.emoji.f.a.bkr();
        break;
      }
      if (!paramString.startsWith("reset-first"))
        break;
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVw, Boolean.FALSE);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVx, Boolean.FALSE);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVy, Boolean.FALSE);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVz, Boolean.FALSE);
      break;
      label1045: if ("free".equalsIgnoreCase(paramString))
      {
        com.tencent.mm.x.c.PK().x(262149, true);
        com.tencent.mm.kernel.g.RP().Ry().set(208913, Boolean.TRUE);
        com.tencent.mm.kernel.g.RP().Ry().set(229633, "http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM5eOptD4jIj72I8icMVEKwzSYkC30IgjMvSibGfqsEdy0ibXayiaZtbibSXV5EPZEWILOvbrjjLtQ9P4QQ/0");
        com.tencent.mm.kernel.g.RP().Ry().set(229634, System.currentTimeMillis());
        AppMethodBeat.o(52922);
      }
      else if ("newp".equalsIgnoreCase(paramString))
      {
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJj, Boolean.TRUE);
        AppMethodBeat.o(52922);
      }
      else if ("newpe".equalsIgnoreCase(paramString))
      {
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJn, Boolean.TRUE);
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("add"))
      {
        b.Ja(paramString);
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("backup"))
      {
        paramString = new com.tencent.mm.plugin.emoji.f.c(0, 1, Arrays.asList(paramString.replace("backup", "").trim().split(",")));
        com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("h5"))
      {
        paramString = paramString.replace("h5", "").trim();
        PreferenceManager.getDefaultSharedPreferences(ah.getContext()).edit().putString("h5", paramString).commit();
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("md5"))
      {
        localObject1 = paramString.replace("md5", "").trim();
        paramString = (String)localObject1;
        if (bo.isNullOrNil((String)localObject1))
          paramString = "/sdcard/test.png";
        ab.i("MicroMsg.emoji.EmojiCommandMgr", com.tencent.mm.a.g.v(new File(paramString)));
        ab.i("MicroMsg.emoji.EmojiCommandMgr", ag.ck(paramString));
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("recommend"))
      {
        paramString = com.tencent.mm.plugin.emoji.g.d.JG("<NewRecommendEmotion><Emotion><ProductID>com.tencent.xin.emoticon.person.stiker_144984189945aa5830d33cd7dc</ProductID><RecType>3</RecType><Name>野萌君</Name><Icon>http://mmbiz.qpic.cn/mmemoticon/duc2TvpEgSTWy4k8MnuicFjyiazriaGWDX52HzNWeLVTjtJcjZeZEicTn5kJFPYdicWZTuUZJgiaADK9I/0</Icon><Panel>http://mmbiz.qpic.cn/mmemoticon/DhduwiaBa7lchicgAfwibeykm81eGWXkMDgGJ8DWcOcIc28C7oTic4Y09Pick8Fw69KiaZVxrHl8S2lPY/0</Panel><ButtonType>1</ButtonType></Emotion><Emotion><ProductID>com.tencent.xin.emoticon.person.stiker_14389422638f6ca818af405e21</ProductID><RecType>3</RecType><Name>猪仔和羊妹</Name><Icon>http://mmbiz.qpic.cn/mmemoticon/iaUiazNVkRp7iaZjrMuYgfH8kB5xkyYv20CYzY3W9HCLBr2XybJibGKKtXibMnAfZnRTH/0</Icon><Panel>http://mmbiz.qpic.cn/mmemoticon/PiajxSqBRaEJR9canNKZ7RYI3hx5BPCSwQmuhhlNWD1jzUSOx3CWqEtibd65zOjySd/0</Panel><ButtonType>1</ButtonType></Emotion><Emotion><ProductID>com.tencent.xin.emoticon.person.stiker_1444199720f5ea147582ff0512</ProductID><RecType>3</RecType><Name>让红包飞</Name><Icon>http://mmbiz.qpic.cn/mmemoticon/nMl9ssowtibXLY57PdK8Nsh827vlsw4TGHPgLUehd2R455xnwe3xpoVDIKpAuXU1Aic3XbH1LfMr7fp4DgO7o8IQ/0</Icon><Panel>http://mmbiz.qpic.cn/mmemoticon/duc2TvpEgST18reErFRzNFR8EiahI4Iibp4ZnW1ibJYt4MMLvQvjx3sHGTMuTOgnREq5f2GXLhuzalOOz3icw9NGbA/0</Panel><ButtonType>1</ButtonType></Emotion><Emotion><ProductID>com.tencent.xin.emoticon.xiaobendan</ProductID><RecType>3</RecType><Name>小笨蛋与大坏蛋</Name><Icon>http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLC8ILTt0pqcaCVkldLMydoNJcupoR7qUojia3vKlgd74uQ/0</Icon><Panel>http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLC8ILTt0pqcaAAEUI4a7z5ECqpUXbQw95PY1mpc4p0FxA/0</Panel><ButtonType>1</ButtonType></Emotion><Emotion><ProductID>com.tencent.xin.emoticon.shin2</ProductID><RecType>3</RecType><Name>野原新之助2</Name><Icon>http://mmbiz.qpic.cn/mmemoticon/iciaySdkria4apGIW1wvSbPC9oxWQPHZyicaccx5JDIp2uE/0</Icon><Panel>http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLASEAAX7xw76beia5j4HyA0rq9WgtgscicJo7935UCpCpog/0</Panel><ButtonType>1</ButtonType></Emotion></NewRecommendEmotion>");
        com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYo.duF();
        com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYo.ak(paramString);
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("count"))
      {
        paramString = paramString.replace("count", "").trim();
        com.tencent.mm.m.g.Nu().put("CustomEmojiMaxSize", paramString);
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("auto"))
      {
        paramString = paramString.replace("auto", "").trim();
        com.tencent.mm.m.g.Nu().put("C2CEmojiNotAutoDownloadTimeRange", paramString);
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("bo"))
      {
        if (paramString.replace("bo", "").trim().equalsIgnoreCase("1"))
        {
          PreferenceManager.getDefaultSharedPreferences(ah.getContext()).edit().putBoolean("broken", true).commit();
          AppMethodBeat.o(52922);
        }
        else
        {
          PreferenceManager.getDefaultSharedPreferences(ah.getContext()).edit().putBoolean("broken", false).commit();
          AppMethodBeat.o(52922);
        }
      }
      else if (paramString.startsWith("newsmiley"))
      {
        ArrayList localArrayList = new ArrayList();
        localObject3 = new SmileyInfo("/::AAA", "[机智]", "[机智]", "[机智]", "[机智]", "[机智]", "emoji2.png", 1000);
        localObject5 = new SmileyInfo("/::BBB", "[滑稽]", "[滑稽]", "[滑稽]", "[滑稽]", "[滑稽]", "emoji3.png", 1001);
        SmileyInfo localSmileyInfo = new SmileyInfo("[Pose]", "[摆姿势]", "[摆姿势]", "[摆姿势]", "[摆姿势]", "[摆姿势]", "emoji4.png", 1002);
        paramString = new SmileyInfo("/::DDD", "[瞪]", "[瞪]", "[瞪]", "[瞪]", "[瞪]", "emoji5.png", 1003);
        localObject1 = new SmileyInfo("/::FFF", "[捂脸]", "[捂脸]", "[捂脸]", "[捂脸]", "[捂脸]", "emoji6.png", 1004);
        localObject4 = new SmileyInfo("/::Doge", "[Doge]", "[Doge]", "[Doge]", "[Doge]", "[Doge]", "emoji7.png", 1005);
        localArrayList.add(localObject3);
        localArrayList.add(localObject5);
        localArrayList.add(localSmileyInfo);
        localArrayList.add(paramString);
        localArrayList.add(localObject1);
        localArrayList.add(localObject4);
        com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYv.an(localArrayList);
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("panel"))
      {
        paramString.replace("panel", "").trim();
        paramString = new com.tencent.mm.g.a.bf();
        paramString.cus.cuu = 1;
        paramString.cus.cut = 37;
        paramString.cus.filePath = (com.tencent.mm.compatible.util.e.eSn + "CheckResUpdate/37.1.data");
        com.tencent.mm.sdk.b.a.xxA.m(paramString);
        paramString = new com.tencent.mm.g.a.bf();
        paramString.cus.cuu = 2;
        paramString.cus.cut = 37;
        paramString.cus.filePath = "/sdcard/tencent/MicroMsg/CheckResUpdate/37.2.data";
        com.tencent.mm.sdk.b.a.xxA.m(paramString);
        paramString = new com.tencent.mm.g.a.bf();
        paramString.cus.cuu = 3;
        paramString.cus.cut = 37;
        paramString.cus.filePath = (com.tencent.mm.compatible.util.e.eSn + "CheckResUpdate/37.3.data");
        com.tencent.mm.sdk.b.a.xxA.m(paramString);
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("key"))
      {
        paramString = com.tencent.mm.a.g.x(String.valueOf(System.currentTimeMillis()).getBytes());
        ab.i("MicroMsg.emoji.EmojiCommandMgr", "create key :%s" + bo.anv(paramString));
        com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.MC(153);
        localObject1 = new EmojiInfo();
        ((EmojiInfo)localObject1).field_md5 = paramString;
        ((EmojiInfo)localObject1).field_catalog = 153;
        com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.F((EmojiInfo)localObject1);
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("delete"))
      {
        b.IZ(paramString);
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("delete-db"))
      {
        paramString = paramString.replace("delete-db", "").trim();
        com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqj(paramString);
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("delete-file"))
      {
        b.IY(paramString);
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("batchDownload"))
      {
        paramString = paramString.split(" ");
        if (paramString.length > 1)
        {
          paramString = new com.tencent.mm.plugin.emoji.f.e(bo.ank(paramString[1]));
          com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
        }
        AppMethodBeat.o(52922);
      }
      else if (paramString.startsWith("getInfo"))
      {
        localObject1 = paramString.split(" ");
        if (localObject1.length > 1)
        {
          paramString = new LinkedList();
          paramString.add(localObject1[1]);
          paramString = new com.tencent.mm.plugin.emoji.f.e(paramString);
          com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
        }
        AppMethodBeat.o(52922);
      }
      else
      {
        if (paramString.startsWith("test"))
        {
          ab.i("MicroMsg.emoji.EmojiCommandMgr", "theTest: %s", new Object[] { paramString });
          com.tencent.mm.sdk.g.d.xDG.execute(new b.1());
        }
        label2498: AppMethodBeat.o(52922);
      }
    }
  }

  public final int Jp(String paramString)
  {
    AppMethodBeat.i(52930);
    int i = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.Jp(paramString);
    AppMethodBeat.o(52930);
    return i;
  }

  public final boolean Jq(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(52951);
    com.tencent.mm.plugin.gif.f localf = new com.tencent.mm.plugin.gif.f(paramString);
    int i = com.tencent.mm.a.e.cs(paramString);
    boolean bool2;
    if (i != 0)
      bool2 = bool1;
    try
    {
      if (i <= com.tencent.mm.m.b.Nb())
      {
        bool2 = bool1;
        if (localf.noD[0] <= com.tencent.mm.m.b.Na())
        {
          i = localf.noD[1];
          int j = com.tencent.mm.m.b.Na();
          if (i <= j)
            break label102;
          bool2 = bool1;
        }
      }
      AppMethodBeat.o(52951);
      return bool2;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.emoji.EmojiMgrImpl", bo.l(paramString));
        bool2 = bool1;
        continue;
        label102: bool2 = true;
      }
    }
  }

  public final void Jr(String paramString)
  {
    AppMethodBeat.i(52954);
    if (!bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.emoji.EmojiMgrImpl", "deleteCaptureEmoji md: ".concat(String.valueOf(paramString)));
      com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqj(paramString);
      com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.anF("delete_emoji_info_notify");
    }
    AppMethodBeat.o(52954);
  }

  public final ArrayList<EmojiInfo> OC()
  {
    AppMethodBeat.i(52935);
    ArrayList localArrayList = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYz.OC();
    AppMethodBeat.o(52935);
    return localArrayList;
  }

  public final ArrayList<EmojiGroupInfo> OD()
  {
    AppMethodBeat.i(52932);
    ArrayList localArrayList = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYz.OD();
    AppMethodBeat.o(52932);
    return localArrayList;
  }

  public final boolean OS()
  {
    AppMethodBeat.i(52943);
    boolean bool = com.tencent.mm.emoji.a.e.OS();
    AppMethodBeat.o(52943);
    return bool;
  }

  public final boolean OT()
  {
    AppMethodBeat.i(52944);
    boolean bool;
    if ((bp.dpL()) || (com.tencent.mm.emoji.a.e.OT()))
    {
      bool = true;
      AppMethodBeat.o(52944);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52944);
    }
  }

  public final EmojiInfo a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    AppMethodBeat.i(52898);
    paramString1 = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.e(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3);
    AppMethodBeat.o(52898);
    return paramString1;
  }

  public final String a(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    AppMethodBeat.i(52901);
    paramContext = EmojiLogic.b(paramContext, paramWXMediaMessage, paramString);
    AppMethodBeat.o(52901);
    return paramContext;
  }

  public final void a(Context paramContext, bi parambi, String paramString)
  {
    AppMethodBeat.i(52892);
    if ((paramContext == null) || (parambi == null))
    {
      ab.w("MicroMsg.emoji.EmojiMgrImpl", "context or msg is null");
      AppMethodBeat.o(52892);
    }
    while (true)
    {
      return;
      ap localap = ap.aps(parambi.field_content);
      Object localObject1 = j.b.me(parambi.field_content);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new j.b();
        ((j.b)localObject2).fgq = localap.cvZ;
      }
      localObject1 = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqi(((j.b)localObject2).fgq);
      if (parambi.field_isSend == 1)
      {
        if ((localObject1 != null) && (((EmojiInfo)localObject1).duP()))
        {
          a(paramContext, ((j.b)localObject2).fgq, ((j.b)localObject2).appId, ((j.b)localObject2).appName, parambi.field_msgSvrId, parambi.field_talker, parambi.field_content, paramString);
          AppMethodBeat.o(52892);
        }
        else
        {
          com.tencent.mm.plugin.emoji.model.j.bko().c((j.b)localObject2);
          AppMethodBeat.o(52892);
        }
      }
      else if ((localObject1 != null) && (((EmojiInfo)localObject1).duP()))
      {
        a(paramContext, ((EmojiInfo)localObject1).Aq(), ((j.b)localObject2).appId, ((j.b)localObject2).appName, parambi.field_msgSvrId, parambi.field_talker, parambi.field_content, paramString);
        AppMethodBeat.o(52892);
      }
      else
      {
        com.tencent.mm.plugin.emoji.model.j.bko().c((j.b)localObject2);
        AppMethodBeat.o(52892);
      }
    }
  }

  public final void a(EmojiCaptureUploadManager.UploadTask paramUploadTask)
  {
    AppMethodBeat.i(52955);
    if (paramUploadTask.lgZ == null)
      AppMethodBeat.o(52955);
    while (true)
    {
      return;
      EmojiInfo localEmojiInfo = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.aqi(paramUploadTask.lgZ);
      if (localEmojiInfo == null)
      {
        AppMethodBeat.o(52955);
      }
      else
      {
        paramUploadTask = paramUploadTask.lha;
        ab.d("MicroMsg.emoji.EmojiMgrImpl", "uploadCaptureEmoji emojiInfo.field_md5: " + localEmojiInfo.field_md5);
        paramUploadTask.lgP = System.currentTimeMillis();
        paramUploadTask.ezZ = localEmojiInfo.field_captureEnterTime;
        new com.tencent.mm.emoji.a.d(localEmojiInfo, localEmojiInfo.dvd(), localEmojiInfo.field_imitateMd5, new h.1(this, localEmojiInfo, paramUploadTask));
        AppMethodBeat.o(52955);
      }
    }
  }

  public final void a(cab paramcab)
  {
    AppMethodBeat.i(52928);
    com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYq.b(paramcab);
    AppMethodBeat.o(52928);
  }

  public final void a(String paramString, EmojiInfo paramEmojiInfo, bi parambi)
  {
    AppMethodBeat.i(52894);
    if ((paramEmojiInfo == null) && (parambi == null))
      AppMethodBeat.o(52894);
    while (true)
    {
      return;
      EmojiInfo localEmojiInfo = paramEmojiInfo;
      if (paramEmojiInfo == null)
        localEmojiInfo = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqi(parambi.field_imgPath);
      com.tencent.mm.plugin.emoji.model.j.bkh().a(paramString, localEmojiInfo, parambi);
      AppMethodBeat.o(52894);
    }
  }

  public final boolean a(Context paramContext, EmojiInfo paramEmojiInfo, int paramInt, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(52891);
    if (paramContext == null)
    {
      ab.e("MicroMsg.emoji.EmojiMgrImpl", "[cpan] save emoji failed. context is null");
      AppMethodBeat.o(52891);
    }
    while (true)
    {
      return bool;
      if (paramEmojiInfo == null)
      {
        ab.e("MicroMsg.emoji.EmojiMgrImpl", "[cpan] save emoji failed. emoji is null");
        AppMethodBeat.o(52891);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setClass(paramContext, EmojiAddCustomDialogUI.class);
        localIntent.putExtra("extra_id", paramEmojiInfo.Aq());
        localIntent.putExtra("extra_scence", paramInt);
        localIntent.putExtra("extra_move_to_top", true);
        localIntent.putExtra("extra_username", paramString);
        localIntent.putExtra("extra_current", false);
        localIntent.putExtra("key_is_selfie", false);
        localIntent.putExtra("key_attached_text", null);
        localIntent.putExtra("key_attached_emoji_md5", null);
        localIntent.putExtra("key_imitate_md5", null);
        localIntent.addFlags(65536);
        paramContext.startActivity(localIntent);
        AppMethodBeat.o(52891);
        bool = true;
      }
    }
  }

  public final boolean a(EmojiGroupInfo paramEmojiGroupInfo)
  {
    AppMethodBeat.i(52931);
    boolean bool = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYo.c(paramEmojiGroupInfo, new String[] { "productID" });
    AppMethodBeat.o(52931);
    return bool;
  }

  public final boolean a(String paramString1, String paramString2, long paramLong, String paramString3, e.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(52902);
    com.tencent.mm.plugin.emoji.model.d locald = com.tencent.mm.plugin.emoji.model.j.bkh();
    ab.d("MicroMsg.emoji.EmojiMsgInfo", "parserEmojiXml ".concat(String.valueOf(paramString2)));
    paramString1 = as.a(br.z(paramString2, "msg"), paramString1, paramString2, paramString3);
    if (paramString1 == null)
    {
      ab.i("MicroMsg.emoji.EmojiService", "prepareEmoji failed. emoji msg info is null.");
      AppMethodBeat.o(52902);
    }
    while (true)
    {
      return true;
      paramString1.cKK = paramLong;
      ab.i("MicroMsg.emoji.EmojiService", "summerbadcr prepareEmoji msgSvrId[%d], stack[%s]", new Object[] { Long.valueOf(paramLong), bo.dpG() });
      locald.JC(paramString1.cwg);
      if (!EmojiLogic.JB(com.tencent.mm.emoji.a.e.OO()))
        bool = true;
      locald.a(paramString1, parama, bool);
      AppMethodBeat.o(52902);
    }
  }

  public final void b(EmojiCaptureUploadManager.UploadTask paramUploadTask)
  {
    AppMethodBeat.i(52958);
    EmojiInfo localEmojiInfo = Jd(paramUploadTask.lgZ);
    if (localEmojiInfo != null)
    {
      paramUploadTask = com.tencent.mm.emoji.d.d.eAh;
      com.tencent.mm.emoji.d.d.k(localEmojiInfo);
      AppMethodBeat.o(52958);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.emoji.EmojiMgrImpl", "addCaptureEmojiUploadTask: emojiInfo null by md5 %s", new Object[] { paramUploadTask.lgZ });
      AppMethodBeat.o(52958);
    }
  }

  public final ArrayList<EmojiInfo> bY(boolean paramBoolean)
  {
    AppMethodBeat.i(52934);
    ArrayList localArrayList = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().bY(paramBoolean);
    AppMethodBeat.o(52934);
    return localArrayList;
  }

  public final void bZ(String paramString, int paramInt)
  {
    AppMethodBeat.i(52945);
    u localu = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYy;
    if (!Util.isNullOrNil(paramString))
    {
      if (localu.ybh == null)
        localu.dvl();
      com.tencent.mm.storage.emotion.t localt1 = (com.tencent.mm.storage.emotion.t)localu.ybh.get(paramString);
      com.tencent.mm.storage.emotion.t localt2 = localt1;
      if (localt1 == null)
      {
        localt2 = new com.tencent.mm.storage.emotion.t();
        localt2.key = paramString;
        localu.ybh.put(paramString, localt2);
      }
      localt2.position = paramInt;
      localt2.ybg += 1;
      localt2.eRt = System.currentTimeMillis();
      if (localu.ybh == null)
        localu.dvl();
      localu.b("event_update_recent", 0, Integer.valueOf(localu.ybh.size()));
    }
    AppMethodBeat.o(52945);
  }

  public final boolean bjN()
  {
    AppMethodBeat.i(52915);
    boolean bool = com.tencent.mm.emoji.a.e.OL();
    AppMethodBeat.o(52915);
    return bool;
  }

  public final ArrayList<SmileyInfo> bjO()
  {
    AppMethodBeat.i(52916);
    ArrayList localArrayList = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYv.bjO();
    AppMethodBeat.o(52916);
    return localArrayList;
  }

  public final ArrayList<r> bjP()
  {
    AppMethodBeat.i(52917);
    ArrayList localArrayList = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYw.bjP();
    AppMethodBeat.o(52917);
    return localArrayList;
  }

  public final com.tencent.mm.ba.f bjQ()
  {
    AppMethodBeat.i(52921);
    com.tencent.mm.ba.f localf = j.bkb().bjQ();
    AppMethodBeat.o(52921);
    return localf;
  }

  public final boolean bjR()
  {
    AppMethodBeat.i(52923);
    boolean bool;
    if ((bp.dpL()) || (com.tencent.mm.emoji.a.e.OU()))
    {
      bool = true;
      AppMethodBeat.o(52923);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52923);
    }
  }

  public final String bjS()
  {
    AppMethodBeat.i(52924);
    j.bkb();
    String str = j.bjS();
    AppMethodBeat.o(52924);
    return str;
  }

  public final void bjT()
  {
    AppMethodBeat.i(52925);
    j.bkb();
    com.tencent.mm.g.a.bf localbf = new com.tencent.mm.g.a.bf();
    localbf.cus.filePath = (com.tencent.mm.compatible.util.e.eSn + "CheckResUpdate/37.1.data.decompressed");
    localbf.cus.cut = 37;
    localbf.cus.cuu = 1;
    j.a(localbf, j.a.kUw, j.kUa);
    AppMethodBeat.o(52925);
  }

  public final cab bjU()
  {
    AppMethodBeat.i(52927);
    cab localcab = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYq.bjU();
    AppMethodBeat.o(52927);
    return localcab;
  }

  public final int bjV()
  {
    AppMethodBeat.i(52933);
    int i = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().bjV();
    AppMethodBeat.o(52933);
    return i;
  }

  public final com.tencent.mm.at.a.a bjW()
  {
    AppMethodBeat.i(52937);
    com.tencent.mm.at.a.a locala = com.tencent.mm.plugin.emoji.model.j.bjW();
    AppMethodBeat.o(52937);
    return locala;
  }

  public final boolean bjX()
  {
    AppMethodBeat.i(52942);
    boolean bool = com.tencent.mm.emoji.a.e.OR();
    AppMethodBeat.o(52942);
    return bool;
  }

  public final List<com.tencent.mm.storage.emotion.t> bjY()
  {
    AppMethodBeat.i(52946);
    List localList = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYy.bjY();
    AppMethodBeat.o(52946);
    return localList;
  }

  public final void bjZ()
  {
    AppMethodBeat.i(52947);
    u localu = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYy;
    Object localObject = localu.bjY();
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = ((List)localObject).iterator();
    do
    {
      do
      {
        if (!localIterator.hasNext())
          break;
        localObject = (com.tencent.mm.storage.emotion.t)localIterator.next();
      }
      while (((com.tencent.mm.storage.emotion.t)localObject).toJson() == null);
      localJSONArray.put(((com.tencent.mm.storage.emotion.t)localObject).toJson());
    }
    while (localJSONArray.length() < 9);
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVt, localJSONArray.toString());
    localu.ybh = null;
    AppMethodBeat.o(52947);
  }

  public final boolean bka()
  {
    boolean bool = true;
    AppMethodBeat.i(52952);
    int i;
    if (!com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xVz, false))
    {
      i = 1;
      com.tencent.mm.emoji.a.e.isSpringFestivalEnable();
      if (i == 0)
        break label47;
      AppMethodBeat.o(52952);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label47: AppMethodBeat.o(52952);
      bool = false;
    }
  }

  public final <T> T c(ac.a parama, T paramT)
  {
    AppMethodBeat.i(52948);
    parama = com.tencent.mm.kernel.g.RP().Ry().get(parama, paramT);
    AppMethodBeat.o(52948);
    return parama;
  }

  public final boolean c(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    AppMethodBeat.i(52914);
    paramBoolean = f.bjK().c(paramEmojiInfo, paramBoolean);
    AppMethodBeat.o(52914);
    return paramBoolean;
  }

  public final int d(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    AppMethodBeat.i(52926);
    int i;
    if ((paramBoolean) || ((paramEmojiInfo != null) && (paramEmojiInfo.field_activityid != null) && (paramEmojiInfo.field_activityid.startsWith("Selfie:"))))
    {
      i = 1;
      if (i == 0)
        break label57;
      i = com.tencent.mm.m.b.Nb();
      AppMethodBeat.o(52926);
    }
    while (true)
    {
      return i;
      i = 0;
      break;
      label57: i = com.tencent.mm.m.b.MZ();
      AppMethodBeat.o(52926);
    }
  }

  public final void d(ac.a parama, Object paramObject)
  {
    AppMethodBeat.i(52949);
    com.tencent.mm.kernel.g.RP().Ry().set(parama, paramObject);
    AppMethodBeat.o(52949);
  }

  public final as dK(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(52896);
    Map localMap = br.z(paramString1, "msg");
    if (localMap == null)
    {
      ab.w("MicroMsg.emoji.EmojiMgrImpl", "get from xml, but attrs is null");
      AppMethodBeat.o(52896);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      paramString2 = as.a(localMap, paramString2, paramString1, "");
      if (paramString2 == null)
      {
        ab.w("MicroMsg.emoji.EmojiMgrImpl", "parserEmojiXml error ".concat(String.valueOf(paramString1)));
        AppMethodBeat.o(52896);
        paramString1 = localObject;
      }
      else
      {
        AppMethodBeat.o(52896);
        paramString1 = paramString2;
      }
    }
  }

  public final String dL(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52920);
    paramString1 = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), paramString1, paramString2);
    AppMethodBeat.o(52920);
    return paramString1;
  }

  public final void g(k.a parama)
  {
    AppMethodBeat.i(52938);
    com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.d(parama);
    AppMethodBeat.o(52938);
  }

  public final String getAccPath()
  {
    AppMethodBeat.i(52904);
    String str = com.tencent.mm.kernel.g.RP().eJM;
    AppMethodBeat.o(52904);
    return str;
  }

  public final void h(k.a parama)
  {
    AppMethodBeat.i(52939);
    com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.c(parama);
    AppMethodBeat.o(52939);
  }

  public final void i(k.a parama)
  {
    AppMethodBeat.i(52940);
    com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYo.d(parama);
    AppMethodBeat.o(52940);
  }

  public final EmojiInfo j(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(52897);
    paramString = a(paramString, "", paramInt1, paramInt2, paramInt3, "");
    AppMethodBeat.o(52897);
    return paramString;
  }

  public final void j(k.a parama)
  {
    AppMethodBeat.i(52941);
    if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
      com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYo.c(parama);
    AppMethodBeat.o(52941);
  }

  public final void k(k.a parama)
  {
    AppMethodBeat.i(52950);
    com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYy.c(parama);
    AppMethodBeat.o(52950);
  }

  public final ArrayList<EmojiInfo> kS(String paramString)
  {
    AppMethodBeat.i(52936);
    paramString = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYz.kS(paramString);
    AppMethodBeat.o(52936);
    return paramString;
  }

  public final void l(k.a parama)
  {
    AppMethodBeat.i(52953);
    com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYy.d(parama);
    AppMethodBeat.o(52953);
  }

  public final byte[] l(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(52913);
    if (paramEmojiInfo != null)
    {
      EmojiInfo localEmojiInfo = Jd(paramEmojiInfo.field_md5);
      if ((localEmojiInfo != null) && (localEmojiInfo.field_reserved4 != paramEmojiInfo.field_reserved4))
        paramEmojiInfo.field_reserved4 = localEmojiInfo.field_reserved4;
    }
    paramEmojiInfo = f.bjK().l(paramEmojiInfo);
    AppMethodBeat.o(52913);
    return paramEmojiInfo;
  }

  public final EmojiInfo n(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(52890);
    Object localObject = paramEmojiInfo;
    if (paramEmojiInfo.field_catalog == EmojiGroupInfo.yad)
    {
      localObject = paramEmojiInfo;
      if (paramEmojiInfo.field_type == EmojiInfo.yam)
      {
        localObject = paramEmojiInfo;
        if (paramEmojiInfo.getContent().length() > 0)
        {
          localObject = paramEmojiInfo;
          if (EmojiInfo.Mv(bo.getInt(paramEmojiInfo.getContent(), 0)))
          {
            Cursor localCursor = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.MB(bo.getInt(paramEmojiInfo.getContent(), 0));
            EmojiInfo localEmojiInfo = paramEmojiInfo;
            if (localCursor != null)
            {
              localEmojiInfo = paramEmojiInfo;
              if (localCursor.getCount() > 1)
              {
                int i = bo.gV(localCursor.getCount() - 1, 0);
                localEmojiInfo = new EmojiInfo();
                localCursor.moveToPosition(i);
                localEmojiInfo.d(localCursor);
              }
            }
            localObject = localEmojiInfo;
            if (localCursor != null)
            {
              localCursor.close();
              localObject = localEmojiInfo;
            }
          }
        }
      }
    }
    AppMethodBeat.o(52890);
    return localObject;
  }

  public final int o(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(52912);
    int i;
    if (paramEmojiInfo != null)
      if ((paramEmojiInfo.field_catalog == EmojiInfo.yaj) || (String.valueOf(EmojiInfo.yaj).equals(paramEmojiInfo.field_groupId)))
      {
        i = 2130839131;
        AppMethodBeat.o(52912);
      }
    while (true)
    {
      return i;
      if ((paramEmojiInfo.field_catalog == EmojiInfo.yak) || (String.valueOf(EmojiInfo.yak).equals(paramEmojiInfo.field_groupId)))
      {
        i = 2130838495;
        AppMethodBeat.o(52912);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(52912);
      }
    }
  }

  public final void onDestroy()
  {
  }

  public final int[] p(EmojiInfo paramEmojiInfo)
  {
    if (paramEmojiInfo != null)
      if (paramEmojiInfo.field_catalog == EmojiInfo.yaj)
      {
        paramEmojiInfo = new int[3];
        EmojiInfo tmp19_18 = paramEmojiInfo;
        tmp19_18[0] = 2130839133;
        EmojiInfo tmp25_19 = tmp19_18;
        tmp25_19[1] = 2130839134;
        EmojiInfo tmp31_25 = tmp25_19;
        tmp31_25[2] = 2130839132;
        tmp31_25;
      }
    while (true)
    {
      return paramEmojiInfo;
      if (paramEmojiInfo.field_catalog == EmojiInfo.yak)
      {
        paramEmojiInfo = new int[4];
        EmojiInfo tmp55_54 = paramEmojiInfo;
        tmp55_54[0] = 2130838502;
        EmojiInfo tmp61_55 = tmp55_54;
        tmp61_55[1] = 2130838503;
        EmojiInfo tmp67_61 = tmp61_55;
        tmp67_61[2] = 2130838504;
        EmojiInfo tmp73_67 = tmp67_61;
        tmp73_67[3] = 2130838505;
        tmp73_67;
      }
      else
      {
        paramEmojiInfo = null;
      }
    }
  }

  public final void q(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(52956);
    paramEmojiInfo.field_groupId = "capture";
    Object localObject = new ArrayList();
    ((List)localObject).add(paramEmojiInfo.Aq());
    ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.l(1, (List)localObject);
    ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.G(paramEmojiInfo);
    paramEmojiInfo = new cz();
    paramEmojiInfo.cwc.type = 2;
    com.tencent.mm.sdk.b.a.xxA.m(paramEmojiInfo);
    if (!paramEmojiInfo.cwd.cwe)
    {
      cab localcab = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYq.bjU();
      if (localcab != null)
      {
        localObject = localcab.wZl.iterator();
        while (((Iterator)localObject).hasNext())
        {
          paramEmojiInfo = (cac)((Iterator)localObject).next();
          if (paramEmojiInfo.ProductID.equals(String.valueOf("capture")))
            paramEmojiInfo.vKj = 0;
        }
      }
      ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYq.b(localcab);
      com.tencent.mm.by.a.dmE();
      paramEmojiInfo = com.tencent.mm.by.a.xum;
      a.b.alW(String.valueOf("capture"));
    }
    AppMethodBeat.o(52956);
  }

  public final void r(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(52957);
    al.d(new h.2(this, paramEmojiInfo));
    AppMethodBeat.o(52957);
  }

  public final boolean r(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(52893);
    boolean bool;
    if (paramContext == null)
    {
      ab.w("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: context is null");
      AppMethodBeat.o(52893);
      bool = false;
    }
    EmojiInfo localEmojiInfo;
    while (true)
    {
      return bool;
      if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
      {
        ab.w("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: userName or imgPath is null");
        AppMethodBeat.o(52893);
        bool = false;
      }
      else
      {
        localEmojiInfo = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqi(paramString2);
        if (localEmojiInfo != null)
          break;
        ab.w("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: emoji not found, imgPath %s", new Object[] { paramString2 });
        AppMethodBeat.o(52893);
        bool = false;
      }
    }
    if ((localEmojiInfo.field_type == EmojiInfo.yap) || (localEmojiInfo.field_type == EmojiInfo.yaq))
    {
      paramString2 = new WXMediaMessage();
      String str = com.tencent.mm.plugin.emoji.h.b.Yb() + localEmojiInfo.Aq();
      if (com.tencent.mm.vfs.e.ct(str + "_thumb"))
        paramString2.thumbData = com.tencent.mm.vfs.e.e(str + "_thumb", 0, -1);
      while (true)
      {
        paramString2.mediaObject = new WXEmojiObject(str);
        paramContext = new py();
        paramContext.cMe.cEl = paramString2;
        paramContext.cMe.appId = localEmojiInfo.field_app_id;
        paramContext.cMe.appName = null;
        paramContext.cMe.toUser = paramString1;
        paramContext.cMe.cMf = 0;
        paramContext.cMe.cMi = localEmojiInfo.Aq();
        com.tencent.mm.sdk.b.a.xxA.m(paramContext);
        AppMethodBeat.o(52893);
        bool = true;
        break;
        paramString2.setThumbImage(localEmojiInfo.hk(paramContext));
      }
    }
    paramString2 = localEmojiInfo;
    if (localEmojiInfo.field_type == EmojiInfo.yam)
    {
      if (!EmojiInfo.Mv(localEmojiInfo.field_catalog))
        break label433;
      paramContext = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.MB(localEmojiInfo.field_catalog);
    }
    while (true)
    {
      paramString2 = localEmojiInfo;
      if (paramContext != null)
      {
        int i = bo.gV(paramContext.getCount() - 1, 0);
        paramString2 = new EmojiInfo();
        paramContext.moveToPosition(i);
        paramString2.d(paramContext);
        paramContext.close();
      }
      com.tencent.mm.plugin.emoji.model.j.bkh().a(paramString1, paramString2, null);
      break;
      label433: if ((localEmojiInfo.field_catalog == EmojiInfo.yah) && (localEmojiInfo.getContent().length() > 0) && (EmojiInfo.Mv(bo.getInt(localEmojiInfo.getContent(), 0))))
        paramContext = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.MB(bo.getInt(localEmojiInfo.getContent(), 0));
      else
        paramContext = null;
    }
  }

  public final void updateEmojiInfo(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(52899);
    com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.G(paramEmojiInfo);
    AppMethodBeat.o(52899);
  }

  public final boolean w(ArrayList<SmileyInfo> paramArrayList)
  {
    AppMethodBeat.i(52918);
    boolean bool = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYv.an(paramArrayList);
    AppMethodBeat.o(52918);
    return bool;
  }

  public final boolean x(ArrayList<r> paramArrayList)
  {
    AppMethodBeat.i(52919);
    s locals = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYw;
    boolean bool;
    if ((paramArrayList == null) || (paramArrayList.size() <= 0))
    {
      ab.i("MicroMsg.emoji.SmileyPanelConfigInfoStorage", "insertSmileyConfigInfoList failed. list is null.");
      bool = false;
      AppMethodBeat.o(52919);
      label41: return bool;
    }
    com.tencent.mm.cd.h localh;
    long l;
    if ((locals.bSd instanceof com.tencent.mm.cd.h))
    {
      localh = (com.tencent.mm.cd.h)locals.bSd;
      l = localh.iV(Thread.currentThread().getId());
    }
    while (true)
    {
      locals.bSd.delete("SmileyPanelConfigInfo", null, null);
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
        locals.b((r)paramArrayList.next());
      int i = -1;
      if (localh != null)
        i = localh.mB(l);
      if (i < 0)
        break;
      bool = true;
      AppMethodBeat.o(52919);
      break label41;
      l = -1L;
      localh = null;
    }
  }

  public final int y(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(52929);
    int i = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.y(paramBoolean1, paramBoolean2);
    AppMethodBeat.o(52929);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.h
 * JD-Core Version:    0.6.2
 */