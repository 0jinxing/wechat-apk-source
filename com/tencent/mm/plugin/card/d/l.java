package com.tencent.mm.plugin.card.d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.c;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bzi;
import com.tencent.mm.protocal.protobuf.bzm;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.op;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class l
{
  private static SimpleDateFormat krM = null;
  private static SimpleDateFormat krN = null;
  private static SimpleDateFormat krO = null;

  public static String A(String paramString, long paramLong)
  {
    AppMethodBeat.i(88918);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(88918);
    }
    while (true)
    {
      return paramString;
      float f1 = am.bbc().ect;
      float f2 = am.bbc().ecs;
      if ((f1 == -1000.0F) || (f2 == -85.0F))
      {
        ab.e("MicroMsg.CardUtil", "getRedirectUrl() location info is empty!");
        AppMethodBeat.o(88918);
      }
      else if ((0x10 & paramLong) > 0L)
      {
        String str = "&longitude=" + f1 + "&latitude=" + f2;
        str = paramString.replace("#", str + "#");
        ab.i("MicroMsg.CardUtil", "getRedirectUrl originalUrl:".concat(String.valueOf(paramString)));
        ab.i("MicroMsg.CardUtil", "getRedirectUrl afterwardsUrl:".concat(String.valueOf(str)));
        AppMethodBeat.o(88918);
        paramString = str;
      }
      else
      {
        AppMethodBeat.o(88918);
      }
    }
  }

  public static ShapeDrawable H(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(88886);
    paramContext = dI(paramInt, paramContext.getResources().getDimensionPixelOffset(2131428152));
    AppMethodBeat.o(88886);
    return paramContext;
  }

  public static int Hn(String paramString)
  {
    AppMethodBeat.i(88884);
    int i = Color.rgb(66, 66, 66);
    if ((paramString == null) || (paramString.length() < 7) || (!paramString.startsWith("#")))
    {
      ab.e("MicroMsg.CardUtil", "string format error");
      AppMethodBeat.o(88884);
    }
    while (true)
    {
      return i;
      try
      {
        paramString = paramString.substring(1).toUpperCase();
        int j = Color.argb(255, Integer.parseInt(paramString.substring(0, 2), 16), Integer.parseInt(paramString.substring(2, 4), 16), Integer.parseInt(paramString.substring(4, 6), 16));
        i = j;
        AppMethodBeat.o(88884);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.CardUtil", paramString.toString());
        AppMethodBeat.o(88884);
      }
    }
  }

  public static void Ho(String paramString)
  {
    AppMethodBeat.i(88906);
    g.RP().Ry().set(ac.a.xKr, paramString);
    AppMethodBeat.o(88906);
  }

  public static String Hp(String paramString)
  {
    AppMethodBeat.i(88908);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(88908);
    }
    while (true)
    {
      return paramString;
      String str1 = s.mK(paramString);
      String str2 = s.mJ(paramString);
      if (!TextUtils.isEmpty(str1))
      {
        AppMethodBeat.o(88908);
        paramString = str1;
      }
      else if (!TextUtils.isEmpty(str2))
      {
        AppMethodBeat.o(88908);
        paramString = str2;
      }
      else
      {
        AppMethodBeat.o(88908);
      }
    }
  }

  public static String Hq(String paramString)
  {
    AppMethodBeat.i(88911);
    paramString = Arrays.asList(paramString.split(","));
    LinkedList localLinkedList = new LinkedList();
    if (g.RK())
      if ((paramString != null) && (paramString.size() != 0));
    while (true)
    {
      paramString = bo.c(localLinkedList, ",");
      AppMethodBeat.o(88911);
      return paramString;
      Iterator localIterator = paramString.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        ad localad = ((j)g.K(j.class)).XM().aoO(str);
        paramString = str;
        if (localad != null)
        {
          paramString = str;
          if ((int)localad.ewQ != 0)
            paramString = localad.Oj();
        }
        localLinkedList.add(paramString);
      }
    }
  }

  private static boolean Hr(String paramString)
  {
    AppMethodBeat.i(88916);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.CardUtil", "hasShowTheWarning card_id or title is empty!");
      AppMethodBeat.o(88916);
      bool = true;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.CardUtil", "hasShowWarning()");
      Object localObject = (String)g.RP().Ry().get(ac.a.xKy, "");
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        ab.e("MicroMsg.CardUtil", "hasShowTheWarning cardIdListStr list is empty!");
        AppMethodBeat.o(88916);
        bool = false;
      }
      else
      {
        localObject = ((String)localObject).split(",");
        if ((localObject == null) || (localObject.length == 0))
        {
          ab.e("MicroMsg.CardUtil", "hasShowTheWarning cardIds is empty!");
          AppMethodBeat.o(88916);
          bool = false;
        }
        else
        {
          int i = localObject.length;
          for (int j = 0; ; j++)
          {
            if (j >= i)
              break label158;
            if (paramString.equals(localObject[j]))
            {
              AppMethodBeat.o(88916);
              bool = true;
              break;
            }
          }
          label158: AppMethodBeat.o(88916);
          bool = false;
        }
      }
    }
  }

  public static void Hs(String paramString)
  {
    AppMethodBeat.i(88917);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.CardUtil", "setShowWarningFlag card_id or title is empty!");
      AppMethodBeat.o(88917);
      return;
    }
    ab.i("MicroMsg.CardUtil", "setShowWarningFlag()");
    String str = (String)g.RP().Ry().get(ac.a.xKy, "");
    if (TextUtils.isEmpty(str))
      ab.e("MicroMsg.CardUtil", "hasShowTheWarning cardIdListStr list is empty!");
    while (true)
    {
      g.RP().Ry().set(ac.a.xKy, paramString);
      AppMethodBeat.o(88917);
      break;
      String[] arrayOfString = str.split(",");
      if ((arrayOfString == null) || (arrayOfString.length == 0))
      {
        ab.e("MicroMsg.CardUtil", "hasShowTheWarning cardIds is empty!");
        str = paramString;
      }
      int i = arrayOfString.length;
      int j = 0;
      int k = 0;
      while (j < i)
      {
        if (paramString.equals(arrayOfString[j]))
          k = 1;
        j++;
      }
      if (k == 0)
        paramString = str + "," + paramString;
      else
        paramString = str;
    }
  }

  public static int Ht(String paramString)
  {
    AppMethodBeat.i(88919);
    int i;
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(r.Yz())))
    {
      i = 1;
      AppMethodBeat.o(88919);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(88919);
    }
  }

  public static Bitmap J(Bitmap paramBitmap)
  {
    boolean bool = true;
    AppMethodBeat.i(88892);
    Object localObject = new Matrix();
    ((Matrix)localObject).reset();
    ((Matrix)localObject).setRotate(90.0F, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2);
    paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
    localObject = new StringBuilder("resultBmp is null: ");
    if (paramBitmap == null);
    while (true)
    {
      ab.d("MicroMsg.CardUtil", bool + "  degree:90.0");
      AppMethodBeat.o(88892);
      return paramBitmap;
      bool = false;
    }
  }

  public static void K(Bitmap paramBitmap)
  {
    AppMethodBeat.i(88893);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      ab.i("MicroMsg.CardUtil", "bitmap recycle %s", new Object[] { paramBitmap });
      paramBitmap.recycle();
    }
    AppMethodBeat.o(88893);
  }

  public static bzm a(int paramInt, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    AppMethodBeat.i(88912);
    ab.i("MicroMsg.CardUtil", "getShareTag()");
    bzm localbzm = new bzm();
    ArrayList localArrayList;
    if (paramInt == 2)
    {
      if ((paramArrayList1 != null) && (paramArrayList1.size() > 0))
        localbzm.wYv.addAll(paramArrayList1);
      if ((paramArrayList2 != null) && (paramArrayList2.size() > 0))
      {
        localArrayList = new ArrayList();
        for (paramInt = 0; paramInt < paramArrayList2.size(); paramInt++)
        {
          paramArrayList1 = (String)paramArrayList2.get(paramInt);
          if ((!TextUtils.isEmpty(paramArrayList1)) && (isNumeric(paramArrayList1)))
            localArrayList.add(Integer.valueOf(paramArrayList1));
        }
        localbzm.wYx.addAll(localArrayList);
      }
    }
    while (true)
    {
      AppMethodBeat.o(88912);
      return localbzm;
      if (paramInt == 3)
      {
        if ((paramArrayList1 != null) && (paramArrayList1.size() > 0))
          localbzm.wYw.addAll(paramArrayList1);
        if ((paramArrayList2 != null) && (paramArrayList2.size() > 0))
        {
          localArrayList = new ArrayList();
          for (paramInt = 0; paramInt < paramArrayList2.size(); paramInt++)
          {
            paramArrayList1 = (String)paramArrayList2.get(paramInt);
            if ((!TextUtils.isEmpty(paramArrayList1)) && (isNumeric(paramArrayList1)))
              localArrayList.add(Integer.valueOf(paramArrayList1));
          }
          localbzm.wYy.addAll(localArrayList);
        }
      }
    }
  }

  public static void a(com.tencent.mm.plugin.card.base.b paramb, String paramString1, String paramString2, int paramInt)
  {
    j.b localb = null;
    AppMethodBeat.i(88895);
    Object localObject = x.a(new m(paramb.aZV().kbV));
    if (localObject != null);
    for (localObject = d.ai((Bitmap)localObject); ; localObject = null)
    {
      com.tencent.mm.plugin.card.compat.a.a locala = (com.tencent.mm.plugin.card.compat.a.a)g.K(com.tencent.mm.plugin.card.compat.a.a.class);
      if (paramb == null)
      {
        paramString2 = localb;
        locala.b(paramString2, paramb.aZV().csB, paramb.aZV().kdg, paramString1, (byte[])localObject);
        AppMethodBeat.o(88895);
        return;
      }
      if (paramInt == 23)
        paramInt = 2;
      for (int i = 1; ; i = 0)
      {
        StringBuilder localStringBuilder1 = new StringBuilder();
        localb = new j.b();
        if (paramb.aZV() != null)
        {
          localb.title = paramb.aZX().wYl;
          localb.description = paramb.aZV().title;
          localb.type = 16;
          localb.showType = 0;
          localb.fgr = 3;
          localb.appId = paramb.aZV().csB;
          localb.ffZ = 0;
          localb.thumburl = paramb.aZV().kbV;
          localb.fhD = paramInt;
          localb.fhC = paramb.aZV().kdg;
          localb.url = paramb.aZV().vUc;
        }
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("<from_username>").append(paramb.bab()).append("</from_username>");
        if (tm(paramInt))
        {
          localStringBuilder2.append("<card_id>").append(paramb.baa()).append("</card_id>");
          label314: localStringBuilder2.append("<card_type>").append(paramb.aZV().iAd).append("</card_type>");
          localStringBuilder2.append("<from_scene>").append(paramInt).append("</from_scene>");
          localStringBuilder2.append("<color>").append(paramb.aZV().color).append("</color>");
          localStringBuilder2.append("<card_type_name>").append(paramb.aZV().kdf).append("</card_type_name>");
          localStringBuilder2.append("<brand_name>").append(paramb.aZV().kdg).append("</brand_name>");
          if (!TextUtils.isEmpty(paramString2))
            break label569;
          localStringBuilder2.append("<card_ext></card_ext>");
        }
        while (true)
        {
          localStringBuilder2.append("<is_recommend>").append(i).append("</is_recommend>");
          localStringBuilder2.append("<recommend_card_id>").append(paramb.aZZ()).append("</recommend_card_id>");
          localb.fhB = localStringBuilder2.toString();
          localb.cDt = j.b.a(localb, null, null);
          paramString2 = localb;
          break;
          if (paramInt != 5)
            break label314;
          localStringBuilder2.append("<card_id>").append(paramb.aZZ()).append("</card_id>");
          break label314;
          label569: localStringBuilder2.append("<card_ext>").append(paramString2).append("</card_ext>");
        }
      }
    }
  }

  public static boolean a(com.tencent.mm.plugin.card.model.b paramb, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(88914);
    if (!gT(paramb.vUW))
    {
      ab.i("MicroMsg.CardUtil", "ShowWarning not support show the warning!");
      AppMethodBeat.o(88914);
    }
    while (true)
    {
      return bool;
      if (Hr(paramString))
      {
        ab.i("MicroMsg.CardUtil", "ShowWarning has show the warning!");
        AppMethodBeat.o(88914);
      }
      else
      {
        ab.i("MicroMsg.CardUtil", "ShowWarning has not show the warning!");
        bool = true;
        AppMethodBeat.o(88914);
      }
    }
  }

  public static boolean a(ShareCardInfo paramShareCardInfo)
  {
    boolean bool = false;
    AppMethodBeat.i(88904);
    if (paramShareCardInfo == null)
    {
      ab.e("MicroMsg.CardUtil", "processShareCardObject fail, card is null");
      AppMethodBeat.o(88904);
    }
    while (true)
    {
      return bool;
      ShareCardInfo localShareCardInfo = am.bbe().GK(paramShareCardInfo.field_card_id);
      if (localShareCardInfo == null)
      {
        bool = am.bbe().b(paramShareCardInfo);
        ab.d("MicroMsg.CardUtil", "processShareCardObject, insertRet = %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
          ab.e("MicroMsg.CardUtil", "processShareCardObject, insert fail");
        while (true)
        {
          AppMethodBeat.o(88904);
          break;
          com.tencent.mm.plugin.card.sharecard.a.b.jdMethod_do(paramShareCardInfo.field_card_id, paramShareCardInfo.field_card_tp_id);
        }
      }
      paramShareCardInfo.field_categoryType = localShareCardInfo.field_categoryType;
      paramShareCardInfo.field_itemIndex = localShareCardInfo.field_itemIndex;
      bool = am.bbe().c(paramShareCardInfo, new String[0]);
      ab.d("MicroMsg.CardUtil", "processShareCardObject, updateRet = %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(88904);
    }
  }

  public static boolean a(tm paramtm, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(88913);
    if (!gT(paramtm.vUW))
    {
      ab.i("MicroMsg.CardUtil", "ShowWarning not support show the warning!");
      AppMethodBeat.o(88913);
    }
    while (true)
    {
      return bool;
      if (Hr(paramString))
      {
        ab.i("MicroMsg.CardUtil", "ShowWarning has show the warning!");
        AppMethodBeat.o(88913);
      }
      else
      {
        ab.i("MicroMsg.CardUtil", "ShowWarning has not show the warning!");
        bool = true;
        AppMethodBeat.o(88913);
      }
    }
  }

  public static boolean agA()
  {
    AppMethodBeat.i(88902);
    try
    {
      bool = ((LocationManager)com.tencent.mm.sdk.platformtools.ah.getContext().getSystemService("location")).isProviderEnabled("gps");
      AppMethodBeat.o(88902);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.CardUtil", localException, "", new Object[0]);
        AppMethodBeat.o(88902);
        boolean bool = false;
      }
    }
  }

  public static boolean agB()
  {
    AppMethodBeat.i(88903);
    try
    {
      bool = ((LocationManager)com.tencent.mm.sdk.platformtools.ah.getContext().getSystemService("location")).isProviderEnabled("network");
      AppMethodBeat.o(88903);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.CardUtil", localException, "", new Object[0]);
        AppMethodBeat.o(88903);
        boolean bool = false;
      }
    }
  }

  public static ColorStateList ah(Context paramContext, String paramString)
  {
    AppMethodBeat.i(88921);
    int i = paramContext.getResources().getColor(2131690691);
    int j = Hn(paramString);
    paramContext = new ColorStateList(new int[][] { { 16842919, 16842910 }, new int[0] }, new int[] { i, j });
    AppMethodBeat.o(88921);
    return paramContext;
  }

  public static void ai(Context paramContext, String paramString)
  {
    AppMethodBeat.i(88924);
    if (!bo.isNullOrNil(paramString))
    {
      Toast.makeText(com.tencent.mm.sdk.platformtools.ah.getContext(), paramString, 1).show();
      AppMethodBeat.o(88924);
    }
    while (true)
    {
      return;
      h.b(paramContext, paramContext.getString(2131298016), "", false);
      AppMethodBeat.o(88924);
    }
  }

  public static void aj(Context paramContext, String paramString)
  {
    AppMethodBeat.i(88925);
    String str = paramString;
    if (bo.isNullOrNil(paramString))
      str = paramContext.getString(2131298016);
    h.b(paramContext, str, "", false);
    AppMethodBeat.o(88925);
  }

  public static ShapeDrawable b(Context paramContext, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(88888);
    int i = paramContext.getResources().getDimensionPixelSize(2131427815);
    paramContext = new float[8];
    paramContext[0] = paramInt2;
    paramContext[1] = paramInt2;
    paramContext[2] = paramInt2;
    paramContext[3] = paramInt2;
    paramContext[4] = paramInt2;
    paramContext[5] = paramInt2;
    paramContext[6] = paramInt2;
    paramContext[7] = paramInt2;
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(paramContext, new RectF(i, i, i, i), paramContext));
    paramContext = localShapeDrawable.getPaint();
    paramContext.setColor(paramInt1);
    paramContext.setStrokeWidth(i);
    AppMethodBeat.o(88888);
    return localShapeDrawable;
  }

  public static boolean b(CardInfo paramCardInfo)
  {
    boolean bool = false;
    AppMethodBeat.i(88894);
    if (paramCardInfo == null)
    {
      ab.e("MicroMsg.CardUtil", "processCardObject fail, card is null");
      AppMethodBeat.o(88894);
    }
    while (true)
    {
      return bool;
      CardInfo localCardInfo = am.baW().Gu(paramCardInfo.field_card_id);
      if (localCardInfo == null)
      {
        bool = am.baW().b(paramCardInfo);
        ab.d("MicroMsg.CardUtil", "processCardObject, insertRet = %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
          ab.e("MicroMsg.CardUtil", "processCardObject, insert fail");
        AppMethodBeat.o(88894);
      }
      else
      {
        paramCardInfo.field_stickyIndex = localCardInfo.field_stickyIndex;
        paramCardInfo.field_stickyEndTime = localCardInfo.field_stickyEndTime;
        paramCardInfo.field_stickyAnnouncement = localCardInfo.field_stickyAnnouncement;
        bool = am.baW().c(paramCardInfo, new String[0]);
        ab.d("MicroMsg.CardUtil", "processCardObject, updateRet = %b", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(88894);
      }
    }
  }

  public static int bS(String paramString, int paramInt)
  {
    AppMethodBeat.i(88885);
    int i = Color.rgb(66, 66, 66);
    if ((paramString == null) || (paramString.length() < 7) || (!paramString.startsWith("#")))
    {
      ab.e("MicroMsg.CardUtil", "string format error");
      AppMethodBeat.o(88885);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      try
      {
        paramString = paramString.substring(1).toUpperCase();
        paramInt = Color.argb(paramInt, Integer.parseInt(paramString.substring(0, 2), 16), Integer.parseInt(paramString.substring(2, 4), 16), Integer.parseInt(paramString.substring(4, 6), 16));
        AppMethodBeat.o(88885);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.CardUtil", paramString.toString());
        AppMethodBeat.o(88885);
        paramInt = i;
      }
    }
  }

  public static int bT(String paramString, int paramInt)
  {
    AppMethodBeat.i(88922);
    paramInt = dJ(Color.parseColor(paramString), paramInt);
    AppMethodBeat.o(88922);
    return paramInt;
  }

  public static void beB()
  {
    AppMethodBeat.i(88897);
    Integer localInteger = (Integer)g.RP().Ry().get(282883, null);
    if ((localInteger != null) && (localInteger.intValue() == 1))
    {
      ab.i("MicroMsg.CardUtil", "card entrance is open");
      AppMethodBeat.o(88897);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardUtil", "open card entrance");
      g.RP().Ry().set(282883, Integer.valueOf(1));
      AppMethodBeat.o(88897);
    }
  }

  public static boolean beC()
  {
    AppMethodBeat.i(88898);
    Integer localInteger = (Integer)g.RP().Ry().get(282883, null);
    boolean bool;
    if ((localInteger != null) && (localInteger.intValue() == 1))
    {
      AppMethodBeat.o(88898);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88898);
    }
  }

  public static void beD()
  {
    AppMethodBeat.i(88899);
    Integer localInteger = (Integer)g.RP().Ry().get(ac.a.xKt, Integer.valueOf(0));
    if ((localInteger != null) && (localInteger.intValue() == 1))
    {
      ab.i("MicroMsg.CardUtil", "share card entrance is open");
      AppMethodBeat.o(88899);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardUtil", "open share card entrance");
      g.RP().Ry().set(ac.a.xKt, Integer.valueOf(1));
      AppMethodBeat.o(88899);
    }
  }

  public static boolean beE()
  {
    AppMethodBeat.i(88900);
    Integer localInteger = (Integer)g.RP().Ry().get(ac.a.xKt, null);
    boolean bool;
    if ((localInteger != null) && (localInteger.intValue() == 1))
    {
      AppMethodBeat.o(88900);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88900);
    }
  }

  public static String beF()
  {
    AppMethodBeat.i(88907);
    String str = (String)g.RP().Ry().get(ac.a.xKr, "");
    AppMethodBeat.o(88907);
    return str;
  }

  public static List<com.tencent.mm.plugin.card.model.b> bj(List<op> paramList)
  {
    AppMethodBeat.i(88889);
    if ((paramList == null) || (paramList.size() == 0))
    {
      paramList = null;
      AppMethodBeat.o(88889);
    }
    while (true)
    {
      return paramList;
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i < paramList.size(); i++)
      {
        op localop = (op)paramList.get(i);
        com.tencent.mm.plugin.card.model.b localb = new com.tencent.mm.plugin.card.model.b();
        localb.title = localop.title;
        localb.kbW = localop.kbW;
        localb.kfM = localop.kfM;
        localb.url = localop.url;
        localb.vUW = localop.vUW;
        localb.kch = false;
        localb.vUX = localop.vUX;
        localb.vUY = localop.vUY;
        localb.kKZ = localop.kKZ;
        localb.vTL = localop.vTL;
        localb.vTM = localop.vTM;
        localb.kcg = 1;
        localArrayList.add(localb);
      }
      AppMethodBeat.o(88889);
      paramList = localArrayList;
    }
  }

  public static ArrayList<String> bk(List<String> paramList)
  {
    AppMethodBeat.i(88909);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      ab.e("MicroMsg.CardUtil", "getContactNamesFromLabels labels is empty!");
      paramList = null;
      AppMethodBeat.o(88909);
    }
    while (true)
    {
      return paramList;
      ArrayList localArrayList = new ArrayList();
      HashSet localHashSet = new HashSet();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        Object localObject = (String)paramList.next();
        localObject = com.tencent.mm.plugin.label.a.a.bJa().PH(com.tencent.mm.plugin.label.a.a.bJa().PE((String)localObject));
        if ((localObject == null) || (((List)localObject).size() == 0))
          ab.e("MicroMsg.CardUtil", "getContactNamesFromLabels, namelist get bu label is null");
        else
          localHashSet.addAll((Collection)localObject);
      }
      localArrayList.addAll(localHashSet);
      AppMethodBeat.o(88909);
      paramList = localArrayList;
    }
  }

  public static ArrayList<String> bl(List<String> paramList)
  {
    AppMethodBeat.i(88910);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      ab.e("MicroMsg.CardUtil", "getContactIdsFromLabels labels is empty!");
      paramList = null;
      AppMethodBeat.o(88910);
    }
    while (true)
    {
      return paramList;
      ArrayList localArrayList = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        str = com.tencent.mm.plugin.label.a.a.bJa().PE(str);
        if (!TextUtils.isEmpty(str))
          localArrayList.add(str);
      }
      AppMethodBeat.o(88910);
      paramList = localArrayList;
    }
  }

  public static ShapeDrawable dI(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(88887);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] { paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2 }, null, null));
    localShapeDrawable.getPaint().setColor(paramInt1);
    AppMethodBeat.o(88887);
    return localShapeDrawable;
  }

  public static int dJ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(88923);
    if (paramInt2 <= 0)
      AppMethodBeat.o(88923);
    while (true)
    {
      return paramInt1;
      paramInt1 = com.tencent.mm.ui.ah.dJ(paramInt1, paramInt2);
      AppMethodBeat.o(88923);
    }
  }

  public static void dw(String paramString1, String paramString2)
  {
    AppMethodBeat.i(88896);
    if (!bo.isNullOrNil(paramString1))
    {
      qb localqb = new qb();
      localqb.cMq.cMr = paramString2;
      localqb.cMq.content = paramString1;
      localqb.cMq.type = t.nK(paramString2);
      localqb.cMq.flags = 0;
      com.tencent.mm.sdk.b.a.xxA.m(localqb);
    }
    AppMethodBeat.o(88896);
  }

  public static String fQ(long paramLong)
  {
    AppMethodBeat.i(88890);
    paramLong = 1000L * paramLong;
    new GregorianCalendar().setTimeInMillis(paramLong);
    if (krM == null)
      krM = new SimpleDateFormat("yyyy.MM.dd");
    String str = krM.format(new Date(paramLong));
    AppMethodBeat.o(88890);
    return str;
  }

  public static Drawable g(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(88920);
    paramContext = b(paramContext, Hn(paramString), paramInt);
    ShapeDrawable localShapeDrawable = dI(Hn(paramString), paramInt);
    paramString = new StateListDrawable();
    paramString.addState(new int[] { 16842919 }, localShapeDrawable);
    paramString.addState(new int[0], paramContext);
    AppMethodBeat.o(88920);
    return paramString;
  }

  public static String g(Context paramContext, float paramFloat)
  {
    AppMethodBeat.i(88901);
    if (paramFloat <= 0.0F)
    {
      paramContext = "";
      AppMethodBeat.o(88901);
    }
    while (true)
    {
      return paramContext;
      if ((paramFloat > 0.0F) && (paramFloat < 1000.0F))
      {
        paramContext = paramContext.getString(2131297836, new Object[] { (int)paramFloat });
        AppMethodBeat.o(88901);
      }
      else if (paramFloat >= 1000.0F)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        paramFloat /= 1000.0F;
        paramContext = paramContext.getString(2131297835, new Object[] { new DecimalFormat("0.00").format(paramFloat) });
        AppMethodBeat.o(88901);
      }
      else
      {
        paramContext = "";
        AppMethodBeat.o(88901);
      }
    }
  }

  private static boolean gT(long paramLong)
  {
    AppMethodBeat.i(88915);
    boolean bool;
    if ((0x8 & paramLong) > 0L)
    {
      ab.i("MicroMsg.CardUtil", "shouldShowWarning show the warning!");
      bool = true;
      AppMethodBeat.o(88915);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88915);
    }
  }

  public static boolean h(com.tencent.mm.plugin.card.base.b paramb)
  {
    AppMethodBeat.i(88905);
    boolean bool1;
    boolean bool2;
    if ((paramb instanceof CardInfo))
    {
      bool1 = am.baW().c((CardInfo)paramb, new String[0]);
      bool2 = bool1;
      if (!bool1)
      {
        ab.e("MicroMsg.CardUtil", "update mCardInfo fail, cardId = %s", new Object[] { paramb.aZZ() });
        bool2 = bool1;
      }
    }
    while (true)
    {
      AppMethodBeat.o(88905);
      return bool2;
      if ((paramb instanceof ShareCardInfo))
      {
        bool1 = am.bbe().c((ShareCardInfo)paramb, new String[0]);
        bool2 = bool1;
        if (!bool1)
        {
          ab.e("MicroMsg.CardUtil", "update mCardInfo fail, cardId = %s", new Object[] { paramb.aZZ() });
          bool2 = bool1;
        }
      }
      else
      {
        bool2 = false;
      }
    }
  }

  public static boolean isNetworkAvailable(Context paramContext)
  {
    AppMethodBeat.i(88883);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    boolean bool;
    if (paramContext != null)
    {
      paramContext = paramContext.getActiveNetworkInfo();
      if ((paramContext != null) && (paramContext.isConnected()) && (paramContext.getState() == NetworkInfo.State.CONNECTED))
      {
        bool = true;
        AppMethodBeat.o(88883);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88883);
    }
  }

  public static boolean isNumeric(String paramString)
  {
    AppMethodBeat.i(88891);
    boolean bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
    AppMethodBeat.o(88891);
    return bool;
  }

  public static boolean sP(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 10:
    case 11:
    case 20:
    case 30:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public static boolean tm(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt != 0)
    {
      bool2 = bool1;
      if (paramInt != 1)
      {
        bool2 = bool1;
        if (paramInt != 2)
        {
          bool2 = bool1;
          if (paramInt != 9)
          {
            bool2 = bool1;
            if (paramInt != 12)
            {
              bool2 = bool1;
              if (paramInt != 17)
                if (paramInt != 21)
                  break label56;
            }
          }
        }
      }
    }
    label56: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public static boolean tn(int paramInt)
  {
    if ((paramInt == 7) || (paramInt == 8) || (paramInt == 16) || (paramInt == 26));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean to(int paramInt)
  {
    if ((paramInt == 3) || (paramInt == 4) || (paramInt == 5) || (paramInt == 15));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.l
 * JD-Core Version:    0.6.2
 */