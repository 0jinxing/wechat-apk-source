package com.tencent.mm.plugin.account.friend.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.aru;
import com.tencent.mm.protocal.protobuf.arv;
import com.tencent.mm.protocal.protobuf.ayk;
import com.tencent.mm.protocal.protobuf.ayl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.g.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public final class af extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  private String gtl;
  private HashMap<String, n> gto;
  private ArrayList<n> gwi;
  private int gwj;
  private int gwk;
  private int gwl;
  private int gwm;

  public af(ArrayList<n> paramArrayList, int paramInt, HashMap<String, n> paramHashMap, String paramString)
  {
    AppMethodBeat.i(108465);
    this.gto = new HashMap();
    b.a locala = new b.a();
    locala.fsJ = new ayk();
    locala.fsK = new ayl();
    locala.uri = "/cgi-bin/micromsg-bin/listgooglecontact";
    locala.fsI = 488;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.gwi = paramArrayList;
    this.gwj = paramInt;
    this.gwk = 0;
    this.gwm = 1;
    this.gto = paramHashMap;
    this.gtl = paramString;
    AppMethodBeat.o(108465);
  }

  private void a(ayl paramayl)
  {
    ArrayList localArrayList;
    LinkedList localLinkedList;
    while (true)
    {
      String str1;
      String str2;
      try
      {
        AppMethodBeat.i(108468);
        ab.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "handleListGoogleContactCGIResponse Count:%d", new Object[] { Integer.valueOf(paramayl.jBv) });
        if ((paramayl.jBw == null) || (paramayl.jBw.size() <= 0))
          break label600;
        int i = paramayl.jBw.size();
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        int j = 0;
        if (j >= i)
          break;
        aru localaru = (aru)paramayl.jBw.get(j);
        if (!TextUtils.isEmpty(localaru.jBB))
        {
          localObject1 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(localaru.jBB);
          if ((localObject1 != null) && (com.tencent.mm.n.a.jh(((ap)localObject1).field_type)))
          {
            k = 2;
            if ((this.gto != null) && (this.gto.containsKey(localaru.vLf)))
            {
              localObject2 = (n)this.gto.get(localaru.vLf);
              ((n)localObject2).field_username = localaru.jBB;
              ((n)localObject2).field_nickname = localaru.jCH;
              ((n)localObject2).field_usernamepy = com.tencent.mm.platformtools.g.vp(localaru.jCH);
              ((n)localObject2).field_nicknameqp = com.tencent.mm.platformtools.g.vo(localaru.jCH);
              ((n)localObject2).field_ret = localaru.Ret;
              ((n)localObject2).field_small_url = localaru.wvM;
              ((n)localObject2).field_big_url = localaru.wvL;
              ((n)localObject2).field_status = k;
              ((n)localObject2).field_googlecgistatus = 2;
              if ((k != 2) && (k != 0))
                continue;
              ((n)localObject2).field_contecttype = "weixin".concat(String.valueOf(j));
              ((n)localObject2).field_googlenamepy = com.tencent.mm.platformtools.g.vp(((n)localObject2).field_googlename);
              localArrayList.add(localObject2);
              localObject1 = ((n)localObject2).field_googleid;
              str1 = ((n)localObject2).field_googlephotourl;
              str2 = this.gtl;
              if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (!TextUtils.isEmpty(str1)) && (!TextUtils.isEmpty(str2)))
                break label448;
              localObject1 = new com/tencent/mm/storage/g$a;
              ((g.a)localObject1).<init>();
              ((com.tencent.mm.g.c.g)localObject1).field_userName = localaru.jBB;
              ((com.tencent.mm.g.c.g)localObject1).field_scene = 58;
              ((com.tencent.mm.g.c.g)localObject1).field_ticket = localaru.wlF;
              localLinkedList.add(localObject1);
            }
            j++;
            continue;
          }
          k = 0;
          continue;
        }
        int k = 1;
        continue;
        ((n)localObject2).field_contecttype = "google";
        continue;
      }
      finally
      {
      }
      label448: Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str3 = (String)localObject1 + "@google";
      localObject2 = com.tencent.mm.ah.o.act().qo(str3);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new com/tencent/mm/ah/h;
        ((h)localObject1).<init>();
      }
      ((h)localObject1).username = str3;
      ((h)localObject1).dtR = 3;
      ((h)localObject1).frW = com.tencent.mm.ah.b.at(str1, str2);
      ((h)localObject1).frV = com.tencent.mm.ah.b.at(str1, str2);
      ((h)localObject1).cB(true);
      ((h)localObject1).bJt = 31;
      com.tencent.mm.ah.o.act().b((h)localObject1);
    }
    ((o)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).j(localArrayList);
    com.tencent.mm.plugin.c.a.ask().Yn().en(localLinkedList);
    label600: AppMethodBeat.o(108468);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108466);
    ab.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doScene");
    this.ehi = paramf;
    ayk localayk = (ayk)this.ehh.fsG.fsP;
    int i;
    if (this.gwi != null)
    {
      LinkedList localLinkedList = new LinkedList();
      this.gwl = this.gwi.size();
      for (i = this.gwk; (i < this.gwl) && (i < this.gwk + 500); i++)
      {
        paramf = new arv();
        paramf.vLf = ((n)this.gwi.get(i)).field_googlegmail;
        localLinkedList.add(paramf);
      }
      localayk.jBw = localLinkedList;
      localayk.jBv = localLinkedList.size();
      if (this.gwk + 500 <= this.gwl)
        break label242;
    }
    label242: for (this.gwm = 0; ; this.gwm = 1)
    {
      localayk.vQe = this.gwm;
      localayk.wCm = this.gwj;
      ab.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doscene mTotalSize:%d, mStarIndex:%d, mContinueFlag:%d", new Object[] { Integer.valueOf(this.gwl), Integer.valueOf(this.gwk), Integer.valueOf(this.gwm) });
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(108466);
      return i;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108467);
    ab.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(108467);
    }
    while (true)
    {
      return;
      a(aqi());
      if (this.gwm == 1)
      {
        this.gwk += 500;
        if (a(this.ftf, this.ehi) < 0)
        {
          ab.e("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doScene again failed");
          this.ehi.onSceneEnd(3, -1, "", this);
        }
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(108467);
    }
  }

  public final int acn()
  {
    return 20;
  }

  public final ayl aqi()
  {
    return (ayl)this.ehh.fsH.fsP;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 488;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.af
 * JD-Core Version:    0.6.2
 */