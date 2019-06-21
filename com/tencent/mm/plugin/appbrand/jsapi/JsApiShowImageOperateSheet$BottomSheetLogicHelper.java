package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.util.Base64;
import com.tencent.luggage.g.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.s.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.base.h;
import java.util.HashSet;
import java.util.Set;

final class JsApiShowImageOperateSheet$BottomSheetLogicHelper
{
  private static Set<Integer> hyQ;
  private static Set<Integer> hyR;
  private JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult hyS;
  private com.tencent.mm.ui.widget.a.d hyT;
  private final w hyU;
  private final String hyV;
  private final String hyW;
  private final Rect hyX;

  static
  {
    AppMethodBeat.i(130619);
    HashSet localHashSet = new HashSet();
    hyQ = localHashSet;
    localHashSet.add(Integer.valueOf(3));
    localHashSet = new HashSet();
    hyR = localHashSet;
    localHashSet.add(Integer.valueOf(22));
    AppMethodBeat.o(130619);
  }

  public JsApiShowImageOperateSheet$BottomSheetLogicHelper(w paramw, String paramString1, String paramString2, Rect paramRect)
  {
    this.hyU = paramw;
    this.hyV = paramString1;
    this.hyW = paramString2;
    this.hyX = paramRect;
  }

  private void a(b.a parama)
  {
    AppMethodBeat.i(130612);
    Object localObject;
    if (!bo.isNullOrNil(this.hyW))
    {
      localObject = this.hyU.asE().yh("showSheet_base64_" + System.currentTimeMillis());
      if (localObject == null)
      {
        ab.e("MicroMsg.JsApiShowImageOperateSheet", "loadImage failed for allocTempFile");
        AppMethodBeat.o(130612);
      }
    }
    while (true)
    {
      return;
      localObject = com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject).dMD());
      byte[] arrayOfByte = Base64.decode(this.hyW, 0);
      com.tencent.mm.a.e.b((String)localObject, arrayOfByte, arrayOfByte.length);
      parama.AN((String)localObject);
      AppMethodBeat.o(130612);
      continue;
      com.tencent.mm.plugin.appbrand.s.b.a(this.hyU, this.hyV, null, parama);
      AppMethodBeat.o(130612);
    }
  }

  public final void aCm()
  {
    AppMethodBeat.i(130611);
    boolean bool = f.az(this.hyU.mContext);
    JsApiShowImageOperateSheet.BottomSheetLogicHelper.1 local1 = new JsApiShowImageOperateSheet.BottomSheetLogicHelper.1(this);
    if (bool);
    for (int i = 100; ; i = 0)
    {
      al.n(local1, i);
      AppMethodBeat.o(130611);
      return;
    }
  }

  static final class d extends AppBrandProxyUIProcessTask
  {
    public final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
    {
      AppMethodBeat.i(130610);
      if (!(paramProcessRequest instanceof JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCSendToFriendEmojiRequest))
      {
        ab.e("MicroMsg.JsApiShowImageOperateSheet", "IPCSendToFriendEmojiRequest request instance not valid");
        AppMethodBeat.o(130610);
        return;
      }
      Object localObject = JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCSendToFriendEmojiRequest.a((JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCSendToFriendEmojiRequest)paramProcessRequest);
      paramProcessRequest = com.tencent.mm.vfs.e.atg((String)localObject);
      paramProcessRequest = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramProcessRequest);
      if (paramProcessRequest == null)
      {
        paramProcessRequest = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr();
        ah.getContext();
        paramProcessRequest = paramProcessRequest.Jf((String)localObject);
        paramProcessRequest = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramProcessRequest);
      }
      while (true)
      {
        long l;
        if (paramProcessRequest == null)
        {
          l = 0L;
          label114: if (paramProcessRequest != null)
            break label232;
          label118: BitmapFactory.Options localOptions = new BitmapFactory.Options();
          localOptions.inJustDecodeBounds = true;
          if (((com.tencent.mm.sdk.platformtools.d.decodeFile((String)localObject, localOptions) == null) || (localOptions.outHeight <= com.tencent.mm.m.b.Na())) && (localOptions.outWidth <= com.tencent.mm.m.b.Na()))
            break label300;
        }
        label300: for (int i = 1; ; i = 0)
        {
          if ((l > com.tencent.mm.m.b.Nb()) || (i != 0))
          {
            h.a(aBQ(), ah.getResources().getString(2131299043), "", ah.getResources().getString(2131300601), null);
            a(null);
            AppMethodBeat.o(130610);
            break;
            l = com.tencent.mm.vfs.e.asZ(paramProcessRequest.dve());
            break label114;
            label232: localObject = paramProcessRequest.dve();
            break label118;
          }
          localObject = new Intent();
          if (paramProcessRequest == null);
          for (paramProcessRequest = ""; ; paramProcessRequest = paramProcessRequest.Aq())
          {
            ((Intent)localObject).putExtra("Retr_File_Name", paramProcessRequest);
            ((Intent)localObject).putExtra("Retr_Msg_Type", 5);
            ((Intent)localObject).putExtra("Retr_MsgImgScene", 1);
            com.tencent.mm.bp.d.f(aBQ(), ".ui.transmit.MsgRetransmitUI", (Intent)localObject);
            break;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet.BottomSheetLogicHelper
 * JD-Core Version:    0.6.2
 */