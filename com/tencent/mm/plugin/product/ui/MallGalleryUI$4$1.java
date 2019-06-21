package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h.c;
import java.util.LinkedList;

final class MallGalleryUI$4$1
  implements h.c
{
  MallGalleryUI$4$1(MallGalleryUI.4 param4)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(44038);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(44038);
      Object localObject2;
      while (true)
      {
        return;
        localObject1 = this.piz.piy;
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("Retr_Msg_content", "");
        ((Intent)localObject2).putExtra("Retr_Msg_Type", 0);
        if (!bo.isNullOrNil(((MallGalleryUI)localObject1).bZZ()))
        {
          ((Intent)localObject2).putExtra("Retr_File_Name", ((MallGalleryUI)localObject1).bZZ());
          ((Intent)localObject2).putExtra("Retr_go_to_chattingUI", false);
          ((Intent)localObject2).putExtra("Retr_show_success_tips", true);
          com.tencent.mm.bp.d.f((Context)localObject1, ".ui.transmit.MsgRetransmitUI", (Intent)localObject2);
          AppMethodBeat.o(44038);
        }
        else
        {
          ab.e("MicroMsg.MallGalleryUI", "url is null or nil");
          AppMethodBeat.o(44038);
          continue;
          localObject2 = this.piz.piy;
          localObject1 = ((MallGalleryUI)localObject2).bZZ();
          if (!bo.isNullOrNil((String)localObject1))
          {
            ab.d("MicroMsg.MallGalleryUI", "can save. img path: %s", new Object[] { localObject1 });
            n.j((String)localObject1, (Context)localObject2);
            AppMethodBeat.o(44038);
          }
          else
          {
            ab.w("MicroMsg.MallGalleryUI", "save error.");
            AppMethodBeat.o(44038);
          }
        }
      }
      Object localObject1 = this.piz.piy;
      String str = ((MallGalleryUI)localObject1).bZZ();
      if (!bo.isNullOrNil(str))
      {
        ab.d("MicroMsg.MallGalleryUI", "file path valid");
        cl localcl = new cl();
        if (bo.isNullOrNil(str))
        {
          ab.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
          localcl.cvA.cvG = 2131299622;
        }
        while (true)
        {
          localcl.cvA.cvH = 4;
          localcl.cvA.activity = ((Activity)localObject1);
          a.xxA.m(localcl);
          AppMethodBeat.o(44038);
          break;
          ab.i("MicroMsg.GetFavDataSource", "do fill event info(fav simple image), path %s sourceType %d", new Object[] { str, Integer.valueOf(9) });
          abf localabf = new abf();
          localObject2 = new abl();
          aar localaar = new aar();
          localaar.LE(2);
          localaar.akV(str);
          localaar.akU(g.x((localaar.toString() + 2 + System.currentTimeMillis()).getBytes()));
          Object localObject3 = new gh();
          ((gh)localObject3).cAH.type = 27;
          ((gh)localObject3).cAH.cAJ = localaar;
          a.xxA.m((b)localObject3);
          localObject3 = ((gh)localObject3).cAI.thumbPath;
          com.tencent.mm.sdk.platformtools.d.c(str, 150, 150, Bitmap.CompressFormat.JPEG, 90, (String)localObject3);
          localaar.akW((String)localObject3);
          ((abl)localObject2).alD(r.Yz());
          ((abl)localObject2).alE(r.Yz());
          ((abl)localObject2).LN(9);
          ((abl)localObject2).ml(bo.anU());
          localabf.a((abl)localObject2);
          localabf.wiv.add(localaar);
          localcl.cvA.title = localaar.title;
          localcl.cvA.cvC = localabf;
          localcl.cvA.type = 2;
        }
      }
      ab.w("MicroMsg.MallGalleryUI", "file path invalid");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallGalleryUI.4.1
 * JD-Core Version:    0.6.2
 */