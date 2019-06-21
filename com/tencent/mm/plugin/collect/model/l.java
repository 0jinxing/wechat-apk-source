package com.tencent.mm.plugin.collect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bbc;
import com.tencent.mm.protocal.protobuf.ox;
import com.tencent.mm.protocal.protobuf.oy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class l extends m
  implements k
{
  private final String TAG;
  private b ehh;
  private f ehi;
  public oy kCk;

  public l()
  {
    AppMethodBeat.i(40975);
    this.TAG = "MicroMsg.NetSceneF2fQrcode";
    b.a locala = new b.a();
    locala.fsJ = new ox();
    locala.fsK = new oy();
    locala.fsI = 1588;
    locala.uri = "/cgi-bin/mmpay-bin/f2fqrcode";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(40975);
  }

  private static JSONObject a(bbc parambbc)
  {
    Object localObject = null;
    AppMethodBeat.i(40979);
    int i;
    if ((parambbc != null) && (!bo.isNullOrNil(parambbc.cEh)))
    {
      i = 1;
      if (i != 0)
        break label48;
      ab.w("MicroMsg.NetSceneF2fQrcode", "empty menu item");
      AppMethodBeat.o(40979);
      parambbc = localObject;
    }
    while (true)
    {
      return parambbc;
      i = 0;
      break;
      label48: JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("type", parambbc.type);
        localJSONObject.put("wording", parambbc.cEh);
        localJSONObject.put("url", parambbc.url);
        localJSONObject.put("waapp_username", parambbc.wFS);
        localJSONObject.put("waapp_path", parambbc.wFT);
        AppMethodBeat.o(40979);
        parambbc = localJSONObject;
      }
      catch (JSONException parambbc)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneF2fQrcode", parambbc, "", new Object[0]);
        AppMethodBeat.o(40979);
        parambbc = localObject;
      }
    }
  }

  private static JSONArray bo(List<bbc> paramList)
  {
    AppMethodBeat.i(40978);
    JSONArray localJSONArray = new JSONArray();
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.w("MicroMsg.NetSceneF2fQrcode", "empty menu items");
      AppMethodBeat.o(40978);
      paramList = null;
    }
    while (true)
    {
      return paramList;
      int i = 0;
      try
      {
        while (i < paramList.size())
        {
          JSONObject localJSONObject = a((bbc)paramList.get(i));
          if (localJSONObject != null)
            localJSONArray.put(i, localJSONObject);
          i++;
        }
        AppMethodBeat.o(40978);
        paramList = localJSONArray;
      }
      catch (JSONException paramList)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneF2fQrcode", paramList, "", new Object[0]);
        AppMethodBeat.o(40978);
        paramList = null;
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(40976);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(40976);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(40977);
    this.kCk = ((oy)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneF2fQrcode", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    ab.d("MicroMsg.NetSceneF2fQrcode", "payurl: %s, true_name: %s, bottom_icon_url: %s", new Object[] { this.kCk.url, this.kCk.twd, this.kCk.vWa });
    if (!bo.isNullOrNil(this.kCk.url))
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xSV, this.kCk.url);
    }
    if (!bo.isNullOrNil(this.kCk.twd))
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xSW, this.kCk.twd);
    }
    g.RQ();
    g.RP().Ry().set(ac.a.xSY, this.kCk.vWa);
    paramArrayOfByte = a(this.kCk.vVZ);
    paramq = bo(this.kCk.vVY);
    if (paramArrayOfByte != null)
    {
      ab.d("MicroMsg.NetSceneF2fQrcode", "bottom: %s", new Object[] { paramArrayOfByte.toString() });
      g.RQ();
      g.RP().Ry().set(ac.a.xSX, paramArrayOfByte.toString());
    }
    if (paramq != null)
    {
      ab.d("MicroMsg.NetSceneF2fQrcode", "upright: %s", new Object[] { paramq.toString() });
      g.RQ();
      g.RP().Ry().set(ac.a.xSZ, paramq.toString());
    }
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(40977);
  }

  public final int getType()
  {
    return 1588;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.l
 * JD-Core Version:    0.6.2
 */