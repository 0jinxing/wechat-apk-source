package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.protocal.protobuf.azh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class aj$1
  implements g.a
{
  aj$1(aj paramaj)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(6699);
    Object localObject1;
    Object localObject2;
    if (paramc == null)
    {
      localObject1 = "null";
      if (paramd != null)
        break label114;
      localObject2 = "null";
      label23: ab.i("MicroMsg.WebviewFileChooserCdnService", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", new Object[] { paramString, Integer.valueOf(paramInt), localObject1, localObject2 });
      localObject1 = com.tencent.mm.plugin.webview.modeltools.g.cYF();
      if (!bo.isNullOrNil(paramString))
        break label124;
      ab.e("MicroMsg.WebViewJSSDKFileItemManager", "getItemByMediaID error, media id is null or nil");
      label73: break label139;
      label74: localObject1 = null;
      label77: if (localObject1 != null)
        break label179;
      ab.e("MicroMsg.WebviewFileChooserCdnService", "get item by media id failed, media is : %s", new Object[] { paramString });
      AppMethodBeat.o(6699);
    }
    while (true)
    {
      return 0;
      localObject1 = paramc.toString();
      break;
      label114: localObject2 = paramd.toString();
      break label23;
      label124: localObject2 = ((ak)localObject1).umz.values().iterator();
      label139: if (!((Iterator)localObject2).hasNext())
        break label74;
      localObject1 = (WebViewJSSDKFileItem)((Iterator)localObject2).next();
      if (!bo.nullAsNil(((WebViewJSSDKFileItem)localObject1).cHr).equals(paramString))
        break label73;
      break label77;
      label179: if (paramInt == -21005)
      {
        ab.i("MicroMsg.WebviewFileChooserCdnService", "duplicate request, ignore this request, media id is %s", new Object[] { paramString });
        AppMethodBeat.o(6699);
      }
      else
      {
        if (paramInt == 0)
          break label264;
        ab.e("MicroMsg.WebviewFileChooserCdnService", "start failed : %d, media id is :%s", new Object[] { Integer.valueOf(paramInt), paramString });
        aj.a(this.umw, false, ((WebViewJSSDKFileItem)localObject1).czD, ((WebViewJSSDKFileItem)localObject1).cHr, null);
        AppMethodBeat.o(6699);
      }
    }
    label264: if (paramc != null)
    {
      ab.i("MicroMsg.WebviewFileChooserCdnService", "progressInfo : %s", new Object[] { paramc.toString() });
      paramInt = 0;
      if (paramc.field_toltalLength > 0)
        paramInt = paramc.field_finishedLength * 100 / paramc.field_toltalLength;
      int i;
      if (paramInt < 0)
        i = 0;
      while (true)
      {
        this.umw.b(((WebViewJSSDKFileItem)localObject1).her, ((WebViewJSSDKFileItem)localObject1).cyQ, i, ((WebViewJSSDKFileItem)localObject1).czD, ((WebViewJSSDKFileItem)localObject1).cHr);
        AppMethodBeat.o(6699);
        break;
        i = paramInt;
        if (paramInt > 100)
          i = 100;
      }
    }
    if (paramd != null)
    {
      if (paramd.field_retCode == 0)
        break label441;
      ab.e("MicroMsg.WebviewFileChooserCdnService", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { paramString, Integer.valueOf(paramd.field_retCode), paramd });
      aj.a(this.umw, false, ((WebViewJSSDKFileItem)localObject1).czD, ((WebViewJSSDKFileItem)localObject1).cHr, null);
    }
    while (true)
    {
      AppMethodBeat.o(6699);
      break;
      label441: ab.i("MicroMsg.WebviewFileChooserCdnService", "cdn trans suceess, media id : %s", new Object[] { paramString });
      if (localObject1 != null)
      {
        ((WebViewJSSDKFileItem)localObject1).c(paramd);
        if ((((WebViewJSSDKFileItem)localObject1).her) && (((WebViewJSSDKFileItem)localObject1).het))
        {
          paramString = this.umw;
          if (localObject1 == null)
          {
            ab.e("MicroMsg.WebviewFileChooserCdnService", "uploadCdnInfo failed, item is null");
          }
          else
          {
            paramc = new azh();
            paramc.woO = ((WebViewJSSDKFileItem)localObject1).umx.field_aesKey;
            paramc.vXd = ((WebViewJSSDKFileItem)localObject1).umx.field_fileLength;
            paramc.wDs = ((WebViewJSSDKFileItem)localObject1).umx.field_fileId;
            paramc.type = ((WebViewJSSDKFileItem)localObject1).cXL();
            ab.d("MicroMsg.WebviewFileChooserCdnService", "appId:%s, localId:%s, aes_key:%s， file_size:%d, fileId:%s", new Object[] { ((WebViewJSSDKFileItem)localObject1).appId, ((WebViewJSSDKFileItem)localObject1).czD, paramc.woO, Integer.valueOf(paramc.vXd), paramc.wDs });
            paramc.wDt = ((WebViewJSSDKFileItem)localObject1).cXK();
            com.tencent.mm.kernel.g.Rg().a(1034, paramString);
            paramString = new ad(((WebViewJSSDKFileItem)localObject1).appId, ((WebViewJSSDKFileItem)localObject1).czD, paramc);
            com.tencent.mm.kernel.g.Rg().a(paramString, 0);
          }
        }
        else
        {
          aj.a(this.umw, true, ((WebViewJSSDKFileItem)localObject1).czD, ((WebViewJSSDKFileItem)localObject1).hep, ((WebViewJSSDKFileItem)localObject1).umx.field_fileUrl);
        }
      }
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    AppMethodBeat.i(6697);
    ab.i("MicroMsg.WebviewFileChooserCdnService", "getCdnAuthInfo, mediaId = %s", new Object[] { paramString });
    AppMethodBeat.o(6697);
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6698);
    ab.i("MicroMsg.WebviewFileChooserCdnService", "decodePrepareResponse, mediaId = %s", new Object[] { paramString });
    AppMethodBeat.o(6698);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.aj.1
 * JD-Core Version:    0.6.2
 */