package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.a.nf;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.g.c.a;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.aij;
import com.tencent.mm.protocal.protobuf.aik;
import com.tencent.mm.protocal.protobuf.axm;
import com.tencent.mm.protocal.protobuf.yh;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k extends m
  implements com.tencent.mm.network.k
{
  private f eIc;
  public final com.tencent.mm.ai.b ehh;
  private c.a kWP;
  private boolean kWQ;
  private nf kWR;
  public String kWl;

  public k(String paramString)
  {
    AppMethodBeat.i(53123);
    this.kWl = "";
    this.kWQ = false;
    this.kWR = null;
    b.a locala = new b.a();
    locala.fsJ = new aij();
    locala.fsK = new aik();
    locala.uri = "/cgi-bin/micromsg-bin/getemotiondesc";
    locala.fsI = 521;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.kWl = paramString;
    this.kWR = new nf();
    AppMethodBeat.o(53123);
  }

  public k(String paramString, c.a parama)
  {
    AppMethodBeat.i(53124);
    this.kWl = "";
    this.kWQ = false;
    this.kWR = null;
    b.a locala = new b.a();
    locala.fsJ = new aij();
    locala.fsK = new aik();
    locala.uri = "/cgi-bin/micromsg-bin/getemotiondesc";
    locala.fsI = 521;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.kWl = paramString;
    this.kWP = parama;
    this.kWQ = true;
    this.kWR = new nf();
    AppMethodBeat.o(53124);
  }

  private int bky()
  {
    return ((aik)this.ehh.fsH.fsP).wox;
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(53125);
    ab.d("MicroMsg.emoji.NetSceneGetEmotionDesc", "getEmotionDesc %s ", new Object[] { this.kWl });
    this.eIc = paramf;
    ((aij)this.ehh.fsG.fsP).ProductID = this.kWl;
    int i;
    if (TextUtils.isEmpty(this.kWl))
    {
      ab.w("MicroMsg.emoji.NetSceneGetEmotionDesc", "get emoji desc faild. product id is null.");
      i = -1;
      AppMethodBeat.o(53125);
    }
    while (true)
    {
      return i;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(53125);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53126);
    com.tencent.mm.storage.emotion.c localc;
    Object localObject1;
    int i;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      if (this.kWQ)
        if ((bky() & 0x1) == 1)
          com.tencent.mm.plugin.emoji.g.c.a(this.kWP);
      while (true)
      {
        this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(53126);
        return;
        ab.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "new emotion is can't download. ignore");
        continue;
        paramArrayOfByte = ((aik)this.ehh.fsH.fsP).jBw;
        localc = j.getEmojiStorageMgr().xYp;
        localObject1 = this.kWl;
        i = ((aik)this.ehh.fsH.fsP).wov;
        paramInt1 = bky();
        if (localc.yaX != null)
          localc.yaX.edit().putLong("274544".concat(String.valueOf(localObject1)), System.currentTimeMillis()).commit();
        if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0))
          break;
        label179: if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
          break label538;
        ab.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "end getEmojiDesc, productId: %s ", new Object[] { this.kWl });
        this.kWR.cJv.cwg = this.kWl;
        a.xxA.m(this.kWR);
      }
      paramq = null;
      if (!(localc.bSd instanceof h))
        break label591;
      paramq = (h)localc.bSd;
    }
    label538: label591: for (long l = paramq.iV(Thread.currentThread().getId()); ; l = -1L)
    {
      localc.bSd.delete("EmojiInfoDesc", "groupId=?", new String[] { localObject1 });
      com.tencent.mm.storage.emotion.b localb = new com.tencent.mm.storage.emotion.b();
      localb.field_groupId = ((String)localObject1);
      localb.field_click_flag = i;
      localb.field_download_flag = paramInt1;
      localObject1 = paramArrayOfByte.iterator();
      Object localObject3;
      do
      {
        Object localObject2;
        while (!((Iterator)localObject2).hasNext())
        {
          if (!((Iterator)localObject1).hasNext())
            break;
          localObject2 = (yh)((Iterator)localObject1).next();
          localb.field_md5 = ((yh)localObject2).Md5;
          localObject2 = ((yh)localObject2).jBw.iterator();
        }
        localObject3 = (axm)((Iterator)localObject2).next();
        localb.field_desc = ((axm)localObject3).Desc;
        localb.field_lang = ((axm)localObject3).nbs;
        localb.field_md5_lang = (localb.field_md5 + localb.field_lang);
        localObject3 = localb.Hl();
      }
      while (localc.bSd.replace("EmojiInfoDesc", "md5_lang", (ContentValues)localObject3) >= 0L);
      if (paramq == null)
        break label179;
      paramq.mB(l);
      break label179;
      localc.bSd.replace("EmojiInfoDesc", "md5_lang", localb.Hl());
      if (paramq == null)
        break label179;
      paramq.mB(l);
      break label179;
      break;
      ab.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "end getEmojiDesc, & errType:%d, errCode:%d, productId: %s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this.kWl });
      if (!this.kWQ)
        break;
      ab.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "new emotion get des failed. ignore");
      break;
    }
  }

  public final int acn()
  {
    return 50;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 521;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.k
 * JD-Core Version:    0.6.2
 */