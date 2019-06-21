package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.i.a;
import com.tencent.mm.i.g.a;
import com.tencent.mm.protocal.protobuf.azh;
import com.tencent.mm.protocal.protobuf.azj;
import com.tencent.mm.protocal.protobuf.azn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class aj
  implements com.tencent.mm.ai.f
{
  private g.a fFk;
  private CopyOnWriteArraySet<d.b> umu;
  private CopyOnWriteArraySet<d.a> umv;

  public aj()
  {
    AppMethodBeat.i(6700);
    this.umv = new CopyOnWriteArraySet();
    this.umu = new CopyOnWriteArraySet();
    this.fFk = new aj.1(this);
    AppMethodBeat.o(6700);
  }

  private void a(WebViewJSSDKFileItem paramWebViewJSSDKFileItem)
  {
    AppMethodBeat.i(6707);
    com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
    localg.egl = this.fFk;
    localg.cRY = false;
    localg.field_mediaId = paramWebViewJSSDKFileItem.cHr;
    localg.field_fullpath = paramWebViewJSSDKFileItem.heo;
    localg.field_totalLen = paramWebViewJSSDKFileItem.umx.field_fileLength;
    localg.field_fileType = a.MediaType_FILE;
    localg.field_fileId = paramWebViewJSSDKFileItem.umx.field_fileId;
    localg.field_aesKey = paramWebViewJSSDKFileItem.umx.field_aesKey;
    localg.field_priority = a.efC;
    localg.field_needStorage = false;
    localg.field_isStreamMedia = false;
    boolean bool = com.tencent.mm.al.f.afx().b(localg, -1);
    ab.i("MicroMsg.WebviewFileChooserCdnService", "add download cdn task : %b, localid : %s", new Object[] { Boolean.valueOf(bool), paramWebViewJSSDKFileItem.hep });
    if (!bool)
      c(false, null, null, null);
    AppMethodBeat.o(6707);
  }

  public static boolean aet(String paramString)
  {
    AppMethodBeat.i(6711);
    ab.i("MicroMsg.WebviewFileChooserCdnService", "cancelDownloadTask get webview file chooser item  by local id : %s", new Object[] { paramString });
    boolean bool = com.tencent.mm.al.f.afx().rO(paramString);
    AppMethodBeat.o(6711);
    return bool;
  }

  private void c(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(6704);
    if ((this.umu != null) && (this.umu.size() > 0))
    {
      Iterator localIterator = this.umu.iterator();
      while (localIterator.hasNext())
        ((d.b)localIterator.next()).b(paramBoolean, paramString1, paramString2, paramString3);
    }
    AppMethodBeat.o(6704);
  }

  public static boolean yC(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(6710);
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex(paramString);
    if (localWebViewJSSDKFileItem == null)
    {
      ab.e("MicroMsg.WebviewFileChooserCdnService", "cancelUploadTask get webview file chooser item  by local id failed : %s", new Object[] { paramString });
      AppMethodBeat.o(6710);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.al.f.afx().rN(localWebViewJSSDKFileItem.cHr);
      AppMethodBeat.o(6710);
    }
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(6701);
    if ((this.umv != null) && (parama != null) && (!this.umv.contains(parama)))
      this.umv.add(parama);
    AppMethodBeat.o(6701);
  }

  public final void a(d.b paramb)
  {
    AppMethodBeat.i(6702);
    if ((this.umu != null) && (paramb != null))
      this.umu.remove(paramb);
    AppMethodBeat.o(6702);
  }

  public final boolean a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, d.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(6708);
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex(paramString2);
    if (localWebViewJSSDKFileItem == null)
    {
      ab.e("MicroMsg.WebviewFileChooserCdnService", "addUploadTask get webview file chooser item  by local id failed : %s", new Object[] { paramString2 });
      AppMethodBeat.o(6708);
      return bool;
    }
    localWebViewJSSDKFileItem.appId = paramString1;
    if (paramb != null)
      this.umu.add(paramb);
    if (paramInt2 == 202)
      localWebViewJSSDKFileItem.het = false;
    localWebViewJSSDKFileItem.her = true;
    paramString1 = new com.tencent.mm.i.g();
    paramString1.egl = this.fFk;
    paramString1.cRY = true;
    paramString1.field_mediaId = localWebViewJSSDKFileItem.cHr;
    paramString1.field_fullpath = localWebViewJSSDKFileItem.heo;
    paramString1.field_fileType = paramInt1;
    paramString1.field_talker = "weixin";
    paramString1.field_priority = a.efC;
    if (paramInt1 == a.efH);
    for (paramString1.field_needStorage = true; ; paramString1.field_needStorage = false)
    {
      paramString1.field_isStreamMedia = false;
      paramString1.field_appType = paramInt2;
      paramString1.field_bzScene = paramInt3;
      paramString1.field_force_aeskeycdn = true;
      paramString1.field_trysafecdn = false;
      bool = com.tencent.mm.al.f.afx().e(paramString1);
      ab.i("MicroMsg.WebviewFileChooserCdnService", "summersafecdn add upload cdn task : %b, force_aeskeycdn: %b, trysafecdn: %b, localid : %s ", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(paramString1.field_force_aeskeycdn), Boolean.valueOf(paramString1.field_trysafecdn), paramString2 });
      AppMethodBeat.o(6708);
      break;
    }
  }

  public final boolean a(String paramString1, String paramString2, d.b paramb)
  {
    AppMethodBeat.i(6706);
    Object localObject = com.tencent.mm.plugin.webview.modeltools.g.cYF();
    if (bo.isNullOrNil(paramString2))
    {
      ab.e("MicroMsg.WebViewJSSDKFileItemManager", "getItemByServerId error, media id is null or nil");
      break label108;
      label25: localObject = null;
      label28: if (localObject == null)
        break label148;
      ((WebViewJSSDKFileItem)localObject).appId = paramString1;
      ab.i("MicroMsg.WebviewFileChooserCdnService", "the file item has alreay in local : appid : %s, serverId : %s, localId : %s", new Object[] { paramString1, paramString2, ((WebViewJSSDKFileItem)localObject).czD });
      paramb.b(true, ((WebViewJSSDKFileItem)localObject).czD, ((WebViewJSSDKFileItem)localObject).hep, null);
      AppMethodBeat.o(6706);
    }
    while (true)
    {
      return true;
      Iterator localIterator = ((ak)localObject).umz.values().iterator();
      label108: if (!localIterator.hasNext())
        break label25;
      localObject = (WebViewJSSDKFileItem)localIterator.next();
      if (!bo.nullAsNil(((WebViewJSSDKFileItem)localObject).hep).equals(paramString2))
        break;
      break label28;
      label148: com.tencent.mm.kernel.g.Rg().a(1035, this);
      paramString1 = new j(paramString1, paramString2);
      com.tencent.mm.kernel.g.Rg().a(paramString1, 0);
      this.umu.add(paramb);
      AppMethodBeat.o(6706);
    }
  }

  public final void b(d.a parama)
  {
    AppMethodBeat.i(6703);
    if ((this.umv != null) && (parama != null))
      this.umv.remove(parama);
    AppMethodBeat.o(6703);
  }

  final void b(boolean paramBoolean, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(6705);
    ab.i("MicroMsg.WebviewFileChooserCdnService", "notifyProgressCallback, upload : %b, mediaType : %d, percent : %d, localId : %s, mediaId : %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, paramString2 });
    if ((this.umv != null) && (this.umv.size() > 0))
    {
      Iterator localIterator = this.umv.iterator();
      while (localIterator.hasNext())
        ((d.a)localIterator.next()).a(paramBoolean, paramInt1, paramInt2, paramString1, paramString2);
    }
    AppMethodBeat.o(6705);
  }

  public final boolean b(String paramString1, String paramString2, d.b paramb)
  {
    AppMethodBeat.i(6709);
    boolean bool = a(paramString1, paramString2, a.MediaType_FILE, 0, 0, paramb);
    AppMethodBeat.o(6709);
    return bool;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(6712);
    ab.i("MicroMsg.WebviewFileChooserCdnService", "onSceneEnd, errType = %d, errCode = %d, funcType = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramm.getType()) });
    switch (paramm.getType())
    {
    default:
    case 1034:
    case 1035:
    }
    while (true)
    {
      AppMethodBeat.o(6712);
      label78: Object localObject1;
      Object localObject2;
      boolean bool;
      while (true)
      {
        return;
        com.tencent.mm.kernel.g.Rg().b(1034, this);
        localObject1 = (ad)paramm;
        paramm = ((azn)((ad)localObject1).ehh.fsH.fsP).wDu;
        paramString = ((ad)localObject1).appId;
        localObject2 = ((ad)localObject1).czD;
        localObject1 = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex((String)localObject2);
        if (localObject1 == null);
        for (bool = true; ; bool = false)
        {
          ab.i("MicroMsg.WebviewFileChooserCdnService", "get server server id : %s from server for appid : %s, localId = %s, item == null ? %b", new Object[] { paramm, paramString, localObject2, Boolean.valueOf(bool) });
          if ((paramInt1 != 0) || (paramInt2 != 0))
            break label275;
          if ((bo.isNullOrNil(paramString)) || (bo.isNullOrNil(paramm)) || (localObject1 == null))
            break;
          ((WebViewJSSDKFileItem)localObject1).hep = paramm;
          b(true, ((WebViewJSSDKFileItem)localObject1).cyQ, 100, ((WebViewJSSDKFileItem)localObject1).czD, ((WebViewJSSDKFileItem)localObject1).hep);
          c(true, ((WebViewJSSDKFileItem)localObject1).czD, ((WebViewJSSDKFileItem)localObject1).hep, ((WebViewJSSDKFileItem)localObject1).umx.field_fileUrl);
          AppMethodBeat.o(6712);
          break label78;
        }
        label275: ab.e("MicroMsg.WebviewFileChooserCdnService", "upload cdn info failed");
        if (localObject1 == null)
          break;
        c(false, ((WebViewJSSDKFileItem)localObject1).czD, ((WebViewJSSDKFileItem)localObject1).cHr, null);
        AppMethodBeat.o(6712);
      }
      com.tencent.mm.kernel.g.Rg().b(1035, this);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (j)paramm;
        paramm = paramString.appId;
        localObject1 = paramString.hep;
        localObject2 = ((azj)paramString.ehh.fsH.fsP).wDv;
        if (localObject2 == null)
        {
          bool = true;
          label375: ab.i("MicroMsg.WebviewFileChooserCdnService", "appid = %s, serverId = %s, cdninfo == null ? %b", new Object[] { paramm, localObject1, Boolean.valueOf(bool) });
          if ((!bo.isNullOrNil(paramm)) && (!bo.isNullOrNil((String)localObject1)) && (localObject2 != null))
          {
            paramString = ((azh)localObject2).type;
            ab.i("MicroMsg.WebviewFileChooserCdnService", "cdn info type = %s", new Object[] { paramString });
            if (!bo.isNullOrNil(paramString))
            {
              if (!paramString.toLowerCase().equals("voice"))
                break label553;
              paramString = WebViewJSSDKFileItem.aev(ap.aeF(paramm));
              label477: paramString.her = false;
              paramString.appId = paramm;
              paramString.hep = ((String)localObject1);
              if (paramString.umx == null)
                paramString.umx = new WebViewJSSDKFileItem.a();
              if (localObject2 != null)
                break label618;
              ab.e("MicroMsg.WebViewJSSDKFileItem", "jsapidcdn info is null");
            }
          }
        }
        while (true)
        {
          com.tencent.mm.plugin.webview.modeltools.g.cYF().b(paramString);
          a(paramString);
          AppMethodBeat.o(6712);
          break;
          bool = false;
          break label375;
          label553: if (paramString.toLowerCase().equals("video"))
          {
            paramString = WebViewJSSDKFileItem.aew(ap.aez(bo.anU()));
            break label477;
          }
          paramString = WebViewJSSDKFileItem.aeu(ap.aez(bo.anU()));
          break label477;
          label618: paramString.umx.field_aesKey = ((azh)localObject2).woO;
          paramString.umx.field_fileId = ((azh)localObject2).wDs;
          paramString.umx.field_fileLength = ((azh)localObject2).vXd;
        }
      }
      ab.e("MicroMsg.WebviewFileChooserCdnService", "download cdn info failed");
      c(false, null, null, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.aj
 * JD-Core Version:    0.6.2
 */