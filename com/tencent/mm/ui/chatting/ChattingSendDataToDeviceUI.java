package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.e;
import com.tencent.mm.g.a.dd;
import com.tencent.mm.g.a.do;
import com.tencent.mm.g.a.do.b;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.a.ew;
import com.tencent.mm.g.a.ew.a;
import com.tencent.mm.g.a.id;
import com.tencent.mm.g.a.id.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXLocationObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.HorizontalListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public class ChattingSendDataToDeviceUI extends MMActivity
{
  private j.b cJM;
  boolean cxS;
  private long edW;
  String eov;
  String filePath;
  private bi kua;
  private String lsy;
  private HorizontalListView voK;
  private boolean yFW;
  boolean yGE;
  private ChattingSendDataToDeviceUI.b yKA;
  private List<ChattingSendDataToDeviceUI.c> yKB;
  private List<f> yKC;
  private long yKD;
  private boolean yKE;
  boolean yKF;
  boolean yKG;
  int yKH;
  int yKI;
  private HashMap<String, View> yKJ;
  private HashMap<String, ChattingSendDataToDeviceUI.c> yKK;
  private Map<Integer, View> yKL;
  private Map<String, Integer> yKM;
  WXMediaMessage yKN;
  private com.tencent.mm.sdk.b.c yKO;
  private com.tencent.mm.sdk.b.c yKP;
  private HorizontalListView yKr;
  private b yKs;
  private a yKt;
  private int yKu;
  private String yKv;
  private RelativeLayout yKw;
  private RelativeLayout yKx;
  private TextView yKy;
  private Boolean yKz;

  public ChattingSendDataToDeviceUI()
  {
    AppMethodBeat.i(30787);
    this.yKv = "";
    this.yKz = Boolean.FALSE;
    this.yKB = new ArrayList();
    this.yKC = new ArrayList();
    this.yKD = 0L;
    this.yKE = true;
    this.cxS = false;
    this.yKF = false;
    this.yKG = true;
    this.yKH = 2;
    this.yKI = -1;
    this.yKJ = new HashMap();
    this.yKK = new HashMap();
    this.yKL = new HashMap();
    this.yKM = new HashMap();
    this.yKN = null;
    this.filePath = null;
    this.eov = null;
    this.yGE = false;
    this.yKO = new ChattingSendDataToDeviceUI.10(this);
    this.yKP = new ChattingSendDataToDeviceUI.2(this);
    AppMethodBeat.o(30787);
  }

  private static boolean a(ChattingSendDataToDeviceUI.c paramc, long paramLong)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(30798);
    if (paramLong == -1L)
      AppMethodBeat.o(30798);
    String str;
    int i;
    Object localObject;
    while (true)
    {
      return bool1;
      str = paramc.cxR;
      aw.ZK();
      bi localbi = com.tencent.mm.model.c.XO().jf(paramLong);
      if ((localbi.field_msgId == 0L) || (str == null))
      {
        AppMethodBeat.o(30798);
      }
      else
      {
        i = localbi.getType();
        localObject = localbi.field_content;
        if (!localbi.bAA())
          break label246;
        localObject = j.b.me((String)localObject);
        if (localObject != null)
          break;
        ab.e("MicroMsg.ChattingSendDataToDeviceUI", "get content is null");
        AppMethodBeat.o(30798);
      }
    }
    if (((j.b)localObject).type == 3)
    {
      if (!str.contains("wxmsg_music"))
        break label193;
      bool1 = bool2;
    }
    while (true)
    {
      AppMethodBeat.o(30798);
      break;
      if (((j.b)localObject).type == 4)
      {
        bool1 = false;
      }
      else if (((j.b)localObject).type == 6)
      {
        bool1 = bool2;
        if (str.contains("wxmsg_file"));
      }
      else
      {
        label193: label246: 
        do
        {
          do
          {
            do
            {
              do
              {
                bool1 = false;
                break;
                if (((j.b)localObject).type == 5)
                {
                  bool1 = a(((j.b)localObject).url, paramc);
                  break;
                }
              }
              while ((((j.b)localObject).type != 2) || (!str.contains("wxmsg_image")));
              bool1 = bool2;
              break;
              if (i != 3)
                break label269;
            }
            while (!str.contains("wxmsg_image"));
            bool1 = bool2;
            break;
            if (i != 48)
              break label293;
          }
          while (!str.contains("wxmsg_poi"));
          bool1 = bool2;
          break;
        }
        while ((i != 62) || (!str.contains("wxmsg_video")));
        label269: label293: bool1 = bool2;
      }
    }
  }

  private static boolean a(ChattingSendDataToDeviceUI.c paramc, String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(30795);
    if (paramString == null)
      AppMethodBeat.o(30795);
    Object localObject;
    int i;
    while (true)
    {
      return bool1;
      localObject = new id();
      ((id)localObject).cDc.cwT = paramString;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      paramString = ((id)localObject).cDd.cDe;
      i = paramString.xfI.wbJ;
      ab.i("MicroMsg.ChattingSendDataToDeviceUI", "isNeedToShowSnsInfo contentStyle %d", new Object[] { Integer.valueOf(i) });
      localObject = paramc.cxR;
      if (localObject != null)
        break;
      ab.e("MicroMsg.ChattingSendDataToDeviceUI", "ability is null");
      AppMethodBeat.o(30795);
    }
    if (i == 1)
    {
      if (!((String)localObject).contains("wxmsg_image"))
        break label162;
      bool1 = bool2;
    }
    while (true)
    {
      AppMethodBeat.o(30795);
      break;
      if (i == 4)
      {
        bool1 = bool2;
        if (((String)localObject).contains("wxmsg_music"));
      }
      else
      {
        label162: label190: 
        do
        {
          do
          {
            bool1 = false;
            break;
            if (i != 15)
              break label190;
          }
          while (!((String)localObject).contains("wxmsg_video"));
          bool1 = bool2;
          break;
        }
        while (i != 3);
        bool1 = a(paramString.xfI.Url, paramc);
      }
    }
  }

  private static boolean a(String paramString, ChattingSendDataToDeviceUI.c paramc)
  {
    boolean bool1 = false;
    AppMethodBeat.i(30794);
    Object localObject = paramc.cxR;
    paramc = paramc.yLc;
    paramString = Uri.parse(paramString).getHost();
    boolean bool2 = bool1;
    if (paramc != null)
    {
      bool2 = bool1;
      if (paramc.length() > 0)
      {
        bool2 = bool1;
        if (localObject != null)
        {
          bool2 = bool1;
          if (!((String)localObject).contains("wxmsg_url"));
        }
      }
    }
    try
    {
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramc);
      localObject = ((JSONObject)localObject).getJSONArray("wxmsg_url");
      int i = ((JSONArray)localObject).length();
      for (int j = 0; ; j++)
      {
        bool2 = bool1;
        if (j < i)
        {
          bool2 = ((JSONArray)localObject).getString(j).equals(paramString);
          if (bool2)
            bool2 = true;
        }
        else
        {
          AppMethodBeat.o(30794);
          return bool2;
        }
      }
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ChattingSendDataToDeviceUI", paramString, paramc, new Object[0]);
        bool2 = bool1;
      }
    }
  }

  private void dCu()
  {
    AppMethodBeat.i(30792);
    if ((this.yKs == null) || (this.yKD == 0L))
    {
      if (this.yKs == null);
      for (boolean bool = true; ; bool = false)
      {
        ab.e("MicroMsg.ChattingSendDataToDeviceUI", "mAppInfoAdapter is null %s, contentFlag %s", new Object[] { Boolean.valueOf(bool), Long.valueOf(this.yKD) });
        if (this.yKx != null)
          this.yKx.setVisibility(8);
        AppMethodBeat.o(30792);
        return;
      }
    }
    this.yKC = com.tencent.mm.pluginsdk.model.app.g.b(this, this.yKD, false);
    if ((!com.tencent.mm.pluginsdk.model.app.g.o(this, this.yKD)) && (this.yKx != null))
      this.yKx.setVisibility(8);
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((this.yKC != null) && (this.yKC.size() > 0))
    {
      localObject1 = am.dhO().mb(this.yKD);
      if ((localObject1 != null) && (((List)localObject1).size() > 0))
        Collections.sort(this.yKC, new ChattingSendDataToDeviceUI.4(this, (List)localObject1));
      localObject2 = this.yKC.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (f)((Iterator)localObject2).next();
        localObject1 = new z();
        ((z)localObject1).appId = ((f)localObject3).field_appId;
        ((z)localObject1).eoz = ((f)localObject3).field_appName;
        ((z)localObject1).iconUrl = ((f)localObject3).field_appIconUrl;
        localArrayList.add(localObject1);
      }
    }
    if (this.yKN == null)
    {
      localObject2 = null;
      localObject3 = null;
      switch (this.kua.getType())
      {
      default:
        localObject1 = localObject3;
      case 49:
      case 1:
      case 3:
      case 48:
      case 43:
      }
    }
    while (true)
    {
      this.yKN = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject1);
      this.yKN.sdkVer = 620954368;
      if ((this.eov != null) && (this.filePath != null) && (localObject1 != null) && ((localObject1 instanceof WXFileObject)))
        this.yGE = true;
      label399: this.yKs.yGE = this.yGE;
      this.yKs.bw(localArrayList);
      this.yKs.notifyDataSetChanged();
      AppMethodBeat.o(30792);
      break;
      localObject1 = localObject3;
      if (this.cJM != null)
        if (this.cJM.type == 3)
        {
          localObject1 = new WXMusicObject();
          ((WXMusicObject)localObject1).musicUrl = this.cJM.url;
          ((WXMusicObject)localObject1).musicDataUrl = this.cJM.fgM;
          ((WXMusicObject)localObject1).musicLowBandUrl = this.cJM.fgn;
          ((WXMusicObject)localObject1).musicLowBandDataUrl = this.cJM.fgN;
        }
        else if (this.cJM.type == 4)
        {
          localObject1 = new WXVideoObject();
          ((WXVideoObject)localObject1).videoUrl = this.cJM.url;
          ((WXVideoObject)localObject1).videoLowBandUrl = this.cJM.fgN;
        }
        else if (this.cJM.type == 5)
        {
          localObject1 = new WXWebpageObject(this.cJM.url);
        }
        else
        {
          if (this.cJM.type == 6)
          {
            localObject3 = am.aUq().aiE(this.cJM.csD);
            if (localObject3 != null)
            {
              ab.i("MicroMsg.ChattingSendDataToDeviceUI", "getWXMediaMessage fileFullPath %s", new Object[] { ((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath });
              localObject1 = new WXFileObject(((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath);
              this.filePath = ((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath;
              this.eov = this.cJM.fgp;
            }
            while (q.aiR(this.filePath) != null)
            {
              com.tencent.mm.ui.base.h.bQ(this, getString(2131298233));
              finish();
              break label399;
              ab.e("MicroMsg.ChattingSendDataToDeviceUI", "getWXMediaMessage attInfo is null");
              localObject1 = localObject2;
            }
          }
          localObject1 = localObject3;
          if (this.cJM.type == 2)
          {
            localObject1 = new WXImageObject();
            localObject2 = com.tencent.mm.at.o.ahl().w(this.kua);
            if (localObject2 != null)
            {
              ((WXImageObject)localObject1).imagePath = com.tencent.mm.at.o.ahl().sj(((e)localObject2).fDz);
              if (bo.isNullOrNil(((WXImageObject)localObject1).imagePath))
                ((WXImageObject)localObject1).imagePath = com.tencent.mm.at.o.ahl().sj(((e)localObject2).fDB);
            }
            this.filePath = ((WXImageObject)localObject1).imagePath;
            this.eov = this.cJM.fgp;
            ab.i("MicroMsg.ChattingSendDataToDeviceUI", "getWXMediaMessage imagePath %s", new Object[] { ((WXImageObject)localObject1).imagePath });
            continue;
            localObject1 = new WXTextObject(this.kua.field_content);
            continue;
            localObject1 = new WXImageObject();
            localObject2 = com.tencent.mm.at.o.ahl().w(this.kua);
            int i;
            if (localObject2 != null)
            {
              ((WXImageObject)localObject1).imagePath = com.tencent.mm.at.o.ahl().sj(((e)localObject2).fDz);
              if (bo.isNullOrNil(((WXImageObject)localObject1).imagePath))
                ((WXImageObject)localObject1).imagePath = com.tencent.mm.at.o.ahl().sj(((e)localObject2).fDB);
              if (!bo.isNullOrNil(((WXImageObject)localObject1).imagePath))
              {
                this.filePath = ((WXImageObject)localObject1).imagePath;
                i = ((WXImageObject)localObject1).imagePath.lastIndexOf(".");
                if ((i >= 0) && (i < ((WXImageObject)localObject1).imagePath.length() - 1))
                  this.eov = ((WXImageObject)localObject1).imagePath.substring(i + 1);
              }
            }
            ab.i("MicroMsg.ChattingSendDataToDeviceUI", "getWXMediaMessage imagePath %s", new Object[] { ((WXImageObject)localObject1).imagePath });
            continue;
            aw.ZK();
            localObject1 = com.tencent.mm.model.c.XO().Ro(this.kua.field_content);
            localObject1 = new WXLocationObject(((bi.b)localObject1).nJu, ((bi.b)localObject1).nJv);
            continue;
            localObject2 = new WXVideoObject();
            com.tencent.mm.modelvideo.o.all();
            localObject3 = com.tencent.mm.modelvideo.t.uh(this.kua.field_imgPath);
            localObject1 = localObject2;
            if (localObject3 != null)
            {
              ((WXVideoObject)localObject2).videoUrl = ((String)localObject3);
              this.filePath = ((String)localObject3);
              i = ((String)localObject3).lastIndexOf(".");
              localObject1 = localObject2;
              if (i >= 0)
              {
                localObject1 = localObject2;
                if (i < ((String)localObject3).length() - 1)
                {
                  this.eov = ((String)localObject3).substring(i + 1);
                  localObject1 = localObject2;
                }
              }
            }
          }
        }
    }
  }

  private void dCv()
  {
    AppMethodBeat.i(30793);
    Object localObject1 = new do();
    Object localObject2;
    int i;
    if (this.cxS)
    {
      localObject2 = getIntent().getExtras().getString("sns_send_data_ui_image_path");
      i = getIntent().getExtras().getInt("sns_send_data_ui_image_position");
      ((do)localObject1).cwR.cwT = this.lsy;
      ((do)localObject1).cwR.cwU = ((String)localObject2);
      ((do)localObject1).cwR.cwV = i;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      if (!((do)localObject1).cwS.cwB)
        break label421;
      localObject1 = ((do)localObject1).cwS.cwW;
      int j = ((List)localObject1).size();
      i = 0;
      label112: if (i >= j)
        break label358;
      localObject2 = new ChattingSendDataToDeviceUI.c(this);
      ((ChattingSendDataToDeviceUI.c)localObject2).cws = ((String)((Map)((List)localObject1).get(i)).get("deviceType"));
      ((ChattingSendDataToDeviceUI.c)localObject2).deviceID = ((String)((Map)((List)localObject1).get(i)).get("deviceID"));
      ((ChattingSendDataToDeviceUI.c)localObject2).eoz = ((String)((Map)((List)localObject1).get(i)).get("displayName"));
      ((ChattingSendDataToDeviceUI.c)localObject2).iconUrl = ((String)((Map)((List)localObject1).get(i)).get("iconUrl"));
      ((ChattingSendDataToDeviceUI.c)localObject2).cxR = ((String)((Map)((List)localObject1).get(i)).get("ability"));
      ((ChattingSendDataToDeviceUI.c)localObject2).yLc = ((String)((Map)((List)localObject1).get(i)).get("abilityInf"));
      if ((!this.cxS) || (!a((ChattingSendDataToDeviceUI.c)localObject2, this.lsy)))
        break label326;
      this.yKB.add(localObject2);
    }
    while (true)
    {
      i++;
      break label112;
      ((do)localObject1).cwR.cvx = this.edW;
      break;
      label326: if ((!this.cxS) && (a((ChattingSendDataToDeviceUI.c)localObject2, this.edW)))
        this.yKB.add(localObject2);
    }
    label358: if (this.yKB.size() > 0)
    {
      ab.d("MicroMsg.ChattingSendDataToDeviceUI", "update data mListHardDeviceOnline");
      this.yKt.bw(this.yKB);
      if (this.yKt.getCount() > 0)
      {
        this.yKy.setText(2131298071);
        this.yKE = false;
      }
      this.yKt.notifyDataSetChanged();
    }
    label421: AppMethodBeat.o(30793);
  }

  private static String na(long paramLong)
  {
    AppMethodBeat.i(30790);
    String str1 = "";
    aw.ZK();
    Object localObject = com.tencent.mm.model.c.XO().jf(paramLong);
    String str2;
    if (((cy)localObject).field_msgId == 0L)
    {
      str2 = "";
      AppMethodBeat.o(30790);
    }
    while (true)
    {
      return str2;
      String str3 = ((cy)localObject).field_content;
      str2 = str1;
      if (((bi)localObject).getType() == 49)
      {
        localObject = j.b.me(str3);
        str2 = str1;
        if (localObject != null)
        {
          str2 = str1;
          if (((j.b)localObject).type == 6)
            str2 = ((j.b)localObject).fgp;
        }
      }
      AppMethodBeat.o(30790);
    }
  }

  private void uP(int paramInt)
  {
    AppMethodBeat.i(30789);
    if (this.cxS)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(13197, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.yKI), "", Integer.valueOf(2), Integer.valueOf(this.yKH) });
      AppMethodBeat.o(30789);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.e(13197, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.yKI), na(this.edW), Integer.valueOf(1), Integer.valueOf(this.yKH) });
      AppMethodBeat.o(30789);
    }
  }

  public final void arb(String paramString)
  {
    AppMethodBeat.i(30797);
    try
    {
      int i = ((Integer)this.yKM.get(paramString)).intValue();
      aq localaq = (aq)((View)this.yKL.get(Integer.valueOf(i))).getTag();
      ab.d("MicroMsg.ChattingSendDataToDeviceUI", "set progress to success now: %s deviceId %s", new Object[] { Integer.valueOf(localaq.yMM.getProgress()), paramString });
      ChattingSendDataToDeviceUI.c localc = (ChattingSendDataToDeviceUI.c)this.yKK.get(paramString);
      Object localObject = new com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$7;
      ((ChattingSendDataToDeviceUI.7)localObject).<init>(this, localaq, localc);
      runOnUiThread((Runnable)localObject);
      int j = Math.abs(localaq.yMM.getProgress());
      localc.progress = j;
      if (j >= 100);
      for (i = 0; ; i = 500 / (100 - j))
      {
        ab.d("MicroMsg.ChattingSendDataToDeviceUI", "sleepTime %d", new Object[] { Integer.valueOf(i) });
        localObject = new com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$8;
        ((ChattingSendDataToDeviceUI.8)localObject).<init>(this, j, localaq, paramString, localc, i);
        d.h((Runnable)localObject, "progressSuccess_handler").start();
        this.yKK.put(localc.deviceID, localc);
        AppMethodBeat.o(30797);
        return;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.ChattingSendDataToDeviceUI", "ap: set progress to success exception %s", new Object[] { paramString });
        AppMethodBeat.o(30797);
      }
    }
  }

  public final ChattingSendDataToDeviceUI.b dCw()
  {
    AppMethodBeat.i(30803);
    if (this.yKA == null)
      this.yKA = new ChattingSendDataToDeviceUI.b(this);
    ChattingSendDataToDeviceUI.b localb = this.yKA;
    AppMethodBeat.o(30803);
    return localb;
  }

  public final int getLayoutId()
  {
    return 2130969121;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(30801);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, true, 2131298926, 2131298927, 1);
    AppMethodBeat.o(30801);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(30796);
    if (this.yKJ.size() > 0)
    {
      com.tencent.mm.ui.widget.a.c.a locala = new com.tencent.mm.ui.widget.a.c.a(this);
      locala.PZ(2131298236);
      locala.Qc(2131298238).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(30766);
          Iterator localIterator = ChattingSendDataToDeviceUI.b(ChattingSendDataToDeviceUI.this).keySet().iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            paramAnonymousDialogInterface = new dd();
            paramAnonymousDialogInterface.cwo.ceI = str;
            com.tencent.mm.sdk.b.a.xxA.m(paramAnonymousDialogInterface);
          }
          ChattingSendDataToDeviceUI.this.finish();
          AppMethodBeat.o(30766);
        }
      });
      locala.Qd(2131298237).b(new ChattingSendDataToDeviceUI.6(this));
      locala.aMb().show();
      AppMethodBeat.o(30796);
    }
    while (true)
    {
      return;
      super.onBackPressed();
      AppMethodBeat.o(30796);
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(30791);
    super.onConfigurationChanged(paramConfiguration);
    do localdo = new do();
    if (this.cxS)
    {
      paramConfiguration = getIntent().getExtras().getString("sns_send_data_ui_image_path");
      int i = getIntent().getExtras().getInt("sns_send_data_ui_image_position");
      localdo.cwR.cwT = this.lsy;
      localdo.cwR.cwU = paramConfiguration;
      localdo.cwR.cwV = i;
    }
    while (true)
    {
      com.tencent.mm.sdk.b.a.xxA.m(localdo);
      if ((localdo.cwS.cwB) && (this.yKB.size() > 0))
      {
        ab.d("MicroMsg.ChattingSendDataToDeviceUI", "online device size %d", new Object[] { Integer.valueOf(this.yKB.size()) });
        this.yKt.bw(this.yKB);
        if (this.yKt.getCount() > 0)
        {
          this.yKy.setText(2131298071);
          this.yKE = false;
        }
        this.yKt.notifyDataSetChanged();
      }
      AppMethodBeat.o(30791);
      return;
      localdo.cwR.cvx = this.edW;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 6;
    AppMethodBeat.i(30788);
    super.onCreate(paramBundle);
    this.cxS = getIntent().getExtras().getBoolean("sns_send_data_ui_activity", false);
    ab.i("MicroMsg.ChattingSendDataToDeviceUI", "isSnsMsg:" + this.cxS);
    if (!this.cxS)
    {
      this.edW = getIntent().getExtras().getLong("Retr_Msg_Id");
      if (this.edW != -1L)
      {
        aw.ZK();
        this.kua = com.tencent.mm.model.c.XO().jf(this.edW);
        if ((this.kua != null) && (this.kua.field_msgId != 0L))
          break label538;
      }
    }
    this.yKH = getIntent().getExtras().getInt("exdevice_open_scene_type", 2);
    this.yKF = false;
    setFinishOnTouchOutside(true);
    this.yKB.clear();
    this.yKK.clear();
    this.yKw = ((RelativeLayout)findViewById(2131822701));
    paramBundle = new dq();
    label258: String str;
    if (this.cxS)
    {
      this.lsy = getIntent().getExtras().getString("sns_local_id");
      if (this.lsy != null)
      {
        paramBundle.cxc.cwT = this.lsy;
        ab.i("MicroMsg.ChattingSendDataToDeviceUI", "mSnsLocalId: %s", new Object[] { this.lsy });
      }
      com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
      if (!paramBundle.cxd.cwB)
        break label1235;
      this.yKz = Boolean.TRUE;
      com.tencent.mm.sdk.b.a.xxA.c(this.yKO);
      com.tencent.mm.sdk.b.a.xxA.c(this.yKP);
      this.yKw.setVisibility(0);
      this.voK = ((HorizontalListView)findViewById(2131821698));
      this.yKy = ((TextView)findViewById(2131822702));
      this.yKy.setText(2131298224);
      this.yKt = new a(this);
      this.voK.setAdapter(this.yKt);
      this.voK.setOnItemClickListener(new ChattingSendDataToDeviceUI.1(this));
      dCv();
      if (!this.cxS)
        break label1043;
      str = this.lsy;
      if (str == null)
        break label1038;
      paramBundle = new id();
      paramBundle.cDc.cwT = str;
      com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
      i = paramBundle.cDd.cDe.xfI.wbJ;
      if (i != 1)
        break label1006;
      i = 3;
      label455: this.yKI = i;
      uP(1);
    }
    while (true)
    {
      this.yKx = ((RelativeLayout)findViewById(2131822706));
      this.yKr = ((HorizontalListView)findViewById(2131822708));
      this.yKs = new b(this);
      this.yKr.setOnItemClickListener(new ChattingSendDataToDeviceUI.3(this));
      this.yKr.setAdapter(this.yKs);
      AppMethodBeat.o(30788);
      return;
      label538: this.yKu = this.kua.getType();
      this.yFW = com.tencent.mm.model.t.kH(this.kua.field_talker);
      this.yKv = this.kua.field_content;
      int j;
      if ((this.yFW) && (this.kua.field_isSend == 0))
      {
        str = this.kua.field_content;
        j = this.kua.field_isSend;
        paramBundle = str;
        if (this.yFW)
        {
          paramBundle = str;
          if (str != null)
          {
            paramBundle = str;
            if (j == 0)
              paramBundle = bf.oz(str);
          }
        }
        this.yKv = paramBundle;
      }
      if (this.kua.getType() == 49)
      {
        this.cJM = j.b.me(this.yKv);
        if (this.cJM == null)
        {
          ab.e("MicroMsg.ChattingSendDataToDeviceUI", "initParams content is null");
          break;
        }
        if (this.cJM.type == 3)
          this.yKD = 16L;
      }
      while (true)
      {
        ab.i("MicroMsg.ChattingSendDataToDeviceUI", "contentFlag: %s", new Object[] { Long.valueOf(this.yKD) });
        break;
        if (this.cJM.type == 4)
        {
          this.yKD = 8L;
        }
        else if (this.cJM.type == 5)
        {
          this.yKD = 32L;
        }
        else
        {
          if (this.cJM.type == 6)
          {
            paramBundle = com.tencent.mm.pluginsdk.c.a.aik(this.cJM.fgp);
            if (paramBundle == null)
            {
              ab.e("MicroMsg.ChattingSendDataToDeviceUI", "initParams TYPE_FILE getContentTypeFlag null");
              break;
            }
            this.yKD = paramBundle.longValue();
            continue;
          }
          if (this.cJM.type == 2)
          {
            this.yKD = 2L;
            paramBundle = com.tencent.mm.at.o.ahl().w(this.kua);
            if (paramBundle != null)
              this.yKv = paramBundle.fDK;
          }
          else
          {
            ab.e("MicroMsg.ChattingSendDataToDeviceUI", "initParams APPMSG not support type");
            break;
            if (this.kua.getType() == 3)
            {
              paramBundle = com.tencent.mm.at.o.ahl().w(this.kua);
              if (paramBundle != null)
                this.yKv = paramBundle.fDK;
            }
            while (true)
            {
              paramBundle = com.tencent.mm.pluginsdk.c.a.aik(this.yKu);
              if (paramBundle != null)
                break label981;
              ab.e("MicroMsg.ChattingSendDataToDeviceUI", "initParams not appmsg getContentTypeFlag null");
              break;
              if (this.kua.getType() == 43)
              {
                paramBundle = com.tencent.mm.modelvideo.o.all().uf(this.kua.field_imgPath);
                if (paramBundle != null)
                  this.yKv = paramBundle.alw();
              }
            }
            label981: this.yKD = paramBundle.longValue();
          }
        }
      }
      paramBundle.cxc.cvx = this.edW;
      break label258;
      label1006: if (i == 4)
      {
        i = 1;
        break label455;
      }
      if (i == 15)
      {
        i = 6;
        break label455;
      }
      if (i == 3)
      {
        i = 5;
        break label455;
      }
      label1038: i = 0;
      break label455;
      label1043: long l = this.edW;
      if ((l == -1L) || (l == -9223372036854775808L))
        i = 0;
      label1202: 
      while (true)
      {
        this.yKI = i;
        break;
        aw.ZK();
        paramBundle = com.tencent.mm.model.c.XO().jf(l);
        if (paramBundle.field_msgId != 0L)
        {
          j = paramBundle.getType();
          str = paramBundle.field_content;
          if (!paramBundle.bAA())
            break label1202;
          paramBundle = j.b.me(str);
          if (paramBundle != null)
            break label1141;
          ab.e("MicroMsg.ChattingSendDataToDeviceUI", "get content is null");
        }
        label1141: 
        do
        {
          do
          {
            i = 0;
            break;
            if (paramBundle.type == 3)
            {
              i = 1;
              break;
            }
            if (paramBundle.type == 4)
              break;
            if (paramBundle.type == 6)
            {
              i = 4;
              break;
            }
            if (paramBundle.type == 2)
            {
              i = 3;
              break;
            }
          }
          while (paramBundle.type != 5);
          i = 5;
          break;
          if (j == 3)
          {
            i = 3;
            break;
          }
          if (j == 48)
          {
            i = 2;
            break;
          }
        }
        while (j != 62);
      }
      label1235: this.yKw.setVisibility(8);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(30802);
    super.onDestroy();
    ab.i("MicroMsg.ChattingSendDataToDeviceUI", "onDestroy...");
    this.yKG = false;
    if (this.yKz.booleanValue())
    {
      if (!this.yKF)
        uP(2);
      com.tencent.mm.sdk.b.a.xxA.d(this.yKO);
      com.tencent.mm.sdk.b.a.xxA.d(this.yKP);
      ew localew = new ew();
      com.tencent.mm.sdk.b.a.xxA.m(localew);
      if (localew.cyq.cxT)
        ab.i("MicroMsg.ChattingSendDataToDeviceUI", "Stop scan Network success!");
    }
    AppMethodBeat.o(30802);
  }

  public void onPause()
  {
    AppMethodBeat.i(30800);
    super.onPause();
    AppMethodBeat.o(30800);
  }

  public void onResume()
  {
    AppMethodBeat.i(30799);
    super.onResume();
    dCu();
    RelativeLayout.LayoutParams localLayoutParams;
    int i;
    float f;
    if (this.yKz.booleanValue())
    {
      localLayoutParams = (RelativeLayout.LayoutParams)this.voK.getLayoutParams();
      i = localLayoutParams.height;
      f = com.tencent.mm.bz.a.dm(this);
      if (f != 1.125F)
        break label84;
    }
    for (localLayoutParams.height = (i + getResources().getDimensionPixelSize(2131427786)); ; localLayoutParams.height = (i + getResources().getDimensionPixelSize(2131427812)))
      label84: 
      do
      {
        this.voK.setLayoutParams(localLayoutParams);
        AppMethodBeat.o(30799);
        return;
      }
      while ((f != 1.375F) && (f != 1.25F) && (f != 1.625F));
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends BaseAdapter
  {
    private Context context;
    private com.tencent.mm.at.a.a.c lyr;
    private List<Map<String, ChattingSendDataToDeviceUI.c>> yGD;
    private Map<String, ChattingSendDataToDeviceUI.c> yKY;

    public a(Context arg2)
    {
      AppMethodBeat.i(30777);
      Object localObject;
      this.context = localObject;
      this.yGD = new ArrayList();
      this$1 = new com.tencent.mm.at.a.a.c.a();
      ChattingSendDataToDeviceUI.this.ePT = 2130839645;
      this.lyr = ChattingSendDataToDeviceUI.this.ahG();
      AppMethodBeat.o(30777);
    }

    public final ChattingSendDataToDeviceUI.c Op(int paramInt)
    {
      AppMethodBeat.i(30780);
      ChattingSendDataToDeviceUI.c localc = (ChattingSendDataToDeviceUI.c)((Map)this.yGD.get(paramInt)).get("hard_device_info");
      AppMethodBeat.o(30780);
      return localc;
    }

    public final void bw(List<ChattingSendDataToDeviceUI.c> paramList)
    {
      AppMethodBeat.i(30778);
      this.yGD.clear();
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        this.yKY = new HashMap();
        this.yKY.put("hard_device_info", paramList.get(j));
        this.yGD.add(this.yKY);
      }
      AppMethodBeat.o(30778);
    }

    public final int getCount()
    {
      AppMethodBeat.i(30779);
      int i = this.yGD.size();
      AppMethodBeat.o(30779);
      return i;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(30781);
      ChattingSendDataToDeviceUI.c localc = Op(paramInt);
      ab.d("MicroMsg.ChattingSendDataToDeviceUI", "position = %d, getCount() = %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(getCount()) });
      int i;
      int j;
      StringBuffer localStringBuffer;
      float f;
      label255: int k;
      label258: String str2;
      if (ChattingSendDataToDeviceUI.c(ChattingSendDataToDeviceUI.this).get(Integer.valueOf(paramInt)) == null)
      {
        paramView = new aq();
        paramViewGroup = View.inflate(paramViewGroup.getContext(), 2130970614, null);
        paramView.lBq = paramViewGroup.findViewById(2131821064);
        paramView.gxi = ((TextView)paramViewGroup.findViewById(2131823625));
        paramView.iqT = ((ImageView)paramViewGroup.findViewById(2131823624));
        paramView.yKX = ((TextView)paramViewGroup.findViewById(2131827346));
        paramView.yMM = ((SendDataToDeviceProgressBar)paramViewGroup.findViewById(2131827345));
        paramView.yMM.setVisibility(4);
        ChattingSendDataToDeviceUI.c(ChattingSendDataToDeviceUI.this).put(Integer.valueOf(paramInt), paramViewGroup);
        paramViewGroup.setTag(paramView);
        ChattingSendDataToDeviceUI.k(ChattingSendDataToDeviceUI.this).put(localc.deviceID, Integer.valueOf(paramInt));
        String str1 = localc.eoz;
        i = 8;
        j = 0;
        localObject = new StringBuffer();
        localStringBuffer = new StringBuffer();
        f = com.tencent.mm.bz.a.dm(this.context);
        if ((f != 1.125F) && (f != 1.25F))
          break label359;
        i = 6;
        k = 0;
        if (k >= str1.length())
          break label399;
        int m = Character.codePointAt(str1, k);
        str2 = str1.substring(k, k + 1);
        if ((m < 0) || (m > 255))
          break label381;
        j++;
        label306: if (j > i)
          break label387;
        localObject = ((StringBuffer)localObject).append(str2);
      }
      while (true)
      {
        k++;
        break label258;
        paramViewGroup = (View)ChattingSendDataToDeviceUI.c(ChattingSendDataToDeviceUI.this).get(Integer.valueOf(paramInt));
        paramView = (aq)paramViewGroup.getTag();
        break;
        label359: if ((f != 1.375F) && (f != 1.625F))
          break label255;
        i = 5;
        break label255;
        label381: j += 2;
        break label306;
        label387: localStringBuffer = localStringBuffer.append(str2);
      }
      label399: paramView.gxi.setText(((StringBuffer)localObject).toString());
      if (j >= i)
        paramView.yKX.setText(localStringBuffer);
      Object localObject = null;
      if (ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).containsKey(Op(paramInt).deviceID))
        localObject = (ChattingSendDataToDeviceUI.c)ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).get(Op(paramInt).deviceID);
      if ((localObject != null) && (((ChattingSendDataToDeviceUI.c)localObject).cxW != null))
      {
        ab.d("MicroMsg.ChattingSendDataToDeviceUI", "position(%s), sendState(%s).", new Object[] { Integer.valueOf(paramInt), ((ChattingSendDataToDeviceUI.c)localObject).cxW });
        if (!((ChattingSendDataToDeviceUI.c)localObject).cxW.equals("send_data_sending"))
          break label727;
        paramView.yKX.setText(this.context.getString(2131298244));
        paramView.yKX.setTextColor(this.context.getResources().getColor(2131690433));
        paramView.yMM.Os(localc.progress);
        paramView.yMM.setVisibility(0);
        localObject = localc.deviceID;
        localObject = (ChattingSendDataToDeviceUI.c)ChattingSendDataToDeviceUI.d(ChattingSendDataToDeviceUI.this).get(localObject);
        j = ((ChattingSendDataToDeviceUI.c)localObject).progress;
        if (j < 100)
          break label713;
        i = 0;
        d.h(new ChattingSendDataToDeviceUI.a.1(this, j, (ChattingSendDataToDeviceUI.c)localObject, paramView, i), "SendDataState_handler").start();
      }
      while (true)
      {
        ab.d("MicroMsg.ChattingSendDataToDeviceUI", "position(%s), name(%s).", new Object[] { Integer.valueOf(paramInt), localc.eoz });
        com.tencent.mm.at.o.ahp().a(localc.iconUrl, paramView.iqT, this.lyr);
        paramView.lBq.setTag(Integer.valueOf(paramInt));
        AppMethodBeat.o(30781);
        return paramViewGroup;
        label713: i = 500 / (100 - j);
        break;
        label727: if (((ChattingSendDataToDeviceUI.c)localObject).cxW.equals("send_data_sucess"))
        {
          paramView.yKX.setText(this.context.getString(2131298242));
          paramView.yKX.setTextColor(this.context.getResources().getColor(2131690433));
          paramView.yMM.setVisibility(4);
        }
        else if (((ChattingSendDataToDeviceUI.c)localObject).cxW.equals("send_data_cancel"))
        {
          paramView.yKX.setText(this.context.getString(2131298235));
          paramView.yKX.setTextColor(this.context.getResources().getColor(2131690431));
          paramView.yMM.setVisibility(4);
        }
        else if (((ChattingSendDataToDeviceUI.c)localObject).cxW.equals("send_data_failed"))
        {
          paramView.yKX.setText(this.context.getString(2131298239));
          paramView.yKX.setTextColor(this.context.getResources().getColor(2131690436));
          paramView.yMM.setVisibility(4);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI
 * JD-Core Version:    0.6.2
 */