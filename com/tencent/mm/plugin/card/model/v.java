package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.d.t;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.protocal.protobuf.oe;
import com.tencent.mm.protocal.protobuf.of;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class v extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String kea;
  public ArrayList<od> keb;

  public v(String paramString1, float paramFloat1, float paramFloat2, String paramString2)
  {
    AppMethodBeat.i(87879);
    this.kea = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new oe();
    ((b.a)localObject).fsK = new of();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/cardshoplbs";
    ((b.a)localObject).fsI = 563;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (oe)this.ehh.fsG.fsP;
    ((oe)localObject).kbU = paramString1;
    ((oe)localObject).cGm = paramFloat1;
    ((oe)localObject).cEB = paramFloat2;
    ((oe)localObject).cMC = paramString2;
    ab.d("MicroMsg.NetSceneCardShopLBS", "<init>, cardId = %s, longtitude = %f, latitude = %f, card_id = %s", new Object[] { paramString1, Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), paramString2 });
    AppMethodBeat.o(87879);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87880);
    int i;
    if (bo.isNullOrNil(((oe)this.ehh.fsG.fsP).kbU))
    {
      ab.e("MicroMsg.NetSceneCardShopLBS", "doScene fail, cardId is null");
      i = -1;
      AppMethodBeat.o(87880);
    }
    while (true)
    {
      return i;
      this.ehi = paramf;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(87880);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87881);
    ab.i("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = ((of)this.ehh.fsH.fsP).kdS;
      if (TextUtils.isEmpty(paramq))
        ab.e("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd fail, json_ret is empty");
      this.keb = t.Hz(paramq);
      if (this.keb != null)
        ab.d("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd, respList size = %d", new Object[] { Integer.valueOf(this.keb.size()) });
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87881);
  }

  public final int getType()
  {
    return 563;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.v
 * JD-Core Version:    0.6.2
 */