package com.tencent.mm.plugin.fav.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.a;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.a;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.al;
import com.tencent.mm.plugin.fav.a.ao;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.plugin.fav.a.n;
import com.tencent.mm.plugin.fav.a.o;
import com.tencent.mm.plugin.fav.a.r;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aax;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abi;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abs;
import com.tencent.mm.protocal.protobuf.acb;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class m extends c<gh>
{
  public m()
  {
    AppMethodBeat.i(74284);
    this.xxI = gh.class.getName().hashCode();
    AppMethodBeat.o(74284);
  }

  private static boolean d(gh paramgh)
  {
    AppMethodBeat.i(74285);
    switch (paramgh.cAH.type)
    {
    case 3:
    case 5:
    case 29:
    default:
    case 4:
    case 2:
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
    }
    while (true)
    {
      AppMethodBeat.o(74285);
      return false;
      Object localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
      if ((localObject1 != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_tagProto.wiJ != null))
      {
        paramgh.cAI.bka = new ArrayList();
        paramgh.cAI.bka.addAll(((com.tencent.mm.plugin.fav.a.g)localObject1).field_tagProto.wiJ);
        continue;
        if (paramgh.cAH.cAJ != null)
        {
          localObject1 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.b(paramgh.cAH.cAJ));
          if (((com.tencent.mm.vfs.b)localObject1).exists())
            paramgh.cAI.path = com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject1).dMD());
          localObject1 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c(paramgh.cAH.cAJ));
          if (((com.tencent.mm.vfs.b)localObject1).exists())
          {
            paramgh.cAI.thumbPath = com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject1).dMD());
            continue;
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().c(paramgh.cAH.cAL);
            paramgh.cAI.ret = 0;
            continue;
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().d(paramgh.cAH.cAL);
            paramgh.cAI.ret = 0;
            continue;
            paramgh.cAI.cAU = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().buR();
            paramgh.cAI.ret = 0;
            continue;
            localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
            paramgh.cAI.cAT = com.tencent.mm.plugin.fav.a.b.a(((com.tencent.mm.plugin.fav.a.g)localObject1).field_type, ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto, ((com.tencent.mm.plugin.fav.a.g)localObject1).field_tagProto);
            paramgh.cAI.ret = 0;
            continue;
            localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
            ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramgh.cAH.context, (com.tencent.mm.plugin.fav.a.g)localObject1, paramgh.cAH.cAS);
            paramgh.cAI.ret = 0;
            continue;
            localObject1 = com.tencent.mm.plugin.fav.a.b.a(((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv), paramgh.cAH.handler);
            paramgh.cAI.thumbPath = localObject1[0];
            paramgh.cAI.thumbUrl = localObject1[1];
            paramgh.cAI.ret = 0;
            continue;
            com.tencent.mm.plugin.fav.a.b.a(paramgh.cAH.cvv, paramgh.cAH.cAM);
            continue;
            Object localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
            com.tencent.mm.plugin.fav.a.b.q((com.tencent.mm.plugin.fav.a.g)localObject2);
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = localObject2;
              if (paramgh.cAH.cvC != null)
                localObject1 = com.tencent.mm.plugin.fav.a.b.a(paramgh.cAH.cvC);
            }
            i.a(paramgh.cAH.context, paramgh.cAH.toUser, paramgh.cAH.cAN, (com.tencent.mm.plugin.fav.a.g)localObject1, paramgh.cAH.cAM);
            continue;
            if (com.tencent.mm.plugin.fav.a.b.f(paramgh.cAH.cAJ))
            {
              paramgh.cAI.ret = 1;
            }
            else
            {
              paramgh.cAI.ret = 0;
              continue;
              com.tencent.mm.plugin.fav.a.b.l(((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv));
              continue;
              com.tencent.mm.plugin.fav.a.b.m(((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv));
              continue;
              paramgh.cAI.ret = com.tencent.mm.plugin.fav.a.b.LE(paramgh.cAH.cAJ.wgo);
              continue;
              localObject1 = new ArrayList();
              ((List)localObject1).add(Integer.valueOf(7));
              localObject2 = com.tencent.mm.plugin.fav.a.b.a(null, null, (List)localObject1, null, null, null);
              localObject1 = new ArrayList();
              Object localObject4 = ((List)localObject2).iterator();
              Object localObject5;
              Object localObject6;
              while (((Iterator)localObject4).hasNext())
              {
                localObject5 = (com.tencent.mm.plugin.fav.a.g)((Iterator)localObject4).next();
                localObject2 = ((com.tencent.mm.plugin.fav.a.g)localObject5).field_favProto.wit;
                if (((com.tencent.mm.plugin.fav.a.g)localObject5).field_type == 7)
                {
                  localObject5 = com.tencent.mm.plugin.fav.a.b.c((com.tencent.mm.plugin.fav.a.g)localObject5);
                  localObject6 = k((aar)localObject5);
                  ((List)localObject1).add(com.tencent.mm.aw.f.a(6, null, ((aar)localObject5).title, ((aar)localObject5).desc, ((aar)localObject5).wgg, ((aar)localObject5).wgk, ((aar)localObject5).wgi, ((aar)localObject5).mnd, com.tencent.mm.plugin.fav.a.b.bul(), (String)localObject6, "", ((abl)localObject2).appId));
                }
                else if ((((com.tencent.mm.plugin.fav.a.g)localObject5).field_type == 14) && (((com.tencent.mm.plugin.fav.a.g)localObject5).field_favProto.wiv != null))
                {
                  localObject5 = ((com.tencent.mm.plugin.fav.a.g)localObject5).field_favProto.wiv.iterator();
                  while (((Iterator)localObject5).hasNext())
                  {
                    aar localaar = (aar)((Iterator)localObject5).next();
                    if (localaar.dataType == 7)
                    {
                      localObject6 = k(localaar);
                      ((List)localObject1).add(com.tencent.mm.aw.f.a(6, null, localaar.title, localaar.desc, localaar.wgg, localaar.wgk, localaar.wgi, localaar.mnd, com.tencent.mm.plugin.fav.a.b.bul(), (String)localObject6, "", ((abl)localObject2).appId));
                    }
                  }
                }
              }
              paramgh.cAI.cAV = ((List)localObject1);
              continue;
              if (paramgh.cAH.cvv == -1L)
              {
                h.a(paramgh.cAH.title, paramgh.cAH.cvC.wiv, -1L);
              }
              else if (paramgh.cAH.cAO == -1)
              {
                localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
                if ((localObject1 != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.wiv.size() > 1))
                {
                  localObject1 = (aar)((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.wiv.get(0);
                  paramgh.cAI.cAY = bo.isNullOrNil(((aar)localObject1).wfZ);
                }
              }
              else if ((paramgh.cAH.cAO == -3) && (paramgh.cAH.cvv > 0L))
              {
                localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
                if (localObject1 != null)
                {
                  ((com.tencent.mm.plugin.fav.a.g)localObject1).field_itemStatus = paramgh.cAH.cAK.getIntExtra("fav_note_item_status", ((com.tencent.mm.plugin.fav.a.g)localObject1).field_itemStatus);
                  ((com.tencent.mm.plugin.fav.a.g)localObject1).field_updateTime = paramgh.cAH.cAK.getLongExtra("fav_note_item_updatetime", ((com.tencent.mm.plugin.fav.a.g)localObject1).field_updateTime);
                  ((com.tencent.mm.plugin.fav.a.g)localObject1).LH(paramgh.cAH.cAK.getStringExtra("fav_note_xml"));
                  ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a((com.tencent.mm.plugin.fav.a.g)localObject1, new String[] { "localId" });
                }
              }
              else if ((paramgh.cAH.cAO == -2) && (paramgh.cAH.cvv > 0L))
              {
                localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
                if ((localObject1 != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_itemStatus == 10) && (!bo.isNullOrNil(((com.tencent.mm.plugin.fav.a.g)localObject1).field_xml)))
                {
                  ((com.tencent.mm.plugin.fav.a.g)localObject1).LH(((com.tencent.mm.plugin.fav.a.g)localObject1).field_xml);
                  if ((((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.wiv.size() > 1))
                  {
                    localObject2 = (aar)((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.wiv.get(0);
                    if ((!bo.isNullOrNil(((aar)localObject2).wfZ)) && (!bo.isNullOrNil(((aar)localObject2).wgb)))
                      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a((com.tencent.mm.plugin.fav.a.g)localObject1, new String[] { "localId" });
                  }
                }
              }
              else
              {
                localObject1 = new Intent();
                if ((paramgh.cAH.cvv > 0L) && (!bo.isNullOrNil(paramgh.cAH.desc)) && (paramgh.cAH.cAO > 0))
                {
                  localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
                  if (localObject2 != null)
                  {
                    ((Intent)localObject1).putExtra("fav_note_xml", com.tencent.mm.plugin.fav.a.g.s((com.tencent.mm.plugin.fav.a.g)localObject2));
                    ((Intent)localObject1).putExtra("fav_note_item_updatetime", ((com.tencent.mm.plugin.fav.a.g)localObject2).field_updateTime);
                  }
                }
                localObject2 = h.a(paramgh.cAH.cvC.wiv, paramgh.cAH.cvv);
                if (!bo.isNullOrNil(paramgh.cAH.desc))
                {
                  if (paramgh.cAH.cAO > 0)
                  {
                    ((Intent)localObject1).putExtra("fav_note_item_status", ((com.tencent.mm.plugin.fav.a.g)localObject2).field_itemStatus);
                    paramgh.cAH.cAK = ((Intent)localObject1);
                    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.LM(((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version + 1);
                  }
                  ((com.tencent.mm.plugin.fav.a.g)localObject2).field_itemStatus = 1;
                  com.tencent.mm.plugin.fav.a.b.q((com.tencent.mm.plugin.fav.a.g)localObject2);
                  ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a((com.tencent.mm.plugin.fav.a.g)localObject2, new String[] { "localId" });
                  if (paramgh.cAH.desc.equals("fav_add_new_note"))
                  {
                    if (((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version != 0)
                      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.LM(((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version + 1);
                    while (true)
                    {
                      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a((com.tencent.mm.plugin.fav.a.g)localObject2, new String[] { "localId" });
                      h.a(paramgh.cAH.title, paramgh.cAH.cvC.wiv, paramgh.cAH.cvv);
                      break;
                      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.LM(((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version + 2);
                    }
                  }
                }
                else
                {
                  if (((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version != 0)
                    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.LM(((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version + 1);
                  while (true)
                  {
                    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_itemStatus = 1;
                    com.tencent.mm.plugin.fav.a.b.q((com.tencent.mm.plugin.fav.a.g)localObject2);
                    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a((com.tencent.mm.plugin.fav.a.g)localObject2, new String[] { "localId" });
                    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getCheckCdnService().run();
                    break;
                    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.LM(((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.version + 2);
                  }
                  ao.bvo().bvp();
                  localObject1 = ao.bvo();
                  localObject2 = paramgh.cAH.title;
                  int i = paramgh.cAH.cAO;
                  int j = paramgh.cAH.cAP;
                  ((ao)localObject1).path = bo.bc((String)localObject2, "");
                  ((ao)localObject1).cAO = i;
                  ((ao)localObject1).duration = j;
                  continue;
                  paramgh.cAI.path = j.B(paramgh.cAH.context, paramgh.cAH.cAP).toString();
                  continue;
                  ao.bvo();
                  ao.bvq().destroy();
                  continue;
                  ao.bvo();
                  ao.bvq().buJ();
                  continue;
                  localObject1 = paramgh.cAI;
                  ao.bvo();
                  ((gh.b)localObject1).cAW = ao.bvq().T(paramgh.cAH.path, paramgh.cAH.cAO, paramgh.cAH.cAP);
                  continue;
                  ao.bvo();
                  ao.bvq().stopPlay();
                  continue;
                  localObject1 = paramgh.cAI;
                  ao.bvo();
                  ((gh.b)localObject1).path = ao.bvq().path;
                  localObject1 = paramgh.cAI;
                  ao.bvo();
                  ((gh.b)localObject1).cAW = ao.bvq().buH();
                  localObject1 = paramgh.cAI;
                  ao.bvo();
                  ((gh.b)localObject1).cAX = ao.bvq().buI();
                  localObject2 = paramgh.cAI;
                  ao.bvo();
                  localObject1 = ao.bvq();
                  boolean bool;
                  if (((n)localObject1).mfO == null)
                  {
                    ab.w("MicroMsg.FavVoiceLogic", "check is pause, but player is null");
                    bool = false;
                    label2355: ((gh.b)localObject2).cAY = bool;
                    paramgh = paramgh.cAI;
                    ao.bvo();
                    localObject1 = ao.bvq();
                    if (((n)localObject1).mfO != null)
                      break label2416;
                    ab.w("MicroMsg.FavVoiceLogic", "get now progress error, player is null");
                  }
                  label2416: for (double d = 0.0D; ; d = ((n)localObject1).mfO.Ez())
                  {
                    paramgh.cAZ = d;
                    break;
                    bool = ((n)localObject1).mfO.DA();
                    break label2355;
                  }
                  if (paramgh.cAH.cAJ != null)
                  {
                    localObject1 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.b(paramgh.cAH.cAJ));
                    paramgh.cAI.path = com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject1).dMD());
                    localObject1 = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c(paramgh.cAH.cAJ));
                    paramgh.cAI.thumbPath = com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject1).dMD());
                    continue;
                    localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
                    if (localObject1 == null)
                    {
                      com.tencent.mm.plugin.fav.a.b.b(paramgh.cAH.cAJ, paramgh.cAH.cAO, paramgh.cAH.cvv);
                      com.tencent.mm.plugin.fav.a.b.a(paramgh.cAH.cAJ, paramgh.cAH.cAO, paramgh.cAH.cvv);
                    }
                    else if (bo.isNullOrNil(paramgh.cAH.path))
                    {
                      com.tencent.mm.plugin.fav.a.b.a((com.tencent.mm.plugin.fav.a.g)localObject1, paramgh.cAH.cAJ, true);
                    }
                    else
                    {
                      com.tencent.mm.plugin.fav.a.b.a((com.tencent.mm.plugin.fav.a.g)localObject1, paramgh.cAH.cAJ);
                      continue;
                      com.tencent.mm.plugin.fav.a.b.c(paramgh);
                      continue;
                      localObject1 = (al)paramgh.cAH.cwn;
                      paramgh.cAI.path = ((al)localObject1).mgu;
                      if ((((com.tencent.mm.ai.m)localObject1).ftl != null) && (((com.tencent.mm.ai.m)localObject1).ftl.ZS() != null) && (((com.tencent.mm.ai.m)localObject1).ftl.ZS().vyl == -435))
                      {
                        paramgh = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iF(((al)localObject1).mgq);
                        if ((paramgh != null) && (paramgh.field_favProto != null) && (paramgh.field_favProto.wiv != null))
                        {
                          paramgh.field_favProto.LM(paramgh.field_favProto.version + 2);
                          paramgh.field_itemStatus = 1;
                          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramgh, new String[] { "localId" });
                          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getCheckCdnService().run();
                          continue;
                          localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
                          localObject1 = localObject2;
                          if (localObject2 == null)
                          {
                            localObject1 = localObject2;
                            if (paramgh.cAH.cvC != null)
                              localObject1 = com.tencent.mm.plugin.fav.a.b.a(paramgh.cAH.cvC);
                          }
                          localObject4 = new k();
                          localObject2 = paramgh.cAI;
                          if ((!((k)localObject4).t((com.tencent.mm.plugin.fav.a.g)localObject1)) || (com.tencent.mm.plugin.fav.a.b.g((com.tencent.mm.plugin.fav.a.g)localObject1)));
                          for (j = 0; ; j = 1)
                          {
                            ((gh.b)localObject2).ret = j;
                            paramgh.cAI.cAY = k.u((com.tencent.mm.plugin.fav.a.g)localObject1);
                            paramgh.cAI.path = "";
                            if (localObject1 != null)
                              break;
                            paramgh.cAI.cAY = true;
                            paramgh.cAI.path = null;
                            break;
                          }
                          localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
                          if (localObject1 != null)
                          {
                            ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.aE(paramgh.cAH.cvC.wiv);
                            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().b((com.tencent.mm.plugin.fav.a.g)localObject1, new String[] { "localId" });
                            continue;
                            localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
                            if ((localObject1 != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_type == 18))
                            {
                              paramgh.cAH.cvC = ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto;
                              continue;
                              com.tencent.mm.plugin.fav.a.b.bug();
                              continue;
                              paramgh = paramgh.cAI;
                              if (com.tencent.mm.plugin.fav.a.b.bup());
                              for (j = 1; ; j = 0)
                              {
                                paramgh.ret = j;
                                break;
                              }
                              com.tencent.mm.plugin.fav.a.b.e(paramgh.cAH.context, paramgh.cAH.desc, paramgh.cAH.title, paramgh.cAH.path);
                              continue;
                              ab.i("MicroMsg.Fav.FavoriteOperationListener", "TYPE_NEW_XML_UPLOAD_FAV_ITEM %s", new Object[] { paramgh.cAH.cAQ });
                              if (!bo.isNullOrNil(paramgh.cAH.cAQ))
                              {
                                paramgh = paramgh.cAH.cAQ.split(";");
                                localObject1 = new LinkedList();
                                ((List)localObject1).addAll(Arrays.asList(paramgh));
                                if (((List)localObject1).size() > 0)
                                {
                                  paramgh = new ArrayList();
                                  localObject1 = ((List)localObject1).iterator();
                                  while (((Iterator)localObject1).hasNext())
                                  {
                                    localObject2 = (String)((Iterator)localObject1).next();
                                    try
                                    {
                                      j = Integer.valueOf((String)localObject2).intValue();
                                      if (j > 0)
                                      {
                                        localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iF(j);
                                        localObject4 = new com/tencent/mm/protocal/protobuf/aax;
                                        ((aax)localObject4).<init>();
                                        ((aax)localObject4).vEp = j;
                                        if ((localObject2 != null) && (!bo.isNullOrNil(((com.tencent.mm.plugin.fav.a.g)localObject2).field_xml)))
                                          ((aax)localObject4).vEv = ((com.tencent.mm.plugin.fav.a.g)localObject2).field_xml;
                                        paramgh.add(localObject4);
                                      }
                                    }
                                    catch (Exception localException1)
                                    {
                                    }
                                  }
                                  ((ae)com.tencent.mm.kernel.g.M(ae.class)).checkFavItem(paramgh);
                                  ab.i("MicroMsg.Fav.FavoriteOperationListener", "do scene NetSceneCheckFavItem");
                                  continue;
                                  Object localObject3;
                                  try
                                  {
                                    ab.i("MicroMsg.Fav.FavoriteOperationListener", "TYPE_NEW_XML_RESEND_FAV_ITEM %s %s", new Object[] { paramgh.cAH.cAQ, paramgh.cAH.cAR });
                                    j = bo.getInt(paramgh.cAH.cAQ, -1);
                                    paramgh = bo.P(paramgh.cAH.cAR.split(";"));
                                    localObject3 = new java/util/HashSet;
                                    ((HashSet)localObject3).<init>();
                                    ((HashSet)localObject3).addAll(paramgh);
                                    paramgh = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iF(j);
                                    if (paramgh != null)
                                      break label3534;
                                    ab.i("MicroMsg.Fav.FavoriteOperationListener", "NotFound %d", new Object[] { Integer.valueOf(j) });
                                    com.tencent.mm.plugin.fav.a.h.vv(8);
                                  }
                                  catch (Exception paramgh)
                                  {
                                    ab.printErrStackTrace("MicroMsg.Fav.FavoriteOperationListener", paramgh, "TYPE_NEW_XML_RESEND_FAV_ITEM", new Object[0]);
                                  }
                                  continue;
                                  label3534: localObject1 = new com/tencent/mm/protocal/protobuf/abi;
                                  ((abi)localObject1).<init>();
                                  ((abi)localObject1).vEp = j;
                                  localObject4 = paramgh.field_favProto.wiv.iterator();
                                  j = 0;
                                  while (((Iterator)localObject4).hasNext())
                                  {
                                    localObject5 = (aar)((Iterator)localObject4).next();
                                    localObject6 = new java/lang/StringBuilder;
                                    ((StringBuilder)localObject6).<init>();
                                    i = j;
                                    if (((HashSet)localObject3).remove(((aar)localObject5).mnd + "#0"))
                                    {
                                      if (bo.isNullOrNil(((aar)localObject5).wgb))
                                      {
                                        com.tencent.mm.al.f.afy();
                                        ((aar)localObject5).akM(a.afp());
                                        com.tencent.mm.plugin.fav.a.h.vv(2);
                                      }
                                      if (!e.ct(com.tencent.mm.plugin.fav.a.b.b((aar)localObject5)))
                                        break label3788;
                                      ((aar)localObject5).LH(1);
                                      com.tencent.mm.plugin.fav.a.b.a((aar)localObject5, paramgh, 0, false);
                                      com.tencent.mm.plugin.fav.a.h.vv(3);
                                    }
                                    for (i = 1; ; i = j)
                                    {
                                      localObject6 = new java/lang/StringBuilder;
                                      ((StringBuilder)localObject6).<init>();
                                      j = i;
                                      if (!((HashSet)localObject3).remove(((aar)localObject5).mnd + "#1"))
                                        break;
                                      if (bo.isNullOrNil(((aar)localObject5).wgb))
                                      {
                                        com.tencent.mm.al.f.afy();
                                        ((aar)localObject5).akM(a.afp());
                                        com.tencent.mm.plugin.fav.a.h.vv(2);
                                      }
                                      if (!e.ct(com.tencent.mm.plugin.fav.a.b.c((aar)localObject5)))
                                        break label3841;
                                      ((aar)localObject5).LH(-1);
                                      com.tencent.mm.plugin.fav.a.b.a((aar)localObject5, paramgh, 0);
                                      com.tencent.mm.plugin.fav.a.h.vv(3);
                                      j = 1;
                                      break;
                                      label3788: com.tencent.mm.plugin.fav.a.h.vv(5);
                                      localObject6 = new com/tencent/mm/protocal/protobuf/acb;
                                      ((acb)localObject6).<init>();
                                      ((acb)localObject6).vXB = ((aar)localObject5).mnd;
                                      ((acb)localObject6).vXH = 0;
                                      ((acb)localObject6).jBT = 4;
                                      ((abi)localObject1).wiy.add(localObject6);
                                    }
                                    label3841: com.tencent.mm.plugin.fav.a.h.vv(5);
                                    localObject6 = new com/tencent/mm/protocal/protobuf/acb;
                                    ((acb)localObject6).<init>();
                                    ((acb)localObject6).vXB = ((aar)localObject5).mnd;
                                    ((acb)localObject6).vXH = 1;
                                    ((acb)localObject6).jBT = 4;
                                    ((abi)localObject1).wiy.add(localObject6);
                                    j = i;
                                  }
                                  if (((HashSet)localObject3).size() > 0)
                                  {
                                    ab.i("MicroMsg.Fav.FavoriteOperationListener", "not found url data item %s", new Object[] { ((HashSet)localObject3).toString() });
                                    com.tencent.mm.plugin.fav.a.h.vw(((HashSet)localObject3).size());
                                    localObject3 = ((HashSet)localObject3).iterator();
                                    while (((Iterator)localObject3).hasNext())
                                    {
                                      localObject4 = (String)((Iterator)localObject3).next();
                                      try
                                      {
                                        localObject5 = ((String)localObject4).split("#");
                                        localObject4 = new com/tencent/mm/protocal/protobuf/acb;
                                        ((acb)localObject4).<init>();
                                        ((acb)localObject4).vXB = localObject5[0];
                                        ((acb)localObject4).vXH = Integer.valueOf(localObject5[1]).intValue();
                                        ((acb)localObject4).jBT = 3;
                                        ((abi)localObject1).wiy.add(localObject4);
                                      }
                                      catch (Exception localException2)
                                      {
                                      }
                                    }
                                  }
                                  if (((abi)localObject1).wiy.size() > 0)
                                    ((ae)com.tencent.mm.kernel.g.M(ae.class)).checkFavItem((abi)localObject1);
                                  if (j != 0)
                                  {
                                    if (paramgh.field_type == 18)
                                      paramgh.field_favProto.LM(paramgh.field_favProto.version + 1);
                                    paramgh.field_itemStatus = 15;
                                    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramgh, new String[] { "localId" });
                                    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
                                    com.tencent.mm.plugin.fav.a.h.vv(6);
                                  }
                                  else
                                  {
                                    com.tencent.mm.plugin.fav.a.h.vv(7);
                                    ab.i("MicroMsg.Fav.FavoriteOperationListener", "do not has upload data item");
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  private static String k(aar paramaar)
  {
    AppMethodBeat.i(74286);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c(paramaar));
    if (!localb.exists())
      if (paramaar.cvq == null)
        paramaar = "";
    while (true)
    {
      AppMethodBeat.o(74286);
      return paramaar;
      paramaar = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.bue() + com.tencent.mm.a.g.x(paramaar.cvq.getBytes()));
      if (paramaar.exists())
      {
        paramaar = com.tencent.mm.vfs.j.w(paramaar.dMD());
      }
      else
      {
        paramaar = "";
        continue;
        paramaar = com.tencent.mm.vfs.j.w(localb.dMD());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.m
 * JD-Core Version:    0.6.2
 */