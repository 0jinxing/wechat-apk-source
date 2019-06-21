package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.d.b.c;
import com.tencent.mm.aj.q;
import com.tencent.mm.g.a.ed;
import com.tencent.mm.g.a.mu;
import com.tencent.mm.g.a.mu.a;
import com.tencent.mm.g.a.mv;
import com.tencent.mm.g.a.mv.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.c;
import com.tencent.mm.model.u;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.pluginsdk.r.a;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.e;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bq;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.chatting.c.c.a;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class ChatFooterCustom extends LinearLayout
  implements View.OnClickListener, bz.a
{
  private ad cFn;
  private String igi;
  private Object kbe;
  private LinearLayout lfQ;
  private com.tencent.mm.aj.d pkW;
  private ChatFooter.e vmZ;
  private int yHA;
  private bq yHB;
  private ChatFooterCustom.a yHC;
  private ChatFooterCustom.b yHD;
  private List<String> yHE;
  private final String yHF;
  private final String yHG;
  private com.tencent.mm.aj.j yHH;
  private ImageView yHv;
  public ImageView yHw;
  public LinearLayout yHx;
  public g yHy;
  private c.a yHz;
  private MMFragment ymV;

  public ChatFooterCustom(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ChatFooterCustom(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(30473);
    this.lfQ = null;
    this.yHv = null;
    this.yHw = null;
    this.yHx = null;
    this.yHy = null;
    this.vmZ = null;
    this.yHz = null;
    this.yHA = 0;
    this.yHE = new LinkedList();
    this.yHF = "qrcode";
    this.yHG = "barcode";
    this.kbe = new Object();
    AppMethodBeat.o(30473);
  }

  private static String Oh(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "";
    case 0:
    case 1:
    }
    while (true)
    {
      return str;
      str = "qrcode";
      continue;
      str = "barcode";
    }
  }

  private boolean a(com.tencent.mm.aj.j paramj)
  {
    AppMethodBeat.i(30481);
    boolean bool;
    if (paramj == null)
    {
      AppMethodBeat.o(30481);
      bool = false;
      return bool;
    }
    String str = paramj.id + paramj.key;
    paramj = this.kbe;
    for (int i = 0; ; i = -1)
      try
      {
        while (true)
          if (i < this.yHE.size())
          {
            if (((String)this.yHE.get(i)).equals(str))
            {
              if (i < 0)
                break label156;
              this.yHE.remove(i);
              ab.e("ChatCustomFooter", "removeOneFromMenuClickCmdList success %s %d", new Object[] { str, Integer.valueOf(this.yHE.size()) });
              AppMethodBeat.o(30481);
              bool = true;
              break;
            }
            i++;
            continue;
            label156: ab.e("ChatCustomFooter", "removeOneFromMenuClickCmdList fail %s %d", new Object[] { str, Integer.valueOf(this.yHE.size()) });
            AppMethodBeat.o(30481);
            bool = false;
            break;
          }
      }
      finally
      {
        AppMethodBeat.o(30481);
      }
  }

  private void b(com.tencent.mm.aj.j paramj)
  {
    AppMethodBeat.i(30482);
    com.tencent.mm.plugin.report.service.h.pYm.e(10809, new Object[] { this.igi, Integer.valueOf(paramj.id), paramj.key, com.tencent.mm.aj.j.fwo, "" });
    AppMethodBeat.o(30482);
  }

  private void c(com.tencent.mm.aj.j paramj)
  {
    AppMethodBeat.i(30483);
    com.tencent.mm.plugin.report.service.h.pYm.e(10809, new Object[] { this.igi, Integer.valueOf(paramj.id), paramj.key, com.tencent.mm.aj.j.fwq, paramj.content });
    AppMethodBeat.o(30483);
  }

  private boolean cN(Object paramObject)
  {
    AppMethodBeat.i(30485);
    if (!(paramObject instanceof mu))
    {
      ab.e("ChatCustomFooter", "send current location data type error!");
      AppMethodBeat.o(30485);
    }
    while (true)
    {
      return true;
      Object localObject = (mu)paramObject;
      double d1 = ((mu)localObject).cII.lat;
      double d2 = ((mu)localObject).cII.lng;
      int i = ((mu)localObject).cII.cED;
      paramObject = ((mu)localObject).cII.label;
      localObject = ((mu)localObject).cII.cIK;
      ab.i("ChatCustomFooter", "lat:%f , lng:%f , scale: %d , label:%s , poiname:%s", new Object[] { Double.valueOf(d1), Double.valueOf(d2), Integer.valueOf(i), paramObject, localObject });
      if ((this.yHH == null) || (this.yHH.fws != 105))
      {
        ab.e("ChatCustomFooter", "cache lost or location type is not correct");
        AppMethodBeat.o(30485);
      }
      else
      {
        this.yHH.state = com.tencent.mm.aj.j.fwq;
        this.yHH.a(d1, d2, i, paramObject, (String)localObject);
        if (a(this.yHH))
        {
          d(this.yHH);
          c(this.yHH);
        }
        AppMethodBeat.o(30485);
      }
    }
  }

  private boolean cO(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(30486);
    if (!(paramObject instanceof mv))
    {
      ab.e("ChatCustomFooter", "send current location data type error!");
      AppMethodBeat.o(30486);
    }
    while (true)
    {
      return bool;
      Object localObject = (mv)paramObject;
      if ((this.yHH == null) || ((this.yHH.fws != 100) && (this.yHH.fws != 101)))
      {
        ab.e("ChatCustomFooter", "null pointer in cache or type error");
        AppMethodBeat.o(30486);
      }
      else
      {
        paramObject = Oh(((mv)localObject).cIL.cIN);
        localObject = ((mv)localObject).cIL.scanResult;
        ab.i("ChatCustomFooter", "scan type: %s , scan result:%s", new Object[] { paramObject, localObject });
        this.yHH.state = com.tencent.mm.aj.j.fwq;
        this.yHH.az(paramObject, (String)localObject);
        if (a(this.yHH))
        {
          d(this.yHH);
          c(this.yHH);
        }
        AppMethodBeat.o(30486);
        bool = true;
      }
    }
  }

  private void d(com.tencent.mm.aj.j paramj)
  {
    AppMethodBeat.i(30487);
    ab.i("ChatCustomFooter", paramj.getInfo());
    paramj = new q(this.igi, paramj.getInfo());
    aw.Rg().a(paramj, 0);
    AppMethodBeat.o(30487);
  }

  private void dBS()
  {
    AppMethodBeat.i(30476);
    if ((this.ymV != null) && (this.cFn != null) && (!ah.isNullOrNil(this.igi)))
      n.b(this.ymV, 9, this.igi, this.cFn.field_username);
    AppMethodBeat.o(30476);
  }

  private void dBT()
  {
    AppMethodBeat.i(30477);
    File localFile = new File(com.tencent.mm.compatible.util.e.euR);
    if ((!localFile.exists()) && (!localFile.mkdir()))
    {
      Toast.makeText((Activity)getContext(), getContext().getString(2131298250), 1).show();
      AppMethodBeat.o(30477);
    }
    while (true)
    {
      return;
      if ((this.ymV != null) && (!n.a(this.ymV, com.tencent.mm.compatible.util.e.euR, "microMsg." + System.currentTimeMillis() + ".jpg")))
        Toast.makeText((Activity)getContext(), getContext().getString(2131302908), 1).show();
      AppMethodBeat.o(30477);
    }
  }

  private void dBV()
  {
    AppMethodBeat.i(30490);
    ab.i("ChatCustomFooter", "switch footer");
    if (this.vmZ != null)
    {
      this.yHy.dBX();
      this.vmZ.oS(true);
    }
    AppMethodBeat.o(30490);
  }

  private void dBW()
  {
    AppMethodBeat.i(30491);
    if (this.cFn == null)
      AppMethodBeat.o(30491);
    while (true)
    {
      return;
      if (this.cFn.duk == 1)
      {
        aw.ZK();
        c.XR().ape(this.cFn.field_username);
      }
      AppMethodBeat.o(30491);
    }
  }

  private String getSender()
  {
    AppMethodBeat.i(30478);
    Object localObject = new StringBuilder("getSender ");
    boolean bool;
    if (this.yHB == null)
    {
      bool = true;
      StringBuilder localStringBuilder = ((StringBuilder)localObject).append(bool).append(" ");
      if (this.yHB != null)
        break label86;
      localObject = com.tencent.mm.model.r.Yz();
      label49: ab.i("ChatCustomFooter", (String)localObject);
      if (this.yHB != null)
        break label97;
      localObject = com.tencent.mm.model.r.Yz();
      AppMethodBeat.o(30478);
    }
    while (true)
    {
      return localObject;
      bool = false;
      break;
      label86: localObject = this.yHB.name;
      break label49;
      label97: localObject = this.yHB.name;
      AppMethodBeat.o(30478);
    }
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(30489);
    parama = aa.a(parama.eAB.vED);
    ab.i("ChatCustomFooter", "SysCmdMsgExtension:".concat(String.valueOf(parama)));
    Object localObject;
    try
    {
      localObject = XmlPullParserFactory.newInstance();
      ((XmlPullParserFactory)localObject).setNamespaceAware(true);
      localObject = ((XmlPullParserFactory)localObject).newPullParser();
      StringReader localStringReader = new java/io/StringReader;
      localStringReader.<init>(parama);
      ((XmlPullParser)localObject).setInput(localStringReader);
      int i = ((XmlPullParser)localObject).getEventType();
      if (i != 1)
      {
        switch (i)
        {
        case 1:
        default:
        case 0:
        case 2:
        }
        while (true)
        {
          i = ((XmlPullParser)localObject).next();
          break;
          parama = ((XmlPullParser)localObject).getName();
          if (!"sysmsg".equals(parama))
            break label179;
          if ("type".equals(((XmlPullParser)localObject).getAttributeName(0)))
            ((XmlPullParser)localObject).getAttributeValue(0);
        }
      }
    }
    catch (Exception parama)
    {
      ab.printErrStackTrace("ChatCustomFooter", parama, "", new Object[0]);
      AppMethodBeat.o(30489);
    }
    while (true)
    {
      return;
      label179: if ("username".equals(parama))
      {
        ((XmlPullParser)localObject).nextText();
        break;
      }
      if (!"data".equals(parama))
        break;
      ((XmlPullParser)localObject).nextText();
      break;
      AppMethodBeat.o(30489);
    }
  }

  public final void a(MMFragment paramMMFragment, com.tencent.mm.aj.d paramd, String paramString)
  {
    AppMethodBeat.i(30474);
    d.b.c localc = paramd.cJ(false).aeo();
    if ((localc == null) || (localc.fvL == null) || (paramString == null))
    {
      paramMMFragment = new IllegalArgumentException(" menuInfo or username is null ! ");
      AppMethodBeat.o(30474);
      throw paramMMFragment;
    }
    this.yHA = Math.min(localc.fvL.size(), 6);
    ab.i("ChatCustomFooter", "setMenus, count:" + this.yHA);
    if (this.yHA <= 0)
    {
      paramMMFragment = new IllegalArgumentException(" mTabCount is invalid ! ");
      AppMethodBeat.o(30474);
      throw paramMMFragment;
    }
    int i;
    label157: FrameLayout localFrameLayout;
    TextView localTextView;
    ImageView localImageView;
    if (this.yHA > 3)
    {
      this.yHv.setVisibility(0);
      this.lfQ.setWeightSum(Math.min(this.yHA, 3));
      i = 0;
      if (i >= 6)
        break label375;
      localFrameLayout = (FrameLayout)this.lfQ.getChildAt(i);
      localTextView = (TextView)localFrameLayout.findViewById(2131822432);
      localFrameLayout.findViewById(2131822431).setVisibility(8);
      localImageView = (ImageView)localFrameLayout.getChildAt(2);
      localImageView.setVisibility(8);
      if (i >= this.yHA)
        break label316;
      com.tencent.mm.aj.j localj = (com.tencent.mm.aj.j)localc.fvL.get(i);
      localFrameLayout.setTag(localj);
      localTextView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(getContext(), localj.name));
      if (localj.type == 0)
        localImageView.setVisibility(0);
      localFrameLayout.setOnClickListener(this);
      localFrameLayout.setVisibility(0);
    }
    while (true)
    {
      i++;
      break label157;
      this.yHv.setVisibility(8);
      break;
      label316: if ((i >= 3) && (this.yHA > 3))
      {
        localFrameLayout.setTag(null);
        localTextView.setText("");
        localImageView.setVisibility(8);
        localFrameLayout.setOnClickListener(null);
        localFrameLayout.setVisibility(0);
      }
      else
      {
        localFrameLayout.setVisibility(8);
      }
    }
    label375: this.ymV = paramMMFragment;
    this.igi = paramString;
    this.pkW = paramd;
    if (this.yHC != null)
      com.tencent.mm.sdk.b.a.xxA.d(this.yHC);
    if (this.yHD != null)
      com.tencent.mm.sdk.b.a.xxA.d(this.yHD);
    this.yHC = new ChatFooterCustom.a(this, (byte)0);
    this.yHD = new ChatFooterCustom.b(this, (byte)0);
    com.tencent.mm.sdk.b.a.xxA.c(this.yHC);
    com.tencent.mm.sdk.b.a.xxA.c(this.yHD);
    AppMethodBeat.o(30474);
  }

  public final void ctm()
  {
    AppMethodBeat.i(30475);
    if (this.yHC != null)
      com.tencent.mm.sdk.b.a.xxA.d(this.yHC);
    if (this.yHD != null)
      com.tencent.mm.sdk.b.a.xxA.d(this.yHD);
    AppMethodBeat.o(30475);
  }

  public final void dBU()
  {
    AppMethodBeat.i(30479);
    if (this.yHy != null)
      this.yHy.dBX();
    AppMethodBeat.o(30479);
  }

  public ad getTalker()
  {
    return this.cFn;
  }

  public String getTalkerUserName()
  {
    if (this.cFn == null);
    for (String str = null; ; str = this.cFn.field_username)
      return str;
  }

  public void onClick(View arg1)
  {
    Object localObject1 = null;
    while (true)
    {
      Object localObject3;
      try
      {
        AppMethodBeat.i(30480);
        localObject3 = ???.getTag();
        if (!(localObject3 instanceof com.tencent.mm.aj.j))
        {
          AppMethodBeat.o(30480);
          return;
        }
        i.Lt(8);
        localObject3 = (com.tencent.mm.aj.j)localObject3;
        ((com.tencent.mm.aj.j)localObject3).content = "";
        switch (((com.tencent.mm.aj.j)localObject3).type)
        {
        default:
          AppMethodBeat.o(30480);
          continue;
        case 0:
        case 2:
        case 3:
        case 1:
        case 5:
        case 4:
        }
      }
      finally
      {
      }
      localObject1 = new int[2];
      ???.getLocationOnScreen((int[])localObject1);
      ab.i("ChatCustomFooter", "show/dismiss submenu, pos:(%d, %d), view width:%d", new Object[] { Integer.valueOf(localObject1[0]), Integer.valueOf(localObject1[1]), Integer.valueOf(???.getWidth()) });
      Object localObject4 = this.yHy;
      int i = localObject1[0] + ???.getWidth() / 2;
      int j = localObject1[1];
      if (!((g)localObject4).isShowing())
      {
        ((g)localObject4).a((com.tencent.mm.aj.j)localObject3, i, j);
        AppMethodBeat.o(30480);
      }
      else
      {
        ((g)localObject4).dBX();
        if ((localObject3 != null) && ((((g)localObject4).yHP.id != ((com.tencent.mm.aj.j)localObject3).id) || (!((g)localObject4).yHP.key.equals(((com.tencent.mm.aj.j)localObject3).key))))
          ((g)localObject4).a((com.tencent.mm.aj.j)localObject3, i, j);
        AppMethodBeat.o(30480);
        continue;
        ab.i("ChatCustomFooter", "start webview url");
        dBW();
        this.yHy.dBX();
        ((com.tencent.mm.aj.j)localObject3).state = com.tencent.mm.aj.j.fwo;
        b((com.tencent.mm.aj.j)localObject3);
        d((com.tencent.mm.aj.j)localObject3);
        if ((!r.a.vax.c(getContext(), ((com.tencent.mm.aj.j)localObject3).value, new Object[0])) && (!e.a(((com.tencent.mm.aj.j)localObject3).cRS, getContext(), this.ymV, this.igi)))
        {
          ??? = new android/content/Intent;
          ???.<init>();
          ???.putExtra("KPublisherId", "custom_menu");
          ???.putExtra("pre_username", this.igi);
          ???.putExtra("prePublishId", "custom_menu");
          ???.putExtra("preUsername", this.igi);
          ???.putExtra("preChatName", this.igi);
          ???.putExtra("preChatTYPE", u.ad(this.igi, this.igi));
          ???.putExtra("rawUrl", ((com.tencent.mm.aj.j)localObject3).value);
          ???.putExtra("geta8key_username", this.igi);
          ???.putExtra("from_scence", 1);
          com.tencent.mm.bp.d.b(getContext(), "webview", ".ui.tools.WebViewUI", ???);
          AppMethodBeat.o(30480);
          continue;
          ab.i("ChatCustomFooter", "switch to input");
          this.yHy.dBX();
          dBV();
          ((com.tencent.mm.aj.j)localObject3).state = com.tencent.mm.aj.j.fwo;
          b((com.tencent.mm.aj.j)localObject3);
          d((com.tencent.mm.aj.j)localObject3);
          AppMethodBeat.o(30480);
          continue;
          ab.i("ChatCustomFooter", "get latest message");
          dBW();
          this.yHy.dBX();
          ((com.tencent.mm.aj.j)localObject3).state = com.tencent.mm.aj.j.fwo;
          b((com.tencent.mm.aj.j)localObject3);
          d((com.tencent.mm.aj.j)localObject3);
          this.yHz.dDC();
          AppMethodBeat.o(30480);
          continue;
          dBW();
          this.yHy.dBX();
          ((com.tencent.mm.aj.j)localObject3).state = com.tencent.mm.aj.j.fwo;
          b((com.tencent.mm.aj.j)localObject3);
          d((com.tencent.mm.aj.j)localObject3);
          boolean bool = TextUtils.isEmpty(((com.tencent.mm.aj.j)localObject3).value);
          if (!bool)
          {
            try
            {
              ??? = new org/json/JSONObject;
              ???.<init>(((com.tencent.mm.aj.j)localObject3).value);
              localObject4 = new com/tencent/mm/plugin/appbrand/report/AppBrandStatObject;
              ((AppBrandStatObject)localObject4).<init>();
              ((AppBrandStatObject)localObject4).scene = 1035;
              ((AppBrandStatObject)localObject4).cst = this.igi;
              localObject3 = (com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class);
              Context localContext = getContext();
              String str1 = ???.optString("userName");
              String str2 = ???.optString("pagePath");
              if (this.pkW == null);
              for (??? = (View)localObject1; ; ??? = this.pkW.field_appId)
              {
                ((com.tencent.mm.plugin.appbrand.service.e)localObject3).a(localContext, str1, null, 0, 0, str2, (AppBrandStatObject)localObject4, ???);
                AppMethodBeat.o(30480);
                break;
              }
            }
            catch (JSONException )
            {
              AppMethodBeat.o(30480);
            }
            continue;
            ab.i("ChatCustomFooter", "MM_BIZ_CUSTOM_MENU_TYPE_CUSTOM_CLICK");
            dBW();
            this.yHy.dBX();
            ((com.tencent.mm.aj.j)localObject3).state = com.tencent.mm.aj.j.fwp;
            ??? = new java/lang/StringBuilder;
            ???.<init>();
            localObject1 = ((com.tencent.mm.aj.j)localObject3).id + ((com.tencent.mm.aj.j)localObject3).key;
            synchronized (this.kbe)
            {
              this.yHE.add(localObject1);
              ab.i("ChatCustomFooter", "addToMenuClickCmdList %s %d", new Object[] { localObject1, Integer.valueOf(this.yHE.size()) });
              com.tencent.mm.plugin.report.service.h.pYm.e(10809, new Object[] { this.igi, Integer.valueOf(((com.tencent.mm.aj.j)localObject3).id), ((com.tencent.mm.aj.j)localObject3).key, com.tencent.mm.aj.j.fwp, "" });
              this.yHH = ((com.tencent.mm.aj.j)localObject3);
              switch (((com.tencent.mm.aj.j)localObject3).fws)
              {
              default:
                break;
              case 100:
                ??? = new android/content/Intent;
                ???.<init>();
                ???.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
                ???.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
                ???.putExtra("key_is_finish_on_scanned", true);
                ???.putExtra("key_is_hide_right_btn", true);
                if (com.tencent.mm.r.a.bI(getContext()))
                  continue;
                getContext();
                if (com.tencent.mm.bg.e.akI())
                  continue;
                com.tencent.mm.bp.d.b(getContext(), "scanner", ".ui.BaseScanUI", ???);
                AppMethodBeat.o(30480);
              case 101:
              case 102:
              case 103:
              case 104:
              case 105:
              case 106:
              case 107:
              }
            }
            ??? = new android/content/Intent;
            ???.<init>();
            ???.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
            ???.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
            ???.putExtra("key_is_finish_on_scanned", false);
            ???.putExtra("key_is_hide_right_btn", true);
            if (!com.tencent.mm.r.a.bI(getContext()))
            {
              getContext();
              if (!com.tencent.mm.bg.e.akI())
              {
                com.tencent.mm.bp.d.b(getContext(), "scanner", ".ui.BaseScanUI", ???);
                AppMethodBeat.o(30480);
                continue;
                dBT();
                AppMethodBeat.o(30480);
                continue;
                aw.ZK();
                if (!c.isSDCardAvailable())
                {
                  t.hO(getContext());
                  AppMethodBeat.o(30480);
                }
                else
                {
                  localObject4 = getContext().getString(2131298084);
                  ??? = getContext().getString(2131298083);
                  localObject3 = getContext();
                  ChatFooterCustom.1 local1 = new com/tencent/mm/ui/chatting/ChatFooterCustom$1;
                  local1.<init>(this);
                  com.tencent.mm.ui.base.h.a((Context)localObject3, null, new String[] { localObject4, ??? }, null, local1);
                  AppMethodBeat.o(30480);
                  continue;
                  dBS();
                  AppMethodBeat.o(30480);
                  continue;
                  ??? = new android/content/Intent;
                  ???.<init>();
                  ???.putExtra("map_view_type", 0);
                  ???.putExtra("map_sender_name", getSender());
                  ???.putExtra("map_talker_name", getTalkerUserName());
                  ???.putExtra("view_type_key", 1);
                  ???.putExtra("key_get_location_type", 1);
                  com.tencent.mm.bp.d.b(getContext(), "location", ".ui.RedirectUI", ???);
                  AppMethodBeat.o(30480);
                  continue;
                  ??? = new com/tencent/mm/g/a/ed;
                  ???.<init>();
                  ???.cxE.op = 1;
                  ???.cxE.userName = this.cFn.field_username;
                  ???.cxE.context = getContext();
                  com.tencent.mm.sdk.b.a.xxA.m(???);
                  AppMethodBeat.o(30480);
                  continue;
                  ??? = new com/tencent/mm/g/a/ed;
                  ???.<init>();
                  ???.cxE.op = 2;
                  ???.cxE.userName = this.cFn.field_username;
                  ???.cxE.context = getContext();
                  com.tencent.mm.sdk.b.a.xxA.m(???);
                }
              }
            }
          }
        }
      }
    }
  }

  public final boolean r(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(30484);
    if (paramObject == null)
    {
      ab.e("ChatCustomFooter", "returned data is null, maybe serve for UI");
      AppMethodBeat.o(30484);
    }
    while (true)
    {
      label24: return true;
      switch (paramInt)
      {
      default:
      case 201:
      case 203:
      case 217:
      }
      while (true)
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(30484);
          break label24;
          paramInt = 1001;
          continue;
          paramInt = 1002;
        case 1001:
        case 1002:
        case 1005:
        case 1006:
        case 1003:
        case 1004:
        }
      ab.i("ChatCustomFooter", "return from camera");
      if (!(paramObject instanceof Intent))
      {
        ab.e("ChatCustomFooter", "type error");
        AppMethodBeat.o(30484);
      }
      else
      {
        paramObject = ((Intent)paramObject).getStringExtra("CropImage_OutputPath");
        if (paramObject == null)
        {
          ab.e("ChatCustomFooter", "return null path");
          AppMethodBeat.o(30484);
        }
        else
        {
          Object localObject1 = new File(paramObject);
          if ((((File)localObject1).exists()) && (((File)localObject1).isFile()))
          {
            ab.i("ChatCustomFooter", "%s retrieved!", new Object[] { paramObject });
            localObject1 = com.tencent.mm.a.g.v((File)localObject1);
            ab.i("ChatCustomFooter", "MD5 is %s", new Object[] { localObject1 });
            if ((this.yHH == null) || ((this.yHH.fws != 102) && (this.yHH.fws != 103)))
            {
              ab.e("ChatCustomFooter", "camera photo cache lost or temp type error! cannot pass info!");
              AppMethodBeat.o(30484);
            }
            else
            {
              paramObject = new ArrayList();
              paramObject.add(localObject1);
              this.yHH.state = com.tencent.mm.aj.j.fwq;
              this.yHH.g(paramObject);
              if (a(this.yHH))
              {
                d(this.yHH);
                c(this.yHH);
              }
            }
          }
          else
          {
            while (true)
            {
              AppMethodBeat.o(30484);
              break;
              ab.e("ChatCustomFooter", "%s cannot be retrieved as file or is directory!!", new Object[] { paramObject });
            }
            ab.i("ChatCustomFooter", "return from albumn");
            if (!(paramObject instanceof Intent))
            {
              ab.e("ChatCustomFooter", "type error");
              AppMethodBeat.o(30484);
            }
            else
            {
              localObject1 = ((Intent)paramObject).getStringArrayListExtra("CropImage_OutputPath_List");
              paramObject = new ArrayList();
              if ((localObject1 != null) && (((ArrayList)localObject1).size() != 0))
              {
                localObject1 = ((ArrayList)localObject1).iterator();
                while (((Iterator)localObject1).hasNext())
                {
                  String str = (String)((Iterator)localObject1).next();
                  ab.i("ChatCustomFooter", "retrieving bitmap path %s", new Object[] { str });
                  if (str != null)
                  {
                    Object localObject2 = new File(str);
                    if ((((File)localObject2).exists()) && (((File)localObject2).isFile()))
                    {
                      ab.i("ChatCustomFooter", "%s retrieved!", new Object[] { str });
                      localObject2 = com.tencent.mm.a.g.v((File)localObject2);
                      paramObject.add(localObject2);
                      ab.i("ChatCustomFooter", "MD5 is %s", new Object[] { localObject2 });
                    }
                  }
                  else
                  {
                    ab.e("ChatCustomFooter", "no file contained!");
                    continue;
                    ab.e("ChatCustomFooter", "%s cannot be retrieved as file or is directory!!", new Object[] { str });
                  }
                }
                if ((this.yHH == null) || ((this.yHH.fws != 104) && (this.yHH.fws != 103) && (this.yHH.fws != 102)))
                {
                  ab.e("ChatCustomFooter", "albumn photo cache lost or temp type error! cannot pass info!");
                  AppMethodBeat.o(30484);
                }
                else
                {
                  this.yHH.state = com.tencent.mm.aj.j.fwq;
                  this.yHH.g(paramObject);
                  if (a(this.yHH))
                  {
                    d(this.yHH);
                    c(this.yHH);
                  }
                }
              }
              else
              {
                AppMethodBeat.o(30484);
                continue;
                ab.i("ChatCustomFooter", "send current");
                cN(paramObject);
                AppMethodBeat.o(30484);
                continue;
                ab.i("ChatCustomFooter", "send selected");
                cN(paramObject);
                AppMethodBeat.o(30484);
                continue;
                ab.i("ChatCustomFooter", "send qrcode wait msg");
                if (!cO(paramObject))
                {
                  AppMethodBeat.o(30484);
                }
                else
                {
                  this.yHz.dDC();
                  AppMethodBeat.o(30484);
                  continue;
                  ab.i("ChatCustomFooter", "send qrcode direct");
                  cO(paramObject);
                  AppMethodBeat.o(30484);
                }
              }
            }
          }
        }
      }
    }
  }

  public void setOnFooterSwitchListener(ChatFooter.e parame)
  {
    this.vmZ = parame;
  }

  public void setOnProcessClickListener(c.a parama)
  {
    this.yHz = parama;
  }

  public void setTalker(ad paramad)
  {
    this.cFn = paramad;
  }

  public final void u(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(30488);
    this.lfQ = ((LinearLayout)findViewById(2131822436));
    this.yHx = ((LinearLayout)findViewById(2131822434));
    this.yHx.setVisibility(0);
    this.yHw = ((ImageView)findViewById(2131822435));
    this.yHw.setVisibility(0);
    this.yHw.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(30464);
        ChatFooterCustom.c(ChatFooterCustom.this);
        AppMethodBeat.o(30464);
      }
    });
    this.yHv = ((ImageView)findViewById(2131822437));
    this.yHv.setOnClickListener(new ChatFooterCustom.3(this));
    this.yHy = new g(getContext(), paramViewGroup);
    this.yHy.yHJ = new ChatFooterCustom.4(this);
    AppMethodBeat.o(30488);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChatFooterCustom
 * JD-Core Version:    0.6.2
 */