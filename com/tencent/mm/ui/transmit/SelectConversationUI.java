package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.a;
import com.tencent.mm.af.j.b;
import com.tencent.mm.choosemsgfile.compat.MsgFile;
import com.tencent.mm.choosemsgfile.compat.a.a;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.g.a.gf;
import com.tencent.mm.g.a.lz;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.nt.a;
import com.tencent.mm.g.a.nt.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.ce;
import com.tencent.mm.model.y;
import com.tencent.mm.model.z;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.model.app.ReportUtil.ReportArgs;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.pluginsdk.ui.applet.g.a;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.bi.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.aj;
import com.tencent.mm.ui.chatting.k;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.x;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.a.c.a.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

@com.tencent.mm.kernel.i
@com.tencent.mm.ui.base.a(23)
public class SelectConversationUI extends MMBaseSelectContactUI
{
  private static final int zJK;
  private String cJh;
  private bi cKd;
  private long cvv;
  private long cvx;
  private List<String> elZ;
  private int fromScene;
  private int gnI;
  private String imagePath;
  private String kcC;
  private String lgZ;
  private int[] mqq;
  private int msgType;
  private TextView yFh;
  private int zJL;
  private boolean zJM;
  private boolean zJN;
  private boolean zJO;
  private boolean zJP;
  private boolean zJQ;
  private boolean zJR;
  private boolean zJS;
  private int zJT;
  private boolean zJU;
  private String zJV;
  private String zJW;
  private Boolean zJX;
  private boolean zJY;
  private boolean zJZ;
  private List<String> zKa;
  private ReportUtil.ReportArgs zKb;
  private String zKc;
  private String zKd;
  private String zKe;
  private int zKf;
  private String zKg;
  private MenuItem.OnMenuItemClickListener zKh;
  private MenuItem.OnMenuItemClickListener zKi;
  private int zeC;
  private boolean znm;
  private boolean zoG;

  static
  {
    AppMethodBeat.i(35207);
    zJK = com.tencent.mm.ui.contact.s.C(new int[] { 1, 2 });
    AppMethodBeat.o(35207);
  }

  public SelectConversationUI()
  {
    AppMethodBeat.i(35153);
    this.zJM = false;
    this.zJN = false;
    this.zJO = false;
    this.zJP = false;
    this.zJQ = false;
    this.zJR = false;
    this.fromScene = 0;
    this.zJS = false;
    this.zoG = false;
    this.zJU = false;
    this.zeC = -1;
    this.zJX = Boolean.FALSE;
    this.zJY = false;
    this.zJZ = false;
    this.zKa = null;
    this.imagePath = null;
    this.zKc = null;
    this.kcC = null;
    this.mqq = new int[] { 2131822651, 2131822652, 2131822653, 2131822654, 2131822655 };
    this.zKh = new SelectConversationUI.21(this);
    this.zKi = new SelectConversationUI.22(this);
    AppMethodBeat.o(35153);
  }

  private void Kt()
  {
    AppMethodBeat.i(35191);
    if (!this.zJY)
      AppMethodBeat.o(35191);
    while (true)
    {
      return;
      if ((this.zKa != null) && (this.zKa.size() > 0))
      {
        updateOptionMenuText(1, getString(2131297041) + "(" + this.zKa.size() + ")");
        a(1, this.zKi);
        enableOptionMenu(1, true);
        AppMethodBeat.o(35191);
      }
      else if (!this.zJZ)
      {
        updateOptionMenuText(1, getString(2131296979));
        a(1, this.zKh);
        enableOptionMenu(1, true);
        AppMethodBeat.o(35191);
      }
      else
      {
        updateOptionMenuText(1, getString(2131297053));
        a(1, this.zKh);
        enableOptionMenu(1, true);
        AppMethodBeat.o(35191);
      }
    }
  }

  public static Bitmap a(Context paramContext, Bitmap paramBitmap, ImageView paramImageView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(35183);
    Object localObject = null;
    float f = paramInt2 / paramInt1;
    int i = 0;
    int j = 0;
    int k = aj.am(paramContext, 2131427571);
    paramInt1 = aj.am(paramContext, 2131427570);
    int m = 0;
    paramInt2 = 0;
    if ((f > 0.0F) && (f < 0.5D))
    {
      j = (int)(k / f);
      paramInt2 = k;
      i = k;
      m = paramInt1;
    }
    while (true)
    {
      paramContext = localObject;
      if (i > 0)
      {
        paramContext = localObject;
        if (j > 0)
        {
          paramContext = localObject;
          if (paramBitmap != null)
          {
            paramContext = Bitmap.createScaledBitmap(paramBitmap, j, i, true);
            paramImageView.setLayoutParams(new FrameLayout.LayoutParams(m, paramInt2));
          }
        }
      }
      AppMethodBeat.o(35183);
      return paramContext;
      if ((f >= 0.5D) && (f < 1.0F))
      {
        i = (int)(paramInt1 * f);
        paramInt2 = i;
        m = paramInt1;
        j = paramInt1;
      }
      else if ((f >= 1.0F) && (f < 2.0F))
      {
        j = (int)(paramInt1 / f);
        paramInt2 = paramInt1;
        m = j;
        i = paramInt1;
      }
      else if (f >= 2.0F)
      {
        i = (int)(k * f);
        m = k;
        j = k;
        paramInt2 = paramInt1;
      }
    }
  }

  private void a(Intent paramIntent1, Intent paramIntent2)
  {
    AppMethodBeat.i(35173);
    ab.d("MicroMsg.SelectConversationUI", "has next step, jump now, intent=".concat(String.valueOf(paramIntent2)));
    paramIntent2.putExtras(paramIntent1.getExtras());
    startActivityForResult(paramIntent2, 2);
    com.tencent.mm.ui.base.b.K(this.mController.ylL, paramIntent2);
    AppMethodBeat.o(35173);
  }

  private static void a(Intent paramIntent, String paramString, List<String> paramList)
  {
    AppMethodBeat.i(35168);
    if (paramList.size() > 0)
    {
      paramIntent.putExtra("be_send_card_name", paramString);
      paramIntent.putExtra("received_card_name", com.tencent.mm.platformtools.ah.c(paramList, ","));
      paramIntent.putExtra("Is_Chatroom", false);
    }
    AppMethodBeat.o(35168);
  }

  private void a(g.a parama)
  {
    AppMethodBeat.i(35177);
    label98: Object localObject1;
    Object localObject2;
    int j;
    j.b localb;
    switch (this.msgType)
    {
    case 6:
    case 7:
    case 14:
    case 15:
    default:
      AppMethodBeat.o(35177);
    case 4:
    case 0:
    case 16:
    case 1:
    case 11:
    case 9:
    case 5:
    case 8:
      while (true)
      {
        return;
        parama.ajC(this.cJh);
        parama.djw();
        AppMethodBeat.o(35177);
        continue;
        localObject1 = dKl();
        localObject2 = localObject1;
        if (localObject1 == null)
        {
          localObject2 = localObject1;
          if (this.imagePath != null)
          {
            float f = com.tencent.mm.bz.a.getDensity(com.tencent.mm.sdk.platformtools.ah.getContext());
            localObject2 = com.tencent.mm.sdk.platformtools.d.j(this.imagePath, f);
            int i = Exif.fromFile(this.imagePath).getOrientationInDegree();
            j = i;
            if (i < 0)
              j = 0;
            localObject2 = com.tencent.mm.sdk.platformtools.d.b((Bitmap)localObject2, j);
          }
        }
        parama.b((Bitmap)localObject2, 3);
        AppMethodBeat.o(35177);
        continue;
        parama.b(dKk(), 2);
        AppMethodBeat.o(35177);
        continue;
        parama.b(dKk(), 2);
        AppMethodBeat.o(35177);
        continue;
        parama.ajC(dKj());
        AppMethodBeat.o(35177);
        continue;
        if (!bo.isNullOrNil(this.lgZ))
        {
          parama.ajE(this.lgZ);
          AppMethodBeat.o(35177);
        }
        else if (!bo.isNullOrNil(this.cKd.field_imgPath))
        {
          parama.ajE(this.cKd.field_imgPath);
          AppMethodBeat.o(35177);
        }
        else
        {
          parama.ajE(this.imagePath);
          AppMethodBeat.o(35177);
          continue;
          aw.ZK();
          localObject2 = com.tencent.mm.model.c.XO().Rn(this.cJh);
          this.zJV = ((bi.a)localObject2).svN;
          this.zJW = ((bi.a)localObject2).nickname;
          this.zJX = Boolean.valueOf(com.tencent.mm.model.t.kv(((bi.a)localObject2).ufB));
          a(parama, this.zJV);
          AppMethodBeat.o(35177);
        }
      }
    case 2:
    case 10:
      localb = j.b.me(bo.anj(this.cJh));
      if ((this.cKd.drC()) && (localb == null))
        localb = j.b.X(bo.anj(this.cJh), bo.anj(this.cJh));
      break;
    case 13:
    case 12:
    case 3:
    }
    while (true)
    {
      if (localb == null)
      {
        if (this.zKc != null)
        {
          localObject1 = getResources().getString(2131297076);
          localObject2 = this.zKc;
          parama.ajC((String)localObject1 + (String)localObject2);
        }
        AppMethodBeat.o(35177);
        break label98;
      }
      localObject1 = localb.title;
      if (com.tencent.mm.ui.chatting.l.f(this.cKd, this.zeC))
        localObject2 = getResources().getString(2131296591);
      while (true)
      {
        if (localb.type != 46)
          break label1208;
        parama.b(dKl(), 2);
        AppMethodBeat.o(35177);
        break;
        if (localb.type == 5)
        {
          localObject2 = getResources().getString(2131297071);
        }
        else if (localb.type == 6)
        {
          localObject2 = getResources().getString(2131296942);
        }
        else if (localb.type == 24)
        {
          localObject2 = getResources().getString(2131296993);
          localObject1 = i(localb);
        }
        else if (localb.type == 19)
        {
          localObject2 = getResources().getString(2131297030);
        }
        else if (localb.type == 3)
        {
          localObject2 = getResources().getString(2131296980);
        }
        else if (localb.type == 4)
        {
          localObject2 = getResources().getString(2131297076);
        }
        else if (localb.type == 8)
        {
          localObject2 = getResources().getString(2131296897);
        }
        else if ((localb.type == 33) || (localb.type == 36) || (localb.type == 44))
        {
          if ((localb.fiR == 2) || (localb.fiR == 3) || (localb.type == 36))
          {
            j = localb.fiW;
            if (localb.cw(false))
            {
              localObject2 = new Bundle();
              ((Bundle)localObject2).putInt("key_biz", j);
              ((Bundle)localObject2).putString("key_footer_text_default", localb.cMh);
              ((Bundle)localObject2).putString("key_footer_text", localb.p(this.mController.ylL, false));
              ((Bundle)localObject2).putString("key_footer_icon", localb.fjb);
            }
            while (true)
            {
              localObject2 = ((com.tencent.mm.modelappbrand.i)com.tencent.mm.kernel.g.K(com.tencent.mm.modelappbrand.i.class)).d(this, (Bundle)localObject2);
              parama.ev((View)localObject2);
              parama.h(Boolean.TRUE);
              parama.djy();
              Object localObject3 = com.tencent.mm.at.o.ahl().c(this.cKd.field_imgPath, false, true);
              localObject4 = com.tencent.mm.plugin.appbrand.r.n.bE(this);
              localObject1 = new Bundle();
              ((Bundle)localObject1).putString("app_id", localb.fiQ);
              ((Bundle)localObject1).putString("msg_id", String.format("%d-%d", new Object[] { Integer.valueOf(localb.fiZ), Integer.valueOf(localb.fiT) }));
              ((Bundle)localObject1).putInt("msg_pkg_type", localb.fiZ);
              ((Bundle)localObject1).putInt("pkg_version", localb.fiT);
              if (!bo.isNullOrNil((String)localObject3))
                ((Bundle)localObject1).putString("image_url", "file://".concat(String.valueOf(localObject3)));
              localObject3 = (com.tencent.mm.af.a)localb.X(com.tencent.mm.af.a.class);
              if (localObject3 != null)
              {
                ((Bundle)localObject1).putBoolean("is_dynamic_page", ((com.tencent.mm.af.a)localObject3).feY);
                ((Bundle)localObject1).putString("cache_key", ((com.tencent.mm.af.a)localObject3).feZ);
              }
              ((Bundle)localObject1).putString("title", localb.title);
              ((Bundle)localObject1).putString("msg_path", localb.fiO);
              ((com.tencent.mm.modelappbrand.i)com.tencent.mm.kernel.g.K(com.tencent.mm.modelappbrand.i.class)).a((String)localObject4, (View)localObject2, (Bundle)localObject1);
              parama.jbD = new SelectConversationUI.6(this, (String)localObject4, (View)localObject2);
              AppMethodBeat.o(35177);
              break;
              ab.w("MicroMsg.SelectConversationUI", "fake native share msg biz invalidate, biz: %d.", new Object[] { Integer.valueOf(j) });
              localObject2 = null;
            }
          }
          localObject2 = getResources().getString(2131296591);
        }
        else
        {
          localObject2 = getResources().getString(2131296527);
        }
      }
      label1208: Object localObject4 = localObject1;
      if (localObject1 == null)
        localObject4 = "";
      parama.ajC((String)localObject2 + (String)localObject4);
      if (localb.thumburl == null)
        break;
      parama.ajD(localb.thumburl).djx();
      AppMethodBeat.o(35177);
      break label98;
      localObject2 = com.tencent.mm.platformtools.ah.bc(k.hS(this.mController.ylL).cJZ.cKh.title, "");
      parama.ajC(getResources().getString(2131296978) + (String)localObject2);
      AppMethodBeat.o(35177);
      break label98;
      localObject2 = k.hS(this.mController.ylL);
      if (((nt)localObject2).cJY.cKe != null);
      for (j = ((nt)localObject2).cJY.cKe.size(); ; j = 0)
      {
        localObject2 = this.mController.ylL.getString(2131302493, new Object[] { Integer.valueOf(j) });
        parama.ajC(getResources().getString(2131296977) + (String)localObject2);
        AppMethodBeat.o(35177);
        break label98;
        if (this.kcC == null)
          break;
        parama.ajC(getResources().getString(2131296942) + this.kcC);
        break;
      }
    }
  }

  private void a(g.a parama, String paramString)
  {
    AppMethodBeat.i(35170);
    aw.ZK();
    com.tencent.mm.model.c.XM().aoM(paramString);
    String str = com.tencent.mm.model.s.mJ(paramString);
    if (!bo.isNullOrNil(this.zJW))
      str = this.zJW;
    parama.ajC(ast(paramString) + str);
    AppMethodBeat.o(35170);
  }

  private boolean a(Intent paramIntent, g.a parama)
  {
    AppMethodBeat.i(35175);
    Object localObject1 = (HashMap)getIntent().getSerializableExtra("appbrand_params");
    boolean bool;
    if (ce.bc(((HashMap)localObject1).get("is_weishi_video")))
    {
      bool = a(parama, (HashMap)localObject1);
      AppMethodBeat.o(35175);
    }
    while (true)
    {
      return bool;
      int i = ce.getInt(((HashMap)localObject1).get("type"), 1);
      String str1 = ce.e(((HashMap)localObject1).get("title"), "");
      String str2 = ce.e(((HashMap)localObject1).get("img_url"), null);
      if ((i == 2) || (i == 3))
      {
        String str3 = ce.e(((HashMap)localObject1).get("app_id"), null);
        int j = ce.getInt(((HashMap)localObject1).get("pkg_type"), 0);
        i = ce.getInt(((HashMap)localObject1).get("pkg_version"), 0);
        String str4 = ce.e(((HashMap)localObject1).get("cache_key"), null);
        String str5 = ce.e(((HashMap)localObject1).get("path"), null);
        Object localObject2 = ce.e(((HashMap)localObject1).get("delay_load_img_path"), null);
        Object localObject3 = ce.e(((HashMap)localObject1).get("nickname"), "");
        bool = ce.bc(((HashMap)localObject1).get("is_dynamic"));
        Bundle localBundle = null;
        int k = ce.getInt(((HashMap)localObject1).get("biz"), j.a.fgj.ordinal());
        String str6;
        if (j.a.isValid(k))
        {
          str6 = ce.e(((HashMap)localObject1).get("tail_lang"), "");
          localObject1 = ce.e(((HashMap)localObject1).get("icon_url"), "");
          localBundle = new Bundle();
          localBundle.putInt("key_biz", k);
          localBundle.putString("key_footer_text_default", (String)localObject3);
          localBundle.putString("key_footer_text", j.a.b(k, str6, this.mController.ylL));
          localBundle.putString("key_footer_icon", (String)localObject1);
          ab.d("MicroMsg.SelectConversationUI", "defaultFooterTxt: %s, tailLang: %s.", new Object[] { localObject3, str6 });
        }
        while (true)
        {
          localObject3 = ((com.tencent.mm.modelappbrand.i)com.tencent.mm.kernel.g.K(com.tencent.mm.modelappbrand.i.class)).d(this, localBundle);
          str6 = com.tencent.mm.plugin.appbrand.r.n.bE(this);
          localBundle = new Bundle();
          localBundle.putString("app_id", str3);
          localBundle.putString("msg_id", String.format("%d-%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) }));
          localBundle.putInt("msg_pkg_type", j);
          localBundle.putInt("pkg_version", i);
          localBundle.putString("image_url", str2);
          localBundle.putBoolean("is_dynamic_page", bool);
          localBundle.putString("title", str1);
          localBundle.putString("cache_key", str4);
          localBundle.putString("msg_path", str5);
          localBundle.putString("delay_load_img_path", (String)localObject2);
          localObject2 = new e(this);
          ((e)localObject2).zKR = new SelectConversationUI.30(this, paramIntent, str6, (View)localObject3);
          ((com.tencent.mm.modelappbrand.i)com.tencent.mm.kernel.g.K(com.tencent.mm.modelappbrand.i.class)).a(str6, (View)localObject3, localBundle, new SelectConversationUI.2(this, (e)localObject2));
          parama.ev((View)localObject3);
          parama.h(Boolean.TRUE);
          parama.djy();
          parama.jbD = new SelectConversationUI.3(this, str6, (View)localObject3);
          parama.KQ(2131297041).a(new SelectConversationUI.4(this, (e)localObject2)).gud.show();
          bool = true;
          AppMethodBeat.o(35175);
          break;
          ab.w("MicroMsg.SelectConversationUI", "fake native share msg biz invalidate, biz: %d.", new Object[] { Integer.valueOf(k) });
        }
      }
      parama.ajC(getResources().getString(2131296591) + str1);
      parama.ajD(str2).djx();
      parama.h(Boolean.TRUE);
      bool = false;
      AppMethodBeat.o(35175);
    }
  }

  private boolean a(g.a parama, HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(35176);
    String str = ce.e(paramHashMap.get("img_url"), null);
    if (!com.tencent.mm.platformtools.ah.isNullOrNil(str))
    {
      RelativeLayout localRelativeLayout = new RelativeLayout(this);
      paramHashMap = LayoutInflater.from(this).inflate(2130969182, null);
      localRelativeLayout.addView(paramHashMap, new RelativeLayout.LayoutParams(-2, -2));
      ((RelativeLayout.LayoutParams)paramHashMap.getLayoutParams()).addRule(14);
      ImageView localImageView = (ImageView)paramHashMap.findViewById(2131822916);
      ((ImageView)paramHashMap.findViewById(2131822919)).setImageResource(2131232094);
      parama.ev(localRelativeLayout);
      parama.djy();
      com.tencent.mm.modelappbrand.a.b.abR().a(new SelectConversationUI.5(this, localImageView, str), str, null, null);
    }
    while (true)
    {
      parama.h(Boolean.TRUE);
      AppMethodBeat.o(35176);
      return false;
      paramHashMap = ce.e(paramHashMap.get("msg_img_path"), null);
      if (!com.tencent.mm.platformtools.ah.isNullOrNil(paramHashMap))
      {
        ab.i("Weishi", "dealRetransmitFromWeishiVideoMiniProgram, imageUrl:%s, msgImgPath:%s", new Object[] { str, paramHashMap });
        parama.b(asu(paramHashMap), 2);
      }
    }
  }

  private static boolean asp(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(35163);
    if (ad.aox(paramString))
      AppMethodBeat.o(35163);
    while (true)
    {
      return bool;
      if (com.tencent.mm.model.t.mP(paramString))
      {
        AppMethodBeat.o(35163);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(35163);
      }
    }
  }

  private void asr(String paramString)
  {
    AppMethodBeat.i(35165);
    try
    {
      Object localObject = com.tencent.mm.platformtools.ah.j(paramString.split(","));
      paramString = new java/lang/StringBuffer;
      paramString.<init>();
      localObject = ((List)localObject).iterator();
      int i = 0;
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        if (!com.tencent.mm.platformtools.ah.isNullOrNil(str))
        {
          if (i != 0)
            paramString.append(",");
          paramString.append(com.tencent.mm.model.s.mJ(str));
          i = 1;
        }
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131303496, new Object[] { paramString }), "", null);
      AppMethodBeat.o(35165);
      return;
    }
    catch (Throwable paramString)
    {
      while (true)
        AppMethodBeat.o(35165);
    }
  }

  private void ass(String paramString)
  {
    AppMethodBeat.i(35166);
    ab.i("MicroMsg.SelectConversationUI", "doChooseMsgFile userName:%s type:%s count:%d ", new Object[] { paramString, this.zKe, Integer.valueOf(this.zKf) });
    ab.i("MicroMsg.SelectConversationUI", "doChooseMsgFile extension:%s ", new Object[] { this.zKg });
    ((com.tencent.mm.choosemsgfile.compat.a)com.tencent.mm.kernel.g.K(com.tencent.mm.choosemsgfile.compat.a.class)).a(this, paramString, this.zKe, this.zKf, this.zKg, new a.a()
    {
      public final void a(int paramAnonymousInt, String paramAnonymousString, ArrayList<MsgFile> paramAnonymousArrayList)
      {
        AppMethodBeat.i(35149);
        ab.i("MicroMsg.SelectConversationUI", "resultCode:%d filePaths:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousArrayList });
        switch (paramAnonymousInt)
        {
        case 0:
        default:
        case -1:
        case 1:
        }
        while (true)
        {
          AppMethodBeat.o(35149);
          while (true)
          {
            return;
            paramAnonymousString = new Intent();
            paramAnonymousString.putParcelableArrayListExtra("FILEPATHS", paramAnonymousArrayList);
            SelectConversationUI.this.setResult(-1, paramAnonymousString);
            SelectConversationUI.this.finish();
            AppMethodBeat.o(35149);
          }
          paramAnonymousArrayList = new Intent();
          paramAnonymousArrayList.putExtra("ERRMSG", paramAnonymousString);
          SelectConversationUI.this.setResult(1, paramAnonymousArrayList);
          SelectConversationUI.this.finish();
        }
      }
    });
    AppMethodBeat.o(35166);
  }

  private String ast(String paramString)
  {
    AppMethodBeat.i(35171);
    aw.ZK();
    ad localad = com.tencent.mm.model.c.XM().aoM(paramString);
    String str = getResources().getString(2131296949);
    if (localad == null)
    {
      AppMethodBeat.o(35171);
      paramString = str;
      return paramString;
    }
    if (com.tencent.mm.model.t.kv(localad.field_verifyFlag))
      paramString = getResources().getString(2131296948);
    while (true)
    {
      AppMethodBeat.o(35171);
      break;
      if (ad.aox(paramString))
        paramString = c(this, localad);
      else
        paramString = getResources().getString(2131296949);
    }
  }

  private static Bitmap asu(String paramString)
  {
    AppMethodBeat.i(35182);
    Bitmap localBitmap1 = com.tencent.mm.at.o.ahl().sk(paramString);
    Bitmap localBitmap2 = localBitmap1;
    if (localBitmap1 != null);
    try
    {
      int i = Exif.fromFile(paramString).getOrientationInDegree();
      int j = i;
      if (i < 0)
        j = 0;
      localBitmap2 = com.tencent.mm.sdk.platformtools.d.b(localBitmap1, j);
      AppMethodBeat.o(35182);
      return localBitmap2;
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SelectConversationUI", paramString, "unexpected exception.", new Object[0]);
        localBitmap2 = localBitmap1;
      }
    }
  }

  private static void b(Intent paramIntent, String paramString1, String paramString2)
  {
    AppMethodBeat.i(35167);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramString2);
    a(paramIntent, paramString1, localLinkedList);
    AppMethodBeat.o(35167);
  }

  private void b(g.a parama)
  {
    AppMethodBeat.i(35178);
    switch (this.msgType)
    {
    case 5:
    case 6:
    case 7:
    case 8:
    case 14:
    case 15:
    default:
    case 4:
    case 0:
    case 1:
    case 11:
    case 16:
    case 9:
    case 2:
    case 10:
    case 13:
    case 12:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(35178);
      while (true)
      {
        return;
        parama.a(new SelectConversationUI.7(this));
        AppMethodBeat.o(35178);
        continue;
        parama.a(new SelectConversationUI.8(this));
        AppMethodBeat.o(35178);
        continue;
        aw.ZK();
        Object localObject = com.tencent.mm.model.c.XO().Ro(this.cJh);
        parama.a(new SelectConversationUI.9(this, (bi.b)localObject, ((bi.b)localObject).label));
        AppMethodBeat.o(35178);
        continue;
        localObject = j.b.me(bo.anj(this.cJh));
        if (localObject == null)
        {
          AppMethodBeat.o(35178);
        }
        else if ((((j.b)localObject).type == 5) && (!com.tencent.mm.ui.chatting.l.f(this.cKd, this.zeC)))
        {
          parama.a(new SelectConversationUI.10(this, ((j.b)localObject).url));
          AppMethodBeat.o(35178);
        }
        else if (((j.b)localObject).type == 6)
        {
          parama.a(new SelectConversationUI.11(this));
          AppMethodBeat.o(35178);
        }
        else if (((j.b)localObject).type == 24)
        {
          parama.a(new c.a.b()
          {
            public final void bwF()
            {
              AppMethodBeat.i(35137);
              lz locallz = new lz();
              locallz.cHO.context = SelectConversationUI.this.mController.ylL;
              locallz.cHO.cvx = SelectConversationUI.i(SelectConversationUI.this);
              locallz.cHO.cHP = this.hWW.fgU;
              locallz.cHO.cHc = false;
              locallz.cHO.scene = 7;
              com.tencent.mm.sdk.b.a.xxA.m(locallz);
              AppMethodBeat.o(35137);
            }
          });
          AppMethodBeat.o(35178);
        }
        else if (((j.b)localObject).type == 19)
        {
          parama.a(new SelectConversationUI.14(this, (j.b)localObject));
          AppMethodBeat.o(35178);
        }
        else if (((j.b)localObject).type == 3)
        {
          parama.a(new SelectConversationUI.15(this, (j.b)localObject));
          AppMethodBeat.o(35178);
        }
        else
        {
          if (((j.b)localObject).type != 4)
            break;
          parama.a(new SelectConversationUI.16(this));
          AppMethodBeat.o(35178);
          continue;
          parama.a(new SelectConversationUI.17(this));
          AppMethodBeat.o(35178);
          continue;
          k.hS(this.mController.ylL);
          AppMethodBeat.o(35178);
        }
      }
      parama.a(new SelectConversationUI.18(this));
    }
  }

  public static String c(Context paramContext, ad paramad)
  {
    AppMethodBeat.i(35172);
    paramad = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).a(paramad.field_openImAppid, "openim_card_type_name", b.a.geR);
    if (TextUtils.isEmpty(paramad));
    for (paramContext = paramContext.getResources().getString(2131296949); ; paramContext = String.format("[%s]", new Object[] { paramad }))
    {
      AppMethodBeat.o(35172);
      return paramContext;
    }
  }

  private static void c(Intent paramIntent, String paramString1, String paramString2)
  {
    AppMethodBeat.i(35169);
    if (paramString1 != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("cardNameToSend is null", bool);
      paramIntent.putExtra("be_send_card_name", paramString1);
      paramIntent.putExtra("received_card_name", paramString2);
      paramIntent.putExtra("Is_Chatroom", true);
      AppMethodBeat.o(35169);
      return;
    }
  }

  private String dKj()
  {
    AppMethodBeat.i(35179);
    aw.ZK();
    bi.b localb = com.tencent.mm.model.c.XO().Ro(this.cJh);
    String str = "";
    if (localb != null)
      str = localb.label;
    str = this.mController.ylL.getString(2131296967) + str;
    AppMethodBeat.o(35179);
    return str;
  }

  private Bitmap dKk()
  {
    AppMethodBeat.i(35180);
    com.tencent.mm.modelvideo.o.all();
    String str = com.tencent.mm.modelvideo.t.ui(this.cKd.field_imgPath);
    Object localObject = str;
    if (str == null)
      localObject = this.imagePath;
    localObject = com.tencent.mm.sdk.platformtools.d.aml((String)localObject);
    AppMethodBeat.o(35180);
    return localObject;
  }

  private Bitmap dKl()
  {
    AppMethodBeat.i(35181);
    Object localObject1;
    if (this.cKd == null)
    {
      localObject1 = null;
      AppMethodBeat.o(35181);
    }
    while (true)
    {
      return localObject1;
      String str = this.cKd.field_imgPath;
      Bitmap localBitmap = com.tencent.mm.at.o.ahl().sk(str);
      localObject1 = localBitmap;
      if (localBitmap != null);
      try
      {
        int i = Exif.fromFile(str).getOrientationInDegree();
        int j = i;
        if (i < 0)
          j = 0;
        localObject1 = com.tencent.mm.sdk.platformtools.d.b(localBitmap, j);
        AppMethodBeat.o(35181);
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.SelectConversationUI", localThrowable, "unexpected exception.", new Object[0]);
          Object localObject2 = localBitmap;
        }
      }
    }
  }

  private void dKm()
  {
    AppMethodBeat.i(35185);
    ab.i("MicroMsg.SelectConversationUI", "doCallSelectContactUIForMultiRetransmit");
    Intent localIntent = new Intent(this, SelectContactUI.class);
    localIntent.putExtra("list_type", 14);
    localIntent.putExtra("titile", getString(2131296486));
    localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.znK);
    localIntent.putExtra("already_select_contact", com.tencent.mm.platformtools.ah.c(this.zKa, ","));
    localIntent.putExtra("max_limit_num", 9);
    if ((this.zoG) && (ad.aox(this.zJV)));
    for (boolean bool = true; ; bool = false)
    {
      localIntent.putExtra("Forbid_SelectChatRoom", bool);
      this.mController.ylL.startActivityForResult(localIntent, 5);
      AppMethodBeat.o(35185);
      return;
    }
  }

  private void dKn()
  {
    boolean bool = true;
    AppMethodBeat.i(35186);
    ab.i("MicroMsg.SelectConversationUI", "doSendCardOrQRCode2CallSelectContactUI");
    Intent localIntent = new Intent(this, SelectContactUI.class);
    localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.znH);
    localIntent.putExtra("list_type", 3);
    localIntent.putExtra("be_send_card_name", this.zJV);
    localIntent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
    localIntent.putExtra("Add_SendCard", true);
    localIntent.putExtra("titile", getString(2131296486));
    if ((this.zoG) && (ad.aox(this.zJV)));
    while (true)
    {
      localIntent.putExtra("Forbid_SelectChatRoom", bool);
      this.mController.ylL.startActivityForResult(localIntent, 3);
      AppMethodBeat.o(35186);
      return;
      bool = false;
    }
  }

  private void dKo()
  {
    AppMethodBeat.i(35187);
    ab.i("MicroMsg.SelectConversationUI", "doCallSelectContactUI");
    Intent localIntent = new Intent(this, SelectContactUI.class);
    localIntent.putExtra("list_type", 5);
    localIntent.putExtra("titile", getString(2131296486));
    if (((this.fromScene != 4) && (this.fromScene != 9)) || ((getIntent().getIntExtra("jsapi_select_mode", 0) == 1) || (this.fromScene == 10)))
    {
      localIntent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
      localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.C(new int[] { 32, 16, 1, 2, 4, 16384 }));
    }
    while (true)
    {
      this.mController.ylL.startActivityForResult(localIntent, 1);
      AppMethodBeat.o(35187);
      return;
      localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.znJ);
    }
  }

  private void fy(List<String> paramList)
  {
    AppMethodBeat.i(35195);
    long l = System.currentTimeMillis();
    int i = paramList.size();
    Object localObject1 = z.nY(getString(2131300423));
    Cursor localCursor1 = null;
    Cursor localCursor2 = localCursor1;
    try
    {
      com.tencent.mm.kernel.g.RQ();
      localCursor2 = localCursor1;
      localCursor1 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().d(((y)localObject1).getType(), "", null);
      localCursor2 = localCursor1;
      localCursor1.moveToFirst();
      while (true)
      {
        localCursor2 = localCursor1;
        if (localCursor1.isAfterLast())
          break;
        localCursor2 = localCursor1;
        localObject1 = new com/tencent/mm/storage/ad;
        localCursor2 = localCursor1;
        ((ad)localObject1).<init>();
        localCursor2 = localCursor1;
        ((ad)localObject1).d(localCursor1);
        localCursor2 = localCursor1;
        paramList.add(((ap)localObject1).field_username);
        localCursor2 = localCursor1;
        localCursor1.moveToNext();
      }
    }
    finally
    {
      if (localCursor2 != null)
        localCursor2.close();
      ab.i("MicroMsg.SelectConversationUI", "[fillBlockList] cost:%sms size:%s block size:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(i), Integer.valueOf(paramList.size() - i) });
      AppMethodBeat.o(35195);
    }
    if (localObject2 != null)
      localObject2.close();
    ab.i("MicroMsg.SelectConversationUI", "[fillBlockList] cost:%sms size:%s block size:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(i), Integer.valueOf(paramList.size() - i) });
    AppMethodBeat.o(35195);
  }

  private static String i(j.b paramb)
  {
    AppMethodBeat.i(35184);
    nt localnt = new nt();
    localnt.cJY.type = 0;
    localnt.cJY.cKa = paramb.fgU;
    com.tencent.mm.sdk.b.a.xxA.m(localnt);
    paramb = bo.bc(localnt.cJZ.cKi.desc, paramb.description).replaceAll("\n", " ");
    AppMethodBeat.o(35184);
    return paramb;
  }

  private void k(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(35194);
    Intent localIntent = paramIntent;
    if (this.msgType == 5)
    {
      localIntent = paramIntent;
      if (paramIntent == null)
        localIntent = new Intent();
      localIntent.putExtra("emoji_thumb_path", this.lgZ);
      localIntent.putExtra("emoji_activity_id", getIntent().getStringExtra("emoji_activity_id"));
    }
    super.setResult(paramInt, localIntent);
    AppMethodBeat.o(35194);
  }

  private boolean qS(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(35192);
    if (paramBoolean)
    {
      if (this.zKa.size() < 9)
        break label107;
      String str = getString(2131302886, new Object[] { Integer.valueOf(getIntent().getIntExtra("max_limit_num", 9)) });
      com.tencent.mm.ui.base.h.a(this.mController.ylL, str, getString(2131297031), new SelectConversationUI.24(this));
      AppMethodBeat.o(35192);
    }
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      return paramBoolean;
      if (this.zKa.size() > 9)
        break;
      label107: AppMethodBeat.o(35192);
    }
  }

  private void t(final Intent paramIntent, final String paramString)
  {
    AppMethodBeat.i(35174);
    if (asq(paramString))
      AppMethodBeat.o(35174);
    int i;
    while (true)
    {
      return;
      if (com.tencent.mm.ui.contact.s.hr(this.gnI, 256))
      {
        k(-1, paramIntent);
        finish();
        AppMethodBeat.o(35174);
      }
      else if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString))
      {
        ab.v("MicroMsg.SelectConversationUI", "avatarUseName is null or nil show dialog fail ");
        AppMethodBeat.o(35174);
      }
      else
      {
        if (!com.tencent.mm.model.t.kH(paramString))
          break label201;
        i = com.tencent.mm.model.n.mA(paramString);
        if (!this.zJU)
          break;
        int j = com.tencent.mm.platformtools.ah.getInt(com.tencent.mm.m.g.Nu().getValue("CheckBigFileUploadChatroomMemberCountLimit"), 50);
        if (i <= j)
          break;
        ab.w("MicroMsg.SelectConversationUI", "summerbig SelectConversationUI group limit[%d], count[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        com.tencent.mm.ui.base.h.b(this, getString(2131302885, new Object[] { Integer.valueOf(j) }), "", true);
        AppMethodBeat.o(35174);
      }
    }
    getString(2131302883, new Object[] { Integer.valueOf(i) });
    label201: g.a locala = new g.a(this.mController.ylL);
    locala.cx(paramString);
    if (this.zoG)
    {
      a(locala, this.zJV);
      if (com.tencent.mm.model.t.kH(paramString))
      {
        c(paramIntent, this.zJV, paramString);
        label257: locala.h(Boolean.TRUE);
      }
    }
    while (true)
    {
      locala.KQ(2131297041).a(new q.a()
      {
        public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
        {
          AppMethodBeat.i(35151);
          SelectConversationUI.this.aqX();
          boolean bool = paramIntent.getBooleanExtra("need_delete_chatroom_when_cancel", false);
          if (bool)
          {
            if (paramAnonymousBoolean)
            {
              paramAnonymousInt = 1;
              ab.i("MicroMsg.SelectContactReportLogic", "reportCreateChatroomOperation %d %d", new Object[] { Integer.valueOf(13943), Integer.valueOf(paramAnonymousInt) });
              com.tencent.mm.plugin.report.service.h.pYm.e(13943, new Object[] { Integer.valueOf(paramAnonymousInt) });
            }
          }
          else
          {
            if (!paramAnonymousBoolean)
              break label141;
            paramIntent.putExtra("custom_send_text", paramAnonymousString);
            SelectConversationUI.a(SelectConversationUI.this, -1, paramIntent);
            com.tencent.mm.pluginsdk.ui.tools.l.hK(SelectConversationUI.h(SelectConversationUI.this), paramString);
            SelectConversationUI.this.finish();
            AppMethodBeat.o(35151);
          }
          while (true)
          {
            return;
            paramAnonymousInt = 0;
            break;
            label141: if (bool)
            {
              paramAnonymousString = paramIntent.getStringExtra("Select_Contact");
              aw.ZK();
              com.tencent.mm.model.c.XR().aoX(paramAnonymousString);
            }
            AppMethodBeat.o(35151);
          }
        }
      }).gud.show();
      AppMethodBeat.o(35174);
      break;
      b(paramIntent, this.zJV, paramString);
      break label257;
      Object localObject1;
      if (this.zJN)
      {
        if (this.cvv != -1L)
        {
          b(locala);
          localObject1 = new gf();
          ((gf)localObject1).cAC.cvv = this.cvv;
          ((gf)localObject1).cAC.cAD = locala;
          ((gf)localObject1).cAC.cAE = this.zKd;
          ((gf)localObject1).cAC.csX = this.mController.ylL;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        }
        while (true)
        {
          locala.h(Boolean.TRUE);
          break;
          if ((this.msgType == 17) && (this.zJT != 0))
          {
            localObject1 = this.mController.ylL.getString(2131302493, new Object[] { Integer.valueOf(this.zJT) });
            locala.ajC(getResources().getString(2131296977) + (String)localObject1);
          }
        }
      }
      String str;
      if (this.zJO)
      {
        Object localObject2 = (HashMap)getIntent().getSerializableExtra("webview_params");
        str = (String)((HashMap)localObject2).get("img_url");
        localObject1 = (String)((HashMap)localObject2).get("title");
        localObject2 = (String)((HashMap)localObject2).get("url");
        locala.ajC(getResources().getString(2131297071) + (String)localObject1);
        locala.a(new c.a.b()
        {
          public final void bwF()
          {
            AppMethodBeat.i(35150);
            Intent localIntent = new Intent();
            localIntent.putExtra("rawUrl", this.val$url);
            localIntent.putExtra("showShare", false);
            com.tencent.mm.bp.d.b(SelectConversationUI.this.mController.ylL, "webview", ".ui.tools.WebViewUI", localIntent);
            AppMethodBeat.o(35150);
          }
        });
        locala.ajD(str).djx();
        locala.h(Boolean.TRUE);
      }
      else
      {
        if ((this.zJP) && (a(paramIntent, locala)))
        {
          AppMethodBeat.o(35174);
          break;
        }
        if (this.zJR)
        {
          str = getResources().getString(2131296952);
          localObject1 = str;
          if (this.kcC != null)
            localObject1 = str + this.kcC;
          locala.ajC((String)localObject1);
          locala.h(Boolean.FALSE);
        }
        else
        {
          a(locala);
          b(locala);
          locala.h(Boolean.TRUE);
        }
      }
    }
  }

  public final void Kh()
  {
    AppMethodBeat.i(35155);
    super.Kh();
    this.zJM = getIntent().getBooleanExtra("select_is_ret", false);
    this.fromScene = getIntent().getIntExtra("scene_from", 0);
    ab.i("MicroMsg.SelectConversationUI", "from scene:%d", new Object[] { Integer.valueOf(this.fromScene) });
    if (this.fromScene == 1)
      this.zJN = true;
    while (true)
    {
      this.zJS = getIntent().getBooleanExtra("send_to_biz", false);
      this.zeC = getIntent().getIntExtra("Retr_Biz_Msg_Selected_Msg_Index", -1);
      this.cvv = getIntent().getLongExtra("select_fav_local_id", -1L);
      this.zJT = getIntent().getIntExtra("select_fav_select_count", 0);
      this.zJY = getIntent().getBooleanExtra("mutil_select_is_ret", false);
      this.zoG = getIntent().getBooleanExtra("Select_Send_Card", false);
      this.zJU = getIntent().getBooleanExtra("Retr_Big_File", false);
      if (this.zoG)
        this.zJV = getIntent().getStringExtra("Select_Talker_Name");
      this.gnI = getIntent().getIntExtra("Select_Conv_Type", zJK);
      this.msgType = getIntent().getIntExtra("Retr_Msg_Type", -1);
      this.cvx = getIntent().getLongExtra("Retr_Msg_Id", -1L);
      aw.ZK();
      this.cKd = com.tencent.mm.model.c.XO().jf(this.cvx);
      this.imagePath = getIntent().getStringExtra("image_path");
      this.zKc = getIntent().getStringExtra("ad_video_title");
      this.kcC = getIntent().getStringExtra("desc_title");
      this.lgZ = getIntent().getStringExtra("Retr_Msg_thumb_path");
      this.cJh = getIntent().getStringExtra("Retr_Msg_content");
      this.zKd = getIntent().getStringExtra("Retr_fav_xml_str");
      if ((this.cJh == null) && (this.cKd != null))
        this.cJh = this.cKd.field_content;
      this.zKb = ((ReportUtil.ReportArgs)getIntent().getParcelableExtra("Select_Report_Args"));
      this.zKe = getIntent().getStringExtra("KChooseMsgFileType");
      this.zKf = getIntent().getIntExtra("KChooseMsgFileCount", 9);
      this.zKg = getIntent().getStringExtra("KChooseMsgFileExtension");
      HashSet localHashSet = new HashSet();
      localHashSet.addAll(com.tencent.mm.ui.contact.s.dIf());
      Object localObject = getIntent().getStringExtra("Select_block_List");
      if (!com.tencent.mm.platformtools.ah.isNullOrNil((String)localObject))
        localHashSet.addAll(com.tencent.mm.platformtools.ah.j(((String)localObject).split(",")));
      if (com.tencent.mm.ui.contact.s.hr(this.gnI, 2))
      {
        localObject = com.tencent.mm.ui.contact.s.dIg();
        com.tencent.mm.ui.contact.s.h((HashSet)localObject);
        localHashSet.addAll((Collection)localObject);
      }
      this.elZ = new ArrayList();
      this.elZ.addAll(localHashSet);
      fy(this.elZ);
      if (com.tencent.mm.ui.contact.s.hr(this.gnI, 1))
        this.znm = true;
      if (this.zJY)
      {
        this.zKa = new LinkedList();
        if (this.zJY)
        {
          a(1, getString(2131296979), this.zKh, q.b.ymu);
          Kt();
        }
      }
      AppMethodBeat.o(35155);
      return;
      if ((this.fromScene == 2) || (this.fromScene == 10))
        this.zJO = true;
      else if (this.fromScene == 3)
        this.zJP = true;
      else if (this.fromScene == 6)
        this.zJQ = true;
      else if (this.fromScene == 7)
        this.zJR = true;
      else if (this.fromScene == 11)
        overridePendingTransition(2131034229, 2131034227);
    }
  }

  public final void a(ListView paramListView, int paramInt)
  {
    AppMethodBeat.i(35158);
    super.a(paramListView, paramInt);
    if (this.fromScene == 11)
    {
      AppMethodBeat.o(35158);
      return;
    }
    if (this.yFh == null)
    {
      if (!this.zoG)
        break label133;
      this.zJL = 2131302902;
    }
    while (true)
    {
      Object localObject = new SelectConversationUI.12(this);
      String str = getString(this.zJL);
      View localView = v.hu(this).inflate(2130969809, null);
      localView.setOnClickListener((View.OnClickListener)localObject);
      localObject = (TextView)localView.findViewById(2131822953);
      ((TextView)localObject).setText(str);
      paramListView.addHeaderView(localView);
      this.yFh = ((TextView)localObject);
      this.yFh.setVisibility(paramInt);
      AppMethodBeat.o(35158);
      break;
      label133: if (this.fromScene == 10)
        this.zJL = 2131301881;
      else
        this.zJL = 2131302890;
    }
  }

  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    AppMethodBeat.i(35189);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.zKa.contains(parama.ehM.field_username);
      AppMethodBeat.o(35189);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(35189);
    }
  }

  public final m aoA()
  {
    AppMethodBeat.i(35157);
    com.tencent.mm.ui.contact.q localq = new com.tencent.mm.ui.contact.q(this, this.elZ, this.zJZ, this.scene);
    AppMethodBeat.o(35157);
    return localq;
  }

  public final boolean aow()
  {
    return false;
  }

  public final boolean aox()
  {
    return false;
  }

  public final String aoy()
  {
    AppMethodBeat.i(35188);
    String str = getIntent().getStringExtra("Select_Conv_ui_title");
    if ((str == null) || (str.length() <= 0))
    {
      str = getString(2131302893);
      AppMethodBeat.o(35188);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(35188);
    }
  }

  public final com.tencent.mm.ui.contact.o aoz()
  {
    AppMethodBeat.i(35156);
    x localx = new x(this, this.elZ, this.znm, this.zJZ, this.zJS, this.gnI);
    AppMethodBeat.o(35156);
    return localx;
  }

  public final boolean asq(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(35164);
    if (!asp(paramString))
      AppMethodBeat.o(35164);
    while (true)
    {
      return bool;
      if ((!com.tencent.mm.platformtools.ah.isNullOrNil(getIntent().getStringExtra("Select_App_Id"))) && (this.zoG))
      {
        AppMethodBeat.o(35164);
      }
      else if (this.zoG)
      {
        aw.ZK();
        if (ad.Mn(com.tencent.mm.model.c.XM().aoM(this.zJV).field_verifyFlag))
        {
          asr(paramString);
          AppMethodBeat.o(35164);
          bool = true;
        }
      }
      else
      {
        switch (this.msgType)
        {
        case 6:
        case 7:
        default:
          AppMethodBeat.o(35164);
          break;
        case 5:
          AppMethodBeat.o(35164);
          break;
        case 8:
          aw.ZK();
          String str = com.tencent.mm.model.c.XO().Rn(this.cJh).svN;
          aw.ZK();
          if (com.tencent.mm.model.t.kv(com.tencent.mm.model.c.XM().aoM(str).field_verifyFlag))
          {
            asr(paramString);
            AppMethodBeat.o(35164);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(35164);
          }
          break;
        }
      }
    }
  }

  public final int[] bMP()
  {
    AppMethodBeat.i(35193);
    int[] arrayOfInt = getIntent().getIntArrayExtra("search_range");
    if ((this.fromScene == 4) || (this.fromScene == 10))
    {
      arrayOfInt = new int[1];
      arrayOfInt[0] = 131072;
      AppMethodBeat.o(35193);
    }
    while (true)
    {
      return arrayOfInt;
      if (arrayOfInt != null)
      {
        AppMethodBeat.o(35193);
      }
      else
      {
        arrayOfInt = super.bMP();
        AppMethodBeat.o(35193);
      }
    }
  }

  public final void bMQ()
  {
    AppMethodBeat.i(35159);
    if (this.fromScene == 5)
      com.tencent.mm.ui.base.h.a(this, getString(2131301182), null, getString(2131302937), getString(2131297773), true, new SelectConversationUI.23(this), new SelectConversationUI.25(this));
    while (true)
    {
      if (this.zKb != null)
      {
        this.zKb.errCode = 0;
        ReportUtil.a(this, this.zKb, true);
      }
      AppMethodBeat.o(35159);
      return;
      super.bMQ();
      aqX();
    }
  }

  public final boolean dHZ()
  {
    return true;
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(35161);
    int i;
    if (this.zJZ)
    {
      i = paramInt - getContentLV().getHeaderViewsCount();
      if (i < 0)
      {
        ab.i("MicroMsg.SelectConversationUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
        dKm();
        AppMethodBeat.o(35161);
      }
    }
    Object localObject2;
    Object localObject3;
    while (true)
    {
      return;
      localObject1 = dHV();
      localObject2 = ((com.tencent.mm.ui.contact.n)localObject1).Pn(i);
      if (localObject2 == null)
      {
        AppMethodBeat.o(35161);
      }
      else if (((com.tencent.mm.ui.contact.a.a)localObject2).ehM == null)
      {
        AppMethodBeat.o(35161);
      }
      else
      {
        localObject2 = ((com.tencent.mm.ui.contact.a.a)localObject2).ehM.field_username;
        ab.i("MicroMsg.SelectConversationUI", "ClickUser=%s", new Object[] { localObject2 });
        if ((!this.zKa.contains(localObject2)) && (qS(true)))
        {
          dIb();
          AppMethodBeat.o(35161);
        }
        else
        {
          dIb();
          this.opo.ajq((String)localObject2);
          if (this.zKa.contains(localObject2))
            this.zKa.remove(localObject2);
          while (true)
          {
            Kt();
            ((com.tencent.mm.ui.contact.n)localObject1).notifyDataSetChanged();
            AppMethodBeat.o(35161);
            break;
            this.zKa.add(localObject2);
          }
          if (paramInt < getContentLV().getHeaderViewsCount())
          {
            ab.i("MicroMsg.SelectConversationUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
            if (this.zoG)
            {
              dKn();
              AppMethodBeat.o(35161);
            }
            else
            {
              dKo();
              AppMethodBeat.o(35161);
            }
          }
          else
          {
            localObject1 = (com.tencent.mm.ui.contact.a.a)getContentLV().getAdapter().getItem(paramInt);
            if (localObject1 == null)
            {
              AppMethodBeat.o(35161);
            }
            else if (((localObject1 instanceof com.tencent.mm.ui.contact.a.b)) && (((com.tencent.mm.ui.contact.a.b)localObject1).bCu == getResources().getString(2131296471)))
            {
              ab.i("MicroMsg.SelectConversationUI", "doCallSelectBizItem");
              localObject1 = new Intent();
              ((Intent)localObject1).putExtra("list_attr", 16384);
              com.tencent.mm.bp.d.b(this, "brandservice", ".ui.BrandServiceIndexUI", (Intent)localObject1, 4);
              this.zJO = true;
              AppMethodBeat.o(35161);
            }
            else if ((localObject1 instanceof com.tencent.mm.ui.contact.a.g))
            {
              localObject3 = (com.tencent.mm.ui.contact.a.g)localObject1;
              localObject2 = new Intent();
              ((Intent)localObject2).putExtra("scene", this.scene);
              localObject1 = new ArrayList();
              localObject3 = ((com.tencent.mm.ui.contact.a.a)localObject3).mDz.mEa;
              i = localObject3.length;
              for (paramInt = 0; paramInt < i; paramInt++)
                ((ArrayList)localObject1).add(localObject3[paramInt]);
              ((Intent)localObject2).putExtra("query_phrase_list", (Serializable)localObject1);
              com.tencent.mm.bp.d.b(this, ".ui.transmit.MMCreateChatroomUI", (Intent)localObject2, 1);
              AppMethodBeat.o(35161);
            }
            else
            {
              localObject1 = ((com.tencent.mm.ui.contact.a.a)localObject1).ehM;
              if (localObject1 != null)
                break;
              AppMethodBeat.o(35161);
            }
          }
        }
      }
    }
    Object localObject1 = ((ap)localObject1).field_username;
    ab.i("MicroMsg.SelectConversationUI", "doClickUser=%s", new Object[] { localObject1 });
    if (!asq((String)localObject1))
    {
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("Select_Conv_User", (String)localObject1);
      localObject3 = (Intent)getIntent().getParcelableExtra("Select_Conv_NextStep");
      if (localObject3 == null)
        break label621;
      a((Intent)localObject2, (Intent)localObject3);
    }
    while (true)
    {
      aqX();
      AppMethodBeat.o(35161);
      break;
      label621: if ((this.zJM) || (this.zoG) || (this.zJN) || (this.zJO) || (this.zJP))
      {
        t((Intent)localObject2, (String)localObject1);
      }
      else if (this.fromScene == 11)
      {
        ass((String)localObject1);
      }
      else
      {
        k(-1, (Intent)localObject2);
        finish();
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(35162);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object localObject1;
    Object localObject2;
    if (paramIntent != null)
    {
      ab.i("MicroMsg.SelectConversationUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = " + paramIntent.toString());
      if (paramInt1 != 1)
        break label297;
      if ((paramInt2 != -1) || (paramIntent == null))
        break label288;
      localObject1 = paramIntent.getStringExtra("Select_Conv_User");
      ab.i("MicroMsg.SelectConversationUI", "getIntent = " + getIntent());
      localObject2 = (Intent)getIntent().getParcelableExtra("Select_Conv_NextStep");
      if (localObject2 == null)
        break label203;
      if (!asq((String)localObject1))
        break label187;
      AppMethodBeat.o(35162);
    }
    label288: label297: 
    while (true)
    {
      return;
      ab.i("MicroMsg.SelectConversationUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = null");
      break;
      label187: a(paramIntent, (Intent)localObject2);
      AppMethodBeat.o(35162);
      continue;
      label203: if ((this.zJM) || (this.zoG) || (this.zJN) || (this.zJO) || (this.zJP))
      {
        t(paramIntent, (String)localObject1);
        AppMethodBeat.o(35162);
      }
      else if (this.fromScene == 11)
      {
        ass((String)localObject1);
        AppMethodBeat.o(35162);
      }
      else
      {
        k(-1, paramIntent);
        finish();
        AppMethodBeat.o(35162);
        continue;
        if (paramInt1 == 2)
        {
          switch (paramInt2)
          {
          default:
          case -1:
          case 0:
          }
          while (true)
          {
            AppMethodBeat.o(35162);
            break;
            finish();
            if ((paramIntent != null) && (paramIntent.getBooleanExtra("Select_stay_in_wx", false)))
            {
              paramIntent = new Intent(this, TaskRedirectUI.class);
              paramIntent.addFlags(268435456);
              startActivity(paramIntent);
              ReportUtil.F(false, 0);
              AppMethodBeat.o(35162);
              break;
              if (paramIntent != null)
                this.zKb = ((ReportUtil.ReportArgs)paramIntent.getParcelableExtra("Select_Report_Args"));
            }
          }
        }
        if (paramInt1 == 3)
        {
          switch (paramInt2)
          {
          default:
          case -1:
          }
          while (true)
          {
            AppMethodBeat.o(35162);
            break;
            if (paramIntent != null)
            {
              paramIntent = paramIntent.getStringExtra("received_card_name");
              if ((!bo.isNullOrNil(paramIntent)) && (!asq(paramIntent)))
              {
                localObject2 = new g.a(this.mController.ylL);
                ((g.a)localObject2).cx(paramIntent);
                a((g.a)localObject2, this.zJV);
                ((g.a)localObject2).h(Boolean.TRUE).KQ(2131297041).a(new SelectConversationUI.26(this, paramIntent)).gud.show();
              }
            }
          }
        }
        if (paramInt1 == 4)
        {
          if ((paramInt2 == -1) && (paramIntent != null))
            t(paramIntent, paramIntent.getStringExtra("Select_Contact"));
          AppMethodBeat.o(35162);
        }
        else if (paramInt1 == 5)
        {
          if ((paramInt2 == -1) && (paramIntent != null))
          {
            localObject2 = paramIntent.getStringExtra("Select_Conv_User");
            localObject1 = this.zKa.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              paramIntent = (String)((Iterator)localObject1).next();
              this.opo.ajr(paramIntent);
            }
            if (!com.tencent.mm.platformtools.ah.isNullOrNil((String)localObject2))
              this.zKa = com.tencent.mm.platformtools.ah.j(((String)localObject2).split(","));
            while (true)
            {
              paramIntent = this.zKa.iterator();
              while (paramIntent.hasNext())
              {
                localObject2 = (String)paramIntent.next();
                this.opo.bU((String)localObject2, false);
              }
              this.zKa.clear();
            }
            Kt();
            dHV().notifyDataSetChanged();
          }
          AppMethodBeat.o(35162);
        }
        else
        {
          ab.e("MicroMsg.SelectConversationUI", "onActivityResult, unknown requestCode = ".concat(String.valueOf(paramInt1)));
          AppMethodBeat.o(35162);
        }
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(35160);
    super.bMQ();
    AppMethodBeat.o(35160);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(35154);
    f.m(this);
    super.onCreate(paramBundle);
    String str = getIntent().getStringExtra("Select_App_Id");
    paramBundle = getIntent().getStringExtra("Select_Open_Id");
    ab.i("MicroMsg.SelectConversationUI", "onCreate, appId = " + str + ", openId = " + paramBundle);
    if ((!com.tencent.mm.platformtools.ah.isNullOrNil(str)) && (!com.tencent.mm.platformtools.ah.isNullOrNil(paramBundle)))
      new com.tencent.mm.plugin.base.stub.d(this, str, paramBundle, new SelectConversationUI.1(this)).aVi();
    f.n(this);
    AppMethodBeat.o(35154);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void vI(String paramString)
  {
    AppMethodBeat.i(35190);
    this.zKa.remove(paramString);
    dHV().notifyDataSetChanged();
    Kt();
    AppMethodBeat.o(35190);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI
 * JD-Core Version:    0.6.2
 */