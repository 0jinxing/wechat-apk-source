package com.tencent.mm.plugin.music.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.kd;
import com.tencent.mm.g.a.kd.b;
import com.tencent.mm.g.a.se;
import com.tencent.mm.model.r;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.LinkedList;

public final class d
{
  public static void H(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(104889);
    ab.i("MicroMsg.Music.MusicUtil", "gotoAppbrand(), appId:%s, appUserName:%s, pkgType:%d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    se localse = new se();
    localse.cOf.appId = paramString1;
    localse.cOf.axy = -1;
    localse.cOf.cOi = paramInt;
    localse.cOf.userName = paramString2;
    localse.cOf.scene = 1056;
    if (paramInt == 1)
      localse.cOf.cOl = true;
    com.tencent.mm.sdk.b.a.xxA.m(localse);
    AppMethodBeat.o(104889);
  }

  public static c S(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(104890);
    paramContext = new c.a(paramContext);
    paramContext.PV(2131297061);
    paramContext.PZ(paramInt);
    paramContext.Qc(2131305646).a(null);
    paramContext.rc(true);
    paramContext = paramContext.aMb();
    paramContext.show();
    AppMethodBeat.o(104890);
    return paramContext;
  }

  public static void S(Activity paramActivity)
  {
    AppMethodBeat.i(104884);
    Intent localIntent = new Intent();
    localIntent.putExtra("mutil_select_is_ret", true);
    localIntent.putExtra("scene_from", 6);
    com.tencent.mm.bp.d.b(paramActivity, ".ui.transmit.SelectConversationUI", localIntent, 1);
    AppMethodBeat.o(104884);
  }

  public static void a(com.tencent.mm.aw.e parame, Activity paramActivity)
  {
    AppMethodBeat.i(104883);
    h.pYm.X(10910, "3");
    cl localcl = new cl();
    abf localabf = new abf();
    abl localabl = new abl();
    aar localaar = new aar();
    localabl.alD(r.Yz());
    localabl.alE(r.Yz());
    localabl.LN(5);
    localabl.ml(bo.anU());
    localabl.alJ(v(parame));
    localaar.akO(parame.fKa);
    localaar.akP(parame.fKb);
    localaar.akN(parame.fKc);
    Object localObject = e.bUk().Tp(com.tencent.mm.plugin.music.h.b.K(parame));
    if (((com.tencent.mm.plugin.music.model.e.a)localObject).bUv())
    {
      localaar.akQ(((com.tencent.mm.plugin.music.model.e.a)localObject).field_songHAlbumUrl);
      localaar.oX(true);
      localObject = u(parame);
      if (!com.tencent.mm.vfs.e.ct((String)localObject))
        break label312;
      localaar.akW((String)localObject);
    }
    while (true)
    {
      localaar.akH(parame.fJW);
      localaar.akI(parame.fJX);
      localaar.LE(7);
      localcl.cvA.title = parame.fJW;
      localcl.cvA.desc = parame.fJX;
      localcl.cvA.cvC = localabf;
      localcl.cvA.type = 7;
      localabf.a(localabl);
      localabf.wiv.add(localaar);
      localcl.cvA.activity = paramActivity;
      localcl.cvA.cvH = 3;
      com.tencent.mm.sdk.b.a.xxA.m(localcl);
      AppMethodBeat.o(104883);
      return;
      localaar.akQ(((com.tencent.mm.plugin.music.model.e.a)localObject).field_songAlbumUrl);
      break;
      label312: localaar.oY(true);
    }
  }

  public static boolean a(com.tencent.mm.plugin.music.model.e.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(104882);
    ab.d("MicroMsg.Music.MusicUtil", "music urls: %s,  %s,  %s", new Object[] { parama.field_songWapLinkUrl, parama.field_songWebUrl, parama.field_songWifiUrl });
    if ((!bo.isNullOrNil(parama.field_songWapLinkUrl)) || (!bo.isNullOrNil(parama.field_songWebUrl)) || (!bo.isNullOrNil(parama.field_songWifiUrl)))
    {
      AppMethodBeat.o(104882);
      bool = true;
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(104882);
    }
  }

  public static void b(com.tencent.mm.aw.e parame, Activity paramActivity)
  {
    AppMethodBeat.i(104885);
    Object localObject1 = new WXMusicObject();
    ((WXMusicObject)localObject1).musicUrl = parame.fKc;
    ((WXMusicObject)localObject1).musicDataUrl = parame.fKa;
    ((WXMusicObject)localObject1).musicLowBandUrl = parame.fKb;
    ((WXMusicObject)localObject1).musicLowBandDataUrl = parame.fKb;
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.mediaObject = ((WXMediaMessage.IMediaObject)localObject1);
    localWXMediaMessage.title = parame.fJW;
    localWXMediaMessage.description = parame.fJX;
    SendMessageToWX.Req localReq = null;
    Object localObject2 = u(parame);
    localObject1 = localReq;
    if (localObject2 != null)
    {
      localObject1 = localReq;
      if (com.tencent.mm.vfs.e.ct((String)localObject2))
      {
        int i = (int)paramActivity.getResources().getDimension(2131427804);
        localObject1 = com.tencent.mm.sdk.platformtools.d.ap((String)localObject2, i, i);
      }
    }
    if (localObject1 != null);
    for (localWXMediaMessage.thumbData = bo.an((Bitmap)localObject1); ; localWXMediaMessage.thumbData = bo.an(com.tencent.mm.sdk.platformtools.d.LV(2130838448)))
    {
      localObject1 = new Intent();
      localObject2 = new Bundle();
      localReq = new SendMessageToWX.Req();
      localReq.message = localWXMediaMessage;
      localReq.toBundle((Bundle)localObject2);
      ((Intent)localObject1).putExtra("Ksnsupload_timeline", (Bundle)localObject2);
      ((Intent)localObject1).putExtra("Ksnsupload_musicid", parame.fJU);
      ((Intent)localObject1).putExtra("Ksnsupload_appid", v(parame));
      ((Intent)localObject1).putExtra("Ksnsupload_appname", w(parame));
      parame = v.nW("music_player");
      v.Zp().y(parame, true).j("prePublishId", "music_player");
      ((Intent)localObject1).putExtra("reportSessionId", parame);
      b.gkE.l((Intent)localObject1, paramActivity);
      AppMethodBeat.o(104885);
      return;
    }
  }

  public static int la(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(104891);
    if (paramString != null);
    try
    {
      if (paramString.length() <= 0)
      {
        AppMethodBeat.o(104891);
        j = i;
      }
      while (true)
      {
        return j;
        j = Integer.valueOf(paramString).intValue();
        AppMethodBeat.o(104891);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Music.MusicUtil", paramString, "getInt", new Object[0]);
        AppMethodBeat.o(104891);
        int j = i;
      }
    }
  }

  public static String u(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(104886);
    Object localObject1 = "";
    com.tencent.mm.plugin.music.model.e.a locala = e.bUk().Tp(com.tencent.mm.plugin.music.h.b.K(parame));
    if (locala == null)
    {
      AppMethodBeat.o(104886);
      return localObject1;
    }
    Object localObject2 = com.tencent.mm.plugin.music.h.b.aY(locala.field_musicId, true);
    localObject1 = localObject2;
    if (!com.tencent.mm.vfs.e.ct((String)localObject2))
      switch (parame.fJS)
      {
      case 1:
      case 2:
      case 3:
      case 8:
      case 9:
      default:
        localObject1 = localObject2;
        if (com.tencent.mm.plugin.sns.b.n.qFy != null)
        {
          localObject1 = new bau();
          ((bau)localObject1).Id = parame.fKk;
          ((bau)localObject1).wEH = parame.fJZ;
          ((bau)localObject1).wEI = parame.fKi;
          ((bau)localObject1).Url = ((bau)localObject1).wEH;
          localObject1 = com.tencent.mm.plugin.sns.b.n.qFx.a((bau)localObject1);
        }
        break;
      case 4:
      case 0:
      case 5:
      case 6:
      case 7:
      case 10:
      case 11:
      }
    while (true)
    {
      ab.i("MicroMsg.Music.MusicUtil", "real album path = %s", new Object[] { localObject1 });
      AppMethodBeat.o(104886);
      break;
      localObject1 = new kd();
      ((kd)localObject1).cFz.action = 12;
      ((kd)localObject1).cFz.cFE = parame.fJZ;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = ((kd)localObject1).cFA.cFG;
      localObject2 = localObject1;
      if (bo.isNullOrNil((String)localObject1))
        localObject2 = parame.fKe;
      localObject1 = localObject2;
      if (!com.tencent.mm.vfs.e.ct((String)localObject2))
      {
        localObject1 = com.tencent.mm.plugin.music.h.b.aY(locala.field_musicId, false);
        continue;
        localObject1 = o.ahl().I(parame.fKe, true);
        continue;
        if (parame.fKe == null)
        {
          localObject1 = "";
        }
        else
        {
          localObject1 = parame.fKe;
          continue;
          if (parame.fKe == null)
          {
            localObject1 = "";
          }
          else
          {
            localObject1 = parame.fKe;
            continue;
            if (parame.fKe == null)
              localObject1 = "";
            else
              localObject1 = parame.fKe;
          }
        }
      }
    }
  }

  public static String v(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(104887);
    String str1 = parame.fKh;
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      switch (parame.fJS)
      {
      default:
        str2 = str1;
      case 5:
      case 4:
      }
    while (true)
    {
      AppMethodBeat.o(104887);
      return str2;
      str2 = "wx482a4001c37e2b74";
      continue;
      str2 = "wx485a97c844086dc9";
    }
  }

  public static String w(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(104888);
    switch (parame.fJS)
    {
    case 2:
    case 3:
    case 6:
    case 7:
    default:
      parame = ah.getContext().getString(2131298852);
      AppMethodBeat.o(104888);
    case 0:
    case 1:
    case 8:
    case 5:
    case 4:
    }
    while (true)
    {
      return parame;
      parame = ah.getContext().getString(2131303724);
      AppMethodBeat.o(104888);
      continue;
      parame = ah.getContext().getString(2131302757);
      AppMethodBeat.o(104888);
      continue;
      parame = ah.getContext().getString(2131303439);
      AppMethodBeat.o(104888);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.d
 * JD-Core Version:    0.6.2
 */