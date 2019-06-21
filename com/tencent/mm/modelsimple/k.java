package com.tencent.mm.modelsimple;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.g.a.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aid;
import com.tencent.mm.protocal.protobuf.aie;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class k extends m
  implements com.tencent.mm.network.k
{
  private static Map<String, Long> fOE;
  private static Map<String, String> fOF;
  private boolean cCq;
  private f ehi;
  private c<a> fOG;
  private final b fmP;

  static
  {
    AppMethodBeat.i(16588);
    fOE = new HashMap();
    AppMethodBeat.o(16588);
  }

  public k(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(16582);
    this.cCq = false;
    b.a locala = new b.a();
    locala.fsJ = new aid();
    locala.fsK = new aie();
    locala.uri = "/cgi-bin/micromsg-bin/getdisasterinfo";
    locala.fsI = 775;
    locala.fsL = 0;
    locala.fsM = 0;
    this.fmP = locala.acD();
    this.fmP.cQh = 1;
    ((aid)this.fmP.fsG.fsP).cCp = paramInt;
    this.cCq = paramBoolean;
    ajd();
    ab.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo noticeid[%d], manualauthSucc[%b], stack[%s]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.cCq), bo.dpG() });
    AppMethodBeat.o(16582);
  }

  private void P(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(16584);
    aw.RS().aa(new k.1(this, paramString, paramBoolean));
    AppMethodBeat.o(16584);
  }

  private void ajd()
  {
    SharedPreferences.Editor localEditor;
    try
    {
      AppMethodBeat.i(16585);
      if (fOF != null)
        break label390;
      ab.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap");
      Object localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      fOF = (Map)localObject1;
      SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("disaster_pref", h.Mu());
      localObject1 = localSharedPreferences.getString("disaster_new_noticeid_list_key", "");
      if (bo.isNullOrNil((String)localObject1))
        break label372;
      String[] arrayOfString1 = ((String)localObject1).split(";");
      if ((arrayOfString1 == null) || (arrayOfString1.length <= 0))
        break label372;
      Object localObject3 = "";
      localEditor = localSharedPreferences.edit();
      int i = arrayOfString1.length;
      int j = 0;
      while (true)
        if (j < i)
        {
          String[] arrayOfString2 = arrayOfString1[j].split(",");
          Object localObject4 = localObject3;
          localObject1 = localObject3;
          try
          {
            if (bo.getLong(arrayOfString2[0], 0L) > 0L)
            {
              localObject1 = localObject3;
              if (bo.fp(bo.getLong(arrayOfString2[1], 0L)) >= 86400L)
                break label272;
              localObject1 = localObject3;
              String str = localSharedPreferences.getString(arrayOfString2[0], "");
              localObject4 = localObject3;
              localObject1 = localObject3;
              if (!bo.isNullOrNil(str))
              {
                localObject1 = localObject3;
                localObject4 = new java/lang/StringBuilder;
                localObject1 = localObject3;
                ((StringBuilder)localObject4).<init>();
                localObject1 = localObject3;
                localObject4 = (String)localObject3 + arrayOfString2[0] + "," + arrayOfString2[1] + ";";
                localObject1 = localObject4;
                fOF.put(arrayOfString2[0], str);
              }
            }
            while (true)
            {
              j++;
              localObject3 = localObject4;
              break;
              label272: localObject1 = localObject3;
              localEditor.remove(arrayOfString2[0]).commit();
              localObject4 = localObject3;
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.e("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap error:%s", new Object[] { localException.getMessage() });
              localObject4 = localObject1;
            }
          }
        }
    }
    finally
    {
    }
    localEditor.putString("disaster_new_noticeid_list_key", localException).commit();
    ab.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap newNoticeIdList[%s], noticeidTickMap[%s]", new Object[] { localException, fOE });
    label372: ab.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap done noticeContentMap[%s]", new Object[] { fOF });
    label390: AppMethodBeat.o(16585);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16583);
    aid localaid = (aid)this.fmP.fsG.fsP;
    long l = bo.a((Long)fOE.get(localaid.cCp), 0L);
    ab.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene noticeid[%d], tick[%d], noticeidTickMap[%s]", new Object[] { Integer.valueOf(localaid.cCp), Long.valueOf(l), fOE });
    int i;
    if ((l != 0L) && (bo.az(l) < 1800000L))
    {
      ab.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene disasterTick within half an hour, drop it [%s]", new Object[] { Integer.valueOf(localaid.cCp) });
      AppMethodBeat.o(16583);
      i = -1;
    }
    while (true)
    {
      return i;
      String str = bo.bc((String)fOF.get(localaid.cCp), "");
      if (!bo.isNullOrNil(str))
      {
        ab.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene found cache[%d, %s]", new Object[] { Integer.valueOf(localaid.cCp), str });
        P(str, false);
        AppMethodBeat.o(16583);
        i = -1;
      }
      else
      {
        this.ehi = paramf;
        i = a(parame, this.fmP, this);
        AppMethodBeat.o(16583);
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16586);
    ab.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
      P(((aie)this.fmP.fsH.fsP).content, true);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16586);
  }

  public final int getType()
  {
    return 775;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.k
 * JD-Core Version:    0.6.2
 */