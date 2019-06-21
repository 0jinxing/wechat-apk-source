package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import oicq.wlogin_sdk.request.WUserSigInfo;
import oicq.wlogin_sdk.request.b.a;
import oicq.wlogin_sdk.request.i;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.tools.util;

public final class y
{
  private oicq.wlogin_sdk.request.b fuD;
  private long fuE;

  public y()
  {
    AppMethodBeat.i(58320);
    this.fuE = 0L;
    this.fuD = null;
    try
    {
      long l = bo.anU();
      Object localObject = new oicq/wlogin_sdk/request/b;
      ((oicq.wlogin_sdk.request.b)localObject).<init>(ah.getContext(), com.tencent.mm.protocal.d.vxo);
      this.fuD = ((oicq.wlogin_sdk.request.b)localObject);
      util.BWr = 1;
      localObject = new com/tencent/mm/ai/y$a;
      ((a)localObject).<init>(this);
      util.BWs = (oicq.wlogin_sdk.tools.b)localObject;
      ab.d("MicroMsg.WtloginMgr", "dkstart wtlogin init :%d", new Object[] { Long.valueOf(bo.gb(l)) });
      AppMethodBeat.o(58320);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WtloginMgr", localException, "Failed initializing WtloginMgr.", new Object[0]);
        AppMethodBeat.o(58320);
      }
    }
  }

  public final boolean a(long paramLong, byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(58322);
    if (paramLong != this.fuE)
    {
      ab.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.fuE), Long.valueOf(paramLong) });
      AppMethodBeat.o(58322);
    }
    while (true)
    {
      return bool;
      if (bo.cb(paramArrayOfByte))
      {
        ab.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf respBuf is null.");
        AppMethodBeat.o(58322);
      }
      else
      {
        try
        {
          oicq.wlogin_sdk.request.b localb = this.fuD;
          int i;
          if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0) || (localb.BUe == null))
            i = -1017;
          while (true)
          {
            ab.d("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf buflen:%d ret:%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(i) });
            if (i != 0)
              break label303;
            AppMethodBeat.o(58322);
            bool = true;
            break;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("user:");
            util.awF(localb.BTY._uin + " ResolveSvrData ...");
            i = localb.BUe.aa(paramArrayOfByte, paramArrayOfByte.length);
            if (i == 1)
              localb.oe(localb.BTY._uin);
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("user:");
            util.awF(localb.BTY._uin + " ResolveSvrData ret=" + i);
          }
        }
        catch (Exception paramArrayOfByte)
        {
          ab.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf e:%s", new Object[] { paramArrayOfByte.getMessage() });
          ab.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bo.l(paramArrayOfByte) });
          AppMethodBeat.o(58322);
        }
        continue;
        label303: AppMethodBeat.o(58322);
      }
    }
  }

  public final byte[] a(long paramLong, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(58321);
    boolean bool;
    if (ae.giz == 10006)
    {
      bool = true;
      ab.d("MicroMsg.WtloginMgr", "dkwt isTestWtLogin:%b val:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(ae.giA) });
      if (ae.giz != 10006)
        break label101;
      if (ae.giA != 1)
        break label82;
      ae.giA = 0;
      paramString = new byte[0];
      AppMethodBeat.o(58321);
    }
    label209: 
    while (true)
    {
      return paramString;
      bool = false;
      break;
      label82: if (ae.giA == 2)
      {
        paramString = new byte[0];
        AppMethodBeat.o(58321);
      }
      else
      {
        try
        {
          label101: this.fuE = paramLong;
          if (paramBoolean)
          {
            localObject = null;
            label114: if (bo.cb((byte[])localObject))
              break label209;
          }
          for (bool = true; ; bool = false)
          {
            ab.d("MicroMsg.WtloginMgr", "dkwt getReqLoginBuf sig:%d uin:%d manualauth:%b  byA1Buf:%b ", new Object[] { Integer.valueOf(8256), Long.valueOf(paramLong), Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
            paramBoolean = bo.cb((byte[])localObject);
            if (paramBoolean)
              break label215;
            AppMethodBeat.o(58321);
            paramString = (String)localObject;
            break;
            localObject = this.fuD.a(paramLong, b.a.BUk, "");
            break label114;
          }
          label215: oicq.wlogin_sdk.request.b localb = this.fuD;
          Object localObject = b.a.BUj;
          String str = new java/lang/String;
          str.<init>(bo.anf(paramString), "ISO-8859-1");
          paramString = localb.a(paramLong, (b.a)localObject, str);
          AppMethodBeat.o(58321);
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBuf e:%s", new Object[] { paramString.getMessage() });
          ab.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bo.l(paramString) });
          paramString = new byte[0];
          AppMethodBeat.o(58321);
        }
      }
    }
  }

  public final byte[] d(long paramLong, String paramString)
  {
    AppMethodBeat.i(58324);
    if (paramLong != this.fuE)
    {
      ab.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBufbyVerifyImg Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.fuE), Long.valueOf(paramLong) });
      paramString = new byte[0];
      AppMethodBeat.o(58324);
    }
    while (true)
    {
      return paramString;
      if (bo.isNullOrNil(paramString))
        paramString = "****".getBytes();
      try
      {
        while (true)
        {
          paramString = this.fuD.f(paramLong, paramString);
          AppMethodBeat.o(58324);
          break;
          paramString = paramString.getBytes();
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBufbyVerifyImg e:%s", new Object[] { paramString.getMessage() });
        ab.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bo.l(paramString) });
        paramString = new byte[0];
        AppMethodBeat.o(58324);
      }
    }
  }

  public final byte[] fs(long paramLong)
  {
    AppMethodBeat.i(58323);
    byte[] arrayOfByte1;
    if (paramLong != this.fuE)
    {
      ab.e("MicroMsg.WtloginMgr", "dkwt getVerifyImg Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.fuE), Long.valueOf(paramLong) });
      arrayOfByte1 = new byte[0];
      AppMethodBeat.o(58323);
    }
    while (true)
    {
      return arrayOfByte1;
      try
      {
        arrayOfByte1 = this.fuD.od(paramLong);
        AppMethodBeat.o(58323);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.WtloginMgr", "dkwt getVerifyImg e:%s", new Object[] { localException.getMessage() });
        ab.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bo.l(localException) });
        byte[] arrayOfByte2 = new byte[0];
        AppMethodBeat.o(58323);
      }
    }
  }

  public final byte[] ft(long paramLong)
  {
    AppMethodBeat.i(58325);
    byte[] arrayOfByte;
    if (paramLong != this.fuE)
    {
      ab.e("MicroMsg.WtloginMgr", "dkwt getA2KeyByRespBuf Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.fuE), Long.valueOf(paramLong) });
      arrayOfByte = new byte[0];
      AppMethodBeat.o(58325);
    }
    while (true)
    {
      return arrayOfByte;
      while (true)
      {
        WloginSigInfo localWloginSigInfo;
        try
        {
          localWloginSigInfo = this.fuD.BTY.og(paramLong);
          if (localWloginSigInfo != null)
            break label144;
          arrayOfByte = null;
          if (arrayOfByte != null)
            break label161;
          arrayOfByte = new byte[0];
          AppMethodBeat.o(58325);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.WtloginMgr", "dkwt getA2KeyByRespBuf e:%s", new Object[] { localException.getMessage() });
          ab.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bo.l(localException) });
          localObject = new byte[0];
          AppMethodBeat.o(58325);
        }
        break;
        label144: localObject = new oicq/wlogin_sdk/request/WUserSigInfo;
        ((WUserSigInfo)localObject).<init>();
        ((WUserSigInfo)localObject).get_clone(localWloginSigInfo);
      }
      label161: Object localObject = ((WUserSigInfo)localObject)._A2;
      AppMethodBeat.o(58325);
    }
  }

  public final void fu(long paramLong)
  {
    AppMethodBeat.i(58326);
    if (paramLong != this.fuE)
    {
      ab.e("MicroMsg.WtloginMgr", "dkwt clearUserWtInfo Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.fuE), Long.valueOf(paramLong) });
      AppMethodBeat.o(58326);
    }
    while (true)
    {
      return;
      try
      {
        this.fuD.oe(paramLong);
        AppMethodBeat.o(58326);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.WtloginMgr", "dkwt clearUserWtInfo e:%s", new Object[] { localException.getMessage() });
        ab.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58326);
      }
    }
  }

  final class a extends oicq.wlogin_sdk.tools.b
  {
    public a()
    {
    }

    public final void OnLog(int paramInt, String paramString1, String paramString2)
    {
      AppMethodBeat.i(58319);
      if (paramInt == 1)
      {
        ab.i("MicroMsg.WtloginMgr.Core", "[%s]%s", new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(58319);
      }
      while (true)
      {
        return;
        if (paramInt == 2)
        {
          ab.d("MicroMsg.WtloginMgr.Core", "[%s]%s", new Object[] { paramString1, paramString2 });
          AppMethodBeat.o(58319);
        }
        else
        {
          if (paramInt == 0)
            ab.w("MicroMsg.WtloginMgr.Core", "[%s]%s", new Object[] { paramString1, paramString2 });
          AppMethodBeat.o(58319);
        }
      }
    }

    public final void t(int paramInt, String paramString)
    {
      AppMethodBeat.i(58318);
      OnLog(paramInt, "", paramString);
      AppMethodBeat.o(58318);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.y
 * JD-Core Version:    0.6.2
 */