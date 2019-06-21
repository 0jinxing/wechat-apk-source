package com.tencent.mm.plugin.sns.storage;

import android.graphics.Color;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b
{
  public String cHz;
  public String nickname;
  public String qTA;
  boolean qTJ;
  public int qUA;
  public int qUB;
  public long qUC;
  public Map<String, String> qUD;
  boolean qUE;
  public int qUF;
  public int qUG;
  public float qUH;
  public float qUI;
  public int qUJ;
  public int qUK;
  public int qUL;
  public String qUM;
  public float qUN;
  public float qUO;
  public float qUP;
  public float qUQ;
  public int qUR;
  public String qUS;
  public String qUT;
  public String qUU;
  public String qUV;
  public List<String> qUW;
  public b.e qUX;
  public b.c qUY;
  public b.a qUZ;
  public int qUe;
  public String qUf;
  public int qUg;
  public int qUh;
  public String qUi;
  public String qUj;
  public String qUk;
  public String qUl;
  public String qUm;
  public int qUn;
  public String qUo;
  public String qUp;
  public int qUq;
  public String qUr;
  public int qUs;
  public String qUt;
  public String qUu;
  public String qUv;
  public String qUw;
  public String qUx;
  public String qUy;
  public int qUz;
  public boolean qVa;
  public String qVb;
  public String qVc;
  public int qVd;
  public int qVe;
  public String qVf;
  private b.d qVg;
  public b.f qVh;

  public b(String paramString)
  {
    AppMethodBeat.i(36907);
    this.cHz = "";
    this.qUg = 0;
    this.qUh = 0;
    this.qUi = "";
    this.qUj = "";
    this.qUk = "";
    this.qUl = "";
    this.qUm = "";
    this.qUn = 0;
    this.qUo = "";
    this.qUp = "";
    this.qUq = 0;
    this.qUr = "";
    this.qUs = 0;
    this.qUt = "";
    this.qUu = "";
    this.qUv = "";
    this.qUw = "";
    this.qUx = "";
    this.qUy = "";
    this.qUD = new HashMap();
    this.qUW = new ArrayList();
    if ((!bo.isNullOrNil(paramString)) && (paramString.trim().startsWith("<RecXml")))
    {
      paramString = ah(paramString, ".RecXml", "RecXml");
      if ((paramString != null) && (!paramString.isEmpty()))
      {
        this.qUz = bo.ank((String)paramString.get(".RecXml.$type"));
        this.qUA = bo.ank((String)paramString.get(".RecXml.$source"));
        this.qUB = bo.ank((String)paramString.get(".RecXml.$expId"));
        this.qUC = i.Xq((String)paramString.get(".RecXml.$expOriginSnsId"));
      }
      AppMethodBeat.o(36907);
    }
    while (true)
    {
      return;
      ah(paramString, "", "adxml");
      AppMethodBeat.o(36907);
    }
  }

  private Map<String, String> ah(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36908);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString3)))
    {
      paramString1 = null;
      AppMethodBeat.o(36908);
    }
    while (true)
    {
      return paramString1;
      this.cHz = paramString1;
      ab.i("MicroMsg.ADXml", "feed xml %s, keyPrefix %s, tag %s", new Object[] { paramString1, paramString2, paramString3 });
      paramString3 = br.z(paramString1, paramString3);
      if (paramString3 != null)
        break;
      paramString1 = null;
      AppMethodBeat.o(36908);
    }
    this.qUe = bo.ank((String)paramString3.get(paramString2 + ".adxml.adType"));
    this.qUf = bo.bc((String)paramString3.get(paramString2 + ".adxml.adActionTitle"), "");
    this.qTA = bo.bc((String)paramString3.get(paramString2 + ".adxml.adActionLink"), "");
    this.nickname = bo.bc((String)paramString3.get(paramString2 + ".adxml.nickname"), "");
    this.qUg = bo.ank((String)paramString3.get(paramString2 + ".adxml.webviewRightBarShow"));
    this.qUh = bo.ank((String)paramString3.get(paramString2 + ".adxml.adActionLinkHidden"));
    this.qUi = bo.bc((String)paramString3.get(paramString2 + ".adxml.adActionLinkName"), "");
    this.qUj = bo.bc((String)paramString3.get(paramString2 + ".adxml.adActionLinkIcon"), "");
    this.qUk = bo.bc((String)paramString3.get(paramString2 + ".adxml.adActionLinkTitle.zh"), "");
    this.qUm = bo.bc((String)paramString3.get(paramString2 + ".adxml.adActionLinkTitle.tw"), "");
    this.qUl = bo.bc((String)paramString3.get(paramString2 + ".adxml.adActionLinkTitle.en"), "");
    this.qUo = bo.bc((String)paramString3.get(paramString2 + ".adxml.attachShareLinkWording"), "");
    this.qUp = bo.bc((String)paramString3.get(paramString2 + ".adxml.attachShareLinkUrl"), "");
    this.qUn = bo.ank((String)paramString3.get(paramString2 + ".adxml.attachShareLinkIsHidden"));
    if ((bo.isNullOrNil(this.qUo)) || (bo.isNullOrNil(this.qUp)))
      this.qUn = 1;
    this.qUt = bo.bc((String)paramString3.get(paramString2 + ".adxml.expandOutsideTitle.zh"), "");
    this.qUv = bo.bc((String)paramString3.get(paramString2 + ".adxml.expandOutsideTitle.tw"), "");
    this.qUu = bo.bc((String)paramString3.get(paramString2 + ".adxml.expandOutsideTitle.en"), "");
    this.qUw = bo.bc((String)paramString3.get(paramString2 + ".adxml.expandInsideTitle.zh"), "");
    this.qUy = bo.bc((String)paramString3.get(paramString2 + ".adxml.expandInsideTitle.tw"), "");
    this.qUx = bo.bc((String)paramString3.get(paramString2 + ".adxml.expandInsideTitle.en"), "");
    this.qUq = bo.ank((String)paramString3.get(paramString2 + ".adxml.headClickType"));
    this.qUr = bo.bc((String)paramString3.get(paramString2 + ".adxml.headClickParam"), "");
    this.qUs = bo.ank((String)paramString3.get(paramString2 + ".adxml.headClickRightBarShow"));
    int i = 0;
    Object localObject1 = new StringBuilder().append(paramString2).append(".adxml.adArgs.arg");
    label992: Object localObject2;
    Object localObject3;
    if (i == 0)
    {
      paramString1 = "";
      localObject1 = paramString1 + ".key";
      localObject2 = (String)paramString3.get(localObject1);
      if (localObject2 == null)
        break label1175;
      localObject3 = new StringBuilder().append(paramString2).append(".adxml.adArgs.arg");
      if (i != 0)
        break label1166;
    }
    label1166: for (paramString1 = ""; ; paramString1 = Integer.valueOf(i))
    {
      localObject3 = paramString1 + ".value";
      paramString1 = (String)paramString3.get(localObject3);
      ab.i("MicroMsg.ADXml", "newKey " + (String)localObject1 + " " + (String)localObject2 + " newValue : " + (String)localObject3 + " " + paramString1);
      this.qUD.put(localObject2, paramString1);
      i++;
      break;
      paramString1 = Integer.valueOf(i);
      break label992;
    }
    label1175: this.qTJ = paramString3.containsKey(paramString2 + ".adxml.adCanvasInfo");
    boolean bool;
    if (bo.ank((String)paramString3.get(paramString2 + ".adxml.usePreferedInfo")) == 1)
    {
      bool = true;
      this.qVa = bool;
      this.qVb = bo.nullAsNil((String)paramString3.get(paramString2 + ".adxml.preferNickname"));
      this.qVc = bo.nullAsNil((String)paramString3.get(paramString2 + ".adxml.preferAvatar"));
      this.qUF = bo.ank((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.contentDisplayType"));
      this.qUG = bo.ank((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaDisplayMode"));
      this.qUH = ((float)bo.anm((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaDisplayWidth")));
      this.qUI = ((float)bo.anm((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaDisplayHeight")));
      this.qUL = bo.ank((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.btnDisplayType"));
      this.qUM = bo.bc((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconUrl"), "");
      this.qUJ = bo.ank((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.basicRemWidth"));
      this.qUK = bo.ank((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.basicRootFontSize"));
      this.qUN = ((float)bo.anm((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconWidth")));
      this.qUO = ((float)bo.anm((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconHeight")));
      this.qUP = ((float)bo.anm((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconPaddingRight")));
      this.qUQ = ((float)bo.anm((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconPaddingBottom")));
      this.qUR = bo.ank((String)paramString3.get(paramString2 + ".adxml.adContentStyle"));
      this.qUS = bo.bc((String)paramString3.get(paramString2 + ".adxml.adCardInfo.title"), "");
      this.qUT = bo.bc((String)paramString3.get(paramString2 + ".adxml.adCardInfo.description"), "");
      i = 0;
      label1877: localObject1 = new StringBuilder().append(paramString2).append(".adxml.adCardInfo.adRatingCardInfo.tagList.tag");
      if (i != 0)
        break label1991;
    }
    label1991: for (paramString1 = ""; ; paramString1 = Integer.valueOf(i))
    {
      paramString1 = paramString1;
      if (!paramString3.containsKey(paramString1))
        break label2000;
      ab.i("MicroMsg.ADXml", "card ad tag %s", new Object[] { paramString3.get(paramString1) });
      if (!bo.isNullOrNil((String)paramString3.get(paramString1)))
        this.qUW.add(paramString3.get(paramString1));
      i++;
      break label1877;
      bool = false;
      break;
    }
    label2000: this.qUU = bo.nullAsNil((String)paramString3.get(paramString2 + ".adxml.adCardInfo.adRatingCardInfo.headTitle"));
    this.qUV = bo.nullAsNil((String)paramString3.get(paramString2 + ".adxml.adCardInfo.adRatingCardInfo.headUrl"));
    paramString1 = bo.bc((String)paramString3.get(paramString2 + ".adxml.adSelectInfo.leftBtnTitle"), "");
    localObject1 = bo.bc((String)paramString3.get(paramString2 + ".adxml.adSelectInfo.rightBtnTitle"), "");
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty((CharSequence)localObject1)))
    {
      this.qVg = new b.d(this);
      this.qVg.qVq = paramString1;
      this.qVg.qVr = ((String)localObject1);
    }
    paramString1 = bo.bc((String)paramString3.get(paramString2 + ".adxml.adVoteInfo.componentUrl"), "");
    if (!TextUtils.isEmpty(paramString1))
    {
      this.qVh = new b.f(this);
      this.qVh.qVu = paramString1;
      localObject1 = paramString2 + ".adxml.adVoteInfo.optionList.option";
      i = 0;
      label2274: if (i == 0)
        break label3241;
    }
    label3241: for (paramString1 = (String)localObject1 + i; ; paramString1 = (String)localObject1)
    {
      if (!TextUtils.isEmpty(bo.bc((String)paramString3.get(paramString1 + ".title"), "")))
      {
        localObject2 = new b.g(this);
        ((b.g)localObject2).title = bo.bc((String)paramString3.get(paramString1 + ".title"), "");
        ((b.g)localObject2).lvA = bo.bc((String)paramString3.get(paramString1 + ".shareTitle"), "");
        ((b.g)localObject2).qVw = bo.bc((String)paramString3.get(paramString1 + ".shareDesc"), "");
        ((b.g)localObject2).qVx = bo.bc((String)paramString3.get(paramString1 + ".shareThumb"), "");
        ((b.g)localObject2).qVy = bo.bc((String)paramString3.get(paramString1 + ".selectedTitle"), "");
        this.qVh.qVv.add(localObject2);
        i++;
        break label2274;
      }
      this.qUE = paramString3.containsKey(paramString2 + ".adxml.adTurnCanvasInfo");
      this.qUX = new b.e();
      this.qUX.r(paramString3, paramString2);
      this.qUZ = new b.a().q(paramString3, paramString2);
      if (this.qUR == 3)
      {
        this.qUY = new b.c();
        localObject1 = paramString2 + ".adxml.adFullCardInfo";
        paramString1 = this.qUY;
        paramString1.qVk = bo.ank((String)paramString3.get((String)localObject1 + ".displayType"));
        paramString1.title = bo.nullAsNil((String)paramString3.get((String)localObject1 + ".title"));
        paramString1.description = bo.nullAsNil((String)paramString3.get((String)localObject1 + ".description"));
        paramString1.qVl = bo.getInt((String)paramString3.get((String)localObject1 + ".markMaxAlpha"), 30);
        paramString1.qVm = bo.ank((String)paramString3.get((String)localObject1 + ".titlePosition"));
        if (!bo.isNullOrNil((String)paramString3.get((String)localObject1 + ".adGestureInfo.points")))
        {
          paramString1.qVn = new c.a();
          paramString1.qVn.color = -1;
          paramString1.qVn.startTime = bo.ank((String)paramString3.get((String)localObject1 + ".adGestureInfo.startTime"));
          paramString1.qVn.endTime = bo.ank((String)paramString3.get((String)localObject1 + ".adGestureInfo.endTime"));
          paramString1.qVn.qVo = bo.ann((String)paramString3.get((String)localObject1 + ".adGestureInfo.distance"));
          paramString1.qVn.color = Color.parseColor(bo.nullAsNil((String)paramString3.get((String)localObject1 + ".adGestureInfo.color")));
          paramString1.qVn.qVp = bo.nullAsNil((String)paramString3.get((String)localObject1 + ".adGestureInfo.points"));
        }
      }
      this.qVd = bo.ank((String)paramString3.get(paramString2 + ".adxml.compatible.clientVersion.androidMin"));
      this.qVe = bo.ank((String)paramString3.get(paramString2 + ".adxml.compatible.clientVersion.androidMax"));
      this.qVf = bo.nullAsNil((String)paramString3.get(paramString2 + ".adxml.compatible.jumpUrl"));
      AppMethodBeat.o(36908);
      paramString1 = paramString3;
      break;
    }
  }

  public final boolean coK()
  {
    if ((this.qTJ) || (this.qUE));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String coL()
  {
    AppMethodBeat.i(36909);
    String str;
    if (coR())
    {
      str = this.qVg.qVq;
      AppMethodBeat.o(36909);
    }
    while (true)
    {
      return str;
      if (coS())
      {
        str = ((b.g)this.qVh.qVv.get(0)).title;
        AppMethodBeat.o(36909);
      }
      else
      {
        str = "";
        AppMethodBeat.o(36909);
      }
    }
  }

  public final String coM()
  {
    AppMethodBeat.i(36910);
    String str;
    if (coR())
    {
      str = this.qVg.qVr;
      AppMethodBeat.o(36910);
    }
    while (true)
    {
      return str;
      if (coS())
      {
        str = ((b.g)this.qVh.qVv.get(1)).title;
        AppMethodBeat.o(36910);
      }
      else
      {
        str = "";
        AppMethodBeat.o(36910);
      }
    }
  }

  public final String coN()
  {
    AppMethodBeat.i(36911);
    String str;
    if (coS())
    {
      str = this.qVh.qVu;
      AppMethodBeat.o(36911);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(36911);
    }
  }

  public final boolean coO()
  {
    if (this.qUR == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean coP()
  {
    boolean bool = true;
    if (this.qUR == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean coQ()
  {
    if (this.qUR == 3);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean coR()
  {
    if (this.qVg != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean coS()
  {
    boolean bool = true;
    AppMethodBeat.i(36912);
    if ((this.qVh != null) && (this.qVh.qVv.size() > 1))
      AppMethodBeat.o(36912);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36912);
    }
  }

  public final String coT()
  {
    AppMethodBeat.i(36913);
    String str1 = this.cHz;
    String str2 = str1;
    if (str1.contains("<adCanvasInfoLeft>"))
      str2 = str1.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("(?s)<adCanvasInfoRight[^>]*>.*?</adCanvasInfoRight>", "").replaceAll("adCanvasInfoLeft", "adCanvasInfo");
    AppMethodBeat.o(36913);
    return str2;
  }

  public final String coU()
  {
    AppMethodBeat.i(36914);
    String str1 = this.cHz;
    String str2 = str1;
    if (str1.contains("<adCanvasInfoRight>"))
      str2 = str1.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("(?s)<adCanvasInfoLeft[^>]*>.*?</adCanvasInfoLeft>", "").replaceAll("adCanvasInfoRight", "adCanvasInfo");
    AppMethodBeat.o(36914);
    return str2;
  }

  public final String coV()
  {
    AppMethodBeat.i(36915);
    String str1 = this.cHz;
    String str2 = str1;
    if (str1.contains("<adTurnCanvasInfo>"))
      str2 = str1.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("adTurnCanvasInfo", "adCanvasInfo");
    AppMethodBeat.o(36915);
    return str2;
  }

  public final String coW()
  {
    AppMethodBeat.i(36916);
    String str = this.cHz;
    if ((this.qUY != null) && (str.contains("<adFullCardGestureCanvasInfo>")));
    for (str = str.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("adFullCardGestureCanvasInfo", "adCanvasInfo"); ; str = "")
    {
      AppMethodBeat.o(36916);
      return str;
    }
  }

  public final boolean coX()
  {
    if (this.qUA == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static final class c$a
  {
    public int color;
    public long endTime;
    public float qVo;
    public String qVp;
    public long startTime;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.b
 * JD-Core Version:    0.6.2
 */