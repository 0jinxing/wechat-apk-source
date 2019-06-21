package com.tencent.mm.bx;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.e;
import com.tencent.mm.at.l;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.protocal.protobuf.brw;
import com.tencent.mm.protocal.protobuf.bsb;
import com.tencent.mm.protocal.protobuf.bsl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a
  implements com.tencent.mm.ai.f, com.tencent.mm.api.o
{
  public static final a xuc;
  public ConcurrentHashMap<String, bsb> xud;

  static
  {
    AppMethodBeat.i(116352);
    xuc = new a();
    AppMethodBeat.o(116352);
  }

  public a()
  {
    AppMethodBeat.i(116347);
    this.xud = new ConcurrentHashMap();
    AppMethodBeat.o(116347);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(116350);
    if ((paramm.getType() != 110) && (paramm.getType() != 149))
      AppMethodBeat.o(116350);
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Object localObject1;
        Object localObject2;
        if ((paramm instanceof l))
        {
          paramString = (l)paramm;
          if ((paramString != null) && (paramString.fFy))
          {
            localObject1 = paramString.fFx;
            paramm = (bsb)this.xud.remove(paramString.fFC);
            if ((localObject1 != null) && (paramm != null))
            {
              localObject2 = br.z((String)localObject1, "msg");
              if (localObject2 == null)
              {
                ab.w("MicroMsg.MediaSecurityReport", "attrs == null!");
                AppMethodBeat.o(116350);
                continue;
              }
              localObject1 = paramm.wUe;
              ((brw)localObject1).wip = ((String)((Map)localObject2).get(".msg.img.$cdnmidimgurl"));
              ((brw)localObject1).AesKey = ((String)((Map)localObject2).get(".msg.img.$aeskey"));
              ((brw)localObject1).wdO = "";
              ab.i("MicroMsg.MediaSecurityReport", "report! OrigImgPath:%s", new Object[] { paramString.fFC });
              new b(paramm).a(com.tencent.mm.kernel.g.Rg().ftA, new a.1(this, paramm));
            }
          }
          else
          {
            AppMethodBeat.o(116350);
          }
        }
        else if ((paramm instanceof com.tencent.mm.modelvideo.g))
        {
          localObject1 = (com.tencent.mm.modelvideo.g)paramm;
          if (localObject1 != null)
          {
            paramm = (bsb)this.xud.remove(((com.tencent.mm.modelvideo.g)localObject1).fileName);
            if (((com.tencent.mm.modelvideo.g)localObject1).fVj == null)
              paramString = "";
            while (true)
              if ((paramString != null) && (paramm != null))
              {
                localObject2 = br.z(paramString, "msg");
                if (localObject2 == null)
                {
                  ab.w("MicroMsg.MediaSecurityReport", "attrs == null!");
                  AppMethodBeat.o(116350);
                  break;
                  paramString = ((com.tencent.mm.modelvideo.g)localObject1).fVj.alw();
                  continue;
                }
                paramString = paramm.wUf;
                paramString.AesKey = ((String)((Map)localObject2).get(".msg.videomsg.$aeskey"));
                paramString.wip = ((String)((Map)localObject2).get(".msg.videomsg.$cdnvideourll"));
                localObject2 = ((com.tencent.mm.modelvideo.g)localObject1).fVj;
                paramString.wdO = ((s)localObject2).cMW;
                paramString.wUv = "";
                paramString.wUw = ((s)localObject2).fXd;
                paramString.wUx = paramString.wip;
                paramString.wUy = paramString.AesKey;
                com.tencent.mm.modelvideo.o.all();
                paramString.wUz = com.tencent.mm.at.f.sh(t.ui(((s)localObject2).getFileName()));
                ab.i("MicroMsg.MediaSecurityReport", "report! OrigVideoPath:%s", new Object[] { ((com.tencent.mm.modelvideo.g)localObject1).fileName });
                new b(paramm).a(com.tencent.mm.kernel.g.Rg().ftA, new a.2(this, paramm));
              }
          }
        }
      }
      else
      {
        AppMethodBeat.o(116350);
      }
    }
  }

  public final void recordImage(String paramString1, String paramString2, long paramLong, String paramString3, String paramString4)
  {
    AppMethodBeat.i(116349);
    Object localObject2;
    if (paramLong <= 0L)
    {
      Object localObject1 = com.tencent.mm.at.o.ahl();
      String str = com.tencent.mm.at.f.sh(paramString1);
      localObject2 = new e();
      localObject1 = ((com.tencent.mm.at.g)localObject1).a("ImgInfo2", null, "origImgMD5=?", new String[] { String.valueOf(str) });
      if (((Cursor)localObject1).moveToFirst())
        ((e)localObject2).d((Cursor)localObject1);
      ((Cursor)localObject1).close();
      if (((e)localObject2).fDy <= 0L)
        break label266;
      localObject2 = br.z(((e)localObject2).fDK, "msg");
      if (localObject2 != null)
        break label151;
      ab.w("MicroMsg.MediaSecurityReport", "attrs == null! %s %s", new Object[] { paramString1, Long.valueOf(paramLong) });
      AppMethodBeat.o(116349);
    }
    while (true)
    {
      return;
      localObject2 = com.tencent.mm.at.o.ahl().b(Long.valueOf(paramLong));
      break;
      label151: paramString1 = new bsb();
      paramString1.jCt = 1;
      paramString1.wdK = paramString4;
      paramString1.EmotionList = new LinkedList(bo.P(paramString3.split(",")));
      paramString3 = new brw();
      paramString3.wTW = ((String)((Map)localObject2).get(".msg.img.$cdnmidimgurl"));
      paramString3.wTX = ((String)((Map)localObject2).get(".msg.img.$aeskey"));
      paramString3.wTY = "";
      paramString1.wUe = paramString3;
      this.xud.put(paramString2, paramString1);
      AppMethodBeat.o(116349);
      continue;
      label266: ab.w("MicroMsg.MediaSecurityReport", "[recordImage] imgInfo is null! %s %s", new Object[] { paramString1, Long.valueOf(paramLong) });
      AppMethodBeat.o(116349);
    }
  }

  public final void recordVideo(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(116348);
    s locals = u.ut(paramString1);
    Map localMap;
    if ((locals != null) && (locals.fXe > 0))
    {
      localMap = br.z(locals.alw(), "msg");
      if (localMap == null)
      {
        ab.w("MicroMsg.MediaSecurityReport", "attrs == null! %s", new Object[] { paramString1 });
        AppMethodBeat.o(116348);
      }
    }
    while (true)
    {
      return;
      bsb localbsb = new bsb();
      localbsb.jCt = 2;
      localbsb.wdK = paramString4;
      localbsb.EmotionList = new LinkedList(bo.P(paramString3.split(",")));
      paramString3 = new bsl();
      paramString3.wTY = locals.cMW;
      paramString3.wUA = "";
      paramString3.wUE = locals.fXd;
      com.tencent.mm.modelvideo.o.all();
      paramString3.wUD = com.tencent.mm.at.f.sh(t.ui(paramString1));
      paramString3.wUB = ((String)localMap.get(".msg.videomsg.$cdnvideourl"));
      paramString3.wUC = ((String)localMap.get(".msg.videomsg.$aeskey"));
      localbsb.wUf = paramString3;
      this.xud.put(paramString2, localbsb);
      AppMethodBeat.o(116348);
      continue;
      ab.w("MicroMsg.MediaSecurityReport", "[recordVideo] imgInfo is null! %s", new Object[] { paramString1 });
      AppMethodBeat.o(116348);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bx.a
 * JD-Core Version:    0.6.2
 */