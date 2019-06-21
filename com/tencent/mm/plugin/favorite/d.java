package com.tencent.mm.plugin.favorite;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.aw.f;
import com.tencent.mm.g.a.ld;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.fav.a.i;
import com.tencent.mm.plugin.fav.a.m;
import com.tencent.mm.plugin.fav.a.m.a;
import com.tencent.mm.plugin.fav.a.m.b;
import com.tencent.mm.plugin.fav.ui.i.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.ui.applet.g.a;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aau;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.aaz;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abs;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.ui.widget.a.c.a.b;
import com.tencent.mm.vfs.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  private static int[] mqq = { 2131822651, 2131822652, 2131822653, 2131822654, 2131822655 };

  private static String H(com.tencent.mm.plugin.fav.a.g paramg)
  {
    Object localObject = null;
    AppMethodBeat.i(20512);
    if (paramg.field_favProto == null)
    {
      AppMethodBeat.o(20512);
      paramg = localObject;
    }
    while (true)
    {
      return paramg;
      if ((paramg.field_favProto.whA != null) && (!bo.isNullOrNil(paramg.field_favProto.whA.canvasPageXml)))
      {
        paramg = paramg.field_favProto.whA.canvasPageXml;
        AppMethodBeat.o(20512);
      }
      else
      {
        paramg = paramg.field_favProto.wiv;
        if ((paramg != null) && (paramg.size() == 1))
        {
          paramg = ((aar)paramg.get(0)).canvasPageXml;
          AppMethodBeat.o(20512);
        }
        else
        {
          AppMethodBeat.o(20512);
          paramg = localObject;
        }
      }
    }
  }

  private static String I(com.tencent.mm.plugin.fav.a.g paramg)
  {
    Object localObject = null;
    AppMethodBeat.i(20513);
    if (paramg.field_favProto == null)
    {
      AppMethodBeat.o(20513);
      paramg = localObject;
    }
    while (true)
    {
      return paramg;
      if ((paramg.field_favProto.whA != null) && (!bo.isNullOrNil(paramg.field_favProto.whA.thumbUrl)))
      {
        paramg = paramg.field_favProto.whA.thumbUrl;
        AppMethodBeat.o(20513);
      }
      else
      {
        paramg = paramg.field_favProto.wiv;
        if ((paramg != null) && (paramg.size() == 1))
        {
          paramg = ((aar)paramg.get(0)).fgE;
          AppMethodBeat.o(20513);
        }
        else
        {
          AppMethodBeat.o(20513);
          paramg = localObject;
        }
      }
    }
  }

  private static void a(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, boolean paramBoolean, abh paramabh)
  {
    AppMethodBeat.i(20509);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_detail_info_id", paramg.field_localId);
    localIntent.putExtra("show_share", paramBoolean);
    localIntent.putExtra("prePublishId", "msgrecord_detail");
    localIntent.putExtra("preChatTYPE", 15);
    a(paramabh, localIntent);
    i.el("FavRecordDetailUI", paramabh.cvF);
    com.tencent.mm.bp.d.b(paramContext, "record", ".ui.FavRecordDetailUI", localIntent);
    AppMethodBeat.o(20509);
  }

  private static void a(com.tencent.mm.plugin.fav.a.g paramg, abh paramabh, Intent paramIntent)
  {
    AppMethodBeat.i(20519);
    a(paramabh, paramIntent);
    paramIntent.putExtra("key_detail_info_id", paramg.field_localId);
    AppMethodBeat.o(20519);
  }

  public static void a(g.a parama, Context paramContext, com.tencent.mm.plugin.fav.a.g paramg)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(20521);
    if ((paramg == null) || (paramContext == null))
    {
      ab.w("MicroMsg.FavItemLogic", "getDisplayInfo favItemInfo is null");
      AppMethodBeat.o(20521);
    }
    label32: aar localaar1;
    label50: Object localObject3;
    label53: Object localObject4;
    while (true)
    {
      return;
      localaar1 = com.tencent.mm.plugin.fav.a.b.c(paramg);
      if (paramg == null)
      {
        ab.w("MicroMsg.FavItemLogic", "GetThumbUrlAndLocalPath favItemInfo is null");
        localObject3 = null;
        if (!(localObject3 instanceof String))
          break label1413;
      }
      for (localObject3 = (String)localObject3; ; localObject3 = null)
      {
        localObject4 = paramg.field_favProto.whA;
        switch (paramg.field_type)
        {
        case 3:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 15:
        case 17:
        default:
          paramg = localObject2;
          if (localObject4 != null)
          {
            paramg = localObject2;
            if (!bo.isNullOrNil(((abu)localObject4).title))
              paramg = ((abu)localObject4).title;
          }
          localObject3 = paramg;
          if (bo.isNullOrNil(paramg))
            localObject3 = localaar1.title;
          parama.ajC(paramContext.getResources().getString(2131296527) + (String)localObject3);
          AppMethodBeat.o(20521);
          break label32;
          aar localaar2 = com.tencent.mm.plugin.fav.a.b.c(paramg);
          if (5 == paramg.field_type)
          {
            localObject3 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c(localaar2));
            if (((com.tencent.mm.vfs.b)localObject3).exists())
            {
              localObject3 = j.w(((com.tencent.mm.vfs.b)localObject3).dMD());
              break label53;
            }
            localObject3 = paramg.field_favProto.whA;
            if (localObject3 == null);
            for (localObject3 = null; ; localObject3 = ((abu)localObject3).thumbUrl)
            {
              localObject4 = localObject3;
              if (bo.isNullOrNil((String)localObject3))
                localObject4 = localaar2.cvq;
              localObject4 = com.tencent.mm.plugin.fav.a.b.LD((String)localObject4);
              localObject3 = localObject4;
              if (!bo.isNullOrNil((String)localObject4))
                break;
              localObject3 = Integer.valueOf(2131230820);
              break;
            }
          }
          if ((11 == paramg.field_type) || (10 == paramg.field_type))
          {
            localObject3 = paramg.field_favProto.whC;
            if (localObject3 != null)
            {
              localObject4 = com.tencent.mm.plugin.fav.a.b.LD(((abe)localObject3).thumbUrl);
              localObject3 = localObject4;
              if (!bo.isNullOrNil((String)localObject4))
                break label53;
              localObject3 = Integer.valueOf(2131230813);
              break label53;
            }
          }
          if ((15 == paramg.field_type) || (12 == paramg.field_type))
          {
            localObject3 = paramg.field_favProto.whE;
            if (localObject3 != null)
            {
              localObject4 = com.tencent.mm.plugin.fav.a.b.LD(((abo)localObject3).thumbUrl);
              localObject3 = localObject4;
              if (!bo.isNullOrNil((String)localObject4))
                break label53;
              localObject3 = Integer.valueOf(2131230813);
              break label53;
            }
          }
          if ((2 == paramg.field_type) || (7 == paramg.field_type) || (16 == paramg.field_type) || (4 == paramg.field_type))
          {
            localObject3 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c(localaar2));
            if (((com.tencent.mm.vfs.b)localObject3).exists())
            {
              localObject3 = j.w(((com.tencent.mm.vfs.b)localObject3).dMD());
              break label53;
            }
            localObject3 = com.tencent.mm.plugin.fav.a.b.LD(localaar2.cvq);
            localObject4 = localObject3;
            if (bo.isNullOrNil((String)localObject3))
            {
              com.tencent.mm.plugin.fav.a.b.a(paramg, localaar2);
              localObject4 = com.tencent.mm.plugin.fav.a.b.c(localaar2);
            }
            localObject3 = localObject4;
            if (!bo.isNullOrNil((String)localObject4))
              break label53;
          }
          switch (paramg.field_type)
          {
          default:
            localObject3 = Integer.valueOf(2131230817);
            break;
          case 2:
            localObject3 = Integer.valueOf(2130837705);
            break;
          case 7:
            localObject3 = Integer.valueOf(2131230800);
            break;
            if ((3 == paramg.field_type) || (6 == paramg.field_type))
              break label50;
            if (8 == paramg.field_type)
            {
              localObject3 = Integer.valueOf(com.tencent.mm.pluginsdk.d.ail(localaar2.wgo));
              break;
            }
            if (17 == paramg.field_type)
            {
              aw.ZK();
              localObject3 = com.tencent.mm.model.c.XO().Rn(localaar2.desc);
              if ((((bi.a)localObject3).svN != null) && (((bi.a)localObject3).svN.length() != 0))
              {
                localObject3 = new SpannableString(((bi.a)localObject3).svN);
                break;
              }
              localObject3 = Integer.valueOf(2130838444);
              break;
            }
            if ((14 != paramg.field_type) || (paramg.field_favProto.wiv == null))
              break label50;
            localObject3 = paramg.field_favProto.wiv.iterator();
            do
            {
              do
              {
                if (!((Iterator)localObject3).hasNext())
                  break;
                localaar2 = (aar)((Iterator)localObject3).next();
              }
              while (localaar2.dataType == 1);
              if (localaar2.dataType == 3)
              {
                localObject3 = Integer.valueOf(2131230819);
                break label53;
              }
              if (localaar2.dataType == 6)
              {
                localObject3 = Integer.valueOf(2131230798);
                break label53;
              }
              if (localaar2.dataType == 8)
              {
                localObject3 = Integer.valueOf(com.tencent.mm.pluginsdk.d.ail(localaar2.wgo));
                break label53;
              }
              if ((localaar2.dataType == 2) || (localaar2.dataType == 7) || (localaar2.dataType == 15) || (localaar2.dataType == 4))
              {
                localObject3 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c(localaar2));
                if (((com.tencent.mm.vfs.b)localObject3).exists())
                {
                  localObject3 = j.w(((com.tencent.mm.vfs.b)localObject3).dMD());
                  break label53;
                }
                localObject3 = com.tencent.mm.plugin.fav.a.b.LD(localaar2.cvq);
                if (bo.isNullOrNil((String)localObject3))
                  switch (localaar2.dataType)
                  {
                  default:
                    localObject3 = Integer.valueOf(2131230817);
                    break;
                  case 2:
                    localObject3 = Integer.valueOf(2130837705);
                    break;
                  case 7:
                    localObject3 = Integer.valueOf(2131230800);
                    break;
                  }
                break label53;
              }
              if (localaar2.dataType == 5)
              {
                localObject3 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c(localaar2));
                if (((com.tencent.mm.vfs.b)localObject3).exists())
                {
                  localObject3 = j.w(((com.tencent.mm.vfs.b)localObject3).dMD());
                  break label53;
                }
                localObject3 = localaar2.wgT.whA;
                if (localObject3 == null);
                for (localObject3 = null; ; localObject3 = ((abu)localObject3).thumbUrl)
                {
                  localObject4 = localObject3;
                  if (bo.isNullOrNil((String)localObject3))
                    localObject4 = localaar2.cvq;
                  localObject4 = com.tencent.mm.plugin.fav.a.b.LD((String)localObject4);
                  localObject3 = localObject4;
                  if (!bo.isNullOrNil((String)localObject4))
                    break;
                  localObject3 = Integer.valueOf(2131230820);
                  break;
                }
              }
              if ((localaar2.dataType == 10) || (localaar2.dataType == 11))
              {
                localObject4 = localaar2.wgT.whC;
                if (localObject4 != null)
                {
                  localObject4 = com.tencent.mm.plugin.fav.a.b.LD(((abe)localObject4).thumbUrl);
                  localObject3 = localObject4;
                  if (!bo.isNullOrNil((String)localObject4))
                    break label53;
                  localObject3 = Integer.valueOf(2131230813);
                  break label53;
                }
              }
              if ((localaar2.dataType == 12) || (localaar2.dataType == 14))
              {
                localObject4 = localaar2.wgT.whE;
                if (localObject4 != null)
                {
                  localObject4 = com.tencent.mm.plugin.fav.a.b.LD(((abo)localObject4).thumbUrl);
                  localObject3 = localObject4;
                  if (!bo.isNullOrNil((String)localObject4))
                    break label53;
                  localObject3 = Integer.valueOf(2131230813);
                  break label53;
                }
              }
            }
            while (localaar2.dataType != 16);
            aw.ZK();
            localObject3 = com.tencent.mm.model.c.XO().Rn(localaar2.desc);
            if ((((bi.a)localObject3).svN != null) && (((bi.a)localObject3).svN.length() != 0))
            {
              localObject3 = new SpannableString(((bi.a)localObject3).svN);
              break;
            }
            localObject3 = Integer.valueOf(2130838444);
            break;
            label1413: if ((localObject3 instanceof Integer))
              ((Integer)localObject3).intValue();
            break;
          }
          break;
        case 8:
        case 1:
        case 6:
        case 5:
        case 14:
        case 2:
        case 16:
        case 4:
        case 18:
        case 7:
        }
      }
      localObject3 = paramg.field_favProto.title;
      paramg = (com.tencent.mm.plugin.fav.a.g)localObject3;
      if (bo.isNullOrNil((String)localObject3))
        paramg = localaar1.title;
      parama.ajC(paramContext.getResources().getString(2131296942) + paramg);
      AppMethodBeat.o(20521);
      continue;
      parama.ajC(paramg.field_favProto.desc);
      parama.djw();
      parama.a(new d.2(paramg, paramContext));
      AppMethodBeat.o(20521);
      continue;
      paramg = paramg.field_favProto.why;
      parama.ajC(paramContext.getString(2131296967) + paramg.label);
      AppMethodBeat.o(20521);
    }
    if ((localObject4 != null) && (!bo.isNullOrNil(((abu)localObject4).title)))
    {
      paramg = ((abu)localObject4).title;
      localObject3 = ((abu)localObject4).desc;
    }
    while (true)
    {
      localObject4 = paramg;
      if (bo.isNullOrNil(paramg))
        localObject4 = localaar1.title;
      bo.isNullOrNil((String)localObject3);
      parama.ajC(paramContext.getResources().getString(2131297071) + (String)localObject4);
      AppMethodBeat.o(20521);
      break;
      paramg = i.a.a(paramContext, paramg).title;
      parama.ajC(paramContext.getResources().getString(2131297030) + paramg);
      AppMethodBeat.o(20521);
      break;
      parama.b(com.tencent.mm.sdk.platformtools.d.aml((String)localObject3), 3);
      AppMethodBeat.o(20521);
      break;
      parama.b(com.tencent.mm.sdk.platformtools.d.aml((String)localObject3), 2);
      AppMethodBeat.o(20521);
      break;
      parama.b(com.tencent.mm.sdk.platformtools.d.aml((String)localObject3), 2);
      AppMethodBeat.o(20521);
      break;
      localObject3 = paramContext.getResources().getString(2131296993);
      paramContext = i.a.a(paramContext, paramg).desc.replaceAll("\n", " ");
      parama.ajC((String)localObject3 + paramContext);
      AppMethodBeat.o(20521);
      break;
      paramg = localObject1;
      if (localObject4 != null)
      {
        paramg = localObject1;
        if (!bo.isNullOrNil(((abu)localObject4).title))
          paramg = ((abu)localObject4).title;
      }
      localObject3 = paramg;
      if (bo.isNullOrNil(paramg))
        localObject3 = localaar1.title;
      parama.ajC(paramContext.getResources().getString(2131296980) + (String)localObject3);
      AppMethodBeat.o(20521);
      break;
      localObject3 = null;
      paramg = null;
    }
  }

  private static void a(abh paramabh, Intent paramIntent)
  {
    AppMethodBeat.i(20520);
    paramIntent.putExtra("key_detail_fav_scene", paramabh.scene);
    paramIntent.putExtra("key_detail_fav_sub_scene", paramabh.jSW);
    paramIntent.putExtra("key_detail_fav_index", paramabh.index);
    paramIntent.putExtra("key_detail_fav_query", paramabh.query);
    paramIntent.putExtra("key_detail_fav_sessionid", paramabh.cvF);
    paramIntent.putExtra("key_detail_fav_tags", paramabh.mfg);
    AppMethodBeat.o(20520);
  }

  private static boolean a(Context paramContext, aar paramaar, com.tencent.mm.plugin.fav.a.g paramg)
  {
    boolean bool = true;
    AppMethodBeat.i(20516);
    aau localaau = paramaar.wgZ;
    if ((localaau == null) || (bo.isNullOrNil(localaau.fiG)))
    {
      AppMethodBeat.o(20516);
      bool = false;
    }
    while (true)
    {
      return bool;
      m.a(m.a.mfu, paramg);
      String str = com.tencent.mm.plugin.fav.a.b.c(paramaar);
      Intent localIntent = new Intent();
      localIntent.putExtra("IsAd", false);
      localIntent.putExtra("KStremVideoUrl", localaau.fiG);
      localIntent.putExtra("StreamWording", localaau.fiJ);
      localIntent.putExtra("StremWebUrl", localaau.fiK);
      localIntent.putExtra("KThumUrl", localaau.fiL);
      localIntent.putExtra("KSta_StremVideoAduxInfo", localaau.fiM);
      localIntent.putExtra("KSta_StremVideoPublishId", localaau.fiN);
      localIntent.putExtra("KSta_SourceType", 2);
      localIntent.putExtra("KSta_Scene", m.b.mfE.value);
      localIntent.putExtra("KSta_FromUserName", paramg.field_fromUser);
      localIntent.putExtra("KSta_FavID", paramg.field_id);
      localIntent.putExtra("KSta_SnsStatExtStr", paramaar.cMn);
      localIntent.putExtra("KBlockFav", true);
      localIntent.putExtra("KMediaId", "fakeid_" + paramg.field_id);
      localIntent.putExtra("KThumbPath", str);
      localIntent.putExtra("KMediaVideoTime", localaau.wid);
      localIntent.putExtra("KMediaTitle", localaau.fiI);
      com.tencent.mm.bp.d.b(paramContext, "sns", ".ui.VideoAdPlayerUI", localIntent);
      AppMethodBeat.o(20516);
    }
  }

  public static void b(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, abh paramabh)
  {
    AppMethodBeat.i(20508);
    if (paramContext == null)
    {
      ab.w("MicroMsg.FavItemLogic", "Context is null");
      AppMethodBeat.o(20508);
    }
    while (true)
    {
      return;
      if (paramg == null)
      {
        ab.w("MicroMsg.FavItemLogic", "Fav item is null");
        AppMethodBeat.o(20508);
      }
      else
      {
        ab.i("MicroMsg.FavItemLogic", "Handler favItemInfo id %d, type %d", new Object[] { Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_type) });
        switch (paramg.field_type)
        {
        case -1:
        case 0:
        case 9:
        case 13:
        default:
          ab.w("MicroMsg.FavItemLogic", "Do not match any type %d", new Object[] { Integer.valueOf(paramg.field_type) });
        case 1:
        case 2:
        case 3:
        case 16:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 10:
        case 12:
        case 15:
        case 11:
        case 14:
        case 17:
          do
          {
            AppMethodBeat.o(20508);
            break;
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("key_detail_text", paramg.field_favProto.desc);
            ((Intent)localObject1).putExtra("key_detail_info_id", paramg.field_localId);
            ((Intent)localObject1).putExtra("key_detail_can_share_to_friend", paramg.but());
            ((Intent)localObject1).putExtra("key_detail_time", paramg.field_updateTime);
            if (paramg.field_sourceCreateTime <= 0L);
            for (long l = paramg.field_updateTime; ; l = paramg.field_sourceCreateTime)
            {
              ((Intent)localObject1).putExtra("key_detail_create_time", l);
              a(paramabh, (Intent)localObject1);
              i.el("FavoriteTextDetailUI", paramabh.cvF);
              com.tencent.mm.plugin.fav.a.b.b(paramContext, ".ui.detail.FavoriteTextDetailUI", (Intent)localObject1);
              AppMethodBeat.o(20508);
              break;
            }
            e(paramContext, paramg, paramabh);
            AppMethodBeat.o(20508);
            break;
            localObject1 = new Intent();
            a(paramg, paramabh, (Intent)localObject1);
            ((Intent)localObject1).putExtra("key_detail_create_time", paramg.field_favProto.wit.createTime);
            i.el("FavoriteVoiceDetailUI", paramabh.cvF);
            com.tencent.mm.plugin.fav.a.b.b(paramContext, ".ui.detail.FavoriteVoiceDetailUI", (Intent)localObject1);
            AppMethodBeat.o(20508);
            break;
            localObject1 = com.tencent.mm.plugin.fav.a.b.c(paramg);
            if ((localObject1 != null) && (((aar)localObject1).wgZ != null) && ((!bo.isNullOrNil(((aar)localObject1).wgZ.fiG)) || (!bo.isNullOrNil(((aar)localObject1).wgZ.fiK))))
            {
              ab.i("MicroMsg.FavItemLogic", "it is ad sight.");
              c(paramContext, paramg, paramabh);
              AppMethodBeat.o(20508);
              break;
            }
            d(paramContext, paramg, paramabh);
            AppMethodBeat.o(20508);
            break;
            d(paramContext, paramg, paramabh);
            AppMethodBeat.o(20508);
            break;
            d(paramContext, paramg, true, paramabh);
            AppMethodBeat.o(20508);
            break;
            Object localObject2 = paramg.field_favProto.why;
            Object localObject3 = paramg.field_favProto.hHV;
            localObject1 = paramg.field_favProto.wit;
            if ((localObject1 != null) && (!bo.isNullOrNil(((abl)localObject1).whU)));
            for (localObject1 = s.mJ(((abl)localObject1).whU); ; localObject1 = s.mJ(paramg.field_fromUser))
            {
              ArrayList localArrayList = new ArrayList();
              if (paramg.field_tagProto.wiJ != null)
                localArrayList.addAll(paramg.field_tagProto.wiJ);
              i.el("RedirectUI", paramabh.cvF);
              com.tencent.mm.plugin.fav.a.b.a(paramg.field_localId, (aay)localObject2, (String)localObject1, (String)localObject3, localArrayList, paramContext);
              AppMethodBeat.o(20508);
              break;
            }
            localObject3 = paramg.field_favProto.wit;
            localObject2 = com.tencent.mm.plugin.fav.a.b.c(paramg);
            localObject1 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c((aar)localObject2));
            if (!((com.tencent.mm.vfs.b)localObject1).exists())
              if (((aar)localObject2).cvq == null)
              {
                localObject1 = "";
                localObject1 = f.a(6, null, ((aar)localObject2).title, ((aar)localObject2).desc, ((aar)localObject2).wgg, ((aar)localObject2).wgk, ((aar)localObject2).wgi, ((aar)localObject2).mnd, com.tencent.mm.plugin.fav.a.b.bul(), (String)localObject1, "", ((abl)localObject3).appId);
                if (com.tencent.mm.plugin.fav.a.b.e((aar)localObject2))
                  break label893;
                ab.i("MicroMsg.FavItemLogic", " start play music");
                com.tencent.mm.aw.a.b((e)localObject1);
              }
            while (true)
            {
              ((e)localObject1).fKs = String.valueOf(paramg.field_localId);
              paramg = new Intent();
              paramg.putExtra("key_scene", 2);
              i.el("MusicMainUI", paramabh.cvF);
              com.tencent.mm.bp.d.b(paramContext, "music", ".ui.MusicMainUI", paramg);
              AppMethodBeat.o(20508);
              break;
              localObject1 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.bue() + com.tencent.mm.a.g.x(((aar)localObject2).cvq.getBytes()));
              if (((com.tencent.mm.vfs.b)localObject1).exists());
              for (localObject1 = j.w(((com.tencent.mm.vfs.b)localObject1).dMD()); ; localObject1 = "")
                break;
              localObject1 = j.w(((com.tencent.mm.vfs.b)localObject1).dMD());
              break label692;
              ab.i("MicroMsg.FavItemLogic", "The music is playing, don't start play again");
            }
            c(paramContext, paramg, true, paramabh);
            AppMethodBeat.o(20508);
            break;
            ab.d("MicroMsg.FavItemLogic", "start product ui, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId) });
            l = paramg.field_localId;
            paramg = paramg.field_favProto.whC.info;
            paramabh = new Intent();
            paramabh.putExtra("key_is_favorite_item", true);
            paramabh.putExtra("key_favorite_local_id", l);
            paramabh.putExtra("key_Product_xml", paramg);
            paramabh.putExtra("key_can_delete_favorite_item", true);
            paramabh.putExtra("key_ProductUI_getProductInfoScene", 3);
            com.tencent.mm.bp.d.b(paramContext, "scanner", ".ui.ProductUI", paramabh);
            AppMethodBeat.o(20508);
            break;
            ab.d("MicroMsg.FavItemLogic", "start tv ui, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId) });
            l = paramg.field_localId;
            paramg = paramg.field_favProto.whE.info;
            paramabh = new Intent();
            paramabh.putExtra("key_TV_getProductInfoScene", 3);
            paramabh.putExtra("key_is_favorite_item", true);
            paramabh.putExtra("key_favorite_local_id", l);
            paramabh.putExtra("key_TV_xml", paramg);
            paramabh.putExtra("key_can_delete_favorite_item", true);
            com.tencent.mm.bp.d.b(paramContext, "shake", ".ui.TVInfoUI", paramabh);
            AppMethodBeat.o(20508);
            break;
            ab.d("MicroMsg.FavItemLogic", "start product ui, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId) });
            paramabh = new Intent();
            paramabh.putExtra("key_product_scene", 4);
            paramabh.putExtra("key_product_info", paramg.field_favProto.whC.info);
            com.tencent.mm.bp.d.b(paramContext, "product", ".ui.MallProductUI", paramabh);
            AppMethodBeat.o(20508);
            break;
            a(paramContext, paramg, true, paramabh);
            AppMethodBeat.o(20508);
            break;
            paramg = com.tencent.mm.plugin.fav.a.b.c(paramg).desc;
            aw.ZK();
            paramg = com.tencent.mm.model.c.XO().Rn(paramg);
          }
          while (paramg == null);
          Object localObject1 = new Intent();
          ((Intent)localObject1).putExtra("Contact_User", paramg.svN);
          ((Intent)localObject1).putExtra("Contact_Alias", paramg.dFl);
          ((Intent)localObject1).putExtra("Contact_Nick", paramg.nickname);
          ((Intent)localObject1).putExtra("Contact_QuanPin", paramg.gwG);
          ((Intent)localObject1).putExtra("Contact_PyInitial", paramg.gwF);
          ((Intent)localObject1).putExtra("Contact_Uin", paramg.pnz);
          ((Intent)localObject1).putExtra("Contact_Mobile_MD5", paramg.xZi);
          ((Intent)localObject1).putExtra("Contact_full_Mobile_MD5", paramg.xZj);
          ((Intent)localObject1).putExtra("Contact_QQNick", paramg.dtZ());
          ((Intent)localObject1).putExtra("User_From_Fmessage", false);
          ((Intent)localObject1).putExtra("Contact_Scene", paramg.scene);
          ((Intent)localObject1).putExtra("Contact_FMessageCard", true);
          ((Intent)localObject1).putExtra("Contact_RemarkName", paramg.gwK);
          ((Intent)localObject1).putExtra("Contact_VUser_Info_Flag", paramg.ufB);
          ((Intent)localObject1).putExtra("Contact_VUser_Info", paramg.duh);
          ((Intent)localObject1).putExtra("Contact_BrandIconURL", paramg.pln);
          ((Intent)localObject1).putExtra("Contact_Province", paramg.getProvince());
          ((Intent)localObject1).putExtra("Contact_City", paramg.getCity());
          ((Intent)localObject1).putExtra("Contact_Sex", paramg.dtS);
          ((Intent)localObject1).putExtra("Contact_Signature", paramg.signature);
          ((Intent)localObject1).putExtra("Contact_ShowUserName", false);
          ((Intent)localObject1).putExtra("Contact_KSnsIFlag", 0);
          i.el("ContactInfoUI", paramabh.cvF);
          com.tencent.mm.bp.d.b(paramContext, "profile", ".ui.ContactInfoUI", (Intent)localObject1);
          com.tencent.mm.bq.a.Lu(paramg.scene);
          AppMethodBeat.o(20508);
          break;
        case 18:
          b(paramContext, paramg, true, paramabh);
          AppMethodBeat.o(20508);
          break;
        case -2:
          label692: label893: Toast.makeText(paramContext, 2131299758, 0).show();
          AppMethodBeat.o(20508);
        }
      }
    }
  }

  private static void b(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, boolean paramBoolean, abh paramabh)
  {
    AppMethodBeat.i(20510);
    ab.i("MicroMsg.FavItemLogic", "click WNNoteItem, handleWNNoteItem");
    ld localld = new ld();
    localld.cGU.field_localId = paramg.field_localId;
    if (paramg.field_localId == -1L)
      localld.cGU.cHa = 4;
    while (true)
    {
      localld.cGU.context = paramContext;
      paramContext = new Bundle();
      aaz localaaz = paramg.field_favProto.vzK;
      if (localaaz != null)
      {
        paramContext.putString("noteauthor", localaaz.wim);
        paramContext.putString("noteeditor", localaaz.win);
      }
      paramContext.putLong("edittime", paramg.field_updateTime);
      localld.cGU.cGZ = paramContext;
      localld.cGU.field_favProto = paramg.field_favProto;
      localld.cGU.type = 2;
      localld.cGU.cHc = paramBoolean;
      localld.cGU.cHd = paramabh;
      com.tencent.mm.sdk.b.a.xxA.m(localld);
      i.el("NoteEditorUI", paramabh.cvF);
      AppMethodBeat.o(20510);
      return;
      localld.cGU.cGW = paramg.field_xml;
    }
  }

  public static void b(g.a parama, final Context paramContext, final com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(20522);
    if ((paramg == null) || (paramContext == null))
    {
      ab.w("MicroMsg.FavItemLogic", "getDisplayInfo favItemInfo is null");
      AppMethodBeat.o(20522);
      return;
    }
    final aar localaar = com.tencent.mm.plugin.fav.a.b.c(paramg);
    switch (paramg.field_type)
    {
    case 3:
    case 7:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 15:
    case 17:
    default:
    case 8:
    case 1:
    case 6:
    case 5:
    case 14:
    case 2:
    case 4:
    case 16:
    case 18:
    }
    while (true)
    {
      AppMethodBeat.o(20522);
      break;
      parama.a(new d.3(paramContext, paramg));
      AppMethodBeat.o(20522);
      break;
      parama.a(new d.4(paramg, paramContext));
      AppMethodBeat.o(20522);
      break;
      parama.a(new c.a.b()
      {
        public final void bwF()
        {
          AppMethodBeat.i(20503);
          Intent localIntent = new Intent();
          localIntent.putExtra("map_view_type", 1);
          localIntent.putExtra("kwebmap_slat", this.mqr.lat);
          localIntent.putExtra("kwebmap_lng", this.mqr.lng);
          localIntent.putExtra("Kwebmap_locaion", this.mqr.label);
          localIntent.putExtra("kShowshare", false);
          com.tencent.mm.bp.d.b(paramContext, "location", ".ui.RedirectUI", localIntent);
          AppMethodBeat.o(20503);
        }
      });
      AppMethodBeat.o(20522);
      break;
      parama.a(new c.a.b()
      {
        public final void bwF()
        {
          AppMethodBeat.i(20504);
          d.g(this.val$context, paramg, new abh());
          AppMethodBeat.o(20504);
        }
      });
      AppMethodBeat.o(20522);
      break;
      parama.a(new c.a.b()
      {
        public final void bwF()
        {
          AppMethodBeat.i(20505);
          d.h(this.val$context, paramg, new abh());
          AppMethodBeat.o(20505);
        }
      });
      AppMethodBeat.o(20522);
      break;
      parama.a(new c.a.b()
      {
        public final void bwF()
        {
          AppMethodBeat.i(20506);
          Intent localIntent = new Intent();
          localIntent.putExtra("key_detail_info_id", this.meI.field_localId);
          localIntent.putExtra("key_detail_data_id", localaar.mnd);
          localIntent.putExtra("show_share", false);
          com.tencent.mm.plugin.fav.a.b.b(paramContext, ".ui.FavImgGalleryUI", localIntent);
          AppMethodBeat.o(20506);
        }
      });
      AppMethodBeat.o(20522);
      break;
      parama.a(new d.9(paramg, paramContext));
      AppMethodBeat.o(20522);
      break;
      parama.a(new d.1(paramContext, paramg));
    }
  }

  private static void c(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, abh paramabh)
  {
    AppMethodBeat.i(20515);
    m.a(m.a.mfs, paramg);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_detail_info_id", paramg.field_localId);
    a(paramabh, localIntent);
    com.tencent.mm.plugin.fav.a.b.b(paramContext, ".ui.detail.FavoriteSightDetailUI", localIntent);
    AppMethodBeat.o(20515);
  }

  private static void c(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, boolean paramBoolean, abh paramabh)
  {
    AppMethodBeat.i(20511);
    Object localObject = com.tencent.mm.plugin.fav.a.b.c(paramg);
    if ((paramabh != null) && (paramabh.cOi == 1))
    {
      localObject = new Intent();
      ((Intent)localObject).putExtra("key_detail_info_id", paramg.field_localId);
      ((Intent)localObject).putExtra("key_detail_open_way", true);
      ((Intent)localObject).putExtra("show_share", paramBoolean);
      a(paramabh, (Intent)localObject);
      i.el("FavoriteFileDetailUI", paramabh.cvF);
      com.tencent.mm.plugin.fav.a.b.b(paramContext, ".ui.detail.FavoriteFileDetailUI", (Intent)localObject);
      AppMethodBeat.o(20511);
    }
    while (true)
    {
      return;
      if ((paramabh != null) && (paramabh.cOi == 2))
      {
        com.tencent.mm.pluginsdk.ui.tools.a.b((Activity)paramContext, com.tencent.mm.plugin.fav.a.b.b((aar)localObject), ((aar)localObject).wgo, 2);
        AppMethodBeat.o(20511);
      }
      else if (com.tencent.mm.plugin.fav.a.b.f((aar)localObject))
      {
        if (com.tencent.mm.plugin.fav.a.b.g((aar)localObject))
        {
          e(paramContext, paramg, paramabh);
          AppMethodBeat.o(20511);
        }
        else if (!com.tencent.mm.pluginsdk.ui.tools.a.M(com.tencent.mm.plugin.fav.a.b.b((aar)localObject), ((aar)localObject).wgo, 2))
        {
          AppMethodBeat.o(20511);
        }
      }
      else
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("key_detail_info_id", paramg.field_localId);
        ((Intent)localObject).putExtra("show_share", paramBoolean);
        a(paramabh, (Intent)localObject);
        i.el("FavoriteFileDetailUI", paramabh.cvF);
        com.tencent.mm.plugin.fav.a.b.b(paramContext, ".ui.detail.FavoriteFileDetailUI", (Intent)localObject);
        AppMethodBeat.o(20511);
      }
    }
  }

  private static void d(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, abh paramabh)
  {
    AppMethodBeat.i(20517);
    aar localaar = com.tencent.mm.plugin.fav.a.b.c(paramg);
    if (a(paramContext, localaar, paramg))
      AppMethodBeat.o(20517);
    while (true)
    {
      return;
      Object localObject2;
      if ((bo.isNullOrNil(localaar.wgq)) || (localaar.wgu <= 0L))
      {
        ab.w("MicroMsg.FavItemLogic", "full md5[%s], fullsize[%d], start use url", new Object[] { localaar.wgq, Long.valueOf(localaar.wgu) });
        Object localObject1 = com.tencent.mm.plugin.fav.a.b.c(paramg).wgg;
        localObject2 = localObject1;
        if (bo.isNullOrNil((String)localObject1))
          localObject2 = com.tencent.mm.plugin.fav.a.b.c(paramg).wgk;
        if (bo.isNullOrNil((String)localObject2))
        {
          ab.w("MicroMsg.FavItemLogic", "onClick video url null, return");
          c(paramContext, paramg, paramabh);
          AppMethodBeat.o(20517);
        }
        else
        {
          paramabh = new Intent();
          localObject1 = new Bundle();
          ((Bundle)localObject1).putString("key_snsad_statextstr", localaar.cMn);
          ((Bundle)localObject1).putLong("favlocalid", paramg.field_localId);
          paramabh.putExtra("jsapiargs", (Bundle)localObject1);
          paramabh.putExtra("rawUrl", (String)localObject2);
          paramabh.putExtra("is_favorite_item", true);
          paramabh.putExtra("fav_local_id", paramg.field_localId);
          paramabh.putExtra("geta8key_scene", 14);
          ab.d("MicroMsg.FavItemLogic", "start video webview, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId) });
          paramabh.putExtra("geta8key_scene", 14);
          com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramabh);
          AppMethodBeat.o(20517);
        }
      }
      else
      {
        localObject2 = new Intent();
        a(paramg, paramabh, (Intent)localObject2);
        i.el("FavoriteSightDetailUI", paramabh.cvF);
        com.tencent.mm.plugin.fav.a.b.b(paramContext, ".ui.detail.FavoriteSightDetailUI", (Intent)localObject2);
        AppMethodBeat.o(20517);
      }
    }
  }

  private static void d(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, boolean paramBoolean, abh paramabh)
  {
    AppMethodBeat.i(20514);
    Object localObject1 = H(paramg);
    if (!bo.isNullOrNil((String)localObject1))
    {
      paramabh = new Intent();
      paramabh.putExtra("sns_landing_pages_xml", (String)localObject1);
      paramabh.putExtra("sns_landig_pages_from_source", 7);
      paramabh.putExtra("sns_landing_pages_share_thumb_url", I(paramg));
      paramabh.putExtra("sns_landing_favid", r.Yz() + "_" + paramg.field_id);
      paramabh.addFlags(268435456);
      com.tencent.mm.bp.d.b(paramContext, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", paramabh);
      AppMethodBeat.o(20514);
    }
    while (true)
    {
      return;
      abl localabl = paramg.field_favProto.wit;
      Object localObject2 = "";
      localObject1 = "";
      Object localObject3 = "";
      if (paramg.field_favProto.whA != null)
      {
        localObject3 = paramg.field_favProto.whA;
        localObject2 = ((abu)localObject3).wiY;
        localObject1 = ((abu)localObject3).title;
        localObject3 = ((abu)localObject3).desc;
      }
      Object localObject4 = localObject2;
      if (localabl != null)
      {
        localObject4 = localObject2;
        if (bo.isNullOrNil((String)localObject2))
          localObject4 = localabl.link;
      }
      if (bo.isNullOrNil((String)localObject4))
      {
        AppMethodBeat.o(20514);
      }
      else
      {
        aar localaar = com.tencent.mm.plugin.fav.a.b.c(paramg);
        Object localObject5 = localObject1;
        Object localObject6 = localObject3;
        if (localaar != null)
        {
          localObject2 = localObject1;
          if (bo.isNullOrNil((String)localObject1))
            localObject2 = localaar.title;
          localObject5 = localObject2;
          localObject6 = localObject3;
          if (bo.isNullOrNil((String)localObject3))
          {
            localObject6 = localaar.desc;
            localObject5 = localObject2;
          }
        }
        ab.d("MicroMsg.FavItemLogic", "start web view, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId) });
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", (String)localObject4);
        ((Intent)localObject1).putExtra("showShare", paramBoolean);
        ((Intent)localObject1).putExtra("is_favorite_item", true);
        ((Intent)localObject1).putExtra("fav_local_id", paramg.field_localId);
        ((Intent)localObject1).putExtra("favorite_control_argument", paramg.buv());
        ((Intent)localObject1).putExtra("sentUsername", paramg.field_fromUser);
        if ((localabl != null) && (!bo.isNullOrNil(localabl.csl)))
          ((Intent)localObject1).putExtra("srcDisplayname", s.mJ(localabl.csl));
        ((Intent)localObject1).putExtra("mode", 1);
        ((Intent)localObject1).putExtra("geta8key_scene", 14);
        localObject3 = new Bundle();
        ((Bundle)localObject3).putString("key_snsad_statextstr", com.tencent.mm.plugin.fav.a.b.c(paramg).cMn);
        ((Bundle)localObject3).putLong("favlocalid", paramg.field_localId);
        ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject3);
        ((Intent)localObject1).putExtra("from_scence", 4);
        localObject3 = "fav_" + r.Yz() + "_" + paramg.field_id;
        ((Intent)localObject1).putExtra("KPublisherId", (String)localObject3);
        ((Intent)localObject1).putExtra("pre_username", paramg.field_fromUser);
        ((Intent)localObject1).putExtra("prePublishId", (String)localObject3);
        ((Intent)localObject1).putExtra("preChatTYPE", 14);
        ((Intent)localObject1).putExtra("share_report_pre_msg_url", (String)localObject4);
        ((Intent)localObject1).putExtra("share_report_pre_msg_title", localObject5);
        ((Intent)localObject1).putExtra("share_report_pre_msg_desc", (String)localObject6);
        ((Intent)localObject1).putExtra("share_report_pre_msg_icon_url", I(paramg));
        ((Intent)localObject1).putExtra("share_report_pre_msg_appid", "");
        ((Intent)localObject1).putExtra("share_report_from_scene", 4);
        localObject3 = com.tencent.mm.modelstat.a.c.tL(com.tencent.mm.pluginsdk.model.d.class.getName());
        ((Bundle)localObject3).putInt("mm_rpt_fav_id", paramg.field_id);
        ((Bundle)localObject3).putInt("key_detail_fav_scene", paramabh.scene);
        ((Bundle)localObject3).putInt("key_detail_fav_sub_scene", paramabh.jSW);
        ((Bundle)localObject3).putInt("key_detail_fav_index", paramabh.index);
        ((Bundle)localObject3).putString("key_detail_fav_query", paramabh.query);
        ((Bundle)localObject3).putString("key_detail_fav_sessionid", paramabh.cvF);
        ((Bundle)localObject3).putString("key_detail_fav_tags", paramabh.mfg);
        i.el("WebViewUI", paramabh.cvF);
        ((Intent)localObject1).putExtra("mm_report_bundle", (Bundle)localObject3);
        ((Intent)localObject1).putExtra("geta8key_scene", 14);
        com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        AppMethodBeat.o(20514);
      }
    }
  }

  private static void e(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, abh paramabh)
  {
    AppMethodBeat.i(20518);
    Intent localIntent = new Intent();
    a(paramg, paramabh, localIntent);
    i.el("FavoriteImgDetailUI", paramabh.cvF);
    com.tencent.mm.plugin.fav.a.b.b(paramContext, ".ui.detail.FavoriteImgDetailUI", localIntent);
    AppMethodBeat.o(20518);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.favorite.d
 * JD-Core Version:    0.6.2
 */