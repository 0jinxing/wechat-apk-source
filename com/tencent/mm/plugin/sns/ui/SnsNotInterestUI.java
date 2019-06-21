package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.gm;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.r;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.q.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class SnsNotInterestUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private static final String[] ruB = { "sns_expose_reason_not_fav", "sns_expose_reason_too_freq", "sns_expose_reason_too_many_same_content", "sns_expose_reason_marketing", "sns_expose_reason_content_sexy", "sns_expose_reason_rumour", "sns_expose_reason_other" };
  private static final int[] ruC = { 1, 2, 4, 8, 16, 32, 64 };
  private static final int[] ruG = { 2131303627, 2131303632, 2131303633, 2131303626, 2131303625, 2131303630, 2131303628 };
  private com.tencent.mm.ui.base.p ejZ;
  private com.tencent.mm.ui.base.preference.f iFE;
  private String psX;
  private HashMap<String, Boolean> ruD;
  private HashMap<Integer, Boolean> ruE;
  private HashMap<String, Integer> ruF;
  private TextView ruH;
  private EditText ruI;
  private ListView ruJ;
  private LinearLayout ruK;
  private int ruL;
  private int ruM;
  private long ruN;
  private boolean ruO;
  private boolean ruP;
  r ruQ;

  public SnsNotInterestUI()
  {
    AppMethodBeat.i(39127);
    this.ruD = new HashMap(ruB.length);
    this.ruE = new HashMap(ruC.length);
    this.ruF = new HashMap(ruC.length);
    this.psX = null;
    this.ruO = false;
    this.ruP = false;
    this.ejZ = null;
    this.ruQ = null;
    AppMethodBeat.o(39127);
  }

  private void ctF()
  {
    int i = 0;
    AppMethodBeat.i(39129);
    for (localObject : ruB)
      this.ruD.put(localObject, Boolean.FALSE);
    Object localObject = ruC;
    int m = localObject.length;
    for (??? = 0; ; ???++)
    {
      ??? = i;
      if (??? >= m)
        break;
      ??? = localObject[???];
      this.ruE.put(Integer.valueOf(???), Boolean.FALSE);
    }
    while (??? < ruC.length)
    {
      this.ruF.put(ruB[???], Integer.valueOf(ruC[???]));
      ???++;
    }
    AppMethodBeat.o(39129);
  }

  private void ctG()
  {
    AppMethodBeat.i(39132);
    if (this.iFE == null)
    {
      ab.e("MicroMsg.SnsNotInterestUI", "initPref error, PreferenceScreen is null!");
      AppMethodBeat.o(39132);
    }
    while (true)
    {
      return;
      Object localObject;
      if (this.iFE.aqO("sns_expose_desc") == null)
      {
        localObject = new PreferenceTitleCategory(this);
        ((Preference)localObject).setTitle(2131303623);
        ((Preference)localObject).setKey("sns_expose_desc");
        this.iFE.b((Preference)localObject);
      }
      for (int i = 0; i < ruB.length; i++)
      {
        String str = ruB[i];
        int j = ruG[i];
        if (this.iFE.aqO(str) == null)
        {
          localObject = new Preference(this);
          ((Preference)localObject).setTitle(j);
          ((Preference)localObject).setKey(str);
          ((Preference)localObject).setLayoutResource(2130970127);
          ((Preference)localObject).setWidgetLayoutResource(2130970137);
          this.iFE.b((Preference)localObject);
        }
      }
      AppMethodBeat.o(39132);
    }
  }

  public final int JC()
  {
    return -1;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = false;
    AppMethodBeat.i(39133);
    if (paramPreference == null)
      AppMethodBeat.o(39133);
    while (true)
    {
      return bool;
      String str = paramPreference.mKey;
      if (this.ruD.containsKey(str))
      {
        bool = ((Boolean)this.ruD.get(str)).booleanValue();
        label65: label77: int i;
        if (bool)
        {
          paramPreference.setWidgetLayoutResource(2130970137);
          paramf.notifyDataSetChanged();
          if (bool)
            break label276;
          bool = true;
          this.ruD.put(str, Boolean.valueOf(bool));
          i = ((Integer)this.ruF.get(str)).intValue();
          this.ruE.put(Integer.valueOf(i), Boolean.valueOf(bool));
          ab.d("MicroMsg.SnsNotInterestUI", "click: %s, notInterestType: %d, isCheck: %b", new Object[] { str, Integer.valueOf(i), Boolean.valueOf(bool) });
          paramf = this.ruD.values().iterator();
          while (paramf.hasNext())
            if (((Boolean)paramf.next()).booleanValue())
            {
              i = 1;
              label197: if (i == 0)
                break label287;
              enableOptionMenu(0, true);
              label208: if ((!bool) || (!str.equals("sns_expose_reason_other")))
                break label296;
              this.ruI.setVisibility(0);
              this.ruH.setVisibility(0);
              this.ruI.requestFocus();
              this.ruP = true;
              showVKB();
            }
        }
        while (true)
        {
          AppMethodBeat.o(39133);
          bool = true;
          break;
          paramPreference.setWidgetLayoutResource(2130970136);
          break label65;
          label276: bool = false;
          break label77;
          i = 0;
          break label197;
          label287: enableOptionMenu(0, false);
          break label208;
          label296: if (!((Boolean)this.ruD.get("sns_expose_reason_other")).booleanValue())
          {
            this.ruI.setVisibility(8);
            this.ruH.setVisibility(8);
            this.ruJ.requestFocus();
            this.ruP = false;
            aqX();
          }
          else
          {
            this.ruJ.requestFocus();
            aqX();
          }
        }
      }
      AppMethodBeat.o(39133);
    }
  }

  public final int getLayoutId()
  {
    return 2130970758;
  }

  public final void initView()
  {
    AppMethodBeat.i(39131);
    super.initView();
    setMMTitle(2131303636);
    setBackBtn(new SnsNotInterestUI.1(this));
    this.ruH = ((TextView)findViewById(2131827742));
    this.ruI = ((EditText)findViewById(2131827743));
    this.ruJ = ((ListView)findViewById(16908298));
    this.ruK = ((LinearLayout)findViewById(2131827741));
    this.ruK.setOnClickListener(new SnsNotInterestUI.2(this));
    this.ruI.setVisibility(8);
    this.ruH.setVisibility(8);
    this.iFE = this.yCw;
    ctG();
    a(0, getString(2131297651), new SnsNotInterestUI.3(this), q.b.ymu);
    enableOptionMenu(0, false);
    AppMethodBeat.o(39131);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39128);
    super.onCreate(paramBundle);
    this.ruL = getIntent().getIntExtra("sns_info_not_interest_scene", 0);
    this.ruN = getIntent().getLongExtra("sns_info_svr_id", 0L);
    if (this.ruN != 0L)
    {
      paramBundle = af.cnF().kD(this.ruN).field_userName;
      if (paramBundle != null)
      {
        g.RQ();
        paramBundle = ((j)g.K(j.class)).XM().aoN(paramBundle);
        if (paramBundle.dtS != 2)
          break label141;
        ruG[1] = 2131303631;
      }
    }
    while (true)
    {
      g.RQ();
      g.RO().eJo.a(218, this);
      ctF();
      initView();
      AppMethodBeat.o(39128);
      return;
      label141: if (paramBundle.dtS == 1)
        ruG[1] = 2131303632;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39130);
    super.onDestroy();
    ctF();
    g.RQ();
    g.RO().eJo.b(218, this);
    gm localgm = new gm();
    localgm.cBf.cBg = this.ruO;
    localgm.cBf.cBh = this.ruN;
    a.xxA.m(localgm);
    AppMethodBeat.o(39130);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(39134);
    ab.d("MicroMsg.SnsNotInterestUI", "onSceneEnd, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramm.getType() == 218)
    {
      this.ejZ.dismiss();
      this.ejZ = null;
      if (((r)paramm).type == 9)
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.ruO = true;
          Toast.makeText(this, 2131303635, 1).show();
          finish();
          AppMethodBeat.o(39134);
        }
    }
    while (true)
    {
      return;
      this.ruO = false;
      Toast.makeText(this, 2131303624, 1).show();
      AppMethodBeat.o(39134);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsNotInterestUI
 * JD-Core Version:    0.6.2
 */