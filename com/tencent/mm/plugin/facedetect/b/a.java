package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.i.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.facedetect.model.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class a
  implements f
{
  public int lSf;
  public d lSg;
  public c lSh;
  public boolean lSi;
  public boolean lSj;
  public long lSk;
  public int lSl;
  public m lSm;
  public m lSn;
  public long lSo;
  public int lSp;
  public int lSq;
  public g.a lSr;

  public a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(59);
    this.lSf = -1;
    this.lSg = null;
    this.lSh = null;
    this.lSi = false;
    this.lSj = false;
    this.lSk = 0L;
    this.lSl = 0;
    this.lSm = null;
    this.lSn = null;
    this.lSo = -1L;
    this.lSp = -1;
    this.lSr = new a.1(this);
    this.lSf = paramInt1;
    this.lSq = paramInt2;
    AppMethodBeat.o(59);
  }

  public final void bsd()
  {
    AppMethodBeat.i(60);
    if (this.lSn != null)
      g.Rg().b(this.lSn.getType(), this);
    AppMethodBeat.o(60);
  }

  public final void m(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(61);
    al.d(new a.2(this, paramInt1, paramInt2, paramString));
    AppMethodBeat.o(61);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(62);
    ab.i("MicroMsg.FaceUploadProcessor", "hy: scene: %s, errType: %d, errCode: %d, errMsg: %s", new Object[] { paramm.toString(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (((paramm instanceof u)) || ((paramm instanceof v)))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (b)paramm;
        this.lSk = paramString.bse();
        e.il(this.lSk);
        if (paramString.bsf() == null)
        {
          ab.e("MicroMsg.FaceUploadProcessor", "hy: backend not return config");
          m(2, 90015, "face motion config from server is null");
          AppMethodBeat.o(62);
        }
      }
    while (true)
    {
      return;
      paramString = paramString.bsf();
      paramInt1 = paramString.length;
      if (this.lSg == null)
        bool = true;
      ab.i("MicroMsg.FaceUploadProcessor", "configLen: %d, mUploadCallback == null: %b", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(bool) });
      if (this.lSh != null)
        this.lSh.e(this.lSk, paramString);
      AppMethodBeat.o(62);
      continue;
      if (this.lSh != null)
      {
        this.lSh.aw(paramInt1, "get face bio config failed");
        AppMethodBeat.o(62);
        continue;
        if ((this.lSn != null) && (paramm.getType() == this.lSn.getType()))
        {
          this.lSp = ((int)(System.currentTimeMillis() - this.lSo));
          if (this.lSg != null)
            this.lSg.g(paramInt1, paramInt2, paramString, paramm);
        }
      }
      else
      {
        AppMethodBeat.o(62);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.a
 * JD-Core Version:    0.6.2
 */