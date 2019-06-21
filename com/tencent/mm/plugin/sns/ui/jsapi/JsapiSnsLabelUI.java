package com.tencent.mm.plugin.sns.ui.jsapi;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.v;
import com.tencent.mm.plugin.sns.model.x;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.widget.listview.AnimatedExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsapiSnsLabelUI extends MMActivity
  implements f
{
  public static int[] rth = { 2131303680, 2131303678, 2131303674, 2131303667 };
  public int rJl;
  public int rJm;
  public int rJn;
  public int rJo;
  private List<String> rJp;
  a rJq;
  List<String> rJr;
  private AnimatedExpandableListView rtg;
  private ArrayList<String> rti;
  private String rtj;
  private String rtk;
  private int rtm;
  private boolean rtn;
  private boolean rto;
  private boolean rtp;
  private boolean rtq;
  private int rtr;
  private com.tencent.mm.ui.base.p rts;
  private String rtt;
  private int rtu;
  private ArrayList<String> rtv;
  private ArrayList<String> rtw;
  private ArrayList<Long> rtx;
  private ArrayList<String[]> rty;

  public JsapiSnsLabelUI()
  {
    AppMethodBeat.i(40184);
    this.rJl = 0;
    this.rJm = 1;
    this.rJn = 2;
    this.rJo = 3;
    this.rJp = Arrays.asList("public,private,visible,invisible".split(","));
    this.rtm = this.rJl;
    this.rto = false;
    this.rtp = false;
    this.rtq = false;
    this.rJr = new ArrayList();
    AppMethodBeat.o(40184);
  }

  private String Er(int paramInt)
  {
    AppMethodBeat.i(138390);
    String str;
    if ((paramInt >= this.rJr.size()) || (paramInt < 0))
    {
      str = "";
      AppMethodBeat.o(138390);
    }
    while (true)
    {
      return str;
      str = (String)this.rJr.get(paramInt);
      AppMethodBeat.o(138390);
    }
  }

  private static String ZM(String paramString)
  {
    AppMethodBeat.i(40195);
    Object localObject = bo.hT(paramString, ",");
    paramString = new JSONArray();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("username", str);
          localJSONObject.put("displayName", mJ(str));
          localJSONObject.put("avatar", ZO(str));
          paramString.put(localJSONObject);
        }
        catch (JSONException localJSONException)
        {
          ab.printErrStackTrace("MicroMsg.SnsLabelUI", localJSONException, "", new Object[0]);
        }
      }
    }
    paramString = paramString.toString();
    AppMethodBeat.o(40195);
    return paramString;
  }

  private static String ZN(String paramString)
  {
    AppMethodBeat.i(40196);
    Object localObject1 = bo.hT(paramString, ",");
    JSONObject localJSONObject1 = new JSONObject();
    paramString = com.tencent.mm.plugin.label.a.a.bJa();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (String)((Iterator)localObject1).next();
      JSONArray localJSONArray = new JSONArray();
      try
      {
        localJSONObject1.put((String)localObject2, localJSONArray);
        localObject2 = paramString.PH(paramString.PE((String)localObject2));
        if (localObject2 != null)
        {
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            String str = (String)((Iterator)localObject2).next();
            JSONObject localJSONObject2 = new org/json/JSONObject;
            localJSONObject2.<init>();
            localJSONObject2.put("username", str);
            localJSONObject2.put("displayName", mJ(str));
            localJSONObject2.put("avatar", ZO(str));
            localJSONArray.put(localJSONObject2);
          }
        }
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.SnsLabelUI", localJSONException, "", new Object[0]);
      }
    }
    paramString = localJSONObject1.toString();
    AppMethodBeat.o(40196);
    return paramString;
  }

  private static String ZO(String paramString)
  {
    AppMethodBeat.i(40198);
    paramString = o.act().qo(paramString);
    if (paramString != null)
    {
      paramString = paramString.acl();
      AppMethodBeat.o(40198);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(40198);
    }
  }

  private void ar(Intent paramIntent)
  {
    AppMethodBeat.i(40194);
    ctA();
    paramIntent.putExtra("Klabel_name_list", ZN(this.rtj));
    paramIntent.putExtra("Kother_user_name_list", ZM(this.rtk));
    paramIntent.putExtra("k_select_group", Er(this.rJq.rtF));
    AppMethodBeat.o(40194);
  }

  private void ctA()
  {
    AppMethodBeat.i(40207);
    if ((this.rti == null) || (this.rti.isEmpty()))
    {
      this.rtj = "";
      AppMethodBeat.o(40207);
    }
    while (true)
    {
      return;
      ArrayList localArrayList1 = new ArrayList();
      if (this.rtj != null)
      {
        ArrayList localArrayList2 = bo.P(this.rtj.split(","));
        if (localArrayList2 != null)
        {
          Iterator localIterator = localArrayList2.iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            if (!this.rti.contains(str))
              localArrayList1.add(str);
          }
          localArrayList2.removeAll(localArrayList1);
          this.rtj = bo.c(localArrayList2, ",");
        }
      }
      AppMethodBeat.o(40207);
    }
  }

  private boolean ctt()
  {
    AppMethodBeat.i(40190);
    boolean bool1 = false;
    int i = this.rJq.rtF;
    boolean bool2;
    if (this.rJq.rtF != this.rtm)
      if (((i == this.rJn) && ((this.rJq.rtH.size() != 0) || (this.rJq.rtJ.size() != 0))) || ((i == this.rJo) && ((this.rJq.rtI.size() != 0) || (this.rJq.rtK.size() != 0))))
        bool2 = true;
    while (true)
    {
      AppMethodBeat.o(40190);
      return bool2;
      if (i != this.rJm)
      {
        bool2 = bool1;
        if (i != this.rJl);
      }
      else
      {
        bool2 = true;
        continue;
        if ((i != this.rJn) || (this.rJq.rtH.size() == 0) || ((bo.c(this.rJq.rtH, ",").equals(this.rtj)) && (bo.c(this.rJq.rtJ, ",").equals(this.rtk))))
        {
          bool2 = bool1;
          if (i == this.rJo)
          {
            bool2 = bool1;
            if (this.rJq.rtI.size() != 0)
              if (bo.c(this.rJq.rtI, ",").equals(this.rtj))
              {
                bool2 = bool1;
                if (bo.c(this.rJq.rtK, ",").equals(this.rtk))
                  continue;
              }
          }
        }
        else
        {
          bool2 = true;
        }
      }
    }
  }

  private void ctu()
  {
    AppMethodBeat.i(40192);
    Intent localIntent = new Intent();
    localIntent.putExtra("Ktag_range_index", this.rtm);
    ar(localIntent);
    setResult(-1, localIntent);
    finish();
    AppMethodBeat.o(40192);
  }

  private static int ctw()
  {
    AppMethodBeat.i(40202);
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(335874, Integer.valueOf(0))).intValue();
    AppMethodBeat.o(40202);
    return i;
  }

  private static void ctx()
  {
    AppMethodBeat.i(40203);
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(335874, Integer.valueOf(0))).intValue();
    g.RQ();
    g.RP().Ry().set(335874, Integer.valueOf(i + 1));
    AppMethodBeat.o(40203);
  }

  private void cty()
  {
    AppMethodBeat.i(40204);
    com.tencent.mm.plugin.report.service.h.pYm.e(11455, new Object[] { "", "", Integer.valueOf(this.rtu), Integer.valueOf(0) });
    ctx();
    this.rtw = null;
    this.rtq = false;
    this.rtp = false;
    if ((this.rts != null) && (this.rts.isShowing()))
      this.rts.dismiss();
    if (this.rto)
    {
      this.rto = false;
      AppMethodBeat.o(40204);
    }
    while (true)
    {
      return;
      int i = 2131303685;
      if (ctw() > 1)
        i = 2131303684;
      com.tencent.mm.ui.base.h.a(this, i, 2131296994, new JsapiSnsLabelUI.4(this));
      AppMethodBeat.o(40204);
    }
  }

  private void ctz()
  {
    AppMethodBeat.i(40206);
    if ((this.rti == null) || (this.rti.isEmpty()))
    {
      if (this.rJq.rtH != null)
        this.rJq.rtH.clear();
      if (this.rJq.rtI != null)
        this.rJq.rtI.clear();
      AppMethodBeat.o(40206);
    }
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator;
      String str;
      if ((this.rJr.size() > 0) && ("visible".equals(Er(this.rtm))) && (this.rJq.rtH != null))
      {
        localIterator = this.rJq.rtH.iterator();
        while (localIterator.hasNext())
        {
          str = (String)localIterator.next();
          if (!this.rti.contains(str))
            localArrayList.add(str);
        }
        this.rJq.rtH.removeAll(localArrayList);
        AppMethodBeat.o(40206);
      }
      else
      {
        if ((this.rJr.size() > 0) && ("invisible".equals(Er(this.rtm))))
        {
          localIterator = this.rJq.rtI.iterator();
          while (localIterator.hasNext())
          {
            str = (String)localIterator.next();
            if (!this.rti.contains(str))
              localArrayList.add(str);
          }
          this.rJq.rtI.removeAll(localArrayList);
        }
        AppMethodBeat.o(40206);
      }
    }
  }

  private void ds(List<String[]> paramList)
  {
    AppMethodBeat.i(40205);
    if ((this.rtw == null) || (this.rtw.size() == 0))
      AppMethodBeat.o(40205);
    while (true)
    {
      return;
      Iterator localIterator = this.rtw.iterator();
      paramList = paramList.iterator();
      ArrayList localArrayList1 = new ArrayList(this.rtw.size());
      ArrayList localArrayList2 = new ArrayList(this.rtw.size());
      while (localIterator.hasNext())
      {
        localArrayList1.add(com.tencent.mm.plugin.label.a.a.bJa().PE((String)localIterator.next()));
        localArrayList2.add(bo.c(Arrays.asList((Object[])paramList.next()), ","));
        this.rtp = true;
      }
      com.tencent.mm.plugin.label.a.a.bJa().i(localArrayList1, localArrayList2);
      AppMethodBeat.o(40205);
    }
  }

  private static int[] dw(List<Integer> paramList)
  {
    AppMethodBeat.i(40187);
    int[] arrayOfInt = new int[paramList.size()];
    for (int i = 0; i < paramList.size(); i++)
      arrayOfInt[i] = ((Integer)paramList.get(i)).intValue();
    AppMethodBeat.o(40187);
    return arrayOfInt;
  }

  private void goBack()
  {
    AppMethodBeat.i(40191);
    if (ctt())
    {
      com.tencent.mm.ui.base.h.a(this, true, getString(2131303673), "", getString(2131303672), getString(2131303671), new JsapiSnsLabelUI.11(this), new JsapiSnsLabelUI.12(this));
      AppMethodBeat.o(40191);
    }
    while (true)
    {
      return;
      ctu();
      AppMethodBeat.o(40191);
    }
  }

  private static String mJ(String paramString)
  {
    AppMethodBeat.i(40197);
    paramString = ((com.tencent.mm.plugin.messenger.a.b)g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ(paramString);
    AppMethodBeat.o(40197);
    return paramString;
  }

  final void ctv()
  {
    AppMethodBeat.i(40193);
    Intent localIntent = new Intent();
    if (this.rJq.rtF == this.rJn)
    {
      this.rtj = bo.c(this.rJq.rtH, ",");
      this.rtk = bo.c(this.rJq.rtJ, ",");
      ar(localIntent);
    }
    while (true)
    {
      localIntent.putExtra("k_select_group", Er(this.rJq.rtF));
      localIntent.putExtra("k_select_index", this.rJq.rtF);
      localIntent.putExtra("Ktag_range_index", this.rJq.rtF);
      setResult(-1, localIntent);
      finish();
      AppMethodBeat.o(40193);
      return;
      if (this.rJq.rtF == this.rJo)
      {
        this.rtj = bo.c(this.rJq.rtI, ",");
        this.rtk = bo.c(this.rJq.rtK, ",");
        ar(localIntent);
      }
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(40185);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(40185);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(40185);
    }
  }

  public final int getLayoutId()
  {
    return 2130970767;
  }

  public final void initView()
  {
    AppMethodBeat.i(40188);
    boolean bool = getIntent().getBooleanExtra("KLabel_is_filter_private", false);
    this.rtg = ((AnimatedExpandableListView)findViewById(2131827785));
    this.rti = ((ArrayList)com.tencent.mm.plugin.label.a.a.bJa().bIV());
    this.rJq.rtG = bool;
    this.rJq.T(this.rti);
    ctz();
    AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, -2);
    localLayoutParams.height = getResources().getDimensionPixelSize(2131427779);
    View localView = new View(this);
    localView.setLayoutParams(localLayoutParams);
    this.rtg.addHeaderView(localView);
    this.rtg.setAdapter(this.rJq);
    this.rtg.setOnGroupClickListener(new JsapiSnsLabelUI.5(this));
    this.rtg.setOnChildClickListener(new JsapiSnsLabelUI.6(this));
    setBackBtn(new JsapiSnsLabelUI.7(this));
    a(0, getString(2131303669), new JsapiSnsLabelUI.8(this), q.b.ymu);
    AppMethodBeat.o(40188);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(40189);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object localObject;
    if ((paramInt2 == -1) && (paramInt1 == 4003))
    {
      ab.i("MicroMsg.SnsLabelUI", "the Activity completed");
      localObject = paramIntent.getStringExtra("Select_Contacts_To_Create_New_Label");
      if (!bo.isNullOrNil((String)localObject))
      {
        paramIntent = new Intent();
        paramIntent.putExtra("Select_Contact", (String)localObject);
        d.b(this.mController.ylL, "label", ".ui.ContactLabelEditUI", paramIntent, 4002);
        AppMethodBeat.o(40189);
      }
    }
    while (true)
    {
      return;
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      this.rtk = new String(paramIntent);
      ab.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", new Object[] { String.valueOf(paramIntent) });
      if (this.rtr == this.rJn)
      {
        this.rJq.rtJ.clear();
        if (!bo.isNullOrNil(paramIntent))
        {
          paramIntent = bo.P(paramIntent.split(","));
          this.rJq.rtJ.addAll(paramIntent);
          this.rJq.rtF = this.rtr;
        }
      }
      while (true)
      {
        this.rJq.notifyDataSetChanged();
        this.rtg.expandGroup(this.rtr);
        AppMethodBeat.o(40189);
        break;
        if (this.rtr == this.rJo)
        {
          this.rJq.rtK.clear();
          if (!bo.isNullOrNil(paramIntent))
          {
            paramIntent = bo.P(paramIntent.split(","));
            this.rJq.rtK.addAll(paramIntent);
            this.rJq.rtF = this.rtr;
          }
        }
      }
      if ((paramInt2 == -1) && (paramInt1 == 4001))
      {
        paramIntent = paramIntent.getStringExtra("Select_Contact");
        ab.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", new Object[] { String.valueOf(paramIntent) });
        if (!bo.isNullOrNil(paramIntent))
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("Select_Contact", paramIntent);
          d.b(this, "label", ".ui.ContactLabelEditUI", (Intent)localObject, 4002);
        }
        AppMethodBeat.o(40189);
      }
      else
      {
        if ((paramInt2 == 0) && (paramInt1 == 4002) && (paramIntent != null))
        {
          localObject = paramIntent.getStringExtra("k_sns_label_add_label");
          this.rtt = paramIntent.getStringExtra("k_sns_label_add_label");
          this.rtg.postDelayed(new JsapiSnsLabelUI.10(this, (String)localObject), 600L);
        }
        AppMethodBeat.o(40189);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(40186);
    super.onCreate(paramBundle);
    setMMTitle(2131303812);
    g.RQ();
    g.RO().eJo.a(292, this);
    g.RQ();
    g.RO().eJo.a(635, this);
    g.RQ();
    g.RO().eJo.a(638, this);
    g.RQ();
    g.RO().eJo.a(290, this);
    this.rJq = new a(this);
    this.rJq.rJx = false;
    this.rJq.rJw = new JsapiSnsLabelUI.1(this);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      this.rtm = this.rJl;
      this.rJq.style = 0;
      this.rtj = null;
      this.rtk = null;
      this.rJq.rtF = this.rtm;
      if (this.rJq.style == 1)
        findViewById(2131827784).setBackgroundResource(2131689761);
      if (this.rtm != this.rJn)
        break label1073;
      if (!TextUtils.isEmpty(this.rtj))
        this.rJq.rtH = bo.P(this.rtj.split(","));
      if (!TextUtils.isEmpty(this.rtk))
        this.rJq.rtJ = bo.P(this.rtk.split(","));
      label260: g.RQ();
      this.rtn = ((Boolean)g.RP().Ry().get(335873, Boolean.TRUE)).booleanValue();
      if (this.rtn)
      {
        this.rtp = true;
        this.rtq = true;
        if (ctw() > 0)
          this.rto = true;
        g.RQ();
        g.RO().eJo.a(new v(1), 0);
      }
      initView();
      Object localObject1 = getIntent();
      if (localObject1 == null)
        break label1231;
      paramBundle = ((Intent)localObject1).getStringExtra("k_select_group");
      boolean bool1 = ((Intent)localObject1).getBooleanExtra("k_show_public", true);
      boolean bool2 = ((Intent)localObject1).getBooleanExtra("k_show_private", true);
      boolean bool3 = ((Intent)localObject1).getBooleanExtra("k_show_include", true);
      boolean bool4 = ((Intent)localObject1).getBooleanExtra("k_show_exclude", true);
      Object localObject2 = new int[4];
      Object tmp407_405 = localObject2;
      tmp407_405[0] = 2131303680;
      Object tmp412_407 = tmp407_405;
      tmp412_407[1] = 2131303678;
      Object tmp417_412 = tmp412_407;
      tmp417_412[2] = 2131303674;
      Object tmp422_417 = tmp417_412;
      tmp422_417[3] = 2131303667;
      tmp422_417;
      this.rJr.clear();
      ArrayList localArrayList = new ArrayList();
      localObject1 = new ArrayList();
      if (bool1)
      {
        localArrayList.add(Integer.valueOf(localObject2[0]));
        ((List)localObject1).add(Integer.valueOf(localObject2[0]));
        this.rJr.add(this.rJp.get(0));
      }
      if (bool2)
      {
        localArrayList.add(Integer.valueOf(localObject2[1]));
        ((List)localObject1).add(Integer.valueOf(localObject2[1]));
        this.rJr.add(this.rJp.get(1));
      }
      if (bool3)
      {
        localArrayList.add(Integer.valueOf(localObject2[2]));
        ((List)localObject1).add(Integer.valueOf(localObject2[2]));
        this.rJr.add(this.rJp.get(2));
      }
      if (bool4)
      {
        localArrayList.add(Integer.valueOf(localObject2[3]));
        ((List)localObject1).add(Integer.valueOf(localObject2[3]));
        this.rJr.add(this.rJp.get(3));
      }
      this.rJl = this.rJr.indexOf("public");
      this.rJm = this.rJr.indexOf("private");
      this.rJn = this.rJr.indexOf("visible");
      this.rJo = this.rJr.indexOf("invisible");
      if (this.rJq == null)
        break label1231;
      a locala = this.rJq;
      localObject2 = this.rJr;
      locala.rJv = ((List)localObject2);
      locala.rJl = ((List)localObject2).indexOf("public");
      locala.rJm = ((List)localObject2).indexOf("private");
      locala.rJn = ((List)localObject2).indexOf("visible");
      locala.rJo = ((List)localObject2).indexOf("invisible");
      this.rJq.rJu = localArrayList.size();
      this.rJq.rth = dw(localArrayList);
      this.rJq.rtD = dw((List)localObject1);
      if (TextUtils.isEmpty(paramBundle))
        break label1231;
      this.rJq.rtF = this.rJr.indexOf(paramBundle);
      if (!paramBundle.equals("visible"))
        break label1145;
      if (!TextUtils.isEmpty(this.rtj))
        this.rJq.rtH = bo.P(this.rtj.split(","));
      if (!TextUtils.isEmpty(this.rtk))
        this.rJq.rtJ = bo.P(this.rtk.split(","));
      this.rtg.expandGroup(this.rJr.indexOf(paramBundle));
      AppMethodBeat.o(40186);
    }
    while (true)
    {
      return;
      if (paramBundle.hasExtra("k_title"))
        setMMTitle(paramBundle.getStringExtra("k_title"));
      this.rtm = paramBundle.getIntExtra("KLabel_range_index", this.rJl);
      this.rJq.style = paramBundle.getIntExtra("k_sns_label_ui_style", 0);
      this.rtj = paramBundle.getStringExtra("Klabel_name_list");
      this.rtk = paramBundle.getStringExtra("Kother_user_name_list");
      if (TextUtils.isEmpty(paramBundle.getStringExtra("k_sns_label_ui_title")))
        break;
      setMMTitle(paramBundle.getStringExtra("k_sns_label_ui_title"));
      break;
      label1073: if (this.rtm != this.rJo)
        break label260;
      if (!TextUtils.isEmpty(this.rtj))
        this.rJq.rtI = bo.P(this.rtj.split(","));
      if (TextUtils.isEmpty(this.rtk))
        break label260;
      this.rJq.rtK = bo.P(this.rtk.split(","));
      break label260;
      label1145: if (paramBundle.equals("invisible"))
      {
        if (!TextUtils.isEmpty(this.rtj))
          this.rJq.rtI = bo.P(this.rtj.split(","));
        if (!TextUtils.isEmpty(this.rtk))
          this.rJq.rtK = bo.P(this.rtk.split(","));
        this.rtg.expandGroup(this.rJr.indexOf(paramBundle));
      }
      label1231: AppMethodBeat.o(40186);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(40199);
    g.RQ();
    g.RO().eJo.b(292, this);
    g.RQ();
    g.RO().eJo.b(635, this);
    g.RQ();
    g.RO().eJo.b(638, this);
    g.RQ();
    g.RO().eJo.b(290, this);
    super.onDestroy();
    AppMethodBeat.o(40199);
  }

  public void onResume()
  {
    AppMethodBeat.i(40200);
    if ((this.rJq != null) && (this.rtt == null) && (this.rtg != null))
      this.rtg.postDelayed(new JsapiSnsLabelUI.2(this), 600L);
    super.onResume();
    AppMethodBeat.o(40200);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(40201);
    ab.i("MicroMsg.SnsLabelUI", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!this.rtp)
    {
      AppMethodBeat.o(40201);
      return;
    }
    switch (paramm.getType())
    {
    default:
    case 292:
    case 635:
    case 638:
    case 290:
    }
    while (true)
    {
      AppMethodBeat.o(40201);
      break;
      Object localObject;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Cursor localCursor = af.cnL().getCursor();
        this.rtu = localCursor.getCount();
        if (this.rtu > 0)
        {
          localCursor.moveToFirst();
          t localt = new t();
          paramInt1 = localCursor.getCount();
          this.rtw = new ArrayList(paramInt1);
          this.rtv = new ArrayList(paramInt1);
          this.rty = new ArrayList(paramInt1);
          this.rtx = new ArrayList(paramInt1);
          if (!localCursor.isAfterLast())
          {
            localt.d(localCursor);
            if ((localt.field_memberList != null) && (localt.field_memberList.length() != 0))
            {
              this.rty.add(localt.field_memberList.split(","));
              paramm = localt.field_tagName;
              localObject = this.rtw;
              paramString = com.tencent.mm.plugin.label.a.a.bJa().bIX();
              if (paramString == null)
              {
                paramString = paramm;
                label295: ((ArrayList)localObject).add(paramString);
                this.rtv.add(paramm);
                this.rtx.add(Long.valueOf(localt.field_tagId));
              }
            }
            while (true)
            {
              localCursor.moveToNext();
              break;
              if (!paramString.contains(paramm))
              {
                paramString = paramm;
                break label295;
              }
              paramString = String.format(getString(2131303670), new Object[] { paramm });
              break label295;
              ab.e("MicroMsg.SnsLabelUI", "dz:snstaginfo memberlist is null.");
            }
          }
          localCursor.close();
          if (this.rtv.size() != 0)
            break label507;
          paramInt1 = 0;
          label409: if (paramInt1 != 0);
        }
        else if (this.rtq)
        {
          this.rJq.rtF = this.rtr;
          this.rtg.Qi(this.rtr);
          g.RQ();
          g.RP().Ry().set(335873, Boolean.FALSE);
        }
        localCursor.close();
        if (this.rto)
        {
          this.rtp = true;
          com.tencent.mm.plugin.label.a.a.bJa().ce(this.rtw);
        }
      }
      while (true)
      {
        this.rtq = false;
        AppMethodBeat.o(40201);
        break;
        label507: paramInt1 = 1;
        break label409;
        this.rtp = false;
        continue;
        cty();
        ab.i("MicroMsg.SnsLabelUI", "dz: error at get sns tag list!");
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ds(this.rty);
        AppMethodBeat.o(40201);
        break;
      }
      cty();
      ab.i("MicroMsg.SnsLabelUI", "dz: error at add contact label!");
      AppMethodBeat.o(40201);
      break;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.rtv.iterator();
        paramm = this.rtx.iterator();
        while (paramString.hasNext())
        {
          long l = ((Long)paramm.next()).longValue();
          localObject = (String)paramString.next();
          if (l != 0L)
          {
            g.RQ();
            g.RO().eJo.a(new x(l, (String)localObject), 0);
          }
        }
        g.RQ();
        g.RP().Ry().set(335874, Integer.valueOf(0));
        this.rti = ((ArrayList)com.tencent.mm.plugin.label.a.a.bJa().bIV());
        paramString = com.tencent.mm.plugin.report.service.h.pYm;
        paramInt2 = this.rtu;
        if (this.rtw == null);
        for (paramInt1 = 0; ; paramInt1 = this.rtw.size())
        {
          paramString.e(11455, new Object[] { "", "", Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
          this.rtg.postDelayed(new JsapiSnsLabelUI.3(this), 600L);
          g.RQ();
          g.RP().Ry().set(335873, Boolean.FALSE);
          AppMethodBeat.o(40201);
          break;
        }
      }
      cty();
      ab.i("MicroMsg.SnsLabelUI", "dz: error at modify label list!");
      AppMethodBeat.o(40201);
      break;
      if ((paramInt1 != 0) || (paramInt2 != 0))
        ab.i("MicroMsg.SnsLabelUI", "dz: error at delete tag list!");
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI
 * JD-Core Version:    0.6.2
 */