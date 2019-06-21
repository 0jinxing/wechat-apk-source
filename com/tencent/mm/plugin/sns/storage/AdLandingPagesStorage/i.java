package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.aa;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ab.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.f;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.f.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.q;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.x;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.y;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.z;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class i
{
  public static int rem = 750;
  public static int ren = 10;
  private static Set<i.a> reo = null;

  public static boolean DA(int paramInt)
  {
    if (paramInt == 101);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean DB(int paramInt)
  {
    if (paramInt == 103);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean DC(int paramInt)
  {
    if (paramInt == 104);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean DD(int paramInt)
  {
    if (paramInt == 105);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean DE(int paramInt)
  {
    paramInt |= -16777216;
    if (paramInt + 16777216 > -1 - paramInt);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean Dz(int paramInt)
  {
    if ((paramInt == 101) || (paramInt == 103) || (paramInt == 104) || (paramInt == 105));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean YN(String paramString)
  {
    AppMethodBeat.i(37746);
    boolean bool;
    if (bo.ank(bo.bc((String)br.z(paramString, "adCanvasInfo").get(".adCanvasInfo.bizId"), "")) == 1)
    {
      AppMethodBeat.o(37746);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37746);
    }
  }

  public static boolean YO(String paramString)
  {
    AppMethodBeat.i(138382);
    boolean bool = go(paramString, "adCanvasInfo");
    AppMethodBeat.o(138382);
    return bool;
  }

  public static float a(double paramDouble, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(37733);
    float f1;
    if (paramInt1 == 0)
    {
      f1 = (float)paramDouble;
      AppMethodBeat.o(37733);
    }
    while (true)
    {
      return f1;
      if (paramInt2 == 0)
      {
        f1 = (float)paramDouble;
        AppMethodBeat.o(37733);
      }
      else
      {
        paramInt1 = ad.eP(ah.getContext())[0];
        f1 = (float)paramDouble;
        float f2 = paramInt3;
        f1 = ad.aY(paramInt1 * (f1 * f2) / paramInt2);
        AppMethodBeat.o(37733);
      }
    }
  }

  private static com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ab a(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(37735);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ab localab = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ab();
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString = paramString + ".radarChart";
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localab.qXx = ((String)paramMap.get(paramString + ".borderImg"));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localab.qXD = ((String)paramMap.get(paramString + ".maskImg"));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localab.qXy = ((String)paramMap.get(paramString + ".coverColor"));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localab.qXz = Color.parseColor((String)paramMap.get(paramString + ".labelFont.$color"));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localab.qXA = ((int)a(bo.anm((String)paramMap.get(paramString + ".labelFont.$size")), paramInt1, paramInt2, paramInt3));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localab.qXB = Color.parseColor((String)paramMap.get(paramString + ".scoreFont.$color"));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localab.qXC = ((int)a(bo.anm((String)paramMap.get(paramString + ".scoreFont.$size")), paramInt1, paramInt2, paramInt3));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localab.borderWidth = a(bo.anm((String)paramMap.get(paramString + ".borderImgWidth")), paramInt1, paramInt2, paramInt3);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + ".itemList.item";
      paramInt1 = 0;
      if (paramInt1 != 0)
      {
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
      }
      for (paramString = (String)localObject + paramInt1; ; paramString = (String)localObject)
      {
        ab.a locala = new com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/ab$a;
        locala.<init>();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        locala.label = ((String)paramMap.get(paramString + ".label"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        locala.qXE = ((String)paramMap.get(paramString + ".score"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        locala.value = ((float)bo.anm((String)paramMap.get(paramString + ".value")));
        if ((TextUtils.isEmpty(locala.label)) && (TextUtils.isEmpty(locala.qXE)))
          break label620;
        localab.itemList.add(locala);
        paramInt1++;
        break;
      }
    }
    catch (Exception paramMap)
    {
      com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", bo.l(paramMap));
      label620: AppMethodBeat.o(37735);
    }
    return localab;
  }

  private static r a(Map<String, String> paramMap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    AppMethodBeat.i(37744);
    int i = bo.ank((String)paramMap.get(paramString + ".type"));
    r localr = null;
    if (!Dz(i));
    while (true)
    {
      try
      {
        localr = a(paramMap, paramString, paramInt1, paramInt2, paramInt3, paramInt4);
        paramMap = localr;
        AppMethodBeat.o(37744);
        return paramMap;
      }
      catch (Exception localException)
      {
        paramMap = a(paramMap, paramString, paramInt1, paramInt2, paramInt3, 0);
        continue;
      }
      if (DA(i))
      {
        paramMap = d(paramMap, paramString, paramInt1, paramInt2, paramInt3, paramInt4);
      }
      else if (DB(i))
      {
        paramMap = e(paramMap, paramString, paramInt1, paramInt2, paramInt3, paramInt4);
      }
      else if (DC(i))
      {
        paramMap = f(paramMap, paramString, paramInt1, paramInt2, paramInt3, paramInt4);
      }
      else if (DD(i))
      {
        paramMap = g(paramMap, paramString, paramInt1, paramInt2, paramInt3, paramInt4);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "the type" + i + " is not client known type");
        paramMap = localException;
      }
    }
  }

  private static r a(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(37734);
    int i = bo.ank((String)paramMap.get(paramString + ".type"));
    int j = bo.ank((String)paramMap.get(paramString + ".subType"));
    Object localObject1;
    switch (i)
    {
    default:
      localObject1 = null;
      AppMethodBeat.o(37734);
      return localObject1;
    case 82:
      localObject1 = new aa();
      ((aa)localObject1).url = bo.bc((String)paramMap.get(paramString + ".webviewUrl"), "");
    case 102:
    case 1:
    case 21:
    case 41:
    case 44:
    case 45:
    case 61:
    case 62:
    case 81:
    case 121:
    case 122:
    case 131:
    case 132:
    }
    while (true)
    {
      label256: if (localObject1 != null)
      {
        ((r)localObject1).qWW = DE(paramInt4);
        ((r)localObject1).type = i;
        ((r)localObject1).cuu = j;
        a((r)localObject1, paramMap, paramString, paramInt1, paramInt2, paramInt3);
      }
      AppMethodBeat.o(37734);
      break;
      localObject1 = c(paramMap, paramString, paramInt1, paramInt2, paramInt3, paramInt4);
      continue;
      localObject1 = new u();
      ((u)localObject1).qWP = i;
      ((u)localObject1).cuu = j;
      ((u)localObject1).qXk = bo.bc((String)paramMap.get(paramString + ".content"), "");
      ((u)localObject1).textAlignment = bo.ank((String)paramMap.get(paramString + ".textAlignment"));
      ((u)localObject1).oxN = bo.bc((String)paramMap.get(paramString + ".fontColor"), "");
      ((u)localObject1).eOg = a(bo.anm((String)paramMap.get(paramString + ".fontSize")), paramInt1, paramInt2, paramInt3);
      if ((bo.ank((String)paramMap.get(paramString + ".showType")) & u.qXf) > 0)
      {
        bool = true;
        label545: ((u)localObject1).qXl = bool;
        if ((bo.ank((String)paramMap.get(paramString + ".showType")) & u.qXg) <= 0)
          break label770;
        bool = true;
        label594: ((u)localObject1).qXm = bool;
        if ((bo.ank((String)paramMap.get(paramString + ".showType")) & u.qXh) <= 0)
          break label776;
      }
      label770: label776: for (boolean bool = true; ; bool = false)
      {
        ((u)localObject1).qXn = bool;
        ((u)localObject1).maxLines = bo.ank((String)paramMap.get(paramString + ".maxLines"));
        ((u)localObject1).qWp = bo.ank((String)paramMap.get(paramString + ".fontType"));
        ((u)localObject1).qXo = bo.ann((String)paramMap.get(paramString + ".lineSpace"));
        break;
        bool = false;
        break label545;
        bool = false;
        break label594;
      }
      if (j == 2)
      {
        localObject1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b();
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).csB = ((String)paramMap.get(paramString + ".appid"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).qVZ = ((String)paramMap.get(paramString + ".appPageUrlAndroid"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).channelId = ((String)paramMap.get(paramString + ".channelId"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).Iw = ((String)paramMap.get(paramString + ".pkg"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).qVO = bo.ank((String)paramMap.get(paramString + ".platform"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).qVP = ((String)paramMap.get(paramString + ".warningAndroid"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).qVQ = ((String)paramMap.get(paramString + ".btnBgColorTheme"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).qVS = ((String)paramMap.get(paramString + ".btnBgColorThemePressed"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).qVR = ((String)paramMap.get(paramString + ".btnBgColorThemeDisable"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).qVT = ((String)paramMap.get(paramString + ".btnBorderColorTheme"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).qVV = ((String)paramMap.get(paramString + ".btnBorderColorThemePressed"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).qVU = ((String)paramMap.get(paramString + ".btnBorderColorThemeDisable"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).qVW = ((String)paramMap.get(paramString + ".fontColor"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).qVY = ((String)paramMap.get(paramString + ".fontColorPressed"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject1).qVX = ((String)paramMap.get(paramString + ".fontColorDisable"));
      }
      double d2;
      Object localObject2;
      Object localObject3;
      while (true)
      {
        ((k)localObject1).qWP = i;
        ((k)localObject1).cuu = j;
        ((k)localObject1).title = bo.bc((String)paramMap.get(paramString + ".btnTitle"), "");
        ((k)localObject1).qWk = bo.ank((String)paramMap.get(paramString + ".btnType"));
        ((k)localObject1).qWl = bo.bc((String)paramMap.get(paramString + ".btnJumpUrl"), "");
        ((k)localObject1).qWm = bo.bc((String)paramMap.get(paramString + ".btnJumpApp"), "");
        ((k)localObject1).qWn = bo.bc((String)paramMap.get(paramString + ".fontColor"), "");
        ((k)localObject1).fontSize = a(bo.anm((String)paramMap.get(paramString + ".fontSize")), paramInt1, paramInt2, paramInt3);
        ((k)localObject1).qWp = bo.ank((String)paramMap.get(paramString + ".btnFontType"));
        ((k)localObject1).textAlignment = bo.ank((String)paramMap.get(paramString + ".btnAlignment"));
        ((k)localObject1).qWo = a(bo.anm((String)paramMap.get(paramString + ".borderSize")), paramInt1, paramInt2, paramInt3);
        ((k)localObject1).height = a(bo.anm((String)paramMap.get(paramString + ".btnHeight")), paramInt1, paramInt2, paramInt3);
        ((k)localObject1).qWq = bo.bc((String)paramMap.get(paramString + ".btnBgColorTheme"), "");
        ((k)localObject1).qWr = bo.bc((String)paramMap.get(paramString + ".btnBorderColorTheme"), "");
        ((k)localObject1).qWs = bo.bc((String)paramMap.get(paramString + ".btnBgImgUrl"), "");
        ((k)localObject1).qWt = bo.ank((String)paramMap.get(paramString + ".bCanLongPress"));
        ((k)localObject1).qWu = bo.ank((String)paramMap.get(paramString + ".bHideActionSheet"));
        ((k)localObject1).qWv = bo.ank((String)paramMap.get(paramString + ".hideProductActionHeader"));
        ((k)localObject1).qWw = bo.ank((String)paramMap.get(paramString + ".showProductActionCancelButton"));
        ((k)localObject1).qWy = bo.bc((String)paramMap.get(paramString + ".productActionTitle"), "");
        ((k)localObject1).qWx = bo.bc((String)paramMap.get(paramString + ".productActionBuffer"), "");
        ((k)localObject1).qWz = bo.bc((String)paramMap.get(paramString + ".productActionIconUrl"), "");
        if (paramMap.containsKey(paramString + ".productActionItem.componentItem.type"))
          ((k)localObject1).qWA = a(paramMap, paramInt1, paramInt2, paramInt3, paramInt4, paramString + ".productActionItem.componentItem");
        break label256;
        if (j == 4)
        {
          localObject1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e();
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e)localObject1).kcM = bo.bc((String)paramMap.get(paramString + ".cardTpId"), "");
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e)localObject1).kdB = bo.bc((String)paramMap.get(paramString + ".cardExt"), "");
        }
        else if (j == 7)
        {
          localObject1 = new j();
          ((j)localObject1).qWf = bo.bc((String)paramMap.get(paramString + ".jumpCanvasId"), "");
          ((j)localObject1).qWg = bo.bc((String)paramMap.get(paramString + ".jumpCanvasExt"), "");
          ((j)localObject1).qWh = bo.ank((String)paramMap.get(paramString + ".jumpCanvasNoStore"));
          ((j)localObject1).qWi = bo.ank((String)paramMap.get(paramString + ".btnCanvasEnterType"));
          ((j)localObject1).qWj = bo.ank((String)paramMap.get(paramString + ".btnCanvasSource"));
        }
        else if (j == 8)
        {
          localObject1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i();
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i)localObject1).username = ((String)paramMap.get(paramString + ".weappUserName"));
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i)localObject1).cOh = ((String)paramMap.get(paramString + ".weappPath"));
        }
        else
        {
          if (j == 9)
          {
            d1 = bo.anm((String)paramMap.get(paramString + ".location.$x"));
            d2 = bo.anm((String)paramMap.get(paramString + ".location.$y"));
            k = bo.ank((String)paramMap.get(paramString + ".location.$scale"));
            localObject2 = (String)paramMap.get(paramString + ".location.$label");
            localObject1 = (String)paramMap.get(paramString + ".location.$poiname");
            if ((TextUtils.isEmpty((CharSequence)localObject2)) && (TextUtils.isEmpty((CharSequence)localObject1)))
            {
              localObject1 = null;
              AppMethodBeat.o(37734);
              break;
            }
            localObject1 = new f(new f.a(d1, d2, k, (String)localObject2, (String)localObject1));
            continue;
          }
          if (j == 10)
          {
            localObject3 = paramString + ".phoneNumList.phoneNum";
            localObject2 = new ArrayList();
            k = 0;
            if (k == 0);
            for (localObject1 = (String)paramMap.get(localObject3); ; localObject1 = (String)paramMap.get((String)localObject3 + k))
            {
              if (TextUtils.isEmpty((CharSequence)localObject1))
                break label2908;
              ((List)localObject2).add(localObject1);
              k++;
              break;
            }
            label2908: if (!((List)localObject2).isEmpty())
            {
              localObject1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.h((List)localObject2);
              continue;
            }
            localObject1 = null;
            AppMethodBeat.o(37734);
            break;
          }
          localObject1 = new k();
        }
      }
      localObject1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n();
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).qWP = i;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).cuu = j;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).qWD = bo.bc((String)paramMap.get(paramString + ".pureImageUrl"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).qWE = bo.bc((String)paramMap.get(paramString + ".bgColor"), "");
      if ((paramMap.containsKey(paramString + ".bgColorAlpha")) && (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).qWE.length() > 0))
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).qWE = String.format("#%02x%s", new Object[] { Integer.valueOf((int)(bo.anm((String)paramMap.get(paramString + ".bgColorAlpha")) * 255.0D)), ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).qWE.substring(1) });
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).width = a(bo.anm((String)paramMap.get(paramString + ".imageWidth")), paramInt1, paramInt2, paramInt3);
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).height = a(bo.anm((String)paramMap.get(paramString + ".imageHeight")), paramInt1, paramInt2, paramInt3);
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).qWC = false;
      continue;
      localObject1 = new m();
      ((m)localObject1).qWP = i;
      ((m)localObject1).cuu = j;
      ((m)localObject1).qWD = bo.bc((String)paramMap.get(paramString + ".panoramaImageUrl"), "");
      ((m)localObject1).width = a(bo.anm((String)paramMap.get(paramString + ".imageWidth")), paramInt1, paramInt2, paramInt3);
      ((m)localObject1).height = a(bo.anm((String)paramMap.get(paramString + ".imageHeight")), paramInt1, paramInt2, paramInt3);
      continue;
      localObject1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n();
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).qWP = i;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).cuu = j;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).qWD = bo.bc((String)paramMap.get(paramString + ".fullScreenImageUrl"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject1).qWC = true;
      continue;
      localObject1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o();
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWP = i;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).cuu = j;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWF = bo.bc((String)paramMap.get(paramString + ".sightVideoUrl"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWG = bo.bc((String)paramMap.get(paramString + ".sightThumbUrl"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWH = bo.bc((String)paramMap.get(paramString + ".streamVideoUrl"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWI = bo.bc((String)paramMap.get(paramString + ".jumpText"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWf = bo.bc((String)paramMap.get(paramString + ".jumpCanvasId"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWg = bo.bc((String)paramMap.get(paramString + ".jumpCanvasExt"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWh = bo.ank((String)paramMap.get(paramString + ".jumpCanvasNoStore"));
      try
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWJ = Color.parseColor((String)paramMap.get(paramString + ".jumpTextColor"));
      }
      catch (Exception localException1)
      {
        try
        {
          while (true)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWK = Color.parseColor((String)paramMap.get(paramString + ".separatorColor"));
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).width = a(bo.anm((String)paramMap.get(paramString + ".sightDisplayWidth")), paramInt1, paramInt2, paramInt3);
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).height = a(bo.anm((String)paramMap.get(paramString + ".sightDisplayHeight")), paramInt1, paramInt2, paramInt3);
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWL = bo.ank((String)paramMap.get(paramString + ".sightDisplayType"));
            localObject3 = bo.nullAsNil((String)paramMap.get(paramString + ".floatComponentId"));
            k = bo.ank((String)paramMap.get(paramString + ".floatStartTime"));
            if ((!bo.isNullOrNil((String)localObject3)) && (k > 0))
            {
              localObject2 = new w();
              ((w)localObject2).cHR = ((String)localObject3);
              ((w)localObject2).qXt = k;
              ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWM = ((w)localObject2);
            }
            break;
            localException1 = localException1;
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWJ = Color.rgb(255, 255, 255);
          }
        }
        catch (Exception localException2)
        {
          while (true)
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject1).qWK = Color.rgb(255, 255, 255);
        }
      }
      localObject1 = new z();
      ((z)localObject1).qWP = i;
      ((z)localObject1).cuu = j;
      ((z)localObject1).qWH = bo.bc((String)paramMap.get(paramString + ".streamVideoUrl"), "");
      ((z)localObject1).qXv = bo.bc((String)paramMap.get(paramString + ".streamVideoThumb"), "");
      ((z)localObject1).width = a(bo.anm((String)paramMap.get(paramString + ".streamDisplayWidth")), paramInt1, paramInt2, paramInt3);
      ((z)localObject1).height = a(bo.anm((String)paramMap.get(paramString + ".streamDisplayHeight")), paramInt1, paramInt2, paramInt3);
      ((z)localObject1).qXw = bo.ank((String)paramMap.get(paramString + ".streamDisplayType"));
      String str = bo.nullAsNil((String)paramMap.get(paramString + ".floatComponentId"));
      int k = bo.ank((String)paramMap.get(paramString + ".floatStartTime"));
      if ((!bo.isNullOrNil(str)) && (k > 0))
      {
        localObject3 = new w();
        ((w)localObject3).cHR = str;
        ((w)localObject3).qXt = k;
        ((z)localObject1).qWM = ((w)localObject3);
      }
      continue;
      localObject1 = new y();
      ((y)localObject1).qWP = i;
      ((y)localObject1).cuu = j;
      ((y)localObject1).nmz = bo.bc((String)paramMap.get(paramString + ".webviewUrl"), "");
      continue;
      double d1 = a(bo.anm((String)paramMap.get(paramString + ".topLineSize")), paramInt1, paramInt2, paramInt3);
      double d3 = a(bo.anm((String)paramMap.get(paramString + ".bottomLineSize")), paramInt1, paramInt2, paramInt3);
      if (DE(paramInt4))
        k = Color.argb(51, 0, 0, 0);
      int m;
      while (true)
        if (i == 121)
        {
          d2 = bo.anm((String)paramMap.get(paramString + ".location.$x"));
          double d4 = bo.anm((String)paramMap.get(paramString + ".location.$y"));
          m = bo.ank((String)paramMap.get(paramString + ".location.$scale"));
          localObject1 = (String)paramMap.get(paramString + ".location.$label");
          str = (String)paramMap.get(paramString + ".location.$poiname");
          if ((TextUtils.isEmpty((CharSequence)localObject1)) && (TextUtils.isEmpty(str)))
          {
            localObject1 = null;
            AppMethodBeat.o(37734);
            break;
            k = Color.argb(51, 255, 255, 255);
            continue;
          }
          localObject1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g(d1, d3, new g.a(d2, d4, m, (String)localObject1, str), k);
          break label256;
        }
      if (i == 122)
      {
        str = paramString + ".phoneNumList.phoneNum";
        localObject3 = new ArrayList();
        m = 0;
        if (m == 0);
        for (localObject1 = (String)paramMap.get(str); ; localObject1 = (String)paramMap.get(str + m))
        {
          if (TextUtils.isEmpty((CharSequence)localObject1))
            break label5026;
          ((List)localObject3).add(localObject1);
          m++;
          break;
        }
        label5026: if (!((List)localObject3).isEmpty())
        {
          localObject1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d(d1, d3, k, (List)localObject3);
          continue;
        }
        localObject1 = null;
        AppMethodBeat.o(37734);
        break;
        localObject1 = new t();
        ((t)localObject1).qWP = i;
        ((t)localObject1).cuu = j;
        ((t)localObject1).label = bo.bc((String)paramMap.get(paramString + ".label"), "");
        ((t)localObject1).value = ((float)bo.anm((String)paramMap.get(paramString + ".value")));
        ((t)localObject1).qXe = bo.bc((String)paramMap.get(paramString + ".foregroundImage"), "");
        ((t)localObject1).fontSize = a(bo.anm((String)paramMap.get(paramString + ".fontSize")), paramInt1, paramInt2, paramInt3);
        ((t)localObject1).hfo = bo.bc((String)paramMap.get(paramString + ".backgroundColor"), "");
        continue;
        localObject1 = a(paramMap, paramString, paramInt1, paramInt2, paramInt3);
        continue;
      }
      localObject1 = null;
    }
  }

  private static void a(r paramr, Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = true;
    AppMethodBeat.i(37739);
    paramr.qWP = bo.ank((String)paramMap.get(paramString + ".type"));
    paramr.type = paramr.qWP;
    paramr.qWO = bo.bc((String)paramMap.get(paramString + ".id"), "");
    paramr.qWQ = a(bo.anm((String)paramMap.get(paramString + ".paddingTop")), paramInt1, paramInt2, paramInt3);
    paramr.qWR = a(bo.anm((String)paramMap.get(paramString + ".paddingBottom")), paramInt1, paramInt2, paramInt3);
    paramr.qWS = a(bo.anm((String)paramMap.get(paramString + ".paddingLeft")), paramInt1, paramInt2, paramInt3);
    paramr.qWT = a(bo.anm((String)paramMap.get(paramString + ".paddingRight")), paramInt1, paramInt2, paramInt3);
    paramr.cuu = bo.ank((String)paramMap.get(paramString + ".subType"));
    paramr.qWX = bo.bc((String)paramMap.get(paramString + ".cellBackgroundColor"), "");
    String str1 = paramString + ".if";
    boolean bool2;
    label399: label453: label459: double d;
    if (paramMap.containsKey(str1))
      if ("1".equals(paramMap.get(str1)))
      {
        bool2 = true;
        paramr.qXa = bool2;
        str1 = paramString + ".noReport";
        if (!paramMap.containsKey(str1))
          break label702;
        if (!"1".equals(paramMap.get(str1)))
          break label696;
        bool2 = bool1;
        paramr.qXb = bool2;
        String str2 = bo.bc((String)paramMap.get(paramString + ".layoutWidth"), "");
        str1 = bo.bc((String)paramMap.get(paramString + ".layoutHeight"), "");
        if (TextUtils.isEmpty(str2))
          break label727;
        d = bo.anm(str2);
        if (d >= 0.0D)
          break label710;
        paramr.qWU = ((float)d);
        label560: if (TextUtils.isEmpty(str1))
          break label754;
        d = bo.anm(str1);
        if (d >= 0.0D)
          break label737;
        paramr.qWV = ((float)d);
        label589: str1 = (String)paramMap.get(paramString + ".verticalAlignment");
        paramMap = (String)paramMap.get(paramString + ".horizontalAlignment");
        if (!TextUtils.isEmpty(str1))
          break label764;
        paramr.qWY = -1;
        label663: if (!TextUtils.isEmpty(paramMap))
          break label776;
        paramr.qWZ = -1;
        AppMethodBeat.o(37739);
      }
    while (true)
    {
      return;
      bool2 = false;
      break;
      paramr.qXa = true;
      break label399;
      label696: bool2 = false;
      break label453;
      label702: paramr.qXb = false;
      break label459;
      label710: paramr.qWU = a(d, paramInt1, paramInt2, paramInt3);
      break label560;
      label727: paramr.qWU = 2.147484E+009F;
      break label560;
      label737: paramr.qWV = a(d, paramInt1, paramInt2, paramInt3);
      break label589;
      label754: paramr.qWV = 2.147484E+009F;
      break label589;
      label764: paramr.qWY = bo.ank(str1);
      break label663;
      label776: paramr.qWZ = bo.ank(paramMap);
      AppMethodBeat.o(37739);
    }
  }

  public static boolean a(TimeLineObject paramTimeLineObject, Activity paramActivity)
  {
    AppMethodBeat.i(37752);
    String str = paramTimeLineObject.rCK;
    long l = new BigInteger(paramTimeLineObject.Id).longValue();
    LinkedList localLinkedList = paramTimeLineObject.xfI.wbK;
    boolean bool;
    Object localObject;
    int i;
    int j;
    if (!TextUtils.isEmpty(str))
    {
      if ((TextUtils.isEmpty(str)) || (!YO(str)))
        break label390;
      paramTimeLineObject = "";
      bool = YN(str);
      if (!bool)
        break label409;
      localObject = com.tencent.mm.model.c.c.abj().getExpIdByKey("Sns_Canvas_GameShare_JumpWay");
      if (com.tencent.mm.model.c.c.abj().en("Sns_Canvas_GameShare_JumpWay", 0) == 0)
      {
        i = 0;
        j = i;
        paramTimeLineObject = (TimeLineObject)localObject;
        if (i == 0)
        {
          j = i;
          paramTimeLineObject = (TimeLineObject)localObject;
          if (cqj())
          {
            j = 1;
            paramTimeLineObject = (TimeLineObject)localObject;
          }
        }
      }
    }
    while (true)
    {
      if (j != 0)
      {
        com.tencent.mm.plugin.sns.storage.n localn = af.cnF().kD(l);
        localObject = new Intent();
        if (localn != null)
        {
          ((Intent)localObject).putExtra("sns_landing_pages_share_sns_id", localn.cqA());
          ((Intent)localObject).putExtra("sns_landing_pages_rawSnsId", localn.cqu().Id);
          ((Intent)localObject).putExtra("sns_landing_pages_ux_info", localn.crc());
          ((Intent)localObject).putExtra("sns_landing_pages_aid", localn.cqZ());
          ((Intent)localObject).putExtra("sns_landing_pages_traceid", localn.cra());
          ((Intent)localObject).putExtra("sns_landing_pages_rec_src", localn.cre());
        }
        if ((localLinkedList != null) && (localLinkedList.size() > 0))
          ((Intent)localObject).putExtra("sns_landing_pages_share_thumb_url", ((bau)localLinkedList.get(0)).wEH);
        ((Intent)localObject).putExtra("sns_landing_pages_expid", paramTimeLineObject);
        ((Intent)localObject).putExtra("sns_landig_pages_from_source", 11);
        ((Intent)localObject).setClass(paramActivity, SnsAdNativeLandingPagesUI.class);
        ((Intent)localObject).putExtra("sns_landing_pages_xml", str);
        ((Intent)localObject).putExtra("sns_landing_pages_xml_prefix", "adxml");
        ((Intent)localObject).putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
        paramActivity.startActivity((Intent)localObject);
        AppMethodBeat.o(37752);
        bool = true;
        return bool;
        i = 1;
        break;
      }
      b(str, paramActivity, bool, 11);
      while (true)
      {
        AppMethodBeat.o(37752);
        bool = false;
        break;
        label390: com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "invalid canvas xml %s", new Object[] { str });
      }
      label409: j = 1;
    }
  }

  public static LinkedList<g> ai(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(37745);
    Object localObject1 = new String(paramString1);
    Object localObject2 = localObject1;
    label271: 
    while (true)
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localObject2 = localObject1;
        localJSONObject.<init>(paramString3);
        localObject2 = localObject1;
        paramString3 = new java/lang/StringBuilder;
        localObject2 = localObject1;
        paramString3.<init>("the jsonObject is ");
        localObject2 = localObject1;
        com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", localJSONObject.toString());
        localObject2 = localObject1;
        Iterator localIterator = localJSONObject.keys();
        paramString3 = (String)localObject1;
        localObject2 = paramString3;
        localObject1 = paramString3;
        if (localIterator.hasNext())
        {
          localObject2 = paramString3;
          localObject1 = localIterator.next();
          if (localObject1 == null)
            break label271;
          localObject2 = paramString3;
          if (!(localObject1 instanceof String))
            break label271;
          localObject2 = paramString3;
          Object localObject3 = (String)localObject1;
          localObject2 = paramString3;
          localObject1 = localJSONObject.getString((String)localObject3);
          localObject2 = paramString3;
          if (bo.isNullOrNil((String)localObject1))
            break label271;
          localObject2 = paramString3;
          Object localObject4 = new java/lang/StringBuilder;
          localObject2 = paramString3;
          ((StringBuilder)localObject4).<init>("{{");
          localObject2 = paramString3;
          localObject4 = (String)localObject3 + "}}";
          localObject2 = paramString3;
          localObject3 = new java/lang/StringBuilder;
          localObject2 = paramString3;
          ((StringBuilder)localObject3).<init>("<![CDATA[");
          localObject2 = paramString3;
          paramString3 = paramString3.replace((CharSequence)localObject4, (String)localObject1 + "]]>");
        }
      }
      catch (Exception paramString3)
      {
        com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "the json is parsed error : ".concat(String.valueOf(paramString1)));
        localObject1 = localObject2;
        paramString1 = gn((String)localObject1, paramString2);
        AppMethodBeat.o(37745);
        return paramString1;
      }
  }

  private static List<r> b(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(37736);
    ArrayList localArrayList = new ArrayList();
    String str = paramString + ".layoutItems.componentItem";
    int i = 0;
    if (i == 0)
    {
      paramString = str;
      label48: paramString = a(paramMap, paramInt1, paramInt2, paramInt3, paramInt4, paramString);
      if (paramString == null)
        break label144;
      if (!paramString.qXa)
        break label110;
      localArrayList.add(paramString);
    }
    while (true)
    {
      i++;
      break;
      paramString = str + i;
      break label48;
      label110: com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "comp " + paramString.toString() + " ifCondition is false");
    }
    label144: AppMethodBeat.o(37736);
    return localArrayList;
  }

  private static boolean b(String paramString, Context paramContext, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(37747);
    paramString = (String)br.z(paramString, "adCanvasInfo").get(".adCanvasInfo.shareWebUrl");
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(37747);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      String str = paramString;
      if (paramBoolean)
        str = "exp=" + com.tencent.mm.model.c.c.abj().getExpIdByKey("Sns_Canvas_GameShare_JumpWay") + "_" + paramInt;
      try
      {
        str = m(paramString, new String[] { str });
        paramString = str;
        label103: com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "canvas jump url ".concat(String.valueOf(paramString)));
        str = paramString;
        paramString = new Intent();
        paramString.putExtra("rawUrl", str);
        paramString.putExtra("showShare", true);
        com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramString);
        AppMethodBeat.o(37747);
        paramBoolean = true;
      }
      catch (URISyntaxException localURISyntaxException)
      {
        break label103;
      }
    }
  }

  private static l c(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(37737);
    l locall = new l();
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      i = Color.parseColor((String)paramMap.get(paramString + ".bgColorTheme"));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      locall.backgroundColor = ((int)(bo.getDouble((String)paramMap.get(paramString + ".bgColorAlpha"), 0.0D) * 255.0D) << 24 | i & 0xFFFFFF);
      paramString = paramString + ".componentGroupList";
      localObject = paramString + ".componentItem";
      for (i = 0; i == 0; i++)
      {
        paramString = (String)localObject;
        paramString = a(paramMap, paramInt1, paramInt2, paramInt3, paramInt4, paramString);
        if (paramString == null)
          break label267;
        if (paramString.qXa)
          locall.qWB.add(paramString);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i;
        com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "%s", new Object[] { bo.l(localException) });
        locall.backgroundColor = Color.argb(51, 0, 0, 0);
        continue;
        paramString = localException + i;
      }
      label267: AppMethodBeat.o(37737);
    }
    return locall;
  }

  private static boolean cqj()
  {
    AppMethodBeat.i(37750);
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100150");
    boolean bool;
    if (localc.isValid())
    {
      int i = bo.getInt((String)localc.dru().get("openCanvas"), 0);
      com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "canOpenGameCanvas abtest=".concat(String.valueOf(i)));
      if (i == 1)
      {
        AppMethodBeat.o(37750);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(37750);
      bool = false;
      continue;
      AppMethodBeat.o(37750);
      bool = false;
    }
  }

  private static void cqk()
  {
    AppMethodBeat.i(37755);
    if (reo != null)
      AppMethodBeat.o(37755);
    while (true)
    {
      return;
      reo = new HashSet();
      Object localObject1 = null;
      Object localObject2 = null;
      Object localObject3 = null;
      try
      {
        localInputStream = ah.getContext().getAssets().open("sns/canvas_valid_type.xml");
        localObject3 = localInputStream;
        localObject1 = localInputStream;
        localObject2 = localInputStream;
        XmlPullParser localXmlPullParser = XmlPullParserFactory.newInstance().newPullParser();
        localObject3 = localInputStream;
        localObject1 = localInputStream;
        localObject2 = localInputStream;
        localXmlPullParser.setInput(localInputStream, "UTF-8");
        localObject3 = localInputStream;
        localObject1 = localInputStream;
        localObject2 = localInputStream;
        int i = localXmlPullParser.getEventType();
        int j = -1;
        int k = -1;
        if (i != 1)
        {
          int m = k;
          Object localObject5;
          label154: int i1;
          if (i == 2)
          {
            localObject3 = localInputStream;
            localObject1 = localInputStream;
            localObject2 = localInputStream;
            localObject5 = localXmlPullParser.getName();
            localObject3 = localInputStream;
            localObject1 = localInputStream;
            localObject2 = localInputStream;
            if (!"canvastype".equals(localObject5))
              break label286;
            k = 0;
            i = 0;
            m = k;
            if (i != -1)
            {
              localObject3 = localInputStream;
              localObject1 = localInputStream;
              localObject2 = localInputStream;
              if (bo.getInt(localXmlPullParser.getAttributeValue(null, "android"), 0) != 1)
                break label640;
              localObject3 = localInputStream;
              localObject1 = localInputStream;
              localObject2 = localInputStream;
              n = bo.getInt(localXmlPullParser.getAttributeValue(null, "val"), -1);
              i1 = n;
              m = k;
              switch (i)
              {
              default:
                m = k;
              case 0:
              case 1:
              case 2:
              case 3:
              }
            }
          }
          while (true)
          {
            i1 = j;
            localObject3 = localInputStream;
            localObject1 = localInputStream;
            localObject2 = localInputStream;
            i = localXmlPullParser.next();
            j = i1;
            k = m;
            break;
            label286: localObject3 = localInputStream;
            localObject1 = localInputStream;
            localObject2 = localInputStream;
            if ("pagetype".equals(localObject5))
            {
              k = 1;
              i = 1;
              break label154;
            }
            localObject3 = localInputStream;
            localObject1 = localInputStream;
            localObject2 = localInputStream;
            if ("componenttype".equals(localObject5))
            {
              k = 2;
              i = 2;
              break label154;
            }
            localObject3 = localInputStream;
            localObject1 = localInputStream;
            localObject2 = localInputStream;
            if ("subtype".equals(localObject5))
            {
              i = 3;
              break label154;
            }
            i = -1;
            break label154;
            m = k;
            if (k != -1)
            {
              m = k;
              if (j != -1)
              {
                m = k;
                if (n != -1)
                {
                  localObject3 = localInputStream;
                  localObject1 = localInputStream;
                  localObject2 = localInputStream;
                  localObject5 = new com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/i$a;
                  localObject3 = localInputStream;
                  localObject1 = localInputStream;
                  localObject2 = localInputStream;
                  ((i.a)localObject5).<init>((byte)0);
                  localObject3 = localInputStream;
                  localObject1 = localInputStream;
                  localObject2 = localInputStream;
                  ((i.a)localObject5).rep = k;
                  localObject3 = localInputStream;
                  localObject1 = localInputStream;
                  localObject2 = localInputStream;
                  ((i.a)localObject5).req = j;
                  localObject3 = localInputStream;
                  localObject1 = localInputStream;
                  localObject2 = localInputStream;
                  ((i.a)localObject5).rer = n;
                  localObject3 = localInputStream;
                  localObject1 = localInputStream;
                  localObject2 = localInputStream;
                  reo.add(localObject5);
                  localObject3 = localInputStream;
                  localObject1 = localInputStream;
                  localObject2 = localInputStream;
                  com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "valid canvas type ".concat(String.valueOf(localObject5)));
                  m = k;
                }
              }
            }
          }
        }
      }
      catch (IOException localIOException1)
      {
        InputStream localInputStream;
        localObject2 = localObject3;
        com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", bo.l(localIOException1));
        if (localObject3 != null)
        {
          try
          {
            localObject3.close();
            AppMethodBeat.o(37755);
            continue;
            if (localInputStream == null)
              break label627;
            try
            {
              localInputStream.close();
              AppMethodBeat.o(37755);
            }
            catch (IOException localIOException2)
            {
              AppMethodBeat.o(37755);
            }
          }
          catch (IOException localIOException3)
          {
            AppMethodBeat.o(37755);
          }
          continue;
        }
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        IOException localIOException4 = localIOException1;
        com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", bo.l(localXmlPullParserException));
        if (localIOException1 != null)
        {
          try
          {
            localIOException1.close();
            AppMethodBeat.o(37755);
          }
          catch (IOException localIOException5)
          {
            AppMethodBeat.o(37755);
          }
          continue;
        }
      }
      finally
      {
        while (true)
        {
          while (true)
          {
            if (localIOException5 != null);
            try
            {
              localIOException5.close();
              label619: AppMethodBeat.o(37755);
              throw localObject4;
              label627: AppMethodBeat.o(37755);
            }
            catch (IOException localIOException6)
            {
              break label619;
            }
          }
          label640: int n = -1;
        }
      }
    }
  }

  private static x d(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(37738);
    x localx = new x();
    a(localx, paramMap, paramString, paramInt1, paramInt2, paramInt3);
    localx.qXu = bo.ank((String)paramMap.get(paramString + ".pageCtrType"));
    boolean bool;
    String str1;
    if (bo.ank((String)paramMap.get(paramString + ".isFullScreen")) == 1)
    {
      bool = true;
      localx.iXr = bool;
      str1 = paramString + ".componentGroupList.componentGroup";
    }
    for (int i = 0; ; i++)
    {
      label142: l locall;
      String str2;
      int j;
      if (i == 0)
      {
        paramString = str1;
        locall = new l();
        str2 = paramString + ".componentItem";
        j = 0;
        label176: if (j != 0)
          break label253;
      }
      label253: for (paramString = str2; ; paramString = str2 + j)
      {
        paramString = a(paramMap, paramInt1, paramInt2, paramInt3, paramInt4, paramString);
        if (paramString == null)
          break label277;
        if (paramString.qXa)
          locall.qWB.add(paramString);
        j++;
        break label176;
        bool = false;
        break;
        paramString = str1 + i;
        break label142;
      }
      label277: if (locall.qWB.size() == 0)
        break label305;
      localx.qWB.add(locall);
    }
    label305: AppMethodBeat.o(37738);
    return localx;
  }

  public static void dj(List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h> paramList)
  {
    AppMethodBeat.i(37758);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(37758);
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h localh = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h)localIterator.next();
        if (Dz(localh.cpv().type))
          localArrayList.addAll(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a)localh).cpt());
      }
      if (!localArrayList.isEmpty())
      {
        dj(localArrayList);
        paramList.addAll(localArrayList);
      }
      AppMethodBeat.o(37758);
    }
  }

  private static r e(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(37740);
    s locals = new s();
    locals.qXd = bo.ank((String)paramMap.get(paramString + ".subType"));
    a(locals, paramMap, paramString, paramInt1, paramInt2, paramInt3);
    String str = paramString + ".layoutItems.componentItem";
    int i = 0;
    if (i == 0);
    for (paramString = str; ; paramString = str + i)
    {
      paramString = a(paramMap, paramInt1, paramInt2, paramInt3, paramInt4, paramString);
      if (paramString == null)
        break label159;
      if (paramString.qXa)
        locals.qXc.add(paramString);
      i++;
      break;
    }
    label159: AppMethodBeat.o(37740);
    return locals;
  }

  private static r f(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(37741);
    Object localObject = b(paramMap, paramString, paramInt1, paramInt2, paramInt3, paramInt4);
    q localq = new q();
    localq.bnR = ((List)localObject);
    a(localq, paramMap, paramString, paramInt1, paramInt2, paramInt3);
    localObject = paramString + ".layoutItems.componentItem";
    int i = 0;
    if (i == 0);
    for (paramString = (String)localObject; ; paramString = (String)localObject + i)
    {
      paramString = a(paramMap, paramInt1, paramInt2, paramInt3, paramInt4, paramString);
      if (paramString == null)
        break label144;
      if (paramString.qXa)
        localq.bnR.add(paramString);
      i++;
      break;
    }
    label144: AppMethodBeat.o(37741);
    return localq;
  }

  private static r g(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(37742);
    Object localObject = b(paramMap, paramString, paramInt1, paramInt2, paramInt3, paramInt4);
    p localp = new p();
    localp.qWN = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), bo.ank((String)paramMap.get(paramString + ".cornerRadius")));
    localp.bnR = ((List)localObject);
    a(localp, paramMap, paramString, paramInt1, paramInt2, paramInt3);
    localObject = paramString + ".layoutItems.componentItem";
    int i = 0;
    if (i == 0);
    for (paramString = (String)localObject; ; paramString = (String)localObject + i)
    {
      paramString = a(paramMap, paramInt1, paramInt2, paramInt3, paramInt4, paramString);
      if (paramString == null)
        break label187;
      if (paramString.qXa)
        localp.bnR.add(paramString);
      i++;
      break;
    }
    label187: AppMethodBeat.o(37742);
    return localp;
  }

  public static LinkedList<g> gn(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37743);
    LinkedList localLinkedList = new LinkedList();
    if (TextUtils.isEmpty(paramString1))
    {
      AppMethodBeat.o(37743);
      return localLinkedList;
    }
    if (TextUtils.isEmpty(paramString1));
    Map localMap;
    while (true)
    {
      localMap = br.z(paramString1, paramString2);
      if (localMap != null)
        break label83;
      com.tencent.mm.sdk.platformtools.ab.w("AdLandingPagesParseHelper", " parse landingpages xml is error ,".concat(String.valueOf(paramString1)));
      AppMethodBeat.o(37743);
      break;
      paramString1 = paramString1.replaceAll("\\{\\{.*?\\}\\}", "");
    }
    label83: int i = bo.ank((String)localMap.get("." + paramString2 + ".adCanvasInfo.sizeType"));
    int j = bo.ank((String)localMap.get("." + paramString2 + ".adCanvasInfo.basicRootFontSize"));
    int k = bo.ank((String)localMap.get("." + paramString2 + ".adCanvasInfo.basicWidth"));
    int m = j;
    if (j == 0)
    {
      m = j;
      if (i == 1)
        m = ren;
    }
    j = k;
    if (k == 0)
    {
      j = k;
      if (i == 1)
        j = rem;
    }
    if ((!bo.isNullOrNil(paramString2)) && (!".adCanvasInfo.PageList.Page".equals("adCanvasInfo")));
    for (paramString1 = "." + paramString2 + ".adCanvasInfo.PageList.Page"; ; paramString1 = ".adCanvasInfo.PageList.Page")
    {
      label526: label534: label663: label798: for (k = 0; ; k++)
      {
        if (k == 0)
          paramString2 = paramString1;
        g localg;
        while (true)
        {
          localg = new g();
          localg.reh = bo.bc((String)localMap.get(paramString2 + ".backgroundCover"), "");
          localg.hfo = bo.bc((String)localMap.get(paramString2 + ".backgroundColor"), "");
          boolean bool;
          label419: Object localObject;
          label486: label493: String str;
          int n;
          if (bo.ank((String)localMap.get(paramString2 + ".backgroundCover.$isAddBlur")) > 0)
          {
            bool = true;
            localg.rei = bool;
            localg.id = k;
            localObject = paramString2 + ".if";
            if (!localMap.containsKey(localObject))
              break label663;
            if (!"1".equals(localMap.get(localObject)))
              break label657;
            bool = true;
            localg.rel = bool;
            if (!localg.rel)
              break label798;
            str = paramString2 + ".componentItemList.componentItem";
            n = 0;
            if (n != 0)
              break label672;
            paramString2 = str;
          }
          try
          {
            if (!TextUtils.isEmpty(localg.hfo));
            for (int i1 = Color.parseColor(localg.hfo); ; i1 = 0)
            {
              localObject = a(localMap, i, j, m, i1, paramString2);
              if (localObject == null)
                break label780;
              if (!((r)localObject).qXa)
                break label745;
              a((r)localObject, localMap, paramString2, i, j, m);
              if (!(localObject instanceof p))
                break label731;
              localg.rek.put(((r)localObject).qWO, localObject);
              n++;
              break label526;
              paramString2 = paramString1 + k;
              break;
              bool = false;
              break label419;
              bool = false;
              break label486;
              localg.rel = true;
              break label493;
              label672: paramString2 = str + n;
              break label534;
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", bo.l(localException));
              r localr = a(localMap, i, j, m, 0, paramString2);
              continue;
              label731: localg.rej.add(localr);
              continue;
              label745: com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "comp " + localr.toString() + " ifCondition is false");
            }
          }
        }
        if (localg.rej.size() == 0)
          break;
        localLinkedList.add(localg);
      }
      label657: if (localLinkedList.size() > 0)
        ((g)localLinkedList.get(0)).mTL = true;
      label780: AppMethodBeat.o(37743);
      break;
    }
  }

  public static boolean go(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(37754);
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
      AppMethodBeat.o(37754);
    while (true)
    {
      return bool;
      if (reo == null)
        cqk();
      if ((reo != null) && (!reo.isEmpty()))
      {
        Map localMap = br.z(paramString1, paramString2);
        if ((localMap == null) || (localMap.isEmpty()))
        {
          com.tencent.mm.sdk.platformtools.ab.w("AdLandingPagesParseHelper", "invalid landingpages xml,".concat(String.valueOf(paramString1)));
          AppMethodBeat.o(37754);
        }
        else
        {
          i.a locala = new i.a((byte)0);
          locala.rep = 0;
          locala.req = bo.ank((String)localMap.get(".adCanvasInfo.type"));
          locala.rer = bo.ank((String)localMap.get(".adCanvasInfo.subtype"));
          if (!reo.contains(locala))
          {
            com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "invalid canvas type ".concat(String.valueOf(locala)));
            AppMethodBeat.o(37754);
          }
          else
          {
            label575: label581: for (int i = 0; ; i++)
            {
              locala.rep = 1;
              if (i == 0);
              for (paramString1 = ".adCanvasInfo.PageList.Page"; ; paramString1 = ".adCanvasInfo.PageList.Page" + i)
              {
                if (!localMap.containsKey(paramString1 + ".componentItemList.componentItem.type"))
                  break label587;
                locala.req = bo.ank((String)localMap.get(paramString1 + ".type"));
                locala.rer = bo.ank((String)localMap.get(paramString1 + ".subType"));
                if (reo.contains(locala))
                  break label376;
                com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "invalid page type ".concat(String.valueOf(locala)));
                AppMethodBeat.o(37754);
                break;
              }
              label376: paramString2 = paramString1 + ".componentItemList.componentItem";
              locala.rep = 2;
              for (int j = 0; ; j++)
              {
                if (j == 0);
                for (paramString1 = paramString2; ; paramString1 = paramString2 + j)
                {
                  if (!localMap.containsKey(paramString1 + ".type"))
                    break label581;
                  locala.req = bo.ank((String)localMap.get(paramString1 + ".type"));
                  locala.rer = bo.ank((String)localMap.get(paramString1 + ".subType"));
                  if (reo.contains(locala))
                    break label575;
                  com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "invalid component type ".concat(String.valueOf(locala)));
                  AppMethodBeat.o(37754);
                  break;
                }
              }
            }
            label587: locala.rep = 2;
            paramString2 = localMap.entrySet().iterator();
            while (true)
              if (paramString2.hasNext())
              {
                Object localObject = (Map.Entry)paramString2.next();
                if ((((Map.Entry)localObject).getKey() != null) && (((String)((Map.Entry)localObject).getKey()).matches("[\\s\\S]*\\.componentItem[0-9]*\\.type$")))
                {
                  paramString1 = (String)((Map.Entry)localObject).getKey();
                  localObject = ((String)((Map.Entry)localObject).getKey()).replace(".type", ".subType");
                  locala.req = bo.ank((String)localMap.get(paramString1));
                  locala.rer = bo.ank((String)localMap.get(localObject));
                  if (!reo.contains(locala))
                  {
                    com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "invalid component type ".concat(String.valueOf(locala)));
                    AppMethodBeat.o(37754);
                    break;
                  }
                }
              }
            AppMethodBeat.o(37754);
            bool = true;
          }
        }
      }
      else
      {
        AppMethodBeat.o(37754);
      }
    }
  }

  public static String m(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(37748);
    URI localURI = new URI(paramString);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
      localStringBuilder.append(paramArrayOfString[j]).append("&");
    if (localStringBuilder.length() > 1)
    {
      paramArrayOfString = localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
      paramString = localURI.getQuery();
      if (paramString == null)
      {
        paramString = paramArrayOfString.toString();
        paramString = new URI(localURI.getScheme(), localURI.getAuthority(), localURI.getPath(), paramString, localURI.getFragment()).toString();
        AppMethodBeat.o(37748);
      }
    }
    while (true)
    {
      return paramString;
      paramString = paramString + "&" + paramArrayOfString.toString();
      break;
      AppMethodBeat.o(37748);
    }
  }

  public static String n(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(37749);
    String str1 = paramString;
    if (paramString == null)
      str1 = "";
    paramArrayOfString = TextUtils.join("&", paramArrayOfString);
    paramString = "?";
    if (str1.contains("?"))
      paramString = "&";
    if (str1.contains("#"));
    while (true)
    {
      try
      {
        int i = str1.indexOf("#");
        String str2 = str1.substring(0, i);
        String str3 = str1.substring(i + 1);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        paramString = str2 + paramString + paramArrayOfString + str3;
        str1 = paramString;
        AppMethodBeat.o(37749);
        return str1;
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "append url params failed, %s", new Object[] { paramString.toString() });
        AppMethodBeat.o(37749);
        continue;
      }
      str1 = str1 + paramString + paramArrayOfString;
      AppMethodBeat.o(37749);
    }
  }

  private static String v(String paramString, Map<String, String> paramMap)
  {
    String str1 = null;
    AppMethodBeat.i(37757);
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "the adLandingPagesXml is empty");
      AppMethodBeat.o(37757);
    }
    for (paramString = str1; ; paramString = str1)
    {
      return paramString;
      if ((paramMap != null) && (paramMap.size() != 0))
        break;
      com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "the mappedCanvasCardExt is empty");
      AppMethodBeat.o(37757);
    }
    LinkedList localLinkedList = gn(paramString, "adxml");
    Iterator localIterator1 = paramMap.keySet().iterator();
    label90: String str2;
    String str3;
    Iterator localIterator2;
    while (localIterator1.hasNext())
    {
      str2 = (String)localIterator1.next();
      if (!bo.isNullOrNil(str2))
      {
        str3 = (String)paramMap.get(str2);
        if (!bo.isNullOrNil(str3))
        {
          localIterator2 = localLinkedList.iterator();
          str1 = null;
        }
      }
    }
    label342: label344: 
    while (true)
    {
      if (localIterator2.hasNext())
      {
        Iterator localIterator3 = ((g)localIterator2.next()).rej.iterator();
        while (localIterator3.hasNext())
        {
          r localr = (r)localIterator3.next();
          if (((localr instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e)) && (!bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e)localr).kcM)) && (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e)localr).kcM.equals(str2)))
          {
            str1 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e)localr).kdB;
            label246: if (str1 == null)
              break label344;
          }
        }
      }
      while (true)
      {
        while (true)
        {
          if (bo.isNullOrNil(str1))
            break label342;
          com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "old card ext is " + str1 + " and new card ext is " + str3);
          paramString = paramString.replace(str1, str3);
          try
          {
            str1 = paramString.replace(bo.ani(str1), bo.ani(str3));
            paramString = str1;
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "the xml is error");
          }
        }
        break label90;
        AppMethodBeat.o(37757);
        break;
        break label246;
      }
      break label90;
    }
  }

  public static String y(com.tencent.mm.plugin.sns.storage.n paramn)
  {
    Object localObject = null;
    AppMethodBeat.i(37756);
    if (paramn == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "the snsinfo is null");
      AppMethodBeat.o(37756);
      paramn = localObject;
    }
    while (true)
    {
      return paramn;
      if (!paramn.DI(32))
      {
        com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "the snsinfo is not a ad");
        AppMethodBeat.o(37756);
        paramn = localObject;
      }
      else
      {
        com.tencent.mm.plugin.sns.storage.e locale = paramn.crd();
        if (locale == null)
        {
          com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "the adSnsInfo is null");
          AppMethodBeat.o(37756);
          paramn = localObject;
        }
        else
        {
          com.tencent.mm.plugin.sns.storage.b localb = paramn.cqo();
          if (localb == null)
          {
            com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "the adxml is null");
            AppMethodBeat.o(37756);
            paramn = localObject;
          }
          else
          {
            paramn = paramn.cqq();
            if (paramn == null)
            {
              com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "the adInfo is null");
              AppMethodBeat.o(37756);
              paramn = localObject;
            }
            else if (!localb.coK())
            {
              com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "the snsinfo is not a landingpage");
              AppMethodBeat.o(37756);
              paramn = localObject;
            }
            else if ((paramn.qTN == null) || (paramn.qTN.size() == 0))
            {
              com.tencent.mm.sdk.platformtools.ab.e("AdLandingPagesParseHelper", "the mappedCanvasCardExt is empty");
              AppMethodBeat.o(37756);
              paramn = localObject;
            }
            else
            {
              paramn = v(locale.field_adxml, paramn.qTN);
              AppMethodBeat.o(37756);
            }
          }
        }
      }
    }
  }

  public static boolean y(Intent paramIntent, Context paramContext)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(37751);
    String str1 = paramIntent.getStringExtra("sns_landing_pages_xml");
    String str2;
    boolean bool3;
    if (!TextUtils.isEmpty(str1))
      if ((!TextUtils.isEmpty(str1)) && (go(str1, "adCanvasInfo")))
      {
        str2 = "";
        bool3 = YN(str1);
        if (!bool3)
          break label226;
        str2 = com.tencent.mm.model.c.c.abj().getExpIdByKey("Sns_Canvas_GameShare_JumpWay");
        if (!TextUtils.isEmpty(str2))
        {
          int i = com.tencent.mm.model.c.c.abj().en("Sns_Canvas_GameShare_JumpWay", 0);
          com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "abtestvalue = ".concat(String.valueOf(i)));
          if (i != 0);
        }
      }
    while (true)
    {
      if (bool2)
      {
        paramIntent = new Intent(paramIntent);
        paramIntent.setClass(paramContext, SnsAdNativeLandingPagesUI.class);
        paramIntent.putExtra("sns_landing_pages_expid", str2);
        paramContext.startActivity(paramIntent);
        AppMethodBeat.o(37751);
        bool2 = bool1;
      }
      while (true)
      {
        return bool2;
        bool2 = true;
        break;
        bool2 = cqj();
        break;
        bool2 = b(str1, paramContext, bool3, paramIntent.getIntExtra("sns_landig_pages_from_source", -1));
        AppMethodBeat.o(37751);
        continue;
        com.tencent.mm.sdk.platformtools.ab.i("AdLandingPagesParseHelper", "invalid canvas xml %s", new Object[] { str1 });
        AppMethodBeat.o(37751);
        bool2 = false;
      }
      label226: bool2 = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i
 * JD-Core Version:    0.6.2
 */