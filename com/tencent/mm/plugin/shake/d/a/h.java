package com.tencent.mm.plugin.shake.d.a;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.shake.b.e;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.protocal.protobuf.aty;
import com.tencent.mm.protocal.protobuf.aud;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h extends l.b
  implements f
{
  public static int qtP = 3;
  private float ecs;
  private float ect;
  private b.a ecy;
  private com.tencent.mm.modelgeo.d fwu;
  private int qfw;
  private d qtK;
  public Collection<h.a> qtL;
  private int qtM;
  private int qtN;
  private int qtO;

  public h(l.a parama)
  {
    super(parama);
    AppMethodBeat.i(24623);
    this.qtL = null;
    this.ecs = -85.0F;
    this.ect = -1000.0F;
    this.qfw = -1000;
    this.qtM = 10001;
    this.qtN = 10002;
    this.qtO = 10003;
    this.ecy = new b.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        AppMethodBeat.i(24619);
        if (!paramAnonymousBoolean)
        {
          paramAnonymousBoolean = true;
          AppMethodBeat.o(24619);
        }
        while (true)
        {
          return paramAnonymousBoolean;
          h.a(h.this, paramAnonymousFloat2);
          h.b(h.this, paramAnonymousFloat1);
          h.a(h.this, (int)paramAnonymousDouble2);
          paramAnonymousBoolean = false;
          AppMethodBeat.o(24619);
        }
      }
    };
    AppMethodBeat.o(24623);
  }

  public static void a(com.tencent.mm.plugin.shake.b.d paramd)
  {
    AppMethodBeat.i(24632);
    if ((paramd != null) && (paramd.field_sex == qtP))
    {
      aw.ZK();
      c.Ry().set(ac.a.xMp, Boolean.TRUE);
      long l = bo.anT();
      aw.ZK();
      c.Ry().set(ac.a.xMq, Long.valueOf(l));
    }
    try
    {
      String str = new java/lang/String;
      str.<init>(paramd.field_lvbuffer, "utf-8");
      paramd = str;
      if (paramd != null)
      {
        paramd = paramd.split(",");
        if (paramd.length == 4)
        {
          aw.ZK();
          c.Ry().set(ac.a.xMi, Long.valueOf(paramd[0]));
        }
      }
      AppMethodBeat.o(24632);
      return;
    }
    catch (UnsupportedEncodingException paramd)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ShakeIbeaconService", paramd, "%s", new Object[] { "Unsupported" });
        paramd = null;
      }
    }
  }

  public static void b(com.tencent.mm.plugin.shake.b.d paramd)
  {
    AppMethodBeat.i(24633);
    if (paramd != null);
    try
    {
      String str = new java/lang/String;
      str.<init>(paramd.field_lvbuffer, "utf-8");
      paramd = str;
      if (paramd != null)
      {
        Object localObject = paramd.split(",");
        if (localObject.length == 4)
        {
          paramd = localObject[1];
          str = localObject[2];
          localObject = localObject[3];
          h.a locala = new h.a();
          locala.eCq = paramd;
          locala.major = bo.getInt(str, 0);
          locala.minor = bo.getInt((String)localObject, 0);
        }
      }
      AppMethodBeat.o(24633);
      return;
    }
    catch (UnsupportedEncodingException paramd)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ShakeIbeaconService", paramd, "%s", new Object[] { "Unsupported" });
        paramd = null;
      }
    }
  }

  private void cjv()
  {
    AppMethodBeat.i(24629);
    this.fwu = com.tencent.mm.modelgeo.d.agz();
    this.fwu.a(this.ecy, true);
    AppMethodBeat.o(24629);
  }

  public final void cjw()
  {
    AppMethodBeat.i(24630);
    super.cjw();
    aw.Rg().b(658, this);
    AppMethodBeat.o(24630);
  }

  public final void init()
  {
    AppMethodBeat.i(24624);
    aw.Rg().a(658, this);
    cjv();
    AppMethodBeat.o(24624);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(24631);
    ab.i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService]onSceneEnd :netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (d)paramm;
      if ((658 == paramm.getType()) && (paramString.action == 1))
      {
        paramString = (aty)paramString.fAT.fsH.fsP;
        if (paramString.wxY.vYu == 0)
        {
          ab.i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb]onSceneEnd :message:%s,tips:%s,result:%s", new Object[] { paramString.wxY.mZR, paramString.wxY.phA, Integer.valueOf(paramString.wxY.vYu) });
          paramm = paramString.wxY.mZR;
        }
      }
    }
    while (true)
    {
      try
      {
        paramString = new org/json/JSONObject;
        paramString.<init>(paramm);
        JSONArray localJSONArray = paramString.getJSONArray("msgs");
        paramm = paramString.getJSONObject("guide_switch");
        paramInt2 = paramm.getInt("channel_open_method");
        long l = paramm.getLong("channel_open_time");
        int i = paramm.getInt("shake_tab_display");
        paramInt1 = paramString.getJSONObject("gated_launch_option").getInt("tab_state");
        aw.ZK();
        c.Ry().set(ac.a.xMj, Integer.valueOf(paramInt2));
        aw.ZK();
        c.Ry().set(ac.a.xMk, Long.valueOf(l));
        aw.ZK();
        c.Ry().set(ac.a.xMl, Integer.valueOf(i));
        aw.ZK();
        c.Ry().set(ac.a.xMu, Integer.valueOf(paramInt1));
        paramString = new java/lang/StringBuilder;
        paramString.<init>("[shakezb]channel_open_method is ");
        ab.i("MicroMsg.ShakeIbeaconService", paramInt2 + " ,channel_open_time is " + l + ", shake_tab_display is " + i);
        i = localJSONArray.length();
        paramString = null;
        e locale = com.tencent.mm.plugin.shake.b.m.cjS();
        locale.cjI();
        if (i > 0)
        {
          paramm = new java/util/ArrayList;
          paramm.<init>();
          paramInt1 = 0;
          paramString = paramm;
          if (paramInt1 < i)
          {
            paramString = new com/tencent/mm/plugin/shake/b/d;
            paramString.<init>();
            JSONObject localJSONObject = localJSONArray.getJSONObject(paramInt1);
            String str1 = localJSONObject.getString("url");
            String str2 = localJSONObject.getString("content");
            Object localObject1 = localJSONObject.getString("title");
            String str3 = localJSONObject.getString("picurl");
            String str4 = localJSONObject.getString("shopid");
            Object localObject2 = localJSONObject.getJSONObject("beacon");
            Object localObject3 = ((JSONObject)localObject2).getString("uuid");
            String str5 = ((JSONObject)localObject2).getString("major");
            String str6 = ((JSONObject)localObject2).getString("minor");
            int j = localJSONObject.getInt("guide_state");
            localObject2 = localJSONObject.getString("wxa_username");
            String str7 = localJSONObject.getString("wxa_path");
            int k = localJSONObject.getInt("wxa_version_type");
            paramString.field_type = 11;
            paramString.field_username = ((String)localObject1);
            paramString.field_nickname = ((String)localObject1);
            paramString.field_signature = str2;
            paramString.field_province = str3;
            paramString.field_city = str1;
            if (j == 1)
              paramString.field_sex = qtP;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            paramString.field_lvbuffer = (String.valueOf(str4) + "," + String.valueOf(localObject3) + "," + String.valueOf(str5) + "," + String.valueOf(str6)).getBytes("utf-8");
            paramString.field_insertBatch = 2;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            paramString.field_reserved3 = ((String)localObject2 + "," + str7 + "," + k);
            paramm.add(paramString);
            locale.a(paramString, true);
            if ((paramString.field_sex == qtP) && (paramInt2 == 1))
              a(paramString);
            paramInt1++;
            continue;
          }
        }
        this.qrT.b(paramString, 1L);
        AppMethodBeat.o(24631);
        return;
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb] parse error.%s", new Object[] { bo.nullAsNil(paramString.getMessage()) });
        this.qrT.b(null, 1L);
        AppMethodBeat.o(24631);
        continue;
      }
      if (paramString.wxY.vYu == this.qtM)
      {
        this.qrT.b(null, 6L);
        AppMethodBeat.o(24631);
      }
      else if (paramString.wxY.vYu == this.qtN)
      {
        this.qrT.b(null, 7L);
        AppMethodBeat.o(24631);
      }
      else if (paramString.wxY.vYu == this.qtO)
      {
        this.qrT.b(null, 8L);
        AppMethodBeat.o(24631);
      }
      else
      {
        this.qrT.b(null, 1L);
        AppMethodBeat.o(24631);
        continue;
        this.qrT.b(null, 3L);
        AppMethodBeat.o(24631);
      }
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(24627);
    if (this.fwu != null)
      this.fwu.c(this.ecy);
    AppMethodBeat.o(24627);
  }

  public final void reset()
  {
    AppMethodBeat.i(24625);
    if (this.qtK != null)
      aw.Rg().c(this.qtK);
    AppMethodBeat.o(24625);
  }

  public final void resume()
  {
    AppMethodBeat.i(24628);
    if (this.fwu != null)
      this.fwu.a(this.ecy, true);
    AppMethodBeat.o(24628);
  }

  public final void start()
  {
    AppMethodBeat.i(24626);
    ab.i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb]:start");
    init();
    reset();
    if (this.fwu == null)
      cjv();
    this.fwu.b(this.ecy, true);
    Object localObject;
    if ((!Build.VERSION.RELEASE.equals("6.0")) && (!Build.VERSION.RELEASE.equals("6.0.0")) && (Build.VERSION.SDK_INT >= 23))
    {
      localObject = (LocationManager)ah.getContext().getSystemService("location");
      if (localObject == null)
        break label307;
    }
    label307: for (boolean bool = ((LocationManager)localObject).isProviderEnabled("gps"); ; bool = true)
    {
      if (!bool)
      {
        new ak().postDelayed(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(24620);
            h.a(h.this).b(null, 8L);
            AppMethodBeat.o(24620);
          }
        }
        , 1000L);
        AppMethodBeat.o(24626);
      }
      while (true)
      {
        return;
        localObject = BluetoothAdapter.getDefaultAdapter();
        if ((localObject != null) && (((BluetoothAdapter)localObject).getState() != 12))
        {
          new ak().postDelayed(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(24621);
              h.b(h.this).b(null, 9L);
              AppMethodBeat.o(24621);
            }
          }
          , 1000L);
          AppMethodBeat.o(24626);
        }
        else
        {
          if (localObject != null)
            break;
          new ak().postDelayed(new h.4(this), 1000L);
          AppMethodBeat.o(24626);
        }
      }
      if (this.qtL != null);
      for (int i = this.qtL.size(); ; i = 0)
      {
        ab.i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb]:beaconCollection.size:%d", new Object[] { Integer.valueOf(i) });
        this.qtK = new d(this.qtL, this.ecs, this.ect, this.qfw);
        aw.Rg().a(this.qtK, 0);
        AppMethodBeat.o(24626);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.h
 * JD-Core Version:    0.6.2
 */