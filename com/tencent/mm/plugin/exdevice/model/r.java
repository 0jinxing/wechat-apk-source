package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.ass;
import com.tencent.mm.protocal.protobuf.ast;
import com.tencent.mm.sdk.platformtools.ab;

public final class r extends com.tencent.mm.ai.m
  implements k
{
  private String cwz;
  private com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  String ltF;

  public r(String paramString1, String paramString2, String paramString3, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19329);
    this.ehi = null;
    this.ehh = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ass();
    ((b.a)localObject).fsK = new ast();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/harddeviceauth";
    ((b.a)localObject).fsI = 541;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    ass localass = (ass)this.ehh.fsG.fsP;
    localObject = new asq();
    ((asq)localObject).vIk = paramString2;
    ((asq)localObject).jBE = paramString3;
    localass.vLi = ((asq)localObject);
    localass.wwx = paramInt;
    localass.wwy = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte);
    this.ltF = paramString3;
    this.cwz = paramString1;
    AppMethodBeat.o(19329);
  }

  private byte[] adl()
  {
    AppMethodBeat.i(19332);
    Object localObject1 = (ast)this.ehh.fsH.fsP;
    try
    {
      localObject1 = ((ast)localObject1).vHG.getBufferToBytes();
      AppMethodBeat.o(19332);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", localException, "", new Object[0]);
        Object localObject2 = null;
        AppMethodBeat.o(19332);
      }
    }
  }

  private byte[] boR()
  {
    AppMethodBeat.i(19334);
    Object localObject1 = (ast)this.ehh.fsH.fsP;
    try
    {
      localObject1 = ((ast)localObject1).wwz.getBufferToBytes();
      AppMethodBeat.o(19334);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", localException, "", new Object[0]);
        Object localObject2 = null;
        AppMethodBeat.o(19334);
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(19331);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19331);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19330);
    ab.i("MicroMsg.exdevice.NetSceneHardDeviceAuth", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    paramq = ad.boW().Kv(this.ltF);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      Object localObject = (ast)this.ehh.fsH.fsP;
      if (paramq != null)
      {
        paramArrayOfByte = boQ();
        if (paramArrayOfByte != null)
          paramq.field_authBuf = paramArrayOfByte;
        paramq.dFi = ((ast)localObject).wwC;
        paramq.dqp = true;
        paramq.dFh = ((ast)localObject).wwB;
        paramq.dqp = true;
        localObject = adl();
        if (localObject != null)
        {
          u.bpx().b(paramq.field_mac, (byte[])localObject, 2);
          if (u.bpy().lqX != null)
            u.bpy().lqX.setChannelSessionKey(paramq.field_mac, (byte[])localObject);
          paramq.field_sessionKey = ((byte[])localObject);
        }
        localObject = boR();
        if (localObject != null)
        {
          u.bpx().b(paramq.field_mac, (byte[])localObject, 3);
          paramq.field_sessionBuf = ((byte[])localObject);
        }
        localObject = boQ();
        if (paramArrayOfByte != null)
        {
          u.bpx().b(paramq.field_mac, (byte[])localObject, 1);
          paramq.field_authBuf = paramArrayOfByte;
        }
        paramq.dFj = (System.currentTimeMillis() / 1000L);
        paramq.dqp = true;
        if (2 == u.bpx().hS(paramq.field_mac))
        {
          ad.bph();
          e.b(this.cwz, paramq.field_url, 2, paramq.field_deviceID);
        }
        u.bpx().hV(paramq.field_mac);
        ab.i("MicroMsg.exdevice.NetSceneHardDeviceAuth", "update local device auth infos = %b", new Object[] { Boolean.valueOf(ad.boW().c(paramq, new String[0])) });
      }
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(19330);
      return;
      ab.e("MicroMsg.exdevice.NetSceneHardDeviceAuth", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceIdServer == null");
      continue;
      if (paramq != null)
      {
        u.bpx().hW(paramq.field_mac);
        ad.bph();
        e.b(this.cwz, paramq.field_url, 4, paramq.field_deviceID);
      }
      ad.bph();
      e.cc(this.cwz, 3);
    }
  }

  public final byte[] boQ()
  {
    AppMethodBeat.i(19333);
    Object localObject1 = (ast)this.ehh.fsH.fsP;
    try
    {
      localObject1 = ((ast)localObject1).wwA.getBufferToBytes();
      AppMethodBeat.o(19333);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", localException, "", new Object[0]);
        Object localObject2 = null;
        AppMethodBeat.o(19333);
      }
    }
  }

  public final int getType()
  {
    return 541;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.r
 * JD-Core Version:    0.6.2
 */