package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.a.cx;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.ckw;
import com.tencent.mm.protocal.protobuf.ckx;
import com.tencent.mm.protocal.protobuf.ye;
import com.tencent.mm.protocal.protobuf.yf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.LinkedList;

public final class f extends m
  implements k
{
  private EmojiInfo cuc;
  private final com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private long eyR;
  private boolean kWx;
  private int kWy;

  public f(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(53102);
    this.kWx = true;
    this.kWy = 256;
    this.eyR = System.currentTimeMillis();
    ab.w("MicroMsg.emoji.NetSceneEmojiUpload", "start upload at " + this.eyR);
    this.cuc = paramEmojiInfo;
    paramEmojiInfo = new b.a();
    paramEmojiInfo.fsJ = new ye();
    paramEmojiInfo.fsK = new yf();
    paramEmojiInfo.uri = "/cgi-bin/micromsg-bin/mmemojiupload";
    paramEmojiInfo.fsI = 703;
    paramEmojiInfo.fsL = 0;
    paramEmojiInfo.fsM = 0;
    this.ehh = paramEmojiInfo.acD();
    ye localye = (ye)this.ehh.fsG.fsP;
    paramEmojiInfo = new ckw();
    if (this.cuc != null)
    {
      h.pYm.k(164L, 13L, 1L);
      ab.i("MicroMsg.emoji.NetSceneEmojiUpload", "NetSceneEmojiUpload: %s", new Object[] { this.cuc.Aq() });
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.a(ah.getContext(), this.cuc);
      paramEmojiInfo.wdO = this.cuc.Aq();
      paramEmojiInfo.ptw = this.cuc.field_size;
      localye.wdV.add(paramEmojiInfo);
      this.kWy = (this.cuc.field_size / 8192 * 2);
    }
    AppMethodBeat.o(53102);
  }

  private void bkv()
  {
    AppMethodBeat.i(53105);
    this.cuc.field_start = 0;
    ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.G(this.cuc);
    AppMethodBeat.o(53105);
  }

  private void e(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    AppMethodBeat.i(53106);
    if ((paramEmojiInfo != null) && (!bo.isNullOrNil(paramEmojiInfo.Aq())))
    {
      ab.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] publicEmojiSyncTaskEvent emoji md5:%s success:%b", new Object[] { paramEmojiInfo.Aq(), Boolean.valueOf(paramBoolean) });
      cx localcx = new cx();
      localcx.cvY.cvZ = paramEmojiInfo.Aq();
      localcx.cvY.cuy = 0;
      localcx.cvY.success = paramBoolean;
      a.xxA.m(localcx);
      long l = System.currentTimeMillis() - this.eyR;
      ab.w("MicroMsg.emoji.NetSceneEmojiUpload", "finish cost " + l + " size " + paramEmojiInfo.field_size + " rate " + paramEmojiInfo.field_size / l);
    }
    AppMethodBeat.o(53106);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    int i = -1;
    AppMethodBeat.i(53103);
    this.ehi = paramf;
    ckw localckw = (ckw)((ye)this.ehh.fsG.fsP).wdV.get(0);
    int j;
    if (this.kWx)
    {
      ab.d("MicroMsg.emoji.NetSceneEmojiUpload", "dispatcher, firstSend. md5=" + localckw.wdO);
      localckw.ptx = 0;
      j = this.cuc.field_size + 0;
      if (j <= 8192)
        break label749;
      j = 8192;
    }
    label292: label609: label749: 
    while (true)
    {
      byte[] arrayOfByte;
      if ((this.cuc.field_reserved4 & EmojiInfo.yaB) == EmojiInfo.yaB)
      {
        arrayOfByte = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().l(this.cuc);
        if (!bo.cb(arrayOfByte))
        {
          paramf = new byte[j];
          ab.d("MicroMsg.emoji.NetSceneEmojiUpload", "total length:%d dataLen:%d ", new Object[] { Integer.valueOf(arrayOfByte.length), Integer.valueOf(j) });
          System.arraycopy(arrayOfByte, 0, paramf, 0, j);
          if ((paramf != null) && (paramf.length > 0))
            break label248;
          ab.e("MicroMsg.emoji.NetSceneEmojiUpload", "readFromFile is null.");
          AppMethodBeat.o(53103);
        }
      }
      while (true)
      {
        return i;
        ab.w("MicroMsg.emoji.NetSceneEmojiUpload", "buffer is null.");
        paramf = new byte[0];
        break;
        paramf = this.cuc.gZ(0, j);
        break;
        label248: localckw.ptx = 0;
        localckw.xiD = new com.tencent.mm.bt.b(paramf);
        int k = paramf.length;
        int m = localckw.xiD.wR.length;
        if (this.cuc == null)
        {
          j = -1;
          if (this.cuc != null)
            break label374;
        }
        while (true)
        {
          ab.i("MicroMsg.emoji.NetSceneEmojiUpload", "buf len:%d, string len:%d dispatcher, first emoji start:%d emoji total:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(i) });
          i = a(parame, this.ehh, this);
          AppMethodBeat.o(53103);
          break;
          j = this.cuc.field_start;
          break label292;
          label374: i = this.cuc.field_size;
        }
        if ((this.cuc != null) && (this.cuc.field_start != 0))
          break label419;
        ab.e("MicroMsg.emoji.NetSceneEmojiUpload", "emoji info is null. or start position is 0.");
        AppMethodBeat.o(53103);
      }
      j = this.cuc.field_size - this.cuc.field_start;
      if (j > 8192)
        j = 8192;
      while (true)
      {
        if ((this.cuc.field_reserved4 & EmojiInfo.yaB) == EmojiInfo.yaB)
        {
          arrayOfByte = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().l(this.cuc);
          if (!bo.cb(arrayOfByte))
          {
            paramf = new byte[j];
            ab.d("MicroMsg.emoji.NetSceneEmojiUpload", "total length:%d dataLen:%d", new Object[] { Integer.valueOf(arrayOfByte.length), Integer.valueOf(j) });
            System.arraycopy(arrayOfByte, this.cuc.field_start, paramf, 0, j);
          }
        }
        while (true)
        {
          if ((paramf != null) && (paramf.length > 0))
            break label609;
          ab.e("MicroMsg.emoji.NetSceneEmojiUpload", "readFromFile is null.");
          AppMethodBeat.o(53103);
          break;
          ab.w("MicroMsg.emoji.NetSceneEmojiUpload", "buffer is null.");
          paramf = new byte[0];
          continue;
          paramf = this.cuc.gZ(this.cuc.field_start, j);
        }
        i = paramf.length;
        localckw.ptx = this.cuc.field_start;
        localckw.xiD = new com.tencent.mm.bt.b(paramf);
        ab.i("MicroMsg.emoji.NetSceneEmojiUpload", "buf len:%d, string len:%d", new Object[] { Integer.valueOf(paramf.length), Integer.valueOf(localckw.xiD.wR.length) });
        ab.d("MicroMsg.emoji.NetSceneEmojiUpload", "dispatcher, start:" + this.cuc.field_start + ", total:" + this.cuc.field_size + ", len:" + i);
        i = a(parame, this.ehh, this);
        AppMethodBeat.o(53103);
        break;
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53104);
    ab.i("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd  errtype:" + paramInt2 + " errcode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      bkv();
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      e(this.cuc, false);
      AppMethodBeat.o(53104);
    }
    while (true)
    {
      return;
      ye localye = (ye)((com.tencent.mm.ai.b)paramq).fsG.fsP;
      paramArrayOfByte = (yf)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      if (localye.wdV.size() != paramArrayOfByte.wdV.size())
      {
        ab.e("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd failed. RequestSize not equal RespSize. req size:" + localye.wdV.size() + ", resp size:" + paramArrayOfByte.wdV.size());
        bkv();
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        e(this.cuc, false);
        AppMethodBeat.o(53104);
      }
      else
      {
        paramq = null;
        paramString = paramq;
        if (paramArrayOfByte.wdV != null)
        {
          paramString = paramq;
          if (paramArrayOfByte.wdV.size() > 0)
            paramString = (ckx)paramArrayOfByte.wdV.get(0);
        }
        int i;
        if ((paramString == null) || (paramString.wdO == null) || (!paramString.wdO.equals(this.cuc.Aq())) || (paramString.ptx < this.cuc.field_start))
        {
          paramq = paramString.wdO;
          i = paramString.ptw;
          if (paramString == null)
          {
            paramInt1 = -1;
            label324: if (this.cuc != null)
              break label435;
            paramInt2 = -1;
            label333: if (this.cuc != null)
              break label446;
          }
          label435: label446: for (paramInt3 = -1; ; paramInt3 = this.cuc.field_size)
          {
            ab.e("MicroMsg.emoji.NetSceneEmojiUpload", "md5:%s invalid server return value. respInfo.TotalLen:%d respInfo.StartPos:%d emoji.getStart():%d emoji total:%d", new Object[] { paramq, Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
            bkv();
            this.ehi.onSceneEnd(4, -2, "", this);
            e(this.cuc, false);
            AppMethodBeat.o(53104);
            break;
            paramInt1 = paramString.ptx;
            break label324;
            paramInt2 = this.cuc.field_start;
            break label333;
          }
        }
        if ((paramString != null) && (this.cuc != null) && (paramString.Ret != 0) && (paramString.ptx == paramString.ptw) && (paramString.ptx > 0))
        {
          ab.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] emoji upload success, but md5 backup faild.try to do batch emoji backup. %s respInfo.Ret:%d respInfo.StartPos:%d respInfo.TotalLen:%d", new Object[] { this.cuc.Aq(), Integer.valueOf(paramString.Ret), Integer.valueOf(paramString.ptx), Integer.valueOf(paramString.ptw) });
          bkv();
          this.ehi.onSceneEnd(paramInt2, paramInt3, "", this);
          AppMethodBeat.o(53104);
        }
        else
        {
          if ((paramArrayOfByte.BaseResponse.Ret != 0) || ((paramString != null) && (paramString.Ret != 0)))
          {
            i = paramArrayOfByte.BaseResponse.Ret;
            if (paramString == null);
            for (paramInt1 = -1; ; paramInt1 = paramString.Ret)
            {
              ab.e("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd failed. resp.BaseResponse.Ret:%d respInfo.Ret:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) });
              bkv();
              this.ehi.onSceneEnd(paramInt2, paramInt3, "", this);
              AppMethodBeat.o(53104);
              break;
            }
          }
          if (this.kWx)
            this.kWx = false;
          if (paramString.ptx >= paramString.ptw)
          {
            this.cuc.field_start = 0;
            this.cuc.field_state = EmojiInfo.yat;
            this.cuc.field_needupload = EmojiInfo.yaz;
            ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.G(this.cuc);
            this.ehi.onSceneEnd(paramInt2, paramInt3, "", this);
            e(this.cuc, true);
            ab.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] emoji upload success.");
            AppMethodBeat.o(53104);
          }
          else
          {
            ab.i("MicroMsg.emoji.NetSceneEmojiUpload", "next start pos is :%d", new Object[] { Integer.valueOf(paramString.ptx) });
            this.cuc.field_start = paramString.ptx;
            ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.G(this.cuc);
            if (a(this.ftf, this.ehi) < 0)
            {
              this.ehi.onSceneEnd(3, -1, "", this);
              e(this.cuc, false);
            }
            AppMethodBeat.o(53104);
          }
        }
      }
    }
  }

  public final int acn()
  {
    return this.kWy;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 703;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.f
 * JD-Core Version:    0.6.2
 */