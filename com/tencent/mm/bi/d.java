package com.tencent.mm.bi;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.kz;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.model.at;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bf;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.storage.bt;
import com.tencent.mm.storage.bu;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class d
  implements at
{
  public static int eRI = 0;
  public static int[] fUz = new int[1000];
  private final long TIME_INTERVAL;
  private final int cfP;
  private com.tencent.mm.sdk.b.c fUA;
  private e fUw;
  private b fUx;
  private final int fUy;

  public d()
  {
    AppMethodBeat.i(16622);
    this.fUw = new e();
    this.fUx = new b();
    this.TIME_INTERVAL = 259200000L;
    this.cfP = 0;
    this.fUy = 2;
    this.fUA = new d.1(this);
    AppMethodBeat.o(16622);
  }

  public static void a(cm paramcm, bi.d paramd)
  {
    AppMethodBeat.i(16629);
    ab.d("MicroMsg.SubCoreVerify", "saveToLbsVerifyStg, cmdAM, status = " + paramcm.jBT + ", id = " + paramcm.ptF);
    bf localbf = new bf();
    localbf.field_content = aa.a(paramcm.vED);
    localbf.field_createtime = bo.anT();
    localbf.field_imgpath = "";
    localbf.field_sayhicontent = paramd.content;
    localbf.field_sayhiuser = paramd.svN;
    localbf.field_scene = paramd.scene;
    if (paramcm.jBT > 3);
    for (int i = paramcm.jBT; ; i = 3)
    {
      localbf.field_status = i;
      localbf.field_svrid = paramcm.ptF;
      localbf.field_talker = aa.a(paramcm.vEB);
      localbf.field_type = paramcm.nao;
      localbf.field_isSend = 0;
      localbf.field_sayhiencryptuser = paramd.xZx;
      localbf.field_ticket = paramd.mGZ;
      localbf.field_flag = 1;
      ((bg)((j)g.K(j.class)).bOo()).a(localbf);
      com.tencent.mm.ah.b.U(localbf.field_sayhiencryptuser, 3);
      AppMethodBeat.o(16629);
      return;
    }
  }

  public static ay akO()
  {
    AppMethodBeat.i(16623);
    g.RN().QU();
    com.tencent.mm.storage.aw localaw = akP();
    ay localay = (ay)((j)g.K(j.class)).bOq();
    localay.a(localaw, g.RS().oAl.getLooper());
    AppMethodBeat.o(16623);
    return localay;
  }

  public static com.tencent.mm.storage.aw akP()
  {
    AppMethodBeat.i(16624);
    g.RN().QU();
    com.tencent.mm.storage.aw localaw = (com.tencent.mm.storage.aw)((j)g.K(j.class)).bOp();
    AppMethodBeat.o(16624);
    return localaw;
  }

  public static bg akQ()
  {
    AppMethodBeat.i(16625);
    g.RN().QU();
    bg localbg = (bg)((j)g.K(j.class)).bOo();
    AppMethodBeat.o(16625);
    return localbg;
  }

  public static bu akR()
  {
    AppMethodBeat.i(16626);
    g.RN().QU();
    bu localbu = (bu)((j)g.K(j.class)).bOn();
    AppMethodBeat.o(16626);
    return localbu;
  }

  public static void b(cm paramcm, bi.d paramd)
  {
    AppMethodBeat.i(16630);
    ab.d("MicroMsg.SubCoreVerify", "saveToShakeVerifyStg, cmdAM, status = " + paramcm.jBT + ", id = " + paramcm.ptF);
    bt localbt = new bt();
    localbt.field_content = aa.a(paramcm.vED);
    localbt.field_createtime = bo.anT();
    localbt.field_imgpath = "";
    localbt.field_sayhicontent = paramd.content;
    localbt.field_sayhiuser = paramd.svN;
    localbt.field_scene = paramd.scene;
    if (paramcm.jBT > 3);
    for (int i = paramcm.jBT; ; i = 3)
    {
      localbt.field_status = i;
      localbt.field_svrid = paramcm.ptF;
      localbt.field_talker = aa.a(paramcm.vEB);
      localbt.field_type = paramcm.nao;
      localbt.field_isSend = 0;
      ((bu)((j)g.K(j.class)).bOn()).a(localbt);
      com.tencent.mm.ah.b.U(localbt.field_sayhiuser, 3);
      AppMethodBeat.o(16630);
      return;
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(16628);
    e.d.a(Integer.valueOf(37), this.fUw);
    e.d.a(Integer.valueOf(65), this.fUw);
    e.d.a(Integer.valueOf(40), this.fUx);
    com.tencent.mm.sdk.b.a.xxA.c(this.fUA);
    int j = akP().dtd();
    long l = System.currentTimeMillis();
    com.tencent.mm.model.aw.ZK();
    l -= bo.a((Long)com.tencent.mm.model.c.Ry().get(340225, null), 0L);
    ab.i("MicroMsg.SubCoreVerify", "timeInterval = ".concat(String.valueOf(l)));
    if ((l > 259200000L) && (j > 0))
    {
      Object localObject1 = akP();
      Object localObject2 = String.format("select %s from %s where isNew = 1 ORDER BY lastModifiedTime DESC limit %d", new Object[] { "contentNickname", "fmessage_conversation", Integer.valueOf(2) });
      localObject2 = ((com.tencent.mm.storage.aw)localObject1).bSd.a((String)localObject2, null, 2);
      localObject1 = new ArrayList();
      while (((Cursor)localObject2).moveToNext())
        ((List)localObject1).add(((Cursor)localObject2).getString(((Cursor)localObject2).getColumnIndex("contentNickname")));
      ((Cursor)localObject2).close();
      j = ((List)localObject1).size();
      if (j > 0)
      {
        localObject2 = (String)((List)localObject1).get(0);
        while (i < j)
        {
          localObject2 = (String)localObject2 + ", " + (String)((List)localObject1).get(i);
          i++;
        }
        ab.i("MicroMsg.SubCoreVerify", "title = ".concat(String.valueOf(localObject2)));
        localObject1 = new kz();
        ((kz)localObject1).cGR.userName = null;
        ((kz)localObject1).cGR.bCu = ((String)localObject2);
        ((kz)localObject1).cGR.type = 0;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        com.tencent.mm.model.aw.ZK();
        com.tencent.mm.model.c.Ry().set(340225, Long.valueOf(System.currentTimeMillis()));
      }
    }
    AppMethodBeat.o(16628);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(16627);
    e.d.b(Integer.valueOf(37), this.fUw);
    e.d.b(Integer.valueOf(65), this.fUw);
    e.d.b(Integer.valueOf(40), this.fUx);
    com.tencent.mm.sdk.b.a.xxA.d(this.fUA);
    com.tencent.mm.model.aw.getNotification().IH();
    AppMethodBeat.o(16627);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bi.d
 * JD-Core Version:    0.6.2
 */