package com.tencent.mm.plugin.shake.d.a;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.bp;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.atx;
import com.tencent.mm.protocal.protobuf.aty;
import com.tencent.mm.protocal.protobuf.aud;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends m
  implements k
{
  int action;
  private f ehi;
  final b fAT;
  private long qtH;

  public d(Collection<h.a> paramCollection, float paramFloat1, float paramFloat2, int paramInt)
  {
    AppMethodBeat.i(24610);
    this.action = 1;
    this.qtH = 0L;
    this.action = 1;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new atx();
    ((b.a)localObject1).fsK = new aty();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/ibeaconboardcast";
    ((b.a)localObject1).fsI = 658;
    ((b.a)localObject1).fsL = 0;
    ((b.a)localObject1).fsM = 0;
    this.fAT = ((b.a)localObject1).acD();
    Object localObject2 = bp.aao();
    localObject1 = bo.nullAsNil(((bp)localObject2).fnp);
    String str = bo.nullAsNil(((bp)localObject2).fno);
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    localObject2 = (atx)this.fAT.fsG.fsP;
    ((atx)localObject2).wxX = bo.nullAsNil(null);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{\"Beacons\":[");
    if (paramCollection != null)
    {
      i = paramCollection.size();
      Iterator localIterator = paramCollection.iterator();
      for (j = 0; localIterator.hasNext(); j++)
      {
        h.a locala = (h.a)localIterator.next();
        localStringBuilder.append("{\"UUID\":\"" + locala.eCq + "\",\"Location\":{\"Major\":" + locala.major + ",\"Minor\":" + locala.minor + "},\"Distance\":" + locala.fNN + ",\"Extra\":\"\",\"MacAddress\":\"" + locala.qtR + "\",\"Rssi\":\"" + locala.qtS + "\",\"MeasurePower\":\"" + locala.qtT + "\"}");
        if (j < i - 1)
          localStringBuilder.append(",");
      }
    }
    int i = 1;
    boolean bool = ah.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    int j = i;
    if (localBluetoothAdapter != null)
    {
      j = i;
      if (localBluetoothAdapter.getState() == 12)
      {
        j = i;
        if (Build.VERSION.SDK_INT >= 18)
        {
          j = i;
          if (bool)
            j = 0;
        }
      }
    }
    localStringBuilder.append("],\"Action\":1,\"LBS\":{\"Latitude\":" + paramFloat1 + ",\"Longitude\":" + paramFloat2 + ",\"Province\":\"" + (String)localObject1 + "\",\"City\":\"" + str + "\"},\"MachineID\":\"" + com.tencent.mm.compatible.e.q.LM() + "\",\"ZBBeaconState\":\"" + j + "\"}");
    ((atx)localObject2).ncM = localStringBuilder.toString();
    if (paramCollection != null);
    for (j = paramCollection.size(); ; j = 0)
    {
      ab.i("MicroMsg.NetSceneShakeIbeacon", "[oneliang]beaconCollection.size:%d,json:%s", new Object[] { Integer.valueOf(j), ((atx)localObject2).ncM });
      o.a(2008, paramFloat2, paramFloat1, paramInt);
      AppMethodBeat.o(24610);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(24611);
    this.qtH = System.currentTimeMillis();
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(24611);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24612);
    ab.i("MicroMsg.NetSceneShakeIbeacon", "[oneliang][NetSceneShakeIbeacon]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    this.qtH = (System.currentTimeMillis() - this.qtH);
    h.pYm.e(11497, new Object[] { String.valueOf((int)(this.qtH / 1000L + 0.5D)), Integer.valueOf(1), Integer.valueOf((int)this.qtH) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      ab.d("MicroMsg.NetSceneShakeIbeacon", "[oneliang][NetSceneShakeIbeacon]:net end ok");
      paramString = (aty)this.fAT.fsH.fsP;
    }
    while (true)
    {
      Object localObject1;
      int i;
      try
      {
        paramArrayOfByte = ((atx)this.fAT.fsG.fsP).ncM;
        paramq = new org/json/JSONObject;
        paramq.<init>(paramArrayOfByte);
        localObject1 = paramq.getJSONArray("Beacons");
        paramInt2 = ((JSONArray)localObject1).length();
        paramArrayOfByte = paramq.getJSONObject("LBS");
        paramInt3 = paramq.getInt("Action");
        paramq = paramArrayOfByte.getString("Latitude");
        paramArrayOfByte = paramArrayOfByte.getString("Longitude");
        if (paramInt2 > 0)
        {
          Object localObject2 = ((JSONArray)localObject1).getJSONObject(0);
          localObject1 = ((JSONObject)localObject2).getString("UUID");
          localObject2 = ((JSONObject)localObject2).getJSONObject("Location");
          paramInt1 = ((JSONObject)localObject2).getInt("Major");
          i = ((JSONObject)localObject2).getInt("Minor");
          if (paramString.wxY.vYu == 0)
          {
            localObject2 = paramString.wxY.mZR;
            if ((paramInt3 == 1) && (localObject2 != null) && (!((String)localObject2).equals("")))
            {
              JSONObject localJSONObject = new org/json/JSONObject;
              localJSONObject.<init>((String)localObject2);
              if (localJSONObject.getJSONArray("msgs").length() == 0)
                h.pYm.e(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2), localObject1, Integer.valueOf(paramInt1), Integer.valueOf(i), paramq, paramArrayOfByte, Integer.valueOf(2), Integer.valueOf(paramString.wxY.vYu) });
            }
            AppMethodBeat.o(24612);
            return;
          }
          h.pYm.e(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2), localObject1, Integer.valueOf(paramInt1), Integer.valueOf(i), paramq, paramArrayOfByte, Integer.valueOf(2), Integer.valueOf(paramString.wxY.vYu) });
          AppMethodBeat.o(24612);
          continue;
        }
      }
      catch (JSONException paramString)
      {
        ab.e("MicroMsg.NetSceneShakeIbeacon", "parse IBeaconBoardcastRequest json error!");
        AppMethodBeat.o(24612);
        continue;
        h.pYm.e(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2), "", Integer.valueOf(0), Integer.valueOf(0), paramq, paramArrayOfByte, Integer.valueOf(2), Integer.valueOf(paramString.wxY.vYu) });
        AppMethodBeat.o(24612);
        continue;
      }
      ab.d("MicroMsg.NetSceneShakeIbeacon", "[oneliang][NetSceneShakeIbeacon]:net end not ok");
      paramq = ((atx)this.fAT.fsG.fsP).ncM;
      try
      {
        paramString = new org/json/JSONObject;
        paramString.<init>(paramq);
        paramArrayOfByte = paramString.getJSONArray("Beacons");
        paramInt2 = paramArrayOfByte.length();
        paramq = paramString.getJSONObject("LBS");
        paramString = paramq.getString("Latitude");
        paramq = paramq.getString("Longitude");
        if (paramInt2 <= 0)
          break label884;
        localObject1 = paramArrayOfByte.getJSONObject(0);
        paramArrayOfByte = ((JSONObject)localObject1).getString("UUID");
        localObject1 = ((JSONObject)localObject1).getJSONObject("Location");
        paramInt1 = ((JSONObject)localObject1).getInt("Major");
        i = ((JSONObject)localObject1).getInt("Minor");
        h.pYm.e(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2), paramArrayOfByte, Integer.valueOf(paramInt1), Integer.valueOf(i), paramString, paramq, Integer.valueOf(1), Integer.valueOf(paramInt3) });
        AppMethodBeat.o(24612);
      }
      catch (JSONException paramString)
      {
        ab.e("MicroMsg.NetSceneShakeIbeacon", "parse IBeaconBoardcastRequest json error!");
        AppMethodBeat.o(24612);
      }
      continue;
      label884: h.pYm.e(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2), "", Integer.valueOf(0), Integer.valueOf(0), paramString, paramq, Integer.valueOf(1), Integer.valueOf(paramInt3) });
      AppMethodBeat.o(24612);
    }
  }

  public final int getType()
  {
    return 658;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.d
 * JD-Core Version:    0.6.2
 */