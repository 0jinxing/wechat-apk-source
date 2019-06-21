package com.tencent.mm.ba;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.ai.o;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.nc;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.bic;
import com.tencent.mm.protocal.protobuf.xh;
import com.tencent.mm.protocal.protobuf.xi;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.IOException;

public final class j extends com.tencent.mm.ai.m
  implements o, com.tencent.mm.network.k
{
  private int cvz;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public int fMn;
  private int offset;

  public j(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(78452);
    this.fMn = paramInt1;
    this.cvz = paramInt2;
    this.offset = 0;
    Object localObject = r.aix().cv(paramInt1, paramInt2);
    if (localObject == null)
    {
      ab.e("MicroMsg.NetSceneDownloadPackage", "doScene get info null, id:".concat(String.valueOf(paramInt1)));
      AppMethodBeat.o(78452);
    }
    while (true)
    {
      return;
      ((m)localObject).status = 3;
      ((m)localObject).bJt = 64;
      r.aix().b((m)localObject);
      if (paramInt2 == 5)
      {
        localObject = g.RP().cachePath;
        com.tencent.mm.vfs.e.deleteFile((String)localObject + "brand_i18n.apk");
        AppMethodBeat.o(78452);
      }
      else
      {
        localObject = r.aix();
        com.tencent.mm.vfs.e.deleteFile(n.aiu() + ((n)localObject).cx(paramInt1, paramInt2));
        AppMethodBeat.o(78452);
      }
    }
  }

  private static boolean aN(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(78457);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      AppMethodBeat.o(78457);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        paramString1 = paramString1 + paramString2;
        paramString2 = com.tencent.mm.vfs.e.cy(paramString1);
        if (!bo.isNullOrNil(paramString2))
          g.RP().Ry().set(ac.a.xOD, paramString2);
      }
      catch (IOException paramString1)
      {
        while (true)
        {
          try
          {
            com.tencent.mm.vfs.e.deleteFile(paramString1);
            ab.i("MicroMsg.NetSceneDownloadPackage", "update sense where result[%b] filepath[%s] xml[%s] ", new Object[] { Boolean.valueOf(bool), paramString1, bo.anv(paramString2) });
            AppMethodBeat.o(78457);
            break;
            paramString1 = paramString1;
            bool = false;
            ab.printErrStackTrace("MicroMsg.NetSceneDownloadPackage", paramString1, "", new Object[0]);
            continue;
          }
          catch (IOException paramString1)
          {
            continue;
          }
          bool = false;
        }
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    int i = -1;
    AppMethodBeat.i(78453);
    this.ehi = paramf;
    ab.d("MicroMsg.NetSceneDownloadPackage", "dkregcode doScene pkgId:%d packageType:%d", new Object[] { Integer.valueOf(this.fMn), Integer.valueOf(this.cvz) });
    paramf = r.aix().cv(this.fMn, this.cvz);
    if (paramf == null)
    {
      ab.e("MicroMsg.NetSceneDownloadPackage", "doScene get Theme failed id:" + this.fMn + " type:" + this.cvz);
      AppMethodBeat.o(78453);
    }
    while (true)
    {
      return i;
      if (paramf.status != 3)
      {
        ab.e("MicroMsg.NetSceneDownloadPackage", "doScene get Theme stat failed id:" + this.fMn + " stat:" + paramf.status);
        AppMethodBeat.o(78453);
      }
      else if (paramf.size <= 0)
      {
        ab.e("MicroMsg.NetSceneDownloadPackage", "doScene Theme size err id:" + this.fMn + " size:" + paramf.size);
        AppMethodBeat.o(78453);
      }
      else
      {
        Object localObject = new b.a();
        ((b.a)localObject).fsJ = new xh();
        ((b.a)localObject).fsK = new xi();
        ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/downloadpackage";
        ((b.a)localObject).fsI = 160;
        ((b.a)localObject).fsL = 0;
        ((b.a)localObject).fsM = 0;
        this.ehh = ((b.a)localObject).acD();
        localObject = (xh)this.ehh.fsG.fsP;
        bic localbic = new bic();
        localbic.ndE = paramf.id;
        localbic.Version = paramf.version;
        ((xh)localObject).wde = localbic;
        ((xh)localObject).vOq = this.offset;
        ((xh)localObject).wdf = 65536;
        ((xh)localObject).jCt = this.cvz;
        i = a(parame, this.ehh, this);
        AppMethodBeat.o(78453);
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78456);
    ab.d("MicroMsg.NetSceneDownloadPackage", "onGYNetEnd id:" + this.fMn + " + id:" + paramInt1 + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneDownloadPackage", "onGYNetEnd, errType = " + paramInt2 + ", errCode = " + paramInt3);
      r.aix().cz(this.fMn, this.cvz);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78456);
    }
    while (true)
    {
      return;
      paramq = (xi)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      if (paramq.jCt != this.cvz)
      {
        ab.e("MicroMsg.NetSceneDownloadPackage", "packageType is not consistent");
        r.aix().cz(this.fMn, this.cvz);
        this.ehi.onSceneEnd(3, -1, "", this);
        AppMethodBeat.o(78456);
      }
      else
      {
        byte[] arrayOfByte = aa.a(paramq.wdg);
        if ((arrayOfByte == null) || (arrayOfByte.length == 0))
        {
          ab.e("MicroMsg.NetSceneDownloadPackage", "onGYNetEnd get pkgBuf failed id:" + this.fMn);
          r.aix().cz(this.fMn, this.cvz);
          this.ehi.onSceneEnd(3, -1, paramString, this);
          AppMethodBeat.o(78456);
        }
        else
        {
          m localm = r.aix().cv(this.fMn, this.cvz);
          if (localm == null)
          {
            ab.e("MicroMsg.NetSceneDownloadPackage", "onGYNetEnd info is null, pkgId = " + this.fMn);
            r.aix().cz(this.fMn, this.cvz);
            this.ehi.onSceneEnd(3, -1, paramString, this);
            AppMethodBeat.o(78456);
          }
          else if (localm.size != paramq.wdh)
          {
            ab.e("MicroMsg.NetSceneDownloadPackage", "onGYNetEnd totalSize is incorrect");
            r.aix().cz(this.fMn, this.cvz);
            paramq = new k(this.cvz);
            g.RO().eJo.a(paramq, 0);
            this.ehi.onSceneEnd(3, -1, paramString, this);
            AppMethodBeat.o(78456);
          }
          else
          {
            if (this.cvz == 5)
              paramq = g.RP().cachePath;
            for (paramArrayOfByte = "brand_i18n.apk"; ; paramArrayOfByte = r.aix().cx(this.fMn, this.cvz))
            {
              ab.d("MicroMsg.NetSceneDownloadPackage", "packagePath ".concat(String.valueOf(paramq)));
              ab.d("MicroMsg.NetSceneDownloadPackage", "packageName ".concat(String.valueOf(paramArrayOfByte)));
              com.tencent.mm.vfs.e.tf(paramq);
              paramInt1 = com.tencent.mm.vfs.e.a(paramq + '/' + paramArrayOfByte, arrayOfByte, arrayOfByte.length);
              if (paramInt1 == 0)
                break label635;
              r.aix().cz(this.fMn, this.cvz);
              ab.e("MicroMsg.NetSceneDownloadPackage", "onGYNetEnd write file fail, ret = ".concat(String.valueOf(paramInt1)));
              this.ehi.onSceneEnd(3, -1, paramString, this);
              AppMethodBeat.o(78456);
              break;
              r.aix();
              paramq = n.aiu();
            }
            label635: paramInt1 = this.offset;
            this.offset = (arrayOfByte.length + paramInt1);
            if (this.offset >= localm.size)
            {
              boolean bool = false;
              if (this.cvz == 1)
              {
                paramString = r.aix().cy(this.fMn, this.cvz);
                paramInt1 = bo.hU(paramq + paramArrayOfByte, paramString);
                if (paramInt1 < 0)
                {
                  ab.e("MicroMsg.NetSceneDownloadPackage", "unzip fail, ret = " + paramInt1 + ", zipFilePath = " + paramq + paramArrayOfByte + ", unzipPath = " + paramString);
                  r.aix().cz(this.fMn, this.cvz);
                  this.ehi.onSceneEnd(3, 0, "unzip fail", this);
                  bool = false;
                }
              }
              else
              {
                label799: if (this.cvz == 23)
                {
                  if ((!bo.isNullOrNil(paramq)) && (!bo.isNullOrNil(paramArrayOfByte)))
                    break label1278;
                  ab.e("MicroMsg.NetSceneDownloadPackage", "update permission pkg failed, packagePath: %s, packageName: %s", new Object[] { paramq, paramArrayOfByte });
                  r.aix().cz(this.fMn, this.cvz);
                  this.ehi.onSceneEnd(3, 0, "open permission pkg failed", this);
                  bool = false;
                }
                label878: if (this.cvz == 7)
                  bool = true;
                if (this.cvz == 9)
                  bool = true;
                if (this.cvz == 5)
                {
                  bool = true;
                  ab.i("MicroMsg.NetSceneDownloadPackage", "resetResContextImp");
                }
                if (this.cvz == 12)
                {
                  paramString = new nc();
                  paramString.cJi.cJk = (paramq + paramArrayOfByte);
                  a.xxA.m(paramString);
                  bool = true;
                }
                if (this.cvz == 18)
                {
                  paramString = r.aix().cy(this.fMn, this.cvz);
                  paramInt1 = bo.hU(paramq + paramArrayOfByte, paramString);
                  if (paramInt1 >= 0)
                    break label1473;
                  ab.e("MicroMsg.NetSceneDownloadPackage", "unzip fail, ret = " + paramInt1 + ", zipFilePath = " + paramq + paramArrayOfByte + ", unzipPath = " + paramString);
                  r.aix().cz(this.fMn, this.cvz);
                  this.ehi.onSceneEnd(3, 0, "unzip fail", this);
                  bool = false;
                }
                label1115: if (this.cvz == 20)
                  bool = true;
                if (this.cvz == 21)
                  bool = true;
                if (this.cvz == 26)
                {
                  if ((!bo.isNullOrNil(paramq)) && (!bo.isNullOrNil(paramArrayOfByte)))
                    break label1496;
                  ab.e("MicroMsg.NetSceneDownloadPackage", "updateIPCallContryCodeConfigPkg failed, packagePath: %s, packageName: %s", new Object[] { paramq, paramArrayOfByte });
                  this.ehi.onSceneEnd(3, 0, "open IPCallContryCodeConfigs pkg failed", this);
                  bool = false;
                }
              }
              while (true)
              {
                if (this.cvz == 36)
                  bool = aN(paramq, paramArrayOfByte);
                if (bool)
                {
                  localm.status = 2;
                  localm.bJt = 64;
                  r.aix().b(localm);
                  this.ehi.onSceneEnd(0, 0, "", this);
                }
                AppMethodBeat.o(78456);
                break;
                bool = true;
                break label799;
                label1278: if (!new com.tencent.mm.vfs.b(paramq + paramArrayOfByte).exists())
                {
                  ab.e("MicroMsg.NetSceneDownloadPackage", "update permission pkg failed, file no exist, path: %s, name: %s", new Object[] { paramq, paramArrayOfByte });
                  r.aix().cz(this.fMn, this.cvz);
                  this.ehi.onSceneEnd(3, 0, "file not exist", this);
                  bool = false;
                  break label878;
                }
                paramString = com.tencent.mm.compatible.util.e.eSj + "permissioncfg.cfg";
                if (-1L == com.tencent.mm.vfs.e.y(paramq + paramArrayOfByte, paramString))
                {
                  ab.e("MicroMsg.NetSceneDownloadPackage", "copy file failed");
                  r.aix().cz(this.fMn, this.cvz);
                  this.ehi.onSceneEnd(3, 0, "copy file failed", this);
                  bool = false;
                  break label878;
                }
                bool = true;
                break label878;
                label1473: ab.i("MicroMsg.NetSceneDownloadPackage", "Unzip Path %s", new Object[] { paramString });
                bool = true;
                break label1115;
                label1496: if (!new com.tencent.mm.vfs.b(paramq + paramArrayOfByte).exists())
                {
                  ab.e("MicroMsg.NetSceneDownloadPackage", "updateIPCallContryCodeConfigPkg failed, file not exist, packagePath: %s, packageName: %s", new Object[] { paramq, paramArrayOfByte });
                  r.aix().cz(this.fMn, this.cvz);
                  this.ehi.onSceneEnd(3, 0, "file not exist", this);
                  bool = false;
                }
                else
                {
                  paramString = com.tencent.mm.compatible.util.e.eSj + "ipcallCountryCodeConfig.cfg";
                  if (-1L == com.tencent.mm.vfs.e.y(paramq + paramArrayOfByte, paramString))
                  {
                    ab.e("MicroMsg.NetSceneDownloadPackage", "copy file failed");
                    r.aix().cz(this.fMn, this.cvz);
                    this.ehi.onSceneEnd(3, 0, "copy file failed", this);
                    bool = false;
                  }
                  else
                  {
                    ab.d("MicroMsg.NetSceneDownloadPackage", "updateIPCallContryCodeConfigPkg success");
                    bool = true;
                  }
                }
              }
            }
            if (a(this.ftf, this.ehi) < 0)
            {
              r.aix().cz(this.fMn, this.cvz);
              this.ehi.onSceneEnd(3, -1, paramString, this);
            }
            AppMethodBeat.o(78456);
          }
        }
      }
    }
  }

  public final void a(m.a parama)
  {
    AppMethodBeat.i(78455);
    r.aix().cz(this.fMn, this.cvz);
    AppMethodBeat.o(78455);
  }

  public final int acR()
  {
    return this.cvz;
  }

  public final int acn()
  {
    return 50;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(78454);
    xh localxh = (xh)((com.tencent.mm.ai.b)paramq).fsG.fsP;
    paramq = r.aix().cv(this.fMn, this.cvz);
    if (paramq == null)
    {
      ab.e("MicroMsg.NetSceneDownloadPackage", "securityVerificationChecked get Theme failed id:" + this.fMn);
      paramq = m.b.ftv;
      AppMethodBeat.o(78454);
    }
    while (true)
    {
      return paramq;
      if ((localxh.wde.ndE != this.fMn) || (localxh.vOq != this.offset) || (localxh.vOq >= paramq.size) || (localxh.wdf != 65536) || (paramq.size <= 0) || (paramq.status != 3))
      {
        ab.e("MicroMsg.NetSceneDownloadPackage", "securityVerificationChecked Theme failed id:" + this.fMn);
        paramq = m.b.ftv;
        AppMethodBeat.o(78454);
      }
      else
      {
        paramq = m.b.ftu;
        AppMethodBeat.o(78454);
      }
    }
  }

  public final int getType()
  {
    return 160;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.j
 * JD-Core Version:    0.6.2
 */