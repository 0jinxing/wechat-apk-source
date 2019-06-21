package com.tencent.mm.plugin.hp.c;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.boots.a.c;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.bhv;
import com.tencent.mm.protocal.protobuf.bhw;
import com.tencent.mm.protocal.protobuf.bhx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class a extends m
  implements k
{
  protected final b ehh;
  protected com.tencent.mm.ai.f ehi;
  protected int gOW;
  protected LinkedList<bhw> kdX;
  protected String ntS;
  protected String ntT;
  protected LinkedList<bhv> ntU;
  protected int ntV;
  protected String type;

  public a()
  {
    AppMethodBeat.i(90616);
    this.ntU = new LinkedList();
    this.kdX = new LinkedList();
    this.ntV = 0;
    this.gOW = 0;
    b.a locala = new b.a();
    locala.fsJ = new bhw();
    locala.fsK = new bhx();
    locala.uri = "/cgi-bin/micromsg-bin/prconfig";
    locala.fsI = 3899;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(90616);
  }

  public static LinkedList<bhv> bGn()
  {
    AppMethodBeat.i(90619);
    LinkedList localLinkedList = new LinkedList();
    long l1 = 0L;
    try
    {
      long l2 = com.tencent.mm.kernel.a.Ra() & 0xFFFFFFFF;
      l1 = l2;
      ab.i("MicroMsg.Tinker.NetSceneBaseCheckTinkerUpdate", "uin is %s", new Object[] { bo.anv(String.valueOf(l2)) });
      l1 = l2;
      localLinkedList.add(eH("code-version", com.tencent.mm.sdk.platformtools.f.CLIENT_VERSION));
      localLinkedList.add(eH("code-reversion", com.tencent.mm.sdk.platformtools.f.REV));
      localLinkedList.add(eH("sdk", String.valueOf(Build.VERSION.SDK_INT)));
      localLinkedList.add(eH("os-name", d.vxl));
      localLinkedList.add(eH("device-brand", d.vxi));
      localLinkedList.add(eH("device-name", d.DEVICE_NAME));
      localLinkedList.add(eH("uin", String.valueOf(l1)));
      if (at.isWifi(ah.getContext()))
      {
        i = 3;
        localLinkedList.add(eH("network", String.valueOf(i)));
        Object localObject = ((c)g.K(c.class)).aVJ();
        if (localObject == null)
          break label273;
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          com.tencent.mm.plugin.boots.a.a locala = (com.tencent.mm.plugin.boots.a.a)((Iterator)localObject).next();
          localLinkedList.add(eH(Integer.toHexString(locala.field_key), String.valueOf(locala.field_dau)));
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Tinker.NetSceneBaseCheckTinkerUpdate", localException, "tinker patch manager get uin failed.", new Object[0]);
        continue;
        int i = 2;
      }
      label273: AppMethodBeat.o(90619);
    }
    return localLinkedList;
  }

  private static bhv eH(String paramString1, String paramString2)
  {
    AppMethodBeat.i(90620);
    bhv localbhv = new bhv();
    localbhv.key = paramString1;
    localbhv.value = paramString2;
    AppMethodBeat.o(90620);
    return localbhv;
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(90617);
    this.ehi = paramf;
    paramf = (bhw)this.ehh.fsG.fsP;
    paramf.wLb = this.ntS;
    paramf.pdA = this.ntT;
    paramf.wLc = this.ntU;
    paramf.type = this.type;
    paramf.tOS = this.kdX;
    paramf.wLd = this.ntV;
    paramf.wLe = this.gOW;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(90617);
    return i;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(90618);
    ab.i("MicroMsg.Tinker.NetSceneBaseCheckTinkerUpdate", "errType:%d errCode:%d errMsg:%s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(90618);
  }

  public final int getType()
  {
    return 3899;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.c.a
 * JD-Core Version:    0.6.2
 */