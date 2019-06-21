package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ce;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.model.r;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class e extends ae
  implements com.tencent.mm.ai.f
{
  private com.tencent.mm.plugin.exdevice.service.m lqX;
  private d lxx;
  private com.tencent.mm.plugin.exdevice.b.b lxy;
  private a lxz;
  private int mErrorCode;

  public e(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19731);
    this.lxy = null;
    this.lxy = new com.tencent.mm.plugin.exdevice.b.b(paramLong, paramInt2, paramInt3, paramArrayOfByte);
    this.mErrorCode = paramInt1;
    AppMethodBeat.o(19731);
  }

  public final boolean a(com.tencent.mm.plugin.exdevice.service.m paramm, d paramd)
  {
    AppMethodBeat.i(19733);
    boolean bool;
    if ((-5 == this.mErrorCode) || (-3 == this.mErrorCode) || (-4 == this.mErrorCode))
    {
      ab.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Error Code = %d, reply errorcode to device and close channel", new Object[] { Integer.valueOf(this.mErrorCode) });
      this.lxy.e(-1, "", new byte[0]);
      this.lxz = new a(this.lxy, paramd);
      bool = this.lxz.b(paramm);
      ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(19733);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.plugin.exdevice.h.b localb = ad.boW().Ku(this.lxy.jJa);
      if (localb == null)
      {
        ab.e("MicroMsg.exdevice.MMAuthTaskExcuter", "get device info failed : %d", new Object[] { Long.valueOf(this.lxy.jJa) });
        bool = false;
        AppMethodBeat.o(19733);
      }
      else
      {
        com.tencent.mm.plugin.exdevice.e.a locala = (com.tencent.mm.plugin.exdevice.e.a)this.lxy.bou();
        if (locala == null)
        {
          ab.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Auth Request parse failed!!!, Tell device before stop this task");
          this.lxy.e(-4, "", new byte[0]);
          this.lxz = new a(this.lxy, paramd);
          bool = this.lxz.b(paramm);
          ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
          AppMethodBeat.o(19733);
        }
        else
        {
          byte[] arrayOfByte1;
          long l;
          label401: byte[] arrayOfByte2;
          if (locala.luM == 2)
          {
            if (locala.luO != null)
            {
              arrayOfByte1 = locala.luO.wR;
              if (!bo.cb(arrayOfByte1))
                break label401;
            }
            for (l = -1L; ; l = com.tencent.mm.plugin.exdevice.j.b.aO(arrayOfByte2))
            {
              if (l == this.lxy.jJa)
                break label691;
              ab.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Auth Request parse fail!!!, Invalid MacAddress");
              this.lxy.e(-1, "", new byte[0]);
              this.lxz = new a(this.lxy, paramd);
              bool = this.lxz.b(paramm);
              ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
              AppMethodBeat.o(19733);
              break;
              arrayOfByte2 = new byte[8];
              byte[] tmp409_407 = arrayOfByte2;
              tmp409_407[0] = 0;
              byte[] tmp414_409 = tmp409_407;
              tmp414_409[1] = 0;
              byte[] tmp419_414 = tmp414_409;
              tmp419_414[2] = 0;
              byte[] tmp424_419 = tmp419_414;
              tmp424_419[3] = 0;
              byte[] tmp429_424 = tmp424_419;
              tmp429_424[4] = 0;
              byte[] tmp434_429 = tmp429_424;
              tmp434_429[5] = 0;
              byte[] tmp439_434 = tmp434_429;
              tmp439_434[6] = 0;
              byte[] tmp445_439 = tmp439_434;
              tmp445_439[7] = 0;
              tmp445_439;
              System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 2, 6);
            }
          }
          label1067: if ((locala.luM == 1) || (locala.luM == 1))
          {
            if ((locala.luJ == null) || (!com.tencent.mm.plugin.exdevice.j.b.c(locala.luJ.wR, 0, g.y((localb.field_deviceType + localb.field_deviceID).getBytes()))))
            {
              ab.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Auth Request parse fail!!!, Invalid Md5DeviceTypeAndDeviceId");
              this.lxy.e(-1, "", new byte[0]);
              this.lxz = new a(this.lxy, paramd);
              bool = this.lxz.b(paramm);
              ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
              AppMethodBeat.o(19733);
            }
          }
          else
          {
            ab.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Auth Request parse fail!!!, Invalid AuthMethod");
            this.lxy.e(-8, "", new byte[0]);
            this.lxz = new a(this.lxy, paramd);
            bool = this.lxz.b(paramm);
            ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
            AppMethodBeat.o(19733);
            continue;
            label691: if (localb != null)
            {
              l = localb.dFi;
              if (System.currentTimeMillis() / 1000L < l)
              {
                ab.e("MicroMsg.exdevice.MMAuthTaskExcuter", "device has been blocked");
                this.lxy.e(-5, "", new byte[0]);
                this.lxz = new a(this.lxy, paramd);
                bool = this.lxz.b(paramm);
                ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
                AppMethodBeat.o(19733);
              }
              else
              {
                l = localb.dFj;
                int i = localb.dFh;
                if ((i + l > 0L) && (l + i < System.currentTimeMillis() / 1000L))
                {
                  arrayOfByte1 = u.bpx().o(this.lxy.jJa, 1);
                  arrayOfByte2 = u.bpx().o(this.lxy.jJa, 2);
                  if (arrayOfByte1 == null)
                  {
                    i = -1;
                    label872: if (arrayOfByte2 != null)
                      break label1067;
                  }
                  for (int j = -1; ; j = arrayOfByte2.length)
                  {
                    ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "has not reach time out, just set back sessionkey, get auth buf from local, auth buf length = %d, session key buf lenght = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
                    if ((arrayOfByte1 == null) || (arrayOfByte2 == null))
                      break label1075;
                    u.bpx().hV(localb.field_mac);
                    if (2 == u.bpx().hS(localb.field_mac))
                    {
                      ad.bph();
                      com.tencent.mm.plugin.exdevice.model.e.b(localb.field_brandName, localb.field_url, 2, localb.field_deviceID);
                    }
                    this.lxy.e(0, "", u.bpx().o(this.lxy.jJa, 1));
                    this.lxz = new a(this.lxy, this.lxx);
                    paramm.setChannelSessionKey(localb.field_mac, arrayOfByte2);
                    bool = this.lxz.b(paramm);
                    ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
                    AppMethodBeat.o(19733);
                    break;
                    i = arrayOfByte1.length;
                    break label872;
                  }
                  label1075: ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "has not reach time out, but local authbuf is null, do auth from server");
                }
              }
            }
            else
            {
              ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "now do really auth from server");
              this.lqX = paramm;
              this.lxx = paramd;
              paramd = null;
              paramm = paramd;
              if (locala != null)
              {
                paramm = paramd;
                if (locala.luN != null)
                  paramm = locala.luN.toByteArray();
              }
              aw.Rg().a(541, this);
              paramm = new r(localb.field_brandName, localb.field_deviceType, localb.field_deviceID, locala.luL, paramm);
              aw.Rg().a(paramm, 0);
              bool = true;
              AppMethodBeat.o(19733);
            }
          }
        }
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(19732);
    aw.Rg().b(541, this);
    ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "onscen end, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramm = (r)paramm;
    com.tencent.mm.plugin.exdevice.h.b localb = ad.boW().Ku(this.lxy.jJa);
    if (localb == null)
    {
      ab.e("MicroMsg.exdevice.MMAuthTaskExcuter", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
      AppMethodBeat.o(19732);
    }
    while (true)
    {
      return;
      long l = localb.dFi;
      if (System.currentTimeMillis() / 1000L < l)
      {
        ab.e("MicroMsg.exdevice.MMAuthTaskExcuter", "device has been blocked");
        this.lxy.e(-5, "", new byte[0]);
        this.lxz = new a(this.lxy, this.lxx);
        ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(this.lxz.b(this.lqX)) });
        AppMethodBeat.o(19732);
      }
      else
      {
        this.lxy.e(paramInt2, paramString, paramm.boQ());
        this.lxz = new a(this.lxy, this.lxx);
        ab.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(this.lxz.b(this.lqX)) });
        AppMethodBeat.o(19732);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.e
 * JD-Core Version:    0.6.2
 */