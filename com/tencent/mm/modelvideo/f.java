package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.b;
import com.tencent.mm.g.b.a.x;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.g.a;
import com.tencent.mm.i.g.b;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.n;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bh;
import com.tencent.mm.storage.z;
import java.util.Map;

public final class f
{
  private String cHr;
  long cvx;
  public String cwT;
  String egB;
  private g.b egz;
  private g.a fFk;
  int fVA;
  private String fVB;
  public f.a fVC;
  private com.tencent.mm.i.h fVk;
  boolean fVv;
  String fVw;
  private long fVx;
  long fVy;
  long fVz;

  public f(long paramLong)
  {
    AppMethodBeat.i(50684);
    this.fVv = false;
    this.fFk = new f.1(this);
    this.egz = new f.2(this);
    this.cvx = paramLong;
    this.fVv = true;
    AppMethodBeat.o(50684);
  }

  public f(com.tencent.mm.i.h paramh, String paramString)
  {
    AppMethodBeat.i(50685);
    this.fVv = false;
    this.fFk = new f.1(this);
    this.egz = new f.2(this);
    this.fVk = paramh;
    this.cwT = paramString;
    this.fVv = false;
    AppMethodBeat.o(50685);
  }

  static int e(String paramString, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(50689);
    s locals = u.ut(paramString);
    int j;
    if (locals != null)
    {
      j = locals.cFa;
      if (paramBoolean)
      {
        locals.cFa = paramInt;
        ab.i("MicroMsg.NetScenePreloadVideoFake", "update video info[%s] preload[%d %d %d] isFinish[%b] ", new Object[] { paramString, Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(locals.cFa), Boolean.valueOf(paramBoolean) });
        locals.fXb = bo.anT();
        locals.bJt = 1025;
        u.f(locals);
        if (!paramBoolean)
          break label139;
        paramInt -= j;
        label114: if (paramInt >= 0)
          break label150;
        paramInt = i;
      }
    }
    label139: label150: 
    while (true)
    {
      AppMethodBeat.o(50689);
      while (true)
      {
        return paramInt;
        locals.cFa = (j + paramInt);
        break;
        break label114;
        AppMethodBeat.o(50689);
      }
    }
  }

  private static boolean i(int paramInt, String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(50691);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(50691);
    while (true)
    {
      return bool;
      o.all();
      paramString2 = t.uh(paramString2);
      if ((bo.isNullOrNil(paramString1)) || (paramInt <= 0) || (bo.isNullOrNil(paramString2)) || (!com.tencent.mm.vfs.e.ct(paramString2)))
      {
        ab.w("MicroMsg.NetScenePreloadVideoFake", "insert media duplication but args is error.[%d, %s, %s]", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
        AppMethodBeat.o(50691);
      }
      else
      {
        bool = ((com.tencent.mm.plugin.m.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.m.a.a.class)).XT().y(paramString1, paramInt, paramString2);
        AppMethodBeat.o(50691);
      }
    }
  }

  public final int a(f.a parama)
  {
    AppMethodBeat.i(50688);
    this.fVC = parama;
    label129: label901: 
    try
    {
      ab.i("MicroMsg.NetScenePreloadVideoFake", "%d preload begin msgId[%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.cvx) });
      if (this.fVv)
      {
        parama = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(this.cvx);
        localObject = bf.oE(parama.dqJ);
        if ((localObject == null) || (((bf.b)localObject).fmG <= 0))
        {
          ab.w("MicroMsg.NetScenePreloadVideoFake", "%d msgsource is null", new Object[] { Integer.valueOf(hashCode()) });
          parama = null;
          if (parama != null)
          {
            if (!com.tencent.mm.model.t.kH(parama.egE))
              break label635;
            i = 2;
            this.fVA = i;
            com.tencent.mm.plugin.report.service.h.pYm.a(354L, 140L, 1L, false);
            if (this.fVA != 1)
              break label640;
            com.tencent.mm.plugin.report.service.h.pYm.a(354L, 121L, 1L, false);
          }
        }
        while (true)
        {
          if (this.fVk != null)
            break label1001;
          this.fVk = parama;
          if (parama != null)
            break label713;
          ab.w("MicroMsg.NetScenePreloadVideoFake", "%d preload task is null", new Object[] { Integer.valueOf(hashCode()) });
          i = 0;
          if (i == 0)
            break label671;
          i = 0;
          AppMethodBeat.o(50688);
          return i;
          String str1 = parama.field_imgPath;
          s locals = u.ut(str1);
          if (locals == null)
          {
            parama = null;
            break;
          }
          parama = br.z(locals.alw(), "msg");
          if (parama == null)
          {
            ab.w("MicroMsg.NetScenePreloadVideoFake", "cdntra parse video recv xml failed");
            parama = null;
            break;
          }
          String str2 = (String)parama.get(".msg.videomsg.$cdnvideourl");
          if (bo.isNullOrNil(str2))
          {
            ab.w("MicroMsg.NetScenePreloadVideoFake", "cdntra parse video recv xml failed");
            parama = null;
            break;
          }
          j = Integer.valueOf((String)parama.get(".msg.videomsg.$length")).intValue();
          str3 = (String)parama.get(".msg.videomsg.$md5");
          String str4 = (String)parama.get(".msg.videomsg.$newmd5");
          String str5 = (String)parama.get(".msg.videomsg.$aeskey");
          String str6 = (String)parama.get(".msg.videomsg.$fileparam");
          String str7 = com.tencent.mm.al.c.a("downvideo", locals.createTime, locals.getUser(), locals.getFileName());
          if (bo.isNullOrNil(str7))
          {
            ab.w("MicroMsg.NetScenePreloadVideoFake", "cdntra genClientId failed not use cdn file:%s", new Object[] { locals.getFileName() });
            parama = null;
            break;
          }
          o.all();
          String str8 = t.uh(str1);
          parama = new com/tencent/mm/i/h;
          parama.<init>();
          parama.filename = str1;
          parama.egB = str3;
          parama.egC = j;
          parama.egD = 2;
          parama.cEV = locals.alt();
          parama.egE = locals.getUser();
          if (com.tencent.mm.model.t.kH(locals.getUser()))
          {
            i = n.mA(locals.getUser());
            label520: parama.cEX = i;
            parama.field_mediaId = str7;
            parama.field_fullpath = str8;
            parama.field_fileType = com.tencent.mm.i.a.MediaType_VIDEO;
            parama.field_totalLen = j;
            parama.field_aesKey = str5;
            parama.field_fileId = str2;
            parama.field_priority = com.tencent.mm.i.a.efC;
            parama.field_wxmsgparam = str6;
            if (!com.tencent.mm.model.t.kH(locals.getUser()))
              break label630;
          }
          label630: for (i = 1; ; i = 0)
          {
            parama.field_chattype = i;
            parama.field_autostart = false;
            parama.field_requestVideoFormat = com.tencent.mm.modelcontrol.d.a(2, locals);
            parama.field_preloadRatio = ((bf.b)localObject).fmG;
            parama.cdx = str4;
            break;
            i = 0;
            break label520;
          }
          label635: i = 1;
          break label129;
          com.tencent.mm.plugin.report.service.h.pYm.a(354L, 122L, 1L, false);
        }
      }
    }
    catch (Exception parama)
    {
      label671: label713: label1001: 
      while (true)
      {
        Object localObject;
        int j;
        String str3;
        ab.printErrStackTrace("MicroMsg.NetScenePreloadVideoFake", parama, "", new Object[0]);
        this.fVC = null;
        int i = -1;
        AppMethodBeat.o(50688);
        continue;
        this.fVA = 3;
        parama = this.fVk;
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 141L, 1L, false);
        continue;
        if (((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xOL, Integer.valueOf(-1))).intValue() == 2)
          ab.i("MicroMsg.NetScenePreloadVideoFake", "command set do not check media duplication.");
        label747: for (i = 0; ; i = 1)
        {
          if (i == 0)
            break label901;
          ab.i("MicroMsg.NetScenePreloadVideoFake", "%d it already had video file", new Object[] { Integer.valueOf(hashCode()) });
          i = 0;
          break;
          if (parama.Js())
            break label747;
          str3 = parama.egB;
          j = parama.egC;
          localObject = ((com.tencent.mm.plugin.m.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.m.a.a.class)).XT().es(str3, j);
          i = j - (int)com.tencent.mm.vfs.e.asZ((String)localObject);
          if ((bo.isNullOrNil((String)localObject)) || (i < 0) || (i > 16))
            break label747;
          ab.i("MicroMsg.NetScenePreloadVideoFake", "it had download this video[%d, %s, %s].", new Object[] { Integer.valueOf(j), str3, localObject });
          com.tencent.mm.vfs.e.y((String)localObject, parama.field_fullpath);
          f(parama.filename, j, str3);
        }
        parama.egz = this.egz;
        parama.egl = this.fFk;
        parama.egx = 2;
        this.egB = parama.egB;
        this.cHr = parama.field_mediaId;
        this.fVw = parama.filename;
        this.fVx = bo.anT();
        this.fVB = parama.cdx;
        ab.i("MicroMsg.NetScenePreloadVideoFake", "%d send to cdn service task[%s]", new Object[] { Integer.valueOf(hashCode()), parama });
        com.tencent.mm.al.f.afx().b(parama, -1);
        i = 1;
      }
    }
  }

  public final String alc()
  {
    AppMethodBeat.i(50686);
    String str;
    if (this.fVv)
    {
      str = this.cvx;
      AppMethodBeat.o(50686);
    }
    while (true)
    {
      return str;
      str = this.cwT;
      AppMethodBeat.o(50686);
    }
  }

  final void f(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(50690);
    ab.i("MicroMsg.NetScenePreloadVideoFake", "%d update finish video [%s] [%d] [%s]", new Object[] { Integer.valueOf(hashCode()), paramString1, Integer.valueOf(paramInt), paramString2 });
    if (u.ut(paramString1) != null)
    {
      u.ae(paramString1, paramInt);
      i(paramInt, paramString2, paramString1);
    }
    AppMethodBeat.o(50690);
  }

  public final void stop()
  {
    AppMethodBeat.i(50687);
    ab.i("MicroMsg.NetScenePreloadVideoFake", "%d stop preload video[%s]", new Object[] { Integer.valueOf(hashCode()), this.cHr });
    if (!bo.isNullOrNil(this.cHr))
    {
      com.tencent.mm.i.d locald = new com.tencent.mm.i.d();
      b localb = com.tencent.mm.al.f.afx();
      String str = this.cHr;
      int i = 0;
      com.tencent.mm.i.g localg = (com.tencent.mm.i.g)localb.fyM.remove(str);
      if (localg != null)
      {
        com.tencent.mm.al.f.afy();
        i = com.tencent.mm.al.a.b(str, locald);
        com.tencent.mm.plugin.report.service.h.pYm.e(10769, new Object[] { Integer.valueOf(com.tencent.mm.al.c.fzg), Integer.valueOf(localg.field_fileType), Long.valueOf(bo.anU() - localg.field_startTime) });
      }
      localb.fyL.remove(str);
      localb.fyN.remove(str);
      ab.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", new Object[] { str, localg, Integer.valueOf(i) });
      this.fVy = bo.anT();
      this.fVz = e(this.fVw, locald.field_recvedBytes, false);
      tV(locald.Jn());
    }
    this.fVC = null;
    AppMethodBeat.o(50687);
  }

  final void tV(String paramString)
  {
    AppMethodBeat.i(50692);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.fVx).append(",");
    localStringBuffer.append(this.fVy).append(",");
    localStringBuffer.append(this.fVz).append(",");
    localStringBuffer.append(this.fVB).append(",");
    localStringBuffer.append(this.fVA).append(",");
    try
    {
      long l = this.fVz / 1024L / (this.fVy - this.fVx);
      i = (int)l;
      localStringBuffer.append(i).append(",");
      localStringBuffer.append(0).append(",");
      localStringBuffer.append(paramString).append(",");
      localStringBuffer.append(this.fVk.cEV).append(",");
      localStringBuffer.append(this.fVk.egE).append(",");
      localStringBuffer.append(this.fVk.cEX).append(",");
      localStringBuffer.append(this.fVk.field_fileId).append(",");
      localStringBuffer.append(this.fVk.url).append(",");
      localStringBuffer.append(com.tencent.mm.plugin.video.c.abR(this.fVk.cFc));
      paramString = localStringBuffer.toString();
      ab.d("MicroMsg.NetScenePreloadVideoFake", "%d rpt content[%s]", new Object[] { Integer.valueOf(hashCode()), paramString });
      new x(paramString).ajK();
      AppMethodBeat.o(50692);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        int i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.f
 * JD-Core Version:    0.6.2
 */