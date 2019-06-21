package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage.Resp;
import com.tencent.mm.plugin.card.b.j;
import com.tencent.mm.plugin.card.b.j.a;
import com.tencent.mm.plugin.card.b.j.b;
import com.tencent.mm.plugin.card.d.d;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.a;
import com.tencent.mm.plugin.card.model.aj;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public class CardListSelectedUI extends MMActivity
  implements com.tencent.mm.ai.f, j.a
{
  private View Ek;
  private String app_id;
  LinkedList<a> eAF;
  boolean eTf;
  private com.tencent.mm.ui.base.p ejZ;
  private int emC;
  private String kbU;
  com.tencent.mm.bt.b keu;
  private BaseAdapter khG;
  private boolean khr;
  private String kiA;
  private String kiB;
  private TextView kmh;
  private RelativeLayout kmi;
  private TextView kmj;
  private TextView kmk;
  boolean kml;
  HashMap<Integer, Boolean> kmm;
  private boolean kmn;
  private boolean kmo;
  private boolean kmp;
  private int kmq;
  private String kmr;
  private String kms;
  private String kmt;
  private String kmu;
  private int kmv;
  public String kmw;
  private boolean kmx;
  private a kmy;
  private ListView mListView;
  private int time_stamp;

  public CardListSelectedUI()
  {
    AppMethodBeat.i(88569);
    this.ejZ = null;
    this.kml = false;
    this.eAF = new LinkedList();
    this.kmm = new HashMap();
    this.eTf = true;
    this.keu = null;
    this.khr = false;
    this.kiA = "";
    this.kmx = false;
    this.emC = 0;
    AppMethodBeat.o(88569);
  }

  private static String GU(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(88574);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(88574);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = localJSONObject.optString("rule_url");
        AppMethodBeat.o(88574);
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.CardListSelectedUI", paramString, "", new Object[0]);
        AppMethodBeat.o(88574);
        paramString = localObject;
      }
    }
  }

  private void aq(int paramInt, String paramString)
  {
    AppMethodBeat.i(88582);
    if (this.emC != 8)
    {
      ab.e("MicroMsg.CardListSelectedUI", "setResultToSDK need MM_CARD_ITEM_FROM_SCENE_OPENAPI scene, the fromscene is " + this.emC);
      AppMethodBeat.o(88582);
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("_wxapi_choose_card_from_wx_card_list", paramString);
    Object localObject = com.tencent.mm.pluginsdk.model.app.g.bT(this.app_id, true);
    ChooseCardFromWXCardPackage.Resp localResp = new ChooseCardFromWXCardPackage.Resp(localBundle);
    if (localObject != null)
      localResp.openId = ((com.tencent.mm.pluginsdk.model.app.f)localObject).field_openId;
    localResp.transaction = this.kiB;
    String str1 = this.app_id;
    String str2;
    if (localObject == null)
    {
      str2 = "null appinfo";
      label118: if (localObject != null)
        break label260;
      localObject = "null appinfo";
      label127: ab.i("MicroMsg.CardListSelectedUI", "setResultToSDK, appid : %s, appname : %s, openid : %s, transcation : %s", new Object[] { str1, str2, localObject, this.kiB });
      localResp.toBundle(localBundle);
      ab.i("MicroMsg.CardListSelectedUI", "setResultToSDK result:".concat(String.valueOf(paramInt)));
      ab.d("MicroMsg.CardListSelectedUI", "setResultToSDK card_list:".concat(String.valueOf(paramString)));
      if (paramInt != -1)
        break label270;
    }
    label260: label270: for (localResp.errCode = 0; ; localResp.errCode = -2)
    {
      paramString = new MMessageActV2.Args();
      paramString.targetPkgName = this.kiA;
      paramString.bundle = localBundle;
      com.tencent.mm.pluginsdk.model.app.p.at(localBundle);
      com.tencent.mm.pluginsdk.model.app.p.au(localBundle);
      MMessageActV2.send(ah.getContext(), paramString);
      AppMethodBeat.o(88582);
      break;
      str2 = ((com.tencent.mm.pluginsdk.model.app.f)localObject).field_appName;
      break label118;
      localObject = ((com.tencent.mm.pluginsdk.model.app.f)localObject).field_openId;
      break label127;
    }
  }

  private void bcs()
  {
    AppMethodBeat.i(88579);
    Intent localIntent = new Intent();
    String str = bdl();
    if (this.kmx)
      localIntent.putExtra("choose_invoice_info", str);
    while (true)
    {
      setResult(-1, localIntent);
      aq(-1, str);
      finish();
      AppMethodBeat.o(88579);
      return;
      localIntent.putExtra("choose_card_info", str);
    }
  }

  private void bdk()
  {
    AppMethodBeat.i(88571);
    if (this.khr)
    {
      ab.e("MicroMsg.CardListSelectedUI", "doNetSceneGetShareCardsLayout, isDoingGetData is true");
      AppMethodBeat.o(88571);
    }
    while (true)
    {
      return;
      if (this.keu == null)
      {
        this.kmn = false;
        this.kmo = false;
        this.kmp = false;
      }
      com.tencent.mm.kernel.g.RO().eJo.a(664, this);
      aj localaj = new aj(this.app_id, this.kmq, this.kmr, this.kms, this.time_stamp, this.kmt, this.kbU, this.kmu, this.keu);
      com.tencent.mm.kernel.g.RO().eJo.a(localaj, 0);
      fE(true);
      this.khr = true;
      if (this.kmv == 1)
        this.kml = true;
      AppMethodBeat.o(88571);
    }
  }

  private String bdl()
  {
    int i = 0;
    AppMethodBeat.i(88580);
    Object localObject1 = new ArrayList();
    Object localObject2;
    for (int j = 0; j < this.eAF.size(); j++)
    {
      localObject2 = (Boolean)this.kmm.get(Integer.valueOf(j));
      if ((localObject2 != null) && (((Boolean)localObject2).booleanValue()))
        ((ArrayList)localObject1).add(this.eAF.get(j));
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    for (j = i; j < ((ArrayList)localObject1).size(); j++)
    {
      if (j != 0)
        localStringBuilder.append(",");
      localObject2 = (a)((ArrayList)localObject1).get(j);
      localStringBuilder.append("{");
      localStringBuilder.append("\"card_id\":");
      localStringBuilder.append("\"" + ((a)localObject2).kbU + "\"");
      localStringBuilder.append(",");
      localStringBuilder.append("\"encrypt_code\":");
      localStringBuilder.append("\"" + ((a)localObject2).kbY + "\"");
      if (this.kmx)
      {
        localStringBuilder.append(",");
        localStringBuilder.append("\"app_id\":");
        localStringBuilder.append("\"" + ((a)localObject2).app_id + "\"");
      }
      localStringBuilder.append("}");
    }
    localStringBuilder.append("]");
    localObject1 = localStringBuilder.toString();
    AppMethodBeat.o(88580);
    return localObject1;
  }

  public final void Gp(String paramString)
  {
  }

  public final void b(String paramString, j.b paramb)
  {
    int i = 0;
    AppMethodBeat.i(88575);
    fE(false);
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(this.kmy.kca)))
    {
      ab.e("MicroMsg.CardListSelectedUI", "onMarkSuccess(), the mark card id is diff from current id!");
      AppMethodBeat.o(88575);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardListSelectedUI", "onMarkSuccess()");
      ab.i("MicroMsg.CardListSelectedUI", "markSucc:" + paramb.kbI + " markCardId: " + paramb.kbJ);
      if (paramb.kbI == 1)
      {
        int j;
        if ((!TextUtils.isEmpty(paramb.kbJ)) && (!paramString.equals(paramb.kbJ)))
        {
          ab.i("MicroMsg.CardListSelectedUI", "markCardId is diff as now id!");
          j = 0;
          label135: if (j < this.eAF.size())
          {
            if (((a)this.eAF.get(j)).kca != paramb.kbJ)
              break label230;
            while (i < this.eAF.size())
            {
              this.kmm.put(Integer.valueOf(i), Boolean.FALSE);
              i++;
            }
            this.kmm.put(Integer.valueOf(j), Boolean.TRUE);
          }
        }
        while (true)
        {
          bcs();
          AppMethodBeat.o(88575);
          break;
          label230: j++;
          break label135;
          ab.i("MicroMsg.CardListSelectedUI", "markCardId is same as now id!");
        }
      }
      d.c(this, getString(2131297916));
      AppMethodBeat.o(88575);
    }
  }

  public final void dl(String paramString1, String paramString2)
  {
    AppMethodBeat.i(88576);
    fE(false);
    if ((!TextUtils.isEmpty(paramString1)) && (!paramString1.equals(this.kmy.kca)))
    {
      ab.e("MicroMsg.CardListSelectedUI", "onMarkFail(), the mark card id is diff from current id!");
      AppMethodBeat.o(88576);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardListSelectedUI", "onMarkFail()");
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2))
        paramString1 = getString(2131297915);
      d.c(this, paramString1);
      AppMethodBeat.o(88576);
    }
  }

  protected final void fE(boolean paramBoolean)
  {
    AppMethodBeat.i(88578);
    if (paramBoolean)
    {
      this.ejZ = com.tencent.mm.ui.base.p.b(this, getString(2131300968), false, null);
      AppMethodBeat.o(88578);
    }
    while (true)
    {
      return;
      if ((this.ejZ != null) && (this.ejZ.isShowing()))
      {
        this.ejZ.dismiss();
        this.ejZ = null;
      }
      AppMethodBeat.o(88578);
    }
  }

  public final int getLayoutId()
  {
    return 2130968953;
  }

  public final void initView()
  {
    AppMethodBeat.i(88572);
    if (this.kmx)
    {
      setMMTitle(2131297910);
      setBackBtn(new CardListSelectedUI.1(this));
      if (!this.kmx)
      {
        addTextOptionMenu(0, getString(2131296944), new CardListSelectedUI.2(this));
        enableOptionMenu(false);
      }
      this.mListView = ((ListView)findViewById(2131822225));
      if (!this.kmx)
        break label288;
      this.khG = new b();
      label97: this.mListView.setAdapter(this.khG);
      this.mListView.setOnItemClickListener(new CardListSelectedUI.3(this));
      this.mListView.setOnScrollListener(new CardListSelectedUI.4(this));
      this.Ek = findViewById(2131821926);
      this.kmh = ((TextView)findViewById(2131821927));
      if (this.kmx)
        this.kmh.setText(getString(2131297951));
      this.kmi = ((RelativeLayout)findViewById(2131822220));
      this.kmj = ((TextView)findViewById(2131822223));
      this.kmk = ((TextView)findViewById(2131822224));
      if (!this.kmx)
        break label303;
      this.kmi.setVisibility(0);
      this.kmj.setOnClickListener(new CardListSelectedUI.5(this));
      this.kmk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(88560);
          CardListSelectedUI.a(CardListSelectedUI.this);
          AppMethodBeat.o(88560);
        }
      });
      AppMethodBeat.o(88572);
    }
    while (true)
    {
      return;
      setMMTitle(2131297909);
      break;
      label288: this.khG = new a();
      break label97;
      label303: this.kmi.setVisibility(8);
      AppMethodBeat.o(88572);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88570);
    super.onCreate(paramBundle);
    am.bbi().a(this);
    paramBundle = getIntent();
    ab.i("MicroMsg.CardListSelectedUI", "initData()");
    if (paramBundle == null)
    {
      ab.e("MicroMsg.CardListSelectedUI", "doGetCardList()  intent == null");
      setResult(1);
      aq(1, "");
      finish();
    }
    while (true)
    {
      bdk();
      initView();
      AppMethodBeat.o(88570);
      return;
      this.emC = paramBundle.getIntExtra("key_from_scene", 0);
      ab.i("MicroMsg.CardListSelectedUI", "mFromScene:" + this.emC);
      this.app_id = paramBundle.getStringExtra("app_id");
      this.kmq = paramBundle.getIntExtra("shop_id", 0);
      this.kmr = paramBundle.getStringExtra("sign_type");
      this.kms = paramBundle.getStringExtra("card_sign");
      this.time_stamp = paramBundle.getIntExtra("time_stamp", 0);
      this.kmt = paramBundle.getStringExtra("nonce_str");
      this.kbU = paramBundle.getStringExtra("card_tp_id");
      this.kmu = paramBundle.getStringExtra("card_type");
      this.kmv = paramBundle.getIntExtra("can_multi_select", 0);
      this.kiA = paramBundle.getStringExtra("key_package_name");
      this.kiB = paramBundle.getStringExtra("key_transaction");
      ab.i("MicroMsg.CardListSelectedUI", "app_id:" + this.app_id + " shop_id:" + this.kmq + " sign_type:" + this.kmr + " time_stamp:" + this.time_stamp);
      ab.i("MicroMsg.CardListSelectedUI", "nonce_str:" + this.kmt + " card_tp_id:" + this.kbU + " card_type:" + this.kmu + " canMultiSelect:" + this.kmv + " packateName:" + this.kiA);
      if ("INVOICE".equalsIgnoreCase(this.kmu))
        this.kmx = true;
      if (TextUtils.isEmpty(this.app_id))
      {
        ab.e("MicroMsg.CardListSelectedUI", "doGetCardList()  app_id is nulls");
        setResult(1);
        aq(1, "app_id  or card_sign is empty!");
        finish();
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88577);
    am.bbi().b(this);
    super.onDestroy();
    AppMethodBeat.o(88577);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(88581);
    if (paramInt == 4)
    {
      setResult(0);
      aq(0, "");
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(88581);
    return bool;
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(88573);
    if ((paramm instanceof aj))
    {
      com.tencent.mm.kernel.g.RO().eJo.b(664, this);
      fE(false);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label391;
      String str = ((aj)paramm).kdS;
      ab.d("MicroMsg.CardListSelectedUI", str);
      paramString = a.Gs(str);
      LinkedList localLinkedList = a.Gt(str);
      this.kmw = GU(str);
      if ((this.keu == null) && ((paramString != null) || (localLinkedList != null)))
      {
        this.kmm.clear();
        this.eAF.clear();
      }
      if (paramString != null)
      {
        if ((paramString.size() > 0) && (!this.kmn))
        {
          this.kmn = true;
          if (!this.kmx)
            break label206;
        }
        label206: for (((a)paramString.get(0)).jKR = getString(2131297962); ; ((a)paramString.get(0)).jKR = getString(2131297961))
        {
          paramInt1 = this.eAF.size();
          this.eAF.addAll(paramString);
          while (paramInt1 < this.eAF.size())
          {
            this.kmm.put(Integer.valueOf(paramInt1), Boolean.FALSE);
            paramInt1++;
          }
        }
      }
      if (localLinkedList != null)
      {
        if ((localLinkedList.size() > 0) && (!this.kmo))
        {
          this.kmo = true;
          ((a)localLinkedList.get(0)).jKR = getString(2131297828);
        }
        paramInt1 = this.eAF.size();
        this.eAF.addAll(localLinkedList);
        while (paramInt1 < this.eAF.size())
        {
          this.kmm.put(Integer.valueOf(paramInt1), Boolean.FALSE);
          paramInt1++;
        }
      }
      this.eTf = ((aj)paramm).eTf;
      this.keu = ((aj)paramm).keu;
      this.khG.notifyDataSetChanged();
      if (this.eAF.size() == 0)
        break label400;
      this.Ek.setVisibility(8);
      this.mListView.setVisibility(0);
    }
    while (true)
    {
      this.khr = false;
      AppMethodBeat.o(88573);
      return;
      label391: d.b(this, paramString, paramInt2);
      break;
      label400: this.Ek.setVisibility(0);
      this.mListView.setVisibility(8);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends BaseAdapter
  {
    a()
    {
    }

    private a te(int paramInt)
    {
      AppMethodBeat.i(88562);
      a locala = (a)CardListSelectedUI.this.eAF.get(paramInt);
      AppMethodBeat.o(88562);
      return locala;
    }

    public final int getCount()
    {
      AppMethodBeat.i(88561);
      int i = CardListSelectedUI.this.eAF.size();
      AppMethodBeat.o(88561);
      return i;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(88563);
      Object localObject = te(paramInt);
      label186: label217: int i;
      if (paramView == null)
      {
        paramView = View.inflate(CardListSelectedUI.this, 2130968973, null);
        paramViewGroup = new CardListSelectedUI.d(CardListSelectedUI.this);
        paramViewGroup.kmG = ((ImageView)paramView.findViewById(2131822233));
        paramViewGroup.gsf = ((TextView)paramView.findViewById(2131820678));
        paramViewGroup.kmC = ((TextView)paramView.findViewById(2131821245));
        paramViewGroup.kmH = ((TextView)paramView.findViewById(2131822292));
        paramViewGroup.jKK = ((TextView)paramView.findViewById(2131821694));
        paramViewGroup.kmI = paramView.findViewById(2131821220);
        paramViewGroup.kmJ = ((ImageView)paramView.findViewById(2131822288));
        paramView.setTag(paramViewGroup);
        if (!l.sP(((a)localObject).iAd))
          break label389;
        paramViewGroup.gsf.setText(((a)localObject).kbW);
        if (TextUtils.isEmpty(((a)localObject).title))
          break label347;
        paramViewGroup.kmC.setVisibility(0);
        paramViewGroup.kmC.setText(((a)localObject).title);
        if (TextUtils.isEmpty(((a)localObject).kbX))
          break label359;
        paramViewGroup.kmH.setVisibility(0);
        paramViewGroup.kmH.setText(((a)localObject).kbX);
        TextView localTextView = paramViewGroup.jKK;
        if (!bo.isNullOrNil(((a)localObject).jKR))
          break label371;
        i = 8;
        label238: localTextView.setVisibility(i);
        paramViewGroup.jKK.setText(((a)localObject).jKR);
        i = CardListSelectedUI.this.getBaseContext().getResources().getDimensionPixelSize(2131428192);
        CardListSelectedUI.a(paramViewGroup.kmG, ((a)localObject).kbV, i);
        localObject = (Boolean)CardListSelectedUI.this.kmm.get(Integer.valueOf(paramInt));
        if ((localObject == null) || (!((Boolean)localObject).booleanValue()))
          break label377;
        paramViewGroup.kmJ.setImageResource(2130838050);
      }
      while (true)
      {
        AppMethodBeat.o(88563);
        return paramView;
        paramViewGroup = (CardListSelectedUI.d)paramView.getTag();
        break;
        label347: paramViewGroup.kmC.setVisibility(8);
        break label186;
        label359: paramViewGroup.kmH.setVisibility(8);
        break label217;
        label371: i = 0;
        break label238;
        label377: paramViewGroup.kmJ.setImageResource(2130838051);
        continue;
        label389: ab.i("MicroMsg.CardListSelectedUI", "not support type");
      }
    }
  }

  final class b extends BaseAdapter
  {
    b()
    {
    }

    private a te(int paramInt)
    {
      AppMethodBeat.i(88566);
      a locala = (a)CardListSelectedUI.this.eAF.get(paramInt);
      AppMethodBeat.o(88566);
      return locala;
    }

    public final int getCount()
    {
      AppMethodBeat.i(88565);
      int i = CardListSelectedUI.this.eAF.size();
      AppMethodBeat.o(88565);
      return i;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(88567);
      a locala = te(paramInt);
      if (paramView == null)
      {
        paramView = View.inflate(CardListSelectedUI.this, 2130968972, null);
        paramViewGroup = new CardListSelectedUI.c(CardListSelectedUI.this);
        paramViewGroup.kmA = ((ImageView)paramView.findViewById(2131822288));
        paramViewGroup.kmB = ((TextView)paramView.findViewById(2131822289));
        paramViewGroup.gsf = ((TextView)paramView.findViewById(2131820678));
        paramViewGroup.kmC = ((TextView)paramView.findViewById(2131821245));
        paramViewGroup.kmD = paramView.findViewById(2131822101);
        paramViewGroup.kmE = ((TextView)paramView.findViewById(2131822290));
        paramViewGroup.kmF = ((TextView)paramView.findViewById(2131822291));
        paramView.setTag(paramViewGroup);
        if (!l.sP(locala.iAd))
          break label549;
        if (TextUtils.isEmpty(locala.title))
          break label387;
        paramViewGroup.gsf.setVisibility(0);
        paramViewGroup.gsf.setText(locala.title);
        label174: if (TextUtils.isEmpty(locala.kbW))
          break label399;
        paramViewGroup.kmC.setVisibility(0);
        paramViewGroup.kmC.setText(locala.kbW);
        label205: if (locala.kcb != 0)
          break label423;
        paramView.setAlpha(1.0F);
        paramViewGroup.kmA.setVisibility(0);
        paramViewGroup.kmB.setVisibility(8);
        Boolean localBoolean = (Boolean)CardListSelectedUI.this.kmm.get(Integer.valueOf(paramInt));
        if ((localBoolean == null) || (!localBoolean.booleanValue()))
          break label411;
        paramViewGroup.kmA.setImageResource(2130838050);
        label276: if (bo.isNullOrNil(locala.kcc))
          break label514;
        paramViewGroup.kmE.setVisibility(0);
        paramViewGroup.kmE.setText(locala.kcc);
        label307: if (bo.isNullOrNil(locala.kcd))
          break label526;
        paramViewGroup.kmF.setVisibility(0);
        paramViewGroup.kmF.setText(locala.kcd);
        label338: if ((!bo.isNullOrNil(locala.kcc)) || (!bo.isNullOrNil(locala.kcd)))
          break label538;
        paramViewGroup.kmD.setVisibility(8);
      }
      while (true)
      {
        AppMethodBeat.o(88567);
        return paramView;
        paramViewGroup = (CardListSelectedUI.c)paramView.getTag();
        break;
        label387: paramViewGroup.gsf.setVisibility(8);
        break label174;
        label399: paramViewGroup.kmC.setVisibility(8);
        break label205;
        label411: paramViewGroup.kmA.setImageResource(2130838051);
        break label276;
        label423: if (locala.kcb == 1)
        {
          paramView.setAlpha(0.2F);
          paramViewGroup.kmA.setVisibility(8);
          if (!bo.isNullOrNil(locala.kce))
          {
            paramViewGroup.kmB.setVisibility(0);
            paramViewGroup.kmB.setText(locala.kce);
            break label276;
          }
          paramViewGroup.kmB.setVisibility(8);
          break label276;
        }
        paramViewGroup.kmA.setVisibility(8);
        paramViewGroup.kmB.setVisibility(8);
        break label276;
        label514: paramViewGroup.kmE.setVisibility(8);
        break label307;
        label526: paramViewGroup.kmF.setVisibility(8);
        break label338;
        label538: paramViewGroup.kmD.setVisibility(0);
        continue;
        label549: ab.i("MicroMsg.CardListSelectedUI", "not support type");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardListSelectedUI
 * JD-Core Version:    0.6.2
 */