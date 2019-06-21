package com.tencent.mm.plugin.music.model.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.aw.d;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.music.model.e.a;
import com.tencent.mm.protocal.protobuf.amy;
import com.tencent.mm.protocal.protobuf.amz;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  private f ehi;
  private com.tencent.mm.ai.b fAT;
  public amz oMG;
  public boolean oMH;
  public a oMw;

  public b(a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(104965);
    this.oMw = parama;
    this.oMH = paramBoolean;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new amy();
    ((b.a)localObject).fsK = new amz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getqqmusiclyric";
    ((b.a)localObject).fsI = 520;
    this.fAT = ((b.a)localObject).acD();
    localObject = (amy)this.fAT.fsG.fsP;
    ((amy)localObject).fKj = parama.field_songId;
    if (parama.field_songWebUrl != null)
      ((amy)localObject).wrz = aa.ad(parama.field_songWebUrl.getBytes());
    if (d.aio())
    {
      i = 0;
      ((amy)localObject).wrA = i;
      if (!d.ain())
        break label203;
    }
    label203: for (int i = 1; ; i = 0)
    {
      ((amy)localObject).wrB = i;
      ab.i("MicroMsg.Music.NetSceneGetQQMusicLyric", "songId=%d, url=%s IsOutsideGFW=%d ShakeMusicGlobalSwitch=%d", new Object[] { Integer.valueOf(parama.field_songId), parama.field_songWebUrl, Integer.valueOf(((amy)localObject).wrA), Integer.valueOf(((amy)localObject).wrB) });
      AppMethodBeat.o(104965);
      return;
      i = 1;
      break;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(104967);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(104967);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(104966);
    ab.i("MicroMsg.Music.NetSceneGetQQMusicLyric", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(104966);
    }
    while (true)
    {
      return;
      this.oMG = ((amz)this.fAT.fsH.fsP);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(104966);
    }
  }

  public final int getType()
  {
    return 520;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.b.b
 * JD-Core Version:    0.6.2
 */