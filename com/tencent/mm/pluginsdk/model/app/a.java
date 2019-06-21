package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.m.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.Map;

public final class a
{
  public int cDq;
  public String cvZ;
  public String desc;
  public long fRS;
  public int size;
  public String url;
  public long vbM;

  public a(String paramString)
  {
    AppMethodBeat.i(27305);
    Map localMap = br.z(paramString, "msg");
    this.desc = ((String)localMap.get(".msg.appmsg.des"));
    this.cDq = bo.getInt((String)localMap.get(".msg.alphainfo.clientVersion"), 0);
    this.url = ((String)localMap.get(".msg.alphainfo.url"));
    this.size = bo.getInt((String)localMap.get(".msg.alphainfo.size"), 0);
    this.cvZ = ((String)localMap.get(".msg.alphainfo.md5"));
    this.vbM = bo.getLong((String)localMap.get(".msg.alphainfo.maxAge"), 0L);
    this.fRS = bo.getLong((String)localMap.get(".msg.alphainfo.expireTime"), 0L);
    ab.i("MicroMsg.AlphaUpdateInfo", "updateInfo, content:%s, clientVersion:%d, url:%s, size:%d, md5:%s, desc:%s, maxAge:%d, expireTime:%d", new Object[] { paramString, Integer.valueOf(this.cDq), this.url, Integer.valueOf(this.size), this.cvZ, this.desc, Long.valueOf(this.vbM), Long.valueOf(this.fRS) });
    AppMethodBeat.o(27305);
  }

  public static a dhs()
  {
    AppMethodBeat.i(27304);
    aw.ZK();
    Object localObject = (String)com.tencent.mm.model.c.Ry().get(352273, "");
    if (!bo.isNullOrNil((String)localObject))
    {
      localObject = new a((String)localObject);
      if ((((a)localObject).isValid()) && (!((a)localObject).isExpired()))
        break label78;
      dht();
      AppMethodBeat.o(27304);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(27304);
      localObject = null;
      continue;
      label78: AppMethodBeat.o(27304);
    }
  }

  public static void dht()
  {
    AppMethodBeat.i(27308);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(352273, null);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(352274, null);
    AppMethodBeat.o(27308);
  }

  private static boolean dhw()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = false;
    AppMethodBeat.i(27311);
    if (bo.ank(com.tencent.mm.m.g.Nu().getValue("SilentDownloadApkAtWiFi")) != 0)
    {
      AppMethodBeat.o(27311);
      bool1 = bool3;
      return bool1;
    }
    aw.ZK();
    int i;
    if ((((Integer)com.tencent.mm.model.c.Ry().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
    {
      i = 1;
      label66: if ((!at.isWifi(ah.getContext())) || (i == 0))
        break label110;
      label79: if ((com.tencent.mm.sdk.platformtools.g.cdh & 0x1) == 0)
        break label115;
      ab.d("MicroMsg.AlphaUpdateInfo", "channel pack, not silence download.");
      bool1 = bool2;
    }
    while (true)
    {
      AppMethodBeat.o(27311);
      break;
      i = 0;
      break label66;
      label110: bool1 = false;
      break label79;
      label115: ab.d("MicroMsg.AlphaUpdateInfo", "not channel pack.");
    }
  }

  private boolean isExpired()
  {
    AppMethodBeat.i(27307);
    aw.ZK();
    long l = ((Long)com.tencent.mm.model.c.Ry().get(352274, Long.valueOf(System.currentTimeMillis()))).longValue();
    if ((System.currentTimeMillis() - l > this.vbM) || (System.currentTimeMillis() > this.fRS));
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.AlphaUpdateInfo", "isExpired: %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(27307);
      return bool;
    }
  }

  private boolean isValid()
  {
    AppMethodBeat.i(27306);
    if ((this.cDq > com.tencent.mm.protocal.d.vxo) && (!bo.isNullOrNil(this.url)) && (!bo.isNullOrNil(this.cvZ)) && (!bo.isNullOrNil(this.desc)));
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.AlphaUpdateInfo", "isValid %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(27306);
      return bool;
    }
  }

  public final void dhu()
  {
    AppMethodBeat.i(27309);
    bi localbi = new bi();
    localbi.eJ(bf.q("weixin", bo.anT()));
    localbi.setType(1);
    localbi.setContent(this.desc);
    ab.d("MicroMsg.AlphaUpdateInfo", localbi.field_content);
    localbi.hO(0);
    localbi.ju("weixin");
    localbi.setStatus(3);
    bf.l(localbi);
    ab.i("MicroMsg.AlphaUpdateInfo", "insertUpdateTextMsg");
    dht();
    AppMethodBeat.o(27309);
  }

  public final void dhv()
  {
    AppMethodBeat.i(27310);
    ab.i("MicroMsg.AlphaUpdateInfo", "downloadInSilence.");
    if ((!isValid()) || (isExpired()))
      AppMethodBeat.o(27310);
    while (true)
    {
      return;
      if (!dhw())
      {
        dhu();
        AppMethodBeat.o(27310);
      }
      else
      {
        ab.i("MicroMsg.AlphaUpdateInfo", "go to download, %s, %d, %s, %s", new Object[] { this.cvZ, Integer.valueOf(this.size), this.desc, this.url });
        com.tencent.mm.plugin.p.d.bQU().e(this.cvZ, this.size, this.desc.replaceFirst("(\n)*<a.*</a>(\n)*", "\n"), this.url);
        AppMethodBeat.o(27310);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.a
 * JD-Core Version:    0.6.2
 */