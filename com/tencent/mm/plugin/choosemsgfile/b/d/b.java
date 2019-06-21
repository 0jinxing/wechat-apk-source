package com.tencent.mm.plugin.choosemsgfile.b.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.bp.d;
import com.tencent.mm.choosemsgfile.compat.a.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.choosemsgfile.b.b.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.widget.a.e.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private static ae<Integer, com.tencent.mm.at.a.a.c> kvu;

  static
  {
    AppMethodBeat.i(54410);
    kvu = new ae(3);
    AppMethodBeat.o(54410);
  }

  public static List<String> HJ(String paramString)
  {
    AppMethodBeat.i(54393);
    ArrayList localArrayList = new ArrayList();
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(54393);
    while (true)
    {
      return localArrayList;
      try
      {
        com.tencent.mm.aa.f localf = new com/tencent/mm/aa/f;
        localf.<init>(paramString);
        for (int i = 0; i < localf.length(); i++)
        {
          paramString = localf.optString(i, "");
          if (!bo.isNullOrNil(paramString))
            localArrayList.add(paramString);
        }
      }
      catch (com.tencent.mm.aa.g paramString)
      {
        ab.printErrStackTrace("MicroMsg.MsgFileUtils", paramString, "", new Object[0]);
        AppMethodBeat.o(54393);
      }
    }
  }

  public static String HK(String paramString)
  {
    AppMethodBeat.i(54402);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.MsgFileUtils", "type is null, use default type");
      paramString = "all";
      AppMethodBeat.o(54402);
    }
    while (true)
    {
      return paramString;
      if (("all".equals(paramString)) || ("image".equals(paramString)) || ("video".equals(paramString)) || ("file".equals(paramString)))
      {
        ab.i("MicroMsg.MsgFileUtils", "type is invalid, use default type");
        AppMethodBeat.o(54402);
      }
      else
      {
        paramString = "all";
        AppMethodBeat.o(54402);
      }
    }
  }

  public static String HL(String paramString)
  {
    AppMethodBeat.i(54405);
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (i)
      {
      default:
        paramString = "#888888";
        AppMethodBeat.o(54405);
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 42:
      case 43:
      case 44:
      case 45:
      }
      break;
    case 115312:
    case 113252:
    case 99640:
    case 3088960:
    case 110834:
    case 118783:
    case 3682393:
    case 111220:
    case 3447940:
    case 116079:
    case -1069324867:
    case 117003:
    case 3169:
    case 3479:
    case 108290:
    case -810722925:
    case 3124:
    case 96710:
    case 3530325:
    case 117835:
    case 108230:
    case 108104:
    case 3351329:
    case 108272:
    case 96323:
    case 96790:
    case 2993896:
    case 96574:
    case 96980:
    case 106479:
    case 116937:
    case 3358085:
    case 108322:
    case 96902:
    case 96884:
    case 99752:
    case 101488:
    case 108184:
    case 117856:
    case 3798:
    case 52316:
    case 108273:
    case 3504679:
    case 3643:
    case 3631:
    case 112670:
    case 3259225:
    case 3559925:
    case 114833:
    case 105439:
    case 99453:
    case 3268712:
    case 105441:
    case 111145:
    case 97669:
    case 102340:
    case 112675:
    case 120609:
    case 1827:
    case 104581:
    case 98244:
    case -284840886:
    }
    while (true)
    {
      return paramString;
      if (!paramString.equals("txt"))
        break;
      i = 0;
      break;
      if (!paramString.equals("rtf"))
        break;
      i = 1;
      break;
      if (!paramString.equals("doc"))
        break;
      i = 2;
      break;
      if (!paramString.equals("docx"))
        break;
      i = 3;
      break;
      if (!paramString.equals("pdf"))
        break;
      i = 4;
      break;
      if (!paramString.equals("xls"))
        break;
      i = 5;
      break;
      if (!paramString.equals("xlsx"))
        break;
      i = 6;
      break;
      if (!paramString.equals("ppt"))
        break;
      i = 7;
      break;
      if (!paramString.equals("pptx"))
        break;
      i = 8;
      break;
      if (!paramString.equals("url"))
        break;
      i = 9;
      break;
      if (!paramString.equals("mp3pro"))
        break;
      i = 10;
      break;
      if (!paramString.equals("vqf"))
        break;
      i = 11;
      break;
      if (!paramString.equals("cd"))
        break;
      i = 12;
      break;
      if (!paramString.equals("md"))
        break;
      i = 13;
      break;
      if (!paramString.equals("mod"))
        break;
      i = 14;
      break;
      if (!paramString.equals("vorbis"))
        break;
      i = 15;
      break;
      if (!paramString.equals("au"))
        break;
      i = 16;
      break;
      if (!paramString.equals("amr"))
        break;
      i = 17;
      break;
      if (!paramString.equals("silk"))
        break;
      i = 18;
      break;
      if (!paramString.equals("wma"))
        break;
      i = 19;
      break;
      if (!paramString.equals("mmf"))
        break;
      i = 20;
      break;
      if (!paramString.equals("mid"))
        break;
      i = 21;
      break;
      if (!paramString.equals("midi"))
        break;
      i = 22;
      break;
      if (!paramString.equals("mp3"))
        break;
      i = 23;
      break;
      if (!paramString.equals("aac"))
        break;
      i = 24;
      break;
      if (!paramString.equals("ape"))
        break;
      i = 25;
      break;
      if (!paramString.equals("aiff"))
        break;
      i = 26;
      break;
      if (!paramString.equals("aif"))
        break;
      i = 27;
      break;
      if (!paramString.equals("avi"))
        break;
      i = 28;
      break;
      if (!paramString.equals("m4v"))
        break;
      i = 29;
      break;
      if (!paramString.equals("vob"))
        break;
      i = 30;
      break;
      if (!paramString.equals("mpeg"))
        break;
      i = 31;
      break;
      if (!paramString.equals("mpe"))
        break;
      i = 32;
      break;
      if (!paramString.equals("asx"))
        break;
      i = 33;
      break;
      if (!paramString.equals("asf"))
        break;
      i = 34;
      break;
      if (!paramString.equals("f4v"))
        break;
      i = 35;
      break;
      if (!paramString.equals("flv"))
        break;
      i = 36;
      break;
      if (!paramString.equals("mkv"))
        break;
      i = 37;
      break;
      if (!paramString.equals("wmv"))
        break;
      i = 38;
      break;
      if (!paramString.equals("wm"))
        break;
      i = 39;
      break;
      if (!paramString.equals("3gp"))
        break;
      i = 40;
      break;
      if (!paramString.equals("mp4"))
        break;
      i = 41;
      break;
      if (!paramString.equals("rmvb"))
        break;
      i = 42;
      break;
      if (!paramString.equals("rm"))
        break;
      i = 43;
      break;
      if (!paramString.equals("ra"))
        break;
      i = 44;
      break;
      if (!paramString.equals("ram"))
        break;
      i = 45;
      break;
      if (!paramString.equals("jfif"))
        break;
      i = 46;
      break;
      if (!paramString.equals("tiff"))
        break;
      i = 47;
      break;
      if (!paramString.equals("tif"))
        break;
      i = 48;
      break;
      if (!paramString.equals("jpe"))
        break;
      i = 49;
      break;
      if (!paramString.equals("dib"))
        break;
      i = 50;
      break;
      if (!paramString.equals("jpeg"))
        break;
      i = 51;
      break;
      if (!paramString.equals("jpg"))
        break;
      i = 52;
      break;
      if (!paramString.equals("png"))
        break;
      i = 53;
      break;
      if (!paramString.equals("bmp"))
        break;
      i = 54;
      break;
      if (!paramString.equals("gif"))
        break;
      i = 55;
      break;
      if (!paramString.equals("rar"))
        break;
      i = 56;
      break;
      if (!paramString.equals("zip"))
        break;
      i = 57;
      break;
      if (!paramString.equals("7z"))
        break;
      i = 58;
      break;
      if (!paramString.equals("iso"))
        break;
      i = 59;
      break;
      if (!paramString.equals("cab"))
        break;
      i = 60;
      break;
      if (!paramString.equals("unknown"))
        break;
      i = 61;
      break;
      paramString = "#3980c1";
      AppMethodBeat.o(54405);
      continue;
      paramString = "#c84e3a";
      AppMethodBeat.o(54405);
      continue;
      paramString = "#278453";
      AppMethodBeat.o(54405);
      continue;
      paramString = "#ff7a42";
      AppMethodBeat.o(54405);
      continue;
      paramString = "#33B0D6";
      AppMethodBeat.o(54405);
      continue;
      paramString = "#42AA73";
      AppMethodBeat.o(54405);
      continue;
      paramString = "#6781F0";
      AppMethodBeat.o(54405);
    }
  }

  public static void I(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(54409);
    String str = String.format(paramContext.getString(2131298277), new Object[] { Integer.valueOf(paramInt) });
    paramContext = new e.a(paramContext);
    paramContext.asL(str).re(false);
    paramContext.b(new b.1()).show();
    AppMethodBeat.o(54409);
  }

  private static com.tencent.mm.plugin.choosemsgfile.b.b.a a(com.tencent.mm.plugin.choosemsgfile.b.c.c paramc, bi parambi)
  {
    AppMethodBeat.i(54395);
    if (parambi.dtA())
    {
      paramc = new com.tencent.mm.plugin.choosemsgfile.b.b.b(paramc, parambi);
      AppMethodBeat.o(54395);
    }
    while (true)
    {
      return paramc;
      if (parambi.drE())
      {
        paramc = new com.tencent.mm.plugin.choosemsgfile.b.b.g(paramc, parambi);
        AppMethodBeat.o(54395);
      }
      else
      {
        paramc = null;
        AppMethodBeat.o(54395);
      }
    }
  }

  public static com.tencent.mm.plugin.choosemsgfile.b.b.a a(com.tencent.mm.plugin.choosemsgfile.b.c.c paramc, bi parambi, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(54392);
    String str = paramString2;
    if (bo.isNullOrNil(paramString2))
      str = "all";
    paramString2 = HJ(paramString3);
    paramString3 = str.toLowerCase();
    int i = -1;
    switch (paramString3.hashCode())
    {
    default:
      switch (i)
      {
      default:
        paramc = null;
        AppMethodBeat.o(54392);
      case 0:
      case 1:
      case 2:
      case 3:
      }
      break;
    case 96673:
    case 100313435:
    case 112202875:
    case 3143036:
    }
    while (true)
    {
      return paramc;
      if (!paramString3.equals("all"))
        break;
      i = 0;
      break;
      if (!paramString3.equals("image"))
        break;
      i = 1;
      break;
      if (!paramString3.equals("video"))
        break;
      i = 2;
      break;
      if (!paramString3.equals("file"))
        break;
      i = 3;
      break;
      paramString2 = a(paramc, parambi, paramString1, paramString2);
      paramString1 = paramString2;
      if (paramString2 == null)
      {
        paramString2 = b(paramc, parambi);
        paramString1 = paramString2;
        if (paramString2 == null)
          paramString1 = a(paramc, parambi);
      }
      AppMethodBeat.o(54392);
      paramc = paramString1;
      continue;
      paramc = a(paramc, parambi);
      AppMethodBeat.o(54392);
      continue;
      paramc = b(paramc, parambi);
      AppMethodBeat.o(54392);
      continue;
      paramc = a(paramc, parambi, paramString1, paramString2);
      AppMethodBeat.o(54392);
    }
  }

  private static com.tencent.mm.plugin.choosemsgfile.b.b.a a(com.tencent.mm.plugin.choosemsgfile.b.c.c paramc, bi parambi, String paramString, List<String> paramList)
  {
    AppMethodBeat.i(54394);
    if (parambi.bAA())
    {
      Object localObject = parambi.field_content;
      if (localObject != null)
      {
        localObject = j.b.me((String)localObject);
        if ((localObject != null) && (((j.b)localObject).type == 6))
        {
          paramc = new com.tencent.mm.plugin.choosemsgfile.b.b.f(paramc, parambi, paramString);
          if ((paramList == null) || (paramList.size() == 0))
            AppMethodBeat.o(54394);
        }
      }
    }
    while (true)
    {
      return paramc;
      parambi = paramList.iterator();
      while (true)
        if (parambi.hasNext())
        {
          paramString = (String)parambi.next();
          if (paramc.getFileName().endsWith(paramString))
          {
            AppMethodBeat.o(54394);
            break;
          }
        }
      paramc = null;
      AppMethodBeat.o(54394);
    }
  }

  public static void a(int paramInt1, int paramInt2, Intent paramIntent, a.a parama)
  {
    AppMethodBeat.i(54406);
    if (paramInt1 == 291)
      switch (paramInt2)
      {
      default:
      case -1:
      case 1:
      case 0:
      }
    while (true)
    {
      AppMethodBeat.o(54406);
      while (true)
      {
        return;
        if (paramIntent == null)
        {
          ab.e("MicroMsg.MsgFileUtils", "data is null");
          a(parama, "data is null");
          AppMethodBeat.o(54406);
        }
        else
        {
          paramIntent = paramIntent.getParcelableArrayListExtra("FILEPATHS");
          if (paramIntent == null)
          {
            ab.e("MicroMsg.MsgFileUtils", "msgFiles is null");
            a(parama, "msgFiles is null");
            AppMethodBeat.o(54406);
          }
          else
          {
            if (parama != null)
              parama.a(-1, "", paramIntent);
            AppMethodBeat.o(54406);
            continue;
            if (paramIntent == null)
            {
              ab.e("MicroMsg.MsgFileUtils", "data is null");
              a(parama, "data is null");
              AppMethodBeat.o(54406);
            }
            else
            {
              a(parama, paramIntent.getStringExtra("ERRMSG"));
              AppMethodBeat.o(54406);
            }
          }
        }
      }
      if (parama != null)
        parama.a(0, "", null);
    }
  }

  public static void a(Context paramContext, View paramView, com.tencent.mm.plugin.choosemsgfile.b.b.a parama)
  {
    AppMethodBeat.i(54401);
    Intent localIntent = new Intent();
    if (parama == null)
    {
      ab.e("MicroMsg.MsgFileUtils", "[enterGallery] item == null");
      AppMethodBeat.o(54401);
    }
    bi localbi;
    while (true)
    {
      return;
      localbi = parama.kua;
      if (localbi != null)
        break;
      ab.e("MicroMsg.MsgFileUtils", "[enterGallery] msg == null");
      AppMethodBeat.o(54401);
    }
    int i = paramContext.getResources().getConfiguration().orientation;
    int j = 0;
    int k = 0;
    parama = new int[2];
    if (paramView != null)
    {
      j = paramView.getWidth();
      k = paramView.getHeight();
      paramView.getLocationInWindow(parama);
    }
    localIntent.addFlags(536870912);
    localIntent.putExtra("img_gallery_msg_id", localbi.field_msgId).putExtra("img_gallery_msg_svr_id", localbi.field_msgSvrId).putExtra("img_gallery_talker", localbi.field_talker).putExtra("img_gallery_chatroom_name", localbi.field_talker).putExtra("img_gallery_orientation", i).putExtra("show_enter_grid", false).putExtra("img_gallery_enter_from_scene", 1);
    if (paramView != null)
      localIntent.putExtra("img_gallery_width", j).putExtra("img_gallery_height", k).putExtra("img_gallery_left", parama[0]).putExtra("img_gallery_top", parama[1]).putExtra("img_gallery_enter_from_grid", true);
    while (true)
    {
      d.f(paramContext, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", localIntent);
      ((Activity)paramContext).overridePendingTransition(0, 0);
      AppMethodBeat.o(54401);
      break;
      localIntent.putExtra("img_gallery_back_from_grid", true);
    }
  }

  private static void a(a.a parama, String paramString)
  {
    AppMethodBeat.i(54407);
    if (parama != null)
      parama.a(1, paramString, null);
    AppMethodBeat.o(54407);
  }

  private static com.tencent.mm.plugin.choosemsgfile.b.b.a b(com.tencent.mm.plugin.choosemsgfile.b.c.c paramc, bi parambi)
  {
    AppMethodBeat.i(54396);
    if ((parambi.bws()) || (parambi.bwt()))
    {
      paramc = new h(paramc, parambi);
      AppMethodBeat.o(54396);
    }
    while (true)
    {
      return paramc;
      paramc = null;
      AppMethodBeat.o(54396);
    }
  }

  public static String b(bi parambi, boolean paramBoolean)
  {
    String str1 = null;
    String str2 = null;
    AppMethodBeat.i(54397);
    if (parambi == null)
      AppMethodBeat.o(54397);
    while (true)
    {
      return str2;
      if (parambi.field_isSend == 1)
      {
        str2 = r.Yz();
        AppMethodBeat.o(54397);
      }
      else
      {
        if (paramBoolean)
          str1 = bf.oy(parambi.field_content);
        str2 = str1;
        if (bo.isNullOrNil(str1))
          str2 = parambi.field_talker;
        AppMethodBeat.o(54397);
      }
    }
  }

  public static String cv(String paramString)
  {
    AppMethodBeat.i(54408);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(54408);
    }
    while (true)
    {
      return paramString;
      int i = paramString.lastIndexOf(".");
      if (i < 0)
      {
        paramString = "";
        AppMethodBeat.o(54408);
      }
      else
      {
        paramString = paramString.substring(i + 1);
        AppMethodBeat.o(54408);
      }
    }
  }

  public static final com.tencent.mm.at.a.a.c dy(Context paramContext)
  {
    AppMethodBeat.i(54400);
    com.tencent.mm.at.a.a.c localc = (com.tencent.mm.at.a.a.c)kvu.get(Integer.valueOf(4));
    Object localObject = localc;
    if (localc == null)
    {
      localObject = new c.a();
      ((c.a)localObject).fHe = 1;
      ((c.a)localObject).eQa = true;
      ((c.a)localObject).ePO = (com.tencent.mm.bz.a.gd(paramContext) / 4);
      ((c.a)localObject).ePN = (com.tencent.mm.bz.a.gd(paramContext) / 4);
      ((c.a)localObject).ePV = 2131690335;
      localObject = ((c.a)localObject).ahG();
      kvu.put(Integer.valueOf(4), localObject);
    }
    AppMethodBeat.o(54400);
    return localObject;
  }

  public static void f(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(54404);
    if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
    {
      com.tencent.mm.ui.base.t.hO(paramContext);
      AppMethodBeat.o(54404);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setClassName(paramContext, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
      localIntent.putExtra("app_msg_id", paramLong);
      localIntent.putExtra("scene", 1);
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(54404);
    }
  }

  public static String ha(long paramLong)
  {
    AppMethodBeat.i(54398);
    Object localObject = new Date(paramLong);
    localObject = com.tencent.mm.ui.gridviewheaders.a.dJg().a((Date)localObject, ah.getContext());
    AppMethodBeat.o(54398);
    return localObject;
  }

  public static long hb(long paramLong)
  {
    AppMethodBeat.i(54399);
    Date localDate = new Date(paramLong);
    paramLong = com.tencent.mm.ui.gridviewheaders.a.dJg().b(localDate);
    AppMethodBeat.o(54399);
    return paramLong;
  }

  public static String mI(String paramString)
  {
    AppMethodBeat.i(54403);
    Object localObject;
    if (com.tencent.mm.model.t.kH(paramString))
    {
      localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(paramString);
      if ((localObject != null) && (!bo.isNullOrNil(((ap)localObject).field_nickname)))
      {
        paramString = ((ap)localObject).field_nickname;
        AppMethodBeat.o(54403);
      }
    }
    while (true)
    {
      return paramString;
      localObject = ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(paramString);
      if (localObject == null)
      {
        ab.e("MicroMsg.MsgFileUtils", "%s chatRoomMember is null", new Object[] { paramString });
        paramString = "";
        AppMethodBeat.o(54403);
      }
      else
      {
        paramString = ((u)localObject).field_displayname;
        AppMethodBeat.o(54403);
        continue;
        localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(paramString);
        if (localObject == null)
        {
          ab.e("MicroMsg.MsgFileUtils", "%s, contact is null", new Object[] { paramString });
          paramString = "";
          AppMethodBeat.o(54403);
        }
        else
        {
          paramString = ((ap)localObject).field_nickname;
          AppMethodBeat.o(54403);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.d.b
 * JD-Core Version:    0.6.2
 */