package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.n.a;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.alc;
import com.tencent.mm.protocal.protobuf.ald;
import com.tencent.mm.protocal.protobuf.bfj;
import com.tencent.mm.protocal.protobuf.hl;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class l extends m
  implements k
{
  public static String fOO;
  public static String fOP;
  public static String fOQ;
  public static String fOR;
  public static String fOS;
  public static String fOT;
  public static String fOU;
  public static String fOV;
  public static String fOW;
  public static String fOX;
  private static int fOY;
  private static int fOZ = -1;
  private static int fPa = 22;
  private static int fPb = 0;
  private static boolean fPc = false;
  private static int fPd = 0;
  private f ehi;

  public l(int paramInt)
  {
    fOY = paramInt;
  }

  public static int ajf()
  {
    return fOZ;
  }

  public static boolean ajg()
  {
    if ((fPb & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean ajh()
  {
    if ((fPa & 0x4) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int aji()
  {
    return fOY;
  }

  public static boolean ajj()
  {
    if ((fPb & 0x200) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean ajk()
  {
    if ((fPb & 0x400) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void cR(boolean paramBoolean)
  {
    if (paramBoolean);
    for (fPa |= 4; ; fPa &= -5)
      return;
  }

  public static int getDeviceType()
  {
    return fPd;
  }

  public static boolean lW(int paramInt)
  {
    if (fOY == paramInt);
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16589);
    b.a locala = new b.a();
    alc localalc = new alc();
    localalc.luQ = aa.dor();
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneGetOnlineInfo", "language %s", new Object[] { localalc.luQ });
    locala.fsJ = localalc;
    locala.fsK = new ald();
    locala.uri = "/cgi-bin/micromsg-bin/getonlineinfo";
    locala.fsI = 526;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehi = paramf;
    int i = a(parame, locala.acD(), this);
    AppMethodBeat.o(16589);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16590);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGetOnlineInfo", "ongynetend %d, %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (ald)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      fOZ = paramArrayOfByte.wqF;
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneGetOnlineInfo", "iconType:%d onlineInfoFlag:%d", new Object[] { Integer.valueOf(fOZ), Integer.valueOf(paramArrayOfByte.vEq) });
      Object localObject = br.z(paramArrayOfByte.wqE, "summary");
      paramInt1 = fPa;
      if (localObject != null)
      {
        fOO = (String)((Map)localObject).get(".summary.banner");
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneGetOnlineInfo", "onlineinfo, count:%d, summary:%s", new Object[] { Integer.valueOf(paramArrayOfByte.wqC), paramArrayOfByte.wqE });
        localObject = (alc)((com.tencent.mm.ai.b)paramq).fsG.fsP;
        Iterator localIterator = paramArrayOfByte.wqD.iterator();
        while (localIterator.hasNext())
        {
          paramq = (bfj)localIterator.next();
          if (paramq.vKc.dlY().hashCode() != ((alc)localObject).BaseRequest.vKc.dlY().hashCode())
          {
            fPd = paramq.wJh;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGetOnlineInfo", "device type %d", new Object[] { Integer.valueOf(fPd) });
            localObject = br.z(paramq.wJi, "wording");
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneGetOnlineInfo", paramq.wJi);
            if (localObject != null)
            {
              fOP = (String)((Map)localObject).get(".wording.title");
              fOQ = (String)((Map)localObject).get(".wording.notify");
              fOR = (String)((Map)localObject).get(".wording.mute_title");
              fOS = (String)((Map)localObject).get(".wording.mute_tips");
              fOT = (String)((Map)localObject).get(".wording.exit");
              fOU = (String)((Map)localObject).get(".wording.exit_confirm");
              fOV = (String)((Map)localObject).get(".wording.lock_title");
              fOW = (String)((Map)localObject).get(".wording.mute_lock_title");
              fOX = (String)((Map)localObject).get(".wording.exit");
            }
            paramInt1 = paramq.wJk;
          }
        }
      }
    }
    while (true)
    {
      int i = paramArrayOfByte.vEq;
      fPb = i;
      if ((i & 0x2) == 0)
      {
        fPc = true;
        if (paramInt1 != fPa)
        {
          fPa = paramInt1;
          aw.ZK();
          c.QV();
        }
        if ((paramArrayOfByte.vEq & 0x40) != 0)
        {
          aw.ZK();
          paramArrayOfByte = c.XM().aoO("filehelper");
          if (paramArrayOfByte != null)
          {
            paramq = paramArrayOfByte;
            if (!bo.isNullOrNil(paramArrayOfByte.field_username));
          }
          else
          {
            com.tencent.mm.model.ab.x(paramArrayOfByte);
            aw.ZK();
            paramq = c.XM().aoO("filehelper");
          }
          if ((paramq != null) && (!a.jh(paramq.field_type)))
          {
            paramq.NB();
            aw.ZK();
            c.XM().b(paramq.field_username, paramq);
          }
          aw.ZK();
          paramq = c.XR().aoZ("filehelper");
          if (paramq != null)
            break label676;
          paramq = new ak("filehelper");
          paramq.eD(bo.anU());
          aw.ZK();
          c.XR().d(paramq);
        }
      }
      while (true)
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(16590);
        return;
        fPc = false;
        break;
        label676: paramq.eD(bo.anU());
        aw.ZK();
        c.XR().a(paramq, "filehelper");
      }
    }
  }

  public final int getType()
  {
    return 526;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.l
 * JD-Core Version:    0.6.2
 */