package com.tencent.mm.ah;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.cd.h;
import com.tencent.mm.model.r;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ajj;
import com.tencent.mm.protocal.protobuf.ajk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import java.io.IOException;
import java.io.OutputStream;

final class k extends m
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ai.f ehi;
  private String frH;
  private int frL;
  private String frN;
  private int fsc;
  private String fsd;
  private OutputStream output;
  private String username;

  public k(String paramString)
  {
    AppMethodBeat.i(77932);
    this.output = null;
    this.username = paramString;
    if (ad.mR(paramString))
      this.username = ad.aoC(paramString);
    ab.i("MicroMsg.NetSceneGetHDHeadImg", "init Headimage in_username:" + paramString + " out_username" + this.username);
    this.frL = 480;
    this.fsc = 480;
    this.frN = "jpg";
    AppMethodBeat.o(77932);
  }

  private int R(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(77938);
    try
    {
      if (this.output == null)
        this.output = com.tencent.mm.vfs.e.L(this.fsd, false);
      this.output.write(paramArrayOfByte);
      i = paramArrayOfByte.length;
      AppMethodBeat.o(77938);
      return i;
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        ab.e("MicroMsg.NetSceneGetHDHeadImg", "exception:%s", new Object[] { bo.l(paramArrayOfByte) });
        int i = -1;
        AppMethodBeat.o(77938);
      }
    }
  }

  private void aco()
  {
    AppMethodBeat.i(77939);
    try
    {
      if (this.output != null)
      {
        this.output.flush();
        this.output.close();
        this.output = null;
      }
      AppMethodBeat.o(77939);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.e("MicroMsg.NetSceneGetHDHeadImg", "exception:%s", new Object[] { bo.l(localIOException) });
        AppMethodBeat.o(77939);
      }
    }
  }

  public static void av(String paramString1, String paramString2)
  {
    AppMethodBeat.i(77936);
    o.acd().au(paramString1, paramString2);
    AppMethodBeat.o(77936);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    int i = 0;
    AppMethodBeat.i(77933);
    this.ehi = paramf;
    int j;
    if ((this.username == null) || (this.username.length() == 0))
    {
      ab.e("MicroMsg.NetSceneGetHDHeadImg", "username is null");
      AppMethodBeat.o(77933);
      j = -1;
    }
    Object localObject1;
    while (true)
    {
      return j;
      if (this.username.endsWith("@qqim"))
      {
        ab.e("MicroMsg.NetSceneGetHDHeadImg", "never try get qq user hd.");
        AppMethodBeat.o(77933);
        j = -1;
      }
      else
      {
        localObject1 = o.acu();
        o.acd();
        this.frH = d.C(this.username, true);
        if (!com.tencent.mm.vfs.e.ct(this.frH))
          break;
        ab.i("MicroMsg.NetSceneGetHDHeadImg", "The HDAvatar of " + this.username + " is already exists");
        AppMethodBeat.o(77933);
        j = 0;
      }
    }
    this.fsd = (this.frH + ".tmp");
    paramf = ((g)localObject1).qm(this.username);
    Object localObject2;
    if (paramf == null)
    {
      com.tencent.mm.vfs.e.deleteFile(this.fsd);
      paramf = new f();
      paramf.username = this.username;
      paramf.frN = this.frN;
      paramf.frL = this.frL;
      paramf.frM = this.fsc;
      paramf.bJt = -1;
      localObject2 = paramf.Hl();
      ((g)localObject1).fni.insert("hdheadimginfo", "username", (ContentValues)localObject2);
      localObject1 = new b.a();
      ((b.a)localObject1).fsJ = new ajj();
      ((b.a)localObject1).fsK = new ajk();
      ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/gethdheadimg";
      ((b.a)localObject1).fsI = 158;
      ((b.a)localObject1).fsL = 47;
      ((b.a)localObject1).fsM = 1000000047;
      localObject1 = ((b.a)localObject1).acD();
      localObject2 = (ajj)((com.tencent.mm.ai.b)localObject1).fsG.fsP;
      if (ad.mR(this.username))
        break label648;
      ((ajj)localObject2).jBB = this.username;
      ((ajj)localObject2).wpi = 1;
    }
    while (true)
    {
      ab.d("MicroMsg.NetSceneGetHDHeadImg", "inUser:" + this.username + " outUser:" + ((ajj)localObject2).jBB + " outType:" + ((ajj)localObject2).wpi);
      ((ajj)localObject2).wpf = this.frL;
      ((ajj)localObject2).wpg = this.fsc;
      ((ajj)localObject2).wph = this.frN;
      ((ajj)localObject2).ptw = paramf.frO;
      ((ajj)localObject2).ptx = paramf.coc;
      j = a(parame, (q)localObject1, this);
      AppMethodBeat.o(77933);
      break;
      localObject2 = this.fsd;
      j = i;
      if (paramf != null)
      {
        j = i;
        if (localObject2 != null)
        {
          if (((String)localObject2).length() != 0)
            break label580;
          j = i;
        }
      }
      while (true)
      {
        if (j == 0)
        {
          com.tencent.mm.vfs.e.deleteFile(this.fsd);
          paramf.reset();
          paramf.username = this.username;
          paramf.frN = this.frN;
          paramf.frL = this.frL;
          paramf.frM = this.fsc;
          ((g)localObject1).a(this.username, paramf);
        }
        break;
        label580: j = i;
        if (paramf.aci().equals(this.frN))
        {
          j = i;
          if (paramf.frL == this.frL)
          {
            j = i;
            if (paramf.frM == this.fsc)
            {
              j = i;
              if (com.tencent.mm.vfs.e.asZ((String)localObject2) == paramf.coc)
                j = 1;
            }
          }
        }
      }
      label648: if (this.username.equals(r.Yz() + "@bottle"))
      {
        ((ajj)localObject2).jBB = r.Yz();
        ((ajj)localObject2).wpi = 2;
      }
      else
      {
        ((ajj)localObject2).jBB = this.username;
        ((ajj)localObject2).wpi = 2;
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(77935);
    paramArrayOfByte = (ajk)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    ab.d("MicroMsg.NetSceneGetHDHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 4) && (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneGetHDHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      aco();
      AppMethodBeat.o(77935);
    }
    while (true)
    {
      return;
      if ((paramInt2 == 4) || (paramInt2 == 5))
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        ab.e("MicroMsg.NetSceneGetHDHeadImg", "ErrType:".concat(String.valueOf(paramInt2)));
        aco();
        AppMethodBeat.o(77935);
      }
      else
      {
        paramInt1 = paramq.ZS().vyl;
        if ((paramInt1 == -4) || (paramInt1 == -54) || (paramInt1 == -55))
          ab.e("MicroMsg.NetSceneGetHDHeadImg", "retcode == ".concat(String.valueOf(paramInt1)));
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          if (paramInt1 == 0)
            break label262;
          ab.e("MicroMsg.NetSceneGetHDHeadImg", "handleCertainError");
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          aco();
          AppMethodBeat.o(77935);
          break;
        }
        label262: int i = -1;
        paramInt1 = i;
        if (paramArrayOfByte.ptz != null)
        {
          paramInt1 = i;
          if (paramArrayOfByte.ptz.getBuffer() != null)
            paramInt1 = R(paramArrayOfByte.ptz.getBuffer().wR);
        }
        if (paramInt1 < 0)
        {
          ab.e("MicroMsg.NetSceneGetHDHeadImg", "appendBuf fail");
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          aco();
          AppMethodBeat.o(77935);
        }
        else
        {
          g localg = o.acu();
          paramq = localg.qm(this.username);
          if (paramq == null)
          {
            ab.e("MicroMsg.NetSceneGetHDHeadImg", "info == null");
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            aco();
            AppMethodBeat.o(77935);
          }
          else
          {
            paramq.coc = (paramInt1 + paramArrayOfByte.ptx);
            paramq.frO = paramArrayOfByte.ptw;
            localg.a(this.username, paramq);
            if (paramq.coc >= paramq.frO);
            for (paramInt1 = 1; ; paramInt1 = 0)
            {
              if (paramInt1 != 0)
                break label549;
              ab.i("MicroMsg.NetSceneGetHDHeadImg", "%d doScene again info[%s %d %d]", new Object[] { Integer.valueOf(hashCode()), this.username, Integer.valueOf(paramq.coc), Integer.valueOf(paramq.frO) });
              if (a(this.ftf, this.ehi) < 0)
                this.ehi.onSceneEnd(3, -1, "", this);
              AppMethodBeat.o(77935);
              break;
            }
            label549: com.tencent.mm.vfs.e.aQ(this.fsd, this.frH);
            av(this.frH, this.username);
            aco();
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(77935);
          }
        }
      }
    }
  }

  public final int acn()
  {
    return 10;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(77934);
    if ((this.username == null) || (this.username.length() == 0))
    {
      paramq = m.b.ftv;
      AppMethodBeat.o(77934);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(77934);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(77937);
    super.cancel();
    aco();
    AppMethodBeat.o(77937);
  }

  public final int getType()
  {
    return 158;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.k
 * JD-Core Version:    0.6.2
 */