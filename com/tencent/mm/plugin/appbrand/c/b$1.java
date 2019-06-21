package com.tencent.mm.plugin.appbrand.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

final class b$1
  implements g.a
{
  b$1(b paramb)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(129813);
    Object localObject1;
    Object localObject2;
    if (paramc == null)
    {
      localObject1 = "null";
      if (paramd != null)
        break label112;
      localObject2 = "null";
      label22: ab.i("MicroMsg.AppbrandCdnService", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", new Object[] { paramString, Integer.valueOf(paramInt), localObject1, localObject2 });
      localObject1 = f.auX();
      if (!bo.isNullOrNil(paramString))
        break label122;
      ab.e("MicroMsg.AppbrandMediaCdnItemManager", "getItemByMediaID error, media id is null or nil");
      label72: break label137;
      label73: localObject1 = null;
      label76: if (localObject1 != null)
        break label177;
      ab.e("MicroMsg.AppbrandCdnService", "get item by media id failed, media is : %s", new Object[] { paramString });
      AppMethodBeat.o(129813);
    }
    while (true)
    {
      return 0;
      localObject1 = paramc.toString();
      break;
      label112: localObject2 = paramd.toString();
      break label22;
      label122: localObject2 = ((c)localObject1).hez.values().iterator();
      label137: if (!((Iterator)localObject2).hasNext())
        break label73;
      localObject1 = (a)((Iterator)localObject2).next();
      if (!bo.nullAsNil(((a)localObject1).cHr).equals(paramString))
        break label72;
      break label76;
      label177: if (paramInt == -21005)
      {
        ab.i("MicroMsg.AppbrandCdnService", "duplicate request, ignore this request, media id is %s", new Object[] { paramString });
        AppMethodBeat.o(129813);
      }
      else
      {
        if (paramInt == 0)
          break label260;
        ab.e("MicroMsg.AppbrandCdnService", "start failed : %d, media id is :%s", new Object[] { Integer.valueOf(paramInt), paramString });
        b.a(this.hey, false, ((a)localObject1).czD, ((a)localObject1).cHr, null);
        AppMethodBeat.o(129813);
      }
    }
    label260: if (paramc != null)
    {
      ab.i("MicroMsg.AppbrandCdnService", "progressInfo : %s", new Object[] { paramc.toString() });
      paramInt = 0;
      if (paramc.field_toltalLength > 0)
        paramInt = paramc.field_finishedLength * 100 / paramc.field_toltalLength;
      if (paramInt < 0)
        paramInt = 0;
    }
    label525: label682: 
    while (true)
    {
      paramc = this.hey;
      paramBoolean = ((a)localObject1).her;
      int i = ((a)localObject1).cyQ;
      paramString = ((a)localObject1).czD;
      ab.i("MicroMsg.AppbrandCdnService", "notifyProgressCallback, upload : %b, mediaType : %d, percent : %d, localId : %s, mediaId : %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i), Integer.valueOf(paramInt), paramString, ((a)localObject1).cHr });
      if ((paramc.hev != null) && (paramc.hev.size() > 0))
      {
        paramc = paramc.hev.iterator();
        while (true)
          if (paramc.hasNext())
          {
            ((d.a)paramc.next()).J(paramInt, paramString);
            continue;
            if (paramInt <= 100)
              break label682;
            paramInt = 100;
            break;
          }
      }
      AppMethodBeat.o(129813);
      break;
      if (paramd != null)
      {
        if (paramd.field_retCode == 0)
          break label525;
        ab.e("MicroMsg.AppbrandCdnService", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { paramString, Integer.valueOf(paramd.field_retCode), paramd });
        b.a(this.hey, false, ((a)localObject1).czD, ((a)localObject1).cHr, null);
      }
      do
      {
        AppMethodBeat.o(129813);
        break;
        ab.i("MicroMsg.AppbrandCdnService", "cdn trans suceess, media id : %s", new Object[] { paramString });
      }
      while (localObject1 == null);
      if (((a)localObject1).heq == null)
        ((a)localObject1).heq = new a.a();
      if (paramd == null)
        ab.e("MicroMsg.AppBrandMediaCdnItem", "sceneResult info is null");
      while (true)
      {
        f.auX().a((a)localObject1);
        b.a(this.hey, true, ((a)localObject1).czD, ((a)localObject1).hep, ((a)localObject1).heq.field_fileUrl);
        break;
        ((a)localObject1).heq.field_aesKey = paramd.field_aesKey;
        ((a)localObject1).heq.field_fileId = paramd.field_fileId;
        ((a)localObject1).heq.field_fileUrl = paramd.field_fileUrl;
        ((a)localObject1).heq.field_fileLength = paramd.field_fileLength;
        ((a)localObject1).hep = ((a)localObject1).heq.field_fileId;
      }
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    AppMethodBeat.i(129811);
    ab.i("MicroMsg.AppbrandCdnService", "getCdnAuthInfo, mediaId = %s", new Object[] { paramString });
    AppMethodBeat.o(129811);
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(129812);
    ab.i("MicroMsg.AppbrandCdnService", "decodePrepareResponse, mediaId = %s", new Object[] { paramString });
    AppMethodBeat.o(129812);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.c.b.1
 * JD-Core Version:    0.6.2
 */