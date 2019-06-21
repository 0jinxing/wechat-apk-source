package com.tencent.mm.ui.chatting;

import TT;;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.k;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.d.a;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.modelvideo.t.a.a;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.fav.b.c.a.a;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMFragment;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class ac<T>
{
  private String yLB = "";

  private void a(final T paramT, final com.tencent.mm.plugin.fav.b.c.a parama, String paramString1, String paramString2, String paramString3, final String paramString4, String paramString5, final bi parambi, final HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(30938);
    ab.i("MicroMsg.FavMsgHandle", "oreh downloadTpUrl msgId:%d, mediaId:%s, path:%s", new Object[] { Long.valueOf(parambi.field_msgId), paramString5, paramString4 });
    paramHashSet.add(paramString5);
    com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
    localg.field_fileType = 19;
    localg.field_authKey = paramString3;
    localg.field_aesKey = paramString2;
    localg.egm = paramString1;
    localg.field_fullpath = paramString4;
    localg.field_mediaId = paramString5;
    localg.egl = new g.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, com.tencent.mm.i.c paramAnonymousc, com.tencent.mm.i.d paramAnonymousd, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(30926);
        int i = 0;
        int j = i;
        if (paramAnonymousInt == 0)
        {
          j = i;
          if (paramAnonymousd != null)
          {
            j = i;
            if (paramAnonymousd.field_retCode == 0)
            {
              ab.i("MicroMsg.FavMsgHandle", "oreh downloadTpUrl done msgId:%d, mediaId:%s, path:%s", new Object[] { Long.valueOf(parambi.field_msgId), paramAnonymousString, paramString4 });
              j = 1;
            }
          }
        }
        if (paramAnonymousInt == 0)
        {
          i = j;
          if (paramAnonymousd != null)
          {
            i = j;
            if (paramAnonymousd.field_retCode == 0);
          }
        }
        else
        {
          long l = parambi.field_msgId;
          paramAnonymousc = paramString4;
          if (paramAnonymousd != null)
            break label181;
          j = 0;
          ab.e("MicroMsg.FavMsgHandle", "oreh downloadTpUrl error msgId:%d, mediaId:%s, path:%s, err:(%d,%d)", new Object[] { Long.valueOf(l), paramAnonymousString, paramAnonymousc, Integer.valueOf(paramAnonymousInt), Integer.valueOf(j) });
          i = 1;
        }
        if (i == 0)
          AppMethodBeat.o(30926);
        while (true)
        {
          return 0;
          label181: j = paramAnonymousd.field_retCode;
          break;
          paramHashSet.remove(paramAnonymousString);
          if (paramHashSet.isEmpty())
            new ak(Looper.getMainLooper()).post(new ac.1.1(this));
          AppMethodBeat.o(30926);
        }
      }

      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
      }

      public final byte[] l(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        return new byte[0];
      }
    };
    if (!com.tencent.mm.al.f.afx().b(localg, -1))
      ab.e("MicroMsg.FavMsgHandle", "recv openim record, add task failed");
    AppMethodBeat.o(30938);
  }

  private static boolean aM(bi parambi)
  {
    AppMethodBeat.i(30934);
    parambi = com.tencent.mm.at.o.ahl().fI(parambi.field_msgSvrId);
    boolean bool;
    if ((parambi.offset < parambi.frO) || (parambi.frO == 0))
    {
      bool = false;
      AppMethodBeat.o(30934);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(30934);
    }
  }

  private static boolean aN(bi parambi)
  {
    AppMethodBeat.i(30935);
    parambi = u.ut(parambi.field_imgPath);
    boolean bool;
    if ((parambi != null) && (parambi.status != 199))
    {
      bool = false;
      AppMethodBeat.o(30935);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(30935);
    }
  }

  public static boolean aO(bi parambi)
  {
    AppMethodBeat.i(30936);
    boolean bool;
    if ((!ad.aox(parambi.field_talker)) && (!ad.aox(bf.oy(parambi.field_content))))
    {
      AppMethodBeat.o(30936);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (parambi.bAA())
      {
        Object localObject = j.b.me(parambi.field_content);
        if ((((j.b)localObject).type == 6) && (!bo.isNullOrNil(((j.b)localObject).fgu)))
        {
          localObject = l.d(parambi, ((j.b)localObject).csD);
          if ((localObject != null) && ((!com.tencent.mm.vfs.e.ct(((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath)) || (com.tencent.mm.vfs.e.asZ(((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath) != ((com.tencent.mm.pluginsdk.model.app.b)localObject).field_totalLen)))
          {
            AppMethodBeat.o(30936);
            bool = false;
          }
        }
        else if (((j.b)localObject).type == 19)
        {
          Iterator localIterator = n.VI(((j.b)localObject).fgU).fjr.iterator();
          while (true)
            if (localIterator.hasNext())
            {
              localObject = (aar)localIterator.next();
              String str = n.c((aar)localObject, parambi.field_msgId);
              if ((!bo.isNullOrNil(((aar)localObject).whr)) && (!com.tencent.mm.vfs.e.ct(str)))
              {
                AppMethodBeat.o(30936);
                bool = false;
                break;
              }
              str = n.f((aar)localObject, parambi.field_msgId);
              if ((!bo.isNullOrNil(((aar)localObject).fgv)) && (!com.tencent.mm.vfs.e.ct(str)))
              {
                AppMethodBeat.o(30936);
                bool = false;
                break;
              }
            }
        }
      }
      else if ((parambi.drE()) && (!aM(parambi)))
      {
        AppMethodBeat.o(30936);
        bool = false;
      }
      else if (((parambi.bws()) || (parambi.bwt())) && (!aN(parambi)))
      {
        AppMethodBeat.o(30936);
        bool = false;
      }
      else
      {
        AppMethodBeat.o(30936);
        bool = true;
      }
    }
  }

  public final void a(final T paramT, Context paramContext, final com.tencent.mm.plugin.fav.b.c.a parama)
  {
    AppMethodBeat.i(30937);
    Object localObject1 = parama.csG.field_msgId + " ";
    if (((String)localObject1).equals(this.yLB))
    {
      com.tencent.mm.ui.base.t.makeText(paramContext, paramContext.getString(2131299578), 0).show();
      AppMethodBeat.o(30937);
    }
    while (true)
    {
      return;
      this.yLB = ((String)localObject1);
      if (parama.csG.bAA())
      {
        paramContext = j.b.me(parama.csG.field_content);
        Object localObject2;
        if ((paramContext.type == 6) && (!bo.isNullOrNil(paramContext.fgu)))
        {
          localObject1 = l.d(parama.csG, paramContext.csD);
          if ((localObject1 != null) && ((!com.tencent.mm.vfs.e.ct(((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath)) || (com.tencent.mm.vfs.e.asZ(((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath) != ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_totalLen)))
          {
            localObject2 = new com.tencent.mm.i.g();
            ((com.tencent.mm.i.g)localObject2).egl = new g.a()
            {
              public final int a(String paramAnonymousString, int paramAnonymousInt, com.tencent.mm.i.c paramAnonymousc, com.tencent.mm.i.d paramAnonymousd, boolean paramAnonymousBoolean)
              {
                AppMethodBeat.i(30933);
                if ((paramAnonymousInt == 0) && (paramAnonymousc != null))
                {
                  this.yIN.field_offset = paramAnonymousc.field_finishedLength;
                  am.aUq().a(this.yIN, new String[0]);
                }
                if ((paramAnonymousInt == 0) && (paramAnonymousd != null) && (paramAnonymousd.field_retCode == 0))
                {
                  this.yIN.field_status = 199L;
                  this.yIN.field_offset = this.yIN.field_totalLen;
                  am.aUq().a(this.yIN, new String[0]);
                  parama.csG.setStatus(3);
                  aw.ZK();
                  com.tencent.mm.model.c.XO().a(parama.csG.field_msgId, parama.csG);
                  new ak(Looper.getMainLooper()).post(new ac.4.1(this));
                }
                AppMethodBeat.o(30933);
                return 0;
              }

              public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
              {
              }

              public final byte[] l(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
              {
                return new byte[0];
              }
            };
            ((com.tencent.mm.i.g)localObject2).field_mediaId = com.tencent.mm.al.c.a("checkExist", bo.anU(), parama.csG.field_talker, parama.csG.field_msgId);
            ((com.tencent.mm.i.g)localObject2).field_aesKey = paramContext.eyr;
            ((com.tencent.mm.i.g)localObject2).field_fileType = 19;
            ((com.tencent.mm.i.g)localObject2).field_authKey = paramContext.fgA;
            ((com.tencent.mm.i.g)localObject2).egm = paramContext.fgu;
            if ((localObject1 != null) && (!bo.isNullOrNil(((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath)));
            for (((com.tencent.mm.i.g)localObject2).field_fullpath = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath; ; ((com.tencent.mm.i.g)localObject2).field_fullpath = l.X(com.tencent.mm.model.c.Ye(), paramContext.title, paramContext.fgp))
            {
              if (!com.tencent.mm.al.f.afx().b((com.tencent.mm.i.g)localObject2, -1))
                ab.e("MicroMsg.FavMsgHandle", "openim attach download failed before rescend");
              AppMethodBeat.o(30937);
              break;
              aw.ZK();
            }
          }
        }
        else if (paramContext.type == 19)
        {
          localObject1 = n.VI(paramContext.fgU);
          paramContext = new HashSet();
          if ((localObject1 != null) && (((com.tencent.mm.protocal.b.a.c)localObject1).fjr != null))
          {
            localObject1 = ((com.tencent.mm.protocal.b.a.c)localObject1).fjr.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (aar)((Iterator)localObject1).next();
              String str1 = n.c((aar)localObject2, parama.csG.field_msgId);
              String str2;
              if ((!bo.isNullOrNil(((aar)localObject2).whr)) && (!com.tencent.mm.vfs.e.ct(str1)))
              {
                str2 = n.h(((aar)localObject2).mnd, parama.csG.field_msgId, true);
                a(paramT, parama, ((aar)localObject2).whr, ((aar)localObject2).who, ((aar)localObject2).fgA, str1, str2, parama.csG, paramContext);
              }
              str1 = n.f((aar)localObject2, parama.csG.field_msgId);
              if ((!bo.isNullOrNil(((aar)localObject2).fgv)) && (!com.tencent.mm.vfs.e.ct(str1)))
              {
                str2 = n.h(n.LA(((aar)localObject2).mnd), parama.csG.field_msgId, true);
                a(paramT, parama, ((aar)localObject2).fgv, ((aar)localObject2).fgB, ((aar)localObject2).fgA, str1, str2, parama.csG, paramContext);
              }
            }
          }
          if (!paramContext.isEmpty())
            AppMethodBeat.o(30937);
        }
      }
      else
      {
        int i;
        if (parama.csG.drE())
        {
          localObject1 = com.tencent.mm.at.o.ahl().fI(parama.csG.field_msgSvrId);
          if (parama.csG.field_isSend == 1)
            if (((com.tencent.mm.at.e)localObject1).agQ())
            {
              i = 1;
              label644: if ((((com.tencent.mm.at.e)localObject1).offset >= ((com.tencent.mm.at.e)localObject1).frO) && (((com.tencent.mm.at.e)localObject1).frO != 0))
                break label803;
              ab.i("MicroMsg.FavMsgHandle", "oreh downloadImgAndFav start  msgID:%d", new Object[] { Long.valueOf(parama.csG.field_msgId) });
              com.tencent.mm.at.o.ahm().a(((com.tencent.mm.at.e)localObject1).fDy, parama.csG.field_msgId, i, parama.csG, 2130838182, new d.a()
              {
                public final void a(long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject)
                {
                  AppMethodBeat.i(30931);
                  ab.i("MicroMsg.FavMsgHandle", "oreh downloadImgAndFav download image taskcancel: msgID:%d", new Object[] { Long.valueOf(parama.csG.field_msgId) });
                  AppMethodBeat.o(30931);
                }

                public final void a(long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject, int paramAnonymousInt3, int paramAnonymousInt4, m paramAnonymousm)
                {
                }

                public final void a(long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject, int paramAnonymousInt3, int paramAnonymousInt4, String paramAnonymousString, m paramAnonymousm)
                {
                  AppMethodBeat.i(30930);
                  if ((paramAnonymousInt3 == 0) && (paramAnonymousInt4 == 0));
                  for (boolean bool = true; ; bool = false)
                  {
                    ab.i("MicroMsg.FavMsgHandle", "oreh downloadImreportHandler.removeMessagesreportHandler.removeMessagesgAndFav taskEnd image succed: %s, msgID:%d, errType: %s, errCode:%s", new Object[] { Boolean.valueOf(bool), Long.valueOf(parama.csG.field_msgId), Integer.valueOf(paramAnonymousInt3), Integer.valueOf(paramAnonymousInt4) });
                    new ak(Looper.getMainLooper()).post(new Runnable()
                    {
                      public final void run()
                      {
                        AppMethodBeat.i(30929);
                        ac.this.a(ac.3.this.yLD, ac.3.this.yLI);
                        AppMethodBeat.o(30929);
                      }
                    });
                    AppMethodBeat.o(30930);
                    return;
                  }
                }
              });
            }
          label803: for (i = 1; ; i = 0)
          {
            if (i == 0)
              break label809;
            AppMethodBeat.o(30937);
            break;
            i = 0;
            break label644;
            if (!((com.tencent.mm.at.e)localObject1).agQ())
            {
              i = 0;
              break label644;
            }
            paramContext = com.tencent.mm.at.f.a((com.tencent.mm.at.e)localObject1);
            if (!com.tencent.mm.vfs.e.ct(com.tencent.mm.at.o.ahl().q(paramContext.fDz, "", "")))
            {
              i = 0;
              break label644;
            }
            i = 1;
            break label644;
          }
        }
        label809: if ((parama.csG.bws()) || (parama.csG.bwt()))
        {
          paramContext = u.ut(parama.csG.field_imgPath);
          if ((paramContext != null) && (paramContext.status != 199))
          {
            localObject1 = new t.a()
            {
              public final void a(t.a.a paramAnonymousa)
              {
                AppMethodBeat.i(30928);
                if (parama.csG.field_imgPath.equals(paramAnonymousa.fileName))
                {
                  s locals = u.ut(paramAnonymousa.fileName);
                  if ((locals != null) && (locals.alz()))
                  {
                    ab.i("MicroMsg.FavMsgHandle", "oreh downloadVideoAndFav suc msgID:%d, fileName:%s", new Object[] { Long.valueOf(parama.csG.field_msgId), paramAnonymousa.fileName });
                    com.tencent.mm.modelvideo.o.all().a(this);
                    new ak(Looper.getMainLooper()).post(new Runnable()
                    {
                      public final void run()
                      {
                        AppMethodBeat.i(30927);
                        ac.this.a(ac.2.this.yLD, ac.2.this.yLE);
                        AppMethodBeat.o(30927);
                      }
                    });
                    AppMethodBeat.o(30928);
                  }
                }
                while (true)
                {
                  return;
                  ab.i("MicroMsg.FavMsgHandle", "oreh downloadVideoAndFav fialed msgID:%d, fileName:%s", new Object[] { Long.valueOf(parama.csG.field_msgId), paramAnonymousa.fileName });
                  AppMethodBeat.o(30928);
                }
              }
            };
            com.tencent.mm.modelvideo.o.all().a((t.a)localObject1, Looper.getMainLooper());
            ab.i("MicroMsg.FavMsgHandle", "oreh downloadVideoAndFav start  msgID:%d, fileName:%s", new Object[] { Long.valueOf(parama.csG.field_msgId), parama.csG.field_imgPath });
            if (paramContext.aly())
            {
              ab.i("MicroMsg.FavMsgHandle", "start complete online video");
              u.uA(parama.csG.field_imgPath);
            }
          }
          label938: for (i = 1; ; i = 0)
          {
            if (i == 0)
              break label983;
            AppMethodBeat.o(30937);
            break;
            ab.i("MicroMsg.FavMsgHandle", "start complete offline video");
            u.up(parama.csG.field_imgPath);
            break label938;
          }
        }
        label983: this.yLB = "";
        a(paramT, parama);
        AppMethodBeat.o(30937);
      }
    }
  }

  final void a(T paramT, com.tencent.mm.plugin.fav.b.c.a parama)
  {
    AppMethodBeat.i(30939);
    this.yLB = "";
    Object localObject = new cl();
    com.tencent.mm.pluginsdk.model.e.d((cl)localObject, parama.csG);
    if ((paramT instanceof MMFragment))
      ((cl)localObject).cvA.fragment = ((MMFragment)paramT);
    while (true)
    {
      ((cl)localObject).cvA.cvH = 43;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      long l;
      if (((cl)localObject).cvB.ret == 0)
      {
        if (!parama.csG.bAA())
          break label493;
        com.tencent.mm.modelstat.b.fRa.b(parama.csG, k.k(parama.csG));
        if ((parama.csG.bAA()) || (parama.csG.drC()))
        {
          String str = v.nW(parama.csG.field_msgSvrId);
          paramT = v.Zp().y(str, true);
          paramT.j("prePublishId", "msg_" + parama.csG.field_msgSvrId);
          paramT.j("preUsername", com.tencent.mm.ui.chatting.viewitems.c.a(parama.csG, parama.mgQ, parama.mgP));
          paramT.j("preChatName", parama.talker);
          paramT.j("preMsgIndex", Integer.valueOf(0));
          paramT.j("sendAppMsgScene", Integer.valueOf(1));
          ((i)com.tencent.mm.kernel.g.K(i.class)).a("adExtStr", paramT, parama.csG);
          ((cl)localObject).cvA.cvF = str;
        }
        localObject = j.b.me(bo.anj(parama.csG.field_content));
        if ((localObject != null) && (((j.b)localObject).type == 5) && (((j.b)localObject).url != null))
        {
          l = bo.anT();
          ab.d("MicroMsg.FavMsgHandle", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), ((j.b)localObject).url, Long.valueOf(l), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(1) });
          paramT = "";
        }
      }
      try
      {
        localObject = URLEncoder.encode(((j.b)localObject).url, "UTF-8");
        paramT = (TT)localObject;
        com.tencent.mm.plugin.report.service.h.pYm.e(13378, new Object[] { paramT, Long.valueOf(l), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(1) });
        if (parama.mgR != null)
          parama.mgR.bvs();
        a.a(a.c.yFG, a.d.yFL, parama.csG, 0);
        AppMethodBeat.o(30939);
        return;
        if (!(paramT instanceof Activity))
          continue;
        ((cl)localObject).cvA.activity = ((Activity)paramT);
        continue;
        label493: com.tencent.mm.modelstat.b.fRa.D(parama.csG);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.FavMsgHandle", localUnsupportedEncodingException, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ac
 * JD-Core Version:    0.6.2
 */