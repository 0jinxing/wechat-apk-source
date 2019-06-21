package com.tencent.mm.plugin.card.sharecard.a;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.c;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.sharecard.model.i;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.card.sharecard.model.m;
import com.tencent.mm.plugin.card.sharecard.model.p;
import com.tencent.mm.plugin.card.sharecard.model.r;
import com.tencent.mm.plugin.card.sharecard.ui.b.a;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class b
{
  private static boolean fpA = false;
  public static boolean kft = false;
  public b.a kfs = null;
  private Context mContext;

  public b(Context paramContext)
  {
    this.mContext = paramContext;
    kft = false;
  }

  public static void GA(String paramString)
  {
    AppMethodBeat.i(87992);
    ab.i("MicroMsg.ShareCardDataMgr", "updateShareUserInfo()");
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.ShareCardDataMgr", "updateShareUserInfo(), card_tp_id is empty");
      AppMethodBeat.o(87992);
    }
    while (true)
    {
      return;
      d.post(new b.1(paramString, new ak(Looper.getMainLooper())), "updateShareUserInfo_thread");
      AppMethodBeat.o(87992);
    }
  }

  public static String GB(String paramString)
  {
    AppMethodBeat.i(88000);
    Map localMap = (Map)am.bbb().getValue("key_share_card_annoucement_map");
    if (localMap == null)
    {
      paramString = "";
      AppMethodBeat.o(88000);
    }
    while (true)
    {
      return paramString;
      paramString = (String)localMap.get(paramString);
      AppMethodBeat.o(88000);
    }
  }

  public static int GC(String paramString)
  {
    AppMethodBeat.i(88001);
    Map localMap = (Map)am.bbb().getValue("key_share_card_count_map");
    int i;
    if (localMap == null)
    {
      AppMethodBeat.o(88001);
      i = 0;
    }
    while (true)
    {
      return i;
      paramString = (Integer)localMap.get(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(88001);
        i = 0;
      }
      else
      {
        i = paramString.intValue();
        AppMethodBeat.o(88001);
      }
    }
  }

  public static ArrayList<r> GD(String paramString)
  {
    AppMethodBeat.i(88003);
    Map localMap = (Map)am.bbb().getValue("key_share_user_info_map");
    Object localObject = localMap;
    if (localMap == null)
      localObject = new HashMap();
    paramString = (ArrayList)((Map)localObject).get(paramString);
    if (paramString == null)
    {
      paramString = new ArrayList();
      AppMethodBeat.o(88003);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(88003);
    }
  }

  public static boolean GE(String paramString)
  {
    AppMethodBeat.i(88008);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(88008);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject1 = (ArrayList)am.bbb().getValue("key_share_card_other_city_top_info_list");
      Object localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = new ArrayList();
      localObject2 = ((ArrayList)localObject2).iterator();
      while (true)
        if (((Iterator)localObject2).hasNext())
        {
          localObject1 = (p)((Iterator)localObject2).next();
          if ((localObject1 != null) && (paramString.equals(((p)localObject1).kbU)) && (((p)localObject1).top == 1))
          {
            AppMethodBeat.o(88008);
            bool = true;
            break;
          }
        }
      AppMethodBeat.o(88008);
      bool = false;
    }
  }

  public static void GF(String paramString)
  {
    AppMethodBeat.i(88009);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(88009);
      return;
    }
    ArrayList localArrayList = (ArrayList)am.bbb().getValue("key_share_card_other_city_top_info_list");
    if (localArrayList == null)
      localArrayList = new ArrayList();
    while (true)
    {
      for (int i = 0; ; i++)
      {
        if (i >= localArrayList.size())
          break label119;
        p localp = (p)localArrayList.get(i);
        if ((localp != null) && (paramString.equals(localp.kbU)) && (localp.top == 1))
        {
          localp.kfS = true;
          localArrayList.set(i, localp);
          am.bbb().putValue("key_share_card_other_city_top_info_list", localArrayList);
          AppMethodBeat.o(88009);
          break;
        }
      }
      label119: AppMethodBeat.o(88009);
      break;
    }
  }

  private static void H(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(88004);
    Object localObject = (Map)am.bbb().getValue("key_share_user_info_map");
    if (localObject == null)
      localObject = new HashMap();
    while (true)
    {
      ArrayList localArrayList = (ArrayList)((Map)localObject).get(paramString2);
      if (localArrayList == null)
        localArrayList = new ArrayList();
      while (true)
      {
        for (int i = 0; i < localArrayList.size(); i++)
        {
          r localr = (r)localArrayList.get(i);
          if ((paramString3 != null) && (paramString3.equals(localr.kfT)))
          {
            localr.kfW = false;
            localr.kfU -= 1;
            localr.kfV.remove(paramString1);
            localArrayList.set(i, localr);
          }
        }
        ((Map)localObject).put(paramString2, localArrayList);
        am.bbb().putValue("key_share_user_info_map", localObject);
        AppMethodBeat.o(88004);
        return;
      }
    }
  }

  private static String a(Context paramContext, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(87991);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      ab.e("MicroMsg.ShareCardDataMgr", "getShareUserName， username_list == null || username_list.size() == 0");
      paramContext = "";
      AppMethodBeat.o(87991);
    }
    while (true)
    {
      return paramContext;
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      if ((i < paramArrayList.size()) && (i < 2))
      {
        if (i != 0)
          localStringBuilder.append("、");
        String str1 = com.tencent.mm.model.s.mK((String)paramArrayList.get(i));
        String str2 = com.tencent.mm.model.s.mJ((String)paramArrayList.get(i));
        if (!TextUtils.isEmpty(str1))
          localStringBuilder.append(str1);
        while (true)
        {
          i++;
          break;
          localStringBuilder.append(str2);
        }
      }
      if (paramContext == null)
      {
        ab.e("MicroMsg.ShareCardDataMgr", "context == null");
        paramContext = "";
        AppMethodBeat.o(87991);
      }
      else if ((paramArrayList.size() == 1) || (paramArrayList.size() == 2))
      {
        paramContext = paramContext.getString(2131297979, new Object[] { localStringBuilder.toString() });
        AppMethodBeat.o(87991);
      }
      else
      {
        paramContext = paramContext.getString(2131297960, new Object[] { localStringBuilder.toString(), Integer.valueOf(paramArrayList.size()) });
        AppMethodBeat.o(87991);
      }
    }
  }

  public static void a(Context paramContext, com.tencent.mm.plugin.card.base.b paramb)
  {
    AppMethodBeat.i(88014);
    ab.i("MicroMsg.ShareCardDataMgr", "updateShareCardData()");
    ab.i("MicroMsg.ShareCardDataMgr", "card id:" + paramb.aZZ() + " cardtpid:" + paramb.baa());
    dn(paramb.aZZ(), paramb.baa());
    if (paramContext != null)
      ad(paramContext, paramb.baa());
    H(paramb.aZZ(), paramb.baa(), paramb.bab());
    GA(paramb.baa());
    AppMethodBeat.o(88014);
  }

  private static void a(com.tencent.mm.plugin.card.sharecard.model.l paraml1, com.tencent.mm.plugin.card.sharecard.model.l paraml2, boolean paramBoolean)
  {
    AppMethodBeat.i(87988);
    if ((paraml1 == null) && (paraml2 == null))
    {
      ab.e("MicroMsg.ShareCardDataMgr", "don't updateCategoryType(), newData == null && oldData == null");
      AppMethodBeat.o(87988);
    }
    while (true)
    {
      return;
      if ((paraml1 == null) || (paraml1.kfH != null) || (paraml1.kfG != null) || (paraml2 == null) || (paraml2.kfH != null) || (paraml2.kfG != null))
        break;
      ab.e("MicroMsg.ShareCardDataMgr", "don't updateCategoryType(), newData.local_city_list == null && oldData.local_city_list == null");
      AppMethodBeat.o(87988);
    }
    ab.i("MicroMsg.ShareCardDataMgr", "updateCategoryType()");
    Object localObject = (ArrayList)am.bbb().getValue("key_share_card_local_city_category_info_list");
    if (localObject == null)
      localObject = new ArrayList();
    while (true)
    {
      ArrayList localArrayList = (ArrayList)am.bbb().getValue("key_share_card_other_city_category_info_list");
      if (localArrayList == null)
        localArrayList = new ArrayList();
      while (true)
      {
        int i = 0;
        int j = 0;
        if (paramBoolean)
        {
          am.bbe().sU(10);
          ((ArrayList)localObject).clear();
          am.bbe().sU(0);
          localArrayList.clear();
          i = 0;
        }
        while (true)
        {
          long l1 = System.currentTimeMillis();
          long l2 = g.RP().eJN.iV(Thread.currentThread().getId());
          i locali;
          if ((paraml1 != null) && (paraml1.kfG != null) && (paraml1.kfG.size() > 0))
          {
            int k = 0;
            while (true)
              if (k < paraml1.kfG.size())
              {
                m localm = (m)paraml1.kfG.get(k);
                am.bbe().N(localm.kbU, 10, k + j);
                locali = new i();
                locali.kbU = localm.kbU;
                locali.kfC = (k + j);
                ((ArrayList)localObject).add(locali);
                k++;
                continue;
                j = i;
                if (paraml2 != null)
                {
                  j = i;
                  if (paraml2.kfG != null)
                  {
                    j = i;
                    if (paraml2.kfG.size() >= 0)
                      j = paraml2.kfG.size();
                  }
                }
                if ((paraml2 == null) || (paraml2.kfH == null) || (paraml2.kfH.size() < 0))
                  break label678;
                i = paraml2.kfH.size();
                break;
              }
            if ((!paramBoolean) && (paraml2 != null) && (paraml2.kfG != null))
              paraml1.kfG.addAll(paraml2.kfG);
          }
          while (true)
          {
            am.bbb().putValue("key_share_card_local_city_category_info_list", localObject);
            if ((paraml1 == null) || (paraml1.kfH == null) || (paraml1.kfH.size() <= 0))
              break label648;
            for (j = 0; j < paraml1.kfH.size(); j++)
            {
              localObject = (m)paraml1.kfH.get(j);
              am.bbe().N(((m)localObject).kbU, 0, j + i);
              locali = new i();
              locali.kbU = ((m)localObject).kbU;
              locali.kfC = (j + i);
              localArrayList.add(locali);
            }
            if ((paraml1 != null) && (!paramBoolean) && (paraml2 != null) && (paraml2.kfG != null))
              paraml1.kfG = paraml2.kfG;
          }
          if ((!paramBoolean) && (paraml2 != null) && (paraml2.kfH != null))
            paraml1.kfH.addAll(paraml2.kfH);
          while (true)
          {
            am.bbb().putValue("key_share_card_other_city_category_info_list", localArrayList);
            g.RP().eJN.mB(l2);
            ab.d("MicroMsg.ShareCardDataMgr", "updateCategoryType  >> updateCategoryInfo use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
            AppMethodBeat.o(87988);
            break;
            label648: if ((paraml1 != null) && (!paramBoolean) && (paraml2 != null) && (paraml2.kfH != null))
              paraml1.kfH = paraml2.kfH;
          }
          label678: i = 0;
        }
      }
    }
  }

  private void a(com.tencent.mm.plugin.card.sharecard.model.l paraml, boolean paramBoolean)
  {
    AppMethodBeat.i(87987);
    if (paraml == null)
    {
      ab.e("MicroMsg.ShareCardDataMgr", "don't parserShareCardListData, data is null");
      AppMethodBeat.o(87987);
      return;
    }
    ab.i("MicroMsg.ShareCardDataMgr", "parserShareCardListData()");
    Object localObject1 = (Map)am.bbb().getValue("key_share_card_annoucement_map");
    if (localObject1 == null)
      localObject1 = new HashMap();
    while (true)
    {
      Object localObject2 = (Map)am.bbb().getValue("key_share_card_count_map");
      if (localObject2 == null)
        localObject2 = new HashMap();
      while (true)
      {
        Object localObject3 = (Map)am.bbb().getValue("key_share_card_username_map");
        if (localObject3 == null)
          localObject3 = new HashMap();
        while (true)
        {
          ArrayList localArrayList1 = (ArrayList)am.bbb().getValue("key_share_card_local_city_ids");
          if (localArrayList1 == null)
            localArrayList1 = new ArrayList();
          while (true)
          {
            ArrayList localArrayList2 = (ArrayList)am.bbb().getValue("key_share_card_other_city_ids");
            if (localArrayList2 == null)
              localArrayList2 = new ArrayList();
            while (true)
            {
              ArrayList localArrayList3 = (ArrayList)am.bbb().getValue("key_share_card_other_city_top_info_list");
              if (localArrayList3 == null)
                localArrayList3 = new ArrayList();
              while (true)
              {
                if (paramBoolean)
                {
                  localArrayList1.clear();
                  localArrayList2.clear();
                  localArrayList3.clear();
                }
                ArrayList localArrayList4 = new ArrayList();
                int i;
                m localm;
                int j;
                Object localObject4;
                if ((paraml.kfG != null) && (paraml.kfG.size() > 0))
                {
                  i = 0;
                  if (i < paraml.kfG.size())
                  {
                    localm = (m)paraml.kfG.get(i);
                    if (!TextUtils.isEmpty(localm.kfO))
                      ((Map)localObject1).put(localm.kbU, localm.kfO);
                    j = am.bbe().GH(localm.kbU);
                    ((Map)localObject2).put(localm.kbU, Integer.valueOf(j));
                    ((Map)localObject3).put(localm.kbU, t(am.bbe().GG(localm.kbU)));
                    if (!localArrayList4.contains(localm.kbU))
                    {
                      localObject4 = am.bbe().GI(localm.kbU);
                      if ((TextUtils.isEmpty((CharSequence)localObject4)) || (localArrayList1.contains(localObject4)))
                        break label462;
                      localArrayList1.add(localObject4);
                    }
                    while (true)
                    {
                      localArrayList4.add(localm.kbU);
                      localObject4 = new p();
                      ((p)localObject4).kbU = localm.kbU;
                      ((p)localObject4).top = localm.top;
                      localArrayList3.add(localObject4);
                      i++;
                      break;
                      label462: if (!localArrayList1.contains(localm.cMC))
                        localArrayList1.add(localm.cMC);
                    }
                  }
                }
                localArrayList4.clear();
                if ((paraml.kfH != null) && (paraml.kfH.size() > 0))
                {
                  i = 0;
                  if (i < paraml.kfH.size())
                  {
                    localm = (m)paraml.kfH.get(i);
                    if (!TextUtils.isEmpty(localm.kfO))
                      ((Map)localObject1).put(localm.kbU, localm.kfO);
                    j = am.bbe().GH(localm.kbU);
                    ((Map)localObject2).put(localm.kbU, Integer.valueOf(j));
                    ((Map)localObject3).put(localm.kbU, t(am.bbe().GG(localm.kbU)));
                    if (!localArrayList4.contains(localm.kbU))
                    {
                      localObject4 = am.bbe().GI(localm.kbU);
                      if ((TextUtils.isEmpty((CharSequence)localObject4)) || (localArrayList2.contains(localObject4)))
                        break label733;
                      localArrayList2.add(localObject4);
                    }
                    while (true)
                    {
                      localArrayList4.add(localm.kbU);
                      localObject4 = new p();
                      ((p)localObject4).kbU = localm.kbU;
                      ((p)localObject4).top = localm.top;
                      localArrayList3.add(localObject4);
                      i++;
                      break;
                      label733: if (!localArrayList2.contains(localm.cMC))
                        localArrayList2.add(localm.cMC);
                    }
                  }
                }
                am.bbb().putValue("key_share_card_annoucement_map", localObject1);
                am.bbb().putValue("key_share_card_count_map", localObject2);
                am.bbb().putValue("key_share_card_username_map", localObject3);
                am.bbb().putValue("key_share_card_local_city", paraml.kfI);
                am.bbb().putValue("key_share_card_local_city_ids", localArrayList1);
                am.bbb().putValue("key_share_card_other_city_ids", localArrayList2);
                am.bbb().putValue("key_share_card_other_city_top_info_list", localArrayList3);
                AppMethodBeat.o(87987);
                break;
              }
            }
          }
        }
      }
    }
  }

  public static void ad(Context paramContext, String paramString)
  {
    AppMethodBeat.i(88006);
    ab.i("MicroMsg.ShareCardDataMgr", "updateCardCountbyCardTpId() card_tp_id:".concat(String.valueOf(paramString)));
    Object localObject1 = (Map)am.bbb().getValue("key_share_card_count_map");
    if (localObject1 == null)
      localObject1 = new HashMap();
    while (true)
    {
      Map localMap = (Map)am.bbb().getValue("key_share_card_username_map");
      Object localObject2 = localMap;
      if (localMap == null)
        localObject2 = new HashMap();
      ((Map)localObject1).put(paramString, Integer.valueOf(am.bbe().GH(paramString)));
      ((Map)localObject2).put(paramString, a(paramContext, am.bbe().GG(paramString)));
      am.bbb().putValue("key_share_card_count_map", localObject1);
      am.bbb().putValue("key_share_card_username_map", localObject2);
      AppMethodBeat.o(88006);
      return;
    }
  }

  public static boolean bbA()
  {
    AppMethodBeat.i(88013);
    Object localObject = (Integer)g.RP().Ry().get(ac.a.xKz, Integer.valueOf(0));
    boolean bool;
    if ((localObject != null) && (((Integer)localObject).intValue() == 1))
    {
      AppMethodBeat.o(88013);
      bool = false;
    }
    while (true)
    {
      return bool;
      g.RP().Ry().set(ac.a.xKz, Integer.valueOf(1));
      localObject = am.baW().a(n.a.kdK);
      if ((localObject != null) && (((Cursor)localObject).getCount() > 0))
      {
        ((Cursor)localObject).moveToFirst();
        if (!((Cursor)localObject).isAfterLast())
        {
          CardInfo localCardInfo = new CardInfo();
          localCardInfo.d((Cursor)localObject);
          if (localCardInfo.field_card_type == -1)
          {
            if (localCardInfo.aZV() != null)
              break label149;
            ab.e("MicroMsg.ShareCardDataMgr", "updateCardType fail , info.getCardTpInfo() == null");
          }
          while (true)
          {
            ((Cursor)localObject).moveToNext();
            break;
            label149: localCardInfo.field_card_type = localCardInfo.aZV().iAd;
            if (!am.baW().c(localCardInfo, new String[0]))
              ab.e("MicroMsg.ShareCardDataMgr", "updateCardType fail , cardId = %s", new Object[] { localCardInfo.field_card_id });
          }
        }
        ((Cursor)localObject).close();
        AppMethodBeat.o(88013);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.ShareCardDataMgr", "updateAllCardInfoByBlockField cursor is null or size is 0");
        AppMethodBeat.o(88013);
        bool = false;
      }
    }
  }

  public static int bbs()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(87985);
    Object localObject1 = am.baW();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(" where (status=0 OR status=5) AND card_type=10");
    localObject2 = "select count(*) from UserCardInfo" + ((StringBuilder)localObject2).toString();
    localObject1 = ((c)localObject1).bSd.a((String)localObject2, null, 2);
    if (localObject1 == null)
      AppMethodBeat.o(87985);
    while (true)
    {
      return j;
      j = i;
      if (((Cursor)localObject1).moveToFirst())
        j = ((Cursor)localObject1).getInt(0);
      ((Cursor)localObject1).close();
      AppMethodBeat.o(87985);
    }
  }

  public static void bbt()
  {
    AppMethodBeat.i(87989);
    long l1 = System.currentTimeMillis();
    long l2 = g.RP().eJN.iV(Thread.currentThread().getId());
    ab.i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory()");
    Object localObject = (ArrayList)am.bbb().getValue("key_share_card_local_city_category_info_list");
    if (localObject == null)
      localObject = new ArrayList();
    while (true)
    {
      ArrayList localArrayList = (ArrayList)am.bbb().getValue("key_share_card_other_city_category_info_list");
      if (localArrayList == null)
        localArrayList = new ArrayList();
      while (true)
      {
        for (int i = 0; i < ((ArrayList)localObject).size(); i++)
        {
          i locali = (i)((ArrayList)localObject).get(i);
          am.bbe().N(locali.kbU, 10, locali.kfC);
        }
        for (i = 0; i < localArrayList.size(); i++)
        {
          localObject = (i)localArrayList.get(i);
          am.bbe().N(((i)localObject).kbU, 0, ((i)localObject).kfC);
        }
        g.RP().eJN.mB(l2);
        ab.i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory  >> updateCategoryInfo use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        AppMethodBeat.o(87989);
        return;
      }
    }
  }

  public static int bbu()
  {
    AppMethodBeat.i(87997);
    int i;
    if (bbw())
    {
      i = 1;
      AppMethodBeat.o(87997);
    }
    while (true)
    {
      return i;
      if (bbv())
      {
        if (kft)
        {
          i = 3;
          AppMethodBeat.o(87997);
        }
        else
        {
          i = 4;
          AppMethodBeat.o(87997);
        }
      }
      else
      {
        i = 0;
        AppMethodBeat.o(87997);
      }
    }
  }

  public static boolean bbv()
  {
    AppMethodBeat.i(87998);
    ArrayList localArrayList = (ArrayList)am.bbb().getValue("key_share_card_other_city_ids");
    boolean bool;
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      bool = true;
      AppMethodBeat.o(87998);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87998);
    }
  }

  public static boolean bbw()
  {
    AppMethodBeat.i(87999);
    ArrayList localArrayList = (ArrayList)am.bbb().getValue("key_share_card_local_city_ids");
    boolean bool;
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      bool = true;
      AppMethodBeat.o(87999);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87999);
    }
  }

  public static void bbx()
  {
    AppMethodBeat.i(88005);
    ab.i("MicroMsg.ShareCardDataMgr", "delelteAllIllegalStatusCard()");
    d.post(new b.2(), "delelteAllIllegalStatusCard");
    AppMethodBeat.o(88005);
  }

  public static boolean bby()
  {
    AppMethodBeat.i(88011);
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)am.bbb().getValue("key_share_card_layout_data");
    boolean bool;
    if (locall == null)
    {
      bool = true;
      AppMethodBeat.o(88011);
    }
    while (true)
    {
      return bool;
      bool = locall.kfJ;
      AppMethodBeat.o(88011);
    }
  }

  public static boolean bbz()
  {
    AppMethodBeat.i(88012);
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)am.bbb().getValue("key_share_card_layout_data");
    boolean bool;
    if (locall == null)
    {
      bool = true;
      AppMethodBeat.o(88012);
    }
    while (true)
    {
      return bool;
      bool = locall.kfK;
      AppMethodBeat.o(88012);
    }
  }

  public static void dn(String paramString1, String paramString2)
  {
    AppMethodBeat.i(87995);
    if (fpA)
    {
      ab.i("MicroMsg.ShareCardDataMgr", "is isUpdating data, don't do updateCardIdsListByCardId");
      AppMethodBeat.o(87995);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ShareCardDataMgr", "do updateCardIdsListByCardId");
      fpA = true;
      ArrayList localArrayList = sQ(1);
      if ((localArrayList != null) && (localArrayList.contains(paramString1)))
      {
        localArrayList.remove(paramString1);
        String str = am.bbe().dq(paramString1, paramString2);
        if (!TextUtils.isEmpty(str))
          localArrayList.add(str);
        am.bbb().putValue("key_share_card_local_city_ids", localArrayList);
      }
      localArrayList = sQ(2);
      if ((localArrayList != null) && (localArrayList.contains(paramString1)))
      {
        localArrayList.remove(paramString1);
        paramString1 = am.bbe().dq(paramString1, paramString2);
        if (!TextUtils.isEmpty(paramString1))
          localArrayList.add(paramString1);
        am.bbb().putValue("key_share_card_other_city_ids", localArrayList);
      }
      fpA = false;
      AppMethodBeat.o(87995);
    }
  }

  public static void jdMethod_do(String paramString1, String paramString2)
  {
    AppMethodBeat.i(87996);
    ab.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId card_id:" + paramString1 + ", card_tp_id:" + paramString2);
    ArrayList localArrayList1 = sQ(1);
    if ((localArrayList1 != null) && (localArrayList1.contains(paramString1)))
      AppMethodBeat.o(87996);
    while (true)
    {
      return;
      ArrayList localArrayList2 = sQ(2);
      if ((localArrayList2 != null) && (localArrayList2.contains(paramString1)))
      {
        AppMethodBeat.o(87996);
      }
      else
      {
        com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)am.bbb().getValue("key_share_card_layout_data");
        if (locall == null)
        {
          ab.e("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId data == null");
          AppMethodBeat.o(87996);
        }
        else
        {
          int i = am.bbe().GH(paramString2);
          int j = GC(paramString2);
          ab.e("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId realCount:" + i + " cacheCount:" + j);
          int k;
          if ((locall.kfG != null) && (locall.kfG.size() > 0) && ((j <= 0) || (i == 1)))
            k = 0;
          while (true)
            if (k < locall.kfG.size())
            {
              m localm = (m)locall.kfG.get(k);
              if ((paramString2 != null) && (paramString2.contains(localm.kbU)))
              {
                localArrayList1.add(paramString1);
                am.bbb().putValue("key_share_card_local_city_ids", localArrayList1);
                ab.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId add for local ids, card id is ".concat(String.valueOf(paramString1)));
                AppMethodBeat.o(87996);
                break;
              }
              k++;
              continue;
              ab.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId, not add for local_ids");
            }
          if ((localArrayList2 != null) && ((j <= 0) || (i == 1)))
          {
            localArrayList2.add(paramString1);
            am.bbb().putValue("key_share_card_other_city_ids", localArrayList2);
            ab.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId add for other ids, card id is ".concat(String.valueOf(paramString1)));
            AppMethodBeat.o(87996);
          }
          else
          {
            ab.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId, not add for other_ids");
            AppMethodBeat.o(87996);
          }
        }
      }
    }
  }

  public static String dp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(88010);
    ab.i("MicroMsg.ShareCardDataMgr", "initShareUserCardId()");
    if (paramString2 != null)
    {
      paramString2 = GD(paramString2);
      if ((paramString2 != null) && (paramString2.size() > 0))
      {
        paramString2 = (r)paramString2.get(0);
        if ((paramString2 != null) && (paramString2.kfV != null) && (paramString2.kfV.size() > 0) && (!paramString1.equals(paramString2.kfV.get(0))))
        {
          paramString1 = (String)paramString2.kfV.get(0);
          ab.i("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), mCardId is not first!, reset it");
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(88010);
      return paramString1;
      ab.i("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), mCardId is first!");
      continue;
      ab.e("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), shareUserInfoList is null");
      continue;
      ab.e("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), card_tp_id is null");
    }
  }

  public static String rt(String paramString)
  {
    AppMethodBeat.i(88002);
    Map localMap = (Map)am.bbb().getValue("key_share_card_username_map");
    if (localMap == null)
    {
      paramString = "";
      AppMethodBeat.o(88002);
    }
    while (true)
    {
      return paramString;
      paramString = (String)localMap.get(paramString);
      AppMethodBeat.o(88002);
    }
  }

  public static ArrayList<String> sQ(int paramInt)
  {
    AppMethodBeat.i(87993);
    ArrayList localArrayList;
    if (paramInt == 1)
    {
      localArrayList = (ArrayList)am.bbb().getValue("key_share_card_local_city_ids");
      if ((localArrayList == null) || (localArrayList.size() == 0))
      {
        ab.e("MicroMsg.ShareCardDataMgr", "getCardIds() ids == null || ids.size() == 0 for showType == ".concat(String.valueOf(paramInt)));
        localArrayList = sR(paramInt);
        AppMethodBeat.o(87993);
      }
    }
    while (true)
    {
      return localArrayList;
      AppMethodBeat.o(87993);
      continue;
      if (paramInt == 2)
      {
        localArrayList = (ArrayList)am.bbb().getValue("key_share_card_other_city_ids");
        if ((localArrayList == null) || (localArrayList.size() == 0))
        {
          ab.e("MicroMsg.ShareCardDataMgr", "getCardIds() ids == null || ids.size() == 0 for showType == ".concat(String.valueOf(paramInt)));
          localArrayList = sR(paramInt);
          AppMethodBeat.o(87993);
        }
        else
        {
          AppMethodBeat.o(87993);
        }
      }
      else
      {
        localArrayList = null;
        AppMethodBeat.o(87993);
      }
    }
  }

  private static ArrayList<String> sR(int paramInt)
  {
    AppMethodBeat.i(87994);
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)am.bbb().getValue("key_share_card_layout_data");
    Object localObject;
    if (locall == null)
    {
      ab.e("MicroMsg.ShareCardDataMgr", "getCardIdsByType() data == null for showType = ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(87994);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = new ArrayList();
      ArrayList localArrayList = new ArrayList();
      m localm;
      String str;
      if (paramInt == 1)
      {
        if ((locall.kfG != null) && (locall.kfG.size() > 0))
        {
          paramInt = 0;
          if (paramInt < locall.kfG.size())
          {
            localm = (m)locall.kfG.get(paramInt);
            if (!localArrayList.contains(localm.kbU))
            {
              str = am.bbe().GI(localm.kbU);
              if ((TextUtils.isEmpty(str)) || (((ArrayList)localObject).contains(str)))
                break label177;
              ((ArrayList)localObject).add(str);
            }
            while (true)
            {
              localArrayList.add(localm.kbU);
              paramInt++;
              break;
              label177: if (!((ArrayList)localObject).contains(localm.cMC))
                ((ArrayList)localObject).add(localm.cMC);
            }
          }
          am.bbb().putValue("key_share_card_local_city_ids", localObject);
        }
        AppMethodBeat.o(87994);
      }
      else if (paramInt == 2)
      {
        if ((locall.kfH != null) && (locall.kfH.size() > 0))
        {
          paramInt = 0;
          if (paramInt < locall.kfH.size())
          {
            localm = (m)locall.kfH.get(paramInt);
            if (!localArrayList.contains(localm.kbU))
            {
              str = am.bbe().GI(localm.kbU);
              if ((TextUtils.isEmpty(str)) || (((ArrayList)localObject).contains(str)))
                break label334;
              ((ArrayList)localObject).add(str);
            }
            while (true)
            {
              localArrayList.add(localm.kbU);
              paramInt++;
              break;
              label334: if (!((ArrayList)localObject).contains(localm.cMC))
                ((ArrayList)localObject).add(localm.cMC);
            }
          }
          am.bbb().putValue("key_share_card_other_city_ids", localObject);
        }
        AppMethodBeat.o(87994);
      }
      else
      {
        AppMethodBeat.o(87994);
        localObject = null;
      }
    }
  }

  public static boolean sS(int paramInt)
  {
    AppMethodBeat.i(88007);
    Object localObject = (Integer)am.bbb().getValue("key_share_card_show_type");
    boolean bool;
    if (localObject == null)
    {
      AppMethodBeat.o(88007);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (((Integer)localObject).intValue() == 0)
      {
        AppMethodBeat.o(88007);
        bool = false;
      }
      else if (paramInt == 0)
      {
        localObject = (ArrayList)am.bbb().getValue("key_share_card_other_city_ids");
        if ((localObject == null) || (((ArrayList)localObject).size() == 0))
        {
          AppMethodBeat.o(88007);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(88007);
          bool = true;
        }
      }
      else if (paramInt == 10)
      {
        localObject = (ArrayList)am.bbb().getValue("key_share_card_local_city_ids");
        if ((localObject == null) || (((ArrayList)localObject).size() == 0))
        {
          AppMethodBeat.o(88007);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(88007);
          bool = true;
        }
      }
      else
      {
        AppMethodBeat.o(88007);
        bool = false;
      }
    }
  }

  private String t(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(87990);
    paramArrayList = a(this.mContext, paramArrayList);
    AppMethodBeat.o(87990);
    return paramArrayList;
  }

  public final void at(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(87986);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.ShareCardDataMgr", "updateGetShareLayoutData json is empty");
      AppMethodBeat.o(87986);
    }
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      Object localObject1 = com.tencent.mm.plugin.card.d.s.Hw(paramString);
      Object localObject2 = (com.tencent.mm.plugin.card.sharecard.model.l)am.bbb().getValue("key_share_card_layout_data");
      if (localObject1 == null)
      {
        ab.e("MicroMsg.ShareCardDataMgr", "updateGetShareLayoutData data == null");
        a((com.tencent.mm.plugin.card.sharecard.model.l)localObject1, (com.tencent.mm.plugin.card.sharecard.model.l)localObject2, paramBoolean);
        am.bbb().putValue("key_share_card_layout_data", localObject1);
        AppMethodBeat.o(87986);
      }
      else
      {
        if (paramBoolean)
          com.tencent.mm.plugin.card.d.l.Ho(paramString);
        a((com.tencent.mm.plugin.card.sharecard.model.l)localObject1, paramBoolean);
        a((com.tencent.mm.plugin.card.sharecard.model.l)localObject1, (com.tencent.mm.plugin.card.sharecard.model.l)localObject2, paramBoolean);
        am.bbb().putValue("key_share_card_layout_data", localObject1);
        int i = 0;
        int j = i;
        if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).kfG != null)
        {
          j = i;
          if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).kfG.size() > 0)
            j = ((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).kfG.size();
        }
        i = j;
        if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).kfH != null)
        {
          i = j;
          if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).kfH.size() > 0)
            i = j + ((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).kfH.size();
        }
        if (i > 0)
        {
          j = (int)(System.currentTimeMillis() - l);
          localObject2 = new ArrayList();
          IDKey localIDKey1 = new IDKey();
          localIDKey1.SetID(281);
          localIDKey1.SetKey(10);
          localIDKey1.SetValue(1L);
          paramString = new IDKey();
          paramString.SetID(281);
          paramString.SetKey(11);
          paramString.SetValue(j);
          localObject1 = new IDKey();
          ((IDKey)localObject1).SetID(281);
          ((IDKey)localObject1).SetKey(12);
          ((IDKey)localObject1).SetValue(i);
          IDKey localIDKey2 = new IDKey();
          localIDKey2.SetID(281);
          localIDKey2.SetKey(14);
          localIDKey2.SetValue(j / i);
          ((ArrayList)localObject2).add(localIDKey1);
          ((ArrayList)localObject2).add(paramString);
          ((ArrayList)localObject2).add(localObject1);
          ((ArrayList)localObject2).add(localIDKey2);
          com.tencent.mm.plugin.report.service.h.pYm.b((ArrayList)localObject2, true);
        }
        AppMethodBeat.o(87986);
      }
    }
  }

  public final void init()
  {
    AppMethodBeat.i(87984);
    Object localObject;
    if ((com.tencent.mm.plugin.card.sharecard.model.l)am.bbb().getValue("key_share_card_layout_data") == null)
    {
      ab.e("MicroMsg.ShareCardDataMgr", "initShareCardLayoutData, data cache is empty!, load data from db!");
      localObject = com.tencent.mm.plugin.card.d.l.beF();
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        ab.e("MicroMsg.ShareCardDataMgr", "initShareCardLayoutData, json is empty");
        AppMethodBeat.o(87984);
      }
    }
    while (true)
    {
      return;
      localObject = com.tencent.mm.plugin.card.d.s.Hw((String)localObject);
      if (localObject != null)
      {
        ab.i("MicroMsg.ShareCardDataMgr", "load share card layout data success!");
        am.bbb().putValue("key_share_card_layout_data", localObject);
        a((com.tencent.mm.plugin.card.sharecard.model.l)localObject, true);
        AppMethodBeat.o(87984);
      }
      else
      {
        ab.e("MicroMsg.ShareCardDataMgr", "load share card layout data fail!");
        AppMethodBeat.o(87984);
        continue;
        ab.i("MicroMsg.ShareCardDataMgr", "the share card layout cache is valid!");
        AppMethodBeat.o(87984);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.a.b
 * JD-Core Version:    0.6.2
 */