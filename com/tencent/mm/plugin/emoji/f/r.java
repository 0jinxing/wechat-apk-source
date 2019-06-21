package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.t;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cky;
import com.tencent.mm.protocal.protobuf.ckz;
import com.tencent.mm.protocal.protobuf.yc;
import com.tencent.mm.protocal.protobuf.yd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.LinkedList;
import junit.framework.Assert;

public final class r extends m
  implements com.tencent.mm.network.k
{
  private EmojiInfo cuc;
  private final com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private long fDH;
  private boolean kWx;

  public r(String paramString1, String paramString2, EmojiInfo paramEmojiInfo, long paramLong)
  {
    this(paramString1, paramString2, paramEmojiInfo, paramLong, (byte)0);
  }

  private r(String paramString1, String paramString2, EmojiInfo paramEmojiInfo, long paramLong, byte paramByte)
  {
    AppMethodBeat.i(53150);
    this.kWx = true;
    this.fDH = 0L;
    boolean bool;
    Object localObject;
    yc localyc;
    if ((paramString2 != null) && (paramString2.length() > 0) && (paramEmojiInfo != null))
    {
      bool = true;
      Assert.assertTrue(bool);
      this.fDH = paramLong;
      this.cuc = paramEmojiInfo;
      localObject = new b.a();
      ((b.a)localObject).fsJ = new cky();
      ((b.a)localObject).fsK = new ckz();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendemoji";
      ((b.a)localObject).fsI = 175;
      ((b.a)localObject).fsL = 68;
      ((b.a)localObject).fsM = 1000000068;
      this.ehh = ((b.a)localObject).acD();
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.a(ah.getContext(), paramEmojiInfo);
      localObject = (cky)this.ehh.fsG.fsP;
      localyc = new yc();
      ab.i("MicroMsg.emoji.NetSceneUploadEmoji", "NetSceneUploadEmoji: md5 %s, size %s", new Object[] { paramEmojiInfo.Aq(), Integer.valueOf(paramEmojiInfo.field_size) });
      localyc.wdO = paramEmojiInfo.Aq();
      localyc.wdS = paramString1;
      localyc.ndF = paramString2;
      localyc.ptw = paramEmojiInfo.field_size;
      localyc.wdQ = paramEmojiInfo.getContent();
      localyc.jCt = paramEmojiInfo.field_type;
      localyc.vEG = bh.aae();
      localyc.wdT = 0;
      if (!t.kH(paramString2))
        break label332;
      paramByte = 2;
      label271: if (paramEmojiInfo.field_catalog != EmojiInfo.yak)
        break label338;
      localyc.wdR = "56,2,".concat(String.valueOf(paramByte));
    }
    while (true)
    {
      ((cky)localObject).wdV.add(localyc);
      ((cky)localObject).xiJ = ((cky)localObject).wdV.size();
      AppMethodBeat.o(53150);
      return;
      bool = false;
      break;
      label332: paramByte = 1;
      break label271;
      label338: if (paramEmojiInfo.field_catalog == EmojiInfo.yaj)
        localyc.wdR = "56,1,".concat(String.valueOf(paramByte));
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(53151);
    this.ehi = paramf;
    yc localyc = (yc)((cky)this.ehh.fsG.fsP).wdV.get(0);
    int i;
    if (this.kWx)
    {
      ab.d("MicroMsg.emoji.NetSceneUploadEmoji", "dispatcher, firstSend. md5=" + localyc.wdO);
      localyc.wdP = new SKBuiltinBuffer_t();
      localyc.ptx = 0;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(53151);
    }
    while (true)
    {
      return i;
      int j = this.cuc.field_size - this.cuc.field_start;
      i = j;
      if (j > 8192)
        i = 8192;
      if ((this.cuc.field_reserved4 & EmojiInfo.yaB) == EmojiInfo.yaB)
      {
        byte[] arrayOfByte = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().l(this.cuc);
        if (!bo.cb(arrayOfByte))
        {
          paramf = new byte[i];
          ab.d("MicroMsg.emoji.NetSceneUploadEmoji", "total length:%d dataLen:%d", new Object[] { Integer.valueOf(arrayOfByte.length), Integer.valueOf(i) });
          System.arraycopy(arrayOfByte, this.cuc.field_start, paramf, 0, i);
        }
      }
      while (true)
      {
        if ((com.tencent.mm.plugin.emoji.h.b.aF(paramf) != EmojiInfo.yab) || (!this.kWx))
          break label312;
        ab.e("MicroMsg.emoji.NetSceneUploadEmoji", "Bitmap type error. delete emoji file.");
        this.cuc.duQ();
        AppMethodBeat.o(53151);
        i = -1;
        break;
        ab.w("MicroMsg.emoji.NetSceneUploadEmoji", "buffer is null.");
        paramf = new byte[0];
        continue;
        paramf = this.cuc.gZ(this.cuc.field_start, i);
      }
      label312: if ((paramf == null) || (paramf.length <= 0))
      {
        ab.e("MicroMsg.emoji.NetSceneUploadEmoji", "readFromFile is null.");
        AppMethodBeat.o(53151);
        i = -1;
      }
      else
      {
        i = paramf.length;
        localyc.ptx = this.cuc.field_start;
        localyc.wdP = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.bt.b.bI(paramf));
        if (com.tencent.mm.aj.f.kq(localyc.ndF))
        {
          localyc.vEG = com.tencent.mm.aj.a.e.rw(((j)g.K(j.class)).bOr().jf(this.fDH).dqJ);
          ab.d("MicroMsg.emoji.NetSceneUploadEmoji", "MsgSource:%s", new Object[] { localyc.vEG });
        }
        ab.d("MicroMsg.emoji.NetSceneUploadEmoji", "dispatcher, start:" + this.cuc.field_start + ", total:" + this.cuc.field_size + ", len:" + i);
        i = a(parame, this.ehh, this);
        AppMethodBeat.o(53151);
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53152);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed errtype:" + paramInt2 + " errcode:" + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(53152);
    }
    while (true)
    {
      return;
      paramArrayOfByte = (cky)((com.tencent.mm.ai.b)paramq).fsG.fsP;
      paramq = (ckz)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      if (paramArrayOfByte.wdV.size() != paramq.wdV.size())
      {
        ab.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed. RequestSize not equal RespSize. req size:" + paramq.wdV.size() + ", resp size:" + paramArrayOfByte.wdV.size());
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(53152);
      }
      else
      {
        paramString = (yd)paramq.wdV.get(0);
        if ((paramString.wdO == null) || (!paramString.wdO.equals(this.cuc.Aq())) || (paramString.ptx < this.cuc.field_start))
        {
          ab.e("MicroMsg.emoji.NetSceneUploadEmoji", "invalid server return value; start=" + paramString.ptx + ", size=" + this.cuc.field_size);
          this.ehi.onSceneEnd(4, -2, "", this);
          this.cuc.field_start = 0;
          ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.H(this.cuc);
          AppMethodBeat.o(53152);
        }
        else if (paramq.BaseResponse.Ret != 0)
        {
          ab.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed. resp.BaseResponse.Ret:%d", new Object[] { Integer.valueOf(paramq.BaseResponse.Ret) });
          this.ehi.onSceneEnd(4, -2, "", this);
          AppMethodBeat.o(53152);
        }
        else
        {
          if (this.kWx)
            this.kWx = false;
          if (paramString.ptx >= paramString.ptw)
          {
            ab.d("MicroMsg.emoji.NetSceneUploadEmoji", "respInfo.getMsgID() " + paramString.wdU);
            paramq = ((j)g.K(j.class)).bOr().jf(this.fDH);
            ab.d("MicroMsg.emoji.NetSceneUploadEmoji", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(paramString.ptF), Integer.valueOf(ae.giA) });
            if ((10007 == ae.giz) && (ae.giA != 0))
            {
              paramString.wdU = ae.giA;
              ae.giA = 0;
            }
            paramq.eI(paramString.ptF);
            ((j)g.K(j.class)).bOr().a(this.fDH, paramq);
            this.cuc.field_start = 0;
            this.cuc.field_lastUseTime = System.currentTimeMillis();
            this.cuc.field_state = EmojiInfo.yat;
            ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.H(this.cuc);
            if (paramq.bAA())
              com.tencent.mm.modelstat.b.fRa.a(paramq, com.tencent.mm.af.k.k(paramq));
            while (true)
            {
              this.ehi.onSceneEnd(paramInt2, paramInt3, "", this);
              AppMethodBeat.o(53152);
              break;
              com.tencent.mm.modelstat.b.fRa.j(paramq);
            }
          }
          this.cuc.field_start = paramString.ptx;
          this.cuc.field_lastUseTime = System.currentTimeMillis();
          ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.H(this.cuc);
          if (a(this.ftf, this.ehi) < 0)
            this.ehi.onSceneEnd(3, -1, "", this);
          AppMethodBeat.o(53152);
        }
      }
    }
  }

  public final int acn()
  {
    return 256;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 175;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.r
 * JD-Core Version:    0.6.2
 */